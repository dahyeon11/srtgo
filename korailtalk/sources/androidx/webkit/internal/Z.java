package androidx.webkit.internal;

import G0.h;
import android.net.Uri;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;

/* loaded from: classes.dex */
public class Z implements WebMessageListenerBoundaryInterface {

    /* renamed from: a, reason: collision with root package name */
    private h.b f11054a;

    public Z(h.b bVar) {
        this.f11054a = bVar;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{G0.i.WEB_MESSAGE_LISTENER, G0.i.WEB_MESSAGE_ARRAY_BUFFER};
    }

    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    public void onPostMessage(WebView webView, InvocationHandler invocationHandler, Uri uri, boolean z8, InvocationHandler invocationHandler2) {
        G0.f fVarWebMessageCompatFromBoundaryInterface = X.webMessageCompatFromBoundaryInterface((WebMessageBoundaryInterface) b8.a.castToSuppLibClass(WebMessageBoundaryInterface.class, invocationHandler));
        if (fVarWebMessageCompatFromBoundaryInterface != null) {
            this.f11054a.onPostMessage(webView, fVarWebMessageCompatFromBoundaryInterface, uri, z8, Q.forInvocationHandler(invocationHandler2));
        }
    }
}
