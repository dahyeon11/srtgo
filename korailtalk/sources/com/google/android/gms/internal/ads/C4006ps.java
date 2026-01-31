package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import j2.AbstractC5815b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.ps, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4006ps implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = AbstractC5815b.validateObjectHeader(parcel);
        String strCreateString = null;
        String strCreateString2 = null;
        ArrayList<String> arrayListCreateStringList = null;
        ArrayList<String> arrayListCreateStringList2 = null;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
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
                    z8 = AbstractC5815b.readBoolean(parcel, header);
                    break;
                case 5:
                    z9 = AbstractC5815b.readBoolean(parcel, header);
                    break;
                case 6:
                    arrayListCreateStringList = AbstractC5815b.createStringList(parcel, header);
                    break;
                case 7:
                    z10 = AbstractC5815b.readBoolean(parcel, header);
                    break;
                case 8:
                    z11 = AbstractC5815b.readBoolean(parcel, header);
                    break;
                case 9:
                    arrayListCreateStringList2 = AbstractC5815b.createStringList(parcel, header);
                    break;
                default:
                    AbstractC5815b.skipUnknownField(parcel, header);
                    break;
            }
        }
        AbstractC5815b.ensureAtEnd(parcel, iValidateObjectHeader);
        return new C3892os(strCreateString, strCreateString2, z8, z9, arrayListCreateStringList, z10, z11, arrayListCreateStringList2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C3892os[i8];
    }
}
