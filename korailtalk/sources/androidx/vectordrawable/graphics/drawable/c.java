package androidx.vectordrawable.graphics.drawable;

import Q7.X;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.util.AttributeSet;
import androidx.core.content.res.k;
import androidx.core.graphics.c;
import androidx.core.view.AbstractC0985p0;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class c extends androidx.vectordrawable.graphics.drawable.b {

    /* renamed from: k, reason: collision with root package name */
    static final PorterDuff.Mode f10781k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    private h f10782b;

    /* renamed from: c, reason: collision with root package name */
    private PorterDuffColorFilter f10783c;

    /* renamed from: d, reason: collision with root package name */
    private ColorFilter f10784d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f10785e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f10786f;

    /* renamed from: g, reason: collision with root package name */
    private Drawable.ConstantState f10787g;

    /* renamed from: h, reason: collision with root package name */
    private final float[] f10788h;

    /* renamed from: i, reason: collision with root package name */
    private final Matrix f10789i;

    /* renamed from: j, reason: collision with root package name */
    private final Rect f10790j;

    private static class b extends f {
        b() {
        }

        private void a(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f10817b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f10816a = androidx.core.graphics.c.createNodesFromPathData(string2);
            }
            this.f10818c = k.getNamedInt(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        public void inflate(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (k.hasAttribute(xmlPullParser, "pathData")) {
                TypedArray typedArrayObtainAttributes = k.obtainAttributes(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f10777d);
                a(typedArrayObtainAttributes, xmlPullParser);
                typedArrayObtainAttributes.recycle();
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.c.f
        public boolean isClipPath() {
            return true;
        }

        b(b bVar) {
            super(bVar);
        }
    }

    private static abstract class e {
        private e() {
        }

        public boolean isStateful() {
            return false;
        }

        public boolean onStateChanged(int[] iArr) {
            return false;
        }
    }

    private static class h extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        int f10837a;

        /* renamed from: b, reason: collision with root package name */
        g f10838b;

        /* renamed from: c, reason: collision with root package name */
        ColorStateList f10839c;

        /* renamed from: d, reason: collision with root package name */
        PorterDuff.Mode f10840d;

        /* renamed from: e, reason: collision with root package name */
        boolean f10841e;

        /* renamed from: f, reason: collision with root package name */
        Bitmap f10842f;

        /* renamed from: g, reason: collision with root package name */
        ColorStateList f10843g;

        /* renamed from: h, reason: collision with root package name */
        PorterDuff.Mode f10844h;

        /* renamed from: i, reason: collision with root package name */
        int f10845i;

        /* renamed from: j, reason: collision with root package name */
        boolean f10846j;

        /* renamed from: k, reason: collision with root package name */
        boolean f10847k;

        /* renamed from: l, reason: collision with root package name */
        Paint f10848l;

        public h(h hVar) {
            this.f10839c = null;
            this.f10840d = c.f10781k;
            if (hVar != null) {
                this.f10837a = hVar.f10837a;
                g gVar = new g(hVar.f10838b);
                this.f10838b = gVar;
                if (hVar.f10838b.f10825e != null) {
                    gVar.f10825e = new Paint(hVar.f10838b.f10825e);
                }
                if (hVar.f10838b.f10824d != null) {
                    this.f10838b.f10824d = new Paint(hVar.f10838b.f10824d);
                }
                this.f10839c = hVar.f10839c;
                this.f10840d = hVar.f10840d;
                this.f10841e = hVar.f10841e;
            }
        }

        public boolean canReuseBitmap(int i8, int i9) {
            return i8 == this.f10842f.getWidth() && i9 == this.f10842f.getHeight();
        }

        public boolean canReuseCache() {
            return !this.f10847k && this.f10843g == this.f10839c && this.f10844h == this.f10840d && this.f10846j == this.f10841e && this.f10845i == this.f10838b.getRootAlpha();
        }

        public void createCachedBitmapIfNeeded(int i8, int i9) {
            if (this.f10842f == null || !canReuseBitmap(i8, i9)) {
                this.f10842f = Bitmap.createBitmap(i8, i9, Bitmap.Config.ARGB_8888);
                this.f10847k = true;
            }
        }

        public void drawCachedBitmapWithRootAlpha(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f10842f, (Rect) null, rect, getPaint(colorFilter));
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f10837a;
        }

        public Paint getPaint(ColorFilter colorFilter) {
            if (!hasTranslucentRoot() && colorFilter == null) {
                return null;
            }
            if (this.f10848l == null) {
                Paint paint = new Paint();
                this.f10848l = paint;
                paint.setFilterBitmap(true);
            }
            this.f10848l.setAlpha(this.f10838b.getRootAlpha());
            this.f10848l.setColorFilter(colorFilter);
            return this.f10848l;
        }

        public boolean hasTranslucentRoot() {
            return this.f10838b.getRootAlpha() < 255;
        }

        public boolean isStateful() {
            return this.f10838b.isStateful();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new c(this);
        }

        public boolean onStateChanged(int[] iArr) {
            boolean zOnStateChanged = this.f10838b.onStateChanged(iArr);
            this.f10847k |= zOnStateChanged;
            return zOnStateChanged;
        }

        public void updateCacheStates() {
            this.f10843g = this.f10839c;
            this.f10844h = this.f10840d;
            this.f10845i = this.f10838b.getRootAlpha();
            this.f10846j = this.f10841e;
            this.f10847k = false;
        }

        public void updateCachedBitmap(int i8, int i9) {
            this.f10842f.eraseColor(0);
            this.f10838b.draw(new Canvas(this.f10842f), i8, i9, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new c(this);
        }

        public h() {
            this.f10839c = null;
            this.f10840d = c.f10781k;
            this.f10838b = new g();
        }
    }

    c() {
        this.f10786f = true;
        this.f10788h = new float[9];
        this.f10789i = new Matrix();
        this.f10790j = new Rect();
        this.f10782b = new h();
    }

    static int a(int i8, float f8) {
        return (i8 & AbstractC0985p0.MEASURED_SIZE_MASK) | (((int) (Color.alpha(i8) * f8)) << 24);
    }

    private void b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        h hVar = this.f10782b;
        g gVar = hVar.f10838b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.f10828h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z8 = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                d dVar = (d) arrayDeque.peek();
                if ("path".equals(name)) {
                    C0171c c0171c = new C0171c();
                    c0171c.inflate(resources, attributeSet, theme, xmlPullParser);
                    dVar.f10804b.add(c0171c);
                    if (c0171c.getPathName() != null) {
                        gVar.f10836p.put(c0171c.getPathName(), c0171c);
                    }
                    hVar.f10837a = c0171c.f10819d | hVar.f10837a;
                    z8 = false;
                } else if ("clip-path".equals(name)) {
                    b bVar = new b();
                    bVar.inflate(resources, attributeSet, theme, xmlPullParser);
                    dVar.f10804b.add(bVar);
                    if (bVar.getPathName() != null) {
                        gVar.f10836p.put(bVar.getPathName(), bVar);
                    }
                    hVar.f10837a = bVar.f10819d | hVar.f10837a;
                } else if ("group".equals(name)) {
                    d dVar2 = new d();
                    dVar2.inflate(resources, attributeSet, theme, xmlPullParser);
                    dVar.f10804b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        gVar.f10836p.put(dVar2.getGroupName(), dVar2);
                    }
                    hVar.f10837a = dVar2.f10813k | hVar.f10837a;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z8) {
            throw new XmlPullParserException("no path defined");
        }
    }

    private boolean c() {
        return isAutoMirrored() && androidx.core.graphics.drawable.a.getLayoutDirection(this) == 1;
    }

    public static c create(Resources resources, int i8, Resources.Theme theme) {
        c cVar = new c();
        cVar.f10780a = androidx.core.content.res.h.getDrawable(resources, i8, theme);
        cVar.f10787g = new i(cVar.f10780a.getConstantState());
        return cVar;
    }

    public static c createFromXmlInner(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        c cVar = new c();
        cVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return cVar;
    }

    private static PorterDuff.Mode d(int i8, PorterDuff.Mode mode) {
        if (i8 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i8 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i8 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i8) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    private void e(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException {
        h hVar = this.f10782b;
        g gVar = hVar.f10838b;
        hVar.f10840d = d(k.getNamedInt(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList namedColorStateList = k.getNamedColorStateList(typedArray, xmlPullParser, theme, "tint", 1);
        if (namedColorStateList != null) {
            hVar.f10839c = namedColorStateList;
        }
        hVar.f10841e = k.getNamedBoolean(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f10841e);
        gVar.f10831k = k.getNamedFloat(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f10831k);
        float namedFloat = k.getNamedFloat(typedArray, xmlPullParser, "viewportHeight", 8, gVar.f10832l);
        gVar.f10832l = namedFloat;
        if (gVar.f10831k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (namedFloat <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        gVar.f10829i = typedArray.getDimension(3, gVar.f10829i);
        float dimension = typedArray.getDimension(2, gVar.f10830j);
        gVar.f10830j = dimension;
        if (gVar.f10829i <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
        }
        gVar.setAlpha(k.getNamedFloat(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
        String string = typedArray.getString(0);
        if (string != null) {
            gVar.f10834n = string;
            gVar.f10836p.put(string, gVar);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f10780a;
        if (drawable == null) {
            return false;
        }
        androidx.core.graphics.drawable.a.canApplyTheme(drawable);
        return false;
    }

    @Override // androidx.vectordrawable.graphics.drawable.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f10780a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f10790j);
        if (this.f10790j.width() <= 0 || this.f10790j.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f10784d;
        if (colorFilter == null) {
            colorFilter = this.f10783c;
        }
        canvas.getMatrix(this.f10789i);
        this.f10789i.getValues(this.f10788h);
        float fAbs = Math.abs(this.f10788h[0]);
        float fAbs2 = Math.abs(this.f10788h[4]);
        float fAbs3 = Math.abs(this.f10788h[1]);
        float fAbs4 = Math.abs(this.f10788h[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iMin = Math.min(2048, (int) (this.f10790j.width() * fAbs));
        int iMin2 = Math.min(2048, (int) (this.f10790j.height() * fAbs2));
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        Rect rect = this.f10790j;
        canvas.translate(rect.left, rect.top);
        if (c()) {
            canvas.translate(this.f10790j.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.f10790j.offsetTo(0, 0);
        this.f10782b.createCachedBitmapIfNeeded(iMin, iMin2);
        if (!this.f10786f) {
            this.f10782b.updateCachedBitmap(iMin, iMin2);
        } else if (!this.f10782b.canReuseCache()) {
            this.f10782b.updateCachedBitmap(iMin, iMin2);
            this.f10782b.updateCacheStates();
        }
        this.f10782b.drawCachedBitmapWithRootAlpha(canvas, colorFilter, this.f10790j);
        canvas.restoreToCount(iSave);
    }

    PorterDuffColorFilter f(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f10780a;
        return drawable != null ? androidx.core.graphics.drawable.a.getAlpha(drawable) : this.f10782b.f10838b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f10780a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f10782b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f10780a;
        return drawable != null ? androidx.core.graphics.drawable.a.getColorFilter(drawable) : this.f10784d;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f10780a != null) {
            return new i(this.f10780a.getConstantState());
        }
        this.f10782b.f10837a = getChangingConfigurations();
        return this.f10782b;
    }

    @Override // androidx.vectordrawable.graphics.drawable.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f10780a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f10782b.f10838b.f10830j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f10780a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f10782b.f10838b.f10829i;
    }

    @Override // androidx.vectordrawable.graphics.drawable.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.vectordrawable.graphics.drawable.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f10780a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // androidx.vectordrawable.graphics.drawable.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public float getPixelSize() {
        g gVar;
        h hVar = this.f10782b;
        if (hVar == null || (gVar = hVar.f10838b) == null) {
            return 1.0f;
        }
        float f8 = gVar.f10829i;
        if (f8 == 0.0f) {
            return 1.0f;
        }
        float f9 = gVar.f10830j;
        if (f9 == 0.0f) {
            return 1.0f;
        }
        float f10 = gVar.f10832l;
        if (f10 == 0.0f) {
            return 1.0f;
        }
        float f11 = gVar.f10831k;
        if (f11 == 0.0f) {
            return 1.0f;
        }
        return Math.min(f11 / f8, f10 / f9);
    }

    @Override // androidx.vectordrawable.graphics.drawable.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f10780a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f10780a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f10780a;
        return drawable != null ? androidx.core.graphics.drawable.a.isAutoMirrored(drawable) : this.f10782b.f10841e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        h hVar;
        ColorStateList colorStateList;
        Drawable drawable = this.f10780a;
        return drawable != null ? drawable.isStateful() : super.isStateful() || ((hVar = this.f10782b) != null && (hVar.isStateful() || ((colorStateList = this.f10782b.f10839c) != null && colorStateList.isStateful())));
    }

    @Override // androidx.vectordrawable.graphics.drawable.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f10780a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f10785e && super.mutate() == this) {
            this.f10782b = new h(this.f10782b);
            this.f10785e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f10780a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean z8;
        PorterDuff.Mode mode;
        Drawable drawable = this.f10780a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        h hVar = this.f10782b;
        ColorStateList colorStateList = hVar.f10839c;
        if (colorStateList == null || (mode = hVar.f10840d) == null) {
            z8 = false;
        } else {
            this.f10783c = f(this.f10783c, colorStateList, mode);
            invalidateSelf();
            z8 = true;
        }
        if (!hVar.isStateful() || !hVar.onStateChanged(iArr)) {
            return z8;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j8) {
        Drawable drawable = this.f10780a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j8);
        } else {
            super.scheduleSelf(runnable, j8);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i8) {
        Drawable drawable = this.f10780a;
        if (drawable != null) {
            drawable.setAlpha(i8);
        } else if (this.f10782b.f10838b.getRootAlpha() != i8) {
            this.f10782b.f10838b.setRootAlpha(i8);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z8) {
        Drawable drawable = this.f10780a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.setAutoMirrored(drawable, z8);
        } else {
            this.f10782b.f10841e = z8;
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i8) {
        super.setChangingConfigurations(i8);
    }

    @Override // androidx.vectordrawable.graphics.drawable.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i8, PorterDuff.Mode mode) {
        super.setColorFilter(i8, mode);
    }

    @Override // androidx.vectordrawable.graphics.drawable.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z8) {
        super.setFilterBitmap(z8);
    }

    @Override // androidx.vectordrawable.graphics.drawable.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f8, float f9) {
        super.setHotspot(f8, f9);
    }

    @Override // androidx.vectordrawable.graphics.drawable.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i8, int i9, int i10, int i11) {
        super.setHotspotBounds(i8, i9, i10, i11);
    }

    @Override // androidx.vectordrawable.graphics.drawable.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTint(int i8) {
        Drawable drawable = this.f10780a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.setTint(drawable, i8);
        } else {
            setTintList(ColorStateList.valueOf(i8));
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f10780a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.setTintList(drawable, colorStateList);
            return;
        }
        h hVar = this.f10782b;
        if (hVar.f10839c != colorStateList) {
            hVar.f10839c = colorStateList;
            this.f10783c = f(this.f10783c, colorStateList, hVar.f10840d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f10780a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.setTintMode(drawable, mode);
            return;
        }
        h hVar = this.f10782b;
        if (hVar.f10840d != mode) {
            hVar.f10840d = mode;
            this.f10783c = f(this.f10783c, hVar.f10839c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z8, boolean z9) {
        Drawable drawable = this.f10780a;
        return drawable != null ? drawable.setVisible(z8, z9) : super.setVisible(z8, z9);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f10780a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    private static class i extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        private final Drawable.ConstantState f10849a;

        public i(Drawable.ConstantState constantState) {
            this.f10849a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f10849a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f10849a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            c cVar = new c();
            cVar.f10780a = (VectorDrawable) this.f10849a.newDrawable();
            return cVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            c cVar = new c();
            cVar.f10780a = (VectorDrawable) this.f10849a.newDrawable(resources);
            return cVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            c cVar = new c();
            cVar.f10780a = (VectorDrawable) this.f10849a.newDrawable(resources, theme);
            return cVar;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f10780a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f10784d = colorFilter;
            invalidateSelf();
        }
    }

    private static abstract class f extends e {

        /* renamed from: a, reason: collision with root package name */
        protected c.b[] f10816a;

        /* renamed from: b, reason: collision with root package name */
        String f10817b;

        /* renamed from: c, reason: collision with root package name */
        int f10818c;

        /* renamed from: d, reason: collision with root package name */
        int f10819d;

        public f() {
            super();
            this.f10816a = null;
            this.f10818c = 0;
        }

        public void applyTheme(Resources.Theme theme) {
        }

        public boolean canApplyTheme() {
            return false;
        }

        public c.b[] getPathData() {
            return this.f10816a;
        }

        public String getPathName() {
            return this.f10817b;
        }

        public boolean isClipPath() {
            return false;
        }

        public String nodesToString(c.b[] bVarArr) {
            String str = X.SPACE;
            for (int i8 = 0; i8 < bVarArr.length; i8++) {
                str = str + bVarArr[i8].f8983a + ":";
                for (float f8 : bVarArr[i8].f8984b) {
                    str = str + f8 + ",";
                }
            }
            return str;
        }

        public void printVPath(int i8) {
            String str = "";
            for (int i9 = 0; i9 < i8; i9++) {
                str = str + "    ";
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("current path is :");
            sb.append(this.f10817b);
            sb.append(" pathData is ");
            sb.append(nodesToString(this.f10816a));
        }

        public void setPathData(c.b[] bVarArr) {
            if (androidx.core.graphics.c.canMorph(this.f10816a, bVarArr)) {
                androidx.core.graphics.c.updateNodes(this.f10816a, bVarArr);
            } else {
                this.f10816a = androidx.core.graphics.c.deepCopyNodes(bVarArr);
            }
        }

        public void toPath(Path path) {
            path.reset();
            c.b[] bVarArr = this.f10816a;
            if (bVarArr != null) {
                c.b.nodesToPath(bVarArr, path);
            }
        }

        public f(f fVar) {
            super();
            this.f10816a = null;
            this.f10818c = 0;
            this.f10817b = fVar.f10817b;
            this.f10819d = fVar.f10819d;
            this.f10816a = androidx.core.graphics.c.deepCopyNodes(fVar.f10816a);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f10780a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.inflate(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        h hVar = this.f10782b;
        hVar.f10838b = new g();
        TypedArray typedArrayObtainAttributes = k.obtainAttributes(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f10774a);
        e(typedArrayObtainAttributes, xmlPullParser, theme);
        typedArrayObtainAttributes.recycle();
        hVar.f10837a = getChangingConfigurations();
        hVar.f10847k = true;
        b(resources, xmlPullParser, attributeSet, theme);
        this.f10783c = f(this.f10783c, hVar.f10839c, hVar.f10840d);
    }

    c(h hVar) {
        this.f10786f = true;
        this.f10788h = new float[9];
        this.f10789i = new Matrix();
        this.f10790j = new Rect();
        this.f10782b = hVar;
        this.f10783c = f(this.f10783c, hVar.f10839c, hVar.f10840d);
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.c$c, reason: collision with other inner class name */
    private static class C0171c extends f {

        /* renamed from: e, reason: collision with root package name */
        private int[] f10791e;

        /* renamed from: f, reason: collision with root package name */
        androidx.core.content.res.d f10792f;

        /* renamed from: g, reason: collision with root package name */
        float f10793g;

        /* renamed from: h, reason: collision with root package name */
        androidx.core.content.res.d f10794h;

        /* renamed from: i, reason: collision with root package name */
        float f10795i;

        /* renamed from: j, reason: collision with root package name */
        float f10796j;

        /* renamed from: k, reason: collision with root package name */
        float f10797k;

        /* renamed from: l, reason: collision with root package name */
        float f10798l;

        /* renamed from: m, reason: collision with root package name */
        float f10799m;

        /* renamed from: n, reason: collision with root package name */
        Paint.Cap f10800n;

        /* renamed from: o, reason: collision with root package name */
        Paint.Join f10801o;

        /* renamed from: p, reason: collision with root package name */
        float f10802p;

        C0171c() {
            this.f10793g = 0.0f;
            this.f10795i = 1.0f;
            this.f10796j = 1.0f;
            this.f10797k = 0.0f;
            this.f10798l = 1.0f;
            this.f10799m = 0.0f;
            this.f10800n = Paint.Cap.BUTT;
            this.f10801o = Paint.Join.MITER;
            this.f10802p = 4.0f;
        }

        private Paint.Cap a(int i8, Paint.Cap cap) {
            return i8 != 0 ? i8 != 1 ? i8 != 2 ? cap : Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }

        private Paint.Join b(int i8, Paint.Join join) {
            return i8 != 0 ? i8 != 1 ? i8 != 2 ? join : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER;
        }

        private void c(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f10791e = null;
            if (k.hasAttribute(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f10817b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f10816a = androidx.core.graphics.c.createNodesFromPathData(string2);
                }
                this.f10794h = k.getNamedComplexColor(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.f10796j = k.getNamedFloat(typedArray, xmlPullParser, "fillAlpha", 12, this.f10796j);
                this.f10800n = a(k.getNamedInt(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f10800n);
                this.f10801o = b(k.getNamedInt(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f10801o);
                this.f10802p = k.getNamedFloat(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f10802p);
                this.f10792f = k.getNamedComplexColor(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.f10795i = k.getNamedFloat(typedArray, xmlPullParser, "strokeAlpha", 11, this.f10795i);
                this.f10793g = k.getNamedFloat(typedArray, xmlPullParser, "strokeWidth", 4, this.f10793g);
                this.f10798l = k.getNamedFloat(typedArray, xmlPullParser, "trimPathEnd", 6, this.f10798l);
                this.f10799m = k.getNamedFloat(typedArray, xmlPullParser, "trimPathOffset", 7, this.f10799m);
                this.f10797k = k.getNamedFloat(typedArray, xmlPullParser, "trimPathStart", 5, this.f10797k);
                this.f10818c = k.getNamedInt(typedArray, xmlPullParser, "fillType", 13, this.f10818c);
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.c.f
        public void applyTheme(Resources.Theme theme) {
        }

        @Override // androidx.vectordrawable.graphics.drawable.c.f
        public boolean canApplyTheme() {
            return this.f10791e != null;
        }

        float getFillAlpha() {
            return this.f10796j;
        }

        int getFillColor() {
            return this.f10794h.getColor();
        }

        float getStrokeAlpha() {
            return this.f10795i;
        }

        int getStrokeColor() {
            return this.f10792f.getColor();
        }

        float getStrokeWidth() {
            return this.f10793g;
        }

        float getTrimPathEnd() {
            return this.f10798l;
        }

        float getTrimPathOffset() {
            return this.f10799m;
        }

        float getTrimPathStart() {
            return this.f10797k;
        }

        public void inflate(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayObtainAttributes = k.obtainAttributes(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f10776c);
            c(typedArrayObtainAttributes, xmlPullParser, theme);
            typedArrayObtainAttributes.recycle();
        }

        @Override // androidx.vectordrawable.graphics.drawable.c.e
        public boolean isStateful() {
            return this.f10794h.isStateful() || this.f10792f.isStateful();
        }

        @Override // androidx.vectordrawable.graphics.drawable.c.e
        public boolean onStateChanged(int[] iArr) {
            return this.f10792f.onStateChanged(iArr) | this.f10794h.onStateChanged(iArr);
        }

        void setFillAlpha(float f8) {
            this.f10796j = f8;
        }

        void setFillColor(int i8) {
            this.f10794h.setColor(i8);
        }

        void setStrokeAlpha(float f8) {
            this.f10795i = f8;
        }

        void setStrokeColor(int i8) {
            this.f10792f.setColor(i8);
        }

        void setStrokeWidth(float f8) {
            this.f10793g = f8;
        }

        void setTrimPathEnd(float f8) {
            this.f10798l = f8;
        }

        void setTrimPathOffset(float f8) {
            this.f10799m = f8;
        }

        void setTrimPathStart(float f8) {
            this.f10797k = f8;
        }

        C0171c(C0171c c0171c) {
            super(c0171c);
            this.f10793g = 0.0f;
            this.f10795i = 1.0f;
            this.f10796j = 1.0f;
            this.f10797k = 0.0f;
            this.f10798l = 1.0f;
            this.f10799m = 0.0f;
            this.f10800n = Paint.Cap.BUTT;
            this.f10801o = Paint.Join.MITER;
            this.f10802p = 4.0f;
            this.f10791e = c0171c.f10791e;
            this.f10792f = c0171c.f10792f;
            this.f10793g = c0171c.f10793g;
            this.f10795i = c0171c.f10795i;
            this.f10794h = c0171c.f10794h;
            this.f10818c = c0171c.f10818c;
            this.f10796j = c0171c.f10796j;
            this.f10797k = c0171c.f10797k;
            this.f10798l = c0171c.f10798l;
            this.f10799m = c0171c.f10799m;
            this.f10800n = c0171c.f10800n;
            this.f10801o = c0171c.f10801o;
            this.f10802p = c0171c.f10802p;
        }
    }

    private static class g {

        /* renamed from: q, reason: collision with root package name */
        private static final Matrix f10820q = new Matrix();

        /* renamed from: a, reason: collision with root package name */
        private final Path f10821a;

        /* renamed from: b, reason: collision with root package name */
        private final Path f10822b;

        /* renamed from: c, reason: collision with root package name */
        private final Matrix f10823c;

        /* renamed from: d, reason: collision with root package name */
        Paint f10824d;

        /* renamed from: e, reason: collision with root package name */
        Paint f10825e;

        /* renamed from: f, reason: collision with root package name */
        private PathMeasure f10826f;

        /* renamed from: g, reason: collision with root package name */
        private int f10827g;

        /* renamed from: h, reason: collision with root package name */
        final d f10828h;

        /* renamed from: i, reason: collision with root package name */
        float f10829i;

        /* renamed from: j, reason: collision with root package name */
        float f10830j;

        /* renamed from: k, reason: collision with root package name */
        float f10831k;

        /* renamed from: l, reason: collision with root package name */
        float f10832l;

        /* renamed from: m, reason: collision with root package name */
        int f10833m;

        /* renamed from: n, reason: collision with root package name */
        String f10834n;

        /* renamed from: o, reason: collision with root package name */
        Boolean f10835o;

        /* renamed from: p, reason: collision with root package name */
        final O.a f10836p;

        public g() {
            this.f10823c = new Matrix();
            this.f10829i = 0.0f;
            this.f10830j = 0.0f;
            this.f10831k = 0.0f;
            this.f10832l = 0.0f;
            this.f10833m = 255;
            this.f10834n = null;
            this.f10835o = null;
            this.f10836p = new O.a();
            this.f10828h = new d();
            this.f10821a = new Path();
            this.f10822b = new Path();
        }

        private static float a(float f8, float f9, float f10, float f11) {
            return (f8 * f11) - (f9 * f10);
        }

        private void b(d dVar, Matrix matrix, Canvas canvas, int i8, int i9, ColorFilter colorFilter) {
            dVar.f10803a.set(matrix);
            dVar.f10803a.preConcat(dVar.f10812j);
            canvas.save();
            for (int i10 = 0; i10 < dVar.f10804b.size(); i10++) {
                e eVar = (e) dVar.f10804b.get(i10);
                if (eVar instanceof d) {
                    b((d) eVar, dVar.f10803a, canvas, i8, i9, colorFilter);
                } else if (eVar instanceof f) {
                    c(dVar, (f) eVar, canvas, i8, i9, colorFilter);
                }
            }
            canvas.restore();
        }

        private void c(d dVar, f fVar, Canvas canvas, int i8, int i9, ColorFilter colorFilter) {
            float f8 = i8 / this.f10831k;
            float f9 = i9 / this.f10832l;
            float fMin = Math.min(f8, f9);
            Matrix matrix = dVar.f10803a;
            this.f10823c.set(matrix);
            this.f10823c.postScale(f8, f9);
            float fD = d(matrix);
            if (fD == 0.0f) {
                return;
            }
            fVar.toPath(this.f10821a);
            Path path = this.f10821a;
            this.f10822b.reset();
            if (fVar.isClipPath()) {
                this.f10822b.setFillType(fVar.f10818c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                this.f10822b.addPath(path, this.f10823c);
                canvas.clipPath(this.f10822b);
                return;
            }
            C0171c c0171c = (C0171c) fVar;
            float f10 = c0171c.f10797k;
            if (f10 != 0.0f || c0171c.f10798l != 1.0f) {
                float f11 = c0171c.f10799m;
                float f12 = (f10 + f11) % 1.0f;
                float f13 = (c0171c.f10798l + f11) % 1.0f;
                if (this.f10826f == null) {
                    this.f10826f = new PathMeasure();
                }
                this.f10826f.setPath(this.f10821a, false);
                float length = this.f10826f.getLength();
                float f14 = f12 * length;
                float f15 = f13 * length;
                path.reset();
                if (f14 > f15) {
                    this.f10826f.getSegment(f14, length, path, true);
                    this.f10826f.getSegment(0.0f, f15, path, true);
                } else {
                    this.f10826f.getSegment(f14, f15, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.f10822b.addPath(path, this.f10823c);
            if (c0171c.f10794h.willDraw()) {
                androidx.core.content.res.d dVar2 = c0171c.f10794h;
                if (this.f10825e == null) {
                    Paint paint = new Paint(1);
                    this.f10825e = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.f10825e;
                if (dVar2.isGradient()) {
                    Shader shader = dVar2.getShader();
                    shader.setLocalMatrix(this.f10823c);
                    paint2.setShader(shader);
                    paint2.setAlpha(Math.round(c0171c.f10796j * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(255);
                    paint2.setColor(c.a(dVar2.getColor(), c0171c.f10796j));
                }
                paint2.setColorFilter(colorFilter);
                this.f10822b.setFillType(c0171c.f10818c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.f10822b, paint2);
            }
            if (c0171c.f10792f.willDraw()) {
                androidx.core.content.res.d dVar3 = c0171c.f10792f;
                if (this.f10824d == null) {
                    Paint paint3 = new Paint(1);
                    this.f10824d = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.f10824d;
                Paint.Join join = c0171c.f10801o;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = c0171c.f10800n;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(c0171c.f10802p);
                if (dVar3.isGradient()) {
                    Shader shader2 = dVar3.getShader();
                    shader2.setLocalMatrix(this.f10823c);
                    paint4.setShader(shader2);
                    paint4.setAlpha(Math.round(c0171c.f10795i * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(255);
                    paint4.setColor(c.a(dVar3.getColor(), c0171c.f10795i));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(c0171c.f10793g * fMin * fD);
                canvas.drawPath(this.f10822b, paint4);
            }
        }

        private float d(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float fHypot = (float) Math.hypot(fArr[0], fArr[1]);
            float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
            float fA = a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float fMax = Math.max(fHypot, fHypot2);
            if (fMax > 0.0f) {
                return Math.abs(fA) / fMax;
            }
            return 0.0f;
        }

        public void draw(Canvas canvas, int i8, int i9, ColorFilter colorFilter) {
            b(this.f10828h, f10820q, canvas, i8, i9, colorFilter);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f10833m;
        }

        public boolean isStateful() {
            if (this.f10835o == null) {
                this.f10835o = Boolean.valueOf(this.f10828h.isStateful());
            }
            return this.f10835o.booleanValue();
        }

        public boolean onStateChanged(int[] iArr) {
            return this.f10828h.onStateChanged(iArr);
        }

        public void setAlpha(float f8) {
            setRootAlpha((int) (f8 * 255.0f));
        }

        public void setRootAlpha(int i8) {
            this.f10833m = i8;
        }

        public g(g gVar) {
            this.f10823c = new Matrix();
            this.f10829i = 0.0f;
            this.f10830j = 0.0f;
            this.f10831k = 0.0f;
            this.f10832l = 0.0f;
            this.f10833m = 255;
            this.f10834n = null;
            this.f10835o = null;
            O.a aVar = new O.a();
            this.f10836p = aVar;
            this.f10828h = new d(gVar.f10828h, aVar);
            this.f10821a = new Path(gVar.f10821a);
            this.f10822b = new Path(gVar.f10822b);
            this.f10829i = gVar.f10829i;
            this.f10830j = gVar.f10830j;
            this.f10831k = gVar.f10831k;
            this.f10832l = gVar.f10832l;
            this.f10827g = gVar.f10827g;
            this.f10833m = gVar.f10833m;
            this.f10834n = gVar.f10834n;
            String str = gVar.f10834n;
            if (str != null) {
                aVar.put(str, this);
            }
            this.f10835o = gVar.f10835o;
        }
    }

    private static class d extends e {

        /* renamed from: a, reason: collision with root package name */
        final Matrix f10803a;

        /* renamed from: b, reason: collision with root package name */
        final ArrayList f10804b;

        /* renamed from: c, reason: collision with root package name */
        float f10805c;

        /* renamed from: d, reason: collision with root package name */
        private float f10806d;

        /* renamed from: e, reason: collision with root package name */
        private float f10807e;

        /* renamed from: f, reason: collision with root package name */
        private float f10808f;

        /* renamed from: g, reason: collision with root package name */
        private float f10809g;

        /* renamed from: h, reason: collision with root package name */
        private float f10810h;

        /* renamed from: i, reason: collision with root package name */
        private float f10811i;

        /* renamed from: j, reason: collision with root package name */
        final Matrix f10812j;

        /* renamed from: k, reason: collision with root package name */
        int f10813k;

        /* renamed from: l, reason: collision with root package name */
        private int[] f10814l;

        /* renamed from: m, reason: collision with root package name */
        private String f10815m;

        public d(d dVar, O.a aVar) {
            f bVar;
            super();
            this.f10803a = new Matrix();
            this.f10804b = new ArrayList();
            this.f10805c = 0.0f;
            this.f10806d = 0.0f;
            this.f10807e = 0.0f;
            this.f10808f = 1.0f;
            this.f10809g = 1.0f;
            this.f10810h = 0.0f;
            this.f10811i = 0.0f;
            Matrix matrix = new Matrix();
            this.f10812j = matrix;
            this.f10815m = null;
            this.f10805c = dVar.f10805c;
            this.f10806d = dVar.f10806d;
            this.f10807e = dVar.f10807e;
            this.f10808f = dVar.f10808f;
            this.f10809g = dVar.f10809g;
            this.f10810h = dVar.f10810h;
            this.f10811i = dVar.f10811i;
            this.f10814l = dVar.f10814l;
            String str = dVar.f10815m;
            this.f10815m = str;
            this.f10813k = dVar.f10813k;
            if (str != null) {
                aVar.put(str, this);
            }
            matrix.set(dVar.f10812j);
            ArrayList arrayList = dVar.f10804b;
            for (int i8 = 0; i8 < arrayList.size(); i8++) {
                Object obj = arrayList.get(i8);
                if (obj instanceof d) {
                    this.f10804b.add(new d((d) obj, aVar));
                } else {
                    if (obj instanceof C0171c) {
                        bVar = new C0171c((C0171c) obj);
                    } else {
                        if (!(obj instanceof b)) {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        bVar = new b((b) obj);
                    }
                    this.f10804b.add(bVar);
                    Object obj2 = bVar.f10817b;
                    if (obj2 != null) {
                        aVar.put(obj2, bVar);
                    }
                }
            }
        }

        private void a() {
            this.f10812j.reset();
            this.f10812j.postTranslate(-this.f10806d, -this.f10807e);
            this.f10812j.postScale(this.f10808f, this.f10809g);
            this.f10812j.postRotate(this.f10805c, 0.0f, 0.0f);
            this.f10812j.postTranslate(this.f10810h + this.f10806d, this.f10811i + this.f10807e);
        }

        private void b(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f10814l = null;
            this.f10805c = k.getNamedFloat(typedArray, xmlPullParser, "rotation", 5, this.f10805c);
            this.f10806d = typedArray.getFloat(1, this.f10806d);
            this.f10807e = typedArray.getFloat(2, this.f10807e);
            this.f10808f = k.getNamedFloat(typedArray, xmlPullParser, "scaleX", 3, this.f10808f);
            this.f10809g = k.getNamedFloat(typedArray, xmlPullParser, "scaleY", 4, this.f10809g);
            this.f10810h = k.getNamedFloat(typedArray, xmlPullParser, "translateX", 6, this.f10810h);
            this.f10811i = k.getNamedFloat(typedArray, xmlPullParser, "translateY", 7, this.f10811i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f10815m = string;
            }
            a();
        }

        public String getGroupName() {
            return this.f10815m;
        }

        public Matrix getLocalMatrix() {
            return this.f10812j;
        }

        public float getPivotX() {
            return this.f10806d;
        }

        public float getPivotY() {
            return this.f10807e;
        }

        public float getRotation() {
            return this.f10805c;
        }

        public float getScaleX() {
            return this.f10808f;
        }

        public float getScaleY() {
            return this.f10809g;
        }

        public float getTranslateX() {
            return this.f10810h;
        }

        public float getTranslateY() {
            return this.f10811i;
        }

        public void inflate(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayObtainAttributes = k.obtainAttributes(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f10775b);
            b(typedArrayObtainAttributes, xmlPullParser);
            typedArrayObtainAttributes.recycle();
        }

        @Override // androidx.vectordrawable.graphics.drawable.c.e
        public boolean isStateful() {
            for (int i8 = 0; i8 < this.f10804b.size(); i8++) {
                if (((e) this.f10804b.get(i8)).isStateful()) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.vectordrawable.graphics.drawable.c.e
        public boolean onStateChanged(int[] iArr) {
            boolean zOnStateChanged = false;
            for (int i8 = 0; i8 < this.f10804b.size(); i8++) {
                zOnStateChanged |= ((e) this.f10804b.get(i8)).onStateChanged(iArr);
            }
            return zOnStateChanged;
        }

        public void setPivotX(float f8) {
            if (f8 != this.f10806d) {
                this.f10806d = f8;
                a();
            }
        }

        public void setPivotY(float f8) {
            if (f8 != this.f10807e) {
                this.f10807e = f8;
                a();
            }
        }

        public void setRotation(float f8) {
            if (f8 != this.f10805c) {
                this.f10805c = f8;
                a();
            }
        }

        public void setScaleX(float f8) {
            if (f8 != this.f10808f) {
                this.f10808f = f8;
                a();
            }
        }

        public void setScaleY(float f8) {
            if (f8 != this.f10809g) {
                this.f10809g = f8;
                a();
            }
        }

        public void setTranslateX(float f8) {
            if (f8 != this.f10810h) {
                this.f10810h = f8;
                a();
            }
        }

        public void setTranslateY(float f8) {
            if (f8 != this.f10811i) {
                this.f10811i = f8;
                a();
            }
        }

        public d() {
            super();
            this.f10803a = new Matrix();
            this.f10804b = new ArrayList();
            this.f10805c = 0.0f;
            this.f10806d = 0.0f;
            this.f10807e = 0.0f;
            this.f10808f = 1.0f;
            this.f10809g = 1.0f;
            this.f10810h = 0.0f;
            this.f10811i = 0.0f;
            this.f10812j = new Matrix();
            this.f10815m = null;
        }
    }
}
