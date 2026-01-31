package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import g2.AbstractC5544f;
import g2.C5539a;
import h2.InterfaceC5586c;
import i2.AbstractC5683p;

/* renamed from: com.google.android.gms.common.api.internal.b */
/* loaded from: classes.dex */
public abstract class AbstractC1103b extends BasePendingResult implements InterfaceC5586c {

    /* renamed from: p */
    private final C5539a.c f11987p;

    /* renamed from: q */
    private final C5539a f11988q;

    protected AbstractC1103b(C5539a c5539a, AbstractC5544f abstractC5544f) {
        super((AbstractC5544f) AbstractC5683p.checkNotNull(abstractC5544f, "GoogleApiClient must not be null"));
        AbstractC5683p.checkNotNull(c5539a, "Api must not be null");
        this.f11987p = c5539a.zab();
        this.f11988q = c5539a;
    }

    private void f(RemoteException remoteException) {
        setFailedResult(new Status(8, remoteException.getLocalizedMessage(), (PendingIntent) null));
    }

    protected abstract void d(C5539a.b bVar);

    public final C5539a getApi() {
        return this.f11988q;
    }

    public final C5539a.c getClientKey() {
        return this.f11987p;
    }

    public final void run(C5539a.b bVar) throws DeadObjectException {
        try {
            d(bVar);
        } catch (DeadObjectException e8) {
            f(e8);
            throw e8;
        } catch (RemoteException e9) {
            f(e9);
        }
    }

    @Override // h2.InterfaceC5586c
    public final void setFailedResult(Status status) {
        AbstractC5683p.checkArgument(!status.isSuccess(), "Failed result must not be success");
        g2.n nVarCreateFailedResult = createFailedResult(status);
        setResult((AbstractC1103b) nVarCreateFailedResult);
        e(nVarCreateFailedResult);
    }

    public /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((AbstractC1103b) obj);
    }

    protected void e(g2.n nVar) {
    }
}
