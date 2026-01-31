package z0;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import android.util.Pair;
import java.io.Closeable;
import java.util.List;
import java.util.Locale;

/* renamed from: z0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC6610b extends Closeable {
    void beginTransaction();

    void beginTransactionNonExclusive();

    void beginTransactionWithListener(SQLiteTransactionListener sQLiteTransactionListener);

    void beginTransactionWithListenerNonExclusive(SQLiteTransactionListener sQLiteTransactionListener);

    InterfaceC6614f compileStatement(String str);

    int delete(String str, String str2, Object[] objArr);

    void disableWriteAheadLogging();

    boolean enableWriteAheadLogging();

    void endTransaction();

    void execSQL(String str);

    void execSQL(String str, Object[] objArr);

    List<Pair<String, String>> getAttachedDbs();

    long getMaximumSize();

    long getPageSize();

    String getPath();

    int getVersion();

    boolean inTransaction();

    long insert(String str, int i8, ContentValues contentValues);

    boolean isDatabaseIntegrityOk();

    boolean isDbLockedByCurrentThread();

    boolean isOpen();

    boolean isReadOnly();

    boolean isWriteAheadLoggingEnabled();

    boolean needUpgrade(int i8);

    Cursor query(String str);

    Cursor query(String str, Object[] objArr);

    Cursor query(InterfaceC6613e interfaceC6613e);

    Cursor query(InterfaceC6613e interfaceC6613e, CancellationSignal cancellationSignal);

    void setForeignKeyConstraintsEnabled(boolean z8);

    void setLocale(Locale locale);

    void setMaxSqlCacheSize(int i8);

    long setMaximumSize(long j8);

    void setPageSize(long j8);

    void setTransactionSuccessful();

    void setVersion(int i8);

    int update(String str, int i8, ContentValues contentValues, String str2, Object[] objArr);

    boolean yieldIfContendedSafely();

    boolean yieldIfContendedSafely(long j8);
}
