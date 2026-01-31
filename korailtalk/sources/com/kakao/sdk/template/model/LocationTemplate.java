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
public final class LocationTemplate implements DefaultTemplate, Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();
    private final String address;
    private final String addressTitle;
    private final String buttonTitle;
    private final List<Button> buttons;
    private final Content content;
    private final String objectType;
    private final Social social;

    public static class Creator implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel in) {
            Intrinsics.checkParameterIsNotNull(in, "in");
            String string = in.readString();
            Content content = (Content) Content.CREATOR.createFromParcel(in);
            String string2 = in.readString();
            ArrayList arrayList = null;
            Social social = in.readInt() != 0 ? (Social) Social.CREATOR.createFromParcel(in) : null;
            if (in.readInt() != 0) {
                int i8 = in.readInt();
                arrayList = new ArrayList(i8);
                while (i8 != 0) {
                    arrayList.add((Button) Button.CREATOR.createFromParcel(in));
                    i8--;
                }
            }
            return new LocationTemplate(string, content, string2, social, arrayList, in.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i8) {
            return new LocationTemplate[i8];
        }
    }

    public LocationTemplate(String str, Content content) {
        this(str, content, null, null, null, null, 60, null);
    }

    public static /* synthetic */ LocationTemplate copy$default(LocationTemplate locationTemplate, String str, Content content, String str2, Social social, List list, String str3, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = locationTemplate.address;
        }
        if ((i8 & 2) != 0) {
            content = locationTemplate.content;
        }
        Content content2 = content;
        if ((i8 & 4) != 0) {
            str2 = locationTemplate.addressTitle;
        }
        String str4 = str2;
        if ((i8 & 8) != 0) {
            social = locationTemplate.social;
        }
        Social social2 = social;
        if ((i8 & 16) != 0) {
            list = locationTemplate.buttons;
        }
        List list2 = list;
        if ((i8 & 32) != 0) {
            str3 = locationTemplate.buttonTitle;
        }
        return locationTemplate.copy(str, content2, str4, social2, list2, str3);
    }

    public final String component1() {
        return this.address;
    }

    public final Content component2() {
        return this.content;
    }

    public final String component3() {
        return this.addressTitle;
    }

    public final Social component4() {
        return this.social;
    }

    public final List<Button> component5() {
        return this.buttons;
    }

    public final String component6() {
        return this.buttonTitle;
    }

    public final LocationTemplate copy(String address, Content content, String str, Social social, List<Button> list, String str2) {
        Intrinsics.checkParameterIsNotNull(address, "address");
        Intrinsics.checkParameterIsNotNull(content, "content");
        return new LocationTemplate(address, content, str, social, list, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationTemplate)) {
            return false;
        }
        LocationTemplate locationTemplate = (LocationTemplate) obj;
        return Intrinsics.areEqual(this.address, locationTemplate.address) && Intrinsics.areEqual(this.content, locationTemplate.content) && Intrinsics.areEqual(this.addressTitle, locationTemplate.addressTitle) && Intrinsics.areEqual(this.social, locationTemplate.social) && Intrinsics.areEqual(this.buttons, locationTemplate.buttons) && Intrinsics.areEqual(this.buttonTitle, locationTemplate.buttonTitle);
    }

    public final String getAddress() {
        return this.address;
    }

    public final String getAddressTitle() {
        return this.addressTitle;
    }

    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    public final List<Button> getButtons() {
        return this.buttons;
    }

    public final Content getContent() {
        return this.content;
    }

    public final String getObjectType() {
        return this.objectType;
    }

    public final Social getSocial() {
        return this.social;
    }

    public int hashCode() {
        String str = this.address;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Content content = this.content;
        int iHashCode2 = (iHashCode + (content != null ? content.hashCode() : 0)) * 31;
        String str2 = this.addressTitle;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Social social = this.social;
        int iHashCode4 = (iHashCode3 + (social != null ? social.hashCode() : 0)) * 31;
        List<Button> list = this.buttons;
        int iHashCode5 = (iHashCode4 + (list != null ? list.hashCode() : 0)) * 31;
        String str3 = this.buttonTitle;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "LocationTemplate(address=" + this.address + ", content=" + this.content + ", addressTitle=" + this.addressTitle + ", social=" + this.social + ", buttons=" + this.buttons + ", buttonTitle=" + this.buttonTitle + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeString(this.address);
        this.content.writeToParcel(parcel, 0);
        parcel.writeString(this.addressTitle);
        Social social = this.social;
        if (social != null) {
            parcel.writeInt(1);
            social.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
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

    public LocationTemplate(String str, Content content, String str2) {
        this(str, content, str2, null, null, null, 56, null);
    }

    public LocationTemplate(String str, Content content, String str2, Social social) {
        this(str, content, str2, social, null, null, 48, null);
    }

    public LocationTemplate(String str, Content content, String str2, Social social, List<Button> list) {
        this(str, content, str2, social, list, null, 32, null);
    }

    public LocationTemplate(String address, Content content, String str, Social social, List<Button> list, String str2) {
        Intrinsics.checkParameterIsNotNull(address, "address");
        Intrinsics.checkParameterIsNotNull(content, "content");
        this.address = address;
        this.content = content;
        this.addressTitle = str;
        this.social = social;
        this.buttons = list;
        this.buttonTitle = str2;
        this.objectType = Constants.TYPE_LOCATION;
    }

    public /* synthetic */ LocationTemplate(String str, Content content, String str2, Social social, List list, String str3, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, content, (i8 & 4) != 0 ? null : str2, (i8 & 8) != 0 ? null : social, (i8 & 16) != 0 ? null : list, (i8 & 32) != 0 ? null : str3);
    }
}
