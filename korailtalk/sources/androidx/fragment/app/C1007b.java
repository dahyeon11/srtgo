package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.x;
import androidx.lifecycle.AbstractC1019h;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1007b implements Parcelable {
    public static final Parcelable.Creator<C1007b> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    final int[] f9631a;

    /* renamed from: b, reason: collision with root package name */
    final ArrayList f9632b;

    /* renamed from: c, reason: collision with root package name */
    final int[] f9633c;

    /* renamed from: d, reason: collision with root package name */
    final int[] f9634d;

    /* renamed from: e, reason: collision with root package name */
    final int f9635e;

    /* renamed from: f, reason: collision with root package name */
    final String f9636f;

    /* renamed from: g, reason: collision with root package name */
    final int f9637g;

    /* renamed from: h, reason: collision with root package name */
    final int f9638h;

    /* renamed from: i, reason: collision with root package name */
    final CharSequence f9639i;

    /* renamed from: j, reason: collision with root package name */
    final int f9640j;

    /* renamed from: k, reason: collision with root package name */
    final CharSequence f9641k;

    /* renamed from: l, reason: collision with root package name */
    final ArrayList f9642l;

    /* renamed from: m, reason: collision with root package name */
    final ArrayList f9643m;

    /* renamed from: n, reason: collision with root package name */
    final boolean f9644n;

    /* renamed from: androidx.fragment.app.b$a */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public C1007b createFromParcel(Parcel parcel) {
            return new C1007b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public C1007b[] newArray(int i8) {
            return new C1007b[i8];
        }
    }

    public C1007b(C1006a c1006a) {
        int size = c1006a.f9792c.size();
        this.f9631a = new int[size * 5];
        if (!c1006a.f9798i) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f9632b = new ArrayList(size);
        this.f9633c = new int[size];
        this.f9634d = new int[size];
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            x.a aVar = (x.a) c1006a.f9792c.get(i9);
            int i10 = i8 + 1;
            this.f9631a[i8] = aVar.f9809a;
            ArrayList arrayList = this.f9632b;
            Fragment fragment = aVar.f9810b;
            arrayList.add(fragment != null ? fragment.f9488f : null);
            int[] iArr = this.f9631a;
            iArr[i10] = aVar.f9811c;
            iArr[i8 + 2] = aVar.f9812d;
            int i11 = i8 + 4;
            iArr[i8 + 3] = aVar.f9813e;
            i8 += 5;
            iArr[i11] = aVar.f9814f;
            this.f9633c[i9] = aVar.f9815g.ordinal();
            this.f9634d[i9] = aVar.f9816h.ordinal();
        }
        this.f9635e = c1006a.f9797h;
        this.f9636f = c1006a.f9800k;
        this.f9637g = c1006a.f9630v;
        this.f9638h = c1006a.f9801l;
        this.f9639i = c1006a.f9802m;
        this.f9640j = c1006a.f9803n;
        this.f9641k = c1006a.f9804o;
        this.f9642l = c1006a.f9805p;
        this.f9643m = c1006a.f9806q;
        this.f9644n = c1006a.f9807r;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public C1006a instantiate(FragmentManager fragmentManager) {
        C1006a c1006a = new C1006a(fragmentManager);
        int i8 = 0;
        int i9 = 0;
        while (i8 < this.f9631a.length) {
            x.a aVar = new x.a();
            int i10 = i8 + 1;
            aVar.f9809a = this.f9631a[i8];
            if (FragmentManager.x0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Instantiate ");
                sb.append(c1006a);
                sb.append(" op #");
                sb.append(i9);
                sb.append(" base fragment #");
                sb.append(this.f9631a[i10]);
            }
            String str = (String) this.f9632b.get(i9);
            if (str != null) {
                aVar.f9810b = fragmentManager.c0(str);
            } else {
                aVar.f9810b = null;
            }
            aVar.f9815g = AbstractC1019h.b.values()[this.f9633c[i9]];
            aVar.f9816h = AbstractC1019h.b.values()[this.f9634d[i9]];
            int[] iArr = this.f9631a;
            int i11 = iArr[i10];
            aVar.f9811c = i11;
            int i12 = iArr[i8 + 2];
            aVar.f9812d = i12;
            int i13 = i8 + 4;
            int i14 = iArr[i8 + 3];
            aVar.f9813e = i14;
            i8 += 5;
            int i15 = iArr[i13];
            aVar.f9814f = i15;
            c1006a.f9793d = i11;
            c1006a.f9794e = i12;
            c1006a.f9795f = i14;
            c1006a.f9796g = i15;
            c1006a.b(aVar);
            i9++;
        }
        c1006a.f9797h = this.f9635e;
        c1006a.f9800k = this.f9636f;
        c1006a.f9630v = this.f9637g;
        c1006a.f9798i = true;
        c1006a.f9801l = this.f9638h;
        c1006a.f9802m = this.f9639i;
        c1006a.f9803n = this.f9640j;
        c1006a.f9804o = this.f9641k;
        c1006a.f9805p = this.f9642l;
        c1006a.f9806q = this.f9643m;
        c1006a.f9807r = this.f9644n;
        c1006a.e(1);
        return c1006a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeIntArray(this.f9631a);
        parcel.writeStringList(this.f9632b);
        parcel.writeIntArray(this.f9633c);
        parcel.writeIntArray(this.f9634d);
        parcel.writeInt(this.f9635e);
        parcel.writeString(this.f9636f);
        parcel.writeInt(this.f9637g);
        parcel.writeInt(this.f9638h);
        TextUtils.writeToParcel(this.f9639i, parcel, 0);
        parcel.writeInt(this.f9640j);
        TextUtils.writeToParcel(this.f9641k, parcel, 0);
        parcel.writeStringList(this.f9642l);
        parcel.writeStringList(this.f9643m);
        parcel.writeInt(this.f9644n ? 1 : 0);
    }

    public C1007b(Parcel parcel) {
        this.f9631a = parcel.createIntArray();
        this.f9632b = parcel.createStringArrayList();
        this.f9633c = parcel.createIntArray();
        this.f9634d = parcel.createIntArray();
        this.f9635e = parcel.readInt();
        this.f9636f = parcel.readString();
        this.f9637g = parcel.readInt();
        this.f9638h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f9639i = (CharSequence) creator.createFromParcel(parcel);
        this.f9640j = parcel.readInt();
        this.f9641k = (CharSequence) creator.createFromParcel(parcel);
        this.f9642l = parcel.createStringArrayList();
        this.f9643m = parcel.createStringArrayList();
        this.f9644n = parcel.readInt() != 0;
    }
}
