package u1;

import android.database.Cursor;
import java.util.List;
import u1.C6398A;

/* loaded from: classes.dex */
final /* synthetic */ class n implements C6398A.b {

    /* renamed from: a, reason: collision with root package name */
    private final List f37085a;

    /* renamed from: b, reason: collision with root package name */
    private final o1.l f37086b;

    private n(List list, o1.l lVar) {
        this.f37085a = list;
        this.f37086b = lVar;
    }

    public static C6398A.b lambdaFactory$(List list, o1.l lVar) {
        return new n(list, lVar);
    }

    @Override // u1.C6398A.b
    public Object apply(Object obj) {
        return C6398A.t(this.f37085a, this.f37086b, (Cursor) obj);
    }
}
