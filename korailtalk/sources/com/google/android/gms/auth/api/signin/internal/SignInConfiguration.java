package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import c2.b;
import c2.z;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import i2.AbstractC5683p;
import j2.AbstractC5814a;
import j2.AbstractC5816c;

/* loaded from: classes.dex */
public final class SignInConfiguration extends AbstractC5814a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new z();

    /* renamed from: a, reason: collision with root package name */
    private final String f11836a;

    /* renamed from: b, reason: collision with root package name */
    private GoogleSignInOptions f11837b;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        this.f11836a = AbstractC5683p.checkNotEmpty(str);
        this.f11837b = googleSignInOptions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.f11836a.equals(signInConfiguration.f11836a)) {
            GoogleSignInOptions googleSignInOptions = this.f11837b;
            if (googleSignInOptions == null) {
                if (signInConfiguration.f11837b == null) {
                    return true;
                }
            } else if (googleSignInOptions.equals(signInConfiguration.f11837b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return new b().addObject(this.f11836a).addObject(this.f11837b).hash();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iBeginObjectHeader = AbstractC5816c.beginObjectHeader(parcel);
        AbstractC5816c.writeString(parcel, 2, this.f11836a, false);
        AbstractC5816c.writeParcelable(parcel, 5, this.f11837b, i8, false);
        AbstractC5816c.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final GoogleSignInOptions zzu() {
        return this.f11837b;
    }
}
