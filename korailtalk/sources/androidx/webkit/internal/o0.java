package androidx.webkit.internal;

import android.webkit.CookieManager;
import android.webkit.SafeBrowsingResponse;
import android.webkit.ServiceWorkerWebSettings;
import android.webkit.WebMessagePort;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebResourceRequestBoundaryInterface;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewCookieManagerBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* loaded from: classes.dex */
public class o0 {

    /* renamed from: a, reason: collision with root package name */
    private final WebkitToCompatConverterBoundaryInterface f11089a;

    public o0(WebkitToCompatConverterBoundaryInterface webkitToCompatConverterBoundaryInterface) {
        this.f11089a = webkitToCompatConverterBoundaryInterface;
    }

    public O convertCookieManager(CookieManager cookieManager) {
        return new O((WebViewCookieManagerBoundaryInterface) b8.a.castToSuppLibClass(WebViewCookieManagerBoundaryInterface.class, this.f11089a.convertCookieManager(cookieManager)));
    }

    public InvocationHandler convertSafeBrowsingResponse(SafeBrowsingResponse safeBrowsingResponse) {
        return this.f11089a.convertSafeBrowsingResponse(safeBrowsingResponse);
    }

    public InvocationHandler convertServiceWorkerSettings(ServiceWorkerWebSettings serviceWorkerWebSettings) {
        return this.f11089a.convertServiceWorkerSettings(serviceWorkerWebSettings);
    }

    public d0 convertSettings(WebSettings webSettings) {
        return new d0((WebSettingsBoundaryInterface) b8.a.castToSuppLibClass(WebSettingsBoundaryInterface.class, this.f11089a.convertSettings(webSettings)));
    }

    public InvocationHandler convertWebMessagePort(WebMessagePort webMessagePort) {
        return this.f11089a.convertWebMessagePort(webMessagePort);
    }

    public InvocationHandler convertWebResourceError(WebResourceError webResourceError) {
        return this.f11089a.convertWebResourceError(webResourceError);
    }

    public c0 convertWebResourceRequest(WebResourceRequest webResourceRequest) {
        return new c0((WebResourceRequestBoundaryInterface) b8.a.castToSuppLibClass(WebResourceRequestBoundaryInterface.class, this.f11089a.convertWebResourceRequest(webResourceRequest)));
    }

    public SafeBrowsingResponse convertSafeBrowsingResponse(InvocationHandler invocationHandler) {
        return n0.a(this.f11089a.convertSafeBrowsingResponse(invocationHandler));
    }

    public ServiceWorkerWebSettings convertServiceWorkerSettings(InvocationHandler invocationHandler) {
        return (ServiceWorkerWebSettings) this.f11089a.convertServiceWorkerSettings(invocationHandler);
    }

    public WebMessagePort convertWebMessagePort(InvocationHandler invocationHandler) {
        return (WebMessagePort) this.f11089a.convertWebMessagePort(invocationHandler);
    }

    public WebResourceError convertWebResourceError(InvocationHandler invocationHandler) {
        return (WebResourceError) this.f11089a.convertWebResourceError(invocationHandler);
    }
}
