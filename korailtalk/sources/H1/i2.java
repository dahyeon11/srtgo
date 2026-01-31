package H1;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import j2.AbstractC5815b;

/* loaded from: classes.dex */
public final class i2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = AbstractC5815b.validateObjectHeader(parcel);
        String strCreateString = null;
        C0534f1 c0534f1 = null;
        Bundle bundleCreateBundle = null;
        String strCreateString2 = null;
        String strCreateString3 = null;
        String strCreateString4 = null;
        String strCreateString5 = null;
        long j8 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = AbstractC5815b.readHeader(parcel);
            switch (AbstractC5815b.getFieldId(header)) {
                case 1:
                    strCreateString = AbstractC5815b.createString(parcel, header);
                    break;
                case 2:
                    j8 = AbstractC5815b.readLong(parcel, header);
                    break;
                case 3:
                    c0534f1 = (C0534f1) AbstractC5815b.createParcelable(parcel, header, C0534f1.CREATOR);
                    break;
                case 4:
                    bundleCreateBundle = AbstractC5815b.createBundle(parcel, header);
                    break;
                case 5:
                    strCreateString2 = AbstractC5815b.createString(parcel, header);
                    break;
                case 6:
                    strCreateString3 = AbstractC5815b.createString(parcel, header);
                    break;
                case 7:
                    strCreateString4 = AbstractC5815b.createString(parcel, header);
                    break;
                case 8:
                    strCreateString5 = AbstractC5815b.createString(parcel, header);
                    break;
                default:
                    AbstractC5815b.skipUnknownField(parcel, header);
                    break;
            }
        }
        AbstractC5815b.ensureAtEnd(parcel, iValidateObjectHeader);
        return new h2(strCreateString, j8, c0534f1, bundleCreateBundle, strCreateString2, strCreateString3, strCreateString4, strCreateString5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new h2[i8];
    }
}
