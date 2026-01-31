package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import j2.AbstractC5815b;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = AbstractC5815b.validateObjectHeader(parcel);
        int i8 = 0;
        String strCreateString = null;
        String strCreateString2 = null;
        String strCreateString3 = null;
        String strCreateString4 = null;
        Uri uri = null;
        String strCreateString5 = null;
        String strCreateString6 = null;
        ArrayList arrayListCreateTypedList = null;
        String strCreateString7 = null;
        String strCreateString8 = null;
        long j8 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = AbstractC5815b.readHeader(parcel);
            switch (AbstractC5815b.getFieldId(header)) {
                case 1:
                    i8 = AbstractC5815b.readInt(parcel, header);
                    break;
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
                    uri = (Uri) AbstractC5815b.createParcelable(parcel, header, Uri.CREATOR);
                    break;
                case 7:
                    strCreateString5 = AbstractC5815b.createString(parcel, header);
                    break;
                case 8:
                    j8 = AbstractC5815b.readLong(parcel, header);
                    break;
                case 9:
                    strCreateString6 = AbstractC5815b.createString(parcel, header);
                    break;
                case 10:
                    arrayListCreateTypedList = AbstractC5815b.createTypedList(parcel, header, Scope.CREATOR);
                    break;
                case 11:
                    strCreateString7 = AbstractC5815b.createString(parcel, header);
                    break;
                case 12:
                    strCreateString8 = AbstractC5815b.createString(parcel, header);
                    break;
                default:
                    AbstractC5815b.skipUnknownField(parcel, header);
                    break;
            }
        }
        AbstractC5815b.ensureAtEnd(parcel, iValidateObjectHeader);
        return new GoogleSignInAccount(i8, strCreateString, strCreateString2, strCreateString3, strCreateString4, uri, strCreateString5, j8, strCreateString6, arrayListCreateTypedList, strCreateString7, strCreateString8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new GoogleSignInAccount[i8];
    }
}
