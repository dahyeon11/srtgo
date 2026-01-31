package G2;

import android.os.Parcel;
import android.os.Parcelable;
import j2.AbstractC5815b;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class i implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = AbstractC5815b.validateObjectHeader(parcel);
        ArrayList<String> arrayListCreateStringList = null;
        String strCreateString = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = AbstractC5815b.readHeader(parcel);
            int fieldId = AbstractC5815b.getFieldId(header);
            if (fieldId == 1) {
                arrayListCreateStringList = AbstractC5815b.createStringList(parcel, header);
            } else if (fieldId != 2) {
                AbstractC5815b.skipUnknownField(parcel, header);
            } else {
                strCreateString = AbstractC5815b.createString(parcel, header);
            }
        }
        AbstractC5815b.ensureAtEnd(parcel, iValidateObjectHeader);
        return new h(arrayListCreateStringList, strCreateString);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new h[i8];
    }
}
