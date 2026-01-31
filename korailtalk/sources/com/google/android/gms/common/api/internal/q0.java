package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public abstract class q0 {
    public final int zac;

    public q0(int i8) {
        this.zac = i8;
    }

    static /* bridge */ /* synthetic */ Status a(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage());
    }

    public abstract void zad(Status status);

    public abstract void zae(Exception exc);

    public abstract void zaf(U u8);

    public abstract void zag(C1115m c1115m, boolean z8);
}
