package A0;

import android.database.sqlite.SQLiteStatement;
import z0.InterfaceC6614f;

/* loaded from: classes.dex */
class e extends d implements InterfaceC6614f {

    /* renamed from: b, reason: collision with root package name */
    private final SQLiteStatement f54b;

    e(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f54b = sQLiteStatement;
    }

    @Override // z0.InterfaceC6614f
    public void execute() {
        this.f54b.execute();
    }

    @Override // z0.InterfaceC6614f
    public long executeInsert() {
        return this.f54b.executeInsert();
    }

    @Override // z0.InterfaceC6614f
    public int executeUpdateDelete() {
        return this.f54b.executeUpdateDelete();
    }

    @Override // z0.InterfaceC6614f
    public long simpleQueryForLong() {
        return this.f54b.simpleQueryForLong();
    }

    @Override // z0.InterfaceC6614f
    public String simpleQueryForString() {
        return this.f54b.simpleQueryForString();
    }
}
