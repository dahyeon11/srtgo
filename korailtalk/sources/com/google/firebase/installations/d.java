package com.google.firebase.installations;

/* loaded from: classes2.dex */
final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final g f25707a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f25708b;

    private d(g gVar, boolean z8) {
        this.f25707a = gVar;
        this.f25708b = z8;
    }

    public static Runnable lambdaFactory$(g gVar, boolean z8) {
        return new d(gVar, z8);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f25707a.g(this.f25708b);
    }
}
