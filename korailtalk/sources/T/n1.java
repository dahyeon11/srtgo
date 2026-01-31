package t;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import androidx.concurrent.futures.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
class n1 extends j1 {

    /* renamed from: o */
    private final Object f36734o;

    /* renamed from: p */
    private final Set f36735p;

    /* renamed from: q */
    private final com.google.common.util.concurrent.C f36736q;

    /* renamed from: r */
    c.a f36737r;

    /* renamed from: s */
    private List f36738s;

    /* renamed from: t */
    com.google.common.util.concurrent.C f36739t;

    /* renamed from: u */
    com.google.common.util.concurrent.C f36740u;

    /* renamed from: v */
    private boolean f36741v;

    /* renamed from: w */
    private final CameraCaptureSession.CaptureCallback f36742w;

    class a extends CameraCaptureSession.CaptureCallback {
        a() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i8) {
            c.a aVar = n1.this.f36737r;
            if (aVar != null) {
                aVar.setCancelled();
                n1.this.f36737r = null;
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j8, long j9) {
            c.a aVar = n1.this.f36737r;
            if (aVar != null) {
                aVar.set(null);
                n1.this.f36737r = null;
            }
        }
    }

    n1(Set set, C0 c02, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        super(c02, executor, scheduledExecutorService, handler);
        this.f36734o = new Object();
        this.f36742w = new a();
        this.f36735p = set;
        if (set.contains("wait_for_request")) {
            this.f36736q = androidx.concurrent.futures.c.getFuture(new c.InterfaceC0123c() { // from class: t.k1
                @Override // androidx.concurrent.futures.c.InterfaceC0123c
                public final Object attachCompleter(c.a aVar) {
                    return this.f36720a.w(aVar);
                }
            });
        } else {
            this.f36736q = B.f.immediateFuture(null);
        }
    }

    public /* synthetic */ void i() {
        s("Session call super.close()");
        super.close();
    }

    static void t(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            d1 d1Var = (d1) it.next();
            d1Var.getStateCallback().onClosed(d1Var);
        }
    }

    private void u(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            d1 d1Var = (d1) it.next();
            d1Var.getStateCallback().onConfigureFailed(d1Var);
        }
    }

    private List v(String str, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((d1) it.next()).getSynchronizedBlocker(str));
        }
        return arrayList;
    }

    public /* synthetic */ Object w(c.a aVar) {
        this.f36737r = aVar;
        return "StartStreamingFuture[session=" + this + "]";
    }

    public /* synthetic */ com.google.common.util.concurrent.C x(CameraDevice cameraDevice, v.g gVar, List list, List list2) {
        return super.openCaptureSession(cameraDevice, gVar, list);
    }

    @Override // t.j1, t.d1
    public void close() {
        s("Session call close()");
        if (this.f36735p.contains("wait_for_request")) {
            synchronized (this.f36734o) {
                try {
                    if (!this.f36741v) {
                        this.f36736q.cancel(true);
                    }
                } finally {
                }
            }
        }
        this.f36736q.addListener(new Runnable() { // from class: t.l1
            @Override // java.lang.Runnable
            public final void run() {
                this.f36722a.i();
            }
        }, getExecutor());
    }

    @Override // t.j1, t.d1
    public com.google.common.util.concurrent.C getSynchronizedBlocker(String str) {
        str.hashCode();
        return !str.equals("wait_for_request") ? super.getSynchronizedBlocker(str) : B.f.nonCancellationPropagating(this.f36736q);
    }

    @Override // t.j1, t.d1.a
    public void onClosed(d1 d1Var) {
        r();
        s("onClosed()");
        super.onClosed(d1Var);
    }

    @Override // t.j1, t.d1.a
    public void onConfigured(d1 d1Var) {
        d1 d1Var2;
        d1 d1Var3;
        s("Session onConfigured()");
        if (this.f36735p.contains("force_close")) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = this.f36695b.f().iterator();
            while (it.hasNext() && (d1Var3 = (d1) it.next()) != d1Var) {
                linkedHashSet.add(d1Var3);
            }
            u(linkedHashSet);
        }
        super.onConfigured(d1Var);
        if (this.f36735p.contains("force_close")) {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            Iterator it2 = this.f36695b.d().iterator();
            while (it2.hasNext() && (d1Var2 = (d1) it2.next()) != d1Var) {
                linkedHashSet2.add(d1Var2);
            }
            t(linkedHashSet2);
        }
    }

    @Override // t.j1, t.o1.b
    public com.google.common.util.concurrent.C openCaptureSession(final CameraDevice cameraDevice, final v.g gVar, final List<z.S> list) {
        com.google.common.util.concurrent.C cNonCancellationPropagating;
        synchronized (this.f36734o) {
            B.d dVarTransformAsync = B.d.from(B.f.successfulAsList(v("wait_for_request", this.f36695b.e()))).transformAsync(new B.a() { // from class: t.m1
                @Override // B.a
                public final com.google.common.util.concurrent.C apply(Object obj) {
                    return this.f36727a.x(cameraDevice, gVar, list, (List) obj);
                }
            }, A.a.directExecutor());
            this.f36739t = dVarTransformAsync;
            cNonCancellationPropagating = B.f.nonCancellationPropagating(dVarTransformAsync);
        }
        return cNonCancellationPropagating;
    }

    void r() {
        synchronized (this.f36734o) {
            try {
                if (this.f36738s == null) {
                    s("deferrableSurface == null, maybe forceClose, skip close");
                    return;
                }
                if (this.f36735p.contains("deferrableSurface_close")) {
                    Iterator it = this.f36738s.iterator();
                    while (it.hasNext()) {
                        ((z.S) it.next()).close();
                    }
                    s("deferrableSurface closed");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void s(String str) {
        androidx.camera.core.B0.d("SyncCaptureSessionImpl", "[" + this + "] " + str);
    }

    @Override // t.j1, t.d1
    public int setSingleRepeatingRequest(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        int singleRepeatingRequest;
        if (!this.f36735p.contains("wait_for_request")) {
            return super.setSingleRepeatingRequest(captureRequest, captureCallback);
        }
        synchronized (this.f36734o) {
            this.f36741v = true;
            singleRepeatingRequest = super.setSingleRepeatingRequest(captureRequest, T.createComboCallback(this.f36742w, captureCallback));
        }
        return singleRepeatingRequest;
    }

    @Override // t.j1, t.o1.b
    public com.google.common.util.concurrent.C startWithDeferrableSurface(List<z.S> list, long j8) {
        com.google.common.util.concurrent.C cNonCancellationPropagating;
        synchronized (this.f36734o) {
            this.f36738s = list;
            cNonCancellationPropagating = B.f.nonCancellationPropagating(super.startWithDeferrableSurface(list, j8));
        }
        return cNonCancellationPropagating;
    }

    @Override // t.j1, t.o1.b
    public boolean stop() {
        boolean zStop;
        synchronized (this.f36734o) {
            try {
                if (h()) {
                    r();
                } else {
                    com.google.common.util.concurrent.C c9 = this.f36739t;
                    if (c9 != null) {
                        c9.cancel(true);
                    }
                    com.google.common.util.concurrent.C c10 = this.f36740u;
                    if (c10 != null) {
                        c10.cancel(true);
                    }
                }
                zStop = super.stop();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zStop;
    }
}
