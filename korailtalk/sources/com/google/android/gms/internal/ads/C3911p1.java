package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.p1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3911p1 {

    /* renamed from: a, reason: collision with root package name */
    private final C1735Ot f21612a;
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final long zzj;
    public final C3797o1 zzk;

    private C3911p1(int i8, int i9, int i10, int i11, int i12, int i13, int i14, long j8, C3797o1 c3797o1, C1735Ot c1735Ot) {
        this.zza = i8;
        this.zzb = i9;
        this.zzc = i10;
        this.zzd = i11;
        this.zze = i12;
        this.zzf = b(i12);
        this.zzg = i13;
        this.zzh = i14;
        this.zzi = a(i14);
        this.zzj = j8;
        this.zzk = c3797o1;
        this.f21612a = c1735Ot;
    }

    private static int a(int i8) {
        if (i8 == 8) {
            return 1;
        }
        if (i8 == 12) {
            return 2;
        }
        if (i8 == 16) {
            return 4;
        }
        if (i8 != 20) {
            return i8 != 24 ? -1 : 6;
        }
        return 5;
    }

    private static int b(int i8) {
        switch (i8) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long zza() {
        long j8 = this.zzj;
        if (j8 == 0) {
            return -9223372036854775807L;
        }
        return (j8 * 1000000) / this.zze;
    }

    public final long zzb(long j8) {
        return Math.max(0L, Math.min((j8 * this.zze) / 1000000, this.zzj - 1));
    }

    public final Q5 zzc(byte[] bArr, C1735Ot c1735Ot) {
        bArr[4] = -128;
        C1735Ot c1735OtZzd = zzd(c1735Ot);
        O4 o42 = new O4();
        o42.zzX("audio/flac");
        int i8 = this.zzd;
        if (i8 <= 0) {
            i8 = -1;
        }
        o42.zzP(i8);
        o42.zzy(this.zzg);
        o42.zzY(this.zze);
        o42.zzR(AbstractC2281am0.zzl(this.zzh));
        o42.zzL(Collections.singletonList(bArr));
        o42.zzQ(c1735OtZzd);
        return o42.zzad();
    }

    public final C1735Ot zzd(C1735Ot c1735Ot) {
        C1735Ot c1735Ot2 = this.f21612a;
        return c1735Ot2 == null ? c1735Ot : c1735Ot2.zzd(c1735Ot);
    }

    public final C3911p1 zze(List list) {
        return new C3911p1(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, this.zzk, zzd(new C1735Ot(list)));
    }

    public final C3911p1 zzf(C3797o1 c3797o1) {
        return new C3911p1(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, c3797o1, this.f21612a);
    }

    public final C3911p1 zzg(List list) {
        return new C3911p1(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, this.zzk, zzd(Q1.zzb(list)));
    }

    public C3911p1(byte[] bArr, int i8) {
        C1755Pg0 c1755Pg0 = new C1755Pg0(bArr, bArr.length);
        c1755Pg0.zzk(i8 * 8);
        this.zza = c1755Pg0.zzd(16);
        this.zzb = c1755Pg0.zzd(16);
        this.zzc = c1755Pg0.zzd(24);
        this.zzd = c1755Pg0.zzd(24);
        int iZzd = c1755Pg0.zzd(20);
        this.zze = iZzd;
        this.zzf = b(iZzd);
        this.zzg = c1755Pg0.zzd(3) + 1;
        int iZzd2 = c1755Pg0.zzd(5) + 1;
        this.zzh = iZzd2;
        this.zzi = a(iZzd2);
        int iZzd3 = c1755Pg0.zzd(4);
        int iZzd4 = c1755Pg0.zzd(32);
        int i9 = AbstractC2281am0.zza;
        this.zzj = ((iZzd3 & 4294967295L) << 32) | (iZzd4 & 4294967295L);
        this.zzk = null;
        this.f21612a = null;
    }
}
