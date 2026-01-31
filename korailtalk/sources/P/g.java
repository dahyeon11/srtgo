package P;

import androidx.constraintlayout.motion.widget.q;

/* loaded from: classes.dex */
public class g extends q {

    /* renamed from: a, reason: collision with root package name */
    private float f3596a;

    /* renamed from: b, reason: collision with root package name */
    private float f3597b;

    /* renamed from: c, reason: collision with root package name */
    private float f3598c;

    /* renamed from: d, reason: collision with root package name */
    private float f3599d;

    /* renamed from: e, reason: collision with root package name */
    private float f3600e;

    /* renamed from: f, reason: collision with root package name */
    private float f3601f;

    /* renamed from: g, reason: collision with root package name */
    private float f3602g;

    /* renamed from: h, reason: collision with root package name */
    private float f3603h;

    /* renamed from: i, reason: collision with root package name */
    private float f3604i;

    /* renamed from: j, reason: collision with root package name */
    private int f3605j;

    /* renamed from: k, reason: collision with root package name */
    private String f3606k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f3607l = false;

    /* renamed from: m, reason: collision with root package name */
    private float f3608m;

    /* renamed from: n, reason: collision with root package name */
    private float f3609n;

    private float a(float f8) {
        float f9 = this.f3599d;
        if (f8 <= f9) {
            float f10 = this.f3596a;
            return (f10 * f8) + ((((this.f3597b - f10) * f8) * f8) / (f9 * 2.0f));
        }
        int i8 = this.f3605j;
        if (i8 == 1) {
            return this.f3602g;
        }
        float f11 = f8 - f9;
        float f12 = this.f3600e;
        if (f11 < f12) {
            float f13 = this.f3602g;
            float f14 = this.f3597b;
            return f13 + (f14 * f11) + ((((this.f3598c - f14) * f11) * f11) / (f12 * 2.0f));
        }
        if (i8 == 2) {
            return this.f3603h;
        }
        float f15 = f11 - f12;
        float f16 = this.f3601f;
        if (f15 >= f16) {
            return this.f3604i;
        }
        float f17 = this.f3603h;
        float f18 = this.f3598c;
        return (f17 + (f18 * f15)) - (((f18 * f15) * f15) / (f16 * 2.0f));
    }

    private void b(float f8, float f9, float f10, float f11, float f12) {
        if (f8 == 0.0f) {
            f8 = 1.0E-4f;
        }
        this.f3596a = f8;
        float f13 = f8 / f10;
        float f14 = (f13 * f8) / 2.0f;
        if (f8 < 0.0f) {
            float fSqrt = (float) Math.sqrt((f9 - ((((-f8) / f10) * f8) / 2.0f)) * f10);
            if (fSqrt < f11) {
                this.f3606k = "backward accelerate, decelerate";
                this.f3605j = 2;
                this.f3596a = f8;
                this.f3597b = fSqrt;
                this.f3598c = 0.0f;
                float f15 = (fSqrt - f8) / f10;
                this.f3599d = f15;
                this.f3600e = fSqrt / f10;
                this.f3602g = ((f8 + fSqrt) * f15) / 2.0f;
                this.f3603h = f9;
                this.f3604i = f9;
                return;
            }
            this.f3606k = "backward accelerate cruse decelerate";
            this.f3605j = 3;
            this.f3596a = f8;
            this.f3597b = f11;
            this.f3598c = f11;
            float f16 = (f11 - f8) / f10;
            this.f3599d = f16;
            float f17 = f11 / f10;
            this.f3601f = f17;
            float f18 = ((f8 + f11) * f16) / 2.0f;
            float f19 = (f17 * f11) / 2.0f;
            this.f3600e = ((f9 - f18) - f19) / f11;
            this.f3602g = f18;
            this.f3603h = f9 - f19;
            this.f3604i = f9;
            return;
        }
        if (f14 >= f9) {
            this.f3606k = "hard stop";
            this.f3605j = 1;
            this.f3596a = f8;
            this.f3597b = 0.0f;
            this.f3602g = f9;
            this.f3599d = (2.0f * f9) / f8;
            return;
        }
        float f20 = f9 - f14;
        float f21 = f20 / f8;
        if (f21 + f13 < f12) {
            this.f3606k = "cruse decelerate";
            this.f3605j = 2;
            this.f3596a = f8;
            this.f3597b = f8;
            this.f3598c = 0.0f;
            this.f3602g = f20;
            this.f3603h = f9;
            this.f3599d = f21;
            this.f3600e = f13;
            return;
        }
        float fSqrt2 = (float) Math.sqrt((f10 * f9) + ((f8 * f8) / 2.0f));
        float f22 = (fSqrt2 - f8) / f10;
        this.f3599d = f22;
        float f23 = fSqrt2 / f10;
        this.f3600e = f23;
        if (fSqrt2 < f11) {
            this.f3606k = "accelerate decelerate";
            this.f3605j = 2;
            this.f3596a = f8;
            this.f3597b = fSqrt2;
            this.f3598c = 0.0f;
            this.f3599d = f22;
            this.f3600e = f23;
            this.f3602g = ((f8 + fSqrt2) * f22) / 2.0f;
            this.f3603h = f9;
            return;
        }
        this.f3606k = "accelerate cruse decelerate";
        this.f3605j = 3;
        this.f3596a = f8;
        this.f3597b = f11;
        this.f3598c = f11;
        float f24 = (f11 - f8) / f10;
        this.f3599d = f24;
        float f25 = f11 / f10;
        this.f3601f = f25;
        float f26 = ((f8 + f11) * f24) / 2.0f;
        float f27 = (f25 * f11) / 2.0f;
        this.f3600e = ((f9 - f26) - f27) / f11;
        this.f3602g = f26;
        this.f3603h = f9 - f27;
        this.f3604i = f9;
    }

    public void config(float f8, float f9, float f10, float f11, float f12, float f13) {
        this.f3608m = f8;
        boolean z8 = f8 > f9;
        this.f3607l = z8;
        if (z8) {
            b(-f10, f8 - f9, f12, f13, f11);
        } else {
            b(f10, f9 - f8, f12, f13, f11);
        }
    }

    public void debug(String str, String str2, float f8) {
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(" ===== ");
        sb.append(this.f3606k);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append(this.f3607l ? "backwards" : "forward ");
        sb2.append(" time = ");
        sb2.append(f8);
        sb2.append("  stages ");
        sb2.append(this.f3605j);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str2);
        sb3.append(" dur ");
        sb3.append(this.f3599d);
        sb3.append(" vel ");
        sb3.append(this.f3596a);
        sb3.append(" pos ");
        sb3.append(this.f3602g);
        if (this.f3605j > 1) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str2);
            sb4.append(" dur ");
            sb4.append(this.f3600e);
            sb4.append(" vel ");
            sb4.append(this.f3597b);
            sb4.append(" pos ");
            sb4.append(this.f3603h);
        }
        if (this.f3605j > 2) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(str2);
            sb5.append(" dur ");
            sb5.append(this.f3601f);
            sb5.append(" vel ");
            sb5.append(this.f3598c);
            sb5.append(" pos ");
            sb5.append(this.f3604i);
        }
        float f9 = this.f3599d;
        if (f8 <= f9) {
            StringBuilder sb6 = new StringBuilder();
            sb6.append(str2);
            sb6.append("stage 0");
            return;
        }
        int i8 = this.f3605j;
        if (i8 == 1) {
            StringBuilder sb7 = new StringBuilder();
            sb7.append(str2);
            sb7.append("end stage 0");
            return;
        }
        float f10 = f8 - f9;
        float f11 = this.f3600e;
        if (f10 < f11) {
            StringBuilder sb8 = new StringBuilder();
            sb8.append(str2);
            sb8.append(" stage 1");
        } else if (i8 == 2) {
            StringBuilder sb9 = new StringBuilder();
            sb9.append(str2);
            sb9.append("end stage 1");
        } else if (f10 - f11 < this.f3601f) {
            StringBuilder sb10 = new StringBuilder();
            sb10.append(str2);
            sb10.append(" stage 2");
        } else {
            StringBuilder sb11 = new StringBuilder();
            sb11.append(str2);
            sb11.append(" end stage 2");
        }
    }

    @Override // androidx.constraintlayout.motion.widget.q, android.animation.TimeInterpolator
    public float getInterpolation(float f8) {
        float fA = a(f8);
        this.f3609n = f8;
        return this.f3607l ? this.f3608m - fA : this.f3608m + fA;
    }

    public float getVelocity(float f8) {
        float f9 = this.f3599d;
        if (f8 <= f9) {
            float f10 = this.f3596a;
            return f10 + (((this.f3597b - f10) * f8) / f9);
        }
        int i8 = this.f3605j;
        if (i8 == 1) {
            return 0.0f;
        }
        float f11 = f8 - f9;
        float f12 = this.f3600e;
        if (f11 < f12) {
            float f13 = this.f3597b;
            return f13 + (((this.f3598c - f13) * f11) / f12);
        }
        if (i8 == 2) {
            return this.f3603h;
        }
        float f14 = f11 - f12;
        float f15 = this.f3601f;
        if (f14 >= f15) {
            return this.f3604i;
        }
        float f16 = this.f3598c;
        return f16 - ((f14 * f16) / f15);
    }

    @Override // androidx.constraintlayout.motion.widget.q
    public float getVelocity() {
        return this.f3607l ? -getVelocity(this.f3609n) : getVelocity(this.f3609n);
    }
}
