package com.kakao.sdk.user.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class Profile implements Parcelable {
    public static final Parcelable.Creator<Profile> CREATOR = new Creator();
    private final Boolean isDefaultImage;
    private final String nickname;
    private final String profileImageUrl;
    private final String thumbnailImageUrl;

    public static final class Creator implements Parcelable.Creator<Profile> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Profile createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new Profile(string, string2, string3, boolValueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Profile[] newArray(int i8) {
            return new Profile[i8];
        }
    }

    public Profile(String str, String str2, String str3, Boolean bool) {
        this.nickname = str;
        this.profileImageUrl = str2;
        this.thumbnailImageUrl = str3;
        this.isDefaultImage = bool;
    }

    public static /* synthetic */ Profile copy$default(Profile profile, String str, String str2, String str3, Boolean bool, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = profile.nickname;
        }
        if ((i8 & 2) != 0) {
            str2 = profile.profileImageUrl;
        }
        if ((i8 & 4) != 0) {
            str3 = profile.thumbnailImageUrl;
        }
        if ((i8 & 8) != 0) {
            bool = profile.isDefaultImage;
        }
        return profile.copy(str, str2, str3, bool);
    }

    public final String component1() {
        return this.nickname;
    }

    public final String component2() {
        return this.profileImageUrl;
    }

    public final String component3() {
        return this.thumbnailImageUrl;
    }

    public final Boolean component4() {
        return this.isDefaultImage;
    }

    public final Profile copy(String str, String str2, String str3, Boolean bool) {
        return new Profile(str, str2, str3, bool);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Profile)) {
            return false;
        }
        Profile profile = (Profile) obj;
        return Intrinsics.areEqual(this.nickname, profile.nickname) && Intrinsics.areEqual(this.profileImageUrl, profile.profileImageUrl) && Intrinsics.areEqual(this.thumbnailImageUrl, profile.thumbnailImageUrl) && Intrinsics.areEqual(this.isDefaultImage, profile.isDefaultImage);
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final String getProfileImageUrl() {
        return this.profileImageUrl;
    }

    public final String getThumbnailImageUrl() {
        return this.thumbnailImageUrl;
    }

    public int hashCode() {
        String str = this.nickname;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.profileImageUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.thumbnailImageUrl;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isDefaultImage;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final Boolean isDefaultImage() {
        return this.isDefaultImage;
    }

    public String toString() {
        return "Profile(nickname=" + ((Object) this.nickname) + ", profileImageUrl=" + ((Object) this.profileImageUrl) + ", thumbnailImageUrl=" + ((Object) this.thumbnailImageUrl) + ", isDefaultImage=" + this.isDefaultImage + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        int iBooleanValue;
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.nickname);
        out.writeString(this.profileImageUrl);
        out.writeString(this.thumbnailImageUrl);
        Boolean bool = this.isDefaultImage;
        if (bool == null) {
            iBooleanValue = 0;
        } else {
            out.writeInt(1);
            iBooleanValue = bool.booleanValue();
        }
        out.writeInt(iBooleanValue);
    }
}
