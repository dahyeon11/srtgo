package z;

import androidx.camera.core.C0903t;
import androidx.camera.core.InterfaceC0898q;
import androidx.lifecycle.LiveData;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: z.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC6552A extends androidx.camera.core.r {
    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default List b(List list) {
        String cameraId = getCameraId();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            androidx.camera.core.r rVar = (androidx.camera.core.r) it.next();
            Z.h.checkArgument(rVar instanceof InterfaceC6552A);
            if (((InterfaceC6552A) rVar).getCameraId().equals(cameraId)) {
                return Collections.singletonList(rVar);
            }
        }
        throw new IllegalStateException("Unable to find camera with id " + cameraId + " from list of available cameras.");
    }

    void addSessionCaptureCallback(Executor executor, AbstractC6586j abstractC6586j);

    InterfaceC6582h getCamcorderProfileProvider();

    String getCameraId();

    z0 getCameraQuirks();

    @Override // androidx.camera.core.r
    default C0903t getCameraSelector() {
        return new C0903t.a().addCameraFilter(new InterfaceC0898q() { // from class: z.z
            @Override // androidx.camera.core.InterfaceC0898q
            public final List filter(List list) {
                return this.f37849a.b(list);
            }
        }).build();
    }

    @Override // androidx.camera.core.r
    /* synthetic */ LiveData getCameraState();

    @Override // androidx.camera.core.r
    /* synthetic */ androidx.camera.core.H getExposureState();

    @Override // androidx.camera.core.r
    /* synthetic */ String getImplementationType();

    Integer getLensFacing();

    @Override // androidx.camera.core.r
    /* synthetic */ int getSensorRotationDegrees();

    @Override // androidx.camera.core.r
    /* synthetic */ int getSensorRotationDegrees(int i8);

    @Override // androidx.camera.core.r
    /* synthetic */ LiveData getTorchState();

    @Override // androidx.camera.core.r
    /* synthetic */ LiveData getZoomState();

    @Override // androidx.camera.core.r
    /* synthetic */ boolean hasFlashUnit();

    @Override // androidx.camera.core.r
    /* bridge */ /* synthetic */ default boolean isFocusMeteringSupported(androidx.camera.core.J j8) {
        return super.isFocusMeteringSupported(j8);
    }

    void removeSessionCaptureCallback(AbstractC6586j abstractC6586j);
}
