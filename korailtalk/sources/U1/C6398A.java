package u1;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import com.j256.ormlite.field.FieldType;
import com.kakao.sdk.auth.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import m1.C5904b;
import o1.h;
import q1.AbstractC6104a;
import v1.C6427a;
import v1.InterfaceC6428b;
import w1.InterfaceC6458a;
import x1.C6483a;

/* renamed from: u1.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6398A implements InterfaceC6407c, InterfaceC6428b {

    /* renamed from: e, reason: collision with root package name */
    private static final C5904b f37041e = C5904b.of("proto");

    /* renamed from: a, reason: collision with root package name */
    private final C6403F f37042a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6458a f37043b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC6458a f37044c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC6408d f37045d;

    /* renamed from: u1.A$b */
    interface b {
        Object apply(Object obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u1.A$c */
    static class c {

        /* renamed from: a, reason: collision with root package name */
        final String f37046a;

        /* renamed from: b, reason: collision with root package name */
        final String f37047b;

        private c(String str, String str2) {
            this.f37046a = str;
            this.f37047b = str2;
        }
    }

    /* renamed from: u1.A$d */
    interface d {
        Object produce();
    }

    C6398A(InterfaceC6458a interfaceC6458a, InterfaceC6458a interfaceC6458a2, AbstractC6408d abstractC6408d, C6403F c6403f) {
        this.f37042a = c6403f;
        this.f37043b = interfaceC6458a;
        this.f37044c = interfaceC6458a2;
        this.f37045d = abstractC6408d;
    }

    private static byte[] A(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    private Object B(d dVar, b bVar) {
        long time = this.f37044c.getTime();
        while (true) {
            try {
                return dVar.produce();
            } catch (SQLiteDatabaseLockedException e8) {
                if (this.f37044c.getTime() >= this.f37045d.b() + time) {
                    return bVar.apply(e8);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    private static C5904b C(String str) {
        return str == null ? f37041e : C5904b.of(str);
    }

    private static String D(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((AbstractC6412h) it.next()).getId());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    private static Object E(Cursor cursor, b bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    private void a(SQLiteDatabase sQLiteDatabase) {
        B(p.lambdaFactory$(sQLiteDatabase), q.f37089a);
    }

    private long b(SQLiteDatabase sQLiteDatabase, o1.l lVar) {
        Long lE = e(sQLiteDatabase, lVar);
        if (lE != null) {
            return lE.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", lVar.getBackendName());
        contentValues.put("priority", Integer.valueOf(C6483a.toInt(lVar.getPriority())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (lVar.getExtras() != null) {
            contentValues.put("extras", Base64.encodeToString(lVar.getExtras(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    private SQLiteDatabase c() {
        C6403F c6403f = this.f37042a;
        c6403f.getClass();
        return (SQLiteDatabase) B(s.lambdaFactory$(c6403f), u.f37093a);
    }

    private long d() {
        return c().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    private Long e(SQLiteDatabase sQLiteDatabase, o1.l lVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(lVar.getBackendName(), String.valueOf(C6483a.toInt(lVar.getPriority()))));
        if (lVar.getExtras() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(lVar.getExtras(), 0));
        }
        return (Long) E(sQLiteDatabase.query("transport_contexts", new String[]{FieldType.FOREIGN_ID_FIELD_SUFFIX}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), w.f37097a);
    }

    private Object f(b bVar) {
        SQLiteDatabase sQLiteDatabaseC = c();
        sQLiteDatabaseC.beginTransaction();
        try {
            Object objApply = bVar.apply(sQLiteDatabaseC);
            sQLiteDatabaseC.setTransactionSuccessful();
            return objApply;
        } finally {
            sQLiteDatabaseC.endTransaction();
        }
    }

    private boolean g() {
        return d() * getPageSize() >= this.f37045d.e();
    }

    private long getPageSize() {
        return c().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    private List h(List list, Map map) {
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            AbstractC6412h abstractC6412h = (AbstractC6412h) listIterator.next();
            if (map.containsKey(Long.valueOf(abstractC6412h.getId()))) {
                h.a builder = abstractC6412h.getEvent().toBuilder();
                for (c cVar : (Set) map.get(Long.valueOf(abstractC6412h.getId()))) {
                    builder.addMetadata(cVar.f37046a, cVar.f37047b);
                }
                listIterator.set(AbstractC6412h.create(abstractC6412h.getId(), abstractC6412h.getTransportContext(), builder.build()));
            }
        }
        return list;
    }

    static /* synthetic */ Integer i(long j8, SQLiteDatabase sQLiteDatabase) {
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", new String[]{String.valueOf(j8)}));
    }

    static /* synthetic */ Object j(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.delete("events", null, new String[0]);
        sQLiteDatabase.delete("transport_contexts", null, new String[0]);
        return null;
    }

    static /* synthetic */ Object k(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    static /* synthetic */ Object l(Throwable th) {
        throw new C6427a("Timed out while trying to acquire the lock.", th);
    }

    static /* synthetic */ SQLiteDatabase m(Throwable th) {
        throw new C6427a("Timed out while trying to open db.", th);
    }

    static /* synthetic */ Long n(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    static /* synthetic */ Long o(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return null;
    }

    static /* synthetic */ Boolean p(C6398A c6398a, o1.l lVar, SQLiteDatabase sQLiteDatabase) {
        Long lE = c6398a.e(sQLiteDatabase, lVar);
        return lE == null ? Boolean.FALSE : (Boolean) E(c6398a.c().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lE.toString()}), t.f37092a);
    }

    static /* synthetic */ List q(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(o1.l.builder().setBackendName(cursor.getString(1)).setPriority(C6483a.valueOf(cursor.getInt(2))).setExtras(A(cursor.getString(3))).build());
        }
        return arrayList;
    }

    static /* synthetic */ List r(SQLiteDatabase sQLiteDatabase) {
        return (List) E(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), r.f37090a);
    }

    static /* synthetic */ List s(C6398A c6398a, o1.l lVar, SQLiteDatabase sQLiteDatabase) {
        List listY = c6398a.y(sQLiteDatabase, lVar);
        return c6398a.h(listY, c6398a.z(sQLiteDatabase, listY));
    }

    static /* synthetic */ Object t(List list, o1.l lVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j8 = cursor.getLong(0);
            h.a encodedPayload = o1.h.builder().setTransportName(cursor.getString(1)).setEventMillis(cursor.getLong(2)).setUptimeMillis(cursor.getLong(3)).setEncodedPayload(new o1.g(C(cursor.getString(4)), cursor.getBlob(5)));
            if (!cursor.isNull(6)) {
                encodedPayload.setCode(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(AbstractC6412h.create(j8, lVar, encodedPayload.build()));
        }
        return null;
    }

    static /* synthetic */ Object u(Map map, Cursor cursor) {
        while (true) {
            if (!cursor.moveToNext()) {
                return null;
            }
            long j8 = cursor.getLong(0);
            Set hashSet = (Set) map.get(Long.valueOf(j8));
            if (hashSet == null) {
                hashSet = new HashSet();
                map.put(Long.valueOf(j8), hashSet);
            }
            hashSet.add(new c(cursor.getString(1), cursor.getString(2)));
        }
    }

    static /* synthetic */ Long v(C6398A c6398a, o1.l lVar, o1.h hVar, SQLiteDatabase sQLiteDatabase) {
        if (c6398a.g()) {
            return -1L;
        }
        long jB = c6398a.b(sQLiteDatabase, lVar);
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(jB));
        contentValues.put("transport_name", hVar.getTransportName());
        contentValues.put("timestamp_ms", Long.valueOf(hVar.getEventMillis()));
        contentValues.put("uptime_ms", Long.valueOf(hVar.getUptimeMillis()));
        contentValues.put("payload_encoding", hVar.getEncodedPayload().getEncoding().getName());
        contentValues.put("payload", hVar.getEncodedPayload().getBytes());
        contentValues.put(Constants.CODE, hVar.getCode());
        contentValues.put("num_attempts", (Integer) 0);
        long jInsert = sQLiteDatabase.insert("events", null, contentValues);
        for (Map.Entry<String, String> entry : hVar.getMetadata().entrySet()) {
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("event_id", Long.valueOf(jInsert));
            contentValues2.put("name", entry.getKey());
            contentValues2.put("value", entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues2);
        }
        return Long.valueOf(jInsert);
    }

    static /* synthetic */ Object w(String str, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 10").execute();
        return null;
    }

    static /* synthetic */ Object x(long j8, o1.l lVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j8));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{lVar.getBackendName(), String.valueOf(C6483a.toInt(lVar.getPriority()))}) < 1) {
            contentValues.put("backend_name", lVar.getBackendName());
            contentValues.put("priority", Integer.valueOf(C6483a.toInt(lVar.getPriority())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    private List y(SQLiteDatabase sQLiteDatabase, o1.l lVar) {
        ArrayList arrayList = new ArrayList();
        Long lE = e(sQLiteDatabase, lVar);
        if (lE == null) {
            return arrayList;
        }
        E(sQLiteDatabase.query("events", new String[]{FieldType.FOREIGN_ID_FIELD_SUFFIX, "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", Constants.CODE}, "context_id = ?", new String[]{lE.toString()}, null, null, null, String.valueOf(this.f37045d.d())), n.lambdaFactory$(arrayList, lVar));
        return arrayList;
    }

    private Map z(SQLiteDatabase sQLiteDatabase, List list) {
        HashMap map = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i8 = 0; i8 < list.size(); i8++) {
            sb.append(((AbstractC6412h) list.get(i8)).getId());
            if (i8 < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        E(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null), o.lambdaFactory$(map));
        return map;
    }

    @Override // u1.InterfaceC6407c
    public int cleanUp() {
        return ((Integer) f(l.lambdaFactory$(this.f37043b.getTime() - this.f37045d.c()))).intValue();
    }

    public void clearDb() {
        f(m.f37084a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f37042a.close();
    }

    @Override // u1.InterfaceC6407c
    public long getNextCallTime(o1.l lVar) {
        return ((Long) E(c().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{lVar.getBackendName(), String.valueOf(C6483a.toInt(lVar.getPriority()))}), y.f37099a)).longValue();
    }

    @Override // u1.InterfaceC6407c
    public boolean hasPendingEventsFor(o1.l lVar) {
        return ((Boolean) f(z.lambdaFactory$(this, lVar))).booleanValue();
    }

    @Override // u1.InterfaceC6407c
    public Iterable<o1.l> loadActiveContexts() {
        return (Iterable) f(k.f37082a);
    }

    @Override // u1.InterfaceC6407c
    public Iterable<AbstractC6412h> loadBatch(o1.l lVar) {
        return (Iterable) f(j.lambdaFactory$(this, lVar));
    }

    @Override // u1.InterfaceC6407c
    public AbstractC6412h persist(o1.l lVar, o1.h hVar) {
        AbstractC6104a.d("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", lVar.getPriority(), hVar.getTransportName(), lVar.getBackendName());
        long jLongValue = ((Long) f(v.lambdaFactory$(this, lVar, hVar))).longValue();
        if (jLongValue < 1) {
            return null;
        }
        return AbstractC6412h.create(jLongValue, lVar, hVar);
    }

    @Override // u1.InterfaceC6407c
    public void recordFailure(Iterable<AbstractC6412h> iterable) {
        if (iterable.iterator().hasNext()) {
            f(x.lambdaFactory$("UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + D(iterable)));
        }
    }

    @Override // u1.InterfaceC6407c
    public void recordNextCallTime(o1.l lVar, long j8) {
        f(i.lambdaFactory$(j8, lVar));
    }

    @Override // u1.InterfaceC6407c
    public void recordSuccess(Iterable<AbstractC6412h> iterable) {
        if (iterable.iterator().hasNext()) {
            c().compileStatement("DELETE FROM events WHERE _id in " + D(iterable)).execute();
        }
    }

    @Override // v1.InterfaceC6428b
    public <T> T runCriticalSection(InterfaceC6428b.a aVar) {
        SQLiteDatabase sQLiteDatabaseC = c();
        a(sQLiteDatabaseC);
        try {
            T t8 = (T) aVar.execute();
            sQLiteDatabaseC.setTransactionSuccessful();
            return t8;
        } finally {
            sQLiteDatabaseC.endTransaction();
        }
    }
}
