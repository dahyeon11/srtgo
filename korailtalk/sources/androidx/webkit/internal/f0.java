package androidx.webkit.internal;

import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* loaded from: classes.dex */
public abstract class f0 {

    private static class a {

        /* renamed from: a */
        static final o0 f11069a = new o0(f0.getFactory().getWebkitToCompatConverter());
    }

    private static class b {

        /* renamed from: a */
        static final h0 f11070a = f0.a();
    }

    static h0 a() {
        try {
            return new i0((WebViewProviderFactoryBoundaryInterface) b8.a.castToSuppLibClass(WebViewProviderFactoryBoundaryInterface.class, b()));
        } catch (ClassNotFoundException unused) {
            return new P();
        } catch (IllegalAccessException e8) {
            throw new RuntimeException(e8);
        } catch (NoSuchMethodException e9) {
            throw new RuntimeException(e9);
        } catch (InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    private static InvocationHandler b() {
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, getWebViewClassLoader()).getDeclaredMethod("createWebViewProviderFactory", null).invoke(null, null);
    }

    private static Object c() throws NoSuchMethodException, SecurityException {
        try {
            Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", null);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(null, null);
        } catch (IllegalAccessException e8) {
            throw new RuntimeException(e8);
        } catch (NoSuchMethodException e9) {
            throw new RuntimeException(e9);
        } catch (InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static o0 getCompatConverter() {
        return a.f11069a;
    }

    public static h0 getFactory() {
        return b.f11070a;
    }

    public static ClassLoader getWebViewClassLoader() {
        return Build.VERSION.SDK_INT >= 28 ? B.getWebViewClassLoader() : c().getClass().getClassLoader();
    }
}
