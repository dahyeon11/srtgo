package k4;

import Q7.C0709m;
import android.content.Context;
import android.hardware.Camera;
import android.os.Build;
import android.util.Log;
import android.view.SurfaceHolder;
import j4.t;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: n, reason: collision with root package name */
    private static final String f33606n = "i";

    /* renamed from: a, reason: collision with root package name */
    private Camera f33607a;

    /* renamed from: b, reason: collision with root package name */
    private Camera.CameraInfo f33608b;

    /* renamed from: c, reason: collision with root package name */
    private C5859a f33609c;

    /* renamed from: d, reason: collision with root package name */
    private K3.b f33610d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f33611e;

    /* renamed from: f, reason: collision with root package name */
    private String f33612f;

    /* renamed from: h, reason: collision with root package name */
    private o f33614h;

    /* renamed from: i, reason: collision with root package name */
    private j4.s f33615i;

    /* renamed from: j, reason: collision with root package name */
    private j4.s f33616j;

    /* renamed from: l, reason: collision with root package name */
    private Context f33618l;

    /* renamed from: g, reason: collision with root package name */
    private k f33613g = new k();

    /* renamed from: k, reason: collision with root package name */
    private int f33617k = -1;

    /* renamed from: m, reason: collision with root package name */
    private final a f33619m = new a();

    private final class a implements Camera.PreviewCallback {

        /* renamed from: a, reason: collision with root package name */
        private r f33620a;

        /* renamed from: b, reason: collision with root package name */
        private j4.s f33621b;

        public a() {
        }

        @Override // android.hardware.Camera.PreviewCallback
        public void onPreviewFrame(byte[] bArr, Camera camera) {
            j4.s sVar = this.f33621b;
            r rVar = this.f33620a;
            if (sVar == null || rVar == null) {
                String unused = i.f33606n;
                if (rVar != null) {
                    rVar.onPreviewError(new Exception("No resolution available"));
                    return;
                }
                return;
            }
            try {
                if (bArr == null) {
                    throw new NullPointerException("No preview data received");
                }
                t tVar = new t(bArr, sVar.width, sVar.height, camera.getParameters().getPreviewFormat(), i.this.getCameraRotation());
                if (i.this.f33608b.facing == 1) {
                    tVar.setPreviewMirrored(true);
                }
                rVar.onPreview(tVar);
            } catch (RuntimeException e8) {
                Log.e(i.f33606n, "Camera preview failed", e8);
                rVar.onPreviewError(e8);
            }
        }

        public void setCallback(r rVar) {
            this.f33620a = rVar;
        }

        public void setResolution(j4.s sVar) {
            this.f33621b = sVar;
        }
    }

    public i(Context context) {
        this.f33618l = context;
    }

    private int c() {
        int rotation = this.f33614h.getRotation();
        int i8 = 0;
        if (rotation != 0) {
            if (rotation == 1) {
                i8 = 90;
            } else if (rotation == 2) {
                i8 = 180;
            } else if (rotation == 3) {
                i8 = 270;
            }
        }
        Camera.CameraInfo cameraInfo = this.f33608b;
        int i9 = cameraInfo.facing == 1 ? (360 - ((cameraInfo.orientation + i8) % 360)) % 360 : ((cameraInfo.orientation - i8) + 360) % 360;
        StringBuilder sb = new StringBuilder();
        sb.append("Camera Display Orientation: ");
        sb.append(i9);
        return i9;
    }

    private Camera.Parameters d() {
        Camera.Parameters parameters = this.f33607a.getParameters();
        String str = this.f33612f;
        if (str == null) {
            this.f33612f = parameters.flatten();
        } else {
            parameters.unflatten(str);
        }
        return parameters;
    }

    private static List e(Camera.Parameters parameters) {
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        ArrayList arrayList = new ArrayList();
        if (supportedPreviewSizes == null) {
            Camera.Size previewSize = parameters.getPreviewSize();
            if (previewSize != null) {
                new j4.s(previewSize.width, previewSize.height);
                arrayList.add(new j4.s(previewSize.width, previewSize.height));
            }
            return arrayList;
        }
        for (Camera.Size size : supportedPreviewSizes) {
            arrayList.add(new j4.s(size.width, size.height));
        }
        return arrayList;
    }

    private void f(int i8) {
        this.f33607a.setDisplayOrientation(i8);
    }

    private void g(boolean z8) {
        Camera.Parameters parametersD = d();
        if (parametersD == null) {
            Log.w(f33606n, "Device error: no camera parameters are available. Proceeding without configuration.");
            return;
        }
        String str = f33606n;
        StringBuilder sb = new StringBuilder();
        sb.append("Initial camera parameters: ");
        sb.append(parametersD.flatten());
        if (z8) {
            Log.w(str, "In camera config safe mode -- most settings will not be honored");
        }
        c.setFocus(parametersD, this.f33613g.getFocusMode(), z8);
        if (!z8) {
            c.setTorch(parametersD, false);
            if (this.f33613g.isScanInverted()) {
                c.setInvertColor(parametersD);
            }
            if (this.f33613g.isBarcodeSceneModeEnabled()) {
                c.setBarcodeSceneMode(parametersD);
            }
            if (this.f33613g.isMeteringEnabled()) {
                c.setVideoStabilization(parametersD);
                c.setFocusArea(parametersD);
                c.setMetering(parametersD);
            }
        }
        List<j4.s> listE = e(parametersD);
        if (listE.size() == 0) {
            this.f33615i = null;
        } else {
            j4.s bestPreviewSize = this.f33614h.getBestPreviewSize(listE, isCameraRotated());
            this.f33615i = bestPreviewSize;
            parametersD.setPreviewSize(bestPreviewSize.width, bestPreviewSize.height);
        }
        if (Build.DEVICE.equals("glass-1")) {
            c.setBestPreviewFPS(parametersD);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Final camera parameters: ");
        sb2.append(parametersD.flatten());
        this.f33607a.setParameters(parametersD);
    }

    private void h() {
        try {
            int iC = c();
            this.f33617k = iC;
            f(iC);
        } catch (Exception unused) {
            Log.w(f33606n, "Failed to set rotation.");
        }
        try {
            g(false);
        } catch (Exception unused2) {
            try {
                g(true);
            } catch (Exception unused3) {
                Log.w(f33606n, "Camera rejected even safe-mode parameters! No configuration");
            }
        }
        Camera.Size previewSize = this.f33607a.getParameters().getPreviewSize();
        if (previewSize == null) {
            this.f33616j = this.f33615i;
        } else {
            this.f33616j = new j4.s(previewSize.width, previewSize.height);
        }
        this.f33619m.setResolution(this.f33616j);
    }

    public void changeCameraParameters(j jVar) {
        Camera camera = this.f33607a;
        if (camera != null) {
            try {
                camera.setParameters(jVar.a(camera.getParameters()));
            } catch (RuntimeException e8) {
                Log.e(f33606n, "Failed to change camera parameters", e8);
            }
        }
    }

    public void close() {
        Camera camera = this.f33607a;
        if (camera != null) {
            camera.release();
            this.f33607a = null;
        }
    }

    public void configure() {
        if (this.f33607a == null) {
            throw new RuntimeException("Camera not open");
        }
        h();
    }

    public Camera getCamera() {
        return this.f33607a;
    }

    public int getCameraRotation() {
        return this.f33617k;
    }

    public k getCameraSettings() {
        return this.f33613g;
    }

    public o getDisplayConfiguration() {
        return this.f33614h;
    }

    public j4.s getNaturalPreviewSize() {
        return this.f33616j;
    }

    public j4.s getPreviewSize() {
        if (this.f33616j == null) {
            return null;
        }
        return isCameraRotated() ? this.f33616j.rotate() : this.f33616j;
    }

    public boolean isCameraRotated() {
        int i8 = this.f33617k;
        if (i8 != -1) {
            return i8 % 180 != 0;
        }
        throw new IllegalStateException("Rotation not calculated yet. Call configure() first.");
    }

    public boolean isOpen() {
        return this.f33607a != null;
    }

    public boolean isTorchOn() {
        String flashMode;
        Camera.Parameters parameters = this.f33607a.getParameters();
        if (parameters == null || (flashMode = parameters.getFlashMode()) == null) {
            return false;
        }
        return C0709m.ON.equals(flashMode) || "torch".equals(flashMode);
    }

    public void open() {
        Camera cameraOpen = L3.a.open(this.f33613g.getRequestedCameraId());
        this.f33607a = cameraOpen;
        if (cameraOpen == null) {
            throw new RuntimeException("Failed to open camera");
        }
        int cameraId = L3.a.getCameraId(this.f33613g.getRequestedCameraId());
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        this.f33608b = cameraInfo;
        Camera.getCameraInfo(cameraId, cameraInfo);
    }

    public void requestPreviewFrame(r rVar) {
        Camera camera = this.f33607a;
        if (camera == null || !this.f33611e) {
            return;
        }
        this.f33619m.setCallback(rVar);
        camera.setOneShotPreviewCallback(this.f33619m);
    }

    public void setCameraSettings(k kVar) {
        this.f33613g = kVar;
    }

    public void setDisplayConfiguration(o oVar) {
        this.f33614h = oVar;
    }

    public void setPreviewDisplay(SurfaceHolder surfaceHolder) throws IOException {
        setPreviewDisplay(new l(surfaceHolder));
    }

    public void setTorch(boolean z8) {
        if (this.f33607a != null) {
            try {
                if (z8 != isTorchOn()) {
                    C5859a c5859a = this.f33609c;
                    if (c5859a != null) {
                        c5859a.stop();
                    }
                    Camera.Parameters parameters = this.f33607a.getParameters();
                    c.setTorch(parameters, z8);
                    if (this.f33613g.isExposureEnabled()) {
                        c.setBestExposure(parameters, z8);
                    }
                    this.f33607a.setParameters(parameters);
                    C5859a c5859a2 = this.f33609c;
                    if (c5859a2 != null) {
                        c5859a2.start();
                    }
                }
            } catch (RuntimeException e8) {
                Log.e(f33606n, "Failed to set torch", e8);
            }
        }
    }

    public void startPreview() {
        Camera camera = this.f33607a;
        if (camera == null || this.f33611e) {
            return;
        }
        camera.startPreview();
        this.f33611e = true;
        this.f33609c = new C5859a(this.f33607a, this.f33613g);
        K3.b bVar = new K3.b(this.f33618l, this, this.f33613g);
        this.f33610d = bVar;
        bVar.start();
    }

    public void stopPreview() {
        C5859a c5859a = this.f33609c;
        if (c5859a != null) {
            c5859a.stop();
            this.f33609c = null;
        }
        K3.b bVar = this.f33610d;
        if (bVar != null) {
            bVar.stop();
            this.f33610d = null;
        }
        Camera camera = this.f33607a;
        if (camera == null || !this.f33611e) {
            return;
        }
        camera.stopPreview();
        this.f33619m.setCallback(null);
        this.f33611e = false;
    }

    public void setPreviewDisplay(l lVar) throws IOException {
        lVar.setPreview(this.f33607a);
    }
}
