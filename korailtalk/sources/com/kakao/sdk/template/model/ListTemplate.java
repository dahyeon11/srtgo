package com.kakao.sdk.template.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.kakao.sdk.template.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ListTemplate implements DefaultTemplate, Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();
    private final String buttonTitle;
    private final List<Button> buttons;
    private final List<Content> contents;
    private final Link headerLink;
    private final String headerTitle;
    private final String objectType;

    public static class Creator implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel in) {
            ArrayList arrayList;
            Intrinsics.checkParameterIsNotNull(in, "in");
            String string = in.readString();
            Link link = (Link) Link.CREATOR.createFromParcel(in);
            int i8 = in.readInt();
            ArrayList arrayList2 = new ArrayList(i8);
            while (i8 != 0) {
                arrayList2.add((Content) Content.CREATOR.createFromParcel(in));
                i8--;
            }
            if (in.readInt() != 0) {
                int i9 = in.readInt();
                arrayList = new ArrayList(i9);
                while (i9 != 0) {
                    arrayList.add((Button) Button.CREATOR.createFromParcel(in));
                    i9--;
                }
            } else {
                arrayList = null;
            }
            return new ListTemplate(string, link, arrayList2, arrayList, in.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i8) {
            return new ListTemplate[i8];
        }
    }

    public ListTemplate(String str, Link link, List<Content> list) {
        this(str, link, list, null, null, 24, null);
    }

    public static /* synthetic */ ListTemplate copy$default(ListTemplate listTemplate, String str, Link link, List list, List list2, String str2, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = listTemplate.headerTitle;
        }
        if ((i8 & 2) != 0) {
            link = listTemplate.headerLink;
        }
        Link link2 = link;
        if ((i8 & 4) != 0) {
            list = listTemplate.contents;
        }
        List list3 = list;
        if ((i8 & 8) != 0) {
            list2 = listTemplate.buttons;
        }
        List list4 = list2;
        if ((i8 & 16) != 0) {
            str2 = listTemplate.buttonTitle;
        }
        return listTemplate.copy(str, link2, list3, list4, str2);
    }

    public final String component1() {
        return this.headerTitle;
    }

    public final Link component2() {
        return this.headerLink;
    }

    public final List<Content> component3() {
        return this.contents;
    }

    public final List<Button> component4() {
        return this.buttons;
    }

    public final String component5() {
        return this.buttonTitle;
    }

    public final ListTemplate copy(String headerTitle, Link headerLink, List<Content> contents, List<Button> list, String str) {
        Intrinsics.checkParameterIsNotNull(headerTitle, "headerTitle");
        Intrinsics.checkParameterIsNotNull(headerLink, "headerLink");
        Intrinsics.checkParameterIsNotNull(contents, "contents");
        return new ListTemplate(headerTitle, headerLink, contents, list, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListTemplate)) {
            return false;
        }
        ListTemplate listTemplate = (ListTemplate) obj;
        return Intrinsics.areEqual(this.headerTitle, listTemplate.headerTitle) && Intrinsics.areEqual(this.headerLink, listTemplate.headerLink) && Intrinsics.areEqual(this.contents, listTemplate.contents) && Intrinsics.areEqual(this.buttons, listTemplate.buttons) && Intrinsics.areEqual(this.buttonTitle, listTemplate.buttonTitle);
    }

    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    public final List<Button> getButtons() {
        return this.buttons;
    }

    public final List<Content> getContents() {
        return this.contents;
    }

    public final Link getHeaderLink() {
        return this.headerLink;
    }

    public final String getHeaderTitle() {
        return this.headerTitle;
    }

    public final String getObjectType() {
        return this.objectType;
    }

    public int hashCode() {
        String str = this.headerTitle;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Link link = this.headerLink;
        int iHashCode2 = (iHashCode + (link != null ? link.hashCode() : 0)) * 31;
        List<Content> list = this.contents;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        List<Button> list2 = this.buttons;
        int iHashCode4 = (iHashCode3 + (list2 != null ? list2.hashCode() : 0)) * 31;
        String str2 = this.buttonTitle;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "ListTemplate(headerTitle=" + this.headerTitle + ", headerLink=" + this.headerLink + ", contents=" + this.contents + ", buttons=" + this.buttons + ", buttonTitle=" + this.buttonTitle + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeString(this.headerTitle);
        this.headerLink.writeToParcel(parcel, 0);
        List<Content> list = this.contents;
        parcel.writeInt(list.size());
        Iterator<Content> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, 0);
        }
        List<Button> list2 = this.buttons;
        if (list2 != null) {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<Button> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, 0);
            }
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.buttonTitle);
    }

    public ListTemplate(String str, Link link, List<Content> list, List<Button> list2) {
        this(str, link, list, list2, null, 16, null);
    }

    public ListTemplate(String headerTitle, Link headerLink, List<Content> contents, List<Button> list, String str) {
        Intrinsics.checkParameterIsNotNull(headerTitle, "headerTitle");
        Intrinsics.checkParameterIsNotNull(headerLink, "headerLink");
        Intrinsics.checkParameterIsNotNull(contents, "contents");
        this.headerTitle = headerTitle;
        this.headerLink = headerLink;
        this.contents = contents;
        this.buttons = list;
        this.buttonTitle = str;
        this.objectType = Constants.TYPE_LIST;
    }

    public /* synthetic */ ListTemplate(String str, Link link, List list, List list2, String str2, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, link, list, (i8 & 8) != 0 ? null : list2, (i8 & 16) != 0 ? null : str2);
    }
}
