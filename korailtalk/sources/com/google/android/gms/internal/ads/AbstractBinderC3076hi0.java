package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.hi0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC3076hi0 extends AbstractBinderC1623Mc implements InterfaceC3190ii0 {
    public AbstractBinderC3076hi0() {
        super("com.google.android.play.core.lmd.protocol.ILmdOverlayServiceListener");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1623Mc
    protected final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 != 1) {
            return false;
        }
        Bundle bundle = (Bundle) AbstractC1664Nc.zza(parcel, Bundle.CREATOR);
        AbstractC1664Nc.zzc(parcel);
        zzb(bundle);
        return true;
    }

    public abstract /* synthetic */ void zzb(Bundle bundle);
}
