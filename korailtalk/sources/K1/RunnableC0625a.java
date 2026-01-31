package K1;

/* renamed from: K1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class RunnableC0625a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ B f2798a;

    RunnableC0625a(B b9) {
        this.f2798a = b9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2798a.f2763b = Thread.currentThread();
        this.f2798a.zza();
    }
}
