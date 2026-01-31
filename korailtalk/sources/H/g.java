package H;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.B0;
import androidx.camera.core.r;
import androidx.camera.extensions.impl.AutoImageCaptureExtenderImpl;
import androidx.camera.extensions.impl.AutoPreviewExtenderImpl;
import androidx.camera.extensions.impl.BeautyImageCaptureExtenderImpl;
import androidx.camera.extensions.impl.BeautyPreviewExtenderImpl;
import androidx.camera.extensions.impl.BokehImageCaptureExtenderImpl;
import androidx.camera.extensions.impl.BokehPreviewExtenderImpl;
import androidx.camera.extensions.impl.CaptureProcessorImpl;
import androidx.camera.extensions.impl.CaptureStageImpl;
import androidx.camera.extensions.impl.HdrImageCaptureExtenderImpl;
import androidx.camera.extensions.impl.HdrPreviewExtenderImpl;
import androidx.camera.extensions.impl.ImageCaptureExtenderImpl;
import androidx.camera.extensions.impl.NightImageCaptureExtenderImpl;
import androidx.camera.extensions.impl.NightPreviewExtenderImpl;
import androidx.camera.extensions.impl.PreviewExtenderImpl;
import androidx.camera.extensions.impl.ProcessorImpl;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import z.D0;

/* loaded from: classes.dex */
public class g implements n {

    /* renamed from: a, reason: collision with root package name */
    private final int f1526a;

    /* renamed from: b, reason: collision with root package name */
    private PreviewExtenderImpl f1527b;

    /* renamed from: c, reason: collision with root package name */
    private ImageCaptureExtenderImpl f1528c;

    /* renamed from: d, reason: collision with root package name */
    private r f1529d;

    public g(int i8) {
        this.f1526a = i8;
        try {
            if (i8 == 1) {
                this.f1527b = new BokehPreviewExtenderImpl();
                this.f1528c = new BokehImageCaptureExtenderImpl();
                return;
            }
            if (i8 == 2) {
                this.f1527b = new HdrPreviewExtenderImpl();
                this.f1528c = new HdrImageCaptureExtenderImpl();
                return;
            }
            if (i8 == 3) {
                this.f1527b = new NightPreviewExtenderImpl();
                this.f1528c = new NightImageCaptureExtenderImpl();
            } else if (i8 == 4) {
                this.f1527b = new BeautyPreviewExtenderImpl();
                this.f1528c = new BeautyImageCaptureExtenderImpl();
            } else {
                if (i8 != 5) {
                    throw new IllegalArgumentException("Should not activate ExtensionMode.NONE");
                }
                this.f1527b = new AutoPreviewExtenderImpl();
                this.f1528c = new AutoImageCaptureExtenderImpl();
            }
        } catch (NoClassDefFoundError unused) {
            this.f1527b = b();
            this.f1528c = a();
            B0.e("BasicVendorExtender", "OEM implementation for extension mode " + i8 + "does not exist!");
        }
    }

    private ImageCaptureExtenderImpl a() {
        return new b();
    }

    private PreviewExtenderImpl b() {
        return new a();
    }

    private int c() {
        return this.f1528c.getCaptureProcessor() != null ? 35 : 256;
    }

    private Size[] d(int i8) {
        return ((StreamConfigurationMap) y.j.from(this.f1529d).getCameraCharacteristic(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputSizes(i8);
    }

    private int e() {
        return this.f1527b.getProcessorType() == PreviewExtenderImpl.ProcessorType.PROCESSOR_TYPE_IMAGE_PROCESSOR ? 35 : 34;
    }

    @Override // H.n
    public D0 createSessionProcessor(Context context) {
        Z.h.checkNotNull(this.f1529d, "VendorExtender#init() must be called first");
        return null;
    }

    @Override // H.n
    public Range<Long> getEstimatedCaptureLatencyRange(Size size) {
        Z.h.checkNotNull(this.f1529d, "VendorExtender#init() must be called first");
        if (j.getRuntimeVersion().compareTo(o.VERSION_1_2) < 0) {
            return null;
        }
        try {
            return this.f1528c.getEstimatedCaptureLatencyRange(size);
        } catch (NoSuchMethodError unused) {
            return null;
        }
    }

    public ImageCaptureExtenderImpl getImageCaptureExtenderImpl() {
        return this.f1528c;
    }

    public PreviewExtenderImpl getPreviewExtenderImpl() {
        return this.f1527b;
    }

    @Override // H.n
    public List<Pair<Integer, Size[]>> getSupportedCaptureOutputResolutions() {
        Z.h.checkNotNull(this.f1529d, "VendorExtender#init() must be called first");
        if (j.getRuntimeVersion().compareTo(o.VERSION_1_1) >= 0) {
            try {
                List<Pair<Integer, Size[]>> supportedResolutions = this.f1528c.getSupportedResolutions();
                if (supportedResolutions != null) {
                    return supportedResolutions;
                }
            } catch (NoSuchMethodError unused) {
            }
        }
        int iC = c();
        return Arrays.asList(new Pair(Integer.valueOf(iC), d(iC)));
    }

    @Override // H.n
    public List<Pair<Integer, Size[]>> getSupportedPreviewOutputResolutions() {
        Z.h.checkNotNull(this.f1529d, "VendorExtender#init() must be called first");
        if (j.getRuntimeVersion().compareTo(o.VERSION_1_1) >= 0) {
            try {
                List<Pair<Integer, Size[]>> supportedResolutions = this.f1527b.getSupportedResolutions();
                if (supportedResolutions != null) {
                    return supportedResolutions;
                }
            } catch (NoSuchMethodError unused) {
            }
        }
        int iE = e();
        return Arrays.asList(new Pair(Integer.valueOf(iE), d(iE)));
    }

    @Override // H.n
    public Size[] getSupportedYuvAnalysisResolutions() {
        Z.h.checkNotNull(this.f1529d, "VendorExtender#init() must be called first");
        return d(35);
    }

    @Override // H.n
    public void init(r rVar) {
        this.f1529d = rVar;
        String cameraId = y.j.from(rVar).getCameraId();
        CameraCharacteristics cameraCharacteristicsExtractCameraCharacteristics = y.j.extractCameraCharacteristics(rVar);
        this.f1527b.init(cameraId, cameraCharacteristicsExtractCameraCharacteristics);
        this.f1528c.init(cameraId, cameraCharacteristicsExtractCameraCharacteristics);
        B0.d("BasicVendorExtender", "Extension init Mode = " + this.f1526a);
        B0.d("BasicVendorExtender", "PreviewExtender processorType= " + this.f1527b.getProcessorType());
        B0.d("BasicVendorExtender", "ImageCaptureExtender processor= " + this.f1528c.getCaptureProcessor());
    }

    @Override // H.n
    public boolean isExtensionAvailable(String str, Map<String, CameraCharacteristics> map) {
        CameraCharacteristics cameraCharacteristics = map.get(str);
        return this.f1527b.isExtensionAvailable(str, cameraCharacteristics) && this.f1528c.isExtensionAvailable(str, cameraCharacteristics);
    }

    class a implements PreviewExtenderImpl {
        a() {
        }

        public CaptureStageImpl getCaptureStage() {
            return null;
        }

        public ProcessorImpl getProcessor() {
            return null;
        }

        public PreviewExtenderImpl.ProcessorType getProcessorType() {
            return PreviewExtenderImpl.ProcessorType.PROCESSOR_TYPE_NONE;
        }

        public List<Pair<Integer, Size[]>> getSupportedResolutions() {
            return null;
        }

        public boolean isExtensionAvailable(String str, CameraCharacteristics cameraCharacteristics) {
            return false;
        }

        public CaptureStageImpl onDisableSession() {
            return null;
        }

        public CaptureStageImpl onEnableSession() {
            return null;
        }

        public CaptureStageImpl onPresetSession() {
            return null;
        }

        public void onDeInit() {
        }

        public void init(String str, CameraCharacteristics cameraCharacteristics) {
        }

        public void onInit(String str, CameraCharacteristics cameraCharacteristics, Context context) {
        }
    }

    class b implements ImageCaptureExtenderImpl {
        b() {
        }

        public CaptureProcessorImpl getCaptureProcessor() {
            return null;
        }

        public List<CaptureStageImpl> getCaptureStages() {
            return null;
        }

        public Range<Long> getEstimatedCaptureLatencyRange(Size size) {
            return null;
        }

        public int getMaxCaptureStage() {
            return 0;
        }

        public List<Pair<Integer, Size[]>> getSupportedResolutions() {
            return null;
        }

        public boolean isExtensionAvailable(String str, CameraCharacteristics cameraCharacteristics) {
            return false;
        }

        public CaptureStageImpl onDisableSession() {
            return null;
        }

        public CaptureStageImpl onEnableSession() {
            return null;
        }

        public CaptureStageImpl onPresetSession() {
            return null;
        }

        public void onDeInit() {
        }

        public void init(String str, CameraCharacteristics cameraCharacteristics) {
        }

        public void onInit(String str, CameraCharacteristics cameraCharacteristics, Context context) {
        }
    }
}
