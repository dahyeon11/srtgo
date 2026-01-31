package u1;

import android.database.sqlite.SQLiteDatabase;
import u1.C6398A;

/* loaded from: classes.dex */
final /* synthetic */ class z implements C6398A.b {

    /* renamed from: a, reason: collision with root package name */
    private final C6398A f37100a;

    /* renamed from: b, reason: collision with root package name */
    private final o1.l f37101b;

    private z(C6398A c6398a, o1.l lVar) {
        this.f37100a = c6398a;
        this.f37101b = lVar;
    }

    public static C6398A.b lambdaFactory$(C6398A c6398a, o1.l lVar) {
        return new z(c6398a, lVar);
    }

    @Override // u1.C6398A.b
    public Object apply(Object obj) {
        return C6398A.p(this.f37100a, this.f37101b, (SQLiteDatabase) obj);
    }
}
