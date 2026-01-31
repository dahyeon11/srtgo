package com.google.android.gms.internal.ads;

import K1.AbstractC0667v0;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.kakao.sdk.user.Constants;
import i2.AbstractC5683p;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.iu, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3212iu extends FrameLayout implements InterfaceC2186Zt {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4579uu f20009a;

    /* renamed from: b, reason: collision with root package name */
    private final FrameLayout f20010b;

    /* renamed from: c, reason: collision with root package name */
    private final View f20011c;

    /* renamed from: d, reason: collision with root package name */
    private final C1511Jh f20012d;

    /* renamed from: e, reason: collision with root package name */
    final RunnableC4807wu f20013e;

    /* renamed from: f, reason: collision with root package name */
    private final long f20014f;

    /* renamed from: g, reason: collision with root package name */
    private final AbstractC2296au f20015g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f20016h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f20017i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f20018j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f20019k;

    /* renamed from: l, reason: collision with root package name */
    private long f20020l;

    /* renamed from: m, reason: collision with root package name */
    private long f20021m;

    /* renamed from: n, reason: collision with root package name */
    private String f20022n;

    /* renamed from: o, reason: collision with root package name */
    private String[] f20023o;

    /* renamed from: p, reason: collision with root package name */
    private Bitmap f20024p;

    /* renamed from: q, reason: collision with root package name */
    private final ImageView f20025q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f20026r;

    public C3212iu(Context context, InterfaceC4579uu interfaceC4579uu, int i8, boolean z8, C1511Jh c1511Jh, C4465tu c4465tu) {
        super(context);
        this.f20009a = interfaceC4579uu;
        this.f20012d = c1511Jh;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f20010b = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        AbstractC5683p.checkNotNull(interfaceC4579uu.zzj());
        C2411bu c2411bu = interfaceC4579uu.zzj().zza;
        AbstractC2296au textureViewSurfaceTextureListenerC1654Mu = i8 == 2 ? new TextureViewSurfaceTextureListenerC1654Mu(context, new C4693vu(context, interfaceC4579uu.zzn(), interfaceC4579uu.zzdi(), c1511Jh, interfaceC4579uu.zzk()), interfaceC4579uu, z8, C2411bu.a(interfaceC4579uu), c4465tu) : new TextureViewSurfaceTextureListenerC2145Yt(context, interfaceC4579uu, z8, C2411bu.a(interfaceC4579uu), c4465tu, new C4693vu(context, interfaceC4579uu.zzn(), interfaceC4579uu.zzdi(), c1511Jh, interfaceC4579uu.zzk()));
        this.f20015g = textureViewSurfaceTextureListenerC1654Mu;
        View view = new View(context);
        this.f20011c = view;
        view.setBackgroundColor(0);
        frameLayout.addView(textureViewSurfaceTextureListenerC1654Mu, new FrameLayout.LayoutParams(-1, -1, 17));
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzF)).booleanValue()) {
            frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(view);
        }
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzC)).booleanValue()) {
            zzn();
        }
        this.f20025q = new ImageView(context);
        this.f20014f = ((Long) H1.C.zzc().zza(AbstractC4439th.zzH)).longValue();
        boolean zBooleanValue = ((Boolean) H1.C.zzc().zza(AbstractC4439th.zzE)).booleanValue();
        this.f20019k = zBooleanValue;
        if (c1511Jh != null) {
            c1511Jh.zzd("spinner_used", true != zBooleanValue ? "0" : "1");
        }
        this.f20013e = new RunnableC4807wu(this);
        textureViewSurfaceTextureListenerC1654Mu.zzr(this);
    }

    private final void a() {
        if (this.f20009a.zzi() == null || !this.f20017i || this.f20018j) {
            return;
        }
        this.f20009a.zzi().getWindow().clearFlags(128);
        this.f20017i = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(String str, String... strArr) {
        HashMap map = new HashMap();
        Integer numZzl = zzl();
        if (numZzl != null) {
            map.put("playerId", numZzl.toString());
        }
        map.put(androidx.core.app.r.CATEGORY_EVENT, str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                map.put(str2, str3);
                str2 = null;
            }
        }
        this.f20009a.zzd("onVideoEvent", map);
    }

    private final boolean c() {
        return this.f20025q.getParent() != null;
    }

    final /* synthetic */ void e() {
        b("firstFrameRendered", new String[0]);
    }

    final /* synthetic */ void f(boolean z8) {
        b("windowFocusChanged", "hasWindowFocus", String.valueOf(z8));
    }

    public final void finalize() throws Throwable {
        try {
            this.f20013e.zza();
            final AbstractC2296au abstractC2296au = this.f20015g;
            if (abstractC2296au != null) {
                AbstractC4805wt.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.cu
                    @Override // java.lang.Runnable
                    public final void run() {
                        abstractC2296au.zzt();
                    }
                });
            }
        } finally {
            super.finalize();
        }
    }

    final void g() {
        AbstractC2296au abstractC2296au = this.f20015g;
        if (abstractC2296au == null) {
            return;
        }
        long jZza = abstractC2296au.zza();
        if (this.f20020l == jZza || jZza <= 0) {
            return;
        }
        float f8 = jZza / 1000.0f;
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzbR)).booleanValue()) {
            b("timeupdate", "time", String.valueOf(f8), "totalBytes", String.valueOf(this.f20015g.zzh()), "qoeCachedBytes", String.valueOf(this.f20015g.zzf()), "qoeLoadedBytes", String.valueOf(this.f20015g.zzg()), "droppedFrames", String.valueOf(this.f20015g.zzb()), "reportTime", String.valueOf(G1.u.zzB().currentTimeMillis()));
        } else {
            b("timeupdate", "time", String.valueOf(f8));
        }
        this.f20020l = jZza;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(final boolean z8) {
        super.onWindowFocusChanged(z8);
        if (z8) {
            this.f20013e.zzb();
        } else {
            this.f20013e.zza();
            this.f20021m = this.f20020l;
        }
        K1.K0.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.eu
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.f(z8);
            }
        });
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.InterfaceC2186Zt
    public final void onWindowVisibilityChanged(int i8) {
        boolean z8;
        super.onWindowVisibilityChanged(i8);
        if (i8 == 0) {
            this.f20013e.zzb();
            z8 = true;
        } else {
            this.f20013e.zza();
            this.f20021m = this.f20020l;
            z8 = false;
        }
        K1.K0.zza.post(new RunnableC3099hu(this, z8));
    }

    public final void zzA(int i8) {
        AbstractC2296au abstractC2296au = this.f20015g;
        if (abstractC2296au == null) {
            return;
        }
        abstractC2296au.zzz(i8);
    }

    public final void zzB(int i8) {
        AbstractC2296au abstractC2296au = this.f20015g;
        if (abstractC2296au == null) {
            return;
        }
        abstractC2296au.zzA(i8);
    }

    public final void zzC(int i8) {
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzF)).booleanValue()) {
            this.f20010b.setBackgroundColor(i8);
            this.f20011c.setBackgroundColor(i8);
        }
    }

    public final void zzD(int i8) {
        AbstractC2296au abstractC2296au = this.f20015g;
        if (abstractC2296au == null) {
            return;
        }
        abstractC2296au.zzB(i8);
    }

    public final void zzE(String str, String[] strArr) {
        this.f20022n = str;
        this.f20023o = strArr;
    }

    public final void zzF(int i8, int i9, int i10, int i11) {
        if (AbstractC0667v0.zzc()) {
            AbstractC0667v0.zza("Set video bounds to x:" + i8 + ";y:" + i9 + ";w:" + i10 + ";h:" + i11);
        }
        if (i10 == 0 || i11 == 0) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i10, i11);
        layoutParams.setMargins(i8, i9, 0, 0);
        this.f20010b.setLayoutParams(layoutParams);
        requestLayout();
    }

    public final void zzG(float f8) {
        AbstractC2296au abstractC2296au = this.f20015g;
        if (abstractC2296au == null) {
            return;
        }
        abstractC2296au.f18048b.zze(f8);
        abstractC2296au.zzn();
    }

    public final void zzH(float f8, float f9) {
        AbstractC2296au abstractC2296au = this.f20015g;
        if (abstractC2296au != null) {
            abstractC2296au.zzu(f8, f9);
        }
    }

    public final void zzI() {
        AbstractC2296au abstractC2296au = this.f20015g;
        if (abstractC2296au == null) {
            return;
        }
        abstractC2296au.f18048b.zzd(false);
        abstractC2296au.zzn();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2186Zt
    public final void zza() {
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzbT)).booleanValue()) {
            this.f20013e.zza();
        }
        b("ended", new String[0]);
        a();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2186Zt
    public final void zzb(String str, String str2) {
        b("error", "what", str, Constants.EXTRA, str2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2186Zt
    public final void zzc(String str, String str2) {
        b("exception", "what", "ExoPlayerAdapter exception", Constants.EXTRA, str2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2186Zt
    public final void zzd() {
        b("pause", new String[0]);
        a();
        this.f20016h = false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2186Zt
    public final void zze() {
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzbT)).booleanValue()) {
            this.f20013e.zzb();
        }
        if (this.f20009a.zzi() != null && !this.f20017i) {
            boolean z8 = (this.f20009a.zzi().getWindow().getAttributes().flags & 128) != 0;
            this.f20018j = z8;
            if (!z8) {
                this.f20009a.zzi().getWindow().addFlags(128);
                this.f20017i = true;
            }
        }
        this.f20016h = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2186Zt
    public final void zzf() {
        AbstractC2296au abstractC2296au = this.f20015g;
        if (abstractC2296au != null && this.f20021m == 0) {
            float fZzc = abstractC2296au.zzc();
            AbstractC2296au abstractC2296au2 = this.f20015g;
            b("canplaythrough", "duration", String.valueOf(fZzc / 1000.0f), "videoWidth", String.valueOf(abstractC2296au2.zze()), "videoHeight", String.valueOf(abstractC2296au2.zzd()));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2186Zt
    public final void zzg() {
        this.f20011c.setVisibility(4);
        K1.K0.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.du
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.e();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2186Zt
    public final void zzh() {
        this.f20013e.zzb();
        K1.K0.zza.post(new RunnableC2869fu(this));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2186Zt
    public final void zzi() {
        if (this.f20026r && this.f20024p != null && !c()) {
            this.f20025q.setImageBitmap(this.f20024p);
            this.f20025q.invalidate();
            this.f20010b.addView(this.f20025q, new FrameLayout.LayoutParams(-1, -1));
            this.f20010b.bringChildToFront(this.f20025q);
        }
        this.f20013e.zza();
        this.f20021m = this.f20020l;
        K1.K0.zza.post(new RunnableC2984gu(this));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2186Zt
    public final void zzj(int i8, int i9) {
        if (this.f20019k) {
            AbstractC3414kh abstractC3414kh = AbstractC4439th.zzG;
            int iMax = Math.max(i8 / ((Integer) H1.C.zzc().zza(abstractC3414kh)).intValue(), 1);
            int iMax2 = Math.max(i9 / ((Integer) H1.C.zzc().zza(abstractC3414kh)).intValue(), 1);
            Bitmap bitmap = this.f20024p;
            if (bitmap != null && bitmap.getWidth() == iMax && this.f20024p.getHeight() == iMax2) {
                return;
            }
            this.f20024p = Bitmap.createBitmap(iMax, iMax2, Bitmap.Config.ARGB_8888);
            this.f20026r = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2186Zt
    public final void zzk() {
        if (this.f20016h && c()) {
            this.f20010b.removeView(this.f20025q);
        }
        if (this.f20015g == null || this.f20024p == null) {
            return;
        }
        long jElapsedRealtime = G1.u.zzB().elapsedRealtime();
        if (this.f20015g.getBitmap(this.f20024p) != null) {
            this.f20026r = true;
        }
        long jElapsedRealtime2 = G1.u.zzB().elapsedRealtime() - jElapsedRealtime;
        if (AbstractC0667v0.zzc()) {
            AbstractC0667v0.zza("Spinner frame grab took " + jElapsedRealtime2 + "ms");
        }
        if (jElapsedRealtime2 > this.f20014f) {
            L1.n.zzj("Spinner frame grab crossed jank threshold! Suspending spinner.");
            this.f20019k = false;
            this.f20024p = null;
            C1511Jh c1511Jh = this.f20012d;
            if (c1511Jh != null) {
                c1511Jh.zzd("spinner_jank", Long.toString(jElapsedRealtime2));
            }
        }
    }

    public final Integer zzl() {
        AbstractC2296au abstractC2296au = this.f20015g;
        if (abstractC2296au != null) {
            return abstractC2296au.zzw();
        }
        return null;
    }

    public final void zzn() {
        AbstractC2296au abstractC2296au = this.f20015g;
        if (abstractC2296au == null) {
            return;
        }
        TextView textView = new TextView(abstractC2296au.getContext());
        Resources resourcesZze = G1.u.zzo().zze();
        textView.setText(String.valueOf(resourcesZze == null ? "AdMob - " : resourcesZze.getString(E1.d.watermark_label_prefix)).concat(this.f20015g.zzj()));
        textView.setTextColor(W.a.CATEGORY_MASK);
        textView.setBackgroundColor(-256);
        this.f20010b.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
        this.f20010b.bringChildToFront(textView);
    }

    public final void zzo() {
        this.f20013e.zza();
        AbstractC2296au abstractC2296au = this.f20015g;
        if (abstractC2296au != null) {
            abstractC2296au.zzt();
        }
        a();
    }

    public final void zzr(Integer num) {
        if (this.f20015g == null) {
            return;
        }
        if (TextUtils.isEmpty(this.f20022n)) {
            b("no_src", new String[0]);
        } else {
            this.f20015g.zzC(this.f20022n, this.f20023o, num);
        }
    }

    public final void zzs() {
        AbstractC2296au abstractC2296au = this.f20015g;
        if (abstractC2296au == null) {
            return;
        }
        abstractC2296au.f18048b.zzd(true);
        abstractC2296au.zzn();
    }

    public final void zzu() {
        AbstractC2296au abstractC2296au = this.f20015g;
        if (abstractC2296au == null) {
            return;
        }
        abstractC2296au.zzo();
    }

    public final void zzv() {
        AbstractC2296au abstractC2296au = this.f20015g;
        if (abstractC2296au == null) {
            return;
        }
        abstractC2296au.zzp();
    }

    public final void zzw(int i8) {
        AbstractC2296au abstractC2296au = this.f20015g;
        if (abstractC2296au == null) {
            return;
        }
        abstractC2296au.zzq(i8);
    }

    public final void zzx(MotionEvent motionEvent) {
        AbstractC2296au abstractC2296au = this.f20015g;
        if (abstractC2296au == null) {
            return;
        }
        abstractC2296au.dispatchTouchEvent(motionEvent);
    }

    public final void zzy(int i8) {
        AbstractC2296au abstractC2296au = this.f20015g;
        if (abstractC2296au == null) {
            return;
        }
        abstractC2296au.zzx(i8);
    }

    public final void zzz(int i8) {
        AbstractC2296au abstractC2296au = this.f20015g;
        if (abstractC2296au == null) {
            return;
        }
        abstractC2296au.zzy(i8);
    }
}
