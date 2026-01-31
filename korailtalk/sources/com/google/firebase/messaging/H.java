package com.google.firebase.messaging;

import I2.AbstractC0608l;
import I2.AbstractC0611o;
import I2.C0609m;
import android.content.Context;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import u3.InterfaceC6416a;

/* loaded from: classes2.dex */
class H {

    /* renamed from: i, reason: collision with root package name */
    private static final long f25770i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: a, reason: collision with root package name */
    private final FirebaseInstanceId f25771a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f25772b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.firebase.iid.r f25773c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.firebase.iid.o f25774d;

    /* renamed from: f, reason: collision with root package name */
    private final ScheduledExecutorService f25776f;

    /* renamed from: h, reason: collision with root package name */
    private final F f25778h;

    /* renamed from: e, reason: collision with root package name */
    private final Map f25775e = new O.a();

    /* renamed from: g, reason: collision with root package name */
    private boolean f25777g = false;

    private H(FirebaseInstanceId firebaseInstanceId, com.google.firebase.iid.r rVar, F f8, com.google.firebase.iid.o oVar, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f25771a = firebaseInstanceId;
        this.f25773c = rVar;
        this.f25778h = f8;
        this.f25774d = oVar;
        this.f25772b = context;
        this.f25776f = scheduledExecutorService;
    }

    private void a(E e8, C0609m c0609m) {
        ArrayDeque arrayDeque;
        synchronized (this.f25775e) {
            try {
                String strSerialize = e8.serialize();
                if (this.f25775e.containsKey(strSerialize)) {
                    arrayDeque = (ArrayDeque) this.f25775e.get(strSerialize);
                } else {
                    ArrayDeque arrayDeque2 = new ArrayDeque();
                    this.f25775e.put(strSerialize, arrayDeque2);
                    arrayDeque = arrayDeque2;
                }
                arrayDeque.add(c0609m);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static Object b(AbstractC0608l abstractC0608l) throws IOException {
        try {
            return AbstractC0611o.await(abstractC0608l, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException e8) {
            e = e8;
            throw new IOException(com.google.firebase.iid.o.ERROR_SERVICE_NOT_AVAILABLE, e);
        } catch (ExecutionException e9) {
            Throwable cause = e9.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new IOException(e9);
        } catch (TimeoutException e10) {
            e = e10;
            throw new IOException(com.google.firebase.iid.o.ERROR_SERVICE_NOT_AVAILABLE, e);
        }
    }

    private void c(String str) throws IOException {
        com.google.firebase.iid.p pVar = (com.google.firebase.iid.p) b(this.f25771a.getInstanceId());
        b(this.f25774d.subscribeToTopic(pVar.getId(), pVar.getToken(), str));
    }

    private void d(String str) throws IOException {
        com.google.firebase.iid.p pVar = (com.google.firebase.iid.p) b(this.f25771a.getInstanceId());
        b(this.f25774d.unsubscribeFromTopic(pVar.getId(), pVar.getToken(), str));
    }

    static AbstractC0608l e(final FirebaseInstanceId firebaseInstanceId, final com.google.firebase.iid.r rVar, final com.google.firebase.iid.o oVar, final Context context, final ScheduledExecutorService scheduledExecutorService) {
        return AbstractC0611o.call(scheduledExecutorService, new Callable(context, scheduledExecutorService, firebaseInstanceId, rVar, oVar) { // from class: com.google.firebase.messaging.G

            /* renamed from: a, reason: collision with root package name */
            private final Context f25765a;

            /* renamed from: b, reason: collision with root package name */
            private final ScheduledExecutorService f25766b;

            /* renamed from: c, reason: collision with root package name */
            private final FirebaseInstanceId f25767c;

            /* renamed from: d, reason: collision with root package name */
            private final com.google.firebase.iid.r f25768d;

            /* renamed from: e, reason: collision with root package name */
            private final com.google.firebase.iid.o f25769e;

            {
                this.f25765a = context;
                this.f25766b = scheduledExecutorService;
                this.f25767c = firebaseInstanceId;
                this.f25768d = rVar;
                this.f25769e = oVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return H.j(this.f25765a, this.f25766b, this.f25767c, this.f25768d, this.f25769e);
            }
        });
    }

    static AbstractC0608l f(l3.c cVar, FirebaseInstanceId firebaseInstanceId, com.google.firebase.iid.r rVar, InterfaceC6416a interfaceC6416a, InterfaceC6416a interfaceC6416a2, com.google.firebase.installations.h hVar, Context context, ScheduledExecutorService scheduledExecutorService) {
        return e(firebaseInstanceId, rVar, new com.google.firebase.iid.o(cVar, rVar, interfaceC6416a, interfaceC6416a2, hVar), context, scheduledExecutorService);
    }

    static boolean h() {
        return Log.isLoggable(AbstractC5186c.TAG, 3);
    }

    static final /* synthetic */ H j(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseInstanceId firebaseInstanceId, com.google.firebase.iid.r rVar, com.google.firebase.iid.o oVar) {
        return new H(firebaseInstanceId, rVar, F.getInstance(context, scheduledExecutorService), oVar, context, scheduledExecutorService);
    }

    private void k(E e8) {
        synchronized (this.f25775e) {
            try {
                String strSerialize = e8.serialize();
                if (this.f25775e.containsKey(strSerialize)) {
                    ArrayDeque arrayDeque = (ArrayDeque) this.f25775e.get(strSerialize);
                    C0609m c0609m = (C0609m) arrayDeque.poll();
                    if (c0609m != null) {
                        c0609m.setResult(null);
                    }
                    if (arrayDeque.isEmpty()) {
                        this.f25775e.remove(strSerialize);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void p() {
        if (i()) {
            return;
        }
        t(0L);
    }

    boolean g() {
        return this.f25778h.b() != null;
    }

    synchronized boolean i() {
        return this.f25777g;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    boolean l(com.google.firebase.messaging.E r6) throws java.io.IOException {
        /*
            r5 = this;
            r0 = 0
            java.lang.String r1 = r6.getOperation()     // Catch: java.io.IOException -> L1d
            int r2 = r1.hashCode()     // Catch: java.io.IOException -> L1d
            r3 = 83
            r4 = 1
            if (r2 == r3) goto L20
            r3 = 85
            if (r2 == r3) goto L13
            goto L2a
        L13:
            java.lang.String r2 = "U"
            boolean r1 = r1.equals(r2)     // Catch: java.io.IOException -> L1d
            if (r1 == 0) goto L2a
            r1 = r4
            goto L2b
        L1d:
            r6 = move-exception
            goto Lac
        L20:
            java.lang.String r2 = "S"
            boolean r1 = r1.equals(r2)     // Catch: java.io.IOException -> L1d
            if (r1 == 0) goto L2a
            r1 = r0
            goto L2b
        L2a:
            r1 = -1
        L2b:
            java.lang.String r2 = " succeeded."
            if (r1 == 0) goto L80
            if (r1 == r4) goto L54
            boolean r1 = h()     // Catch: java.io.IOException -> L1d
            if (r1 == 0) goto Lab
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch: java.io.IOException -> L1d
            int r1 = r6.length()     // Catch: java.io.IOException -> L1d
            int r1 = r1 + 24
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L1d
            r2.<init>(r1)     // Catch: java.io.IOException -> L1d
            java.lang.String r1 = "Unknown topic operation"
            r2.append(r1)     // Catch: java.io.IOException -> L1d
            r2.append(r6)     // Catch: java.io.IOException -> L1d
            java.lang.String r6 = "."
            r2.append(r6)     // Catch: java.io.IOException -> L1d
            goto Lab
        L54:
            java.lang.String r1 = r6.getTopic()     // Catch: java.io.IOException -> L1d
            r5.d(r1)     // Catch: java.io.IOException -> L1d
            boolean r1 = h()     // Catch: java.io.IOException -> L1d
            if (r1 == 0) goto Lab
            java.lang.String r6 = r6.getTopic()     // Catch: java.io.IOException -> L1d
            java.lang.String r1 = java.lang.String.valueOf(r6)     // Catch: java.io.IOException -> L1d
            int r1 = r1.length()     // Catch: java.io.IOException -> L1d
            int r1 = r1 + 35
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L1d
            r3.<init>(r1)     // Catch: java.io.IOException -> L1d
            java.lang.String r1 = "Unsubscribe from topic: "
            r3.append(r1)     // Catch: java.io.IOException -> L1d
            r3.append(r6)     // Catch: java.io.IOException -> L1d
            r3.append(r2)     // Catch: java.io.IOException -> L1d
            goto Lab
        L80:
            java.lang.String r1 = r6.getTopic()     // Catch: java.io.IOException -> L1d
            r5.c(r1)     // Catch: java.io.IOException -> L1d
            boolean r1 = h()     // Catch: java.io.IOException -> L1d
            if (r1 == 0) goto Lab
            java.lang.String r6 = r6.getTopic()     // Catch: java.io.IOException -> L1d
            java.lang.String r1 = java.lang.String.valueOf(r6)     // Catch: java.io.IOException -> L1d
            int r1 = r1.length()     // Catch: java.io.IOException -> L1d
            int r1 = r1 + 31
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L1d
            r3.<init>(r1)     // Catch: java.io.IOException -> L1d
            java.lang.String r1 = "Subscribe to topic: "
            r3.append(r1)     // Catch: java.io.IOException -> L1d
            r3.append(r6)     // Catch: java.io.IOException -> L1d
            r3.append(r2)     // Catch: java.io.IOException -> L1d
        Lab:
            return r4
        Lac:
            java.lang.String r1 = "SERVICE_NOT_AVAILABLE"
            java.lang.String r2 = r6.getMessage()
            boolean r1 = r1.equals(r2)
            java.lang.String r2 = "FirebaseMessaging"
            if (r1 != 0) goto Ld4
            java.lang.String r1 = "INTERNAL_SERVER_ERROR"
            java.lang.String r3 = r6.getMessage()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto Lc7
            goto Ld4
        Lc7:
            java.lang.String r1 = r6.getMessage()
            if (r1 != 0) goto Ld3
            java.lang.String r6 = "Topic operation failed without exception message. Will retry Topic operation."
            android.util.Log.e(r2, r6)
            return r0
        Ld3:
            throw r6
        Ld4:
            java.lang.String r6 = r6.getMessage()
            java.lang.String r1 = java.lang.String.valueOf(r6)
            int r1 = r1.length()
            int r1 = r1 + 53
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
            java.lang.String r1 = "Topic operation failed: "
            r3.append(r1)
            r3.append(r6)
            java.lang.String r6 = ". Will retry Topic operation."
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            android.util.Log.e(r2, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.H.l(com.google.firebase.messaging.E):boolean");
    }

    void m(Runnable runnable, long j8) {
        this.f25776f.schedule(runnable, j8, TimeUnit.SECONDS);
    }

    AbstractC0608l n(E e8) {
        this.f25778h.a(e8);
        C0609m c0609m = new C0609m();
        a(e8, c0609m);
        return c0609m.getTask();
    }

    synchronized void o(boolean z8) {
        this.f25777g = z8;
    }

    void q() {
        if (g()) {
            p();
        }
    }

    AbstractC0608l r(String str) {
        AbstractC0608l abstractC0608lN = n(E.subscribe(str));
        q();
        return abstractC0608lN;
    }

    boolean s() {
        while (true) {
            synchronized (this) {
                try {
                    E eB = this.f25778h.b();
                    if (eB == null) {
                        h();
                        return true;
                    }
                    if (!l(eB)) {
                        return false;
                    }
                    this.f25778h.d(eB);
                    k(eB);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    void t(long j8) {
        m(new I(this, this.f25772b, this.f25773c, Math.min(Math.max(30L, j8 << 1), f25770i)), j8);
        o(true);
    }

    AbstractC0608l u(String str) {
        AbstractC0608l abstractC0608lN = n(E.unsubscribe(str));
        q();
        return abstractC0608lN;
    }
}
