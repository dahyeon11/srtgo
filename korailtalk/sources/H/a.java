package H;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.InterfaceC0902s0;
import androidx.camera.extensions.impl.CaptureProcessorImpl;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import s.AbstractC6202a;
import z.InterfaceC6563L;
import z.InterfaceC6579f0;
import z.InterfaceC6600q;
import z.r;

/* loaded from: classes.dex */
public final class a implements InterfaceC6563L {

    /* renamed from: a, reason: collision with root package name */
    private final CaptureProcessorImpl f1512a;

    public a(CaptureProcessorImpl captureProcessorImpl) {
        this.f1512a = captureProcessorImpl;
    }

    @Override // z.InterfaceC6563L
    public void onOutputSurface(Surface surface, int i8) {
        this.f1512a.onOutputSurface(surface, i8);
        this.f1512a.onImageFormatUpdate(i8);
    }

    @Override // z.InterfaceC6563L
    public void onResolutionUpdate(Size size) {
        this.f1512a.onResolutionUpdate(size);
    }

    @Override // z.InterfaceC6563L
    public void process(InterfaceC6579f0 interfaceC6579f0) {
        InterfaceC6600q interfaceC6600qRetrieveCameraCaptureResult;
        CaptureResult captureResult;
        List<Integer> captureIds = interfaceC6579f0.getCaptureIds();
        HashMap map = new HashMap();
        for (Integer num : captureIds) {
            try {
                InterfaceC0902s0 interfaceC0902s0 = (InterfaceC0902s0) interfaceC6579f0.getImageProxy(num.intValue()).get(5L, TimeUnit.SECONDS);
                if (interfaceC0902s0.getImage() == null || (interfaceC6600qRetrieveCameraCaptureResult = r.retrieveCameraCaptureResult(interfaceC0902s0.getImageInfo())) == null || (captureResult = AbstractC6202a.getCaptureResult(interfaceC6600qRetrieveCameraCaptureResult)) == null) {
                    return;
                } else {
                    map.put(num, new Pair(interfaceC0902s0.getImage(), (TotalCaptureResult) captureResult));
                }
            } catch (InterruptedException | ExecutionException | TimeoutException unused) {
                return;
            }
        }
        this.f1512a.process(map);
    }
}
