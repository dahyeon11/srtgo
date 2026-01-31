package com.kakao.sdk.auth.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class CertTokenInfo implements Parcelable {
    public static final Parcelable.Creator<CertTokenInfo> CREATOR = new Creator();
    private final OAuthToken token;
    private final String txId;

    public static final class Creator implements Parcelable.Creator<CertTokenInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CertTokenInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CertTokenInfo(OAuthToken.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CertTokenInfo[] newArray(int i8) {
            return new CertTokenInfo[i8];
        }
    }

    public CertTokenInfo(OAuthToken token, String txId) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(txId, "txId");
        this.token = token;
        this.txId = txId;
    }

    public static /* synthetic */ CertTokenInfo copy$default(CertTokenInfo certTokenInfo, OAuthToken oAuthToken, String str, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            oAuthToken = certTokenInfo.token;
        }
        if ((i8 & 2) != 0) {
            str = certTokenInfo.txId;
        }
        return certTokenInfo.copy(oAuthToken, str);
    }

    public final OAuthToken component1() {
        return this.token;
    }

    public final String component2() {
        return this.txId;
    }

    public final CertTokenInfo copy(OAuthToken token, String txId) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(txId, "txId");
        return new CertTokenInfo(token, txId);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CertTokenInfo)) {
            return false;
        }
        CertTokenInfo certTokenInfo = (CertTokenInfo) obj;
        return Intrinsics.areEqual(this.token, certTokenInfo.token) && Intrinsics.areEqual(this.txId, certTokenInfo.txId);
    }

    public final OAuthToken getToken() {
        return this.token;
    }

    public final String getTxId() {
        return this.txId;
    }

    public int hashCode() {
        return (this.token.hashCode() * 31) + this.txId.hashCode();
    }

    public String toString() {
        return "CertTokenInfo(token=" + this.token + ", txId=" + this.txId + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        Intrinsics.checkNotNullParameter(out, "out");
        this.token.writeToParcel(out, i8);
        out.writeString(this.txId);
    }
}
