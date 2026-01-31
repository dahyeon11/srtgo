package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* renamed from: com.google.android.gms.internal.ads.Nv, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class DialogInterfaceOnCancelListenerC1696Nv implements DialogInterface.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ JsResult f14966a;

    DialogInterfaceOnCancelListenerC1696Nv(JsResult jsResult) {
        this.f14966a = jsResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f14966a.cancel();
    }
}
