package androidx.camera.view;

import androidx.camera.core.B0;
import androidx.camera.view.PreviewView;
import androidx.concurrent.futures.c;
import com.google.common.util.concurrent.C;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p.InterfaceC6046a;
import z.AbstractC6586j;
import z.InterfaceC6552A;
import z.InterfaceC6553B;
import z.InterfaceC6600q;
import z.t0;

/* loaded from: classes.dex */
final class e implements t0.a {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6552A f7963a;

    /* renamed from: b, reason: collision with root package name */
    private final androidx.lifecycle.t f7964b;

    /* renamed from: c, reason: collision with root package name */
    private PreviewView.f f7965c;

    /* renamed from: d, reason: collision with root package name */
    private final l f7966d;

    /* renamed from: e, reason: collision with root package name */
    C f7967e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f7968f = false;

    class a implements B.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f7969a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.camera.core.r f7970b;

        a(List list, androidx.camera.core.r rVar) {
            this.f7969a = list;
            this.f7970b = rVar;
        }

        @Override // B.c
        public void onFailure(Throwable th) {
            e.this.f7967e = null;
            if (this.f7969a.isEmpty()) {
                return;
            }
            Iterator it = this.f7969a.iterator();
            while (it.hasNext()) {
                ((InterfaceC6552A) this.f7970b).removeSessionCaptureCallback((AbstractC6586j) it.next());
            }
            this.f7969a.clear();
        }

        @Override // B.c
        public void onSuccess(Void r22) {
            e.this.f7967e = null;
        }
    }

    class b extends AbstractC6586j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c.a f7972a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.camera.core.r f7973b;

        b(c.a aVar, androidx.camera.core.r rVar) {
            this.f7972a = aVar;
            this.f7973b = rVar;
        }

        @Override // z.AbstractC6586j
        public void onCaptureCompleted(InterfaceC6600q interfaceC6600q) {
            this.f7972a.set(null);
            ((InterfaceC6552A) this.f7973b).removeSessionCaptureCallback(this);
        }
    }

    e(InterfaceC6552A interfaceC6552A, androidx.lifecycle.t tVar, l lVar) {
        this.f7963a = interfaceC6552A;
        this.f7964b = tVar;
        this.f7966d = lVar;
        synchronized (this) {
            this.f7965c = (PreviewView.f) tVar.getValue();
        }
    }

    private void d() {
        C c9 = this.f7967e;
        if (c9 != null) {
            c9.cancel(false);
            this.f7967e = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C f(Void r12) {
        return this.f7966d.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void g(Void r12) {
        j(PreviewView.f.STREAMING);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object h(androidx.camera.core.r rVar, List list, c.a aVar) {
        b bVar = new b(aVar, rVar);
        list.add(bVar);
        ((InterfaceC6552A) rVar).addSessionCaptureCallback(A.a.directExecutor(), bVar);
        return "waitForCaptureResult";
    }

    private void i(androidx.camera.core.r rVar) {
        j(PreviewView.f.IDLE);
        ArrayList arrayList = new ArrayList();
        B.d dVarTransform = B.d.from(k(rVar, arrayList)).transformAsync(new B.a() { // from class: androidx.camera.view.b
            @Override // B.a
            public final C apply(Object obj) {
                return this.f7958a.f((Void) obj);
            }
        }, A.a.directExecutor()).transform(new InterfaceC6046a() { // from class: androidx.camera.view.c
            @Override // p.InterfaceC6046a
            public final Object apply(Object obj) {
                return this.f7959a.g((Void) obj);
            }
        }, A.a.directExecutor());
        this.f7967e = dVarTransform;
        B.f.addCallback(dVarTransform, new a(arrayList, rVar), A.a.directExecutor());
    }

    private C k(final androidx.camera.core.r rVar, final List list) {
        return androidx.concurrent.futures.c.getFuture(new c.InterfaceC0123c() { // from class: androidx.camera.view.d
            @Override // androidx.concurrent.futures.c.InterfaceC0123c
            public final Object attachCompleter(c.a aVar) {
                return this.f7960a.h(rVar, list, aVar);
            }
        });
    }

    void e() {
        d();
    }

    void j(PreviewView.f fVar) {
        synchronized (this) {
            try {
                if (this.f7965c.equals(fVar)) {
                    return;
                }
                this.f7965c = fVar;
                B0.d("StreamStateObserver", "Update Preview stream state to " + fVar);
                this.f7964b.postValue(fVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // z.t0.a
    public void onError(Throwable th) {
        e();
        j(PreviewView.f.IDLE);
    }

    @Override // z.t0.a
    public void onNewData(InterfaceC6553B.a aVar) {
        if (aVar == InterfaceC6553B.a.CLOSING || aVar == InterfaceC6553B.a.CLOSED || aVar == InterfaceC6553B.a.RELEASING || aVar == InterfaceC6553B.a.RELEASED) {
            j(PreviewView.f.IDLE);
            if (this.f7968f) {
                this.f7968f = false;
                d();
                return;
            }
            return;
        }
        if ((aVar == InterfaceC6553B.a.OPENING || aVar == InterfaceC6553B.a.OPEN || aVar == InterfaceC6553B.a.PENDING_OPEN) && !this.f7968f) {
            i(this.f7963a);
            this.f7968f = true;
        }
    }
}
