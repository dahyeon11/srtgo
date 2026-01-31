package t1;

/* loaded from: classes.dex */
final /* synthetic */ class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final j f36898a;

    /* renamed from: b, reason: collision with root package name */
    private final o1.l f36899b;

    /* renamed from: c, reason: collision with root package name */
    private final int f36900c;

    /* renamed from: d, reason: collision with root package name */
    private final Runnable f36901d;

    private e(j jVar, o1.l lVar, int i8, Runnable runnable) {
        this.f36898a = jVar;
        this.f36899b = lVar;
        this.f36900c = i8;
        this.f36901d = runnable;
    }

    public static Runnable lambdaFactory$(j jVar, o1.l lVar, int i8, Runnable runnable) {
        return new e(jVar, lVar, i8, runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        j.e(this.f36898a, this.f36899b, this.f36900c, this.f36901d);
    }
}
