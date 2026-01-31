package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import f2.C5392b;
import f2.C5397g;
import h2.InterfaceC5589f;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class w0 extends LifecycleCallback implements DialogInterface.OnCancelListener {

    /* renamed from: b, reason: collision with root package name */
    protected volatile boolean f12107b;

    /* renamed from: c, reason: collision with root package name */
    protected final AtomicReference f12108c;

    /* renamed from: d, reason: collision with root package name */
    private final Handler f12109d;

    /* renamed from: e, reason: collision with root package name */
    protected final C5397g f12110e;

    w0(InterfaceC5589f interfaceC5589f, C5397g c5397g) {
        super(interfaceC5589f);
        this.f12108c = new AtomicReference(null);
        this.f12109d = new x2.j(Looper.getMainLooper());
        this.f12110e = c5397g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(C5392b c5392b, int i8) {
        this.f12108c.set(null);
        c(c5392b, i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e() {
        this.f12108c.set(null);
        d();
    }

    private static final int f(t0 t0Var) {
        if (t0Var == null) {
            return -1;
        }
        return t0Var.a();
    }

    protected abstract void c(C5392b c5392b, int i8);

    protected abstract void d();

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onActivityResult(int i8, int i9, Intent intent) {
        t0 t0Var = (t0) this.f12108c.get();
        if (i8 != 1) {
            if (i8 == 2) {
                int iIsGooglePlayServicesAvailable = this.f12110e.isGooglePlayServicesAvailable(getActivity());
                if (iIsGooglePlayServicesAvailable == 0) {
                    e();
                    return;
                } else {
                    if (t0Var == null) {
                        return;
                    }
                    if (t0Var.b().getErrorCode() == 18 && iIsGooglePlayServicesAvailable == 18) {
                        return;
                    }
                }
            }
        } else if (i9 == -1) {
            e();
            return;
        } else if (i9 == 0) {
            if (t0Var == null) {
                return;
            }
            b(new C5392b(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, t0Var.b().toString()), f(t0Var));
            return;
        }
        if (t0Var != null) {
            b(t0Var.b(), t0Var.a());
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        b(new C5392b(13, null), f((t0) this.f12108c.get()));
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f12108c.set(bundle.getBoolean("resolving_error", false) ? new t0(new C5392b(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        t0 t0Var = (t0) this.f12108c.get();
        if (t0Var == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", t0Var.a());
        bundle.putInt("failed_status", t0Var.b().getErrorCode());
        bundle.putParcelable("failed_resolution", t0Var.b().getResolution());
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void onStart() {
        super.onStart();
        this.f12107b = true;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void onStop() {
        super.onStop();
        this.f12107b = false;
    }

    public final void zah(C5392b c5392b, int i8) {
        t0 t0Var = new t0(c5392b, i8);
        if (androidx.camera.view.h.a(this.f12108c, null, t0Var)) {
            this.f12109d.post(new v0(this, t0Var));
        }
    }
}
