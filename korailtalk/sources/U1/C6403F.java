package u1;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

/* renamed from: u1.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6403F extends SQLiteOpenHelper {

    /* renamed from: c, reason: collision with root package name */
    static int f37055c = 3;

    /* renamed from: d, reason: collision with root package name */
    private static final a f37056d;

    /* renamed from: e, reason: collision with root package name */
    private static final a f37057e;

    /* renamed from: f, reason: collision with root package name */
    private static final a f37058f;

    /* renamed from: g, reason: collision with root package name */
    private static final List f37059g;

    /* renamed from: a, reason: collision with root package name */
    private final int f37060a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f37061b;

    /* renamed from: u1.F$a */
    public interface a {
        void upgrade(SQLiteDatabase sQLiteDatabase);
    }

    static {
        a aVar = C6400C.f37052a;
        f37056d = aVar;
        a aVar2 = C6401D.f37053a;
        f37057e = aVar2;
        a aVar3 = C6402E.f37054a;
        f37058f = aVar3;
        f37059g = Arrays.asList(aVar, aVar2, aVar3);
    }

    C6403F(Context context, int i8) {
        super(context, "com.google.android.datatransport.events", (SQLiteDatabase.CursorFactory) null, i8);
        this.f37061b = false;
        this.f37060a = i8;
    }

    private void a(SQLiteDatabase sQLiteDatabase) {
        if (this.f37061b) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }

    static /* synthetic */ void b(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
    }

    static /* synthetic */ void c(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    private void e(SQLiteDatabase sQLiteDatabase, int i8, int i9) {
        List list = f37059g;
        if (i9 <= list.size()) {
            while (i8 < i9) {
                ((a) f37059g.get(i8)).upgrade(sQLiteDatabase);
                i8++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i8 + " to " + i9 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f37061b = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        a(sQLiteDatabase);
        e(sQLiteDatabase, 0, this.f37060a);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i8, int i9) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        onCreate(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        a(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i8, int i9) {
        a(sQLiteDatabase);
        e(sQLiteDatabase, i8, i9);
    }
}
