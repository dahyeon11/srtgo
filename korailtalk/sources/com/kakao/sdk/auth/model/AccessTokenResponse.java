package com.kakao.sdk.auth.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.kakao.sdk.auth.Constants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import z3.InterfaceC6622c;

/* loaded from: classes.dex */
public final class AccessTokenResponse implements Parcelable {
    public static final Parcelable.Creator<AccessTokenResponse> CREATOR = new Creator();
    private final String accessToken;

    @InterfaceC6622c(Constants.EXPIRES_IN)
    private final long accessTokenExpiresIn;
    private final String idToken;
    private final String refreshToken;
    private final Long refreshTokenExpiresIn;
    private final String scope;
    private final String scopes;
    private final String tokenType;
    private final String txId;

    public static final class Creator implements Parcelable.Creator<AccessTokenResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccessTokenResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AccessTokenResponse(parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccessTokenResponse[] newArray(int i8) {
            return new AccessTokenResponse[i8];
        }
    }

    public AccessTokenResponse(String accessToken, String str, long j8, Long l8, String str2, String tokenType, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(tokenType, "tokenType");
        this.accessToken = accessToken;
        this.refreshToken = str;
        this.accessTokenExpiresIn = j8;
        this.refreshTokenExpiresIn = l8;
        this.idToken = str2;
        this.tokenType = tokenType;
        this.scope = str3;
        this.scopes = str4;
        this.txId = str5;
    }

    public static /* synthetic */ void getScopes$annotations() {
    }

    public final String component1() {
        return this.accessToken;
    }

    public final String component2() {
        return this.refreshToken;
    }

    public final long component3() {
        return this.accessTokenExpiresIn;
    }

    public final Long component4() {
        return this.refreshTokenExpiresIn;
    }

    public final String component5() {
        return this.idToken;
    }

    public final String component6() {
        return this.tokenType;
    }

    public final String component7() {
        return this.scope;
    }

    public final String component8() {
        return this.scopes;
    }

    public final String component9() {
        return this.txId;
    }

    public final AccessTokenResponse copy(String accessToken, String str, long j8, Long l8, String str2, String tokenType, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(tokenType, "tokenType");
        return new AccessTokenResponse(accessToken, str, j8, l8, str2, tokenType, str3, str4, str5);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccessTokenResponse)) {
            return false;
        }
        AccessTokenResponse accessTokenResponse = (AccessTokenResponse) obj;
        return Intrinsics.areEqual(this.accessToken, accessTokenResponse.accessToken) && Intrinsics.areEqual(this.refreshToken, accessTokenResponse.refreshToken) && this.accessTokenExpiresIn == accessTokenResponse.accessTokenExpiresIn && Intrinsics.areEqual(this.refreshTokenExpiresIn, accessTokenResponse.refreshTokenExpiresIn) && Intrinsics.areEqual(this.idToken, accessTokenResponse.idToken) && Intrinsics.areEqual(this.tokenType, accessTokenResponse.tokenType) && Intrinsics.areEqual(this.scope, accessTokenResponse.scope) && Intrinsics.areEqual(this.scopes, accessTokenResponse.scopes) && Intrinsics.areEqual(this.txId, accessTokenResponse.txId);
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final long getAccessTokenExpiresIn() {
        return this.accessTokenExpiresIn;
    }

    public final String getIdToken() {
        return this.idToken;
    }

    public final String getRefreshToken() {
        return this.refreshToken;
    }

    public final Long getRefreshTokenExpiresIn() {
        return this.refreshTokenExpiresIn;
    }

    public final String getScope() {
        return this.scope;
    }

    public final String getScopes() {
        return this.scopes;
    }

    public final String getTokenType() {
        return this.tokenType;
    }

    public final String getTxId() {
        return this.txId;
    }

    public int hashCode() {
        int iHashCode = this.accessToken.hashCode() * 31;
        String str = this.refreshToken;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Long.hashCode(this.accessTokenExpiresIn)) * 31;
        Long l8 = this.refreshTokenExpiresIn;
        int iHashCode3 = (iHashCode2 + (l8 == null ? 0 : l8.hashCode())) * 31;
        String str2 = this.idToken;
        int iHashCode4 = (((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.tokenType.hashCode()) * 31;
        String str3 = this.scope;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.scopes;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.txId;
        return iHashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        return "AccessTokenResponse(accessToken=" + this.accessToken + ", refreshToken=" + ((Object) this.refreshToken) + ", accessTokenExpiresIn=" + this.accessTokenExpiresIn + ", refreshTokenExpiresIn=" + this.refreshTokenExpiresIn + ", idToken=" + ((Object) this.idToken) + ", tokenType=" + this.tokenType + ", scope=" + ((Object) this.scope) + ", scopes=" + ((Object) this.scopes) + ", txId=" + ((Object) this.txId) + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.accessToken);
        out.writeString(this.refreshToken);
        out.writeLong(this.accessTokenExpiresIn);
        Long l8 = this.refreshTokenExpiresIn;
        if (l8 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeLong(l8.longValue());
        }
        out.writeString(this.idToken);
        out.writeString(this.tokenType);
        out.writeString(this.scope);
        out.writeString(this.scopes);
        out.writeString(this.txId);
    }

    public /* synthetic */ AccessTokenResponse(String str, String str2, long j8, Long l8, String str3, String str4, String str5, String str6, String str7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i8 & 2) != 0 ? null : str2, j8, (i8 & 8) != 0 ? null : l8, (i8 & 16) != 0 ? null : str3, str4, (i8 & 64) != 0 ? null : str5, (i8 & 128) != 0 ? null : str6, (i8 & 256) != 0 ? null : str7);
    }
}
