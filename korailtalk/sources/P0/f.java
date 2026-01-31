package P0;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import java.util.concurrent.Callable;
import v0.AbstractC6423a;
import v0.C6425c;
import z0.InterfaceC6614f;

/* loaded from: classes.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    private final androidx.room.h f3619a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC6423a f3620b;

    class a extends AbstractC6423a {
        a(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // v0.AbstractC6426d
        public String createQuery() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        @Override // v0.AbstractC6423a
        public void bind(InterfaceC6614f interfaceC6614f, d dVar) {
            String str = dVar.mKey;
            if (str == null) {
                interfaceC6614f.bindNull(1);
            } else {
                interfaceC6614f.bindString(1, str);
            }
            Long l8 = dVar.mValue;
            if (l8 == null) {
                interfaceC6614f.bindNull(2);
            } else {
                interfaceC6614f.bindLong(2, l8.longValue());
            }
        }
    }

    class b implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C6425c f3622a;

        b(C6425c c6425c) {
            this.f3622a = c6425c;
        }

        protected void finalize() {
            this.f3622a.release();
        }

        @Override // java.util.concurrent.Callable
        public Long call() {
            Long lValueOf = null;
            Cursor cursorQuery = x0.c.query(f.this.f3619a, this.f3622a, false, null);
            try {
                if (cursorQuery.moveToFirst() && !cursorQuery.isNull(0)) {
                    lValueOf = Long.valueOf(cursorQuery.getLong(0));
                }
                return lValueOf;
            } finally {
                cursorQuery.close();
            }
        }
    }

    public f(androidx.room.h hVar) {
        this.f3619a = hVar;
        this.f3620b = new a(hVar);
    }

    @Override // P0.e
    public Long getLongValue(String str) {
        C6425c c6425cAcquire = C6425c.acquire("SELECT long_value FROM Preference where `key`=?", 1);
        if (str == null) {
            c6425cAcquire.bindNull(1);
        } else {
            c6425cAcquire.bindString(1, str);
        }
        this.f3619a.assertNotSuspendingTransaction();
        Long lValueOf = null;
        Cursor cursorQuery = x0.c.query(this.f3619a, c6425cAcquire, false, null);
        try {
            if (cursorQuery.moveToFirst() && !cursorQuery.isNull(0)) {
                lValueOf = Long.valueOf(cursorQuery.getLong(0));
            }
            return lValueOf;
        } finally {
            cursorQuery.close();
            c6425cAcquire.release();
        }
    }

    @Override // P0.e
    public LiveData getObservableLongValue(String str) {
        C6425c c6425cAcquire = C6425c.acquire("SELECT long_value FROM Preference where `key`=?", 1);
        if (str == null) {
            c6425cAcquire.bindNull(1);
        } else {
            c6425cAcquire.bindString(1, str);
        }
        return this.f3619a.getInvalidationTracker().createLiveData(new String[]{"Preference"}, false, new b(c6425cAcquire));
    }

    @Override // P0.e
    public void insertPreference(d dVar) {
        this.f3619a.assertNotSuspendingTransaction();
        this.f3619a.beginTransaction();
        try {
            this.f3620b.insert(dVar);
            this.f3619a.setTransactionSuccessful();
        } finally {
            this.f3619a.endTransaction();
        }
    }
}
