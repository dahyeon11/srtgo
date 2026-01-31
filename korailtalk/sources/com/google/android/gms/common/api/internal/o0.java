package com.google.android.gms.common.api.internal;

import I2.C0609m;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import f2.C5394d;
import h2.AbstractC5608z;
import h2.InterfaceC5595l;

/* loaded from: classes.dex */
public final class o0 extends AbstractC5608z {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC1110h f12083a;

    /* renamed from: b, reason: collision with root package name */
    private final C0609m f12084b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC5595l f12085c;

    public o0(int i8, AbstractC1110h abstractC1110h, C0609m c0609m, InterfaceC5595l interfaceC5595l) {
        super(i8);
        this.f12084b = c0609m;
        this.f12083a = abstractC1110h;
        this.f12085c = interfaceC5595l;
        if (i8 == 2 && abstractC1110h.shouldAutoResolveMissingFeatures()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // h2.AbstractC5608z
    public final boolean zaa(U u8) {
        return this.f12083a.shouldAutoResolveMissingFeatures();
    }

    @Override // h2.AbstractC5608z
    public final C5394d[] zab(U u8) {
        return this.f12083a.zab();
    }

    @Override // com.google.android.gms.common.api.internal.q0
    public final void zad(Status status) {
        this.f12084b.trySetException(this.f12085c.getException(status));
    }

    @Override // com.google.android.gms.common.api.internal.q0
    public final void zae(Exception exc) {
        this.f12084b.trySetException(exc);
    }

    @Override // com.google.android.gms.common.api.internal.q0
    public final void zaf(U u8) throws DeadObjectException {
        try {
            this.f12083a.a(u8.zaf(), this.f12084b);
        } catch (DeadObjectException e8) {
            throw e8;
        } catch (RemoteException e9) {
            zad(q0.a(e9));
        } catch (RuntimeException e10) {
            this.f12084b.trySetException(e10);
        }
    }

    @Override // com.google.android.gms.common.api.internal.q0
    public final void zag(C1115m c1115m, boolean z8) {
        c1115m.d(this.f12084b, z8);
    }
}
