package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* renamed from: com.google.android.gms.internal.ads.Qv, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class DialogInterfaceOnCancelListenerC1819Qv implements DialogInterface.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ JsPromptResult f16026a;

    DialogInterfaceOnCancelListenerC1819Qv(JsPromptResult jsPromptResult) {
        this.f16026a = jsPromptResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f16026a.cancel();
    }
}
