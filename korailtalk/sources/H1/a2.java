package H1;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import j2.AbstractC5815b;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = AbstractC5815b.validateObjectHeader(parcel);
        long j8 = 0;
        long j9 = 0;
        int i8 = 0;
        int i9 = 0;
        boolean z8 = false;
        int i10 = 0;
        boolean z9 = false;
        boolean z10 = false;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        Bundle bundleCreateBundle = null;
        ArrayList<String> arrayListCreateStringList = null;
        String strCreateString = null;
        O1 o12 = null;
        Location location = null;
        String strCreateString2 = null;
        Bundle bundleCreateBundle2 = null;
        Bundle bundleCreateBundle3 = null;
        ArrayList<String> arrayListCreateStringList2 = null;
        String strCreateString3 = null;
        String strCreateString4 = null;
        C0527d0 c0527d0 = null;
        String strCreateString5 = null;
        ArrayList<String> arrayListCreateStringList3 = null;
        String strCreateString6 = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = AbstractC5815b.readHeader(parcel);
            switch (AbstractC5815b.getFieldId(header)) {
                case 1:
                    i8 = AbstractC5815b.readInt(parcel, header);
                    break;
                case 2:
                    j8 = AbstractC5815b.readLong(parcel, header);
                    break;
                case 3:
                    bundleCreateBundle = AbstractC5815b.createBundle(parcel, header);
                    break;
                case 4:
                    i9 = AbstractC5815b.readInt(parcel, header);
                    break;
                case 5:
                    arrayListCreateStringList = AbstractC5815b.createStringList(parcel, header);
                    break;
                case 6:
                    z8 = AbstractC5815b.readBoolean(parcel, header);
                    break;
                case 7:
                    i10 = AbstractC5815b.readInt(parcel, header);
                    break;
                case 8:
                    z9 = AbstractC5815b.readBoolean(parcel, header);
                    break;
                case 9:
                    strCreateString = AbstractC5815b.createString(parcel, header);
                    break;
                case 10:
                    o12 = (O1) AbstractC5815b.createParcelable(parcel, header, O1.CREATOR);
                    break;
                case 11:
                    location = (Location) AbstractC5815b.createParcelable(parcel, header, Location.CREATOR);
                    break;
                case 12:
                    strCreateString2 = AbstractC5815b.createString(parcel, header);
                    break;
                case 13:
                    bundleCreateBundle2 = AbstractC5815b.createBundle(parcel, header);
                    break;
                case 14:
                    bundleCreateBundle3 = AbstractC5815b.createBundle(parcel, header);
                    break;
                case 15:
                    arrayListCreateStringList2 = AbstractC5815b.createStringList(parcel, header);
                    break;
                case 16:
                    strCreateString3 = AbstractC5815b.createString(parcel, header);
                    break;
                case 17:
                    strCreateString4 = AbstractC5815b.createString(parcel, header);
                    break;
                case 18:
                    z10 = AbstractC5815b.readBoolean(parcel, header);
                    break;
                case 19:
                    c0527d0 = (C0527d0) AbstractC5815b.createParcelable(parcel, header, C0527d0.CREATOR);
                    break;
                case 20:
                    i11 = AbstractC5815b.readInt(parcel, header);
                    break;
                case 21:
                    strCreateString5 = AbstractC5815b.createString(parcel, header);
                    break;
                case 22:
                    arrayListCreateStringList3 = AbstractC5815b.createStringList(parcel, header);
                    break;
                case 23:
                    i12 = AbstractC5815b.readInt(parcel, header);
                    break;
                case 24:
                    strCreateString6 = AbstractC5815b.createString(parcel, header);
                    break;
                case 25:
                    i13 = AbstractC5815b.readInt(parcel, header);
                    break;
                case 26:
                    j9 = AbstractC5815b.readLong(parcel, header);
                    break;
                default:
                    AbstractC5815b.skipUnknownField(parcel, header);
                    break;
            }
        }
        AbstractC5815b.ensureAtEnd(parcel, iValidateObjectHeader);
        return new Y1(i8, j8, bundleCreateBundle, i9, arrayListCreateStringList, z8, i10, z9, strCreateString, o12, location, strCreateString2, bundleCreateBundle2, bundleCreateBundle3, arrayListCreateStringList2, strCreateString3, strCreateString4, z10, c0527d0, i11, strCreateString5, arrayListCreateStringList3, i12, strCreateString6, i13, j9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new Y1[i8];
    }
}
