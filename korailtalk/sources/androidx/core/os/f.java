package androidx.core.os;

import android.content.res.Configuration;
import android.os.LocaleList;

/* loaded from: classes.dex */
public abstract class f {

    static class a {
        static LocaleList a(Configuration configuration) {
            return configuration.getLocales();
        }

        static void b(Configuration configuration, k kVar) {
            configuration.setLocales((LocaleList) kVar.unwrap());
        }
    }

    public static k getLocales(Configuration configuration) {
        return k.wrap(a.a(configuration));
    }

    public static void setLocales(Configuration configuration, k kVar) {
        a.b(configuration, kVar);
    }
}
