package com.google.gson.internal.bind;

import D3.d;
import Q7.C;
import com.google.gson.f;
import com.google.gson.i;
import com.google.gson.k;
import com.google.gson.l;
import com.google.gson.o;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class b extends D3.a {

    /* renamed from: t, reason: collision with root package name */
    private static final Reader f26011t = new a();

    /* renamed from: u, reason: collision with root package name */
    private static final Object f26012u = new Object();

    /* renamed from: p, reason: collision with root package name */
    private Object[] f26013p;

    /* renamed from: q, reason: collision with root package name */
    private int f26014q;

    /* renamed from: r, reason: collision with root package name */
    private String[] f26015r;

    /* renamed from: s, reason: collision with root package name */
    private int[] f26016s;

    class a extends Reader {
        a() {
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i8, int i9) {
            throw new AssertionError();
        }
    }

    /* renamed from: com.google.gson.internal.bind.b$b, reason: collision with other inner class name */
    static /* synthetic */ class C0212b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f26017a;

        static {
            int[] iArr = new int[D3.b.values().length];
            f26017a = iArr;
            try {
                iArr[D3.b.NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26017a[D3.b.END_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26017a[D3.b.END_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f26017a[D3.b.END_DOCUMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public b(i iVar) {
        super(f26011t);
        this.f26013p = new Object[32];
        this.f26014q = 0;
        this.f26015r = new String[32];
        this.f26016s = new int[32];
        y(iVar);
    }

    private String e(boolean z8) {
        StringBuilder sb = new StringBuilder();
        sb.append(C.INNER_CLASS_SEPARATOR_CHAR);
        int i8 = 0;
        while (true) {
            int i9 = this.f26014q;
            if (i8 >= i9) {
                return sb.toString();
            }
            Object[] objArr = this.f26013p;
            Object obj = objArr[i8];
            if (obj instanceof f) {
                i8++;
                if (i8 < i9 && (objArr[i8] instanceof Iterator)) {
                    int i10 = this.f26016s[i8];
                    if (z8 && i10 > 0 && (i8 == i9 - 1 || i8 == i9 - 2)) {
                        i10--;
                    }
                    sb.append('[');
                    sb.append(i10);
                    sb.append(']');
                }
            } else if ((obj instanceof l) && (i8 = i8 + 1) < i9 && (objArr[i8] instanceof Iterator)) {
                sb.append(C.PACKAGE_SEPARATOR_CHAR);
                String str = this.f26015r[i8];
                if (str != null) {
                    sb.append(str);
                }
            }
            i8++;
        }
    }

    private String g() {
        return " at path " + getPath();
    }

    private void t(D3.b bVar) {
        if (peek() == bVar) {
            return;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + peek() + g());
    }

    private String v(boolean z8) {
        t(D3.b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) w()).next();
        String str = (String) entry.getKey();
        this.f26015r[this.f26014q - 1] = z8 ? "<skipped>" : str;
        y(entry.getValue());
        return str;
    }

    private Object w() {
        return this.f26013p[this.f26014q - 1];
    }

    private Object x() {
        Object[] objArr = this.f26013p;
        int i8 = this.f26014q - 1;
        this.f26014q = i8;
        Object obj = objArr[i8];
        objArr[i8] = null;
        return obj;
    }

    private void y(Object obj) {
        int i8 = this.f26014q;
        Object[] objArr = this.f26013p;
        if (i8 == objArr.length) {
            int i9 = i8 * 2;
            this.f26013p = Arrays.copyOf(objArr, i9);
            this.f26016s = Arrays.copyOf(this.f26016s, i9);
            this.f26015r = (String[]) Arrays.copyOf(this.f26015r, i9);
        }
        Object[] objArr2 = this.f26013p;
        int i10 = this.f26014q;
        this.f26014q = i10 + 1;
        objArr2[i10] = obj;
    }

    @Override // D3.a
    public void beginArray() {
        t(D3.b.BEGIN_ARRAY);
        y(((f) w()).iterator());
        this.f26016s[this.f26014q - 1] = 0;
    }

    @Override // D3.a
    public void beginObject() {
        t(D3.b.BEGIN_OBJECT);
        y(((l) w()).entrySet().iterator());
    }

    @Override // D3.a, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f26013p = new Object[]{f26012u};
        this.f26014q = 1;
    }

    @Override // D3.a
    public void endArray() {
        t(D3.b.END_ARRAY);
        x();
        x();
        int i8 = this.f26014q;
        if (i8 > 0) {
            int[] iArr = this.f26016s;
            int i9 = i8 - 1;
            iArr[i9] = iArr[i9] + 1;
        }
    }

    @Override // D3.a
    public void endObject() {
        t(D3.b.END_OBJECT);
        this.f26015r[this.f26014q - 1] = null;
        x();
        x();
        int i8 = this.f26014q;
        if (i8 > 0) {
            int[] iArr = this.f26016s;
            int i9 = i8 - 1;
            iArr[i9] = iArr[i9] + 1;
        }
    }

    @Override // D3.a
    public String getPath() {
        return e(false);
    }

    @Override // D3.a
    public String getPreviousPath() {
        return e(true);
    }

    @Override // D3.a
    public boolean hasNext() throws d {
        D3.b bVarPeek = peek();
        return (bVarPeek == D3.b.END_OBJECT || bVarPeek == D3.b.END_ARRAY || bVarPeek == D3.b.END_DOCUMENT) ? false : true;
    }

    @Override // D3.a
    public boolean nextBoolean() {
        t(D3.b.BOOLEAN);
        boolean asBoolean = ((o) x()).getAsBoolean();
        int i8 = this.f26014q;
        if (i8 > 0) {
            int[] iArr = this.f26016s;
            int i9 = i8 - 1;
            iArr[i9] = iArr[i9] + 1;
        }
        return asBoolean;
    }

    @Override // D3.a
    public double nextDouble() throws d {
        D3.b bVarPeek = peek();
        D3.b bVar = D3.b.NUMBER;
        if (bVarPeek != bVar && bVarPeek != D3.b.STRING) {
            throw new IllegalStateException("Expected " + bVar + " but was " + bVarPeek + g());
        }
        double asDouble = ((o) w()).getAsDouble();
        if (!isLenient() && (Double.isNaN(asDouble) || Double.isInfinite(asDouble))) {
            throw new d("JSON forbids NaN and infinities: " + asDouble);
        }
        x();
        int i8 = this.f26014q;
        if (i8 > 0) {
            int[] iArr = this.f26016s;
            int i9 = i8 - 1;
            iArr[i9] = iArr[i9] + 1;
        }
        return asDouble;
    }

    @Override // D3.a
    public int nextInt() throws d {
        D3.b bVarPeek = peek();
        D3.b bVar = D3.b.NUMBER;
        if (bVarPeek != bVar && bVarPeek != D3.b.STRING) {
            throw new IllegalStateException("Expected " + bVar + " but was " + bVarPeek + g());
        }
        int asInt = ((o) w()).getAsInt();
        x();
        int i8 = this.f26014q;
        if (i8 > 0) {
            int[] iArr = this.f26016s;
            int i9 = i8 - 1;
            iArr[i9] = iArr[i9] + 1;
        }
        return asInt;
    }

    @Override // D3.a
    public long nextLong() throws d {
        D3.b bVarPeek = peek();
        D3.b bVar = D3.b.NUMBER;
        if (bVarPeek != bVar && bVarPeek != D3.b.STRING) {
            throw new IllegalStateException("Expected " + bVar + " but was " + bVarPeek + g());
        }
        long asLong = ((o) w()).getAsLong();
        x();
        int i8 = this.f26014q;
        if (i8 > 0) {
            int[] iArr = this.f26016s;
            int i9 = i8 - 1;
            iArr[i9] = iArr[i9] + 1;
        }
        return asLong;
    }

    @Override // D3.a
    public String nextName() {
        return v(false);
    }

    @Override // D3.a
    public void nextNull() {
        t(D3.b.NULL);
        x();
        int i8 = this.f26014q;
        if (i8 > 0) {
            int[] iArr = this.f26016s;
            int i9 = i8 - 1;
            iArr[i9] = iArr[i9] + 1;
        }
    }

    @Override // D3.a
    public String nextString() throws d {
        D3.b bVarPeek = peek();
        D3.b bVar = D3.b.STRING;
        if (bVarPeek == bVar || bVarPeek == D3.b.NUMBER) {
            String asString = ((o) x()).getAsString();
            int i8 = this.f26014q;
            if (i8 > 0) {
                int[] iArr = this.f26016s;
                int i9 = i8 - 1;
                iArr[i9] = iArr[i9] + 1;
            }
            return asString;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + bVarPeek + g());
    }

    @Override // D3.a
    public D3.b peek() throws d {
        if (this.f26014q == 0) {
            return D3.b.END_DOCUMENT;
        }
        Object objW = w();
        if (objW instanceof Iterator) {
            boolean z8 = this.f26013p[this.f26014q - 2] instanceof l;
            Iterator it = (Iterator) objW;
            if (!it.hasNext()) {
                return z8 ? D3.b.END_OBJECT : D3.b.END_ARRAY;
            }
            if (z8) {
                return D3.b.NAME;
            }
            y(it.next());
            return peek();
        }
        if (objW instanceof l) {
            return D3.b.BEGIN_OBJECT;
        }
        if (objW instanceof f) {
            return D3.b.BEGIN_ARRAY;
        }
        if (objW instanceof o) {
            o oVar = (o) objW;
            if (oVar.isString()) {
                return D3.b.STRING;
            }
            if (oVar.isBoolean()) {
                return D3.b.BOOLEAN;
            }
            if (oVar.isNumber()) {
                return D3.b.NUMBER;
            }
            throw new AssertionError();
        }
        if (objW instanceof k) {
            return D3.b.NULL;
        }
        if (objW == f26012u) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw new d("Custom JsonElement subclass " + objW.getClass().getName() + " is not supported");
    }

    public void promoteNameToValue() {
        t(D3.b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) w()).next();
        y(entry.getValue());
        y(new o((String) entry.getKey()));
    }

    @Override // D3.a
    public void skipValue() throws d {
        int i8 = C0212b.f26017a[peek().ordinal()];
        if (i8 == 1) {
            v(true);
            return;
        }
        if (i8 == 2) {
            endArray();
            return;
        }
        if (i8 == 3) {
            endObject();
            return;
        }
        if (i8 != 4) {
            x();
            int i9 = this.f26014q;
            if (i9 > 0) {
                int[] iArr = this.f26016s;
                int i10 = i9 - 1;
                iArr[i10] = iArr[i10] + 1;
            }
        }
    }

    @Override // D3.a
    public String toString() {
        return b.class.getSimpleName() + g();
    }

    i u() throws d {
        D3.b bVarPeek = peek();
        if (bVarPeek != D3.b.NAME && bVarPeek != D3.b.END_ARRAY && bVarPeek != D3.b.END_OBJECT && bVarPeek != D3.b.END_DOCUMENT) {
            i iVar = (i) w();
            skipValue();
            return iVar;
        }
        throw new IllegalStateException("Unexpected " + bVarPeek + " when reading a JsonElement.");
    }
}
