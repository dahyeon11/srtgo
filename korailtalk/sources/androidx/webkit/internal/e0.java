package androidx.webkit.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import androidx.webkit.internal.AbstractC1033a;
import androidx.webkit.internal.U;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class e0 {
    public static final AbstractC1033a.b VISUAL_STATE_CALLBACK = new AbstractC1033a.b(G0.i.VISUAL_STATE_CALLBACK, G0.i.VISUAL_STATE_CALLBACK);
    public static final AbstractC1033a.b OFF_SCREEN_PRERASTER = new AbstractC1033a.b(G0.i.OFF_SCREEN_PRERASTER, G0.i.OFF_SCREEN_PRERASTER);
    public static final AbstractC1033a.e SAFE_BROWSING_ENABLE = new AbstractC1033a.e(G0.i.SAFE_BROWSING_ENABLE, G0.i.SAFE_BROWSING_ENABLE);
    public static final AbstractC1033a.c DISABLED_ACTION_MODE_MENU_ITEMS = new AbstractC1033a.c(G0.i.DISABLED_ACTION_MODE_MENU_ITEMS, G0.i.DISABLED_ACTION_MODE_MENU_ITEMS);
    public static final AbstractC1033a.f START_SAFE_BROWSING = new AbstractC1033a.f(G0.i.START_SAFE_BROWSING, G0.i.START_SAFE_BROWSING);

    @Deprecated
    public static final AbstractC1033a.f SAFE_BROWSING_ALLOWLIST_DEPRECATED_TO_DEPRECATED = new AbstractC1033a.f(G0.i.SAFE_BROWSING_WHITELIST, G0.i.SAFE_BROWSING_WHITELIST);

    @Deprecated
    public static final AbstractC1033a.f SAFE_BROWSING_ALLOWLIST_DEPRECATED_TO_PREFERRED = new AbstractC1033a.f(G0.i.SAFE_BROWSING_WHITELIST, G0.i.SAFE_BROWSING_ALLOWLIST);
    public static final AbstractC1033a.f SAFE_BROWSING_ALLOWLIST_PREFERRED_TO_DEPRECATED = new AbstractC1033a.f(G0.i.SAFE_BROWSING_ALLOWLIST, G0.i.SAFE_BROWSING_WHITELIST);
    public static final AbstractC1033a.f SAFE_BROWSING_ALLOWLIST_PREFERRED_TO_PREFERRED = new AbstractC1033a.f(G0.i.SAFE_BROWSING_ALLOWLIST, G0.i.SAFE_BROWSING_ALLOWLIST);
    public static final AbstractC1033a.f SAFE_BROWSING_PRIVACY_POLICY_URL = new AbstractC1033a.f(G0.i.SAFE_BROWSING_PRIVACY_POLICY_URL, G0.i.SAFE_BROWSING_PRIVACY_POLICY_URL);
    public static final AbstractC1033a.c SERVICE_WORKER_BASIC_USAGE = new AbstractC1033a.c(G0.i.SERVICE_WORKER_BASIC_USAGE, G0.i.SERVICE_WORKER_BASIC_USAGE);
    public static final AbstractC1033a.c SERVICE_WORKER_CACHE_MODE = new AbstractC1033a.c(G0.i.SERVICE_WORKER_CACHE_MODE, G0.i.SERVICE_WORKER_CACHE_MODE);
    public static final AbstractC1033a.c SERVICE_WORKER_CONTENT_ACCESS = new AbstractC1033a.c(G0.i.SERVICE_WORKER_CONTENT_ACCESS, G0.i.SERVICE_WORKER_CONTENT_ACCESS);
    public static final AbstractC1033a.c SERVICE_WORKER_FILE_ACCESS = new AbstractC1033a.c(G0.i.SERVICE_WORKER_FILE_ACCESS, G0.i.SERVICE_WORKER_FILE_ACCESS);
    public static final AbstractC1033a.c SERVICE_WORKER_BLOCK_NETWORK_LOADS = new AbstractC1033a.c(G0.i.SERVICE_WORKER_BLOCK_NETWORK_LOADS, G0.i.SERVICE_WORKER_BLOCK_NETWORK_LOADS);
    public static final AbstractC1033a.c SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST = new AbstractC1033a.c(G0.i.SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST, G0.i.SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST);
    public static final AbstractC1033a.b RECEIVE_WEB_RESOURCE_ERROR = new AbstractC1033a.b(G0.i.RECEIVE_WEB_RESOURCE_ERROR, G0.i.RECEIVE_WEB_RESOURCE_ERROR);
    public static final AbstractC1033a.b RECEIVE_HTTP_ERROR = new AbstractC1033a.b(G0.i.RECEIVE_HTTP_ERROR, G0.i.RECEIVE_HTTP_ERROR);
    public static final AbstractC1033a.c SHOULD_OVERRIDE_WITH_REDIRECTS = new AbstractC1033a.c(G0.i.SHOULD_OVERRIDE_WITH_REDIRECTS, G0.i.SHOULD_OVERRIDE_WITH_REDIRECTS);
    public static final AbstractC1033a.f SAFE_BROWSING_HIT = new AbstractC1033a.f(G0.i.SAFE_BROWSING_HIT, G0.i.SAFE_BROWSING_HIT);
    public static final AbstractC1033a.c WEB_RESOURCE_REQUEST_IS_REDIRECT = new AbstractC1033a.c(G0.i.WEB_RESOURCE_REQUEST_IS_REDIRECT, G0.i.WEB_RESOURCE_REQUEST_IS_REDIRECT);
    public static final AbstractC1033a.b WEB_RESOURCE_ERROR_GET_DESCRIPTION = new AbstractC1033a.b(G0.i.WEB_RESOURCE_ERROR_GET_DESCRIPTION, G0.i.WEB_RESOURCE_ERROR_GET_DESCRIPTION);
    public static final AbstractC1033a.b WEB_RESOURCE_ERROR_GET_CODE = new AbstractC1033a.b(G0.i.WEB_RESOURCE_ERROR_GET_CODE, G0.i.WEB_RESOURCE_ERROR_GET_CODE);
    public static final AbstractC1033a.f SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY = new AbstractC1033a.f(G0.i.SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY, G0.i.SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY);
    public static final AbstractC1033a.f SAFE_BROWSING_RESPONSE_PROCEED = new AbstractC1033a.f(G0.i.SAFE_BROWSING_RESPONSE_PROCEED, G0.i.SAFE_BROWSING_RESPONSE_PROCEED);
    public static final AbstractC1033a.f SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL = new AbstractC1033a.f(G0.i.SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL, G0.i.SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL);
    public static final AbstractC1033a.b WEB_MESSAGE_PORT_POST_MESSAGE = new AbstractC1033a.b(G0.i.WEB_MESSAGE_PORT_POST_MESSAGE, G0.i.WEB_MESSAGE_PORT_POST_MESSAGE);
    public static final AbstractC1033a.b WEB_MESSAGE_PORT_CLOSE = new AbstractC1033a.b(G0.i.WEB_MESSAGE_PORT_CLOSE, G0.i.WEB_MESSAGE_PORT_CLOSE);
    public static final AbstractC1033a.d WEB_MESSAGE_ARRAY_BUFFER = new AbstractC1033a.d(G0.i.WEB_MESSAGE_ARRAY_BUFFER, G0.i.WEB_MESSAGE_ARRAY_BUFFER);
    public static final AbstractC1033a.b WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK = new AbstractC1033a.b(G0.i.WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK, G0.i.WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK);
    public static final AbstractC1033a.b CREATE_WEB_MESSAGE_CHANNEL = new AbstractC1033a.b(G0.i.CREATE_WEB_MESSAGE_CHANNEL, G0.i.CREATE_WEB_MESSAGE_CHANNEL);
    public static final AbstractC1033a.b POST_WEB_MESSAGE = new AbstractC1033a.b(G0.i.POST_WEB_MESSAGE, G0.i.POST_WEB_MESSAGE);
    public static final AbstractC1033a.b WEB_MESSAGE_CALLBACK_ON_MESSAGE = new AbstractC1033a.b(G0.i.WEB_MESSAGE_CALLBACK_ON_MESSAGE, G0.i.WEB_MESSAGE_CALLBACK_ON_MESSAGE);
    public static final AbstractC1033a.e GET_WEB_VIEW_CLIENT = new AbstractC1033a.e(G0.i.GET_WEB_VIEW_CLIENT, G0.i.GET_WEB_VIEW_CLIENT);
    public static final AbstractC1033a.e GET_WEB_CHROME_CLIENT = new AbstractC1033a.e(G0.i.GET_WEB_CHROME_CLIENT, G0.i.GET_WEB_CHROME_CLIENT);
    public static final AbstractC1033a.h GET_WEB_VIEW_RENDERER = new AbstractC1033a.h(G0.i.GET_WEB_VIEW_RENDERER, G0.i.GET_WEB_VIEW_RENDERER);
    public static final AbstractC1033a.h WEB_VIEW_RENDERER_TERMINATE = new AbstractC1033a.h(G0.i.WEB_VIEW_RENDERER_TERMINATE, G0.i.WEB_VIEW_RENDERER_TERMINATE);
    public static final AbstractC1033a.g TRACING_CONTROLLER_BASIC_USAGE = new AbstractC1033a.g(G0.i.TRACING_CONTROLLER_BASIC_USAGE, G0.i.TRACING_CONTROLLER_BASIC_USAGE);
    public static final U.b STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX = new U.b(G0.i.STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX, G0.i.STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX);
    public static final U.a STARTUP_FEATURE_SET_DIRECTORY_BASE_PATH = new U.a(G0.i.STARTUP_FEATURE_SET_DIRECTORY_BASE_PATHS, "STARTUP_FEATURE_SET_DIRECTORY_BASE_PATH");
    public static final AbstractC1033a.h WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE = new AbstractC1033a.h(G0.i.WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE, G0.i.WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE);
    public static final AbstractC1033a.i ALGORITHMIC_DARKENING = new a(G0.i.ALGORITHMIC_DARKENING, G0.i.ALGORITHMIC_DARKENING);
    public static final AbstractC1033a.d PROXY_OVERRIDE = new AbstractC1033a.d(G0.i.PROXY_OVERRIDE, "PROXY_OVERRIDE:3");
    public static final AbstractC1033a.d MULTI_PROCESS = new AbstractC1033a.d(G0.i.MULTI_PROCESS, "MULTI_PROCESS_QUERY");
    public static final AbstractC1033a.h FORCE_DARK = new AbstractC1033a.h(G0.i.FORCE_DARK, G0.i.FORCE_DARK);
    public static final AbstractC1033a.d FORCE_DARK_STRATEGY = new AbstractC1033a.d(G0.i.FORCE_DARK_STRATEGY, "FORCE_DARK_BEHAVIOR");
    public static final AbstractC1033a.d WEB_MESSAGE_LISTENER = new AbstractC1033a.d(G0.i.WEB_MESSAGE_LISTENER, G0.i.WEB_MESSAGE_LISTENER);
    public static final AbstractC1033a.d DOCUMENT_START_SCRIPT = new AbstractC1033a.d(G0.i.DOCUMENT_START_SCRIPT, "DOCUMENT_START_SCRIPT:1");
    public static final AbstractC1033a.d PROXY_OVERRIDE_REVERSE_BYPASS = new AbstractC1033a.d(G0.i.PROXY_OVERRIDE_REVERSE_BYPASS, G0.i.PROXY_OVERRIDE_REVERSE_BYPASS);
    public static final AbstractC1033a.d GET_VARIATIONS_HEADER = new AbstractC1033a.d(G0.i.GET_VARIATIONS_HEADER, G0.i.GET_VARIATIONS_HEADER);
    public static final AbstractC1033a.d ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY = new AbstractC1033a.d(G0.i.ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY, G0.i.ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY);
    public static final AbstractC1033a.d GET_COOKIE_INFO = new AbstractC1033a.d(G0.i.GET_COOKIE_INFO, G0.i.GET_COOKIE_INFO);
    public static final AbstractC1033a.d REQUESTED_WITH_HEADER_ALLOW_LIST = new AbstractC1033a.d(G0.i.REQUESTED_WITH_HEADER_ALLOW_LIST, G0.i.REQUESTED_WITH_HEADER_ALLOW_LIST);
    public static final AbstractC1033a.d USER_AGENT_METADATA = new AbstractC1033a.d(G0.i.USER_AGENT_METADATA, G0.i.USER_AGENT_METADATA);
    public static final AbstractC1033a.d MULTI_PROFILE = new b(G0.i.MULTI_PROFILE, G0.i.MULTI_PROFILE);
    public static final AbstractC1033a.d ATTRIBUTION_REGISTRATION_BEHAVIOR = new AbstractC1033a.d(G0.i.ATTRIBUTION_REGISTRATION_BEHAVIOR, "ATTRIBUTION_BEHAVIOR");
    public static final AbstractC1033a.d WEBVIEW_MEDIA_INTEGRITY_API_STATUS = new AbstractC1033a.d(G0.i.WEBVIEW_MEDIA_INTEGRITY_API_STATUS, "WEBVIEW_INTEGRITY_API_STATUS");
    public static final AbstractC1033a.d MUTE_AUDIO = new AbstractC1033a.d(G0.i.MUTE_AUDIO, G0.i.MUTE_AUDIO);

    class a extends AbstractC1033a.i {

        /* renamed from: d, reason: collision with root package name */
        private final Pattern f11068d;

        a(String str, String str2) {
            super(str, str2);
            this.f11068d = Pattern.compile("\\A\\d+");
        }

        @Override // androidx.webkit.internal.AbstractC1033a
        public boolean isSupportedByWebView() {
            boolean zIsSupportedByWebView = super.isSupportedByWebView();
            if (!zIsSupportedByWebView || Build.VERSION.SDK_INT >= 29) {
                return zIsSupportedByWebView;
            }
            PackageInfo currentLoadedWebViewPackage = G0.h.getCurrentLoadedWebViewPackage();
            if (currentLoadedWebViewPackage == null) {
                return false;
            }
            Matcher matcher = this.f11068d.matcher(currentLoadedWebViewPackage.versionName);
            return matcher.find() && Integer.parseInt(currentLoadedWebViewPackage.versionName.substring(matcher.start(), matcher.end())) >= 105;
        }
    }

    class b extends AbstractC1033a.d {
        b(String str, String str2) {
            super(str, str2);
        }

        @Override // androidx.webkit.internal.AbstractC1033a
        public boolean isSupportedByWebView() {
            if (super.isSupportedByWebView() && G0.i.isFeatureSupported(G0.i.MULTI_PROCESS)) {
                return G0.h.isMultiProcessEnabled();
            }
            return false;
        }
    }

    public static UnsupportedOperationException getUnsupportedOperationException() {
        return new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }

    public static boolean isStartupFeatureSupported(String str, Context context) {
        return isStartupFeatureSupported(str, U.values(), context);
    }

    public static boolean isSupported(String str) {
        return isSupported(str, AbstractC1033a.values());
    }

    public static boolean isStartupFeatureSupported(String str, Collection<U> collection, Context context) {
        HashSet hashSet = new HashSet();
        for (U u8 : collection) {
            if (u8.getPublicFeatureName().equals(str)) {
                hashSet.add(u8);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException("Unknown feature " + str);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((U) it.next()).isSupported(context)) {
                return true;
            }
        }
        return false;
    }

    public static <T extends N> boolean isSupported(String str, Collection<T> collection) {
        HashSet hashSet = new HashSet();
        for (T t8 : collection) {
            if (t8.getPublicFeatureName().equals(str)) {
                hashSet.add(t8);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException("Unknown feature " + str);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((N) it.next()).isSupported()) {
                return true;
            }
        }
        return false;
    }
}
