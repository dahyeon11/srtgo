package com.kakao.sdk.common.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ClientError extends KakaoSdkError implements Parcelable {
    public static final Parcelable.Creator<ClientError> CREATOR = new Creator();
    private final String msg;
    private final ClientErrorCause reason;

    public static final class Creator implements Parcelable.Creator<ClientError> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ClientError createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ClientError(ClientErrorCause.valueOf(parcel.readString()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ClientError[] newArray(int i8) {
            return new ClientError[i8];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ClientError(ClientErrorCause clientErrorCause, String str, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i8 & 2) != 0) {
            Description description = (Description) clientErrorCause.getClass().getField(clientErrorCause.name()).getAnnotation(Description.class);
            str = description == null ? "Client-side error" : description.value();
        }
        this(clientErrorCause, str);
    }

    public static /* synthetic */ ClientError copy$default(ClientError clientError, ClientErrorCause clientErrorCause, String str, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            clientErrorCause = clientError.reason;
        }
        if ((i8 & 2) != 0) {
            str = clientError.getMsg();
        }
        return clientError.copy(clientErrorCause, str);
    }

    public final ClientErrorCause component1() {
        return this.reason;
    }

    public final String component2() {
        return getMsg();
    }

    public final ClientError copy(ClientErrorCause reason, String msg) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(msg, "msg");
        return new ClientError(reason, msg);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClientError)) {
            return false;
        }
        ClientError clientError = (ClientError) obj;
        return this.reason == clientError.reason && Intrinsics.areEqual(getMsg(), clientError.getMsg());
    }

    @Override // com.kakao.sdk.common.model.KakaoSdkError
    public String getMsg() {
        return this.msg;
    }

    public final ClientErrorCause getReason() {
        return this.reason;
    }

    public int hashCode() {
        return (this.reason.hashCode() * 31) + getMsg().hashCode();
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "ClientError(reason=" + this.reason + ", msg=" + getMsg() + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.reason.name());
        out.writeString(this.msg);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClientError(ClientErrorCause reason, String msg) {
        super(msg, null);
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(msg, "msg");
        this.reason = reason;
        this.msg = msg;
    }
}
