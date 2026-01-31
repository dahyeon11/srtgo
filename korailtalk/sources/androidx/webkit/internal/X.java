package androidx.webkit.internal;

import java.lang.reflect.InvocationHandler;
import java.util.Objects;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;

/* loaded from: classes.dex */
public class X implements WebMessageBoundaryInterface {

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f11051b = {G0.i.WEB_MESSAGE_ARRAY_BUFFER};

    /* renamed from: a, reason: collision with root package name */
    private G0.f f11052a;

    public X(G0.f fVar) {
        this.f11052a = fVar;
    }

    private static G0.g[] a(InvocationHandler[] invocationHandlerArr) {
        G0.g[] gVarArr = new G0.g[invocationHandlerArr.length];
        for (int i8 = 0; i8 < invocationHandlerArr.length; i8++) {
            gVarArr[i8] = new b0(invocationHandlerArr[i8]);
        }
        return gVarArr;
    }

    public static boolean isMessagePayloadTypeSupportedByWebView(int i8) {
        if (i8 != 0) {
            return i8 == 1 && e0.WEB_MESSAGE_ARRAY_BUFFER.isSupportedByWebView();
        }
        return true;
    }

    public static G0.f webMessageCompatFromBoundaryInterface(WebMessageBoundaryInterface webMessageBoundaryInterface) {
        G0.g[] gVarArrA = a(webMessageBoundaryInterface.getPorts());
        if (!e0.WEB_MESSAGE_ARRAY_BUFFER.isSupportedByWebView()) {
            return new G0.f(webMessageBoundaryInterface.getData(), gVarArrA);
        }
        WebMessagePayloadBoundaryInterface webMessagePayloadBoundaryInterface = (WebMessagePayloadBoundaryInterface) b8.a.castToSuppLibClass(WebMessagePayloadBoundaryInterface.class, webMessageBoundaryInterface.getMessagePayload());
        int type = webMessagePayloadBoundaryInterface.getType();
        if (type == 0) {
            return new G0.f(webMessagePayloadBoundaryInterface.getAsString(), gVarArrA);
        }
        if (type != 1) {
            return null;
        }
        return new G0.f(webMessagePayloadBoundaryInterface.getAsArrayBuffer(), gVarArrA);
    }

    @Override // org.chromium.support_lib_boundary.WebMessageBoundaryInterface
    @Deprecated
    public String getData() {
        return this.f11052a.getData();
    }

    @Override // org.chromium.support_lib_boundary.WebMessageBoundaryInterface
    public InvocationHandler getMessagePayload() {
        a0 a0Var;
        int type = this.f11052a.getType();
        if (type == 0) {
            a0Var = new a0(this.f11052a.getData());
        } else {
            if (type != 1) {
                throw new IllegalStateException("Unknown web message payload type: " + this.f11052a.getType());
            }
            byte[] arrayBuffer = this.f11052a.getArrayBuffer();
            Objects.requireNonNull(arrayBuffer);
            a0Var = new a0(arrayBuffer);
        }
        return b8.a.createInvocationHandlerFor(a0Var);
    }

    @Override // org.chromium.support_lib_boundary.WebMessageBoundaryInterface
    public InvocationHandler[] getPorts() {
        G0.g[] ports = this.f11052a.getPorts();
        if (ports == null) {
            return null;
        }
        InvocationHandler[] invocationHandlerArr = new InvocationHandler[ports.length];
        for (int i8 = 0; i8 < ports.length; i8++) {
            invocationHandlerArr[i8] = ports[i8].getInvocationHandler();
        }
        return invocationHandlerArr;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return f11051b;
    }
}
