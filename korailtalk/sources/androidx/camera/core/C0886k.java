package androidx.camera.core;

import android.graphics.Rect;
import androidx.camera.core.g1;

/* renamed from: androidx.camera.core.k */
/* loaded from: classes.dex */
final class C0886k extends g1.g {

    /* renamed from: a */
    private final Rect f7724a;

    /* renamed from: b */
    private final int f7725b;

    /* renamed from: c */
    private final int f7726c;

    C0886k(Rect rect, int i8, int i9) {
        if (rect == null) {
            throw new NullPointerException("Null cropRect");
        }
        this.f7724a = rect;
        this.f7725b = i8;
        this.f7726c = i9;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g1.g)) {
            return false;
        }
        g1.g gVar = (g1.g) obj;
        return this.f7724a.equals(gVar.getCropRect()) && this.f7725b == gVar.getRotationDegrees() && this.f7726c == gVar.getTargetRotation();
    }

    @Override // androidx.camera.core.g1.g
    public Rect getCropRect() {
        return this.f7724a;
    }

    @Override // androidx.camera.core.g1.g
    public int getRotationDegrees() {
        return this.f7725b;
    }

    @Override // androidx.camera.core.g1.g
    public int getTargetRotation() {
        return this.f7726c;
    }

    public int hashCode() {
        return ((((this.f7724a.hashCode() ^ 1000003) * 1000003) ^ this.f7725b) * 1000003) ^ this.f7726c;
    }

    public String toString() {
        return "TransformationInfo{cropRect=" + this.f7724a + ", rotationDegrees=" + this.f7725b + ", targetRotation=" + this.f7726c + "}";
    }
}
