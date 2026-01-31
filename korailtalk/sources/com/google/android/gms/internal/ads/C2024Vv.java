package com.google.android.gms.internal.ads;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Message;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.kakao.sdk.auth.Constants;

/* renamed from: com.google.android.gms.internal.ads.Vv, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2024Vv extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2065Wv f16910a;

    public C2024Vv(InterfaceC2065Wv interfaceC2065Wv) {
        this.f16910a = interfaceC2065Wv;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Context b(WebView webView) {
        if (!(webView instanceof InterfaceC2065Wv)) {
            return webView.getContext();
        }
        InterfaceC2065Wv interfaceC2065Wv = (InterfaceC2065Wv) webView;
        Activity activityZzi = interfaceC2065Wv.zzi();
        return activityZzi != null ? activityZzi : interfaceC2065Wv.getContext();
    }

    protected final boolean a(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z8) {
        InterfaceC2065Wv interfaceC2065Wv;
        G1.b bVarZzd;
        try {
            interfaceC2065Wv = this.f16910a;
        } catch (WindowManager.BadTokenException e8) {
            L1.n.zzk("Fail to display Dialog.", e8);
        }
        if (interfaceC2065Wv != null && interfaceC2065Wv.zzN() != null && this.f16910a.zzN().zzd() != null && (bVarZzd = this.f16910a.zzN().zzd()) != null && !bVarZzd.zzc()) {
            bVarZzd.zzb("window." + str + "('" + str3 + "')");
            return false;
        }
        G1.u.zzp();
        AlertDialog.Builder builderZzK = K1.K0.zzK(context);
        builderZzK.setTitle(str2);
        if (z8) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            TextView textView = new TextView(context);
            textView.setText(str3);
            EditText editText = new EditText(context);
            editText.setText(str4);
            linearLayout.addView(textView);
            linearLayout.addView(editText);
            builderZzK.setView(linearLayout).setPositiveButton(R.string.ok, new DialogInterfaceOnClickListenerC1942Tv(jsPromptResult, editText)).setNegativeButton(R.string.cancel, new DialogInterfaceOnClickListenerC1860Rv(jsPromptResult)).setOnCancelListener(new DialogInterfaceOnCancelListenerC1819Qv(jsPromptResult)).create().show();
        } else {
            builderZzK.setMessage(str3).setPositiveButton(R.string.ok, new DialogInterfaceOnClickListenerC1778Pv(jsResult)).setNegativeButton(R.string.cancel, new DialogInterfaceOnClickListenerC1737Ov(jsResult)).setOnCancelListener(new DialogInterfaceOnCancelListenerC1696Nv(jsResult)).create().show();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        if (!(webView instanceof InterfaceC2065Wv)) {
            L1.n.zzj("Tried to close a WebView that wasn't an AdWebView.");
            return;
        }
        J1.u uVarZzL = ((InterfaceC2065Wv) webView).zzL();
        if (uVarZzL == null) {
            L1.n.zzj("Tried to close an AdWebView not associated with an overlay.");
        } else {
            uVarZzL.zzb();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String str = "JS: " + consoleMessage.message() + " (" + consoleMessage.sourceId() + ":" + consoleMessage.lineNumber() + ")";
        if (str.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i8 = AbstractC1983Uv.f16729a[consoleMessage.messageLevel().ordinal()];
        if (i8 == 1) {
            L1.n.zzg(str);
        } else if (i8 == 2) {
            L1.n.zzj(str);
        } else if (i8 == 3 || i8 == 4 || i8 != 5) {
            L1.n.zzi(str);
        } else {
            L1.n.zze(str);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z8, boolean z9, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        if (this.f16910a.zzH() != null) {
            webView2.setWebViewClient(this.f16910a.zzH());
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onExceededDatabaseQuota(String str, String str2, long j8, long j9, long j10, WebStorage.QuotaUpdater quotaUpdater) {
        long j11 = 5242880 - j10;
        if (j11 <= 0) {
            quotaUpdater.updateQuota(j8);
            return;
        }
        if (j8 == 0) {
            if (j9 > j11 || j9 > 1048576) {
                j9 = 0;
            }
        } else if (j9 == 0) {
            j9 = Math.min(j8 + Math.min(PlaybackStateCompat.ACTION_PREPARE_FROM_URI, j11), 1048576L);
        } else {
            if (j9 <= Math.min(1048576 - j8, j11)) {
                j8 += j9;
            }
            j9 = j8;
        }
        quotaUpdater.updateQuota(j9);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    @Override // android.webkit.WebChromeClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onGeolocationPermissionsShowPrompt(java.lang.String r4, android.webkit.GeolocationPermissions.Callback r5) {
        /*
            r3 = this;
            if (r5 == 0) goto L2b
            com.google.android.gms.internal.ads.Wv r0 = r3.f16910a
            G1.u.zzp()
            android.content.Context r0 = r0.getContext()
            java.lang.String r1 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r0 = K1.K0.zzA(r0, r1)
            r1 = 1
            if (r0 != 0) goto L25
            com.google.android.gms.internal.ads.Wv r0 = r3.f16910a
            G1.u.zzp()
            android.content.Context r0 = r0.getContext()
            java.lang.String r2 = "android.permission.ACCESS_COARSE_LOCATION"
            boolean r0 = K1.K0.zzA(r0, r2)
            if (r0 == 0) goto L27
        L25:
            r0 = r1
            goto L28
        L27:
            r0 = 0
        L28:
            r5.invoke(r4, r0, r1)
        L2b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2024Vv.onGeolocationPermissionsShowPrompt(java.lang.String, android.webkit.GeolocationPermissions$Callback):void");
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        J1.u uVarZzL = this.f16910a.zzL();
        if (uVarZzL == null) {
            L1.n.zzj("Could not get ad overlay when hiding custom view.");
        } else {
            uVarZzL.zzg();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return a(b(webView), "alert", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return a(b(webView), "onBeforeUnload", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return a(b(webView), "confirm", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return a(b(webView), Constants.PROMPT, str, str2, str3, null, jsPromptResult, true);
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public final void onShowCustomView(View view, int i8, WebChromeClient.CustomViewCallback customViewCallback) {
        J1.u uVarZzL = this.f16910a.zzL();
        if (uVarZzL == null) {
            L1.n.zzj("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
        } else {
            uVarZzL.zzC(view, customViewCallback);
            uVarZzL.zzA(i8);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }
}
