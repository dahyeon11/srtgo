package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class o implements Parcelable {
    public static final Parcelable.Creator<o> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    ArrayList f9745a;

    /* renamed from: b, reason: collision with root package name */
    ArrayList f9746b;

    /* renamed from: c, reason: collision with root package name */
    C1007b[] f9747c;

    /* renamed from: d, reason: collision with root package name */
    int f9748d;

    /* renamed from: e, reason: collision with root package name */
    String f9749e;

    /* renamed from: f, reason: collision with root package name */
    ArrayList f9750f;

    /* renamed from: g, reason: collision with root package name */
    ArrayList f9751g;

    /* renamed from: h, reason: collision with root package name */
    ArrayList f9752h;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public o createFromParcel(Parcel parcel) {
            return new o(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public o[] newArray(int i8) {
            return new o[i8];
        }
    }

    public o() {
        this.f9749e = null;
        this.f9750f = new ArrayList();
        this.f9751g = new ArrayList();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeTypedList(this.f9745a);
        parcel.writeStringList(this.f9746b);
        parcel.writeTypedArray(this.f9747c, i8);
        parcel.writeInt(this.f9748d);
        parcel.writeString(this.f9749e);
        parcel.writeStringList(this.f9750f);
        parcel.writeTypedList(this.f9751g);
        parcel.writeTypedList(this.f9752h);
    }

    public o(Parcel parcel) {
        this.f9749e = null;
        this.f9750f = new ArrayList();
        this.f9751g = new ArrayList();
        this.f9745a = parcel.createTypedArrayList(u.CREATOR);
        this.f9746b = parcel.createStringArrayList();
        this.f9747c = (C1007b[]) parcel.createTypedArray(C1007b.CREATOR);
        this.f9748d = parcel.readInt();
        this.f9749e = parcel.readString();
        this.f9750f = parcel.createStringArrayList();
        this.f9751g = parcel.createTypedArrayList(Bundle.CREATOR);
        this.f9752h = parcel.createTypedArrayList(FragmentManager.n.CREATOR);
    }
}
