package u1;

import android.database.sqlite.SQLiteDatabase;
import u1.C6398A;

/* loaded from: classes.dex */
final /* synthetic */ class i implements C6398A.b {

    /* renamed from: a, reason: collision with root package name */
    private final long f37078a;

    /* renamed from: b, reason: collision with root package name */
    private final o1.l f37079b;

    private i(long j8, o1.l lVar) {
        this.f37078a = j8;
        this.f37079b = lVar;
    }

    public static C6398A.b lambdaFactory$(long j8, o1.l lVar) {
        return new i(j8, lVar);
    }

    @Override // u1.C6398A.b
    public Object apply(Object obj) {
        return C6398A.x(this.f37078a, this.f37079b, (SQLiteDatabase) obj);
    }
}
