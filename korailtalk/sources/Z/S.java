package z;

import android.util.Log;
import android.util.Size;
import androidx.concurrent.futures.c;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class S {
    public static final Size SIZE_UNDEFINED = new Size(0, 0);

    /* renamed from: i, reason: collision with root package name */
    private static final boolean f37756i = androidx.camera.core.B0.isDebugEnabled("DeferrableSurface");

    /* renamed from: j, reason: collision with root package name */
    private static final AtomicInteger f37757j = new AtomicInteger(0);

    /* renamed from: k, reason: collision with root package name */
    private static final AtomicInteger f37758k = new AtomicInteger(0);

    /* renamed from: a, reason: collision with root package name */
    private final Object f37759a;

    /* renamed from: b, reason: collision with root package name */
    private int f37760b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f37761c;

    /* renamed from: d, reason: collision with root package name */
    private c.a f37762d;

    /* renamed from: e, reason: collision with root package name */
    private final com.google.common.util.concurrent.C f37763e;

    /* renamed from: f, reason: collision with root package name */
    private final Size f37764f;

    /* renamed from: g, reason: collision with root package name */
    private final int f37765g;

    /* renamed from: h, reason: collision with root package name */
    Class f37766h;

    public static final class a extends Exception {

        /* renamed from: a, reason: collision with root package name */
        S f37767a;

        public a(String str, S s8) {
            super(str);
            this.f37767a = s8;
        }

        public S getDeferrableSurface() {
            return this.f37767a;
        }
    }

    public static final class b extends Exception {
        public b(String str) {
            super(str);
        }
    }

    public S() {
        this(SIZE_UNDEFINED, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object c(c.a aVar) {
        synchronized (this.f37759a) {
            this.f37762d = aVar;
        }
        return "DeferrableSurface-termination(" + this + ")";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(String str) throws ExecutionException, InterruptedException {
        try {
            this.f37763e.get();
            e("Surface terminated", f37758k.decrementAndGet(), f37757j.get());
        } catch (Exception e8) {
            androidx.camera.core.B0.e("DeferrableSurface", "Unexpected surface termination for " + this + "\nStack Trace:\n" + str);
            synchronized (this.f37759a) {
                throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", this, Boolean.valueOf(this.f37761c), Integer.valueOf(this.f37760b)), e8);
            }
        }
    }

    private void e(String str, int i8, int i9) {
        if (!f37756i && androidx.camera.core.B0.isDebugEnabled("DeferrableSurface")) {
            androidx.camera.core.B0.d("DeferrableSurface", "DeferrableSurface usage statistics may be inaccurate since debug logging was not enabled at static initialization time. App restart may be required to enable accurate usage statistics.");
        }
        androidx.camera.core.B0.d("DeferrableSurface", str + "[total_surfaces=" + i8 + ", used_surfaces=" + i9 + "](" + this + "}");
    }

    public final void close() {
        c.a aVar;
        synchronized (this.f37759a) {
            try {
                if (this.f37761c) {
                    aVar = null;
                } else {
                    this.f37761c = true;
                    if (this.f37760b == 0) {
                        aVar = this.f37762d;
                        this.f37762d = null;
                    } else {
                        aVar = null;
                    }
                    if (androidx.camera.core.B0.isDebugEnabled("DeferrableSurface")) {
                        androidx.camera.core.B0.d("DeferrableSurface", "surface closed,  useCount=" + this.f37760b + " closed=true " + this);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (aVar != null) {
            aVar.set(null);
        }
    }

    public void decrementUseCount() {
        c.a aVar;
        synchronized (this.f37759a) {
            try {
                int i8 = this.f37760b;
                if (i8 == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                int i9 = i8 - 1;
                this.f37760b = i9;
                if (i9 == 0 && this.f37761c) {
                    aVar = this.f37762d;
                    this.f37762d = null;
                } else {
                    aVar = null;
                }
                if (androidx.camera.core.B0.isDebugEnabled("DeferrableSurface")) {
                    androidx.camera.core.B0.d("DeferrableSurface", "use count-1,  useCount=" + this.f37760b + " closed=" + this.f37761c + Q7.X.SPACE + this);
                    if (this.f37760b == 0) {
                        e("Surface no longer in use", f37758k.get(), f37757j.decrementAndGet());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (aVar != null) {
            aVar.set(null);
        }
    }

    public Class<?> getContainerClass() {
        return this.f37766h;
    }

    public Size getPrescribedSize() {
        return this.f37764f;
    }

    public int getPrescribedStreamFormat() {
        return this.f37765g;
    }

    public final com.google.common.util.concurrent.C getSurface() {
        synchronized (this.f37759a) {
            try {
                if (this.f37761c) {
                    return B.f.immediateFailedFuture(new a("DeferrableSurface already closed.", this));
                }
                return provideSurface();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public com.google.common.util.concurrent.C getTerminationFuture() {
        return B.f.nonCancellationPropagating(this.f37763e);
    }

    public int getUseCount() {
        int i8;
        synchronized (this.f37759a) {
            i8 = this.f37760b;
        }
        return i8;
    }

    public void incrementUseCount() {
        synchronized (this.f37759a) {
            try {
                int i8 = this.f37760b;
                if (i8 == 0 && this.f37761c) {
                    throw new a("Cannot begin use on a closed surface.", this);
                }
                this.f37760b = i8 + 1;
                if (androidx.camera.core.B0.isDebugEnabled("DeferrableSurface")) {
                    if (this.f37760b == 1) {
                        e("New surface in use", f37758k.get(), f37757j.incrementAndGet());
                    }
                    androidx.camera.core.B0.d("DeferrableSurface", "use count+1, useCount=" + this.f37760b + Q7.X.SPACE + this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected abstract com.google.common.util.concurrent.C provideSurface();

    public void setContainerClass(Class<?> cls) {
        this.f37766h = cls;
    }

    public S(Size size, int i8) {
        this.f37759a = new Object();
        this.f37760b = 0;
        this.f37761c = false;
        this.f37764f = size;
        this.f37765g = i8;
        com.google.common.util.concurrent.C future = androidx.concurrent.futures.c.getFuture(new c.InterfaceC0123c() { // from class: z.P
            @Override // androidx.concurrent.futures.c.InterfaceC0123c
            public final Object attachCompleter(c.a aVar) {
                return this.f37752a.c(aVar);
            }
        });
        this.f37763e = future;
        if (androidx.camera.core.B0.isDebugEnabled("DeferrableSurface")) {
            e("Surface created", f37758k.incrementAndGet(), f37757j.get());
            final String stackTraceString = Log.getStackTraceString(new Exception());
            future.addListener(new Runnable() { // from class: z.Q
                @Override // java.lang.Runnable
                public final void run() throws ExecutionException, InterruptedException {
                    this.f37754a.d(stackTraceString);
                }
            }, A.a.directExecutor());
        }
    }
}
