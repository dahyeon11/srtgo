package K1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.gms.internal.ads.AbstractC4439th;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: K1.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0659r0 {

    /* renamed from: d, reason: collision with root package name */
    private boolean f2826d;

    /* renamed from: e, reason: collision with root package name */
    private Context f2827e;

    /* renamed from: c, reason: collision with root package name */
    private boolean f2825c = false;

    /* renamed from: b, reason: collision with root package name */
    private final Map f2824b = new WeakHashMap();

    /* renamed from: a, reason: collision with root package name */
    private final BroadcastReceiver f2823a = new C0656p0(this);

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void b(Context context, Intent intent) {
        try {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : this.f2824b.entrySet()) {
                if (((IntentFilter) entry.getValue()).hasAction(intent.getAction())) {
                    arrayList.add((BroadcastReceiver) entry.getKey());
                }
            }
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                ((BroadcastReceiver) arrayList.get(i8)).onReceive(context, intent);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzb(Context context) {
        try {
            if (this.f2825c) {
                return;
            }
            Context applicationContext = context.getApplicationContext();
            this.f2827e = applicationContext;
            if (applicationContext == null) {
                this.f2827e = context;
            }
            AbstractC4439th.zza(this.f2827e);
            this.f2826d = ((Boolean) H1.C.zzc().zza(AbstractC4439th.zzdP)).booleanValue();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            if (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzkW)).booleanValue() || Build.VERSION.SDK_INT < 33) {
                this.f2827e.registerReceiver(this.f2823a, intentFilter);
            } else {
                this.f2827e.registerReceiver(this.f2823a, intentFilter, 4);
            }
            this.f2825c = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzc(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (this.f2826d) {
            this.f2824b.put(broadcastReceiver, intentFilter);
            return;
        }
        AbstractC4439th.zza(context);
        if (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzkW)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.registerReceiver(broadcastReceiver, intentFilter);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter, 4);
        }
    }

    public final synchronized void zzd(Context context, BroadcastReceiver broadcastReceiver) {
        if (this.f2826d) {
            this.f2824b.remove(broadcastReceiver);
        } else {
            context.unregisterReceiver(broadcastReceiver);
        }
    }
}
