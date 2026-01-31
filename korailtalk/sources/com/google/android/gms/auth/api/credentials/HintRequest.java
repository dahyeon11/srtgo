package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import i2.AbstractC5683p;
import j2.AbstractC5814a;
import j2.AbstractC5816c;

/* loaded from: classes.dex */
public final class HintRequest extends AbstractC5814a implements ReflectedParcelable {
    public static final Parcelable.Creator<HintRequest> CREATOR = new f();

    /* renamed from: a, reason: collision with root package name */
    private final int f11776a;

    /* renamed from: b, reason: collision with root package name */
    private final CredentialPickerConfig f11777b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f11778c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f11779d;

    /* renamed from: e, reason: collision with root package name */
    private final String[] f11780e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f11781f;

    /* renamed from: g, reason: collision with root package name */
    private final String f11782g;

    /* renamed from: h, reason: collision with root package name */
    private final String f11783h;

    HintRequest(int i8, CredentialPickerConfig credentialPickerConfig, boolean z8, boolean z9, String[] strArr, boolean z10, String str, String str2) {
        this.f11776a = i8;
        this.f11777b = (CredentialPickerConfig) AbstractC5683p.checkNotNull(credentialPickerConfig);
        this.f11778c = z8;
        this.f11779d = z9;
        this.f11780e = (String[]) AbstractC5683p.checkNotNull(strArr);
        if (i8 < 2) {
            this.f11781f = true;
            this.f11782g = null;
            this.f11783h = null;
        } else {
            this.f11781f = z10;
            this.f11782g = str;
            this.f11783h = str2;
        }
    }

    public final String[] getAccountTypes() {
        return this.f11780e;
    }

    public final CredentialPickerConfig getHintPickerConfig() {
        return this.f11777b;
    }

    public final String getIdTokenNonce() {
        return this.f11783h;
    }

    public final String getServerClientId() {
        return this.f11782g;
    }

    public final boolean isEmailAddressIdentifierSupported() {
        return this.f11778c;
    }

    public final boolean isIdTokenRequested() {
        return this.f11781f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iBeginObjectHeader = AbstractC5816c.beginObjectHeader(parcel);
        AbstractC5816c.writeParcelable(parcel, 1, getHintPickerConfig(), i8, false);
        AbstractC5816c.writeBoolean(parcel, 2, isEmailAddressIdentifierSupported());
        AbstractC5816c.writeBoolean(parcel, 3, this.f11779d);
        AbstractC5816c.writeStringArray(parcel, 4, getAccountTypes(), false);
        AbstractC5816c.writeBoolean(parcel, 5, isIdTokenRequested());
        AbstractC5816c.writeString(parcel, 6, getServerClientId(), false);
        AbstractC5816c.writeString(parcel, 7, getIdTokenNonce(), false);
        AbstractC5816c.writeInt(parcel, 1000, this.f11776a);
        AbstractC5816c.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
