package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.c;
import java.util.HashMap;

/* loaded from: classes.dex */
public class MultiInstanceInvalidationService extends Service {

    /* renamed from: a, reason: collision with root package name */
    int f10640a = 0;

    /* renamed from: b, reason: collision with root package name */
    final HashMap f10641b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    final RemoteCallbackList f10642c = new a();

    /* renamed from: d, reason: collision with root package name */
    private final c.a f10643d = new b();

    class a extends RemoteCallbackList {
        a() {
        }

        @Override // android.os.RemoteCallbackList
        public void onCallbackDied(androidx.room.b bVar, Object obj) {
            HashMap map = MultiInstanceInvalidationService.this.f10641b;
            Integer num = (Integer) obj;
            num.intValue();
            map.remove(num);
        }
    }

    class b extends c.a {
        b() {
        }

        @Override // androidx.room.c.a, androidx.room.c
        public void broadcastInvalidation(int i8, String[] strArr) {
            synchronized (MultiInstanceInvalidationService.this.f10642c) {
                try {
                    String str = (String) MultiInstanceInvalidationService.this.f10641b.get(Integer.valueOf(i8));
                    if (str == null) {
                        Log.w("ROOM", "Remote invalidation client ID not registered");
                        return;
                    }
                    int iBeginBroadcast = MultiInstanceInvalidationService.this.f10642c.beginBroadcast();
                    for (int i9 = 0; i9 < iBeginBroadcast; i9++) {
                        try {
                            Integer num = (Integer) MultiInstanceInvalidationService.this.f10642c.getBroadcastCookie(i9);
                            int iIntValue = num.intValue();
                            String str2 = (String) MultiInstanceInvalidationService.this.f10641b.get(num);
                            if (i8 != iIntValue && str.equals(str2)) {
                                try {
                                    ((androidx.room.b) MultiInstanceInvalidationService.this.f10642c.getBroadcastItem(i9)).onInvalidation(strArr);
                                } catch (RemoteException e8) {
                                    Log.w("ROOM", "Error invoking a remote callback", e8);
                                }
                            }
                        } finally {
                            MultiInstanceInvalidationService.this.f10642c.finishBroadcast();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.room.c.a, androidx.room.c
        public int registerCallback(androidx.room.b bVar, String str) {
            if (str == null) {
                return 0;
            }
            synchronized (MultiInstanceInvalidationService.this.f10642c) {
                try {
                    MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                    int i8 = multiInstanceInvalidationService.f10640a + 1;
                    multiInstanceInvalidationService.f10640a = i8;
                    if (multiInstanceInvalidationService.f10642c.register(bVar, Integer.valueOf(i8))) {
                        MultiInstanceInvalidationService.this.f10641b.put(Integer.valueOf(i8), str);
                        return i8;
                    }
                    MultiInstanceInvalidationService multiInstanceInvalidationService2 = MultiInstanceInvalidationService.this;
                    multiInstanceInvalidationService2.f10640a--;
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.room.c.a, androidx.room.c
        public void unregisterCallback(androidx.room.b bVar, int i8) {
            synchronized (MultiInstanceInvalidationService.this.f10642c) {
                MultiInstanceInvalidationService.this.f10642c.unregister(bVar);
                MultiInstanceInvalidationService.this.f10641b.remove(Integer.valueOf(i8));
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f10643d;
    }
}
