package com.google.android.gms.ads.internal.overlay;

import G1.k;
import J1.j;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.constraintlayout.widget.ConstraintLayout;
import j2.AbstractC5815b;

/* loaded from: classes.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = AbstractC5815b.validateObjectHeader(parcel);
        boolean z8 = false;
        int i8 = 0;
        int i9 = 0;
        boolean z9 = false;
        j jVar = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        IBinder iBinder4 = null;
        String strCreateString = null;
        String strCreateString2 = null;
        IBinder iBinder5 = null;
        String strCreateString3 = null;
        L1.a aVar = null;
        String strCreateString4 = null;
        k kVar = null;
        IBinder iBinder6 = null;
        String strCreateString5 = null;
        String strCreateString6 = null;
        String strCreateString7 = null;
        IBinder iBinder7 = null;
        IBinder iBinder8 = null;
        IBinder iBinder9 = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = AbstractC5815b.readHeader(parcel);
            switch (AbstractC5815b.getFieldId(header)) {
                case 2:
                    jVar = (j) AbstractC5815b.createParcelable(parcel, header, j.CREATOR);
                    break;
                case 3:
                    iBinder = AbstractC5815b.readIBinder(parcel, header);
                    break;
                case 4:
                    iBinder2 = AbstractC5815b.readIBinder(parcel, header);
                    break;
                case 5:
                    iBinder3 = AbstractC5815b.readIBinder(parcel, header);
                    break;
                case 6:
                    iBinder4 = AbstractC5815b.readIBinder(parcel, header);
                    break;
                case 7:
                    strCreateString = AbstractC5815b.createString(parcel, header);
                    break;
                case 8:
                    z8 = AbstractC5815b.readBoolean(parcel, header);
                    break;
                case 9:
                    strCreateString2 = AbstractC5815b.createString(parcel, header);
                    break;
                case 10:
                    iBinder5 = AbstractC5815b.readIBinder(parcel, header);
                    break;
                case 11:
                    i8 = AbstractC5815b.readInt(parcel, header);
                    break;
                case 12:
                    i9 = AbstractC5815b.readInt(parcel, header);
                    break;
                case 13:
                    strCreateString3 = AbstractC5815b.createString(parcel, header);
                    break;
                case 14:
                    aVar = (L1.a) AbstractC5815b.createParcelable(parcel, header, L1.a.CREATOR);
                    break;
                case 15:
                case 20:
                case 21:
                case 22:
                case 23:
                default:
                    AbstractC5815b.skipUnknownField(parcel, header);
                    break;
                case 16:
                    strCreateString4 = AbstractC5815b.createString(parcel, header);
                    break;
                case 17:
                    kVar = (k) AbstractC5815b.createParcelable(parcel, header, k.CREATOR);
                    break;
                case 18:
                    iBinder6 = AbstractC5815b.readIBinder(parcel, header);
                    break;
                case 19:
                    strCreateString5 = AbstractC5815b.createString(parcel, header);
                    break;
                case 24:
                    strCreateString6 = AbstractC5815b.createString(parcel, header);
                    break;
                case 25:
                    strCreateString7 = AbstractC5815b.createString(parcel, header);
                    break;
                case 26:
                    iBinder7 = AbstractC5815b.readIBinder(parcel, header);
                    break;
                case 27:
                    iBinder8 = AbstractC5815b.readIBinder(parcel, header);
                    break;
                case 28:
                    iBinder9 = AbstractC5815b.readIBinder(parcel, header);
                    break;
                case ConstraintLayout.b.a.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                    z9 = AbstractC5815b.readBoolean(parcel, header);
                    break;
            }
        }
        AbstractC5815b.ensureAtEnd(parcel, iValidateObjectHeader);
        return new AdOverlayInfoParcel(jVar, iBinder, iBinder2, iBinder3, iBinder4, strCreateString, z8, strCreateString2, iBinder5, i8, i9, strCreateString3, aVar, strCreateString4, kVar, iBinder6, strCreateString5, strCreateString6, strCreateString7, iBinder7, iBinder8, iBinder9, z9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new AdOverlayInfoParcel[i8];
    }
}
