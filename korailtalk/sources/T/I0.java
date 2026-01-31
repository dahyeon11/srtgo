package t;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Range;
import androidx.camera.core.InterfaceC0892n;
import androidx.concurrent.futures.c;
import java.util.concurrent.Executor;
import s.C6203b;
import t.C6307w;
import u.C6372C;

/* loaded from: classes.dex */
public class I0 {

    /* renamed from: a, reason: collision with root package name */
    private final C6307w f36421a;

    /* renamed from: b, reason: collision with root package name */
    private final J0 f36422b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f36423c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f36424d = false;

    /* renamed from: e, reason: collision with root package name */
    private c.a f36425e;

    /* renamed from: f, reason: collision with root package name */
    private C6307w.c f36426f;

    I0(C6307w c6307w, C6372C c6372c, Executor executor) {
        this.f36421a = c6307w;
        this.f36422b = new J0(c6372c, 0);
        this.f36423c = executor;
    }

    private void d() {
        c.a aVar = this.f36425e;
        if (aVar != null) {
            aVar.setException(new InterfaceC0892n.a("Cancelled by another setExposureCompensationIndex()"));
            this.f36425e = null;
        }
        C6307w.c cVar = this.f36426f;
        if (cVar != null) {
            this.f36421a.J(cVar);
            this.f36426f = null;
        }
    }

    static androidx.camera.core.H e(C6372C c6372c) {
        return new J0(c6372c, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean g(int i8, c.a aVar, TotalCaptureResult totalCaptureResult) {
        Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE);
        Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_EXPOSURE_COMPENSATION);
        if (num == null || num2 == null) {
            if (num2 == null || num2.intValue() != i8) {
                return false;
            }
            aVar.set(Integer.valueOf(i8));
            return true;
        }
        int iIntValue = num.intValue();
        if ((iIntValue != 2 && iIntValue != 3 && iIntValue != 4) || num2.intValue() != i8) {
            return false;
        }
        aVar.set(Integer.valueOf(i8));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(final c.a aVar, final int i8) {
        if (!this.f36424d) {
            this.f36422b.a(0);
            aVar.setException(new InterfaceC0892n.a("Camera is not active."));
            return;
        }
        d();
        Z.h.checkState(this.f36425e == null, "mRunningCompleter should be null when starting set a new exposure compensation value");
        Z.h.checkState(this.f36426f == null, "mRunningCaptureResultListener should be null when starting set a new exposure compensation value");
        C6307w.c cVar = new C6307w.c() { // from class: t.H0
            @Override // t.C6307w.c
            public final boolean onCaptureResult(TotalCaptureResult totalCaptureResult) {
                return I0.g(i8, aVar, totalCaptureResult);
            }
        };
        this.f36426f = cVar;
        this.f36425e = aVar;
        this.f36421a.k(cVar);
        this.f36421a.Q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object i(final int i8, final c.a aVar) {
        this.f36423c.execute(new Runnable() { // from class: t.G0
            @Override // java.lang.Runnable
            public final void run() {
                this.f36410a.h(aVar, i8);
            }
        });
        return "setExposureCompensationIndex[" + i8 + "]";
    }

    androidx.camera.core.H f() {
        return this.f36422b;
    }

    void j(boolean z8) {
        if (z8 == this.f36424d) {
            return;
        }
        this.f36424d = z8;
        if (z8) {
            return;
        }
        this.f36422b.a(0);
        d();
    }

    void k(C6203b.a aVar) {
        aVar.setCaptureRequestOption(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(this.f36422b.getExposureCompensationIndex()));
    }

    com.google.common.util.concurrent.C l(final int i8) {
        if (!this.f36422b.isExposureCompensationSupported()) {
            return B.f.immediateFailedFuture(new IllegalArgumentException("ExposureCompensation is not supported"));
        }
        Range<Integer> exposureCompensationRange = this.f36422b.getExposureCompensationRange();
        if (exposureCompensationRange.contains((Range<Integer>) Integer.valueOf(i8))) {
            this.f36422b.a(i8);
            return B.f.nonCancellationPropagating(androidx.concurrent.futures.c.getFuture(new c.InterfaceC0123c() { // from class: t.F0
                @Override // androidx.concurrent.futures.c.InterfaceC0123c
                public final Object attachCompleter(c.a aVar) {
                    return this.f36407a.i(i8, aVar);
                }
            }));
        }
        return B.f.immediateFailedFuture(new IllegalArgumentException("Requested ExposureCompensation " + i8 + " is not within valid range [" + exposureCompensationRange.getUpper() + ".." + exposureCompensationRange.getLower() + "]"));
    }
}
