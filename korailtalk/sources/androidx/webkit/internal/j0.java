package androidx.webkit.internal;

import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.WebViewRendererClientBoundaryInterface;

/* loaded from: classes.dex */
public class j0 implements WebViewRendererClientBoundaryInterface {

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f11073c = {G0.i.WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE};

    /* renamed from: a, reason: collision with root package name */
    private final Executor f11074a;

    /* renamed from: b, reason: collision with root package name */
    private final G0.l f11075b;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ G0.l f11076a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ WebView f11077b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ G0.k f11078c;

        a(G0.l lVar, WebView webView, G0.k kVar) {
            this.f11076a = lVar;
            this.f11077b = webView;
            this.f11078c = kVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f11076a.onRenderProcessUnresponsive(this.f11077b, this.f11078c);
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ G0.l f11080a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ WebView f11081b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ G0.k f11082c;

        b(G0.l lVar, WebView webView, G0.k kVar) {
            this.f11080a = lVar;
            this.f11081b = webView;
            this.f11082c = kVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f11080a.onRenderProcessResponsive(this.f11081b, this.f11082c);
        }
    }

    public j0(Executor executor, G0.l lVar) {
        this.f11074a = executor;
        this.f11075b = lVar;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public final String[] getSupportedFeatures() {
        return f11073c;
    }

    public G0.l getWebViewRenderProcessClient() {
        return this.f11075b;
    }

    @Override // org.chromium.support_lib_boundary.WebViewRendererClientBoundaryInterface
    public final void onRendererResponsive(WebView webView, InvocationHandler invocationHandler) {
        m0 m0VarForInvocationHandler = m0.forInvocationHandler(invocationHandler);
        G0.l lVar = this.f11075b;
        Executor executor = this.f11074a;
        if (executor == null) {
            lVar.onRenderProcessResponsive(webView, m0VarForInvocationHandler);
        } else {
            executor.execute(new b(lVar, webView, m0VarForInvocationHandler));
        }
    }

    @Override // org.chromium.support_lib_boundary.WebViewRendererClientBoundaryInterface
    public final void onRendererUnresponsive(WebView webView, InvocationHandler invocationHandler) {
        m0 m0VarForInvocationHandler = m0.forInvocationHandler(invocationHandler);
        G0.l lVar = this.f11075b;
        Executor executor = this.f11074a;
        if (executor == null) {
            lVar.onRenderProcessUnresponsive(webView, m0VarForInvocationHandler);
        } else {
            executor.execute(new a(lVar, webView, m0VarForInvocationHandler));
        }
    }
}
