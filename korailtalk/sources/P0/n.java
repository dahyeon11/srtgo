package P0;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import v0.AbstractC6423a;
import v0.C6425c;
import z0.InterfaceC6614f;

/* loaded from: classes.dex */
public final class n implements m {

    /* renamed from: a, reason: collision with root package name */
    private final androidx.room.h f3632a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC6423a f3633b;

    class a extends AbstractC6423a {
        a(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // v0.AbstractC6426d
        public String createQuery() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // v0.AbstractC6423a
        public void bind(InterfaceC6614f interfaceC6614f, l lVar) {
            String str = lVar.name;
            if (str == null) {
                interfaceC6614f.bindNull(1);
            } else {
                interfaceC6614f.bindString(1, str);
            }
            String str2 = lVar.workSpecId;
            if (str2 == null) {
                interfaceC6614f.bindNull(2);
            } else {
                interfaceC6614f.bindString(2, str2);
            }
        }
    }

    public n(androidx.room.h hVar) {
        this.f3632a = hVar;
        this.f3633b = new a(hVar);
    }

    @Override // P0.m
    public List<String> getNamesForWorkSpecId(String str) {
        C6425c c6425cAcquire = C6425c.acquire("SELECT name FROM workname WHERE work_spec_id=?", 1);
        if (str == null) {
            c6425cAcquire.bindNull(1);
        } else {
            c6425cAcquire.bindString(1, str);
        }
        this.f3632a.assertNotSuspendingTransaction();
        Cursor cursorQuery = x0.c.query(this.f3632a, c6425cAcquire, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(cursorQuery.getString(0));
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            c6425cAcquire.release();
        }
    }

    @Override // P0.m
    public List<String> getWorkSpecIdsWithName(String str) {
        C6425c c6425cAcquire = C6425c.acquire("SELECT work_spec_id FROM workname WHERE name=?", 1);
        if (str == null) {
            c6425cAcquire.bindNull(1);
        } else {
            c6425cAcquire.bindString(1, str);
        }
        this.f3632a.assertNotSuspendingTransaction();
        Cursor cursorQuery = x0.c.query(this.f3632a, c6425cAcquire, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(cursorQuery.getString(0));
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            c6425cAcquire.release();
        }
    }

    @Override // P0.m
    public void insert(l lVar) {
        this.f3632a.assertNotSuspendingTransaction();
        this.f3632a.beginTransaction();
        try {
            this.f3633b.insert(lVar);
            this.f3632a.setTransactionSuccessful();
        } finally {
            this.f3632a.endTransaction();
        }
    }
}
