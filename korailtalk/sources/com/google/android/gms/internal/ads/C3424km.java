package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import j2.AbstractC5815b;

/* renamed from: com.google.android.gms.internal.ads.km, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3424km implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = AbstractC5815b.validateObjectHeader(parcel);
        int i8 = 0;
        int i9 = 0;
        String strCreateString = null;
        int i10 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = AbstractC5815b.readHeader(parcel);
            int fieldId = AbstractC5815b.getFieldId(header);
            if (fieldId == 1) {
                i10 = AbstractC5815b.readInt(parcel, header);
            } else if (fieldId == 2) {
                strCreateString = AbstractC5815b.createString(parcel, header);
            } else if (fieldId == 3) {
                i9 = AbstractC5815b.readInt(parcel, header);
            } else if (fieldId != 1000) {
                AbstractC5815b.skipUnknownField(parcel, header);
            } else {
                i8 = AbstractC5815b.readInt(parcel, header);
            }
        }
        AbstractC5815b.ensureAtEnd(parcel, iValidateObjectHeader);
        return new C3197im(i8, i10, strCreateString, i9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C3197im[i8];
    }
}
