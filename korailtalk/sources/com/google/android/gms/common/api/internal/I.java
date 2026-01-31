package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* loaded from: classes.dex */
final class I extends x2.j {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ K f11903a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    I(K k8, Looper looper) {
        super(looper);
        this.f11903a = k8;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i8 = message.what;
        if (i8 == 1) {
            K.g(this.f11903a);
            return;
        }
        if (i8 == 2) {
            K.f(this.f11903a);
            return;
        }
        StringBuilder sb = new StringBuilder(31);
        sb.append("Unknown message id: ");
        sb.append(i8);
        Log.w("GoogleApiClientImpl", sb.toString());
    }
}
