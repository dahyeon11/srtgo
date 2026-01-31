package w;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import u.C6372C;
import z.y0;

/* renamed from: w.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6455a implements y0 {

    /* renamed from: a, reason: collision with root package name */
    private final Range f37362a;

    public C6455a(C6372C c6372c) {
        this.f37362a = c((Range[]) c6372c.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES));
    }

    private Range a(Range range) {
        int iIntValue = ((Integer) range.getUpper()).intValue();
        int iIntValue2 = ((Integer) range.getLower()).intValue();
        if (((Integer) range.getUpper()).intValue() >= 1000) {
            iIntValue = ((Integer) range.getUpper()).intValue() / 1000;
        }
        if (((Integer) range.getLower()).intValue() >= 1000) {
            iIntValue2 = ((Integer) range.getLower()).intValue() / 1000;
        }
        return new Range(Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue));
    }

    static boolean b(C6372C c6372c) {
        Integer num = (Integer) c6372c.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 2;
    }

    private Range c(Range[] rangeArr) {
        Range range = null;
        if (rangeArr != null && rangeArr.length != 0) {
            for (Range range2 : rangeArr) {
                Range rangeA = a(range2);
                if (((Integer) rangeA.getUpper()).intValue() == 30 && (range == null || ((Integer) rangeA.getLower()).intValue() < ((Integer) range.getLower()).intValue())) {
                    range = rangeA;
                }
            }
        }
        return range;
    }

    public Range<Integer> getRange() {
        return this.f37362a;
    }
}
