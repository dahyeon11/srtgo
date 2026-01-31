package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import j2.AbstractC5815b;

/* renamed from: com.google.android.gms.internal.ads.ie, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3182ie implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = AbstractC5815b.validateObjectHeader(parcel);
        boolean z8 = false;
        int i8 = 0;
        String strCreateString = null;
        String strCreateString2 = null;
        String strCreateString3 = null;
        String strCreateString4 = null;
        Bundle bundleCreateBundle = null;
        String strCreateString5 = null;
        long j8 = 0;
        long j9 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = AbstractC5815b.readHeader(parcel);
            switch (AbstractC5815b.getFieldId(header)) {
                case 2:
                    strCreateString = AbstractC5815b.createString(parcel, header);
                    break;
                case 3:
                    j8 = AbstractC5815b.readLong(parcel, header);
                    break;
                case 4:
                    strCreateString2 = AbstractC5815b.createString(parcel, header);
                    break;
                case 5:
                    strCreateString3 = AbstractC5815b.createString(parcel, header);
                    break;
                case 6:
                    strCreateString4 = AbstractC5815b.createString(parcel, header);
                    break;
                case 7:
                    bundleCreateBundle = AbstractC5815b.createBundle(parcel, header);
                    break;
                case 8:
                    z8 = AbstractC5815b.readBoolean(parcel, header);
                    break;
                case 9:
                    j9 = AbstractC5815b.readLong(parcel, header);
                    break;
                case 10:
                    strCreateString5 = AbstractC5815b.createString(parcel, header);
                    break;
                case 11:
                    i8 = AbstractC5815b.readInt(parcel, header);
                    break;
                default:
                    AbstractC5815b.skipUnknownField(parcel, header);
                    break;
            }
        }
        AbstractC5815b.ensureAtEnd(parcel, iValidateObjectHeader);
        return new C3067he(strCreateString, j8, strCreateString2, strCreateString3, strCreateString4, bundleCreateBundle, z8, j9, strCreateString5, i8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C3067he[i8];
    }
}
