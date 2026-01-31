package a2;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import j2.AbstractC5815b;

/* renamed from: a2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0831d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = AbstractC5815b.validateObjectHeader(parcel);
        int i8 = 0;
        int i9 = 0;
        String strCreateString = null;
        byte[] bArrCreateByteArray = null;
        Bundle bundleCreateBundle = null;
        long j8 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = AbstractC5815b.readHeader(parcel);
            int fieldId = AbstractC5815b.getFieldId(header);
            if (fieldId == 1) {
                strCreateString = AbstractC5815b.createString(parcel, header);
            } else if (fieldId == 2) {
                i9 = AbstractC5815b.readInt(parcel, header);
            } else if (fieldId == 3) {
                j8 = AbstractC5815b.readLong(parcel, header);
            } else if (fieldId == 4) {
                bArrCreateByteArray = AbstractC5815b.createByteArray(parcel, header);
            } else if (fieldId == 5) {
                bundleCreateBundle = AbstractC5815b.createBundle(parcel, header);
            } else if (fieldId != 1000) {
                AbstractC5815b.skipUnknownField(parcel, header);
            } else {
                i8 = AbstractC5815b.readInt(parcel, header);
            }
        }
        AbstractC5815b.ensureAtEnd(parcel, iValidateObjectHeader);
        return new C0829b(i8, strCreateString, i9, j8, bArrCreateByteArray, bundleCreateBundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C0829b[i8];
    }
}
