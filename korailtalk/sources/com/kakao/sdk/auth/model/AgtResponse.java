package com.kakao.sdk.auth.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AgtResponse implements Parcelable {
    public static final Parcelable.Creator<AgtResponse> CREATOR = new Creator();
    private final String agt;

    public static final class Creator implements Parcelable.Creator<AgtResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AgtResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AgtResponse(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AgtResponse[] newArray(int i8) {
            return new AgtResponse[i8];
        }
    }

    public AgtResponse(String agt) {
        Intrinsics.checkNotNullParameter(agt, "agt");
        this.agt = agt;
    }

    public static /* synthetic */ AgtResponse copy$default(AgtResponse agtResponse, String str, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = agtResponse.agt;
        }
        return agtResponse.copy(str);
    }

    public final String component1() {
        return this.agt;
    }

    public final AgtResponse copy(String agt) {
        Intrinsics.checkNotNullParameter(agt, "agt");
        return new AgtResponse(agt);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AgtResponse) && Intrinsics.areEqual(this.agt, ((AgtResponse) obj).agt);
    }

    public final String getAgt() {
        return this.agt;
    }

    public int hashCode() {
        return this.agt.hashCode();
    }

    public String toString() {
        return "AgtResponse(agt=" + this.agt + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.agt);
    }
}
