package a2;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import j2.AbstractC5815b;

/* renamed from: a2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0832e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = AbstractC5815b.validateObjectHeader(parcel);
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        PendingIntent pendingIntent = null;
        Bundle bundleCreateBundle = null;
        byte[] bArrCreateByteArray = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = AbstractC5815b.readHeader(parcel);
            int fieldId = AbstractC5815b.getFieldId(header);
            if (fieldId == 1) {
                i9 = AbstractC5815b.readInt(parcel, header);
            } else if (fieldId == 2) {
                pendingIntent = (PendingIntent) AbstractC5815b.createParcelable(parcel, header, PendingIntent.CREATOR);
            } else if (fieldId == 3) {
                i10 = AbstractC5815b.readInt(parcel, header);
            } else if (fieldId == 4) {
                bundleCreateBundle = AbstractC5815b.createBundle(parcel, header);
            } else if (fieldId == 5) {
                bArrCreateByteArray = AbstractC5815b.createByteArray(parcel, header);
            } else if (fieldId != 1000) {
                AbstractC5815b.skipUnknownField(parcel, header);
            } else {
                i8 = AbstractC5815b.readInt(parcel, header);
            }
        }
        AbstractC5815b.ensureAtEnd(parcel, iValidateObjectHeader);
        return new C0830c(i8, i9, pendingIntent, i10, bundleCreateBundle, bArrCreateByteArray);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C0830c[i8];
    }
}
