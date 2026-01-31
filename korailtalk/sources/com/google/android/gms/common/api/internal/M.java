package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* loaded from: classes.dex */
final class M extends x2.j {

    /* renamed from: a */
    final /* synthetic */ N f11931a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    M(N n8, Looper looper) {
        super(looper);
        this.f11931a = n8;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i8 = message.what;
        if (i8 == 1) {
            ((L) message.obj).zab(this.f11931a);
        } else {
            if (i8 == 2) {
                throw ((RuntimeException) message.obj);
            }
            StringBuilder sb = new StringBuilder(31);
            sb.append("Unknown message id: ");
            sb.append(i8);
            Log.w("GACStateManager", sb.toString());
        }
    }
}
