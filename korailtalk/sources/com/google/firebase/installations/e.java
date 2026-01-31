package com.google.firebase.installations;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
final /* synthetic */ class e implements Callable {

    /* renamed from: a, reason: collision with root package name */
    private final g f25709a;

    private e(g gVar) {
        this.f25709a = gVar;
    }

    public static Callable lambdaFactory$(g gVar) {
        return new e(gVar);
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        return this.f25709a.e();
    }
}
