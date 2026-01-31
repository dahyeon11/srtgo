package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.gq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC2976gq extends AbstractBinderC1623Mc implements InterfaceC3091hq {
    public AbstractBinderC2976gq() {
        super("com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }

    public static InterfaceC3091hq zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
        return iInterfaceQueryLocalInterface instanceof InterfaceC3091hq ? (InterfaceC3091hq) iInterfaceQueryLocalInterface : new C2861fq(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1623Mc
    protected final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
            AbstractC1664Nc.zzc(parcel);
            zzf(arrayListCreateTypedArrayList);
        } else {
            if (i8 != 2) {
                return false;
            }
            String string = parcel.readString();
            AbstractC1664Nc.zzc(parcel);
            zze(string);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3091hq
    public abstract /* synthetic */ void zze(String str);

    @Override // com.google.android.gms.internal.ads.InterfaceC3091hq
    public abstract /* synthetic */ void zzf(List list);
}
