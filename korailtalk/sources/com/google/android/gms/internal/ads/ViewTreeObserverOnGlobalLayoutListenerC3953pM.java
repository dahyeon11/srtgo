package com.google.android.gms.internal.ads;

import K1.AbstractC0630c0;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import r2.InterfaceC6172a;

/* renamed from: com.google.android.gms.internal.ads.pM, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC3953pM extends AbstractBinderC2847fj implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, QM {
    public static final AbstractC2394bl0 zza = AbstractC2394bl0.zzp("2011", "1009", "3010");

    /* renamed from: a, reason: collision with root package name */
    private final String f21736a;

    /* renamed from: c, reason: collision with root package name */
    private FrameLayout f21738c;

    /* renamed from: d, reason: collision with root package name */
    private FrameLayout f21739d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceExecutorServiceC1974Un0 f21740e;

    /* renamed from: f, reason: collision with root package name */
    private View f21741f;

    /* renamed from: h, reason: collision with root package name */
    private NL f21743h;

    /* renamed from: i, reason: collision with root package name */
    private ViewOnAttachStateChangeListenerC2033Wc f21744i;

    /* renamed from: k, reason: collision with root package name */
    private InterfaceC2168Zi f21746k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f21747l;

    /* renamed from: n, reason: collision with root package name */
    private GestureDetector f21749n;

    /* renamed from: b, reason: collision with root package name */
    private Map f21737b = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    private InterfaceC6172a f21745j = null;

    /* renamed from: m, reason: collision with root package name */
    private boolean f21748m = false;

    /* renamed from: g, reason: collision with root package name */
    private final int f21742g = 241806000;

    public ViewTreeObserverOnGlobalLayoutListenerC3953pM(FrameLayout frameLayout, FrameLayout frameLayout2, int i8) {
        String str;
        this.f21738c = frameLayout;
        this.f21739d = frameLayout2;
        String canonicalName = frameLayout.getClass().getCanonicalName();
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = "1007";
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = "2009";
        } else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(canonicalName);
            str = "3012";
        }
        this.f21736a = str;
        G1.u.zzx();
        C1531Jt.zza(frameLayout, this);
        G1.u.zzx();
        C1531Jt.zzb(frameLayout, this);
        this.f21740e = AbstractC4805wt.zze;
        this.f21744i = new ViewOnAttachStateChangeListenerC2033Wc(this.f21738c.getContext(), this.f21738c);
        frameLayout.setOnTouchListener(this);
        frameLayout.setOnClickListener(this);
    }

    private final synchronized void zzt(String str) {
        DisplayMetrics displayMetrics;
        try {
            View frameLayout = new FrameLayout(this.f21739d.getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            Context context = this.f21739d.getContext();
            frameLayout.setClickable(false);
            frameLayout.setFocusable(false);
            if (!TextUtils.isEmpty(str)) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                Resources resources = context.getResources();
                if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                    try {
                        byte[] bArrDecode = Base64.decode(str, 0);
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length));
                        bitmapDrawable.setTargetDensity(displayMetrics.densityDpi);
                        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                        bitmapDrawable.setTileModeXY(tileMode, tileMode);
                        frameLayout.setBackground(bitmapDrawable);
                    } catch (IllegalArgumentException e8) {
                        L1.n.zzk("Encountered invalid base64 watermark.", e8);
                    }
                }
            }
            this.f21739d.addView(frameLayout);
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void zzu() {
        this.f21740e.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.oM
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.b();
            }
        });
    }

    private final synchronized void zzv() {
        if (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzlA)).booleanValue() || this.f21743h.zza() == 0) {
            return;
        }
        this.f21749n = new GestureDetector(this.f21738c.getContext(), new GestureDetectorOnGestureListenerC4636vM(this.f21743h, this));
    }

    final /* synthetic */ void b() {
        if (this.f21741f == null) {
            View view = new View(this.f21738c.getContext());
            this.f21741f = view;
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
        }
        if (this.f21738c != this.f21741f.getParent()) {
            this.f21738c.addView(this.f21741f);
        }
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        NL nl = this.f21743h;
        if (nl == null || !nl.zzU()) {
            return;
        }
        this.f21743h.zzv();
        this.f21743h.zzD(view, this.f21738c, zzl(), zzm(), false);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        NL nl = this.f21743h;
        if (nl != null) {
            FrameLayout frameLayout = this.f21738c;
            nl.zzB(frameLayout, zzl(), zzm(), NL.zzX(frameLayout));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        NL nl = this.f21743h;
        if (nl != null) {
            FrameLayout frameLayout = this.f21738c;
            nl.zzB(frameLayout, zzl(), zzm(), NL.zzX(frameLayout));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        NL nl = this.f21743h;
        if (nl != null) {
            nl.zzK(view, motionEvent, this.f21738c);
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzlA)).booleanValue() && this.f21749n != null && this.f21743h.zza() != 0) {
                this.f21749n.onTouchEvent(motionEvent);
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2847fj, com.google.android.gms.internal.ads.InterfaceC2962gj
    public final synchronized InterfaceC6172a zzb(String str) {
        return r2.b.wrap(zzg(str));
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2847fj, com.google.android.gms.internal.ads.InterfaceC2962gj
    public final synchronized void zzc() {
        try {
            if (this.f21748m) {
                return;
            }
            NL nl = this.f21743h;
            if (nl != null) {
                nl.zzS(this);
                this.f21743h = null;
            }
            this.f21737b.clear();
            this.f21738c.removeAllViews();
            this.f21739d.removeAllViews();
            this.f21737b = null;
            this.f21738c = null;
            this.f21739d = null;
            this.f21741f = null;
            this.f21744i = null;
            this.f21748m = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2847fj, com.google.android.gms.internal.ads.InterfaceC2962gj
    public final void zzd(InterfaceC6172a interfaceC6172a) {
        onTouch(this.f21738c, (MotionEvent) r2.b.unwrap(interfaceC6172a));
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2847fj, com.google.android.gms.internal.ads.InterfaceC2962gj
    public final synchronized void zzdv(String str, InterfaceC6172a interfaceC6172a) {
        zzq(str, (View) r2.b.unwrap(interfaceC6172a), true);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2847fj, com.google.android.gms.internal.ads.InterfaceC2962gj
    public final synchronized void zzdw(InterfaceC6172a interfaceC6172a) {
        this.f21743h.zzM((View) r2.b.unwrap(interfaceC6172a));
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2847fj, com.google.android.gms.internal.ads.InterfaceC2962gj
    public final synchronized void zzdx(InterfaceC2168Zi interfaceC2168Zi) {
        if (!this.f21748m) {
            this.f21747l = true;
            this.f21746k = interfaceC2168Zi;
            NL nl = this.f21743h;
            if (nl != null) {
                nl.zzc().zzb(interfaceC2168Zi);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2847fj, com.google.android.gms.internal.ads.InterfaceC2962gj
    public final synchronized void zzdy(InterfaceC6172a interfaceC6172a) {
        if (this.f21748m) {
            return;
        }
        this.f21745j = interfaceC6172a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2847fj, com.google.android.gms.internal.ads.InterfaceC2962gj
    public final synchronized void zzdz(InterfaceC6172a interfaceC6172a) {
        if (this.f21748m) {
            return;
        }
        Object objUnwrap = r2.b.unwrap(interfaceC6172a);
        if (!(objUnwrap instanceof NL)) {
            L1.n.zzj("Not an instance of native engine. This is most likely a transient error");
            return;
        }
        NL nl = this.f21743h;
        if (nl != null) {
            nl.zzS(this);
        }
        zzu();
        NL nl2 = (NL) objUnwrap;
        this.f21743h = nl2;
        nl2.zzR(this);
        this.f21743h.zzJ(this.f21738c);
        this.f21743h.zzu(this.f21739d);
        if (this.f21747l) {
            this.f21743h.zzc().zzb(this.f21746k);
        }
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzdT)).booleanValue() && !TextUtils.isEmpty(this.f21743h.zzg())) {
            zzt(this.f21743h.zzg());
        }
        zzv();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2847fj, com.google.android.gms.internal.ads.InterfaceC2962gj
    public final synchronized void zze(InterfaceC6172a interfaceC6172a, int i8) {
    }

    @Override // com.google.android.gms.internal.ads.QM
    public final /* synthetic */ View zzf() {
        return this.f21738c;
    }

    @Override // com.google.android.gms.internal.ads.QM
    public final synchronized View zzg(String str) {
        WeakReference weakReference;
        if (!this.f21748m && (weakReference = (WeakReference) this.f21737b.get(str)) != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.QM
    public final FrameLayout zzh() {
        return this.f21739d;
    }

    @Override // com.google.android.gms.internal.ads.QM
    public final ViewOnAttachStateChangeListenerC2033Wc zzi() {
        return this.f21744i;
    }

    @Override // com.google.android.gms.internal.ads.QM
    public final InterfaceC6172a zzj() {
        return this.f21745j;
    }

    @Override // com.google.android.gms.internal.ads.QM
    public final synchronized String zzk() {
        return this.f21736a;
    }

    @Override // com.google.android.gms.internal.ads.QM
    public final synchronized Map zzl() {
        return this.f21737b;
    }

    @Override // com.google.android.gms.internal.ads.QM
    public final synchronized Map zzm() {
        return this.f21737b;
    }

    @Override // com.google.android.gms.internal.ads.QM
    public final synchronized Map zzn() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.QM
    public final synchronized JSONObject zzo() {
        NL nl = this.f21743h;
        if (nl == null) {
            return null;
        }
        return nl.zzi(this.f21738c, zzl(), zzm());
    }

    @Override // com.google.android.gms.internal.ads.QM
    public final synchronized JSONObject zzp() {
        NL nl = this.f21743h;
        if (nl == null) {
            return null;
        }
        return nl.zzk(this.f21738c, zzl(), zzm());
    }

    @Override // com.google.android.gms.internal.ads.QM
    public final synchronized void zzq(String str, View view, boolean z8) {
        if (!this.f21748m) {
            if (view == null) {
                this.f21737b.remove(str);
                return;
            }
            this.f21737b.put(str, new WeakReference(view));
            if (!"1098".equals(str) && !"3011".equals(str)) {
                if (AbstractC0630c0.zzi(this.f21742g)) {
                    view.setOnTouchListener(this);
                }
                view.setClickable(true);
                view.setOnClickListener(this);
            }
        }
    }

    public final FrameLayout zzr() {
        return this.f21738c;
    }
}
