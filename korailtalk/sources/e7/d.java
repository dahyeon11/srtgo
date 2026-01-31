package E7;

import K7.j;
import P7.n;
import P7.v;
import P7.w;
import Q7.C;
import Q7.X;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class d implements Closeable, Flushable {

    /* renamed from: u, reason: collision with root package name */
    static final Pattern f1073u = Pattern.compile("[a-z0-9_-]{1,120}");

    /* renamed from: a, reason: collision with root package name */
    final J7.a f1074a;

    /* renamed from: b, reason: collision with root package name */
    final File f1075b;

    /* renamed from: c, reason: collision with root package name */
    private final File f1076c;

    /* renamed from: d, reason: collision with root package name */
    private final File f1077d;

    /* renamed from: e, reason: collision with root package name */
    private final File f1078e;

    /* renamed from: f, reason: collision with root package name */
    private final int f1079f;

    /* renamed from: g, reason: collision with root package name */
    private long f1080g;

    /* renamed from: h, reason: collision with root package name */
    final int f1081h;

    /* renamed from: j, reason: collision with root package name */
    P7.d f1083j;

    /* renamed from: l, reason: collision with root package name */
    int f1085l;

    /* renamed from: m, reason: collision with root package name */
    boolean f1086m;

    /* renamed from: n, reason: collision with root package name */
    boolean f1087n;

    /* renamed from: o, reason: collision with root package name */
    boolean f1088o;

    /* renamed from: p, reason: collision with root package name */
    boolean f1089p;

    /* renamed from: q, reason: collision with root package name */
    boolean f1090q;

    /* renamed from: s, reason: collision with root package name */
    private final Executor f1092s;

    /* renamed from: i, reason: collision with root package name */
    private long f1082i = 0;

    /* renamed from: k, reason: collision with root package name */
    final LinkedHashMap f1084k = new LinkedHashMap(0, 0.75f, true);

    /* renamed from: r, reason: collision with root package name */
    private long f1091r = 0;

    /* renamed from: t, reason: collision with root package name */
    private final Runnable f1093t = new a();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (d.this) {
                d dVar = d.this;
                if ((!dVar.f1087n) || dVar.f1088o) {
                    return;
                }
                try {
                    dVar.l();
                } catch (IOException unused) {
                    d.this.f1089p = true;
                }
                try {
                    if (d.this.e()) {
                        d.this.j();
                        d.this.f1085l = 0;
                    }
                } catch (IOException unused2) {
                    d dVar2 = d.this;
                    dVar2.f1090q = true;
                    dVar2.f1083j = n.buffer(n.blackhole());
                }
            }
        }
    }

    class b extends E7.e {
        b(v vVar) {
            super(vVar);
        }

        @Override // E7.e
        protected void a(IOException iOException) {
            d.this.f1086m = true;
        }
    }

    class c implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        final Iterator f1096a;

        /* renamed from: b, reason: collision with root package name */
        f f1097b;

        /* renamed from: c, reason: collision with root package name */
        f f1098c;

        c() {
            this.f1096a = new ArrayList(d.this.f1084k.values()).iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            f fVarC;
            if (this.f1097b != null) {
                return true;
            }
            synchronized (d.this) {
                try {
                    if (d.this.f1088o) {
                        return false;
                    }
                    while (this.f1096a.hasNext()) {
                        e eVar = (e) this.f1096a.next();
                        if (eVar.f1109e && (fVarC = eVar.c()) != null) {
                            this.f1097b = fVarC;
                            return true;
                        }
                    }
                    return false;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.util.Iterator
        public void remove() {
            f fVar = this.f1098c;
            if (fVar == null) {
                throw new IllegalStateException("remove() before next()");
            }
            try {
                d.this.remove(fVar.f1113a);
            } catch (IOException unused) {
            } catch (Throwable th) {
                this.f1098c = null;
                throw th;
            }
            this.f1098c = null;
        }

        @Override // java.util.Iterator
        public f next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            f fVar = this.f1097b;
            this.f1098c = fVar;
            this.f1097b = null;
            return fVar;
        }
    }

    /* renamed from: E7.d$d, reason: collision with other inner class name */
    public final class C0027d {

        /* renamed from: a, reason: collision with root package name */
        final e f1100a;

        /* renamed from: b, reason: collision with root package name */
        final boolean[] f1101b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f1102c;

        /* renamed from: E7.d$d$a */
        class a extends E7.e {
            a(v vVar) {
                super(vVar);
            }

            @Override // E7.e
            protected void a(IOException iOException) {
                synchronized (d.this) {
                    C0027d.this.a();
                }
            }
        }

        C0027d(e eVar) {
            this.f1100a = eVar;
            this.f1101b = eVar.f1109e ? null : new boolean[d.this.f1081h];
        }

        void a() {
            if (this.f1100a.f1110f != this) {
                return;
            }
            int i8 = 0;
            while (true) {
                d dVar = d.this;
                if (i8 >= dVar.f1081h) {
                    this.f1100a.f1110f = null;
                    return;
                } else {
                    try {
                        dVar.f1074a.delete(this.f1100a.f1108d[i8]);
                    } catch (IOException unused) {
                    }
                    i8++;
                }
            }
        }

        public void abort() {
            synchronized (d.this) {
                try {
                    if (this.f1102c) {
                        throw new IllegalStateException();
                    }
                    if (this.f1100a.f1110f == this) {
                        d.this.c(this, false);
                    }
                    this.f1102c = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void abortUnlessCommitted() {
            synchronized (d.this) {
                if (!this.f1102c && this.f1100a.f1110f == this) {
                    try {
                        d.this.c(this, false);
                    } catch (IOException unused) {
                    }
                }
            }
        }

        public void commit() {
            synchronized (d.this) {
                try {
                    if (this.f1102c) {
                        throw new IllegalStateException();
                    }
                    if (this.f1100a.f1110f == this) {
                        d.this.c(this, true);
                    }
                    this.f1102c = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public v newSink(int i8) {
            synchronized (d.this) {
                try {
                    if (this.f1102c) {
                        throw new IllegalStateException();
                    }
                    e eVar = this.f1100a;
                    if (eVar.f1110f != this) {
                        return n.blackhole();
                    }
                    if (!eVar.f1109e) {
                        this.f1101b[i8] = true;
                    }
                    try {
                        return new a(d.this.f1074a.sink(eVar.f1108d[i8]));
                    } catch (FileNotFoundException unused) {
                        return n.blackhole();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public w newSource(int i8) {
            synchronized (d.this) {
                try {
                    if (this.f1102c) {
                        throw new IllegalStateException();
                    }
                    e eVar = this.f1100a;
                    if (!eVar.f1109e || eVar.f1110f != this) {
                        return null;
                    }
                    try {
                        return d.this.f1074a.source(eVar.f1107c[i8]);
                    } catch (FileNotFoundException unused) {
                        return null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private final class e {

        /* renamed from: a, reason: collision with root package name */
        final String f1105a;

        /* renamed from: b, reason: collision with root package name */
        final long[] f1106b;

        /* renamed from: c, reason: collision with root package name */
        final File[] f1107c;

        /* renamed from: d, reason: collision with root package name */
        final File[] f1108d;

        /* renamed from: e, reason: collision with root package name */
        boolean f1109e;

        /* renamed from: f, reason: collision with root package name */
        C0027d f1110f;

        /* renamed from: g, reason: collision with root package name */
        long f1111g;

        e(String str) {
            this.f1105a = str;
            int i8 = d.this.f1081h;
            this.f1106b = new long[i8];
            this.f1107c = new File[i8];
            this.f1108d = new File[i8];
            StringBuilder sb = new StringBuilder(str);
            sb.append(C.PACKAGE_SEPARATOR_CHAR);
            int length = sb.length();
            for (int i9 = 0; i9 < d.this.f1081h; i9++) {
                sb.append(i9);
                this.f1107c[i9] = new File(d.this.f1075b, sb.toString());
                sb.append(".tmp");
                this.f1108d[i9] = new File(d.this.f1075b, sb.toString());
                sb.setLength(length);
            }
        }

        private IOException a(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        void b(String[] strArr) throws IOException {
            if (strArr.length != d.this.f1081h) {
                throw a(strArr);
            }
            for (int i8 = 0; i8 < strArr.length; i8++) {
                try {
                    this.f1106b[i8] = Long.parseLong(strArr[i8]);
                } catch (NumberFormatException unused) {
                    throw a(strArr);
                }
            }
        }

        f c() throws IOException {
            w wVar;
            if (!Thread.holdsLock(d.this)) {
                throw new AssertionError();
            }
            w[] wVarArr = new w[d.this.f1081h];
            long[] jArr = (long[]) this.f1106b.clone();
            int i8 = 0;
            int i9 = 0;
            while (true) {
                try {
                    d dVar = d.this;
                    if (i9 >= dVar.f1081h) {
                        return dVar.new f(this.f1105a, this.f1111g, wVarArr, jArr);
                    }
                    wVarArr[i9] = dVar.f1074a.source(this.f1107c[i9]);
                    i9++;
                } catch (FileNotFoundException unused) {
                    while (true) {
                        d dVar2 = d.this;
                        if (i8 >= dVar2.f1081h || (wVar = wVarArr[i8]) == null) {
                            try {
                                dVar2.k(this);
                                return null;
                            } catch (IOException unused2) {
                                return null;
                            }
                        }
                        D7.e.closeQuietly(wVar);
                        i8++;
                    }
                }
            }
        }

        void d(P7.d dVar) {
            for (long j8 : this.f1106b) {
                dVar.writeByte(32).writeDecimalLong(j8);
            }
        }
    }

    public final class f implements Closeable {

        /* renamed from: a, reason: collision with root package name */
        private final String f1113a;

        /* renamed from: b, reason: collision with root package name */
        private final long f1114b;

        /* renamed from: c, reason: collision with root package name */
        private final w[] f1115c;

        /* renamed from: d, reason: collision with root package name */
        private final long[] f1116d;

        f(String str, long j8, w[] wVarArr, long[] jArr) {
            this.f1113a = str;
            this.f1114b = j8;
            this.f1115c = wVarArr;
            this.f1116d = jArr;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            for (w wVar : this.f1115c) {
                D7.e.closeQuietly(wVar);
            }
        }

        public C0027d edit() {
            return d.this.d(this.f1113a, this.f1114b);
        }

        public long getLength(int i8) {
            return this.f1116d[i8];
        }

        public w getSource(int i8) {
            return this.f1115c[i8];
        }

        public String key() {
            return this.f1113a;
        }
    }

    d(J7.a aVar, File file, int i8, int i9, long j8, Executor executor) {
        this.f1074a = aVar;
        this.f1075b = file;
        this.f1079f = i8;
        this.f1076c = new File(file, "journal");
        this.f1077d = new File(file, "journal.tmp");
        this.f1078e = new File(file, "journal.bkp");
        this.f1081h = i9;
        this.f1080g = j8;
        this.f1092s = executor;
    }

    private static /* synthetic */ void a(Throwable th, AutoCloseable autoCloseable) throws Exception {
        if (th == null) {
            autoCloseable.close();
            return;
        }
        try {
            autoCloseable.close();
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    private synchronized void b() {
        if (isClosed()) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public static d create(J7.a aVar, File file, int i8, int i9, long j8) {
        if (j8 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i9 > 0) {
            return new d(aVar, file, i8, i9, j8, new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), D7.e.threadFactory("OkHttp DiskLruCache", true)));
        }
        throw new IllegalArgumentException("valueCount <= 0");
    }

    private P7.d f() {
        return n.buffer(new b(this.f1074a.appendingSink(this.f1076c)));
    }

    private void g() {
        this.f1074a.delete(this.f1077d);
        Iterator it = this.f1084k.values().iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            int i8 = 0;
            if (eVar.f1110f == null) {
                while (i8 < this.f1081h) {
                    this.f1082i += eVar.f1106b[i8];
                    i8++;
                }
            } else {
                eVar.f1110f = null;
                while (i8 < this.f1081h) {
                    this.f1074a.delete(eVar.f1107c[i8]);
                    this.f1074a.delete(eVar.f1108d[i8]);
                    i8++;
                }
                it.remove();
            }
        }
    }

    private void h() throws Exception {
        P7.e eVarBuffer = n.buffer(this.f1074a.source(this.f1076c));
        try {
            String utf8LineStrict = eVarBuffer.readUtf8LineStrict();
            String utf8LineStrict2 = eVarBuffer.readUtf8LineStrict();
            String utf8LineStrict3 = eVarBuffer.readUtf8LineStrict();
            String utf8LineStrict4 = eVarBuffer.readUtf8LineStrict();
            String utf8LineStrict5 = eVarBuffer.readUtf8LineStrict();
            if (!"libcore.io.DiskLruCache".equals(utf8LineStrict) || !"1".equals(utf8LineStrict2) || !Integer.toString(this.f1079f).equals(utf8LineStrict3) || !Integer.toString(this.f1081h).equals(utf8LineStrict4) || !"".equals(utf8LineStrict5)) {
                throw new IOException("unexpected journal header: [" + utf8LineStrict + ", " + utf8LineStrict2 + ", " + utf8LineStrict4 + ", " + utf8LineStrict5 + "]");
            }
            int i8 = 0;
            while (true) {
                try {
                    i(eVarBuffer.readUtf8LineStrict());
                    i8++;
                } catch (EOFException unused) {
                    this.f1085l = i8 - this.f1084k.size();
                    if (eVarBuffer.exhausted()) {
                        this.f1083j = f();
                    } else {
                        j();
                    }
                    a(null, eVarBuffer);
                    return;
                }
            }
        } finally {
        }
    }

    private void i(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i8 = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i8);
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i8);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                this.f1084k.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i8, iIndexOf2);
        }
        e eVar = (e) this.f1084k.get(strSubstring);
        if (eVar == null) {
            eVar = new e(strSubstring);
            this.f1084k.put(strSubstring, eVar);
        }
        if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith("CLEAN")) {
            String[] strArrSplit = str.substring(iIndexOf2 + 1).split(X.SPACE);
            eVar.f1109e = true;
            eVar.f1110f = null;
            eVar.b(strArrSplit);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
            eVar.f1110f = new C0027d(eVar);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 4 && str.startsWith("READ")) {
            return;
        }
        throw new IOException("unexpected journal line: " + str);
    }

    private void m(String str) {
        if (f1073u.matcher(str).matches()) {
            return;
        }
        throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
    }

    synchronized void c(C0027d c0027d, boolean z8) {
        e eVar = c0027d.f1100a;
        if (eVar.f1110f != c0027d) {
            throw new IllegalStateException();
        }
        if (z8 && !eVar.f1109e) {
            for (int i8 = 0; i8 < this.f1081h; i8++) {
                if (!c0027d.f1101b[i8]) {
                    c0027d.abort();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i8);
                }
                if (!this.f1074a.exists(eVar.f1108d[i8])) {
                    c0027d.abort();
                    return;
                }
            }
        }
        for (int i9 = 0; i9 < this.f1081h; i9++) {
            File file = eVar.f1108d[i9];
            if (!z8) {
                this.f1074a.delete(file);
            } else if (this.f1074a.exists(file)) {
                File file2 = eVar.f1107c[i9];
                this.f1074a.rename(file, file2);
                long j8 = eVar.f1106b[i9];
                long size = this.f1074a.size(file2);
                eVar.f1106b[i9] = size;
                this.f1082i = (this.f1082i - j8) + size;
            }
        }
        this.f1085l++;
        eVar.f1110f = null;
        if (eVar.f1109e || z8) {
            eVar.f1109e = true;
            this.f1083j.writeUtf8("CLEAN").writeByte(32);
            this.f1083j.writeUtf8(eVar.f1105a);
            eVar.d(this.f1083j);
            this.f1083j.writeByte(10);
            if (z8) {
                long j9 = this.f1091r;
                this.f1091r = 1 + j9;
                eVar.f1111g = j9;
            }
        } else {
            this.f1084k.remove(eVar.f1105a);
            this.f1083j.writeUtf8("REMOVE").writeByte(32);
            this.f1083j.writeUtf8(eVar.f1105a);
            this.f1083j.writeByte(10);
        }
        this.f1083j.flush();
        if (this.f1082i > this.f1080g || e()) {
            this.f1092s.execute(this.f1093t);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            if (this.f1087n && !this.f1088o) {
                for (e eVar : (e[]) this.f1084k.values().toArray(new e[this.f1084k.size()])) {
                    C0027d c0027d = eVar.f1110f;
                    if (c0027d != null) {
                        c0027d.abort();
                    }
                }
                l();
                this.f1083j.close();
                this.f1083j = null;
                this.f1088o = true;
                return;
            }
            this.f1088o = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    synchronized C0027d d(String str, long j8) {
        initialize();
        b();
        m(str);
        e eVar = (e) this.f1084k.get(str);
        if (j8 != -1 && (eVar == null || eVar.f1111g != j8)) {
            return null;
        }
        if (eVar != null && eVar.f1110f != null) {
            return null;
        }
        if (!this.f1089p && !this.f1090q) {
            this.f1083j.writeUtf8("DIRTY").writeByte(32).writeUtf8(str).writeByte(10);
            this.f1083j.flush();
            if (this.f1086m) {
                return null;
            }
            if (eVar == null) {
                eVar = new e(str);
                this.f1084k.put(str, eVar);
            }
            C0027d c0027d = new C0027d(eVar);
            eVar.f1110f = c0027d;
            return c0027d;
        }
        this.f1092s.execute(this.f1093t);
        return null;
    }

    public void delete() {
        close();
        this.f1074a.deleteContents(this.f1075b);
    }

    boolean e() {
        int i8 = this.f1085l;
        return i8 >= 2000 && i8 >= this.f1084k.size();
    }

    public C0027d edit(String str) {
        return d(str, -1L);
    }

    public synchronized void evictAll() {
        try {
            initialize();
            for (e eVar : (e[]) this.f1084k.values().toArray(new e[this.f1084k.size()])) {
                k(eVar);
            }
            this.f1089p = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Flushable
    public synchronized void flush() {
        if (this.f1087n) {
            b();
            l();
            this.f1083j.flush();
        }
    }

    public synchronized f get(String str) {
        initialize();
        b();
        m(str);
        e eVar = (e) this.f1084k.get(str);
        if (eVar != null && eVar.f1109e) {
            f fVarC = eVar.c();
            if (fVarC == null) {
                return null;
            }
            this.f1085l++;
            this.f1083j.writeUtf8("READ").writeByte(32).writeUtf8(str).writeByte(10);
            if (e()) {
                this.f1092s.execute(this.f1093t);
            }
            return fVarC;
        }
        return null;
    }

    public File getDirectory() {
        return this.f1075b;
    }

    public synchronized long getMaxSize() {
        return this.f1080g;
    }

    public synchronized void initialize() {
        try {
            if (this.f1087n) {
                return;
            }
            if (this.f1074a.exists(this.f1078e)) {
                if (this.f1074a.exists(this.f1076c)) {
                    this.f1074a.delete(this.f1078e);
                } else {
                    this.f1074a.rename(this.f1078e, this.f1076c);
                }
            }
            if (this.f1074a.exists(this.f1076c)) {
                try {
                    h();
                    g();
                    this.f1087n = true;
                    return;
                } catch (IOException e8) {
                    j.get().log(5, "DiskLruCache " + this.f1075b + " is corrupt: " + e8.getMessage() + ", removing", e8);
                    try {
                        delete();
                        this.f1088o = false;
                    } catch (Throwable th) {
                        this.f1088o = false;
                        throw th;
                    }
                }
            }
            j();
            this.f1087n = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized boolean isClosed() {
        return this.f1088o;
    }

    synchronized void j() {
        try {
            P7.d dVar = this.f1083j;
            if (dVar != null) {
                dVar.close();
            }
            P7.d dVarBuffer = n.buffer(this.f1074a.sink(this.f1077d));
            try {
                dVarBuffer.writeUtf8("libcore.io.DiskLruCache").writeByte(10);
                dVarBuffer.writeUtf8("1").writeByte(10);
                dVarBuffer.writeDecimalLong(this.f1079f).writeByte(10);
                dVarBuffer.writeDecimalLong(this.f1081h).writeByte(10);
                dVarBuffer.writeByte(10);
                for (e eVar : this.f1084k.values()) {
                    if (eVar.f1110f != null) {
                        dVarBuffer.writeUtf8("DIRTY").writeByte(32);
                        dVarBuffer.writeUtf8(eVar.f1105a);
                        dVarBuffer.writeByte(10);
                    } else {
                        dVarBuffer.writeUtf8("CLEAN").writeByte(32);
                        dVarBuffer.writeUtf8(eVar.f1105a);
                        eVar.d(dVarBuffer);
                        dVarBuffer.writeByte(10);
                    }
                }
                a(null, dVarBuffer);
                if (this.f1074a.exists(this.f1076c)) {
                    this.f1074a.rename(this.f1076c, this.f1078e);
                }
                this.f1074a.rename(this.f1077d, this.f1076c);
                this.f1074a.delete(this.f1078e);
                this.f1083j = f();
                this.f1086m = false;
                this.f1090q = false;
            } finally {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    boolean k(e eVar) {
        C0027d c0027d = eVar.f1110f;
        if (c0027d != null) {
            c0027d.a();
        }
        for (int i8 = 0; i8 < this.f1081h; i8++) {
            this.f1074a.delete(eVar.f1107c[i8]);
            long j8 = this.f1082i;
            long[] jArr = eVar.f1106b;
            this.f1082i = j8 - jArr[i8];
            jArr[i8] = 0;
        }
        this.f1085l++;
        this.f1083j.writeUtf8("REMOVE").writeByte(32).writeUtf8(eVar.f1105a).writeByte(10);
        this.f1084k.remove(eVar.f1105a);
        if (e()) {
            this.f1092s.execute(this.f1093t);
        }
        return true;
    }

    void l() {
        while (this.f1082i > this.f1080g) {
            k((e) this.f1084k.values().iterator().next());
        }
        this.f1089p = false;
    }

    public synchronized boolean remove(String str) {
        initialize();
        b();
        m(str);
        e eVar = (e) this.f1084k.get(str);
        if (eVar == null) {
            return false;
        }
        boolean zK = k(eVar);
        if (zK && this.f1082i <= this.f1080g) {
            this.f1089p = false;
        }
        return zK;
    }

    public synchronized void setMaxSize(long j8) {
        this.f1080g = j8;
        if (this.f1087n) {
            this.f1092s.execute(this.f1093t);
        }
    }

    public synchronized long size() {
        initialize();
        return this.f1082i;
    }

    public synchronized Iterator<f> snapshots() {
        initialize();
        return new c();
    }
}
