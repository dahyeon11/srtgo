package A0;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.File;
import z0.InterfaceC6610b;
import z0.InterfaceC6611c;

/* loaded from: classes.dex */
class b implements InterfaceC6611c {

    /* renamed from: a, reason: collision with root package name */
    private final Context f41a;

    /* renamed from: b, reason: collision with root package name */
    private final String f42b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC6611c.a f43c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f44d;

    /* renamed from: e, reason: collision with root package name */
    private final Object f45e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private a f46f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f47g;

    static class a extends SQLiteOpenHelper {

        /* renamed from: a, reason: collision with root package name */
        final A0.a[] f48a;

        /* renamed from: b, reason: collision with root package name */
        final InterfaceC6611c.a f49b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f50c;

        /* renamed from: A0.b$a$a, reason: collision with other inner class name */
        class C0003a implements DatabaseErrorHandler {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC6611c.a f51a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ A0.a[] f52b;

            C0003a(InterfaceC6611c.a aVar, A0.a[] aVarArr) {
                this.f51a = aVar;
                this.f52b = aVarArr;
            }

            @Override // android.database.DatabaseErrorHandler
            public void onCorruption(SQLiteDatabase sQLiteDatabase) {
                this.f51a.onCorruption(a.c(this.f52b, sQLiteDatabase));
            }
        }

        a(Context context, String str, A0.a[] aVarArr, InterfaceC6611c.a aVar) {
            super(context, str, null, aVar.version, new C0003a(aVar, aVarArr));
            this.f49b = aVar;
            this.f48a = aVarArr;
        }

        static A0.a c(A0.a[] aVarArr, SQLiteDatabase sQLiteDatabase) {
            A0.a aVar = aVarArr[0];
            if (aVar == null || !aVar.a(sQLiteDatabase)) {
                aVarArr[0] = new A0.a(sQLiteDatabase);
            }
            return aVarArr[0];
        }

        synchronized InterfaceC6610b a() {
            this.f50c = false;
            SQLiteDatabase readableDatabase = super.getReadableDatabase();
            if (!this.f50c) {
                return b(readableDatabase);
            }
            close();
            return a();
        }

        A0.a b(SQLiteDatabase sQLiteDatabase) {
            return c(this.f48a, sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public synchronized void close() {
            super.close();
            this.f48a[0] = null;
        }

        synchronized InterfaceC6610b d() {
            this.f50c = false;
            SQLiteDatabase writableDatabase = super.getWritableDatabase();
            if (!this.f50c) {
                return b(writableDatabase);
            }
            close();
            return d();
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            this.f49b.onConfigure(b(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            this.f49b.onCreate(b(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i8, int i9) {
            this.f50c = true;
            this.f49b.onDowngrade(b(sQLiteDatabase), i8, i9);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (this.f50c) {
                return;
            }
            this.f49b.onOpen(b(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i8, int i9) {
            this.f50c = true;
            this.f49b.onUpgrade(b(sQLiteDatabase), i8, i9);
        }
    }

    b(Context context, String str, InterfaceC6611c.a aVar, boolean z8) {
        this.f41a = context;
        this.f42b = str;
        this.f43c = aVar;
        this.f44d = z8;
    }

    private a a() {
        a aVar;
        synchronized (this.f45e) {
            try {
                if (this.f46f == null) {
                    A0.a[] aVarArr = new A0.a[1];
                    if (this.f42b == null || !this.f44d) {
                        this.f46f = new a(this.f41a, this.f42b, aVarArr, this.f43c);
                    } else {
                        this.f46f = new a(this.f41a, new File(this.f41a.getNoBackupFilesDir(), this.f42b).getAbsolutePath(), aVarArr, this.f43c);
                    }
                    this.f46f.setWriteAheadLoggingEnabled(this.f47g);
                }
                aVar = this.f46f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    @Override // z0.InterfaceC6611c, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a().close();
    }

    @Override // z0.InterfaceC6611c
    public String getDatabaseName() {
        return this.f42b;
    }

    @Override // z0.InterfaceC6611c
    public InterfaceC6610b getReadableDatabase() {
        return a().a();
    }

    @Override // z0.InterfaceC6611c
    public InterfaceC6610b getWritableDatabase() {
        return a().d();
    }

    @Override // z0.InterfaceC6611c
    public void setWriteAheadLoggingEnabled(boolean z8) {
        synchronized (this.f45e) {
            try {
                a aVar = this.f46f;
                if (aVar != null) {
                    aVar.setWriteAheadLoggingEnabled(z8);
                }
                this.f47g = z8;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
