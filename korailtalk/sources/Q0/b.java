package Q0;

import H0.o;
import android.text.TextUtils;
import androidx.work.b;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.List;

/* loaded from: classes.dex */
public class b implements Runnable {

    /* renamed from: c, reason: collision with root package name */
    private static final String f3912c = H0.l.tagWithPrefix("EnqueueRunnable");

    /* renamed from: a, reason: collision with root package name */
    private final I0.g f3913a;

    /* renamed from: b, reason: collision with root package name */
    private final I0.c f3914b = new I0.c();

    public b(I0.g gVar) {
        this.f3913a = gVar;
    }

    private static boolean a(I0.g gVar) {
        boolean zB = b(gVar.getWorkManagerImpl(), gVar.getWork(), (String[]) I0.g.prerequisitesFor(gVar).toArray(new String[0]), gVar.getName(), gVar.getExistingWorkPolicy());
        gVar.markEnqueued();
        return zB;
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x0137 A[PHI: r0 r8 r11 r12 r13
  0x0137: PHI (r0v1 java.lang.String[]) = 
  (r0v0 java.lang.String[])
  (r0v0 java.lang.String[])
  (r0v0 java.lang.String[])
  (r0v13 java.lang.String[])
  (r0v13 java.lang.String[])
 binds: [B:28:0x0061, B:29:0x0063, B:31:0x0071, B:81:0x0136, B:80:0x0134] A[DONT_GENERATE, DONT_INLINE]
  0x0137: PHI (r8v2 boolean) = (r8v1 boolean), (r8v1 boolean), (r8v1 boolean), (r8v5 boolean), (r8v6 boolean) binds: [B:28:0x0061, B:29:0x0063, B:31:0x0071, B:81:0x0136, B:80:0x0134] A[DONT_GENERATE, DONT_INLINE]
  0x0137: PHI (r11v2 boolean) = (r11v1 boolean), (r11v1 boolean), (r11v1 boolean), (r11v4 boolean), (r11v4 boolean) binds: [B:28:0x0061, B:29:0x0063, B:31:0x0071, B:81:0x0136, B:80:0x0134] A[DONT_GENERATE, DONT_INLINE]
  0x0137: PHI (r12v2 boolean) = (r12v1 boolean), (r12v1 boolean), (r12v1 boolean), (r12v5 boolean), (r12v5 boolean) binds: [B:28:0x0061, B:29:0x0063, B:31:0x0071, B:81:0x0136, B:80:0x0134] A[DONT_GENERATE, DONT_INLINE]
  0x0137: PHI (r13v2 boolean) = (r13v1 boolean), (r13v1 boolean), (r13v1 boolean), (r13v5 boolean), (r13v5 boolean) binds: [B:28:0x0061, B:29:0x0063, B:31:0x0071, B:81:0x0136, B:80:0x0134] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean b(I0.i r16, java.util.List r17, java.lang.String[] r18, java.lang.String r19, H0.f r20) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Q0.b.b(I0.i, java.util.List, java.lang.String[], java.lang.String, H0.f):boolean");
    }

    private static boolean c(I0.g gVar) {
        List<I0.g> parents = gVar.getParents();
        boolean z8 = false;
        if (parents != null) {
            boolean zC = false;
            for (I0.g gVar2 : parents) {
                if (gVar2.isEnqueued()) {
                    H0.l.get().warning(f3912c, String.format("Already enqueued work ids (%s).", TextUtils.join(", ", gVar2.getIds())), new Throwable[0]);
                } else {
                    zC |= c(gVar2);
                }
            }
            z8 = zC;
        }
        return a(gVar) | z8;
    }

    private static void d(P0.r rVar) {
        H0.c cVar = rVar.constraints;
        String str = rVar.workerClassName;
        if (str.equals(ConstraintTrackingWorker.class.getName())) {
            return;
        }
        if (cVar.requiresBatteryNotLow() || cVar.requiresStorageNotLow()) {
            b.a aVar = new b.a();
            aVar.putAll(rVar.input).putString(ConstraintTrackingWorker.ARGUMENT_CLASS_NAME, str);
            rVar.workerClassName = ConstraintTrackingWorker.class.getName();
            rVar.input = aVar.build();
        }
    }

    public boolean addToDatabase() {
        WorkDatabase workDatabase = this.f3913a.getWorkManagerImpl().getWorkDatabase();
        workDatabase.beginTransaction();
        try {
            boolean zC = c(this.f3913a);
            workDatabase.setTransactionSuccessful();
            return zC;
        } finally {
            workDatabase.endTransaction();
        }
    }

    public H0.o getOperation() {
        return this.f3914b;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (this.f3913a.hasCycles()) {
                throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", this.f3913a));
            }
            if (addToDatabase()) {
                h.setComponentEnabled(this.f3913a.getWorkManagerImpl().getApplicationContext(), RescheduleReceiver.class, true);
                scheduleWorkInBackground();
            }
            this.f3914b.setState(H0.o.SUCCESS);
        } catch (Throwable th) {
            this.f3914b.setState(new o.b.a(th));
        }
    }

    public void scheduleWorkInBackground() {
        I0.i workManagerImpl = this.f3913a.getWorkManagerImpl();
        I0.f.schedule(workManagerImpl.getConfiguration(), workManagerImpl.getWorkDatabase(), workManagerImpl.getSchedulers());
    }
}
