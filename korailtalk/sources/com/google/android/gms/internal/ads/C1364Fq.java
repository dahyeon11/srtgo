package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import j2.AbstractC5815b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.Fq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1364Fq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = AbstractC5815b.validateObjectHeader(parcel);
        ArrayList<String> arrayListCreateStringList = null;
        boolean z8 = false;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = AbstractC5815b.readHeader(parcel);
            int fieldId = AbstractC5815b.getFieldId(header);
            if (fieldId == 2) {
                z8 = AbstractC5815b.readBoolean(parcel, header);
            } else if (fieldId != 3) {
                AbstractC5815b.skipUnknownField(parcel, header);
            } else {
                arrayListCreateStringList = AbstractC5815b.createStringList(parcel, header);
            }
        }
        AbstractC5815b.ensureAtEnd(parcel, iValidateObjectHeader);
        return new C1323Eq(z8, arrayListCreateStringList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C1323Eq[i8];
    }
}
