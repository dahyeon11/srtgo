package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* renamed from: com.google.android.gms.internal.ads.Rv, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class DialogInterfaceOnClickListenerC1860Rv implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ JsPromptResult f16162a;

    DialogInterfaceOnClickListenerC1860Rv(JsPromptResult jsPromptResult) {
        this.f16162a = jsPromptResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i8) {
        this.f16162a.cancel();
    }
}
