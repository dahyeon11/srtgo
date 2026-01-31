package P0;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import v0.AbstractC6423a;
import v0.AbstractC6426d;
import v0.C6425c;
import x0.AbstractC6482b;
import z0.InterfaceC6614f;

/* loaded from: classes.dex */
public final class k implements j {

    /* renamed from: a, reason: collision with root package name */
    private final androidx.room.h f3627a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC6423a f3628b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC6426d f3629c;

    class a extends AbstractC6423a {
        a(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // v0.AbstractC6426d
        public String createQuery() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
        }

        @Override // v0.AbstractC6423a
        public void bind(InterfaceC6614f interfaceC6614f, i iVar) {
            String str = iVar.workSpecId;
            if (str == null) {
                interfaceC6614f.bindNull(1);
            } else {
                interfaceC6614f.bindString(1, str);
            }
            interfaceC6614f.bindLong(2, iVar.systemId);
        }
    }

    class b extends AbstractC6426d {
        b(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // v0.AbstractC6426d
        public String createQuery() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public k(androidx.room.h hVar) {
        this.f3627a = hVar;
        this.f3628b = new a(hVar);
        this.f3629c = new b(hVar);
    }

    @Override // P0.j
    public i getSystemIdInfo(String str) {
        C6425c c6425cAcquire = C6425c.acquire("SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (str == null) {
            c6425cAcquire.bindNull(1);
        } else {
            c6425cAcquire.bindString(1, str);
        }
        this.f3627a.assertNotSuspendingTransaction();
        Cursor cursorQuery = x0.c.query(this.f3627a, c6425cAcquire, false, null);
        try {
            return cursorQuery.moveToFirst() ? new i(cursorQuery.getString(AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "work_spec_id")), cursorQuery.getInt(AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "system_id"))) : null;
        } finally {
            cursorQuery.close();
            c6425cAcquire.release();
        }
    }

    @Override // P0.j
    public List<String> getWorkSpecIds() {
        C6425c c6425cAcquire = C6425c.acquire("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        this.f3627a.assertNotSuspendingTransaction();
        Cursor cursorQuery = x0.c.query(this.f3627a, c6425cAcquire, false, null);
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

    @Override // P0.j
    public void insertSystemIdInfo(i iVar) {
        this.f3627a.assertNotSuspendingTransaction();
        this.f3627a.beginTransaction();
        try {
            this.f3628b.insert(iVar);
            this.f3627a.setTransactionSuccessful();
        } finally {
            this.f3627a.endTransaction();
        }
    }

    @Override // P0.j
    public void removeSystemIdInfo(String str) {
        this.f3627a.assertNotSuspendingTransaction();
        InterfaceC6614f interfaceC6614fAcquire = this.f3629c.acquire();
        if (str == null) {
            interfaceC6614fAcquire.bindNull(1);
        } else {
            interfaceC6614fAcquire.bindString(1, str);
        }
        this.f3627a.beginTransaction();
        try {
            interfaceC6614fAcquire.executeUpdateDelete();
            this.f3627a.setTransactionSuccessful();
        } finally {
            this.f3627a.endTransaction();
            this.f3629c.release(interfaceC6614fAcquire);
        }
    }
}
