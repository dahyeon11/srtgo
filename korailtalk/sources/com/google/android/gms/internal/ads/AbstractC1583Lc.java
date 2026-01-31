package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Lc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1583Lc implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f14326a;

    /* renamed from: b, reason: collision with root package name */
    private final String f14327b;

    protected AbstractC1583Lc(IBinder iBinder, String str) {
        this.f14326a = iBinder;
        this.f14327b = str;
    }

    protected final Parcel a() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f14327b);
        return parcelObtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f14326a;
    }

    protected final Parcel b(int i8, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f14326a.transact(i8, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e8) {
                parcelObtain.recycle();
                throw e8;
            }
        } finally {
            parcel.recycle();
        }
    }

    protected final void c(int i8, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f14326a.transact(i8, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    protected final void d(int i8, Parcel parcel) {
        try {
            this.f14326a.transact(i8, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
