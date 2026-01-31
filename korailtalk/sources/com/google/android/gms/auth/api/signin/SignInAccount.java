package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import i2.AbstractC5683p;
import j2.AbstractC5814a;
import j2.AbstractC5816c;

/* loaded from: classes.dex */
public class SignInAccount extends AbstractC5814a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new g();

    /* renamed from: a, reason: collision with root package name */
    private String f11829a;

    /* renamed from: b, reason: collision with root package name */
    private GoogleSignInAccount f11830b;

    /* renamed from: c, reason: collision with root package name */
    private String f11831c;

    SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.f11830b = googleSignInAccount;
        this.f11829a = AbstractC5683p.checkNotEmpty(str, "8.3 and 8.4 SDKs require non-null email");
        this.f11831c = AbstractC5683p.checkNotEmpty(str2, "8.3 and 8.4 SDKs require non-null userId");
    }

    public final GoogleSignInAccount getGoogleSignInAccount() {
        return this.f11830b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int iBeginObjectHeader = AbstractC5816c.beginObjectHeader(parcel);
        AbstractC5816c.writeString(parcel, 4, this.f11829a, false);
        AbstractC5816c.writeParcelable(parcel, 7, this.f11830b, i8, false);
        AbstractC5816c.writeString(parcel, 8, this.f11831c, false);
        AbstractC5816c.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
