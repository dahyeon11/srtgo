package Q0;

import H0.o;
import H0.v;
import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.UUID;

/* loaded from: classes.dex */
public abstract class a implements Runnable {

    /* renamed from: a */
    private final I0.c f3903a = new I0.c();

    /* renamed from: Q0.a$a */
    class C0066a extends a {

        /* renamed from: b */
        final /* synthetic */ I0.i f3904b;

        /* renamed from: c */
        final /* synthetic */ UUID f3905c;

        C0066a(I0.i iVar, UUID uuid) {
            this.f3904b = iVar;
            this.f3905c = uuid;
        }

        @Override // Q0.a
        void d() {
            WorkDatabase workDatabase = this.f3904b.getWorkDatabase();
            workDatabase.beginTransaction();
            try {
                a(this.f3904b, this.f3905c.toString());
                workDatabase.setTransactionSuccessful();
                workDatabase.endTransaction();
                c(this.f3904b);
            } catch (Throwable th) {
                workDatabase.endTransaction();
                throw th;
            }
        }
    }

    class b extends a {

        /* renamed from: b */
        final /* synthetic */ I0.i f3906b;

        /* renamed from: c */
        final /* synthetic */ String f3907c;

        b(I0.i iVar, String str) {
            this.f3906b = iVar;
            this.f3907c = str;
        }

        @Override // Q0.a
        void d() {
            WorkDatabase workDatabase = this.f3906b.getWorkDatabase();
            workDatabase.beginTransaction();
            try {
                Iterator<String> it = workDatabase.workSpecDao().getUnfinishedWorkWithTag(this.f3907c).iterator();
                while (it.hasNext()) {
                    a(this.f3906b, it.next());
                }
                workDatabase.setTransactionSuccessful();
                workDatabase.endTransaction();
                c(this.f3906b);
            } catch (Throwable th) {
                workDatabase.endTransaction();
                throw th;
            }
        }
    }

    class c extends a {

        /* renamed from: b */
        final /* synthetic */ I0.i f3908b;

        /* renamed from: c */
        final /* synthetic */ String f3909c;

        /* renamed from: d */
        final /* synthetic */ boolean f3910d;

        c(I0.i iVar, String str, boolean z8) {
            this.f3908b = iVar;
            this.f3909c = str;
            this.f3910d = z8;
        }

        @Override // Q0.a
        void d() {
            WorkDatabase workDatabase = this.f3908b.getWorkDatabase();
            workDatabase.beginTransaction();
            try {
                Iterator<String> it = workDatabase.workSpecDao().getUnfinishedWorkWithName(this.f3909c).iterator();
                while (it.hasNext()) {
                    a(this.f3908b, it.next());
                }
                workDatabase.setTransactionSuccessful();
                workDatabase.endTransaction();
                if (this.f3910d) {
                    c(this.f3908b);
                }
            } catch (Throwable th) {
                workDatabase.endTransaction();
                throw th;
            }
        }
    }

    class d extends a {

        /* renamed from: b */
        final /* synthetic */ I0.i f3911b;

        d(I0.i iVar) {
            this.f3911b = iVar;
        }

        @Override // Q0.a
        void d() {
            WorkDatabase workDatabase = this.f3911b.getWorkDatabase();
            workDatabase.beginTransaction();
            try {
                Iterator<String> it = workDatabase.workSpecDao().getAllUnfinishedWork().iterator();
                while (it.hasNext()) {
                    a(this.f3911b, it.next());
                }
                new i(this.f3911b.getWorkDatabase()).setLastCancelAllTimeMillis(System.currentTimeMillis());
                workDatabase.setTransactionSuccessful();
                workDatabase.endTransaction();
            } catch (Throwable th) {
                workDatabase.endTransaction();
                throw th;
            }
        }
    }

    private void b(WorkDatabase workDatabase, String str) {
        P0.s sVarWorkSpecDao = workDatabase.workSpecDao();
        P0.b bVarDependencyDao = workDatabase.dependencyDao();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            v.a state = sVarWorkSpecDao.getState(str2);
            if (state != v.a.SUCCEEDED && state != v.a.FAILED) {
                sVarWorkSpecDao.setState(v.a.CANCELLED, str2);
            }
            linkedList.addAll(bVarDependencyDao.getDependentWorkIds(str2));
        }
    }

    public static a forAll(I0.i iVar) {
        return new d(iVar);
    }

    public static a forId(UUID uuid, I0.i iVar) {
        return new C0066a(iVar, uuid);
    }

    public static a forName(String str, I0.i iVar, boolean z8) {
        return new c(iVar, str, z8);
    }

    public static a forTag(String str, I0.i iVar) {
        return new b(iVar, str);
    }

    void a(I0.i iVar, String str) {
        b(iVar.getWorkDatabase(), str);
        iVar.getProcessor().stopAndCancelWork(str);
        Iterator<I0.e> it = iVar.getSchedulers().iterator();
        while (it.hasNext()) {
            it.next().cancel(str);
        }
    }

    void c(I0.i iVar) {
        I0.f.schedule(iVar.getConfiguration(), iVar.getWorkDatabase(), iVar.getSchedulers());
    }

    abstract void d();

    public H0.o getOperation() {
        return this.f3903a;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            d();
            this.f3903a.setState(H0.o.SUCCESS);
        } catch (Throwable th) {
            this.f3903a.setState(new o.b.a(th));
        }
    }
}
