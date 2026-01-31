package A0;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import android.text.TextUtils;
import android.util.Pair;
import java.util.List;
import java.util.Locale;
import z0.C6609a;
import z0.InterfaceC6610b;
import z0.InterfaceC6613e;
import z0.InterfaceC6614f;

/* loaded from: classes.dex */
class a implements InterfaceC6610b {

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f34b = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f35c = new String[0];

    /* renamed from: a, reason: collision with root package name */
    private final SQLiteDatabase f36a;

    /* renamed from: A0.a$a, reason: collision with other inner class name */
    class C0002a implements SQLiteDatabase.CursorFactory {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6613e f37a;

        C0002a(InterfaceC6613e interfaceC6613e) {
            this.f37a = interfaceC6613e;
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f37a.bindTo(new d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    class b implements SQLiteDatabase.CursorFactory {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6613e f39a;

        b(InterfaceC6613e interfaceC6613e) {
            this.f39a = interfaceC6613e;
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f39a.bindTo(new d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    a(SQLiteDatabase sQLiteDatabase) {
        this.f36a = sQLiteDatabase;
    }

    boolean a(SQLiteDatabase sQLiteDatabase) {
        return this.f36a == sQLiteDatabase;
    }

    @Override // z0.InterfaceC6610b
    public void beginTransaction() {
        this.f36a.beginTransaction();
    }

    @Override // z0.InterfaceC6610b
    public void beginTransactionNonExclusive() {
        this.f36a.beginTransactionNonExclusive();
    }

    @Override // z0.InterfaceC6610b
    public void beginTransactionWithListener(SQLiteTransactionListener sQLiteTransactionListener) {
        this.f36a.beginTransactionWithListener(sQLiteTransactionListener);
    }

    @Override // z0.InterfaceC6610b
    public void beginTransactionWithListenerNonExclusive(SQLiteTransactionListener sQLiteTransactionListener) {
        this.f36a.beginTransactionWithListenerNonExclusive(sQLiteTransactionListener);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f36a.close();
    }

    @Override // z0.InterfaceC6610b
    public InterfaceC6614f compileStatement(String str) {
        return new e(this.f36a.compileStatement(str));
    }

    @Override // z0.InterfaceC6610b
    public int delete(String str, String str2, Object[] objArr) {
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append("DELETE FROM ");
        sb.append(str);
        if (TextUtils.isEmpty(str2)) {
            str3 = "";
        } else {
            str3 = " WHERE " + str2;
        }
        sb.append(str3);
        InterfaceC6614f interfaceC6614fCompileStatement = compileStatement(sb.toString());
        C6609a.bind(interfaceC6614fCompileStatement, objArr);
        return interfaceC6614fCompileStatement.executeUpdateDelete();
    }

    @Override // z0.InterfaceC6610b
    public void disableWriteAheadLogging() {
        this.f36a.disableWriteAheadLogging();
    }

    @Override // z0.InterfaceC6610b
    public boolean enableWriteAheadLogging() {
        return this.f36a.enableWriteAheadLogging();
    }

    @Override // z0.InterfaceC6610b
    public void endTransaction() {
        this.f36a.endTransaction();
    }

    @Override // z0.InterfaceC6610b
    public void execSQL(String str) throws SQLException {
        this.f36a.execSQL(str);
    }

    @Override // z0.InterfaceC6610b
    public List<Pair<String, String>> getAttachedDbs() {
        return this.f36a.getAttachedDbs();
    }

    @Override // z0.InterfaceC6610b
    public long getMaximumSize() {
        return this.f36a.getMaximumSize();
    }

    @Override // z0.InterfaceC6610b
    public long getPageSize() {
        return this.f36a.getPageSize();
    }

    @Override // z0.InterfaceC6610b
    public String getPath() {
        return this.f36a.getPath();
    }

    @Override // z0.InterfaceC6610b
    public int getVersion() {
        return this.f36a.getVersion();
    }

    @Override // z0.InterfaceC6610b
    public boolean inTransaction() {
        return this.f36a.inTransaction();
    }

    @Override // z0.InterfaceC6610b
    public long insert(String str, int i8, ContentValues contentValues) {
        return this.f36a.insertWithOnConflict(str, null, contentValues, i8);
    }

    @Override // z0.InterfaceC6610b
    public boolean isDatabaseIntegrityOk() {
        return this.f36a.isDatabaseIntegrityOk();
    }

    @Override // z0.InterfaceC6610b
    public boolean isDbLockedByCurrentThread() {
        return this.f36a.isDbLockedByCurrentThread();
    }

    @Override // z0.InterfaceC6610b
    public boolean isOpen() {
        return this.f36a.isOpen();
    }

    @Override // z0.InterfaceC6610b
    public boolean isReadOnly() {
        return this.f36a.isReadOnly();
    }

    @Override // z0.InterfaceC6610b
    public boolean isWriteAheadLoggingEnabled() {
        return this.f36a.isWriteAheadLoggingEnabled();
    }

    @Override // z0.InterfaceC6610b
    public boolean needUpgrade(int i8) {
        return this.f36a.needUpgrade(i8);
    }

    @Override // z0.InterfaceC6610b
    public Cursor query(String str) {
        return query(new C6609a(str));
    }

    @Override // z0.InterfaceC6610b
    public void setForeignKeyConstraintsEnabled(boolean z8) {
        this.f36a.setForeignKeyConstraintsEnabled(z8);
    }

    @Override // z0.InterfaceC6610b
    public void setLocale(Locale locale) {
        this.f36a.setLocale(locale);
    }

    @Override // z0.InterfaceC6610b
    public void setMaxSqlCacheSize(int i8) {
        this.f36a.setMaxSqlCacheSize(i8);
    }

    @Override // z0.InterfaceC6610b
    public long setMaximumSize(long j8) {
        return this.f36a.setMaximumSize(j8);
    }

    @Override // z0.InterfaceC6610b
    public void setPageSize(long j8) {
        this.f36a.setPageSize(j8);
    }

    @Override // z0.InterfaceC6610b
    public void setTransactionSuccessful() {
        this.f36a.setTransactionSuccessful();
    }

    @Override // z0.InterfaceC6610b
    public void setVersion(int i8) {
        this.f36a.setVersion(i8);
    }

    @Override // z0.InterfaceC6610b
    public int update(String str, int i8, ContentValues contentValues, String str2, Object[] objArr) {
        if (contentValues == null || contentValues.size() == 0) {
            throw new IllegalArgumentException("Empty values");
        }
        StringBuilder sb = new StringBuilder(120);
        sb.append("UPDATE ");
        sb.append(f34b[i8]);
        sb.append(str);
        sb.append(" SET ");
        int size = contentValues.size();
        int length = objArr == null ? size : objArr.length + size;
        Object[] objArr2 = new Object[length];
        int i9 = 0;
        for (String str3 : contentValues.keySet()) {
            sb.append(i9 > 0 ? "," : "");
            sb.append(str3);
            objArr2[i9] = contentValues.get(str3);
            sb.append("=?");
            i9++;
        }
        if (objArr != null) {
            for (int i10 = size; i10 < length; i10++) {
                objArr2[i10] = objArr[i10 - size];
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            sb.append(" WHERE ");
            sb.append(str2);
        }
        InterfaceC6614f interfaceC6614fCompileStatement = compileStatement(sb.toString());
        C6609a.bind(interfaceC6614fCompileStatement, objArr2);
        return interfaceC6614fCompileStatement.executeUpdateDelete();
    }

    @Override // z0.InterfaceC6610b
    public boolean yieldIfContendedSafely() {
        return this.f36a.yieldIfContendedSafely();
    }

    @Override // z0.InterfaceC6610b
    public void execSQL(String str, Object[] objArr) throws SQLException {
        this.f36a.execSQL(str, objArr);
    }

    @Override // z0.InterfaceC6610b
    public Cursor query(String str, Object[] objArr) {
        return query(new C6609a(str, objArr));
    }

    @Override // z0.InterfaceC6610b
    public boolean yieldIfContendedSafely(long j8) {
        return this.f36a.yieldIfContendedSafely(j8);
    }

    @Override // z0.InterfaceC6610b
    public Cursor query(InterfaceC6613e interfaceC6613e) {
        return this.f36a.rawQueryWithFactory(new C0002a(interfaceC6613e), interfaceC6613e.getSql(), f35c, null);
    }

    @Override // z0.InterfaceC6610b
    public Cursor query(InterfaceC6613e interfaceC6613e, CancellationSignal cancellationSignal) {
        return this.f36a.rawQueryWithFactory(new b(interfaceC6613e), interfaceC6613e.getSql(), f35c, null, cancellationSignal);
    }
}
