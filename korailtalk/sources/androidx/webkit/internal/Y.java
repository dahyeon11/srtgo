package androidx.webkit.internal;

import G0.g;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageCallbackBoundaryInterface;

/* loaded from: classes.dex */
public class Y implements WebMessageCallbackBoundaryInterface {

    /* renamed from: a, reason: collision with root package name */
    private final g.a f11053a;

    public Y(g.a aVar) {
        this.f11053a = aVar;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{G0.i.WEB_MESSAGE_CALLBACK_ON_MESSAGE};
    }

    @Override // org.chromium.support_lib_boundary.WebMessageCallbackBoundaryInterface
    public void onMessage(InvocationHandler invocationHandler, InvocationHandler invocationHandler2) {
        G0.f fVarWebMessageCompatFromBoundaryInterface = X.webMessageCompatFromBoundaryInterface((WebMessageBoundaryInterface) b8.a.castToSuppLibClass(WebMessageBoundaryInterface.class, invocationHandler2));
        if (fVarWebMessageCompatFromBoundaryInterface != null) {
            this.f11053a.onMessage(new b0(invocationHandler), fVarWebMessageCompatFromBoundaryInterface);
        }
    }
}
