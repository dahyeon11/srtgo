package com.google.android.gms.internal.ads;

import K1.AbstractC0667v0;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.Mu */
/* loaded from: classes2.dex */
public final class TextureViewSurfaceTextureListenerC1654Mu extends AbstractC2296au implements TextureView.SurfaceTextureListener, InterfaceC3440ku {

    /* renamed from: c */
    private final InterfaceC4579uu f14709c;

    /* renamed from: d */
    private final C4693vu f14710d;

    /* renamed from: e */
    private final C4465tu f14711e;

    /* renamed from: f */
    private InterfaceC2186Zt f14712f;

    /* renamed from: g */
    private Surface f14713g;

    /* renamed from: h */
    private AbstractC3554lu f14714h;

    /* renamed from: i */
    private String f14715i;

    /* renamed from: j */
    private String[] f14716j;

    /* renamed from: k */
    private boolean f14717k;

    /* renamed from: l */
    private int f14718l;

    /* renamed from: m */
    private C4351su f14719m;

    /* renamed from: n */
    private final boolean f14720n;

    /* renamed from: o */
    private boolean f14721o;

    /* renamed from: p */
    private boolean f14722p;

    /* renamed from: q */
    private int f14723q;

    /* renamed from: r */
    private int f14724r;

    /* renamed from: s */
    private float f14725s;

    public TextureViewSurfaceTextureListenerC1654Mu(Context context, C4693vu c4693vu, InterfaceC4579uu interfaceC4579uu, boolean z8, boolean z9, C4465tu c4465tu) {
        super(context);
        this.f14718l = 1;
        this.f14709c = interfaceC4579uu;
        this.f14710d = c4693vu;
        this.f14720n = z8;
        this.f14711e = c4465tu;
        setSurfaceTextureListener(this);
        c4693vu.zza(this);
    }

    private static String p(String str, Exception exc) {
        return str + "/" + exc.getClass().getCanonicalName() + ":" + exc.getMessage();
    }

    private final void q() {
        AbstractC3554lu abstractC3554lu = this.f14714h;
        if (abstractC3554lu != null) {
            abstractC3554lu.zzQ(true);
        }
    }

    private final void r() {
        if (this.f14721o) {
            return;
        }
        this.f14721o = true;
        K1.K0.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.Lu
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.e();
            }
        });
        zzn();
        this.f14710d.zzb();
        if (this.f14722p) {
            zzp();
        }
    }

    private final void s(boolean z8, Integer num) {
        AbstractC3554lu abstractC3554lu = this.f14714h;
        if (abstractC3554lu != null && !z8) {
            abstractC3554lu.zzP(num);
            return;
        }
        if (this.f14715i == null || this.f14713g == null) {
            return;
        }
        if (z8) {
            if (!z()) {
                L1.n.zzj("No valid ExoPlayerAdapter exists when switch source.");
                return;
            } else {
                abstractC3554lu.zzU();
                u();
            }
        }
        if (this.f14715i.startsWith("cache:")) {
            AbstractC2986gv abstractC2986gvZzp = this.f14709c.zzp(this.f14715i);
            if (abstractC2986gvZzp instanceof C4012pv) {
                AbstractC3554lu abstractC3554luZza = ((C4012pv) abstractC2986gvZzp).zza();
                this.f14714h = abstractC3554luZza;
                abstractC3554luZza.zzP(num);
                if (!this.f14714h.zzV()) {
                    L1.n.zzj("Precached video player has been released.");
                    return;
                }
            } else {
                if (!(abstractC2986gvZzp instanceof C3670mv)) {
                    L1.n.zzj("Stream cache miss: ".concat(String.valueOf(this.f14715i)));
                    return;
                }
                C3670mv c3670mv = (C3670mv) abstractC2986gvZzp;
                String strB = b();
                ByteBuffer byteBufferZzk = c3670mv.zzk();
                boolean zZzl = c3670mv.zzl();
                String strZzi = c3670mv.zzi();
                if (strZzi == null) {
                    L1.n.zzj("Stream cache URL is null.");
                    return;
                } else {
                    AbstractC3554lu abstractC3554luA = a(num);
                    this.f14714h = abstractC3554luA;
                    abstractC3554luA.zzG(new Uri[]{Uri.parse(strZzi)}, strB, byteBufferZzk, zZzl);
                }
            }
        } else {
            this.f14714h = a(num);
            String strB2 = b();
            Uri[] uriArr = new Uri[this.f14716j.length];
            int i8 = 0;
            while (true) {
                String[] strArr = this.f14716j;
                if (i8 >= strArr.length) {
                    break;
                }
                uriArr[i8] = Uri.parse(strArr[i8]);
                i8++;
            }
            this.f14714h.zzF(uriArr, strB2);
        }
        this.f14714h.zzL(this);
        v(this.f14713g, false);
        if (this.f14714h.zzV()) {
            int iZzt = this.f14714h.zzt();
            this.f14718l = iZzt;
            if (iZzt == 3) {
                r();
            }
        }
    }

    private final void t() {
        AbstractC3554lu abstractC3554lu = this.f14714h;
        if (abstractC3554lu != null) {
            abstractC3554lu.zzQ(false);
        }
    }

    private final void u() {
        if (this.f14714h != null) {
            v(null, true);
            AbstractC3554lu abstractC3554lu = this.f14714h;
            if (abstractC3554lu != null) {
                abstractC3554lu.zzL(null);
                this.f14714h.zzH();
                this.f14714h = null;
            }
            this.f14718l = 1;
            this.f14717k = false;
            this.f14721o = false;
            this.f14722p = false;
        }
    }

    private final void v(Surface surface, boolean z8) {
        AbstractC3554lu abstractC3554lu = this.f14714h;
        if (abstractC3554lu == null) {
            L1.n.zzj("Trying to set surface before player is initialized.");
            return;
        }
        try {
            abstractC3554lu.zzS(surface, z8);
        } catch (IOException e8) {
            L1.n.zzk("", e8);
        }
    }

    private final void w() {
        x(this.f14723q, this.f14724r);
    }

    private final void x(int i8, int i9) {
        float f8 = i9 > 0 ? i8 / i9 : 1.0f;
        if (this.f14725s != f8) {
            this.f14725s = f8;
            requestLayout();
        }
    }

    private final boolean y() {
        return z() && this.f14718l != 1;
    }

    private final boolean z() {
        AbstractC3554lu abstractC3554lu = this.f14714h;
        return (abstractC3554lu == null || !abstractC3554lu.zzV() || this.f14717k) ? false : true;
    }

    final AbstractC3554lu a(Integer num) {
        C4465tu c4465tu = this.f14711e;
        InterfaceC4579uu interfaceC4579uu = this.f14709c;
        C1492Iv c1492Iv = new C1492Iv(interfaceC4579uu.getContext(), c4465tu, interfaceC4579uu, num);
        L1.n.zzi("ExoPlayerAdapter initialized.");
        return c1492Iv;
    }

    final String b() {
        InterfaceC4579uu interfaceC4579uu = this.f14709c;
        return G1.u.zzp().zzc(interfaceC4579uu.getContext(), interfaceC4579uu.zzn().afmaVersion);
    }

    final /* synthetic */ void c(String str) {
        InterfaceC2186Zt interfaceC2186Zt = this.f14712f;
        if (interfaceC2186Zt != null) {
            interfaceC2186Zt.zzb("ExoPlayerAdapter error", str);
        }
    }

    final /* synthetic */ void d() {
        InterfaceC2186Zt interfaceC2186Zt = this.f14712f;
        if (interfaceC2186Zt != null) {
            interfaceC2186Zt.zza();
        }
    }

    final /* synthetic */ void e() {
        InterfaceC2186Zt interfaceC2186Zt = this.f14712f;
        if (interfaceC2186Zt != null) {
            interfaceC2186Zt.zzf();
        }
    }

    final /* synthetic */ void f(boolean z8, long j8) {
        this.f14709c.zzv(z8, j8);
    }

    final /* synthetic */ void g(String str) {
        InterfaceC2186Zt interfaceC2186Zt = this.f14712f;
        if (interfaceC2186Zt != null) {
            interfaceC2186Zt.zzc("ExoPlayerAdapter exception", str);
        }
    }

    final /* synthetic */ void h() {
        InterfaceC2186Zt interfaceC2186Zt = this.f14712f;
        if (interfaceC2186Zt != null) {
            interfaceC2186Zt.zzg();
        }
    }

    final /* synthetic */ void i() {
        InterfaceC2186Zt interfaceC2186Zt = this.f14712f;
        if (interfaceC2186Zt != null) {
            interfaceC2186Zt.zzh();
        }
    }

    final /* synthetic */ void j() {
        InterfaceC2186Zt interfaceC2186Zt = this.f14712f;
        if (interfaceC2186Zt != null) {
            interfaceC2186Zt.zzi();
        }
    }

    final /* synthetic */ void k(int i8, int i9) {
        InterfaceC2186Zt interfaceC2186Zt = this.f14712f;
        if (interfaceC2186Zt != null) {
            interfaceC2186Zt.zzj(i8, i9);
        }
    }

    final /* synthetic */ void l() {
        float fZza = this.f18048b.zza();
        AbstractC3554lu abstractC3554lu = this.f14714h;
        if (abstractC3554lu == null) {
            L1.n.zzj("Trying to set volume before player is initialized.");
            return;
        }
        try {
            abstractC3554lu.zzT(fZza, false);
        } catch (IOException e8) {
            L1.n.zzk("", e8);
        }
    }

    final /* synthetic */ void m(int i8) {
        InterfaceC2186Zt interfaceC2186Zt = this.f14712f;
        if (interfaceC2186Zt != null) {
            interfaceC2186Zt.onWindowVisibilityChanged(i8);
        }
    }

    final /* synthetic */ void n() {
        InterfaceC2186Zt interfaceC2186Zt = this.f14712f;
        if (interfaceC2186Zt != null) {
            interfaceC2186Zt.zzd();
        }
    }

    final /* synthetic */ void o() {
        InterfaceC2186Zt interfaceC2186Zt = this.f14712f;
        if (interfaceC2186Zt != null) {
            interfaceC2186Zt.zze();
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i8, int i9) {
        super.onMeasure(i8, i9);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f8 = this.f14725s;
        if (f8 != 0.0f && this.f14719m == null) {
            float f9 = measuredWidth;
            float f10 = f9 / measuredHeight;
            if (f8 > f10) {
                measuredHeight = (int) (f9 / f8);
            }
            if (f8 < f10) {
                measuredWidth = (int) (measuredHeight * f8);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        C4351su c4351su = this.f14719m;
        if (c4351su != null) {
            c4351su.zzc(measuredWidth, measuredHeight);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i8, int i9) throws InterruptedException {
        if (this.f14720n) {
            C4351su c4351su = new C4351su(getContext());
            this.f14719m = c4351su;
            c4351su.zzd(surfaceTexture, i8, i9);
            this.f14719m.start();
            SurfaceTexture surfaceTextureZzb = this.f14719m.zzb();
            if (surfaceTextureZzb != null) {
                surfaceTexture = surfaceTextureZzb;
            } else {
                this.f14719m.zze();
                this.f14719m = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.f14713g = surface;
        if (this.f14714h == null) {
            s(false, null);
        } else {
            v(surface, true);
            if (!this.f14711e.zza) {
                q();
            }
        }
        if (this.f14723q == 0 || this.f14724r == 0) {
            x(i8, i9);
        } else {
            w();
        }
        K1.K0.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.Iu
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.i();
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzo();
        C4351su c4351su = this.f14719m;
        if (c4351su != null) {
            c4351su.zze();
            this.f14719m = null;
        }
        if (this.f14714h != null) {
            t();
            Surface surface = this.f14713g;
            if (surface != null) {
                surface.release();
            }
            this.f14713g = null;
            v(null, true);
        }
        K1.K0.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.Eu
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.j();
            }
        });
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, final int i8, final int i9) {
        C4351su c4351su = this.f14719m;
        if (c4351su != null) {
            c4351su.zzc(i8, i9);
        }
        K1.K0.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.Du
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.k(i8, i9);
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f14710d.zzf(this);
        this.f18047a.zza(surfaceTexture, this.f14712f);
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(final int i8) {
        AbstractC0667v0.zza("AdExoPlayerView3 window visibility changed to " + i8);
        K1.K0.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.Cu
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.m(i8);
            }
        });
        super.onWindowVisibilityChanged(i8);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2296au
    public final void zzA(int i8) {
        AbstractC3554lu abstractC3554lu = this.f14714h;
        if (abstractC3554lu != null) {
            abstractC3554lu.zzN(i8);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2296au
    public final void zzB(int i8) {
        AbstractC3554lu abstractC3554lu = this.f14714h;
        if (abstractC3554lu != null) {
            abstractC3554lu.zzR(i8);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2296au
    public final void zzC(String str, String[] strArr, Integer num) {
        if (str == null) {
            return;
        }
        if (strArr == null) {
            this.f14716j = new String[]{str};
        } else {
            this.f14716j = (String[]) Arrays.copyOf(strArr, strArr.length);
        }
        String str2 = this.f14715i;
        boolean z8 = false;
        if (this.f14711e.zzl && str2 != null && !str.equals(str2) && this.f14718l == 4) {
            z8 = true;
        }
        this.f14715i = str;
        s(z8, num);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3440ku
    public final void zzD(int i8, int i9) {
        this.f14723q = i8;
        this.f14724r = i9;
        w();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2296au
    public final int zza() {
        if (y()) {
            return (int) this.f14714h.zzy();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2296au
    public final int zzb() {
        AbstractC3554lu abstractC3554lu = this.f14714h;
        if (abstractC3554lu != null) {
            return abstractC3554lu.zzr();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2296au
    public final int zzc() {
        if (y()) {
            return (int) this.f14714h.zzz();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2296au
    public final int zzd() {
        return this.f14724r;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2296au
    public final int zze() {
        return this.f14723q;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2296au
    public final long zzf() {
        AbstractC3554lu abstractC3554lu = this.f14714h;
        if (abstractC3554lu != null) {
            return abstractC3554lu.zzx();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2296au
    public final long zzg() {
        AbstractC3554lu abstractC3554lu = this.f14714h;
        if (abstractC3554lu != null) {
            return abstractC3554lu.zzA();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2296au
    public final long zzh() {
        AbstractC3554lu abstractC3554lu = this.f14714h;
        if (abstractC3554lu != null) {
            return abstractC3554lu.zzB();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3440ku
    public final void zzi(final boolean z8, final long j8) {
        if (this.f14709c != null) {
            AbstractC4805wt.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.Fu
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.f(z8, j8);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2296au
    public final String zzj() {
        return "ExoPlayer/2".concat(true != this.f14720n ? "" : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3440ku
    public final void zzk(String str, Exception exc) {
        final String strP = p(str, exc);
        L1.n.zzj("ExoPlayerAdapter error: ".concat(strP));
        this.f14717k = true;
        if (this.f14711e.zza) {
            t();
        }
        K1.K0.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.Ju
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.c(strP);
            }
        });
        G1.u.zzo().zzv(exc, "AdExoPlayerView.onError");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3440ku
    public final void zzl(String str, Exception exc) {
        final String strP = p("onLoadException", exc);
        L1.n.zzj("ExoPlayerAdapter exception: ".concat(strP));
        G1.u.zzo().zzv(exc, "AdExoPlayerView.onException");
        K1.K0.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.Gu
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.g(strP);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3440ku
    public final void zzm(int i8) {
        if (this.f14718l != i8) {
            this.f14718l = i8;
            if (i8 == 3) {
                r();
                return;
            }
            if (i8 != 4) {
                return;
            }
            if (this.f14711e.zza) {
                t();
            }
            this.f14710d.zze();
            this.f18048b.zzc();
            K1.K0.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.Ku
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.d();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2296au, com.google.android.gms.internal.ads.InterfaceC4921xu
    public final void zzn() {
        K1.K0.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.Bu
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.l();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2296au
    public final void zzo() {
        if (y()) {
            if (this.f14711e.zza) {
                t();
            }
            this.f14714h.zzO(false);
            this.f14710d.zze();
            this.f18048b.zzc();
            K1.K0.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.Hu
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.n();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2296au
    public final void zzp() {
        if (!y()) {
            this.f14722p = true;
            return;
        }
        if (this.f14711e.zza) {
            q();
        }
        this.f14714h.zzO(true);
        this.f14710d.zzc();
        this.f18048b.zzb();
        this.f18047a.zzb();
        K1.K0.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.Au
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.o();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2296au
    public final void zzq(int i8) {
        if (y()) {
            this.f14714h.zzI(i8);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2296au
    public final void zzr(InterfaceC2186Zt interfaceC2186Zt) {
        this.f14712f = interfaceC2186Zt;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2296au
    public final void zzs(String str) {
        if (str != null) {
            zzC(str, null, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2296au
    public final void zzt() {
        if (z()) {
            this.f14714h.zzU();
            u();
        }
        this.f14710d.zze();
        this.f18048b.zzc();
        this.f14710d.zzd();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2296au
    public final void zzu(float f8, float f9) {
        C4351su c4351su = this.f14719m;
        if (c4351su != null) {
            c4351su.zzf(f8, f9);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3440ku
    public final void zzv() {
        K1.K0.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zu
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.h();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2296au
    public final Integer zzw() {
        AbstractC3554lu abstractC3554lu = this.f14714h;
        if (abstractC3554lu != null) {
            return abstractC3554lu.zzC();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2296au
    public final void zzx(int i8) {
        AbstractC3554lu abstractC3554lu = this.f14714h;
        if (abstractC3554lu != null) {
            abstractC3554lu.zzJ(i8);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2296au
    public final void zzy(int i8) {
        AbstractC3554lu abstractC3554lu = this.f14714h;
        if (abstractC3554lu != null) {
            abstractC3554lu.zzK(i8);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2296au
    public final void zzz(int i8) {
        AbstractC3554lu abstractC3554lu = this.f14714h;
        if (abstractC3554lu != null) {
            abstractC3554lu.zzM(i8);
        }
    }
}
