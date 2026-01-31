package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.widget.EditText;

/* renamed from: com.google.android.gms.internal.ads.Tv, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class DialogInterfaceOnClickListenerC1942Tv implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ JsPromptResult f16544a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ EditText f16545b;

    DialogInterfaceOnClickListenerC1942Tv(JsPromptResult jsPromptResult, EditText editText) {
        this.f16544a = jsPromptResult;
        this.f16545b = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i8) {
        this.f16544a.confirm(this.f16545b.getText().toString());
    }
}
