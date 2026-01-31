package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* renamed from: com.google.android.gms.internal.ads.Ov, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class DialogInterfaceOnClickListenerC1737Ov implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ JsResult f15173a;

    DialogInterfaceOnClickListenerC1737Ov(JsResult jsResult) {
        this.f15173a = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i8) {
        this.f15173a.cancel();
    }
}
