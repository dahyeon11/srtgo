package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.q4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4031q4 {

    /* renamed from: c, reason: collision with root package name */
    private boolean f21848c;
    public final K1 zza;
    public G4 zzd;
    public C3461l4 zze;
    public int zzf;
    public int zzg;
    public int zzh;
    public int zzi;
    public final F4 zzb = new F4();
    public final C4099qh0 zzc = new C4099qh0();

    /* renamed from: a, reason: collision with root package name */
    private final C4099qh0 f21846a = new C4099qh0(1);

    /* renamed from: b, reason: collision with root package name */
    private final C4099qh0 f21847b = new C4099qh0();

    public C4031q4(K1 k12, G4 g42, C3461l4 c3461l4) {
        this.zza = k12;
        this.zzd = g42;
        this.zze = c3461l4;
        zzh(g42, c3461l4);
    }

    public final int zza() {
        int i8 = !this.f21848c ? this.zzd.zzg[this.zzf] : this.zzb.zzj[this.zzf] ? 1 : 0;
        return zzf() != null ? i8 | 1073741824 : i8;
    }

    public final int zzb() {
        return !this.f21848c ? this.zzd.zzd[this.zzf] : this.zzb.zzh[this.zzf];
    }

    public final int zzc(int i8, int i9) {
        C4099qh0 c4099qh0;
        E4 e4Zzf = zzf();
        if (e4Zzf == null) {
            return 0;
        }
        int i10 = e4Zzf.zzd;
        if (i10 != 0) {
            c4099qh0 = this.zzb.zzn;
        } else {
            byte[] bArr = e4Zzf.zze;
            int i11 = AbstractC2281am0.zza;
            C4099qh0 c4099qh02 = this.f21847b;
            int length = bArr.length;
            c4099qh02.zzI(bArr, length);
            c4099qh0 = this.f21847b;
            i10 = length;
        }
        boolean zZzb = this.zzb.zzb(this.zzf);
        boolean z8 = zZzb || i9 != 0;
        C4099qh0 c4099qh03 = this.f21846a;
        c4099qh03.zzM()[0] = (byte) ((true != z8 ? 0 : 128) | i10);
        c4099qh03.zzK(0);
        this.zza.zzr(this.f21846a, 1, 1);
        this.zza.zzr(c4099qh0, i10, 1);
        if (!z8) {
            return i10 + 1;
        }
        if (!zZzb) {
            this.zzc.zzH(8);
            C4099qh0 c4099qh04 = this.zzc;
            byte[] bArrZzM = c4099qh04.zzM();
            bArrZzM[0] = 0;
            bArrZzM[1] = 1;
            bArrZzM[2] = 0;
            bArrZzM[3] = (byte) i9;
            bArrZzM[4] = (byte) ((i8 >> 24) & 255);
            bArrZzM[5] = (byte) ((i8 >> 16) & 255);
            bArrZzM[6] = (byte) ((i8 >> 8) & 255);
            bArrZzM[7] = (byte) (i8 & 255);
            this.zza.zzr(c4099qh04, 8, 1);
            return i10 + 9;
        }
        int i12 = i10 + 1;
        C4099qh0 c4099qh05 = this.zzb.zzn;
        int iZzq = c4099qh05.zzq();
        c4099qh05.zzL(-2);
        int i13 = (iZzq * 6) + 2;
        if (i9 != 0) {
            this.zzc.zzH(i13);
            byte[] bArrZzM2 = this.zzc.zzM();
            c4099qh05.zzG(bArrZzM2, 0, i13);
            int i14 = (((bArrZzM2[2] & 255) << 8) | (bArrZzM2[3] & 255)) + i9;
            bArrZzM2[2] = (byte) ((i14 >> 8) & 255);
            bArrZzM2[3] = (byte) (i14 & 255);
            c4099qh05 = this.zzc;
        }
        this.zza.zzr(c4099qh05, i13, 1);
        return i12 + i13;
    }

    public final long zzd() {
        return !this.f21848c ? this.zzd.zzc[this.zzf] : this.zzb.zzf[this.zzh];
    }

    public final long zze() {
        if (!this.f21848c) {
            return this.zzd.zzf[this.zzf];
        }
        F4 f42 = this.zzb;
        return f42.zzi[this.zzf];
    }

    public final E4 zzf() {
        if (!this.f21848c) {
            return null;
        }
        F4 f42 = this.zzb;
        C3461l4 c3461l4 = f42.zza;
        int i8 = AbstractC2281am0.zza;
        int i9 = c3461l4.zza;
        E4 e4Zza = f42.zzm;
        if (e4Zza == null) {
            e4Zza = this.zzd.zza.zza(i9);
        }
        if (e4Zza == null || !e4Zza.zza) {
            return null;
        }
        return e4Zza;
    }

    public final void zzh(G4 g42, C3461l4 c3461l4) {
        this.zzd = g42;
        this.zze = c3461l4;
        this.zza.zzl(g42.zza.zzf);
        zzi();
    }

    public final void zzi() {
        F4 f42 = this.zzb;
        f42.zzd = 0;
        f42.zzp = 0L;
        f42.zzq = false;
        f42.zzk = false;
        f42.zzo = false;
        f42.zzm = null;
        this.zzf = 0;
        this.zzh = 0;
        this.zzg = 0;
        this.zzi = 0;
        this.f21848c = false;
    }

    public final boolean zzk() {
        this.zzf++;
        if (!this.f21848c) {
            return false;
        }
        int i8 = this.zzg + 1;
        this.zzg = i8;
        int[] iArr = this.zzb.zzg;
        int i9 = this.zzh;
        if (i8 != iArr[i9]) {
            return true;
        }
        this.zzh = i9 + 1;
        this.zzg = 0;
        return false;
    }
}
