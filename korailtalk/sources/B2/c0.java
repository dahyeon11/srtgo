package B2;

/* loaded from: classes2.dex */
abstract class c0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final long f284a;

    /* renamed from: b, reason: collision with root package name */
    final long f285b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f286c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ n0 f287d;

    c0(n0 n0Var, boolean z8) {
        this.f287d = n0Var;
        this.f284a = n0Var.f311b.currentTimeMillis();
        this.f285b = n0Var.f311b.elapsedRealtime();
        this.f286c = z8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f287d.f316g) {
            a();
            return;
        }
        try {
            zza();
        } catch (Exception e8) {
            this.f287d.d(e8, false, this.f286c);
            a();
        }
    }

    abstract void zza();

    protected void a() {
    }
}
