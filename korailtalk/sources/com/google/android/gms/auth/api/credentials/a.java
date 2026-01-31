package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import i2.AbstractC5683p;
import j2.AbstractC5814a;
import j2.AbstractC5816c;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class a extends AbstractC5814a {
    public static final Parcelable.Creator<a> CREATOR = new e();

    /* renamed from: a, reason: collision with root package name */
    private final int f11786a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f11787b;

    /* renamed from: c, reason: collision with root package name */
    private final String[] f11788c;

    /* renamed from: d, reason: collision with root package name */
    private final CredentialPickerConfig f11789d;

    /* renamed from: e, reason: collision with root package name */
    private final CredentialPickerConfig f11790e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f11791f;

    /* renamed from: g, reason: collision with root package name */
    private final String f11792g;

    /* renamed from: h, reason: collision with root package name */
    private final String f11793h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f11794i;

    a(int i8, boolean z8, String[] strArr, CredentialPickerConfig credentialPickerConfig, CredentialPickerConfig credentialPickerConfig2, boolean z9, String str, String str2, boolean z10) {
        this.f11786a = i8;
        this.f11787b = z8;
        this.f11788c = (String[]) AbstractC5683p.checkNotNull(strArr);
        this.f11789d = credentialPickerConfig == null ? new CredentialPickerConfig.a().build() : credentialPickerConfig;
        this.f11790e = credentialPickerConfig2 == null ? new CredentialPickerConfig.a().build() : credentialPickerConfig2;
        if (i8 < 3) {
            this.f11791f = true;
            this.f11792g = null;
            this.f11793h = null;
        } else {
            this.f11791f = z9;
            this.f11792g = str;
            this.f11793h = str2;
        }
        this.f11794i = z10;
    }

    public final String[] getAccountTypes() {
        return this.f11788c;
    }

    public final Set<String> getAccountTypesSet() {
        return new HashSet(Arrays.asList(this.f11788c));
    }

    public final CredentialPickerConfig getCredentialHintPickerConfig() {
        return this.f11790e;
    }

    public final CredentialPickerConfig getCredentialPickerConfig() {
        return this.f11789d;
    }

    public final String getIdTokenNonce() {
        return this.f11793h;
    }

    public final String getServerClientId() {
        return this.f11792g;
    }

    @Deprecated
    public final boolean getSupportsPasswordLogin() {
        return isPasswordLoginSupported();
    }

    public final boolean isIdTokenRequested() {
        return this.f11791f;
    }

    public final boolean isPasswordLoginSupported() {
        return this.f11787b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iBeginObjectHeader = AbstractC5816c.beginObjectHeader(parcel);
        AbstractC5816c.writeBoolean(parcel, 1, isPasswordLoginSupported());
        AbstractC5816c.writeStringArray(parcel, 2, getAccountTypes(), false);
        AbstractC5816c.writeParcelable(parcel, 3, getCredentialPickerConfig(), i8, false);
        AbstractC5816c.writeParcelable(parcel, 4, getCredentialHintPickerConfig(), i8, false);
        AbstractC5816c.writeBoolean(parcel, 5, isIdTokenRequested());
        AbstractC5816c.writeString(parcel, 6, getServerClientId(), false);
        AbstractC5816c.writeString(parcel, 7, getIdTokenNonce(), false);
        AbstractC5816c.writeBoolean(parcel, 8, this.f11794i);
        AbstractC5816c.writeInt(parcel, 1000, this.f11786a);
        AbstractC5816c.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
