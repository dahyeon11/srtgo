package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.constraintlayout.widget.ConstraintLayout;
import j2.AbstractC5815b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.Aq */
/* loaded from: classes2.dex */
public final class C1159Aq implements Parcelable.Creator {
    public static final C5141zq zza(Parcel parcel) {
        int iValidateObjectHeader = AbstractC5815b.validateObjectHeader(parcel);
        Bundle bundleCreateBundle = null;
        H1.Y1 y12 = null;
        H1.d2 d2Var = null;
        String strCreateString = null;
        ApplicationInfo applicationInfo = null;
        PackageInfo packageInfo = null;
        String strCreateString2 = null;
        String strCreateString3 = null;
        String strCreateString4 = null;
        L1.a aVar = null;
        Bundle bundleCreateBundle2 = null;
        ArrayList<String> arrayListCreateStringList = null;
        Bundle bundleCreateBundle3 = null;
        String strCreateString5 = null;
        String strCreateString6 = null;
        ArrayList<String> arrayListCreateStringList2 = null;
        String strCreateString7 = null;
        C1840Ri c1840Ri = null;
        ArrayList<String> arrayListCreateStringList3 = null;
        String strCreateString8 = null;
        String strCreateString9 = null;
        String strCreateString10 = null;
        Bundle bundleCreateBundle4 = null;
        String strCreateString11 = null;
        H1.Z0 z02 = null;
        Bundle bundleCreateBundle5 = null;
        String strCreateString12 = null;
        String strCreateString13 = null;
        String strCreateString14 = null;
        ArrayList<Integer> arrayListCreateIntegerList = null;
        String strCreateString15 = null;
        ArrayList<String> arrayListCreateStringList4 = null;
        ArrayList<String> arrayListCreateStringList5 = null;
        String strCreateString16 = null;
        C3197im c3197im = null;
        String strCreateString17 = null;
        Bundle bundleCreateBundle6 = null;
        int i8 = 0;
        int i9 = 0;
        boolean z8 = false;
        int i10 = 0;
        int i11 = 0;
        boolean z9 = false;
        int i12 = 0;
        int i13 = 0;
        boolean z10 = false;
        boolean z11 = false;
        int i14 = 0;
        boolean z12 = false;
        boolean z13 = false;
        int i15 = 0;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        float f8 = 0.0f;
        float f9 = 0.0f;
        long j8 = 0;
        long j9 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = AbstractC5815b.readHeader(parcel);
            switch (AbstractC5815b.getFieldId(header)) {
                case 1:
                    i8 = AbstractC5815b.readInt(parcel, header);
                    break;
                case 2:
                    bundleCreateBundle = AbstractC5815b.createBundle(parcel, header);
                    break;
                case 3:
                    y12 = (H1.Y1) AbstractC5815b.createParcelable(parcel, header, H1.Y1.CREATOR);
                    break;
                case 4:
                    d2Var = (H1.d2) AbstractC5815b.createParcelable(parcel, header, H1.d2.CREATOR);
                    break;
                case 5:
                    strCreateString = AbstractC5815b.createString(parcel, header);
                    break;
                case 6:
                    applicationInfo = (ApplicationInfo) AbstractC5815b.createParcelable(parcel, header, ApplicationInfo.CREATOR);
                    break;
                case 7:
                    packageInfo = (PackageInfo) AbstractC5815b.createParcelable(parcel, header, PackageInfo.CREATOR);
                    break;
                case 8:
                    strCreateString2 = AbstractC5815b.createString(parcel, header);
                    break;
                case 9:
                    strCreateString3 = AbstractC5815b.createString(parcel, header);
                    break;
                case 10:
                    strCreateString4 = AbstractC5815b.createString(parcel, header);
                    break;
                case 11:
                    aVar = (L1.a) AbstractC5815b.createParcelable(parcel, header, L1.a.CREATOR);
                    break;
                case 12:
                    bundleCreateBundle2 = AbstractC5815b.createBundle(parcel, header);
                    break;
                case 13:
                    i9 = AbstractC5815b.readInt(parcel, header);
                    break;
                case 14:
                    arrayListCreateStringList = AbstractC5815b.createStringList(parcel, header);
                    break;
                case 15:
                    bundleCreateBundle3 = AbstractC5815b.createBundle(parcel, header);
                    break;
                case 16:
                    z8 = AbstractC5815b.readBoolean(parcel, header);
                    break;
                case 17:
                case 22:
                case 23:
                case 24:
                case 32:
                case 38:
                case 62:
                default:
                    AbstractC5815b.skipUnknownField(parcel, header);
                    break;
                case 18:
                    i10 = AbstractC5815b.readInt(parcel, header);
                    break;
                case 19:
                    i11 = AbstractC5815b.readInt(parcel, header);
                    break;
                case 20:
                    f8 = AbstractC5815b.readFloat(parcel, header);
                    break;
                case 21:
                    strCreateString5 = AbstractC5815b.createString(parcel, header);
                    break;
                case 25:
                    j8 = AbstractC5815b.readLong(parcel, header);
                    break;
                case 26:
                    strCreateString6 = AbstractC5815b.createString(parcel, header);
                    break;
                case 27:
                    arrayListCreateStringList2 = AbstractC5815b.createStringList(parcel, header);
                    break;
                case 28:
                    strCreateString7 = AbstractC5815b.createString(parcel, header);
                    break;
                case ConstraintLayout.b.a.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                    c1840Ri = (C1840Ri) AbstractC5815b.createParcelable(parcel, header, C1840Ri.CREATOR);
                    break;
                case 30:
                    arrayListCreateStringList3 = AbstractC5815b.createStringList(parcel, header);
                    break;
                case 31:
                    j9 = AbstractC5815b.readLong(parcel, header);
                    break;
                case 33:
                    strCreateString8 = AbstractC5815b.createString(parcel, header);
                    break;
                case 34:
                    f9 = AbstractC5815b.readFloat(parcel, header);
                    break;
                case 35:
                    i12 = AbstractC5815b.readInt(parcel, header);
                    break;
                case 36:
                    i13 = AbstractC5815b.readInt(parcel, header);
                    break;
                case 37:
                    z10 = AbstractC5815b.readBoolean(parcel, header);
                    break;
                case 39:
                    strCreateString9 = AbstractC5815b.createString(parcel, header);
                    break;
                case 40:
                    z9 = AbstractC5815b.readBoolean(parcel, header);
                    break;
                case 41:
                    strCreateString10 = AbstractC5815b.createString(parcel, header);
                    break;
                case 42:
                    z11 = AbstractC5815b.readBoolean(parcel, header);
                    break;
                case 43:
                    i14 = AbstractC5815b.readInt(parcel, header);
                    break;
                case 44:
                    bundleCreateBundle4 = AbstractC5815b.createBundle(parcel, header);
                    break;
                case 45:
                    strCreateString11 = AbstractC5815b.createString(parcel, header);
                    break;
                case 46:
                    z02 = (H1.Z0) AbstractC5815b.createParcelable(parcel, header, H1.Z0.CREATOR);
                    break;
                case 47:
                    z12 = AbstractC5815b.readBoolean(parcel, header);
                    break;
                case ConstraintLayout.b.a.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                    bundleCreateBundle5 = AbstractC5815b.createBundle(parcel, header);
                    break;
                case ConstraintLayout.b.a.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    strCreateString12 = AbstractC5815b.createString(parcel, header);
                    break;
                case 50:
                    strCreateString13 = AbstractC5815b.createString(parcel, header);
                    break;
                case ConstraintLayout.b.a.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    strCreateString14 = AbstractC5815b.createString(parcel, header);
                    break;
                case 52:
                    z13 = AbstractC5815b.readBoolean(parcel, header);
                    break;
                case 53:
                    arrayListCreateIntegerList = AbstractC5815b.createIntegerList(parcel, header);
                    break;
                case 54:
                    strCreateString15 = AbstractC5815b.createString(parcel, header);
                    break;
                case s4.z.PUSH_TYPE_DEPARTURE /* 55 */:
                    arrayListCreateStringList4 = AbstractC5815b.createStringList(parcel, header);
                    break;
                case 56:
                    i15 = AbstractC5815b.readInt(parcel, header);
                    break;
                case 57:
                    z14 = AbstractC5815b.readBoolean(parcel, header);
                    break;
                case 58:
                    z15 = AbstractC5815b.readBoolean(parcel, header);
                    break;
                case 59:
                    z16 = AbstractC5815b.readBoolean(parcel, header);
                    break;
                case s7.x.FROZEN_SHIFT /* 60 */:
                    arrayListCreateStringList5 = AbstractC5815b.createStringList(parcel, header);
                    break;
                case s7.x.CLOSED_SHIFT /* 61 */:
                    strCreateString16 = AbstractC5815b.createString(parcel, header);
                    break;
                case androidx.core.text.b.FROM_HTML_MODE_COMPACT /* 63 */:
                    c3197im = (C3197im) AbstractC5815b.createParcelable(parcel, header, C3197im.CREATOR);
                    break;
                case 64:
                    strCreateString17 = AbstractC5815b.createString(parcel, header);
                    break;
                case 65:
                    bundleCreateBundle6 = AbstractC5815b.createBundle(parcel, header);
                    break;
            }
        }
        AbstractC5815b.ensureAtEnd(parcel, iValidateObjectHeader);
        return new C5141zq(i8, bundleCreateBundle, y12, d2Var, strCreateString, applicationInfo, packageInfo, strCreateString2, strCreateString3, strCreateString4, aVar, bundleCreateBundle2, i9, arrayListCreateStringList, bundleCreateBundle3, z8, i10, i11, f8, strCreateString5, j8, strCreateString6, arrayListCreateStringList2, strCreateString7, c1840Ri, arrayListCreateStringList3, j9, strCreateString8, f9, z9, i12, i13, z10, strCreateString9, strCreateString10, z11, i14, bundleCreateBundle4, strCreateString11, z02, z12, bundleCreateBundle5, strCreateString12, strCreateString13, strCreateString14, z13, arrayListCreateIntegerList, strCreateString15, arrayListCreateStringList4, i15, z14, z15, z16, arrayListCreateStringList5, strCreateString16, c3197im, strCreateString17, bundleCreateBundle6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zza(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C5141zq[i8];
    }
}
