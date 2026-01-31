package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import j2.AbstractC5814a;
import j2.AbstractC5816c;

/* renamed from: com.google.android.gms.internal.ads.Hg0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1428Hg0 extends AbstractC5814a {
    public static final Parcelable.Creator<C1428Hg0> CREATOR = new C1469Ig0();

    /* renamed from: a, reason: collision with root package name */
    private O9 f13346a = null;

    /* renamed from: b, reason: collision with root package name */
    private byte[] f13347b;
    public final int zza;

    C1428Hg0(int i8, byte[] bArr) {
        this.zza = i8;
        this.f13347b = bArr;
        b();
    }

    private final void b() {
        O9 o9 = this.f13346a;
        if (o9 != null || this.f13347b == null) {
            if (o9 == null || this.f13347b != null) {
                if (o9 != null && this.f13347b != null) {
                    throw new IllegalStateException("Invalid internal representation - full");
                }
                if (o9 != null || this.f13347b != null) {
                    throw new IllegalStateException("Impossible");
                }
                throw new IllegalStateException("Invalid internal representation - empty");
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.zza;
        int iBeginObjectHeader = AbstractC5816c.beginObjectHeader(parcel);
        AbstractC5816c.writeInt(parcel, 1, i9);
        byte[] bArrZzaV = this.f13347b;
        if (bArrZzaV == null) {
            bArrZzaV = this.f13346a.zzaV();
        }
        AbstractC5816c.writeByteArray(parcel, 2, bArrZzaV, false);
        AbstractC5816c.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final O9 zza() {
        if (this.f13346a == null) {
            try {
                this.f13346a = O9.zzf(this.f13347b, Iy0.zza());
                this.f13347b = null;
            } catch (C4021pz0 | NullPointerException e8) {
                throw new IllegalStateException(e8);
            }
        }
        b();
        return this.f13346a;
    }
}
