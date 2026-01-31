package D7;

/* loaded from: classes3.dex */
public abstract class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    protected final String f949a;

    public b(String str, Object... objArr) {
        this.f949a = e.format(str, objArr);
    }

    protected abstract void execute();

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f949a);
        try {
            execute();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
