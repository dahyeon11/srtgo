package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.kakao.sdk.user.Constants;
import i2.AbstractC5683p;
import j2.AbstractC5814a;
import j2.AbstractC5816c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import o2.i;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class GoogleSignInAccount extends AbstractC5814a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new c();

    @VisibleForTesting
    public static o2.f zaa = i.getInstance();

    /* renamed from: a */
    final int f11795a;

    /* renamed from: b */
    private String f11796b;

    /* renamed from: c */
    private String f11797c;

    /* renamed from: d */
    private String f11798d;

    /* renamed from: e */
    private String f11799e;

    /* renamed from: f */
    private Uri f11800f;

    /* renamed from: g */
    private String f11801g;

    /* renamed from: h */
    private long f11802h;

    /* renamed from: i */
    private String f11803i;

    /* renamed from: j */
    List f11804j;

    /* renamed from: k */
    private String f11805k;

    /* renamed from: l */
    private String f11806l;

    /* renamed from: m */
    private Set f11807m = new HashSet();

    GoogleSignInAccount(int i8, String str, String str2, String str3, String str4, Uri uri, String str5, long j8, String str6, List list, String str7, String str8) {
        this.f11795a = i8;
        this.f11796b = str;
        this.f11797c = str2;
        this.f11798d = str3;
        this.f11799e = str4;
        this.f11800f = uri;
        this.f11801g = str5;
        this.f11802h = j8;
        this.f11803i = str6;
        this.f11804j = list;
        this.f11805k = str7;
        this.f11806l = str8;
    }

    private static GoogleSignInAccount b(Account account, Set set) {
        return zaa(null, null, account.name, null, null, null, null, 0L, account.name, set);
    }

    public static GoogleSignInAccount createDefault() {
        return b(new Account("<<default account>>", "com.google"), new HashSet());
    }

    public static GoogleSignInAccount fromAccount(Account account) {
        return b(account, new O.b());
    }

    public static GoogleSignInAccount zaa(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l8, String str7, Set<Scope> set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, l8.longValue(), AbstractC5683p.checkNotEmpty(str7), new ArrayList((Collection) AbstractC5683p.checkNotNull(set)), str5, str6);
    }

    public static GoogleSignInAccount zab(String str) throws JSONException, NumberFormatException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j8 = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i8 = 0; i8 < length; i8++) {
            hashSet.add(new Scope(jSONArray.getString(i8)));
        }
        GoogleSignInAccount googleSignInAccountZaa = zaa(jSONObject.optString(Constants.ID), jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null, jSONObject.has("email") ? jSONObject.optString("email") : null, jSONObject.has("displayName") ? jSONObject.optString("displayName") : null, jSONObject.has("givenName") ? jSONObject.optString("givenName") : null, jSONObject.has("familyName") ? jSONObject.optString("familyName") : null, uri, Long.valueOf(j8), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        googleSignInAccountZaa.f11801g = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccountZaa;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f11803i.equals(this.f11803i) && googleSignInAccount.getRequestedScopes().equals(getRequestedScopes());
    }

    public Account getAccount() {
        String str = this.f11798d;
        if (str == null) {
            return null;
        }
        return new Account(str, "com.google");
    }

    public String getDisplayName() {
        return this.f11799e;
    }

    public String getEmail() {
        return this.f11798d;
    }

    public String getFamilyName() {
        return this.f11806l;
    }

    public String getGivenName() {
        return this.f11805k;
    }

    public Set<Scope> getGrantedScopes() {
        return new HashSet(this.f11804j);
    }

    public String getId() {
        return this.f11796b;
    }

    public String getIdToken() {
        return this.f11797c;
    }

    public Uri getPhotoUrl() {
        return this.f11800f;
    }

    public Set<Scope> getRequestedScopes() {
        HashSet hashSet = new HashSet(this.f11804j);
        hashSet.addAll(this.f11807m);
        return hashSet;
    }

    public String getServerAuthCode() {
        return this.f11801g;
    }

    public int hashCode() {
        return ((this.f11803i.hashCode() + 527) * 31) + getRequestedScopes().hashCode();
    }

    public boolean isExpired() {
        return zaa.currentTimeMillis() / 1000 >= this.f11802h + (-300);
    }

    public GoogleSignInAccount requestExtraScopes(Scope... scopeArr) {
        if (scopeArr != null) {
            Collections.addAll(this.f11807m, scopeArr);
        }
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int iBeginObjectHeader = AbstractC5816c.beginObjectHeader(parcel);
        AbstractC5816c.writeInt(parcel, 1, this.f11795a);
        AbstractC5816c.writeString(parcel, 2, getId(), false);
        AbstractC5816c.writeString(parcel, 3, getIdToken(), false);
        AbstractC5816c.writeString(parcel, 4, getEmail(), false);
        AbstractC5816c.writeString(parcel, 5, getDisplayName(), false);
        AbstractC5816c.writeParcelable(parcel, 6, getPhotoUrl(), i8, false);
        AbstractC5816c.writeString(parcel, 7, getServerAuthCode(), false);
        AbstractC5816c.writeLong(parcel, 8, this.f11802h);
        AbstractC5816c.writeString(parcel, 9, this.f11803i, false);
        AbstractC5816c.writeTypedList(parcel, 10, this.f11804j, false);
        AbstractC5816c.writeString(parcel, 11, getGivenName(), false);
        AbstractC5816c.writeString(parcel, 12, getFamilyName(), false);
        AbstractC5816c.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final String zac() {
        return this.f11803i;
    }

    public final String zad() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            if (getId() != null) {
                jSONObject.put(Constants.ID, getId());
            }
            if (getIdToken() != null) {
                jSONObject.put("tokenId", getIdToken());
            }
            if (getEmail() != null) {
                jSONObject.put("email", getEmail());
            }
            if (getDisplayName() != null) {
                jSONObject.put("displayName", getDisplayName());
            }
            if (getGivenName() != null) {
                jSONObject.put("givenName", getGivenName());
            }
            if (getFamilyName() != null) {
                jSONObject.put("familyName", getFamilyName());
            }
            Uri photoUrl = getPhotoUrl();
            if (photoUrl != null) {
                jSONObject.put("photoUrl", photoUrl.toString());
            }
            if (getServerAuthCode() != null) {
                jSONObject.put("serverAuthCode", getServerAuthCode());
            }
            jSONObject.put("expirationTime", this.f11802h);
            jSONObject.put("obfuscatedIdentifier", this.f11803i);
            JSONArray jSONArray = new JSONArray();
            List list = this.f11804j;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, new Comparator() { // from class: b2.d
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    Parcelable.Creator<GoogleSignInAccount> creator = GoogleSignInAccount.CREATOR;
                    return ((Scope) obj).getScopeUri().compareTo(((Scope) obj2).getScopeUri());
                }
            });
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.getScopeUri());
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            return jSONObject.toString();
        } catch (JSONException e8) {
            throw new RuntimeException(e8);
        }
    }
}
