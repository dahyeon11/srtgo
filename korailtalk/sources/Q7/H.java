package Q7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/* loaded from: classes3.dex */
public class H {

    /* renamed from: a */
    private static final ConcurrentMap f4086a = new ConcurrentHashMap();

    /* renamed from: b */
    private static final ConcurrentMap f4087b = new ConcurrentHashMap();

    static class a {

        /* renamed from: a */
        private static final List f4088a;

        /* renamed from: b */
        private static final Set f4089b;

        static {
            ArrayList arrayList = new ArrayList(Arrays.asList(Locale.getAvailableLocales()));
            f4088a = Collections.unmodifiableList(arrayList);
            f4089b = Collections.unmodifiableSet(new HashSet(arrayList));
        }
    }

    public static List<Locale> availableLocaleList() {
        return a.f4088a;
    }

    public static Set<Locale> availableLocaleSet() {
        return a.f4089b;
    }

    public static List<Locale> countriesByLanguage(final String str) {
        return str == null ? Collections.emptyList() : (List) f4087b.computeIfAbsent(str, new Function() { // from class: Q7.D
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return H.j(str, (String) obj);
            }
        });
    }

    private static List e(Predicate predicate) {
        return (List) availableLocaleList().stream().filter(predicate).collect(Collectors.toList());
    }

    private static boolean f(String str) {
        return X.isAllUpperCase(str) && str.length() == 2;
    }

    private static boolean g(String str) {
        return X.isAllLowerCase(str) && (str.length() == 2 || str.length() == 3);
    }

    private static boolean h(String str) {
        return X.isNumeric(str) && str.length() == 3;
    }

    public static /* synthetic */ boolean i(String str, Locale locale) {
        return str.equals(locale.getLanguage()) && !locale.getCountry().isEmpty() && locale.getVariant().isEmpty();
    }

    public static boolean isAvailableLocale(Locale locale) {
        return availableLocaleSet().contains(locale);
    }

    public static boolean isLanguageUndetermined(Locale locale) {
        return locale == null || "und".equals(locale.toLanguageTag());
    }

    public static /* synthetic */ List j(final String str, String str2) {
        return Collections.unmodifiableList(e(new Predicate() { // from class: Q7.G
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return H.i(str, (Locale) obj);
            }
        }));
    }

    public static /* synthetic */ boolean k(String str, Locale locale) {
        return str.equals(locale.getCountry()) && locale.getVariant().isEmpty();
    }

    public static /* synthetic */ List l(final String str, String str2) {
        return Collections.unmodifiableList(e(new Predicate() { // from class: Q7.F
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return H.k(str, (Locale) obj);
            }
        }));
    }

    public static List<Locale> languagesByCountry(final String str) {
        return str == null ? Collections.emptyList() : (List) f4086a.computeIfAbsent(str, new Function() { // from class: Q7.E
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return H.l(str, (String) obj);
            }
        });
    }

    public static List<Locale> localeLookupList(Locale locale) {
        return localeLookupList(locale, locale);
    }

    private static Locale m(String str) {
        if (g(str)) {
            return new Locale(str);
        }
        String[] strArrSplit = str.indexOf(95) != -1 ? str.split(String.valueOf('_'), -1) : str.split(String.valueOf('-'), -1);
        String str2 = strArrSplit[0];
        if (strArrSplit.length == 2) {
            String str3 = strArrSplit[1];
            if ((g(str2) && f(str3)) || h(str3)) {
                return new Locale(str2, str3);
            }
        } else if (strArrSplit.length == 3) {
            String str4 = strArrSplit[1];
            String str5 = strArrSplit[2];
            if (g(str2) && ((str4.isEmpty() || f(str4) || h(str4)) && !str5.isEmpty())) {
                return new Locale(str2, str4, str5);
            }
        }
        throw new IllegalArgumentException("Invalid locale format: " + str);
    }

    public static Locale toLocale(Locale locale) {
        return locale != null ? locale : Locale.getDefault();
    }

    public static List<Locale> localeLookupList(Locale locale, Locale locale2) {
        ArrayList arrayList = new ArrayList(4);
        if (locale != null) {
            arrayList.add(locale);
            if (!locale.getVariant().isEmpty()) {
                arrayList.add(new Locale(locale.getLanguage(), locale.getCountry()));
            }
            if (!locale.getCountry().isEmpty()) {
                arrayList.add(new Locale(locale.getLanguage(), ""));
            }
            if (!arrayList.contains(locale2)) {
                arrayList.add(locale2);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static Locale toLocale(String str) {
        if (str == null) {
            return null;
        }
        if (str.isEmpty()) {
            return new Locale("", "");
        }
        if (str.contains("#")) {
            throw new IllegalArgumentException("Invalid locale format: " + str);
        }
        int length = str.length();
        if (length < 2) {
            throw new IllegalArgumentException("Invalid locale format: " + str);
        }
        char cCharAt = str.charAt(0);
        if (cCharAt != '_' && cCharAt != '-') {
            return m(str);
        }
        if (length < 3) {
            throw new IllegalArgumentException("Invalid locale format: " + str);
        }
        char cCharAt2 = str.charAt(1);
        char cCharAt3 = str.charAt(2);
        if (!Character.isUpperCase(cCharAt2) || !Character.isUpperCase(cCharAt3)) {
            throw new IllegalArgumentException("Invalid locale format: " + str);
        }
        if (length == 3) {
            return new Locale("", str.substring(1, 3));
        }
        if (length < 5) {
            throw new IllegalArgumentException("Invalid locale format: " + str);
        }
        if (str.charAt(3) == cCharAt) {
            return new Locale("", str.substring(1, 3), str.substring(4));
        }
        throw new IllegalArgumentException("Invalid locale format: " + str);
    }
}
