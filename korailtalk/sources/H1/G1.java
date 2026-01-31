package H1;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import j2.AbstractC5815b;

/* loaded from: classes.dex */
public final class G1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = AbstractC5815b.validateObjectHeader(parcel);
        String strCreateString = null;
        String strCreateString2 = null;
        C0534f1 c0534f1 = null;
        IBinder iBinder = null;
        int i8 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = AbstractC5815b.readHeader(parcel);
            int fieldId = AbstractC5815b.getFieldId(header);
            if (fieldId == 1) {
                i8 = AbstractC5815b.readInt(parcel, header);
            } else if (fieldId == 2) {
                strCreateString = AbstractC5815b.createString(parcel, header);
            } else if (fieldId == 3) {
                strCreateString2 = AbstractC5815b.createString(parcel, header);
            } else if (fieldId == 4) {
                c0534f1 = (C0534f1) AbstractC5815b.createParcelable(parcel, header, C0534f1.CREATOR);
            } else if (fieldId != 5) {
                AbstractC5815b.skipUnknownField(parcel, header);
            } else {
                iBinder = AbstractC5815b.readIBinder(parcel, header);
            }
        }
        AbstractC5815b.ensureAtEnd(parcel, iValidateObjectHeader);
        return new C0534f1(i8, strCreateString, strCreateString2, c0534f1, iBinder);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C0534f1[i8];
    }
}
