package K3;

import H0.q;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final Context f2898a;

    /* renamed from: e, reason: collision with root package name */
    private Runnable f2902e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f2903f;

    /* renamed from: c, reason: collision with root package name */
    private boolean f2900c = false;

    /* renamed from: b, reason: collision with root package name */
    private final BroadcastReceiver f2899b = new b();

    /* renamed from: d, reason: collision with root package name */
    private Handler f2901d = new Handler();

    /* JADX INFO: Access modifiers changed from: private */
    final class b extends BroadcastReceiver {
        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(boolean z8) {
            h.this.d(z8);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
                final boolean z8 = intent.getIntExtra("plugged", -1) <= 0;
                h.this.f2901d.post(new Runnable() { // from class: K3.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f2905a.b(z8);
                    }
                });
            }
        }
    }

    public h(Context context, Runnable runnable) {
        this.f2898a = context;
        this.f2902e = runnable;
    }

    private void c() {
        this.f2901d.removeCallbacksAndMessages(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(boolean z8) {
        this.f2903f = z8;
        if (this.f2900c) {
            activity();
        }
    }

    private void e() {
        if (this.f2900c) {
            return;
        }
        this.f2898a.registerReceiver(this.f2899b, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        this.f2900c = true;
    }

    private void f() {
        if (this.f2900c) {
            this.f2898a.unregisterReceiver(this.f2899b);
            this.f2900c = false;
        }
    }

    public void activity() {
        c();
        if (this.f2903f) {
            this.f2901d.postDelayed(this.f2902e, q.MIN_PERIODIC_FLEX_MILLIS);
        }
    }

    public void cancel() {
        c();
        f();
    }

    public void start() {
        e();
        activity();
    }
}
