package com.google.android.gms.internal.ads;

import android.net.Uri;

/* renamed from: com.google.android.gms.internal.ads.ew0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2759ew0 extends Dv0 {

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f18855e;

    /* renamed from: f, reason: collision with root package name */
    private Uri f18856f;

    /* renamed from: g, reason: collision with root package name */
    private int f18857g;

    /* renamed from: h, reason: collision with root package name */
    private int f18858h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f18859i;

    public C2759ew0(byte[] bArr) {
        super(false);
        F10.zzd(bArr.length > 0);
        this.f18855e = bArr;
    }

    @Override // com.google.android.gms.internal.ads.Dv0, com.google.android.gms.internal.ads.Ky0, com.google.android.gms.internal.ads.UL0
    public final int zza(byte[] bArr, int i8, int i9) {
        if (i9 == 0) {
            return 0;
        }
        int i10 = this.f18858h;
        if (i10 == 0) {
            return -1;
        }
        int iMin = Math.min(i9, i10);
        System.arraycopy(this.f18855e, this.f18857g, bArr, i8, iMin);
        this.f18857g += iMin;
        this.f18858h -= iMin;
        zzg(iMin);
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.Dv0, com.google.android.gms.internal.ads.Ky0
    public final long zzb(NB0 nb0) throws C3565lz0 {
        this.f18856f = nb0.zza;
        b(nb0);
        long j8 = nb0.zze;
        int length = this.f18855e.length;
        if (j8 > length) {
            throw new C3565lz0(2008);
        }
        int i8 = (int) j8;
        this.f18857g = i8;
        int i9 = length - i8;
        this.f18858h = i9;
        long j9 = nb0.zzf;
        if (j9 != -1) {
            this.f18858h = (int) Math.min(i9, j9);
        }
        this.f18859i = true;
        c(nb0);
        long j10 = nb0.zzf;
        return j10 != -1 ? j10 : this.f18858h;
    }

    @Override // com.google.android.gms.internal.ads.Dv0, com.google.android.gms.internal.ads.Ky0
    public final Uri zzc() {
        return this.f18856f;
    }

    @Override // com.google.android.gms.internal.ads.Dv0, com.google.android.gms.internal.ads.Ky0
    public final void zzd() {
        if (this.f18859i) {
            this.f18859i = false;
            a();
        }
        this.f18856f = null;
    }
}
