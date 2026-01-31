package com.kakao.sdk.template.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class Social implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();
    private final Integer commentCount;
    private final Integer likeCount;
    private final Integer sharedCount;
    private final Integer subscriberCount;
    private final Integer viewCount;

    public static class Creator implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel in) {
            Intrinsics.checkParameterIsNotNull(in, "in");
            return new Social(in.readInt() != 0 ? Integer.valueOf(in.readInt()) : null, in.readInt() != 0 ? Integer.valueOf(in.readInt()) : null, in.readInt() != 0 ? Integer.valueOf(in.readInt()) : null, in.readInt() != 0 ? Integer.valueOf(in.readInt()) : null, in.readInt() != 0 ? Integer.valueOf(in.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i8) {
            return new Social[i8];
        }
    }

    public Social() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ Social copy$default(Social social, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            num = social.likeCount;
        }
        if ((i8 & 2) != 0) {
            num2 = social.commentCount;
        }
        Integer num6 = num2;
        if ((i8 & 4) != 0) {
            num3 = social.sharedCount;
        }
        Integer num7 = num3;
        if ((i8 & 8) != 0) {
            num4 = social.viewCount;
        }
        Integer num8 = num4;
        if ((i8 & 16) != 0) {
            num5 = social.subscriberCount;
        }
        return social.copy(num, num6, num7, num8, num5);
    }

    public final Integer component1() {
        return this.likeCount;
    }

    public final Integer component2() {
        return this.commentCount;
    }

    public final Integer component3() {
        return this.sharedCount;
    }

    public final Integer component4() {
        return this.viewCount;
    }

    public final Integer component5() {
        return this.subscriberCount;
    }

    public final Social copy(Integer num, Integer num2, Integer num3, Integer num4, Integer num5) {
        return new Social(num, num2, num3, num4, num5);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Social)) {
            return false;
        }
        Social social = (Social) obj;
        return Intrinsics.areEqual(this.likeCount, social.likeCount) && Intrinsics.areEqual(this.commentCount, social.commentCount) && Intrinsics.areEqual(this.sharedCount, social.sharedCount) && Intrinsics.areEqual(this.viewCount, social.viewCount) && Intrinsics.areEqual(this.subscriberCount, social.subscriberCount);
    }

    public final Integer getCommentCount() {
        return this.commentCount;
    }

    public final Integer getLikeCount() {
        return this.likeCount;
    }

    public final Integer getSharedCount() {
        return this.sharedCount;
    }

    public final Integer getSubscriberCount() {
        return this.subscriberCount;
    }

    public final Integer getViewCount() {
        return this.viewCount;
    }

    public int hashCode() {
        Integer num = this.likeCount;
        int iHashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.commentCount;
        int iHashCode2 = (iHashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
        Integer num3 = this.sharedCount;
        int iHashCode3 = (iHashCode2 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Integer num4 = this.viewCount;
        int iHashCode4 = (iHashCode3 + (num4 != null ? num4.hashCode() : 0)) * 31;
        Integer num5 = this.subscriberCount;
        return iHashCode4 + (num5 != null ? num5.hashCode() : 0);
    }

    public String toString() {
        return "Social(likeCount=" + this.likeCount + ", commentCount=" + this.commentCount + ", sharedCount=" + this.sharedCount + ", viewCount=" + this.viewCount + ", subscriberCount=" + this.subscriberCount + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        Integer num = this.likeCount;
        if (num != null) {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        } else {
            parcel.writeInt(0);
        }
        Integer num2 = this.commentCount;
        if (num2 != null) {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        } else {
            parcel.writeInt(0);
        }
        Integer num3 = this.sharedCount;
        if (num3 != null) {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        } else {
            parcel.writeInt(0);
        }
        Integer num4 = this.viewCount;
        if (num4 != null) {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        } else {
            parcel.writeInt(0);
        }
        Integer num5 = this.subscriberCount;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num5.intValue());
        }
    }

    public Social(Integer num) {
        this(num, null, null, null, null, 30, null);
    }

    public Social(Integer num, Integer num2) {
        this(num, num2, null, null, null, 28, null);
    }

    public Social(Integer num, Integer num2, Integer num3) {
        this(num, num2, num3, null, null, 24, null);
    }

    public Social(Integer num, Integer num2, Integer num3, Integer num4) {
        this(num, num2, num3, num4, null, 16, null);
    }

    public Social(Integer num, Integer num2, Integer num3, Integer num4, Integer num5) {
        this.likeCount = num;
        this.commentCount = num2;
        this.sharedCount = num3;
        this.viewCount = num4;
        this.subscriberCount = num5;
    }

    public /* synthetic */ Social(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? null : num, (i8 & 2) != 0 ? null : num2, (i8 & 4) != 0 ? null : num3, (i8 & 8) != 0 ? null : num4, (i8 & 16) != 0 ? null : num5);
    }
}
