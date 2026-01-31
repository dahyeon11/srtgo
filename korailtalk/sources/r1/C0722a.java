package R1;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.AbstractC4439th;
import com.google.android.gms.internal.ads.AbstractC4669vi;
import com.google.android.gms.internal.ads.AbstractC4805wt;
import com.google.android.gms.internal.ads.C1989Va0;
import com.google.android.gms.internal.ads.C2487cb;
import com.google.android.gms.internal.ads.C2602db;
import com.google.android.gms.internal.ads.C3865oe0;
import com.google.android.gms.internal.ads.InterfaceExecutorServiceC1974Un0;
import com.google.android.gms.internal.ads.QQ;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;
import y1.C6527h;
import y1.EnumC6522c;

/* renamed from: R1.a */
/* loaded from: classes.dex */
final class C0722a {

    /* renamed from: a */
    private final Context f4340a;

    /* renamed from: b */
    private final WebView f4341b;

    /* renamed from: c */
    private final C2487cb f4342c;

    /* renamed from: d */
    private final C1989Va0 f4343d;

    /* renamed from: e */
    private final int f4344e;

    /* renamed from: f */
    private final QQ f4345f;

    /* renamed from: g */
    private final boolean f4346g;

    /* renamed from: h */
    private final InterfaceExecutorServiceC1974Un0 f4347h = AbstractC4805wt.zze;

    /* renamed from: i */
    private final C3865oe0 f4348i;

    /* renamed from: j */
    private final K f4349j;

    C0722a(WebView webView, C2487cb c2487cb, QQ qq, C3865oe0 c3865oe0, C1989Va0 c1989Va0, K k8) {
        this.f4341b = webView;
        Context context = webView.getContext();
        this.f4340a = context;
        this.f4342c = c2487cb;
        this.f4345f = qq;
        AbstractC4439th.zza(context);
        this.f4344e = ((Integer) H1.C.zzc().zza(AbstractC4439th.zzjC)).intValue();
        this.f4346g = ((Boolean) H1.C.zzc().zza(AbstractC4439th.zzjD)).booleanValue();
        this.f4348i = c3865oe0;
        this.f4343d = c1989Va0;
        this.f4349j = k8;
    }

    final /* synthetic */ void c(Bundle bundle, T1.b bVar) {
        CookieManager cookieManagerZza = G1.u.zzq().zza(this.f4340a);
        bundle.putBoolean("accept_3p_cookie", cookieManagerZza != null ? cookieManagerZza.acceptThirdPartyCookies(this.f4341b) : false);
        T1.a.generate(this.f4340a, EnumC6522c.BANNER, ((C6527h.a) new C6527h.a().addNetworkExtrasBundle(AdMobAdapter.class, bundle)).build(), bVar);
    }

    final /* synthetic */ void d(String str) {
        C1989Va0 c1989Va0;
        Uri uriZza = Uri.parse(str);
        try {
            uriZza = (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzlW)).booleanValue() || (c1989Va0 = this.f4343d) == null) ? this.f4342c.zza(uriZza, this.f4340a, this.f4341b, null) : c1989Va0.zza(uriZza, this.f4340a, this.f4341b, null);
        } catch (C2602db e8) {
            L1.n.zzf("Failed to append the click signal to URL: ", e8);
            G1.u.zzo().zzw(e8, "TaggingLibraryJsInterface.recordClick");
        }
        this.f4348i.zzc(uriZza.toString(), null);
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        try {
            long jCurrentTimeMillis = G1.u.zzB().currentTimeMillis();
            String strZze = this.f4342c.zzc().zze(this.f4340a, str, this.f4341b);
            if (this.f4346g) {
                W.zzd(this.f4345f, null, "csg", new Pair("clat", String.valueOf(G1.u.zzB().currentTimeMillis() - jCurrentTimeMillis)));
            }
            return strZze;
        } catch (RuntimeException e8) {
            L1.n.zzh("Exception getting click signals. ", e8);
            G1.u.zzo().zzw(e8, "TaggingLibraryJsInterface.getClickSignals");
            return "";
        }
    }

    @JavascriptInterface
    public String getClickSignalsWithTimeout(final String str, int i8) {
        if (i8 <= 0) {
            L1.n.zzg("Invalid timeout for getting click signals. Timeout=" + i8);
            return "";
        }
        try {
            return (String) AbstractC4805wt.zza.zzb(new Callable() { // from class: R1.D
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zza.getClickSignals(str);
                }
            }).get(Math.min(i8, this.f4344e), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e8) {
            L1.n.zzh("Exception getting click signals with timeout. ", e8);
            G1.u.zzo().zzw(e8, "TaggingLibraryJsInterface.getClickSignalsWithTimeout");
            return e8 instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    public String getQueryInfo() {
        G1.u.zzp();
        String string = UUID.randomUUID().toString();
        final Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_6");
        final H h8 = new H(this, string);
        if (((Boolean) AbstractC4669vi.zza.zze()).booleanValue()) {
            this.f4349j.zzg(this.f4341b, h8);
        } else {
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzjF)).booleanValue()) {
                this.f4347h.execute(new Runnable() { // from class: R1.E
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.c(bundle, h8);
                    }
                });
            } else {
                T1.a.generate(this.f4340a, EnumC6522c.BANNER, ((C6527h.a) new C6527h.a().addNetworkExtrasBundle(AdMobAdapter.class, bundle)).build(), h8);
            }
        }
        return string;
    }

    @JavascriptInterface
    public String getViewSignals() {
        try {
            long jCurrentTimeMillis = G1.u.zzB().currentTimeMillis();
            String strZzh = this.f4342c.zzc().zzh(this.f4340a, this.f4341b, null);
            if (this.f4346g) {
                W.zzd(this.f4345f, null, "vsg", new Pair("vlat", String.valueOf(G1.u.zzB().currentTimeMillis() - jCurrentTimeMillis)));
            }
            return strZzh;
        } catch (RuntimeException e8) {
            L1.n.zzh("Exception getting view signals. ", e8);
            G1.u.zzo().zzw(e8, "TaggingLibraryJsInterface.getViewSignals");
            return "";
        }
    }

    @JavascriptInterface
    public String getViewSignalsWithTimeout(int i8) {
        if (i8 <= 0) {
            L1.n.zzg("Invalid timeout for getting view signals. Timeout=" + i8);
            return "";
        }
        try {
            return (String) AbstractC4805wt.zza.zzb(new Callable() { // from class: R1.A
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zza.getViewSignals();
                }
            }).get(Math.min(i8, this.f4344e), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e8) {
            L1.n.zzh("Exception getting view signals with timeout. ", e8);
            G1.u.zzo().zzw(e8, "TaggingLibraryJsInterface.getViewSignalsWithTimeout");
            return e8 instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    public void recordClick(final String str) {
        if (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzjH)).booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        AbstractC4805wt.zza.execute(new Runnable() { // from class: R1.B
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.d(str);
            }
        });
    }

    @JavascriptInterface
    public void reportTouchEvent(String str) throws JSONException {
        int i8;
        int i9;
        int i10;
        float f8;
        int i11;
        int i12;
        int i13;
        try {
            JSONObject jSONObject = new JSONObject(str);
            i8 = jSONObject.getInt("x");
            i9 = jSONObject.getInt("y");
            i10 = jSONObject.getInt("duration_ms");
            f8 = (float) jSONObject.getDouble("force");
            i11 = jSONObject.getInt("type");
        } catch (RuntimeException | JSONException e8) {
            e = e8;
        }
        try {
            if (i11 != 0) {
                int i14 = 1;
                if (i11 != 1) {
                    i14 = 2;
                    if (i11 != 2) {
                        i14 = 3;
                        i13 = i11 != 3 ? -1 : 0;
                    }
                }
                i12 = i14;
                this.f4342c.zzd(MotionEvent.obtain(0L, i10, i12, i8, i9, f8, 1.0f, 0, 1.0f, 1.0f, 0, 0));
                return;
            }
            this.f4342c.zzd(MotionEvent.obtain(0L, i10, i12, i8, i9, f8, 1.0f, 0, 1.0f, 1.0f, 0, 0));
            return;
        } catch (RuntimeException e9) {
            e = e9;
            L1.n.zzh("Failed to parse the touch string. ", e);
            G1.u.zzo().zzw(e, "TaggingLibraryJsInterface.reportTouchEvent");
            return;
        } catch (JSONException e10) {
            e = e10;
            L1.n.zzh("Failed to parse the touch string. ", e);
            G1.u.zzo().zzw(e, "TaggingLibraryJsInterface.reportTouchEvent");
            return;
        }
        i12 = i13;
    }
}
