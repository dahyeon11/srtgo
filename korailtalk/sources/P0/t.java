package P0;

import H0.v;
import P0.r;
import android.database.Cursor;
import androidx.lifecycle.LiveData;
import com.kakao.sdk.user.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import v0.AbstractC6423a;
import v0.AbstractC6426d;
import v0.C6425c;
import x0.AbstractC6482b;
import z0.InterfaceC6614f;

/* loaded from: classes.dex */
public final class t implements s {

    /* renamed from: a, reason: collision with root package name */
    private final androidx.room.h f3643a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC6423a f3644b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC6426d f3645c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC6426d f3646d;

    /* renamed from: e, reason: collision with root package name */
    private final AbstractC6426d f3647e;

    /* renamed from: f, reason: collision with root package name */
    private final AbstractC6426d f3648f;

    /* renamed from: g, reason: collision with root package name */
    private final AbstractC6426d f3649g;

    /* renamed from: h, reason: collision with root package name */
    private final AbstractC6426d f3650h;

    /* renamed from: i, reason: collision with root package name */
    private final AbstractC6426d f3651i;

    /* renamed from: j, reason: collision with root package name */
    private final AbstractC6426d f3652j;

    class a implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C6425c f3653a;

        a(C6425c c6425c) {
            this.f3653a = c6425c;
        }

        protected void finalize() {
            this.f3653a.release();
        }

        @Override // java.util.concurrent.Callable
        public List<String> call() {
            t.this.f3643a.beginTransaction();
            try {
                Cursor cursorQuery = x0.c.query(t.this.f3643a, this.f3653a, false, null);
                try {
                    ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                    while (cursorQuery.moveToNext()) {
                        arrayList.add(cursorQuery.getString(0));
                    }
                    t.this.f3643a.setTransactionSuccessful();
                    cursorQuery.close();
                    return arrayList;
                } catch (Throwable th) {
                    cursorQuery.close();
                    throw th;
                }
            } finally {
                t.this.f3643a.endTransaction();
            }
        }
    }

    class b implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C6425c f3655a;

        b(C6425c c6425c) {
            this.f3655a = c6425c;
        }

        protected void finalize() {
            this.f3655a.release();
        }

        @Override // java.util.concurrent.Callable
        public List<r.c> call() {
            t.this.f3643a.beginTransaction();
            try {
                Cursor cursorQuery = x0.c.query(t.this.f3643a, this.f3655a, true, null);
                try {
                    int columnIndexOrThrow = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, Constants.ID);
                    int columnIndexOrThrow2 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "state");
                    int columnIndexOrThrow3 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "output");
                    int columnIndexOrThrow4 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "run_attempt_count");
                    O.a aVar = new O.a();
                    O.a aVar2 = new O.a();
                    while (cursorQuery.moveToNext()) {
                        if (!cursorQuery.isNull(columnIndexOrThrow)) {
                            String string = cursorQuery.getString(columnIndexOrThrow);
                            if (((ArrayList) aVar.get(string)) == null) {
                                aVar.put(string, new ArrayList());
                            }
                        }
                        if (!cursorQuery.isNull(columnIndexOrThrow)) {
                            String string2 = cursorQuery.getString(columnIndexOrThrow);
                            if (((ArrayList) aVar2.get(string2)) == null) {
                                aVar2.put(string2, new ArrayList());
                            }
                        }
                    }
                    cursorQuery.moveToPosition(-1);
                    t.this.b(aVar);
                    t.this.a(aVar2);
                    ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                    while (cursorQuery.moveToNext()) {
                        ArrayList arrayList2 = !cursorQuery.isNull(columnIndexOrThrow) ? (ArrayList) aVar.get(cursorQuery.getString(columnIndexOrThrow)) : null;
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        ArrayList arrayList3 = !cursorQuery.isNull(columnIndexOrThrow) ? (ArrayList) aVar2.get(cursorQuery.getString(columnIndexOrThrow)) : null;
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        r.c cVar = new r.c();
                        cVar.id = cursorQuery.getString(columnIndexOrThrow);
                        cVar.state = x.intToState(cursorQuery.getInt(columnIndexOrThrow2));
                        cVar.output = androidx.work.b.fromByteArray(cursorQuery.getBlob(columnIndexOrThrow3));
                        cVar.runAttemptCount = cursorQuery.getInt(columnIndexOrThrow4);
                        cVar.tags = arrayList2;
                        cVar.progress = arrayList3;
                        arrayList.add(cVar);
                    }
                    t.this.f3643a.setTransactionSuccessful();
                    cursorQuery.close();
                    return arrayList;
                } catch (Throwable th) {
                    cursorQuery.close();
                    throw th;
                }
            } finally {
                t.this.f3643a.endTransaction();
            }
        }
    }

    class c implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C6425c f3657a;

        c(C6425c c6425c) {
            this.f3657a = c6425c;
        }

        protected void finalize() {
            this.f3657a.release();
        }

        @Override // java.util.concurrent.Callable
        public List<r.c> call() {
            t.this.f3643a.beginTransaction();
            try {
                Cursor cursorQuery = x0.c.query(t.this.f3643a, this.f3657a, true, null);
                try {
                    int columnIndexOrThrow = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, Constants.ID);
                    int columnIndexOrThrow2 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "state");
                    int columnIndexOrThrow3 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "output");
                    int columnIndexOrThrow4 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "run_attempt_count");
                    O.a aVar = new O.a();
                    O.a aVar2 = new O.a();
                    while (cursorQuery.moveToNext()) {
                        if (!cursorQuery.isNull(columnIndexOrThrow)) {
                            String string = cursorQuery.getString(columnIndexOrThrow);
                            if (((ArrayList) aVar.get(string)) == null) {
                                aVar.put(string, new ArrayList());
                            }
                        }
                        if (!cursorQuery.isNull(columnIndexOrThrow)) {
                            String string2 = cursorQuery.getString(columnIndexOrThrow);
                            if (((ArrayList) aVar2.get(string2)) == null) {
                                aVar2.put(string2, new ArrayList());
                            }
                        }
                    }
                    cursorQuery.moveToPosition(-1);
                    t.this.b(aVar);
                    t.this.a(aVar2);
                    ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                    while (cursorQuery.moveToNext()) {
                        ArrayList arrayList2 = !cursorQuery.isNull(columnIndexOrThrow) ? (ArrayList) aVar.get(cursorQuery.getString(columnIndexOrThrow)) : null;
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        ArrayList arrayList3 = !cursorQuery.isNull(columnIndexOrThrow) ? (ArrayList) aVar2.get(cursorQuery.getString(columnIndexOrThrow)) : null;
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        r.c cVar = new r.c();
                        cVar.id = cursorQuery.getString(columnIndexOrThrow);
                        cVar.state = x.intToState(cursorQuery.getInt(columnIndexOrThrow2));
                        cVar.output = androidx.work.b.fromByteArray(cursorQuery.getBlob(columnIndexOrThrow3));
                        cVar.runAttemptCount = cursorQuery.getInt(columnIndexOrThrow4);
                        cVar.tags = arrayList2;
                        cVar.progress = arrayList3;
                        arrayList.add(cVar);
                    }
                    t.this.f3643a.setTransactionSuccessful();
                    cursorQuery.close();
                    return arrayList;
                } catch (Throwable th) {
                    cursorQuery.close();
                    throw th;
                }
            } finally {
                t.this.f3643a.endTransaction();
            }
        }
    }

    class d implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C6425c f3659a;

        d(C6425c c6425c) {
            this.f3659a = c6425c;
        }

        protected void finalize() {
            this.f3659a.release();
        }

        @Override // java.util.concurrent.Callable
        public List<r.c> call() {
            t.this.f3643a.beginTransaction();
            try {
                Cursor cursorQuery = x0.c.query(t.this.f3643a, this.f3659a, true, null);
                try {
                    int columnIndexOrThrow = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, Constants.ID);
                    int columnIndexOrThrow2 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "state");
                    int columnIndexOrThrow3 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "output");
                    int columnIndexOrThrow4 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "run_attempt_count");
                    O.a aVar = new O.a();
                    O.a aVar2 = new O.a();
                    while (cursorQuery.moveToNext()) {
                        if (!cursorQuery.isNull(columnIndexOrThrow)) {
                            String string = cursorQuery.getString(columnIndexOrThrow);
                            if (((ArrayList) aVar.get(string)) == null) {
                                aVar.put(string, new ArrayList());
                            }
                        }
                        if (!cursorQuery.isNull(columnIndexOrThrow)) {
                            String string2 = cursorQuery.getString(columnIndexOrThrow);
                            if (((ArrayList) aVar2.get(string2)) == null) {
                                aVar2.put(string2, new ArrayList());
                            }
                        }
                    }
                    cursorQuery.moveToPosition(-1);
                    t.this.b(aVar);
                    t.this.a(aVar2);
                    ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                    while (cursorQuery.moveToNext()) {
                        ArrayList arrayList2 = !cursorQuery.isNull(columnIndexOrThrow) ? (ArrayList) aVar.get(cursorQuery.getString(columnIndexOrThrow)) : null;
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        ArrayList arrayList3 = !cursorQuery.isNull(columnIndexOrThrow) ? (ArrayList) aVar2.get(cursorQuery.getString(columnIndexOrThrow)) : null;
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        r.c cVar = new r.c();
                        cVar.id = cursorQuery.getString(columnIndexOrThrow);
                        cVar.state = x.intToState(cursorQuery.getInt(columnIndexOrThrow2));
                        cVar.output = androidx.work.b.fromByteArray(cursorQuery.getBlob(columnIndexOrThrow3));
                        cVar.runAttemptCount = cursorQuery.getInt(columnIndexOrThrow4);
                        cVar.tags = arrayList2;
                        cVar.progress = arrayList3;
                        arrayList.add(cVar);
                    }
                    t.this.f3643a.setTransactionSuccessful();
                    cursorQuery.close();
                    return arrayList;
                } catch (Throwable th) {
                    cursorQuery.close();
                    throw th;
                }
            } finally {
                t.this.f3643a.endTransaction();
            }
        }
    }

    class e implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C6425c f3661a;

        e(C6425c c6425c) {
            this.f3661a = c6425c;
        }

        protected void finalize() {
            this.f3661a.release();
        }

        @Override // java.util.concurrent.Callable
        public Long call() {
            Long lValueOf = null;
            Cursor cursorQuery = x0.c.query(t.this.f3643a, this.f3661a, false, null);
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

    class f extends AbstractC6423a {
        f(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // v0.AbstractC6426d
        public String createQuery() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // v0.AbstractC6423a
        public void bind(InterfaceC6614f interfaceC6614f, r rVar) throws Throwable {
            String str = rVar.id;
            if (str == null) {
                interfaceC6614f.bindNull(1);
            } else {
                interfaceC6614f.bindString(1, str);
            }
            interfaceC6614f.bindLong(2, x.stateToInt(rVar.state));
            String str2 = rVar.workerClassName;
            if (str2 == null) {
                interfaceC6614f.bindNull(3);
            } else {
                interfaceC6614f.bindString(3, str2);
            }
            String str3 = rVar.inputMergerClassName;
            if (str3 == null) {
                interfaceC6614f.bindNull(4);
            } else {
                interfaceC6614f.bindString(4, str3);
            }
            byte[] byteArrayInternal = androidx.work.b.toByteArrayInternal(rVar.input);
            if (byteArrayInternal == null) {
                interfaceC6614f.bindNull(5);
            } else {
                interfaceC6614f.bindBlob(5, byteArrayInternal);
            }
            byte[] byteArrayInternal2 = androidx.work.b.toByteArrayInternal(rVar.output);
            if (byteArrayInternal2 == null) {
                interfaceC6614f.bindNull(6);
            } else {
                interfaceC6614f.bindBlob(6, byteArrayInternal2);
            }
            interfaceC6614f.bindLong(7, rVar.initialDelay);
            interfaceC6614f.bindLong(8, rVar.intervalDuration);
            interfaceC6614f.bindLong(9, rVar.flexDuration);
            interfaceC6614f.bindLong(10, rVar.runAttemptCount);
            interfaceC6614f.bindLong(11, x.backoffPolicyToInt(rVar.backoffPolicy));
            interfaceC6614f.bindLong(12, rVar.backoffDelayDuration);
            interfaceC6614f.bindLong(13, rVar.periodStartTime);
            interfaceC6614f.bindLong(14, rVar.minimumRetentionDuration);
            interfaceC6614f.bindLong(15, rVar.scheduleRequestedAt);
            interfaceC6614f.bindLong(16, rVar.expedited ? 1L : 0L);
            interfaceC6614f.bindLong(17, x.outOfQuotaPolicyToInt(rVar.outOfQuotaPolicy));
            H0.c cVar = rVar.constraints;
            if (cVar == null) {
                interfaceC6614f.bindNull(18);
                interfaceC6614f.bindNull(19);
                interfaceC6614f.bindNull(20);
                interfaceC6614f.bindNull(21);
                interfaceC6614f.bindNull(22);
                interfaceC6614f.bindNull(23);
                interfaceC6614f.bindNull(24);
                interfaceC6614f.bindNull(25);
                return;
            }
            interfaceC6614f.bindLong(18, x.networkTypeToInt(cVar.getRequiredNetworkType()));
            interfaceC6614f.bindLong(19, cVar.requiresCharging() ? 1L : 0L);
            interfaceC6614f.bindLong(20, cVar.requiresDeviceIdle() ? 1L : 0L);
            interfaceC6614f.bindLong(21, cVar.requiresBatteryNotLow() ? 1L : 0L);
            interfaceC6614f.bindLong(22, cVar.requiresStorageNotLow() ? 1L : 0L);
            interfaceC6614f.bindLong(23, cVar.getTriggerContentUpdateDelay());
            interfaceC6614f.bindLong(24, cVar.getTriggerMaxContentDelay());
            byte[] bArrContentUriTriggersToByteArray = x.contentUriTriggersToByteArray(cVar.getContentUriTriggers());
            if (bArrContentUriTriggersToByteArray == null) {
                interfaceC6614f.bindNull(25);
            } else {
                interfaceC6614f.bindBlob(25, bArrContentUriTriggersToByteArray);
            }
        }
    }

    class g extends AbstractC6426d {
        g(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // v0.AbstractC6426d
        public String createQuery() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    class h extends AbstractC6426d {
        h(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // v0.AbstractC6426d
        public String createQuery() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    class i extends AbstractC6426d {
        i(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // v0.AbstractC6426d
        public String createQuery() {
            return "UPDATE workspec SET period_start_time=? WHERE id=?";
        }
    }

    class j extends AbstractC6426d {
        j(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // v0.AbstractC6426d
        public String createQuery() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    class k extends AbstractC6426d {
        k(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // v0.AbstractC6426d
        public String createQuery() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    class l extends AbstractC6426d {
        l(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // v0.AbstractC6426d
        public String createQuery() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    class m extends AbstractC6426d {
        m(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // v0.AbstractC6426d
        public String createQuery() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    class n extends AbstractC6426d {
        n(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // v0.AbstractC6426d
        public String createQuery() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    public t(androidx.room.h hVar) {
        this.f3643a = hVar;
        this.f3644b = new f(hVar);
        this.f3645c = new g(hVar);
        this.f3646d = new h(hVar);
        this.f3647e = new i(hVar);
        this.f3648f = new j(hVar);
        this.f3649g = new k(hVar);
        this.f3650h = new l(hVar);
        this.f3651i = new m(hVar);
        this.f3652j = new n(hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(O.a aVar) {
        ArrayList arrayList;
        Set<Object> setKeySet = aVar.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (aVar.size() > 999) {
            O.a aVar2 = new O.a(999);
            int size = aVar.size();
            int i8 = 0;
            int i9 = 0;
            while (i8 < size) {
                aVar2.put((String) aVar.keyAt(i8), (ArrayList) aVar.valueAt(i8));
                i8++;
                i9++;
                if (i9 == 999) {
                    a(aVar2);
                    aVar2 = new O.a(999);
                    i9 = 0;
                }
            }
            if (i9 > 0) {
                a(aVar2);
                return;
            }
            return;
        }
        StringBuilder sbNewStringBuilder = x0.f.newStringBuilder();
        sbNewStringBuilder.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int size2 = setKeySet.size();
        x0.f.appendPlaceholders(sbNewStringBuilder, size2);
        sbNewStringBuilder.append(")");
        C6425c c6425cAcquire = C6425c.acquire(sbNewStringBuilder.toString(), size2);
        Iterator<Object> it = setKeySet.iterator();
        int i10 = 1;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str == null) {
                c6425cAcquire.bindNull(i10);
            } else {
                c6425cAcquire.bindString(i10, str);
            }
            i10++;
        }
        Cursor cursorQuery = x0.c.query(this.f3643a, c6425cAcquire, false, null);
        try {
            int columnIndex = AbstractC6482b.getColumnIndex(cursorQuery, "work_spec_id");
            if (columnIndex == -1) {
                return;
            }
            while (cursorQuery.moveToNext()) {
                if (!cursorQuery.isNull(columnIndex) && (arrayList = (ArrayList) aVar.get(cursorQuery.getString(columnIndex))) != null) {
                    arrayList.add(androidx.work.b.fromByteArray(cursorQuery.getBlob(0)));
                }
            }
        } finally {
            cursorQuery.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(O.a aVar) {
        ArrayList arrayList;
        Set<Object> setKeySet = aVar.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (aVar.size() > 999) {
            O.a aVar2 = new O.a(999);
            int size = aVar.size();
            int i8 = 0;
            int i9 = 0;
            while (i8 < size) {
                aVar2.put((String) aVar.keyAt(i8), (ArrayList) aVar.valueAt(i8));
                i8++;
                i9++;
                if (i9 == 999) {
                    b(aVar2);
                    aVar2 = new O.a(999);
                    i9 = 0;
                }
            }
            if (i9 > 0) {
                b(aVar2);
                return;
            }
            return;
        }
        StringBuilder sbNewStringBuilder = x0.f.newStringBuilder();
        sbNewStringBuilder.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int size2 = setKeySet.size();
        x0.f.appendPlaceholders(sbNewStringBuilder, size2);
        sbNewStringBuilder.append(")");
        C6425c c6425cAcquire = C6425c.acquire(sbNewStringBuilder.toString(), size2);
        Iterator<Object> it = setKeySet.iterator();
        int i10 = 1;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str == null) {
                c6425cAcquire.bindNull(i10);
            } else {
                c6425cAcquire.bindString(i10, str);
            }
            i10++;
        }
        Cursor cursorQuery = x0.c.query(this.f3643a, c6425cAcquire, false, null);
        try {
            int columnIndex = AbstractC6482b.getColumnIndex(cursorQuery, "work_spec_id");
            if (columnIndex == -1) {
                return;
            }
            while (cursorQuery.moveToNext()) {
                if (!cursorQuery.isNull(columnIndex) && (arrayList = (ArrayList) aVar.get(cursorQuery.getString(columnIndex))) != null) {
                    arrayList.add(cursorQuery.getString(0));
                }
            }
        } finally {
            cursorQuery.close();
        }
    }

    @Override // P0.s
    public void delete(String str) {
        this.f3643a.assertNotSuspendingTransaction();
        InterfaceC6614f interfaceC6614fAcquire = this.f3645c.acquire();
        if (str == null) {
            interfaceC6614fAcquire.bindNull(1);
        } else {
            interfaceC6614fAcquire.bindString(1, str);
        }
        this.f3643a.beginTransaction();
        try {
            interfaceC6614fAcquire.executeUpdateDelete();
            this.f3643a.setTransactionSuccessful();
        } finally {
            this.f3643a.endTransaction();
            this.f3645c.release(interfaceC6614fAcquire);
        }
    }

    @Override // P0.s
    public List<r> getAllEligibleWorkSpecsForScheduling(int i8) throws Throwable {
        C6425c c6425c;
        int columnIndexOrThrow;
        int columnIndexOrThrow2;
        int columnIndexOrThrow3;
        int columnIndexOrThrow4;
        int columnIndexOrThrow5;
        int columnIndexOrThrow6;
        int columnIndexOrThrow7;
        int columnIndexOrThrow8;
        int columnIndexOrThrow9;
        int columnIndexOrThrow10;
        int columnIndexOrThrow11;
        int columnIndexOrThrow12;
        int columnIndexOrThrow13;
        int columnIndexOrThrow14;
        C6425c c6425cAcquire = C6425c.acquire("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?", 1);
        c6425cAcquire.bindLong(1, i8);
        this.f3643a.assertNotSuspendingTransaction();
        Cursor cursorQuery = x0.c.query(this.f3643a, c6425cAcquire, false, null);
        try {
            columnIndexOrThrow = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "required_network_type");
            columnIndexOrThrow2 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "requires_charging");
            columnIndexOrThrow3 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "requires_device_idle");
            columnIndexOrThrow4 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "requires_battery_not_low");
            columnIndexOrThrow5 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "requires_storage_not_low");
            columnIndexOrThrow6 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "trigger_content_update_delay");
            columnIndexOrThrow7 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "trigger_max_content_delay");
            columnIndexOrThrow8 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "content_uri_triggers");
            columnIndexOrThrow9 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, Constants.ID);
            columnIndexOrThrow10 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "state");
            columnIndexOrThrow11 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "worker_class_name");
            columnIndexOrThrow12 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "input_merger_class_name");
            columnIndexOrThrow13 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "input");
            columnIndexOrThrow14 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "output");
            c6425c = c6425cAcquire;
        } catch (Throwable th) {
            th = th;
            c6425c = c6425cAcquire;
        }
        try {
            int columnIndexOrThrow15 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "initial_delay");
            int columnIndexOrThrow16 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "interval_duration");
            int columnIndexOrThrow17 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "flex_duration");
            int columnIndexOrThrow18 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "run_attempt_count");
            int columnIndexOrThrow19 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "backoff_policy");
            int columnIndexOrThrow20 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "backoff_delay_duration");
            int columnIndexOrThrow21 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "period_start_time");
            int columnIndexOrThrow22 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "minimum_retention_duration");
            int columnIndexOrThrow23 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "schedule_requested_at");
            int columnIndexOrThrow24 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "run_in_foreground");
            int columnIndexOrThrow25 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "out_of_quota_policy");
            int i9 = columnIndexOrThrow14;
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                String string = cursorQuery.getString(columnIndexOrThrow9);
                int i10 = columnIndexOrThrow9;
                String string2 = cursorQuery.getString(columnIndexOrThrow11);
                int i11 = columnIndexOrThrow11;
                H0.c cVar = new H0.c();
                int i12 = columnIndexOrThrow;
                cVar.setRequiredNetworkType(x.intToNetworkType(cursorQuery.getInt(columnIndexOrThrow)));
                cVar.setRequiresCharging(cursorQuery.getInt(columnIndexOrThrow2) != 0);
                cVar.setRequiresDeviceIdle(cursorQuery.getInt(columnIndexOrThrow3) != 0);
                cVar.setRequiresBatteryNotLow(cursorQuery.getInt(columnIndexOrThrow4) != 0);
                cVar.setRequiresStorageNotLow(cursorQuery.getInt(columnIndexOrThrow5) != 0);
                int i13 = columnIndexOrThrow2;
                int i14 = columnIndexOrThrow3;
                cVar.setTriggerContentUpdateDelay(cursorQuery.getLong(columnIndexOrThrow6));
                cVar.setTriggerMaxContentDelay(cursorQuery.getLong(columnIndexOrThrow7));
                cVar.setContentUriTriggers(x.byteArrayToContentUriTriggers(cursorQuery.getBlob(columnIndexOrThrow8)));
                r rVar = new r(string, string2);
                rVar.state = x.intToState(cursorQuery.getInt(columnIndexOrThrow10));
                rVar.inputMergerClassName = cursorQuery.getString(columnIndexOrThrow12);
                rVar.input = androidx.work.b.fromByteArray(cursorQuery.getBlob(columnIndexOrThrow13));
                int i15 = i9;
                rVar.output = androidx.work.b.fromByteArray(cursorQuery.getBlob(i15));
                i9 = i15;
                int i16 = columnIndexOrThrow15;
                rVar.initialDelay = cursorQuery.getLong(i16);
                int i17 = columnIndexOrThrow12;
                int i18 = columnIndexOrThrow16;
                rVar.intervalDuration = cursorQuery.getLong(i18);
                int i19 = columnIndexOrThrow4;
                int i20 = columnIndexOrThrow17;
                rVar.flexDuration = cursorQuery.getLong(i20);
                int i21 = columnIndexOrThrow18;
                rVar.runAttemptCount = cursorQuery.getInt(i21);
                int i22 = columnIndexOrThrow19;
                rVar.backoffPolicy = x.intToBackoffPolicy(cursorQuery.getInt(i22));
                columnIndexOrThrow17 = i20;
                int i23 = columnIndexOrThrow20;
                rVar.backoffDelayDuration = cursorQuery.getLong(i23);
                int i24 = columnIndexOrThrow21;
                rVar.periodStartTime = cursorQuery.getLong(i24);
                columnIndexOrThrow21 = i24;
                int i25 = columnIndexOrThrow22;
                rVar.minimumRetentionDuration = cursorQuery.getLong(i25);
                int i26 = columnIndexOrThrow23;
                rVar.scheduleRequestedAt = cursorQuery.getLong(i26);
                int i27 = columnIndexOrThrow24;
                rVar.expedited = cursorQuery.getInt(i27) != 0;
                int i28 = columnIndexOrThrow25;
                rVar.outOfQuotaPolicy = x.intToOutOfQuotaPolicy(cursorQuery.getInt(i28));
                rVar.constraints = cVar;
                arrayList.add(rVar);
                columnIndexOrThrow25 = i28;
                columnIndexOrThrow2 = i13;
                columnIndexOrThrow12 = i17;
                columnIndexOrThrow15 = i16;
                columnIndexOrThrow16 = i18;
                columnIndexOrThrow18 = i21;
                columnIndexOrThrow23 = i26;
                columnIndexOrThrow9 = i10;
                columnIndexOrThrow11 = i11;
                columnIndexOrThrow = i12;
                columnIndexOrThrow24 = i27;
                columnIndexOrThrow22 = i25;
                columnIndexOrThrow3 = i14;
                columnIndexOrThrow20 = i23;
                columnIndexOrThrow4 = i19;
                columnIndexOrThrow19 = i22;
            }
            cursorQuery.close();
            c6425c.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorQuery.close();
            c6425c.release();
            throw th;
        }
    }

    @Override // P0.s
    public List<String> getAllUnfinishedWork() {
        C6425c c6425cAcquire = C6425c.acquire("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)", 0);
        this.f3643a.assertNotSuspendingTransaction();
        Cursor cursorQuery = x0.c.query(this.f3643a, c6425cAcquire, false, null);
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

    @Override // P0.s
    public List<String> getAllWorkSpecIds() {
        C6425c c6425cAcquire = C6425c.acquire("SELECT id FROM workspec", 0);
        this.f3643a.assertNotSuspendingTransaction();
        Cursor cursorQuery = x0.c.query(this.f3643a, c6425cAcquire, false, null);
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

    @Override // P0.s
    public LiveData getAllWorkSpecIdsLiveData() {
        return this.f3643a.getInvalidationTracker().createLiveData(new String[]{"workspec"}, true, new a(C6425c.acquire("SELECT id FROM workspec", 0)));
    }

    @Override // P0.s
    public List<r> getEligibleWorkForScheduling(int i8) throws Throwable {
        C6425c c6425c;
        int columnIndexOrThrow;
        int columnIndexOrThrow2;
        int columnIndexOrThrow3;
        int columnIndexOrThrow4;
        int columnIndexOrThrow5;
        int columnIndexOrThrow6;
        int columnIndexOrThrow7;
        int columnIndexOrThrow8;
        int columnIndexOrThrow9;
        int columnIndexOrThrow10;
        int columnIndexOrThrow11;
        int columnIndexOrThrow12;
        int columnIndexOrThrow13;
        int columnIndexOrThrow14;
        C6425c c6425cAcquire = C6425c.acquire("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        c6425cAcquire.bindLong(1, i8);
        this.f3643a.assertNotSuspendingTransaction();
        Cursor cursorQuery = x0.c.query(this.f3643a, c6425cAcquire, false, null);
        try {
            columnIndexOrThrow = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "required_network_type");
            columnIndexOrThrow2 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "requires_charging");
            columnIndexOrThrow3 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "requires_device_idle");
            columnIndexOrThrow4 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "requires_battery_not_low");
            columnIndexOrThrow5 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "requires_storage_not_low");
            columnIndexOrThrow6 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "trigger_content_update_delay");
            columnIndexOrThrow7 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "trigger_max_content_delay");
            columnIndexOrThrow8 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "content_uri_triggers");
            columnIndexOrThrow9 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, Constants.ID);
            columnIndexOrThrow10 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "state");
            columnIndexOrThrow11 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "worker_class_name");
            columnIndexOrThrow12 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "input_merger_class_name");
            columnIndexOrThrow13 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "input");
            columnIndexOrThrow14 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "output");
            c6425c = c6425cAcquire;
        } catch (Throwable th) {
            th = th;
            c6425c = c6425cAcquire;
        }
        try {
            int columnIndexOrThrow15 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "initial_delay");
            int columnIndexOrThrow16 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "interval_duration");
            int columnIndexOrThrow17 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "flex_duration");
            int columnIndexOrThrow18 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "run_attempt_count");
            int columnIndexOrThrow19 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "backoff_policy");
            int columnIndexOrThrow20 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "backoff_delay_duration");
            int columnIndexOrThrow21 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "period_start_time");
            int columnIndexOrThrow22 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "minimum_retention_duration");
            int columnIndexOrThrow23 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "schedule_requested_at");
            int columnIndexOrThrow24 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "run_in_foreground");
            int columnIndexOrThrow25 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "out_of_quota_policy");
            int i9 = columnIndexOrThrow14;
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                String string = cursorQuery.getString(columnIndexOrThrow9);
                int i10 = columnIndexOrThrow9;
                String string2 = cursorQuery.getString(columnIndexOrThrow11);
                int i11 = columnIndexOrThrow11;
                H0.c cVar = new H0.c();
                int i12 = columnIndexOrThrow;
                cVar.setRequiredNetworkType(x.intToNetworkType(cursorQuery.getInt(columnIndexOrThrow)));
                cVar.setRequiresCharging(cursorQuery.getInt(columnIndexOrThrow2) != 0);
                cVar.setRequiresDeviceIdle(cursorQuery.getInt(columnIndexOrThrow3) != 0);
                cVar.setRequiresBatteryNotLow(cursorQuery.getInt(columnIndexOrThrow4) != 0);
                cVar.setRequiresStorageNotLow(cursorQuery.getInt(columnIndexOrThrow5) != 0);
                int i13 = columnIndexOrThrow2;
                int i14 = columnIndexOrThrow3;
                cVar.setTriggerContentUpdateDelay(cursorQuery.getLong(columnIndexOrThrow6));
                cVar.setTriggerMaxContentDelay(cursorQuery.getLong(columnIndexOrThrow7));
                cVar.setContentUriTriggers(x.byteArrayToContentUriTriggers(cursorQuery.getBlob(columnIndexOrThrow8)));
                r rVar = new r(string, string2);
                rVar.state = x.intToState(cursorQuery.getInt(columnIndexOrThrow10));
                rVar.inputMergerClassName = cursorQuery.getString(columnIndexOrThrow12);
                rVar.input = androidx.work.b.fromByteArray(cursorQuery.getBlob(columnIndexOrThrow13));
                int i15 = i9;
                rVar.output = androidx.work.b.fromByteArray(cursorQuery.getBlob(i15));
                i9 = i15;
                int i16 = columnIndexOrThrow15;
                rVar.initialDelay = cursorQuery.getLong(i16);
                int i17 = columnIndexOrThrow12;
                int i18 = columnIndexOrThrow16;
                rVar.intervalDuration = cursorQuery.getLong(i18);
                int i19 = columnIndexOrThrow4;
                int i20 = columnIndexOrThrow17;
                rVar.flexDuration = cursorQuery.getLong(i20);
                int i21 = columnIndexOrThrow18;
                rVar.runAttemptCount = cursorQuery.getInt(i21);
                int i22 = columnIndexOrThrow19;
                rVar.backoffPolicy = x.intToBackoffPolicy(cursorQuery.getInt(i22));
                columnIndexOrThrow17 = i20;
                int i23 = columnIndexOrThrow20;
                rVar.backoffDelayDuration = cursorQuery.getLong(i23);
                int i24 = columnIndexOrThrow21;
                rVar.periodStartTime = cursorQuery.getLong(i24);
                columnIndexOrThrow21 = i24;
                int i25 = columnIndexOrThrow22;
                rVar.minimumRetentionDuration = cursorQuery.getLong(i25);
                int i26 = columnIndexOrThrow23;
                rVar.scheduleRequestedAt = cursorQuery.getLong(i26);
                int i27 = columnIndexOrThrow24;
                rVar.expedited = cursorQuery.getInt(i27) != 0;
                int i28 = columnIndexOrThrow25;
                rVar.outOfQuotaPolicy = x.intToOutOfQuotaPolicy(cursorQuery.getInt(i28));
                rVar.constraints = cVar;
                arrayList.add(rVar);
                columnIndexOrThrow25 = i28;
                columnIndexOrThrow2 = i13;
                columnIndexOrThrow12 = i17;
                columnIndexOrThrow15 = i16;
                columnIndexOrThrow16 = i18;
                columnIndexOrThrow18 = i21;
                columnIndexOrThrow23 = i26;
                columnIndexOrThrow9 = i10;
                columnIndexOrThrow11 = i11;
                columnIndexOrThrow = i12;
                columnIndexOrThrow24 = i27;
                columnIndexOrThrow22 = i25;
                columnIndexOrThrow3 = i14;
                columnIndexOrThrow20 = i23;
                columnIndexOrThrow4 = i19;
                columnIndexOrThrow19 = i22;
            }
            cursorQuery.close();
            c6425c.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorQuery.close();
            c6425c.release();
            throw th;
        }
    }

    @Override // P0.s
    public List<androidx.work.b> getInputsFromPrerequisites(String str) {
        C6425c c6425cAcquire = C6425c.acquire("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (str == null) {
            c6425cAcquire.bindNull(1);
        } else {
            c6425cAcquire.bindString(1, str);
        }
        this.f3643a.assertNotSuspendingTransaction();
        Cursor cursorQuery = x0.c.query(this.f3643a, c6425cAcquire, false, null);
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

    @Override // P0.s
    public List<r> getRecentlyCompletedWork(long j8) throws Throwable {
        C6425c c6425c;
        int columnIndexOrThrow;
        int columnIndexOrThrow2;
        int columnIndexOrThrow3;
        int columnIndexOrThrow4;
        int columnIndexOrThrow5;
        int columnIndexOrThrow6;
        int columnIndexOrThrow7;
        int columnIndexOrThrow8;
        int columnIndexOrThrow9;
        int columnIndexOrThrow10;
        int columnIndexOrThrow11;
        int columnIndexOrThrow12;
        int columnIndexOrThrow13;
        int columnIndexOrThrow14;
        C6425c c6425cAcquire = C6425c.acquire("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC", 1);
        c6425cAcquire.bindLong(1, j8);
        this.f3643a.assertNotSuspendingTransaction();
        Cursor cursorQuery = x0.c.query(this.f3643a, c6425cAcquire, false, null);
        try {
            columnIndexOrThrow = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "required_network_type");
            columnIndexOrThrow2 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "requires_charging");
            columnIndexOrThrow3 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "requires_device_idle");
            columnIndexOrThrow4 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "requires_battery_not_low");
            columnIndexOrThrow5 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "requires_storage_not_low");
            columnIndexOrThrow6 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "trigger_content_update_delay");
            columnIndexOrThrow7 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "trigger_max_content_delay");
            columnIndexOrThrow8 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "content_uri_triggers");
            columnIndexOrThrow9 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, Constants.ID);
            columnIndexOrThrow10 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "state");
            columnIndexOrThrow11 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "worker_class_name");
            columnIndexOrThrow12 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "input_merger_class_name");
            columnIndexOrThrow13 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "input");
            columnIndexOrThrow14 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "output");
            c6425c = c6425cAcquire;
        } catch (Throwable th) {
            th = th;
            c6425c = c6425cAcquire;
        }
        try {
            int columnIndexOrThrow15 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "initial_delay");
            int columnIndexOrThrow16 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "interval_duration");
            int columnIndexOrThrow17 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "flex_duration");
            int columnIndexOrThrow18 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "run_attempt_count");
            int columnIndexOrThrow19 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "backoff_policy");
            int columnIndexOrThrow20 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "backoff_delay_duration");
            int columnIndexOrThrow21 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "period_start_time");
            int columnIndexOrThrow22 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "minimum_retention_duration");
            int columnIndexOrThrow23 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "schedule_requested_at");
            int columnIndexOrThrow24 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "run_in_foreground");
            int columnIndexOrThrow25 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "out_of_quota_policy");
            int i8 = columnIndexOrThrow14;
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                String string = cursorQuery.getString(columnIndexOrThrow9);
                int i9 = columnIndexOrThrow9;
                String string2 = cursorQuery.getString(columnIndexOrThrow11);
                int i10 = columnIndexOrThrow11;
                H0.c cVar = new H0.c();
                int i11 = columnIndexOrThrow;
                cVar.setRequiredNetworkType(x.intToNetworkType(cursorQuery.getInt(columnIndexOrThrow)));
                cVar.setRequiresCharging(cursorQuery.getInt(columnIndexOrThrow2) != 0);
                cVar.setRequiresDeviceIdle(cursorQuery.getInt(columnIndexOrThrow3) != 0);
                cVar.setRequiresBatteryNotLow(cursorQuery.getInt(columnIndexOrThrow4) != 0);
                cVar.setRequiresStorageNotLow(cursorQuery.getInt(columnIndexOrThrow5) != 0);
                int i12 = columnIndexOrThrow2;
                int i13 = columnIndexOrThrow3;
                cVar.setTriggerContentUpdateDelay(cursorQuery.getLong(columnIndexOrThrow6));
                cVar.setTriggerMaxContentDelay(cursorQuery.getLong(columnIndexOrThrow7));
                cVar.setContentUriTriggers(x.byteArrayToContentUriTriggers(cursorQuery.getBlob(columnIndexOrThrow8)));
                r rVar = new r(string, string2);
                rVar.state = x.intToState(cursorQuery.getInt(columnIndexOrThrow10));
                rVar.inputMergerClassName = cursorQuery.getString(columnIndexOrThrow12);
                rVar.input = androidx.work.b.fromByteArray(cursorQuery.getBlob(columnIndexOrThrow13));
                int i14 = i8;
                rVar.output = androidx.work.b.fromByteArray(cursorQuery.getBlob(i14));
                int i15 = columnIndexOrThrow15;
                i8 = i14;
                rVar.initialDelay = cursorQuery.getLong(i15);
                int i16 = columnIndexOrThrow12;
                int i17 = columnIndexOrThrow16;
                rVar.intervalDuration = cursorQuery.getLong(i17);
                int i18 = columnIndexOrThrow4;
                int i19 = columnIndexOrThrow17;
                rVar.flexDuration = cursorQuery.getLong(i19);
                int i20 = columnIndexOrThrow18;
                rVar.runAttemptCount = cursorQuery.getInt(i20);
                int i21 = columnIndexOrThrow19;
                rVar.backoffPolicy = x.intToBackoffPolicy(cursorQuery.getInt(i21));
                columnIndexOrThrow17 = i19;
                int i22 = columnIndexOrThrow20;
                rVar.backoffDelayDuration = cursorQuery.getLong(i22);
                int i23 = columnIndexOrThrow21;
                rVar.periodStartTime = cursorQuery.getLong(i23);
                columnIndexOrThrow21 = i23;
                int i24 = columnIndexOrThrow22;
                rVar.minimumRetentionDuration = cursorQuery.getLong(i24);
                int i25 = columnIndexOrThrow23;
                rVar.scheduleRequestedAt = cursorQuery.getLong(i25);
                int i26 = columnIndexOrThrow24;
                rVar.expedited = cursorQuery.getInt(i26) != 0;
                int i27 = columnIndexOrThrow25;
                rVar.outOfQuotaPolicy = x.intToOutOfQuotaPolicy(cursorQuery.getInt(i27));
                rVar.constraints = cVar;
                arrayList.add(rVar);
                columnIndexOrThrow2 = i12;
                columnIndexOrThrow25 = i27;
                columnIndexOrThrow12 = i16;
                columnIndexOrThrow15 = i15;
                columnIndexOrThrow16 = i17;
                columnIndexOrThrow18 = i20;
                columnIndexOrThrow23 = i25;
                columnIndexOrThrow9 = i9;
                columnIndexOrThrow11 = i10;
                columnIndexOrThrow = i11;
                columnIndexOrThrow24 = i26;
                columnIndexOrThrow22 = i24;
                columnIndexOrThrow3 = i13;
                columnIndexOrThrow20 = i22;
                columnIndexOrThrow4 = i18;
                columnIndexOrThrow19 = i21;
            }
            cursorQuery.close();
            c6425c.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorQuery.close();
            c6425c.release();
            throw th;
        }
    }

    @Override // P0.s
    public List<r> getRunningWork() throws Throwable {
        C6425c c6425c;
        int columnIndexOrThrow;
        int columnIndexOrThrow2;
        int columnIndexOrThrow3;
        int columnIndexOrThrow4;
        int columnIndexOrThrow5;
        int columnIndexOrThrow6;
        int columnIndexOrThrow7;
        int columnIndexOrThrow8;
        int columnIndexOrThrow9;
        int columnIndexOrThrow10;
        int columnIndexOrThrow11;
        int columnIndexOrThrow12;
        int columnIndexOrThrow13;
        int columnIndexOrThrow14;
        C6425c c6425cAcquire = C6425c.acquire("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1", 0);
        this.f3643a.assertNotSuspendingTransaction();
        Cursor cursorQuery = x0.c.query(this.f3643a, c6425cAcquire, false, null);
        try {
            columnIndexOrThrow = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "required_network_type");
            columnIndexOrThrow2 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "requires_charging");
            columnIndexOrThrow3 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "requires_device_idle");
            columnIndexOrThrow4 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "requires_battery_not_low");
            columnIndexOrThrow5 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "requires_storage_not_low");
            columnIndexOrThrow6 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "trigger_content_update_delay");
            columnIndexOrThrow7 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "trigger_max_content_delay");
            columnIndexOrThrow8 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "content_uri_triggers");
            columnIndexOrThrow9 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, Constants.ID);
            columnIndexOrThrow10 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "state");
            columnIndexOrThrow11 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "worker_class_name");
            columnIndexOrThrow12 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "input_merger_class_name");
            columnIndexOrThrow13 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "input");
            columnIndexOrThrow14 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "output");
            c6425c = c6425cAcquire;
        } catch (Throwable th) {
            th = th;
            c6425c = c6425cAcquire;
        }
        try {
            int columnIndexOrThrow15 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "initial_delay");
            int columnIndexOrThrow16 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "interval_duration");
            int columnIndexOrThrow17 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "flex_duration");
            int columnIndexOrThrow18 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "run_attempt_count");
            int columnIndexOrThrow19 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "backoff_policy");
            int columnIndexOrThrow20 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "backoff_delay_duration");
            int columnIndexOrThrow21 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "period_start_time");
            int columnIndexOrThrow22 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "minimum_retention_duration");
            int columnIndexOrThrow23 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "schedule_requested_at");
            int columnIndexOrThrow24 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "run_in_foreground");
            int columnIndexOrThrow25 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "out_of_quota_policy");
            int i8 = columnIndexOrThrow14;
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                String string = cursorQuery.getString(columnIndexOrThrow9);
                int i9 = columnIndexOrThrow9;
                String string2 = cursorQuery.getString(columnIndexOrThrow11);
                int i10 = columnIndexOrThrow11;
                H0.c cVar = new H0.c();
                int i11 = columnIndexOrThrow;
                cVar.setRequiredNetworkType(x.intToNetworkType(cursorQuery.getInt(columnIndexOrThrow)));
                cVar.setRequiresCharging(cursorQuery.getInt(columnIndexOrThrow2) != 0);
                cVar.setRequiresDeviceIdle(cursorQuery.getInt(columnIndexOrThrow3) != 0);
                cVar.setRequiresBatteryNotLow(cursorQuery.getInt(columnIndexOrThrow4) != 0);
                cVar.setRequiresStorageNotLow(cursorQuery.getInt(columnIndexOrThrow5) != 0);
                int i12 = columnIndexOrThrow2;
                int i13 = columnIndexOrThrow3;
                cVar.setTriggerContentUpdateDelay(cursorQuery.getLong(columnIndexOrThrow6));
                cVar.setTriggerMaxContentDelay(cursorQuery.getLong(columnIndexOrThrow7));
                cVar.setContentUriTriggers(x.byteArrayToContentUriTriggers(cursorQuery.getBlob(columnIndexOrThrow8)));
                r rVar = new r(string, string2);
                rVar.state = x.intToState(cursorQuery.getInt(columnIndexOrThrow10));
                rVar.inputMergerClassName = cursorQuery.getString(columnIndexOrThrow12);
                rVar.input = androidx.work.b.fromByteArray(cursorQuery.getBlob(columnIndexOrThrow13));
                int i14 = i8;
                rVar.output = androidx.work.b.fromByteArray(cursorQuery.getBlob(i14));
                i8 = i14;
                int i15 = columnIndexOrThrow15;
                rVar.initialDelay = cursorQuery.getLong(i15);
                int i16 = columnIndexOrThrow13;
                int i17 = columnIndexOrThrow16;
                rVar.intervalDuration = cursorQuery.getLong(i17);
                int i18 = columnIndexOrThrow4;
                int i19 = columnIndexOrThrow17;
                rVar.flexDuration = cursorQuery.getLong(i19);
                int i20 = columnIndexOrThrow18;
                rVar.runAttemptCount = cursorQuery.getInt(i20);
                int i21 = columnIndexOrThrow19;
                rVar.backoffPolicy = x.intToBackoffPolicy(cursorQuery.getInt(i21));
                columnIndexOrThrow17 = i19;
                int i22 = columnIndexOrThrow20;
                rVar.backoffDelayDuration = cursorQuery.getLong(i22);
                int i23 = columnIndexOrThrow21;
                rVar.periodStartTime = cursorQuery.getLong(i23);
                columnIndexOrThrow21 = i23;
                int i24 = columnIndexOrThrow22;
                rVar.minimumRetentionDuration = cursorQuery.getLong(i24);
                int i25 = columnIndexOrThrow23;
                rVar.scheduleRequestedAt = cursorQuery.getLong(i25);
                int i26 = columnIndexOrThrow24;
                rVar.expedited = cursorQuery.getInt(i26) != 0;
                int i27 = columnIndexOrThrow25;
                rVar.outOfQuotaPolicy = x.intToOutOfQuotaPolicy(cursorQuery.getInt(i27));
                rVar.constraints = cVar;
                arrayList.add(rVar);
                columnIndexOrThrow25 = i27;
                columnIndexOrThrow2 = i12;
                columnIndexOrThrow13 = i16;
                columnIndexOrThrow15 = i15;
                columnIndexOrThrow16 = i17;
                columnIndexOrThrow18 = i20;
                columnIndexOrThrow23 = i25;
                columnIndexOrThrow9 = i9;
                columnIndexOrThrow11 = i10;
                columnIndexOrThrow = i11;
                columnIndexOrThrow24 = i26;
                columnIndexOrThrow22 = i24;
                columnIndexOrThrow3 = i13;
                columnIndexOrThrow20 = i22;
                columnIndexOrThrow4 = i18;
                columnIndexOrThrow19 = i21;
            }
            cursorQuery.close();
            c6425c.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorQuery.close();
            c6425c.release();
            throw th;
        }
    }

    @Override // P0.s
    public LiveData getScheduleRequestedAtLiveData(String str) {
        C6425c c6425cAcquire = C6425c.acquire("SELECT schedule_requested_at FROM workspec WHERE id=?", 1);
        if (str == null) {
            c6425cAcquire.bindNull(1);
        } else {
            c6425cAcquire.bindString(1, str);
        }
        return this.f3643a.getInvalidationTracker().createLiveData(new String[]{"workspec"}, false, new e(c6425cAcquire));
    }

    @Override // P0.s
    public List<r> getScheduledWork() throws Throwable {
        C6425c c6425c;
        int columnIndexOrThrow;
        int columnIndexOrThrow2;
        int columnIndexOrThrow3;
        int columnIndexOrThrow4;
        int columnIndexOrThrow5;
        int columnIndexOrThrow6;
        int columnIndexOrThrow7;
        int columnIndexOrThrow8;
        int columnIndexOrThrow9;
        int columnIndexOrThrow10;
        int columnIndexOrThrow11;
        int columnIndexOrThrow12;
        int columnIndexOrThrow13;
        int columnIndexOrThrow14;
        C6425c c6425cAcquire = C6425c.acquire("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.f3643a.assertNotSuspendingTransaction();
        Cursor cursorQuery = x0.c.query(this.f3643a, c6425cAcquire, false, null);
        try {
            columnIndexOrThrow = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "required_network_type");
            columnIndexOrThrow2 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "requires_charging");
            columnIndexOrThrow3 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "requires_device_idle");
            columnIndexOrThrow4 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "requires_battery_not_low");
            columnIndexOrThrow5 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "requires_storage_not_low");
            columnIndexOrThrow6 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "trigger_content_update_delay");
            columnIndexOrThrow7 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "trigger_max_content_delay");
            columnIndexOrThrow8 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "content_uri_triggers");
            columnIndexOrThrow9 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, Constants.ID);
            columnIndexOrThrow10 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "state");
            columnIndexOrThrow11 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "worker_class_name");
            columnIndexOrThrow12 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "input_merger_class_name");
            columnIndexOrThrow13 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "input");
            columnIndexOrThrow14 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "output");
            c6425c = c6425cAcquire;
        } catch (Throwable th) {
            th = th;
            c6425c = c6425cAcquire;
        }
        try {
            int columnIndexOrThrow15 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "initial_delay");
            int columnIndexOrThrow16 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "interval_duration");
            int columnIndexOrThrow17 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "flex_duration");
            int columnIndexOrThrow18 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "run_attempt_count");
            int columnIndexOrThrow19 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "backoff_policy");
            int columnIndexOrThrow20 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "backoff_delay_duration");
            int columnIndexOrThrow21 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "period_start_time");
            int columnIndexOrThrow22 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "minimum_retention_duration");
            int columnIndexOrThrow23 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "schedule_requested_at");
            int columnIndexOrThrow24 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "run_in_foreground");
            int columnIndexOrThrow25 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "out_of_quota_policy");
            int i8 = columnIndexOrThrow14;
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                String string = cursorQuery.getString(columnIndexOrThrow9);
                int i9 = columnIndexOrThrow9;
                String string2 = cursorQuery.getString(columnIndexOrThrow11);
                int i10 = columnIndexOrThrow11;
                H0.c cVar = new H0.c();
                int i11 = columnIndexOrThrow;
                cVar.setRequiredNetworkType(x.intToNetworkType(cursorQuery.getInt(columnIndexOrThrow)));
                cVar.setRequiresCharging(cursorQuery.getInt(columnIndexOrThrow2) != 0);
                cVar.setRequiresDeviceIdle(cursorQuery.getInt(columnIndexOrThrow3) != 0);
                cVar.setRequiresBatteryNotLow(cursorQuery.getInt(columnIndexOrThrow4) != 0);
                cVar.setRequiresStorageNotLow(cursorQuery.getInt(columnIndexOrThrow5) != 0);
                int i12 = columnIndexOrThrow2;
                int i13 = columnIndexOrThrow3;
                cVar.setTriggerContentUpdateDelay(cursorQuery.getLong(columnIndexOrThrow6));
                cVar.setTriggerMaxContentDelay(cursorQuery.getLong(columnIndexOrThrow7));
                cVar.setContentUriTriggers(x.byteArrayToContentUriTriggers(cursorQuery.getBlob(columnIndexOrThrow8)));
                r rVar = new r(string, string2);
                rVar.state = x.intToState(cursorQuery.getInt(columnIndexOrThrow10));
                rVar.inputMergerClassName = cursorQuery.getString(columnIndexOrThrow12);
                rVar.input = androidx.work.b.fromByteArray(cursorQuery.getBlob(columnIndexOrThrow13));
                int i14 = i8;
                rVar.output = androidx.work.b.fromByteArray(cursorQuery.getBlob(i14));
                i8 = i14;
                int i15 = columnIndexOrThrow15;
                rVar.initialDelay = cursorQuery.getLong(i15);
                int i16 = columnIndexOrThrow13;
                int i17 = columnIndexOrThrow16;
                rVar.intervalDuration = cursorQuery.getLong(i17);
                int i18 = columnIndexOrThrow4;
                int i19 = columnIndexOrThrow17;
                rVar.flexDuration = cursorQuery.getLong(i19);
                int i20 = columnIndexOrThrow18;
                rVar.runAttemptCount = cursorQuery.getInt(i20);
                int i21 = columnIndexOrThrow19;
                rVar.backoffPolicy = x.intToBackoffPolicy(cursorQuery.getInt(i21));
                columnIndexOrThrow17 = i19;
                int i22 = columnIndexOrThrow20;
                rVar.backoffDelayDuration = cursorQuery.getLong(i22);
                int i23 = columnIndexOrThrow21;
                rVar.periodStartTime = cursorQuery.getLong(i23);
                columnIndexOrThrow21 = i23;
                int i24 = columnIndexOrThrow22;
                rVar.minimumRetentionDuration = cursorQuery.getLong(i24);
                int i25 = columnIndexOrThrow23;
                rVar.scheduleRequestedAt = cursorQuery.getLong(i25);
                int i26 = columnIndexOrThrow24;
                rVar.expedited = cursorQuery.getInt(i26) != 0;
                int i27 = columnIndexOrThrow25;
                rVar.outOfQuotaPolicy = x.intToOutOfQuotaPolicy(cursorQuery.getInt(i27));
                rVar.constraints = cVar;
                arrayList.add(rVar);
                columnIndexOrThrow25 = i27;
                columnIndexOrThrow2 = i12;
                columnIndexOrThrow13 = i16;
                columnIndexOrThrow15 = i15;
                columnIndexOrThrow16 = i17;
                columnIndexOrThrow18 = i20;
                columnIndexOrThrow23 = i25;
                columnIndexOrThrow9 = i9;
                columnIndexOrThrow11 = i10;
                columnIndexOrThrow = i11;
                columnIndexOrThrow24 = i26;
                columnIndexOrThrow22 = i24;
                columnIndexOrThrow3 = i13;
                columnIndexOrThrow20 = i22;
                columnIndexOrThrow4 = i18;
                columnIndexOrThrow19 = i21;
            }
            cursorQuery.close();
            c6425c.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorQuery.close();
            c6425c.release();
            throw th;
        }
    }

    @Override // P0.s
    public v.a getState(String str) {
        C6425c c6425cAcquire = C6425c.acquire("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            c6425cAcquire.bindNull(1);
        } else {
            c6425cAcquire.bindString(1, str);
        }
        this.f3643a.assertNotSuspendingTransaction();
        Cursor cursorQuery = x0.c.query(this.f3643a, c6425cAcquire, false, null);
        try {
            return cursorQuery.moveToFirst() ? x.intToState(cursorQuery.getInt(0)) : null;
        } finally {
            cursorQuery.close();
            c6425cAcquire.release();
        }
    }

    @Override // P0.s
    public List<String> getUnfinishedWorkWithName(String str) {
        C6425c c6425cAcquire = C6425c.acquire("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            c6425cAcquire.bindNull(1);
        } else {
            c6425cAcquire.bindString(1, str);
        }
        this.f3643a.assertNotSuspendingTransaction();
        Cursor cursorQuery = x0.c.query(this.f3643a, c6425cAcquire, false, null);
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

    @Override // P0.s
    public List<String> getUnfinishedWorkWithTag(String str) {
        C6425c c6425cAcquire = C6425c.acquire("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            c6425cAcquire.bindNull(1);
        } else {
            c6425cAcquire.bindString(1, str);
        }
        this.f3643a.assertNotSuspendingTransaction();
        Cursor cursorQuery = x0.c.query(this.f3643a, c6425cAcquire, false, null);
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

    @Override // P0.s
    public r getWorkSpec(String str) throws Throwable {
        C6425c c6425c;
        r rVar;
        C6425c c6425cAcquire = C6425c.acquire("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?", 1);
        if (str == null) {
            c6425cAcquire.bindNull(1);
        } else {
            c6425cAcquire.bindString(1, str);
        }
        this.f3643a.assertNotSuspendingTransaction();
        Cursor cursorQuery = x0.c.query(this.f3643a, c6425cAcquire, false, null);
        try {
            int columnIndexOrThrow = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "required_network_type");
            int columnIndexOrThrow2 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "requires_charging");
            int columnIndexOrThrow3 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "requires_device_idle");
            int columnIndexOrThrow4 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "requires_battery_not_low");
            int columnIndexOrThrow5 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "requires_storage_not_low");
            int columnIndexOrThrow6 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "trigger_content_update_delay");
            int columnIndexOrThrow7 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "trigger_max_content_delay");
            int columnIndexOrThrow8 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "content_uri_triggers");
            int columnIndexOrThrow9 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, Constants.ID);
            int columnIndexOrThrow10 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "state");
            int columnIndexOrThrow11 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "worker_class_name");
            int columnIndexOrThrow12 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "input_merger_class_name");
            int columnIndexOrThrow13 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "input");
            int columnIndexOrThrow14 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "output");
            c6425c = c6425cAcquire;
            try {
                int columnIndexOrThrow15 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "initial_delay");
                int columnIndexOrThrow16 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "interval_duration");
                int columnIndexOrThrow17 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "flex_duration");
                int columnIndexOrThrow18 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "run_attempt_count");
                int columnIndexOrThrow19 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "backoff_policy");
                int columnIndexOrThrow20 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "backoff_delay_duration");
                int columnIndexOrThrow21 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "period_start_time");
                int columnIndexOrThrow22 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "minimum_retention_duration");
                int columnIndexOrThrow23 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "schedule_requested_at");
                int columnIndexOrThrow24 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "run_in_foreground");
                int columnIndexOrThrow25 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "out_of_quota_policy");
                if (cursorQuery.moveToFirst()) {
                    String string = cursorQuery.getString(columnIndexOrThrow9);
                    String string2 = cursorQuery.getString(columnIndexOrThrow11);
                    H0.c cVar = new H0.c();
                    cVar.setRequiredNetworkType(x.intToNetworkType(cursorQuery.getInt(columnIndexOrThrow)));
                    cVar.setRequiresCharging(cursorQuery.getInt(columnIndexOrThrow2) != 0);
                    cVar.setRequiresDeviceIdle(cursorQuery.getInt(columnIndexOrThrow3) != 0);
                    cVar.setRequiresBatteryNotLow(cursorQuery.getInt(columnIndexOrThrow4) != 0);
                    cVar.setRequiresStorageNotLow(cursorQuery.getInt(columnIndexOrThrow5) != 0);
                    cVar.setTriggerContentUpdateDelay(cursorQuery.getLong(columnIndexOrThrow6));
                    cVar.setTriggerMaxContentDelay(cursorQuery.getLong(columnIndexOrThrow7));
                    cVar.setContentUriTriggers(x.byteArrayToContentUriTriggers(cursorQuery.getBlob(columnIndexOrThrow8)));
                    r rVar2 = new r(string, string2);
                    rVar2.state = x.intToState(cursorQuery.getInt(columnIndexOrThrow10));
                    rVar2.inputMergerClassName = cursorQuery.getString(columnIndexOrThrow12);
                    rVar2.input = androidx.work.b.fromByteArray(cursorQuery.getBlob(columnIndexOrThrow13));
                    rVar2.output = androidx.work.b.fromByteArray(cursorQuery.getBlob(columnIndexOrThrow14));
                    rVar2.initialDelay = cursorQuery.getLong(columnIndexOrThrow15);
                    rVar2.intervalDuration = cursorQuery.getLong(columnIndexOrThrow16);
                    rVar2.flexDuration = cursorQuery.getLong(columnIndexOrThrow17);
                    rVar2.runAttemptCount = cursorQuery.getInt(columnIndexOrThrow18);
                    rVar2.backoffPolicy = x.intToBackoffPolicy(cursorQuery.getInt(columnIndexOrThrow19));
                    rVar2.backoffDelayDuration = cursorQuery.getLong(columnIndexOrThrow20);
                    rVar2.periodStartTime = cursorQuery.getLong(columnIndexOrThrow21);
                    rVar2.minimumRetentionDuration = cursorQuery.getLong(columnIndexOrThrow22);
                    rVar2.scheduleRequestedAt = cursorQuery.getLong(columnIndexOrThrow23);
                    rVar2.expedited = cursorQuery.getInt(columnIndexOrThrow24) != 0;
                    rVar2.outOfQuotaPolicy = x.intToOutOfQuotaPolicy(cursorQuery.getInt(columnIndexOrThrow25));
                    rVar2.constraints = cVar;
                    rVar = rVar2;
                } else {
                    rVar = null;
                }
                cursorQuery.close();
                c6425c.release();
                return rVar;
            } catch (Throwable th) {
                th = th;
                cursorQuery.close();
                c6425c.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c6425c = c6425cAcquire;
        }
    }

    @Override // P0.s
    public List<r.b> getWorkSpecIdAndStatesForName(String str) {
        C6425c c6425cAcquire = C6425c.acquire("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            c6425cAcquire.bindNull(1);
        } else {
            c6425cAcquire.bindString(1, str);
        }
        this.f3643a.assertNotSuspendingTransaction();
        Cursor cursorQuery = x0.c.query(this.f3643a, c6425cAcquire, false, null);
        try {
            int columnIndexOrThrow = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, Constants.ID);
            int columnIndexOrThrow2 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "state");
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                r.b bVar = new r.b();
                bVar.id = cursorQuery.getString(columnIndexOrThrow);
                bVar.state = x.intToState(cursorQuery.getInt(columnIndexOrThrow2));
                arrayList.add(bVar);
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            c6425cAcquire.release();
        }
    }

    @Override // P0.s
    public r[] getWorkSpecs(List<String> list) throws Throwable {
        C6425c c6425c;
        int columnIndexOrThrow;
        int columnIndexOrThrow2;
        int columnIndexOrThrow3;
        int columnIndexOrThrow4;
        int columnIndexOrThrow5;
        int columnIndexOrThrow6;
        int columnIndexOrThrow7;
        int columnIndexOrThrow8;
        int columnIndexOrThrow9;
        int columnIndexOrThrow10;
        int columnIndexOrThrow11;
        int columnIndexOrThrow12;
        int columnIndexOrThrow13;
        int columnIndexOrThrow14;
        StringBuilder sbNewStringBuilder = x0.f.newStringBuilder();
        sbNewStringBuilder.append("SELECT ");
        sbNewStringBuilder.append("*");
        sbNewStringBuilder.append(" FROM workspec WHERE id IN (");
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
        this.f3643a.assertNotSuspendingTransaction();
        Cursor cursorQuery = x0.c.query(this.f3643a, c6425cAcquire, false, null);
        try {
            columnIndexOrThrow = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "required_network_type");
            columnIndexOrThrow2 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "requires_charging");
            columnIndexOrThrow3 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "requires_device_idle");
            columnIndexOrThrow4 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "requires_battery_not_low");
            columnIndexOrThrow5 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "requires_storage_not_low");
            columnIndexOrThrow6 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "trigger_content_update_delay");
            columnIndexOrThrow7 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "trigger_max_content_delay");
            columnIndexOrThrow8 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "content_uri_triggers");
            columnIndexOrThrow9 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, Constants.ID);
            columnIndexOrThrow10 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "state");
            columnIndexOrThrow11 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "worker_class_name");
            columnIndexOrThrow12 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "input_merger_class_name");
            columnIndexOrThrow13 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "input");
            columnIndexOrThrow14 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "output");
            c6425c = c6425cAcquire;
        } catch (Throwable th) {
            th = th;
            c6425c = c6425cAcquire;
        }
        try {
            int columnIndexOrThrow15 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "initial_delay");
            int columnIndexOrThrow16 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "interval_duration");
            int columnIndexOrThrow17 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "flex_duration");
            int columnIndexOrThrow18 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "run_attempt_count");
            int columnIndexOrThrow19 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "backoff_policy");
            int columnIndexOrThrow20 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "backoff_delay_duration");
            int columnIndexOrThrow21 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "period_start_time");
            int columnIndexOrThrow22 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "minimum_retention_duration");
            int columnIndexOrThrow23 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "schedule_requested_at");
            int columnIndexOrThrow24 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "run_in_foreground");
            int columnIndexOrThrow25 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "out_of_quota_policy");
            r[] rVarArr = new r[cursorQuery.getCount()];
            int i9 = 0;
            while (cursorQuery.moveToNext()) {
                r[] rVarArr2 = rVarArr;
                String string = cursorQuery.getString(columnIndexOrThrow9);
                int i10 = columnIndexOrThrow9;
                String string2 = cursorQuery.getString(columnIndexOrThrow11);
                int i11 = columnIndexOrThrow11;
                H0.c cVar = new H0.c();
                int i12 = columnIndexOrThrow;
                cVar.setRequiredNetworkType(x.intToNetworkType(cursorQuery.getInt(columnIndexOrThrow)));
                cVar.setRequiresCharging(cursorQuery.getInt(columnIndexOrThrow2) != 0);
                cVar.setRequiresDeviceIdle(cursorQuery.getInt(columnIndexOrThrow3) != 0);
                cVar.setRequiresBatteryNotLow(cursorQuery.getInt(columnIndexOrThrow4) != 0);
                cVar.setRequiresStorageNotLow(cursorQuery.getInt(columnIndexOrThrow5) != 0);
                int i13 = columnIndexOrThrow2;
                int i14 = columnIndexOrThrow3;
                cVar.setTriggerContentUpdateDelay(cursorQuery.getLong(columnIndexOrThrow6));
                cVar.setTriggerMaxContentDelay(cursorQuery.getLong(columnIndexOrThrow7));
                cVar.setContentUriTriggers(x.byteArrayToContentUriTriggers(cursorQuery.getBlob(columnIndexOrThrow8)));
                r rVar = new r(string, string2);
                rVar.state = x.intToState(cursorQuery.getInt(columnIndexOrThrow10));
                rVar.inputMergerClassName = cursorQuery.getString(columnIndexOrThrow12);
                rVar.input = androidx.work.b.fromByteArray(cursorQuery.getBlob(columnIndexOrThrow13));
                rVar.output = androidx.work.b.fromByteArray(cursorQuery.getBlob(columnIndexOrThrow14));
                int i15 = columnIndexOrThrow14;
                int i16 = columnIndexOrThrow15;
                rVar.initialDelay = cursorQuery.getLong(i16);
                columnIndexOrThrow15 = i16;
                int i17 = columnIndexOrThrow16;
                rVar.intervalDuration = cursorQuery.getLong(i17);
                int i18 = columnIndexOrThrow12;
                int i19 = columnIndexOrThrow17;
                rVar.flexDuration = cursorQuery.getLong(i19);
                int i20 = columnIndexOrThrow18;
                rVar.runAttemptCount = cursorQuery.getInt(i20);
                int i21 = columnIndexOrThrow19;
                rVar.backoffPolicy = x.intToBackoffPolicy(cursorQuery.getInt(i21));
                columnIndexOrThrow17 = i19;
                int i22 = columnIndexOrThrow20;
                rVar.backoffDelayDuration = cursorQuery.getLong(i22);
                int i23 = columnIndexOrThrow21;
                rVar.periodStartTime = cursorQuery.getLong(i23);
                columnIndexOrThrow21 = i23;
                int i24 = columnIndexOrThrow22;
                rVar.minimumRetentionDuration = cursorQuery.getLong(i24);
                columnIndexOrThrow22 = i24;
                int i25 = columnIndexOrThrow23;
                rVar.scheduleRequestedAt = cursorQuery.getLong(i25);
                int i26 = columnIndexOrThrow24;
                rVar.expedited = cursorQuery.getInt(i26) != 0;
                int i27 = columnIndexOrThrow25;
                rVar.outOfQuotaPolicy = x.intToOutOfQuotaPolicy(cursorQuery.getInt(i27));
                rVar.constraints = cVar;
                rVarArr2[i9] = rVar;
                i9++;
                columnIndexOrThrow25 = i27;
                columnIndexOrThrow2 = i13;
                columnIndexOrThrow23 = i25;
                rVarArr = rVarArr2;
                columnIndexOrThrow9 = i10;
                columnIndexOrThrow11 = i11;
                columnIndexOrThrow = i12;
                columnIndexOrThrow24 = i26;
                columnIndexOrThrow14 = i15;
                columnIndexOrThrow3 = i14;
                columnIndexOrThrow20 = i22;
                columnIndexOrThrow12 = i18;
                columnIndexOrThrow16 = i17;
                columnIndexOrThrow18 = i20;
                columnIndexOrThrow19 = i21;
            }
            r[] rVarArr3 = rVarArr;
            cursorQuery.close();
            c6425c.release();
            return rVarArr3;
        } catch (Throwable th2) {
            th = th2;
            cursorQuery.close();
            c6425c.release();
            throw th;
        }
    }

    @Override // P0.s
    public r.c getWorkStatusPojoForId(String str) {
        C6425c c6425cAcquire = C6425c.acquire("SELECT id, state, output, run_attempt_count FROM workspec WHERE id=?", 1);
        if (str == null) {
            c6425cAcquire.bindNull(1);
        } else {
            c6425cAcquire.bindString(1, str);
        }
        this.f3643a.assertNotSuspendingTransaction();
        this.f3643a.beginTransaction();
        try {
            r.c cVar = null;
            Cursor cursorQuery = x0.c.query(this.f3643a, c6425cAcquire, true, null);
            try {
                int columnIndexOrThrow = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, Constants.ID);
                int columnIndexOrThrow2 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "state");
                int columnIndexOrThrow3 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "output");
                int columnIndexOrThrow4 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "run_attempt_count");
                O.a aVar = new O.a();
                O.a aVar2 = new O.a();
                while (cursorQuery.moveToNext()) {
                    if (!cursorQuery.isNull(columnIndexOrThrow)) {
                        String string = cursorQuery.getString(columnIndexOrThrow);
                        if (((ArrayList) aVar.get(string)) == null) {
                            aVar.put(string, new ArrayList());
                        }
                    }
                    if (!cursorQuery.isNull(columnIndexOrThrow)) {
                        String string2 = cursorQuery.getString(columnIndexOrThrow);
                        if (((ArrayList) aVar2.get(string2)) == null) {
                            aVar2.put(string2, new ArrayList());
                        }
                    }
                }
                cursorQuery.moveToPosition(-1);
                b(aVar);
                a(aVar2);
                if (cursorQuery.moveToFirst()) {
                    ArrayList arrayList = !cursorQuery.isNull(columnIndexOrThrow) ? (ArrayList) aVar.get(cursorQuery.getString(columnIndexOrThrow)) : null;
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    ArrayList arrayList2 = cursorQuery.isNull(columnIndexOrThrow) ? null : (ArrayList) aVar2.get(cursorQuery.getString(columnIndexOrThrow));
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    r.c cVar2 = new r.c();
                    cVar2.id = cursorQuery.getString(columnIndexOrThrow);
                    cVar2.state = x.intToState(cursorQuery.getInt(columnIndexOrThrow2));
                    cVar2.output = androidx.work.b.fromByteArray(cursorQuery.getBlob(columnIndexOrThrow3));
                    cVar2.runAttemptCount = cursorQuery.getInt(columnIndexOrThrow4);
                    cVar2.tags = arrayList;
                    cVar2.progress = arrayList2;
                    cVar = cVar2;
                }
                this.f3643a.setTransactionSuccessful();
                cursorQuery.close();
                c6425cAcquire.release();
                return cVar;
            } catch (Throwable th) {
                cursorQuery.close();
                c6425cAcquire.release();
                throw th;
            }
        } finally {
            this.f3643a.endTransaction();
        }
    }

    @Override // P0.s
    public List<r.c> getWorkStatusPojoForIds(List<String> list) {
        StringBuilder sbNewStringBuilder = x0.f.newStringBuilder();
        sbNewStringBuilder.append("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (");
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
        this.f3643a.assertNotSuspendingTransaction();
        this.f3643a.beginTransaction();
        try {
            Cursor cursorQuery = x0.c.query(this.f3643a, c6425cAcquire, true, null);
            try {
                int columnIndexOrThrow = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, Constants.ID);
                int columnIndexOrThrow2 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "state");
                int columnIndexOrThrow3 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "output");
                int columnIndexOrThrow4 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "run_attempt_count");
                O.a aVar = new O.a();
                O.a aVar2 = new O.a();
                while (cursorQuery.moveToNext()) {
                    if (!cursorQuery.isNull(columnIndexOrThrow)) {
                        String string = cursorQuery.getString(columnIndexOrThrow);
                        if (((ArrayList) aVar.get(string)) == null) {
                            aVar.put(string, new ArrayList());
                        }
                    }
                    if (!cursorQuery.isNull(columnIndexOrThrow)) {
                        String string2 = cursorQuery.getString(columnIndexOrThrow);
                        if (((ArrayList) aVar2.get(string2)) == null) {
                            aVar2.put(string2, new ArrayList());
                        }
                    }
                }
                cursorQuery.moveToPosition(-1);
                b(aVar);
                a(aVar2);
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    ArrayList arrayList2 = !cursorQuery.isNull(columnIndexOrThrow) ? (ArrayList) aVar.get(cursorQuery.getString(columnIndexOrThrow)) : null;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    ArrayList arrayList3 = !cursorQuery.isNull(columnIndexOrThrow) ? (ArrayList) aVar2.get(cursorQuery.getString(columnIndexOrThrow)) : null;
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    r.c cVar = new r.c();
                    cVar.id = cursorQuery.getString(columnIndexOrThrow);
                    cVar.state = x.intToState(cursorQuery.getInt(columnIndexOrThrow2));
                    cVar.output = androidx.work.b.fromByteArray(cursorQuery.getBlob(columnIndexOrThrow3));
                    cVar.runAttemptCount = cursorQuery.getInt(columnIndexOrThrow4);
                    cVar.tags = arrayList2;
                    cVar.progress = arrayList3;
                    arrayList.add(cVar);
                }
                this.f3643a.setTransactionSuccessful();
                cursorQuery.close();
                c6425cAcquire.release();
                return arrayList;
            } catch (Throwable th) {
                cursorQuery.close();
                c6425cAcquire.release();
                throw th;
            }
        } finally {
            this.f3643a.endTransaction();
        }
    }

    @Override // P0.s
    public List<r.c> getWorkStatusPojoForName(String str) {
        C6425c c6425cAcquire = C6425c.acquire("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            c6425cAcquire.bindNull(1);
        } else {
            c6425cAcquire.bindString(1, str);
        }
        this.f3643a.assertNotSuspendingTransaction();
        this.f3643a.beginTransaction();
        try {
            Cursor cursorQuery = x0.c.query(this.f3643a, c6425cAcquire, true, null);
            try {
                int columnIndexOrThrow = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, Constants.ID);
                int columnIndexOrThrow2 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "state");
                int columnIndexOrThrow3 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "output");
                int columnIndexOrThrow4 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "run_attempt_count");
                O.a aVar = new O.a();
                O.a aVar2 = new O.a();
                while (cursorQuery.moveToNext()) {
                    if (!cursorQuery.isNull(columnIndexOrThrow)) {
                        String string = cursorQuery.getString(columnIndexOrThrow);
                        if (((ArrayList) aVar.get(string)) == null) {
                            aVar.put(string, new ArrayList());
                        }
                    }
                    if (!cursorQuery.isNull(columnIndexOrThrow)) {
                        String string2 = cursorQuery.getString(columnIndexOrThrow);
                        if (((ArrayList) aVar2.get(string2)) == null) {
                            aVar2.put(string2, new ArrayList());
                        }
                    }
                }
                cursorQuery.moveToPosition(-1);
                b(aVar);
                a(aVar2);
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    ArrayList arrayList2 = !cursorQuery.isNull(columnIndexOrThrow) ? (ArrayList) aVar.get(cursorQuery.getString(columnIndexOrThrow)) : null;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    ArrayList arrayList3 = !cursorQuery.isNull(columnIndexOrThrow) ? (ArrayList) aVar2.get(cursorQuery.getString(columnIndexOrThrow)) : null;
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    r.c cVar = new r.c();
                    cVar.id = cursorQuery.getString(columnIndexOrThrow);
                    cVar.state = x.intToState(cursorQuery.getInt(columnIndexOrThrow2));
                    cVar.output = androidx.work.b.fromByteArray(cursorQuery.getBlob(columnIndexOrThrow3));
                    cVar.runAttemptCount = cursorQuery.getInt(columnIndexOrThrow4);
                    cVar.tags = arrayList2;
                    cVar.progress = arrayList3;
                    arrayList.add(cVar);
                }
                this.f3643a.setTransactionSuccessful();
                cursorQuery.close();
                c6425cAcquire.release();
                return arrayList;
            } catch (Throwable th) {
                cursorQuery.close();
                c6425cAcquire.release();
                throw th;
            }
        } finally {
            this.f3643a.endTransaction();
        }
    }

    @Override // P0.s
    public List<r.c> getWorkStatusPojoForTag(String str) {
        C6425c c6425cAcquire = C6425c.acquire("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            c6425cAcquire.bindNull(1);
        } else {
            c6425cAcquire.bindString(1, str);
        }
        this.f3643a.assertNotSuspendingTransaction();
        this.f3643a.beginTransaction();
        try {
            Cursor cursorQuery = x0.c.query(this.f3643a, c6425cAcquire, true, null);
            try {
                int columnIndexOrThrow = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, Constants.ID);
                int columnIndexOrThrow2 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "state");
                int columnIndexOrThrow3 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "output");
                int columnIndexOrThrow4 = AbstractC6482b.getColumnIndexOrThrow(cursorQuery, "run_attempt_count");
                O.a aVar = new O.a();
                O.a aVar2 = new O.a();
                while (cursorQuery.moveToNext()) {
                    if (!cursorQuery.isNull(columnIndexOrThrow)) {
                        String string = cursorQuery.getString(columnIndexOrThrow);
                        if (((ArrayList) aVar.get(string)) == null) {
                            aVar.put(string, new ArrayList());
                        }
                    }
                    if (!cursorQuery.isNull(columnIndexOrThrow)) {
                        String string2 = cursorQuery.getString(columnIndexOrThrow);
                        if (((ArrayList) aVar2.get(string2)) == null) {
                            aVar2.put(string2, new ArrayList());
                        }
                    }
                }
                cursorQuery.moveToPosition(-1);
                b(aVar);
                a(aVar2);
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    ArrayList arrayList2 = !cursorQuery.isNull(columnIndexOrThrow) ? (ArrayList) aVar.get(cursorQuery.getString(columnIndexOrThrow)) : null;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    ArrayList arrayList3 = !cursorQuery.isNull(columnIndexOrThrow) ? (ArrayList) aVar2.get(cursorQuery.getString(columnIndexOrThrow)) : null;
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    r.c cVar = new r.c();
                    cVar.id = cursorQuery.getString(columnIndexOrThrow);
                    cVar.state = x.intToState(cursorQuery.getInt(columnIndexOrThrow2));
                    cVar.output = androidx.work.b.fromByteArray(cursorQuery.getBlob(columnIndexOrThrow3));
                    cVar.runAttemptCount = cursorQuery.getInt(columnIndexOrThrow4);
                    cVar.tags = arrayList2;
                    cVar.progress = arrayList3;
                    arrayList.add(cVar);
                }
                this.f3643a.setTransactionSuccessful();
                cursorQuery.close();
                c6425cAcquire.release();
                return arrayList;
            } catch (Throwable th) {
                cursorQuery.close();
                c6425cAcquire.release();
                throw th;
            }
        } finally {
            this.f3643a.endTransaction();
        }
    }

    @Override // P0.s
    public LiveData getWorkStatusPojoLiveDataForIds(List<String> list) {
        StringBuilder sbNewStringBuilder = x0.f.newStringBuilder();
        sbNewStringBuilder.append("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (");
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
        return this.f3643a.getInvalidationTracker().createLiveData(new String[]{"WorkTag", "WorkProgress", "workspec"}, true, new b(c6425cAcquire));
    }

    @Override // P0.s
    public LiveData getWorkStatusPojoLiveDataForName(String str) {
        C6425c c6425cAcquire = C6425c.acquire("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            c6425cAcquire.bindNull(1);
        } else {
            c6425cAcquire.bindString(1, str);
        }
        return this.f3643a.getInvalidationTracker().createLiveData(new String[]{"WorkTag", "WorkProgress", "workspec", "workname"}, true, new d(c6425cAcquire));
    }

    @Override // P0.s
    public LiveData getWorkStatusPojoLiveDataForTag(String str) {
        C6425c c6425cAcquire = C6425c.acquire("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            c6425cAcquire.bindNull(1);
        } else {
            c6425cAcquire.bindString(1, str);
        }
        return this.f3643a.getInvalidationTracker().createLiveData(new String[]{"WorkTag", "WorkProgress", "workspec", "worktag"}, true, new c(c6425cAcquire));
    }

    @Override // P0.s
    public boolean hasUnfinishedWork() {
        boolean z8 = false;
        C6425c c6425cAcquire = C6425c.acquire("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
        this.f3643a.assertNotSuspendingTransaction();
        Cursor cursorQuery = x0.c.query(this.f3643a, c6425cAcquire, false, null);
        try {
            if (cursorQuery.moveToFirst()) {
                if (cursorQuery.getInt(0) != 0) {
                    z8 = true;
                }
            }
            return z8;
        } finally {
            cursorQuery.close();
            c6425cAcquire.release();
        }
    }

    @Override // P0.s
    public int incrementWorkSpecRunAttemptCount(String str) {
        this.f3643a.assertNotSuspendingTransaction();
        InterfaceC6614f interfaceC6614fAcquire = this.f3648f.acquire();
        if (str == null) {
            interfaceC6614fAcquire.bindNull(1);
        } else {
            interfaceC6614fAcquire.bindString(1, str);
        }
        this.f3643a.beginTransaction();
        try {
            int iExecuteUpdateDelete = interfaceC6614fAcquire.executeUpdateDelete();
            this.f3643a.setTransactionSuccessful();
            return iExecuteUpdateDelete;
        } finally {
            this.f3643a.endTransaction();
            this.f3648f.release(interfaceC6614fAcquire);
        }
    }

    @Override // P0.s
    public void insertWorkSpec(r rVar) {
        this.f3643a.assertNotSuspendingTransaction();
        this.f3643a.beginTransaction();
        try {
            this.f3644b.insert(rVar);
            this.f3643a.setTransactionSuccessful();
        } finally {
            this.f3643a.endTransaction();
        }
    }

    @Override // P0.s
    public int markWorkSpecScheduled(String str, long j8) {
        this.f3643a.assertNotSuspendingTransaction();
        InterfaceC6614f interfaceC6614fAcquire = this.f3650h.acquire();
        interfaceC6614fAcquire.bindLong(1, j8);
        if (str == null) {
            interfaceC6614fAcquire.bindNull(2);
        } else {
            interfaceC6614fAcquire.bindString(2, str);
        }
        this.f3643a.beginTransaction();
        try {
            int iExecuteUpdateDelete = interfaceC6614fAcquire.executeUpdateDelete();
            this.f3643a.setTransactionSuccessful();
            return iExecuteUpdateDelete;
        } finally {
            this.f3643a.endTransaction();
            this.f3650h.release(interfaceC6614fAcquire);
        }
    }

    @Override // P0.s
    public void pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast() {
        this.f3643a.assertNotSuspendingTransaction();
        InterfaceC6614f interfaceC6614fAcquire = this.f3652j.acquire();
        this.f3643a.beginTransaction();
        try {
            interfaceC6614fAcquire.executeUpdateDelete();
            this.f3643a.setTransactionSuccessful();
        } finally {
            this.f3643a.endTransaction();
            this.f3652j.release(interfaceC6614fAcquire);
        }
    }

    @Override // P0.s
    public int resetScheduledState() {
        this.f3643a.assertNotSuspendingTransaction();
        InterfaceC6614f interfaceC6614fAcquire = this.f3651i.acquire();
        this.f3643a.beginTransaction();
        try {
            int iExecuteUpdateDelete = interfaceC6614fAcquire.executeUpdateDelete();
            this.f3643a.setTransactionSuccessful();
            return iExecuteUpdateDelete;
        } finally {
            this.f3643a.endTransaction();
            this.f3651i.release(interfaceC6614fAcquire);
        }
    }

    @Override // P0.s
    public int resetWorkSpecRunAttemptCount(String str) {
        this.f3643a.assertNotSuspendingTransaction();
        InterfaceC6614f interfaceC6614fAcquire = this.f3649g.acquire();
        if (str == null) {
            interfaceC6614fAcquire.bindNull(1);
        } else {
            interfaceC6614fAcquire.bindString(1, str);
        }
        this.f3643a.beginTransaction();
        try {
            int iExecuteUpdateDelete = interfaceC6614fAcquire.executeUpdateDelete();
            this.f3643a.setTransactionSuccessful();
            return iExecuteUpdateDelete;
        } finally {
            this.f3643a.endTransaction();
            this.f3649g.release(interfaceC6614fAcquire);
        }
    }

    @Override // P0.s
    public void setOutput(String str, androidx.work.b bVar) throws Throwable {
        this.f3643a.assertNotSuspendingTransaction();
        InterfaceC6614f interfaceC6614fAcquire = this.f3646d.acquire();
        byte[] byteArrayInternal = androidx.work.b.toByteArrayInternal(bVar);
        if (byteArrayInternal == null) {
            interfaceC6614fAcquire.bindNull(1);
        } else {
            interfaceC6614fAcquire.bindBlob(1, byteArrayInternal);
        }
        if (str == null) {
            interfaceC6614fAcquire.bindNull(2);
        } else {
            interfaceC6614fAcquire.bindString(2, str);
        }
        this.f3643a.beginTransaction();
        try {
            interfaceC6614fAcquire.executeUpdateDelete();
            this.f3643a.setTransactionSuccessful();
        } finally {
            this.f3643a.endTransaction();
            this.f3646d.release(interfaceC6614fAcquire);
        }
    }

    @Override // P0.s
    public void setPeriodStartTime(String str, long j8) {
        this.f3643a.assertNotSuspendingTransaction();
        InterfaceC6614f interfaceC6614fAcquire = this.f3647e.acquire();
        interfaceC6614fAcquire.bindLong(1, j8);
        if (str == null) {
            interfaceC6614fAcquire.bindNull(2);
        } else {
            interfaceC6614fAcquire.bindString(2, str);
        }
        this.f3643a.beginTransaction();
        try {
            interfaceC6614fAcquire.executeUpdateDelete();
            this.f3643a.setTransactionSuccessful();
        } finally {
            this.f3643a.endTransaction();
            this.f3647e.release(interfaceC6614fAcquire);
        }
    }

    @Override // P0.s
    public int setState(v.a aVar, String... strArr) {
        this.f3643a.assertNotSuspendingTransaction();
        StringBuilder sbNewStringBuilder = x0.f.newStringBuilder();
        sbNewStringBuilder.append("UPDATE workspec SET state=");
        sbNewStringBuilder.append("?");
        sbNewStringBuilder.append(" WHERE id IN (");
        x0.f.appendPlaceholders(sbNewStringBuilder, strArr.length);
        sbNewStringBuilder.append(")");
        InterfaceC6614f interfaceC6614fCompileStatement = this.f3643a.compileStatement(sbNewStringBuilder.toString());
        interfaceC6614fCompileStatement.bindLong(1, x.stateToInt(aVar));
        int i8 = 2;
        for (String str : strArr) {
            if (str == null) {
                interfaceC6614fCompileStatement.bindNull(i8);
            } else {
                interfaceC6614fCompileStatement.bindString(i8, str);
            }
            i8++;
        }
        this.f3643a.beginTransaction();
        try {
            int iExecuteUpdateDelete = interfaceC6614fCompileStatement.executeUpdateDelete();
            this.f3643a.setTransactionSuccessful();
            return iExecuteUpdateDelete;
        } finally {
            this.f3643a.endTransaction();
        }
    }
}
