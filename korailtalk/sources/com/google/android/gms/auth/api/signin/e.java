package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import c2.C1089a;
import com.google.android.gms.common.api.Scope;
import j2.AbstractC5815b;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = AbstractC5815b.validateObjectHeader(parcel);
        int i8 = 0;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        ArrayList arrayListCreateTypedList = null;
        Account account = null;
        String strCreateString = null;
        String strCreateString2 = null;
        ArrayList arrayListCreateTypedList2 = null;
        String strCreateString3 = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = AbstractC5815b.readHeader(parcel);
            switch (AbstractC5815b.getFieldId(header)) {
                case 1:
                    i8 = AbstractC5815b.readInt(parcel, header);
                    break;
                case 2:
                    arrayListCreateTypedList = AbstractC5815b.createTypedList(parcel, header, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) AbstractC5815b.createParcelable(parcel, header, Account.CREATOR);
                    break;
                case 4:
                    z8 = AbstractC5815b.readBoolean(parcel, header);
                    break;
                case 5:
                    z9 = AbstractC5815b.readBoolean(parcel, header);
                    break;
                case 6:
                    z10 = AbstractC5815b.readBoolean(parcel, header);
                    break;
                case 7:
                    strCreateString = AbstractC5815b.createString(parcel, header);
                    break;
                case 8:
                    strCreateString2 = AbstractC5815b.createString(parcel, header);
                    break;
                case 9:
                    arrayListCreateTypedList2 = AbstractC5815b.createTypedList(parcel, header, C1089a.CREATOR);
                    break;
                case 10:
                    strCreateString3 = AbstractC5815b.createString(parcel, header);
                    break;
                default:
                    AbstractC5815b.skipUnknownField(parcel, header);
                    break;
            }
        }
        AbstractC5815b.ensureAtEnd(parcel, iValidateObjectHeader);
        return new GoogleSignInOptions(i8, arrayListCreateTypedList, account, z8, z9, z10, strCreateString, strCreateString2, arrayListCreateTypedList2, strCreateString3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new GoogleSignInOptions[i8];
    }
}
