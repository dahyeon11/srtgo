package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import j2.AbstractC5815b;

/* renamed from: com.google.android.gms.internal.ads.Si, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1881Si implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = AbstractC5815b.validateObjectHeader(parcel);
        int i8 = 0;
        boolean z8 = false;
        int i9 = 0;
        boolean z9 = false;
        int i10 = 0;
        boolean z10 = false;
        int i11 = 0;
        int i12 = 0;
        boolean z11 = false;
        int i13 = 0;
        H1.R1 r12 = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = AbstractC5815b.readHeader(parcel);
            switch (AbstractC5815b.getFieldId(header)) {
                case 1:
                    i8 = AbstractC5815b.readInt(parcel, header);
                    break;
                case 2:
                    z8 = AbstractC5815b.readBoolean(parcel, header);
                    break;
                case 3:
                    i9 = AbstractC5815b.readInt(parcel, header);
                    break;
                case 4:
                    z9 = AbstractC5815b.readBoolean(parcel, header);
                    break;
                case 5:
                    i10 = AbstractC5815b.readInt(parcel, header);
                    break;
                case 6:
                    r12 = (H1.R1) AbstractC5815b.createParcelable(parcel, header, H1.R1.CREATOR);
                    break;
                case 7:
                    z10 = AbstractC5815b.readBoolean(parcel, header);
                    break;
                case 8:
                    i11 = AbstractC5815b.readInt(parcel, header);
                    break;
                case 9:
                    i12 = AbstractC5815b.readInt(parcel, header);
                    break;
                case 10:
                    z11 = AbstractC5815b.readBoolean(parcel, header);
                    break;
                case 11:
                    i13 = AbstractC5815b.readInt(parcel, header);
                    break;
                default:
                    AbstractC5815b.skipUnknownField(parcel, header);
                    break;
            }
        }
        AbstractC5815b.ensureAtEnd(parcel, iValidateObjectHeader);
        return new C1840Ri(i8, z8, i9, z9, i10, r12, z10, i11, i12, z11, i13);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C1840Ri[i8];
    }
}
