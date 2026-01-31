package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import g2.AbstractC5547i;
import i2.AbstractC5683p;

/* loaded from: classes.dex */
final class h0 extends x2.j {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ j0 f12043a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(j0 j0Var, Looper looper) {
        super(looper);
        this.f12043a = j0Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i8 = message.what;
        if (i8 != 0) {
            if (i8 == 1) {
                RuntimeException runtimeException = (RuntimeException) message.obj;
                String strValueOf = String.valueOf(runtimeException.getMessage());
                Log.e("TransformedResultImpl", strValueOf.length() != 0 ? "Runtime exception on the transformation worker thread: ".concat(strValueOf) : new String("Runtime exception on the transformation worker thread: "));
                throw runtimeException;
            }
            StringBuilder sb = new StringBuilder(70);
            sb.append("TransformationResultHandler received unknown message type: ");
            sb.append(i8);
            Log.e("TransformedResultImpl", sb.toString());
            return;
        }
        AbstractC5547i abstractC5547i = (AbstractC5547i) message.obj;
        synchronized (this.f12043a.f12064e) {
            try {
                j0 j0Var = (j0) AbstractC5683p.checkNotNull(this.f12043a.f12061b);
                if (abstractC5547i == null) {
                    j0Var.i(new Status(13, "Transform returned null"));
                } else if (abstractC5547i instanceof e0) {
                    j0Var.i(((e0) abstractC5547i).a());
                } else {
                    j0Var.zai(abstractC5547i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
