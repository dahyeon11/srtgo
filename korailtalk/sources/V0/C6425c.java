package v0;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import z0.InterfaceC6612d;
import z0.InterfaceC6613e;

/* renamed from: v0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6425c implements InterfaceC6613e, InterfaceC6612d {

    /* renamed from: i, reason: collision with root package name */
    static final TreeMap f37200i = new TreeMap();

    /* renamed from: a, reason: collision with root package name */
    private volatile String f37201a;

    /* renamed from: b, reason: collision with root package name */
    final long[] f37202b;

    /* renamed from: c, reason: collision with root package name */
    final double[] f37203c;

    /* renamed from: d, reason: collision with root package name */
    final String[] f37204d;

    /* renamed from: e, reason: collision with root package name */
    final byte[][] f37205e;

    /* renamed from: f, reason: collision with root package name */
    private final int[] f37206f;

    /* renamed from: g, reason: collision with root package name */
    final int f37207g;

    /* renamed from: h, reason: collision with root package name */
    int f37208h;

    private C6425c(int i8) {
        this.f37207g = i8;
        int i9 = i8 + 1;
        this.f37206f = new int[i9];
        this.f37202b = new long[i9];
        this.f37203c = new double[i9];
        this.f37204d = new String[i9];
        this.f37205e = new byte[i9][];
    }

    public static C6425c acquire(String str, int i8) {
        TreeMap treeMap = f37200i;
        synchronized (treeMap) {
            try {
                Map.Entry entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i8));
                if (entryCeilingEntry == null) {
                    C6425c c6425c = new C6425c(i8);
                    c6425c.a(str, i8);
                    return c6425c;
                }
                treeMap.remove(entryCeilingEntry.getKey());
                C6425c c6425c2 = (C6425c) entryCeilingEntry.getValue();
                c6425c2.a(str, i8);
                return c6425c2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void b() {
        TreeMap treeMap = f37200i;
        if (treeMap.size() <= 15) {
            return;
        }
        int size = treeMap.size() - 10;
        Iterator it = treeMap.descendingKeySet().iterator();
        while (true) {
            int i8 = size - 1;
            if (size <= 0) {
                return;
            }
            it.next();
            it.remove();
            size = i8;
        }
    }

    public static C6425c copyFrom(InterfaceC6613e interfaceC6613e) {
        C6425c c6425cAcquire = acquire(interfaceC6613e.getSql(), interfaceC6613e.getArgCount());
        interfaceC6613e.bindTo(c6425cAcquire.new a());
        return c6425cAcquire;
    }

    void a(String str, int i8) {
        this.f37201a = str;
        this.f37208h = i8;
    }

    @Override // z0.InterfaceC6612d
    public void bindBlob(int i8, byte[] bArr) {
        this.f37206f[i8] = 5;
        this.f37205e[i8] = bArr;
    }

    @Override // z0.InterfaceC6612d
    public void bindDouble(int i8, double d9) {
        this.f37206f[i8] = 3;
        this.f37203c[i8] = d9;
    }

    @Override // z0.InterfaceC6612d
    public void bindLong(int i8, long j8) {
        this.f37206f[i8] = 2;
        this.f37202b[i8] = j8;
    }

    @Override // z0.InterfaceC6612d
    public void bindNull(int i8) {
        this.f37206f[i8] = 1;
    }

    @Override // z0.InterfaceC6612d
    public void bindString(int i8, String str) {
        this.f37206f[i8] = 4;
        this.f37204d[i8] = str;
    }

    @Override // z0.InterfaceC6613e
    public void bindTo(InterfaceC6612d interfaceC6612d) {
        for (int i8 = 1; i8 <= this.f37208h; i8++) {
            int i9 = this.f37206f[i8];
            if (i9 == 1) {
                interfaceC6612d.bindNull(i8);
            } else if (i9 == 2) {
                interfaceC6612d.bindLong(i8, this.f37202b[i8]);
            } else if (i9 == 3) {
                interfaceC6612d.bindDouble(i8, this.f37203c[i8]);
            } else if (i9 == 4) {
                interfaceC6612d.bindString(i8, this.f37204d[i8]);
            } else if (i9 == 5) {
                interfaceC6612d.bindBlob(i8, this.f37205e[i8]);
            }
        }
    }

    @Override // z0.InterfaceC6612d
    public void clearBindings() {
        Arrays.fill(this.f37206f, 1);
        Arrays.fill(this.f37204d, (Object) null);
        Arrays.fill(this.f37205e, (Object) null);
        this.f37201a = null;
    }

    public void copyArgumentsFrom(C6425c c6425c) {
        int argCount = c6425c.getArgCount() + 1;
        System.arraycopy(c6425c.f37206f, 0, this.f37206f, 0, argCount);
        System.arraycopy(c6425c.f37202b, 0, this.f37202b, 0, argCount);
        System.arraycopy(c6425c.f37204d, 0, this.f37204d, 0, argCount);
        System.arraycopy(c6425c.f37205e, 0, this.f37205e, 0, argCount);
        System.arraycopy(c6425c.f37203c, 0, this.f37203c, 0, argCount);
    }

    @Override // z0.InterfaceC6613e
    public int getArgCount() {
        return this.f37208h;
    }

    @Override // z0.InterfaceC6613e
    public String getSql() {
        return this.f37201a;
    }

    public void release() {
        TreeMap treeMap = f37200i;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f37207g), this);
            b();
        }
    }

    /* renamed from: v0.c$a */
    static class a implements InterfaceC6612d {
        a() {
        }

        @Override // z0.InterfaceC6612d
        public void bindBlob(int i8, byte[] bArr) {
            C6425c.this.bindBlob(i8, bArr);
        }

        @Override // z0.InterfaceC6612d
        public void bindDouble(int i8, double d9) {
            C6425c.this.bindDouble(i8, d9);
        }

        @Override // z0.InterfaceC6612d
        public void bindLong(int i8, long j8) {
            C6425c.this.bindLong(i8, j8);
        }

        @Override // z0.InterfaceC6612d
        public void bindNull(int i8) {
            C6425c.this.bindNull(i8);
        }

        @Override // z0.InterfaceC6612d
        public void bindString(int i8, String str) {
            C6425c.this.bindString(i8, str);
        }

        @Override // z0.InterfaceC6612d
        public void clearBindings() {
            C6425c.this.clearBindings();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
