package H1;

import android.os.Parcel;
import android.os.Parcelable;
import j2.AbstractC5815b;

/* loaded from: classes.dex */
public final class e2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = AbstractC5815b.validateObjectHeader(parcel);
        int i8 = 0;
        int i9 = 0;
        boolean z8 = false;
        int i10 = 0;
        int i11 = 0;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        String strCreateString = null;
        d2[] d2VarArr = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = AbstractC5815b.readHeader(parcel);
            switch (AbstractC5815b.getFieldId(header)) {
                case 2:
                    strCreateString = AbstractC5815b.createString(parcel, header);
                    break;
                case 3:
                    i8 = AbstractC5815b.readInt(parcel, header);
                    break;
                case 4:
                    i9 = AbstractC5815b.readInt(parcel, header);
                    break;
                case 5:
                    z8 = AbstractC5815b.readBoolean(parcel, header);
                    break;
                case 6:
                    i10 = AbstractC5815b.readInt(parcel, header);
                    break;
                case 7:
                    i11 = AbstractC5815b.readInt(parcel, header);
                    break;
                case 8:
                    d2VarArr = (d2[]) AbstractC5815b.createTypedArray(parcel, header, d2.CREATOR);
                    break;
                case 9:
                    z9 = AbstractC5815b.readBoolean(parcel, header);
                    break;
                case 10:
                    z10 = AbstractC5815b.readBoolean(parcel, header);
                    break;
                case 11:
                    z11 = AbstractC5815b.readBoolean(parcel, header);
                    break;
                case 12:
                    z12 = AbstractC5815b.readBoolean(parcel, header);
                    break;
                case 13:
                    z13 = AbstractC5815b.readBoolean(parcel, header);
                    break;
                case 14:
                    z14 = AbstractC5815b.readBoolean(parcel, header);
                    break;
                case 15:
                    z15 = AbstractC5815b.readBoolean(parcel, header);
                    break;
                case 16:
                    z16 = AbstractC5815b.readBoolean(parcel, header);
                    break;
                default:
                    AbstractC5815b.skipUnknownField(parcel, header);
                    break;
            }
        }
        AbstractC5815b.ensureAtEnd(parcel, iValidateObjectHeader);
        return new d2(strCreateString, i8, i9, z8, i10, i11, d2VarArr, z9, z10, z11, z12, z13, z14, z15, z16);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new d2[i8];
    }
}
