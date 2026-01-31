package com.google.android.gms.common.api.internal;

import I2.C0609m;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import g2.C5540b;
import h2.AbstractC5608z;

/* loaded from: classes.dex */
abstract class i0 extends AbstractC5608z {

    /* renamed from: a, reason: collision with root package name */
    protected final C0609m f12045a;

    public i0(int i8, C0609m c0609m) {
        super(i8);
        this.f12045a = c0609m;
    }

    protected abstract void zac(U u8);

    @Override // com.google.android.gms.common.api.internal.q0
    public final void zad(Status status) {
        this.f12045a.trySetException(new C5540b(status));
    }

    @Override // com.google.android.gms.common.api.internal.q0
    public final void zae(Exception exc) {
        this.f12045a.trySetException(exc);
    }

    @Override // com.google.android.gms.common.api.internal.q0
    public final void zaf(U u8) throws DeadObjectException {
        try {
            zac(u8);
        } catch (DeadObjectException e8) {
            zad(q0.a(e8));
            throw e8;
        } catch (RemoteException e9) {
            zad(q0.a(e9));
        } catch (RuntimeException e10) {
            this.f12045a.trySetException(e10);
        }
    }

    @Override // com.google.android.gms.common.api.internal.q0
    public void zag(C1115m c1115m, boolean z8) {
    }
}
