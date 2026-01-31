package u1;

import android.database.Cursor;
import java.util.Map;
import u1.C6398A;

/* loaded from: classes.dex */
final /* synthetic */ class o implements C6398A.b {

    /* renamed from: a, reason: collision with root package name */
    private final Map f37087a;

    private o(Map map) {
        this.f37087a = map;
    }

    public static C6398A.b lambdaFactory$(Map map) {
        return new o(map);
    }

    @Override // u1.C6398A.b
    public Object apply(Object obj) {
        return C6398A.u(this.f37087a, (Cursor) obj);
    }
}
