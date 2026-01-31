package u1;

import android.database.sqlite.SQLiteDatabase;
import u1.C6398A;

/* loaded from: classes.dex */
final /* synthetic */ class p implements C6398A.d {

    /* renamed from: a, reason: collision with root package name */
    private final SQLiteDatabase f37088a;

    private p(SQLiteDatabase sQLiteDatabase) {
        this.f37088a = sQLiteDatabase;
    }

    public static C6398A.d lambdaFactory$(SQLiteDatabase sQLiteDatabase) {
        return new p(sQLiteDatabase);
    }

    @Override // u1.C6398A.d
    public Object produce() {
        return C6398A.k(this.f37088a);
    }
}
