package androidx.webkit.internal;

import org.chromium.support_lib_boundary.WebResourceRequestBoundaryInterface;

/* loaded from: classes.dex */
public class c0 {

    /* renamed from: a, reason: collision with root package name */
    private final WebResourceRequestBoundaryInterface f11066a;

    public c0(WebResourceRequestBoundaryInterface webResourceRequestBoundaryInterface) {
        this.f11066a = webResourceRequestBoundaryInterface;
    }

    public boolean isRedirect() {
        return this.f11066a.isRedirect();
    }
}
