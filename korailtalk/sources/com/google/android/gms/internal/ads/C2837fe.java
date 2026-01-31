package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import j2.AbstractC5815b;

/* renamed from: com.google.android.gms.internal.ads.fe, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2837fe implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = AbstractC5815b.validateObjectHeader(parcel);
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        long j8 = 0;
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = AbstractC5815b.readHeader(parcel);
            int fieldId = AbstractC5815b.getFieldId(header);
            if (fieldId == 2) {
                parcelFileDescriptor = (ParcelFileDescriptor) AbstractC5815b.createParcelable(parcel, header, ParcelFileDescriptor.CREATOR);
            } else if (fieldId == 3) {
                z8 = AbstractC5815b.readBoolean(parcel, header);
            } else if (fieldId == 4) {
                z9 = AbstractC5815b.readBoolean(parcel, header);
            } else if (fieldId == 5) {
                j8 = AbstractC5815b.readLong(parcel, header);
            } else if (fieldId != 6) {
                AbstractC5815b.skipUnknownField(parcel, header);
            } else {
                z10 = AbstractC5815b.readBoolean(parcel, header);
            }
        }
        AbstractC5815b.ensureAtEnd(parcel, iValidateObjectHeader);
        return new C2722ee(parcelFileDescriptor, z8, z9, j8, z10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C2722ee[i8];
    }
}
