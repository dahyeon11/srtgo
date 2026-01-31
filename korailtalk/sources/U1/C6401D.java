package u1;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import u1.C6403F;

/* renamed from: u1.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final /* synthetic */ class C6401D implements C6403F.a {

    /* renamed from: a, reason: collision with root package name */
    private static final C6401D f37053a = new C6401D();

    private C6401D() {
    }

    @Override // u1.C6403F.a
    public void upgrade(SQLiteDatabase sQLiteDatabase) throws SQLException {
        C6403F.c(sQLiteDatabase);
    }
}
