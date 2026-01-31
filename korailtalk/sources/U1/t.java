package u1;

import android.database.Cursor;
import u1.C6398A;

/* loaded from: classes.dex */
final /* synthetic */ class t implements C6398A.b {

    /* renamed from: a, reason: collision with root package name */
    private static final t f37092a = new t();

    private t() {
    }

    @Override // u1.C6398A.b
    public Object apply(Object obj) {
        return Boolean.valueOf(((Cursor) obj).moveToNext());
    }
}
