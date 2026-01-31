package androidx.core.view;

import android.view.MotionEvent;

/* renamed from: androidx.core.view.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C0979n0 {

    /* renamed from: a, reason: collision with root package name */
    private final float[] f9242a = new float[20];

    /* renamed from: b, reason: collision with root package name */
    private final long[] f9243b = new long[20];

    /* renamed from: c, reason: collision with root package name */
    private float f9244c = 0.0f;

    /* renamed from: d, reason: collision with root package name */
    private int f9245d = 0;

    /* renamed from: e, reason: collision with root package name */
    private int f9246e = 0;

    C0979n0() {
    }

    private void b() {
        this.f9245d = 0;
        this.f9244c = 0.0f;
    }

    private float e() {
        long[] jArr;
        long j8;
        int i8 = this.f9245d;
        if (i8 < 2) {
            return 0.0f;
        }
        int i9 = this.f9246e;
        int i10 = ((i9 + 20) - (i8 - 1)) % 20;
        long j9 = this.f9243b[i9];
        while (true) {
            jArr = this.f9243b;
            j8 = jArr[i10];
            if (j9 - j8 <= 100) {
                break;
            }
            this.f9245d--;
            i10 = (i10 + 1) % 20;
        }
        int i11 = this.f9245d;
        if (i11 < 2) {
            return 0.0f;
        }
        if (i11 == 2) {
            int i12 = (i10 + 1) % 20;
            if (j8 == jArr[i12]) {
                return 0.0f;
            }
            return this.f9242a[i12] / (r2 - j8);
        }
        float fAbs = 0.0f;
        int i13 = 0;
        for (int i14 = 0; i14 < this.f9245d - 1; i14++) {
            int i15 = i14 + i10;
            long[] jArr2 = this.f9243b;
            long j10 = jArr2[i15 % 20];
            int i16 = (i15 + 1) % 20;
            if (jArr2[i16] != j10) {
                i13++;
                float f8 = f(fAbs);
                float f9 = this.f9242a[i16] / (this.f9243b[i16] - j10);
                fAbs += (f9 - f8) * Math.abs(f9);
                if (i13 == 1) {
                    fAbs *= 0.5f;
                }
            }
        }
        return f(fAbs);
    }

    private static float f(float f8) {
        return (f8 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f8) * 2.0f));
    }

    void a(MotionEvent motionEvent) {
        long eventTime = motionEvent.getEventTime();
        if (this.f9245d != 0 && eventTime - this.f9243b[this.f9246e] > 40) {
            b();
        }
        int i8 = (this.f9246e + 1) % 20;
        this.f9246e = i8;
        int i9 = this.f9245d;
        if (i9 != 20) {
            this.f9245d = i9 + 1;
        }
        this.f9242a[i8] = motionEvent.getAxisValue(26);
        this.f9243b[this.f9246e] = eventTime;
    }

    void c(int i8, float f8) {
        float fE = e() * i8;
        this.f9244c = fE;
        if (fE < (-Math.abs(f8))) {
            this.f9244c = -Math.abs(f8);
        } else if (this.f9244c > Math.abs(f8)) {
            this.f9244c = Math.abs(f8);
        }
    }

    float d(int i8) {
        if (i8 != 26) {
            return 0.0f;
        }
        return this.f9244c;
    }
}
