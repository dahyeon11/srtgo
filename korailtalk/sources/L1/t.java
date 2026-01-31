package L1;

import android.os.Parcel;
import android.os.Parcelable;
import j2.AbstractC5815b;

/* loaded from: classes.dex */
public final class t implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = AbstractC5815b.validateObjectHeader(parcel);
        int i8 = 0;
        int i9 = 0;
        boolean z8 = false;
        boolean z9 = false;
        String strCreateString = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = AbstractC5815b.readHeader(parcel);
            int fieldId = AbstractC5815b.getFieldId(header);
            if (fieldId == 2) {
                strCreateString = AbstractC5815b.createString(parcel, header);
            } else if (fieldId == 3) {
                i8 = AbstractC5815b.readInt(parcel, header);
            } else if (fieldId == 4) {
                i9 = AbstractC5815b.readInt(parcel, header);
            } else if (fieldId == 5) {
                z8 = AbstractC5815b.readBoolean(parcel, header);
            } else if (fieldId != 6) {
                AbstractC5815b.skipUnknownField(parcel, header);
            } else {
                z9 = AbstractC5815b.readBoolean(parcel, header);
            }
        }
        AbstractC5815b.ensureAtEnd(parcel, iValidateObjectHeader);
        return new a(strCreateString, i8, i9, z8, z9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new a[i8];
    }
}
