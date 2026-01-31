package G2;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import j2.AbstractC5815b;

/* loaded from: classes2.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = AbstractC5815b.validateObjectHeader(parcel);
        int i8 = 0;
        Intent intent = null;
        int i9 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = AbstractC5815b.readHeader(parcel);
            int fieldId = AbstractC5815b.getFieldId(header);
            if (fieldId == 1) {
                i8 = AbstractC5815b.readInt(parcel, header);
            } else if (fieldId == 2) {
                i9 = AbstractC5815b.readInt(parcel, header);
            } else if (fieldId != 3) {
                AbstractC5815b.skipUnknownField(parcel, header);
            } else {
                intent = (Intent) AbstractC5815b.createParcelable(parcel, header, Intent.CREATOR);
            }
        }
        AbstractC5815b.ensureAtEnd(parcel, iValidateObjectHeader);
        return new b(i8, i9, intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new b[i8];
    }
}
