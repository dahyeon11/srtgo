package P;

import androidx.constraintlayout.motion.widget.v;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    float f3610a;

    /* renamed from: b, reason: collision with root package name */
    float f3611b;

    /* renamed from: c, reason: collision with root package name */
    float f3612c;

    /* renamed from: d, reason: collision with root package name */
    float f3613d;

    /* renamed from: e, reason: collision with root package name */
    float f3614e;

    /* renamed from: f, reason: collision with root package name */
    float f3615f;

    public void applyTransform(float f8, float f9, int i8, int i9, float[] fArr) {
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = (f9 - 0.5f) * 2.0f;
        float f13 = f10 + this.f3612c;
        float f14 = f11 + this.f3613d;
        float f15 = f13 + (this.f3610a * (f8 - 0.5f) * 2.0f);
        float f16 = f14 + (this.f3611b * f12);
        float radians = (float) Math.toRadians(this.f3615f);
        float radians2 = (float) Math.toRadians(this.f3614e);
        double d9 = radians;
        double d10 = i9 * f12;
        float fSin = f15 + (((float) ((((-i8) * r7) * Math.sin(d9)) - (Math.cos(d9) * d10))) * radians2);
        float fCos = f16 + (radians2 * ((float) (((i8 * r7) * Math.cos(d9)) - (d10 * Math.sin(d9)))));
        fArr[0] = fSin;
        fArr[1] = fCos;
    }

    public void clear() {
        this.f3614e = 0.0f;
        this.f3613d = 0.0f;
        this.f3612c = 0.0f;
        this.f3611b = 0.0f;
        this.f3610a = 0.0f;
    }

    public void setRotationVelocity(v vVar, float f8) {
        if (vVar != null) {
            this.f3614e = vVar.getSlope(f8);
            this.f3615f = vVar.get(f8);
        }
    }

    public void setScaleVelocity(v vVar, v vVar2, float f8) {
        if (vVar != null) {
            this.f3610a = vVar.getSlope(f8);
        }
        if (vVar2 != null) {
            this.f3611b = vVar2.getSlope(f8);
        }
    }

    public void setTranslationVelocity(v vVar, v vVar2, float f8) {
        if (vVar != null) {
            this.f3612c = vVar.getSlope(f8);
        }
        if (vVar2 != null) {
            this.f3613d = vVar2.getSlope(f8);
        }
    }

    public void setRotationVelocity(androidx.constraintlayout.motion.widget.h hVar, float f8) {
        if (hVar != null) {
            this.f3614e = hVar.getSlope(f8);
        }
    }

    public void setScaleVelocity(androidx.constraintlayout.motion.widget.h hVar, androidx.constraintlayout.motion.widget.h hVar2, float f8) {
        if (hVar == null && hVar2 == null) {
            return;
        }
        if (hVar == null) {
            this.f3610a = hVar.getSlope(f8);
        }
        if (hVar2 == null) {
            this.f3611b = hVar2.getSlope(f8);
        }
    }

    public void setTranslationVelocity(androidx.constraintlayout.motion.widget.h hVar, androidx.constraintlayout.motion.widget.h hVar2, float f8) {
        if (hVar != null) {
            this.f3612c = hVar.getSlope(f8);
        }
        if (hVar2 != null) {
            this.f3613d = hVar2.getSlope(f8);
        }
    }
}
