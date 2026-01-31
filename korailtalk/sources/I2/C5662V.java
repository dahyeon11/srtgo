package i2;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import f2.C5392b;
import j2.AbstractC5815b;

/* renamed from: i2.V */
/* loaded from: classes.dex */
public final class C5662V implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = AbstractC5815b.validateObjectHeader(parcel);
        int i8 = 0;
        boolean z8 = false;
        boolean z9 = false;
        IBinder iBinder = null;
        C5392b c5392b = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = AbstractC5815b.readHeader(parcel);
            int fieldId = AbstractC5815b.getFieldId(header);
            if (fieldId == 1) {
                i8 = AbstractC5815b.readInt(parcel, header);
            } else if (fieldId == 2) {
                iBinder = AbstractC5815b.readIBinder(parcel, header);
            } else if (fieldId == 3) {
                c5392b = (C5392b) AbstractC5815b.createParcelable(parcel, header, C5392b.CREATOR);
            } else if (fieldId == 4) {
                z8 = AbstractC5815b.readBoolean(parcel, header);
            } else if (fieldId != 5) {
                AbstractC5815b.skipUnknownField(parcel, header);
            } else {
                z9 = AbstractC5815b.readBoolean(parcel, header);
            }
        }
        AbstractC5815b.ensureAtEnd(parcel, iValidateObjectHeader);
        return new C5661U(i8, iBinder, c5392b, z8, z9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C5661U[i8];
    }
}
