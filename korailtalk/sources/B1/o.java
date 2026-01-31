package B1;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import j2.AbstractC5815b;

/* loaded from: classes.dex */
public final class o implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = AbstractC5815b.validateObjectHeader(parcel);
        IBinder iBinder = null;
        boolean z8 = false;
        IBinder iBinder2 = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = AbstractC5815b.readHeader(parcel);
            int fieldId = AbstractC5815b.getFieldId(header);
            if (fieldId == 1) {
                z8 = AbstractC5815b.readBoolean(parcel, header);
            } else if (fieldId == 2) {
                iBinder = AbstractC5815b.readIBinder(parcel, header);
            } else if (fieldId != 3) {
                AbstractC5815b.skipUnknownField(parcel, header);
            } else {
                iBinder2 = AbstractC5815b.readIBinder(parcel, header);
            }
        }
        AbstractC5815b.ensureAtEnd(parcel, iValidateObjectHeader);
        return new g(z8, iBinder, iBinder2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new g[i8];
    }
}
