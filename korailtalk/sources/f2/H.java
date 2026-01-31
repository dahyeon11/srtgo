package f2;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import j2.AbstractC5815b;

/* loaded from: classes.dex */
public final class H implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = AbstractC5815b.validateObjectHeader(parcel);
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        String strCreateString = null;
        IBinder iBinder = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = AbstractC5815b.readHeader(parcel);
            switch (AbstractC5815b.getFieldId(header)) {
                case 1:
                    strCreateString = AbstractC5815b.createString(parcel, header);
                    break;
                case 2:
                    z8 = AbstractC5815b.readBoolean(parcel, header);
                    break;
                case 3:
                    z9 = AbstractC5815b.readBoolean(parcel, header);
                    break;
                case 4:
                    iBinder = AbstractC5815b.readIBinder(parcel, header);
                    break;
                case 5:
                    z10 = AbstractC5815b.readBoolean(parcel, header);
                    break;
                case 6:
                    z11 = AbstractC5815b.readBoolean(parcel, header);
                    break;
                default:
                    AbstractC5815b.skipUnknownField(parcel, header);
                    break;
            }
        }
        AbstractC5815b.ensureAtEnd(parcel, iValidateObjectHeader);
        return new G(strCreateString, z8, z9, iBinder, z10, z11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new G[i8];
    }
}
