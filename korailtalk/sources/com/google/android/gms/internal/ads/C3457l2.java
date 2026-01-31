package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.l2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3457l2 implements InterfaceC2425c1 {
    public static final InterfaceC3227j1 zza = new InterfaceC3227j1() { // from class: com.google.android.gms.internal.ads.j2
        @Override // com.google.android.gms.internal.ads.InterfaceC3227j1
        public final /* synthetic */ InterfaceC2425c1[] zza(Uri uri, Map map) {
            return new InterfaceC2425c1[]{new C3457l2(0)};
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f20614a;

    /* renamed from: b, reason: collision with root package name */
    private final C4099qh0 f20615b;

    /* renamed from: c, reason: collision with root package name */
    private final C3341k1 f20616c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC2769f1 f20617d;

    /* renamed from: e, reason: collision with root package name */
    private K1 f20618e;

    /* renamed from: f, reason: collision with root package name */
    private int f20619f;

    /* renamed from: g, reason: collision with root package name */
    private C1735Ot f20620g;

    /* renamed from: h, reason: collision with root package name */
    private C3911p1 f20621h;

    /* renamed from: i, reason: collision with root package name */
    private int f20622i;

    /* renamed from: j, reason: collision with root package name */
    private int f20623j;

    /* renamed from: k, reason: collision with root package name */
    private C3116i2 f20624k;

    /* renamed from: l, reason: collision with root package name */
    private int f20625l;

    /* renamed from: m, reason: collision with root package name */
    private long f20626m;

    public C3457l2() {
        throw null;
    }

    private final long a(C4099qh0 c4099qh0, boolean z8) {
        boolean zZzc;
        this.f20621h.getClass();
        int iZzd = c4099qh0.zzd();
        while (iZzd <= c4099qh0.zze() - 16) {
            c4099qh0.zzK(iZzd);
            if (AbstractC3455l1.zzc(c4099qh0, this.f20621h, this.f20623j, this.f20616c)) {
                c4099qh0.zzK(iZzd);
                return this.f20616c.zza;
            }
            iZzd++;
        }
        if (!z8) {
            c4099qh0.zzK(iZzd);
            return -1L;
        }
        while (iZzd <= c4099qh0.zze() - this.f20622i) {
            c4099qh0.zzK(iZzd);
            try {
                zZzc = AbstractC3455l1.zzc(c4099qh0, this.f20621h, this.f20623j, this.f20616c);
            } catch (IndexOutOfBoundsException unused) {
                zZzc = false;
            }
            if (c4099qh0.zzd() <= c4099qh0.zze() && zZzc) {
                c4099qh0.zzK(iZzd);
                return this.f20616c.zza;
            }
            iZzd++;
        }
        c4099qh0.zzK(c4099qh0.zze());
        return -1L;
    }

    private final void b() {
        long j8 = this.f20626m * 1000000;
        C3911p1 c3911p1 = this.f20621h;
        int i8 = AbstractC2281am0.zza;
        this.f20618e.zzs(j8 / c3911p1.zze, 1, this.f20625l, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    public final int zzb(InterfaceC2540d1 interfaceC2540d1, C5050z1 c5050z1) throws C1901Sv, EOFException, InterruptedIOException {
        boolean zZzo;
        C1 b12;
        boolean z8;
        int i8 = this.f20619f;
        if (i8 == 0) {
            interfaceC2540d1.zzj();
            long jZze = interfaceC2540d1.zze();
            C1735Ot c1735OtZza = AbstractC3569m1.zza(interfaceC2540d1, true);
            ((Q0) interfaceC2540d1).zzo((int) (interfaceC2540d1.zze() - jZze), false);
            this.f20620g = c1735OtZza;
            this.f20619f = 1;
            return 0;
        }
        if (i8 == 1) {
            ((Q0) interfaceC2540d1).zzm(this.f20614a, 0, 42, false);
            interfaceC2540d1.zzj();
            this.f20619f = 2;
            return 0;
        }
        if (i8 == 2) {
            C4099qh0 c4099qh0 = new C4099qh0(4);
            ((Q0) interfaceC2540d1).zzn(c4099qh0.zzM(), 0, 4, false);
            if (c4099qh0.zzu() != 1716281667) {
                throw C1901Sv.zza("Failed to read FLAC stream marker.", null);
            }
            this.f20619f = 3;
            return 0;
        }
        if (i8 == 3) {
            C3911p1 c3911p1Zze = this.f20621h;
            do {
                interfaceC2540d1.zzj();
                C1755Pg0 c1755Pg0 = new C1755Pg0(new byte[4], 4);
                Q0 q02 = (Q0) interfaceC2540d1;
                q02.zzm(c1755Pg0.zza, 0, 4, false);
                zZzo = c1755Pg0.zzo();
                int iZzd = c1755Pg0.zzd(7);
                int iZzd2 = c1755Pg0.zzd(24) + 4;
                if (iZzd == 0) {
                    byte[] bArr = new byte[38];
                    q02.zzn(bArr, 0, 38, false);
                    c3911p1Zze = new C3911p1(bArr, 4);
                } else {
                    if (c3911p1Zze == null) {
                        throw new IllegalArgumentException();
                    }
                    if (iZzd == 3) {
                        C4099qh0 c4099qh02 = new C4099qh0(iZzd2);
                        q02.zzn(c4099qh02.zzM(), 0, iZzd2, false);
                        c3911p1Zze = c3911p1Zze.zzf(AbstractC3569m1.zzb(c4099qh02));
                    } else if (iZzd == 4) {
                        C4099qh0 c4099qh03 = new C4099qh0(iZzd2);
                        q02.zzn(c4099qh03.zzM(), 0, iZzd2, false);
                        c4099qh03.zzL(4);
                        c3911p1Zze = c3911p1Zze.zzg(Arrays.asList(Q1.zzc(c4099qh03, false, false).zzb));
                    } else if (iZzd == 6) {
                        C4099qh0 c4099qh04 = new C4099qh0(iZzd2);
                        q02.zzn(c4099qh04.zzM(), 0, iZzd2, false);
                        c4099qh04.zzL(4);
                        c3911p1Zze = c3911p1Zze.zze(AbstractC2394bl0.zzn(H2.zzb(c4099qh04)));
                    } else {
                        q02.zzo(iZzd2, false);
                    }
                }
                int i9 = AbstractC2281am0.zza;
                this.f20621h = c3911p1Zze;
            } while (!zZzo);
            c3911p1Zze.getClass();
            this.f20622i = Math.max(c3911p1Zze.zzc, 6);
            this.f20618e.zzl(this.f20621h.zzc(this.f20614a, this.f20620g));
            this.f20619f = 4;
            return 0;
        }
        if (i8 == 4) {
            interfaceC2540d1.zzj();
            C4099qh0 c4099qh05 = new C4099qh0(2);
            ((Q0) interfaceC2540d1).zzm(c4099qh05.zzM(), 0, 2, false);
            int iZzq = c4099qh05.zzq();
            if ((iZzq >> 2) != 16382) {
                interfaceC2540d1.zzj();
                throw C1901Sv.zza("First frame does not start with sync code.", null);
            }
            interfaceC2540d1.zzj();
            this.f20623j = iZzq;
            InterfaceC2769f1 interfaceC2769f1 = this.f20617d;
            int i10 = AbstractC2281am0.zza;
            long jZzf = interfaceC2540d1.zzf();
            long jZzd = interfaceC2540d1.zzd();
            C3911p1 c3911p1 = this.f20621h;
            c3911p1.getClass();
            if (c3911p1.zzk != null) {
                b12 = new C3683n1(c3911p1, jZzf);
            } else if (jZzd == -1 || c3911p1.zzj <= 0) {
                b12 = new B1(c3911p1.zza(), 0L);
            } else {
                C3116i2 c3116i2 = new C3116i2(c3911p1, this.f20623j, jZzf, jZzd);
                this.f20624k = c3116i2;
                b12 = c3116i2.zzb();
            }
            interfaceC2769f1.zzO(b12);
            this.f20619f = 5;
            return 0;
        }
        this.f20618e.getClass();
        C3911p1 c3911p12 = this.f20621h;
        c3911p12.getClass();
        C3116i2 c3116i22 = this.f20624k;
        if (c3116i22 != null && c3116i22.zze()) {
            return c3116i22.zza(interfaceC2540d1, c5050z1);
        }
        if (this.f20626m == -1) {
            this.f20626m = AbstractC3455l1.zzb(interfaceC2540d1, c3911p12);
            return 0;
        }
        C4099qh0 c4099qh06 = this.f20615b;
        int iZze = c4099qh06.zze();
        if (iZze < 32768) {
            int iZza = interfaceC2540d1.zza(c4099qh06.zzM(), iZze, 32768 - iZze);
            z8 = iZza == -1;
            if (!z8) {
                this.f20615b.zzJ(iZze + iZza);
            } else if (this.f20615b.zzb() == 0) {
                b();
                return -1;
            }
        } else {
            z8 = false;
        }
        C4099qh0 c4099qh07 = this.f20615b;
        int iZzd3 = c4099qh07.zzd();
        int i11 = this.f20625l;
        int i12 = this.f20622i;
        if (i11 < i12) {
            c4099qh07.zzL(Math.min(i12 - i11, c4099qh07.zzb()));
        }
        long jA = a(this.f20615b, z8);
        C4099qh0 c4099qh08 = this.f20615b;
        int iZzd4 = c4099qh08.zzd() - iZzd3;
        c4099qh08.zzK(iZzd3);
        H1.zzb(this.f20618e, this.f20615b, iZzd4);
        this.f20625l += iZzd4;
        if (jA != -1) {
            b();
            this.f20625l = 0;
            this.f20626m = jA;
        }
        C4099qh0 c4099qh09 = this.f20615b;
        if (c4099qh09.zzb() >= 16) {
            return 0;
        }
        int iZzb = c4099qh09.zzb();
        System.arraycopy(c4099qh09.zzM(), c4099qh09.zzd(), c4099qh09.zzM(), 0, iZzb);
        this.f20615b.zzK(0);
        this.f20615b.zzJ(iZzb);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    public final /* synthetic */ List zzc() {
        return AbstractC2394bl0.zzm();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    public final void zzd(InterfaceC2769f1 interfaceC2769f1) {
        this.f20617d = interfaceC2769f1;
        this.f20618e = interfaceC2769f1.zzw(0, 1);
        interfaceC2769f1.zzD();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    public final void zze(long j8, long j9) {
        if (j8 == 0) {
            this.f20619f = 0;
        } else {
            C3116i2 c3116i2 = this.f20624k;
            if (c3116i2 != null) {
                c3116i2.zzd(j9);
            }
        }
        this.f20626m = j9 != 0 ? -1L : 0L;
        this.f20625l = 0;
        this.f20615b.zzH(0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    public final boolean zzf(InterfaceC2540d1 interfaceC2540d1) throws EOFException, InterruptedIOException {
        AbstractC3569m1.zza(interfaceC2540d1, false);
        C4099qh0 c4099qh0 = new C4099qh0(4);
        ((Q0) interfaceC2540d1).zzm(c4099qh0.zzM(), 0, 4, false);
        return c4099qh0.zzu() == 1716281667;
    }

    public C3457l2(int i8) {
        this.f20614a = new byte[42];
        this.f20615b = new C4099qh0(new byte[32768], 0);
        this.f20616c = new C3341k1();
        this.f20619f = 0;
    }
}
