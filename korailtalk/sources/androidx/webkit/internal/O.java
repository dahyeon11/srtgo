package androidx.webkit.internal;

import java.util.List;
import org.chromium.support_lib_boundary.WebViewCookieManagerBoundaryInterface;

/* loaded from: classes.dex */
public class O {

    /* renamed from: a, reason: collision with root package name */
    private final WebViewCookieManagerBoundaryInterface f11042a;

    public O(WebViewCookieManagerBoundaryInterface webViewCookieManagerBoundaryInterface) {
        this.f11042a = webViewCookieManagerBoundaryInterface;
    }

    public List<String> getCookieInfo(String str) {
        return this.f11042a.getCookieInfo(str);
    }
}
