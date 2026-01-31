package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import j2.AbstractC5815b;

/* loaded from: classes.dex */
public final class f implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = AbstractC5815b.validateObjectHeader(parcel);
        int i8 = 0;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        CredentialPickerConfig credentialPickerConfig = null;
        String[] strArrCreateStringArray = null;
        String strCreateString = null;
        String strCreateString2 = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = AbstractC5815b.readHeader(parcel);
            int fieldId = AbstractC5815b.getFieldId(header);
            if (fieldId != 1000) {
                switch (fieldId) {
                    case 1:
                        credentialPickerConfig = (CredentialPickerConfig) AbstractC5815b.createParcelable(parcel, header, CredentialPickerConfig.CREATOR);
                        break;
                    case 2:
                        z8 = AbstractC5815b.readBoolean(parcel, header);
                        break;
                    case 3:
                        z9 = AbstractC5815b.readBoolean(parcel, header);
                        break;
                    case 4:
                        strArrCreateStringArray = AbstractC5815b.createStringArray(parcel, header);
                        break;
                    case 5:
                        z10 = AbstractC5815b.readBoolean(parcel, header);
                        break;
                    case 6:
                        strCreateString = AbstractC5815b.createString(parcel, header);
                        break;
                    case 7:
                        strCreateString2 = AbstractC5815b.createString(parcel, header);
                        break;
                    default:
                        AbstractC5815b.skipUnknownField(parcel, header);
                        break;
                }
            } else {
                i8 = AbstractC5815b.readInt(parcel, header);
            }
        }
        AbstractC5815b.ensureAtEnd(parcel, iValidateObjectHeader);
        return new HintRequest(i8, credentialPickerConfig, z8, z9, strArrCreateStringArray, z10, strCreateString, strCreateString2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new HintRequest[i8];
    }
}
