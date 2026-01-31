package j1;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: j1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5813c implements Parcelable {
    public static final Parcelable.Creator<C5813c> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private String f33406a;

    /* renamed from: b, reason: collision with root package name */
    private String f33407b;

    /* renamed from: j1.c$a */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final C5813c createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new C5813c(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final C5813c[] newArray(int i8) {
            return new C5813c[i8];
        }
    }

    public C5813c() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ C5813c copy$default(C5813c c5813c, String str, String str2, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = c5813c.f33406a;
        }
        if ((i8 & 2) != 0) {
            str2 = c5813c.f33407b;
        }
        return c5813c.copy(str, str2);
    }

    public final void clear() {
        this.f33406a = "";
        this.f33407b = "";
    }

    public final String component1() {
        return this.f33406a;
    }

    public final String component2() {
        return this.f33407b;
    }

    public final C5813c copy(String cardNumber, String validDate) {
        Intrinsics.checkNotNullParameter(cardNumber, "cardNumber");
        Intrinsics.checkNotNullParameter(validDate, "validDate");
        return new C5813c(cardNumber, validDate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5813c)) {
            return false;
        }
        C5813c c5813c = (C5813c) obj;
        return Intrinsics.areEqual(this.f33406a, c5813c.f33406a) && Intrinsics.areEqual(this.f33407b, c5813c.f33407b);
    }

    public final String getCardNumber() {
        return this.f33406a;
    }

    public final String getValidDate() {
        return this.f33407b;
    }

    public int hashCode() {
        return (this.f33406a.hashCode() * 31) + this.f33407b.hashCode();
    }

    public final void setCardNumber(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f33406a = str;
    }

    public final void setValidDate(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f33407b = str;
    }

    public String toString() {
        return "OCRResult(cardNumber=" + this.f33406a + ", validDate=" + this.f33407b + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f33406a);
        out.writeString(this.f33407b);
    }

    public C5813c(String cardNumber, String validDate) {
        Intrinsics.checkNotNullParameter(cardNumber, "cardNumber");
        Intrinsics.checkNotNullParameter(validDate, "validDate");
        this.f33406a = cardNumber;
        this.f33407b = validDate;
    }

    public /* synthetic */ C5813c(String str, String str2, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? "" : str, (i8 & 2) != 0 ? "" : str2);
    }
}
