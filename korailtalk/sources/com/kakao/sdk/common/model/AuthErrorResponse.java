package com.kakao.sdk.common.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AuthErrorResponse implements Parcelable {
    public static final Parcelable.Creator<AuthErrorResponse> CREATOR = new Creator();
    private final String error;
    private final String errorDescription;

    public static final class Creator implements Parcelable.Creator<AuthErrorResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AuthErrorResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AuthErrorResponse(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AuthErrorResponse[] newArray(int i8) {
            return new AuthErrorResponse[i8];
        }
    }

    public AuthErrorResponse(String error, String str) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.error = error;
        this.errorDescription = str;
    }

    public static /* synthetic */ AuthErrorResponse copy$default(AuthErrorResponse authErrorResponse, String str, String str2, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = authErrorResponse.error;
        }
        if ((i8 & 2) != 0) {
            str2 = authErrorResponse.errorDescription;
        }
        return authErrorResponse.copy(str, str2);
    }

    public final String component1() {
        return this.error;
    }

    public final String component2() {
        return this.errorDescription;
    }

    public final AuthErrorResponse copy(String error, String str) {
        Intrinsics.checkNotNullParameter(error, "error");
        return new AuthErrorResponse(error, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthErrorResponse)) {
            return false;
        }
        AuthErrorResponse authErrorResponse = (AuthErrorResponse) obj;
        return Intrinsics.areEqual(this.error, authErrorResponse.error) && Intrinsics.areEqual(this.errorDescription, authErrorResponse.errorDescription);
    }

    public final String getError() {
        return this.error;
    }

    public final String getErrorDescription() {
        return this.errorDescription;
    }

    public int hashCode() {
        int iHashCode = this.error.hashCode() * 31;
        String str = this.errorDescription;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "AuthErrorResponse(error=" + this.error + ", errorDescription=" + ((Object) this.errorDescription) + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.error);
        out.writeString(this.errorDescription);
    }
}
