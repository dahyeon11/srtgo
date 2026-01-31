package com.google.android.gms.internal.ads;

import java.util.Collections;

/* loaded from: classes2.dex */
public final class H6 implements InterfaceC4490u6 {

    /* renamed from: a, reason: collision with root package name */
    private final String f13256a;

    /* renamed from: b, reason: collision with root package name */
    private final int f13257b;

    /* renamed from: c, reason: collision with root package name */
    private final C4099qh0 f13258c;

    /* renamed from: d, reason: collision with root package name */
    private final C1755Pg0 f13259d;

    /* renamed from: e, reason: collision with root package name */
    private K1 f13260e;

    /* renamed from: f, reason: collision with root package name */
    private String f13261f;

    /* renamed from: g, reason: collision with root package name */
    private Q5 f13262g;

    /* renamed from: h, reason: collision with root package name */
    private int f13263h;

    /* renamed from: i, reason: collision with root package name */
    private int f13264i;

    /* renamed from: j, reason: collision with root package name */
    private int f13265j;

    /* renamed from: k, reason: collision with root package name */
    private int f13266k;

    /* renamed from: l, reason: collision with root package name */
    private long f13267l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f13268m;

    /* renamed from: n, reason: collision with root package name */
    private int f13269n;

    /* renamed from: o, reason: collision with root package name */
    private int f13270o;

    /* renamed from: p, reason: collision with root package name */
    private int f13271p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f13272q;

    /* renamed from: r, reason: collision with root package name */
    private long f13273r;

    /* renamed from: s, reason: collision with root package name */
    private int f13274s;

    /* renamed from: t, reason: collision with root package name */
    private long f13275t;

    /* renamed from: u, reason: collision with root package name */
    private int f13276u;

    /* renamed from: v, reason: collision with root package name */
    private String f13277v;

    public H6(String str, int i8) {
        this.f13256a = str;
        this.f13257b = i8;
        C4099qh0 c4099qh0 = new C4099qh0(1024);
        this.f13258c = c4099qh0;
        byte[] bArrZzM = c4099qh0.zzM();
        this.f13259d = new C1755Pg0(bArrZzM, bArrZzM.length);
        this.f13267l = -9223372036854775807L;
    }

    private final int a(C1755Pg0 c1755Pg0) throws C1901Sv {
        int iZza = c1755Pg0.zza();
        C4706w0 c4706w0Zzb = AbstractC4820x0.zzb(c1755Pg0, true);
        this.f13277v = c4706w0Zzb.zzc;
        this.f13274s = c4706w0Zzb.zza;
        this.f13276u = c4706w0Zzb.zzb;
        return iZza - c1755Pg0.zza();
    }

    private static long b(C1755Pg0 c1755Pg0) {
        return c1755Pg0.zzd((c1755Pg0.zzd(2) + 1) * 8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4490u6
    public final void zza(C4099qh0 c4099qh0) throws C1901Sv {
        int i8;
        int i9;
        int iZzd;
        boolean zZzo;
        F10.zzb(this.f13260e);
        while (c4099qh0.zzb() > 0) {
            int i10 = this.f13263h;
            if (i10 != 0) {
                if (i10 == 1) {
                    int iZzm = c4099qh0.zzm();
                    if ((iZzm & 224) == 224) {
                        this.f13266k = iZzm;
                        this.f13263h = 2;
                    } else if (iZzm != 86) {
                        this.f13263h = 0;
                    }
                } else if (i10 != 2) {
                    int iMin = Math.min(c4099qh0.zzb(), this.f13265j - this.f13264i);
                    c4099qh0.zzG(this.f13259d.zza, this.f13264i, iMin);
                    int i11 = this.f13264i + iMin;
                    this.f13264i = i11;
                    if (i11 == this.f13265j) {
                        this.f13259d.zzk(0);
                        C1755Pg0 c1755Pg0 = this.f13259d;
                        if (c1755Pg0.zzo()) {
                            if (this.f13268m) {
                            }
                            this.f13263h = 0;
                        } else {
                            this.f13268m = true;
                            int iZzd2 = c1755Pg0.zzd(1);
                            if (iZzd2 == 1) {
                                iZzd = c1755Pg0.zzd(1);
                                i9 = 1;
                            } else {
                                i9 = iZzd2;
                                iZzd = 0;
                            }
                            this.f13269n = iZzd;
                            if (iZzd != 0) {
                                throw C1901Sv.zza(null, null);
                            }
                            if (i9 == 1) {
                                b(c1755Pg0);
                                i9 = 1;
                            }
                            if (!c1755Pg0.zzo()) {
                                throw C1901Sv.zza(null, null);
                            }
                            this.f13270o = c1755Pg0.zzd(6);
                            int iZzd3 = c1755Pg0.zzd(4);
                            int iZzd4 = c1755Pg0.zzd(3);
                            if (iZzd3 != 0 || iZzd4 != 0) {
                                throw C1901Sv.zza(null, null);
                            }
                            if (i9 == 0) {
                                int iZzc = c1755Pg0.zzc();
                                int iA = a(c1755Pg0);
                                c1755Pg0.zzk(iZzc);
                                byte[] bArr = new byte[(iA + 7) / 8];
                                c1755Pg0.zzg(bArr, 0, iA);
                                O4 o42 = new O4();
                                o42.zzK(this.f13261f);
                                o42.zzX("audio/mp4a-latm");
                                o42.zzz(this.f13277v);
                                o42.zzy(this.f13276u);
                                o42.zzY(this.f13274s);
                                o42.zzL(Collections.singletonList(bArr));
                                o42.zzO(this.f13256a);
                                o42.zzV(this.f13257b);
                                Q5 q5Zzad = o42.zzad();
                                if (!q5Zzad.equals(this.f13262g)) {
                                    this.f13262g = q5Zzad;
                                    this.f13275t = 1024000000 / q5Zzad.zzB;
                                    this.f13260e.zzl(q5Zzad);
                                }
                            } else {
                                c1755Pg0.zzm(((int) b(c1755Pg0)) - a(c1755Pg0));
                            }
                            int iZzd5 = c1755Pg0.zzd(3);
                            this.f13271p = iZzd5;
                            if (iZzd5 == 0) {
                                c1755Pg0.zzm(8);
                            } else if (iZzd5 == 1) {
                                c1755Pg0.zzm(9);
                            } else if (iZzd5 == 3 || iZzd5 == 4 || iZzd5 == 5) {
                                c1755Pg0.zzm(6);
                            } else {
                                if (iZzd5 != 6 && iZzd5 != 7) {
                                    throw new IllegalStateException();
                                }
                                c1755Pg0.zzm(1);
                            }
                            boolean zZzo2 = c1755Pg0.zzo();
                            this.f13272q = zZzo2;
                            this.f13273r = 0L;
                            if (zZzo2) {
                                if (i9 != 1) {
                                    do {
                                        zZzo = c1755Pg0.zzo();
                                        this.f13273r = (this.f13273r << 8) + c1755Pg0.zzd(8);
                                    } while (zZzo);
                                } else {
                                    this.f13273r = b(c1755Pg0);
                                }
                            }
                            if (c1755Pg0.zzo()) {
                                c1755Pg0.zzm(8);
                            }
                        }
                        if (this.f13269n != 0) {
                            throw C1901Sv.zza(null, null);
                        }
                        if (this.f13270o != 0) {
                            throw C1901Sv.zza(null, null);
                        }
                        if (this.f13271p != 0) {
                            throw C1901Sv.zza(null, null);
                        }
                        int i12 = 0;
                        while (true) {
                            int iZzd6 = c1755Pg0.zzd(8);
                            i8 = i12 + iZzd6;
                            if (iZzd6 != 255) {
                                break;
                            } else {
                                i12 = i8;
                            }
                        }
                        int iZzc2 = c1755Pg0.zzc();
                        if ((iZzc2 & 7) == 0) {
                            this.f13258c.zzK(iZzc2 >> 3);
                        } else {
                            c1755Pg0.zzg(this.f13258c.zzM(), 0, i8 * 8);
                            this.f13258c.zzK(0);
                        }
                        this.f13260e.zzq(this.f13258c, i8);
                        F10.zzf(this.f13267l != -9223372036854775807L);
                        this.f13260e.zzs(this.f13267l, 1, i8, 0, null);
                        this.f13267l += this.f13275t;
                        if (this.f13272q) {
                            c1755Pg0.zzm((int) this.f13273r);
                        }
                        this.f13263h = 0;
                    } else {
                        continue;
                    }
                } else {
                    int iZzm2 = ((this.f13266k & (-225)) << 8) | c4099qh0.zzm();
                    this.f13265j = iZzm2;
                    C4099qh0 c4099qh02 = this.f13258c;
                    if (iZzm2 > c4099qh02.zzM().length) {
                        c4099qh02.zzH(iZzm2);
                        C1755Pg0 c1755Pg02 = this.f13259d;
                        byte[] bArrZzM = this.f13258c.zzM();
                        c1755Pg02.zzj(bArrZzM, bArrZzM.length);
                    }
                    this.f13264i = 0;
                    this.f13263h = 3;
                }
            } else if (c4099qh0.zzm() == 86) {
                this.f13263h = 1;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4490u6
    public final void zzb(InterfaceC2769f1 interfaceC2769f1, C3011h7 c3011h7) {
        c3011h7.zzc();
        this.f13260e = interfaceC2769f1.zzw(c3011h7.zza(), 1);
        this.f13261f = c3011h7.zzb();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4490u6
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4490u6
    public final void zzd(long j8, int i8) {
        this.f13267l = j8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4490u6
    public final void zze() {
        this.f13263h = 0;
        this.f13267l = -9223372036854775807L;
        this.f13268m = false;
    }
}
