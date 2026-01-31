package a3;

import android.graphics.RectF;

/* loaded from: classes2.dex */
public class d {
    @Deprecated
    public void getCornerPath(float f8, float f9, m mVar) {
    }

    public void getCornerPath(m mVar, float f8, float f9, float f10) {
        getCornerPath(f8, f9, mVar);
    }

    public void getCornerPath(m mVar, float f8, float f9, RectF rectF, c cVar) {
        getCornerPath(mVar, f8, f9, cVar.getCornerSize(rectF));
    }
}
