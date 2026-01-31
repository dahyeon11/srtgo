package f2;

import android.os.Parcel;
import android.os.Parcelable;
import j2.AbstractC5815b;

/* loaded from: classes.dex */
public final class u implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = AbstractC5815b.validateObjectHeader(parcel);
        long j8 = -1;
        int i8 = 0;
        String strCreateString = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = AbstractC5815b.readHeader(parcel);
            int fieldId = AbstractC5815b.getFieldId(header);
            if (fieldId == 1) {
                strCreateString = AbstractC5815b.createString(parcel, header);
            } else if (fieldId == 2) {
                i8 = AbstractC5815b.readInt(parcel, header);
            } else if (fieldId != 3) {
                AbstractC5815b.skipUnknownField(parcel, header);
            } else {
                j8 = AbstractC5815b.readLong(parcel, header);
            }
        }
        AbstractC5815b.ensureAtEnd(parcel, iValidateObjectHeader);
        return new C5394d(strCreateString, i8, j8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C5394d[i8];
    }
}
