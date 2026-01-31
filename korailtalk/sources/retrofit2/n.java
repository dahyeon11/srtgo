package retrofit2;

import C7.D;
import C7.I;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
abstract class n {

    class a extends n {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.n
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(u uVar, Iterable iterable) {
            if (iterable == null) {
                return;
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                n.this.a(uVar, it.next());
            }
        }
    }

    class b extends n {
        b() {
        }

        @Override // retrofit2.n
        void a(u uVar, Object obj) {
            if (obj == null) {
                return;
            }
            int length = Array.getLength(obj);
            for (int i8 = 0; i8 < length; i8++) {
                n.this.a(uVar, Array.get(obj, i8));
            }
        }
    }

    static final class c extends n {

        /* renamed from: a, reason: collision with root package name */
        private final Method f36010a;

        /* renamed from: b, reason: collision with root package name */
        private final int f36011b;

        /* renamed from: c, reason: collision with root package name */
        private final retrofit2.f f36012c;

        c(Method method, int i8, retrofit2.f fVar) {
            this.f36010a = method;
            this.f36011b = i8;
            this.f36012c = fVar;
        }

        @Override // retrofit2.n
        void a(u uVar, Object obj) {
            if (obj == null) {
                throw B.p(this.f36010a, this.f36011b, "Body parameter value must not be null.", new Object[0]);
            }
            try {
                uVar.l((I) this.f36012c.convert(obj));
            } catch (IOException e8) {
                throw B.q(this.f36010a, e8, this.f36011b, "Unable to convert " + obj + " to RequestBody", new Object[0]);
            }
        }
    }

    static final class d extends n {

        /* renamed from: a, reason: collision with root package name */
        private final String f36013a;

        /* renamed from: b, reason: collision with root package name */
        private final retrofit2.f f36014b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f36015c;

        d(String str, retrofit2.f fVar, boolean z8) {
            this.f36013a = (String) B.b(str, "name == null");
            this.f36014b = fVar;
            this.f36015c = z8;
        }

        @Override // retrofit2.n
        void a(u uVar, Object obj) {
            String str;
            if (obj == null || (str = (String) this.f36014b.convert(obj)) == null) {
                return;
            }
            uVar.a(this.f36013a, str, this.f36015c);
        }
    }

    static final class e extends n {

        /* renamed from: a, reason: collision with root package name */
        private final Method f36016a;

        /* renamed from: b, reason: collision with root package name */
        private final int f36017b;

        /* renamed from: c, reason: collision with root package name */
        private final retrofit2.f f36018c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f36019d;

        e(Method method, int i8, retrofit2.f fVar, boolean z8) {
            this.f36016a = method;
            this.f36017b = i8;
            this.f36018c = fVar;
            this.f36019d = z8;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.n
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(u uVar, Map map) {
            if (map == null) {
                throw B.p(this.f36016a, this.f36017b, "Field map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw B.p(this.f36016a, this.f36017b, "Field map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw B.p(this.f36016a, this.f36017b, "Field map contained null value for key '" + str + "'.", new Object[0]);
                }
                String str2 = (String) this.f36018c.convert(value);
                if (str2 == null) {
                    throw B.p(this.f36016a, this.f36017b, "Field map value '" + value + "' converted to null by " + this.f36018c.getClass().getName() + " for key '" + str + "'.", new Object[0]);
                }
                uVar.a(str, str2, this.f36019d);
            }
        }
    }

    static final class f extends n {

        /* renamed from: a, reason: collision with root package name */
        private final String f36020a;

        /* renamed from: b, reason: collision with root package name */
        private final retrofit2.f f36021b;

        f(String str, retrofit2.f fVar) {
            this.f36020a = (String) B.b(str, "name == null");
            this.f36021b = fVar;
        }

        @Override // retrofit2.n
        void a(u uVar, Object obj) {
            String str;
            if (obj == null || (str = (String) this.f36021b.convert(obj)) == null) {
                return;
            }
            uVar.b(this.f36020a, str);
        }
    }

    static final class g extends n {

        /* renamed from: a, reason: collision with root package name */
        private final Method f36022a;

        /* renamed from: b, reason: collision with root package name */
        private final int f36023b;

        /* renamed from: c, reason: collision with root package name */
        private final retrofit2.f f36024c;

        g(Method method, int i8, retrofit2.f fVar) {
            this.f36022a = method;
            this.f36023b = i8;
            this.f36024c = fVar;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.n
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(u uVar, Map map) {
            if (map == null) {
                throw B.p(this.f36022a, this.f36023b, "Header map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw B.p(this.f36022a, this.f36023b, "Header map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw B.p(this.f36022a, this.f36023b, "Header map contained null value for key '" + str + "'.", new Object[0]);
                }
                uVar.b(str, (String) this.f36024c.convert(value));
            }
        }
    }

    static final class h extends n {

        /* renamed from: a, reason: collision with root package name */
        private final Method f36025a;

        /* renamed from: b, reason: collision with root package name */
        private final int f36026b;

        h(Method method, int i8) {
            this.f36025a = method;
            this.f36026b = i8;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.n
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(u uVar, C7.z zVar) {
            if (zVar == null) {
                throw B.p(this.f36025a, this.f36026b, "Headers parameter must not be null.", new Object[0]);
            }
            uVar.c(zVar);
        }
    }

    static final class i extends n {

        /* renamed from: a, reason: collision with root package name */
        private final Method f36027a;

        /* renamed from: b, reason: collision with root package name */
        private final int f36028b;

        /* renamed from: c, reason: collision with root package name */
        private final C7.z f36029c;

        /* renamed from: d, reason: collision with root package name */
        private final retrofit2.f f36030d;

        i(Method method, int i8, C7.z zVar, retrofit2.f fVar) {
            this.f36027a = method;
            this.f36028b = i8;
            this.f36029c = zVar;
            this.f36030d = fVar;
        }

        @Override // retrofit2.n
        void a(u uVar, Object obj) {
            if (obj == null) {
                return;
            }
            try {
                uVar.d(this.f36029c, (I) this.f36030d.convert(obj));
            } catch (IOException e8) {
                throw B.p(this.f36027a, this.f36028b, "Unable to convert " + obj + " to RequestBody", e8);
            }
        }
    }

    static final class j extends n {

        /* renamed from: a, reason: collision with root package name */
        private final Method f36031a;

        /* renamed from: b, reason: collision with root package name */
        private final int f36032b;

        /* renamed from: c, reason: collision with root package name */
        private final retrofit2.f f36033c;

        /* renamed from: d, reason: collision with root package name */
        private final String f36034d;

        j(Method method, int i8, retrofit2.f fVar, String str) {
            this.f36031a = method;
            this.f36032b = i8;
            this.f36033c = fVar;
            this.f36034d = str;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.n
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(u uVar, Map map) {
            if (map == null) {
                throw B.p(this.f36031a, this.f36032b, "Part map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw B.p(this.f36031a, this.f36032b, "Part map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw B.p(this.f36031a, this.f36032b, "Part map contained null value for key '" + str + "'.", new Object[0]);
                }
                uVar.d(C7.z.of("Content-Disposition", "form-data; name=\"" + str + "\"", "Content-Transfer-Encoding", this.f36034d), (I) this.f36033c.convert(value));
            }
        }
    }

    static final class k extends n {

        /* renamed from: a, reason: collision with root package name */
        private final Method f36035a;

        /* renamed from: b, reason: collision with root package name */
        private final int f36036b;

        /* renamed from: c, reason: collision with root package name */
        private final String f36037c;

        /* renamed from: d, reason: collision with root package name */
        private final retrofit2.f f36038d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f36039e;

        k(Method method, int i8, String str, retrofit2.f fVar, boolean z8) {
            this.f36035a = method;
            this.f36036b = i8;
            this.f36037c = (String) B.b(str, "name == null");
            this.f36038d = fVar;
            this.f36039e = z8;
        }

        @Override // retrofit2.n
        void a(u uVar, Object obj) {
            if (obj != null) {
                uVar.f(this.f36037c, (String) this.f36038d.convert(obj), this.f36039e);
                return;
            }
            throw B.p(this.f36035a, this.f36036b, "Path parameter \"" + this.f36037c + "\" value must not be null.", new Object[0]);
        }
    }

    static final class l extends n {

        /* renamed from: a, reason: collision with root package name */
        private final String f36040a;

        /* renamed from: b, reason: collision with root package name */
        private final retrofit2.f f36041b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f36042c;

        l(String str, retrofit2.f fVar, boolean z8) {
            this.f36040a = (String) B.b(str, "name == null");
            this.f36041b = fVar;
            this.f36042c = z8;
        }

        @Override // retrofit2.n
        void a(u uVar, Object obj) {
            String str;
            if (obj == null || (str = (String) this.f36041b.convert(obj)) == null) {
                return;
            }
            uVar.g(this.f36040a, str, this.f36042c);
        }
    }

    static final class m extends n {

        /* renamed from: a, reason: collision with root package name */
        private final Method f36043a;

        /* renamed from: b, reason: collision with root package name */
        private final int f36044b;

        /* renamed from: c, reason: collision with root package name */
        private final retrofit2.f f36045c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f36046d;

        m(Method method, int i8, retrofit2.f fVar, boolean z8) {
            this.f36043a = method;
            this.f36044b = i8;
            this.f36045c = fVar;
            this.f36046d = z8;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.n
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(u uVar, Map map) {
            if (map == null) {
                throw B.p(this.f36043a, this.f36044b, "Query map was null", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw B.p(this.f36043a, this.f36044b, "Query map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw B.p(this.f36043a, this.f36044b, "Query map contained null value for key '" + str + "'.", new Object[0]);
                }
                String str2 = (String) this.f36045c.convert(value);
                if (str2 == null) {
                    throw B.p(this.f36043a, this.f36044b, "Query map value '" + value + "' converted to null by " + this.f36045c.getClass().getName() + " for key '" + str + "'.", new Object[0]);
                }
                uVar.g(str, str2, this.f36046d);
            }
        }
    }

    /* renamed from: retrofit2.n$n, reason: collision with other inner class name */
    static final class C0415n extends n {

        /* renamed from: a, reason: collision with root package name */
        private final retrofit2.f f36047a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f36048b;

        C0415n(retrofit2.f fVar, boolean z8) {
            this.f36047a = fVar;
            this.f36048b = z8;
        }

        @Override // retrofit2.n
        void a(u uVar, Object obj) {
            if (obj == null) {
                return;
            }
            uVar.g((String) this.f36047a.convert(obj), null, this.f36048b);
        }
    }

    static final class o extends n {

        /* renamed from: a, reason: collision with root package name */
        static final o f36049a = new o();

        private o() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.n
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(u uVar, D.b bVar) {
            if (bVar != null) {
                uVar.e(bVar);
            }
        }
    }

    static final class p extends n {

        /* renamed from: a, reason: collision with root package name */
        private final Method f36050a;

        /* renamed from: b, reason: collision with root package name */
        private final int f36051b;

        p(Method method, int i8) {
            this.f36050a = method;
            this.f36051b = i8;
        }

        @Override // retrofit2.n
        void a(u uVar, Object obj) {
            if (obj == null) {
                throw B.p(this.f36050a, this.f36051b, "@Url parameter is null.", new Object[0]);
            }
            uVar.m(obj);
        }
    }

    static final class q extends n {

        /* renamed from: a, reason: collision with root package name */
        final Class f36052a;

        q(Class cls) {
            this.f36052a = cls;
        }

        @Override // retrofit2.n
        void a(u uVar, Object obj) {
            uVar.h(this.f36052a, obj);
        }
    }

    n() {
    }

    abstract void a(u uVar, Object obj);

    final n b() {
        return new b();
    }

    final n c() {
        return new a();
    }
}
