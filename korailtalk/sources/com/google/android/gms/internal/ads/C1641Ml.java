package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import j2.AbstractC5815b;

/* renamed from: com.google.android.gms.internal.ads.Ml, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1641Ml implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = AbstractC5815b.validateObjectHeader(parcel);
        long j8 = 0;
        boolean z8 = false;
        int i8 = 0;
        boolean z9 = false;
        String strCreateString = null;
        byte[] bArrCreateByteArray = null;
        String[] strArrCreateStringArray = null;
        String[] strArrCreateStringArray2 = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = AbstractC5815b.readHeader(parcel);
            switch (AbstractC5815b.getFieldId(header)) {
                case 1:
                    z8 = AbstractC5815b.readBoolean(parcel, header);
                    break;
                case 2:
                    strCreateString = AbstractC5815b.createString(parcel, header);
                    break;
                case 3:
                    i8 = AbstractC5815b.readInt(parcel, header);
                    break;
                case 4:
                    bArrCreateByteArray = AbstractC5815b.createByteArray(parcel, header);
                    break;
                case 5:
                    strArrCreateStringArray = AbstractC5815b.createStringArray(parcel, header);
                    break;
                case 6:
                    strArrCreateStringArray2 = AbstractC5815b.createStringArray(parcel, header);
                    break;
                case 7:
                    z9 = AbstractC5815b.readBoolean(parcel, header);
                    break;
                case 8:
                    j8 = AbstractC5815b.readLong(parcel, header);
                    break;
                default:
                    AbstractC5815b.skipUnknownField(parcel, header);
                    break;
            }
        }
        AbstractC5815b.ensureAtEnd(parcel, iValidateObjectHeader);
        return new C1601Ll(z8, strCreateString, i8, bArrCreateByteArray, strArrCreateStringArray, strArrCreateStringArray2, z9, j8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C1601Ll[i8];
    }
}
