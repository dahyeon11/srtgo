package f2;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import j2.AbstractC5815b;

/* loaded from: classes.dex */
public final class L implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = AbstractC5815b.validateObjectHeader(parcel);
        boolean z8 = false;
        String strCreateString = null;
        IBinder iBinder = null;
        boolean z9 = false;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = AbstractC5815b.readHeader(parcel);
            int fieldId = AbstractC5815b.getFieldId(header);
            if (fieldId == 1) {
                strCreateString = AbstractC5815b.createString(parcel, header);
            } else if (fieldId == 2) {
                iBinder = AbstractC5815b.readIBinder(parcel, header);
            } else if (fieldId == 3) {
                z8 = AbstractC5815b.readBoolean(parcel, header);
            } else if (fieldId != 4) {
                AbstractC5815b.skipUnknownField(parcel, header);
            } else {
                z9 = AbstractC5815b.readBoolean(parcel, header);
            }
        }
        AbstractC5815b.ensureAtEnd(parcel, iValidateObjectHeader);
        return new K(strCreateString, iBinder, z8, z9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new K[i8];
    }
}
