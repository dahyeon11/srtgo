package androidx.room;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.lifecycle.LiveData;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import o.C6021b;
import z0.C6609a;
import z0.InterfaceC6610b;
import z0.InterfaceC6614f;

/* loaded from: classes.dex */
public class e {

    /* renamed from: m */
    private static final String[] f10651m = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: a */
    final HashMap f10652a;

    /* renamed from: b */
    final String[] f10653b;

    /* renamed from: c */
    private Map f10654c;

    /* renamed from: d */
    final h f10655d;

    /* renamed from: e */
    AtomicBoolean f10656e;

    /* renamed from: f */
    private volatile boolean f10657f;

    /* renamed from: g */
    volatile InterfaceC6614f f10658g;

    /* renamed from: h */
    private b f10659h;

    /* renamed from: i */
    private final androidx.room.d f10660i;

    /* renamed from: j */
    final C6021b f10661j;

    /* renamed from: k */
    private f f10662k;

    /* renamed from: l */
    Runnable f10663l;

    class a implements Runnable {
        a() {
        }

        private Set a() {
            HashSet hashSet = new HashSet();
            Cursor cursorQuery = e.this.f10655d.query(new C6609a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
            while (cursorQuery.moveToNext()) {
                try {
                    hashSet.add(Integer.valueOf(cursorQuery.getInt(0)));
                } catch (Throwable th) {
                    cursorQuery.close();
                    throw th;
                }
            }
            cursorQuery.close();
            if (!hashSet.isEmpty()) {
                e.this.f10658g.executeUpdateDelete();
            }
            return hashSet;
        }

        /* JADX WARN: Removed duplicated region for block: B:107:0x00a0 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:93:0x0071  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                r5 = this;
                androidx.room.e r0 = androidx.room.e.this
                androidx.room.h r0 = r0.f10655d
                java.util.concurrent.locks.Lock r0 = r0.c()
                r1 = 0
                r0.lock()     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L56 java.lang.IllegalStateException -> L58
                androidx.room.e r2 = androidx.room.e.this     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L56 java.lang.IllegalStateException -> L58
                boolean r2 = r2.b()     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L56 java.lang.IllegalStateException -> L58
                if (r2 != 0) goto L18
                r0.unlock()
                return
            L18:
                androidx.room.e r2 = androidx.room.e.this     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L56 java.lang.IllegalStateException -> L58
                java.util.concurrent.atomic.AtomicBoolean r2 = r2.f10656e     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L56 java.lang.IllegalStateException -> L58
                r3 = 1
                r4 = 0
                boolean r2 = r2.compareAndSet(r3, r4)     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L56 java.lang.IllegalStateException -> L58
                if (r2 != 0) goto L28
                r0.unlock()
                return
            L28:
                androidx.room.e r2 = androidx.room.e.this     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L56 java.lang.IllegalStateException -> L58
                androidx.room.h r2 = r2.f10655d     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L56 java.lang.IllegalStateException -> L58
                boolean r2 = r2.inTransaction()     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L56 java.lang.IllegalStateException -> L58
                if (r2 == 0) goto L36
                r0.unlock()
                return
            L36:
                androidx.room.e r2 = androidx.room.e.this     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L56 java.lang.IllegalStateException -> L58
                androidx.room.h r2 = r2.f10655d     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L56 java.lang.IllegalStateException -> L58
                boolean r3 = r2.f10704g     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L56 java.lang.IllegalStateException -> L58
                if (r3 == 0) goto L5f
                z0.c r2 = r2.getOpenHelper()     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L56 java.lang.IllegalStateException -> L58
                z0.b r2 = r2.getWritableDatabase()     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L56 java.lang.IllegalStateException -> L58
                r2.beginTransaction()     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L56 java.lang.IllegalStateException -> L58
                java.util.Set r1 = r5.a()     // Catch: java.lang.Throwable -> L5a
                r2.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L5a
                r2.endTransaction()     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L56 java.lang.IllegalStateException -> L58
                goto L63
            L54:
                r1 = move-exception
                goto La1
            L56:
                r2 = move-exception
                goto L67
            L58:
                r2 = move-exception
                goto L67
            L5a:
                r3 = move-exception
                r2.endTransaction()     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L56 java.lang.IllegalStateException -> L58
                throw r3     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L56 java.lang.IllegalStateException -> L58
            L5f:
                java.util.Set r1 = r5.a()     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L56 java.lang.IllegalStateException -> L58
            L63:
                r0.unlock()
                goto L6f
            L67:
                java.lang.String r3 = "ROOM"
                java.lang.String r4 = "Cannot run invalidation tracker. Is the db closed?"
                android.util.Log.e(r3, r4, r2)     // Catch: java.lang.Throwable -> L54
                goto L63
            L6f:
                if (r1 == 0) goto La0
                boolean r0 = r1.isEmpty()
                if (r0 != 0) goto La0
                androidx.room.e r0 = androidx.room.e.this
                o.b r0 = r0.f10661j
                monitor-enter(r0)
                androidx.room.e r2 = androidx.room.e.this     // Catch: java.lang.Throwable -> L9a
                o.b r2 = r2.f10661j     // Catch: java.lang.Throwable -> L9a
                java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L9a
            L84:
                boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L9a
                if (r3 == 0) goto L9c
                java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L9a
                java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L9a
                java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L9a
                androidx.room.e$d r3 = (androidx.room.e.d) r3     // Catch: java.lang.Throwable -> L9a
                r3.a(r1)     // Catch: java.lang.Throwable -> L9a
                goto L84
            L9a:
                r1 = move-exception
                goto L9e
            L9c:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L9a
                goto La0
            L9e:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L9a
                throw r1
            La0:
                return
            La1:
                r0.unlock()
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.e.a.run():void");
        }
    }

    static class b {

        /* renamed from: a */
        final long[] f10665a;

        /* renamed from: b */
        final boolean[] f10666b;

        /* renamed from: c */
        final int[] f10667c;

        /* renamed from: d */
        boolean f10668d;

        /* renamed from: e */
        boolean f10669e;

        b(int i8) {
            long[] jArr = new long[i8];
            this.f10665a = jArr;
            boolean[] zArr = new boolean[i8];
            this.f10666b = zArr;
            this.f10667c = new int[i8];
            Arrays.fill(jArr, 0L);
            Arrays.fill(zArr, false);
        }

        int[] a() {
            synchronized (this) {
                try {
                    if (this.f10668d && !this.f10669e) {
                        int length = this.f10665a.length;
                        int i8 = 0;
                        while (true) {
                            int i9 = 1;
                            if (i8 >= length) {
                                this.f10669e = true;
                                this.f10668d = false;
                                return this.f10667c;
                            }
                            boolean z8 = this.f10665a[i8] > 0;
                            boolean[] zArr = this.f10666b;
                            if (z8 != zArr[i8]) {
                                int[] iArr = this.f10667c;
                                if (!z8) {
                                    i9 = 2;
                                }
                                iArr[i8] = i9;
                            } else {
                                this.f10667c[i8] = 0;
                            }
                            zArr[i8] = z8;
                            i8++;
                        }
                    }
                    return null;
                } finally {
                }
            }
        }

        boolean b(int... iArr) {
            boolean z8;
            synchronized (this) {
                try {
                    z8 = false;
                    for (int i8 : iArr) {
                        long[] jArr = this.f10665a;
                        long j8 = jArr[i8];
                        jArr[i8] = 1 + j8;
                        if (j8 == 0) {
                            z8 = true;
                            this.f10668d = true;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return z8;
        }

        boolean c(int... iArr) {
            boolean z8;
            synchronized (this) {
                try {
                    z8 = false;
                    for (int i8 : iArr) {
                        long[] jArr = this.f10665a;
                        long j8 = jArr[i8];
                        jArr[i8] = j8 - 1;
                        if (j8 == 1) {
                            z8 = true;
                            this.f10668d = true;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return z8;
        }

        void d() {
            synchronized (this) {
                this.f10669e = false;
            }
        }
    }

    public static abstract class c {

        /* renamed from: a */
        final String[] f10670a;

        public c(String[] strArr) {
            this.f10670a = (String[]) Arrays.copyOf(strArr, strArr.length);
        }

        boolean a() {
            return false;
        }

        public abstract void onInvalidated(Set<String> set);
    }

    static class d {

        /* renamed from: a */
        final int[] f10671a;

        /* renamed from: b */
        private final String[] f10672b;

        /* renamed from: c */
        final c f10673c;

        /* renamed from: d */
        private final Set f10674d;

        d(c cVar, int[] iArr, String[] strArr) {
            this.f10673c = cVar;
            this.f10671a = iArr;
            this.f10672b = strArr;
            if (iArr.length != 1) {
                this.f10674d = null;
                return;
            }
            HashSet hashSet = new HashSet();
            hashSet.add(strArr[0]);
            this.f10674d = Collections.unmodifiableSet(hashSet);
        }

        void a(Set set) {
            int length = this.f10671a.length;
            Set<String> hashSet = null;
            for (int i8 = 0; i8 < length; i8++) {
                if (set.contains(Integer.valueOf(this.f10671a[i8]))) {
                    if (length == 1) {
                        hashSet = this.f10674d;
                    } else {
                        if (hashSet == null) {
                            hashSet = new HashSet<>(length);
                        }
                        hashSet.add(this.f10672b[i8]);
                    }
                }
            }
            if (hashSet != null) {
                this.f10673c.onInvalidated(hashSet);
            }
        }

        void b(String[] strArr) {
            Set<String> set = null;
            if (this.f10672b.length == 1) {
                int length = strArr.length;
                int i8 = 0;
                while (true) {
                    if (i8 >= length) {
                        break;
                    }
                    if (strArr[i8].equalsIgnoreCase(this.f10672b[0])) {
                        set = this.f10674d;
                        break;
                    }
                    i8++;
                }
            } else {
                HashSet hashSet = new HashSet();
                for (String str : strArr) {
                    String[] strArr2 = this.f10672b;
                    int length2 = strArr2.length;
                    int i9 = 0;
                    while (true) {
                        if (i9 < length2) {
                            String str2 = strArr2[i9];
                            if (str2.equalsIgnoreCase(str)) {
                                hashSet.add(str2);
                                break;
                            }
                            i9++;
                        }
                    }
                }
                if (hashSet.size() > 0) {
                    set = hashSet;
                }
            }
            if (set != null) {
                this.f10673c.onInvalidated(set);
            }
        }
    }

    /* renamed from: androidx.room.e$e */
    static class C0167e extends c {

        /* renamed from: b */
        final e f10675b;

        /* renamed from: c */
        final WeakReference f10676c;

        C0167e(e eVar, c cVar) {
            super(cVar.f10670a);
            this.f10675b = eVar;
            this.f10676c = new WeakReference(cVar);
        }

        @Override // androidx.room.e.c
        public void onInvalidated(Set<String> set) {
            c cVar = (c) this.f10676c.get();
            if (cVar == null) {
                this.f10675b.removeObserver(this);
            } else {
                cVar.onInvalidated(set);
            }
        }
    }

    public e(h hVar, String... strArr) {
        this(hVar, new HashMap(), Collections.emptyMap(), strArr);
    }

    private static void a(StringBuilder sb, String str, String str2) {
        sb.append("`");
        sb.append("room_table_modification_trigger_");
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        sb.append("`");
    }

    private String[] d(String[] strArr) {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (this.f10654c.containsKey(lowerCase)) {
                hashSet.addAll((Collection) this.f10654c.get(lowerCase));
            } else {
                hashSet.add(str);
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    private void f(InterfaceC6610b interfaceC6610b, int i8) {
        interfaceC6610b.execSQL("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i8 + ", 0)");
        String str = this.f10653b[i8];
        StringBuilder sb = new StringBuilder();
        for (String str2 : f10651m) {
            sb.setLength(0);
            sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            a(sb, str, str2);
            sb.append(" AFTER ");
            sb.append(str2);
            sb.append(" ON `");
            sb.append(str);
            sb.append("` BEGIN UPDATE ");
            sb.append("room_table_modification_log");
            sb.append(" SET ");
            sb.append("invalidated");
            sb.append(" = 1");
            sb.append(" WHERE ");
            sb.append("table_id");
            sb.append(" = ");
            sb.append(i8);
            sb.append(" AND ");
            sb.append("invalidated");
            sb.append(" = 0");
            sb.append("; END");
            interfaceC6610b.execSQL(sb.toString());
        }
    }

    private void h(InterfaceC6610b interfaceC6610b, int i8) {
        String str = this.f10653b[i8];
        StringBuilder sb = new StringBuilder();
        for (String str2 : f10651m) {
            sb.setLength(0);
            sb.append("DROP TRIGGER IF EXISTS ");
            a(sb, str, str2);
            interfaceC6610b.execSQL(sb.toString());
        }
    }

    private String[] k(String[] strArr) {
        String[] strArrD = d(strArr);
        for (String str : strArrD) {
            if (!this.f10652a.containsKey(str.toLowerCase(Locale.US))) {
                throw new IllegalArgumentException("There is no table with name " + str);
            }
        }
        return strArrD;
    }

    public void addObserver(c cVar) {
        d dVar;
        String[] strArrD = d(cVar.f10670a);
        int[] iArr = new int[strArrD.length];
        int length = strArrD.length;
        for (int i8 = 0; i8 < length; i8++) {
            Integer num = (Integer) this.f10652a.get(strArrD[i8].toLowerCase(Locale.US));
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name " + strArrD[i8]);
            }
            iArr[i8] = num.intValue();
        }
        d dVar2 = new d(cVar, iArr, strArrD);
        synchronized (this.f10661j) {
            dVar = (d) this.f10661j.putIfAbsent(cVar, dVar2);
        }
        if (dVar == null && this.f10659h.b(iArr)) {
            i();
        }
    }

    public void addWeakObserver(c cVar) {
        addObserver(new C0167e(this, cVar));
    }

    boolean b() {
        if (!this.f10655d.isOpen()) {
            return false;
        }
        if (!this.f10657f) {
            this.f10655d.getOpenHelper().getWritableDatabase();
        }
        if (this.f10657f) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    void c(InterfaceC6610b interfaceC6610b) {
        synchronized (this) {
            try {
                if (this.f10657f) {
                    Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                    return;
                }
                interfaceC6610b.execSQL("PRAGMA temp_store = MEMORY;");
                interfaceC6610b.execSQL("PRAGMA recursive_triggers='ON';");
                interfaceC6610b.execSQL("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                j(interfaceC6610b);
                this.f10658g = interfaceC6610b.compileStatement("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ");
                this.f10657f = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Deprecated
    public <T> LiveData createLiveData(String[] strArr, Callable<T> callable) {
        return createLiveData(strArr, false, callable);
    }

    void e(Context context, String str) {
        this.f10662k = new f(context, str, this, this.f10655d.getQueryExecutor());
    }

    void g() {
        f fVar = this.f10662k;
        if (fVar != null) {
            fVar.a();
            this.f10662k = null;
        }
    }

    void i() {
        if (this.f10655d.isOpen()) {
            j(this.f10655d.getOpenHelper().getWritableDatabase());
        }
    }

    void j(InterfaceC6610b interfaceC6610b) {
        if (interfaceC6610b.inTransaction()) {
            return;
        }
        while (true) {
            try {
                Lock lockC = this.f10655d.c();
                lockC.lock();
                try {
                    int[] iArrA = this.f10659h.a();
                    if (iArrA == null) {
                        return;
                    }
                    int length = iArrA.length;
                    interfaceC6610b.beginTransaction();
                    for (int i8 = 0; i8 < length; i8++) {
                        try {
                            int i9 = iArrA[i8];
                            if (i9 == 1) {
                                f(interfaceC6610b, i8);
                            } else if (i9 == 2) {
                                h(interfaceC6610b, i8);
                            }
                        } finally {
                        }
                    }
                    interfaceC6610b.setTransactionSuccessful();
                    interfaceC6610b.endTransaction();
                    this.f10659h.d();
                } finally {
                    lockC.unlock();
                }
            } catch (SQLiteException | IllegalStateException e8) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e8);
                return;
            }
        }
    }

    public void notifyObserversByTableNames(String... strArr) {
        synchronized (this.f10661j) {
            try {
                Iterator<Map.Entry<Object, Object>> it = this.f10661j.iterator();
                while (it.hasNext()) {
                    Map.Entry<Object, Object> next = it.next();
                    if (!((c) next.getKey()).a()) {
                        ((d) next.getValue()).b(strArr);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void refreshVersionsAsync() {
        if (this.f10656e.compareAndSet(false, true)) {
            this.f10655d.getQueryExecutor().execute(this.f10663l);
        }
    }

    public void refreshVersionsSync() {
        i();
        this.f10663l.run();
    }

    public void removeObserver(c cVar) {
        d dVar;
        synchronized (this.f10661j) {
            dVar = (d) this.f10661j.remove(cVar);
        }
        if (dVar == null || !this.f10659h.c(dVar.f10671a)) {
            return;
        }
        i();
    }

    public e(h hVar, Map<String, String> map, Map<String, Set<String>> map2, String... strArr) {
        this.f10656e = new AtomicBoolean(false);
        this.f10657f = false;
        this.f10661j = new C6021b();
        this.f10663l = new a();
        this.f10655d = hVar;
        this.f10659h = new b(strArr.length);
        this.f10652a = new HashMap();
        this.f10654c = map2;
        this.f10660i = new androidx.room.d(hVar);
        int length = strArr.length;
        this.f10653b = new String[length];
        for (int i8 = 0; i8 < length; i8++) {
            String str = strArr[i8];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.f10652a.put(lowerCase, Integer.valueOf(i8));
            String str2 = map.get(strArr[i8]);
            if (str2 != null) {
                this.f10653b[i8] = str2.toLowerCase(locale);
            } else {
                this.f10653b[i8] = lowerCase;
            }
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String value = entry.getValue();
            Locale locale2 = Locale.US;
            String lowerCase2 = value.toLowerCase(locale2);
            if (this.f10652a.containsKey(lowerCase2)) {
                String lowerCase3 = entry.getKey().toLowerCase(locale2);
                HashMap map3 = this.f10652a;
                map3.put(lowerCase3, map3.get(lowerCase2));
            }
        }
    }

    public <T> LiveData createLiveData(String[] strArr, boolean z8, Callable<T> callable) {
        return this.f10660i.a(k(strArr), z8, callable);
    }
}
