package P0;

import P0.r;
import android.database.Cursor;
import androidx.lifecycle.LiveData;
import com.kakao.sdk.user.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import v0.C6425c;
import x0.AbstractC6482b;
import z0.InterfaceC6613e;

/* loaded from: classes.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    private final androidx.room.h f3624a;

    class a implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6613e f3625a;

        a(InterfaceC6613e interfaceC6613e) {
            this.f3625a = interfaceC6613e;
        }

        @Override // java.util.concurrent.Callable
        public List<r.c> call() {
            Cursor cursorQuery = x0.c.query(h.this.f3624a, this.f3625a, true, null);
            try {
                int columnIndex = AbstractC6482b.getColumnIndex(cursorQuery, Constants.ID);
                int columnIndex2 = AbstractC6482b.getColumnIndex(cursorQuery, "state");
                int columnIndex3 = AbstractC6482b.getColumnIndex(cursorQuery, "output");
                int columnIndex4 = AbstractC6482b.getColumnIndex(cursorQuery, "run_attempt_count");
                O.a aVar = new O.a();
                O.a aVar2 = new O.a();
                while (cursorQuery.moveToNext()) {
                    if (!cursorQuery.isNull(columnIndex)) {
                        String string = cursorQuery.getString(columnIndex);
                        if (((ArrayList) aVar.get(string)) == null) {
                            aVar.put(string, new ArrayList());
                        }
                    }
                    if (!cursorQuery.isNull(columnIndex)) {
                        String string2 = cursorQuery.getString(columnIndex);
                        if (((ArrayList) aVar2.get(string2)) == null) {
                            aVar2.put(string2, new ArrayList());
                        }
                    }
                }
                cursorQuery.moveToPosition(-1);
                h.this.b(aVar);
                h.this.a(aVar2);
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    ArrayList arrayList2 = !cursorQuery.isNull(columnIndex) ? (ArrayList) aVar.get(cursorQuery.getString(columnIndex)) : null;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    ArrayList arrayList3 = !cursorQuery.isNull(columnIndex) ? (ArrayList) aVar2.get(cursorQuery.getString(columnIndex)) : null;
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    r.c cVar = new r.c();
                    if (columnIndex != -1) {
                        cVar.id = cursorQuery.getString(columnIndex);
                    }
                    if (columnIndex2 != -1) {
                        cVar.state = x.intToState(cursorQuery.getInt(columnIndex2));
                    }
                    if (columnIndex3 != -1) {
                        cVar.output = androidx.work.b.fromByteArray(cursorQuery.getBlob(columnIndex3));
                    }
                    if (columnIndex4 != -1) {
                        cVar.runAttemptCount = cursorQuery.getInt(columnIndex4);
                    }
                    cVar.tags = arrayList2;
                    cVar.progress = arrayList3;
                    arrayList.add(cVar);
                }
                cursorQuery.close();
                return arrayList;
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }
    }

    public h(androidx.room.h hVar) {
        this.f3624a = hVar;
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
        Cursor cursorQuery = x0.c.query(this.f3624a, c6425cAcquire, false, null);
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
        Cursor cursorQuery = x0.c.query(this.f3624a, c6425cAcquire, false, null);
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

    @Override // P0.g
    public List<r.c> getWorkInfoPojos(InterfaceC6613e interfaceC6613e) {
        this.f3624a.assertNotSuspendingTransaction();
        Cursor cursorQuery = x0.c.query(this.f3624a, interfaceC6613e, true, null);
        try {
            int columnIndex = AbstractC6482b.getColumnIndex(cursorQuery, Constants.ID);
            int columnIndex2 = AbstractC6482b.getColumnIndex(cursorQuery, "state");
            int columnIndex3 = AbstractC6482b.getColumnIndex(cursorQuery, "output");
            int columnIndex4 = AbstractC6482b.getColumnIndex(cursorQuery, "run_attempt_count");
            O.a aVar = new O.a();
            O.a aVar2 = new O.a();
            while (cursorQuery.moveToNext()) {
                if (!cursorQuery.isNull(columnIndex)) {
                    String string = cursorQuery.getString(columnIndex);
                    if (((ArrayList) aVar.get(string)) == null) {
                        aVar.put(string, new ArrayList());
                    }
                }
                if (!cursorQuery.isNull(columnIndex)) {
                    String string2 = cursorQuery.getString(columnIndex);
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
                ArrayList arrayList2 = !cursorQuery.isNull(columnIndex) ? (ArrayList) aVar.get(cursorQuery.getString(columnIndex)) : null;
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                ArrayList arrayList3 = !cursorQuery.isNull(columnIndex) ? (ArrayList) aVar2.get(cursorQuery.getString(columnIndex)) : null;
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList();
                }
                r.c cVar = new r.c();
                if (columnIndex != -1) {
                    cVar.id = cursorQuery.getString(columnIndex);
                }
                if (columnIndex2 != -1) {
                    cVar.state = x.intToState(cursorQuery.getInt(columnIndex2));
                }
                if (columnIndex3 != -1) {
                    cVar.output = androidx.work.b.fromByteArray(cursorQuery.getBlob(columnIndex3));
                }
                if (columnIndex4 != -1) {
                    cVar.runAttemptCount = cursorQuery.getInt(columnIndex4);
                }
                cVar.tags = arrayList2;
                cVar.progress = arrayList3;
                arrayList.add(cVar);
            }
            cursorQuery.close();
            return arrayList;
        } catch (Throwable th) {
            cursorQuery.close();
            throw th;
        }
    }

    @Override // P0.g
    public LiveData getWorkInfoPojosLiveData(InterfaceC6613e interfaceC6613e) {
        return this.f3624a.getInvalidationTracker().createLiveData(new String[]{"WorkTag", "WorkProgress", "WorkSpec"}, false, new a(interfaceC6613e));
    }
}
