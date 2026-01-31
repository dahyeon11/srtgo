package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiActivity;
import f2.C5392b;
import i2.AbstractC5683p;

/* loaded from: classes.dex */
final class v0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final t0 f12103a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ w0 f12104b;

    v0(w0 w0Var, t0 t0Var) {
        this.f12104b = w0Var;
        this.f12103a = t0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f12104b.f12107b) {
            C5392b c5392bB = this.f12103a.b();
            if (c5392bB.hasResolution()) {
                w0 w0Var = this.f12104b;
                w0Var.f11930a.startActivityForResult(GoogleApiActivity.zaa(w0Var.getActivity(), (PendingIntent) AbstractC5683p.checkNotNull(c5392bB.getResolution()), this.f12103a.a(), false), 1);
                return;
            }
            w0 w0Var2 = this.f12104b;
            if (w0Var2.f12110e.getErrorResolutionIntent(w0Var2.getActivity(), c5392bB.getErrorCode(), null) != null) {
                w0 w0Var3 = this.f12104b;
                w0Var3.f12110e.zag(w0Var3.getActivity(), this.f12104b.f11930a, c5392bB.getErrorCode(), 2, this.f12104b);
            } else {
                if (c5392bB.getErrorCode() != 18) {
                    this.f12104b.b(c5392bB, this.f12103a.a());
                    return;
                }
                w0 w0Var4 = this.f12104b;
                Dialog dialogZab = w0Var4.f12110e.zab(w0Var4.getActivity(), this.f12104b);
                w0 w0Var5 = this.f12104b;
                w0Var5.f12110e.zac(w0Var5.getActivity().getApplicationContext(), new u0(this, dialogZab));
            }
        }
    }
}
