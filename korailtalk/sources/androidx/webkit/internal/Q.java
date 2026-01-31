package androidx.webkit.internal;

import java.lang.reflect.InvocationHandler;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;

/* loaded from: classes.dex */
public class Q extends G0.a {

    /* renamed from: a, reason: collision with root package name */
    private JsReplyProxyBoundaryInterface f11044a;

    class a implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ JsReplyProxyBoundaryInterface f11045a;

        a(JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
            this.f11045a = jsReplyProxyBoundaryInterface;
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            return new Q(this.f11045a);
        }
    }

    public Q(JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
        this.f11044a = jsReplyProxyBoundaryInterface;
    }

    public static Q forInvocationHandler(InvocationHandler invocationHandler) {
        JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) b8.a.castToSuppLibClass(JsReplyProxyBoundaryInterface.class, invocationHandler);
        return (Q) jsReplyProxyBoundaryInterface.getOrCreatePeer(new a(jsReplyProxyBoundaryInterface));
    }

    @Override // G0.a
    public void postMessage(String str) {
        if (!e0.WEB_MESSAGE_LISTENER.isSupportedByWebView()) {
            throw e0.getUnsupportedOperationException();
        }
        this.f11044a.postMessage(str);
    }

    @Override // G0.a
    public void postMessage(byte[] bArr) {
        Objects.requireNonNull(bArr, "ArrayBuffer must be non-null");
        if (e0.WEB_MESSAGE_ARRAY_BUFFER.isSupportedByWebView()) {
            this.f11044a.postMessageWithPayload(b8.a.createInvocationHandlerFor(new a0(bArr)));
            return;
        }
        throw e0.getUnsupportedOperationException();
    }
}
