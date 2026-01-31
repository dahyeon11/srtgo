package com.google.android.gms.common.api.internal;

/* loaded from: classes.dex */
final class z0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1112j f12117a;

    z0(C1112j c1112j) {
        this.f12117a = c1112j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12117a.f12058m.lock();
        try {
            C1112j.o(this.f12117a);
        } finally {
            this.f12117a.f12058m.unlock();
        }
    }
}
