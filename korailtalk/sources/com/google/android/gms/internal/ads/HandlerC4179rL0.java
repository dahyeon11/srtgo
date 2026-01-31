package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: com.google.android.gms.internal.ads.rL0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class HandlerC4179rL0 extends Handler {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C4407tL0 f22412a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HandlerC4179rL0(C4407tL0 c4407tL0, Looper looper) {
        super(looper);
        this.f22412a = c4407tL0;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) throws MediaCodec.CryptoException {
        C4407tL0.a(this.f22412a, message);
    }
}
