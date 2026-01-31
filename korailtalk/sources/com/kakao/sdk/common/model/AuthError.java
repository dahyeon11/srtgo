package com.kakao.sdk.common.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AuthError extends KakaoSdkError implements Parcelable {
    public static final Parcelable.Creator<AuthError> CREATOR = new Creator();
    private final AuthErrorCause reason;
    private final AuthErrorResponse response;
    private final int statusCode;

    public static final class Creator implements Parcelable.Creator<AuthError> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AuthError createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AuthError(parcel.readInt(), AuthErrorCause.valueOf(parcel.readString()), AuthErrorResponse.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AuthError[] newArray(int i8) {
            return new AuthError[i8];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AuthError(int i8, AuthErrorCause reason, AuthErrorResponse response) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(response, "response");
        String errorDescription = response.getErrorDescription();
        super(errorDescription == null ? response.getError() : errorDescription, null);
        this.statusCode = i8;
        this.reason = reason;
        this.response = response;
    }

    public static /* synthetic */ AuthError copy$default(AuthError authError, int i8, AuthErrorCause authErrorCause, AuthErrorResponse authErrorResponse, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = authError.statusCode;
        }
        if ((i9 & 2) != 0) {
            authErrorCause = authError.reason;
        }
        if ((i9 & 4) != 0) {
            authErrorResponse = authError.response;
        }
        return authError.copy(i8, authErrorCause, authErrorResponse);
    }

    public final int component1() {
        return this.statusCode;
    }

    public final AuthErrorCause component2() {
        return this.reason;
    }

    public final AuthErrorResponse component3() {
        return this.response;
    }

    public final AuthError copy(int i8, AuthErrorCause reason, AuthErrorResponse response) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(response, "response");
        return new AuthError(i8, reason, response);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthError)) {
            return false;
        }
        AuthError authError = (AuthError) obj;
        return this.statusCode == authError.statusCode && this.reason == authError.reason && Intrinsics.areEqual(this.response, authError.response);
    }

    public final AuthErrorCause getReason() {
        return this.reason;
    }

    public final AuthErrorResponse getResponse() {
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
        return "AuthError(statusCode=" + this.statusCode + ", reason=" + this.reason + ", response=" + this.response + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeInt(this.statusCode);
        out.writeString(this.reason.name());
        this.response.writeToParcel(out, i8);
    }
}
