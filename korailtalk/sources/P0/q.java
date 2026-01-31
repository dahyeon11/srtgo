package P0;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import v0.AbstractC6423a;
import v0.AbstractC6426d;
import v0.C6425c;
import z0.InterfaceC6614f;

/* loaded from: classes.dex */
public final class q implements p {

    /* renamed from: a, reason: collision with root package name */
    private final androidx.room.h f3635a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC6423a f3636b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC6426d f3637c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC6426d f3638d;

    class a extends AbstractC6423a {
        a(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // v0.AbstractC6426d
        public String createQuery() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        @Override // v0.AbstractC6423a
        public void bind(InterfaceC6614f interfaceC6614f, o oVar) throws Throwable {
            String str = oVar.mWorkSpecId;
            if (str == null) {
                interfaceC6614f.bindNull(1);
            } else {
                interfaceC6614f.bindString(1, str);
            }
            byte[] byteArrayInternal = androidx.work.b.toByteArrayInternal(oVar.mProgress);
            if (byteArrayInternal == null) {
                interfaceC6614f.bindNull(2);
            } else {
                interfaceC6614f.bindBlob(2, byteArrayInternal);
            }
        }
    }

    class b extends AbstractC6426d {
        b(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // v0.AbstractC6426d
        public String createQuery() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    class c extends AbstractC6426d {
        c(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // v0.AbstractC6426d
        public String createQuery() {
            return "DELETE FROM WorkProgress";
        }
    }

    public q(androidx.room.h hVar) {
        this.f3635a = hVar;
        this.f3636b = new a(hVar);
        this.f3637c = new b(hVar);
        this.f3638d = new c(hVar);
    }

    @Override // P0.p
    public void delete(String str) {
        this.f3635a.assertNotSuspendingTransaction();
        InterfaceC6614f interfaceC6614fAcquire = this.f3637c.acquire();
        if (str == null) {
            interfaceC6614fAcquire.bindNull(1);
        } else {
            interfaceC6614fAcquire.bindString(1, str);
        }
        this.f3635a.beginTransaction();
        try {
            interfaceC6614fAcquire.executeUpdateDelete();
            this.f3635a.setTransactionSuccessful();
        } finally {
            this.f3635a.endTransaction();
            this.f3637c.release(interfaceC6614fAcquire);
        }
    }

    @Override // P0.p
    public void deleteAll() {
        this.f3635a.assertNotSuspendingTransaction();
        InterfaceC6614f interfaceC6614fAcquire = this.f3638d.acquire();
        this.f3635a.beginTransaction();
        try {
            interfaceC6614fAcquire.executeUpdateDelete();
            this.f3635a.setTransactionSuccessful();
        } finally {
            this.f3635a.endTransaction();
            this.f3638d.release(interfaceC6614fAcquire);
        }
    }

    @Override // P0.p
    public androidx.work.b getProgressForWorkSpecId(String str) {
        C6425c c6425cAcquire = C6425c.acquire("SELECT progress FROM WorkProgress WHERE work_spec_id=?", 1);
        if (str == null) {
            c6425cAcquire.bindNull(1);
        } else {
            c6425cAcquire.bindString(1, str);
        }
        this.f3635a.assertNotSuspendingTransaction();
        Cursor cursorQuery = x0.c.query(this.f3635a, c6425cAcquire, false, null);
        try {
            return cursorQuery.moveToFirst() ? androidx.work.b.fromByteArray(cursorQuery.getBlob(0)) : null;
        } finally {
            cursorQuery.close();
            c6425cAcquire.release();
        }
    }

    @Override // P0.p
    public List<androidx.work.b> getProgressForWorkSpecIds(List<String> list) {
        StringBuilder sbNewStringBuilder = x0.f.newStringBuilder();
        sbNewStringBuilder.append("SELECT progress FROM WorkProgress WHERE work_spec_id IN (");
        int size = list.size();
        x0.f.appendPlaceholders(sbNewStringBuilder, size);
        sbNewStringBuilder.append(")");
        C6425c c6425cAcquire = C6425c.acquire(sbNewStringBuilder.toString(), size);
        int i8 = 1;
        for (String str : list) {
            if (str == null) {
                c6425cAcquire.bindNull(i8);
            } else {
                c6425cAcquire.bindString(i8, str);
            }
            i8++;
        }
        this.f3635a.assertNotSuspendingTransaction();
        Cursor cursorQuery = x0.c.query(this.f3635a, c6425cAcquire, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(androidx.work.b.fromByteArray(cursorQuery.getBlob(0)));
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            c6425cAcquire.release();
        }
    }

    @Override // P0.p
    public void insert(o oVar) {
        this.f3635a.assertNotSuspendingTransaction();
        this.f3635a.beginTransaction();
        try {
            this.f3636b.insert(oVar);
            this.f3635a.setTransactionSuccessful();
        } finally {
            this.f3635a.endTransaction();
        }
    }
}
