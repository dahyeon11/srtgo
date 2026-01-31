package u1;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import u1.C6403F;

/* renamed from: u1.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final /* synthetic */ class C6402E implements C6403F.a {

    /* renamed from: a, reason: collision with root package name */
    private static final C6402E f37054a = new C6402E();

    private C6402E() {
    }

    @Override // u1.C6403F.a
    public void upgrade(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
    }
}
