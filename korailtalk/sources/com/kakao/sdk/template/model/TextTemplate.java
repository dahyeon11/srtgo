package com.kakao.sdk.template.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class TextTemplate implements DefaultTemplate, Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();
    private final String buttonTitle;
    private final List<Button> buttons;
    private final Link link;
    private final String objectType;
    private final String text;

    public static class Creator implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel in) {
            ArrayList arrayList;
            Intrinsics.checkParameterIsNotNull(in, "in");
            String string = in.readString();
            Link link = (Link) Link.CREATOR.createFromParcel(in);
            if (in.readInt() != 0) {
                int i8 = in.readInt();
                arrayList = new ArrayList(i8);
                while (i8 != 0) {
                    arrayList.add((Button) Button.CREATOR.createFromParcel(in));
                    i8--;
                }
            } else {
                arrayList = null;
            }
            return new TextTemplate(string, link, arrayList, in.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i8) {
            return new TextTemplate[i8];
        }
    }

    public TextTemplate(String str, Link link) {
        this(str, link, null, null, 12, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TextTemplate copy$default(TextTemplate textTemplate, String str, Link link, List list, String str2, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = textTemplate.text;
        }
        if ((i8 & 2) != 0) {
            link = textTemplate.link;
        }
        if ((i8 & 4) != 0) {
            list = textTemplate.buttons;
        }
        if ((i8 & 8) != 0) {
            str2 = textTemplate.buttonTitle;
        }
        return textTemplate.copy(str, link, list, str2);
    }

    public final String component1() {
        return this.text;
    }

    public final Link component2() {
        return this.link;
    }

    public final List<Button> component3() {
        return this.buttons;
    }

    public final String component4() {
        return this.buttonTitle;
    }

    public final TextTemplate copy(String text, Link link, List<Button> list, String str) {
        Intrinsics.checkParameterIsNotNull(text, "text");
        Intrinsics.checkParameterIsNotNull(link, "link");
        return new TextTemplate(text, link, list, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextTemplate)) {
            return false;
        }
        TextTemplate textTemplate = (TextTemplate) obj;
        return Intrinsics.areEqual(this.text, textTemplate.text) && Intrinsics.areEqual(this.link, textTemplate.link) && Intrinsics.areEqual(this.buttons, textTemplate.buttons) && Intrinsics.areEqual(this.buttonTitle, textTemplate.buttonTitle);
    }

    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    public final List<Button> getButtons() {
        return this.buttons;
    }

    public final Link getLink() {
        return this.link;
    }

    public final String getObjectType() {
        return this.objectType;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        String str = this.text;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Link link = this.link;
        int iHashCode2 = (iHashCode + (link != null ? link.hashCode() : 0)) * 31;
        List<Button> list = this.buttons;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.buttonTitle;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "TextTemplate(text=" + this.text + ", link=" + this.link + ", buttons=" + this.buttons + ", buttonTitle=" + this.buttonTitle + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeString(this.text);
        this.link.writeToParcel(parcel, 0);
        List<Button> list = this.buttons;
        if (list != null) {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<Button> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, 0);
            }
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.buttonTitle);
    }

    public TextTemplate(String str, Link link, List<Button> list) {
        this(str, link, list, null, 8, null);
    }

    public TextTemplate(String text, Link link, List<Button> list, String str) {
        Intrinsics.checkParameterIsNotNull(text, "text");
        Intrinsics.checkParameterIsNotNull(link, "link");
        this.text = text;
        this.link = link;
        this.buttons = list;
        this.buttonTitle = str;
        this.objectType = "text";
    }

    public /* synthetic */ TextTemplate(String str, Link link, List list, String str2, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, link, (i8 & 4) != 0 ? null : list, (i8 & 8) != 0 ? null : str2);
    }
}
