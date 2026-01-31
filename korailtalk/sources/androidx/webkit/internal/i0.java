package androidx.webkit.internal;

import android.webkit.WebView;
import org.chromium.support_lib_boundary.DropDataContentProviderBoundaryInterface;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;
import org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface;
import org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.TracingControllerBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* loaded from: classes.dex */
public class i0 implements h0 {

    /* renamed from: a, reason: collision with root package name */
    final WebViewProviderFactoryBoundaryInterface f11072a;

    public i0(WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface) {
        this.f11072a = webViewProviderFactoryBoundaryInterface;
    }

    @Override // androidx.webkit.internal.h0
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) b8.a.castToSuppLibClass(WebViewProviderBoundaryInterface.class, this.f11072a.createWebView(webView));
    }

    @Override // androidx.webkit.internal.h0
    public DropDataContentProviderBoundaryInterface getDropDataProvider() {
        return (DropDataContentProviderBoundaryInterface) b8.a.castToSuppLibClass(DropDataContentProviderBoundaryInterface.class, this.f11072a.getDropDataProvider());
    }

    @Override // androidx.webkit.internal.h0
    public ProfileStoreBoundaryInterface getProfileStore() {
        return (ProfileStoreBoundaryInterface) b8.a.castToSuppLibClass(ProfileStoreBoundaryInterface.class, this.f11072a.getProfileStore());
    }

    @Override // androidx.webkit.internal.h0
    public ProxyControllerBoundaryInterface getProxyController() {
        return (ProxyControllerBoundaryInterface) b8.a.castToSuppLibClass(ProxyControllerBoundaryInterface.class, this.f11072a.getProxyController());
    }

    @Override // androidx.webkit.internal.h0
    public ServiceWorkerControllerBoundaryInterface getServiceWorkerController() {
        return (ServiceWorkerControllerBoundaryInterface) b8.a.castToSuppLibClass(ServiceWorkerControllerBoundaryInterface.class, this.f11072a.getServiceWorkerController());
    }

    @Override // androidx.webkit.internal.h0
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) b8.a.castToSuppLibClass(StaticsBoundaryInterface.class, this.f11072a.getStatics());
    }

    @Override // androidx.webkit.internal.h0
    public TracingControllerBoundaryInterface getTracingController() {
        return (TracingControllerBoundaryInterface) b8.a.castToSuppLibClass(TracingControllerBoundaryInterface.class, this.f11072a.getTracingController());
    }

    @Override // androidx.webkit.internal.h0
    public String[] getWebViewFeatures() {
        return this.f11072a.getSupportedFeatures();
    }

    @Override // androidx.webkit.internal.h0
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) b8.a.castToSuppLibClass(WebkitToCompatConverterBoundaryInterface.class, this.f11072a.getWebkitToCompatConverter());
    }
}
