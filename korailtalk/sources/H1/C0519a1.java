package H1;

import android.os.Parcel;
import android.os.Parcelable;
import j2.AbstractC5815b;

/* renamed from: H1.a1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0519a1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = AbstractC5815b.validateObjectHeader(parcel);
        int i8 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = AbstractC5815b.readHeader(parcel);
            if (AbstractC5815b.getFieldId(header) != 2) {
                AbstractC5815b.skipUnknownField(parcel, header);
            } else {
                i8 = AbstractC5815b.readInt(parcel, header);
            }
        }
        AbstractC5815b.ensureAtEnd(parcel, iValidateObjectHeader);
        return new Z0(i8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new Z0[i8];
    }
}
