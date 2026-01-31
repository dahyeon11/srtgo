package f2;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import j2.AbstractC5815b;

/* loaded from: classes.dex */
public final class t implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = AbstractC5815b.validateObjectHeader(parcel);
        PendingIntent pendingIntent = null;
        int i8 = 0;
        int i9 = 0;
        String strCreateString = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = AbstractC5815b.readHeader(parcel);
            int fieldId = AbstractC5815b.getFieldId(header);
            if (fieldId == 1) {
                i8 = AbstractC5815b.readInt(parcel, header);
            } else if (fieldId == 2) {
                i9 = AbstractC5815b.readInt(parcel, header);
            } else if (fieldId == 3) {
                pendingIntent = (PendingIntent) AbstractC5815b.createParcelable(parcel, header, PendingIntent.CREATOR);
            } else if (fieldId != 4) {
                AbstractC5815b.skipUnknownField(parcel, header);
            } else {
                strCreateString = AbstractC5815b.createString(parcel, header);
            }
        }
        AbstractC5815b.ensureAtEnd(parcel, iValidateObjectHeader);
        return new C5392b(i8, i9, pendingIntent, strCreateString);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C5392b[i8];
    }
}
