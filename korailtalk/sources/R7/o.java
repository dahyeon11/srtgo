package R7;

import Q7.C;
import Q7.O;
import Q7.S;
import Q7.X;
import com.j256.ormlite.stmt.query.SimpleComparison;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public abstract class o implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    private boolean f4526c;

    /* renamed from: h, reason: collision with root package name */
    private boolean f4531h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f4532i;
    public static final o DEFAULT_STYLE = new a();
    public static final o MULTI_LINE_STYLE = new c();
    public static final o NO_FIELD_NAMES_STYLE = new e();
    public static final o SHORT_PREFIX_STYLE = new f();
    public static final o SIMPLE_STYLE = new g();
    public static final o NO_CLASS_NAME_STYLE = new d();
    public static final o JSON_STYLE = new b();

    /* renamed from: u, reason: collision with root package name */
    private static final ThreadLocal f4523u = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    private boolean f4524a = true;

    /* renamed from: b, reason: collision with root package name */
    private boolean f4525b = true;

    /* renamed from: d, reason: collision with root package name */
    private boolean f4527d = true;

    /* renamed from: e, reason: collision with root package name */
    private String f4528e = "[";

    /* renamed from: f, reason: collision with root package name */
    private String f4529f = "]";

    /* renamed from: g, reason: collision with root package name */
    private String f4530g = SimpleComparison.EQUAL_TO_OPERATION;

    /* renamed from: j, reason: collision with root package name */
    private String f4533j = ",";

    /* renamed from: k, reason: collision with root package name */
    private String f4534k = "{";

    /* renamed from: l, reason: collision with root package name */
    private String f4535l = ",";

    /* renamed from: m, reason: collision with root package name */
    private boolean f4536m = true;

    /* renamed from: n, reason: collision with root package name */
    private String f4537n = "}";

    /* renamed from: o, reason: collision with root package name */
    private boolean f4538o = true;

    /* renamed from: p, reason: collision with root package name */
    private String f4539p = "<null>";

    /* renamed from: q, reason: collision with root package name */
    private String f4540q = "<size=";

    /* renamed from: r, reason: collision with root package name */
    private String f4541r = SimpleComparison.GREATER_THAN_OPERATION;

    /* renamed from: s, reason: collision with root package name */
    private String f4542s = SimpleComparison.LESS_THAN_OPERATION;

    /* renamed from: t, reason: collision with root package name */
    private String f4543t = SimpleComparison.GREATER_THAN_OPERATION;

    private static final class a extends o {
        a() {
        }
    }

    private static final class c extends o {
        c() {
            f0("[");
            h0(System.lineSeparator() + "  ");
            i0(true);
            e0(System.lineSeparator() + "]");
        }
    }

    private static final class d extends o {
        d() {
            o0(false);
            q0(false);
        }
    }

    private static final class e extends o {
        e() {
            p0(false);
        }
    }

    private static final class f extends o {
        f() {
            r0(true);
            q0(false);
        }
    }

    private static final class g extends o {
        g() {
            o0(false);
            q0(false);
            p0(false);
            f0("");
            e0("");
        }
    }

    protected o() {
    }

    static boolean X(Object obj) {
        Map<Object, Object> registry = getRegistry();
        return registry != null && registry.containsKey(obj);
    }

    static void a0(Object obj) {
        if (obj != null) {
            if (getRegistry() == null) {
                f4523u.set(new WeakHashMap());
            }
            getRegistry().put(obj, null);
        }
    }

    public static Map<Object, Object> getRegistry() {
        return (Map) f4523u.get();
    }

    static void s0(Object obj) {
        Map<Object, Object> registry;
        if (obj == null || (registry = getRegistry()) == null) {
            return;
        }
        registry.remove(obj);
        if (registry.isEmpty()) {
            f4523u.remove();
        }
    }

    protected void A(StringBuffer stringBuffer) {
        stringBuffer.append(this.f4533j);
    }

    protected void B(StringBuffer stringBuffer, String str) {
        if (!this.f4524a || str == null) {
            return;
        }
        stringBuffer.append(str);
        stringBuffer.append(this.f4530g);
    }

    protected void C(StringBuffer stringBuffer, Object obj) {
        if (!Y() || obj == null) {
            return;
        }
        a0(obj);
        stringBuffer.append('@');
        stringBuffer.append(O.identityHashCodeHex(obj));
    }

    protected void D(StringBuffer stringBuffer, String str, Object obj, boolean z8) {
        if (X(obj) && !(obj instanceof Number) && !(obj instanceof Boolean) && !(obj instanceof Character)) {
            d(stringBuffer, str, obj);
            return;
        }
        a0(obj);
        try {
            if (obj instanceof Collection) {
                if (z8) {
                    m(stringBuffer, str, (Collection) obj);
                } else {
                    P(stringBuffer, str, ((Collection) obj).size());
                }
            } else if (obj instanceof Map) {
                if (z8) {
                    n(stringBuffer, str, (Map) obj);
                } else {
                    P(stringBuffer, str, ((Map) obj).size());
                }
            } else if (obj instanceof long[]) {
                if (z8) {
                    v(stringBuffer, str, (long[]) obj);
                } else {
                    L(stringBuffer, str, (long[]) obj);
                }
            } else if (obj instanceof int[]) {
                if (z8) {
                    u(stringBuffer, str, (int[]) obj);
                } else {
                    K(stringBuffer, str, (int[]) obj);
                }
            } else if (obj instanceof short[]) {
                if (z8) {
                    x(stringBuffer, str, (short[]) obj);
                } else {
                    N(stringBuffer, str, (short[]) obj);
                }
            } else if (obj instanceof byte[]) {
                if (z8) {
                    q(stringBuffer, str, (byte[]) obj);
                } else {
                    G(stringBuffer, str, (byte[]) obj);
                }
            } else if (obj instanceof char[]) {
                if (z8) {
                    r(stringBuffer, str, (char[]) obj);
                } else {
                    H(stringBuffer, str, (char[]) obj);
                }
            } else if (obj instanceof double[]) {
                if (z8) {
                    s(stringBuffer, str, (double[]) obj);
                } else {
                    I(stringBuffer, str, (double[]) obj);
                }
            } else if (obj instanceof float[]) {
                if (z8) {
                    t(stringBuffer, str, (float[]) obj);
                } else {
                    J(stringBuffer, str, (float[]) obj);
                }
            } else if (obj instanceof boolean[]) {
                if (z8) {
                    y(stringBuffer, str, (boolean[]) obj);
                } else {
                    O(stringBuffer, str, (boolean[]) obj);
                }
            } else if (O.isArray(obj)) {
                if (z8) {
                    w(stringBuffer, str, (Object[]) obj);
                } else {
                    M(stringBuffer, str, (Object[]) obj);
                }
            } else if (z8) {
                l(stringBuffer, str, obj);
            } else {
                F(stringBuffer, str, obj);
            }
            s0(obj);
        } catch (Throwable th) {
            s0(obj);
            throw th;
        }
    }

    protected void E(StringBuffer stringBuffer, String str) {
        stringBuffer.append(this.f4539p);
    }

    protected void F(StringBuffer stringBuffer, String str, Object obj) {
        stringBuffer.append(this.f4542s);
        stringBuffer.append(V(obj.getClass()));
        stringBuffer.append(this.f4543t);
    }

    protected void G(StringBuffer stringBuffer, String str, byte[] bArr) {
        P(stringBuffer, str, bArr.length);
    }

    protected void H(StringBuffer stringBuffer, String str, char[] cArr) {
        P(stringBuffer, str, cArr.length);
    }

    protected void I(StringBuffer stringBuffer, String str, double[] dArr) {
        P(stringBuffer, str, dArr.length);
    }

    protected void J(StringBuffer stringBuffer, String str, float[] fArr) {
        P(stringBuffer, str, fArr.length);
    }

    protected void K(StringBuffer stringBuffer, String str, int[] iArr) {
        P(stringBuffer, str, iArr.length);
    }

    protected void L(StringBuffer stringBuffer, String str, long[] jArr) {
        P(stringBuffer, str, jArr.length);
    }

    protected void M(StringBuffer stringBuffer, String str, Object[] objArr) {
        P(stringBuffer, str, objArr.length);
    }

    protected void N(StringBuffer stringBuffer, String str, short[] sArr) {
        P(stringBuffer, str, sArr.length);
    }

    protected void O(StringBuffer stringBuffer, String str, boolean[] zArr) {
        P(stringBuffer, str, zArr.length);
    }

    protected void P(StringBuffer stringBuffer, String str, int i8) {
        stringBuffer.append(this.f4540q);
        stringBuffer.append(i8);
        stringBuffer.append(this.f4541r);
    }

    protected String Q() {
        return this.f4537n;
    }

    protected String R() {
        return this.f4534k;
    }

    protected String S() {
        return this.f4529f;
    }

    protected String T() {
        return this.f4528e;
    }

    protected String U() {
        return this.f4539p;
    }

    protected String V(Class cls) {
        return C.getShortClassName((Class<?>) cls);
    }

    protected boolean W(Boolean bool) {
        return bool == null ? this.f4538o : bool.booleanValue();
    }

    protected boolean Y() {
        return this.f4527d;
    }

    protected void Z(StringBuffer stringBuffer, String str, Object obj) {
        stringBuffer.append(this.f4534k);
        int length = Array.getLength(obj);
        for (int i8 = 0; i8 < length; i8++) {
            j(stringBuffer, str, i8, Array.get(obj, i8));
        }
        stringBuffer.append(this.f4537n);
    }

    protected void a(StringBuffer stringBuffer, Object obj) {
        if (!this.f4525b || obj == null) {
            return;
        }
        a0(obj);
        if (this.f4526c) {
            stringBuffer.append(V(obj.getClass()));
        } else {
            stringBuffer.append(obj.getClass().getName());
        }
    }

    public void append(StringBuffer stringBuffer, String str, boolean z8) {
        B(stringBuffer, str);
        p(stringBuffer, str, z8);
        z(stringBuffer, str);
    }

    public void appendEnd(StringBuffer stringBuffer, Object obj) {
        if (!this.f4532i) {
            b0(stringBuffer);
        }
        b(stringBuffer);
        s0(obj);
    }

    public void appendStart(StringBuffer stringBuffer, Object obj) {
        if (obj != null) {
            a(stringBuffer, obj);
            C(stringBuffer, obj);
            c(stringBuffer);
            if (this.f4531h) {
                A(stringBuffer);
            }
        }
    }

    public void appendSuper(StringBuffer stringBuffer, String str) {
        appendToString(stringBuffer, str);
    }

    public void appendToString(StringBuffer stringBuffer, String str) {
        int iIndexOf;
        int iLastIndexOf;
        if (str == null || (iIndexOf = str.indexOf(this.f4528e) + this.f4528e.length()) == (iLastIndexOf = str.lastIndexOf(this.f4529f)) || iIndexOf < 0 || iLastIndexOf < 0) {
            return;
        }
        if (this.f4531h) {
            b0(stringBuffer);
        }
        stringBuffer.append((CharSequence) str, iIndexOf, iLastIndexOf);
        A(stringBuffer);
    }

    protected void b(StringBuffer stringBuffer) {
        stringBuffer.append(this.f4529f);
    }

    protected void b0(StringBuffer stringBuffer) {
        if (X.endsWith(stringBuffer, this.f4533j)) {
            stringBuffer.setLength(stringBuffer.length() - this.f4533j.length());
        }
    }

    protected void c(StringBuffer stringBuffer) {
        stringBuffer.append(this.f4528e);
    }

    protected void c0(String str) {
        if (str == null) {
            str = "";
        }
        this.f4537n = str;
    }

    protected void d(StringBuffer stringBuffer, String str, Object obj) {
        O.identityToString(stringBuffer, obj);
    }

    protected void d0(String str) {
        if (str == null) {
            str = "";
        }
        this.f4534k = str;
    }

    protected void e(StringBuffer stringBuffer, String str, byte b9) {
        stringBuffer.append((int) b9);
    }

    protected void e0(String str) {
        if (str == null) {
            str = "";
        }
        this.f4529f = str;
    }

    protected void f(StringBuffer stringBuffer, String str, char c9) {
        stringBuffer.append(c9);
    }

    protected void f0(String str) {
        if (str == null) {
            str = "";
        }
        this.f4528e = str;
    }

    protected void g(StringBuffer stringBuffer, String str, double d9) {
        stringBuffer.append(d9);
    }

    protected void g0(String str) {
        if (str == null) {
            str = "";
        }
        this.f4530g = str;
    }

    protected void h(StringBuffer stringBuffer, String str, float f8) {
        stringBuffer.append(f8);
    }

    protected void h0(String str) {
        if (str == null) {
            str = "";
        }
        this.f4533j = str;
    }

    protected void i(StringBuffer stringBuffer, String str, int i8) {
        stringBuffer.append(i8);
    }

    protected void i0(boolean z8) {
        this.f4531h = z8;
    }

    protected void j(StringBuffer stringBuffer, String str, int i8, Object obj) {
        if (i8 > 0) {
            stringBuffer.append(this.f4535l);
        }
        if (obj == null) {
            E(stringBuffer, str);
        } else {
            D(stringBuffer, str, obj, this.f4536m);
        }
    }

    protected void j0(String str) {
        if (str == null) {
            str = "";
        }
        this.f4539p = str;
    }

    protected void k(StringBuffer stringBuffer, String str, long j8) {
        stringBuffer.append(j8);
    }

    protected void k0(String str) {
        if (str == null) {
            str = "";
        }
        this.f4541r = str;
    }

    protected void l(StringBuffer stringBuffer, String str, Object obj) {
        stringBuffer.append(obj);
    }

    protected void l0(String str) {
        if (str == null) {
            str = "";
        }
        this.f4540q = str;
    }

    protected void m(StringBuffer stringBuffer, String str, Collection collection) {
        stringBuffer.append(collection);
    }

    protected void m0(String str) {
        if (str == null) {
            str = "";
        }
        this.f4543t = str;
    }

    protected void n(StringBuffer stringBuffer, String str, Map map) {
        stringBuffer.append(map);
    }

    protected void n0(String str) {
        if (str == null) {
            str = "";
        }
        this.f4542s = str;
    }

    protected void o(StringBuffer stringBuffer, String str, short s8) {
        stringBuffer.append((int) s8);
    }

    protected void o0(boolean z8) {
        this.f4525b = z8;
    }

    protected void p(StringBuffer stringBuffer, String str, boolean z8) {
        stringBuffer.append(z8);
    }

    protected void p0(boolean z8) {
        this.f4524a = z8;
    }

    protected void q(StringBuffer stringBuffer, String str, byte[] bArr) {
        stringBuffer.append(this.f4534k);
        for (int i8 = 0; i8 < bArr.length; i8++) {
            if (i8 > 0) {
                stringBuffer.append(this.f4535l);
            }
            e(stringBuffer, str, bArr[i8]);
        }
        stringBuffer.append(this.f4537n);
    }

    protected void q0(boolean z8) {
        this.f4527d = z8;
    }

    protected void r(StringBuffer stringBuffer, String str, char[] cArr) {
        stringBuffer.append(this.f4534k);
        for (int i8 = 0; i8 < cArr.length; i8++) {
            if (i8 > 0) {
                stringBuffer.append(this.f4535l);
            }
            f(stringBuffer, str, cArr[i8]);
        }
        stringBuffer.append(this.f4537n);
    }

    protected void r0(boolean z8) {
        this.f4526c = z8;
    }

    protected void s(StringBuffer stringBuffer, String str, double[] dArr) {
        stringBuffer.append(this.f4534k);
        for (int i8 = 0; i8 < dArr.length; i8++) {
            if (i8 > 0) {
                stringBuffer.append(this.f4535l);
            }
            g(stringBuffer, str, dArr[i8]);
        }
        stringBuffer.append(this.f4537n);
    }

    protected void t(StringBuffer stringBuffer, String str, float[] fArr) {
        stringBuffer.append(this.f4534k);
        for (int i8 = 0; i8 < fArr.length; i8++) {
            if (i8 > 0) {
                stringBuffer.append(this.f4535l);
            }
            h(stringBuffer, str, fArr[i8]);
        }
        stringBuffer.append(this.f4537n);
    }

    protected void u(StringBuffer stringBuffer, String str, int[] iArr) {
        stringBuffer.append(this.f4534k);
        for (int i8 = 0; i8 < iArr.length; i8++) {
            if (i8 > 0) {
                stringBuffer.append(this.f4535l);
            }
            i(stringBuffer, str, iArr[i8]);
        }
        stringBuffer.append(this.f4537n);
    }

    protected void v(StringBuffer stringBuffer, String str, long[] jArr) {
        stringBuffer.append(this.f4534k);
        for (int i8 = 0; i8 < jArr.length; i8++) {
            if (i8 > 0) {
                stringBuffer.append(this.f4535l);
            }
            k(stringBuffer, str, jArr[i8]);
        }
        stringBuffer.append(this.f4537n);
    }

    protected void w(StringBuffer stringBuffer, String str, Object[] objArr) {
        stringBuffer.append(this.f4534k);
        for (int i8 = 0; i8 < objArr.length; i8++) {
            j(stringBuffer, str, i8, objArr[i8]);
        }
        stringBuffer.append(this.f4537n);
    }

    protected void x(StringBuffer stringBuffer, String str, short[] sArr) {
        stringBuffer.append(this.f4534k);
        for (int i8 = 0; i8 < sArr.length; i8++) {
            if (i8 > 0) {
                stringBuffer.append(this.f4535l);
            }
            o(stringBuffer, str, sArr[i8]);
        }
        stringBuffer.append(this.f4537n);
    }

    protected void y(StringBuffer stringBuffer, String str, boolean[] zArr) {
        stringBuffer.append(this.f4534k);
        for (int i8 = 0; i8 < zArr.length; i8++) {
            if (i8 > 0) {
                stringBuffer.append(this.f4535l);
            }
            p(stringBuffer, str, zArr[i8]);
        }
        stringBuffer.append(this.f4537n);
    }

    protected void z(StringBuffer stringBuffer, String str) {
        A(stringBuffer);
    }

    private static final class b extends o {
        b() {
            o0(false);
            q0(false);
            f0("{");
            e0("}");
            d0("[");
            c0("]");
            h0(",");
            g0(":");
            j0("null");
            n0("\"<");
            m0(">\"");
            l0("\"<size=");
            k0(">\"");
        }

        private void t0(StringBuffer stringBuffer, String str) {
            stringBuffer.append('\"');
            stringBuffer.append(S.escapeJson(str));
            stringBuffer.append('\"');
        }

        private boolean u0(String str) {
            return str.startsWith(R()) && str.endsWith(Q());
        }

        private boolean v0(String str) {
            return str.startsWith(T()) && str.endsWith(S());
        }

        @Override // R7.o
        protected void B(StringBuffer stringBuffer, String str) {
            if (str == null) {
                throw new UnsupportedOperationException("Field names are mandatory when using JsonToStringStyle");
            }
            super.B(stringBuffer, "\"" + S.escapeJson(str) + "\"");
        }

        @Override // R7.o
        public void append(StringBuffer stringBuffer, String str, boolean[] zArr, Boolean bool) {
            if (str == null) {
                throw new UnsupportedOperationException("Field names are mandatory when using JsonToStringStyle");
            }
            if (!W(bool)) {
                throw new UnsupportedOperationException("FullDetail must be true when using JsonToStringStyle");
            }
            super.append(stringBuffer, str, zArr, bool);
        }

        @Override // R7.o
        protected void f(StringBuffer stringBuffer, String str, char c9) {
            t0(stringBuffer, String.valueOf(c9));
        }

        @Override // R7.o
        protected void l(StringBuffer stringBuffer, String str, Object obj) {
            if (obj == null) {
                E(stringBuffer, str);
                return;
            }
            if ((obj instanceof String) || (obj instanceof Character)) {
                t0(stringBuffer, obj.toString());
                return;
            }
            if ((obj instanceof Number) || (obj instanceof Boolean)) {
                stringBuffer.append(obj);
                return;
            }
            String string = obj.toString();
            if (v0(string) || u0(string)) {
                stringBuffer.append(obj);
            } else {
                l(stringBuffer, str, string);
            }
        }

        @Override // R7.o
        protected void m(StringBuffer stringBuffer, String str, Collection collection) {
            if (collection == null || collection.isEmpty()) {
                stringBuffer.append(collection);
                return;
            }
            stringBuffer.append(R());
            Iterator it = collection.iterator();
            int i8 = 0;
            while (it.hasNext()) {
                j(stringBuffer, str, i8, it.next());
                i8++;
            }
            stringBuffer.append(Q());
        }

        @Override // R7.o
        protected void n(StringBuffer stringBuffer, String str, Map map) {
            if (map == null || map.isEmpty()) {
                stringBuffer.append(map);
                return;
            }
            stringBuffer.append(T());
            boolean z8 = true;
            for (Map.Entry entry : map.entrySet()) {
                String string = Objects.toString(entry.getKey(), null);
                if (string != null) {
                    if (z8) {
                        z8 = false;
                    } else {
                        z(stringBuffer, string);
                    }
                    B(stringBuffer, string);
                    Object value = entry.getValue();
                    if (value == null) {
                        E(stringBuffer, string);
                    } else {
                        D(stringBuffer, string, value, true);
                    }
                }
            }
            stringBuffer.append(S());
        }

        @Override // R7.o
        public void append(StringBuffer stringBuffer, String str, byte[] bArr, Boolean bool) {
            if (str != null) {
                if (W(bool)) {
                    super.append(stringBuffer, str, bArr, bool);
                    return;
                }
                throw new UnsupportedOperationException("FullDetail must be true when using JsonToStringStyle");
            }
            throw new UnsupportedOperationException("Field names are mandatory when using JsonToStringStyle");
        }

        @Override // R7.o
        public void append(StringBuffer stringBuffer, String str, char[] cArr, Boolean bool) {
            if (str != null) {
                if (W(bool)) {
                    super.append(stringBuffer, str, cArr, bool);
                    return;
                }
                throw new UnsupportedOperationException("FullDetail must be true when using JsonToStringStyle");
            }
            throw new UnsupportedOperationException("Field names are mandatory when using JsonToStringStyle");
        }

        @Override // R7.o
        public void append(StringBuffer stringBuffer, String str, double[] dArr, Boolean bool) {
            if (str != null) {
                if (W(bool)) {
                    super.append(stringBuffer, str, dArr, bool);
                    return;
                }
                throw new UnsupportedOperationException("FullDetail must be true when using JsonToStringStyle");
            }
            throw new UnsupportedOperationException("Field names are mandatory when using JsonToStringStyle");
        }

        @Override // R7.o
        public void append(StringBuffer stringBuffer, String str, float[] fArr, Boolean bool) {
            if (str != null) {
                if (W(bool)) {
                    super.append(stringBuffer, str, fArr, bool);
                    return;
                }
                throw new UnsupportedOperationException("FullDetail must be true when using JsonToStringStyle");
            }
            throw new UnsupportedOperationException("Field names are mandatory when using JsonToStringStyle");
        }

        @Override // R7.o
        public void append(StringBuffer stringBuffer, String str, int[] iArr, Boolean bool) {
            if (str != null) {
                if (W(bool)) {
                    super.append(stringBuffer, str, iArr, bool);
                    return;
                }
                throw new UnsupportedOperationException("FullDetail must be true when using JsonToStringStyle");
            }
            throw new UnsupportedOperationException("Field names are mandatory when using JsonToStringStyle");
        }

        @Override // R7.o
        public void append(StringBuffer stringBuffer, String str, long[] jArr, Boolean bool) {
            if (str != null) {
                if (W(bool)) {
                    super.append(stringBuffer, str, jArr, bool);
                    return;
                }
                throw new UnsupportedOperationException("FullDetail must be true when using JsonToStringStyle");
            }
            throw new UnsupportedOperationException("Field names are mandatory when using JsonToStringStyle");
        }

        @Override // R7.o
        public void append(StringBuffer stringBuffer, String str, Object obj, Boolean bool) {
            if (str != null) {
                if (W(bool)) {
                    super.append(stringBuffer, str, obj, bool);
                    return;
                }
                throw new UnsupportedOperationException("FullDetail must be true when using JsonToStringStyle");
            }
            throw new UnsupportedOperationException("Field names are mandatory when using JsonToStringStyle");
        }

        @Override // R7.o
        public void append(StringBuffer stringBuffer, String str, Object[] objArr, Boolean bool) {
            if (str != null) {
                if (W(bool)) {
                    super.append(stringBuffer, str, objArr, bool);
                    return;
                }
                throw new UnsupportedOperationException("FullDetail must be true when using JsonToStringStyle");
            }
            throw new UnsupportedOperationException("Field names are mandatory when using JsonToStringStyle");
        }

        @Override // R7.o
        public void append(StringBuffer stringBuffer, String str, short[] sArr, Boolean bool) {
            if (str != null) {
                if (W(bool)) {
                    super.append(stringBuffer, str, sArr, bool);
                    return;
                }
                throw new UnsupportedOperationException("FullDetail must be true when using JsonToStringStyle");
            }
            throw new UnsupportedOperationException("Field names are mandatory when using JsonToStringStyle");
        }
    }

    public void append(StringBuffer stringBuffer, String str, boolean[] zArr, Boolean bool) {
        B(stringBuffer, str);
        if (zArr == null) {
            E(stringBuffer, str);
        } else if (W(bool)) {
            y(stringBuffer, str, zArr);
        } else {
            O(stringBuffer, str, zArr);
        }
        z(stringBuffer, str);
    }

    public void append(StringBuffer stringBuffer, String str, byte b9) {
        B(stringBuffer, str);
        e(stringBuffer, str, b9);
        z(stringBuffer, str);
    }

    public void append(StringBuffer stringBuffer, String str, byte[] bArr, Boolean bool) {
        B(stringBuffer, str);
        if (bArr == null) {
            E(stringBuffer, str);
        } else if (W(bool)) {
            q(stringBuffer, str, bArr);
        } else {
            G(stringBuffer, str, bArr);
        }
        z(stringBuffer, str);
    }

    public void append(StringBuffer stringBuffer, String str, char c9) {
        B(stringBuffer, str);
        f(stringBuffer, str, c9);
        z(stringBuffer, str);
    }

    public void append(StringBuffer stringBuffer, String str, char[] cArr, Boolean bool) {
        B(stringBuffer, str);
        if (cArr == null) {
            E(stringBuffer, str);
        } else if (W(bool)) {
            r(stringBuffer, str, cArr);
        } else {
            H(stringBuffer, str, cArr);
        }
        z(stringBuffer, str);
    }

    public void append(StringBuffer stringBuffer, String str, double d9) {
        B(stringBuffer, str);
        g(stringBuffer, str, d9);
        z(stringBuffer, str);
    }

    public void append(StringBuffer stringBuffer, String str, double[] dArr, Boolean bool) {
        B(stringBuffer, str);
        if (dArr == null) {
            E(stringBuffer, str);
        } else if (W(bool)) {
            s(stringBuffer, str, dArr);
        } else {
            I(stringBuffer, str, dArr);
        }
        z(stringBuffer, str);
    }

    public void append(StringBuffer stringBuffer, String str, float f8) {
        B(stringBuffer, str);
        h(stringBuffer, str, f8);
        z(stringBuffer, str);
    }

    public void append(StringBuffer stringBuffer, String str, float[] fArr, Boolean bool) {
        B(stringBuffer, str);
        if (fArr == null) {
            E(stringBuffer, str);
        } else if (W(bool)) {
            t(stringBuffer, str, fArr);
        } else {
            J(stringBuffer, str, fArr);
        }
        z(stringBuffer, str);
    }

    public void append(StringBuffer stringBuffer, String str, int i8) {
        B(stringBuffer, str);
        i(stringBuffer, str, i8);
        z(stringBuffer, str);
    }

    public void append(StringBuffer stringBuffer, String str, int[] iArr, Boolean bool) {
        B(stringBuffer, str);
        if (iArr == null) {
            E(stringBuffer, str);
        } else if (W(bool)) {
            u(stringBuffer, str, iArr);
        } else {
            K(stringBuffer, str, iArr);
        }
        z(stringBuffer, str);
    }

    public void append(StringBuffer stringBuffer, String str, long j8) {
        B(stringBuffer, str);
        k(stringBuffer, str, j8);
        z(stringBuffer, str);
    }

    public void append(StringBuffer stringBuffer, String str, long[] jArr, Boolean bool) {
        B(stringBuffer, str);
        if (jArr == null) {
            E(stringBuffer, str);
        } else if (W(bool)) {
            v(stringBuffer, str, jArr);
        } else {
            L(stringBuffer, str, jArr);
        }
        z(stringBuffer, str);
    }

    public void append(StringBuffer stringBuffer, String str, Object obj, Boolean bool) {
        B(stringBuffer, str);
        if (obj == null) {
            E(stringBuffer, str);
        } else {
            D(stringBuffer, str, obj, W(bool));
        }
        z(stringBuffer, str);
    }

    public void append(StringBuffer stringBuffer, String str, Object[] objArr, Boolean bool) {
        B(stringBuffer, str);
        if (objArr == null) {
            E(stringBuffer, str);
        } else if (W(bool)) {
            w(stringBuffer, str, objArr);
        } else {
            M(stringBuffer, str, objArr);
        }
        z(stringBuffer, str);
    }

    public void append(StringBuffer stringBuffer, String str, short s8) {
        B(stringBuffer, str);
        o(stringBuffer, str, s8);
        z(stringBuffer, str);
    }

    public void append(StringBuffer stringBuffer, String str, short[] sArr, Boolean bool) {
        B(stringBuffer, str);
        if (sArr == null) {
            E(stringBuffer, str);
        } else if (W(bool)) {
            x(stringBuffer, str, sArr);
        } else {
            N(stringBuffer, str, sArr);
        }
        z(stringBuffer, str);
    }
}
