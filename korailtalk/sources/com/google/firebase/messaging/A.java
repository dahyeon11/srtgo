package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import j2.AbstractC5815b;
import j2.AbstractC5816c;

/* loaded from: classes2.dex */
public class A implements Parcelable.Creator {
    public static final int CONTENT_DESCRIPTION = 0;

    static void a(z zVar, Parcel parcel, int i8) {
        int iBeginObjectHeader = AbstractC5816c.beginObjectHeader(parcel);
        AbstractC5816c.writeBundle(parcel, 2, zVar.f25822a, false);
        AbstractC5816c.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Override // android.os.Parcelable.Creator
    public z createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = AbstractC5815b.validateObjectHeader(parcel);
        Bundle bundleCreateBundle = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = AbstractC5815b.readHeader(parcel);
            if (AbstractC5815b.getFieldId(header) != 2) {
                AbstractC5815b.skipUnknownField(parcel, header);
            } else {
                bundleCreateBundle = AbstractC5815b.createBundle(parcel, header);
            }
        }
        AbstractC5815b.ensureAtEnd(parcel, iValidateObjectHeader);
        return new z(bundleCreateBundle);
    }

    @Override // android.os.Parcelable.Creator
    public z[] newArray(int i8) {
        return new z[i8];
    }
}
