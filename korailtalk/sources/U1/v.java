package u1;

import android.database.sqlite.SQLiteDatabase;
import u1.C6398A;

/* loaded from: classes.dex */
final /* synthetic */ class v implements C6398A.b {

    /* renamed from: a, reason: collision with root package name */
    private final C6398A f37094a;

    /* renamed from: b, reason: collision with root package name */
    private final o1.l f37095b;

    /* renamed from: c, reason: collision with root package name */
    private final o1.h f37096c;

    private v(C6398A c6398a, o1.l lVar, o1.h hVar) {
        this.f37094a = c6398a;
        this.f37095b = lVar;
        this.f37096c = hVar;
    }

    public static C6398A.b lambdaFactory$(C6398A c6398a, o1.l lVar, o1.h hVar) {
        return new v(c6398a, lVar, hVar);
    }

    @Override // u1.C6398A.b
    public Object apply(Object obj) {
        return C6398A.v(this.f37094a, this.f37095b, this.f37096c, (SQLiteDatabase) obj);
    }
}
