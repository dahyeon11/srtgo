package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import i2.AbstractC5683p;

/* loaded from: classes.dex */
public final class m0 extends q0 {

    /* renamed from: a, reason: collision with root package name */
    protected final AbstractC1103b f12078a;

    public m0(int i8, AbstractC1103b abstractC1103b) {
        super(i8);
        this.f12078a = (AbstractC1103b) AbstractC5683p.checkNotNull(abstractC1103b, "Null methods are not runnable.");
    }

    @Override // com.google.android.gms.common.api.internal.q0
    public final void zad(Status status) {
        try {
            this.f12078a.setFailedResult(status);
        } catch (IllegalStateException e8) {
            Log.w("ApiCallRunner", "Exception reporting failure", e8);
        }
    }

    @Override // com.google.android.gms.common.api.internal.q0
    public final void zae(Exception exc) {
        String simpleName = exc.getClass().getSimpleName();
        String localizedMessage = exc.getLocalizedMessage();
        StringBuilder sb = new StringBuilder(simpleName.length() + 2 + String.valueOf(localizedMessage).length());
        sb.append(simpleName);
        sb.append(": ");
        sb.append(localizedMessage);
        try {
            this.f12078a.setFailedResult(new Status(10, sb.toString()));
        } catch (IllegalStateException e8) {
            Log.w("ApiCallRunner", "Exception reporting failure", e8);
        }
    }

    @Override // com.google.android.gms.common.api.internal.q0
    public final void zaf(U u8) throws DeadObjectException {
        try {
            this.f12078a.run(u8.zaf());
        } catch (RuntimeException e8) {
            zae(e8);
        }
    }

    @Override // com.google.android.gms.common.api.internal.q0
    public final void zag(C1115m c1115m, boolean z8) {
        c1115m.c(this.f12078a, z8);
    }
}
