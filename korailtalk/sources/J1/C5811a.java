package j1;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: j1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5811a implements Parcelable {
    public static final Parcelable.Creator<C5811a> CREATOR = new C0330a();

    /* renamed from: a, reason: collision with root package name */
    private String f33397a;

    /* renamed from: b, reason: collision with root package name */
    private String f33398b;

    /* renamed from: c, reason: collision with root package name */
    private String f33399c;

    /* renamed from: d, reason: collision with root package name */
    private String f33400d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f33401e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f33402f;

    /* renamed from: j1.a$a, reason: collision with other inner class name */
    public static final class C0330a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final C5811a createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new C5811a(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final C5811a[] newArray(int i8) {
            return new C5811a[i8];
        }
    }

    public C5811a() {
        this(null, null, null, null, false, false, 63, null);
    }

    public static /* synthetic */ C5811a copy$default(C5811a c5811a, String str, String str2, String str3, String str4, boolean z8, boolean z9, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = c5811a.f33397a;
        }
        if ((i8 & 2) != 0) {
            str2 = c5811a.f33398b;
        }
        String str5 = str2;
        if ((i8 & 4) != 0) {
            str3 = c5811a.f33399c;
        }
        String str6 = str3;
        if ((i8 & 8) != 0) {
            str4 = c5811a.f33400d;
        }
        String str7 = str4;
        if ((i8 & 16) != 0) {
            z8 = c5811a.f33401e;
        }
        boolean z10 = z8;
        if ((i8 & 32) != 0) {
            z9 = c5811a.f33402f;
        }
        return c5811a.copy(str, str5, str6, str7, z10, z9);
    }

    public final String component1() {
        return this.f33397a;
    }

    public final String component2() {
        return this.f33398b;
    }

    public final String component3() {
        return this.f33399c;
    }

    public final String component4() {
        return this.f33400d;
    }

    public final boolean component5() {
        return this.f33401e;
    }

    public final boolean component6() {
        return this.f33402f;
    }

    public final C5811a copy(String cardNumber, String validDate, String validMonth, String validYear, boolean z8, boolean z9) {
        Intrinsics.checkNotNullParameter(cardNumber, "cardNumber");
        Intrinsics.checkNotNullParameter(validDate, "validDate");
        Intrinsics.checkNotNullParameter(validMonth, "validMonth");
        Intrinsics.checkNotNullParameter(validYear, "validYear");
        return new C5811a(cardNumber, validDate, validMonth, validYear, z8, z9);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5811a)) {
            return false;
        }
        C5811a c5811a = (C5811a) obj;
        return Intrinsics.areEqual(this.f33397a, c5811a.f33397a) && Intrinsics.areEqual(this.f33398b, c5811a.f33398b) && Intrinsics.areEqual(this.f33399c, c5811a.f33399c) && Intrinsics.areEqual(this.f33400d, c5811a.f33400d) && this.f33401e == c5811a.f33401e && this.f33402f == c5811a.f33402f;
    }

    public final String getCardNumber() {
        return this.f33397a;
    }

    public final boolean getLuhnCheckSum() {
        return this.f33401e;
    }

    public final boolean getResultCheckSum() {
        return this.f33402f;
    }

    public final String getValidDate() {
        return this.f33398b;
    }

    public final String getValidMonth() {
        return this.f33399c;
    }

    public final String getValidYear() {
        return this.f33400d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = ((((((this.f33397a.hashCode() * 31) + this.f33398b.hashCode()) * 31) + this.f33399c.hashCode()) * 31) + this.f33400d.hashCode()) * 31;
        boolean z8 = this.f33401e;
        int i8 = z8;
        if (z8 != 0) {
            i8 = 1;
        }
        int i9 = (iHashCode + i8) * 31;
        boolean z9 = this.f33402f;
        return i9 + (z9 ? 1 : z9 ? 1 : 0);
    }

    public final void setCardNumber(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f33397a = str;
    }

    public final void setLuhnCheckSum(boolean z8) {
        this.f33401e = z8;
    }

    public final void setResultCheckSum(boolean z8) {
        this.f33402f = z8;
    }

    public final void setValidDate(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f33398b = str;
    }

    public final void setValidMonth(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f33399c = str;
    }

    public final void setValidYear(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f33400d = str;
    }

    public String toString() {
        return "CardResult(cardNumber=" + this.f33397a + ", validDate=" + this.f33398b + ", validMonth=" + this.f33399c + ", validYear=" + this.f33400d + ", luhnCheckSum=" + this.f33401e + ", resultCheckSum=" + this.f33402f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f33397a);
        out.writeString(this.f33398b);
        out.writeString(this.f33399c);
        out.writeString(this.f33400d);
        out.writeInt(this.f33401e ? 1 : 0);
        out.writeInt(this.f33402f ? 1 : 0);
    }

    public C5811a(String cardNumber, String validDate, String validMonth, String validYear, boolean z8, boolean z9) {
        Intrinsics.checkNotNullParameter(cardNumber, "cardNumber");
        Intrinsics.checkNotNullParameter(validDate, "validDate");
        Intrinsics.checkNotNullParameter(validMonth, "validMonth");
        Intrinsics.checkNotNullParameter(validYear, "validYear");
        this.f33397a = cardNumber;
        this.f33398b = validDate;
        this.f33399c = validMonth;
        this.f33400d = validYear;
        this.f33401e = z8;
        this.f33402f = z9;
    }

    public /* synthetic */ C5811a(String str, String str2, String str3, String str4, boolean z8, boolean z9, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? "" : str, (i8 & 2) != 0 ? "" : str2, (i8 & 4) != 0 ? "" : str3, (i8 & 8) == 0 ? str4 : "", (i8 & 16) != 0 ? false : z8, (i8 & 32) != 0 ? false : z9);
    }
}
