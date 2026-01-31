package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Parcel;
import android.os.Parcelable;
import j2.AbstractC5815b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.Dq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1282Dq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = AbstractC5815b.validateObjectHeader(parcel);
        int i8 = 0;
        boolean z8 = false;
        boolean z9 = false;
        ApplicationInfo applicationInfo = null;
        String strCreateString = null;
        PackageInfo packageInfo = null;
        String strCreateString2 = null;
        String strCreateString3 = null;
        ArrayList<String> arrayListCreateStringList = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = AbstractC5815b.readHeader(parcel);
            switch (AbstractC5815b.getFieldId(header)) {
                case 1:
                    applicationInfo = (ApplicationInfo) AbstractC5815b.createParcelable(parcel, header, ApplicationInfo.CREATOR);
                    break;
                case 2:
                    strCreateString = AbstractC5815b.createString(parcel, header);
                    break;
                case 3:
                    packageInfo = (PackageInfo) AbstractC5815b.createParcelable(parcel, header, PackageInfo.CREATOR);
                    break;
                case 4:
                    strCreateString2 = AbstractC5815b.createString(parcel, header);
                    break;
                case 5:
                    i8 = AbstractC5815b.readInt(parcel, header);
                    break;
                case 6:
                    strCreateString3 = AbstractC5815b.createString(parcel, header);
                    break;
                case 7:
                    arrayListCreateStringList = AbstractC5815b.createStringList(parcel, header);
                    break;
                case 8:
                    z8 = AbstractC5815b.readBoolean(parcel, header);
                    break;
                case 9:
                    z9 = AbstractC5815b.readBoolean(parcel, header);
                    break;
                default:
                    AbstractC5815b.skipUnknownField(parcel, header);
                    break;
            }
        }
        AbstractC5815b.ensureAtEnd(parcel, iValidateObjectHeader);
        return new C1241Cq(applicationInfo, strCreateString, packageInfo, strCreateString2, i8, strCreateString3, arrayListCreateStringList, z8, z9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C1241Cq[i8];
    }
}
