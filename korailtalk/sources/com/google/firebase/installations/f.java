package com.google.firebase.installations;

/* loaded from: classes2.dex */
final /* synthetic */ class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final g f25710a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f25711b;

    private f(g gVar, boolean z8) {
        this.f25710a = gVar;
        this.f25711b = z8;
    }

    public static Runnable lambdaFactory$(g gVar, boolean z8) {
        return new f(gVar, z8);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f25710a.f(this.f25711b);
    }
}
