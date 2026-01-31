package i2;

import android.os.Parcel;
import android.os.Parcelable;
import j2.AbstractC5815b;
import java.util.ArrayList;

/* renamed from: i2.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5691x implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = AbstractC5815b.validateObjectHeader(parcel);
        int i8 = 0;
        ArrayList arrayListCreateTypedList = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = AbstractC5815b.readHeader(parcel);
            int fieldId = AbstractC5815b.getFieldId(header);
            if (fieldId == 1) {
                i8 = AbstractC5815b.readInt(parcel, header);
            } else if (fieldId != 2) {
                AbstractC5815b.skipUnknownField(parcel, header);
            } else {
                arrayListCreateTypedList = AbstractC5815b.createTypedList(parcel, header, C5680m.CREATOR);
            }
        }
        AbstractC5815b.ensureAtEnd(parcel, iValidateObjectHeader);
        return new C5687t(i8, arrayListCreateTypedList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C5687t[i8];
    }
}
