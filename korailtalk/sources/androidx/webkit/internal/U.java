package androidx.webkit.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class U {
    public static final String METADATA_HOLDER_SERVICE_NAME = "org.chromium.android_webview.services.StartupFeatureMetadataHolder";

    /* renamed from: c, reason: collision with root package name */
    private static final Set f11048c = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    private final String f11049a;

    /* renamed from: b, reason: collision with root package name */
    private final String f11050b;

    public static class a extends U {
        a(String str, String str2) {
            super(str, str2);
        }

        @Override // androidx.webkit.internal.U
        public final boolean isSupportedByFramework() {
            return false;
        }
    }

    public static class b extends U {
        b(String str, String str2) {
            super(str, str2);
        }

        @Override // androidx.webkit.internal.U
        public final boolean isSupportedByFramework() {
            return Build.VERSION.SDK_INT >= 28;
        }
    }

    U(String str, String str2) {
        this.f11049a = str;
        this.f11050b = str2;
        f11048c.add(this);
    }

    private static Bundle a(Context context) {
        PackageInfo currentWebViewPackage = G0.h.getCurrentWebViewPackage(context);
        if (currentWebViewPackage == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(currentWebViewPackage.packageName, METADATA_HOLDER_SERVICE_NAME);
        if (Build.VERSION.SDK_INT < 33) {
            try {
                return b(context, componentName, 640).metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
        try {
            return M.a(context.getPackageManager(), componentName, M.b(640L)).metaData;
        } catch (PackageManager.NameNotFoundException unused2) {
            return null;
        }
    }

    private static ServiceInfo b(Context context, ComponentName componentName, int i8) {
        return context.getPackageManager().getServiceInfo(componentName, i8);
    }

    public static Set<U> values() {
        return Collections.unmodifiableSet(f11048c);
    }

    public String getPublicFeatureName() {
        return this.f11049a;
    }

    public boolean isSupported(Context context) {
        return isSupportedByFramework() || isSupportedByWebView(context);
    }

    public abstract boolean isSupportedByFramework();

    public boolean isSupportedByWebView(Context context) {
        Bundle bundleA = a(context);
        if (bundleA == null) {
            return false;
        }
        return bundleA.containsKey(this.f11050b);
    }
}
