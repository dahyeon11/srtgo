package com.kakao.sdk.template.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class CommerceTemplate implements DefaultTemplate, Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();
    private final String buttonTitle;
    private final List<Button> buttons;
    private final Commerce commerce;
    private final Content content;
    private final String objectType;

    public static class Creator implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel in) {
            ArrayList arrayList;
            Intrinsics.checkParameterIsNotNull(in, "in");
            Content content = (Content) Content.CREATOR.createFromParcel(in);
            Commerce commerce = (Commerce) Commerce.CREATOR.createFromParcel(in);
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
            return new CommerceTemplate(content, commerce, arrayList, in.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i8) {
            return new CommerceTemplate[i8];
        }
    }

    public CommerceTemplate(Content content, Commerce commerce) {
        this(content, commerce, null, null, 12, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CommerceTemplate copy$default(CommerceTemplate commerceTemplate, Content content, Commerce commerce, List list, String str, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            content = commerceTemplate.content;
        }
        if ((i8 & 2) != 0) {
            commerce = commerceTemplate.commerce;
        }
        if ((i8 & 4) != 0) {
            list = commerceTemplate.buttons;
        }
        if ((i8 & 8) != 0) {
            str = commerceTemplate.buttonTitle;
        }
        return commerceTemplate.copy(content, commerce, list, str);
    }

    public final Content component1() {
        return this.content;
    }

    public final Commerce component2() {
        return this.commerce;
    }

    public final List<Button> component3() {
        return this.buttons;
    }

    public final String component4() {
        return this.buttonTitle;
    }

    public final CommerceTemplate copy(Content content, Commerce commerce, List<Button> list, String str) {
        Intrinsics.checkParameterIsNotNull(content, "content");
        Intrinsics.checkParameterIsNotNull(commerce, "commerce");
        return new CommerceTemplate(content, commerce, list, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommerceTemplate)) {
            return false;
        }
        CommerceTemplate commerceTemplate = (CommerceTemplate) obj;
        return Intrinsics.areEqual(this.content, commerceTemplate.content) && Intrinsics.areEqual(this.commerce, commerceTemplate.commerce) && Intrinsics.areEqual(this.buttons, commerceTemplate.buttons) && Intrinsics.areEqual(this.buttonTitle, commerceTemplate.buttonTitle);
    }

    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    public final List<Button> getButtons() {
        return this.buttons;
    }

    public final Commerce getCommerce() {
        return this.commerce;
    }

    public final Content getContent() {
        return this.content;
    }

    public final String getObjectType() {
        return this.objectType;
    }

    public int hashCode() {
        Content content = this.content;
        int iHashCode = (content != null ? content.hashCode() : 0) * 31;
        Commerce commerce = this.commerce;
        int iHashCode2 = (iHashCode + (commerce != null ? commerce.hashCode() : 0)) * 31;
        List<Button> list = this.buttons;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        String str = this.buttonTitle;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "CommerceTemplate(content=" + this.content + ", commerce=" + this.commerce + ", buttons=" + this.buttons + ", buttonTitle=" + this.buttonTitle + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        this.content.writeToParcel(parcel, 0);
        this.commerce.writeToParcel(parcel, 0);
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

    public CommerceTemplate(Content content, Commerce commerce, List<Button> list) {
        this(content, commerce, list, null, 8, null);
    }

    public CommerceTemplate(Content content, Commerce commerce, List<Button> list, String str) {
        Intrinsics.checkParameterIsNotNull(content, "content");
        Intrinsics.checkParameterIsNotNull(commerce, "commerce");
        this.content = content;
        this.commerce = commerce;
        this.buttons = list;
        this.buttonTitle = str;
        this.objectType = "commerce";
    }

    public /* synthetic */ CommerceTemplate(Content content, Commerce commerce, List list, String str, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this(content, commerce, (i8 & 4) != 0 ? null : list, (i8 & 8) != 0 ? null : str);
    }
}
