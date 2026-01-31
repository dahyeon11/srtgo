package e3;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class p {

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f30408a;

        /* renamed from: b, reason: collision with root package name */
        private final C0280b f30409b;

        /* renamed from: c, reason: collision with root package name */
        private C0280b f30410c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f30411d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f30412e;

        private static final class a extends C0280b {
            private a() {
                super();
            }
        }

        /* renamed from: e3.p$b$b, reason: collision with other inner class name */
        private static class C0280b {

            /* renamed from: a, reason: collision with root package name */
            String f30413a;

            /* renamed from: b, reason: collision with root package name */
            Object f30414b;

            /* renamed from: c, reason: collision with root package name */
            C0280b f30415c;

            private C0280b() {
            }
        }

        private C0280b a() {
            C0280b c0280b = new C0280b();
            this.f30410c.f30415c = c0280b;
            this.f30410c = c0280b;
            return c0280b;
        }

        private b b(Object obj) {
            a().f30414b = obj;
            return this;
        }

        private b c(String str, Object obj) {
            C0280b c0280bA = a();
            c0280bA.f30414b = obj;
            c0280bA.f30413a = (String) w.checkNotNull(str);
            return this;
        }

        private a d() {
            a aVar = new a();
            this.f30410c.f30415c = aVar;
            this.f30410c = aVar;
            return aVar;
        }

        private b e(Object obj) {
            d().f30414b = obj;
            return this;
        }

        private b f(String str, Object obj) {
            a aVarD = d();
            aVarD.f30414b = obj;
            aVarD.f30413a = (String) w.checkNotNull(str);
            return this;
        }

        private static boolean g(Object obj) {
            return obj instanceof CharSequence ? ((CharSequence) obj).length() == 0 : obj instanceof Collection ? ((Collection) obj).isEmpty() : obj instanceof Map ? ((Map) obj).isEmpty() : obj instanceof s ? !((s) obj).isPresent() : obj.getClass().isArray() && Array.getLength(obj) == 0;
        }

        public b add(String str, Object obj) {
            return c(str, obj);
        }

        public b addValue(Object obj) {
            return b(obj);
        }

        public b omitNullValues() {
            this.f30411d = true;
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String toString() {
            /*
                r7 = this;
                boolean r0 = r7.f30411d
                boolean r1 = r7.f30412e
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r3 = 32
                r2.<init>(r3)
                java.lang.String r3 = r7.f30408a
                r2.append(r3)
                r3 = 123(0x7b, float:1.72E-43)
                r2.append(r3)
                e3.p$b$b r3 = r7.f30409b
                e3.p$b$b r3 = r3.f30415c
                java.lang.String r4 = ""
            L1b:
                if (r3 == 0) goto L65
                java.lang.Object r5 = r3.f30414b
                boolean r6 = r3 instanceof e3.p.b.a
                if (r6 != 0) goto L30
                if (r5 != 0) goto L28
                if (r0 != 0) goto L62
                goto L30
            L28:
                if (r1 == 0) goto L30
                boolean r6 = g(r5)
                if (r6 != 0) goto L62
            L30:
                r2.append(r4)
                java.lang.String r4 = r3.f30413a
                if (r4 == 0) goto L3f
                r2.append(r4)
                r4 = 61
                r2.append(r4)
            L3f:
                if (r5 == 0) goto L5d
                java.lang.Class r4 = r5.getClass()
                boolean r4 = r4.isArray()
                if (r4 == 0) goto L5d
                java.lang.Object[] r4 = new java.lang.Object[]{r5}
                java.lang.String r4 = java.util.Arrays.deepToString(r4)
                int r5 = r4.length()
                r6 = 1
                int r5 = r5 - r6
                r2.append(r4, r6, r5)
                goto L60
            L5d:
                r2.append(r5)
            L60:
                java.lang.String r4 = ", "
            L62:
                e3.p$b$b r3 = r3.f30415c
                goto L1b
            L65:
                r0 = 125(0x7d, float:1.75E-43)
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: e3.p.b.toString():java.lang.String");
        }

        private b(String str) {
            C0280b c0280b = new C0280b();
            this.f30409b = c0280b;
            this.f30410c = c0280b;
            this.f30411d = false;
            this.f30412e = false;
            this.f30408a = (String) w.checkNotNull(str);
        }

        public b add(String str, boolean z8) {
            return f(str, String.valueOf(z8));
        }

        public b addValue(boolean z8) {
            return e(String.valueOf(z8));
        }

        public b add(String str, char c9) {
            return f(str, String.valueOf(c9));
        }

        public b addValue(char c9) {
            return e(String.valueOf(c9));
        }

        public b add(String str, double d9) {
            return f(str, String.valueOf(d9));
        }

        public b addValue(double d9) {
            return e(String.valueOf(d9));
        }

        public b add(String str, float f8) {
            return f(str, String.valueOf(f8));
        }

        public b addValue(float f8) {
            return e(String.valueOf(f8));
        }

        public b add(String str, int i8) {
            return f(str, String.valueOf(i8));
        }

        public b addValue(int i8) {
            return e(String.valueOf(i8));
        }

        public b add(String str, long j8) {
            return f(str, String.valueOf(j8));
        }

        public b addValue(long j8) {
            return e(String.valueOf(j8));
        }
    }

    public static <T> T firstNonNull(T t8, T t9) {
        if (t8 != null) {
            return t8;
        }
        if (t9 != null) {
            return t9;
        }
        throw new NullPointerException("Both parameters are null");
    }

    public static b toStringHelper(Object obj) {
        return new b(obj.getClass().getSimpleName());
    }

    public static b toStringHelper(Class<?> cls) {
        return new b(cls.getSimpleName());
    }

    public static b toStringHelper(String str) {
        return new b(str);
    }
}
