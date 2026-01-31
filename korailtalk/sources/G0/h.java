package G0;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import androidx.webkit.internal.AbstractC1033a;
import androidx.webkit.internal.AbstractC1034b;
import androidx.webkit.internal.AbstractC1040h;
import androidx.webkit.internal.AbstractC1047o;
import androidx.webkit.internal.B;
import androidx.webkit.internal.J;
import androidx.webkit.internal.X;
import androidx.webkit.internal.b0;
import androidx.webkit.internal.e0;
import androidx.webkit.internal.f0;
import androidx.webkit.internal.g0;
import androidx.webkit.internal.h0;
import androidx.webkit.internal.k0;
import androidx.webkit.internal.m0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a */
    private static final Uri f1385a = Uri.parse("*");

    /* renamed from: b */
    private static final Uri f1386b = Uri.parse("");

    public interface a {
    }

    public interface b {
        void onPostMessage(WebView webView, f fVar, Uri uri, boolean z8, G0.a aVar);
    }

    private static void a(WebView webView) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT < 28) {
            try {
                Method declaredMethod = WebView.class.getDeclaredMethod("checkThread", null);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(webView, null);
                return;
            } catch (IllegalAccessException e8) {
                throw new RuntimeException(e8);
            } catch (NoSuchMethodException e9) {
                throw new RuntimeException(e9);
            } catch (InvocationTargetException e10) {
                throw new RuntimeException(e10);
            }
        }
        Looper webViewLooper = B.getWebViewLooper(webView);
        if (webViewLooper == Looper.myLooper()) {
            return;
        }
        throw new RuntimeException("A WebView method was called on thread '" + Thread.currentThread().getName() + "'. All WebView methods must be called on the same thread. (Expected Looper " + webViewLooper + " called on " + Looper.myLooper() + ", FYI main Looper is " + Looper.getMainLooper() + ")");
    }

    public static c addDocumentStartJavaScript(WebView webView, String str, Set<String> set) {
        if (e0.DOCUMENT_START_SCRIPT.isSupportedByWebView()) {
            return f(webView).addDocumentStartJavaScript(str, (String[]) set.toArray(new String[0]));
        }
        throw e0.getUnsupportedOperationException();
    }

    public static void addWebMessageListener(WebView webView, String str, Set<String> set, b bVar) {
        if (!e0.WEB_MESSAGE_LISTENER.isSupportedByWebView()) {
            throw e0.getUnsupportedOperationException();
        }
        f(webView).addWebMessageListener(str, (String[]) set.toArray(new String[0]), bVar);
    }

    private static WebViewProviderBoundaryInterface b(WebView webView) {
        return c().createWebView(webView);
    }

    private static h0 c() {
        return f0.getFactory();
    }

    public static g[] createWebMessageChannel(WebView webView) {
        AbstractC1033a.b bVar = e0.CREATE_WEB_MESSAGE_CHANNEL;
        if (bVar.isSupportedByFramework()) {
            return b0.portsToCompat(AbstractC1034b.createWebMessageChannel(webView));
        }
        if (bVar.isSupportedByWebView()) {
            return f(webView).createWebMessageChannel();
        }
        throw e0.getUnsupportedOperationException();
    }

    private static PackageInfo d() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", null).invoke(null, null);
    }

    private static PackageInfo e(Context context) {
        try {
            String str = (String) Class.forName("android.webkit.WebViewUpdateService").getMethod("getCurrentWebViewPackageName", null).invoke(null, null);
            if (str == null) {
                return null;
            }
            return context.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    private static g0 f(WebView webView) {
        return new g0(b(webView));
    }

    public static PackageInfo getCurrentLoadedWebViewPackage() {
        if (Build.VERSION.SDK_INT >= 26) {
            return AbstractC1040h.getCurrentWebViewPackage();
        }
        try {
            return d();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    public static PackageInfo getCurrentWebViewPackage(Context context) {
        PackageInfo currentLoadedWebViewPackage = getCurrentLoadedWebViewPackage();
        return currentLoadedWebViewPackage != null ? currentLoadedWebViewPackage : e(context);
    }

    public static G0.b getProfile(WebView webView) {
        if (e0.MULTI_PROFILE.isSupportedByWebView()) {
            return f(webView).getProfile();
        }
        throw e0.getUnsupportedOperationException();
    }

    public static Uri getSafeBrowsingPrivacyPolicyUrl() {
        AbstractC1033a.f fVar = e0.SAFE_BROWSING_PRIVACY_POLICY_URL;
        if (fVar.isSupportedByFramework()) {
            return AbstractC1047o.getSafeBrowsingPrivacyPolicyUrl();
        }
        if (fVar.isSupportedByWebView()) {
            return c().getStatics().getSafeBrowsingPrivacyPolicyUrl();
        }
        throw e0.getUnsupportedOperationException();
    }

    public static String getVariationsHeader() {
        if (e0.GET_VARIATIONS_HEADER.isSupportedByWebView()) {
            return c().getStatics().getVariationsHeader();
        }
        throw e0.getUnsupportedOperationException();
    }

    public static WebChromeClient getWebChromeClient(WebView webView) {
        AbstractC1033a.e eVar = e0.GET_WEB_CHROME_CLIENT;
        if (eVar.isSupportedByFramework()) {
            return AbstractC1040h.getWebChromeClient(webView);
        }
        if (eVar.isSupportedByWebView()) {
            return f(webView).getWebChromeClient();
        }
        throw e0.getUnsupportedOperationException();
    }

    public static WebViewClient getWebViewClient(WebView webView) {
        AbstractC1033a.e eVar = e0.GET_WEB_VIEW_CLIENT;
        if (eVar.isSupportedByFramework()) {
            return AbstractC1040h.getWebViewClient(webView);
        }
        if (eVar.isSupportedByWebView()) {
            return f(webView).getWebViewClient();
        }
        throw e0.getUnsupportedOperationException();
    }

    public static k getWebViewRenderProcess(WebView webView) {
        AbstractC1033a.h hVar = e0.GET_WEB_VIEW_RENDERER;
        if (!hVar.isSupportedByFramework()) {
            if (hVar.isSupportedByWebView()) {
                return f(webView).getWebViewRenderProcess();
            }
            throw e0.getUnsupportedOperationException();
        }
        WebViewRenderProcess webViewRenderProcess = J.getWebViewRenderProcess(webView);
        if (webViewRenderProcess != null) {
            return m0.forFrameworkObject(webViewRenderProcess);
        }
        return null;
    }

    public static l getWebViewRenderProcessClient(WebView webView) {
        AbstractC1033a.h hVar = e0.WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE;
        if (!hVar.isSupportedByFramework()) {
            if (hVar.isSupportedByWebView()) {
                return f(webView).getWebViewRenderProcessClient();
            }
            throw e0.getUnsupportedOperationException();
        }
        WebViewRenderProcessClient webViewRenderProcessClient = J.getWebViewRenderProcessClient(webView);
        if (webViewRenderProcessClient == null || !(webViewRenderProcessClient instanceof k0)) {
            return null;
        }
        return ((k0) webViewRenderProcessClient).getFrameworkRenderProcessClient();
    }

    public static boolean isAudioMuted(WebView webView) {
        if (e0.MUTE_AUDIO.isSupportedByWebView()) {
            return f(webView).isAudioMuted();
        }
        throw e0.getUnsupportedOperationException();
    }

    public static boolean isMultiProcessEnabled() {
        if (e0.MULTI_PROCESS.isSupportedByWebView()) {
            return c().getStatics().isMultiProcessEnabled();
        }
        throw e0.getUnsupportedOperationException();
    }

    public static void postVisualStateCallback(WebView webView, long j8, a aVar) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        AbstractC1033a.b bVar = e0.VISUAL_STATE_CALLBACK;
        if (bVar.isSupportedByFramework()) {
            AbstractC1034b.postVisualStateCallback(webView, j8, aVar);
        } else {
            if (!bVar.isSupportedByWebView()) {
                throw e0.getUnsupportedOperationException();
            }
            a(webView);
            f(webView).insertVisualStateCallback(j8, aVar);
        }
    }

    public static void postWebMessage(WebView webView, f fVar, Uri uri) {
        if (f1385a.equals(uri)) {
            uri = f1386b;
        }
        AbstractC1033a.b bVar = e0.POST_WEB_MESSAGE;
        if (bVar.isSupportedByFramework() && fVar.getType() == 0) {
            AbstractC1034b.postWebMessage(webView, b0.compatToFrameworkMessage(fVar), uri);
        } else {
            if (!bVar.isSupportedByWebView() || !X.isMessagePayloadTypeSupportedByWebView(fVar.getType())) {
                throw e0.getUnsupportedOperationException();
            }
            f(webView).postWebMessage(fVar, uri);
        }
    }

    public static void removeWebMessageListener(WebView webView, String str) {
        if (!e0.WEB_MESSAGE_LISTENER.isSupportedByWebView()) {
            throw e0.getUnsupportedOperationException();
        }
        f(webView).removeWebMessageListener(str);
    }

    public static void setAudioMuted(WebView webView, boolean z8) {
        if (!e0.MUTE_AUDIO.isSupportedByWebView()) {
            throw e0.getUnsupportedOperationException();
        }
        f(webView).setAudioMuted(z8);
    }

    public static void setProfile(WebView webView, String str) {
        if (!e0.MULTI_PROFILE.isSupportedByWebView()) {
            throw e0.getUnsupportedOperationException();
        }
        f(webView).setProfileWithName(str);
    }

    public static void setSafeBrowsingAllowlist(Set<String> set, ValueCallback<Boolean> valueCallback) {
        AbstractC1033a.f fVar = e0.SAFE_BROWSING_ALLOWLIST_PREFERRED_TO_PREFERRED;
        AbstractC1033a.f fVar2 = e0.SAFE_BROWSING_ALLOWLIST_PREFERRED_TO_DEPRECATED;
        if (fVar.isSupportedByWebView()) {
            c().getStatics().setSafeBrowsingAllowlist(set, valueCallback);
            return;
        }
        ArrayList arrayList = new ArrayList(set);
        if (fVar2.isSupportedByFramework()) {
            AbstractC1047o.setSafeBrowsingWhitelist(arrayList, valueCallback);
        } else {
            if (!fVar2.isSupportedByWebView()) {
                throw e0.getUnsupportedOperationException();
            }
            c().getStatics().setSafeBrowsingWhitelist(arrayList, valueCallback);
        }
    }

    @Deprecated
    public static void setSafeBrowsingWhitelist(List<String> list, ValueCallback<Boolean> valueCallback) {
        setSafeBrowsingAllowlist(new HashSet(list), valueCallback);
    }

    public static void setWebViewRenderProcessClient(WebView webView, Executor executor, l lVar) {
        AbstractC1033a.h hVar = e0.WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE;
        if (hVar.isSupportedByFramework()) {
            J.setWebViewRenderProcessClient(webView, executor, lVar);
        } else {
            if (!hVar.isSupportedByWebView()) {
                throw e0.getUnsupportedOperationException();
            }
            f(webView).setWebViewRenderProcessClient(executor, lVar);
        }
    }

    public static void startSafeBrowsing(Context context, ValueCallback<Boolean> valueCallback) {
        AbstractC1033a.f fVar = e0.START_SAFE_BROWSING;
        if (fVar.isSupportedByFramework()) {
            AbstractC1047o.startSafeBrowsing(context, valueCallback);
        } else {
            if (!fVar.isSupportedByWebView()) {
                throw e0.getUnsupportedOperationException();
            }
            c().getStatics().initSafeBrowsing(context, valueCallback);
        }
    }

    public static void setWebViewRenderProcessClient(WebView webView, l lVar) {
        AbstractC1033a.h hVar = e0.WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE;
        if (hVar.isSupportedByFramework()) {
            J.setWebViewRenderProcessClient(webView, lVar);
        } else {
            if (hVar.isSupportedByWebView()) {
                f(webView).setWebViewRenderProcessClient(null, lVar);
                return;
            }
            throw e0.getUnsupportedOperationException();
        }
    }
}
