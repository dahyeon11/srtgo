package com.kakao.sdk.auth.model;

import Q7.X;
import android.os.Parcel;
import android.os.Parcelable;
import com.kakao.sdk.common.model.ClientError;
import com.kakao.sdk.common.model.ClientErrorCause;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l7.r;

/* loaded from: classes.dex */
public final class OAuthToken implements Parcelable {
    private final String accessToken;
    private final Date accessTokenExpiresAt;
    private final String idToken;
    private final String refreshToken;
    private final Date refreshTokenExpiresAt;
    private final List<String> scopes;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<OAuthToken> CREATOR = new Creator();

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ OAuthToken fromResponse$default(Companion companion, AccessTokenResponse accessTokenResponse, OAuthToken oAuthToken, int i8, Object obj) {
            if ((i8 & 2) != 0) {
                oAuthToken = null;
            }
            return companion.fromResponse(accessTokenResponse, oAuthToken);
        }

        public final OAuthToken fromResponse(AccessTokenResponse response, OAuthToken oAuthToken) {
            Date refreshTokenExpiresAt;
            Intrinsics.checkNotNullParameter(response, "response");
            String accessToken = response.getAccessToken();
            Date date = new Date(new Date().getTime() + (response.getAccessTokenExpiresIn() * 1000));
            String refreshToken = response.getRefreshToken();
            if (refreshToken == null) {
                if (oAuthToken == null) {
                    throw new ClientError(ClientErrorCause.TokenNotFound, "Refresh token not found in the response.");
                }
                refreshToken = oAuthToken.getRefreshToken();
            }
            String str = refreshToken;
            if (response.getRefreshToken() != null) {
                Long refreshTokenExpiresIn = response.getRefreshTokenExpiresIn();
                refreshTokenExpiresAt = refreshTokenExpiresIn == null ? null : new Date(new Date().getTime() + (refreshTokenExpiresIn.longValue() * 1000));
                if (refreshTokenExpiresAt == null) {
                    refreshTokenExpiresAt = new Date();
                }
            } else {
                refreshTokenExpiresAt = oAuthToken == null ? null : oAuthToken.getRefreshTokenExpiresAt();
                Intrinsics.checkNotNull(refreshTokenExpiresAt);
            }
            Date date2 = refreshTokenExpiresAt;
            String scope = response.getScope();
            List<String> listSplit$default = scope == null ? null : r.split$default((CharSequence) scope, new String[]{X.SPACE}, false, 0, 6, (Object) null);
            return new OAuthToken(accessToken, date, str, date2, response.getIdToken(), listSplit$default == null ? oAuthToken == null ? null : oAuthToken.getScopes() : listSplit$default);
        }

        private Companion() {
        }
    }

    public static final class Creator implements Parcelable.Creator<OAuthToken> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OAuthToken createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OAuthToken(parcel.readString(), (Date) parcel.readSerializable(), parcel.readString(), (Date) parcel.readSerializable(), parcel.readString(), parcel.createStringArrayList());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OAuthToken[] newArray(int i8) {
            return new OAuthToken[i8];
        }
    }

    public OAuthToken(String accessToken, Date accessTokenExpiresAt, String refreshToken, Date refreshTokenExpiresAt, String str, List<String> list) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(accessTokenExpiresAt, "accessTokenExpiresAt");
        Intrinsics.checkNotNullParameter(refreshToken, "refreshToken");
        Intrinsics.checkNotNullParameter(refreshTokenExpiresAt, "refreshTokenExpiresAt");
        this.accessToken = accessToken;
        this.accessTokenExpiresAt = accessTokenExpiresAt;
        this.refreshToken = refreshToken;
        this.refreshTokenExpiresAt = refreshTokenExpiresAt;
        this.idToken = str;
        this.scopes = list;
    }

    public static /* synthetic */ OAuthToken copy$default(OAuthToken oAuthToken, String str, Date date, String str2, Date date2, String str3, List list, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = oAuthToken.accessToken;
        }
        if ((i8 & 2) != 0) {
            date = oAuthToken.accessTokenExpiresAt;
        }
        Date date3 = date;
        if ((i8 & 4) != 0) {
            str2 = oAuthToken.refreshToken;
        }
        String str4 = str2;
        if ((i8 & 8) != 0) {
            date2 = oAuthToken.refreshTokenExpiresAt;
        }
        Date date4 = date2;
        if ((i8 & 16) != 0) {
            str3 = oAuthToken.idToken;
        }
        String str5 = str3;
        if ((i8 & 32) != 0) {
            list = oAuthToken.scopes;
        }
        return oAuthToken.copy(str, date3, str4, date4, str5, list);
    }

    public final String component1() {
        return this.accessToken;
    }

    public final Date component2() {
        return this.accessTokenExpiresAt;
    }

    public final String component3() {
        return this.refreshToken;
    }

    public final Date component4() {
        return this.refreshTokenExpiresAt;
    }

    public final String component5() {
        return this.idToken;
    }

    public final List<String> component6() {
        return this.scopes;
    }

    public final OAuthToken copy(String accessToken, Date accessTokenExpiresAt, String refreshToken, Date refreshTokenExpiresAt, String str, List<String> list) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(accessTokenExpiresAt, "accessTokenExpiresAt");
        Intrinsics.checkNotNullParameter(refreshToken, "refreshToken");
        Intrinsics.checkNotNullParameter(refreshTokenExpiresAt, "refreshTokenExpiresAt");
        return new OAuthToken(accessToken, accessTokenExpiresAt, refreshToken, refreshTokenExpiresAt, str, list);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OAuthToken)) {
            return false;
        }
        OAuthToken oAuthToken = (OAuthToken) obj;
        return Intrinsics.areEqual(this.accessToken, oAuthToken.accessToken) && Intrinsics.areEqual(this.accessTokenExpiresAt, oAuthToken.accessTokenExpiresAt) && Intrinsics.areEqual(this.refreshToken, oAuthToken.refreshToken) && Intrinsics.areEqual(this.refreshTokenExpiresAt, oAuthToken.refreshTokenExpiresAt) && Intrinsics.areEqual(this.idToken, oAuthToken.idToken) && Intrinsics.areEqual(this.scopes, oAuthToken.scopes);
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final Date getAccessTokenExpiresAt() {
        return this.accessTokenExpiresAt;
    }

    public final String getIdToken() {
        return this.idToken;
    }

    public final String getRefreshToken() {
        return this.refreshToken;
    }

    public final Date getRefreshTokenExpiresAt() {
        return this.refreshTokenExpiresAt;
    }

    public final List<String> getScopes() {
        return this.scopes;
    }

    public int hashCode() {
        int iHashCode = ((((((this.accessToken.hashCode() * 31) + this.accessTokenExpiresAt.hashCode()) * 31) + this.refreshToken.hashCode()) * 31) + this.refreshTokenExpiresAt.hashCode()) * 31;
        String str = this.idToken;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.scopes;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "OAuthToken(accessToken=" + this.accessToken + ", accessTokenExpiresAt=" + this.accessTokenExpiresAt + ", refreshToken=" + this.refreshToken + ", refreshTokenExpiresAt=" + this.refreshTokenExpiresAt + ", idToken=" + ((Object) this.idToken) + ", scopes=" + this.scopes + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.accessToken);
        out.writeSerializable(this.accessTokenExpiresAt);
        out.writeString(this.refreshToken);
        out.writeSerializable(this.refreshTokenExpiresAt);
        out.writeString(this.idToken);
        out.writeStringList(this.scopes);
    }

    public /* synthetic */ OAuthToken(String str, Date date, String str2, Date date2, String str3, List list, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, date, str2, date2, (i8 & 16) != 0 ? null : str3, (i8 & 32) != 0 ? null : list);
    }
}
