package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import j2.AbstractC5815b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.dr, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2633dr implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = AbstractC5815b.validateObjectHeader(parcel);
        Bundle bundleCreateBundle = null;
        L1.a aVar = null;
        ApplicationInfo applicationInfo = null;
        String strCreateString = null;
        ArrayList<String> arrayListCreateStringList = null;
        PackageInfo packageInfo = null;
        String strCreateString2 = null;
        String strCreateString3 = null;
        C1704Ob0 c1704Ob0 = null;
        String strCreateString4 = null;
        Bundle bundleCreateBundle2 = null;
        boolean z8 = false;
        boolean z9 = false;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = AbstractC5815b.readHeader(parcel);
            switch (AbstractC5815b.getFieldId(header)) {
                case 1:
                    bundleCreateBundle = AbstractC5815b.createBundle(parcel, header);
                    break;
                case 2:
                    aVar = (L1.a) AbstractC5815b.createParcelable(parcel, header, L1.a.CREATOR);
                    break;
                case 3:
                    applicationInfo = (ApplicationInfo) AbstractC5815b.createParcelable(parcel, header, ApplicationInfo.CREATOR);
                    break;
                case 4:
                    strCreateString = AbstractC5815b.createString(parcel, header);
                    break;
                case 5:
                    arrayListCreateStringList = AbstractC5815b.createStringList(parcel, header);
                    break;
                case 6:
                    packageInfo = (PackageInfo) AbstractC5815b.createParcelable(parcel, header, PackageInfo.CREATOR);
                    break;
                case 7:
                    strCreateString2 = AbstractC5815b.createString(parcel, header);
                    break;
                case 8:
                default:
                    AbstractC5815b.skipUnknownField(parcel, header);
                    break;
                case 9:
                    strCreateString3 = AbstractC5815b.createString(parcel, header);
                    break;
                case 10:
                    c1704Ob0 = (C1704Ob0) AbstractC5815b.createParcelable(parcel, header, C1704Ob0.CREATOR);
                    break;
                case 11:
                    strCreateString4 = AbstractC5815b.createString(parcel, header);
                    break;
                case 12:
                    z8 = AbstractC5815b.readBoolean(parcel, header);
                    break;
                case 13:
                    z9 = AbstractC5815b.readBoolean(parcel, header);
                    break;
                case 14:
                    bundleCreateBundle2 = AbstractC5815b.createBundle(parcel, header);
                    break;
            }
        }
        AbstractC5815b.ensureAtEnd(parcel, iValidateObjectHeader);
        return new C2519cr(bundleCreateBundle, aVar, applicationInfo, strCreateString, arrayListCreateStringList, packageInfo, strCreateString2, strCreateString3, c1704Ob0, strCreateString4, z8, z9, bundleCreateBundle2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C2519cr[i8];
    }
}
