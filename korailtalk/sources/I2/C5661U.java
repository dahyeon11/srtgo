package i2;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import f2.C5392b;
import i2.InterfaceC5677j;
import j2.AbstractC5814a;
import j2.AbstractC5816c;

/* renamed from: i2.U, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5661U extends AbstractC5814a {
    public static final Parcelable.Creator<C5661U> CREATOR = new C5662V();

    /* renamed from: a, reason: collision with root package name */
    final int f31722a;

    /* renamed from: b, reason: collision with root package name */
    final IBinder f31723b;

    /* renamed from: c, reason: collision with root package name */
    private final C5392b f31724c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f31725d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f31726e;

    C5661U(int i8, IBinder iBinder, C5392b c5392b, boolean z8, boolean z9) {
        this.f31722a = i8;
        this.f31723b = iBinder;
        this.f31724c = c5392b;
        this.f31725d = z8;
        this.f31726e = z9;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5661U)) {
            return false;
        }
        C5661U c5661u = (C5661U) obj;
        return this.f31724c.equals(c5661u.f31724c) && AbstractC5681n.equal(zab(), c5661u.zab());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iBeginObjectHeader = AbstractC5816c.beginObjectHeader(parcel);
        AbstractC5816c.writeInt(parcel, 1, this.f31722a);
        AbstractC5816c.writeIBinder(parcel, 2, this.f31723b, false);
        AbstractC5816c.writeParcelable(parcel, 3, this.f31724c, i8, false);
        AbstractC5816c.writeBoolean(parcel, 4, this.f31725d);
        AbstractC5816c.writeBoolean(parcel, 5, this.f31726e);
        AbstractC5816c.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final C5392b zaa() {
        return this.f31724c;
    }

    public final InterfaceC5677j zab() {
        IBinder iBinder = this.f31723b;
        if (iBinder == null) {
            return null;
        }
        return InterfaceC5677j.a.asInterface(iBinder);
    }

    public final boolean zac() {
        return this.f31725d;
    }

    public final boolean zad() {
        return this.f31726e;
    }
}
