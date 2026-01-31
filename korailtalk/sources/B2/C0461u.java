package B2;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import j2.AbstractC5815b;

/* renamed from: B2.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0461u implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = AbstractC5815b.validateObjectHeader(parcel);
        long j8 = 0;
        long j9 = 0;
        boolean z8 = false;
        String strCreateString = null;
        String strCreateString2 = null;
        String strCreateString3 = null;
        Bundle bundleCreateBundle = null;
        String strCreateString4 = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = AbstractC5815b.readHeader(parcel);
            switch (AbstractC5815b.getFieldId(header)) {
                case 1:
                    j8 = AbstractC5815b.readLong(parcel, header);
                    break;
                case 2:
                    j9 = AbstractC5815b.readLong(parcel, header);
                    break;
                case 3:
                    z8 = AbstractC5815b.readBoolean(parcel, header);
                    break;
                case 4:
                    strCreateString = AbstractC5815b.createString(parcel, header);
                    break;
                case 5:
                    strCreateString2 = AbstractC5815b.createString(parcel, header);
                    break;
                case 6:
                    strCreateString3 = AbstractC5815b.createString(parcel, header);
                    break;
                case 7:
                    bundleCreateBundle = AbstractC5815b.createBundle(parcel, header);
                    break;
                case 8:
                    strCreateString4 = AbstractC5815b.createString(parcel, header);
                    break;
                default:
                    AbstractC5815b.skipUnknownField(parcel, header);
                    break;
            }
        }
        AbstractC5815b.ensureAtEnd(parcel, iValidateObjectHeader);
        return new C0460t(j8, j9, z8, strCreateString, strCreateString2, strCreateString3, bundleCreateBundle, strCreateString4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C0460t[i8];
    }
}
