package i2;

import android.os.Parcel;
import android.os.Parcelable;
import j2.AbstractC5815b;

/* renamed from: i2.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5653L implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = AbstractC5815b.validateObjectHeader(parcel);
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        long j8 = 0;
        long j9 = 0;
        String strCreateString = null;
        String strCreateString2 = null;
        int i12 = -1;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = AbstractC5815b.readHeader(parcel);
            switch (AbstractC5815b.getFieldId(header)) {
                case 1:
                    i8 = AbstractC5815b.readInt(parcel, header);
                    break;
                case 2:
                    i9 = AbstractC5815b.readInt(parcel, header);
                    break;
                case 3:
                    i10 = AbstractC5815b.readInt(parcel, header);
                    break;
                case 4:
                    j8 = AbstractC5815b.readLong(parcel, header);
                    break;
                case 5:
                    j9 = AbstractC5815b.readLong(parcel, header);
                    break;
                case 6:
                    strCreateString = AbstractC5815b.createString(parcel, header);
                    break;
                case 7:
                    strCreateString2 = AbstractC5815b.createString(parcel, header);
                    break;
                case 8:
                    i11 = AbstractC5815b.readInt(parcel, header);
                    break;
                case 9:
                    i12 = AbstractC5815b.readInt(parcel, header);
                    break;
                default:
                    AbstractC5815b.skipUnknownField(parcel, header);
                    break;
            }
        }
        AbstractC5815b.ensureAtEnd(parcel, iValidateObjectHeader);
        return new C5680m(i8, i9, i10, j8, j9, strCreateString, strCreateString2, i11, i12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C5680m[i8];
    }
}
