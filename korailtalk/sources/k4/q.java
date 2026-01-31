package k4;

import android.graphics.Rect;

/* loaded from: classes2.dex */
public class q extends s {
    private static float b(float f8) {
        return f8 < 1.0f ? 1.0f / f8 : f8;
    }

    @Override // k4.s
    protected float a(j4.s sVar, j4.s sVar2) {
        int i8 = sVar.width;
        if (i8 <= 0 || sVar.height <= 0) {
            return 0.0f;
        }
        float fB = (1.0f / b((i8 * 1.0f) / sVar2.width)) / b((sVar.height * 1.0f) / sVar2.height);
        float fB2 = b(((sVar.width * 1.0f) / sVar.height) / ((sVar2.width * 1.0f) / sVar2.height));
        return fB * (((1.0f / fB2) / fB2) / fB2);
    }

    @Override // k4.s
    public Rect scalePreview(j4.s sVar, j4.s sVar2) {
        return new Rect(0, 0, sVar2.width, sVar2.height);
    }
}
