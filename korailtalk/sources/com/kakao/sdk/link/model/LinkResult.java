package com.kakao.sdk.link.model;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class LinkResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();
    private final Map<String, String> argumentMsg;
    private final Intent intent;
    private final Map<String, String> warningMsg;

    public static class Creator implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel in) {
            Intrinsics.checkParameterIsNotNull(in, "in");
            Intent intent = (Intent) in.readParcelable(LinkResult.class.getClassLoader());
            int i8 = in.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i8);
            while (i8 != 0) {
                linkedHashMap.put(in.readString(), in.readString());
                i8--;
            }
            int i9 = in.readInt();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(i9);
            while (i9 != 0) {
                linkedHashMap2.put(in.readString(), in.readString());
                i9--;
            }
            return new LinkResult(intent, linkedHashMap, linkedHashMap2);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i8) {
            return new LinkResult[i8];
        }
    }

    public LinkResult(Intent intent, Map<String, String> warningMsg, Map<String, String> argumentMsg) {
        Intrinsics.checkParameterIsNotNull(intent, "intent");
        Intrinsics.checkParameterIsNotNull(warningMsg, "warningMsg");
        Intrinsics.checkParameterIsNotNull(argumentMsg, "argumentMsg");
        this.intent = intent;
        this.warningMsg = warningMsg;
        this.argumentMsg = argumentMsg;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LinkResult copy$default(LinkResult linkResult, Intent intent, Map map, Map map2, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            intent = linkResult.intent;
        }
        if ((i8 & 2) != 0) {
            map = linkResult.warningMsg;
        }
        if ((i8 & 4) != 0) {
            map2 = linkResult.argumentMsg;
        }
        return linkResult.copy(intent, map, map2);
    }

    public final Intent component1() {
        return this.intent;
    }

    public final Map<String, String> component2() {
        return this.warningMsg;
    }

    public final Map<String, String> component3() {
        return this.argumentMsg;
    }

    public final LinkResult copy(Intent intent, Map<String, String> warningMsg, Map<String, String> argumentMsg) {
        Intrinsics.checkParameterIsNotNull(intent, "intent");
        Intrinsics.checkParameterIsNotNull(warningMsg, "warningMsg");
        Intrinsics.checkParameterIsNotNull(argumentMsg, "argumentMsg");
        return new LinkResult(intent, warningMsg, argumentMsg);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinkResult)) {
            return false;
        }
        LinkResult linkResult = (LinkResult) obj;
        return Intrinsics.areEqual(this.intent, linkResult.intent) && Intrinsics.areEqual(this.warningMsg, linkResult.warningMsg) && Intrinsics.areEqual(this.argumentMsg, linkResult.argumentMsg);
    }

    public final Map<String, String> getArgumentMsg() {
        return this.argumentMsg;
    }

    public final Intent getIntent() {
        return this.intent;
    }

    public final Map<String, String> getWarningMsg() {
        return this.warningMsg;
    }

    public int hashCode() {
        Intent intent = this.intent;
        int iHashCode = (intent != null ? intent.hashCode() : 0) * 31;
        Map<String, String> map = this.warningMsg;
        int iHashCode2 = (iHashCode + (map != null ? map.hashCode() : 0)) * 31;
        Map<String, String> map2 = this.argumentMsg;
        return iHashCode2 + (map2 != null ? map2.hashCode() : 0);
    }

    public String toString() {
        return "LinkResult(intent=" + this.intent + ", warningMsg=" + this.warningMsg + ", argumentMsg=" + this.argumentMsg + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeParcelable(this.intent, i8);
        Map<String, String> map = this.warningMsg;
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
        Map<String, String> map2 = this.argumentMsg;
        parcel.writeInt(map2.size());
        for (Map.Entry<String, String> entry2 : map2.entrySet()) {
            parcel.writeString(entry2.getKey());
            parcel.writeString(entry2.getValue());
        }
    }
}
