package i2;

import android.os.Parcel;
import android.os.Parcelable;
import j2.AbstractC5814a;
import j2.AbstractC5816c;

/* renamed from: i2.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5680m extends AbstractC5814a {
    public static final Parcelable.Creator<C5680m> CREATOR = new C5653L();

    /* renamed from: a, reason: collision with root package name */
    private final int f31821a;

    /* renamed from: b, reason: collision with root package name */
    private final int f31822b;

    /* renamed from: c, reason: collision with root package name */
    private final int f31823c;

    /* renamed from: d, reason: collision with root package name */
    private final long f31824d;

    /* renamed from: e, reason: collision with root package name */
    private final long f31825e;

    /* renamed from: f, reason: collision with root package name */
    private final String f31826f;

    /* renamed from: g, reason: collision with root package name */
    private final String f31827g;

    /* renamed from: h, reason: collision with root package name */
    private final int f31828h;

    /* renamed from: i, reason: collision with root package name */
    private final int f31829i;

    @Deprecated
    public C5680m(int i8, int i9, int i10, long j8, long j9, String str, String str2, int i11) {
        this(i8, i9, i10, j8, j9, str, str2, i11, -1);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iBeginObjectHeader = AbstractC5816c.beginObjectHeader(parcel);
        AbstractC5816c.writeInt(parcel, 1, this.f31821a);
        AbstractC5816c.writeInt(parcel, 2, this.f31822b);
        AbstractC5816c.writeInt(parcel, 3, this.f31823c);
        AbstractC5816c.writeLong(parcel, 4, this.f31824d);
        AbstractC5816c.writeLong(parcel, 5, this.f31825e);
        AbstractC5816c.writeString(parcel, 6, this.f31826f, false);
        AbstractC5816c.writeString(parcel, 7, this.f31827g, false);
        AbstractC5816c.writeInt(parcel, 8, this.f31828h);
        AbstractC5816c.writeInt(parcel, 9, this.f31829i);
        AbstractC5816c.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public C5680m(int i8, int i9, int i10, long j8, long j9, String str, String str2, int i11, int i12) {
        this.f31821a = i8;
        this.f31822b = i9;
        this.f31823c = i10;
        this.f31824d = j8;
        this.f31825e = j9;
        this.f31826f = str;
        this.f31827g = str2;
        this.f31828h = i11;
        this.f31829i = i12;
    }
}
