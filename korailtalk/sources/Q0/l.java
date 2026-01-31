package Q0;

import H0.o;

/* loaded from: classes.dex */
public class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final I0.i f3927a;

    /* renamed from: b, reason: collision with root package name */
    private final I0.c f3928b = new I0.c();

    public l(I0.i iVar) {
        this.f3927a = iVar;
    }

    public H0.o getOperation() {
        return this.f3928b;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f3927a.getWorkDatabase().workSpecDao().pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast();
            this.f3928b.setState(H0.o.SUCCESS);
        } catch (Throwable th) {
            this.f3928b.setState(new o.b.a(th));
        }
    }
}
