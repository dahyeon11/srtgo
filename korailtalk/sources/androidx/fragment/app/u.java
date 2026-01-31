package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
final class u implements Parcelable {
    public static final Parcelable.Creator<u> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    final String f9766a;

    /* renamed from: b, reason: collision with root package name */
    final String f9767b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f9768c;

    /* renamed from: d, reason: collision with root package name */
    final int f9769d;

    /* renamed from: e, reason: collision with root package name */
    final int f9770e;

    /* renamed from: f, reason: collision with root package name */
    final String f9771f;

    /* renamed from: g, reason: collision with root package name */
    final boolean f9772g;

    /* renamed from: h, reason: collision with root package name */
    final boolean f9773h;

    /* renamed from: i, reason: collision with root package name */
    final boolean f9774i;

    /* renamed from: j, reason: collision with root package name */
    final Bundle f9775j;

    /* renamed from: k, reason: collision with root package name */
    final boolean f9776k;

    /* renamed from: l, reason: collision with root package name */
    final int f9777l;

    /* renamed from: m, reason: collision with root package name */
    Bundle f9778m;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public u createFromParcel(Parcel parcel) {
            return new u(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public u[] newArray(int i8) {
            return new u[i8];
        }
    }

    u(Fragment fragment) {
        this.f9766a = fragment.getClass().getName();
        this.f9767b = fragment.f9488f;
        this.f9768c = fragment.f9496n;
        this.f9769d = fragment.f9505w;
        this.f9770e = fragment.f9506x;
        this.f9771f = fragment.f9507y;
        this.f9772g = fragment.f9458B;
        this.f9773h = fragment.f9495m;
        this.f9774i = fragment.f9457A;
        this.f9775j = fragment.f9489g;
        this.f9776k = fragment.f9508z;
        this.f9777l = fragment.f9474R.ordinal();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f9766a);
        sb.append(" (");
        sb.append(this.f9767b);
        sb.append(")}:");
        if (this.f9768c) {
            sb.append(" fromLayout");
        }
        if (this.f9770e != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f9770e));
        }
        String str = this.f9771f;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f9771f);
        }
        if (this.f9772g) {
            sb.append(" retainInstance");
        }
        if (this.f9773h) {
            sb.append(" removing");
        }
        if (this.f9774i) {
            sb.append(" detached");
        }
        if (this.f9776k) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeString(this.f9766a);
        parcel.writeString(this.f9767b);
        parcel.writeInt(this.f9768c ? 1 : 0);
        parcel.writeInt(this.f9769d);
        parcel.writeInt(this.f9770e);
        parcel.writeString(this.f9771f);
        parcel.writeInt(this.f9772g ? 1 : 0);
        parcel.writeInt(this.f9773h ? 1 : 0);
        parcel.writeInt(this.f9774i ? 1 : 0);
        parcel.writeBundle(this.f9775j);
        parcel.writeInt(this.f9776k ? 1 : 0);
        parcel.writeBundle(this.f9778m);
        parcel.writeInt(this.f9777l);
    }

    u(Parcel parcel) {
        this.f9766a = parcel.readString();
        this.f9767b = parcel.readString();
        this.f9768c = parcel.readInt() != 0;
        this.f9769d = parcel.readInt();
        this.f9770e = parcel.readInt();
        this.f9771f = parcel.readString();
        this.f9772g = parcel.readInt() != 0;
        this.f9773h = parcel.readInt() != 0;
        this.f9774i = parcel.readInt() != 0;
        this.f9775j = parcel.readBundle();
        this.f9776k = parcel.readInt() != 0;
        this.f9778m = parcel.readBundle();
        this.f9777l = parcel.readInt();
    }
}
