package com.kakao.sdk.common.util;

import S6.AbstractC0765i;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.browser.customtabs.c;
import androidx.browser.customtabs.d;
import androidx.browser.customtabs.e;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class KakaoCustomTabsClient {
    public static final KakaoCustomTabsClient INSTANCE = new KakaoCustomTabsClient();
    private static final String[] chromePackageNames = {"com.android.chrome", "com.chrome.beta", "com.chrome.dev"};

    private KakaoCustomTabsClient() {
    }

    private final boolean isPackageNameChrome(String str) {
        return AbstractC0765i.contains(chromePackageNames, str);
    }

    private final String resolveCustomTabsPackage(Context context, Uri uri) {
        ActivityInfo activityInfo;
        ActivityInfo activityInfo2;
        ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW", uri), 65536);
        Intent action = new Intent().setAction("android.support.customtabs.action.CustomTabsService");
        Intrinsics.checkNotNullExpressionValue(action, "Intent().setAction(CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION)");
        List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(action, 0);
        Intrinsics.checkNotNullExpressionValue(listQueryIntentServices, "context.packageManager.queryIntentServices(serviceIntent, 0)");
        Iterator<ResolveInfo> it = listQueryIntentServices.iterator();
        String str = null;
        String str2 = null;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ResolveInfo next = it.next();
            if (str2 == null) {
                String str3 = next.serviceInfo.packageName;
                Intrinsics.checkNotNullExpressionValue(str3, "info.serviceInfo.packageName");
                if (isPackageNameChrome(str3)) {
                    str2 = next.serviceInfo.packageName;
                }
            }
            if (Intrinsics.areEqual(next.serviceInfo.packageName, (resolveInfoResolveActivity == null || (activityInfo = resolveInfoResolveActivity.activityInfo) == null) ? null : activityInfo.packageName)) {
                if (resolveInfoResolveActivity != null && (activityInfo2 = resolveInfoResolveActivity.activityInfo) != null) {
                    str = activityInfo2.packageName;
                }
            }
        }
        return (str != null || str2 == null) ? str : str2;
    }

    public final void open(Context context, Uri uri) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        new d.a().setUrlBarHidingEnabled(true).setShowTitle(true).build().launchUrl(context, uri);
    }

    public final ServiceConnection openWithDefault(final Context context, final Uri uri) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        final String strResolveCustomTabsPackage = resolveCustomTabsPackage(context, uri);
        if (strResolveCustomTabsPackage == null) {
            throw new UnsupportedOperationException();
        }
        SdkLog.Companion.d("Choosing " + strResolveCustomTabsPackage + " as custom tabs browser");
        e eVar = new e() { // from class: com.kakao.sdk.common.util.KakaoCustomTabsClient$openWithDefault$connection$1
            @Override // androidx.browser.customtabs.e
            public void onCustomTabsServiceConnected(ComponentName name, c client) {
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(client, "client");
                d.a showTitle = new d.a().setUrlBarHidingEnabled(true).setShowTitle(true);
                Intrinsics.checkNotNullExpressionValue(showTitle, "Builder().setUrlBarHidingEnabled(true).setShowTitle(true)");
                d dVarBuild = showTitle.build();
                Intrinsics.checkNotNullExpressionValue(dVarBuild, "builder.build()");
                dVarBuild.intent.setData(uri);
                dVarBuild.intent.setPackage(strResolveCustomTabsPackage);
                context.startActivity(dVarBuild.intent);
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
                SdkLog.Companion.d(Intrinsics.stringPlus("onServiceDisconnected: ", componentName));
            }
        };
        if (c.bindCustomTabsService(context, strResolveCustomTabsPackage, eVar)) {
            return eVar;
        }
        return null;
    }
}
