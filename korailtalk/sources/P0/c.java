package P0;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import v0.AbstractC6423a;
import v0.C6425c;
import z0.InterfaceC6614f;

/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    private final androidx.room.h f3616a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC6423a f3617b;

    class a extends AbstractC6423a {
        a(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // v0.AbstractC6426d
        public String createQuery() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        @Override // v0.AbstractC6423a
        public void bind(InterfaceC6614f interfaceC6614f, P0.a aVar) {
            String str = aVar.workSpecId;
            if (str == null) {
                interfaceC6614f.bindNull(1);
            } else {
                interfaceC6614f.bindString(1, str);
            }
            String str2 = aVar.prerequisiteId;
            if (str2 == null) {
                interfaceC6614f.bindNull(2);
            } else {
                interfaceC6614f.bindString(2, str2);
            }
        }
    }

    public c(androidx.room.h hVar) {
        this.f3616a = hVar;
        this.f3617b = new a(hVar);
    }

    @Override // P0.b
    public List<String> getDependentWorkIds(String str) {
        C6425c c6425cAcquire = C6425c.acquire("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            c6425cAcquire.bindNull(1);
        } else {
            c6425cAcquire.bindString(1, str);
        }
        this.f3616a.assertNotSuspendingTransaction();
        Cursor cursorQuery = x0.c.query(this.f3616a, c6425cAcquire, false, null);
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

    @Override // P0.b
    public List<String> getPrerequisites(String str) {
        C6425c c6425cAcquire = C6425c.acquire("SELECT prerequisite_id FROM dependency WHERE work_spec_id=?", 1);
        if (str == null) {
            c6425cAcquire.bindNull(1);
        } else {
            c6425cAcquire.bindString(1, str);
        }
        this.f3616a.assertNotSuspendingTransaction();
        Cursor cursorQuery = x0.c.query(this.f3616a, c6425cAcquire, false, null);
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

    @Override // P0.b
    public boolean hasCompletedAllPrerequisites(String str) {
        C6425c c6425cAcquire = C6425c.acquire("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            c6425cAcquire.bindNull(1);
        } else {
            c6425cAcquire.bindString(1, str);
        }
        this.f3616a.assertNotSuspendingTransaction();
        boolean z8 = false;
        Cursor cursorQuery = x0.c.query(this.f3616a, c6425cAcquire, false, null);
        try {
            if (cursorQuery.moveToFirst()) {
                z8 = cursorQuery.getInt(0) != 0;
            }
            return z8;
        } finally {
            cursorQuery.close();
            c6425cAcquire.release();
        }
    }

    @Override // P0.b
    public boolean hasDependents(String str) {
        C6425c c6425cAcquire = C6425c.acquire("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            c6425cAcquire.bindNull(1);
        } else {
            c6425cAcquire.bindString(1, str);
        }
        this.f3616a.assertNotSuspendingTransaction();
        boolean z8 = false;
        Cursor cursorQuery = x0.c.query(this.f3616a, c6425cAcquire, false, null);
        try {
            if (cursorQuery.moveToFirst()) {
                z8 = cursorQuery.getInt(0) != 0;
            }
            return z8;
        } finally {
            cursorQuery.close();
            c6425cAcquire.release();
        }
    }

    @Override // P0.b
    public void insertDependency(P0.a aVar) {
        this.f3616a.assertNotSuspendingTransaction();
        this.f3616a.beginTransaction();
        try {
            this.f3617b.insert(aVar);
            this.f3616a.setTransactionSuccessful();
        } finally {
            this.f3616a.endTransaction();
        }
    }
}
