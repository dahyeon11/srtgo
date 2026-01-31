package f;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: f.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5378a implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final int f30472a;

    /* renamed from: b, reason: collision with root package name */
    private final Intent f30473b;
    public static final b Companion = new b(null);
    public static final Parcelable.Creator<C5378a> CREATOR = new C0282a();

    /* renamed from: f.a$a, reason: collision with other inner class name */
    public static final class C0282a implements Parcelable.Creator {
        C0282a() {
        }

        @Override // android.os.Parcelable.Creator
        public C5378a createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new C5378a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public C5378a[] newArray(int i8) {
            return new C5378a[i8];
        }
    }

    /* renamed from: f.a$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String resultCodeToString(int i8) {
            return i8 != -1 ? i8 != 0 ? String.valueOf(i8) : "RESULT_CANCELED" : "RESULT_OK";
        }

        private b() {
        }

        public static /* synthetic */ void getCREATOR$annotations() {
        }
    }

    public C5378a(int i8, Intent intent) {
        this.f30472a = i8;
        this.f30473b = intent;
    }

    public static final String resultCodeToString(int i8) {
        return Companion.resultCodeToString(i8);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final Intent getData() {
        return this.f30473b;
    }

    public final int getResultCode() {
        return this.f30472a;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + Companion.resultCodeToString(this.f30472a) + ", data=" + this.f30473b + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i8) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f30472a);
        dest.writeInt(this.f30473b == null ? 0 : 1);
        Intent intent = this.f30473b;
        if (intent != null) {
            intent.writeToParcel(dest, i8);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5378a(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel));
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}
