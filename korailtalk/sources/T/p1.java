package t;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import t.d1;
import u.AbstractC6379b;
import u.AbstractC6383f;

/* loaded from: classes.dex */
final class p1 extends d1.a {

    /* renamed from: a, reason: collision with root package name */
    private final List f36754a;

    p1(List list) {
        ArrayList arrayList = new ArrayList();
        this.f36754a = arrayList;
        arrayList.addAll(list);
    }

    static d1.a a(d1.a... aVarArr) {
        return new p1(Arrays.asList(aVarArr));
    }

    @Override // t.d1.a
    public void onActive(d1 d1Var) {
        Iterator it = this.f36754a.iterator();
        while (it.hasNext()) {
            ((d1.a) it.next()).onActive(d1Var);
        }
    }

    @Override // t.d1.a
    public void onCaptureQueueEmpty(d1 d1Var) {
        Iterator it = this.f36754a.iterator();
        while (it.hasNext()) {
            ((d1.a) it.next()).onCaptureQueueEmpty(d1Var);
        }
    }

    @Override // t.d1.a
    public void onClosed(d1 d1Var) {
        Iterator it = this.f36754a.iterator();
        while (it.hasNext()) {
            ((d1.a) it.next()).onClosed(d1Var);
        }
    }

    @Override // t.d1.a
    public void onConfigureFailed(d1 d1Var) {
        Iterator it = this.f36754a.iterator();
        while (it.hasNext()) {
            ((d1.a) it.next()).onConfigureFailed(d1Var);
        }
    }

    @Override // t.d1.a
    public void onConfigured(d1 d1Var) {
        Iterator it = this.f36754a.iterator();
        while (it.hasNext()) {
            ((d1.a) it.next()).onConfigured(d1Var);
        }
    }

    @Override // t.d1.a
    public void onReady(d1 d1Var) {
        Iterator it = this.f36754a.iterator();
        while (it.hasNext()) {
            ((d1.a) it.next()).onReady(d1Var);
        }
    }

    @Override // t.d1.a
    void onSessionFinished(d1 d1Var) {
        Iterator it = this.f36754a.iterator();
        while (it.hasNext()) {
            ((d1.a) it.next()).onSessionFinished(d1Var);
        }
    }

    @Override // t.d1.a
    public void onSurfacePrepared(d1 d1Var, Surface surface) {
        Iterator it = this.f36754a.iterator();
        while (it.hasNext()) {
            ((d1.a) it.next()).onSurfacePrepared(d1Var, surface);
        }
    }

    static class a extends d1.a {

        /* renamed from: a, reason: collision with root package name */
        private final CameraCaptureSession.StateCallback f36755a;

        a(CameraCaptureSession.StateCallback stateCallback) {
            this.f36755a = stateCallback;
        }

        @Override // t.d1.a
        public void onActive(d1 d1Var) {
            this.f36755a.onActive(d1Var.toCameraCaptureSessionCompat().toCameraCaptureSession());
        }

        @Override // t.d1.a
        public void onCaptureQueueEmpty(d1 d1Var) {
            AbstractC6383f.onCaptureQueueEmpty(this.f36755a, d1Var.toCameraCaptureSessionCompat().toCameraCaptureSession());
        }

        @Override // t.d1.a
        public void onClosed(d1 d1Var) {
            this.f36755a.onClosed(d1Var.toCameraCaptureSessionCompat().toCameraCaptureSession());
        }

        @Override // t.d1.a
        public void onConfigureFailed(d1 d1Var) {
            this.f36755a.onConfigureFailed(d1Var.toCameraCaptureSessionCompat().toCameraCaptureSession());
        }

        @Override // t.d1.a
        public void onConfigured(d1 d1Var) {
            this.f36755a.onConfigured(d1Var.toCameraCaptureSessionCompat().toCameraCaptureSession());
        }

        @Override // t.d1.a
        public void onReady(d1 d1Var) {
            this.f36755a.onReady(d1Var.toCameraCaptureSessionCompat().toCameraCaptureSession());
        }

        @Override // t.d1.a
        public void onSurfacePrepared(d1 d1Var, Surface surface) {
            AbstractC6379b.onSurfacePrepared(this.f36755a, d1Var.toCameraCaptureSessionCompat().toCameraCaptureSession(), surface);
        }

        a(List list) {
            this(AbstractC6293o0.createComboCallback((List<CameraCaptureSession.StateCallback>) list));
        }

        @Override // t.d1.a
        void onSessionFinished(d1 d1Var) {
        }
    }
}
