package s1;

import o1.l;

/* renamed from: s1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final /* synthetic */ class RunnableC6207a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final C6209c f36134a;

    /* renamed from: b, reason: collision with root package name */
    private final l f36135b;

    /* renamed from: c, reason: collision with root package name */
    private final m1.h f36136c;

    /* renamed from: d, reason: collision with root package name */
    private final o1.h f36137d;

    private RunnableC6207a(C6209c c6209c, l lVar, m1.h hVar, o1.h hVar2) {
        this.f36134a = c6209c;
        this.f36135b = lVar;
        this.f36136c = hVar;
        this.f36137d = hVar2;
    }

    public static Runnable lambdaFactory$(C6209c c6209c, l lVar, m1.h hVar, o1.h hVar2) {
        return new RunnableC6207a(c6209c, lVar, hVar, hVar2);
    }

    @Override // java.lang.Runnable
    public void run() {
        C6209c.b(this.f36134a, this.f36135b, this.f36136c, this.f36137d);
    }
}
