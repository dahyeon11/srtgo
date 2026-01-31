package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import j2.AbstractC5815b;

/* renamed from: com.google.android.gms.internal.ads.Iq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1487Iq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = AbstractC5815b.validateObjectHeader(parcel);
        String strCreateString = null;
        Bundle bundleCreateBundle = null;
        byte[] bArrCreateByteArray = null;
        String strCreateString2 = null;
        String strCreateString3 = null;
        int i8 = 0;
        boolean z8 = false;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = AbstractC5815b.readHeader(parcel);
            switch (AbstractC5815b.getFieldId(header)) {
                case 1:
                    strCreateString = AbstractC5815b.createString(parcel, header);
                    break;
                case 2:
                    i8 = AbstractC5815b.readInt(parcel, header);
                    break;
                case 3:
                    bundleCreateBundle = AbstractC5815b.createBundle(parcel, header);
                    break;
                case 4:
                    bArrCreateByteArray = AbstractC5815b.createByteArray(parcel, header);
                    break;
                case 5:
                    z8 = AbstractC5815b.readBoolean(parcel, header);
                    break;
                case 6:
                    strCreateString2 = AbstractC5815b.createString(parcel, header);
                    break;
                case 7:
                    strCreateString3 = AbstractC5815b.createString(parcel, header);
                    break;
                default:
                    AbstractC5815b.skipUnknownField(parcel, header);
                    break;
            }
        }
        AbstractC5815b.ensureAtEnd(parcel, iValidateObjectHeader);
        return new C1405Gq(strCreateString, i8, bundleCreateBundle, bArrCreateByteArray, z8, strCreateString2, strCreateString3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C1405Gq[i8];
    }
}
