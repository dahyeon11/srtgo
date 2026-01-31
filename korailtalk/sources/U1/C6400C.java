package u1;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import u1.C6403F;

/* renamed from: u1.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final /* synthetic */ class C6400C implements C6403F.a {

    /* renamed from: a, reason: collision with root package name */
    private static final C6400C f37052a = new C6400C();

    private C6400C() {
    }

    @Override // u1.C6403F.a
    public void upgrade(SQLiteDatabase sQLiteDatabase) throws SQLException {
        C6403F.b(sQLiteDatabase);
    }
}
