package Q0;

import H0.v;
import androidx.work.impl.WorkDatabase;

/* loaded from: classes.dex */
public class q implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    private static final String f3948d = H0.l.tagWithPrefix("StopWorkRunnable");

    /* renamed from: a, reason: collision with root package name */
    private final I0.i f3949a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3950b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f3951c;

    public q(I0.i iVar, String str, boolean z8) {
        this.f3949a = iVar;
        this.f3950b = str;
        this.f3951c = z8;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zStopWork;
        WorkDatabase workDatabase = this.f3949a.getWorkDatabase();
        I0.d processor = this.f3949a.getProcessor();
        P0.s sVarWorkSpecDao = workDatabase.workSpecDao();
        workDatabase.beginTransaction();
        try {
            boolean zIsEnqueuedInForeground = processor.isEnqueuedInForeground(this.f3950b);
            if (this.f3951c) {
                zStopWork = this.f3949a.getProcessor().stopForegroundWork(this.f3950b);
            } else {
                if (!zIsEnqueuedInForeground && sVarWorkSpecDao.getState(this.f3950b) == v.a.RUNNING) {
                    sVarWorkSpecDao.setState(v.a.ENQUEUED, this.f3950b);
                }
                zStopWork = this.f3949a.getProcessor().stopWork(this.f3950b);
            }
            H0.l.get().debug(f3948d, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", this.f3950b, Boolean.valueOf(zStopWork)), new Throwable[0]);
            workDatabase.setTransactionSuccessful();
            workDatabase.endTransaction();
        } catch (Throwable th) {
            workDatabase.endTransaction();
            throw th;
        }
    }
}
