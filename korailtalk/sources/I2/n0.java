package i2;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import f2.C5394d;
import j2.AbstractC5815b;

/* loaded from: classes.dex */
public final class n0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = AbstractC5815b.validateObjectHeader(parcel);
        Bundle bundleCreateBundle = null;
        C5672e c5672e = null;
        int i8 = 0;
        C5394d[] c5394dArr = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = AbstractC5815b.readHeader(parcel);
            int fieldId = AbstractC5815b.getFieldId(header);
            if (fieldId == 1) {
                bundleCreateBundle = AbstractC5815b.createBundle(parcel, header);
            } else if (fieldId == 2) {
                c5394dArr = (C5394d[]) AbstractC5815b.createTypedArray(parcel, header, C5394d.CREATOR);
            } else if (fieldId == 3) {
                i8 = AbstractC5815b.readInt(parcel, header);
            } else if (fieldId != 4) {
                AbstractC5815b.skipUnknownField(parcel, header);
            } else {
                c5672e = (C5672e) AbstractC5815b.createParcelable(parcel, header, C5672e.CREATOR);
            }
        }
        AbstractC5815b.ensureAtEnd(parcel, iValidateObjectHeader);
        return new m0(bundleCreateBundle, c5394dArr, i8, c5672e);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new m0[i8];
    }
}
