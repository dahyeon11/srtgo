package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.lifecycle.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class ServiceC1027p extends Service implements InterfaceC1025n {

    /* renamed from: a, reason: collision with root package name */
    private final H f10058a = new H(this);

    @Override // androidx.lifecycle.InterfaceC1025n, y0.InterfaceC6512d, androidx.activity.t
    public AbstractC1019h getLifecycle() {
        return this.f10058a.getLifecycle();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        this.f10058a.onServicePreSuperOnBind();
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f10058a.onServicePreSuperOnCreate();
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f10058a.onServicePreSuperOnDestroy();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i8) {
        this.f10058a.onServicePreSuperOnStart();
        super.onStart(intent, i8);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i8, int i9) {
        return super.onStartCommand(intent, i8, i9);
    }
}
