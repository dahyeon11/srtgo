package com.kakao.sdk.common.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import maum.m2u.map.Map;

/* loaded from: classes.dex */
public final class ApiError extends KakaoSdkError implements Parcelable {
    private final ApiErrorCause reason;
    private final ApiErrorResponse response;
    private final int statusCode;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ApiError> CREATOR = new Creator();

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ApiError fromScopes(List<String> scopes) {
            Intrinsics.checkNotNullParameter(scopes, "scopes");
            ApiErrorCause apiErrorCause = ApiErrorCause.InsufficientScope;
            return new ApiError(Map.MapException.StatusCode.ROUTER_CHATBOT_NOT_FOUND_VALUE, apiErrorCause, new ApiErrorResponse(apiErrorCause.getErrorCode(), "", null, scopes, null, 20, null));
        }

        private Companion() {
        }
    }

    public static final class Creator implements Parcelable.Creator<ApiError> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApiError createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ApiError(parcel.readInt(), ApiErrorCause.valueOf(parcel.readString()), ApiErrorResponse.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApiError[] newArray(int i8) {
            return new ApiError[i8];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApiError(int i8, ApiErrorCause reason, ApiErrorResponse response) {
        super(response.getMsg(), null);
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(response, "response");
        this.statusCode = i8;
        this.reason = reason;
        this.response = response;
    }

    public static /* synthetic */ ApiError copy$default(ApiError apiError, int i8, ApiErrorCause apiErrorCause, ApiErrorResponse apiErrorResponse, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = apiError.statusCode;
        }
        if ((i9 & 2) != 0) {
            apiErrorCause = apiError.reason;
        }
        if ((i9 & 4) != 0) {
            apiErrorResponse = apiError.response;
        }
        return apiError.copy(i8, apiErrorCause, apiErrorResponse);
    }

    public final int component1() {
        return this.statusCode;
    }

    public final ApiErrorCause component2() {
        return this.reason;
    }

    public final ApiErrorResponse component3() {
        return this.response;
    }

    public final ApiError copy(int i8, ApiErrorCause reason, ApiErrorResponse response) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(response, "response");
        return new ApiError(i8, reason, response);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApiError)) {
            return false;
        }
        ApiError apiError = (ApiError) obj;
        return this.statusCode == apiError.statusCode && this.reason == apiError.reason && Intrinsics.areEqual(this.response, apiError.response);
    }

    public final ApiErrorCause getReason() {
        return this.reason;
    }

    public final ApiErrorResponse getResponse() {
        return this.response;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.statusCode) * 31) + this.reason.hashCode()) * 31) + this.response.hashCode();
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "ApiError(statusCode=" + this.statusCode + ", reason=" + this.reason + ", response=" + this.response + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeInt(this.statusCode);
        out.writeString(this.reason.name());
        this.response.writeToParcel(out, i8);
    }
}
