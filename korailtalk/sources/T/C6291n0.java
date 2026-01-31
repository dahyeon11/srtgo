package t;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import u.AbstractC6380c;

/* renamed from: t.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C6291n0 extends CameraCaptureSession.CaptureCallback {

    /* renamed from: b, reason: collision with root package name */
    a f36733b = null;

    /* renamed from: a, reason: collision with root package name */
    final Map f36732a = new HashMap();

    /* renamed from: t.n0$a */
    interface a {
        void onCaptureSequenceCompletedOrAborted(CameraCaptureSession cameraCaptureSession, int i8, boolean z8);
    }

    C6291n0() {
    }

    private List b(CaptureRequest captureRequest) {
        List list = (List) this.f36732a.get(captureRequest);
        return list != null ? list : Collections.emptyList();
    }

    void a(CaptureRequest captureRequest, List list) {
        List list2 = (List) this.f36732a.get(captureRequest);
        if (list2 == null) {
            this.f36732a.put(captureRequest, list);
            return;
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size());
        arrayList.addAll(list);
        arrayList.addAll(list2);
        this.f36732a.put(captureRequest, arrayList);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j8) {
        Iterator it = b(captureRequest).iterator();
        while (it.hasNext()) {
            AbstractC6380c.onCaptureBufferLost((CameraCaptureSession.CaptureCallback) it.next(), cameraCaptureSession, captureRequest, surface, j8);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        Iterator it = b(captureRequest).iterator();
        while (it.hasNext()) {
            ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        Iterator it = b(captureRequest).iterator();
        while (it.hasNext()) {
            ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        Iterator it = b(captureRequest).iterator();
        while (it.hasNext()) {
            ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i8) {
        Iterator it = this.f36732a.values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
                ((CameraCaptureSession.CaptureCallback) it2.next()).onCaptureSequenceAborted(cameraCaptureSession, i8);
            }
        }
        a aVar = this.f36733b;
        if (aVar != null) {
            aVar.onCaptureSequenceCompletedOrAborted(cameraCaptureSession, i8, true);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i8, long j8) {
        Iterator it = this.f36732a.values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
                ((CameraCaptureSession.CaptureCallback) it2.next()).onCaptureSequenceCompleted(cameraCaptureSession, i8, j8);
            }
        }
        a aVar = this.f36733b;
        if (aVar != null) {
            aVar.onCaptureSequenceCompletedOrAborted(cameraCaptureSession, i8, false);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j8, long j9) {
        Iterator it = b(captureRequest).iterator();
        while (it.hasNext()) {
            ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureStarted(cameraCaptureSession, captureRequest, j8, j9);
        }
    }

    public void setCaptureSequenceCallback(a aVar) {
        this.f36733b = aVar;
    }
}
