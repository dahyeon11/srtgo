package l0;

import Z.p;
import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import androidx.core.os.n;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* renamed from: l0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5879a extends C5880b {

    /* renamed from: i, reason: collision with root package name */
    private final Executor f33903i;

    /* renamed from: j, reason: collision with root package name */
    volatile RunnableC0341a f33904j;

    /* renamed from: k, reason: collision with root package name */
    volatile RunnableC0341a f33905k;

    /* renamed from: l, reason: collision with root package name */
    long f33906l;

    /* renamed from: m, reason: collision with root package name */
    long f33907m;

    /* renamed from: n, reason: collision with root package name */
    Handler f33908n;

    /* renamed from: l0.a$a, reason: collision with other inner class name */
    final class RunnableC0341a extends AbstractC5881c implements Runnable {

        /* renamed from: j, reason: collision with root package name */
        private final CountDownLatch f33909j = new CountDownLatch(1);

        /* renamed from: k, reason: collision with root package name */
        boolean f33910k;

        RunnableC0341a() {
        }

        @Override // l0.AbstractC5881c
        protected void d(Object obj) {
            try {
                AbstractC5879a.this.g(this, obj);
            } finally {
                this.f33909j.countDown();
            }
        }

        @Override // l0.AbstractC5881c
        protected void e(Object obj) {
            try {
                AbstractC5879a.this.h(this, obj);
            } finally {
                this.f33909j.countDown();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // l0.AbstractC5881c
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Object a(Void... voidArr) {
            try {
                return AbstractC5879a.this.j();
            } catch (n e8) {
                if (isCancelled()) {
                    return null;
                }
                throw e8;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f33910k = false;
            AbstractC5879a.this.i();
        }

        public void waitForLoader() throws InterruptedException {
            try {
                this.f33909j.await();
            } catch (InterruptedException unused) {
            }
        }
    }

    public AbstractC5879a(Context context) {
        this(context, AbstractC5881c.THREAD_POOL_EXECUTOR);
    }

    @Override // l0.C5880b
    protected boolean b() {
        if (this.f33904j == null) {
            return false;
        }
        if (!this.f33915d) {
            this.f33918g = true;
        }
        if (this.f33905k != null) {
            if (this.f33904j.f33910k) {
                this.f33904j.f33910k = false;
                this.f33908n.removeCallbacks(this.f33904j);
            }
            this.f33904j = null;
            return false;
        }
        if (this.f33904j.f33910k) {
            this.f33904j.f33910k = false;
            this.f33908n.removeCallbacks(this.f33904j);
            this.f33904j = null;
            return false;
        }
        boolean zCancel = this.f33904j.cancel(false);
        if (zCancel) {
            this.f33905k = this.f33904j;
            cancelLoadInBackground();
        }
        this.f33904j = null;
        return zCancel;
    }

    @Override // l0.C5880b
    protected void c() {
        super.c();
        cancelLoad();
        this.f33904j = new RunnableC0341a();
        i();
    }

    @Override // l0.C5880b
    @Deprecated
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (this.f33904j != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f33904j);
            printWriter.print(" waiting=");
            printWriter.println(this.f33904j.f33910k);
        }
        if (this.f33905k != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f33905k);
            printWriter.print(" waiting=");
            printWriter.println(this.f33905k.f33910k);
        }
        if (this.f33906l != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            p.formatDuration(this.f33906l, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            p.formatDuration(this.f33907m, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }

    void g(RunnableC0341a runnableC0341a, Object obj) {
        onCanceled(obj);
        if (this.f33905k == runnableC0341a) {
            rollbackContentChanged();
            this.f33907m = SystemClock.uptimeMillis();
            this.f33905k = null;
            deliverCancellation();
            i();
        }
    }

    void h(RunnableC0341a runnableC0341a, Object obj) {
        if (this.f33904j != runnableC0341a) {
            g(runnableC0341a, obj);
            return;
        }
        if (isAbandoned()) {
            onCanceled(obj);
            return;
        }
        commitContentChanged();
        this.f33907m = SystemClock.uptimeMillis();
        this.f33904j = null;
        deliverResult(obj);
    }

    void i() {
        if (this.f33905k != null || this.f33904j == null) {
            return;
        }
        if (this.f33904j.f33910k) {
            this.f33904j.f33910k = false;
            this.f33908n.removeCallbacks(this.f33904j);
        }
        if (this.f33906l <= 0 || SystemClock.uptimeMillis() >= this.f33907m + this.f33906l) {
            this.f33904j.executeOnExecutor(this.f33903i, null);
        } else {
            this.f33904j.f33910k = true;
            this.f33908n.postAtTime(this.f33904j, this.f33907m + this.f33906l);
        }
    }

    public boolean isLoadInBackgroundCanceled() {
        return this.f33905k != null;
    }

    protected Object j() {
        return loadInBackground();
    }

    public abstract Object loadInBackground();

    public void setUpdateThrottle(long j8) {
        this.f33906l = j8;
        if (j8 != 0) {
            this.f33908n = new Handler();
        }
    }

    public void waitForLoader() throws InterruptedException {
        RunnableC0341a runnableC0341a = this.f33904j;
        if (runnableC0341a != null) {
            runnableC0341a.waitForLoader();
        }
    }

    private AbstractC5879a(Context context, Executor executor) {
        super(context);
        this.f33907m = -10000L;
        this.f33903i = executor;
    }

    public void cancelLoadInBackground() {
    }

    public void onCanceled(Object obj) {
    }
}
