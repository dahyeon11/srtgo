package com.google.android.material.chip;

import J2.k;
import J2.l;
import K2.h;
import X2.c;
import X2.d;
import a3.g;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.core.graphics.drawable.b;
import com.google.android.material.internal.i;
import com.google.android.material.internal.o;
import i.AbstractC5638a;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes2.dex */
public class a extends g implements b, Drawable.Callback, i.b {

    /* renamed from: I0, reason: collision with root package name */
    private static final int[] f24587I0 = {R.attr.state_enabled};

    /* renamed from: J0, reason: collision with root package name */
    private static final ShapeDrawable f24588J0 = new ShapeDrawable(new OvalShape());

    /* renamed from: A, reason: collision with root package name */
    private float f24589A;

    /* renamed from: A0, reason: collision with root package name */
    private int[] f24590A0;

    /* renamed from: B, reason: collision with root package name */
    private float f24591B;

    /* renamed from: B0, reason: collision with root package name */
    private boolean f24592B0;

    /* renamed from: C, reason: collision with root package name */
    private ColorStateList f24593C;

    /* renamed from: C0, reason: collision with root package name */
    private ColorStateList f24594C0;

    /* renamed from: D, reason: collision with root package name */
    private float f24595D;

    /* renamed from: D0, reason: collision with root package name */
    private WeakReference f24596D0;

    /* renamed from: E, reason: collision with root package name */
    private ColorStateList f24597E;

    /* renamed from: E0, reason: collision with root package name */
    private TextUtils.TruncateAt f24598E0;

    /* renamed from: F, reason: collision with root package name */
    private CharSequence f24599F;

    /* renamed from: F0, reason: collision with root package name */
    private boolean f24600F0;

    /* renamed from: G, reason: collision with root package name */
    private boolean f24601G;

    /* renamed from: G0, reason: collision with root package name */
    private int f24602G0;

    /* renamed from: H, reason: collision with root package name */
    private Drawable f24603H;

    /* renamed from: H0, reason: collision with root package name */
    private boolean f24604H0;

    /* renamed from: I, reason: collision with root package name */
    private ColorStateList f24605I;

    /* renamed from: J, reason: collision with root package name */
    private float f24606J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f24607K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f24608L;

    /* renamed from: M, reason: collision with root package name */
    private Drawable f24609M;

    /* renamed from: N, reason: collision with root package name */
    private Drawable f24610N;

    /* renamed from: O, reason: collision with root package name */
    private ColorStateList f24611O;

    /* renamed from: P, reason: collision with root package name */
    private float f24612P;

    /* renamed from: Q, reason: collision with root package name */
    private CharSequence f24613Q;

    /* renamed from: R, reason: collision with root package name */
    private boolean f24614R;

    /* renamed from: S, reason: collision with root package name */
    private boolean f24615S;

    /* renamed from: T, reason: collision with root package name */
    private Drawable f24616T;

    /* renamed from: U, reason: collision with root package name */
    private ColorStateList f24617U;

    /* renamed from: V, reason: collision with root package name */
    private h f24618V;

    /* renamed from: W, reason: collision with root package name */
    private h f24619W;

    /* renamed from: X, reason: collision with root package name */
    private float f24620X;

    /* renamed from: Y, reason: collision with root package name */
    private float f24621Y;

    /* renamed from: Z, reason: collision with root package name */
    private float f24622Z;

    /* renamed from: a0, reason: collision with root package name */
    private float f24623a0;

    /* renamed from: b0, reason: collision with root package name */
    private float f24624b0;

    /* renamed from: c0, reason: collision with root package name */
    private float f24625c0;

    /* renamed from: d0, reason: collision with root package name */
    private float f24626d0;

    /* renamed from: e0, reason: collision with root package name */
    private float f24627e0;

    /* renamed from: f0, reason: collision with root package name */
    private final Context f24628f0;

    /* renamed from: g0, reason: collision with root package name */
    private final Paint f24629g0;

    /* renamed from: h0, reason: collision with root package name */
    private final Paint f24630h0;

    /* renamed from: i0, reason: collision with root package name */
    private final Paint.FontMetrics f24631i0;

    /* renamed from: j0, reason: collision with root package name */
    private final RectF f24632j0;

    /* renamed from: k0, reason: collision with root package name */
    private final PointF f24633k0;

    /* renamed from: l0, reason: collision with root package name */
    private final Path f24634l0;

    /* renamed from: m0, reason: collision with root package name */
    private final i f24635m0;

    /* renamed from: n0, reason: collision with root package name */
    private int f24636n0;

    /* renamed from: o0, reason: collision with root package name */
    private int f24637o0;

    /* renamed from: p0, reason: collision with root package name */
    private int f24638p0;

    /* renamed from: q0, reason: collision with root package name */
    private int f24639q0;

    /* renamed from: r0, reason: collision with root package name */
    private int f24640r0;

    /* renamed from: s0, reason: collision with root package name */
    private int f24641s0;

    /* renamed from: t0, reason: collision with root package name */
    private boolean f24642t0;

    /* renamed from: u0, reason: collision with root package name */
    private int f24643u0;

    /* renamed from: v0, reason: collision with root package name */
    private int f24644v0;

    /* renamed from: w0, reason: collision with root package name */
    private ColorFilter f24645w0;

    /* renamed from: x0, reason: collision with root package name */
    private PorterDuffColorFilter f24646x0;

    /* renamed from: y, reason: collision with root package name */
    private ColorStateList f24647y;

    /* renamed from: y0, reason: collision with root package name */
    private ColorStateList f24648y0;

    /* renamed from: z, reason: collision with root package name */
    private ColorStateList f24649z;

    /* renamed from: z0, reason: collision with root package name */
    private PorterDuff.Mode f24650z0;

    /* renamed from: com.google.android.material.chip.a$a, reason: collision with other inner class name */
    public interface InterfaceC0197a {
        void onChipDrawableSizeChange();
    }

    private a(Context context, AttributeSet attributeSet, int i8, int i9) {
        super(context, attributeSet, i8, i9);
        this.f24591B = -1.0f;
        this.f24629g0 = new Paint(1);
        this.f24631i0 = new Paint.FontMetrics();
        this.f24632j0 = new RectF();
        this.f24633k0 = new PointF();
        this.f24634l0 = new Path();
        this.f24644v0 = 255;
        this.f24650z0 = PorterDuff.Mode.SRC_IN;
        this.f24596D0 = new WeakReference(null);
        initializeElevationOverlay(context);
        this.f24628f0 = context;
        i iVar = new i(this);
        this.f24635m0 = iVar;
        this.f24599F = "";
        iVar.getTextPaint().density = context.getResources().getDisplayMetrics().density;
        this.f24630h0 = null;
        int[] iArr = f24587I0;
        setState(iArr);
        setCloseIconState(iArr);
        this.f24600F0 = true;
        if (Y2.b.USE_FRAMEWORK_RIPPLE) {
            f24588J0.setTint(-1);
        }
    }

    private void D(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        androidx.core.graphics.drawable.a.setLayoutDirection(drawable, androidx.core.graphics.drawable.a.getLayoutDirection(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f24609M) {
            if (drawable.isStateful()) {
                drawable.setState(getCloseIconState());
            }
            androidx.core.graphics.drawable.a.setTintList(drawable, this.f24611O);
            return;
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
        Drawable drawable2 = this.f24603H;
        if (drawable == drawable2 && this.f24607K) {
            androidx.core.graphics.drawable.a.setTintList(drawable2, this.f24605I);
        }
    }

    private void E(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (l0() || k0()) {
            float f8 = this.f24620X + this.f24621Y;
            float fY = Y();
            if (androidx.core.graphics.drawable.a.getLayoutDirection(this) == 0) {
                float f9 = rect.left + f8;
                rectF.left = f9;
                rectF.right = f9 + fY;
            } else {
                float f10 = rect.right - f8;
                rectF.right = f10;
                rectF.left = f10 - fY;
            }
            float fX = X();
            float fExactCenterY = rect.exactCenterY() - (fX / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fX;
        }
    }

    private void G(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (m0()) {
            float f8 = this.f24627e0 + this.f24626d0 + this.f24612P + this.f24625c0 + this.f24624b0;
            if (androidx.core.graphics.drawable.a.getLayoutDirection(this) == 0) {
                rectF.right = rect.right - f8;
            } else {
                rectF.left = rect.left + f8;
            }
        }
    }

    private void H(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m0()) {
            float f8 = this.f24627e0 + this.f24626d0;
            if (androidx.core.graphics.drawable.a.getLayoutDirection(this) == 0) {
                float f9 = rect.right - f8;
                rectF.right = f9;
                rectF.left = f9 - this.f24612P;
            } else {
                float f10 = rect.left + f8;
                rectF.left = f10;
                rectF.right = f10 + this.f24612P;
            }
            float fExactCenterY = rect.exactCenterY();
            float f11 = this.f24612P;
            float f12 = fExactCenterY - (f11 / 2.0f);
            rectF.top = f12;
            rectF.bottom = f12 + f11;
        }
    }

    private void I(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m0()) {
            float f8 = this.f24627e0 + this.f24626d0 + this.f24612P + this.f24625c0 + this.f24624b0;
            if (androidx.core.graphics.drawable.a.getLayoutDirection(this) == 0) {
                float f9 = rect.right;
                rectF.right = f9;
                rectF.left = f9 - f8;
            } else {
                int i8 = rect.left;
                rectF.left = i8;
                rectF.right = i8 + f8;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private void K(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.f24599F != null) {
            float F8 = this.f24620X + F() + this.f24623a0;
            float fJ = this.f24627e0 + J() + this.f24624b0;
            if (androidx.core.graphics.drawable.a.getLayoutDirection(this) == 0) {
                rectF.left = rect.left + F8;
                rectF.right = rect.right - fJ;
            } else {
                rectF.left = rect.left + fJ;
                rectF.right = rect.right - F8;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private float L() {
        this.f24635m0.getTextPaint().getFontMetrics(this.f24631i0);
        Paint.FontMetrics fontMetrics = this.f24631i0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    private boolean N() {
        return this.f24615S && this.f24616T != null && this.f24614R;
    }

    private void O(Canvas canvas, Rect rect) {
        if (k0()) {
            E(rect, this.f24632j0);
            RectF rectF = this.f24632j0;
            float f8 = rectF.left;
            float f9 = rectF.top;
            canvas.translate(f8, f9);
            this.f24616T.setBounds(0, 0, (int) this.f24632j0.width(), (int) this.f24632j0.height());
            this.f24616T.draw(canvas);
            canvas.translate(-f8, -f9);
        }
    }

    private void P(Canvas canvas, Rect rect) {
        if (this.f24604H0) {
            return;
        }
        this.f24629g0.setColor(this.f24637o0);
        this.f24629g0.setStyle(Paint.Style.FILL);
        this.f24629g0.setColorFilter(Z());
        this.f24632j0.set(rect);
        canvas.drawRoundRect(this.f24632j0, getChipCornerRadius(), getChipCornerRadius(), this.f24629g0);
    }

    private void Q(Canvas canvas, Rect rect) {
        if (l0()) {
            E(rect, this.f24632j0);
            RectF rectF = this.f24632j0;
            float f8 = rectF.left;
            float f9 = rectF.top;
            canvas.translate(f8, f9);
            this.f24603H.setBounds(0, 0, (int) this.f24632j0.width(), (int) this.f24632j0.height());
            this.f24603H.draw(canvas);
            canvas.translate(-f8, -f9);
        }
    }

    private void R(Canvas canvas, Rect rect) {
        if (this.f24595D <= 0.0f || this.f24604H0) {
            return;
        }
        this.f24629g0.setColor(this.f24639q0);
        this.f24629g0.setStyle(Paint.Style.STROKE);
        if (!this.f24604H0) {
            this.f24629g0.setColorFilter(Z());
        }
        RectF rectF = this.f24632j0;
        float f8 = rect.left;
        float f9 = this.f24595D;
        rectF.set(f8 + (f9 / 2.0f), rect.top + (f9 / 2.0f), rect.right - (f9 / 2.0f), rect.bottom - (f9 / 2.0f));
        float f10 = this.f24591B - (this.f24595D / 2.0f);
        canvas.drawRoundRect(this.f24632j0, f10, f10, this.f24629g0);
    }

    private void S(Canvas canvas, Rect rect) {
        if (this.f24604H0) {
            return;
        }
        this.f24629g0.setColor(this.f24636n0);
        this.f24629g0.setStyle(Paint.Style.FILL);
        this.f24632j0.set(rect);
        canvas.drawRoundRect(this.f24632j0, getChipCornerRadius(), getChipCornerRadius(), this.f24629g0);
    }

    private void T(Canvas canvas, Rect rect) {
        if (m0()) {
            H(rect, this.f24632j0);
            RectF rectF = this.f24632j0;
            float f8 = rectF.left;
            float f9 = rectF.top;
            canvas.translate(f8, f9);
            this.f24609M.setBounds(0, 0, (int) this.f24632j0.width(), (int) this.f24632j0.height());
            if (Y2.b.USE_FRAMEWORK_RIPPLE) {
                this.f24610N.setBounds(this.f24609M.getBounds());
                this.f24610N.jumpToCurrentState();
                this.f24610N.draw(canvas);
            } else {
                this.f24609M.draw(canvas);
            }
            canvas.translate(-f8, -f9);
        }
    }

    private void U(Canvas canvas, Rect rect) {
        this.f24629g0.setColor(this.f24640r0);
        this.f24629g0.setStyle(Paint.Style.FILL);
        this.f24632j0.set(rect);
        if (!this.f24604H0) {
            canvas.drawRoundRect(this.f24632j0, getChipCornerRadius(), getChipCornerRadius(), this.f24629g0);
        } else {
            g(new RectF(rect), this.f24634l0);
            super.o(canvas, this.f24629g0, this.f24634l0, q());
        }
    }

    private void V(Canvas canvas, Rect rect) {
        Paint paint = this.f24630h0;
        if (paint != null) {
            paint.setColor(androidx.core.graphics.a.setAlphaComponent(-16777216, 127));
            canvas.drawRect(rect, this.f24630h0);
            if (l0() || k0()) {
                E(rect, this.f24632j0);
                canvas.drawRect(this.f24632j0, this.f24630h0);
            }
            if (this.f24599F != null) {
                canvas.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.f24630h0);
            }
            if (m0()) {
                H(rect, this.f24632j0);
                canvas.drawRect(this.f24632j0, this.f24630h0);
            }
            this.f24630h0.setColor(androidx.core.graphics.a.setAlphaComponent(W.a.CATEGORY_MASK, 127));
            G(rect, this.f24632j0);
            canvas.drawRect(this.f24632j0, this.f24630h0);
            this.f24630h0.setColor(androidx.core.graphics.a.setAlphaComponent(-16711936, 127));
            I(rect, this.f24632j0);
            canvas.drawRect(this.f24632j0, this.f24630h0);
        }
    }

    private void W(Canvas canvas, Rect rect) {
        if (this.f24599F != null) {
            Paint.Align alignM = M(rect, this.f24633k0);
            K(rect, this.f24632j0);
            if (this.f24635m0.getTextAppearance() != null) {
                this.f24635m0.getTextPaint().drawableState = getState();
                this.f24635m0.updateTextPaintDrawState(this.f24628f0);
            }
            this.f24635m0.getTextPaint().setTextAlign(alignM);
            int iSave = 0;
            boolean z8 = Math.round(this.f24635m0.getTextWidth(getText().toString())) > Math.round(this.f24632j0.width());
            if (z8) {
                iSave = canvas.save();
                canvas.clipRect(this.f24632j0);
            }
            CharSequence charSequenceEllipsize = this.f24599F;
            if (z8 && this.f24598E0 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.f24635m0.getTextPaint(), this.f24632j0.width(), this.f24598E0);
            }
            CharSequence charSequence = charSequenceEllipsize;
            int length = charSequence.length();
            PointF pointF = this.f24633k0;
            canvas.drawText(charSequence, 0, length, pointF.x, pointF.y, this.f24635m0.getTextPaint());
            if (z8) {
                canvas.restoreToCount(iSave);
            }
        }
    }

    private float X() {
        Drawable drawable = this.f24642t0 ? this.f24616T : this.f24603H;
        float fCeil = this.f24606J;
        if (fCeil <= 0.0f && drawable != null) {
            fCeil = (float) Math.ceil(o.dpToPx(this.f24628f0, 24));
            if (drawable.getIntrinsicHeight() <= fCeil) {
                return drawable.getIntrinsicHeight();
            }
        }
        return fCeil;
    }

    private float Y() {
        Drawable drawable = this.f24642t0 ? this.f24616T : this.f24603H;
        float f8 = this.f24606J;
        return (f8 > 0.0f || drawable == null) ? f8 : drawable.getIntrinsicWidth();
    }

    private ColorFilter Z() {
        ColorFilter colorFilter = this.f24645w0;
        return colorFilter != null ? colorFilter : this.f24646x0;
    }

    private static boolean a0(int[] iArr, int i8) {
        if (iArr == null) {
            return false;
        }
        for (int i9 : iArr) {
            if (i9 == i8) {
                return true;
            }
        }
        return false;
    }

    private static boolean b0(d dVar) {
        ColorStateList colorStateList;
        return (dVar == null || (colorStateList = dVar.textColor) == null || !colorStateList.isStateful()) ? false : true;
    }

    private static boolean c0(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static a createFromAttributes(Context context, AttributeSet attributeSet, int i8, int i9) {
        a aVar = new a(context, attributeSet, i8, i9);
        aVar.e0(attributeSet, i8, i9);
        return aVar;
    }

    public static a createFromResource(Context context, int i8) throws XmlPullParserException, Resources.NotFoundException, IOException {
        AttributeSet drawableXml = S2.a.parseDrawableXml(context, i8, "chip");
        int styleAttribute = drawableXml.getStyleAttribute();
        if (styleAttribute == 0) {
            styleAttribute = k.Widget_MaterialComponents_Chip_Entry;
        }
        return createFromAttributes(context, drawableXml, J2.b.chipStandaloneStyle, styleAttribute);
    }

    private static boolean d0(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    private void e0(AttributeSet attributeSet, int i8, int i9) {
        TypedArray typedArrayObtainStyledAttributes = com.google.android.material.internal.k.obtainStyledAttributes(this.f24628f0, attributeSet, l.Chip, i8, i9, new int[0]);
        this.f24604H0 = typedArrayObtainStyledAttributes.hasValue(l.Chip_shapeAppearance);
        h0(c.getColorStateList(this.f24628f0, typedArrayObtainStyledAttributes, l.Chip_chipSurfaceColor));
        setChipBackgroundColor(c.getColorStateList(this.f24628f0, typedArrayObtainStyledAttributes, l.Chip_chipBackgroundColor));
        setChipMinHeight(typedArrayObtainStyledAttributes.getDimension(l.Chip_chipMinHeight, 0.0f));
        if (typedArrayObtainStyledAttributes.hasValue(l.Chip_chipCornerRadius)) {
            setChipCornerRadius(typedArrayObtainStyledAttributes.getDimension(l.Chip_chipCornerRadius, 0.0f));
        }
        setChipStrokeColor(c.getColorStateList(this.f24628f0, typedArrayObtainStyledAttributes, l.Chip_chipStrokeColor));
        setChipStrokeWidth(typedArrayObtainStyledAttributes.getDimension(l.Chip_chipStrokeWidth, 0.0f));
        setRippleColor(c.getColorStateList(this.f24628f0, typedArrayObtainStyledAttributes, l.Chip_rippleColor));
        setText(typedArrayObtainStyledAttributes.getText(l.Chip_android_text));
        d textAppearance = c.getTextAppearance(this.f24628f0, typedArrayObtainStyledAttributes, l.Chip_android_textAppearance);
        textAppearance.textSize = typedArrayObtainStyledAttributes.getDimension(l.Chip_android_textSize, textAppearance.textSize);
        setTextAppearance(textAppearance);
        int i10 = typedArrayObtainStyledAttributes.getInt(l.Chip_android_ellipsize, 0);
        if (i10 == 1) {
            setEllipsize(TextUtils.TruncateAt.START);
        } else if (i10 == 2) {
            setEllipsize(TextUtils.TruncateAt.MIDDLE);
        } else if (i10 == 3) {
            setEllipsize(TextUtils.TruncateAt.END);
        }
        setChipIconVisible(typedArrayObtainStyledAttributes.getBoolean(l.Chip_chipIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            setChipIconVisible(typedArrayObtainStyledAttributes.getBoolean(l.Chip_chipIconEnabled, false));
        }
        setChipIcon(c.getDrawable(this.f24628f0, typedArrayObtainStyledAttributes, l.Chip_chipIcon));
        if (typedArrayObtainStyledAttributes.hasValue(l.Chip_chipIconTint)) {
            setChipIconTint(c.getColorStateList(this.f24628f0, typedArrayObtainStyledAttributes, l.Chip_chipIconTint));
        }
        setChipIconSize(typedArrayObtainStyledAttributes.getDimension(l.Chip_chipIconSize, -1.0f));
        setCloseIconVisible(typedArrayObtainStyledAttributes.getBoolean(l.Chip_closeIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            setCloseIconVisible(typedArrayObtainStyledAttributes.getBoolean(l.Chip_closeIconEnabled, false));
        }
        setCloseIcon(c.getDrawable(this.f24628f0, typedArrayObtainStyledAttributes, l.Chip_closeIcon));
        setCloseIconTint(c.getColorStateList(this.f24628f0, typedArrayObtainStyledAttributes, l.Chip_closeIconTint));
        setCloseIconSize(typedArrayObtainStyledAttributes.getDimension(l.Chip_closeIconSize, 0.0f));
        setCheckable(typedArrayObtainStyledAttributes.getBoolean(l.Chip_android_checkable, false));
        setCheckedIconVisible(typedArrayObtainStyledAttributes.getBoolean(l.Chip_checkedIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            setCheckedIconVisible(typedArrayObtainStyledAttributes.getBoolean(l.Chip_checkedIconEnabled, false));
        }
        setCheckedIcon(c.getDrawable(this.f24628f0, typedArrayObtainStyledAttributes, l.Chip_checkedIcon));
        if (typedArrayObtainStyledAttributes.hasValue(l.Chip_checkedIconTint)) {
            setCheckedIconTint(c.getColorStateList(this.f24628f0, typedArrayObtainStyledAttributes, l.Chip_checkedIconTint));
        }
        setShowMotionSpec(h.createFromAttribute(this.f24628f0, typedArrayObtainStyledAttributes, l.Chip_showMotionSpec));
        setHideMotionSpec(h.createFromAttribute(this.f24628f0, typedArrayObtainStyledAttributes, l.Chip_hideMotionSpec));
        setChipStartPadding(typedArrayObtainStyledAttributes.getDimension(l.Chip_chipStartPadding, 0.0f));
        setIconStartPadding(typedArrayObtainStyledAttributes.getDimension(l.Chip_iconStartPadding, 0.0f));
        setIconEndPadding(typedArrayObtainStyledAttributes.getDimension(l.Chip_iconEndPadding, 0.0f));
        setTextStartPadding(typedArrayObtainStyledAttributes.getDimension(l.Chip_textStartPadding, 0.0f));
        setTextEndPadding(typedArrayObtainStyledAttributes.getDimension(l.Chip_textEndPadding, 0.0f));
        setCloseIconStartPadding(typedArrayObtainStyledAttributes.getDimension(l.Chip_closeIconStartPadding, 0.0f));
        setCloseIconEndPadding(typedArrayObtainStyledAttributes.getDimension(l.Chip_closeIconEndPadding, 0.0f));
        setChipEndPadding(typedArrayObtainStyledAttributes.getDimension(l.Chip_chipEndPadding, 0.0f));
        setMaxWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(l.Chip_android_maxWidth, Integer.MAX_VALUE));
        typedArrayObtainStyledAttributes.recycle();
    }

    private boolean g0(int[] iArr, int[] iArr2) {
        boolean z8;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.f24647y;
        int iK = k(colorStateList != null ? colorStateList.getColorForState(iArr, this.f24636n0) : 0);
        boolean state = true;
        if (this.f24636n0 != iK) {
            this.f24636n0 = iK;
            zOnStateChange = true;
        }
        ColorStateList colorStateList2 = this.f24649z;
        int iK2 = k(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f24637o0) : 0);
        if (this.f24637o0 != iK2) {
            this.f24637o0 = iK2;
            zOnStateChange = true;
        }
        int iLayer = Q2.a.layer(iK, iK2);
        if ((this.f24638p0 != iLayer) | (getFillColor() == null)) {
            this.f24638p0 = iLayer;
            setFillColor(ColorStateList.valueOf(iLayer));
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.f24593C;
        int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f24639q0) : 0;
        if (this.f24639q0 != colorForState) {
            this.f24639q0 = colorForState;
            zOnStateChange = true;
        }
        int colorForState2 = (this.f24594C0 == null || !Y2.b.shouldDrawRippleCompat(iArr)) ? 0 : this.f24594C0.getColorForState(iArr, this.f24640r0);
        if (this.f24640r0 != colorForState2) {
            this.f24640r0 = colorForState2;
            if (this.f24592B0) {
                zOnStateChange = true;
            }
        }
        int colorForState3 = (this.f24635m0.getTextAppearance() == null || this.f24635m0.getTextAppearance().textColor == null) ? 0 : this.f24635m0.getTextAppearance().textColor.getColorForState(iArr, this.f24641s0);
        if (this.f24641s0 != colorForState3) {
            this.f24641s0 = colorForState3;
            zOnStateChange = true;
        }
        boolean z9 = a0(getState(), R.attr.state_checked) && this.f24614R;
        if (this.f24642t0 == z9 || this.f24616T == null) {
            z8 = false;
        } else {
            float F8 = F();
            this.f24642t0 = z9;
            if (F8 != F()) {
                zOnStateChange = true;
                z8 = true;
            } else {
                z8 = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList4 = this.f24648y0;
        int colorForState4 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f24643u0) : 0;
        if (this.f24643u0 != colorForState4) {
            this.f24643u0 = colorForState4;
            this.f24646x0 = S2.a.updateTintFilter(this, this.f24648y0, this.f24650z0);
        } else {
            state = zOnStateChange;
        }
        if (d0(this.f24603H)) {
            state |= this.f24603H.setState(iArr);
        }
        if (d0(this.f24616T)) {
            state |= this.f24616T.setState(iArr);
        }
        if (d0(this.f24609M)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.f24609M.setState(iArr3);
        }
        if (Y2.b.USE_FRAMEWORK_RIPPLE && d0(this.f24610N)) {
            state |= this.f24610N.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z8) {
            f0();
        }
        return state;
    }

    private void h0(ColorStateList colorStateList) {
        if (this.f24647y != colorStateList) {
            this.f24647y = colorStateList;
            onStateChange(getState());
        }
    }

    private boolean k0() {
        return this.f24615S && this.f24616T != null && this.f24642t0;
    }

    private boolean l0() {
        return this.f24601G && this.f24603H != null;
    }

    private boolean m0() {
        return this.f24608L && this.f24609M != null;
    }

    private void n0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    private void o0() {
        this.f24594C0 = this.f24592B0 ? Y2.b.sanitizeRippleDrawableColor(this.f24597E) : null;
    }

    private void p0() {
        this.f24610N = new RippleDrawable(Y2.b.sanitizeRippleDrawableColor(getRippleColor()), this.f24609M, f24588J0);
    }

    float F() {
        if (l0() || k0()) {
            return this.f24621Y + Y() + this.f24622Z;
        }
        return 0.0f;
    }

    float J() {
        if (m0()) {
            return this.f24625c0 + this.f24612P + this.f24626d0;
        }
        return 0.0f;
    }

    Paint.Align M(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.f24599F != null) {
            float F8 = this.f24620X + F() + this.f24623a0;
            if (androidx.core.graphics.drawable.a.getLayoutDirection(this) == 0) {
                pointF.x = rect.left + F8;
            } else {
                pointF.x = rect.right - F8;
                align = Paint.Align.RIGHT;
            }
            pointF.y = rect.centerY() - L();
        }
        return align;
    }

    @Override // a3.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.isEmpty() || getAlpha() == 0) {
            return;
        }
        int i8 = this.f24644v0;
        int iSaveLayerAlpha = i8 < 255 ? M2.a.saveLayerAlpha(canvas, bounds.left, bounds.top, bounds.right, bounds.bottom, i8) : 0;
        S(canvas, bounds);
        P(canvas, bounds);
        if (this.f24604H0) {
            super.draw(canvas);
        }
        R(canvas, bounds);
        U(canvas, bounds);
        Q(canvas, bounds);
        O(canvas, bounds);
        if (this.f24600F0) {
            W(canvas, bounds);
        }
        T(canvas, bounds);
        V(canvas, bounds);
        if (this.f24644v0 < 255) {
            canvas.restoreToCount(iSaveLayerAlpha);
        }
    }

    protected void f0() {
        InterfaceC0197a interfaceC0197a = (InterfaceC0197a) this.f24596D0.get();
        if (interfaceC0197a != null) {
            interfaceC0197a.onChipDrawableSizeChange();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f24644v0;
    }

    public Drawable getCheckedIcon() {
        return this.f24616T;
    }

    public ColorStateList getCheckedIconTint() {
        return this.f24617U;
    }

    public ColorStateList getChipBackgroundColor() {
        return this.f24649z;
    }

    public float getChipCornerRadius() {
        return this.f24604H0 ? getTopLeftCornerResolvedSize() : this.f24591B;
    }

    public float getChipEndPadding() {
        return this.f24627e0;
    }

    public Drawable getChipIcon() {
        Drawable drawable = this.f24603H;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.unwrap(drawable);
        }
        return null;
    }

    public float getChipIconSize() {
        return this.f24606J;
    }

    public ColorStateList getChipIconTint() {
        return this.f24605I;
    }

    public float getChipMinHeight() {
        return this.f24589A;
    }

    public float getChipStartPadding() {
        return this.f24620X;
    }

    public ColorStateList getChipStrokeColor() {
        return this.f24593C;
    }

    public float getChipStrokeWidth() {
        return this.f24595D;
    }

    public void getChipTouchBounds(RectF rectF) {
        G(getBounds(), rectF);
    }

    public Drawable getCloseIcon() {
        Drawable drawable = this.f24609M;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.unwrap(drawable);
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        return this.f24613Q;
    }

    public float getCloseIconEndPadding() {
        return this.f24626d0;
    }

    public float getCloseIconSize() {
        return this.f24612P;
    }

    public float getCloseIconStartPadding() {
        return this.f24625c0;
    }

    public int[] getCloseIconState() {
        return this.f24590A0;
    }

    public ColorStateList getCloseIconTint() {
        return this.f24611O;
    }

    public void getCloseIconTouchBounds(RectF rectF) {
        I(getBounds(), rectF);
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f24645w0;
    }

    public TextUtils.TruncateAt getEllipsize() {
        return this.f24598E0;
    }

    public h getHideMotionSpec() {
        return this.f24619W;
    }

    public float getIconEndPadding() {
        return this.f24622Z;
    }

    public float getIconStartPadding() {
        return this.f24621Y;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.f24589A;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.f24620X + F() + this.f24623a0 + this.f24635m0.getTextWidth(getText().toString()) + this.f24624b0 + J() + this.f24627e0), this.f24602G0);
    }

    public int getMaxWidth() {
        return this.f24602G0;
    }

    @Override // a3.g, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // a3.g, android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.f24604H0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.f24591B);
        } else {
            outline.setRoundRect(bounds, this.f24591B);
        }
        outline.setAlpha(getAlpha() / 255.0f);
    }

    public ColorStateList getRippleColor() {
        return this.f24597E;
    }

    public h getShowMotionSpec() {
        return this.f24618V;
    }

    public CharSequence getText() {
        return this.f24599F;
    }

    public d getTextAppearance() {
        return this.f24635m0.getTextAppearance();
    }

    public float getTextEndPadding() {
        return this.f24624b0;
    }

    public float getTextStartPadding() {
        return this.f24623a0;
    }

    public boolean getUseCompatRipple() {
        return this.f24592B0;
    }

    void i0(boolean z8) {
        this.f24600F0 = z8;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public boolean isCheckable() {
        return this.f24614R;
    }

    @Deprecated
    public boolean isCheckedIconEnabled() {
        return isCheckedIconVisible();
    }

    public boolean isCheckedIconVisible() {
        return this.f24615S;
    }

    @Deprecated
    public boolean isChipIconEnabled() {
        return isChipIconVisible();
    }

    public boolean isChipIconVisible() {
        return this.f24601G;
    }

    @Deprecated
    public boolean isCloseIconEnabled() {
        return isCloseIconVisible();
    }

    public boolean isCloseIconStateful() {
        return d0(this.f24609M);
    }

    public boolean isCloseIconVisible() {
        return this.f24608L;
    }

    @Override // a3.g, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return c0(this.f24647y) || c0(this.f24649z) || c0(this.f24593C) || (this.f24592B0 && c0(this.f24594C0)) || b0(this.f24635m0.getTextAppearance()) || N() || d0(this.f24603H) || d0(this.f24616T) || c0(this.f24648y0);
    }

    boolean j0() {
        return this.f24600F0;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i8) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i8);
        if (l0()) {
            zOnLayoutDirectionChanged |= androidx.core.graphics.drawable.a.setLayoutDirection(this.f24603H, i8);
        }
        if (k0()) {
            zOnLayoutDirectionChanged |= androidx.core.graphics.drawable.a.setLayoutDirection(this.f24616T, i8);
        }
        if (m0()) {
            zOnLayoutDirectionChanged |= androidx.core.graphics.drawable.a.setLayoutDirection(this.f24609M, i8);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i8) {
        boolean zOnLevelChange = super.onLevelChange(i8);
        if (l0()) {
            zOnLevelChange |= this.f24603H.setLevel(i8);
        }
        if (k0()) {
            zOnLevelChange |= this.f24616T.setLevel(i8);
        }
        if (m0()) {
            zOnLevelChange |= this.f24609M.setLevel(i8);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // a3.g, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        if (this.f24604H0) {
            super.onStateChange(iArr);
        }
        return g0(iArr, getCloseIconState());
    }

    @Override // com.google.android.material.internal.i.b
    public void onTextSizeChange() {
        f0();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j8) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j8);
        }
    }

    @Override // a3.g, android.graphics.drawable.Drawable
    public void setAlpha(int i8) {
        if (this.f24644v0 != i8) {
            this.f24644v0 = i8;
            invalidateSelf();
        }
    }

    public void setCheckable(boolean z8) {
        if (this.f24614R != z8) {
            this.f24614R = z8;
            float F8 = F();
            if (!z8 && this.f24642t0) {
                this.f24642t0 = false;
            }
            float F9 = F();
            invalidateSelf();
            if (F8 != F9) {
                f0();
            }
        }
    }

    public void setCheckableResource(int i8) {
        setCheckable(this.f24628f0.getResources().getBoolean(i8));
    }

    public void setCheckedIcon(Drawable drawable) {
        if (this.f24616T != drawable) {
            float F8 = F();
            this.f24616T = drawable;
            float F9 = F();
            n0(this.f24616T);
            D(this.f24616T);
            invalidateSelf();
            if (F8 != F9) {
                f0();
            }
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z8) {
        setCheckedIconVisible(z8);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i8) {
        setCheckedIconVisible(this.f24628f0.getResources().getBoolean(i8));
    }

    public void setCheckedIconResource(int i8) {
        setCheckedIcon(AbstractC5638a.getDrawable(this.f24628f0, i8));
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        if (this.f24617U != colorStateList) {
            this.f24617U = colorStateList;
            if (N()) {
                androidx.core.graphics.drawable.a.setTintList(this.f24616T, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void setCheckedIconTintResource(int i8) {
        setCheckedIconTint(AbstractC5638a.getColorStateList(this.f24628f0, i8));
    }

    public void setCheckedIconVisible(int i8) {
        setCheckedIconVisible(this.f24628f0.getResources().getBoolean(i8));
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        if (this.f24649z != colorStateList) {
            this.f24649z = colorStateList;
            onStateChange(getState());
        }
    }

    public void setChipBackgroundColorResource(int i8) {
        setChipBackgroundColor(AbstractC5638a.getColorStateList(this.f24628f0, i8));
    }

    @Deprecated
    public void setChipCornerRadius(float f8) {
        if (this.f24591B != f8) {
            this.f24591B = f8;
            setShapeAppearanceModel(getShapeAppearanceModel().withCornerSize(f8));
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i8) {
        setChipCornerRadius(this.f24628f0.getResources().getDimension(i8));
    }

    public void setChipEndPadding(float f8) {
        if (this.f24627e0 != f8) {
            this.f24627e0 = f8;
            invalidateSelf();
            f0();
        }
    }

    public void setChipEndPaddingResource(int i8) {
        setChipEndPadding(this.f24628f0.getResources().getDimension(i8));
    }

    public void setChipIcon(Drawable drawable) {
        Drawable chipIcon = getChipIcon();
        if (chipIcon != drawable) {
            float F8 = F();
            this.f24603H = drawable != null ? androidx.core.graphics.drawable.a.wrap(drawable).mutate() : null;
            float F9 = F();
            n0(chipIcon);
            if (l0()) {
                D(this.f24603H);
            }
            invalidateSelf();
            if (F8 != F9) {
                f0();
            }
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z8) {
        setChipIconVisible(z8);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i8) {
        setChipIconVisible(i8);
    }

    public void setChipIconResource(int i8) {
        setChipIcon(AbstractC5638a.getDrawable(this.f24628f0, i8));
    }

    public void setChipIconSize(float f8) {
        if (this.f24606J != f8) {
            float F8 = F();
            this.f24606J = f8;
            float F9 = F();
            invalidateSelf();
            if (F8 != F9) {
                f0();
            }
        }
    }

    public void setChipIconSizeResource(int i8) {
        setChipIconSize(this.f24628f0.getResources().getDimension(i8));
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        this.f24607K = true;
        if (this.f24605I != colorStateList) {
            this.f24605I = colorStateList;
            if (l0()) {
                androidx.core.graphics.drawable.a.setTintList(this.f24603H, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void setChipIconTintResource(int i8) {
        setChipIconTint(AbstractC5638a.getColorStateList(this.f24628f0, i8));
    }

    public void setChipIconVisible(int i8) {
        setChipIconVisible(this.f24628f0.getResources().getBoolean(i8));
    }

    public void setChipMinHeight(float f8) {
        if (this.f24589A != f8) {
            this.f24589A = f8;
            invalidateSelf();
            f0();
        }
    }

    public void setChipMinHeightResource(int i8) {
        setChipMinHeight(this.f24628f0.getResources().getDimension(i8));
    }

    public void setChipStartPadding(float f8) {
        if (this.f24620X != f8) {
            this.f24620X = f8;
            invalidateSelf();
            f0();
        }
    }

    public void setChipStartPaddingResource(int i8) {
        setChipStartPadding(this.f24628f0.getResources().getDimension(i8));
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        if (this.f24593C != colorStateList) {
            this.f24593C = colorStateList;
            if (this.f24604H0) {
                setStrokeColor(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void setChipStrokeColorResource(int i8) {
        setChipStrokeColor(AbstractC5638a.getColorStateList(this.f24628f0, i8));
    }

    public void setChipStrokeWidth(float f8) {
        if (this.f24595D != f8) {
            this.f24595D = f8;
            this.f24629g0.setStrokeWidth(f8);
            if (this.f24604H0) {
                super.setStrokeWidth(f8);
            }
            invalidateSelf();
        }
    }

    public void setChipStrokeWidthResource(int i8) {
        setChipStrokeWidth(this.f24628f0.getResources().getDimension(i8));
    }

    public void setCloseIcon(Drawable drawable) {
        Drawable closeIcon = getCloseIcon();
        if (closeIcon != drawable) {
            float fJ = J();
            this.f24609M = drawable != null ? androidx.core.graphics.drawable.a.wrap(drawable).mutate() : null;
            if (Y2.b.USE_FRAMEWORK_RIPPLE) {
                p0();
            }
            float fJ2 = J();
            n0(closeIcon);
            if (m0()) {
                D(this.f24609M);
            }
            invalidateSelf();
            if (fJ != fJ2) {
                f0();
            }
        }
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        if (this.f24613Q != charSequence) {
            this.f24613Q = androidx.core.text.a.getInstance().unicodeWrap(charSequence);
            invalidateSelf();
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z8) {
        setCloseIconVisible(z8);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i8) {
        setCloseIconVisible(i8);
    }

    public void setCloseIconEndPadding(float f8) {
        if (this.f24626d0 != f8) {
            this.f24626d0 = f8;
            invalidateSelf();
            if (m0()) {
                f0();
            }
        }
    }

    public void setCloseIconEndPaddingResource(int i8) {
        setCloseIconEndPadding(this.f24628f0.getResources().getDimension(i8));
    }

    public void setCloseIconResource(int i8) {
        setCloseIcon(AbstractC5638a.getDrawable(this.f24628f0, i8));
    }

    public void setCloseIconSize(float f8) {
        if (this.f24612P != f8) {
            this.f24612P = f8;
            invalidateSelf();
            if (m0()) {
                f0();
            }
        }
    }

    public void setCloseIconSizeResource(int i8) {
        setCloseIconSize(this.f24628f0.getResources().getDimension(i8));
    }

    public void setCloseIconStartPadding(float f8) {
        if (this.f24625c0 != f8) {
            this.f24625c0 = f8;
            invalidateSelf();
            if (m0()) {
                f0();
            }
        }
    }

    public void setCloseIconStartPaddingResource(int i8) {
        setCloseIconStartPadding(this.f24628f0.getResources().getDimension(i8));
    }

    public boolean setCloseIconState(int[] iArr) {
        if (Arrays.equals(this.f24590A0, iArr)) {
            return false;
        }
        this.f24590A0 = iArr;
        if (m0()) {
            return g0(getState(), iArr);
        }
        return false;
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        if (this.f24611O != colorStateList) {
            this.f24611O = colorStateList;
            if (m0()) {
                androidx.core.graphics.drawable.a.setTintList(this.f24609M, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void setCloseIconTintResource(int i8) {
        setCloseIconTint(AbstractC5638a.getColorStateList(this.f24628f0, i8));
    }

    public void setCloseIconVisible(int i8) {
        setCloseIconVisible(this.f24628f0.getResources().getBoolean(i8));
    }

    @Override // a3.g, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f24645w0 != colorFilter) {
            this.f24645w0 = colorFilter;
            invalidateSelf();
        }
    }

    public void setDelegate(InterfaceC0197a interfaceC0197a) {
        this.f24596D0 = new WeakReference(interfaceC0197a);
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        this.f24598E0 = truncateAt;
    }

    public void setHideMotionSpec(h hVar) {
        this.f24619W = hVar;
    }

    public void setHideMotionSpecResource(int i8) {
        setHideMotionSpec(h.createFromResource(this.f24628f0, i8));
    }

    public void setIconEndPadding(float f8) {
        if (this.f24622Z != f8) {
            float F8 = F();
            this.f24622Z = f8;
            float F9 = F();
            invalidateSelf();
            if (F8 != F9) {
                f0();
            }
        }
    }

    public void setIconEndPaddingResource(int i8) {
        setIconEndPadding(this.f24628f0.getResources().getDimension(i8));
    }

    public void setIconStartPadding(float f8) {
        if (this.f24621Y != f8) {
            float F8 = F();
            this.f24621Y = f8;
            float F9 = F();
            invalidateSelf();
            if (F8 != F9) {
                f0();
            }
        }
    }

    public void setIconStartPaddingResource(int i8) {
        setIconStartPadding(this.f24628f0.getResources().getDimension(i8));
    }

    public void setMaxWidth(int i8) {
        this.f24602G0 = i8;
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f24597E != colorStateList) {
            this.f24597E = colorStateList;
            o0();
            onStateChange(getState());
        }
    }

    public void setRippleColorResource(int i8) {
        setRippleColor(AbstractC5638a.getColorStateList(this.f24628f0, i8));
    }

    public void setShowMotionSpec(h hVar) {
        this.f24618V = hVar;
    }

    public void setShowMotionSpecResource(int i8) {
        setShowMotionSpec(h.createFromResource(this.f24628f0, i8));
    }

    public void setText(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (TextUtils.equals(this.f24599F, charSequence)) {
            return;
        }
        this.f24599F = charSequence;
        this.f24635m0.setTextWidthDirty(true);
        invalidateSelf();
        f0();
    }

    public void setTextAppearance(d dVar) {
        this.f24635m0.setTextAppearance(dVar, this.f24628f0);
    }

    public void setTextAppearanceResource(int i8) {
        setTextAppearance(new d(this.f24628f0, i8));
    }

    public void setTextEndPadding(float f8) {
        if (this.f24624b0 != f8) {
            this.f24624b0 = f8;
            invalidateSelf();
            f0();
        }
    }

    public void setTextEndPaddingResource(int i8) {
        setTextEndPadding(this.f24628f0.getResources().getDimension(i8));
    }

    public void setTextResource(int i8) {
        setText(this.f24628f0.getResources().getString(i8));
    }

    public void setTextSize(float f8) {
        d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.textSize = f8;
            this.f24635m0.getTextPaint().setTextSize(f8);
            onTextSizeChange();
        }
    }

    public void setTextStartPadding(float f8) {
        if (this.f24623a0 != f8) {
            this.f24623a0 = f8;
            invalidateSelf();
            f0();
        }
    }

    public void setTextStartPaddingResource(int i8) {
        setTextStartPadding(this.f24628f0.getResources().getDimension(i8));
    }

    @Override // a3.g, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintList(ColorStateList colorStateList) {
        if (this.f24648y0 != colorStateList) {
            this.f24648y0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // a3.g, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.f24650z0 != mode) {
            this.f24650z0 = mode;
            this.f24646x0 = S2.a.updateTintFilter(this, this.f24648y0, mode);
            invalidateSelf();
        }
    }

    public void setUseCompatRipple(boolean z8) {
        if (this.f24592B0 != z8) {
            this.f24592B0 = z8;
            o0();
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z8, boolean z9) {
        boolean visible = super.setVisible(z8, z9);
        if (l0()) {
            visible |= this.f24603H.setVisible(z8, z9);
        }
        if (k0()) {
            visible |= this.f24616T.setVisible(z8, z9);
        }
        if (m0()) {
            visible |= this.f24609M.setVisible(z8, z9);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public void setCheckedIconVisible(boolean z8) {
        if (this.f24615S != z8) {
            boolean zK0 = k0();
            this.f24615S = z8;
            boolean zK02 = k0();
            if (zK0 != zK02) {
                if (zK02) {
                    D(this.f24616T);
                } else {
                    n0(this.f24616T);
                }
                invalidateSelf();
                f0();
            }
        }
    }

    public void setChipIconVisible(boolean z8) {
        if (this.f24601G != z8) {
            boolean zL0 = l0();
            this.f24601G = z8;
            boolean zL02 = l0();
            if (zL0 != zL02) {
                if (zL02) {
                    D(this.f24603H);
                } else {
                    n0(this.f24603H);
                }
                invalidateSelf();
                f0();
            }
        }
    }

    public void setCloseIconVisible(boolean z8) {
        if (this.f24608L != z8) {
            boolean zM0 = m0();
            this.f24608L = z8;
            boolean zM02 = m0();
            if (zM0 != zM02) {
                if (zM02) {
                    D(this.f24609M);
                } else {
                    n0(this.f24609M);
                }
                invalidateSelf();
                f0();
            }
        }
    }
}
