package androidx.core.app;

import android.app.LocaleManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.LocaleList;

/* loaded from: classes.dex */
public abstract class j {

    static class a {
        static androidx.core.os.k a(Configuration configuration) {
            return androidx.core.os.k.forLanguageTags(configuration.getLocales().toLanguageTags());
        }
    }

    static class b {
        static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        static LocaleList b(Object obj) {
            return ((LocaleManager) obj).getSystemLocales();
        }
    }

    static androidx.core.os.k a(Configuration configuration) {
        return a.a(configuration);
    }

    private static Object b(Context context) {
        return context.getSystemService("locale");
    }

    public static androidx.core.os.k getApplicationLocales(Context context) {
        if (Build.VERSION.SDK_INT < 33) {
            return androidx.core.os.k.forLanguageTags(AbstractC0922f.readLocales(context));
        }
        Object objB = b(context);
        return objB != null ? androidx.core.os.k.wrap(b.a(objB)) : androidx.core.os.k.getEmptyLocaleList();
    }

    public static androidx.core.os.k getSystemLocales(Context context) {
        androidx.core.os.k emptyLocaleList = androidx.core.os.k.getEmptyLocaleList();
        if (Build.VERSION.SDK_INT < 33) {
            return a(Resources.getSystem().getConfiguration());
        }
        Object objB = b(context);
        return objB != null ? androidx.core.os.k.wrap(b.b(objB)) : emptyLocaleList;
    }
}
