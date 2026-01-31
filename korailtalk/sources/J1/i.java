package J1;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import j2.AbstractC5815b;

/* loaded from: classes.dex */
public final class i implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = AbstractC5815b.validateObjectHeader(parcel);
        boolean z8 = false;
        String strCreateString = null;
        String strCreateString2 = null;
        String strCreateString3 = null;
        String strCreateString4 = null;
        String strCreateString5 = null;
        String strCreateString6 = null;
        String strCreateString7 = null;
        Intent intent = null;
        IBinder iBinder = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = AbstractC5815b.readHeader(parcel);
            switch (AbstractC5815b.getFieldId(header)) {
                case 2:
                    strCreateString = AbstractC5815b.createString(parcel, header);
                    break;
                case 3:
                    strCreateString2 = AbstractC5815b.createString(parcel, header);
                    break;
                case 4:
                    strCreateString3 = AbstractC5815b.createString(parcel, header);
                    break;
                case 5:
                    strCreateString4 = AbstractC5815b.createString(parcel, header);
                    break;
                case 6:
                    strCreateString5 = AbstractC5815b.createString(parcel, header);
                    break;
                case 7:
                    strCreateString6 = AbstractC5815b.createString(parcel, header);
                    break;
                case 8:
                    strCreateString7 = AbstractC5815b.createString(parcel, header);
                    break;
                case 9:
                    intent = (Intent) AbstractC5815b.createParcelable(parcel, header, Intent.CREATOR);
                    break;
                case 10:
                    iBinder = AbstractC5815b.readIBinder(parcel, header);
                    break;
                case 11:
                    z8 = AbstractC5815b.readBoolean(parcel, header);
                    break;
                default:
                    AbstractC5815b.skipUnknownField(parcel, header);
                    break;
            }
        }
        AbstractC5815b.ensureAtEnd(parcel, iValidateObjectHeader);
        return new j(strCreateString, strCreateString2, strCreateString3, strCreateString4, strCreateString5, strCreateString6, strCreateString7, intent, iBinder, z8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new j[i8];
    }
}
