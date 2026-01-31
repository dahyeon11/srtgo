package com.makeramen.roundedimageview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ImageView;
import z6.AbstractC6648a;
import z6.C6649b;

/* loaded from: classes.dex */
public class RoundedImageView extends ImageView {
    public static final float DEFAULT_BORDER_WIDTH = 0.0f;
    public static final float DEFAULT_RADIUS = 0.0f;
    public static final String TAG = "RoundedImageView";

    /* renamed from: a, reason: collision with root package name */
    private final float[] f29598a;

    /* renamed from: b, reason: collision with root package name */
    private Drawable f29599b;

    /* renamed from: c, reason: collision with root package name */
    private ColorStateList f29600c;

    /* renamed from: d, reason: collision with root package name */
    private float f29601d;

    /* renamed from: e, reason: collision with root package name */
    private ColorFilter f29602e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f29603f;

    /* renamed from: g, reason: collision with root package name */
    private Drawable f29604g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f29605h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f29606i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f29607j;

    /* renamed from: k, reason: collision with root package name */
    private int f29608k;

    /* renamed from: l, reason: collision with root package name */
    private int f29609l;

    /* renamed from: m, reason: collision with root package name */
    private ImageView.ScaleType f29610m;

    /* renamed from: n, reason: collision with root package name */
    private Shader.TileMode f29611n;

    /* renamed from: o, reason: collision with root package name */
    private Shader.TileMode f29612o;
    public static final Shader.TileMode DEFAULT_TILE_MODE = Shader.TileMode.CLAMP;

    /* renamed from: p, reason: collision with root package name */
    private static final ImageView.ScaleType[] f29597p = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f29613a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f29613a = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29613a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29613a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29613a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f29613a[ImageView.ScaleType.FIT_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f29613a[ImageView.ScaleType.FIT_END.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f29613a[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public RoundedImageView(Context context) {
        super(context);
        this.f29598a = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
        this.f29600c = ColorStateList.valueOf(-16777216);
        this.f29601d = 0.0f;
        this.f29602e = null;
        this.f29603f = false;
        this.f29605h = false;
        this.f29606i = false;
        this.f29607j = false;
        Shader.TileMode tileMode = DEFAULT_TILE_MODE;
        this.f29611n = tileMode;
        this.f29612o = tileMode;
    }

    private void a() {
        Drawable drawable = this.f29604g;
        if (drawable == null || !this.f29603f) {
            return;
        }
        Drawable drawableMutate = drawable.mutate();
        this.f29604g = drawableMutate;
        if (this.f29605h) {
            drawableMutate.setColorFilter(this.f29602e);
        }
    }

    private static Shader.TileMode b(int i8) {
        if (i8 == 0) {
            return Shader.TileMode.CLAMP;
        }
        if (i8 == 1) {
            return Shader.TileMode.REPEAT;
        }
        if (i8 != 2) {
            return null;
        }
        return Shader.TileMode.MIRROR;
    }

    private Drawable c() throws Resources.NotFoundException {
        Resources resources = getResources();
        Drawable drawable = null;
        if (resources == null) {
            return null;
        }
        int i8 = this.f29609l;
        if (i8 != 0) {
            try {
                drawable = resources.getDrawable(i8);
            } catch (Exception e8) {
                Log.w(TAG, "Unable to find resource: " + this.f29609l, e8);
                this.f29609l = 0;
            }
        }
        return C6649b.fromDrawable(drawable);
    }

    private Drawable d() throws Resources.NotFoundException {
        Resources resources = getResources();
        Drawable drawable = null;
        if (resources == null) {
            return null;
        }
        int i8 = this.f29608k;
        if (i8 != 0) {
            try {
                drawable = resources.getDrawable(i8);
            } catch (Exception e8) {
                Log.w(TAG, "Unable to find resource: " + this.f29608k, e8);
                this.f29608k = 0;
            }
        }
        return C6649b.fromDrawable(drawable);
    }

    private void e(Drawable drawable, ImageView.ScaleType scaleType) {
        if (drawable == null) {
            return;
        }
        if (drawable instanceof C6649b) {
            C6649b c6649b = (C6649b) drawable;
            c6649b.setScaleType(scaleType).setBorderWidth(this.f29601d).setBorderColor(this.f29600c).setOval(this.f29606i).setTileModeX(this.f29611n).setTileModeY(this.f29612o);
            float[] fArr = this.f29598a;
            if (fArr != null) {
                c6649b.setCornerRadius(fArr[0], fArr[1], fArr[2], fArr[3]);
            }
            a();
            return;
        }
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            for (int i8 = 0; i8 < numberOfLayers; i8++) {
                e(layerDrawable.getDrawable(i8), scaleType);
            }
        }
    }

    private void f(boolean z8) {
        if (this.f29607j) {
            if (z8) {
                this.f29599b = C6649b.fromDrawable(this.f29599b);
            }
            e(this.f29599b, ImageView.ScaleType.FIT_XY);
        }
    }

    private void g() {
        e(this.f29604g, this.f29610m);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    public int getBorderColor() {
        return this.f29600c.getDefaultColor();
    }

    public ColorStateList getBorderColors() {
        return this.f29600c;
    }

    public float getBorderWidth() {
        return this.f29601d;
    }

    public float getCornerRadius() {
        return getMaxCornerRadius();
    }

    public float getMaxCornerRadius() {
        float fMax = 0.0f;
        for (float f8 : this.f29598a) {
            fMax = Math.max(f8, fMax);
        }
        return fMax;
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.f29610m;
    }

    public Shader.TileMode getTileModeX() {
        return this.f29611n;
    }

    public Shader.TileMode getTileModeY() {
        return this.f29612o;
    }

    public boolean isOval() {
        return this.f29606i;
    }

    public void mutateBackground(boolean z8) {
        if (this.f29607j == z8) {
            return;
        }
        this.f29607j = z8;
        f(true);
        invalidate();
    }

    public boolean mutatesBackground() {
        return this.f29607j;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i8) {
        ColorDrawable colorDrawable = new ColorDrawable(i8);
        this.f29599b = colorDrawable;
        setBackgroundDrawable(colorDrawable);
    }

    @Override // android.view.View
    @Deprecated
    public void setBackgroundDrawable(Drawable drawable) {
        this.f29599b = drawable;
        f(true);
        super.setBackgroundDrawable(this.f29599b);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i8) throws Resources.NotFoundException {
        if (this.f29609l != i8) {
            this.f29609l = i8;
            Drawable drawableC = c();
            this.f29599b = drawableC;
            setBackgroundDrawable(drawableC);
        }
    }

    public void setBorderColor(int i8) {
        setBorderColor(ColorStateList.valueOf(i8));
    }

    public void setBorderWidth(int i8) {
        setBorderWidth(getResources().getDimension(i8));
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f29602e != colorFilter) {
            this.f29602e = colorFilter;
            this.f29605h = true;
            this.f29603f = true;
            a();
            invalidate();
        }
    }

    public void setCornerRadius(float f8) {
        setCornerRadius(f8, f8, f8, f8);
    }

    public void setCornerRadiusDimen(int i8) throws Resources.NotFoundException {
        float dimension = getResources().getDimension(i8);
        setCornerRadius(dimension, dimension, dimension, dimension);
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.f29608k = 0;
        this.f29604g = C6649b.fromBitmap(bitmap);
        g();
        super.setImageDrawable(this.f29604g);
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.f29608k = 0;
        this.f29604g = C6649b.fromDrawable(drawable);
        g();
        super.setImageDrawable(this.f29604g);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i8) {
        if (this.f29608k != i8) {
            this.f29608k = i8;
            this.f29604g = d();
            g();
            super.setImageDrawable(this.f29604g);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        setImageDrawable(getDrawable());
    }

    public void setOval(boolean z8) {
        this.f29606i = z8;
        g();
        f(false);
        invalidate();
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (this.f29610m != scaleType) {
            this.f29610m = scaleType;
            switch (a.f29613a[scaleType.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    super.setScaleType(ImageView.ScaleType.FIT_XY);
                    break;
                default:
                    super.setScaleType(scaleType);
                    break;
            }
            g();
            f(false);
            invalidate();
        }
    }

    public void setTileModeX(Shader.TileMode tileMode) {
        if (this.f29611n == tileMode) {
            return;
        }
        this.f29611n = tileMode;
        g();
        f(false);
        invalidate();
    }

    public void setTileModeY(Shader.TileMode tileMode) {
        if (this.f29612o == tileMode) {
            return;
        }
        this.f29612o = tileMode;
        g();
        f(false);
        invalidate();
    }

    public float getCornerRadius(int i8) {
        return this.f29598a[i8];
    }

    public void setBorderColor(ColorStateList colorStateList) {
        if (this.f29600c.equals(colorStateList)) {
            return;
        }
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(-16777216);
        }
        this.f29600c = colorStateList;
        g();
        f(false);
        if (this.f29601d > 0.0f) {
            invalidate();
        }
    }

    public void setBorderWidth(float f8) {
        if (this.f29601d == f8) {
            return;
        }
        this.f29601d = f8;
        g();
        f(false);
        invalidate();
    }

    public void setCornerRadius(int i8, float f8) {
        float[] fArr = this.f29598a;
        if (fArr[i8] == f8) {
            return;
        }
        fArr[i8] = f8;
        g();
        f(false);
        invalidate();
    }

    public void setCornerRadiusDimen(int i8, int i9) {
        setCornerRadius(i8, getResources().getDimensionPixelSize(i9));
    }

    public void setCornerRadius(float f8, float f9, float f10, float f11) {
        float[] fArr = this.f29598a;
        if (fArr[0] == f8 && fArr[1] == f9 && fArr[2] == f11 && fArr[3] == f10) {
            return;
        }
        fArr[0] = f8;
        fArr[1] = f9;
        fArr[3] = f10;
        fArr[2] = f11;
        g();
        f(false);
        invalidate();
    }

    public RoundedImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RoundedImageView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f};
        this.f29598a = fArr;
        this.f29600c = ColorStateList.valueOf(-16777216);
        this.f29601d = 0.0f;
        this.f29602e = null;
        this.f29603f = false;
        this.f29605h = false;
        this.f29606i = false;
        this.f29607j = false;
        Shader.TileMode tileMode = DEFAULT_TILE_MODE;
        this.f29611n = tileMode;
        this.f29612o = tileMode;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC6648a.RoundedImageView, i8, 0);
        int i9 = typedArrayObtainStyledAttributes.getInt(AbstractC6648a.RoundedImageView_android_scaleType, -1);
        if (i9 >= 0) {
            setScaleType(f29597p[i9]);
        } else {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
        float dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC6648a.RoundedImageView_riv_corner_radius, -1);
        fArr[0] = typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC6648a.RoundedImageView_riv_corner_radius_top_left, -1);
        fArr[1] = typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC6648a.RoundedImageView_riv_corner_radius_top_right, -1);
        fArr[2] = typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC6648a.RoundedImageView_riv_corner_radius_bottom_right, -1);
        fArr[3] = typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC6648a.RoundedImageView_riv_corner_radius_bottom_left, -1);
        int length = fArr.length;
        boolean z8 = false;
        for (int i10 = 0; i10 < length; i10++) {
            float[] fArr2 = this.f29598a;
            if (fArr2[i10] < 0.0f) {
                fArr2[i10] = 0.0f;
            } else {
                z8 = true;
            }
        }
        if (!z8) {
            dimensionPixelSize = dimensionPixelSize < 0.0f ? 0.0f : dimensionPixelSize;
            int length2 = this.f29598a.length;
            for (int i11 = 0; i11 < length2; i11++) {
                this.f29598a[i11] = dimensionPixelSize;
            }
        }
        float dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC6648a.RoundedImageView_riv_border_width, -1);
        this.f29601d = dimensionPixelSize2;
        if (dimensionPixelSize2 < 0.0f) {
            this.f29601d = 0.0f;
        }
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(AbstractC6648a.RoundedImageView_riv_border_color);
        this.f29600c = colorStateList;
        if (colorStateList == null) {
            this.f29600c = ColorStateList.valueOf(-16777216);
        }
        this.f29607j = typedArrayObtainStyledAttributes.getBoolean(AbstractC6648a.RoundedImageView_riv_mutate_background, false);
        this.f29606i = typedArrayObtainStyledAttributes.getBoolean(AbstractC6648a.RoundedImageView_riv_oval, false);
        int i12 = typedArrayObtainStyledAttributes.getInt(AbstractC6648a.RoundedImageView_riv_tile_mode, -2);
        if (i12 != -2) {
            setTileModeX(b(i12));
            setTileModeY(b(i12));
        }
        int i13 = typedArrayObtainStyledAttributes.getInt(AbstractC6648a.RoundedImageView_riv_tile_mode_x, -2);
        if (i13 != -2) {
            setTileModeX(b(i13));
        }
        int i14 = typedArrayObtainStyledAttributes.getInt(AbstractC6648a.RoundedImageView_riv_tile_mode_y, -2);
        if (i14 != -2) {
            setTileModeY(b(i14));
        }
        g();
        f(true);
        if (this.f29607j) {
            super.setBackgroundDrawable(this.f29599b);
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
