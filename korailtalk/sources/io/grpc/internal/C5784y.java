package io.grpc.internal;

import io.grpc.EnumC5802t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* renamed from: io.grpc.internal.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5784y {

    /* renamed from: a, reason: collision with root package name */
    private ArrayList f33215a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private volatile EnumC5802t f33216b = EnumC5802t.IDLE;

    /* renamed from: io.grpc.internal.y$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        final Runnable f33217a;

        /* renamed from: b, reason: collision with root package name */
        final Executor f33218b;

        a(Runnable runnable, Executor executor) {
            this.f33217a = runnable;
            this.f33218b = executor;
        }

        void a() {
            this.f33218b.execute(this.f33217a);
        }
    }

    C5784y() {
    }

    EnumC5802t a() {
        EnumC5802t enumC5802t = this.f33216b;
        if (enumC5802t != null) {
            return enumC5802t;
        }
        throw new UnsupportedOperationException("Channel state API is not implemented");
    }

    void b(EnumC5802t enumC5802t) {
        e3.w.checkNotNull(enumC5802t, "newState");
        if (this.f33216b == enumC5802t || this.f33216b == EnumC5802t.SHUTDOWN) {
            return;
        }
        this.f33216b = enumC5802t;
        if (this.f33215a.isEmpty()) {
            return;
        }
        ArrayList arrayList = this.f33215a;
        this.f33215a = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a();
        }
    }

    void c(Runnable runnable, Executor executor, EnumC5802t enumC5802t) {
        e3.w.checkNotNull(runnable, "callback");
        e3.w.checkNotNull(executor, "executor");
        e3.w.checkNotNull(enumC5802t, "source");
        a aVar = new a(runnable, executor);
        if (this.f33216b != enumC5802t) {
            aVar.a();
        } else {
            this.f33215a.add(aVar);
        }
    }
}
