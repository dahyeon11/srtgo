package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import j2.AbstractC5815b;

/* renamed from: com.google.android.gms.internal.ads.Ig0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1469Ig0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = AbstractC5815b.validateObjectHeader(parcel);
        byte[] bArrCreateByteArray = null;
        int i8 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = AbstractC5815b.readHeader(parcel);
            int fieldId = AbstractC5815b.getFieldId(header);
            if (fieldId == 1) {
                i8 = AbstractC5815b.readInt(parcel, header);
            } else if (fieldId != 2) {
                AbstractC5815b.skipUnknownField(parcel, header);
            } else {
                bArrCreateByteArray = AbstractC5815b.createByteArray(parcel, header);
            }
        }
        AbstractC5815b.ensureAtEnd(parcel, iValidateObjectHeader);
        return new C1428Hg0(i8, bArrCreateByteArray);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C1428Hg0[i8];
    }
}
