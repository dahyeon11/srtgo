package z;

import android.view.Surface;
import androidx.concurrent.futures.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import z.S;

/* loaded from: classes.dex */
public abstract class X {

    class a implements B.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f37781a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c.a f37782b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ScheduledFuture f37783c;

        a(boolean z8, c.a aVar, ScheduledFuture scheduledFuture) {
            this.f37781a = z8;
            this.f37782b = aVar;
            this.f37783c = scheduledFuture;
        }

        @Override // B.c
        public void onFailure(Throwable th) {
            this.f37782b.set(Collections.unmodifiableList(Collections.emptyList()));
            this.f37783c.cancel(true);
        }

        @Override // B.c
        public void onSuccess(List<Surface> list) {
            ArrayList arrayList = new ArrayList(list);
            if (this.f37781a) {
                arrayList.removeAll(Collections.singleton(null));
            }
            this.f37782b.set(arrayList);
            this.f37783c.cancel(true);
        }
    }

    public static void decrementAll(List<S> list) {
        Iterator<S> it = list.iterator();
        while (it.hasNext()) {
            it.next().decrementUseCount();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(com.google.common.util.concurrent.C c9, c.a aVar, long j8) {
        if (c9.isDone()) {
            return;
        }
        aVar.setException(new TimeoutException("Cannot complete surfaceList within " + j8));
        c9.cancel(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f(Executor executor, final com.google.common.util.concurrent.C c9, final c.a aVar, final long j8) {
        executor.execute(new Runnable() { // from class: z.W
            @Override // java.lang.Runnable
            public final void run() {
                X.e(c9, aVar, j8);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object h(List list, ScheduledExecutorService scheduledExecutorService, final Executor executor, final long j8, boolean z8, final c.a aVar) {
        final com.google.common.util.concurrent.C cSuccessfulAsList = B.f.successfulAsList(list);
        ScheduledFuture<?> scheduledFutureSchedule = scheduledExecutorService.schedule(new Runnable() { // from class: z.U
            @Override // java.lang.Runnable
            public final void run() {
                X.f(executor, cSuccessfulAsList, aVar, j8);
            }
        }, j8, TimeUnit.MILLISECONDS);
        aVar.addCancellationListener(new Runnable() { // from class: z.V
            @Override // java.lang.Runnable
            public final void run() {
                cSuccessfulAsList.cancel(true);
            }
        }, executor);
        B.f.addCallback(cSuccessfulAsList, new a(z8, aVar, scheduledFutureSchedule), executor);
        return "surfaceList";
    }

    public static void incrementAll(List<S> list) throws S.a {
        if (list.isEmpty()) {
            return;
        }
        int i8 = 0;
        do {
            try {
                list.get(i8).incrementUseCount();
                i8++;
            } catch (S.a e8) {
                for (int i9 = i8 - 1; i9 >= 0; i9--) {
                    list.get(i9).decrementUseCount();
                }
                throw e8;
            }
        } while (i8 < list.size());
    }

    public static com.google.common.util.concurrent.C surfaceListWithTimeout(Collection<S> collection, final boolean z8, final long j8, final Executor executor, final ScheduledExecutorService scheduledExecutorService) {
        final ArrayList arrayList = new ArrayList();
        Iterator<S> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getSurface());
        }
        return androidx.concurrent.futures.c.getFuture(new c.InterfaceC0123c() { // from class: z.T
            @Override // androidx.concurrent.futures.c.InterfaceC0123c
            public final Object attachCompleter(c.a aVar) {
                return X.h(arrayList, scheduledExecutorService, executor, j8, z8, aVar);
            }
        });
    }

    public static boolean tryIncrementAll(List<S> list) {
        try {
            incrementAll(list);
            return true;
        } catch (S.a unused) {
            return false;
        }
    }
}
