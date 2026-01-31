package com.google.android.gms.internal.ads;

import H1.C0591z;
import H1.InterfaceC0583w0;
import K1.AbstractC0630c0;
import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.oL */
/* loaded from: classes2.dex */
public final class C3837oL implements InterfaceC2353bM {

    /* renamed from: C */
    private InterfaceC0583w0 f21449C;

    /* renamed from: a */
    private final Context f21450a;

    /* renamed from: b */
    private final C2696eM f21451b;

    /* renamed from: c */
    private final JSONObject f21452c;

    /* renamed from: d */
    private final C4754wO f21453d;

    /* renamed from: e */
    private final SL f21454e;

    /* renamed from: f */
    private final C2487cb f21455f;

    /* renamed from: g */
    private final TF f21456g;

    /* renamed from: h */
    private final C4850xF f21457h;

    /* renamed from: i */
    private final BJ f21458i;

    /* renamed from: j */
    private final C4654va0 f21459j;

    /* renamed from: k */
    private final L1.a f21460k;

    /* renamed from: l */
    private final C1825Ra0 f21461l;

    /* renamed from: m */
    private final C2904gB f21462m;

    /* renamed from: n */
    private final ViewOnClickListenerC4864xM f21463n;

    /* renamed from: o */
    private final o2.f f21464o;

    /* renamed from: p */
    private final C4858xJ f21465p;

    /* renamed from: q */
    private final C3865oe0 f21466q;

    /* renamed from: r */
    private final C3845oP f21467r;

    /* renamed from: s */
    private final RunnableC4660vd0 f21468s;

    /* renamed from: t */
    private final GW f21469t;

    /* renamed from: v */
    private boolean f21471v;

    /* renamed from: u */
    private boolean f21470u = false;

    /* renamed from: w */
    private boolean f21472w = false;

    /* renamed from: x */
    private boolean f21473x = false;

    /* renamed from: y */
    private Point f21474y = new Point();

    /* renamed from: z */
    private Point f21475z = new Point();

    /* renamed from: A */
    private long f21447A = 0;

    /* renamed from: B */
    private long f21448B = 0;

    public C3837oL(Context context, C2696eM c2696eM, JSONObject jSONObject, C4754wO c4754wO, SL sl, C2487cb c2487cb, TF tf, C4850xF c4850xF, BJ bj, C4654va0 c4654va0, L1.a aVar, C1825Ra0 c1825Ra0, C2904gB c2904gB, ViewOnClickListenerC4864xM viewOnClickListenerC4864xM, o2.f fVar, C4858xJ c4858xJ, C3865oe0 c3865oe0, RunnableC4660vd0 runnableC4660vd0, GW gw, C3845oP c3845oP) {
        this.f21450a = context;
        this.f21451b = c2696eM;
        this.f21452c = jSONObject;
        this.f21453d = c4754wO;
        this.f21454e = sl;
        this.f21455f = c2487cb;
        this.f21456g = tf;
        this.f21457h = c4850xF;
        this.f21458i = bj;
        this.f21459j = c4654va0;
        this.f21460k = aVar;
        this.f21461l = c1825Ra0;
        this.f21462m = c2904gB;
        this.f21463n = viewOnClickListenerC4864xM;
        this.f21464o = fVar;
        this.f21465p = c4858xJ;
        this.f21466q = c3865oe0;
        this.f21468s = runnableC4660vd0;
        this.f21469t = gw;
        this.f21467r = c3845oP;
    }

    private final String a(View view) {
        if (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzdx)).booleanValue()) {
            return null;
        }
        try {
            return this.f21455f.zzc().zzh(this.f21450a, view, null);
        } catch (Exception unused) {
            L1.n.zzg("Exception getting data.");
            return null;
        }
    }

    private final String b(View view, Map map) {
        if (map != null && view != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (view.equals((View) ((WeakReference) entry.getValue()).get())) {
                    return (String) entry.getKey();
                }
            }
        }
        int iZzc = this.f21454e.zzc();
        if (iZzc == 1) {
            return "1099";
        }
        if (iZzc == 2) {
            return "2099";
        }
        if (iZzc != 6) {
            return null;
        }
        return "3099";
    }

    private final boolean c(String str) {
        JSONObject jSONObjectOptJSONObject = this.f21452c.optJSONObject("allow_pub_event_reporting");
        return jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optBoolean(str, false);
    }

    private final boolean d() {
        return this.f21452c.optBoolean("allow_custom_click_gesture", false);
    }

    private final boolean e(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, boolean z8) throws JSONException {
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.f21452c);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzdx)).booleanValue()) {
                jSONObject6.put("view_signals", str);
            }
            jSONObject6.put("policy_validator_enabled", z8);
            Context context = this.f21450a;
            JSONObject jSONObject7 = new JSONObject();
            G1.u.zzp();
            DisplayMetrics displayMetricsZzt = K1.K0.zzt((WindowManager) context.getSystemService("window"));
            AbstractC3609mL abstractC3609mL = null;
            try {
                jSONObject7.put("width", C0591z.zzb().zzb(context, displayMetricsZzt.widthPixels));
                jSONObject7.put("height", C0591z.zzb().zzb(context, displayMetricsZzt.heightPixels));
            } catch (JSONException unused) {
                jSONObject7 = null;
            }
            jSONObject6.put("screen", jSONObject7);
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zziE)).booleanValue()) {
                this.f21453d.zzl("/clickRecorded", new C3495lL(this, null));
            } else {
                this.f21453d.zzl("/logScionEvent", new C3267jL(this, null));
            }
            this.f21453d.zzl("/nativeImpression", new C3723nL(this, abstractC3609mL));
            AbstractC5147zt.zza(this.f21453d.zzg("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression");
            if (this.f21470u) {
                return true;
            }
            this.f21470u = G1.u.zzs().zzn(this.f21450a, this.f21460k.afmaVersion, this.f21459j.zzD.toString(), this.f21461l.zzf);
            return true;
        } catch (JSONException e8) {
            L1.n.zzh("Unable to create impression JSON.", e8);
            return false;
        }
    }

    protected final void i(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6, boolean z8, boolean z9) throws JSONException {
        String strZze;
        try {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("ad", this.f21452c);
            jSONObject7.put("asset_view_signal", jSONObject2);
            jSONObject7.put("ad_view_signal", jSONObject);
            jSONObject7.put("click_signal", jSONObject5);
            jSONObject7.put("scroll_view_signal", jSONObject3);
            jSONObject7.put("lock_screen_signal", jSONObject4);
            jSONObject7.put("has_custom_click_handler", this.f21451b.zzc(this.f21454e.zzA()) != null);
            jSONObject7.put("provided_signals", jSONObject6);
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("asset_id", str);
            jSONObject8.put("template", this.f21454e.zzc());
            jSONObject8.put("view_aware_api_used", z8);
            C1840Ri c1840Ri = this.f21461l.zzi;
            jSONObject8.put("custom_mute_requested", c1840Ri != null && c1840Ri.zzg);
            jSONObject8.put("custom_mute_enabled", (this.f21454e.zzH().isEmpty() || this.f21454e.zzk() == null) ? false : true);
            if (this.f21463n.zza() != null && this.f21452c.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject8.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject8.put("timestamp", this.f21464o.currentTimeMillis());
            if (this.f21473x && d()) {
                jSONObject8.put("custom_click_gesture_eligible", true);
            }
            if (z9) {
                jSONObject8.put("is_custom_click_gesture", true);
            }
            jSONObject8.put("has_custom_click_handler", this.f21451b.zzc(this.f21454e.zzA()) != null);
            try {
                JSONObject jSONObjectOptJSONObject = this.f21452c.optJSONObject("tracking_urls_and_actions");
                if (jSONObjectOptJSONObject == null) {
                    jSONObjectOptJSONObject = new JSONObject();
                }
                strZze = this.f21455f.zzc().zze(this.f21450a, jSONObjectOptJSONObject.optString("click_string"), view);
            } catch (Exception e8) {
                L1.n.zzh("Exception obtaining click signals", e8);
                strZze = null;
            }
            jSONObject8.put("click_signals", strZze);
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzeE)).booleanValue()) {
                jSONObject8.put("open_chrome_custom_tab", true);
            }
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zziI)).booleanValue() && o2.n.isAtLeastR()) {
                jSONObject8.put("try_fallback_for_deep_link", true);
            }
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zziJ)).booleanValue() && o2.n.isAtLeastR()) {
                jSONObject8.put("in_app_link_handling_for_android_11_enabled", true);
            }
            jSONObject7.put("click", jSONObject8);
            JSONObject jSONObject9 = new JSONObject();
            long jCurrentTimeMillis = this.f21464o.currentTimeMillis();
            jSONObject9.put("time_from_last_touch_down", jCurrentTimeMillis - this.f21447A);
            jSONObject9.put("time_from_last_touch", jCurrentTimeMillis - this.f21448B);
            jSONObject7.put("touch_signal", jSONObject9);
            if (this.f21459j.zzaj) {
                JSONObject jSONObject10 = (JSONObject) this.f21452c.get("tracking_urls_and_actions");
                String string = jSONObject10 != null ? jSONObject10.getString("gws_query_id") : null;
                if (string != null) {
                    this.f21469t.zzp(string, this.f21454e);
                }
            }
            AbstractC5147zt.zza(this.f21453d.zzg("google.afma.nativeAds.handleClick", jSONObject7), "Error during performing handleClick");
        } catch (JSONException e9) {
            L1.n.zzh("Unable to create click JSON.", e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2353bM
    public final boolean zzA() {
        if (zza() == 0) {
            return true;
        }
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzlA)).booleanValue()) {
            return this.f21461l.zzi.zzj;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2353bM
    public final boolean zzB() {
        return d();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2353bM
    public final boolean zzC(Bundle bundle) {
        if (c("impression_reporting")) {
            return e(null, null, null, null, ((Boolean) H1.C.zzc().zza(AbstractC4439th.zzlv)).booleanValue() ? a(null) : null, C0591z.zzb().zzk(bundle, null), false);
        }
        L1.n.zzg("The ad slot cannot handle external impression events. You must be in the allow list to be able to report your impression events.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2353bM
    public final int zza() {
        if (this.f21461l.zzi == null) {
            return 0;
        }
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzlA)).booleanValue()) {
            return this.f21461l.zzi.zzi;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2353bM
    public final JSONObject zze(View view, Map map, Map map2, ImageView.ScaleType scaleType) throws JSONException {
        Context context = this.f21450a;
        JSONObject jSONObjectZzd = AbstractC0630c0.zzd(context, map, map2, view, scaleType);
        JSONObject jSONObjectZzg = AbstractC0630c0.zzg(context, view);
        JSONObject jSONObjectZzf = AbstractC0630c0.zzf(view);
        JSONObject jSONObjectZze = AbstractC0630c0.zze(context, view);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("asset_view_signal", jSONObjectZzd);
            jSONObject.put("ad_view_signal", jSONObjectZzg);
            jSONObject.put("scroll_view_signal", jSONObjectZzf);
            jSONObject.put("lock_screen_signal", jSONObjectZze);
            return jSONObject;
        } catch (JSONException e8) {
            L1.n.zzh("Unable to create native ad view signals JSON.", e8);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2353bM
    public final JSONObject zzf(View view, Map map, Map map2, ImageView.ScaleType scaleType) throws JSONException {
        JSONObject jSONObjectZze = zze(view, map, map2, scaleType);
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f21473x && d()) {
                jSONObject.put("custom_click_gesture_eligible", true);
            }
            if (jSONObjectZze != null) {
                jSONObject.put("nas", jSONObjectZze);
            }
        } catch (JSONException e8) {
            L1.n.zzh("Unable to create native click meta data JSON.", e8);
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2353bM
    public final void zzg() {
        try {
            InterfaceC0583w0 interfaceC0583w0 = this.f21449C;
            if (interfaceC0583w0 != null) {
                interfaceC0583w0.zze();
            }
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2353bM
    public final void zzh() {
        if (this.f21452c.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.f21463n.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2353bM
    public final void zzi() {
        this.f21453d.zzi();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2353bM
    public final void zzj(H1.A0 a02) {
        try {
            if (this.f21472w) {
                return;
            }
            if (a02 == null) {
                SL sl = this.f21454e;
                if (sl.zzk() != null) {
                    this.f21472w = true;
                    this.f21466q.zzc(sl.zzk().zzf(), this.f21468s);
                    zzg();
                    return;
                }
            }
            this.f21472w = true;
            this.f21466q.zzc(a02.zzf(), this.f21468s);
            zzg();
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2353bM
    public final void zzk(View view, View view2, Map map, Map map2, boolean z8, ImageView.ScaleType scaleType) throws JSONException {
        Context context = this.f21450a;
        JSONObject jSONObjectZzd = AbstractC0630c0.zzd(context, map, map2, view2, scaleType);
        JSONObject jSONObjectZzg = AbstractC0630c0.zzg(context, view2);
        JSONObject jSONObjectZzf = AbstractC0630c0.zzf(view2);
        JSONObject jSONObjectZze = AbstractC0630c0.zze(context, view2);
        String strB = b(view, map);
        i(true == ((Boolean) H1.C.zzc().zza(AbstractC4439th.zzdE)).booleanValue() ? view2 : view, jSONObjectZzg, jSONObjectZzd, jSONObjectZzf, jSONObjectZze, strB, AbstractC0630c0.zzc(strB, context, this.f21475z, this.f21474y), null, z8, false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2353bM
    public final void zzl(String str) throws JSONException {
        i(null, null, null, null, null, str, null, null, false, false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2353bM
    public final void zzm(Bundle bundle) throws JSONException {
        if (bundle == null) {
            L1.n.zze("Click data is null. No click is reported.");
        } else if (!c("click_reporting")) {
            L1.n.zzg("The ad slot cannot handle external click events. You must be part of the allow list to be able to report your click events.");
        } else {
            Bundle bundle2 = bundle.getBundle("click_signal");
            i(null, null, null, null, null, bundle2 != null ? bundle2.getString("asset_id") : null, null, C0591z.zzb().zzk(bundle, null), false, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2353bM
    public final void zzo(View view, View view2, Map map, Map map2, boolean z8, ImageView.ScaleType scaleType, int i8) throws JSONException {
        JSONObject jSONObject;
        boolean z9 = false;
        if (this.f21452c.optBoolean("allow_sdk_custom_click_gesture", false)) {
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzlA)).booleanValue()) {
                z9 = true;
            }
        }
        if (!z9) {
            if (!this.f21473x) {
                L1.n.zze("Custom click reporting failed. enableCustomClickGesture is not set.");
                return;
            } else if (!d()) {
                L1.n.zze("Custom click reporting failed. Ad unit id not in the allow list.");
                return;
            }
        }
        JSONObject jSONObjectZzd = AbstractC0630c0.zzd(this.f21450a, map, map2, view2, scaleType);
        JSONObject jSONObjectZzg = AbstractC0630c0.zzg(this.f21450a, view2);
        JSONObject jSONObjectZzf = AbstractC0630c0.zzf(view2);
        JSONObject jSONObjectZze = AbstractC0630c0.zze(this.f21450a, view2);
        String strB = b(view, map);
        JSONObject jSONObjectZzc = AbstractC0630c0.zzc(strB, this.f21450a, this.f21475z, this.f21474y);
        if (z9) {
            try {
                JSONObject jSONObject2 = this.f21452c;
                Point point = this.f21475z;
                Point point2 = this.f21474y;
                try {
                    jSONObject = new JSONObject();
                } catch (Exception e8) {
                    e = e8;
                    jSONObject = null;
                }
                try {
                    JSONObject jSONObject3 = new JSONObject();
                    JSONObject jSONObject4 = new JSONObject();
                    if (point != null) {
                        jSONObject3.put("x", point.x);
                        jSONObject3.put("y", point.y);
                    }
                    if (point2 != null) {
                        jSONObject4.put("x", point2.x);
                        jSONObject4.put("y", point2.y);
                    }
                    jSONObject.put("start_point", jSONObject3);
                    jSONObject.put("end_point", jSONObject4);
                    jSONObject.put("duration_ms", i8);
                } catch (Exception e9) {
                    e = e9;
                    L1.n.zzh("Error occurred while grabbing custom click gesture signals.", e);
                    jSONObject2.put("custom_click_gesture_signal", jSONObject);
                    i(view2, jSONObjectZzg, jSONObjectZzd, jSONObjectZzf, jSONObjectZze, strB, jSONObjectZzc, null, z8, true);
                }
                jSONObject2.put("custom_click_gesture_signal", jSONObject);
            } catch (JSONException e10) {
                L1.n.zzh("Error occurred while adding CustomClickGestureSignals to adJson.", e10);
                G1.u.zzo().zzw(e10, "FirstPartyNativeAdCore.performCustomClickGesture");
            }
        }
        i(view2, jSONObjectZzg, jSONObjectZzd, jSONObjectZzf, jSONObjectZze, strB, jSONObjectZzc, null, z8, true);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2353bM
    public final void zzp() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.f21452c);
            AbstractC5147zt.zza(this.f21453d.zzg("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression");
        } catch (JSONException e8) {
            L1.n.zzh("", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2353bM
    public final void zzq(View view, Map map, Map map2, ImageView.ScaleType scaleType) throws JSONException {
        Context context = this.f21450a;
        e(AbstractC0630c0.zzg(context, view), AbstractC0630c0.zzd(context, map, map2, view, scaleType), AbstractC0630c0.zzf(view), AbstractC0630c0.zze(context, view), a(view), null, AbstractC0630c0.zzh(context, this.f21459j));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2353bM
    public final void zzr() throws JSONException {
        e(null, null, null, null, null, null, false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2353bM
    public final void zzs(View view, MotionEvent motionEvent, View view2) {
        this.f21474y = AbstractC0630c0.zza(motionEvent, view2);
        long jCurrentTimeMillis = this.f21464o.currentTimeMillis();
        this.f21448B = jCurrentTimeMillis;
        if (motionEvent.getAction() == 0) {
            this.f21467r.zzb(motionEvent);
            this.f21447A = jCurrentTimeMillis;
            this.f21475z = this.f21474y;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        Point point = this.f21474y;
        motionEventObtain.setLocation(point.x, point.y);
        this.f21455f.zzd(motionEventObtain);
        motionEventObtain.recycle();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2353bM
    public final void zzt(Bundle bundle) {
        if (bundle == null) {
            L1.n.zze("Touch event data is null. No touch event is reported.");
            return;
        }
        if (!c("touch_reporting")) {
            L1.n.zzg("The ad slot cannot handle external touch events. You must be in the allow list to be able to report your touch events.");
            return;
        }
        this.f21455f.zzc().zzl((int) bundle.getFloat("x"), (int) bundle.getFloat("y"), bundle.getInt("duration_ms"));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2353bM
    public final void zzu(View view) {
        if (!this.f21452c.optBoolean("custom_one_point_five_click_enabled", false)) {
            L1.n.zzj("setClickConfirmingView: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        ViewOnClickListenerC4864xM viewOnClickListenerC4864xM = this.f21463n;
        if (view == null) {
            return;
        }
        view.setOnClickListener(viewOnClickListenerC4864xM);
        view.setClickable(true);
        viewOnClickListenerC4864xM.f23699g = new WeakReference(view);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2353bM
    public final void zzv() {
        this.f21473x = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2353bM
    public final void zzw(InterfaceC0583w0 interfaceC0583w0) {
        this.f21449C = interfaceC0583w0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2353bM
    public final void zzx(InterfaceC2129Yj interfaceC2129Yj) {
        if (this.f21452c.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.f21463n.zzc(interfaceC2129Yj);
        } else {
            L1.n.zzj("setUnconfirmedClickListener: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2353bM
    public final void zzy(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        this.f21474y = new Point();
        this.f21475z = new Point();
        if (!this.f21471v) {
            this.f21465p.zza(view);
            this.f21471v = true;
        }
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        this.f21462m.zzi(this);
        boolean zZzi = AbstractC0630c0.zzi(this.f21460k.clientJarVersion);
        if (map != null) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                View view2 = (View) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (view2 != null) {
                    if (zZzi) {
                        view2.setOnTouchListener(onTouchListener);
                    }
                    view2.setClickable(true);
                    view2.setOnClickListener(onClickListener);
                }
            }
        }
        if (map2 != null) {
            Iterator it2 = map2.entrySet().iterator();
            while (it2.hasNext()) {
                View view3 = (View) ((WeakReference) ((Map.Entry) it2.next()).getValue()).get();
                if (view3 != null) {
                    if (zZzi) {
                        view3.setOnTouchListener(onTouchListener);
                    }
                    view3.setClickable(false);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2353bM
    public final void zzz(View view, Map map) {
        this.f21474y = new Point();
        this.f21475z = new Point();
        if (view != null) {
            this.f21465p.zzb(view);
        }
        this.f21471v = false;
    }
}
