package T2;

import X2.b;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import com.google.android.material.internal.o;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f4850a;

    /* renamed from: b, reason: collision with root package name */
    private final int f4851b;

    /* renamed from: c, reason: collision with root package name */
    private final int f4852c;

    /* renamed from: d, reason: collision with root package name */
    private final float f4853d;

    public a(Context context) {
        this.f4850a = b.resolveBoolean(context, J2.b.elevationOverlayEnabled, false);
        this.f4851b = Q2.a.getColor(context, J2.b.elevationOverlayColor, 0);
        this.f4852c = Q2.a.getColor(context, J2.b.colorSurface, 0);
        this.f4853d = context.getResources().getDisplayMetrics().density;
    }

    private boolean a(int i8) {
        return androidx.core.graphics.a.setAlphaComponent(i8, 255) == this.f4852c;
    }

    public int calculateOverlayAlpha(float f8) {
        return Math.round(calculateOverlayAlphaFraction(f8) * 255.0f);
    }

    public float calculateOverlayAlphaFraction(float f8) {
        if (this.f4853d <= 0.0f || f8 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f8 / r0)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    public int compositeOverlay(int i8, float f8, View view) {
        return compositeOverlay(i8, f8 + getParentAbsoluteElevation(view));
    }

    public int compositeOverlayIfNeeded(int i8, float f8, View view) {
        return compositeOverlayIfNeeded(i8, f8 + getParentAbsoluteElevation(view));
    }

    public int compositeOverlayWithThemeSurfaceColorIfNeeded(float f8, View view) {
        return compositeOverlayWithThemeSurfaceColorIfNeeded(f8 + getParentAbsoluteElevation(view));
    }

    public float getParentAbsoluteElevation(View view) {
        return o.getParentAbsoluteElevation(view);
    }

    public int getThemeElevationOverlayColor() {
        return this.f4851b;
    }

    public int getThemeSurfaceColor() {
        return this.f4852c;
    }

    public boolean isThemeElevationOverlayEnabled() {
        return this.f4850a;
    }

    public int compositeOverlay(int i8, float f8) {
        float fCalculateOverlayAlphaFraction = calculateOverlayAlphaFraction(f8);
        return androidx.core.graphics.a.setAlphaComponent(Q2.a.layer(androidx.core.graphics.a.setAlphaComponent(i8, 255), this.f4851b, fCalculateOverlayAlphaFraction), Color.alpha(i8));
    }

    public int compositeOverlayIfNeeded(int i8, float f8) {
        return (this.f4850a && a(i8)) ? compositeOverlay(i8, f8) : i8;
    }

    public int compositeOverlayWithThemeSurfaceColorIfNeeded(float f8) {
        return compositeOverlayIfNeeded(this.f4852c, f8);
    }
}
