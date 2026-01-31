package androidx.webkit.internal;

import android.os.Build;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: androidx.webkit.internal.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1033a implements N {

    /* renamed from: c, reason: collision with root package name */
    private static final Set f11055c = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    private final String f11056a;

    /* renamed from: b, reason: collision with root package name */
    private final String f11057b;

    /* renamed from: androidx.webkit.internal.a$a, reason: collision with other inner class name */
    private static class C0175a {

        /* renamed from: a, reason: collision with root package name */
        static final Set f11058a = new HashSet(Arrays.asList(f0.getFactory().getWebViewFeatures()));
    }

    /* renamed from: androidx.webkit.internal.a$b */
    public static class b extends AbstractC1033a {
        b(String str, String str2) {
            super(str, str2);
        }

        @Override // androidx.webkit.internal.AbstractC1033a
        public final boolean isSupportedByFramework() {
            return true;
        }
    }

    /* renamed from: androidx.webkit.internal.a$c */
    public static class c extends AbstractC1033a {
        c(String str, String str2) {
            super(str, str2);
        }

        @Override // androidx.webkit.internal.AbstractC1033a
        public final boolean isSupportedByFramework() {
            return true;
        }
    }

    /* renamed from: androidx.webkit.internal.a$d */
    public static class d extends AbstractC1033a {
        d(String str, String str2) {
            super(str, str2);
        }

        @Override // androidx.webkit.internal.AbstractC1033a
        public final boolean isSupportedByFramework() {
            return false;
        }
    }

    /* renamed from: androidx.webkit.internal.a$e */
    public static class e extends AbstractC1033a {
        e(String str, String str2) {
            super(str, str2);
        }

        @Override // androidx.webkit.internal.AbstractC1033a
        public final boolean isSupportedByFramework() {
            return Build.VERSION.SDK_INT >= 26;
        }
    }

    /* renamed from: androidx.webkit.internal.a$f */
    public static class f extends AbstractC1033a {
        f(String str, String str2) {
            super(str, str2);
        }

        @Override // androidx.webkit.internal.AbstractC1033a
        public final boolean isSupportedByFramework() {
            return Build.VERSION.SDK_INT >= 27;
        }
    }

    /* renamed from: androidx.webkit.internal.a$g */
    public static class g extends AbstractC1033a {
        g(String str, String str2) {
            super(str, str2);
        }

        @Override // androidx.webkit.internal.AbstractC1033a
        public final boolean isSupportedByFramework() {
            return Build.VERSION.SDK_INT >= 28;
        }
    }

    /* renamed from: androidx.webkit.internal.a$h */
    public static class h extends AbstractC1033a {
        h(String str, String str2) {
            super(str, str2);
        }

        @Override // androidx.webkit.internal.AbstractC1033a
        public final boolean isSupportedByFramework() {
            return Build.VERSION.SDK_INT >= 29;
        }
    }

    /* renamed from: androidx.webkit.internal.a$i */
    public static class i extends AbstractC1033a {
        i(String str, String str2) {
            super(str, str2);
        }

        @Override // androidx.webkit.internal.AbstractC1033a
        public final boolean isSupportedByFramework() {
            return Build.VERSION.SDK_INT >= 33;
        }
    }

    AbstractC1033a(String str, String str2) {
        this.f11056a = str;
        this.f11057b = str2;
        f11055c.add(this);
    }

    public static Set<String> getWebViewApkFeaturesForTesting() {
        return C0175a.f11058a;
    }

    public static Set<AbstractC1033a> values() {
        return Collections.unmodifiableSet(f11055c);
    }

    @Override // androidx.webkit.internal.N
    public String getPublicFeatureName() {
        return this.f11056a;
    }

    @Override // androidx.webkit.internal.N
    public boolean isSupported() {
        return isSupportedByFramework() || isSupportedByWebView();
    }

    public abstract boolean isSupportedByFramework();

    public boolean isSupportedByWebView() {
        return b8.a.containsFeature(C0175a.f11058a, this.f11057b);
    }
}
