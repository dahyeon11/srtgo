package k4;

import android.graphics.Rect;

/* loaded from: classes2.dex */
public class n extends s {
    @Override // k4.s
    protected float a(j4.s sVar, j4.s sVar2) {
        if (sVar.width <= 0 || sVar.height <= 0) {
            return 0.0f;
        }
        j4.s sVarScaleCrop = sVar.scaleCrop(sVar2);
        float fPow = (sVarScaleCrop.width * 1.0f) / sVar.width;
        if (fPow > 1.0f) {
            fPow = (float) Math.pow(1.0f / fPow, 1.1d);
        }
        float f8 = ((sVarScaleCrop.width * 1.0f) / sVar2.width) + ((sVarScaleCrop.height * 1.0f) / sVar2.height);
        return fPow * ((1.0f / f8) / f8);
    }

    @Override // k4.s
    public Rect scalePreview(j4.s sVar, j4.s sVar2) {
        j4.s sVarScaleCrop = sVar.scaleCrop(sVar2);
        StringBuilder sb = new StringBuilder();
        sb.append("Preview: ");
        sb.append(sVar);
        sb.append("; Scaled: ");
        sb.append(sVarScaleCrop);
        sb.append("; Want: ");
        sb.append(sVar2);
        int i8 = (sVarScaleCrop.width - sVar2.width) / 2;
        int i9 = (sVarScaleCrop.height - sVar2.height) / 2;
        return new Rect(-i8, -i9, sVarScaleCrop.width - i8, sVarScaleCrop.height - i9);
    }
}
