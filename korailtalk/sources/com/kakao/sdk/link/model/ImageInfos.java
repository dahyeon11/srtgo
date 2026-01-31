package com.kakao.sdk.link.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ImageInfos implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();
    private final ImageInfo original;

    public static class Creator implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel in) {
            Intrinsics.checkParameterIsNotNull(in, "in");
            return new ImageInfos((ImageInfo) ImageInfo.CREATOR.createFromParcel(in));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i8) {
            return new ImageInfos[i8];
        }
    }

    public ImageInfos(ImageInfo original) {
        Intrinsics.checkParameterIsNotNull(original, "original");
        this.original = original;
    }

    public static /* synthetic */ ImageInfos copy$default(ImageInfos imageInfos, ImageInfo imageInfo, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            imageInfo = imageInfos.original;
        }
        return imageInfos.copy(imageInfo);
    }

    public final ImageInfo component1() {
        return this.original;
    }

    public final ImageInfos copy(ImageInfo original) {
        Intrinsics.checkParameterIsNotNull(original, "original");
        return new ImageInfos(original);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ImageInfos) && Intrinsics.areEqual(this.original, ((ImageInfos) obj).original);
        }
        return true;
    }

    public final ImageInfo getOriginal() {
        return this.original;
    }

    public int hashCode() {
        ImageInfo imageInfo = this.original;
        if (imageInfo != null) {
            return imageInfo.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "ImageInfos(original=" + this.original + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        this.original.writeToParcel(parcel, 0);
    }
}
