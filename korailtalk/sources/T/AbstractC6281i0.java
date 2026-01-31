package t;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import y.l;
import z.C6562K;
import z.InterfaceC6565N;

/* renamed from: t.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC6281i0 {
    private static void a(CaptureRequest.Builder builder, InterfaceC6565N interfaceC6565N) {
        y.l lVarBuild = l.a.from(interfaceC6565N).build();
        for (InterfaceC6565N.a aVar : lVarBuild.listOptions()) {
            CaptureRequest.Key key = (CaptureRequest.Key) aVar.getToken();
            try {
                builder.set(key, lVarBuild.retrieveOption(aVar));
            } catch (IllegalArgumentException unused) {
                androidx.camera.core.B0.e("CaptureRequestBuilder", "CaptureRequest.Key is not supported: " + key);
            }
        }
    }

    private static List b(List list, Map map) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Surface surface = (Surface) map.get((z.S) it.next());
            if (surface == null) {
                throw new IllegalArgumentException("DeferrableSurface not in configuredSurfaceMap");
            }
            arrayList.add(surface);
        }
        return arrayList;
    }

    public static CaptureRequest build(C6562K c6562k, CameraDevice cameraDevice, Map<z.S, Surface> map) throws CameraAccessException {
        if (cameraDevice == null) {
            return null;
        }
        List listB = b(c6562k.getSurfaces(), map);
        if (listB.isEmpty()) {
            return null;
        }
        CaptureRequest.Builder builderCreateCaptureRequest = cameraDevice.createCaptureRequest(c6562k.getTemplateType());
        a(builderCreateCaptureRequest, c6562k.getImplementationOptions());
        InterfaceC6565N implementationOptions = c6562k.getImplementationOptions();
        InterfaceC6565N.a aVar = C6562K.OPTION_ROTATION;
        if (implementationOptions.containsOption(aVar)) {
            builderCreateCaptureRequest.set(CaptureRequest.JPEG_ORIENTATION, (Integer) c6562k.getImplementationOptions().retrieveOption(aVar));
        }
        InterfaceC6565N implementationOptions2 = c6562k.getImplementationOptions();
        InterfaceC6565N.a aVar2 = C6562K.OPTION_JPEG_QUALITY;
        if (implementationOptions2.containsOption(aVar2)) {
            builderCreateCaptureRequest.set(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) c6562k.getImplementationOptions().retrieveOption(aVar2)).byteValue()));
        }
        Iterator it = listB.iterator();
        while (it.hasNext()) {
            builderCreateCaptureRequest.addTarget((Surface) it.next());
        }
        builderCreateCaptureRequest.setTag(c6562k.getTagBundle());
        return builderCreateCaptureRequest.build();
    }

    public static CaptureRequest buildWithoutTarget(C6562K c6562k, CameraDevice cameraDevice) throws CameraAccessException {
        if (cameraDevice == null) {
            return null;
        }
        CaptureRequest.Builder builderCreateCaptureRequest = cameraDevice.createCaptureRequest(c6562k.getTemplateType());
        a(builderCreateCaptureRequest, c6562k.getImplementationOptions());
        return builderCreateCaptureRequest.build();
    }
}
