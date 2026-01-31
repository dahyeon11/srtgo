package androidx.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final EdgeEffect f9350a;

    static class a {
        static void a(EdgeEffect edgeEffect, float f8, float f9) {
            edgeEffect.onPull(f8, f9);
        }
    }

    private static class b {
        public static EdgeEffect create(Context context, AttributeSet attributeSet) {
            try {
                return new EdgeEffect(context, attributeSet);
            } catch (Throwable unused) {
                return new EdgeEffect(context);
            }
        }

        public static float getDistance(EdgeEffect edgeEffect) {
            try {
                return edgeEffect.getDistance();
            } catch (Throwable unused) {
                return 0.0f;
            }
        }

        public static float onPullDistance(EdgeEffect edgeEffect, float f8, float f9) {
            try {
                return edgeEffect.onPullDistance(f8, f9);
            } catch (Throwable unused) {
                edgeEffect.onPull(f8, f9);
                return 0.0f;
            }
        }
    }

    @Deprecated
    public d(Context context) {
        this.f9350a = new EdgeEffect(context);
    }

    public static EdgeEffect create(Context context, AttributeSet attributeSet) {
        return Build.VERSION.SDK_INT >= 31 ? b.create(context, attributeSet) : new EdgeEffect(context);
    }

    public static float getDistance(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return b.getDistance(edgeEffect);
        }
        return 0.0f;
    }

    public static float onPullDistance(EdgeEffect edgeEffect, float f8, float f9) {
        if (Build.VERSION.SDK_INT >= 31) {
            return b.onPullDistance(edgeEffect, f8, f9);
        }
        onPull(edgeEffect, f8, f9);
        return f8;
    }

    @Deprecated
    public boolean draw(Canvas canvas) {
        return this.f9350a.draw(canvas);
    }

    @Deprecated
    public void finish() {
        this.f9350a.finish();
    }

    @Deprecated
    public boolean isFinished() {
        return this.f9350a.isFinished();
    }

    @Deprecated
    public boolean onAbsorb(int i8) {
        this.f9350a.onAbsorb(i8);
        return true;
    }

    @Deprecated
    public boolean onPull(float f8) {
        this.f9350a.onPull(f8);
        return true;
    }

    @Deprecated
    public boolean onRelease() {
        this.f9350a.onRelease();
        return this.f9350a.isFinished();
    }

    @Deprecated
    public void setSize(int i8, int i9) {
        this.f9350a.setSize(i8, i9);
    }

    @Deprecated
    public boolean onPull(float f8, float f9) {
        onPull(this.f9350a, f8, f9);
        return true;
    }

    public static void onPull(EdgeEffect edgeEffect, float f8, float f9) {
        a.a(edgeEffect, f8, f9);
    }
}
