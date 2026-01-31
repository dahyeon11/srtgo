package t;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.core.InterfaceC0892n;
import androidx.concurrent.futures.c;
import androidx.lifecycle.LiveData;
import java.util.concurrent.Executor;
import t.C6307w;
import u.C6372C;

/* loaded from: classes.dex */
final class t1 {

    /* renamed from: a, reason: collision with root package name */
    private final C6307w f36773a;

    /* renamed from: b, reason: collision with root package name */
    private final androidx.lifecycle.t f36774b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f36775c;

    /* renamed from: d, reason: collision with root package name */
    private final Executor f36776d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f36777e;

    /* renamed from: f, reason: collision with root package name */
    c.a f36778f;

    /* renamed from: g, reason: collision with root package name */
    boolean f36779g;

    t1(C6307w c6307w, C6372C c6372c, Executor executor) {
        this.f36773a = c6307w;
        this.f36776d = executor;
        Boolean bool = (Boolean) c6372c.get(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        this.f36775c = bool != null && bool.booleanValue();
        this.f36774b = new androidx.lifecycle.t(0);
        c6307w.k(new C6307w.c() { // from class: t.r1
            @Override // t.C6307w.c
            public final boolean onCaptureResult(TotalCaptureResult totalCaptureResult) {
                return this.f36764a.i(totalCaptureResult);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object h(final boolean z8, final c.a aVar) {
        this.f36776d.execute(new Runnable() { // from class: t.s1
            @Override // java.lang.Runnable
            public final void run() {
                this.f36767a.g(aVar, z8);
            }
        });
        return "enableTorch: " + z8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean i(TotalCaptureResult totalCaptureResult) {
        if (this.f36778f != null) {
            Integer num = (Integer) totalCaptureResult.getRequest().get(CaptureRequest.FLASH_MODE);
            if ((num != null && num.intValue() == 2) == this.f36779g) {
                this.f36778f.set(null);
                this.f36778f = null;
            }
        }
        return false;
    }

    private void k(androidx.lifecycle.t tVar, Object obj) {
        if (androidx.camera.core.impl.utils.m.isMainThread()) {
            tVar.setValue(obj);
        } else {
            tVar.postValue(obj);
        }
    }

    com.google.common.util.concurrent.C d(final boolean z8) {
        if (this.f36775c) {
            k(this.f36774b, Integer.valueOf(z8 ? 1 : 0));
            return androidx.concurrent.futures.c.getFuture(new c.InterfaceC0123c() { // from class: t.q1
                @Override // androidx.concurrent.futures.c.InterfaceC0123c
                public final Object attachCompleter(c.a aVar) {
                    return this.f36757a.h(z8, aVar);
                }
            });
        }
        androidx.camera.core.B0.d("TorchControl", "Unable to enableTorch due to there is no flash unit.");
        return B.f.immediateFailedFuture(new IllegalStateException("No flash unit"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void g(c.a aVar, boolean z8) {
        if (!this.f36775c) {
            if (aVar != null) {
                aVar.setException(new IllegalStateException("No flash unit"));
            }
        } else {
            if (!this.f36777e) {
                k(this.f36774b, 0);
                if (aVar != null) {
                    aVar.setException(new InterfaceC0892n.a("Camera is not active."));
                    return;
                }
                return;
            }
            this.f36779g = z8;
            this.f36773a.n(z8);
            k(this.f36774b, Integer.valueOf(z8 ? 1 : 0));
            c.a aVar2 = this.f36778f;
            if (aVar2 != null) {
                aVar2.setException(new InterfaceC0892n.a("There is a new enableTorch being set"));
            }
            this.f36778f = aVar;
        }
    }

    LiveData f() {
        return this.f36774b;
    }

    void j(boolean z8) {
        if (this.f36777e == z8) {
            return;
        }
        this.f36777e = z8;
        if (z8) {
            return;
        }
        if (this.f36779g) {
            this.f36779g = false;
            this.f36773a.n(false);
            k(this.f36774b, 0);
        }
        c.a aVar = this.f36778f;
        if (aVar != null) {
            aVar.setException(new InterfaceC0892n.a("Camera is not active."));
            this.f36778f = null;
        }
    }
}
