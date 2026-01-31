package com.kakao.sdk.user.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.kakao.sdk.user.Constants;
import kotlin.jvm.internal.Intrinsics;
import z3.InterfaceC6622c;

/* loaded from: classes.dex */
public final class AccessTokenInfo implements Parcelable {
    public static final Parcelable.Creator<AccessTokenInfo> CREATOR = new Creator();
    private final int appId;
    private final long expiresIn;

    @InterfaceC6622c(Constants.EXPIRESINMILLIS)
    private final Long expiresInMillis;
    private final Long id;

    public static final class Creator implements Parcelable.Creator<AccessTokenInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccessTokenInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AccessTokenInfo(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readLong(), parcel.readInt(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccessTokenInfo[] newArray(int i8) {
            return new AccessTokenInfo[i8];
        }
    }

    public AccessTokenInfo(Long l8, long j8, int i8, Long l9) {
        this.id = l8;
        this.expiresIn = j8;
        this.appId = i8;
        this.expiresInMillis = l9;
    }

    public static /* synthetic */ AccessTokenInfo copy$default(AccessTokenInfo accessTokenInfo, Long l8, long j8, int i8, Long l9, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            l8 = accessTokenInfo.id;
        }
        if ((i9 & 2) != 0) {
            j8 = accessTokenInfo.expiresIn;
        }
        long j9 = j8;
        if ((i9 & 4) != 0) {
            i8 = accessTokenInfo.appId;
        }
        int i10 = i8;
        if ((i9 & 8) != 0) {
            l9 = accessTokenInfo.expiresInMillis;
        }
        return accessTokenInfo.copy(l8, j9, i10, l9);
    }

    public static /* synthetic */ void getExpiresInMillis$annotations() {
    }

    public final Long component1() {
        return this.id;
    }

    public final long component2() {
        return this.expiresIn;
    }

    public final int component3() {
        return this.appId;
    }

    public final Long component4() {
        return this.expiresInMillis;
    }

    public final AccessTokenInfo copy(Long l8, long j8, int i8, Long l9) {
        return new AccessTokenInfo(l8, j8, i8, l9);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccessTokenInfo)) {
            return false;
        }
        AccessTokenInfo accessTokenInfo = (AccessTokenInfo) obj;
        return Intrinsics.areEqual(this.id, accessTokenInfo.id) && this.expiresIn == accessTokenInfo.expiresIn && this.appId == accessTokenInfo.appId && Intrinsics.areEqual(this.expiresInMillis, accessTokenInfo.expiresInMillis);
    }

    public final int getAppId() {
        return this.appId;
    }

    public final long getExpiresIn() {
        return this.expiresIn;
    }

    public final Long getExpiresInMillis() {
        return this.expiresInMillis;
    }

    public final Long getId() {
        return this.id;
    }

    public int hashCode() {
        Long l8 = this.id;
        int iHashCode = (((((l8 == null ? 0 : l8.hashCode()) * 31) + Long.hashCode(this.expiresIn)) * 31) + Integer.hashCode(this.appId)) * 31;
        Long l9 = this.expiresInMillis;
        return iHashCode + (l9 != null ? l9.hashCode() : 0);
    }

    public String toString() {
        return "AccessTokenInfo(id=" + this.id + ", expiresIn=" + this.expiresIn + ", appId=" + this.appId + ", expiresInMillis=" + this.expiresInMillis + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        Intrinsics.checkNotNullParameter(out, "out");
        Long l8 = this.id;
        if (l8 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeLong(l8.longValue());
        }
        out.writeLong(this.expiresIn);
        out.writeInt(this.appId);
        Long l9 = this.expiresInMillis;
        if (l9 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeLong(l9.longValue());
        }
    }
}
