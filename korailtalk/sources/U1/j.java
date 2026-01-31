package u1;

import android.database.sqlite.SQLiteDatabase;
import u1.C6398A;

/* loaded from: classes.dex */
final /* synthetic */ class j implements C6398A.b {

    /* renamed from: a, reason: collision with root package name */
    private final C6398A f37080a;

    /* renamed from: b, reason: collision with root package name */
    private final o1.l f37081b;

    private j(C6398A c6398a, o1.l lVar) {
        this.f37080a = c6398a;
        this.f37081b = lVar;
    }

    public static C6398A.b lambdaFactory$(C6398A c6398a, o1.l lVar) {
        return new j(c6398a, lVar);
    }

    @Override // u1.C6398A.b
    public Object apply(Object obj) {
        return C6398A.s(this.f37080a, this.f37081b, (SQLiteDatabase) obj);
    }
}
