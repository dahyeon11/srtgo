package com.kakao.sdk.link.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ImageUploadResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();
    private final ImageInfos infos;

    public static class Creator implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel in) {
            Intrinsics.checkParameterIsNotNull(in, "in");
            return new ImageUploadResult((ImageInfos) ImageInfos.CREATOR.createFromParcel(in));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i8) {
            return new ImageUploadResult[i8];
        }
    }

    public ImageUploadResult(ImageInfos infos) {
        Intrinsics.checkParameterIsNotNull(infos, "infos");
        this.infos = infos;
    }

    public static /* synthetic */ ImageUploadResult copy$default(ImageUploadResult imageUploadResult, ImageInfos imageInfos, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            imageInfos = imageUploadResult.infos;
        }
        return imageUploadResult.copy(imageInfos);
    }

    public final ImageInfos component1() {
        return this.infos;
    }

    public final ImageUploadResult copy(ImageInfos infos) {
        Intrinsics.checkParameterIsNotNull(infos, "infos");
        return new ImageUploadResult(infos);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ImageUploadResult) && Intrinsics.areEqual(this.infos, ((ImageUploadResult) obj).infos);
        }
        return true;
    }

    public final ImageInfos getInfos() {
        return this.infos;
    }

    public int hashCode() {
        ImageInfos imageInfos = this.infos;
        if (imageInfos != null) {
            return imageInfos.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "ImageUploadResult(infos=" + this.infos + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        this.infos.writeToParcel(parcel, 0);
    }
}
