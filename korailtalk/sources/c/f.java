package C;

import androidx.camera.core.u1;

/* loaded from: classes.dex */
public abstract class f implements u1 {
    public static u1 create(float f8, float f9, float f10, float f11) {
        return new a(f8, f9, f10, f11);
    }

    @Override // androidx.camera.core.u1
    public abstract float getLinearZoom();

    @Override // androidx.camera.core.u1
    public abstract float getMaxZoomRatio();

    @Override // androidx.camera.core.u1
    public abstract float getMinZoomRatio();

    @Override // androidx.camera.core.u1
    public abstract float getZoomRatio();

    public static u1 create(u1 u1Var) {
        return new a(u1Var.getZoomRatio(), u1Var.getMaxZoomRatio(), u1Var.getMinZoomRatio(), u1Var.getLinearZoom());
    }
}
