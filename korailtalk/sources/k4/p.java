package k4;

import android.graphics.Rect;

/* loaded from: classes2.dex */
public class p extends s {
    @Override // k4.s
    protected float a(j4.s sVar, j4.s sVar2) {
        if (sVar.width <= 0 || sVar.height <= 0) {
            return 0.0f;
        }
        j4.s sVarScaleFit = sVar.scaleFit(sVar2);
        float fPow = (sVarScaleFit.width * 1.0f) / sVar.width;
        if (fPow > 1.0f) {
            fPow = (float) Math.pow(1.0f / fPow, 1.1d);
        }
        float f8 = ((sVar2.width * 1.0f) / sVarScaleFit.width) * ((sVar2.height * 1.0f) / sVarScaleFit.height);
        return fPow * (((1.0f / f8) / f8) / f8);
    }

    @Override // k4.s
    public Rect scalePreview(j4.s sVar, j4.s sVar2) {
        j4.s sVarScaleFit = sVar.scaleFit(sVar2);
        StringBuilder sb = new StringBuilder();
        sb.append("Preview: ");
        sb.append(sVar);
        sb.append("; Scaled: ");
        sb.append(sVarScaleFit);
        sb.append("; Want: ");
        sb.append(sVar2);
        int i8 = (sVarScaleFit.width - sVar2.width) / 2;
        int i9 = (sVarScaleFit.height - sVar2.height) / 2;
        return new Rect(-i8, -i9, sVarScaleFit.width - i8, sVarScaleFit.height - i9);
    }
}
