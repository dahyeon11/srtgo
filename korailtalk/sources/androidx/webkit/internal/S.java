package androidx.webkit.internal;

import android.webkit.CookieManager;
import android.webkit.GeolocationPermissions;
import android.webkit.ServiceWorkerController;
import android.webkit.WebStorage;
import org.chromium.support_lib_boundary.ProfileBoundaryInterface;

/* loaded from: classes.dex */
public class S implements G0.b {

    /* renamed from: a, reason: collision with root package name */
    private final ProfileBoundaryInterface f11046a;

    S(ProfileBoundaryInterface profileBoundaryInterface) {
        this.f11046a = profileBoundaryInterface;
    }

    @Override // G0.b
    public CookieManager getCookieManager() {
        if (e0.MULTI_PROFILE.isSupportedByWebView()) {
            return this.f11046a.getCookieManager();
        }
        throw e0.getUnsupportedOperationException();
    }

    @Override // G0.b
    public GeolocationPermissions getGeolocationPermissions() {
        if (e0.MULTI_PROFILE.isSupportedByWebView()) {
            return this.f11046a.getGeoLocationPermissions();
        }
        throw e0.getUnsupportedOperationException();
    }

    @Override // G0.b
    public String getName() {
        if (e0.MULTI_PROFILE.isSupportedByWebView()) {
            return this.f11046a.getName();
        }
        throw e0.getUnsupportedOperationException();
    }

    @Override // G0.b
    public ServiceWorkerController getServiceWorkerController() {
        if (e0.MULTI_PROFILE.isSupportedByWebView()) {
            return this.f11046a.getServiceWorkerController();
        }
        throw e0.getUnsupportedOperationException();
    }

    @Override // G0.b
    public WebStorage getWebStorage() {
        if (e0.MULTI_PROFILE.isSupportedByWebView()) {
            return this.f11046a.getWebStorage();
        }
        throw e0.getUnsupportedOperationException();
    }
}
