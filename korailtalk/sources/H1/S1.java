package H1;

import android.os.Parcel;
import android.os.Parcelable;
import j2.AbstractC5815b;

/* loaded from: classes.dex */
public final class S1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = AbstractC5815b.validateObjectHeader(parcel);
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = AbstractC5815b.readHeader(parcel);
            int fieldId = AbstractC5815b.getFieldId(header);
            if (fieldId == 2) {
                z8 = AbstractC5815b.readBoolean(parcel, header);
            } else if (fieldId == 3) {
                z9 = AbstractC5815b.readBoolean(parcel, header);
            } else if (fieldId != 4) {
                AbstractC5815b.skipUnknownField(parcel, header);
            } else {
                z10 = AbstractC5815b.readBoolean(parcel, header);
            }
        }
        AbstractC5815b.ensureAtEnd(parcel, iValidateObjectHeader);
        return new R1(z8, z9, z10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new R1[i8];
    }
}
