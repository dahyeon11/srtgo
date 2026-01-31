package com.airbnb.lottie;

import T0.v;
import T0.z;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* loaded from: classes.dex */
public class q {
    public static Executor EXECUTOR = Executors.newCachedThreadPool();

    /* renamed from: a, reason: collision with root package name */
    private final Set f11682a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f11683b;

    /* renamed from: c, reason: collision with root package name */
    private final Handler f11684c;

    /* renamed from: d, reason: collision with root package name */
    private volatile z f11685d;

    private class a extends FutureTask {
        a(Callable callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            if (isCancelled()) {
                return;
            }
            try {
                q.this.g((z) get());
            } catch (InterruptedException | ExecutionException e8) {
                q.this.g(new z(e8));
            }
        }
    }

    public q(Callable<z> callable) {
        this(callable, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        z zVar = this.f11685d;
        if (zVar == null) {
            return;
        }
        if (zVar.getValue() != null) {
            f(zVar.getValue());
        } else {
            d(zVar.getException());
        }
    }

    private synchronized void d(Throwable th) {
        ArrayList arrayList = new ArrayList(this.f11683b);
        if (arrayList.isEmpty()) {
            f1.f.warning("Lottie encountered an error but no failure listener was added:", th);
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((v) it.next()).onResult(th);
        }
    }

    private void e() {
        this.f11684c.post(new Runnable() { // from class: T0.A
            @Override // java.lang.Runnable
            public final void run() {
                this.f4772a.c();
            }
        });
    }

    private synchronized void f(Object obj) {
        Iterator it = new ArrayList(this.f11682a).iterator();
        while (it.hasNext()) {
            ((v) it.next()).onResult(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(z zVar) {
        if (this.f11685d != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.f11685d = zVar;
        e();
    }

    public synchronized q addFailureListener(v vVar) {
        try {
            z zVar = this.f11685d;
            if (zVar != null && zVar.getException() != null) {
                vVar.onResult(zVar.getException());
            }
            this.f11683b.add(vVar);
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public synchronized q addListener(v vVar) {
        try {
            z zVar = this.f11685d;
            if (zVar != null && zVar.getValue() != null) {
                vVar.onResult(zVar.getValue());
            }
            this.f11682a.add(vVar);
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public synchronized q removeFailureListener(v vVar) {
        this.f11683b.remove(vVar);
        return this;
    }

    public synchronized q removeListener(v vVar) {
        this.f11682a.remove(vVar);
        return this;
    }

    q(Callable callable, boolean z8) {
        this.f11682a = new LinkedHashSet(1);
        this.f11683b = new LinkedHashSet(1);
        this.f11684c = new Handler(Looper.getMainLooper());
        this.f11685d = null;
        if (!z8) {
            EXECUTOR.execute(new a(callable));
            return;
        }
        try {
            g((z) callable.call());
        } catch (Throwable th) {
            g(new z(th));
        }
    }
}
