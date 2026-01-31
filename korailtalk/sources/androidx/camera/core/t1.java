package androidx.camera.core;

import android.util.Rational;

/* loaded from: classes.dex */
public final class t1 {
    public static final int FILL_CENTER = 1;
    public static final int FILL_END = 2;
    public static final int FILL_START = 0;
    public static final int FIT = 3;

    /* renamed from: a, reason: collision with root package name */
    private int f7853a;

    /* renamed from: b, reason: collision with root package name */
    private Rational f7854b;

    /* renamed from: c, reason: collision with root package name */
    private int f7855c;

    /* renamed from: d, reason: collision with root package name */
    private int f7856d;

    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        private final Rational f7858b;

        /* renamed from: c, reason: collision with root package name */
        private final int f7859c;

        /* renamed from: a, reason: collision with root package name */
        private int f7857a = 1;

        /* renamed from: d, reason: collision with root package name */
        private int f7860d = 0;

        public a(Rational rational, int i8) {
            this.f7858b = rational;
            this.f7859c = i8;
        }

        public t1 build() {
            Z.h.checkNotNull(this.f7858b, "The crop aspect ratio must be set.");
            return new t1(this.f7857a, this.f7858b, this.f7859c, this.f7860d);
        }

        public a setLayoutDirection(int i8) {
            this.f7860d = i8;
            return this;
        }

        public a setScaleType(int i8) {
            this.f7857a = i8;
            return this;
        }
    }

    t1(int i8, Rational rational, int i9, int i10) {
        this.f7853a = i8;
        this.f7854b = rational;
        this.f7855c = i9;
        this.f7856d = i10;
    }

    public Rational getAspectRatio() {
        return this.f7854b;
    }

    public int getLayoutDirection() {
        return this.f7856d;
    }

    public int getRotation() {
        return this.f7855c;
    }

    public int getScaleType() {
        return this.f7853a;
    }
}
