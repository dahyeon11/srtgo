package K1;

import android.os.Parcel;
import android.os.Parcelable;
import j2.AbstractC5815b;

/* loaded from: classes.dex */
public final class E implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = AbstractC5815b.validateObjectHeader(parcel);
        int i8 = 0;
        String strCreateString = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = AbstractC5815b.readHeader(parcel);
            int fieldId = AbstractC5815b.getFieldId(header);
            if (fieldId == 1) {
                strCreateString = AbstractC5815b.createString(parcel, header);
            } else if (fieldId != 2) {
                AbstractC5815b.skipUnknownField(parcel, header);
            } else {
                i8 = AbstractC5815b.readInt(parcel, header);
            }
        }
        AbstractC5815b.ensureAtEnd(parcel, iValidateObjectHeader);
        return new D(strCreateString, i8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new D[i8];
    }
}
