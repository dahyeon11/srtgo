package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.kakao.sdk.common.Constants;
import i2.AbstractC5681n;
import i2.AbstractC5683p;
import j2.AbstractC5814a;
import j2.AbstractC5816c;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class Credential extends AbstractC5814a implements ReflectedParcelable {
    public static final Parcelable.Creator<Credential> CREATOR = new b();
    public static final String EXTRA_KEY = "com.google.android.gms.credentials.Credential";

    /* renamed from: a */
    private final String f11760a;

    /* renamed from: b */
    private final String f11761b;

    /* renamed from: c */
    private final Uri f11762c;

    /* renamed from: d */
    private final List f11763d;

    /* renamed from: e */
    private final String f11764e;

    /* renamed from: f */
    private final String f11765f;

    /* renamed from: g */
    private final String f11766g;

    /* renamed from: h */
    private final String f11767h;

    Credential(String str, String str2, Uri uri, List list, String str3, String str4, String str5, String str6) {
        String strTrim = ((String) AbstractC5683p.checkNotNull(str, "credential identifier cannot be null")).trim();
        AbstractC5683p.checkNotEmpty(strTrim, "credential identifier cannot be empty");
        if (str3 != null && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Password must not be empty if set");
        }
        if (str4 != null) {
            boolean z8 = false;
            if (!TextUtils.isEmpty(str4)) {
                Uri uri2 = Uri.parse(str4);
                if (uri2.isAbsolute() && uri2.isHierarchical() && !TextUtils.isEmpty(uri2.getScheme()) && !TextUtils.isEmpty(uri2.getAuthority()) && ("http".equalsIgnoreCase(uri2.getScheme()) || Constants.SCHEME.equalsIgnoreCase(uri2.getScheme()))) {
                    z8 = true;
                }
            }
            if (!z8) {
                throw new IllegalArgumentException("Account type must be a valid Http/Https URI");
            }
        }
        if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Password and AccountType are mutually exclusive");
        }
        if (str2 != null && TextUtils.isEmpty(str2.trim())) {
            str2 = null;
        }
        this.f11761b = str2;
        this.f11762c = uri;
        this.f11763d = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.f11760a = strTrim;
        this.f11764e = str3;
        this.f11765f = str4;
        this.f11766g = str5;
        this.f11767h = str6;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Credential)) {
            return false;
        }
        Credential credential = (Credential) obj;
        return TextUtils.equals(this.f11760a, credential.f11760a) && TextUtils.equals(this.f11761b, credential.f11761b) && AbstractC5681n.equal(this.f11762c, credential.f11762c) && TextUtils.equals(this.f11764e, credential.f11764e) && TextUtils.equals(this.f11765f, credential.f11765f);
    }

    public String getAccountType() {
        return this.f11765f;
    }

    public String getFamilyName() {
        return this.f11767h;
    }

    public String getGivenName() {
        return this.f11766g;
    }

    public String getId() {
        return this.f11760a;
    }

    public List<IdToken> getIdTokens() {
        return this.f11763d;
    }

    public String getName() {
        return this.f11761b;
    }

    public String getPassword() {
        return this.f11764e;
    }

    public Uri getProfilePictureUri() {
        return this.f11762c;
    }

    public int hashCode() {
        return AbstractC5681n.hashCode(this.f11760a, this.f11761b, this.f11762c, this.f11764e, this.f11765f);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int iBeginObjectHeader = AbstractC5816c.beginObjectHeader(parcel);
        AbstractC5816c.writeString(parcel, 1, getId(), false);
        AbstractC5816c.writeString(parcel, 2, getName(), false);
        AbstractC5816c.writeParcelable(parcel, 3, getProfilePictureUri(), i8, false);
        AbstractC5816c.writeTypedList(parcel, 4, getIdTokens(), false);
        AbstractC5816c.writeString(parcel, 5, getPassword(), false);
        AbstractC5816c.writeString(parcel, 6, getAccountType(), false);
        AbstractC5816c.writeString(parcel, 9, getGivenName(), false);
        AbstractC5816c.writeString(parcel, 10, getFamilyName(), false);
        AbstractC5816c.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
