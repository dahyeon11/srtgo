package O2;

import O2.c;
import android.animation.TypeEvaluator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Property;

/* loaded from: classes2.dex */
public interface d extends c.a {

    public static class b implements TypeEvaluator {
        public static final TypeEvaluator<e> CIRCULAR_REVEAL = new b();

        /* renamed from: a, reason: collision with root package name */
        private final e f3410a = new e();

        @Override // android.animation.TypeEvaluator
        public e evaluate(float f8, e eVar, e eVar2) {
            this.f3410a.set(V2.a.lerp(eVar.centerX, eVar2.centerX, f8), V2.a.lerp(eVar.centerY, eVar2.centerY, f8), V2.a.lerp(eVar.radius, eVar2.radius, f8));
            return this.f3410a;
        }
    }

    public static class c extends Property {
        public static final Property<d, e> CIRCULAR_REVEAL = new c("circularReveal");

        private c(String str) {
            super(e.class, str);
        }

        @Override // android.util.Property
        public e get(d dVar) {
            return dVar.getRevealInfo();
        }

        @Override // android.util.Property
        public void set(d dVar, e eVar) {
            dVar.setRevealInfo(eVar);
        }
    }

    /* renamed from: O2.d$d, reason: collision with other inner class name */
    public static class C0059d extends Property {
        public static final Property<d, Integer> CIRCULAR_REVEAL_SCRIM_COLOR = new C0059d("circularRevealScrimColor");

        private C0059d(String str) {
            super(Integer.class, str);
        }

        @Override // android.util.Property
        public Integer get(d dVar) {
            return Integer.valueOf(dVar.getCircularRevealScrimColor());
        }

        @Override // android.util.Property
        public void set(d dVar, Integer num) {
            dVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    public static class e {
        public static final float INVALID_RADIUS = Float.MAX_VALUE;
        public float centerX;
        public float centerY;
        public float radius;

        public boolean isInvalid() {
            return this.radius == Float.MAX_VALUE;
        }

        public void set(float f8, float f9, float f10) {
            this.centerX = f8;
            this.centerY = f9;
            this.radius = f10;
        }

        private e() {
        }

        public e(float f8, float f9, float f10) {
            this.centerX = f8;
            this.centerY = f9;
            this.radius = f10;
        }

        public void set(e eVar) {
            set(eVar.centerX, eVar.centerY, eVar.radius);
        }

        public e(e eVar) {
            this(eVar.centerX, eVar.centerY, eVar.radius);
        }
    }

    @Override // O2.c.a
    /* synthetic */ void actualDraw(Canvas canvas);

    @Override // O2.c.a
    /* synthetic */ boolean actualIsOpaque();

    void buildCircularRevealCache();

    void destroyCircularRevealCache();

    void draw(Canvas canvas);

    Drawable getCircularRevealOverlayDrawable();

    int getCircularRevealScrimColor();

    e getRevealInfo();

    boolean isOpaque();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i8);

    void setRevealInfo(e eVar);
}
