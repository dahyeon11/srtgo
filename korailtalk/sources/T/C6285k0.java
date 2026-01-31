package t;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import t.C6314z0;
import z.B0;
import z.C0;
import z.C6562K;
import z.C6588k;

/* renamed from: t.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6285k0 implements z.B0 {

    /* renamed from: a, reason: collision with root package name */
    private final C6314z0 f36713a;

    /* renamed from: b, reason: collision with root package name */
    private final List f36714b;

    /* renamed from: c, reason: collision with root package name */
    private volatile boolean f36715c = false;

    /* renamed from: t.k0$a */
    private class a extends CameraCaptureSession.CaptureCallback {

        /* renamed from: a, reason: collision with root package name */
        private final B0.a f36716a;

        /* renamed from: b, reason: collision with root package name */
        private final B0.b f36717b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f36718c;

        a(B0.b bVar, B0.a aVar, boolean z8) {
            this.f36716a = aVar;
            this.f36717b = bVar;
            this.f36718c = z8;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j8) {
            this.f36716a.onCaptureBufferLost(this.f36717b, j8, C6285k0.this.b(surface));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            this.f36716a.onCaptureCompleted(this.f36717b, new C6278h(totalCaptureResult));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            this.f36716a.onCaptureFailed(this.f36717b, new C6276g(C6588k.a.ERROR, captureFailure));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
            this.f36716a.onCaptureProgressed(this.f36717b, new C6278h(captureResult));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i8) {
            if (this.f36718c) {
                this.f36716a.onCaptureSequenceAborted(i8);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i8, long j8) {
            if (this.f36718c) {
                this.f36716a.onCaptureSequenceCompleted(i8, j8);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j8, long j9) {
            this.f36716a.onCaptureStarted(this.f36717b, j9, j8);
        }
    }

    public C6285k0(C6314z0 c6314z0, List<z.E0> list) {
        Z.h.checkArgument(c6314z0.f36852l == C6314z0.d.OPENED, "CaptureSession state must be OPENED. Current state:" + c6314z0.f36852l);
        this.f36713a = c6314z0;
        this.f36714b = Collections.unmodifiableList(new ArrayList(list));
    }

    private boolean a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!d((B0.b) it.next())) {
                return false;
            }
        }
        return true;
    }

    private z.S c(int i8) {
        for (z.E0 e02 : this.f36714b) {
            if (e02.getOutputConfigId() == i8) {
                return e02;
            }
        }
        return null;
    }

    private boolean d(B0.b bVar) {
        if (bVar.getTargetOutputConfigIds().isEmpty()) {
            androidx.camera.core.B0.e("Camera2RequestProcessor", "Unable to submit the RequestProcessor.Request: empty targetOutputConfigIds");
            return false;
        }
        for (Integer num : bVar.getTargetOutputConfigIds()) {
            if (c(num.intValue()) == null) {
                androidx.camera.core.B0.e("Camera2RequestProcessor", "Unable to submit the RequestProcessor.Request: targetOutputConfigId(" + num + ") is not a valid id");
                return false;
            }
        }
        return true;
    }

    @Override // z.B0
    public void abortCaptures() {
        if (this.f36715c) {
            return;
        }
        this.f36713a.d();
    }

    int b(Surface surface) {
        for (z.E0 e02 : this.f36714b) {
            if (e02.getSurface().get() == surface) {
                return e02.getOutputConfigId();
            }
            continue;
        }
        return -1;
    }

    public void close() {
        this.f36715c = true;
    }

    @Override // z.B0
    public int setRepeating(B0.b bVar, B0.a aVar) {
        if (this.f36715c || !d(bVar)) {
            return -1;
        }
        C0.b bVar2 = new C0.b();
        bVar2.setTemplateType(bVar.getTemplateId());
        bVar2.setImplementationOptions(bVar.getParameters());
        bVar2.addCameraCaptureCallback(C6304u0.a(new a(bVar, aVar, true)));
        Iterator<Integer> it = bVar.getTargetOutputConfigIds().iterator();
        while (it.hasNext()) {
            bVar2.addSurface(c(it.next().intValue()));
        }
        return this.f36713a.i(bVar2.build());
    }

    @Override // z.B0
    public void stopRepeating() {
        if (this.f36715c) {
            return;
        }
        this.f36713a.p();
    }

    @Override // z.B0
    public int submit(B0.b bVar, B0.a aVar) {
        return submit(Arrays.asList(bVar), aVar);
    }

    @Override // z.B0
    public int submit(List<B0.b> list, B0.a aVar) {
        if (this.f36715c || !a(list)) {
            return -1;
        }
        ArrayList arrayList = new ArrayList();
        boolean z8 = true;
        for (B0.b bVar : list) {
            C6562K.a aVar2 = new C6562K.a();
            aVar2.setTemplateType(bVar.getTemplateId());
            aVar2.setImplementationOptions(bVar.getParameters());
            aVar2.addCameraCaptureCallback(C6304u0.a(new a(bVar, aVar, z8)));
            Iterator<Integer> it = bVar.getTargetOutputConfigIds().iterator();
            while (it.hasNext()) {
                aVar2.addSurface(c(it.next().intValue()));
            }
            arrayList.add(aVar2.build());
            z8 = false;
        }
        return this.f36713a.g(arrayList);
    }
}
