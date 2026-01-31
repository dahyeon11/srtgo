package androidx.work.impl.background.systemalarm;

import H0.l;
import Q0.r;
import android.content.Intent;
import androidx.lifecycle.ServiceC1027p;
import androidx.work.impl.background.systemalarm.e;

/* loaded from: classes.dex */
public class SystemAlarmService extends ServiceC1027p implements e.c {

    /* renamed from: d, reason: collision with root package name */
    private static final String f11157d = l.tagWithPrefix("SystemAlarmService");

    /* renamed from: b, reason: collision with root package name */
    private e f11158b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f11159c;

    private void a() {
        e eVar = new e(this);
        this.f11158b = eVar;
        eVar.k(this);
    }

    @Override // androidx.work.impl.background.systemalarm.e.c
    public void onAllCommandsCompleted() {
        this.f11159c = true;
        l.get().debug(f11157d, "All commands completed in dispatcher", new Throwable[0]);
        r.checkWakeLocks();
        stopSelf();
    }

    @Override // androidx.lifecycle.ServiceC1027p, android.app.Service
    public void onCreate() {
        super.onCreate();
        a();
        this.f11159c = false;
    }

    @Override // androidx.lifecycle.ServiceC1027p, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f11159c = true;
        this.f11158b.h();
    }

    @Override // androidx.lifecycle.ServiceC1027p, android.app.Service
    public int onStartCommand(Intent intent, int i8, int i9) {
        super.onStartCommand(intent, i8, i9);
        if (this.f11159c) {
            l.get().info(f11157d, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.f11158b.h();
            a();
            this.f11159c = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f11158b.add(intent, i9);
        return 3;
    }
}
