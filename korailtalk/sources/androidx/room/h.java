package androidx.room;

import android.app.ActivityManager;
import android.content.Context;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import n.C5921c;
import w0.AbstractC6457a;
import z0.C6609a;
import z0.InterfaceC6610b;
import z0.InterfaceC6611c;
import z0.InterfaceC6613e;
import z0.InterfaceC6614f;

/* loaded from: classes.dex */
public abstract class h {
    public static final int MAX_BIND_PARAMETER_CNT = 999;

    /* renamed from: a, reason: collision with root package name */
    protected volatile InterfaceC6610b f10698a;

    /* renamed from: b, reason: collision with root package name */
    private Executor f10699b;

    /* renamed from: c, reason: collision with root package name */
    private Executor f10700c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC6611c f10701d;

    /* renamed from: f, reason: collision with root package name */
    private boolean f10703f;

    /* renamed from: g, reason: collision with root package name */
    boolean f10704g;

    /* renamed from: h, reason: collision with root package name */
    protected List f10705h;

    /* renamed from: i, reason: collision with root package name */
    private final ReentrantReadWriteLock f10706i = new ReentrantReadWriteLock();

    /* renamed from: j, reason: collision with root package name */
    private final ThreadLocal f10707j = new ThreadLocal();

    /* renamed from: k, reason: collision with root package name */
    private final Map f10708k = new ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    private final e f10702e = a();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final Class f10709a;

        /* renamed from: b, reason: collision with root package name */
        private final String f10710b;

        /* renamed from: c, reason: collision with root package name */
        private final Context f10711c;

        /* renamed from: d, reason: collision with root package name */
        private ArrayList f10712d;

        /* renamed from: e, reason: collision with root package name */
        private Executor f10713e;

        /* renamed from: f, reason: collision with root package name */
        private Executor f10714f;

        /* renamed from: g, reason: collision with root package name */
        private InterfaceC6611c.InterfaceC0437c f10715g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f10716h;

        /* renamed from: j, reason: collision with root package name */
        private boolean f10718j;

        /* renamed from: l, reason: collision with root package name */
        private boolean f10720l;

        /* renamed from: n, reason: collision with root package name */
        private Set f10722n;

        /* renamed from: o, reason: collision with root package name */
        private Set f10723o;

        /* renamed from: p, reason: collision with root package name */
        private String f10724p;

        /* renamed from: q, reason: collision with root package name */
        private File f10725q;

        /* renamed from: i, reason: collision with root package name */
        private c f10717i = c.AUTOMATIC;

        /* renamed from: k, reason: collision with root package name */
        private boolean f10719k = true;

        /* renamed from: m, reason: collision with root package name */
        private final d f10721m = new d();

        a(Context context, Class cls, String str) {
            this.f10711c = context;
            this.f10709a = cls;
            this.f10710b = str;
        }

        public a addCallback(b bVar) {
            if (this.f10712d == null) {
                this.f10712d = new ArrayList();
            }
            this.f10712d.add(bVar);
            return this;
        }

        public a addMigrations(AbstractC6457a... abstractC6457aArr) {
            if (this.f10723o == null) {
                this.f10723o = new HashSet();
            }
            for (AbstractC6457a abstractC6457a : abstractC6457aArr) {
                this.f10723o.add(Integer.valueOf(abstractC6457a.startVersion));
                this.f10723o.add(Integer.valueOf(abstractC6457a.endVersion));
            }
            this.f10721m.addMigrations(abstractC6457aArr);
            return this;
        }

        public a allowMainThreadQueries() {
            this.f10716h = true;
            return this;
        }

        public h build() {
            Executor executor;
            if (this.f10711c == null) {
                throw new IllegalArgumentException("Cannot provide null context for the database.");
            }
            if (this.f10709a == null) {
                throw new IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
            }
            Executor executor2 = this.f10713e;
            if (executor2 == null && this.f10714f == null) {
                Executor iOThreadExecutor = C5921c.getIOThreadExecutor();
                this.f10714f = iOThreadExecutor;
                this.f10713e = iOThreadExecutor;
            } else if (executor2 != null && this.f10714f == null) {
                this.f10714f = executor2;
            } else if (executor2 == null && (executor = this.f10714f) != null) {
                this.f10713e = executor;
            }
            Set<Integer> set = this.f10723o;
            if (set != null && this.f10722n != null) {
                for (Integer num : set) {
                    if (this.f10722n.contains(num)) {
                        throw new IllegalArgumentException("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: " + num);
                    }
                }
            }
            if (this.f10715g == null) {
                this.f10715g = new A0.c();
            }
            String str = this.f10724p;
            if (str != null || this.f10725q != null) {
                if (this.f10710b == null) {
                    throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.");
                }
                if (str != null && this.f10725q != null) {
                    throw new IllegalArgumentException("Both createFromAsset() and createFromFile() was called on this Builder but the database can only be created using one of the two configurations.");
                }
                this.f10715g = new l(str, this.f10725q, this.f10715g);
            }
            Context context = this.f10711c;
            androidx.room.a aVar = new androidx.room.a(context, this.f10710b, this.f10715g, this.f10721m, this.f10712d, this.f10716h, this.f10717i.b(context), this.f10713e, this.f10714f, this.f10718j, this.f10719k, this.f10720l, this.f10722n, this.f10724p, this.f10725q);
            h hVar = (h) g.a(this.f10709a, "_Impl");
            hVar.init(aVar);
            return hVar;
        }

        public a createFromAsset(String str) {
            this.f10724p = str;
            return this;
        }

        public a createFromFile(File file) {
            this.f10725q = file;
            return this;
        }

        public a enableMultiInstanceInvalidation() {
            this.f10718j = this.f10710b != null;
            return this;
        }

        public a fallbackToDestructiveMigration() {
            this.f10719k = false;
            this.f10720l = true;
            return this;
        }

        public a fallbackToDestructiveMigrationFrom(int... iArr) {
            if (this.f10722n == null) {
                this.f10722n = new HashSet(iArr.length);
            }
            for (int i8 : iArr) {
                this.f10722n.add(Integer.valueOf(i8));
            }
            return this;
        }

        public a fallbackToDestructiveMigrationOnDowngrade() {
            this.f10719k = true;
            this.f10720l = true;
            return this;
        }

        public a openHelperFactory(InterfaceC6611c.InterfaceC0437c interfaceC0437c) {
            this.f10715g = interfaceC0437c;
            return this;
        }

        public a setJournalMode(c cVar) {
            this.f10717i = cVar;
            return this;
        }

        public a setQueryExecutor(Executor executor) {
            this.f10713e = executor;
            return this;
        }

        public a setTransactionExecutor(Executor executor) {
            this.f10714f = executor;
            return this;
        }
    }

    public enum c {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        private static boolean a(ActivityManager activityManager) {
            return activityManager.isLowRamDevice();
        }

        c b(Context context) {
            if (this != AUTOMATIC) {
                return this;
            }
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            return (activityManager == null || a(activityManager)) ? TRUNCATE : WRITE_AHEAD_LOGGING;
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        private HashMap f10727a = new HashMap();

        private void a(AbstractC6457a abstractC6457a) {
            int i8 = abstractC6457a.startVersion;
            int i9 = abstractC6457a.endVersion;
            TreeMap treeMap = (TreeMap) this.f10727a.get(Integer.valueOf(i8));
            if (treeMap == null) {
                treeMap = new TreeMap();
                this.f10727a.put(Integer.valueOf(i8), treeMap);
            }
            AbstractC6457a abstractC6457a2 = (AbstractC6457a) treeMap.get(Integer.valueOf(i9));
            if (abstractC6457a2 != null) {
                Log.w("ROOM", "Overriding migration " + abstractC6457a2 + " with " + abstractC6457a);
            }
            treeMap.put(Integer.valueOf(i9), abstractC6457a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x0052, code lost:
        
            return r6;
         */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0016 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private java.util.List b(java.util.List r6, boolean r7, int r8, int r9) {
            /*
                r5 = this;
            L0:
                if (r7 == 0) goto L5
                if (r8 >= r9) goto L52
                goto L7
            L5:
                if (r8 <= r9) goto L52
            L7:
                java.util.HashMap r0 = r5.f10727a
                java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
                java.lang.Object r0 = r0.get(r1)
                java.util.TreeMap r0 = (java.util.TreeMap) r0
                r1 = 0
                if (r0 != 0) goto L17
                return r1
            L17:
                if (r7 == 0) goto L1e
                java.util.NavigableSet r2 = r0.descendingKeySet()
                goto L22
            L1e:
                java.util.Set r2 = r0.keySet()
            L22:
                java.util.Iterator r2 = r2.iterator()
            L26:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L4a
                java.lang.Object r3 = r2.next()
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r4 = r3.intValue()
                if (r7 == 0) goto L3d
                if (r4 > r9) goto L26
                if (r4 <= r8) goto L26
                goto L41
            L3d:
                if (r4 < r9) goto L26
                if (r4 >= r8) goto L26
            L41:
                java.lang.Object r8 = r0.get(r3)
                r6.add(r8)
                r8 = 1
                goto L4d
            L4a:
                r0 = 0
                r4 = r8
                r8 = r0
            L4d:
                if (r8 != 0) goto L50
                return r1
            L50:
                r8 = r4
                goto L0
            L52:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.h.d.b(java.util.List, boolean, int, int):java.util.List");
        }

        public void addMigrations(AbstractC6457a... abstractC6457aArr) {
            for (AbstractC6457a abstractC6457a : abstractC6457aArr) {
                a(abstractC6457a);
            }
        }

        public List<AbstractC6457a> findMigrationPath(int i8, int i9) {
            if (i8 == i9) {
                return Collections.emptyList();
            }
            return b(new ArrayList(), i9 > i8, i8, i9);
        }
    }

    private static boolean e() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    protected abstract e a();

    public void assertNotMainThread() {
        if (!this.f10703f && e()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public void assertNotSuspendingTransaction() {
        if (!inTransaction() && this.f10707j.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    protected abstract InterfaceC6611c b(androidx.room.a aVar);

    @Deprecated
    public void beginTransaction() {
        assertNotMainThread();
        InterfaceC6610b writableDatabase = this.f10701d.getWritableDatabase();
        this.f10702e.j(writableDatabase);
        writableDatabase.beginTransaction();
    }

    Lock c() {
        return this.f10706i.readLock();
    }

    public abstract void clearAllTables();

    public void close() {
        if (isOpen()) {
            ReentrantReadWriteLock.WriteLock writeLock = this.f10706i.writeLock();
            try {
                writeLock.lock();
                this.f10702e.g();
                this.f10701d.close();
            } finally {
                writeLock.unlock();
            }
        }
    }

    public InterfaceC6614f compileStatement(String str) {
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return this.f10701d.getWritableDatabase().compileStatement(str);
    }

    protected void d(InterfaceC6610b interfaceC6610b) {
        this.f10702e.c(interfaceC6610b);
    }

    @Deprecated
    public void endTransaction() {
        this.f10701d.getWritableDatabase().endTransaction();
        if (inTransaction()) {
            return;
        }
        this.f10702e.refreshVersionsAsync();
    }

    public e getInvalidationTracker() {
        return this.f10702e;
    }

    public InterfaceC6611c getOpenHelper() {
        return this.f10701d;
    }

    public Executor getQueryExecutor() {
        return this.f10699b;
    }

    public Executor getTransactionExecutor() {
        return this.f10700c;
    }

    public boolean inTransaction() {
        return this.f10701d.getWritableDatabase().inTransaction();
    }

    public void init(androidx.room.a aVar) {
        InterfaceC6611c interfaceC6611cB = b(aVar);
        this.f10701d = interfaceC6611cB;
        if (interfaceC6611cB instanceof k) {
            ((k) interfaceC6611cB).b(aVar);
        }
        boolean z8 = aVar.journalMode == c.WRITE_AHEAD_LOGGING;
        this.f10701d.setWriteAheadLoggingEnabled(z8);
        this.f10705h = aVar.callbacks;
        this.f10699b = aVar.queryExecutor;
        this.f10700c = new m(aVar.transactionExecutor);
        this.f10703f = aVar.allowMainThreadQueries;
        this.f10704g = z8;
        if (aVar.multiInstanceInvalidation) {
            this.f10702e.e(aVar.context, aVar.name);
        }
    }

    public boolean isOpen() {
        InterfaceC6610b interfaceC6610b = this.f10698a;
        return interfaceC6610b != null && interfaceC6610b.isOpen();
    }

    public Cursor query(String str, Object[] objArr) {
        return this.f10701d.getWritableDatabase().query(new C6609a(str, objArr));
    }

    public void runInTransaction(Runnable runnable) {
        beginTransaction();
        try {
            runnable.run();
            setTransactionSuccessful();
        } finally {
            endTransaction();
        }
    }

    @Deprecated
    public void setTransactionSuccessful() {
        this.f10701d.getWritableDatabase().setTransactionSuccessful();
    }

    public Cursor query(InterfaceC6613e interfaceC6613e) {
        return query(interfaceC6613e, (CancellationSignal) null);
    }

    public Cursor query(InterfaceC6613e interfaceC6613e, CancellationSignal cancellationSignal) {
        assertNotMainThread();
        assertNotSuspendingTransaction();
        if (cancellationSignal != null) {
            return this.f10701d.getWritableDatabase().query(interfaceC6613e, cancellationSignal);
        }
        return this.f10701d.getWritableDatabase().query(interfaceC6613e);
    }

    public <V> V runInTransaction(Callable<V> callable) {
        beginTransaction();
        try {
            try {
                V vCall = callable.call();
                setTransactionSuccessful();
                return vCall;
            } catch (RuntimeException e8) {
                throw e8;
            } catch (Exception e9) {
                x0.e.reThrow(e9);
                endTransaction();
                return null;
            }
        } finally {
            endTransaction();
        }
    }

    public static abstract class b {
        public void onCreate(InterfaceC6610b interfaceC6610b) {
        }

        public void onDestructiveMigration(InterfaceC6610b interfaceC6610b) {
        }

        public void onOpen(InterfaceC6610b interfaceC6610b) {
        }
    }
}
