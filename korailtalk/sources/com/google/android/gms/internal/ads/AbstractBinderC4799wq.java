package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.wq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC4799wq extends AbstractBinderC1623Mc implements InterfaceC4913xq {
    public AbstractBinderC4799wq() {
        super("com.google.android.gms.ads.internal.report.IDynamiteErrorEventListener");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1623Mc
    protected final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 != 1) {
            return false;
        }
        zzb();
        parcel2.writeNoException();
        return true;
    }

    public abstract /* synthetic */ void zzb();
}
