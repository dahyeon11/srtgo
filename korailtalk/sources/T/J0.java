package t;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import android.util.Rational;
import u.C6372C;

/* loaded from: classes.dex */
class J0 implements androidx.camera.core.H {

    /* renamed from: a, reason: collision with root package name */
    private final Object f36429a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final C6372C f36430b;

    /* renamed from: c, reason: collision with root package name */
    private int f36431c;

    J0(C6372C c6372c, int i8) {
        this.f36430b = c6372c;
        this.f36431c = i8;
    }

    void a(int i8) {
        synchronized (this.f36429a) {
            this.f36431c = i8;
        }
    }

    @Override // androidx.camera.core.H
    public int getExposureCompensationIndex() {
        int i8;
        synchronized (this.f36429a) {
            i8 = this.f36431c;
        }
        return i8;
    }

    @Override // androidx.camera.core.H
    public Range<Integer> getExposureCompensationRange() {
        return (Range) this.f36430b.get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
    }

    @Override // androidx.camera.core.H
    public Rational getExposureCompensationStep() {
        return !isExposureCompensationSupported() ? Rational.ZERO : (Rational) this.f36430b.get(CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP);
    }

    @Override // androidx.camera.core.H
    public boolean isExposureCompensationSupported() {
        Range range = (Range) this.f36430b.get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
        return (range == null || ((Integer) range.getLower()).intValue() == 0 || ((Integer) range.getUpper()).intValue() == 0) ? false : true;
    }
}
