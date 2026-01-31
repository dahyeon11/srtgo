package androidx.core.os;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: b, reason: collision with root package name */
    private static final k f9031b = create(new Locale[0]);

    /* renamed from: a, reason: collision with root package name */
    private final l f9032a;

    static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final Locale[] f9033a = {new Locale("en", "XA"), new Locale("ar", "XB")};

        static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }

        private static boolean b(Locale locale) {
            for (Locale locale2 : f9033a) {
                if (locale2.equals(locale)) {
                    return true;
                }
            }
            return false;
        }

        static boolean c(Locale locale, Locale locale2) {
            if (locale.equals(locale2)) {
                return true;
            }
            if (!locale.getLanguage().equals(locale2.getLanguage()) || b(locale) || b(locale2)) {
                return false;
            }
            String strMaximizeAndGetScript = androidx.core.text.c.maximizeAndGetScript(locale);
            if (!strMaximizeAndGetScript.isEmpty()) {
                return strMaximizeAndGetScript.equals(androidx.core.text.c.maximizeAndGetScript(locale2));
            }
            String country = locale.getCountry();
            return country.isEmpty() || country.equals(locale2.getCountry());
        }
    }

    static class b {
        static LocaleList a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        static LocaleList b() {
            return LocaleList.getAdjustedDefault();
        }

        static LocaleList c() {
            return LocaleList.getDefault();
        }
    }

    private k(l lVar) {
        this.f9032a = lVar;
    }

    public static k create(Locale... localeArr) {
        return wrap(b.a(localeArr));
    }

    public static k forLanguageTags(String str) {
        if (str == null || str.isEmpty()) {
            return getEmptyLocaleList();
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i8 = 0; i8 < length; i8++) {
            localeArr[i8] = a.a(strArrSplit[i8]);
        }
        return create(localeArr);
    }

    public static k getAdjustedDefault() {
        return wrap(b.b());
    }

    public static k getDefault() {
        return wrap(b.c());
    }

    public static k getEmptyLocaleList() {
        return f9031b;
    }

    public static boolean matchesLanguageAndScript(Locale locale, Locale locale2) {
        return Build.VERSION.SDK_INT >= 33 ? LocaleList.matchesLanguageAndScript(locale, locale2) : a.c(locale, locale2);
    }

    @Deprecated
    public static k wrap(Object obj) {
        return wrap((LocaleList) obj);
    }

    public boolean equals(Object obj) {
        return (obj instanceof k) && this.f9032a.equals(((k) obj).f9032a);
    }

    public Locale get(int i8) {
        return this.f9032a.get(i8);
    }

    public Locale getFirstMatch(String[] strArr) {
        return this.f9032a.getFirstMatch(strArr);
    }

    public int hashCode() {
        return this.f9032a.hashCode();
    }

    public int indexOf(Locale locale) {
        return this.f9032a.indexOf(locale);
    }

    public boolean isEmpty() {
        return this.f9032a.isEmpty();
    }

    public int size() {
        return this.f9032a.size();
    }

    public String toLanguageTags() {
        return this.f9032a.toLanguageTags();
    }

    public String toString() {
        return this.f9032a.toString();
    }

    public Object unwrap() {
        return this.f9032a.getLocaleList();
    }

    public static k wrap(LocaleList localeList) {
        return new k(new m(localeList));
    }
}
