package I2;

import android.os.Looper;
import i2.AbstractC5683p;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: I2.o */
/* loaded from: classes2.dex */
public abstract class AbstractC0611o {
    private static Object a(AbstractC0608l abstractC0608l) throws ExecutionException {
        if (abstractC0608l.isSuccessful()) {
            return abstractC0608l.getResult();
        }
        if (abstractC0608l.isCanceled()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(abstractC0608l.getException());
    }

    public static <TResult> TResult await(AbstractC0608l abstractC0608l) {
        AbstractC5683p.checkNotMainThread();
        AbstractC5683p.checkNotGoogleApiHandlerThread();
        AbstractC5683p.checkNotNull(abstractC0608l, "Task must not be null");
        if (abstractC0608l.isComplete()) {
            return (TResult) a(abstractC0608l);
        }
        C0615t c0615t = new C0615t(null);
        b(abstractC0608l, c0615t);
        c0615t.zza();
        return (TResult) a(abstractC0608l);
    }

    private static void b(AbstractC0608l abstractC0608l, InterfaceC0616u interfaceC0616u) {
        Executor executor = AbstractC0610n.f2024a;
        abstractC0608l.addOnSuccessListener(executor, interfaceC0616u);
        abstractC0608l.addOnFailureListener(executor, interfaceC0616u);
        abstractC0608l.addOnCanceledListener(executor, interfaceC0616u);
    }

    @Deprecated
    public static <TResult> AbstractC0608l call(Callable<TResult> callable) {
        return call(AbstractC0610n.MAIN_THREAD, callable);
    }

    public static <TResult> AbstractC0608l forCanceled() {
        S s8 = new S();
        s8.zzc();
        return s8;
    }

    public static <TResult> AbstractC0608l forException(Exception exc) {
        S s8 = new S();
        s8.zza(exc);
        return s8;
    }

    public static <TResult> AbstractC0608l forResult(TResult tresult) {
        S s8 = new S();
        s8.zzb(tresult);
        return s8;
    }

    public static AbstractC0608l whenAll(Collection<? extends AbstractC0608l> collection) {
        if (collection == null || collection.isEmpty()) {
            return forResult(null);
        }
        Iterator<? extends AbstractC0608l> it = collection.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new NullPointerException("null tasks are not accepted");
            }
        }
        S s8 = new S();
        C0617v c0617v = new C0617v(collection.size(), s8);
        Iterator<? extends AbstractC0608l> it2 = collection.iterator();
        while (it2.hasNext()) {
            b(it2.next(), c0617v);
        }
        return s8;
    }

    public static AbstractC0608l whenAllComplete(Collection<? extends AbstractC0608l> collection) {
        return whenAllComplete(AbstractC0610n.MAIN_THREAD, collection);
    }

    public static <TResult> AbstractC0608l whenAllSuccess(Collection<? extends AbstractC0608l> collection) {
        return whenAllSuccess(AbstractC0610n.MAIN_THREAD, collection);
    }

    public static <T> AbstractC0608l withTimeout(AbstractC0608l abstractC0608l, long j8, TimeUnit timeUnit) {
        AbstractC5683p.checkNotNull(abstractC0608l, "Task must not be null");
        AbstractC5683p.checkArgument(j8 > 0, "Timeout must be positive");
        AbstractC5683p.checkNotNull(timeUnit, "TimeUnit must not be null");
        final w wVar = new w();
        final C0609m c0609m = new C0609m(wVar);
        final C2.a aVar = new C2.a(Looper.getMainLooper());
        aVar.postDelayed(new Runnable() { // from class: I2.T
            @Override // java.lang.Runnable
            public final void run() {
                c0609m.trySetException(new TimeoutException());
            }
        }, timeUnit.toMillis(j8));
        abstractC0608l.addOnCompleteListener(new InterfaceC0602f() { // from class: I2.U
            @Override // I2.InterfaceC0602f
            public final void onComplete(AbstractC0608l abstractC0608l2) {
                aVar.removeCallbacksAndMessages(null);
                C0609m c0609m2 = c0609m;
                if (abstractC0608l2.isSuccessful()) {
                    c0609m2.trySetResult(abstractC0608l2.getResult());
                } else {
                    if (abstractC0608l2.isCanceled()) {
                        wVar.zza();
                        return;
                    }
                    Exception exception = abstractC0608l2.getException();
                    exception.getClass();
                    c0609m2.trySetException(exception);
                }
            }
        });
        return c0609m.getTask();
    }

    @Deprecated
    public static <TResult> AbstractC0608l call(Executor executor, Callable<TResult> callable) {
        AbstractC5683p.checkNotNull(executor, "Executor must not be null");
        AbstractC5683p.checkNotNull(callable, "Callback must not be null");
        S s8 = new S();
        executor.execute(new V(s8, callable));
        return s8;
    }

    public static AbstractC0608l whenAllComplete(Executor executor, Collection<? extends AbstractC0608l> collection) {
        return (collection == null || collection.isEmpty()) ? forResult(Collections.emptyList()) : whenAll(collection).continueWithTask(executor, new r(collection));
    }

    public static <TResult> AbstractC0608l whenAllSuccess(Executor executor, Collection<? extends AbstractC0608l> collection) {
        return (collection == null || collection.isEmpty()) ? forResult(Collections.emptyList()) : whenAll(collection).continueWith(executor, new C0613q(collection));
    }

    public static AbstractC0608l whenAllComplete(Executor executor, AbstractC0608l... abstractC0608lArr) {
        if (abstractC0608lArr != null && abstractC0608lArr.length != 0) {
            return whenAllComplete(executor, Arrays.asList(abstractC0608lArr));
        }
        return forResult(Collections.emptyList());
    }

    public static <TResult> AbstractC0608l whenAllSuccess(Executor executor, AbstractC0608l... abstractC0608lArr) {
        if (abstractC0608lArr != null && abstractC0608lArr.length != 0) {
            return whenAllSuccess(executor, Arrays.asList(abstractC0608lArr));
        }
        return forResult(Collections.emptyList());
    }

    public static AbstractC0608l whenAllComplete(AbstractC0608l... abstractC0608lArr) {
        if (abstractC0608lArr != null && abstractC0608lArr.length != 0) {
            return whenAllComplete(Arrays.asList(abstractC0608lArr));
        }
        return forResult(Collections.emptyList());
    }

    public static <TResult> AbstractC0608l whenAllSuccess(AbstractC0608l... abstractC0608lArr) {
        if (abstractC0608lArr != null && abstractC0608lArr.length != 0) {
            return whenAllSuccess(Arrays.asList(abstractC0608lArr));
        }
        return forResult(Collections.emptyList());
    }

    public static AbstractC0608l whenAll(AbstractC0608l... abstractC0608lArr) {
        if (abstractC0608lArr != null && abstractC0608lArr.length != 0) {
            return whenAll(Arrays.asList(abstractC0608lArr));
        }
        return forResult(null);
    }

    public static <TResult> TResult await(AbstractC0608l abstractC0608l, long j8, TimeUnit timeUnit) throws TimeoutException {
        AbstractC5683p.checkNotMainThread();
        AbstractC5683p.checkNotGoogleApiHandlerThread();
        AbstractC5683p.checkNotNull(abstractC0608l, "Task must not be null");
        AbstractC5683p.checkNotNull(timeUnit, "TimeUnit must not be null");
        if (abstractC0608l.isComplete()) {
            return (TResult) a(abstractC0608l);
        }
        C0615t c0615t = new C0615t(null);
        b(abstractC0608l, c0615t);
        if (c0615t.zzb(j8, timeUnit)) {
            return (TResult) a(abstractC0608l);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }
}
