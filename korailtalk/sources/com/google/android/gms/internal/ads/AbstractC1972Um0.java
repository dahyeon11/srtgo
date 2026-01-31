package com.google.android.gms.internal.ads;

import Q7.C0709m;
import com.korail.talk.network.dao.research.CmtrInfoDao;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.ads.Um0 */
/* loaded from: classes2.dex */
public abstract class AbstractC1972Um0 extends AbstractC3657mo0 implements com.google.common.util.concurrent.C {

    /* renamed from: d */
    static final boolean f16718d;

    /* renamed from: e */
    static final C1933Tn0 f16719e;

    /* renamed from: f */
    private static final AbstractC1522Jm0 f16720f;

    /* renamed from: g */
    private static final Object f16721g;

    /* renamed from: a */
    private volatile Object f16722a;

    /* renamed from: b */
    private volatile C1644Mm0 f16723b;

    /* renamed from: c */
    private volatile C1931Tm0 f16724c;

    static {
        boolean z8;
        AbstractC1522Jm0 c1767Pm0;
        Throwable th;
        try {
            z8 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", C0709m.FALSE));
        } catch (SecurityException unused) {
            z8 = false;
        }
        f16718d = z8;
        f16719e = new C1933Tn0(AbstractC1972Um0.class);
        AbstractC2054Wm0 abstractC2054Wm0 = null;
        try {
            th = null;
            c1767Pm0 = new C1890Sm0(null);
            e = null;
        } catch (Error | Exception e8) {
            e = e8;
            try {
                th = null;
                c1767Pm0 = new C1685Nm0(AtomicReferenceFieldUpdater.newUpdater(C1931Tm0.class, Thread.class, CmtrInfoDao.CmtrInfoRequest.JOB_DV_CD_A), AtomicReferenceFieldUpdater.newUpdater(C1931Tm0.class, C1931Tm0.class, CmtrInfoDao.CmtrInfoRequest.JOB_DV_CD_B), AtomicReferenceFieldUpdater.newUpdater(AbstractC1972Um0.class, C1931Tm0.class, CmtrInfoDao.CmtrInfoRequest.JOB_DV_CD_C), AtomicReferenceFieldUpdater.newUpdater(AbstractC1972Um0.class, C1644Mm0.class, CmtrInfoDao.CmtrInfoRequest.JOB_DV_CD_B), AtomicReferenceFieldUpdater.newUpdater(AbstractC1972Um0.class, Object.class, CmtrInfoDao.CmtrInfoRequest.JOB_DV_CD_A));
            } catch (Error | Exception e9) {
                c1767Pm0 = new C1767Pm0(abstractC2054Wm0);
                th = e9;
            }
        }
        f16720f = c1767Pm0;
        if (th != null) {
            C1933Tn0 c1933Tn0 = f16719e;
            Logger loggerA = c1933Tn0.a();
            Level level = Level.SEVERE;
            loggerA.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", e);
            c1933Tn0.a().logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
        f16721g = new Object();
    }

    protected AbstractC1972Um0() {
    }

    private static final Object b(Object obj) throws ExecutionException {
        if (obj instanceof C1563Km0) {
            Throwable th = ((C1563Km0) obj).f13861b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof C1604Lm0) {
            throw new ExecutionException(((C1604Lm0) obj).f14352a);
        }
        if (obj == f16721g) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object d(com.google.common.util.concurrent.C c9) {
        Throwable thA;
        if (c9 instanceof InterfaceC1808Qm0) {
            Object c1563Km0 = ((AbstractC1972Um0) c9).f16722a;
            if (c1563Km0 instanceof C1563Km0) {
                C1563Km0 c1563Km02 = (C1563Km0) c1563Km0;
                if (c1563Km02.f13860a) {
                    Throwable th = c1563Km02.f13861b;
                    c1563Km0 = th != null ? new C1563Km0(false, th) : C1563Km0.f13859d;
                }
            }
            Objects.requireNonNull(c1563Km0);
            return c1563Km0;
        }
        if ((c9 instanceof AbstractC3657mo0) && (thA = ((AbstractC3657mo0) c9).a()) != null) {
            return new C1604Lm0(thA);
        }
        boolean zIsCancelled = c9.isCancelled();
        if ((!f16718d) && zIsCancelled) {
            C1563Km0 c1563Km03 = C1563Km0.f13859d;
            Objects.requireNonNull(c1563Km03);
            return c1563Km03;
        }
        try {
            Object objE = e(c9);
            if (!zIsCancelled) {
                return objE == null ? f16721g : objE;
            }
            return new C1563Km0(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + String.valueOf(c9)));
        } catch (Error e8) {
            e = e8;
            return new C1604Lm0(e);
        } catch (CancellationException e9) {
            return !zIsCancelled ? new C1604Lm0(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(c9)), e9)) : new C1563Km0(false, e9);
        } catch (ExecutionException e10) {
            return zIsCancelled ? new C1563Km0(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(c9)), e10)) : new C1604Lm0(e10.getCause());
        } catch (Exception e11) {
            e = e11;
            return new C1604Lm0(e);
        }
    }

    private static Object e(Future future) {
        Object obj;
        boolean z8 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z8 = true;
            } catch (Throwable th) {
                if (z8) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z8) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    private final void s(StringBuilder sb) {
        try {
            Object objE = e(this);
            sb.append("SUCCESS, result=[");
            if (objE == null) {
                sb.append("null");
            } else if (objE == this) {
                sb.append("this future");
            } else {
                sb.append(objE.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(objE)));
            }
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (ExecutionException e8) {
            sb.append("FAILURE, cause=[");
            sb.append(e8.getCause());
            sb.append("]");
        } catch (Exception e9) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e9.getClass());
            sb.append(" thrown from get()]");
        }
    }

    private final void t(StringBuilder sb) {
        String strConcat;
        int length = sb.length();
        sb.append("PENDING");
        Object obj = this.f16722a;
        if (obj instanceof RunnableC1726Om0) {
            sb.append(", setFuture=[");
            u(sb, ((RunnableC1726Om0) obj).f15153b);
            sb.append("]");
        } else {
            try {
                strConcat = AbstractC1802Qj0.zza(zza());
            } catch (Exception | StackOverflowError e8) {
                strConcat = "Exception thrown from implementation: ".concat(String.valueOf(e8.getClass()));
            }
            if (strConcat != null) {
                sb.append(", info=[");
                sb.append(strConcat);
                sb.append("]");
            }
        }
        if (isDone()) {
            sb.delete(length, sb.length());
            s(sb);
        }
    }

    private final void u(StringBuilder sb, Object obj) {
        try {
            if (obj == this) {
                sb.append("this future");
            } else {
                sb.append(obj);
            }
        } catch (Exception e8) {
            e = e8;
            sb.append("Exception thrown from implementation: ");
            sb.append(e.getClass());
        } catch (StackOverflowError e9) {
            e = e9;
            sb.append("Exception thrown from implementation: ");
            sb.append(e.getClass());
        }
    }

    public static void v(AbstractC1972Um0 abstractC1972Um0, boolean z8) {
        C1644Mm0 c1644Mm0 = null;
        while (true) {
            for (C1931Tm0 c1931Tm0B = f16720f.b(abstractC1972Um0, C1931Tm0.f16519c); c1931Tm0B != null; c1931Tm0B = c1931Tm0B.f16521b) {
                Thread thread = c1931Tm0B.f16520a;
                if (thread != null) {
                    c1931Tm0B.f16520a = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z8) {
                abstractC1972Um0.o();
            }
            abstractC1972Um0.c();
            C1644Mm0 c1644Mm02 = c1644Mm0;
            C1644Mm0 c1644Mm0A = f16720f.a(abstractC1972Um0, C1644Mm0.f14700d);
            C1644Mm0 c1644Mm03 = c1644Mm02;
            while (c1644Mm0A != null) {
                C1644Mm0 c1644Mm04 = c1644Mm0A.f14703c;
                c1644Mm0A.f14703c = c1644Mm03;
                c1644Mm03 = c1644Mm0A;
                c1644Mm0A = c1644Mm04;
            }
            while (c1644Mm03 != null) {
                c1644Mm0 = c1644Mm03.f14703c;
                Runnable runnable = c1644Mm03.f14701a;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof RunnableC1726Om0) {
                    RunnableC1726Om0 runnableC1726Om0 = (RunnableC1726Om0) runnable2;
                    abstractC1972Um0 = runnableC1726Om0.f15152a;
                    if (abstractC1972Um0.f16722a == runnableC1726Om0) {
                        if (f16720f.f(abstractC1972Um0, runnableC1726Om0, d(runnableC1726Om0.f15153b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = c1644Mm03.f14702b;
                    Objects.requireNonNull(executor);
                    w(runnable2, executor);
                }
                c1644Mm03 = c1644Mm0;
            }
            return;
            z8 = false;
        }
    }

    private static void w(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e8) {
            f16719e.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + String.valueOf(runnable) + " with executor " + String.valueOf(executor), (Throwable) e8);
        }
    }

    private final void x(C1931Tm0 c1931Tm0) {
        c1931Tm0.f16520a = null;
        while (true) {
            C1931Tm0 c1931Tm02 = this.f16724c;
            if (c1931Tm02 != C1931Tm0.f16519c) {
                C1931Tm0 c1931Tm03 = null;
                while (c1931Tm02 != null) {
                    C1931Tm0 c1931Tm04 = c1931Tm02.f16521b;
                    if (c1931Tm02.f16520a != null) {
                        c1931Tm03 = c1931Tm02;
                    } else if (c1931Tm03 != null) {
                        c1931Tm03.f16521b = c1931Tm04;
                        if (c1931Tm03.f16520a == null) {
                            break;
                        }
                    } else if (!f16720f.g(this, c1931Tm02, c1931Tm04)) {
                        break;
                    }
                    c1931Tm02 = c1931Tm04;
                }
                return;
            }
            return;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3657mo0
    protected final Throwable a() {
        if (!(this instanceof InterfaceC1808Qm0)) {
            return null;
        }
        Object obj = this.f16722a;
        if (obj instanceof C1604Lm0) {
            return ((C1604Lm0) obj).f14352a;
        }
        return null;
    }

    public void addListener(Runnable runnable, Executor executor) {
        C1644Mm0 c1644Mm0;
        AbstractC1188Bj0.zzc(runnable, "Runnable was null.");
        AbstractC1188Bj0.zzc(executor, "Executor was null.");
        if (!isDone() && (c1644Mm0 = this.f16723b) != C1644Mm0.f14700d) {
            C1644Mm0 c1644Mm02 = new C1644Mm0(runnable, executor);
            do {
                c1644Mm02.f14703c = c1644Mm0;
                if (f16720f.e(this, c1644Mm0, c1644Mm02)) {
                    return;
                } else {
                    c1644Mm0 = this.f16723b;
                }
            } while (c1644Mm0 != C1644Mm0.f14700d);
        }
        w(runnable, executor);
    }

    protected void c() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:?, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f16722a
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.RunnableC1726Om0
            r2 = 0
            r3 = 1
            if (r0 != 0) goto La
            r4 = r3
            goto Lb
        La:
            r4 = r2
        Lb:
            r1 = r1 | r4
            if (r1 == 0) goto L60
            boolean r1 = com.google.android.gms.internal.ads.AbstractC1972Um0.f16718d
            if (r1 == 0) goto L1f
            com.google.android.gms.internal.ads.Km0 r1 = new com.google.android.gms.internal.ads.Km0
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r1.<init>(r8, r4)
            goto L29
        L1f:
            if (r8 == 0) goto L24
            com.google.android.gms.internal.ads.Km0 r1 = com.google.android.gms.internal.ads.C1563Km0.f13858c
            goto L26
        L24:
            com.google.android.gms.internal.ads.Km0 r1 = com.google.android.gms.internal.ads.C1563Km0.f13859d
        L26:
            java.util.Objects.requireNonNull(r1)
        L29:
            r4 = r7
            r5 = r2
        L2b:
            com.google.android.gms.internal.ads.Jm0 r6 = com.google.android.gms.internal.ads.AbstractC1972Um0.f16720f
            boolean r6 = r6.f(r4, r0, r1)
            if (r6 == 0) goto L59
            v(r4, r8)
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.RunnableC1726Om0
            if (r4 == 0) goto L53
            com.google.android.gms.internal.ads.Om0 r0 = (com.google.android.gms.internal.ads.RunnableC1726Om0) r0
            com.google.common.util.concurrent.C r0 = r0.f15153b
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.InterfaceC1808Qm0
            if (r4 == 0) goto L55
            r4 = r0
            com.google.android.gms.internal.ads.Um0 r4 = (com.google.android.gms.internal.ads.AbstractC1972Um0) r4
            java.lang.Object r0 = r4.f16722a
            if (r0 != 0) goto L4b
            r5 = r3
            goto L4c
        L4b:
            r5 = r2
        L4c:
            boolean r6 = r0 instanceof com.google.android.gms.internal.ads.RunnableC1726Om0
            r5 = r5 | r6
            if (r5 == 0) goto L53
            r5 = r3
            goto L2b
        L53:
            r2 = r3
            goto L60
        L55:
            r0.cancel(r8)
            goto L53
        L59:
            java.lang.Object r0 = r4.f16722a
            boolean r6 = r0 instanceof com.google.android.gms.internal.ads.RunnableC1726Om0
            if (r6 != 0) goto L2b
            r2 = r5
        L60:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC1972Um0.cancel(boolean):boolean");
    }

    public Object get() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f16722a;
        if ((obj2 != null) && (!(obj2 instanceof RunnableC1726Om0))) {
            return b(obj2);
        }
        C1931Tm0 c1931Tm0 = this.f16724c;
        if (c1931Tm0 != C1931Tm0.f16519c) {
            C1931Tm0 c1931Tm02 = new C1931Tm0();
            do {
                AbstractC1522Jm0 abstractC1522Jm0 = f16720f;
                abstractC1522Jm0.c(c1931Tm02, c1931Tm0);
                if (abstractC1522Jm0.g(this, c1931Tm0, c1931Tm02)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            x(c1931Tm02);
                            throw new InterruptedException();
                        }
                        obj = this.f16722a;
                    } while (!((obj != null) & (!(obj instanceof RunnableC1726Om0))));
                    return b(obj);
                }
                c1931Tm0 = this.f16724c;
            } while (c1931Tm0 != C1931Tm0.f16519c);
        }
        Object obj3 = this.f16722a;
        Objects.requireNonNull(obj3);
        return b(obj3);
    }

    public boolean isCancelled() {
        return this.f16722a instanceof C1563Km0;
    }

    public boolean isDone() {
        return (this.f16722a != null) & (!(r0 instanceof RunnableC1726Om0));
    }

    protected void o() {
    }

    final void p(Future future) {
        if ((future != null) && isCancelled()) {
            future.cancel(r());
        }
    }

    protected final boolean q(com.google.common.util.concurrent.C c9) {
        C1604Lm0 c1604Lm0;
        c9.getClass();
        Object obj = this.f16722a;
        if (obj == null) {
            if (c9.isDone()) {
                if (!f16720f.f(this, null, d(c9))) {
                    return false;
                }
                v(this, false);
                return true;
            }
            RunnableC1726Om0 runnableC1726Om0 = new RunnableC1726Om0(this, c9);
            if (f16720f.f(this, null, runnableC1726Om0)) {
                try {
                    c9.addListener(runnableC1726Om0, EnumC4794wn0.INSTANCE);
                } catch (Throwable th) {
                    try {
                        c1604Lm0 = new C1604Lm0(th);
                    } catch (Error | Exception unused) {
                        c1604Lm0 = C1604Lm0.f14351b;
                    }
                    f16720f.f(this, runnableC1726Om0, c1604Lm0);
                }
                return true;
            }
            obj = this.f16722a;
        }
        if (obj instanceof C1563Km0) {
            c9.cancel(((C1563Km0) obj).f13860a);
        }
        return false;
    }

    protected final boolean r() {
        Object obj = this.f16722a;
        return (obj instanceof C1563Km0) && ((C1563Km0) obj).f13860a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            s(sb);
        } else {
            t(sb);
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String zza() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    protected boolean zzc(Object obj) {
        if (obj == null) {
            obj = f16721g;
        }
        if (!f16720f.f(this, null, obj)) {
            return false;
        }
        v(this, false);
        return true;
    }

    protected boolean zzd(Throwable th) {
        th.getClass();
        if (!f16720f.f(this, null, new C1604Lm0(th))) {
            return false;
        }
        v(this, false);
        return true;
    }

    public Object get(long j8, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j8);
        if (!Thread.interrupted()) {
            Object obj = this.f16722a;
            boolean z8 = true;
            if ((obj != null) & (!(obj instanceof RunnableC1726Om0))) {
                return b(obj);
            }
            long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                C1931Tm0 c1931Tm0 = this.f16724c;
                if (c1931Tm0 != C1931Tm0.f16519c) {
                    C1931Tm0 c1931Tm02 = new C1931Tm0();
                    do {
                        AbstractC1522Jm0 abstractC1522Jm0 = f16720f;
                        abstractC1522Jm0.c(c1931Tm02, c1931Tm0);
                        if (abstractC1522Jm0.g(this, c1931Tm0, c1931Tm02)) {
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f16722a;
                                    if ((obj2 != null) & (!(obj2 instanceof RunnableC1726Om0))) {
                                        return b(obj2);
                                    }
                                    nanos = jNanoTime - System.nanoTime();
                                } else {
                                    x(c1931Tm02);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            x(c1931Tm02);
                        } else {
                            c1931Tm0 = this.f16724c;
                        }
                    } while (c1931Tm0 != C1931Tm0.f16519c);
                }
                Object obj3 = this.f16722a;
                Objects.requireNonNull(obj3);
                return b(obj3);
            }
            while (nanos > 0) {
                Object obj4 = this.f16722a;
                if ((obj4 != null) & (!(obj4 instanceof RunnableC1726Om0))) {
                    return b(obj4);
                }
                if (!Thread.interrupted()) {
                    nanos = jNanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String string = toString();
            String string2 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = string2.toLowerCase(locale);
            String strConcat = "Waited " + j8 + Q7.X.SPACE + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String strConcat2 = strConcat.concat(" (plus ");
                long j9 = -nanos;
                long jConvert = timeUnit.convert(j9, TimeUnit.NANOSECONDS);
                long nanos2 = j9 - timeUnit.toNanos(jConvert);
                if (jConvert != 0 && nanos2 <= 1000) {
                    z8 = false;
                }
                if (jConvert > 0) {
                    String strConcat3 = strConcat2 + jConvert + Q7.X.SPACE + lowerCase;
                    if (z8) {
                        strConcat3 = strConcat3.concat(",");
                    }
                    strConcat2 = strConcat3.concat(Q7.X.SPACE);
                }
                if (z8) {
                    strConcat2 = strConcat2 + nanos2 + " nanoseconds ";
                }
                strConcat = strConcat2.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(strConcat.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(strConcat + " for " + string);
        }
        throw new InterruptedException();
    }
}
