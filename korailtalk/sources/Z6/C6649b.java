package z6;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import android.widget.ImageView;
import java.util.HashSet;

/* renamed from: z6.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6649b extends Drawable {
    public static final int DEFAULT_BORDER_COLOR = -16777216;
    public static final String TAG = "RoundedDrawable";

    /* renamed from: a, reason: collision with root package name */
    private final RectF f37933a = new RectF();

    /* renamed from: b, reason: collision with root package name */
    private final RectF f37934b = new RectF();

    /* renamed from: c, reason: collision with root package name */
    private final RectF f37935c;

    /* renamed from: d, reason: collision with root package name */
    private final Bitmap f37936d;

    /* renamed from: e, reason: collision with root package name */
    private final Paint f37937e;

    /* renamed from: f, reason: collision with root package name */
    private final int f37938f;

    /* renamed from: g, reason: collision with root package name */
    private final int f37939g;

    /* renamed from: h, reason: collision with root package name */
    private final RectF f37940h;

    /* renamed from: i, reason: collision with root package name */
    private final Paint f37941i;

    /* renamed from: j, reason: collision with root package name */
    private final Matrix f37942j;

    /* renamed from: k, reason: collision with root package name */
    private final RectF f37943k;

    /* renamed from: l, reason: collision with root package name */
    private Shader.TileMode f37944l;

    /* renamed from: m, reason: collision with root package name */
    private Shader.TileMode f37945m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f37946n;

    /* renamed from: o, reason: collision with root package name */
    private float f37947o;

    /* renamed from: p, reason: collision with root package name */
    private final boolean[] f37948p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f37949q;

    /* renamed from: r, reason: collision with root package name */
    private float f37950r;

    /* renamed from: s, reason: collision with root package name */
    private ColorStateList f37951s;

    /* renamed from: t, reason: collision with root package name */
    private ImageView.ScaleType f37952t;

    /* renamed from: z6.b$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f37953a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f37953a = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37953a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37953a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f37953a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f37953a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f37953a[ImageView.ScaleType.FIT_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f37953a[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public C6649b(Bitmap bitmap) {
        RectF rectF = new RectF();
        this.f37935c = rectF;
        this.f37940h = new RectF();
        this.f37942j = new Matrix();
        this.f37943k = new RectF();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f37944l = tileMode;
        this.f37945m = tileMode;
        this.f37946n = true;
        this.f37947o = 0.0f;
        this.f37948p = new boolean[]{true, true, true, true};
        this.f37949q = false;
        this.f37950r = 0.0f;
        this.f37951s = ColorStateList.valueOf(-16777216);
        this.f37952t = ImageView.ScaleType.FIT_CENTER;
        this.f37936d = bitmap;
        int width = bitmap.getWidth();
        this.f37938f = width;
        int height = bitmap.getHeight();
        this.f37939g = height;
        rectF.set(0.0f, 0.0f, width, height);
        Paint paint = new Paint();
        this.f37937e = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f37941i = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        paint2.setColor(this.f37951s.getColorForState(getState(), -16777216));
        paint2.setStrokeWidth(this.f37950r);
    }

    private static boolean a(boolean[] zArr) {
        for (boolean z8 : zArr) {
            if (z8) {
                return false;
            }
        }
        return true;
    }

    private static boolean b(boolean[] zArr) {
        for (boolean z8 : zArr) {
            if (z8) {
                return true;
            }
        }
        return false;
    }

    private static boolean c(int i8, boolean[] zArr) {
        int length = zArr.length;
        int i9 = 0;
        while (true) {
            if (i9 >= length) {
                return true;
            }
            if (zArr[i9] != (i9 == i8)) {
                return false;
            }
            i9++;
        }
    }

    private void d(Canvas canvas) {
        if (a(this.f37948p) || this.f37947o == 0.0f) {
            return;
        }
        RectF rectF = this.f37934b;
        float f8 = rectF.left;
        float f9 = rectF.top;
        float fWidth = rectF.width() + f8;
        float fHeight = this.f37934b.height() + f9;
        float f10 = this.f37947o;
        if (!this.f37948p[0]) {
            this.f37943k.set(f8, f9, f8 + f10, f9 + f10);
            canvas.drawRect(this.f37943k, this.f37937e);
        }
        if (!this.f37948p[1]) {
            this.f37943k.set(fWidth - f10, f9, fWidth, f10);
            canvas.drawRect(this.f37943k, this.f37937e);
        }
        if (!this.f37948p[2]) {
            this.f37943k.set(fWidth - f10, fHeight - f10, fWidth, fHeight);
            canvas.drawRect(this.f37943k, this.f37937e);
        }
        if (this.f37948p[3]) {
            return;
        }
        this.f37943k.set(f8, fHeight - f10, f10 + f8, fHeight);
        canvas.drawRect(this.f37943k, this.f37937e);
    }

    public static Bitmap drawableToBitmap(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(Math.max(drawable.getIntrinsicWidth(), 2), Math.max(drawable.getIntrinsicHeight(), 2), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return bitmapCreateBitmap;
        } catch (Exception e8) {
            e8.printStackTrace();
            Log.w(TAG, "Failed to create bitmap from drawable!");
            return null;
        }
    }

    private void e(Canvas canvas) {
        float f8;
        if (a(this.f37948p) || this.f37947o == 0.0f) {
            return;
        }
        RectF rectF = this.f37934b;
        float f9 = rectF.left;
        float f10 = rectF.top;
        float fWidth = rectF.width() + f9;
        float fHeight = f10 + this.f37934b.height();
        float f11 = this.f37947o;
        float f12 = this.f37950r / 2.0f;
        if (!this.f37948p[0]) {
            canvas.drawLine(f9 - f12, f10, f9 + f11, f10, this.f37941i);
            canvas.drawLine(f9, f10 - f12, f9, f10 + f11, this.f37941i);
        }
        if (!this.f37948p[1]) {
            canvas.drawLine((fWidth - f11) - f12, f10, fWidth, f10, this.f37941i);
            canvas.drawLine(fWidth, f10 - f12, fWidth, f10 + f11, this.f37941i);
        }
        if (this.f37948p[2]) {
            f8 = f11;
        } else {
            f8 = f11;
            canvas.drawLine((fWidth - f11) - f12, fHeight, fWidth + f12, fHeight, this.f37941i);
            canvas.drawLine(fWidth, fHeight - f8, fWidth, fHeight, this.f37941i);
        }
        if (this.f37948p[3]) {
            return;
        }
        canvas.drawLine(f9 - f12, fHeight, f9 + f8, fHeight, this.f37941i);
        canvas.drawLine(f9, fHeight - f8, f9, fHeight, this.f37941i);
    }

    private void f() {
        float fWidth;
        float fHeight;
        int i8 = a.f37953a[this.f37952t.ordinal()];
        if (i8 == 1) {
            this.f37940h.set(this.f37933a);
            RectF rectF = this.f37940h;
            float f8 = this.f37950r;
            rectF.inset(f8 / 2.0f, f8 / 2.0f);
            this.f37942j.reset();
            this.f37942j.setTranslate((int) (((this.f37940h.width() - this.f37938f) * 0.5f) + 0.5f), (int) (((this.f37940h.height() - this.f37939g) * 0.5f) + 0.5f));
        } else if (i8 == 2) {
            this.f37940h.set(this.f37933a);
            RectF rectF2 = this.f37940h;
            float f9 = this.f37950r;
            rectF2.inset(f9 / 2.0f, f9 / 2.0f);
            this.f37942j.reset();
            float fWidth2 = 0.0f;
            if (this.f37938f * this.f37940h.height() > this.f37940h.width() * this.f37939g) {
                fWidth = this.f37940h.height() / this.f37939g;
                fHeight = 0.0f;
                fWidth2 = (this.f37940h.width() - (this.f37938f * fWidth)) * 0.5f;
            } else {
                fWidth = this.f37940h.width() / this.f37938f;
                fHeight = (this.f37940h.height() - (this.f37939g * fWidth)) * 0.5f;
            }
            this.f37942j.setScale(fWidth, fWidth);
            Matrix matrix = this.f37942j;
            float f10 = this.f37950r;
            matrix.postTranslate(((int) (fWidth2 + 0.5f)) + (f10 / 2.0f), ((int) (fHeight + 0.5f)) + (f10 / 2.0f));
        } else if (i8 == 3) {
            this.f37942j.reset();
            float fMin = (((float) this.f37938f) > this.f37933a.width() || ((float) this.f37939g) > this.f37933a.height()) ? Math.min(this.f37933a.width() / this.f37938f, this.f37933a.height() / this.f37939g) : 1.0f;
            float fWidth3 = (int) (((this.f37933a.width() - (this.f37938f * fMin)) * 0.5f) + 0.5f);
            float fHeight2 = (int) (((this.f37933a.height() - (this.f37939g * fMin)) * 0.5f) + 0.5f);
            this.f37942j.setScale(fMin, fMin);
            this.f37942j.postTranslate(fWidth3, fHeight2);
            this.f37940h.set(this.f37935c);
            this.f37942j.mapRect(this.f37940h);
            RectF rectF3 = this.f37940h;
            float f11 = this.f37950r;
            rectF3.inset(f11 / 2.0f, f11 / 2.0f);
            this.f37942j.setRectToRect(this.f37935c, this.f37940h, Matrix.ScaleToFit.FILL);
        } else if (i8 == 5) {
            this.f37940h.set(this.f37935c);
            this.f37942j.setRectToRect(this.f37935c, this.f37933a, Matrix.ScaleToFit.END);
            this.f37942j.mapRect(this.f37940h);
            RectF rectF4 = this.f37940h;
            float f12 = this.f37950r;
            rectF4.inset(f12 / 2.0f, f12 / 2.0f);
            this.f37942j.setRectToRect(this.f37935c, this.f37940h, Matrix.ScaleToFit.FILL);
        } else if (i8 == 6) {
            this.f37940h.set(this.f37935c);
            this.f37942j.setRectToRect(this.f37935c, this.f37933a, Matrix.ScaleToFit.START);
            this.f37942j.mapRect(this.f37940h);
            RectF rectF5 = this.f37940h;
            float f13 = this.f37950r;
            rectF5.inset(f13 / 2.0f, f13 / 2.0f);
            this.f37942j.setRectToRect(this.f37935c, this.f37940h, Matrix.ScaleToFit.FILL);
        } else if (i8 != 7) {
            this.f37940h.set(this.f37935c);
            this.f37942j.setRectToRect(this.f37935c, this.f37933a, Matrix.ScaleToFit.CENTER);
            this.f37942j.mapRect(this.f37940h);
            RectF rectF6 = this.f37940h;
            float f14 = this.f37950r;
            rectF6.inset(f14 / 2.0f, f14 / 2.0f);
            this.f37942j.setRectToRect(this.f37935c, this.f37940h, Matrix.ScaleToFit.FILL);
        } else {
            this.f37940h.set(this.f37933a);
            RectF rectF7 = this.f37940h;
            float f15 = this.f37950r;
            rectF7.inset(f15 / 2.0f, f15 / 2.0f);
            this.f37942j.reset();
            this.f37942j.setRectToRect(this.f37935c, this.f37940h, Matrix.ScaleToFit.FILL);
        }
        this.f37934b.set(this.f37940h);
    }

    public static C6649b fromBitmap(Bitmap bitmap) {
        if (bitmap != null) {
            return new C6649b(bitmap);
        }
        return null;
    }

    public static Drawable fromDrawable(Drawable drawable) {
        if (drawable == null || (drawable instanceof C6649b)) {
            return drawable;
        }
        if (!(drawable instanceof LayerDrawable)) {
            Bitmap bitmapDrawableToBitmap = drawableToBitmap(drawable);
            return bitmapDrawableToBitmap != null ? new C6649b(bitmapDrawableToBitmap) : drawable;
        }
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        int numberOfLayers = layerDrawable.getNumberOfLayers();
        for (int i8 = 0; i8 < numberOfLayers; i8++) {
            layerDrawable.setDrawableByLayerId(layerDrawable.getId(i8), fromDrawable(layerDrawable.getDrawable(i8)));
        }
        return layerDrawable;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f37946n) {
            BitmapShader bitmapShader = new BitmapShader(this.f37936d, this.f37944l, this.f37945m);
            Shader.TileMode tileMode = this.f37944l;
            Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
            if (tileMode == tileMode2 && this.f37945m == tileMode2) {
                bitmapShader.setLocalMatrix(this.f37942j);
            }
            this.f37937e.setShader(bitmapShader);
            this.f37946n = false;
        }
        if (this.f37949q) {
            if (this.f37950r <= 0.0f) {
                canvas.drawOval(this.f37934b, this.f37937e);
                return;
            } else {
                canvas.drawOval(this.f37934b, this.f37937e);
                canvas.drawOval(this.f37940h, this.f37941i);
                return;
            }
        }
        if (!b(this.f37948p)) {
            canvas.drawRect(this.f37934b, this.f37937e);
            if (this.f37950r > 0.0f) {
                canvas.drawRect(this.f37940h, this.f37941i);
                return;
            }
            return;
        }
        float f8 = this.f37947o;
        if (this.f37950r <= 0.0f) {
            canvas.drawRoundRect(this.f37934b, f8, f8, this.f37937e);
            d(canvas);
        } else {
            canvas.drawRoundRect(this.f37934b, f8, f8, this.f37937e);
            canvas.drawRoundRect(this.f37940h, f8, f8, this.f37941i);
            d(canvas);
            e(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f37937e.getAlpha();
    }

    public int getBorderColor() {
        return this.f37951s.getDefaultColor();
    }

    public ColorStateList getBorderColors() {
        return this.f37951s;
    }

    public float getBorderWidth() {
        return this.f37950r;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f37937e.getColorFilter();
    }

    public float getCornerRadius() {
        return this.f37947o;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f37939g;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f37938f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public ImageView.ScaleType getScaleType() {
        return this.f37952t;
    }

    public Bitmap getSourceBitmap() {
        return this.f37936d;
    }

    public Shader.TileMode getTileModeX() {
        return this.f37944l;
    }

    public Shader.TileMode getTileModeY() {
        return this.f37945m;
    }

    public boolean isOval() {
        return this.f37949q;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.f37951s.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f37933a.set(rect);
        f();
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int colorForState = this.f37951s.getColorForState(iArr, 0);
        if (this.f37941i.getColor() == colorForState) {
            return super.onStateChange(iArr);
        }
        this.f37941i.setColor(colorForState);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i8) {
        this.f37937e.setAlpha(i8);
        invalidateSelf();
    }

    public C6649b setBorderColor(int i8) {
        return setBorderColor(ColorStateList.valueOf(i8));
    }

    public C6649b setBorderWidth(float f8) {
        this.f37950r = f8;
        this.f37941i.setStrokeWidth(f8);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f37937e.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public C6649b setCornerRadius(float f8) {
        setCornerRadius(f8, f8, f8, f8);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z8) {
        this.f37937e.setDither(z8);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z8) {
        this.f37937e.setFilterBitmap(z8);
        invalidateSelf();
    }

    public C6649b setOval(boolean z8) {
        this.f37949q = z8;
        return this;
    }

    public C6649b setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType == null) {
            scaleType = ImageView.ScaleType.FIT_CENTER;
        }
        if (this.f37952t != scaleType) {
            this.f37952t = scaleType;
            f();
        }
        return this;
    }

    public C6649b setTileModeX(Shader.TileMode tileMode) {
        if (this.f37944l != tileMode) {
            this.f37944l = tileMode;
            this.f37946n = true;
            invalidateSelf();
        }
        return this;
    }

    public C6649b setTileModeY(Shader.TileMode tileMode) {
        if (this.f37945m != tileMode) {
            this.f37945m = tileMode;
            this.f37946n = true;
            invalidateSelf();
        }
        return this;
    }

    public Bitmap toBitmap() {
        return drawableToBitmap(this);
    }

    public float getCornerRadius(int i8) {
        if (this.f37948p[i8]) {
            return this.f37947o;
        }
        return 0.0f;
    }

    public C6649b setBorderColor(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f37951s = colorStateList;
        this.f37941i.setColor(colorStateList.getColorForState(getState(), -16777216));
        return this;
    }

    public C6649b setCornerRadius(int i8, float f8) {
        if (f8 != 0.0f) {
            float f9 = this.f37947o;
            if (f9 != 0.0f && f9 != f8) {
                throw new IllegalArgumentException("Multiple nonzero corner radii not yet supported.");
            }
        }
        if (f8 == 0.0f) {
            if (c(i8, this.f37948p)) {
                this.f37947o = 0.0f;
            }
            this.f37948p[i8] = false;
        } else {
            if (this.f37947o == 0.0f) {
                this.f37947o = f8;
            }
            this.f37948p[i8] = true;
        }
        return this;
    }

    public C6649b setCornerRadius(float f8, float f9, float f10, float f11) {
        HashSet hashSet = new HashSet(4);
        hashSet.add(Float.valueOf(f8));
        hashSet.add(Float.valueOf(f9));
        hashSet.add(Float.valueOf(f10));
        hashSet.add(Float.valueOf(f11));
        hashSet.remove(Float.valueOf(0.0f));
        if (hashSet.size() <= 1) {
            if (!hashSet.isEmpty()) {
                float fFloatValue = ((Float) hashSet.iterator().next()).floatValue();
                if (!Float.isInfinite(fFloatValue) && !Float.isNaN(fFloatValue) && fFloatValue >= 0.0f) {
                    this.f37947o = fFloatValue;
                } else {
                    throw new IllegalArgumentException("Invalid radius value: " + fFloatValue);
                }
            } else {
                this.f37947o = 0.0f;
            }
            boolean[] zArr = this.f37948p;
            zArr[0] = f8 > 0.0f;
            zArr[1] = f9 > 0.0f;
            zArr[2] = f10 > 0.0f;
            zArr[3] = f11 > 0.0f;
            return this;
        }
        throw new IllegalArgumentException("Multiple nonzero corner radii not yet supported.");
    }
}
