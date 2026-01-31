package k4;

/* loaded from: classes2.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    private int f33623a = -1;

    /* renamed from: b, reason: collision with root package name */
    private boolean f33624b = false;

    /* renamed from: c, reason: collision with root package name */
    private boolean f33625c = false;

    /* renamed from: d, reason: collision with root package name */
    private boolean f33626d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f33627e = true;

    /* renamed from: f, reason: collision with root package name */
    private boolean f33628f = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f33629g = false;

    /* renamed from: h, reason: collision with root package name */
    private boolean f33630h = false;

    /* renamed from: i, reason: collision with root package name */
    private a f33631i = a.AUTO;

    public enum a {
        AUTO,
        CONTINUOUS,
        INFINITY,
        MACRO
    }

    public a getFocusMode() {
        return this.f33631i;
    }

    public int getRequestedCameraId() {
        return this.f33623a;
    }

    public boolean isAutoFocusEnabled() {
        return this.f33627e;
    }

    public boolean isAutoTorchEnabled() {
        return this.f33630h;
    }

    public boolean isBarcodeSceneModeEnabled() {
        return this.f33625c;
    }

    public boolean isContinuousFocusEnabled() {
        return this.f33628f;
    }

    public boolean isExposureEnabled() {
        return this.f33629g;
    }

    public boolean isMeteringEnabled() {
        return this.f33626d;
    }

    public boolean isScanInverted() {
        return this.f33624b;
    }

    public void setAutoFocusEnabled(boolean z8) {
        this.f33627e = z8;
        if (z8 && this.f33628f) {
            this.f33631i = a.CONTINUOUS;
        } else if (z8) {
            this.f33631i = a.AUTO;
        } else {
            this.f33631i = null;
        }
    }

    public void setAutoTorchEnabled(boolean z8) {
        this.f33630h = z8;
    }

    public void setBarcodeSceneModeEnabled(boolean z8) {
        this.f33625c = z8;
    }

    public void setContinuousFocusEnabled(boolean z8) {
        this.f33628f = z8;
        if (z8) {
            this.f33631i = a.CONTINUOUS;
        } else if (this.f33627e) {
            this.f33631i = a.AUTO;
        } else {
            this.f33631i = null;
        }
    }

    public void setExposureEnabled(boolean z8) {
        this.f33629g = z8;
    }

    public void setFocusMode(a aVar) {
        this.f33631i = aVar;
    }

    public void setMeteringEnabled(boolean z8) {
        this.f33626d = z8;
    }

    public void setRequestedCameraId(int i8) {
        this.f33623a = i8;
    }

    public void setScanInverted(boolean z8) {
        this.f33624b = z8;
    }
}
