package com.google.firebase.installations;

/* loaded from: classes2.dex */
final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final g f25706a;

    private c(g gVar) {
        this.f25706a = gVar;
    }

    public static Runnable lambdaFactory$(g gVar) {
        return new c(gVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f25706a.g(false);
    }
}
