package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import j2.AbstractC5814a;
import j2.AbstractC5816c;
import java.io.InputStream;

/* renamed from: com.google.android.gms.internal.ads.ee, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2722ee extends AbstractC5814a {
    public static final Parcelable.Creator<C2722ee> CREATOR = new C2837fe();

    /* renamed from: a, reason: collision with root package name */
    private ParcelFileDescriptor f18794a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f18795b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f18796c;

    /* renamed from: d, reason: collision with root package name */
    private final long f18797d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f18798e;

    public C2722ee() {
        this(null, false, false, 0L, false);
    }

    final synchronized ParcelFileDescriptor b() {
        return this.f18794a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iBeginObjectHeader = AbstractC5816c.beginObjectHeader(parcel);
        AbstractC5816c.writeParcelable(parcel, 2, b(), i8, false);
        AbstractC5816c.writeBoolean(parcel, 3, zzd());
        AbstractC5816c.writeBoolean(parcel, 4, zzf());
        AbstractC5816c.writeLong(parcel, 5, zza());
        AbstractC5816c.writeBoolean(parcel, 6, zzg());
        AbstractC5816c.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final synchronized long zza() {
        return this.f18797d;
    }

    public final synchronized InputStream zzc() {
        if (this.f18794a == null) {
            return null;
        }
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(this.f18794a);
        this.f18794a = null;
        return autoCloseInputStream;
    }

    public final synchronized boolean zzd() {
        return this.f18795b;
    }

    public final synchronized boolean zze() {
        return this.f18794a != null;
    }

    public final synchronized boolean zzf() {
        return this.f18796c;
    }

    public final synchronized boolean zzg() {
        return this.f18798e;
    }

    public C2722ee(ParcelFileDescriptor parcelFileDescriptor, boolean z8, boolean z9, long j8, boolean z10) {
        this.f18794a = parcelFileDescriptor;
        this.f18795b = z8;
        this.f18796c = z9;
        this.f18797d = j8;
        this.f18798e = z10;
    }
}
