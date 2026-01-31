package f;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final IntentSender f30496a;

    /* renamed from: b, reason: collision with root package name */
    private final Intent f30497b;

    /* renamed from: c, reason: collision with root package name */
    private final int f30498c;

    /* renamed from: d, reason: collision with root package name */
    private final int f30499d;
    public static final c Companion = new c(null);
    public static final Parcelable.Creator<h> CREATOR = new b();

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final IntentSender f30500a;

        /* renamed from: b, reason: collision with root package name */
        private Intent f30501b;

        /* renamed from: c, reason: collision with root package name */
        private int f30502c;

        /* renamed from: d, reason: collision with root package name */
        private int f30503d;

        public a(IntentSender intentSender) {
            Intrinsics.checkNotNullParameter(intentSender, "intentSender");
            this.f30500a = intentSender;
        }

        public final h build() {
            return new h(this.f30500a, this.f30501b, this.f30502c, this.f30503d);
        }

        public final a setFillInIntent(Intent intent) {
            this.f30501b = intent;
            return this;
        }

        public final a setFlags(int i8, int i9) {
            this.f30503d = i8;
            this.f30502c = i9;
            return this;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public a(PendingIntent pendingIntent) {
            Intrinsics.checkNotNullParameter(pendingIntent, "pendingIntent");
            IntentSender intentSender = pendingIntent.getIntentSender();
            Intrinsics.checkNotNullExpressionValue(intentSender, "pendingIntent.intentSender");
            this(intentSender);
        }
    }

    public static final class b implements Parcelable.Creator {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        public h createFromParcel(Parcel inParcel) {
            Intrinsics.checkNotNullParameter(inParcel, "inParcel");
            return new h(inParcel);
        }

        @Override // android.os.Parcelable.Creator
        public h[] newArray(int i8) {
            return new h[i8];
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }

        public static /* synthetic */ void getCREATOR$annotations() {
        }
    }

    public h(IntentSender intentSender, Intent intent, int i8, int i9) {
        Intrinsics.checkNotNullParameter(intentSender, "intentSender");
        this.f30496a = intentSender;
        this.f30497b = intent;
        this.f30498c = i8;
        this.f30499d = i9;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final Intent getFillInIntent() {
        return this.f30497b;
    }

    public final int getFlagsMask() {
        return this.f30498c;
    }

    public final int getFlagsValues() {
        return this.f30499d;
    }

    public final IntentSender getIntentSender() {
        return this.f30496a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i8) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f30496a, i8);
        dest.writeParcelable(this.f30497b, i8);
        dest.writeInt(this.f30498c);
        dest.writeInt(this.f30499d);
    }

    public /* synthetic */ h(IntentSender intentSender, Intent intent, int i8, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(intentSender, (i10 & 2) != 0 ? null : intent, (i10 & 4) != 0 ? 0 : i8, (i10 & 8) != 0 ? 0 : i9);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public h(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
        Intrinsics.checkNotNull(parcelable);
        this((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
    }
}
