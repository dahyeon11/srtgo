package t1;

/* loaded from: classes.dex */
final /* synthetic */ class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final n f36927a;

    private l(n nVar) {
        this.f36927a = nVar;
    }

    public static Runnable lambdaFactory$(n nVar) {
        return new l(nVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        n nVar = this.f36927a;
        nVar.f36932d.runCriticalSection(m.lambdaFactory$(nVar));
    }
}
