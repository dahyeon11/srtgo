package e3;

import java.util.Locale;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
abstract class v {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f30420a = Logger.getLogger(v.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final u f30421b = d();

    private static final class b implements u {
        private b() {
        }

        @Override // e3.u
        public AbstractC5366h compile(String str) {
            return new n(Pattern.compile(str));
        }

        @Override // e3.u
        public boolean isPcreLike() {
            return true;
        }
    }

    static AbstractC5366h a(String str) {
        w.checkNotNull(str);
        return f30421b.compile(str);
    }

    static String b(String str) {
        if (h(str)) {
            return null;
        }
        return str;
    }

    static String c(double d9) {
        return String.format(Locale.ROOT, "%.4g", Double.valueOf(d9));
    }

    private static u d() {
        return new b();
    }

    static String e(String str) {
        return str == null ? "" : str;
    }

    static boolean f() {
        return f30421b.isPcreLike();
    }

    static AbstractC5360e g(AbstractC5360e abstractC5360e) {
        return abstractC5360e.e();
    }

    static boolean h(String str) {
        return str == null || str.isEmpty();
    }
}
