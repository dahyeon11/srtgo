package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import j2.AbstractC5815b;

/* renamed from: com.google.android.gms.internal.ads.Pb0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1745Pb0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = AbstractC5815b.validateObjectHeader(parcel);
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        String strCreateString = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = AbstractC5815b.readHeader(parcel);
            switch (AbstractC5815b.getFieldId(header)) {
                case 1:
                    i8 = AbstractC5815b.readInt(parcel, header);
                    break;
                case 2:
                    i9 = AbstractC5815b.readInt(parcel, header);
                    break;
                case 3:
                    i10 = AbstractC5815b.readInt(parcel, header);
                    break;
                case 4:
                    i11 = AbstractC5815b.readInt(parcel, header);
                    break;
                case 5:
                    strCreateString = AbstractC5815b.createString(parcel, header);
                    break;
                case 6:
                    i12 = AbstractC5815b.readInt(parcel, header);
                    break;
                case 7:
                    i13 = AbstractC5815b.readInt(parcel, header);
                    break;
                default:
                    AbstractC5815b.skipUnknownField(parcel, header);
                    break;
            }
        }
        AbstractC5815b.ensureAtEnd(parcel, iValidateObjectHeader);
        return new C1704Ob0(i8, i9, i10, i11, strCreateString, i12, i13);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C1704Ob0[i8];
    }
}
