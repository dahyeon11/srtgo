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
public final class FeedTemplate implements DefaultTemplate, Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();
    private final String buttonTitle;
    private final List<Button> buttons;
    private final Content content;
    private final String objectType;
    private final Social social;

    public static class Creator implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel in) {
            Intrinsics.checkParameterIsNotNull(in, "in");
            Content content = (Content) Content.CREATOR.createFromParcel(in);
            ArrayList arrayList = null;
            Social social = in.readInt() != 0 ? (Social) Social.CREATOR.createFromParcel(in) : null;
            if (in.readInt() != 0) {
                int i8 = in.readInt();
                ArrayList arrayList2 = new ArrayList(i8);
                while (i8 != 0) {
                    arrayList2.add((Button) Button.CREATOR.createFromParcel(in));
                    i8--;
                }
                arrayList = arrayList2;
            }
            return new FeedTemplate(content, social, arrayList, in.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i8) {
            return new FeedTemplate[i8];
        }
    }

    public FeedTemplate(Content content) {
        this(content, null, null, null, 14, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FeedTemplate copy$default(FeedTemplate feedTemplate, Content content, Social social, List list, String str, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            content = feedTemplate.content;
        }
        if ((i8 & 2) != 0) {
            social = feedTemplate.social;
        }
        if ((i8 & 4) != 0) {
            list = feedTemplate.buttons;
        }
        if ((i8 & 8) != 0) {
            str = feedTemplate.buttonTitle;
        }
        return feedTemplate.copy(content, social, list, str);
    }

    public final Content component1() {
        return this.content;
    }

    public final Social component2() {
        return this.social;
    }

    public final List<Button> component3() {
        return this.buttons;
    }

    public final String component4() {
        return this.buttonTitle;
    }

    public final FeedTemplate copy(Content content, Social social, List<Button> list, String str) {
        Intrinsics.checkParameterIsNotNull(content, "content");
        return new FeedTemplate(content, social, list, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedTemplate)) {
            return false;
        }
        FeedTemplate feedTemplate = (FeedTemplate) obj;
        return Intrinsics.areEqual(this.content, feedTemplate.content) && Intrinsics.areEqual(this.social, feedTemplate.social) && Intrinsics.areEqual(this.buttons, feedTemplate.buttons) && Intrinsics.areEqual(this.buttonTitle, feedTemplate.buttonTitle);
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
        Content content = this.content;
        int iHashCode = (content != null ? content.hashCode() : 0) * 31;
        Social social = this.social;
        int iHashCode2 = (iHashCode + (social != null ? social.hashCode() : 0)) * 31;
        List<Button> list = this.buttons;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        String str = this.buttonTitle;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "FeedTemplate(content=" + this.content + ", social=" + this.social + ", buttons=" + this.buttons + ", buttonTitle=" + this.buttonTitle + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        this.content.writeToParcel(parcel, 0);
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

    public FeedTemplate(Content content, Social social) {
        this(content, social, null, null, 12, null);
    }

    public FeedTemplate(Content content, Social social, List<Button> list) {
        this(content, social, list, null, 8, null);
    }

    public FeedTemplate(Content content, Social social, List<Button> list, String str) {
        Intrinsics.checkParameterIsNotNull(content, "content");
        this.content = content;
        this.social = social;
        this.buttons = list;
        this.buttonTitle = str;
        this.objectType = Constants.TYPE_FEED;
    }

    public /* synthetic */ FeedTemplate(Content content, Social social, List list, String str, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this(content, (i8 & 2) != 0 ? null : social, (i8 & 4) != 0 ? null : list, (i8 & 8) != 0 ? null : str);
    }
}
