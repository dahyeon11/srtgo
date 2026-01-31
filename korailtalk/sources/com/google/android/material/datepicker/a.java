package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0198a();

    /* renamed from: a, reason: collision with root package name */
    private final l f24654a;

    /* renamed from: b, reason: collision with root package name */
    private final l f24655b;

    /* renamed from: c, reason: collision with root package name */
    private final c f24656c;

    /* renamed from: d, reason: collision with root package name */
    private l f24657d;

    /* renamed from: e, reason: collision with root package name */
    private final int f24658e;

    /* renamed from: f, reason: collision with root package name */
    private final int f24659f;

    /* renamed from: com.google.android.material.datepicker.a$a, reason: collision with other inner class name */
    static class C0198a implements Parcelable.Creator {
        C0198a() {
        }

        @Override // android.os.Parcelable.Creator
        public a createFromParcel(Parcel parcel) {
            return new a((l) parcel.readParcelable(l.class.getClassLoader()), (l) parcel.readParcelable(l.class.getClassLoader()), (c) parcel.readParcelable(c.class.getClassLoader()), (l) parcel.readParcelable(l.class.getClassLoader()), null);
        }

        @Override // android.os.Parcelable.Creator
        public a[] newArray(int i8) {
            return new a[i8];
        }
    }

    public interface c extends Parcelable {
        boolean isValid(long j8);
    }

    /* synthetic */ a(l lVar, l lVar2, c cVar, l lVar3, C0198a c0198a) {
        this(lVar, lVar2, cVar, lVar3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f24654a.equals(aVar.f24654a) && this.f24655b.equals(aVar.f24655b) && Z.c.equals(this.f24657d, aVar.f24657d) && this.f24656c.equals(aVar.f24656c);
    }

    l f() {
        return this.f24655b;
    }

    int g() {
        return this.f24659f;
    }

    public c getDateValidator() {
        return this.f24656c;
    }

    l h() {
        return this.f24657d;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f24654a, this.f24655b, this.f24657d, this.f24656c});
    }

    l i() {
        return this.f24654a;
    }

    int j() {
        return this.f24658e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeParcelable(this.f24654a, 0);
        parcel.writeParcelable(this.f24655b, 0);
        parcel.writeParcelable(this.f24657d, 0);
        parcel.writeParcelable(this.f24656c, 0);
    }

    private a(l lVar, l lVar2, c cVar, l lVar3) {
        this.f24654a = lVar;
        this.f24655b = lVar2;
        this.f24657d = lVar3;
        this.f24656c = cVar;
        if (lVar3 != null && lVar.compareTo(lVar3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (lVar3 != null && lVar3.compareTo(lVar2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        this.f24659f = lVar.k(lVar2) + 1;
        this.f24658e = (lVar2.f24743c - lVar.f24743c) + 1;
    }

    public static final class b {

        /* renamed from: e, reason: collision with root package name */
        static final long f24660e = s.a(l.b(1900, 0).f24746f);

        /* renamed from: f, reason: collision with root package name */
        static final long f24661f = s.a(l.b(2100, 11).f24746f);

        /* renamed from: a, reason: collision with root package name */
        private long f24662a;

        /* renamed from: b, reason: collision with root package name */
        private long f24663b;

        /* renamed from: c, reason: collision with root package name */
        private Long f24664c;

        /* renamed from: d, reason: collision with root package name */
        private c f24665d;

        public b() {
            this.f24662a = f24660e;
            this.f24663b = f24661f;
            this.f24665d = f.from(Long.MIN_VALUE);
        }

        public a build() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f24665d);
            l lVarC = l.c(this.f24662a);
            l lVarC2 = l.c(this.f24663b);
            c cVar = (c) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            Long l8 = this.f24664c;
            return new a(lVarC, lVarC2, cVar, l8 == null ? null : l.c(l8.longValue()), null);
        }

        public b setEnd(long j8) {
            this.f24663b = j8;
            return this;
        }

        public b setOpenAt(long j8) {
            this.f24664c = Long.valueOf(j8);
            return this;
        }

        public b setStart(long j8) {
            this.f24662a = j8;
            return this;
        }

        public b setValidator(c cVar) {
            this.f24665d = cVar;
            return this;
        }

        b(a aVar) {
            this.f24662a = f24660e;
            this.f24663b = f24661f;
            this.f24665d = f.from(Long.MIN_VALUE);
            this.f24662a = aVar.f24654a.f24746f;
            this.f24663b = aVar.f24655b.f24746f;
            this.f24664c = Long.valueOf(aVar.f24657d.f24746f);
            this.f24665d = aVar.f24656c;
        }
    }
}
