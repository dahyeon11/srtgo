package R7;

import Q7.O;
import java.util.Objects;

/* loaded from: classes3.dex */
public class m implements a {

    /* renamed from: d */
    private static volatile o f4519d = o.DEFAULT_STYLE;

    /* renamed from: a */
    private final StringBuffer f4520a;

    /* renamed from: b */
    private final Object f4521b;

    /* renamed from: c */
    private final o f4522c;

    public m(Object obj) {
        this(obj, null, null);
    }

    public static o getDefaultStyle() {
        return f4519d;
    }

    public static String reflectionToString(Object obj) {
        return l.toString(obj);
    }

    public static void setDefaultStyle(o oVar) {
        Objects.requireNonNull(oVar, "style");
        f4519d = oVar;
    }

    public m append(boolean z8) {
        this.f4522c.append(this.f4520a, (String) null, z8);
        return this;
    }

    public m appendAsObjectToString(Object obj) {
        O.identityToString(getStringBuffer(), obj);
        return this;
    }

    public m appendSuper(String str) {
        if (str != null) {
            this.f4522c.appendSuper(this.f4520a, str);
        }
        return this;
    }

    public m appendToString(String str) {
        if (str != null) {
            this.f4522c.appendToString(this.f4520a, str);
        }
        return this;
    }

    public Object getObject() {
        return this.f4521b;
    }

    public StringBuffer getStringBuffer() {
        return this.f4520a;
    }

    public o getStyle() {
        return this.f4522c;
    }

    public String toString() {
        if (getObject() == null) {
            getStringBuffer().append(getStyle().U());
        } else {
            this.f4522c.appendEnd(getStringBuffer(), getObject());
        }
        return getStringBuffer().toString();
    }

    public m(Object obj, o oVar) {
        this(obj, oVar, null);
    }

    public static String reflectionToString(Object obj, o oVar) {
        return l.toString(obj, oVar);
    }

    public m append(boolean[] zArr) {
        this.f4522c.append(this.f4520a, (String) null, zArr, (Boolean) null);
        return this;
    }

    @Override // R7.a
    public String build() {
        return toString();
    }

    public m(Object obj, o oVar, StringBuffer stringBuffer) {
        oVar = oVar == null ? getDefaultStyle() : oVar;
        stringBuffer = stringBuffer == null ? new StringBuffer(512) : stringBuffer;
        this.f4520a = stringBuffer;
        this.f4522c = oVar;
        this.f4521b = obj;
        oVar.appendStart(stringBuffer, obj);
    }

    public static String reflectionToString(Object obj, o oVar, boolean z8) {
        return l.toString(obj, oVar, z8, false, null);
    }

    public m append(byte b9) {
        this.f4522c.append(this.f4520a, (String) null, b9);
        return this;
    }

    public static <T> String reflectionToString(T t8, o oVar, boolean z8, Class<? super T> cls) {
        return l.toString(t8, oVar, z8, false, cls);
    }

    public m append(byte[] bArr) {
        this.f4522c.append(this.f4520a, (String) null, bArr, (Boolean) null);
        return this;
    }

    public m append(char c9) {
        this.f4522c.append(this.f4520a, (String) null, c9);
        return this;
    }

    public m append(char[] cArr) {
        this.f4522c.append(this.f4520a, (String) null, cArr, (Boolean) null);
        return this;
    }

    public m append(double d9) {
        this.f4522c.append(this.f4520a, (String) null, d9);
        return this;
    }

    public m append(double[] dArr) {
        this.f4522c.append(this.f4520a, (String) null, dArr, (Boolean) null);
        return this;
    }

    public m append(float f8) {
        this.f4522c.append(this.f4520a, (String) null, f8);
        return this;
    }

    public m append(float[] fArr) {
        this.f4522c.append(this.f4520a, (String) null, fArr, (Boolean) null);
        return this;
    }

    public m append(int i8) {
        this.f4522c.append(this.f4520a, (String) null, i8);
        return this;
    }

    public m append(int[] iArr) {
        this.f4522c.append(this.f4520a, (String) null, iArr, (Boolean) null);
        return this;
    }

    public m append(long j8) {
        this.f4522c.append(this.f4520a, (String) null, j8);
        return this;
    }

    public m append(long[] jArr) {
        this.f4522c.append(this.f4520a, (String) null, jArr, (Boolean) null);
        return this;
    }

    public m append(Object obj) {
        this.f4522c.append(this.f4520a, (String) null, obj, (Boolean) null);
        return this;
    }

    public m append(Object[] objArr) {
        this.f4522c.append(this.f4520a, (String) null, objArr, (Boolean) null);
        return this;
    }

    public m append(short s8) {
        this.f4522c.append(this.f4520a, (String) null, s8);
        return this;
    }

    public m append(short[] sArr) {
        this.f4522c.append(this.f4520a, (String) null, sArr, (Boolean) null);
        return this;
    }

    public m append(String str, boolean z8) {
        this.f4522c.append(this.f4520a, str, z8);
        return this;
    }

    public m append(String str, boolean[] zArr) {
        this.f4522c.append(this.f4520a, str, zArr, (Boolean) null);
        return this;
    }

    public m append(String str, boolean[] zArr, boolean z8) {
        this.f4522c.append(this.f4520a, str, zArr, Boolean.valueOf(z8));
        return this;
    }

    public m append(String str, byte b9) {
        this.f4522c.append(this.f4520a, str, b9);
        return this;
    }

    public m append(String str, byte[] bArr) {
        this.f4522c.append(this.f4520a, str, bArr, (Boolean) null);
        return this;
    }

    public m append(String str, byte[] bArr, boolean z8) {
        this.f4522c.append(this.f4520a, str, bArr, Boolean.valueOf(z8));
        return this;
    }

    public m append(String str, char c9) {
        this.f4522c.append(this.f4520a, str, c9);
        return this;
    }

    public m append(String str, char[] cArr) {
        this.f4522c.append(this.f4520a, str, cArr, (Boolean) null);
        return this;
    }

    public m append(String str, char[] cArr, boolean z8) {
        this.f4522c.append(this.f4520a, str, cArr, Boolean.valueOf(z8));
        return this;
    }

    public m append(String str, double d9) {
        this.f4522c.append(this.f4520a, str, d9);
        return this;
    }

    public m append(String str, double[] dArr) {
        this.f4522c.append(this.f4520a, str, dArr, (Boolean) null);
        return this;
    }

    public m append(String str, double[] dArr, boolean z8) {
        this.f4522c.append(this.f4520a, str, dArr, Boolean.valueOf(z8));
        return this;
    }

    public m append(String str, float f8) {
        this.f4522c.append(this.f4520a, str, f8);
        return this;
    }

    public m append(String str, float[] fArr) {
        this.f4522c.append(this.f4520a, str, fArr, (Boolean) null);
        return this;
    }

    public m append(String str, float[] fArr, boolean z8) {
        this.f4522c.append(this.f4520a, str, fArr, Boolean.valueOf(z8));
        return this;
    }

    public m append(String str, int i8) {
        this.f4522c.append(this.f4520a, str, i8);
        return this;
    }

    public m append(String str, int[] iArr) {
        this.f4522c.append(this.f4520a, str, iArr, (Boolean) null);
        return this;
    }

    public m append(String str, int[] iArr, boolean z8) {
        this.f4522c.append(this.f4520a, str, iArr, Boolean.valueOf(z8));
        return this;
    }

    public m append(String str, long j8) {
        this.f4522c.append(this.f4520a, str, j8);
        return this;
    }

    public m append(String str, long[] jArr) {
        this.f4522c.append(this.f4520a, str, jArr, (Boolean) null);
        return this;
    }

    public m append(String str, long[] jArr, boolean z8) {
        this.f4522c.append(this.f4520a, str, jArr, Boolean.valueOf(z8));
        return this;
    }

    public m append(String str, Object obj) {
        this.f4522c.append(this.f4520a, str, obj, (Boolean) null);
        return this;
    }

    public m append(String str, Object obj, boolean z8) {
        this.f4522c.append(this.f4520a, str, obj, Boolean.valueOf(z8));
        return this;
    }

    public m append(String str, Object[] objArr) {
        this.f4522c.append(this.f4520a, str, objArr, (Boolean) null);
        return this;
    }

    public m append(String str, Object[] objArr, boolean z8) {
        this.f4522c.append(this.f4520a, str, objArr, Boolean.valueOf(z8));
        return this;
    }

    public m append(String str, short s8) {
        this.f4522c.append(this.f4520a, str, s8);
        return this;
    }

    public m append(String str, short[] sArr) {
        this.f4522c.append(this.f4520a, str, sArr, (Boolean) null);
        return this;
    }

    public m append(String str, short[] sArr, boolean z8) {
        this.f4522c.append(this.f4520a, str, sArr, Boolean.valueOf(z8));
        return this;
    }
}
