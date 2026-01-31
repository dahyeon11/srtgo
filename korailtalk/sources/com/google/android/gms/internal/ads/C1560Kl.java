package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import j2.AbstractC5815b;

/* renamed from: com.google.android.gms.internal.ads.Kl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1560Kl implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = AbstractC5815b.validateObjectHeader(parcel);
        String strCreateString = null;
        String[] strArrCreateStringArray = null;
        String[] strArrCreateStringArray2 = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = AbstractC5815b.readHeader(parcel);
            int fieldId = AbstractC5815b.getFieldId(header);
            if (fieldId == 1) {
                strCreateString = AbstractC5815b.createString(parcel, header);
            } else if (fieldId == 2) {
                strArrCreateStringArray = AbstractC5815b.createStringArray(parcel, header);
            } else if (fieldId != 3) {
                AbstractC5815b.skipUnknownField(parcel, header);
            } else {
                strArrCreateStringArray2 = AbstractC5815b.createStringArray(parcel, header);
            }
        }
        AbstractC5815b.ensureAtEnd(parcel, iValidateObjectHeader);
        return new C1519Jl(strCreateString, strArrCreateStringArray, strArrCreateStringArray2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C1519Jl[i8];
    }
}
