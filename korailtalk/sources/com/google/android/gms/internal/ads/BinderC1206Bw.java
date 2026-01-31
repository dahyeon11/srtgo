package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Bw */
/* loaded from: classes2.dex */
public final class BinderC1206Bw extends H1.U0 {

    /* renamed from: a */
    private final InterfaceC4579uu f12329a;

    /* renamed from: c */
    private final boolean f12331c;

    /* renamed from: d */
    private final boolean f12332d;

    /* renamed from: e */
    private int f12333e;

    /* renamed from: f */
    private H1.Y0 f12334f;

    /* renamed from: g */
    private boolean f12335g;

    /* renamed from: i */
    private float f12337i;

    /* renamed from: j */
    private float f12338j;

    /* renamed from: k */
    private float f12339k;

    /* renamed from: l */
    private boolean f12340l;

    /* renamed from: m */
    private boolean f12341m;

    /* renamed from: n */
    private C1637Mj f12342n;

    /* renamed from: b */
    private final Object f12330b = new Object();

    /* renamed from: h */
    private boolean f12336h = true;

    public BinderC1206Bw(InterfaceC4579uu interfaceC4579uu, float f8, boolean z8, boolean z9) {
        this.f12329a = interfaceC4579uu;
        this.f12337i = f8;
        this.f12331c = z8;
        this.f12332d = z9;
    }

    private final void d(final int i8, final int i9, final boolean z8, final boolean z9) {
        AbstractC4805wt.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.Aw
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.b(i8, i9, z8, z9);
            }
        });
    }

    private final void e(String str, Map map) {
        final HashMap map2 = map == null ? new HashMap() : new HashMap(map);
        map2.put("action", str);
        AbstractC4805wt.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zw
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.c(map2);
            }
        });
    }

    final /* synthetic */ void b(int i8, int i9, boolean z8, boolean z9) {
        int i10;
        boolean z10;
        boolean z11;
        H1.Y0 y02;
        H1.Y0 y03;
        H1.Y0 y04;
        synchronized (this.f12330b) {
            try {
                boolean z12 = this.f12335g;
                if (z12 || i9 != 1) {
                    i10 = i9;
                    z10 = false;
                } else {
                    i9 = 1;
                    i10 = 1;
                    z10 = true;
                }
                boolean z13 = i8 != i9;
                if (z13 && i10 == 1) {
                    z11 = true;
                    i10 = 1;
                } else {
                    z11 = false;
                }
                boolean z14 = z13 && i10 == 2;
                boolean z15 = z13 && i10 == 3;
                this.f12335g = z12 || z10;
                if (z10) {
                    try {
                        H1.Y0 y05 = this.f12334f;
                        if (y05 != null) {
                            y05.zzi();
                        }
                    } catch (RemoteException e8) {
                        L1.n.zzl("#007 Could not call remote method.", e8);
                    }
                }
                if (z11 && (y04 = this.f12334f) != null) {
                    y04.zzh();
                }
                if (z14 && (y03 = this.f12334f) != null) {
                    y03.zzg();
                }
                if (z15) {
                    H1.Y0 y06 = this.f12334f;
                    if (y06 != null) {
                        y06.zze();
                    }
                    this.f12329a.zzw();
                }
                if (z8 != z9 && (y02 = this.f12334f) != null) {
                    y02.zzf(z9);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final /* synthetic */ void c(Map map) {
        this.f12329a.zzd("pubVideoCmd", map);
    }

    public final void zzc(float f8, float f9, int i8, boolean z8, float f10) {
        boolean z9;
        boolean z10;
        int i9;
        synchronized (this.f12330b) {
            try {
                z9 = true;
                if (f9 == this.f12337i && f10 == this.f12339k) {
                    z9 = false;
                }
                this.f12337i = f9;
                this.f12338j = f8;
                z10 = this.f12336h;
                this.f12336h = z8;
                i9 = this.f12333e;
                this.f12333e = i8;
                float f11 = this.f12339k;
                this.f12339k = f10;
                if (Math.abs(f10 - f11) > 1.0E-4f) {
                    this.f12329a.zzF().invalidate();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z9) {
            try {
                C1637Mj c1637Mj = this.f12342n;
                if (c1637Mj != null) {
                    c1637Mj.zze();
                }
            } catch (RemoteException e8) {
                L1.n.zzl("#007 Could not call remote method.", e8);
            }
        }
        d(i9, i8, z10, z8);
    }

    @Override // H1.U0, H1.V0
    public final float zze() {
        float f8;
        synchronized (this.f12330b) {
            f8 = this.f12339k;
        }
        return f8;
    }

    @Override // H1.U0, H1.V0
    public final float zzf() {
        float f8;
        synchronized (this.f12330b) {
            f8 = this.f12338j;
        }
        return f8;
    }

    @Override // H1.U0, H1.V0
    public final float zzg() {
        float f8;
        synchronized (this.f12330b) {
            f8 = this.f12337i;
        }
        return f8;
    }

    @Override // H1.U0, H1.V0
    public final int zzh() {
        int i8;
        synchronized (this.f12330b) {
            i8 = this.f12333e;
        }
        return i8;
    }

    @Override // H1.U0, H1.V0
    public final H1.Y0 zzi() {
        H1.Y0 y02;
        synchronized (this.f12330b) {
            y02 = this.f12334f;
        }
        return y02;
    }

    @Override // H1.U0, H1.V0
    public final void zzj(boolean z8) {
        e(true != z8 ? "unmute" : "mute", null);
    }

    @Override // H1.U0, H1.V0
    public final void zzk() {
        e("pause", null);
    }

    @Override // H1.U0, H1.V0
    public final void zzl() {
        e("play", null);
    }

    @Override // H1.U0, H1.V0
    public final void zzm(H1.Y0 y02) {
        synchronized (this.f12330b) {
            this.f12334f = y02;
        }
    }

    @Override // H1.U0, H1.V0
    public final void zzn() {
        e("stop", null);
    }

    @Override // H1.U0, H1.V0
    public final boolean zzo() {
        boolean z8;
        Object obj = this.f12330b;
        boolean zZzp = zzp();
        synchronized (obj) {
            z8 = false;
            if (!zZzp) {
                try {
                    if (this.f12341m && this.f12332d) {
                        z8 = true;
                    }
                } finally {
                }
            }
        }
        return z8;
    }

    @Override // H1.U0, H1.V0
    public final boolean zzp() {
        boolean z8;
        synchronized (this.f12330b) {
            try {
                z8 = false;
                if (this.f12331c && this.f12340l) {
                    z8 = true;
                }
            } finally {
            }
        }
        return z8;
    }

    @Override // H1.U0, H1.V0
    public final boolean zzq() {
        boolean z8;
        synchronized (this.f12330b) {
            z8 = this.f12336h;
        }
        return z8;
    }

    public final void zzs(H1.R1 r12) {
        Object obj = this.f12330b;
        boolean z8 = r12.zza;
        boolean z9 = r12.zzb;
        boolean z10 = r12.zzc;
        synchronized (obj) {
            this.f12340l = z9;
            this.f12341m = z10;
        }
        e("initialState", o2.g.mapOf("muteStart", true != z8 ? "0" : "1", "customControlsRequested", true != z9 ? "0" : "1", "clickToExpandRequested", true != z10 ? "0" : "1"));
    }

    public final void zzt(float f8) {
        synchronized (this.f12330b) {
            this.f12338j = f8;
        }
    }

    public final void zzu() {
        boolean z8;
        int i8;
        synchronized (this.f12330b) {
            z8 = this.f12336h;
            i8 = this.f12333e;
            this.f12333e = 3;
        }
        d(i8, 3, z8, z8);
    }

    public final void zzv(C1637Mj c1637Mj) {
        synchronized (this.f12330b) {
            this.f12342n = c1637Mj;
        }
    }
}
