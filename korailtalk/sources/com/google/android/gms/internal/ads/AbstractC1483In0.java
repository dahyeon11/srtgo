package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.In0 */
/* loaded from: classes2.dex */
public abstract class AbstractC1483In0 extends AbstractC1565Kn0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static C1442Hn0 zza(Iterable iterable) {
        return new C1442Hn0(false, AbstractC2394bl0.zzk(iterable), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C1442Hn0 zzb(Iterable iterable) {
        int i8 = AbstractC2394bl0.zzd;
        iterable.getClass();
        return new C1442Hn0(true, AbstractC2394bl0.zzk(iterable), null);
    }

    @SafeVarargs
    public static C1442Hn0 zzc(com.google.common.util.concurrent.C... cArr) {
        return new C1442Hn0(true, AbstractC2394bl0.zzl(cArr), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static com.google.common.util.concurrent.C zzd(Iterable iterable) {
        return new C4111qn0(AbstractC2394bl0.zzk(iterable), true);
    }

    public static com.google.common.util.concurrent.C zze(com.google.common.util.concurrent.C c9, Class cls, InterfaceC3875oj0 interfaceC3875oj0, Executor executor) {
        C1399Gm0 c1399Gm0 = new C1399Gm0(c9, cls, interfaceC3875oj0);
        c9.addListener(c1399Gm0, AbstractC2285ao0.a(executor, c1399Gm0));
        return c1399Gm0;
    }

    public static com.google.common.util.concurrent.C zzf(com.google.common.util.concurrent.C c9, Class cls, InterfaceC3997pn0 interfaceC3997pn0, Executor executor) {
        C1358Fm0 c1358Fm0 = new C1358Fm0(c9, cls, interfaceC3997pn0);
        c9.addListener(c1358Fm0, AbstractC2285ao0.a(executor, c1358Fm0));
        return c1358Fm0;
    }

    public static com.google.common.util.concurrent.C zzg(Throwable th) {
        th.getClass();
        return new C1606Ln0(th);
    }

    public static com.google.common.util.concurrent.C zzh(Object obj) {
        return obj == null ? C1646Mn0.f14704b : new C1646Mn0(obj);
    }

    public static com.google.common.util.concurrent.C zzi() {
        return C1646Mn0.f14704b;
    }

    public static com.google.common.util.concurrent.C zzj(Callable callable, Executor executor) {
        RunnableFutureC3315jo0 runnableFutureC3315jo0 = new RunnableFutureC3315jo0(callable);
        executor.execute(runnableFutureC3315jo0);
        return runnableFutureC3315jo0;
    }

    public static com.google.common.util.concurrent.C zzk(InterfaceC3769nn0 interfaceC3769nn0, Executor executor) {
        RunnableFutureC3315jo0 runnableFutureC3315jo0 = new RunnableFutureC3315jo0(interfaceC3769nn0);
        executor.execute(runnableFutureC3315jo0);
        return runnableFutureC3315jo0;
    }

    @SafeVarargs
    public static com.google.common.util.concurrent.C zzl(com.google.common.util.concurrent.C... cArr) {
        return new C4111qn0(AbstractC2394bl0.zzl(cArr), false);
    }

    public static com.google.common.util.concurrent.C zzm(com.google.common.util.concurrent.C c9, InterfaceC3875oj0 interfaceC3875oj0, Executor executor) {
        C2512cn0 c2512cn0 = new C2512cn0(c9, interfaceC3875oj0);
        c9.addListener(c2512cn0, AbstractC2285ao0.a(executor, c2512cn0));
        return c2512cn0;
    }

    public static com.google.common.util.concurrent.C zzn(com.google.common.util.concurrent.C c9, InterfaceC3997pn0 interfaceC3997pn0, Executor executor) {
        int i8 = AbstractRunnableC2627dn0.zzc;
        executor.getClass();
        C2398bn0 c2398bn0 = new C2398bn0(c9, interfaceC3997pn0);
        c9.addListener(c2398bn0, AbstractC2285ao0.a(executor, c2398bn0));
        return c2398bn0;
    }

    public static com.google.common.util.concurrent.C zzo(com.google.common.util.concurrent.C c9, long j8, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return c9.isDone() ? c9 : C2973go0.z(c9, j8, timeUnit, scheduledExecutorService);
    }

    public static Object zzp(Future future) {
        if (future.isDone()) {
            return AbstractC3543lo0.zza(future);
        }
        throw new IllegalStateException(AbstractC1802Qj0.zzb("Future was expected to be done: %s", future));
    }

    public static Object zzq(Future future) {
        try {
            return AbstractC3543lo0.zza(future);
        } catch (ExecutionException e8) {
            Throwable cause = e8.getCause();
            if (cause instanceof Error) {
                throw new C4908xn0((Error) cause);
            }
            throw new C3429ko0(cause);
        }
    }

    public static void zzr(com.google.common.util.concurrent.C c9, InterfaceC1319En0 interfaceC1319En0, Executor executor) {
        interfaceC1319En0.getClass();
        c9.addListener(new RunnableC1360Fn0(c9, interfaceC1319En0), executor);
    }
}
