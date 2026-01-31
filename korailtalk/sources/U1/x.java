package u1;

import android.database.sqlite.SQLiteDatabase;
import u1.C6398A;

/* loaded from: classes.dex */
final /* synthetic */ class x implements C6398A.b {

    /* renamed from: a, reason: collision with root package name */
    private final String f37098a;

    private x(String str) {
        this.f37098a = str;
    }

    public static C6398A.b lambdaFactory$(String str) {
        return new x(str);
    }

    @Override // u1.C6398A.b
    public Object apply(Object obj) {
        return C6398A.w(this.f37098a, (SQLiteDatabase) obj);
    }
}
