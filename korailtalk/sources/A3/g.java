package a3;

import a3.k;
import a3.l;
import a3.m;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import java.util.BitSet;

/* loaded from: classes2.dex */
public class g extends Drawable implements androidx.core.graphics.drawable.b, o {
    public static final int SHADOW_COMPAT_MODE_ALWAYS = 2;
    public static final int SHADOW_COMPAT_MODE_DEFAULT = 0;
    public static final int SHADOW_COMPAT_MODE_NEVER = 1;

    /* renamed from: w, reason: collision with root package name */
    private static final String f5867w = "g";

    /* renamed from: x, reason: collision with root package name */
    private static final Paint f5868x = new Paint(1);

    /* renamed from: a, reason: collision with root package name */
    private c f5869a;

    /* renamed from: b, reason: collision with root package name */
    private final m.i[] f5870b;

    /* renamed from: c, reason: collision with root package name */
    private final m.i[] f5871c;

    /* renamed from: d, reason: collision with root package name */
    private final BitSet f5872d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f5873e;

    /* renamed from: f, reason: collision with root package name */
    private final Matrix f5874f;

    /* renamed from: g, reason: collision with root package name */
    private final Path f5875g;

    /* renamed from: h, reason: collision with root package name */
    private final Path f5876h;

    /* renamed from: i, reason: collision with root package name */
    private final RectF f5877i;

    /* renamed from: j, reason: collision with root package name */
    private final RectF f5878j;

    /* renamed from: k, reason: collision with root package name */
    private final Region f5879k;

    /* renamed from: l, reason: collision with root package name */
    private final Region f5880l;

    /* renamed from: m, reason: collision with root package name */
    private k f5881m;

    /* renamed from: n, reason: collision with root package name */
    private final Paint f5882n;

    /* renamed from: o, reason: collision with root package name */
    private final Paint f5883o;

    /* renamed from: p, reason: collision with root package name */
    private final Z2.a f5884p;

    /* renamed from: q, reason: collision with root package name */
    private final l.b f5885q;

    /* renamed from: r, reason: collision with root package name */
    private final l f5886r;

    /* renamed from: s, reason: collision with root package name */
    private PorterDuffColorFilter f5887s;

    /* renamed from: t, reason: collision with root package name */
    private PorterDuffColorFilter f5888t;

    /* renamed from: u, reason: collision with root package name */
    private final RectF f5889u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f5890v;

    class a implements l.b {
        a() {
        }

        @Override // a3.l.b
        public void onCornerPathCreated(m mVar, Matrix matrix, int i8) {
            g.this.f5872d.set(i8, mVar.c());
            g.this.f5870b[i8] = mVar.d(matrix);
        }

        @Override // a3.l.b
        public void onEdgePathCreated(m mVar, Matrix matrix, int i8) {
            g.this.f5872d.set(i8 + 4, mVar.c());
            g.this.f5871c[i8] = mVar.d(matrix);
        }
    }

    class b implements k.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f5892a;

        b(float f8) {
            this.f5892a = f8;
        }

        @Override // a3.k.c
        public a3.c apply(a3.c cVar) {
            return cVar instanceof i ? cVar : new a3.b(this.f5892a, cVar);
        }
    }

    /* synthetic */ g(c cVar, a aVar) {
        this(cVar);
    }

    private boolean A(int[] iArr) {
        boolean z8;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f5869a.fillColor == null || color2 == (colorForState2 = this.f5869a.fillColor.getColorForState(iArr, (color2 = this.f5882n.getColor())))) {
            z8 = false;
        } else {
            this.f5882n.setColor(colorForState2);
            z8 = true;
        }
        if (this.f5869a.strokeColor == null || color == (colorForState = this.f5869a.strokeColor.getColorForState(iArr, (color = this.f5883o.getColor())))) {
            return z8;
        }
        this.f5883o.setColor(colorForState);
        return true;
    }

    private boolean B() {
        PorterDuffColorFilter porterDuffColorFilter = this.f5887s;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f5888t;
        c cVar = this.f5869a;
        this.f5887s = j(cVar.tintList, cVar.tintMode, this.f5882n, true);
        c cVar2 = this.f5869a;
        this.f5888t = j(cVar2.strokeTintList, cVar2.tintMode, this.f5883o, false);
        c cVar3 = this.f5869a;
        if (cVar3.useTintColorForShadow) {
            this.f5884p.setShadowColor(cVar3.tintList.getColorForState(getState(), 0));
        }
        return (Z.c.equals(porterDuffColorFilter, this.f5887s) && Z.c.equals(porterDuffColorFilter2, this.f5888t)) ? false : true;
    }

    private void C() {
        float z8 = getZ();
        this.f5869a.shadowCompatRadius = (int) Math.ceil(0.75f * z8);
        this.f5869a.shadowCompatOffset = (int) Math.ceil(z8 * 0.25f);
        B();
        w();
    }

    public static g createWithElevationOverlay(Context context) {
        return createWithElevationOverlay(context, 0.0f);
    }

    private PorterDuffColorFilter e(Paint paint, boolean z8) {
        int color;
        int iK;
        if (!z8 || (iK = k((color = paint.getColor()))) == color) {
            return null;
        }
        return new PorterDuffColorFilter(iK, PorterDuff.Mode.SRC_IN);
    }

    private void f(RectF rectF, Path path) {
        g(rectF, path);
        if (this.f5869a.scale != 1.0f) {
            this.f5874f.reset();
            Matrix matrix = this.f5874f;
            float f8 = this.f5869a.scale;
            matrix.setScale(f8, f8, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f5874f);
        }
        path.computeBounds(this.f5889u, true);
    }

    private void h() {
        k kVarWithTransformedCornerSizes = getShapeAppearanceModel().withTransformedCornerSizes(new b(-s()));
        this.f5881m = kVarWithTransformedCornerSizes;
        this.f5886r.calculatePath(kVarWithTransformedCornerSizes, this.f5869a.interpolation, r(), this.f5876h);
    }

    private PorterDuffColorFilter i(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z8) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z8) {
            colorForState = k(colorForState);
        }
        return new PorterDuffColorFilter(colorForState, mode);
    }

    private PorterDuffColorFilter j(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z8) {
        return (colorStateList == null || mode == null) ? e(paint, z8) : i(colorStateList, mode, z8);
    }

    private void l(Canvas canvas) {
        if (this.f5872d.cardinality() > 0) {
            Log.w(f5867w, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f5869a.shadowCompatOffset != 0) {
            canvas.drawPath(this.f5875g, this.f5884p.getShadowPaint());
        }
        for (int i8 = 0; i8 < 4; i8++) {
            this.f5870b[i8].draw(this.f5884p, this.f5869a.shadowCompatRadius, canvas);
            this.f5871c[i8].draw(this.f5884p, this.f5869a.shadowCompatRadius, canvas);
        }
        if (this.f5890v) {
            int shadowOffsetX = getShadowOffsetX();
            int shadowOffsetY = getShadowOffsetY();
            canvas.translate(-shadowOffsetX, -shadowOffsetY);
            canvas.drawPath(this.f5875g, f5868x);
            canvas.translate(shadowOffsetX, shadowOffsetY);
        }
    }

    private void m(Canvas canvas) {
        n(canvas, this.f5882n, this.f5875g, this.f5869a.shapeAppearanceModel, q());
    }

    private void n(Canvas canvas, Paint paint, Path path, k kVar, RectF rectF) {
        if (!kVar.isRoundRect(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float cornerSize = kVar.getTopRightCornerSize().getCornerSize(rectF) * this.f5869a.interpolation;
            canvas.drawRoundRect(rectF, cornerSize, cornerSize, paint);
        }
    }

    private void p(Canvas canvas) {
        n(canvas, this.f5883o, this.f5876h, this.f5881m, r());
    }

    private RectF r() {
        this.f5878j.set(q());
        float fS = s();
        this.f5878j.inset(fS, fS);
        return this.f5878j;
    }

    private float s() {
        if (v()) {
            return this.f5883o.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    private boolean t() {
        c cVar = this.f5869a;
        int i8 = cVar.shadowCompatMode;
        return i8 != 1 && cVar.shadowCompatRadius > 0 && (i8 == 2 || requiresCompatShadow());
    }

    private boolean u() {
        Paint.Style style = this.f5869a.paintStyle;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    private boolean v() {
        Paint.Style style = this.f5869a.paintStyle;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f5883o.getStrokeWidth() > 0.0f;
    }

    private void w() {
        super.invalidateSelf();
    }

    private void x(Canvas canvas) {
        if (t()) {
            canvas.save();
            z(canvas);
            if (!this.f5890v) {
                l(canvas);
                canvas.restore();
                return;
            }
            int iWidth = (int) (this.f5889u.width() - getBounds().width());
            int iHeight = (int) (this.f5889u.height() - getBounds().height());
            if (iWidth < 0 || iHeight < 0) {
                throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((int) this.f5889u.width()) + (this.f5869a.shadowCompatRadius * 2) + iWidth, ((int) this.f5889u.height()) + (this.f5869a.shadowCompatRadius * 2) + iHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap);
            float f8 = (getBounds().left - this.f5869a.shadowCompatRadius) - iWidth;
            float f9 = (getBounds().top - this.f5869a.shadowCompatRadius) - iHeight;
            canvas2.translate(-f8, -f9);
            l(canvas2);
            canvas.drawBitmap(bitmapCreateBitmap, f8, f9, (Paint) null);
            bitmapCreateBitmap.recycle();
            canvas.restore();
        }
    }

    private static int y(int i8, int i9) {
        return (i8 * (i9 + (i9 >>> 7))) >>> 8;
    }

    private void z(Canvas canvas) {
        canvas.translate(getShadowOffsetX(), getShadowOffsetY());
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f5882n.setColorFilter(this.f5887s);
        int alpha = this.f5882n.getAlpha();
        this.f5882n.setAlpha(y(alpha, this.f5869a.alpha));
        this.f5883o.setColorFilter(this.f5888t);
        this.f5883o.setStrokeWidth(this.f5869a.strokeWidth);
        int alpha2 = this.f5883o.getAlpha();
        this.f5883o.setAlpha(y(alpha2, this.f5869a.alpha));
        if (this.f5873e) {
            h();
            f(q(), this.f5875g);
            this.f5873e = false;
        }
        x(canvas);
        if (u()) {
            m(canvas);
        }
        if (v()) {
            p(canvas);
        }
        this.f5882n.setAlpha(alpha);
        this.f5883o.setAlpha(alpha2);
    }

    protected final void g(RectF rectF, Path path) {
        l lVar = this.f5886r;
        c cVar = this.f5869a;
        lVar.calculatePath(cVar.shapeAppearanceModel, cVar.interpolation, rectF, this.f5885q, path);
    }

    public float getBottomLeftCornerResolvedSize() {
        return this.f5869a.shapeAppearanceModel.getBottomLeftCornerSize().getCornerSize(q());
    }

    public float getBottomRightCornerResolvedSize() {
        return this.f5869a.shapeAppearanceModel.getBottomRightCornerSize().getCornerSize(q());
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f5869a;
    }

    public float getElevation() {
        return this.f5869a.elevation;
    }

    public ColorStateList getFillColor() {
        return this.f5869a.fillColor;
    }

    public float getInterpolation() {
        return this.f5869a.interpolation;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.f5869a.shadowCompatMode == 2) {
            return;
        }
        if (isRoundRect()) {
            outline.setRoundRect(getBounds(), getTopLeftCornerResolvedSize() * this.f5869a.interpolation);
            return;
        }
        f(q(), this.f5875g);
        if (this.f5875g.isConvex() || Build.VERSION.SDK_INT >= 29) {
            try {
                outline.setConvexPath(this.f5875g);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f5869a.padding;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    public Paint.Style getPaintStyle() {
        return this.f5869a.paintStyle;
    }

    public float getParentAbsoluteElevation() {
        return this.f5869a.parentAbsoluteElevation;
    }

    @Deprecated
    public void getPathForSize(int i8, int i9, Path path) {
        g(new RectF(0.0f, 0.0f, i8, i9), path);
    }

    public float getScale() {
        return this.f5869a.scale;
    }

    public int getShadowCompatRotation() {
        return this.f5869a.shadowCompatRotation;
    }

    public int getShadowCompatibilityMode() {
        return this.f5869a.shadowCompatMode;
    }

    @Deprecated
    public int getShadowElevation() {
        return (int) getElevation();
    }

    public int getShadowOffsetX() {
        c cVar = this.f5869a;
        return (int) (cVar.shadowCompatOffset * Math.sin(Math.toRadians(cVar.shadowCompatRotation)));
    }

    public int getShadowOffsetY() {
        c cVar = this.f5869a;
        return (int) (cVar.shadowCompatOffset * Math.cos(Math.toRadians(cVar.shadowCompatRotation)));
    }

    public int getShadowRadius() {
        return this.f5869a.shadowCompatRadius;
    }

    public int getShadowVerticalOffset() {
        return this.f5869a.shadowCompatOffset;
    }

    @Override // a3.o
    public k getShapeAppearanceModel() {
        return this.f5869a.shapeAppearanceModel;
    }

    @Deprecated
    public n getShapedViewModel() {
        k shapeAppearanceModel = getShapeAppearanceModel();
        if (shapeAppearanceModel instanceof n) {
            return (n) shapeAppearanceModel;
        }
        return null;
    }

    public ColorStateList getStrokeColor() {
        return this.f5869a.strokeColor;
    }

    public ColorStateList getStrokeTintList() {
        return this.f5869a.strokeTintList;
    }

    public float getStrokeWidth() {
        return this.f5869a.strokeWidth;
    }

    public ColorStateList getTintList() {
        return this.f5869a.tintList;
    }

    public float getTopLeftCornerResolvedSize() {
        return this.f5869a.shapeAppearanceModel.getTopLeftCornerSize().getCornerSize(q());
    }

    public float getTopRightCornerResolvedSize() {
        return this.f5869a.shapeAppearanceModel.getTopRightCornerSize().getCornerSize(q());
    }

    public float getTranslationZ() {
        return this.f5869a.translationZ;
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.f5879k.set(getBounds());
        f(q(), this.f5875g);
        this.f5880l.setPath(this.f5875g, this.f5879k);
        this.f5879k.op(this.f5880l, Region.Op.DIFFERENCE);
        return this.f5879k;
    }

    public float getZ() {
        return getElevation() + getTranslationZ();
    }

    public void initializeElevationOverlay(Context context) {
        this.f5869a.elevationOverlayProvider = new T2.a(context);
        C();
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f5873e = true;
        super.invalidateSelf();
    }

    public boolean isElevationOverlayEnabled() {
        T2.a aVar = this.f5869a.elevationOverlayProvider;
        return aVar != null && aVar.isThemeElevationOverlayEnabled();
    }

    public boolean isElevationOverlayInitialized() {
        return this.f5869a.elevationOverlayProvider != null;
    }

    public boolean isPointInTransparentRegion(int i8, int i9) {
        return getTransparentRegion().contains(i8, i9);
    }

    public boolean isRoundRect() {
        return this.f5869a.shapeAppearanceModel.isRoundRect(q());
    }

    @Deprecated
    public boolean isShadowEnabled() {
        int i8 = this.f5869a.shadowCompatMode;
        return i8 == 0 || i8 == 2;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.f5869a.tintList) != null && colorStateList.isStateful()) || (((colorStateList2 = this.f5869a.strokeTintList) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.f5869a.strokeColor) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.f5869a.fillColor) != null && colorStateList4.isStateful())));
    }

    protected int k(int i8) {
        float z8 = getZ() + getParentAbsoluteElevation();
        T2.a aVar = this.f5869a.elevationOverlayProvider;
        return aVar != null ? aVar.compositeOverlayIfNeeded(i8, z8) : i8;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f5869a = new c(this.f5869a);
        return this;
    }

    protected void o(Canvas canvas, Paint paint, Path path, RectF rectF) {
        n(canvas, paint, path, this.f5869a.shapeAppearanceModel, rectF);
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f5873e = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean z8 = A(iArr) || B();
        if (z8) {
            invalidateSelf();
        }
        return z8;
    }

    protected RectF q() {
        this.f5877i.set(getBounds());
        return this.f5877i;
    }

    public boolean requiresCompatShadow() {
        return (isRoundRect() || this.f5875g.isConvex() || Build.VERSION.SDK_INT >= 29) ? false : true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i8) {
        c cVar = this.f5869a;
        if (cVar.alpha != i8) {
            cVar.alpha = i8;
            w();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f5869a.colorFilter = colorFilter;
        w();
    }

    public void setCornerSize(float f8) {
        setShapeAppearanceModel(this.f5869a.shapeAppearanceModel.withCornerSize(f8));
    }

    public void setEdgeIntersectionCheckEnable(boolean z8) {
        this.f5886r.k(z8);
    }

    public void setElevation(float f8) {
        c cVar = this.f5869a;
        if (cVar.elevation != f8) {
            cVar.elevation = f8;
            C();
        }
    }

    public void setFillColor(ColorStateList colorStateList) {
        c cVar = this.f5869a;
        if (cVar.fillColor != colorStateList) {
            cVar.fillColor = colorStateList;
            onStateChange(getState());
        }
    }

    public void setInterpolation(float f8) {
        c cVar = this.f5869a;
        if (cVar.interpolation != f8) {
            cVar.interpolation = f8;
            this.f5873e = true;
            invalidateSelf();
        }
    }

    public void setPadding(int i8, int i9, int i10, int i11) {
        c cVar = this.f5869a;
        if (cVar.padding == null) {
            cVar.padding = new Rect();
        }
        this.f5869a.padding.set(i8, i9, i10, i11);
        invalidateSelf();
    }

    public void setPaintStyle(Paint.Style style) {
        this.f5869a.paintStyle = style;
        w();
    }

    public void setParentAbsoluteElevation(float f8) {
        c cVar = this.f5869a;
        if (cVar.parentAbsoluteElevation != f8) {
            cVar.parentAbsoluteElevation = f8;
            C();
        }
    }

    public void setScale(float f8) {
        c cVar = this.f5869a;
        if (cVar.scale != f8) {
            cVar.scale = f8;
            invalidateSelf();
        }
    }

    public void setShadowBitmapDrawingEnable(boolean z8) {
        this.f5890v = z8;
    }

    public void setShadowColor(int i8) {
        this.f5884p.setShadowColor(i8);
        this.f5869a.useTintColorForShadow = false;
        w();
    }

    public void setShadowCompatRotation(int i8) {
        c cVar = this.f5869a;
        if (cVar.shadowCompatRotation != i8) {
            cVar.shadowCompatRotation = i8;
            w();
        }
    }

    public void setShadowCompatibilityMode(int i8) {
        c cVar = this.f5869a;
        if (cVar.shadowCompatMode != i8) {
            cVar.shadowCompatMode = i8;
            w();
        }
    }

    @Deprecated
    public void setShadowElevation(int i8) {
        setElevation(i8);
    }

    @Deprecated
    public void setShadowEnabled(boolean z8) {
        setShadowCompatibilityMode(!z8 ? 1 : 0);
    }

    @Deprecated
    public void setShadowRadius(int i8) {
        this.f5869a.shadowCompatRadius = i8;
    }

    public void setShadowVerticalOffset(int i8) {
        c cVar = this.f5869a;
        if (cVar.shadowCompatOffset != i8) {
            cVar.shadowCompatOffset = i8;
            w();
        }
    }

    @Override // a3.o
    public void setShapeAppearanceModel(k kVar) {
        this.f5869a.shapeAppearanceModel = kVar;
        invalidateSelf();
    }

    @Deprecated
    public void setShapedViewModel(n nVar) {
        setShapeAppearanceModel(nVar);
    }

    public void setStroke(float f8, int i8) {
        setStrokeWidth(f8);
        setStrokeColor(ColorStateList.valueOf(i8));
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        c cVar = this.f5869a;
        if (cVar.strokeColor != colorStateList) {
            cVar.strokeColor = colorStateList;
            onStateChange(getState());
        }
    }

    public void setStrokeTint(ColorStateList colorStateList) {
        this.f5869a.strokeTintList = colorStateList;
        B();
        w();
    }

    public void setStrokeWidth(float f8) {
        this.f5869a.strokeWidth = f8;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTint(int i8) {
        setTintList(ColorStateList.valueOf(i8));
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintList(ColorStateList colorStateList) {
        this.f5869a.tintList = colorStateList;
        B();
        w();
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f5869a;
        if (cVar.tintMode != mode) {
            cVar.tintMode = mode;
            B();
            w();
        }
    }

    public void setTranslationZ(float f8) {
        c cVar = this.f5869a;
        if (cVar.translationZ != f8) {
            cVar.translationZ = f8;
            C();
        }
    }

    public void setUseTintColorForShadow(boolean z8) {
        c cVar = this.f5869a;
        if (cVar.useTintColorForShadow != z8) {
            cVar.useTintColorForShadow = z8;
            invalidateSelf();
        }
    }

    public void setZ(float f8) {
        setTranslationZ(f8 - getElevation());
    }

    public g() {
        this(new k());
    }

    public static g createWithElevationOverlay(Context context, float f8) {
        int color = Q2.a.getColor(context, J2.b.colorSurface, g.class.getSimpleName());
        g gVar = new g();
        gVar.initializeElevationOverlay(context);
        gVar.setFillColor(ColorStateList.valueOf(color));
        gVar.setElevation(f8);
        return gVar;
    }

    public void setCornerSize(a3.c cVar) {
        setShapeAppearanceModel(this.f5869a.shapeAppearanceModel.withCornerSize(cVar));
    }

    public g(Context context, AttributeSet attributeSet, int i8, int i9) {
        this(k.builder(context, attributeSet, i8, i9).build());
    }

    public void setStroke(float f8, ColorStateList colorStateList) {
        setStrokeWidth(f8);
        setStrokeColor(colorStateList);
    }

    @Deprecated
    public g(n nVar) {
        this((k) nVar);
    }

    public void setStrokeTint(int i8) {
        setStrokeTint(ColorStateList.valueOf(i8));
    }

    public g(k kVar) {
        this(new c(kVar, null));
    }

    private g(c cVar) {
        this.f5870b = new m.i[4];
        this.f5871c = new m.i[4];
        this.f5872d = new BitSet(8);
        this.f5874f = new Matrix();
        this.f5875g = new Path();
        this.f5876h = new Path();
        this.f5877i = new RectF();
        this.f5878j = new RectF();
        this.f5879k = new Region();
        this.f5880l = new Region();
        Paint paint = new Paint(1);
        this.f5882n = paint;
        Paint paint2 = new Paint(1);
        this.f5883o = paint2;
        this.f5884p = new Z2.a();
        this.f5886r = Looper.getMainLooper().getThread() == Thread.currentThread() ? l.getInstance() : new l();
        this.f5889u = new RectF();
        this.f5890v = true;
        this.f5869a = cVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        Paint paint3 = f5868x;
        paint3.setColor(-1);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        B();
        A(getState());
        this.f5885q = new a();
    }

    static final class c extends Drawable.ConstantState {
        public int alpha;
        public ColorFilter colorFilter;
        public float elevation;
        public T2.a elevationOverlayProvider;
        public ColorStateList fillColor;
        public float interpolation;
        public Rect padding;
        public Paint.Style paintStyle;
        public float parentAbsoluteElevation;
        public float scale;
        public int shadowCompatMode;
        public int shadowCompatOffset;
        public int shadowCompatRadius;
        public int shadowCompatRotation;
        public k shapeAppearanceModel;
        public ColorStateList strokeColor;
        public ColorStateList strokeTintList;
        public float strokeWidth;
        public ColorStateList tintList;
        public PorterDuff.Mode tintMode;
        public float translationZ;
        public boolean useTintColorForShadow;

        public c(k kVar, T2.a aVar) {
            this.fillColor = null;
            this.strokeColor = null;
            this.strokeTintList = null;
            this.tintList = null;
            this.tintMode = PorterDuff.Mode.SRC_IN;
            this.padding = null;
            this.scale = 1.0f;
            this.interpolation = 1.0f;
            this.alpha = 255;
            this.parentAbsoluteElevation = 0.0f;
            this.elevation = 0.0f;
            this.translationZ = 0.0f;
            this.shadowCompatMode = 0;
            this.shadowCompatRadius = 0;
            this.shadowCompatOffset = 0;
            this.shadowCompatRotation = 0;
            this.useTintColorForShadow = false;
            this.paintStyle = Paint.Style.FILL_AND_STROKE;
            this.shapeAppearanceModel = kVar;
            this.elevationOverlayProvider = aVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            g gVar = new g(this, null);
            gVar.f5873e = true;
            return gVar;
        }

        public c(c cVar) {
            this.fillColor = null;
            this.strokeColor = null;
            this.strokeTintList = null;
            this.tintList = null;
            this.tintMode = PorterDuff.Mode.SRC_IN;
            this.padding = null;
            this.scale = 1.0f;
            this.interpolation = 1.0f;
            this.alpha = 255;
            this.parentAbsoluteElevation = 0.0f;
            this.elevation = 0.0f;
            this.translationZ = 0.0f;
            this.shadowCompatMode = 0;
            this.shadowCompatRadius = 0;
            this.shadowCompatOffset = 0;
            this.shadowCompatRotation = 0;
            this.useTintColorForShadow = false;
            this.paintStyle = Paint.Style.FILL_AND_STROKE;
            this.shapeAppearanceModel = cVar.shapeAppearanceModel;
            this.elevationOverlayProvider = cVar.elevationOverlayProvider;
            this.strokeWidth = cVar.strokeWidth;
            this.colorFilter = cVar.colorFilter;
            this.fillColor = cVar.fillColor;
            this.strokeColor = cVar.strokeColor;
            this.tintMode = cVar.tintMode;
            this.tintList = cVar.tintList;
            this.alpha = cVar.alpha;
            this.scale = cVar.scale;
            this.shadowCompatOffset = cVar.shadowCompatOffset;
            this.shadowCompatMode = cVar.shadowCompatMode;
            this.useTintColorForShadow = cVar.useTintColorForShadow;
            this.interpolation = cVar.interpolation;
            this.parentAbsoluteElevation = cVar.parentAbsoluteElevation;
            this.elevation = cVar.elevation;
            this.translationZ = cVar.translationZ;
            this.shadowCompatRadius = cVar.shadowCompatRadius;
            this.shadowCompatRotation = cVar.shadowCompatRotation;
            this.strokeTintList = cVar.strokeTintList;
            this.paintStyle = cVar.paintStyle;
            if (cVar.padding != null) {
                this.padding = new Rect(cVar.padding);
            }
        }
    }
}
