package A0;

import android.database.sqlite.SQLiteProgram;
import z0.InterfaceC6612d;

/* loaded from: classes.dex */
class d implements InterfaceC6612d {

    /* renamed from: a, reason: collision with root package name */
    private final SQLiteProgram f53a;

    d(SQLiteProgram sQLiteProgram) {
        this.f53a = sQLiteProgram;
    }

    @Override // z0.InterfaceC6612d
    public void bindBlob(int i8, byte[] bArr) {
        this.f53a.bindBlob(i8, bArr);
    }

    @Override // z0.InterfaceC6612d
    public void bindDouble(int i8, double d9) {
        this.f53a.bindDouble(i8, d9);
    }

    @Override // z0.InterfaceC6612d
    public void bindLong(int i8, long j8) {
        this.f53a.bindLong(i8, j8);
    }

    @Override // z0.InterfaceC6612d
    public void bindNull(int i8) {
        this.f53a.bindNull(i8);
    }

    @Override // z0.InterfaceC6612d
    public void bindString(int i8, String str) {
        this.f53a.bindString(i8, str);
    }

    @Override // z0.InterfaceC6612d
    public void clearBindings() {
        this.f53a.clearBindings();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f53a.close();
    }
}
