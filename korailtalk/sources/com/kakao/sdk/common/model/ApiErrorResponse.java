package com.kakao.sdk.common.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ApiErrorResponse implements Parcelable {
    public static final Parcelable.Creator<ApiErrorResponse> CREATOR = new Creator();
    private final List<String> allowedScopes;
    private final String apiType;
    private final int code;
    private final String msg;
    private final List<String> requiredScopes;

    public static final class Creator implements Parcelable.Creator<ApiErrorResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApiErrorResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ApiErrorResponse(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.createStringArrayList());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApiErrorResponse[] newArray(int i8) {
            return new ApiErrorResponse[i8];
        }
    }

    public ApiErrorResponse(int i8, String msg, String str, List<String> list, List<String> list2) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        this.code = i8;
        this.msg = msg;
        this.apiType = str;
        this.requiredScopes = list;
        this.allowedScopes = list2;
    }

    public static /* synthetic */ ApiErrorResponse copy$default(ApiErrorResponse apiErrorResponse, int i8, String str, String str2, List list, List list2, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = apiErrorResponse.code;
        }
        if ((i9 & 2) != 0) {
            str = apiErrorResponse.msg;
        }
        String str3 = str;
        if ((i9 & 4) != 0) {
            str2 = apiErrorResponse.apiType;
        }
        String str4 = str2;
        if ((i9 & 8) != 0) {
            list = apiErrorResponse.requiredScopes;
        }
        List list3 = list;
        if ((i9 & 16) != 0) {
            list2 = apiErrorResponse.allowedScopes;
        }
        return apiErrorResponse.copy(i8, str3, str4, list3, list2);
    }

    public final int component1() {
        return this.code;
    }

    public final String component2() {
        return this.msg;
    }

    public final String component3() {
        return this.apiType;
    }

    public final List<String> component4() {
        return this.requiredScopes;
    }

    public final List<String> component5() {
        return this.allowedScopes;
    }

    public final ApiErrorResponse copy(int i8, String msg, String str, List<String> list, List<String> list2) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        return new ApiErrorResponse(i8, msg, str, list, list2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApiErrorResponse)) {
            return false;
        }
        ApiErrorResponse apiErrorResponse = (ApiErrorResponse) obj;
        return this.code == apiErrorResponse.code && Intrinsics.areEqual(this.msg, apiErrorResponse.msg) && Intrinsics.areEqual(this.apiType, apiErrorResponse.apiType) && Intrinsics.areEqual(this.requiredScopes, apiErrorResponse.requiredScopes) && Intrinsics.areEqual(this.allowedScopes, apiErrorResponse.allowedScopes);
    }

    public final List<String> getAllowedScopes() {
        return this.allowedScopes;
    }

    public final String getApiType() {
        return this.apiType;
    }

    public final int getCode() {
        return this.code;
    }

    public final String getMsg() {
        return this.msg;
    }

    public final List<String> getRequiredScopes() {
        return this.requiredScopes;
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.code) * 31) + this.msg.hashCode()) * 31;
        String str = this.apiType;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.requiredScopes;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.allowedScopes;
        return iHashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        return "ApiErrorResponse(code=" + this.code + ", msg=" + this.msg + ", apiType=" + ((Object) this.apiType) + ", requiredScopes=" + this.requiredScopes + ", allowedScopes=" + this.allowedScopes + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeInt(this.code);
        out.writeString(this.msg);
        out.writeString(this.apiType);
        out.writeStringList(this.requiredScopes);
        out.writeStringList(this.allowedScopes);
    }

    public /* synthetic */ ApiErrorResponse(int i8, String str, String str2, List list, List list2, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this(i8, str, (i9 & 4) != 0 ? null : str2, list, (i9 & 16) != 0 ? null : list2);
    }
}
