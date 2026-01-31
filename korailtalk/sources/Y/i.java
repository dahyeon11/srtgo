package y;

import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.core.InterfaceC0892n;
import androidx.concurrent.futures.c;
import com.google.common.util.concurrent.C;
import java.util.concurrent.Executor;
import s.C6203b;
import t.C6307w;
import y.l;
import z.InterfaceC6565N;

/* loaded from: classes.dex */
public final class i {
    public static final String TAG_KEY = "Camera2CameraControl";

    /* renamed from: c, reason: collision with root package name */
    private final C6307w f37544c;

    /* renamed from: d, reason: collision with root package name */
    final Executor f37545d;

    /* renamed from: g, reason: collision with root package name */
    c.a f37548g;

    /* renamed from: a, reason: collision with root package name */
    private boolean f37542a = false;

    /* renamed from: b, reason: collision with root package name */
    private boolean f37543b = false;

    /* renamed from: e, reason: collision with root package name */
    final Object f37546e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private C6203b.a f37547f = new C6203b.a();

    /* renamed from: h, reason: collision with root package name */
    private final C6307w.c f37549h = new C6307w.c() { // from class: y.d
        @Override // t.C6307w.c
        public final boolean onCaptureResult(TotalCaptureResult totalCaptureResult) {
            return this.f37534a.o(totalCaptureResult);
        }
    };

    public i(C6307w c6307w, Executor executor) {
        this.f37544c = c6307w;
        this.f37545d = executor;
    }

    public static i from(InterfaceC0892n interfaceC0892n) {
        Z.h.checkArgument(interfaceC0892n instanceof C6307w, "CameraControl doesn't contain Camera2 implementation.");
        return ((C6307w) interfaceC0892n).getCamera2CameraControl();
    }

    private void i(l lVar) {
        synchronized (this.f37546e) {
            try {
                for (InterfaceC6565N.a aVar : lVar.listOptions()) {
                    this.f37547f.getMutableConfig().insertOption(aVar, lVar.retrieveOption(aVar));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void j() {
        synchronized (this.f37546e) {
            this.f37547f = new C6203b.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object l(final c.a aVar) {
        this.f37545d.execute(new Runnable() { // from class: y.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f37536a.k(aVar);
            }
        });
        return "addCaptureRequestOptions";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object n(final c.a aVar) {
        this.f37545d.execute(new Runnable() { // from class: y.h
            @Override // java.lang.Runnable
            public final void run() {
                this.f37540a.m(aVar);
            }
        });
        return "clearCaptureRequestOptions";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ boolean o(android.hardware.camera2.TotalCaptureResult r3) {
        /*
            r2 = this;
            androidx.concurrent.futures.c$a r0 = r2.f37548g
            r1 = 0
            if (r0 == 0) goto L32
            android.hardware.camera2.CaptureRequest r3 = r3.getRequest()
            java.lang.Object r3 = r3.getTag()
            boolean r0 = r3 instanceof z.J0
            if (r0 == 0) goto L32
            z.J0 r3 = (z.J0) r3
            java.lang.String r0 = "Camera2CameraControl"
            java.lang.Object r3 = r3.getTag(r0)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto L32
            androidx.concurrent.futures.c$a r0 = r2.f37548g
            int r0 = r0.hashCode()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L32
            androidx.concurrent.futures.c$a r3 = r2.f37548g
            r2.f37548g = r1
            goto L33
        L32:
            r3 = r1
        L33:
            if (r3 == 0) goto L38
            r3.set(r1)
        L38:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: y.i.o(android.hardware.camera2.TotalCaptureResult):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object r(final c.a aVar) {
        this.f37545d.execute(new Runnable() { // from class: y.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f37538a.q(aVar);
            }
        });
        return "setCaptureRequestOptions";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void p(boolean z8) {
        if (this.f37542a == z8) {
            return;
        }
        this.f37542a = z8;
        if (z8) {
            if (this.f37543b) {
                u();
            }
        } else {
            c.a aVar = this.f37548g;
            if (aVar != null) {
                aVar.setException(new InterfaceC0892n.a("The camera control has became inactive."));
                this.f37548g = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void q(c.a aVar) {
        this.f37543b = true;
        c.a aVar2 = this.f37548g;
        if (aVar2 == null) {
            aVar2 = null;
        }
        this.f37548g = aVar;
        if (this.f37542a) {
            u();
        }
        if (aVar2 != null) {
            aVar2.setException(new InterfaceC0892n.a("Camera2CameraControl was updated with new options."));
        }
    }

    private void u() {
        this.f37544c.updateSessionConfig();
        this.f37543b = false;
    }

    public C addCaptureRequestOptions(l lVar) {
        i(lVar);
        return B.f.nonCancellationPropagating(androidx.concurrent.futures.c.getFuture(new c.InterfaceC0123c() { // from class: y.a
            @Override // androidx.concurrent.futures.c.InterfaceC0123c
            public final Object attachCompleter(c.a aVar) {
                return this.f37530a.l(aVar);
            }
        }));
    }

    public C clearCaptureRequestOptions() {
        j();
        return B.f.nonCancellationPropagating(androidx.concurrent.futures.c.getFuture(new c.InterfaceC0123c() { // from class: y.e
            @Override // androidx.concurrent.futures.c.InterfaceC0123c
            public final Object attachCompleter(c.a aVar) {
                return this.f37535a.n(aVar);
            }
        }));
    }

    public C6203b getCamera2ImplConfig() {
        C6203b c6203bBuild;
        synchronized (this.f37546e) {
            try {
                if (this.f37548g != null) {
                    this.f37547f.getMutableConfig().insertOption(C6203b.CAPTURE_REQUEST_TAG_OPTION, Integer.valueOf(this.f37548g.hashCode()));
                }
                c6203bBuild = this.f37547f.build();
            } catch (Throwable th) {
                throw th;
            }
        }
        return c6203bBuild;
    }

    public C6307w.c getCaptureRequestListener() {
        return this.f37549h;
    }

    public l getCaptureRequestOptions() {
        l lVarBuild;
        synchronized (this.f37546e) {
            lVarBuild = l.a.from(this.f37547f.build()).build();
        }
        return lVarBuild;
    }

    public void setActive(final boolean z8) {
        this.f37545d.execute(new Runnable() { // from class: y.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f37531a.p(z8);
            }
        });
    }

    public C setCaptureRequestOptions(l lVar) {
        j();
        i(lVar);
        return B.f.nonCancellationPropagating(androidx.concurrent.futures.c.getFuture(new c.InterfaceC0123c() { // from class: y.c
            @Override // androidx.concurrent.futures.c.InterfaceC0123c
            public final Object attachCompleter(c.a aVar) {
                return this.f37533a.r(aVar);
            }
        }));
    }
}
