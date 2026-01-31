package i2;

import android.os.Parcel;
import android.os.Parcelable;
import j2.AbstractC5815b;

/* loaded from: classes.dex */
public final class o0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = AbstractC5815b.validateObjectHeader(parcel);
        C5685r c5685r = null;
        int[] iArrCreateIntArray = null;
        int[] iArrCreateIntArray2 = null;
        boolean z8 = false;
        boolean z9 = false;
        int i8 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = AbstractC5815b.readHeader(parcel);
            switch (AbstractC5815b.getFieldId(header)) {
                case 1:
                    c5685r = (C5685r) AbstractC5815b.createParcelable(parcel, header, C5685r.CREATOR);
                    break;
                case 2:
                    z8 = AbstractC5815b.readBoolean(parcel, header);
                    break;
                case 3:
                    z9 = AbstractC5815b.readBoolean(parcel, header);
                    break;
                case 4:
                    iArrCreateIntArray = AbstractC5815b.createIntArray(parcel, header);
                    break;
                case 5:
                    i8 = AbstractC5815b.readInt(parcel, header);
                    break;
                case 6:
                    iArrCreateIntArray2 = AbstractC5815b.createIntArray(parcel, header);
                    break;
                default:
                    AbstractC5815b.skipUnknownField(parcel, header);
                    break;
            }
        }
        AbstractC5815b.ensureAtEnd(parcel, iValidateObjectHeader);
        return new C5672e(c5685r, z8, z9, iArrCreateIntArray, i8, iArrCreateIntArray2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C5672e[i8];
    }
}
