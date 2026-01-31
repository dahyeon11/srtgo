package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import j2.AbstractC5815b;

/* renamed from: com.google.android.gms.internal.ads.Ys, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2144Ys implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = AbstractC5815b.validateObjectHeader(parcel);
        String strCreateString = null;
        String strCreateString2 = null;
        H1.d2 d2Var = null;
        H1.Y1 y12 = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = AbstractC5815b.readHeader(parcel);
            int fieldId = AbstractC5815b.getFieldId(header);
            if (fieldId == 1) {
                strCreateString = AbstractC5815b.createString(parcel, header);
            } else if (fieldId == 2) {
                strCreateString2 = AbstractC5815b.createString(parcel, header);
            } else if (fieldId == 3) {
                d2Var = (H1.d2) AbstractC5815b.createParcelable(parcel, header, H1.d2.CREATOR);
            } else if (fieldId != 4) {
                AbstractC5815b.skipUnknownField(parcel, header);
            } else {
                y12 = (H1.Y1) AbstractC5815b.createParcelable(parcel, header, H1.Y1.CREATOR);
            }
        }
        AbstractC5815b.ensureAtEnd(parcel, iValidateObjectHeader);
        return new C2103Xs(strCreateString, strCreateString2, d2Var, y12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C2103Xs[i8];
    }
}
