package com.nhn.android.naverlogin.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.browser.customtabs.d;
import java.util.ArrayList;
import java.util.List;
import m0.C5902a;

/* loaded from: classes.dex */
public final class CustomTabsManager {
    public static final String ACTION_NAVER_CUSTOM_TAB = "ACTION_NAVER_3RDPARTY_CUSTOM_TAB";

    /* renamed from: a, reason: collision with root package name */
    private final Context f29716a;

    class a extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CustomTabsListener f29717a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C5902a f29718b;

        a(CustomTabsListener customTabsListener, C5902a c5902a) {
            this.f29717a = customTabsListener;
            this.f29718b = c5902a;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            this.f29717a.onReceive(intent);
            this.f29718b.unregisterReceiver(this);
        }
    }

    public CustomTabsManager(Context context) {
        this.f29716a = context;
    }

    public static List<PackageInfo> getCustomTabsPackages(Context context) {
        PackageManager packageManager = context.getPackageManager();
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com")), 0);
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo resolveInfo : listQueryIntentActivities) {
            Intent intent = new Intent();
            intent.setAction("android.support.customtabs.action.CustomTabsService");
            intent.setPackage(resolveInfo.activityInfo.packageName);
            String str = resolveInfo.activityInfo.packageName;
            if (packageManager.resolveService(intent, 0) != null) {
                try {
                    if (packageManager.getApplicationInfo(resolveInfo.activityInfo.packageName, 0).enabled) {
                        arrayList.add(packageManager.getPackageInfo(resolveInfo.activityInfo.packageName, 0));
                    }
                } catch (PackageManager.NameNotFoundException e8) {
                    e8.printStackTrace();
                }
            }
        }
        return arrayList;
    }

    public static boolean isCustomTabAvailable(Context context) {
        List<PackageInfo> customTabsPackages = getCustomTabsPackages(context);
        return customTabsPackages != null && customTabsPackages.size() > 0;
    }

    public void launchUrl(String str, String str2) {
        d dVarBuild = new d.a().setShowTitle(true).build();
        dVarBuild.intent.setPackage(str);
        launchUrl(dVarBuild, str2);
    }

    public void sendCustomTabResult(Intent intent) {
        intent.setAction(ACTION_NAVER_CUSTOM_TAB);
        intent.setClass(this.f29716a, CustomTabsManager.class);
        C5902a.getInstance(this.f29716a).sendBroadcast(intent);
    }

    public void setCustomTabListener(CustomTabsListener customTabsListener) {
        C5902a c5902a = C5902a.getInstance(this.f29716a);
        c5902a.registerReceiver(new a(customTabsListener, c5902a), new IntentFilter(ACTION_NAVER_CUSTOM_TAB));
    }

    public void launchUrl(d dVar, String str) {
        dVar.launchUrl(this.f29716a, Uri.parse(str));
    }
}
