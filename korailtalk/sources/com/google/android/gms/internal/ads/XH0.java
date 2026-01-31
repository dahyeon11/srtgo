package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* loaded from: classes2.dex */
public final class XH0 implements InterfaceC2348bJ0 {

    /* renamed from: a */
    private final C4055qG f17205a;

    /* renamed from: b */
    private final C3711nF f17206b;

    /* renamed from: c */
    private final HashMap f17207c;

    /* renamed from: d */
    private final InterfaceC1843Rj0 f17208d;

    /* renamed from: e */
    private InterfaceC2233aJ0 f17209e;

    /* renamed from: f */
    private RG f17210f;

    /* renamed from: g */
    private String f17211g;

    /* renamed from: h */
    private long f17212h;
    public static final InterfaceC1843Rj0 zza = new InterfaceC1843Rj0() { // from class: com.google.android.gms.internal.ads.VH0
        @Override // com.google.android.gms.internal.ads.InterfaceC1843Rj0
        public final Object zza() {
            return XH0.f();
        }
    };

    /* renamed from: i */
    private static final Random f17204i = new Random();

    public XH0() {
        throw null;
    }

    public final long d() {
        WH0 wh0 = (WH0) this.f17207c.get(this.f17211g);
        return (wh0 == null || wh0.f16959c == -1) ? this.f17212h + 1 : wh0.f16959c;
    }

    private final WH0 e(int i8, NM0 nm0) {
        long j8 = Long.MAX_VALUE;
        WH0 wh0 = null;
        for (WH0 wh02 : this.f17207c.values()) {
            wh02.zzg(i8, nm0);
            if (wh02.zzj(i8, nm0)) {
                long j9 = wh02.f16959c;
                if (j9 == -1 || j9 < j8) {
                    wh0 = wh02;
                    j8 = j9;
                } else if (j9 == j8) {
                    int i9 = AbstractC2281am0.zza;
                    if (wh0.f16960d != null && wh02.f16960d != null) {
                        wh0 = wh02;
                    }
                }
            }
        }
        if (wh0 != null) {
            return wh0;
        }
        String strF = f();
        WH0 wh03 = new WH0(this, strF, i8, nm0);
        this.f17207c.put(strF, wh03);
        return wh03;
    }

    public static String f() {
        byte[] bArr = new byte[12];
        f17204i.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    private final void g(WH0 wh0) {
        if (wh0.f16959c != -1) {
            this.f17212h = wh0.f16959c;
        }
        this.f17211g = null;
    }

    private final void h(PG0 pg0) {
        if (pg0.zzb.zzo()) {
            String str = this.f17211g;
            if (str != null) {
                WH0 wh0 = (WH0) this.f17207c.get(str);
                wh0.getClass();
                g(wh0);
                return;
            }
            return;
        }
        WH0 wh02 = (WH0) this.f17207c.get(this.f17211g);
        WH0 wh0E = e(pg0.zzc, pg0.zzd);
        this.f17211g = wh0E.f16957a;
        zzi(pg0);
        NM0 nm0 = pg0.zzd;
        if (nm0 == null || !nm0.zzb()) {
            return;
        }
        if (wh02 != null) {
            if (wh02.f16959c == nm0.zzd && wh02.f16960d != null && wh02.f16960d.zzb == pg0.zzd.zzb && wh02.f16960d.zzc == pg0.zzd.zzc) {
                return;
            }
        }
        NM0 nm02 = pg0.zzd;
        String unused = e(pg0.zzc, new NM0(nm02.zza, nm02.zzd)).f16957a;
        String unused2 = wh0E.f16957a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2348bJ0
    public final synchronized String zze() {
        return this.f17211g;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2348bJ0
    public final synchronized String zzf(RG rg, NM0 nm0) {
        return e(rg.zzn(nm0.zza, this.f17206b).zzd, nm0).f16957a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2348bJ0
    public final synchronized void zzg(PG0 pg0) {
        InterfaceC2233aJ0 interfaceC2233aJ0;
        try {
            String str = this.f17211g;
            if (str != null) {
                WH0 wh0 = (WH0) this.f17207c.get(str);
                if (wh0 == null) {
                    throw null;
                }
                g(wh0);
            }
            Iterator it = this.f17207c.values().iterator();
            while (it.hasNext()) {
                WH0 wh02 = (WH0) it.next();
                it.remove();
                if (wh02.f16961e && (interfaceC2233aJ0 = this.f17209e) != null) {
                    interfaceC2233aJ0.zzd(pg0, wh02.f16957a, false);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2348bJ0
    public final void zzh(InterfaceC2233aJ0 interfaceC2233aJ0) {
        this.f17209e = interfaceC2233aJ0;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x003f A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:51:0x0001, B:53:0x0005, B:56:0x000f, B:58:0x0013, B:60:0x001d, B:62:0x0029, B:64:0x0033, B:69:0x003f, B:71:0x004b, B:72:0x0051, B:74:0x0056, B:76:0x005c, B:78:0x0073, B:79:0x009b, B:81:0x00a1, B:82:0x00a7, B:84:0x00b3, B:86:0x00b9, B:92:0x00ca), top: B:95:0x0001 }] */
    @Override // com.google.android.gms.internal.ads.InterfaceC2348bJ0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void zzi(com.google.android.gms.internal.ads.PG0 r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            com.google.android.gms.internal.ads.aJ0 r0 = r9.f17209e     // Catch: java.lang.Throwable -> L3c
            if (r0 == 0) goto Lc9
            com.google.android.gms.internal.ads.RG r0 = r10.zzb     // Catch: java.lang.Throwable -> L3c
            boolean r0 = r0.zzo()     // Catch: java.lang.Throwable -> L3c
            if (r0 == 0) goto Lf
            goto Lc7
        Lf:
            com.google.android.gms.internal.ads.NM0 r0 = r10.zzd     // Catch: java.lang.Throwable -> L3c
            if (r0 == 0) goto L3f
            long r1 = r9.d()     // Catch: java.lang.Throwable -> L3c
            long r3 = r0.zzd     // Catch: java.lang.Throwable -> L3c
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto Lc7
            java.util.HashMap r0 = r9.f17207c     // Catch: java.lang.Throwable -> L3c
            java.lang.String r1 = r9.f17211g     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.internal.ads.WH0 r0 = (com.google.android.gms.internal.ads.WH0) r0     // Catch: java.lang.Throwable -> L3c
            if (r0 == 0) goto L3f
            long r1 = com.google.android.gms.internal.ads.WH0.b(r0)     // Catch: java.lang.Throwable -> L3c
            r3 = -1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L3f
            int r0 = com.google.android.gms.internal.ads.WH0.a(r0)     // Catch: java.lang.Throwable -> L3c
            int r1 = r10.zzc     // Catch: java.lang.Throwable -> L3c
            if (r0 != r1) goto Lc7
            goto L3f
        L3c:
            r10 = move-exception
            goto Lcb
        L3f:
            int r0 = r10.zzc     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.internal.ads.NM0 r1 = r10.zzd     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.internal.ads.WH0 r0 = r9.e(r0, r1)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r1 = r9.f17211g     // Catch: java.lang.Throwable -> L3c
            if (r1 != 0) goto L51
            java.lang.String r1 = com.google.android.gms.internal.ads.WH0.d(r0)     // Catch: java.lang.Throwable -> L3c
            r9.f17211g = r1     // Catch: java.lang.Throwable -> L3c
        L51:
            com.google.android.gms.internal.ads.NM0 r1 = r10.zzd     // Catch: java.lang.Throwable -> L3c
            r2 = 1
            if (r1 == 0) goto L9b
            boolean r3 = r1.zzb()     // Catch: java.lang.Throwable -> L3c
            if (r3 == 0) goto L9b
            java.lang.Object r3 = r1.zza     // Catch: java.lang.Throwable -> L3c
            long r4 = r1.zzd     // Catch: java.lang.Throwable -> L3c
            int r1 = r1.zzb     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.internal.ads.NM0 r6 = new com.google.android.gms.internal.ads.NM0     // Catch: java.lang.Throwable -> L3c
            r6.<init>(r3, r4, r1)     // Catch: java.lang.Throwable -> L3c
            int r1 = r10.zzc     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.internal.ads.WH0 r1 = r9.e(r1, r6)     // Catch: java.lang.Throwable -> L3c
            boolean r3 = com.google.android.gms.internal.ads.WH0.h(r1)     // Catch: java.lang.Throwable -> L3c
            if (r3 != 0) goto L9b
            com.google.android.gms.internal.ads.WH0.f(r1, r2)     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.internal.ads.RG r3 = r10.zzb     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.internal.ads.NM0 r4 = r10.zzd     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.internal.ads.nF r5 = r9.f17206b     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r4 = r4.zza     // Catch: java.lang.Throwable -> L3c
            r3.zzn(r4, r5)     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.internal.ads.nF r3 = r9.f17206b     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.internal.ads.NM0 r4 = r10.zzd     // Catch: java.lang.Throwable -> L3c
            int r4 = r4.zzb     // Catch: java.lang.Throwable -> L3c
            r3.zzi(r4)     // Catch: java.lang.Throwable -> L3c
            r3 = 0
            long r5 = com.google.android.gms.internal.ads.AbstractC2281am0.zzu(r3)     // Catch: java.lang.Throwable -> L3c
            long r7 = com.google.android.gms.internal.ads.AbstractC2281am0.zzu(r3)     // Catch: java.lang.Throwable -> L3c
            long r5 = r5 + r7
            java.lang.Math.max(r3, r5)     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.internal.ads.WH0.d(r1)     // Catch: java.lang.Throwable -> L3c
        L9b:
            boolean r1 = com.google.android.gms.internal.ads.WH0.h(r0)     // Catch: java.lang.Throwable -> L3c
            if (r1 != 0) goto La7
            com.google.android.gms.internal.ads.WH0.f(r0, r2)     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.internal.ads.WH0.d(r0)     // Catch: java.lang.Throwable -> L3c
        La7:
            java.lang.String r1 = com.google.android.gms.internal.ads.WH0.d(r0)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r3 = r9.f17211g     // Catch: java.lang.Throwable -> L3c
            boolean r1 = r1.equals(r3)     // Catch: java.lang.Throwable -> L3c
            if (r1 == 0) goto Lc7
            boolean r1 = com.google.android.gms.internal.ads.WH0.g(r0)     // Catch: java.lang.Throwable -> L3c
            if (r1 != 0) goto Lc7
            com.google.android.gms.internal.ads.WH0.e(r0, r2)     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.internal.ads.aJ0 r1 = r9.f17209e     // Catch: java.lang.Throwable -> L3c
            java.lang.String r0 = com.google.android.gms.internal.ads.WH0.d(r0)     // Catch: java.lang.Throwable -> L3c
            r1.zzc(r10, r0)     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r9)
            return
        Lc7:
            monitor-exit(r9)
            return
        Lc9:
            r10 = 0
            throw r10     // Catch: java.lang.Throwable -> L3c
        Lcb:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L3c
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.XH0.zzi(com.google.android.gms.internal.ads.PG0):void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2348bJ0
    public final synchronized void zzj(PG0 pg0, int i8) {
        try {
            if (this.f17209e == null) {
                throw null;
            }
            Iterator it = this.f17207c.values().iterator();
            while (it.hasNext()) {
                WH0 wh0 = (WH0) it.next();
                if (wh0.zzk(pg0)) {
                    it.remove();
                    if (wh0.f16961e) {
                        boolean zEquals = wh0.f16957a.equals(this.f17211g);
                        boolean z8 = false;
                        if (i8 == 0 && zEquals && wh0.f16962f) {
                            z8 = true;
                        }
                        if (zEquals) {
                            g(wh0);
                        }
                        this.f17209e.zzd(pg0, wh0.f16957a, z8);
                    }
                }
            }
            h(pg0);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2348bJ0
    public final synchronized void zzk(PG0 pg0) {
        try {
            if (this.f17209e == null) {
                throw null;
            }
            RG rg = this.f17210f;
            this.f17210f = pg0.zzb;
            Iterator it = this.f17207c.values().iterator();
            while (it.hasNext()) {
                WH0 wh0 = (WH0) it.next();
                if (!wh0.zzl(rg, this.f17210f) || wh0.zzk(pg0)) {
                    it.remove();
                    if (wh0.f16961e) {
                        if (wh0.f16957a.equals(this.f17211g)) {
                            g(wh0);
                        }
                        this.f17209e.zzd(pg0, wh0.f16957a, false);
                    }
                }
            }
            h(pg0);
        } catch (Throwable th) {
            throw th;
        }
    }

    public XH0(InterfaceC1843Rj0 interfaceC1843Rj0) {
        this.f17208d = interfaceC1843Rj0;
        this.f17205a = new C4055qG();
        this.f17206b = new C3711nF();
        this.f17207c = new HashMap();
        this.f17210f = RG.zza;
        this.f17212h = -1L;
    }
}
