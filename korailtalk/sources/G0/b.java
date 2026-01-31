package G0;

import android.webkit.CookieManager;
import android.webkit.GeolocationPermissions;
import android.webkit.ServiceWorkerController;
import android.webkit.WebStorage;

/* loaded from: classes.dex */
public interface b {
    public static final String DEFAULT_PROFILE_NAME = "Default";

    CookieManager getCookieManager();

    GeolocationPermissions getGeolocationPermissions();

    String getName();

    ServiceWorkerController getServiceWorkerController();

    WebStorage getWebStorage();
}
