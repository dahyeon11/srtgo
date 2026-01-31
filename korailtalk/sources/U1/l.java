package u1;

import android.database.sqlite.SQLiteDatabase;
import u1.C6398A;

/* loaded from: classes.dex */
final /* synthetic */ class l implements C6398A.b {

    /* renamed from: a, reason: collision with root package name */
    private final long f37083a;

    private l(long j8) {
        this.f37083a = j8;
    }

    public static C6398A.b lambdaFactory$(long j8) {
        return new l(j8);
    }

    @Override // u1.C6398A.b
    public Object apply(Object obj) {
        return Integer.valueOf(((SQLiteDatabase) obj).delete("events", "timestamp_ms < ?", new String[]{String.valueOf(this.f37083a)}));
    }
}
