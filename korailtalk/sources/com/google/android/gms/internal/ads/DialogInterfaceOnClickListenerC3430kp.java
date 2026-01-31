package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.Intent;

/* renamed from: com.google.android.gms.internal.ads.kp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class DialogInterfaceOnClickListenerC3430kp implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C3772np f20476a;

    DialogInterfaceOnClickListenerC3430kp(C3772np c3772np) {
        this.f20476a = c3772np;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i8) {
        C3772np c3772np = this.f20476a;
        Intent intentB = c3772np.b();
        G1.u.zzp();
        K1.K0.zzT(c3772np.f21350d, intentB);
    }
}
