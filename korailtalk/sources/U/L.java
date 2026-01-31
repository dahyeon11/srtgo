package u;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import androidx.camera.core.B0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import u.C6373D;
import u.C6387j;

/* loaded from: classes.dex */
abstract class L implements C6373D.a {

    /* renamed from: a */
    final CameraDevice f36967a;

    /* renamed from: b */
    final Object f36968b;

    static class a {

        /* renamed from: a */
        final Handler f36969a;

        a(Handler handler) {
            this.f36969a = handler;
        }
    }

    L(CameraDevice cameraDevice, Object obj) {
        this.f36967a = (CameraDevice) Z.h.checkNotNull(cameraDevice);
        this.f36968b = obj;
    }

    private static void a(CameraDevice cameraDevice, List list) {
        String id = cameraDevice.getId();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String physicalCameraId = ((v.b) it.next()).getPhysicalCameraId();
            if (physicalCameraId != null && !physicalCameraId.isEmpty()) {
                B0.w("CameraDeviceCompat", "Camera " + id + ": Camera doesn't support physicalCameraId " + physicalCameraId + ". Ignoring.");
            }
        }
    }

    static void b(CameraDevice cameraDevice, v.g gVar) {
        Z.h.checkNotNull(cameraDevice);
        Z.h.checkNotNull(gVar);
        Z.h.checkNotNull(gVar.getStateCallback());
        List<v.b> outputConfigurations = gVar.getOutputConfigurations();
        if (outputConfigurations == null) {
            throw new IllegalArgumentException("Invalid output configurations");
        }
        if (gVar.getExecutor() == null) {
            throw new IllegalArgumentException("Invalid executor");
        }
        a(cameraDevice, outputConfigurations);
    }

    static List d(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((v.b) it.next()).getSurface());
        }
        return arrayList;
    }

    void c(CameraDevice cameraDevice, List list, CameraCaptureSession.StateCallback stateCallback, Handler handler) throws C6386i, CameraAccessException {
        try {
            cameraDevice.createCaptureSession(list, stateCallback, handler);
        } catch (CameraAccessException e8) {
            throw C6386i.toCameraAccessExceptionCompat(e8);
        }
    }

    @Override // u.C6373D.a
    public void createCaptureSession(v.g gVar) throws C6386i, CameraAccessException {
        b(this.f36967a, gVar);
        if (gVar.getInputConfiguration() != null) {
            throw new IllegalArgumentException("Reprocessing sessions not supported until API 23");
        }
        if (gVar.getSessionType() == 1) {
            throw new IllegalArgumentException("High speed capture sessions not supported until API 23");
        }
        C6387j.c cVar = new C6387j.c(gVar.getExecutor(), gVar.getStateCallback());
        c(this.f36967a, d(gVar.getOutputConfigurations()), cVar, ((a) this.f36968b).f36969a);
    }

    @Override // u.C6373D.a
    public CameraDevice unwrap() {
        return this.f36967a;
    }
}
