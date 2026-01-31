package c2;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import b2.InterfaceC1073b;
import j2.AbstractC5814a;
import j2.AbstractC5816c;

/* renamed from: c2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1089a extends AbstractC5814a {
    public static final Parcelable.Creator<C1089a> CREATOR = new d();

    /* renamed from: a, reason: collision with root package name */
    final int f11445a;

    /* renamed from: b, reason: collision with root package name */
    private int f11446b;

    /* renamed from: c, reason: collision with root package name */
    private Bundle f11447c;

    C1089a(int i8, int i9, Bundle bundle) {
        this.f11445a = i8;
        this.f11446b = i9;
        this.f11447c = bundle;
    }

    public int getType() {
        return this.f11446b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iBeginObjectHeader = AbstractC5816c.beginObjectHeader(parcel);
        AbstractC5816c.writeInt(parcel, 1, this.f11445a);
        AbstractC5816c.writeInt(parcel, 2, getType());
        AbstractC5816c.writeBundle(parcel, 3, this.f11447c, false);
        AbstractC5816c.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public C1089a(InterfaceC1073b interfaceC1073b) {
        this(1, interfaceC1073b.a(), interfaceC1073b.toBundle());
    }
}
