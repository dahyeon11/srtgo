package com.kakao.sdk.template.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class Button implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();
    private final Link link;
    private final String title;

    public static class Creator implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel in) {
            Intrinsics.checkParameterIsNotNull(in, "in");
            return new Button(in.readString(), (Link) Link.CREATOR.createFromParcel(in));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i8) {
            return new Button[i8];
        }
    }

    public Button(String title, Link link) {
        Intrinsics.checkParameterIsNotNull(title, "title");
        Intrinsics.checkParameterIsNotNull(link, "link");
        this.title = title;
        this.link = link;
    }

    public static /* synthetic */ Button copy$default(Button button, String str, Link link, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = button.title;
        }
        if ((i8 & 2) != 0) {
            link = button.link;
        }
        return button.copy(str, link);
    }

    public final String component1() {
        return this.title;
    }

    public final Link component2() {
        return this.link;
    }

    public final Button copy(String title, Link link) {
        Intrinsics.checkParameterIsNotNull(title, "title");
        Intrinsics.checkParameterIsNotNull(link, "link");
        return new Button(title, link);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Button)) {
            return false;
        }
        Button button = (Button) obj;
        return Intrinsics.areEqual(this.title, button.title) && Intrinsics.areEqual(this.link, button.link);
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
        Link link = this.link;
        return iHashCode + (link != null ? link.hashCode() : 0);
    }

    public String toString() {
        return "Button(title=" + this.title + ", link=" + this.link + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeString(this.title);
        this.link.writeToParcel(parcel, 0);
    }
}
