package com.kakao.sdk.link.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ImageInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();
    private final String contentType;
    private final int height;
    private final int length;
    private final String url;
    private final int width;

    public static class Creator implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel in) {
            Intrinsics.checkParameterIsNotNull(in, "in");
            return new ImageInfo(in.readString(), in.readString(), in.readInt(), in.readInt(), in.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i8) {
            return new ImageInfo[i8];
        }
    }

    public ImageInfo(String url, String contentType, int i8, int i9, int i10) {
        Intrinsics.checkParameterIsNotNull(url, "url");
        Intrinsics.checkParameterIsNotNull(contentType, "contentType");
        this.url = url;
        this.contentType = contentType;
        this.length = i8;
        this.width = i9;
        this.height = i10;
    }

    public static /* synthetic */ ImageInfo copy$default(ImageInfo imageInfo, String str, String str2, int i8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = imageInfo.url;
        }
        if ((i11 & 2) != 0) {
            str2 = imageInfo.contentType;
        }
        String str3 = str2;
        if ((i11 & 4) != 0) {
            i8 = imageInfo.length;
        }
        int i12 = i8;
        if ((i11 & 8) != 0) {
            i9 = imageInfo.width;
        }
        int i13 = i9;
        if ((i11 & 16) != 0) {
            i10 = imageInfo.height;
        }
        return imageInfo.copy(str, str3, i12, i13, i10);
    }

    public final String component1() {
        return this.url;
    }

    public final String component2() {
        return this.contentType;
    }

    public final int component3() {
        return this.length;
    }

    public final int component4() {
        return this.width;
    }

    public final int component5() {
        return this.height;
    }

    public final ImageInfo copy(String url, String contentType, int i8, int i9, int i10) {
        Intrinsics.checkParameterIsNotNull(url, "url");
        Intrinsics.checkParameterIsNotNull(contentType, "contentType");
        return new ImageInfo(url, contentType, i8, i9, i10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageInfo)) {
            return false;
        }
        ImageInfo imageInfo = (ImageInfo) obj;
        return Intrinsics.areEqual(this.url, imageInfo.url) && Intrinsics.areEqual(this.contentType, imageInfo.contentType) && this.length == imageInfo.length && this.width == imageInfo.width && this.height == imageInfo.height;
    }

    public final String getContentType() {
        return this.contentType;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getLength() {
        return this.length;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        String str = this.url;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.contentType;
        return ((((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Integer.hashCode(this.length)) * 31) + Integer.hashCode(this.width)) * 31) + Integer.hashCode(this.height);
    }

    public String toString() {
        return "ImageInfo(url=" + this.url + ", contentType=" + this.contentType + ", length=" + this.length + ", width=" + this.width + ", height=" + this.height + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeString(this.url);
        parcel.writeString(this.contentType);
        parcel.writeInt(this.length);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
    }
}
