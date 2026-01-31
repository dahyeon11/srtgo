package G1;

import android.os.Parcel;
import android.os.Parcelable;
import j2.AbstractC5815b;

/* loaded from: classes.dex */
public final class l implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = AbstractC5815b.validateObjectHeader(parcel);
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        int i8 = 0;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        float f8 = 0.0f;
        String strCreateString = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = AbstractC5815b.readHeader(parcel);
            switch (AbstractC5815b.getFieldId(header)) {
                case 2:
                    z8 = AbstractC5815b.readBoolean(parcel, header);
                    break;
                case 3:
                    z9 = AbstractC5815b.readBoolean(parcel, header);
                    break;
                case 4:
                    strCreateString = AbstractC5815b.createString(parcel, header);
                    break;
                case 5:
                    z10 = AbstractC5815b.readBoolean(parcel, header);
                    break;
                case 6:
                    f8 = AbstractC5815b.readFloat(parcel, header);
                    break;
                case 7:
                    i8 = AbstractC5815b.readInt(parcel, header);
                    break;
                case 8:
                    z11 = AbstractC5815b.readBoolean(parcel, header);
                    break;
                case 9:
                    z12 = AbstractC5815b.readBoolean(parcel, header);
                    break;
                case 10:
                    z13 = AbstractC5815b.readBoolean(parcel, header);
                    break;
                default:
                    AbstractC5815b.skipUnknownField(parcel, header);
                    break;
            }
        }
        AbstractC5815b.ensureAtEnd(parcel, iValidateObjectHeader);
        return new k(z8, z9, strCreateString, z10, f8, i8, z11, z12, z13);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new k[i8];
    }
}
