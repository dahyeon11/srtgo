package com.kakao.sdk.template.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class Content implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();
    private final String description;
    private final Integer imageHeight;
    private final String imageUrl;
    private final Integer imageWidth;
    private final Link link;
    private final String title;

    public static class Creator implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel in) {
            Intrinsics.checkParameterIsNotNull(in, "in");
            return new Content(in.readString(), in.readString(), (Link) Link.CREATOR.createFromParcel(in), in.readString(), in.readInt() != 0 ? Integer.valueOf(in.readInt()) : null, in.readInt() != 0 ? Integer.valueOf(in.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i8) {
            return new Content[i8];
        }
    }

    public Content(String str, String str2, Link link) {
        this(str, str2, link, null, null, null, 56, null);
    }

    public static /* synthetic */ Content copy$default(Content content, String str, String str2, Link link, String str3, Integer num, Integer num2, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = content.title;
        }
        if ((i8 & 2) != 0) {
            str2 = content.imageUrl;
        }
        String str4 = str2;
        if ((i8 & 4) != 0) {
            link = content.link;
        }
        Link link2 = link;
        if ((i8 & 8) != 0) {
            str3 = content.description;
        }
        String str5 = str3;
        if ((i8 & 16) != 0) {
            num = content.imageWidth;
        }
        Integer num3 = num;
        if ((i8 & 32) != 0) {
            num2 = content.imageHeight;
        }
        return content.copy(str, str4, link2, str5, num3, num2);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.imageUrl;
    }

    public final Link component3() {
        return this.link;
    }

    public final String component4() {
        return this.description;
    }

    public final Integer component5() {
        return this.imageWidth;
    }

    public final Integer component6() {
        return this.imageHeight;
    }

    public final Content copy(String title, String imageUrl, Link link, String str, Integer num, Integer num2) {
        Intrinsics.checkParameterIsNotNull(title, "title");
        Intrinsics.checkParameterIsNotNull(imageUrl, "imageUrl");
        Intrinsics.checkParameterIsNotNull(link, "link");
        return new Content(title, imageUrl, link, str, num, num2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Content)) {
            return false;
        }
        Content content = (Content) obj;
        return Intrinsics.areEqual(this.title, content.title) && Intrinsics.areEqual(this.imageUrl, content.imageUrl) && Intrinsics.areEqual(this.link, content.link) && Intrinsics.areEqual(this.description, content.description) && Intrinsics.areEqual(this.imageWidth, content.imageWidth) && Intrinsics.areEqual(this.imageHeight, content.imageHeight);
    }

    public final String getDescription() {
        return this.description;
    }

    public final Integer getImageHeight() {
        return this.imageHeight;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final Integer getImageWidth() {
        return this.imageWidth;
    }

    public final Link getLink() {
        return this.link;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.imageUrl;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Link link = this.link;
        int iHashCode3 = (iHashCode2 + (link != null ? link.hashCode() : 0)) * 31;
        String str3 = this.description;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Integer num = this.imageWidth;
        int iHashCode5 = (iHashCode4 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.imageHeight;
        return iHashCode5 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "Content(title=" + this.title + ", imageUrl=" + this.imageUrl + ", link=" + this.link + ", description=" + this.description + ", imageWidth=" + this.imageWidth + ", imageHeight=" + this.imageHeight + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeString(this.title);
        parcel.writeString(this.imageUrl);
        this.link.writeToParcel(parcel, 0);
        parcel.writeString(this.description);
        Integer num = this.imageWidth;
        if (num != null) {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        } else {
            parcel.writeInt(0);
        }
        Integer num2 = this.imageHeight;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
    }

    public Content(String str, String str2, Link link, String str3) {
        this(str, str2, link, str3, null, null, 48, null);
    }

    public Content(String str, String str2, Link link, String str3, Integer num) {
        this(str, str2, link, str3, num, null, 32, null);
    }

    public Content(String title, String imageUrl, Link link, String str, Integer num, Integer num2) {
        Intrinsics.checkParameterIsNotNull(title, "title");
        Intrinsics.checkParameterIsNotNull(imageUrl, "imageUrl");
        Intrinsics.checkParameterIsNotNull(link, "link");
        this.title = title;
        this.imageUrl = imageUrl;
        this.link = link;
        this.description = str;
        this.imageWidth = num;
        this.imageHeight = num2;
    }

    public /* synthetic */ Content(String str, String str2, Link link, String str3, Integer num, Integer num2, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, link, (i8 & 8) != 0 ? null : str3, (i8 & 16) != 0 ? null : num, (i8 & 32) != 0 ? null : num2);
    }
}
