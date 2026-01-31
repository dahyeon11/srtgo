package e3;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public abstract class y {

    private static class b implements x, Serializable {

        /* renamed from: a */
        private final List f30422a;

        /* synthetic */ b(List list, a aVar) {
            this(list);
        }

        @Override // e3.x
        public boolean apply(Object obj) {
            for (int i8 = 0; i8 < this.f30422a.size(); i8++) {
                if (!((x) this.f30422a.get(i8)).apply(obj)) {
                    return false;
                }
            }
            return true;
        }

        @Override // e3.x
        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f30422a.equals(((b) obj).f30422a);
            }
            return false;
        }

        public int hashCode() {
            return this.f30422a.hashCode() + 306654252;
        }

        public String toString() {
            return y.e("and", this.f30422a);
        }

        private b(List list) {
            this.f30422a = list;
        }
    }

    private static class c implements x, Serializable {

        /* renamed from: a */
        final x f30423a;

        /* renamed from: b */
        final e3.l f30424b;

        /* synthetic */ c(x xVar, e3.l lVar, a aVar) {
            this(xVar, lVar);
        }

        @Override // e3.x
        public boolean apply(Object obj) {
            return this.f30423a.apply(this.f30424b.apply(obj));
        }

        @Override // e3.x
        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f30424b.equals(cVar.f30424b) && this.f30423a.equals(cVar.f30423a);
        }

        public int hashCode() {
            return this.f30424b.hashCode() ^ this.f30423a.hashCode();
        }

        public String toString() {
            return this.f30423a + "(" + this.f30424b + ")";
        }

        private c(x xVar, e3.l lVar) {
            this.f30423a = (x) w.checkNotNull(xVar);
            this.f30424b = (e3.l) w.checkNotNull(lVar);
        }
    }

    private static class d extends e {
        d(String str) {
            super(v.a(str));
        }

        @Override // e3.y.e
        public String toString() {
            return "Predicates.containsPattern(" + this.f30425a.pattern() + ")";
        }
    }

    private static class e implements x, Serializable {

        /* renamed from: a */
        final AbstractC5366h f30425a;

        e(AbstractC5366h abstractC5366h) {
            this.f30425a = (AbstractC5366h) w.checkNotNull(abstractC5366h);
        }

        @Override // e3.x
        public boolean equals(Object obj) {
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return r.equal(this.f30425a.pattern(), eVar.f30425a.pattern()) && this.f30425a.flags() == eVar.f30425a.flags();
        }

        public int hashCode() {
            return r.hashCode(this.f30425a.pattern(), Integer.valueOf(this.f30425a.flags()));
        }

        public String toString() {
            return "Predicates.contains(" + p.toStringHelper(this.f30425a).add("pattern", this.f30425a.pattern()).add("pattern.flags", this.f30425a.flags()).toString() + ")";
        }

        @Override // e3.x
        public boolean apply(CharSequence charSequence) {
            return this.f30425a.matcher(charSequence).find();
        }
    }

    private static class f implements x, Serializable {

        /* renamed from: a */
        private final Collection f30426a;

        /* synthetic */ f(Collection collection, a aVar) {
            this(collection);
        }

        @Override // e3.x
        public boolean apply(Object obj) {
            try {
                return this.f30426a.contains(obj);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        @Override // e3.x
        public boolean equals(Object obj) {
            if (obj instanceof f) {
                return this.f30426a.equals(((f) obj).f30426a);
            }
            return false;
        }

        public int hashCode() {
            return this.f30426a.hashCode();
        }

        public String toString() {
            return "Predicates.in(" + this.f30426a + ")";
        }

        private f(Collection collection) {
            this.f30426a = (Collection) w.checkNotNull(collection);
        }
    }

    private static class g implements x, Serializable {

        /* renamed from: a */
        private final Class f30427a;

        /* synthetic */ g(Class cls, a aVar) {
            this(cls);
        }

        @Override // e3.x
        public boolean apply(Object obj) {
            return this.f30427a.isInstance(obj);
        }

        @Override // e3.x
        public boolean equals(Object obj) {
            return (obj instanceof g) && this.f30427a == ((g) obj).f30427a;
        }

        public int hashCode() {
            return this.f30427a.hashCode();
        }

        public String toString() {
            return "Predicates.instanceOf(" + this.f30427a.getName() + ")";
        }

        private g(Class cls) {
            this.f30427a = (Class) w.checkNotNull(cls);
        }
    }

    private static class h implements x, Serializable {

        /* renamed from: a */
        private final Object f30428a;

        /* synthetic */ h(Object obj, a aVar) {
            this(obj);
        }

        @Override // e3.x
        public boolean apply(Object obj) {
            return this.f30428a.equals(obj);
        }

        @Override // e3.x
        public boolean equals(Object obj) {
            if (obj instanceof h) {
                return this.f30428a.equals(((h) obj).f30428a);
            }
            return false;
        }

        public int hashCode() {
            return this.f30428a.hashCode();
        }

        public String toString() {
            return "Predicates.equalTo(" + this.f30428a + ")";
        }

        private h(Object obj) {
            this.f30428a = obj;
        }

        x a() {
            return this;
        }
    }

    private static class i implements x, Serializable {

        /* renamed from: a */
        final x f30429a;

        i(x xVar) {
            this.f30429a = (x) w.checkNotNull(xVar);
        }

        @Override // e3.x
        public boolean apply(Object obj) {
            return !this.f30429a.apply(obj);
        }

        @Override // e3.x
        public boolean equals(Object obj) {
            if (obj instanceof i) {
                return this.f30429a.equals(((i) obj).f30429a);
            }
            return false;
        }

        public int hashCode() {
            return ~this.f30429a.hashCode();
        }

        public String toString() {
            return "Predicates.not(" + this.f30429a + ")";
        }
    }

    static abstract class j extends Enum implements x {
        public static final j ALWAYS_TRUE = new a("ALWAYS_TRUE", 0);
        public static final j ALWAYS_FALSE = new b("ALWAYS_FALSE", 1);
        public static final j IS_NULL = new c("IS_NULL", 2);
        public static final j NOT_NULL = new d("NOT_NULL", 3);

        /* renamed from: a */
        private static final /* synthetic */ j[] f30430a = a();

        enum a extends j {
            a(String str, int i8) {
                super(str, i8);
            }

            @Override // e3.y.j, e3.x
            public boolean apply(Object obj) {
                return true;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.alwaysTrue()";
            }
        }

        enum b extends j {
            b(String str, int i8) {
                super(str, i8);
            }

            @Override // e3.y.j, e3.x
            public boolean apply(Object obj) {
                return false;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.alwaysFalse()";
            }
        }

        enum c extends j {
            c(String str, int i8) {
                super(str, i8);
            }

            @Override // e3.y.j, e3.x
            public boolean apply(Object obj) {
                return obj == null;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.isNull()";
            }
        }

        enum d extends j {
            d(String str, int i8) {
                super(str, i8);
            }

            @Override // e3.y.j, e3.x
            public boolean apply(Object obj) {
                return obj != null;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.notNull()";
            }
        }

        private j(String str, int i8) {
            super(str, i8);
        }

        private static /* synthetic */ j[] a() {
            return new j[]{ALWAYS_TRUE, ALWAYS_FALSE, IS_NULL, NOT_NULL};
        }

        public static j valueOf(String str) {
            return (j) Enum.valueOf(j.class, str);
        }

        public static j[] values() {
            return (j[]) f30430a.clone();
        }

        @Override // e3.x
        public abstract /* synthetic */ boolean apply(Object obj);

        /* synthetic */ j(String str, int i8, a aVar) {
            this(str, i8);
        }

        x b() {
            return this;
        }
    }

    private static class k implements x, Serializable {

        /* renamed from: a */
        private final List f30431a;

        /* synthetic */ k(List list, a aVar) {
            this(list);
        }

        @Override // e3.x
        public boolean apply(Object obj) {
            for (int i8 = 0; i8 < this.f30431a.size(); i8++) {
                if (((x) this.f30431a.get(i8)).apply(obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // e3.x
        public boolean equals(Object obj) {
            if (obj instanceof k) {
                return this.f30431a.equals(((k) obj).f30431a);
            }
            return false;
        }

        public int hashCode() {
            return this.f30431a.hashCode() + 87855567;
        }

        public String toString() {
            return y.e("or", this.f30431a);
        }

        private k(List list) {
            this.f30431a = list;
        }
    }

    private static class l implements x, Serializable {

        /* renamed from: a */
        private final Class f30432a;

        /* synthetic */ l(Class cls, a aVar) {
            this(cls);
        }

        @Override // e3.x
        public boolean equals(Object obj) {
            return (obj instanceof l) && this.f30432a == ((l) obj).f30432a;
        }

        public int hashCode() {
            return this.f30432a.hashCode();
        }

        public String toString() {
            return "Predicates.subtypeOf(" + this.f30432a.getName() + ")";
        }

        private l(Class cls) {
            this.f30432a = (Class) w.checkNotNull(cls);
        }

        @Override // e3.x
        public boolean apply(Class<?> cls) {
            return this.f30432a.isAssignableFrom(cls);
        }
    }

    public static <T> x alwaysFalse() {
        return j.ALWAYS_FALSE.b();
    }

    public static <T> x alwaysTrue() {
        return j.ALWAYS_TRUE.b();
    }

    public static <T> x and(Iterable<? extends x> iterable) {
        return new b(c(iterable));
    }

    private static List b(x xVar, x xVar2) {
        return Arrays.asList(xVar, xVar2);
    }

    static List c(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(w.checkNotNull(it.next()));
        }
        return arrayList;
    }

    public static <A, B> x compose(x xVar, e3.l lVar) {
        return new c(xVar, lVar);
    }

    public static x contains(Pattern pattern) {
        return new e(new n(pattern));
    }

    public static x containsPattern(String str) {
        return new d(str);
    }

    private static List d(Object... objArr) {
        return c(Arrays.asList(objArr));
    }

    public static String e(String str, Iterable iterable) {
        StringBuilder sb = new StringBuilder("Predicates.");
        sb.append(str);
        sb.append('(');
        boolean z8 = true;
        for (Object obj : iterable) {
            if (!z8) {
                sb.append(',');
            }
            sb.append(obj);
            z8 = false;
        }
        sb.append(')');
        return sb.toString();
    }

    public static <T> x equalTo(T t8) {
        return t8 == null ? isNull() : new h(t8).a();
    }

    public static <T> x in(Collection<? extends T> collection) {
        return new f(collection);
    }

    public static <T> x instanceOf(Class<?> cls) {
        return new g(cls);
    }

    public static <T> x isNull() {
        return j.IS_NULL.b();
    }

    public static <T> x not(x xVar) {
        return new i(xVar);
    }

    public static <T> x notNull() {
        return j.NOT_NULL.b();
    }

    public static <T> x or(Iterable<? extends x> iterable) {
        return new k(c(iterable));
    }

    public static x subtypeOf(Class<?> cls) {
        return new l(cls);
    }

    @SafeVarargs
    public static <T> x and(x... xVarArr) {
        return new b(d(xVarArr));
    }

    @SafeVarargs
    public static <T> x or(x... xVarArr) {
        return new k(d(xVarArr));
    }

    public static <T> x and(x xVar, x xVar2) {
        return new b(b((x) w.checkNotNull(xVar), (x) w.checkNotNull(xVar2)));
    }

    public static <T> x or(x xVar, x xVar2) {
        return new k(b((x) w.checkNotNull(xVar), (x) w.checkNotNull(xVar2)));
    }
}
