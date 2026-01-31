package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.pr, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC4004pr extends AbstractBinderC1623Mc implements InterfaceC4118qr {
    public AbstractBinderC4004pr() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardItem");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1623Mc
    protected final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            String strZzc = zzc();
            parcel2.writeNoException();
            parcel2.writeString(strZzc);
        } else {
            if (i8 != 2) {
                return false;
            }
            int iZzb = zzb();
            parcel2.writeNoException();
            parcel2.writeInt(iZzb);
        }
        return true;
    }

    public abstract /* synthetic */ int zzb();

    public abstract /* synthetic */ String zzc();
}
