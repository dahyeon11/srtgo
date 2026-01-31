package O;

import com.j256.ormlite.stmt.query.SimpleComparison;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashMap f3364a;

    /* renamed from: b, reason: collision with root package name */
    private int f3365b;

    /* renamed from: c, reason: collision with root package name */
    private int f3366c;

    /* renamed from: d, reason: collision with root package name */
    private int f3367d;

    /* renamed from: e, reason: collision with root package name */
    private int f3368e;

    /* renamed from: f, reason: collision with root package name */
    private int f3369f;

    /* renamed from: g, reason: collision with root package name */
    private int f3370g;

    /* renamed from: h, reason: collision with root package name */
    private int f3371h;

    public f(int i8) {
        if (i8 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f3366c = i8;
        this.f3364a = new LinkedHashMap(0, 0.75f, true);
    }

    private int c(Object obj, Object obj2) {
        int iD = d(obj, obj2);
        if (iD >= 0) {
            return iD;
        }
        throw new IllegalStateException("Negative size: " + obj + SimpleComparison.EQUAL_TO_OPERATION + obj2);
    }

    protected Object a(Object obj) {
        return null;
    }

    public final synchronized int createCount() {
        return this.f3368e;
    }

    protected int d(Object obj, Object obj2) {
        return 1;
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final synchronized int evictionCount() {
        return this.f3369f;
    }

    public final Object get(Object obj) {
        Object objPut;
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                Object obj2 = this.f3364a.get(obj);
                if (obj2 != null) {
                    this.f3370g++;
                    return obj2;
                }
                this.f3371h++;
                Object objA = a(obj);
                if (objA == null) {
                    return null;
                }
                synchronized (this) {
                    try {
                        this.f3368e++;
                        objPut = this.f3364a.put(obj, objA);
                        if (objPut != null) {
                            this.f3364a.put(obj, objPut);
                        } else {
                            this.f3365b += c(obj, objA);
                        }
                    } finally {
                    }
                }
                if (objPut != null) {
                    b(false, obj, objA, objPut);
                    return objPut;
                }
                trimToSize(this.f3366c);
                return objA;
            } finally {
            }
        }
    }

    public final synchronized int hitCount() {
        return this.f3370g;
    }

    public final synchronized int maxSize() {
        return this.f3366c;
    }

    public final synchronized int missCount() {
        return this.f3371h;
    }

    public final Object put(Object obj, Object obj2) {
        Object objPut;
        if (obj == null || obj2 == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            try {
                this.f3367d++;
                this.f3365b += c(obj, obj2);
                objPut = this.f3364a.put(obj, obj2);
                if (objPut != null) {
                    this.f3365b -= c(obj, objPut);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (objPut != null) {
            b(false, obj, objPut, obj2);
        }
        trimToSize(this.f3366c);
        return objPut;
    }

    public final synchronized int putCount() {
        return this.f3367d;
    }

    public final Object remove(Object obj) {
        Object objRemove;
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                objRemove = this.f3364a.remove(obj);
                if (objRemove != null) {
                    this.f3365b -= c(obj, objRemove);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (objRemove != null) {
            b(false, obj, objRemove, null);
        }
        return objRemove;
    }

    public void resize(int i8) {
        if (i8 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        synchronized (this) {
            this.f3366c = i8;
        }
        trimToSize(i8);
    }

    public final synchronized int size() {
        return this.f3365b;
    }

    public final synchronized Map<Object, Object> snapshot() {
        return new LinkedHashMap(this.f3364a);
    }

    public final synchronized String toString() {
        int i8;
        int i9;
        try {
            i8 = this.f3370g;
            i9 = this.f3371h + i8;
        } catch (Throwable th) {
            throw th;
        }
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f3366c), Integer.valueOf(this.f3370g), Integer.valueOf(this.f3371h), Integer.valueOf(i9 != 0 ? (i8 * 100) / i9 : 0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void trimToSize(int r5) {
        /*
            r4 = this;
        L0:
            monitor-enter(r4)
            int r0 = r4.f3365b     // Catch: java.lang.Throwable -> L12
            if (r0 < 0) goto L55
            java.util.LinkedHashMap r0 = r4.f3364a     // Catch: java.lang.Throwable -> L12
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L14
            int r0 = r4.f3365b     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L55
            goto L14
        L12:
            r5 = move-exception
            goto L74
        L14:
            int r0 = r4.f3365b     // Catch: java.lang.Throwable -> L12
            if (r0 <= r5) goto L53
            java.util.LinkedHashMap r0 = r4.f3364a     // Catch: java.lang.Throwable -> L12
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L21
            goto L53
        L21:
            java.util.LinkedHashMap r0 = r4.f3364a     // Catch: java.lang.Throwable -> L12
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L12
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L12
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L12
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L12
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L12
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L12
            java.util.LinkedHashMap r2 = r4.f3364a     // Catch: java.lang.Throwable -> L12
            r2.remove(r1)     // Catch: java.lang.Throwable -> L12
            int r2 = r4.f3365b     // Catch: java.lang.Throwable -> L12
            int r3 = r4.c(r1, r0)     // Catch: java.lang.Throwable -> L12
            int r2 = r2 - r3
            r4.f3365b = r2     // Catch: java.lang.Throwable -> L12
            int r2 = r4.f3369f     // Catch: java.lang.Throwable -> L12
            r3 = 1
            int r2 = r2 + r3
            r4.f3369f = r2     // Catch: java.lang.Throwable -> L12
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L12
            r2 = 0
            r4.b(r3, r1, r0, r2)
            goto L0
        L53:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L12
            return
        L55:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L12
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L12
            r0.<init>()     // Catch: java.lang.Throwable -> L12
            java.lang.Class r1 = r4.getClass()     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L12
            r0.append(r1)     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L12
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L12
            throw r5     // Catch: java.lang.Throwable -> L12
        L74:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L12
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: O.f.trimToSize(int):void");
    }

    protected void b(boolean z8, Object obj, Object obj2, Object obj3) {
    }
}
