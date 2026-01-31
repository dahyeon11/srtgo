package D3;

import Q7.C0709m;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public class c implements Closeable, Flushable {

    /* renamed from: j, reason: collision with root package name */
    private static final Pattern f926j = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* renamed from: k, reason: collision with root package name */
    private static final String[] f927k = new String[128];

    /* renamed from: l, reason: collision with root package name */
    private static final String[] f928l;

    /* renamed from: a, reason: collision with root package name */
    private final Writer f929a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f930b = new int[32];

    /* renamed from: c, reason: collision with root package name */
    private int f931c = 0;

    /* renamed from: d, reason: collision with root package name */
    private String f932d;

    /* renamed from: e, reason: collision with root package name */
    private String f933e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f934f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f935g;

    /* renamed from: h, reason: collision with root package name */
    private String f936h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f937i;

    static {
        for (int i8 = 0; i8 <= 31; i8++) {
            f927k[i8] = String.format("\\u%04x", Integer.valueOf(i8));
        }
        String[] strArr = f927k;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f928l = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        h(6);
        this.f933e = ":";
        this.f937i = true;
        Objects.requireNonNull(writer, "out == null");
        this.f929a = writer;
    }

    private void a() throws IOException {
        int iG = g();
        if (iG == 5) {
            this.f929a.write(44);
        } else if (iG != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        e();
        i(4);
    }

    private void b() throws IOException {
        int iG = g();
        if (iG == 1) {
            i(2);
            e();
            return;
        }
        if (iG == 2) {
            this.f929a.append(',');
            e();
        } else {
            if (iG == 4) {
                this.f929a.append((CharSequence) this.f933e);
                i(5);
                return;
            }
            if (iG != 6) {
                if (iG != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.f934f) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            i(7);
        }
    }

    private c c(int i8, int i9, char c9) throws IOException {
        int iG = g();
        if (iG != i9 && iG != i8) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f936h != null) {
            throw new IllegalStateException("Dangling name: " + this.f936h);
        }
        this.f931c--;
        if (iG == i9) {
            e();
        }
        this.f929a.write(c9);
        return this;
    }

    private static boolean d(Class cls) {
        return cls == Integer.class || cls == Long.class || cls == Double.class || cls == Float.class || cls == Byte.class || cls == Short.class || cls == BigDecimal.class || cls == BigInteger.class || cls == AtomicInteger.class || cls == AtomicLong.class;
    }

    private void e() throws IOException {
        if (this.f932d == null) {
            return;
        }
        this.f929a.write(10);
        int i8 = this.f931c;
        for (int i9 = 1; i9 < i8; i9++) {
            this.f929a.write(this.f932d);
        }
    }

    private c f(int i8, char c9) throws IOException {
        b();
        h(i8);
        this.f929a.write(c9);
        return this;
    }

    private int g() {
        int i8 = this.f931c;
        if (i8 != 0) {
            return this.f930b[i8 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private void h(int i8) {
        int i9 = this.f931c;
        int[] iArr = this.f930b;
        if (i9 == iArr.length) {
            this.f930b = Arrays.copyOf(iArr, i9 * 2);
        }
        int[] iArr2 = this.f930b;
        int i10 = this.f931c;
        this.f931c = i10 + 1;
        iArr2[i10] = i8;
    }

    private void i(int i8) {
        this.f930b[this.f931c - 1] = i8;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void j(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            boolean r0 = r8.f935g
            if (r0 == 0) goto L7
            java.lang.String[] r0 = D3.c.f928l
            goto L9
        L7:
            java.lang.String[] r0 = D3.c.f927k
        L9:
            java.io.Writer r1 = r8.f929a
            r2 = 34
            r1.write(r2)
            int r1 = r9.length()
            r3 = 0
            r4 = r3
        L16:
            if (r3 >= r1) goto L45
            char r5 = r9.charAt(r3)
            r6 = 128(0x80, float:1.8E-43)
            if (r5 >= r6) goto L25
            r5 = r0[r5]
            if (r5 != 0) goto L32
            goto L42
        L25:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L2c
            java.lang.String r5 = "\\u2028"
            goto L32
        L2c:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L42
            java.lang.String r5 = "\\u2029"
        L32:
            if (r4 >= r3) goto L3b
            java.io.Writer r6 = r8.f929a
            int r7 = r3 - r4
            r6.write(r9, r4, r7)
        L3b:
            java.io.Writer r4 = r8.f929a
            r4.write(r5)
            int r4 = r3 + 1
        L42:
            int r3 = r3 + 1
            goto L16
        L45:
            if (r4 >= r1) goto L4d
            java.io.Writer r0 = r8.f929a
            int r1 = r1 - r4
            r0.write(r9, r4, r1)
        L4d:
            java.io.Writer r9 = r8.f929a
            r9.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: D3.c.j(java.lang.String):void");
    }

    private void k() throws IOException {
        if (this.f936h != null) {
            a();
            j(this.f936h);
            this.f936h = null;
        }
    }

    public c beginArray() throws IOException {
        k();
        return f(1, '[');
    }

    public c beginObject() throws IOException {
        k();
        return f(3, '{');
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f929a.close();
        int i8 = this.f931c;
        if (i8 > 1 || (i8 == 1 && this.f930b[i8 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f931c = 0;
    }

    public c endArray() {
        return c(1, 2, ']');
    }

    public c endObject() {
        return c(3, 5, '}');
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.f931c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f929a.flush();
    }

    public final boolean getSerializeNulls() {
        return this.f937i;
    }

    public final boolean isHtmlSafe() {
        return this.f935g;
    }

    public boolean isLenient() {
        return this.f934f;
    }

    public c jsonValue(String str) throws IOException {
        if (str == null) {
            return nullValue();
        }
        k();
        b();
        this.f929a.append((CharSequence) str);
        return this;
    }

    public c name(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f936h != null) {
            throw new IllegalStateException();
        }
        if (this.f931c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f936h = str;
        return this;
    }

    public c nullValue() throws IOException {
        if (this.f936h != null) {
            if (!this.f937i) {
                this.f936h = null;
                return this;
            }
            k();
        }
        b();
        this.f929a.write("null");
        return this;
    }

    public final void setHtmlSafe(boolean z8) {
        this.f935g = z8;
    }

    public final void setIndent(String str) {
        if (str.length() == 0) {
            this.f932d = null;
            this.f933e = ":";
        } else {
            this.f932d = str;
            this.f933e = ": ";
        }
    }

    public final void setLenient(boolean z8) {
        this.f934f = z8;
    }

    public final void setSerializeNulls(boolean z8) {
        this.f937i = z8;
    }

    public c value(String str) throws IOException {
        if (str == null) {
            return nullValue();
        }
        k();
        b();
        j(str);
        return this;
    }

    public c value(boolean z8) throws IOException {
        k();
        b();
        this.f929a.write(z8 ? C0709m.TRUE : C0709m.FALSE);
        return this;
    }

    public c value(Boolean bool) throws IOException {
        if (bool == null) {
            return nullValue();
        }
        k();
        b();
        this.f929a.write(bool.booleanValue() ? C0709m.TRUE : C0709m.FALSE);
        return this;
    }

    public c value(float f8) throws IOException {
        k();
        if (!this.f934f && (Float.isNaN(f8) || Float.isInfinite(f8))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + f8);
        }
        b();
        this.f929a.append((CharSequence) Float.toString(f8));
        return this;
    }

    public c value(double d9) throws IOException {
        k();
        if (!this.f934f && (Double.isNaN(d9) || Double.isInfinite(d9))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d9);
        }
        b();
        this.f929a.append((CharSequence) Double.toString(d9));
        return this;
    }

    public c value(long j8) throws IOException {
        k();
        b();
        this.f929a.write(Long.toString(j8));
        return this;
    }

    public c value(Number number) throws IOException {
        if (number == null) {
            return nullValue();
        }
        k();
        String string = number.toString();
        if (!string.equals("-Infinity") && !string.equals("Infinity") && !string.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (!d(cls) && !f926j.matcher(string).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + string);
            }
        } else if (!this.f934f) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + string);
        }
        b();
        this.f929a.append((CharSequence) string);
        return this;
    }
}
