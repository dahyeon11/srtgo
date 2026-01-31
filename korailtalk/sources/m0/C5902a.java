package m0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* renamed from: m0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5902a {

    /* renamed from: f, reason: collision with root package name */
    private static final Object f34094f = new Object();

    /* renamed from: g, reason: collision with root package name */
    private static C5902a f34095g;

    /* renamed from: a, reason: collision with root package name */
    private final Context f34096a;

    /* renamed from: b, reason: collision with root package name */
    private final HashMap f34097b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap f34098c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final ArrayList f34099d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private final Handler f34100e;

    /* renamed from: m0.a$a, reason: collision with other inner class name */
    class HandlerC0350a extends Handler {
        HandlerC0350a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                super.handleMessage(message);
            } else {
                C5902a.this.a();
            }
        }
    }

    /* renamed from: m0.a$b */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        final Intent f34102a;

        /* renamed from: b, reason: collision with root package name */
        final ArrayList f34103b;

        b(Intent intent, ArrayList arrayList) {
            this.f34102a = intent;
            this.f34103b = arrayList;
        }
    }

    /* renamed from: m0.a$c */
    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        final IntentFilter f34104a;

        /* renamed from: b, reason: collision with root package name */
        final BroadcastReceiver f34105b;

        /* renamed from: c, reason: collision with root package name */
        boolean f34106c;

        /* renamed from: d, reason: collision with root package name */
        boolean f34107d;

        c(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f34104a = intentFilter;
            this.f34105b = broadcastReceiver;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.f34105b);
            sb.append(" filter=");
            sb.append(this.f34104a);
            if (this.f34107d) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    private C5902a(Context context) {
        this.f34096a = context;
        this.f34100e = new HandlerC0350a(context.getMainLooper());
    }

    public static C5902a getInstance(Context context) {
        C5902a c5902a;
        synchronized (f34094f) {
            try {
                if (f34095g == null) {
                    f34095g = new C5902a(context.getApplicationContext());
                }
                c5902a = f34095g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c5902a;
    }

    void a() {
        int size;
        b[] bVarArr;
        while (true) {
            synchronized (this.f34097b) {
                try {
                    size = this.f34099d.size();
                    if (size <= 0) {
                        return;
                    }
                    bVarArr = new b[size];
                    this.f34099d.toArray(bVarArr);
                    this.f34099d.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            for (int i8 = 0; i8 < size; i8++) {
                b bVar = bVarArr[i8];
                int size2 = bVar.f34103b.size();
                for (int i9 = 0; i9 < size2; i9++) {
                    c cVar = (c) bVar.f34103b.get(i9);
                    if (!cVar.f34107d) {
                        cVar.f34105b.onReceive(this.f34096a, bVar.f34102a);
                    }
                }
            }
        }
    }

    public void registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f34097b) {
            try {
                c cVar = new c(intentFilter, broadcastReceiver);
                ArrayList arrayList = (ArrayList) this.f34097b.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList(1);
                    this.f34097b.put(broadcastReceiver, arrayList);
                }
                arrayList.add(cVar);
                for (int i8 = 0; i8 < intentFilter.countActions(); i8++) {
                    String action = intentFilter.getAction(i8);
                    ArrayList arrayList2 = (ArrayList) this.f34098c.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(1);
                        this.f34098c.put(action, arrayList2);
                    }
                    arrayList2.add(cVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean sendBroadcast(Intent intent) {
        int i8;
        String str;
        ArrayList arrayList;
        ArrayList arrayList2;
        String str2;
        boolean z8;
        synchronized (this.f34097b) {
            try {
                String action = intent.getAction();
                String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f34096a.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z9 = true;
                boolean z10 = (intent.getFlags() & 8) != 0;
                if (z10) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Resolving type ");
                    sb.append(strResolveTypeIfNeeded);
                    sb.append(" scheme ");
                    sb.append(scheme);
                    sb.append(" of intent ");
                    sb.append(intent);
                }
                ArrayList arrayList3 = (ArrayList) this.f34098c.get(intent.getAction());
                if (arrayList3 != null) {
                    if (z10) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Action list: ");
                        sb2.append(arrayList3);
                    }
                    ArrayList arrayList4 = null;
                    int i9 = 0;
                    while (i9 < arrayList3.size()) {
                        c cVar = (c) arrayList3.get(i9);
                        if (z10) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Matching against filter ");
                            sb3.append(cVar.f34104a);
                        }
                        if (cVar.f34106c) {
                            i8 = i9;
                            arrayList2 = arrayList3;
                            str = action;
                            str2 = strResolveTypeIfNeeded;
                            arrayList = arrayList4;
                            z8 = z9;
                        } else {
                            IntentFilter intentFilter = cVar.f34104a;
                            String str3 = action;
                            String str4 = strResolveTypeIfNeeded;
                            i8 = i9;
                            str = action;
                            arrayList = arrayList4;
                            arrayList2 = arrayList3;
                            str2 = strResolveTypeIfNeeded;
                            z8 = z9;
                            int iMatch = intentFilter.match(str3, str4, scheme, data, categories, "LocalBroadcastManager");
                            if (iMatch >= 0) {
                                if (z10) {
                                    StringBuilder sb4 = new StringBuilder();
                                    sb4.append("  Filter matched!  match=0x");
                                    sb4.append(Integer.toHexString(iMatch));
                                }
                                arrayList4 = arrayList == null ? new ArrayList() : arrayList;
                                arrayList4.add(cVar);
                                cVar.f34106c = z8;
                                i9 = i8 + 1;
                                z9 = z8;
                                action = str;
                                arrayList3 = arrayList2;
                                strResolveTypeIfNeeded = str2;
                            } else if (z10) {
                                String str5 = iMatch != -4 ? iMatch != -3 ? iMatch != -2 ? iMatch != -1 ? "unknown reason" : "type" : "data" : "action" : "category";
                                StringBuilder sb5 = new StringBuilder();
                                sb5.append("  Filter did not match: ");
                                sb5.append(str5);
                            }
                        }
                        arrayList4 = arrayList;
                        i9 = i8 + 1;
                        z9 = z8;
                        action = str;
                        arrayList3 = arrayList2;
                        strResolveTypeIfNeeded = str2;
                    }
                    ArrayList arrayList5 = arrayList4;
                    boolean z11 = z9;
                    if (arrayList5 != null) {
                        for (int i10 = 0; i10 < arrayList5.size(); i10++) {
                            ((c) arrayList5.get(i10)).f34106c = false;
                        }
                        this.f34099d.add(new b(intent, arrayList5));
                        if (!this.f34100e.hasMessages(z11 ? 1 : 0)) {
                            this.f34100e.sendEmptyMessage(z11 ? 1 : 0);
                        }
                        return z11;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void sendBroadcastSync(Intent intent) {
        if (sendBroadcast(intent)) {
            a();
        }
    }

    public void unregisterReceiver(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f34097b) {
            try {
                ArrayList arrayList = (ArrayList) this.f34097b.remove(broadcastReceiver);
                if (arrayList == null) {
                    return;
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    c cVar = (c) arrayList.get(size);
                    cVar.f34107d = true;
                    for (int i8 = 0; i8 < cVar.f34104a.countActions(); i8++) {
                        String action = cVar.f34104a.getAction(i8);
                        ArrayList arrayList2 = (ArrayList) this.f34098c.get(action);
                        if (arrayList2 != null) {
                            for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                                c cVar2 = (c) arrayList2.get(size2);
                                if (cVar2.f34105b == broadcastReceiver) {
                                    cVar2.f34107d = true;
                                    arrayList2.remove(size2);
                                }
                            }
                            if (arrayList2.size() <= 0) {
                                this.f34098c.remove(action);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
