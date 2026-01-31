package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import i2.AbstractC5681n;
import i2.AbstractC5683p;
import j2.AbstractC5814a;
import j2.AbstractC5816c;

/* loaded from: classes.dex */
public final class IdToken extends AbstractC5814a implements ReflectedParcelable {
    public static final Parcelable.Creator<IdToken> CREATOR = new Z1.c();

    /* renamed from: a, reason: collision with root package name */
    private final String f11784a;

    /* renamed from: b, reason: collision with root package name */
    private final String f11785b;

    public IdToken(String str, String str2) {
        AbstractC5683p.checkArgument(!TextUtils.isEmpty(str), "account type string cannot be null or empty");
        AbstractC5683p.checkArgument(!TextUtils.isEmpty(str2), "id token string cannot be null or empty");
        this.f11784a = str;
        this.f11785b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdToken)) {
            return false;
        }
        IdToken idToken = (IdToken) obj;
        return AbstractC5681n.equal(this.f11784a, idToken.f11784a) && AbstractC5681n.equal(this.f11785b, idToken.f11785b);
    }

    public final String getAccountType() {
        return this.f11784a;
    }

    public final String getIdToken() {
        return this.f11785b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iBeginObjectHeader = AbstractC5816c.beginObjectHeader(parcel);
        AbstractC5816c.writeString(parcel, 1, getAccountType(), false);
        AbstractC5816c.writeString(parcel, 2, getIdToken(), false);
        AbstractC5816c.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
