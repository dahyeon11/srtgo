package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.util.SparseArray;
import androidx.core.view.C0924a0;
import java.io.IOException;
import java.util.List;

/* loaded from: classes2.dex */
public final class UH0 implements OG0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3002h20 f16632a;

    /* renamed from: b, reason: collision with root package name */
    private final C3711nF f16633b;

    /* renamed from: c, reason: collision with root package name */
    private final C4055qG f16634c;

    /* renamed from: d, reason: collision with root package name */
    private final SH0 f16635d;

    /* renamed from: e, reason: collision with root package name */
    private final SparseArray f16636e;

    /* renamed from: f, reason: collision with root package name */
    private C1211Ca0 f16637f;

    /* renamed from: g, reason: collision with root package name */
    private InterfaceC3021hC f16638g;

    /* renamed from: h, reason: collision with root package name */
    private InterfaceC4721w70 f16639h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f16640i;

    public UH0(InterfaceC3002h20 interfaceC3002h20) {
        interfaceC3002h20.getClass();
        this.f16632a = interfaceC3002h20;
        this.f16637f = new C1211Ca0(AbstractC2281am0.zzy(), interfaceC3002h20, new A90() { // from class: com.google.android.gms.internal.ads.uH0
            @Override // com.google.android.gms.internal.ads.A90
            public final void zza(Object obj, L2 l22) {
            }
        });
        C3711nF c3711nF = new C3711nF();
        this.f16633b = c3711nF;
        this.f16634c = new C4055qG();
        this.f16635d = new SH0(c3711nF);
        this.f16636e = new SparseArray();
    }

    private final PG0 e(NM0 nm0) {
        this.f16638g.getClass();
        RG rgZza = nm0 == null ? null : this.f16635d.zza(nm0);
        if (nm0 != null && rgZza != null) {
            return b(rgZza, rgZza.zzn(nm0.zza, this.f16633b).zzd, nm0);
        }
        int iZzd = this.f16638g.zzd();
        RG rgZzn = this.f16638g.zzn();
        if (iZzd >= rgZzn.zzc()) {
            rgZzn = RG.zza;
        }
        return b(rgZzn, iZzd, null);
    }

    private final PG0 f(int i8, NM0 nm0) {
        InterfaceC3021hC interfaceC3021hC = this.f16638g;
        interfaceC3021hC.getClass();
        if (nm0 != null) {
            return this.f16635d.zza(nm0) != null ? e(nm0) : b(RG.zza, i8, nm0);
        }
        RG rgZzn = interfaceC3021hC.zzn();
        if (i8 >= rgZzn.zzc()) {
            rgZzn = RG.zza;
        }
        return b(rgZzn, i8, null);
    }

    private final PG0 g() {
        return e(this.f16635d.zzd());
    }

    private final PG0 h() {
        return e(this.f16635d.zze());
    }

    private final PG0 i(AbstractC2066Ww abstractC2066Ww) {
        NM0 nm0;
        return (!(abstractC2066Ww instanceof WE0) || (nm0 = ((WE0) abstractC2066Ww).zzj) == null) ? a() : e(nm0);
    }

    public static /* synthetic */ void zzV(UH0 uh0) {
        final PG0 pg0A = uh0.a();
        uh0.d(pg0A, 1028, new Z80() { // from class: com.google.android.gms.internal.ads.UG0
            @Override // com.google.android.gms.internal.ads.Z80
            public final void zza(Object obj) {
            }
        });
        uh0.f16637f.zze();
    }

    protected final PG0 a() {
        return e(this.f16635d.zzb());
    }

    protected final PG0 b(RG rg, int i8, NM0 nm0) {
        NM0 nm02 = true == rg.zzo() ? null : nm0;
        long jZza = this.f16632a.zza();
        boolean z8 = rg.equals(this.f16638g.zzn()) && i8 == this.f16638g.zzd();
        long jZzu = 0;
        if (nm02 == null || !nm02.zzb()) {
            if (z8) {
                jZzu = this.f16638g.zzj();
            } else if (!rg.zzo()) {
                long j8 = rg.zze(i8, this.f16634c, 0L).zzn;
                jZzu = AbstractC2281am0.zzu(0L);
            }
        } else if (z8 && this.f16638g.zzb() == nm02.zzb && this.f16638g.zzc() == nm02.zzc) {
            jZzu = this.f16638g.zzk();
        }
        return new PG0(jZza, rg, i8, nm02, jZzu, this.f16638g.zzn(), this.f16638g.zzd(), this.f16635d.zzb(), this.f16638g.zzk(), this.f16638g.zzm());
    }

    final /* synthetic */ void c(InterfaceC3021hC interfaceC3021hC, SG0 sg0, L2 l22) {
        sg0.zzi(interfaceC3021hC, new QG0(l22, this.f16636e));
    }

    protected final void d(PG0 pg0, int i8, Z80 z80) {
        this.f16636e.put(i8, pg0);
        C1211Ca0 c1211Ca0 = this.f16637f;
        c1211Ca0.zzd(i8, z80);
        c1211Ca0.zzc();
    }

    @Override // com.google.android.gms.internal.ads.OG0
    public final void zzA(final Q5 q52, final ME0 me0) {
        final PG0 pg0H = h();
        d(pg0H, C0924a0.TYPE_VERTICAL_TEXT, new Z80() { // from class: com.google.android.gms.internal.ads.HH0
            @Override // com.google.android.gms.internal.ads.Z80
            public final void zza(Object obj) {
                ((SG0) obj).zze(pg0H, q52, me0);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.OG0
    public final void zzB(final long j8) {
        final PG0 pg0H = h();
        d(pg0H, C0924a0.TYPE_ALIAS, new Z80(j8) { // from class: com.google.android.gms.internal.ads.kH0
            @Override // com.google.android.gms.internal.ads.Z80
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.OG0
    public final void zzC(final Exception exc) {
        final PG0 pg0H = h();
        d(pg0H, C0924a0.TYPE_HORIZONTAL_DOUBLE_ARROW, new Z80() { // from class: com.google.android.gms.internal.ads.PH0
            @Override // com.google.android.gms.internal.ads.Z80
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.OG0
    public final void zzD(final TJ0 tj0) {
        final PG0 pg0H = h();
        d(pg0H, 1031, new Z80() { // from class: com.google.android.gms.internal.ads.EH0
            @Override // com.google.android.gms.internal.ads.Z80
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.OG0
    public final void zzE(final TJ0 tj0) {
        final PG0 pg0H = h();
        d(pg0H, 1032, new Z80() { // from class: com.google.android.gms.internal.ads.OH0
            @Override // com.google.android.gms.internal.ads.Z80
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.OG0
    public final void zzF(final int i8, final long j8, final long j9) {
        final PG0 pg0H = h();
        d(pg0H, C0924a0.TYPE_COPY, new Z80(i8, j8, j9) { // from class: com.google.android.gms.internal.ads.gH0
            @Override // com.google.android.gms.internal.ads.Z80
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.OG0
    public final void zzG(final int i8, final long j8) {
        final PG0 pg0G = g();
        d(pg0G, C0924a0.TYPE_ZOOM_IN, new Z80() { // from class: com.google.android.gms.internal.ads.qH0
            @Override // com.google.android.gms.internal.ads.Z80
            public final void zza(Object obj) {
                ((SG0) obj).zzh(pg0G, i8, j8);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.OG0
    public final void zzH(final Object obj, final long j8) {
        final PG0 pg0H = h();
        d(pg0H, 26, new Z80() { // from class: com.google.android.gms.internal.ads.LH0
            @Override // com.google.android.gms.internal.ads.Z80
            public final void zza(Object obj2) {
                ((SG0) obj2).zzn(pg0H, obj, j8);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.OG0
    public final void zzI(final Exception exc) {
        final PG0 pg0H = h();
        d(pg0H, 1030, new Z80() { // from class: com.google.android.gms.internal.ads.fH0
            @Override // com.google.android.gms.internal.ads.Z80
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.OG0
    public final void zzJ(final String str, final long j8, final long j9) {
        final PG0 pg0H = h();
        d(pg0H, C0924a0.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW, new Z80(str, j9, j8) { // from class: com.google.android.gms.internal.ads.NH0
            public final /* synthetic */ String zzb;

            @Override // com.google.android.gms.internal.ads.Z80
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.OG0
    public final void zzK(final String str) {
        final PG0 pg0H = h();
        d(pg0H, C0924a0.TYPE_ZOOM_OUT, new Z80() { // from class: com.google.android.gms.internal.ads.pH0
            @Override // com.google.android.gms.internal.ads.Z80
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.OG0
    public final void zzL(final LE0 le0) {
        final PG0 pg0G = g();
        d(pg0G, C0924a0.TYPE_GRAB, new Z80() { // from class: com.google.android.gms.internal.ads.DH0
            @Override // com.google.android.gms.internal.ads.Z80
            public final void zza(Object obj) {
                ((SG0) obj).zzo(pg0G, le0);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.OG0
    public final void zzM(final LE0 le0) {
        final PG0 pg0H = h();
        d(pg0H, C0924a0.TYPE_VERTICAL_DOUBLE_ARROW, new Z80() { // from class: com.google.android.gms.internal.ads.JH0
            @Override // com.google.android.gms.internal.ads.Z80
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.OG0
    public final void zzN(final long j8, final int i8) {
        final PG0 pg0G = g();
        d(pg0G, C0924a0.TYPE_GRABBING, new Z80(j8, i8) { // from class: com.google.android.gms.internal.ads.vH0
            @Override // com.google.android.gms.internal.ads.Z80
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.OG0
    public final void zzO(final Q5 q52, final ME0 me0) {
        final PG0 pg0H = h();
        d(pg0H, C0924a0.TYPE_TOP_LEFT_DIAGONAL_DOUBLE_ARROW, new Z80() { // from class: com.google.android.gms.internal.ads.CH0
            @Override // com.google.android.gms.internal.ads.Z80
            public final void zza(Object obj) {
                ((SG0) obj).zzp(pg0H, q52, me0);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.OG0
    public final void zzP() {
        InterfaceC4721w70 interfaceC4721w70 = this.f16639h;
        F10.zzb(interfaceC4721w70);
        interfaceC4721w70.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.KH0
            @Override // java.lang.Runnable
            public final void run() {
                UH0.zzV(this.zza);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.OG0
    public final void zzQ(SG0 sg0) {
        this.f16637f.zzf(sg0);
    }

    @Override // com.google.android.gms.internal.ads.OG0
    public final void zzR(final InterfaceC3021hC interfaceC3021hC, Looper looper) {
        boolean z8 = true;
        if (this.f16638g != null && !this.f16635d.f16233b.isEmpty()) {
            z8 = false;
        }
        F10.zzf(z8);
        interfaceC3021hC.getClass();
        this.f16638g = interfaceC3021hC;
        this.f16639h = this.f16632a.zzb(looper, null);
        this.f16637f = this.f16637f.zza(looper, new A90() { // from class: com.google.android.gms.internal.ads.iH0
            @Override // com.google.android.gms.internal.ads.A90
            public final void zza(Object obj, L2 l22) {
                this.zza.c(interfaceC3021hC, (SG0) obj, l22);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.OG0
    public final void zzS(List list, NM0 nm0) {
        InterfaceC3021hC interfaceC3021hC = this.f16638g;
        interfaceC3021hC.getClass();
        this.f16635d.zzh(list, nm0, interfaceC3021hC);
    }

    @Override // com.google.android.gms.internal.ads.OG0, com.google.android.gms.internal.ads.InterfaceC2474cP0
    public final void zzX(final int i8, final long j8, final long j9) {
        final PG0 pg0E = e(this.f16635d.zzc());
        d(pg0E, C0924a0.TYPE_CELL, new Z80() { // from class: com.google.android.gms.internal.ads.dH0
            @Override // com.google.android.gms.internal.ads.Z80
            public final void zza(Object obj) {
                ((SG0) obj).zzf(pg0E, i8, j8, j9);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.OG0, com.google.android.gms.internal.ads.EA
    public final void zza(final C2558dA c2558dA) {
        final PG0 pg0A = a();
        d(pg0A, 13, new Z80() { // from class: com.google.android.gms.internal.ads.ZG0
            @Override // com.google.android.gms.internal.ads.Z80
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.OG0, com.google.android.gms.internal.ads.XM0
    public final void zzae(int i8, NM0 nm0, final JM0 jm0) {
        final PG0 pg0F = f(i8, nm0);
        d(pg0F, 1004, new Z80() { // from class: com.google.android.gms.internal.ads.wH0
            @Override // com.google.android.gms.internal.ads.Z80
            public final void zza(Object obj) {
                ((SG0) obj).zzg(pg0F, jm0);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.OG0, com.google.android.gms.internal.ads.XM0
    public final void zzaf(int i8, NM0 nm0, final EM0 em0, final JM0 jm0) {
        final PG0 pg0F = f(i8, nm0);
        d(pg0F, 1002, new Z80() { // from class: com.google.android.gms.internal.ads.xH0
            @Override // com.google.android.gms.internal.ads.Z80
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.OG0, com.google.android.gms.internal.ads.XM0
    public final void zzag(int i8, NM0 nm0, final EM0 em0, final JM0 jm0) {
        final PG0 pg0F = f(i8, nm0);
        d(pg0F, 1001, new Z80() { // from class: com.google.android.gms.internal.ads.BH0
            @Override // com.google.android.gms.internal.ads.Z80
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.OG0, com.google.android.gms.internal.ads.XM0
    public final void zzah(int i8, NM0 nm0, final EM0 em0, final JM0 jm0, final IOException iOException, final boolean z8) {
        final PG0 pg0F = f(i8, nm0);
        d(pg0F, 1003, new Z80() { // from class: com.google.android.gms.internal.ads.hH0
            @Override // com.google.android.gms.internal.ads.Z80
            public final void zza(Object obj) {
                ((SG0) obj).zzj(pg0F, em0, jm0, iOException, z8);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.OG0, com.google.android.gms.internal.ads.XM0
    public final void zzai(int i8, NM0 nm0, final EM0 em0, final JM0 jm0) {
        final PG0 pg0F = f(i8, nm0);
        d(pg0F, 1000, new Z80() { // from class: com.google.android.gms.internal.ads.YG0
            @Override // com.google.android.gms.internal.ads.Z80
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.OG0, com.google.android.gms.internal.ads.EA
    public final void zzb(final boolean z8) {
        final PG0 pg0A = a();
        d(pg0A, 3, new Z80(z8) { // from class: com.google.android.gms.internal.ads.WG0
            @Override // com.google.android.gms.internal.ads.Z80
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.OG0, com.google.android.gms.internal.ads.EA
    public final void zzc(final boolean z8) {
        final PG0 pg0A = a();
        d(pg0A, 7, new Z80(z8) { // from class: com.google.android.gms.internal.ads.lH0
            @Override // com.google.android.gms.internal.ads.Z80
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.OG0, com.google.android.gms.internal.ads.EA
    public final void zzd(final C3658mp c3658mp, final int i8) {
        final PG0 pg0A = a();
        d(pg0A, 1, new Z80(c3658mp, i8) { // from class: com.google.android.gms.internal.ads.bH0
            public final /* synthetic */ C3658mp zzb;

            @Override // com.google.android.gms.internal.ads.Z80
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.OG0, com.google.android.gms.internal.ads.EA
    public final void zze(final C3550ls c3550ls) {
        final PG0 pg0A = a();
        d(pg0A, 14, new Z80() { // from class: com.google.android.gms.internal.ads.QH0
            @Override // com.google.android.gms.internal.ads.Z80
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.OG0, com.google.android.gms.internal.ads.EA
    public final void zzf(final boolean z8, final int i8) {
        final PG0 pg0A = a();
        d(pg0A, 5, new Z80(z8, i8) { // from class: com.google.android.gms.internal.ads.tH0
            @Override // com.google.android.gms.internal.ads.Z80
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.OG0, com.google.android.gms.internal.ads.EA
    public final void zzg(final C2149Yx c2149Yx) {
        final PG0 pg0A = a();
        d(pg0A, 12, new Z80() { // from class: com.google.android.gms.internal.ads.TG0
            @Override // com.google.android.gms.internal.ads.Z80
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.OG0, com.google.android.gms.internal.ads.EA
    public final void zzh(final int i8) {
        final PG0 pg0A = a();
        d(pg0A, 4, new Z80() { // from class: com.google.android.gms.internal.ads.AH0
            @Override // com.google.android.gms.internal.ads.Z80
            public final void zza(Object obj) {
                ((SG0) obj).zzk(pg0A, i8);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.OG0, com.google.android.gms.internal.ads.EA
    public final void zzi(final int i8) {
        final PG0 pg0A = a();
        d(pg0A, 6, new Z80(i8) { // from class: com.google.android.gms.internal.ads.oH0
            @Override // com.google.android.gms.internal.ads.Z80
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.OG0, com.google.android.gms.internal.ads.EA
    public final void zzj(final AbstractC2066Ww abstractC2066Ww) {
        final PG0 pg0I = i(abstractC2066Ww);
        d(pg0I, 10, new Z80() { // from class: com.google.android.gms.internal.ads.yH0
            @Override // com.google.android.gms.internal.ads.Z80
            public final void zza(Object obj) {
                ((SG0) obj).zzl(pg0I, abstractC2066Ww);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.OG0, com.google.android.gms.internal.ads.EA
    public final void zzk(final AbstractC2066Ww abstractC2066Ww) {
        final PG0 pg0I = i(abstractC2066Ww);
        d(pg0I, 10, new Z80() { // from class: com.google.android.gms.internal.ads.rH0
            @Override // com.google.android.gms.internal.ads.Z80
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.OG0, com.google.android.gms.internal.ads.EA
    public final void zzl(final boolean z8, final int i8) {
        final PG0 pg0A = a();
        d(pg0A, -1, new Z80(z8, i8) { // from class: com.google.android.gms.internal.ads.jH0
            @Override // com.google.android.gms.internal.ads.Z80
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.OG0, com.google.android.gms.internal.ads.EA
    public final void zzm(final GB gb, final GB gb2, final int i8) {
        if (i8 == 1) {
            this.f16640i = false;
            i8 = 1;
        }
        SH0 sh0 = this.f16635d;
        InterfaceC3021hC interfaceC3021hC = this.f16638g;
        interfaceC3021hC.getClass();
        sh0.zzg(interfaceC3021hC);
        final PG0 pg0A = a();
        d(pg0A, 11, new Z80() { // from class: com.google.android.gms.internal.ads.IH0
            @Override // com.google.android.gms.internal.ads.Z80
            public final void zza(Object obj) {
                ((SG0) obj).zzm(pg0A, gb, gb2, i8);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.OG0, com.google.android.gms.internal.ads.EA
    public final void zzn(final boolean z8) {
        final PG0 pg0H = h();
        d(pg0H, 23, new Z80(z8) { // from class: com.google.android.gms.internal.ads.cH0
            @Override // com.google.android.gms.internal.ads.Z80
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.OG0, com.google.android.gms.internal.ads.EA
    public final void zzo(final int i8, final int i9) {
        final PG0 pg0H = h();
        d(pg0H, 24, new Z80(i8, i9) { // from class: com.google.android.gms.internal.ads.RH0
            @Override // com.google.android.gms.internal.ads.Z80
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.OG0, com.google.android.gms.internal.ads.EA
    public final void zzp(RG rg, final int i8) {
        InterfaceC3021hC interfaceC3021hC = this.f16638g;
        interfaceC3021hC.getClass();
        this.f16635d.zzi(interfaceC3021hC);
        final PG0 pg0A = a();
        d(pg0A, 0, new Z80(i8) { // from class: com.google.android.gms.internal.ads.aH0
            @Override // com.google.android.gms.internal.ads.Z80
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.OG0, com.google.android.gms.internal.ads.EA
    public final void zzq(final CN cn) {
        final PG0 pg0A = a();
        d(pg0A, 2, new Z80() { // from class: com.google.android.gms.internal.ads.mH0
            @Override // com.google.android.gms.internal.ads.Z80
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.OG0, com.google.android.gms.internal.ads.EA
    public final void zzr(final IQ iq) {
        final PG0 pg0H = h();
        d(pg0H, 25, new Z80() { // from class: com.google.android.gms.internal.ads.FH0
            @Override // com.google.android.gms.internal.ads.Z80
            public final void zza(Object obj) {
                PG0 pg0 = pg0H;
                IQ iq2 = iq;
                ((SG0) obj).zzq(pg0, iq2);
                int i8 = iq2.zzc;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.OG0, com.google.android.gms.internal.ads.EA
    public final void zzs(final float f8) {
        final PG0 pg0H = h();
        d(pg0H, 22, new Z80(f8) { // from class: com.google.android.gms.internal.ads.eH0
            @Override // com.google.android.gms.internal.ads.Z80
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.OG0
    public final void zzt(SG0 sg0) {
        this.f16637f.zzb(sg0);
    }

    @Override // com.google.android.gms.internal.ads.OG0
    public final void zzu() {
        if (this.f16640i) {
            return;
        }
        final PG0 pg0A = a();
        this.f16640i = true;
        d(pg0A, -1, new Z80() { // from class: com.google.android.gms.internal.ads.GH0
            @Override // com.google.android.gms.internal.ads.Z80
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.OG0
    public final void zzv(final Exception exc) {
        final PG0 pg0H = h();
        d(pg0H, 1029, new Z80() { // from class: com.google.android.gms.internal.ads.MH0
            @Override // com.google.android.gms.internal.ads.Z80
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.OG0
    public final void zzw(final String str, final long j8, final long j9) {
        final PG0 pg0H = h();
        d(pg0H, C0924a0.TYPE_TEXT, new Z80(str, j9, j8) { // from class: com.google.android.gms.internal.ads.nH0
            public final /* synthetic */ String zzb;

            @Override // com.google.android.gms.internal.ads.Z80
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.OG0
    public final void zzx(final String str) {
        final PG0 pg0H = h();
        d(pg0H, C0924a0.TYPE_NO_DROP, new Z80() { // from class: com.google.android.gms.internal.ads.XG0
            @Override // com.google.android.gms.internal.ads.Z80
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.OG0
    public final void zzy(final LE0 le0) {
        final PG0 pg0G = g();
        d(pg0G, C0924a0.TYPE_ALL_SCROLL, new Z80() { // from class: com.google.android.gms.internal.ads.zH0
            @Override // com.google.android.gms.internal.ads.Z80
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.OG0
    public final void zzz(final LE0 le0) {
        final PG0 pg0H = h();
        d(pg0H, C0924a0.TYPE_CROSSHAIR, new Z80() { // from class: com.google.android.gms.internal.ads.VG0
            @Override // com.google.android.gms.internal.ads.Z80
            public final void zza(Object obj) {
            }
        });
    }
}
