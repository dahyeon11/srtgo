package androidx.webkit.internal;

import G0.h;
import android.net.Uri;
import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;
import java.lang.reflect.InvocationHandler;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.ProfileBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* loaded from: classes.dex */
public class g0 {

    /* renamed from: a, reason: collision with root package name */
    WebViewProviderBoundaryInterface f11071a;

    public g0(WebViewProviderBoundaryInterface webViewProviderBoundaryInterface) {
        this.f11071a = webViewProviderBoundaryInterface;
    }

    public T addDocumentStartJavaScript(String str, String[] strArr) {
        return T.toScriptHandler(this.f11071a.addDocumentStartJavaScript(str, strArr));
    }

    public void addWebMessageListener(String str, String[] strArr, h.b bVar) {
        this.f11071a.addWebMessageListener(str, strArr, b8.a.createInvocationHandlerFor(new Z(bVar)));
    }

    public G0.g[] createWebMessageChannel() {
        InvocationHandler[] invocationHandlerArrCreateWebMessageChannel = this.f11071a.createWebMessageChannel();
        G0.g[] gVarArr = new G0.g[invocationHandlerArrCreateWebMessageChannel.length];
        for (int i8 = 0; i8 < invocationHandlerArrCreateWebMessageChannel.length; i8++) {
            gVarArr[i8] = new b0(invocationHandlerArrCreateWebMessageChannel[i8]);
        }
        return gVarArr;
    }

    public G0.b getProfile() {
        return new S((ProfileBoundaryInterface) b8.a.castToSuppLibClass(ProfileBoundaryInterface.class, this.f11071a.getProfile()));
    }

    public WebChromeClient getWebChromeClient() {
        return this.f11071a.getWebChromeClient();
    }

    public WebViewClient getWebViewClient() {
        return this.f11071a.getWebViewClient();
    }

    public G0.k getWebViewRenderProcess() {
        return m0.forInvocationHandler(this.f11071a.getWebViewRenderer());
    }

    public G0.l getWebViewRenderProcessClient() {
        InvocationHandler webViewRendererClient = this.f11071a.getWebViewRendererClient();
        if (webViewRendererClient == null) {
            return null;
        }
        return ((j0) b8.a.getDelegateFromInvocationHandler(webViewRendererClient)).getWebViewRenderProcessClient();
    }

    public void insertVisualStateCallback(long j8, h.a aVar) {
        this.f11071a.insertVisualStateCallback(j8, b8.a.createInvocationHandlerFor(new W(aVar)));
    }

    public boolean isAudioMuted() {
        return this.f11071a.isAudioMuted();
    }

    public void postWebMessage(G0.f fVar, Uri uri) {
        this.f11071a.postMessageToMainFrame(b8.a.createInvocationHandlerFor(new X(fVar)), uri);
    }

    public void removeWebMessageListener(String str) {
        this.f11071a.removeWebMessageListener(str);
    }

    public void setAudioMuted(boolean z8) {
        this.f11071a.setAudioMuted(z8);
    }

    public void setProfileWithName(String str) {
        this.f11071a.setProfile(str);
    }

    public void setWebViewRenderProcessClient(Executor executor, G0.l lVar) {
        this.f11071a.setWebViewRendererClient(lVar != null ? b8.a.createInvocationHandlerFor(new j0(executor, lVar)) : null);
    }
}
