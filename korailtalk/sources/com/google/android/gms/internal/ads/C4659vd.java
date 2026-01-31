package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import com.kakao.sdk.user.Constants;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.vd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4659vd extends Thread {

    /* renamed from: a, reason: collision with root package name */
    private boolean f23270a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f23271b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f23272c;

    /* renamed from: d, reason: collision with root package name */
    private final C3634md f23273d;

    /* renamed from: e, reason: collision with root package name */
    private final int f23274e;

    /* renamed from: f, reason: collision with root package name */
    private final int f23275f;

    /* renamed from: g, reason: collision with root package name */
    private final int f23276g;

    /* renamed from: h, reason: collision with root package name */
    private final int f23277h;

    /* renamed from: i, reason: collision with root package name */
    private final int f23278i;

    /* renamed from: j, reason: collision with root package name */
    private final int f23279j;

    /* renamed from: k, reason: collision with root package name */
    private final int f23280k;

    /* renamed from: l, reason: collision with root package name */
    private final int f23281l;

    /* renamed from: m, reason: collision with root package name */
    private final String f23282m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f23283n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f23284o;

    /* renamed from: p, reason: collision with root package name */
    private final boolean f23285p;

    public C4659vd() {
        C3634md c3634md = new C3634md();
        this.f23270a = false;
        this.f23271b = false;
        this.f23273d = c3634md;
        this.f23272c = new Object();
        this.f23275f = ((Long) AbstractC3075hi.zzd.zze()).intValue();
        this.f23276g = ((Long) AbstractC3075hi.zza.zze()).intValue();
        this.f23277h = ((Long) AbstractC3075hi.zze.zze()).intValue();
        this.f23278i = ((Long) AbstractC3075hi.zzc.zze()).intValue();
        this.f23279j = ((Integer) H1.C.zzc().zza(AbstractC4439th.zzR)).intValue();
        this.f23280k = ((Integer) H1.C.zzc().zza(AbstractC4439th.zzS)).intValue();
        this.f23281l = ((Integer) H1.C.zzc().zza(AbstractC4439th.zzT)).intValue();
        this.f23274e = ((Long) AbstractC3075hi.zzf.zze()).intValue();
        this.f23282m = (String) H1.C.zzc().zza(AbstractC4439th.zzV);
        this.f23283n = ((Boolean) H1.C.zzc().zza(AbstractC4439th.zzW)).booleanValue();
        this.f23284o = ((Boolean) H1.C.zzc().zza(AbstractC4439th.zzX)).booleanValue();
        this.f23285p = ((Boolean) H1.C.zzc().zza(AbstractC4439th.zzY)).booleanValue();
        setName("ContentFetchTask");
    }

    final C4545ud a(View view, C3520ld c3520ld) {
        if (view != null) {
            boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
            if ((view instanceof TextView) && !(view instanceof EditText)) {
                CharSequence text = ((TextView) view).getText();
                if (!TextUtils.isEmpty(text)) {
                    c3520ld.zzk(text.toString(), globalVisibleRect, view.getX(), view.getY(), view.getWidth(), view.getHeight());
                    return new C4545ud(this, 1, 0);
                }
            } else if ((view instanceof WebView) && !(view instanceof InterfaceC2065Wv)) {
                WebView webView = (WebView) view;
                if (o2.n.isAtLeastKitKat()) {
                    c3520ld.zzh();
                    webView.post(new RunnableC4431td(this, c3520ld, webView, globalVisibleRect));
                    return new C4545ud(this, 0, 1);
                }
            } else if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int i8 = 0;
                int i9 = 0;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    C4545ud c4545udA = a(viewGroup.getChildAt(i10), c3520ld);
                    i8 += c4545udA.f23085a;
                    i9 += c4545udA.f23086b;
                }
                return new C4545ud(this, i8, i9);
            }
        }
        return new C4545ud(this, 0, 0);
    }

    final void b(View view) {
        try {
            C3520ld c3520ld = new C3520ld(this.f23275f, this.f23276g, this.f23277h, this.f23278i, this.f23279j, this.f23280k, this.f23281l, this.f23284o);
            Context contextZzb = G1.u.zzb().zzb();
            if (contextZzb != null && !TextUtils.isEmpty(this.f23282m)) {
                String str = (String) view.getTag(contextZzb.getResources().getIdentifier((String) H1.C.zzc().zza(AbstractC4439th.zzU), Constants.ID, contextZzb.getPackageName()));
                if (str != null && str.equals(this.f23282m)) {
                    return;
                }
            }
            C4545ud c4545udA = a(view, c3520ld);
            c3520ld.zzm();
            if (c4545udA.f23085a == 0 && c4545udA.f23086b == 0) {
                return;
            }
            int i8 = c4545udA.f23086b;
            if (i8 != 0) {
                if (i8 == 0) {
                }
                this.f23273d.zzb(c3520ld);
            } else if (c3520ld.b() == 0) {
                return;
            }
            if (this.f23273d.zzd(c3520ld)) {
                return;
            }
            this.f23273d.zzb(c3520ld);
        } catch (Exception e8) {
            L1.n.zzh("Exception in fetchContentOnUIThread", e8);
            G1.u.zzo().zzw(e8, "ContentFetchTask.fetchContent");
        }
    }

    final void c(C3520ld c3520ld, WebView webView, String str, boolean z8) {
        c3520ld.zzg();
        try {
            if (!TextUtils.isEmpty(str)) {
                String strOptString = new JSONObject(str).optString("text");
                if (this.f23283n || TextUtils.isEmpty(webView.getTitle())) {
                    c3520ld.zzl(strOptString, z8, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                } else {
                    c3520ld.zzl(webView.getTitle() + Q7.X.LF + strOptString, z8, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                }
            }
            if (c3520ld.zzo()) {
                this.f23273d.zzc(c3520ld);
            }
        } catch (JSONException unused) {
            L1.n.zze("Json string may be malformed.");
        } catch (Throwable th) {
            L1.n.zzf("Failed to get webview content.", th);
            G1.u.zzo().zzw(th, "ContentFetchTask.processWebViewContent");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        if (r3.importance != 100) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r2.inKeyguardRestrictedInputMode() != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        r0 = (android.os.PowerManager) r0.getSystemService("power");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        if (r0 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        if (r0.isScreenOn() == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        r0 = G1.u.zzb().zza();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
    
        if (r0 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
    
        L1.n.zze("ContentFetchThread: no activity. Sleeping.");
        zzf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0071, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0076, code lost:
    
        if (r0.getWindow() == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0080, code lost:
    
        if (r0.getWindow().getDecorView() == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0082, code lost:
    
        r1 = r0.getWindow().getDecorView().findViewById(android.R.id.content);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0092, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0093, code lost:
    
        G1.u.zzo().zzw(r0, "ContentFetchTask.extractContent");
        L1.n.zze("Failed getting root view of activity. Content not extracted.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c7, code lost:
    
        L1.n.zzh("Error in ContentFetchTask", r0);
        G1.u.zzo().zzw(r0, "ContentFetchTask.run");
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d6, code lost:
    
        L1.n.zzh("Error in ContentFetchTask", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00de A[EXC_TOP_SPLITTER, LOOP:1: B:66:0x00de->B:73:0x00de, LOOP_START, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4659vd.run():void");
    }

    public final C3520ld zza() {
        return this.f23273d.zza(this.f23285p);
    }

    public final void zze() {
        synchronized (this.f23272c) {
            try {
                if (this.f23270a) {
                    L1.n.zze("Content hash thread already started, quitting...");
                } else {
                    this.f23270a = true;
                    start();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzf() {
        synchronized (this.f23272c) {
            this.f23271b = true;
            L1.n.zze("ContentFetchThread: paused, pause = true");
        }
    }

    public final void zzg() {
        synchronized (this.f23272c) {
            this.f23271b = false;
            this.f23272c.notifyAll();
            L1.n.zze("ContentFetchThread: wakeup");
        }
    }

    public final boolean zzh() {
        return this.f23271b;
    }
}
