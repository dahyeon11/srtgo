package androidx.webkit.internal;

import android.webkit.WebViewRenderProcess;
import androidx.webkit.internal.AbstractC1033a;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.WebViewRendererBoundaryInterface;

/* loaded from: classes.dex */
public class m0 extends G0.k {

    /* renamed from: c, reason: collision with root package name */
    private static final WeakHashMap f11085c = new WeakHashMap();

    /* renamed from: a, reason: collision with root package name */
    private WebViewRendererBoundaryInterface f11086a;

    /* renamed from: b, reason: collision with root package name */
    private WeakReference f11087b;

    class a implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ WebViewRendererBoundaryInterface f11088a;

        a(WebViewRendererBoundaryInterface webViewRendererBoundaryInterface) {
            this.f11088a = webViewRendererBoundaryInterface;
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            return new m0(this.f11088a);
        }
    }

    public m0(WebViewRendererBoundaryInterface webViewRendererBoundaryInterface) {
        this.f11086a = webViewRendererBoundaryInterface;
    }

    public static m0 forFrameworkObject(WebViewRenderProcess webViewRenderProcess) {
        WeakHashMap weakHashMap = f11085c;
        m0 m0Var = (m0) weakHashMap.get(webViewRenderProcess);
        if (m0Var != null) {
            return m0Var;
        }
        m0 m0Var2 = new m0(webViewRenderProcess);
        weakHashMap.put(webViewRenderProcess, m0Var2);
        return m0Var2;
    }

    public static m0 forInvocationHandler(InvocationHandler invocationHandler) {
        WebViewRendererBoundaryInterface webViewRendererBoundaryInterface = (WebViewRendererBoundaryInterface) b8.a.castToSuppLibClass(WebViewRendererBoundaryInterface.class, invocationHandler);
        return (m0) webViewRendererBoundaryInterface.getOrCreatePeer(new a(webViewRendererBoundaryInterface));
    }

    @Override // G0.k
    public boolean terminate() {
        AbstractC1033a.h hVar = e0.WEB_VIEW_RENDERER_TERMINATE;
        if (hVar.isSupportedByFramework()) {
            WebViewRenderProcess webViewRenderProcessA = l0.a(this.f11087b.get());
            return webViewRenderProcessA != null && J.terminate(webViewRenderProcessA);
        }
        if (hVar.isSupportedByWebView()) {
            return this.f11086a.terminate();
        }
        throw e0.getUnsupportedOperationException();
    }

    public m0(WebViewRenderProcess webViewRenderProcess) {
        this.f11087b = new WeakReference(webViewRenderProcess);
    }
}
