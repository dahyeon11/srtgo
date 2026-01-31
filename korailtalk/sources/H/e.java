package H;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.r;
import androidx.camera.extensions.impl.advanced.AdvancedExtenderImpl;
import androidx.camera.extensions.impl.advanced.AutoAdvancedExtenderImpl;
import androidx.camera.extensions.impl.advanced.BeautyAdvancedExtenderImpl;
import androidx.camera.extensions.impl.advanced.BokehAdvancedExtenderImpl;
import androidx.camera.extensions.impl.advanced.HdrAdvancedExtenderImpl;
import androidx.camera.extensions.impl.advanced.NightAdvancedExtenderImpl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import z.D0;

/* loaded from: classes.dex */
public class e implements n {

    /* renamed from: a, reason: collision with root package name */
    private final AdvancedExtenderImpl f1520a;

    /* renamed from: b, reason: collision with root package name */
    private String f1521b;

    public e(int i8) {
        try {
            if (i8 == 1) {
                this.f1520a = new BokehAdvancedExtenderImpl();
                return;
            }
            if (i8 == 2) {
                this.f1520a = new HdrAdvancedExtenderImpl();
                return;
            }
            if (i8 == 3) {
                this.f1520a = new NightAdvancedExtenderImpl();
            } else if (i8 == 4) {
                this.f1520a = new BeautyAdvancedExtenderImpl();
            } else {
                if (i8 != 5) {
                    throw new IllegalArgumentException("Should not active ExtensionMode.NONE");
                }
                this.f1520a = new AutoAdvancedExtenderImpl();
            }
        } catch (NoClassDefFoundError unused) {
            throw new IllegalArgumentException("AdvancedExtenderImpl does not exist");
        }
    }

    private List a(Map map) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : map.keySet()) {
            arrayList.add(new Pair(num, (Size[]) ((List) map.get(num)).toArray(new Size[0])));
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Override // H.n
    public D0 createSessionProcessor(Context context) {
        Z.h.checkNotNull(this.f1521b, "VendorExtender#init() must be called first");
        return new K.a(this.f1520a.createSessionProcessor(), context);
    }

    @Override // H.n
    public Range<Long> getEstimatedCaptureLatencyRange(Size size) {
        Z.h.checkNotNull(this.f1521b, "VendorExtender#init() must be called first");
        return this.f1520a.getEstimatedCaptureLatencyRange(this.f1521b, size, 256);
    }

    @Override // H.n
    public List<Pair<Integer, Size[]>> getSupportedCaptureOutputResolutions() {
        Z.h.checkNotNull(this.f1521b, "VendorExtender#init() must be called first");
        return a(this.f1520a.getSupportedCaptureOutputResolutions(this.f1521b));
    }

    @Override // H.n
    public List<Pair<Integer, Size[]>> getSupportedPreviewOutputResolutions() {
        Z.h.checkNotNull(this.f1521b, "VendorExtender#init() must be called first");
        return a(this.f1520a.getSupportedPreviewOutputResolutions(this.f1521b));
    }

    @Override // H.n
    public Size[] getSupportedYuvAnalysisResolutions() {
        Z.h.checkNotNull(this.f1521b, "VendorExtender#init() must be called first");
        List supportedYuvAnalysisResolutions = this.f1520a.getSupportedYuvAnalysisResolutions(this.f1521b);
        return supportedYuvAnalysisResolutions == null ? new Size[0] : (Size[]) supportedYuvAnalysisResolutions.toArray(new Size[0]);
    }

    @Override // H.n
    public void init(r rVar) {
        this.f1521b = y.j.from(rVar).getCameraId();
        this.f1520a.init(this.f1521b, y.j.from(rVar).getCameraCharacteristicsMap());
    }

    @Override // H.n
    public boolean isExtensionAvailable(String str, Map<String, CameraCharacteristics> map) {
        return this.f1520a.isExtensionAvailable(str, map);
    }
}
