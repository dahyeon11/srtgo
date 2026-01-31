package com.kakao.sdk.user.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class User implements Parcelable {
    public static final Parcelable.Creator<User> CREATOR = new Creator();
    private final Date connectedAt;
    private final String groupUserToken;
    private final Boolean hasSignedUp;
    private final Long id;
    private final Account kakaoAccount;
    private final Map<String, String> properties;
    private final Date synchedAt;

    public static final class Creator implements Parcelable.Creator<User> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final User createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i8 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i8);
                for (int i9 = 0; i9 != i8; i9++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
            }
            return new User(lValueOf, linkedHashMap, parcel.readInt() == 0 ? null : Account.CREATOR.createFromParcel(parcel), parcel.readString(), (Date) parcel.readSerializable(), (Date) parcel.readSerializable(), parcel.readInt() != 0 ? Boolean.valueOf(parcel.readInt() != 0) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final User[] newArray(int i8) {
            return new User[i8];
        }
    }

    public User(Long l8, Map<String, String> map, Account account, String str, Date date, Date date2, Boolean bool) {
        this.id = l8;
        this.properties = map;
        this.kakaoAccount = account;
        this.groupUserToken = str;
        this.connectedAt = date;
        this.synchedAt = date2;
        this.hasSignedUp = bool;
    }

    public static /* synthetic */ User copy$default(User user, Long l8, Map map, Account account, String str, Date date, Date date2, Boolean bool, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            l8 = user.id;
        }
        if ((i8 & 2) != 0) {
            map = user.properties;
        }
        Map map2 = map;
        if ((i8 & 4) != 0) {
            account = user.kakaoAccount;
        }
        Account account2 = account;
        if ((i8 & 8) != 0) {
            str = user.groupUserToken;
        }
        String str2 = str;
        if ((i8 & 16) != 0) {
            date = user.connectedAt;
        }
        Date date3 = date;
        if ((i8 & 32) != 0) {
            date2 = user.synchedAt;
        }
        Date date4 = date2;
        if ((i8 & 64) != 0) {
            bool = user.hasSignedUp;
        }
        return user.copy(l8, map2, account2, str2, date3, date4, bool);
    }

    public final Long component1() {
        return this.id;
    }

    public final Map<String, String> component2() {
        return this.properties;
    }

    public final Account component3() {
        return this.kakaoAccount;
    }

    public final String component4() {
        return this.groupUserToken;
    }

    public final Date component5() {
        return this.connectedAt;
    }

    public final Date component6() {
        return this.synchedAt;
    }

    public final Boolean component7() {
        return this.hasSignedUp;
    }

    public final User copy(Long l8, Map<String, String> map, Account account, String str, Date date, Date date2, Boolean bool) {
        return new User(l8, map, account, str, date, date2, bool);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof User)) {
            return false;
        }
        User user = (User) obj;
        return Intrinsics.areEqual(this.id, user.id) && Intrinsics.areEqual(this.properties, user.properties) && Intrinsics.areEqual(this.kakaoAccount, user.kakaoAccount) && Intrinsics.areEqual(this.groupUserToken, user.groupUserToken) && Intrinsics.areEqual(this.connectedAt, user.connectedAt) && Intrinsics.areEqual(this.synchedAt, user.synchedAt) && Intrinsics.areEqual(this.hasSignedUp, user.hasSignedUp);
    }

    public final Date getConnectedAt() {
        return this.connectedAt;
    }

    public final String getGroupUserToken() {
        return this.groupUserToken;
    }

    public final Boolean getHasSignedUp() {
        return this.hasSignedUp;
    }

    public final Long getId() {
        return this.id;
    }

    public final Account getKakaoAccount() {
        return this.kakaoAccount;
    }

    public final Map<String, String> getProperties() {
        return this.properties;
    }

    public final Date getSynchedAt() {
        return this.synchedAt;
    }

    public int hashCode() {
        Long l8 = this.id;
        int iHashCode = (l8 == null ? 0 : l8.hashCode()) * 31;
        Map<String, String> map = this.properties;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        Account account = this.kakaoAccount;
        int iHashCode3 = (iHashCode2 + (account == null ? 0 : account.hashCode())) * 31;
        String str = this.groupUserToken;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Date date = this.connectedAt;
        int iHashCode5 = (iHashCode4 + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.synchedAt;
        int iHashCode6 = (iHashCode5 + (date2 == null ? 0 : date2.hashCode())) * 31;
        Boolean bool = this.hasSignedUp;
        return iHashCode6 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "User(id=" + this.id + ", properties=" + this.properties + ", kakaoAccount=" + this.kakaoAccount + ", groupUserToken=" + ((Object) this.groupUserToken) + ", connectedAt=" + this.connectedAt + ", synchedAt=" + this.synchedAt + ", hasSignedUp=" + this.hasSignedUp + ')';
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
        Map<String, String> map = this.properties;
        if (map == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                out.writeString(entry.getKey());
                out.writeString(entry.getValue());
            }
        }
        Account account = this.kakaoAccount;
        if (account == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            account.writeToParcel(out, i8);
        }
        out.writeString(this.groupUserToken);
        out.writeSerializable(this.connectedAt);
        out.writeSerializable(this.synchedAt);
        Boolean bool = this.hasSignedUp;
        if (bool == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }
}
