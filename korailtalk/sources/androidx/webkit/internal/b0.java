package androidx.webkit.internal;

import G0.g;
import android.os.Handler;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import androidx.webkit.internal.AbstractC1033a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;

/* loaded from: classes.dex */
public class b0 extends G0.g {

    /* renamed from: a */
    private WebMessagePort f11064a;

    /* renamed from: b */
    private WebMessagePortBoundaryInterface f11065b;

    public b0(WebMessagePort webMessagePort) {
        this.f11064a = webMessagePort;
    }

    private WebMessagePortBoundaryInterface a() {
        if (this.f11065b == null) {
            this.f11065b = (WebMessagePortBoundaryInterface) b8.a.castToSuppLibClass(WebMessagePortBoundaryInterface.class, f0.getCompatConverter().convertWebMessagePort(this.f11064a));
        }
        return this.f11065b;
    }

    private WebMessagePort b() {
        if (this.f11064a == null) {
            this.f11064a = f0.getCompatConverter().convertWebMessagePort(Proxy.getInvocationHandler(this.f11065b));
        }
        return this.f11064a;
    }

    public static WebMessage compatToFrameworkMessage(G0.f fVar) {
        return AbstractC1034b.createWebMessage(fVar);
    }

    public static WebMessagePort[] compatToPorts(G0.g[] gVarArr) {
        if (gVarArr == null) {
            return null;
        }
        int length = gVarArr.length;
        WebMessagePort[] webMessagePortArr = new WebMessagePort[length];
        for (int i8 = 0; i8 < length; i8++) {
            webMessagePortArr[i8] = gVarArr[i8].getFrameworkPort();
        }
        return webMessagePortArr;
    }

    public static G0.f frameworkMessageToCompat(WebMessage webMessage) {
        return AbstractC1034b.createWebMessageCompat(webMessage);
    }

    public static G0.g[] portsToCompat(WebMessagePort[] webMessagePortArr) {
        if (webMessagePortArr == null) {
            return null;
        }
        G0.g[] gVarArr = new G0.g[webMessagePortArr.length];
        for (int i8 = 0; i8 < webMessagePortArr.length; i8++) {
            gVarArr[i8] = new b0(webMessagePortArr[i8]);
        }
        return gVarArr;
    }

    @Override // G0.g
    public void close() {
        AbstractC1033a.b bVar = e0.WEB_MESSAGE_PORT_CLOSE;
        if (bVar.isSupportedByFramework()) {
            AbstractC1034b.close(b());
        } else {
            if (!bVar.isSupportedByWebView()) {
                throw e0.getUnsupportedOperationException();
            }
            a().close();
        }
    }

    @Override // G0.g
    public WebMessagePort getFrameworkPort() {
        return b();
    }

    @Override // G0.g
    public InvocationHandler getInvocationHandler() {
        return Proxy.getInvocationHandler(a());
    }

    @Override // G0.g
    public void postMessage(G0.f fVar) {
        AbstractC1033a.b bVar = e0.WEB_MESSAGE_PORT_POST_MESSAGE;
        if (bVar.isSupportedByFramework() && fVar.getType() == 0) {
            AbstractC1034b.postMessage(b(), compatToFrameworkMessage(fVar));
        } else {
            if (!bVar.isSupportedByWebView() || !X.isMessagePayloadTypeSupportedByWebView(fVar.getType())) {
                throw e0.getUnsupportedOperationException();
            }
            a().postMessage(b8.a.createInvocationHandlerFor(new X(fVar)));
        }
    }

    @Override // G0.g
    public void setWebMessageCallback(g.a aVar) {
        AbstractC1033a.b bVar = e0.WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK;
        if (bVar.isSupportedByWebView()) {
            a().setWebMessageCallback(b8.a.createInvocationHandlerFor(new Y(aVar)));
        } else {
            if (!bVar.isSupportedByFramework()) {
                throw e0.getUnsupportedOperationException();
            }
            AbstractC1034b.setWebMessageCallback(b(), aVar);
        }
    }

    public b0(InvocationHandler invocationHandler) {
        this.f11065b = (WebMessagePortBoundaryInterface) b8.a.castToSuppLibClass(WebMessagePortBoundaryInterface.class, invocationHandler);
    }

    @Override // G0.g
    public void setWebMessageCallback(Handler handler, g.a aVar) {
        AbstractC1033a.b bVar = e0.CREATE_WEB_MESSAGE_CHANNEL;
        if (bVar.isSupportedByWebView()) {
            a().setWebMessageCallback(b8.a.createInvocationHandlerFor(new Y(aVar)), handler);
        } else {
            if (bVar.isSupportedByFramework()) {
                AbstractC1034b.setWebMessageCallback(b(), aVar, handler);
                return;
            }
            throw e0.getUnsupportedOperationException();
        }
    }
}
