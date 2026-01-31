package com.kakao.sdk.template.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.kakao.sdk.common.json.MapToQueryAdapter;
import com.kakao.sdk.template.Constants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import z3.InterfaceC6621b;
import z3.InterfaceC6622c;

/* loaded from: classes.dex */
public final class Link implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();

    @InterfaceC6621b(MapToQueryAdapter.class)
    @InterfaceC6622c(Constants.ANDROID_EXECUTION_PARAMS)
    private final Map<String, String> androidExecutionParams;

    @InterfaceC6621b(MapToQueryAdapter.class)
    @InterfaceC6622c(Constants.IOS_EXECUTION_PARAMS)
    private final Map<String, String> iosExecutionParams;
    private final String mobileWebUrl;
    private final String webUrl;

    public static class Creator implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel in) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkParameterIsNotNull(in, "in");
            String string = in.readString();
            String string2 = in.readString();
            LinkedHashMap linkedHashMap2 = null;
            if (in.readInt() != 0) {
                int i8 = in.readInt();
                linkedHashMap = new LinkedHashMap(i8);
                while (i8 != 0) {
                    linkedHashMap.put(in.readString(), in.readString());
                    i8--;
                }
            } else {
                linkedHashMap = null;
            }
            if (in.readInt() != 0) {
                int i9 = in.readInt();
                linkedHashMap2 = new LinkedHashMap(i9);
                while (i9 != 0) {
                    linkedHashMap2.put(in.readString(), in.readString());
                    i9--;
                }
            }
            return new Link(string, string2, linkedHashMap, linkedHashMap2);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i8) {
            return new Link[i8];
        }
    }

    public Link() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Link copy$default(Link link, String str, String str2, Map map, Map map2, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = link.webUrl;
        }
        if ((i8 & 2) != 0) {
            str2 = link.mobileWebUrl;
        }
        if ((i8 & 4) != 0) {
            map = link.androidExecutionParams;
        }
        if ((i8 & 8) != 0) {
            map2 = link.iosExecutionParams;
        }
        return link.copy(str, str2, map, map2);
    }

    public final String component1() {
        return this.webUrl;
    }

    public final String component2() {
        return this.mobileWebUrl;
    }

    public final Map<String, String> component3() {
        return this.androidExecutionParams;
    }

    public final Map<String, String> component4() {
        return this.iosExecutionParams;
    }

    public final Link copy(String str, String str2, Map<String, String> map, Map<String, String> map2) {
        return new Link(str, str2, map, map2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Link)) {
            return false;
        }
        Link link = (Link) obj;
        return Intrinsics.areEqual(this.webUrl, link.webUrl) && Intrinsics.areEqual(this.mobileWebUrl, link.mobileWebUrl) && Intrinsics.areEqual(this.androidExecutionParams, link.androidExecutionParams) && Intrinsics.areEqual(this.iosExecutionParams, link.iosExecutionParams);
    }

    public final Map<String, String> getAndroidExecutionParams() {
        return this.androidExecutionParams;
    }

    public final Map<String, String> getIosExecutionParams() {
        return this.iosExecutionParams;
    }

    public final String getMobileWebUrl() {
        return this.mobileWebUrl;
    }

    public final String getWebUrl() {
        return this.webUrl;
    }

    public int hashCode() {
        String str = this.webUrl;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.mobileWebUrl;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Map<String, String> map = this.androidExecutionParams;
        int iHashCode3 = (iHashCode2 + (map != null ? map.hashCode() : 0)) * 31;
        Map<String, String> map2 = this.iosExecutionParams;
        return iHashCode3 + (map2 != null ? map2.hashCode() : 0);
    }

    public String toString() {
        return "Link(webUrl=" + this.webUrl + ", mobileWebUrl=" + this.mobileWebUrl + ", androidExecutionParams=" + this.androidExecutionParams + ", iosExecutionParams=" + this.iosExecutionParams + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeString(this.webUrl);
        parcel.writeString(this.mobileWebUrl);
        Map<String, String> map = this.androidExecutionParams;
        if (map != null) {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
        } else {
            parcel.writeInt(0);
        }
        Map<String, String> map2 = this.iosExecutionParams;
        if (map2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(map2.size());
        for (Map.Entry<String, String> entry2 : map2.entrySet()) {
            parcel.writeString(entry2.getKey());
            parcel.writeString(entry2.getValue());
        }
    }

    public Link(String str) {
        this(str, null, null, null, 14, null);
    }

    public Link(String str, String str2) {
        this(str, str2, null, null, 12, null);
    }

    public Link(String str, String str2, Map<String, String> map) {
        this(str, str2, map, null, 8, null);
    }

    public Link(String str, String str2, Map<String, String> map, Map<String, String> map2) {
        this.webUrl = str;
        this.mobileWebUrl = str2;
        this.androidExecutionParams = map;
        this.iosExecutionParams = map2;
    }

    public /* synthetic */ Link(String str, String str2, Map map, Map map2, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? null : str, (i8 & 2) != 0 ? null : str2, (i8 & 4) != 0 ? null : map, (i8 & 8) != 0 ? null : map2);
    }
}
