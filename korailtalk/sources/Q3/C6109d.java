package q3;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import o3.C6035c;
import o3.InterfaceC6036d;
import o3.InterfaceC6037e;
import o3.f;
import o3.g;

/* renamed from: q3.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C6109d implements InterfaceC6037e, g {

    /* renamed from: a, reason: collision with root package name */
    private C6109d f34929a = null;

    /* renamed from: b, reason: collision with root package name */
    private boolean f34930b = true;

    /* renamed from: c, reason: collision with root package name */
    private final JsonWriter f34931c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f34932d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f34933e;

    C6109d(Writer writer, Map map, Map map2) {
        this.f34931c = new JsonWriter(writer);
        this.f34932d = map;
        this.f34933e = map2;
    }

    private void c() throws IOException {
        if (!this.f34930b) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
        C6109d c6109d = this.f34929a;
        if (c6109d != null) {
            c6109d.c();
            this.f34929a.f34930b = false;
            this.f34929a = null;
            this.f34931c.endObject();
        }
    }

    C6109d a(Object obj) {
        if (obj == null) {
            this.f34931c.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            this.f34931c.value((Number) obj);
            return this;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                this.f34931c.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    a(it.next());
                }
                this.f34931c.endArray();
                return this;
            }
            if (obj instanceof Map) {
                this.f34931c.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        add((String) key, entry.getValue());
                    } catch (ClassCastException e8) {
                        throw new C6035c(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e8);
                    }
                }
                this.f34931c.endObject();
                return this;
            }
            InterfaceC6036d interfaceC6036d = (InterfaceC6036d) this.f34932d.get(obj.getClass());
            if (interfaceC6036d != null) {
                this.f34931c.beginObject();
                interfaceC6036d.encode(obj, this);
                this.f34931c.endObject();
                return this;
            }
            f fVar = (f) this.f34933e.get(obj.getClass());
            if (fVar != null) {
                fVar.encode(obj, this);
                return this;
            }
            if (obj instanceof Enum) {
                add(((Enum) obj).name());
                return this;
            }
            throw new C6035c("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
        if (obj instanceof byte[]) {
            return add((byte[]) obj);
        }
        this.f34931c.beginArray();
        int i8 = 0;
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i8 < length) {
                this.f34931c.value(r7[i8]);
                i8++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i8 < length2) {
                add(jArr[i8]);
                i8++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i8 < length3) {
                this.f34931c.value(dArr[i8]);
                i8++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i8 < length4) {
                this.f34931c.value(zArr[i8]);
                i8++;
            }
        } else if (obj instanceof Number[]) {
            Number[] numberArr = (Number[]) obj;
            int length5 = numberArr.length;
            while (i8 < length5) {
                a(numberArr[i8]);
                i8++;
            }
        } else {
            Object[] objArr = (Object[]) obj;
            int length6 = objArr.length;
            while (i8 < length6) {
                a(objArr[i8]);
                i8++;
            }
        }
        this.f34931c.endArray();
        return this;
    }

    void b() {
        c();
        this.f34931c.flush();
    }

    @Override // o3.InterfaceC6037e
    public InterfaceC6037e nested(String str) throws IOException {
        c();
        this.f34929a = new C6109d(this);
        this.f34931c.name(str);
        this.f34931c.beginObject();
        return this.f34929a;
    }

    private C6109d(C6109d c6109d) {
        this.f34931c = c6109d.f34931c;
        this.f34932d = c6109d.f34932d;
        this.f34933e = c6109d.f34933e;
    }

    @Override // o3.InterfaceC6037e
    public C6109d add(String str, Object obj) throws IOException {
        c();
        this.f34931c.name(str);
        if (obj == null) {
            this.f34931c.nullValue();
            return this;
        }
        return a(obj);
    }

    @Override // o3.InterfaceC6037e
    public C6109d add(String str, double d9) throws IOException {
        c();
        this.f34931c.name(str);
        return add(d9);
    }

    @Override // o3.InterfaceC6037e
    public C6109d add(String str, int i8) throws IOException {
        c();
        this.f34931c.name(str);
        return add(i8);
    }

    @Override // o3.InterfaceC6037e
    public C6109d add(String str, long j8) throws IOException {
        c();
        this.f34931c.name(str);
        return add(j8);
    }

    @Override // o3.InterfaceC6037e
    public C6109d add(String str, boolean z8) throws IOException {
        c();
        this.f34931c.name(str);
        return add(z8);
    }

    @Override // o3.g
    public C6109d add(String str) throws IOException {
        c();
        this.f34931c.value(str);
        return this;
    }

    @Override // o3.g
    public C6109d add(double d9) throws IOException {
        c();
        this.f34931c.value(d9);
        return this;
    }

    @Override // o3.g
    public C6109d add(int i8) throws IOException {
        c();
        this.f34931c.value(i8);
        return this;
    }

    @Override // o3.g
    public C6109d add(long j8) throws IOException {
        c();
        this.f34931c.value(j8);
        return this;
    }

    @Override // o3.g
    public C6109d add(boolean z8) throws IOException {
        c();
        this.f34931c.value(z8);
        return this;
    }

    @Override // o3.g
    public C6109d add(byte[] bArr) throws IOException {
        c();
        if (bArr == null) {
            this.f34931c.nullValue();
        } else {
            this.f34931c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }
}
