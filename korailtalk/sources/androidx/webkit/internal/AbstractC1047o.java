package androidx.webkit.internal;

import android.content.Context;
import android.net.Uri;
import android.webkit.SafeBrowsingResponse;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.util.List;

/* renamed from: androidx.webkit.internal.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1047o {
    public static void backToSafety(SafeBrowsingResponse safeBrowsingResponse, boolean z8) {
        safeBrowsingResponse.backToSafety(z8);
    }

    public static Uri getSafeBrowsingPrivacyPolicyUrl() {
        return WebView.getSafeBrowsingPrivacyPolicyUrl();
    }

    public static void proceed(SafeBrowsingResponse safeBrowsingResponse, boolean z8) {
        safeBrowsingResponse.proceed(z8);
    }

    public static void setSafeBrowsingWhitelist(List<String> list, ValueCallback<Boolean> valueCallback) {
        WebView.setSafeBrowsingWhitelist(list, valueCallback);
    }

    public static void showInterstitial(SafeBrowsingResponse safeBrowsingResponse, boolean z8) {
        safeBrowsingResponse.showInterstitial(z8);
    }

    public static void startSafeBrowsing(Context context, ValueCallback<Boolean> valueCallback) {
        WebView.startSafeBrowsing(context, valueCallback);
    }
}
