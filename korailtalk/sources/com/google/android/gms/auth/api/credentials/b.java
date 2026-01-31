package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import j2.AbstractC5815b;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = AbstractC5815b.validateObjectHeader(parcel);
        String strCreateString = null;
        String strCreateString2 = null;
        Uri uri = null;
        ArrayList arrayListCreateTypedList = null;
        String strCreateString3 = null;
        String strCreateString4 = null;
        String strCreateString5 = null;
        String strCreateString6 = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = AbstractC5815b.readHeader(parcel);
            switch (AbstractC5815b.getFieldId(header)) {
                case 1:
                    strCreateString = AbstractC5815b.createString(parcel, header);
                    break;
                case 2:
                    strCreateString2 = AbstractC5815b.createString(parcel, header);
                    break;
                case 3:
                    uri = (Uri) AbstractC5815b.createParcelable(parcel, header, Uri.CREATOR);
                    break;
                case 4:
                    arrayListCreateTypedList = AbstractC5815b.createTypedList(parcel, header, IdToken.CREATOR);
                    break;
                case 5:
                    strCreateString3 = AbstractC5815b.createString(parcel, header);
                    break;
                case 6:
                    strCreateString4 = AbstractC5815b.createString(parcel, header);
                    break;
                case 7:
                case 8:
                default:
                    AbstractC5815b.skipUnknownField(parcel, header);
                    break;
                case 9:
                    strCreateString5 = AbstractC5815b.createString(parcel, header);
                    break;
                case 10:
                    strCreateString6 = AbstractC5815b.createString(parcel, header);
                    break;
            }
        }
        AbstractC5815b.ensureAtEnd(parcel, iValidateObjectHeader);
        return new Credential(strCreateString, strCreateString2, uri, arrayListCreateTypedList, strCreateString3, strCreateString4, strCreateString5, strCreateString6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new Credential[i8];
    }
}
