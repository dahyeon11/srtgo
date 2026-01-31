package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class CardView extends FrameLayout {

    /* renamed from: h, reason: collision with root package name */
    private static final int[] f8032h = {R.attr.colorBackground};

    /* renamed from: i, reason: collision with root package name */
    private static final c f8033i;

    /* renamed from: a, reason: collision with root package name */
    private boolean f8034a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f8035b;

    /* renamed from: c, reason: collision with root package name */
    int f8036c;

    /* renamed from: d, reason: collision with root package name */
    int f8037d;

    /* renamed from: e, reason: collision with root package name */
    final Rect f8038e;

    /* renamed from: f, reason: collision with root package name */
    final Rect f8039f;

    /* renamed from: g, reason: collision with root package name */
    private final b f8040g;

    class a implements b {

        /* renamed from: a, reason: collision with root package name */
        private Drawable f8041a;

        a() {
        }

        @Override // androidx.cardview.widget.b
        public Drawable getCardBackground() {
            return this.f8041a;
        }

        @Override // androidx.cardview.widget.b
        public View getCardView() {
            return CardView.this;
        }

        @Override // androidx.cardview.widget.b
        public boolean getPreventCornerOverlap() {
            return CardView.this.getPreventCornerOverlap();
        }

        @Override // androidx.cardview.widget.b
        public boolean getUseCompatPadding() {
            return CardView.this.getUseCompatPadding();
        }

        @Override // androidx.cardview.widget.b
        public void setCardBackground(Drawable drawable) {
            this.f8041a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        @Override // androidx.cardview.widget.b
        public void setMinWidthHeightInternal(int i8, int i9) {
            CardView cardView = CardView.this;
            if (i8 > cardView.f8036c) {
                CardView.super.setMinimumWidth(i8);
            }
            CardView cardView2 = CardView.this;
            if (i9 > cardView2.f8037d) {
                CardView.super.setMinimumHeight(i9);
            }
        }

        @Override // androidx.cardview.widget.b
        public void setShadowPadding(int i8, int i9, int i10, int i11) {
            CardView.this.f8039f.set(i8, i9, i10, i11);
            CardView cardView = CardView.this;
            Rect rect = cardView.f8038e;
            CardView.super.setPadding(i8 + rect.left, i9 + rect.top, i10 + rect.right, i11 + rect.bottom);
        }
    }

    static {
        androidx.cardview.widget.a aVar = new androidx.cardview.widget.a();
        f8033i = aVar;
        aVar.initStatic();
    }

    public CardView(Context context) {
        this(context, null);
    }

    public ColorStateList getCardBackgroundColor() {
        return f8033i.getBackgroundColor(this.f8040g);
    }

    public float getCardElevation() {
        return f8033i.getElevation(this.f8040g);
    }

    public int getContentPaddingBottom() {
        return this.f8038e.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f8038e.left;
    }

    public int getContentPaddingRight() {
        return this.f8038e.right;
    }

    public int getContentPaddingTop() {
        return this.f8038e.top;
    }

    public float getMaxCardElevation() {
        return f8033i.getMaxElevation(this.f8040g);
    }

    public boolean getPreventCornerOverlap() {
        return this.f8035b;
    }

    public float getRadius() {
        return f8033i.getRadius(this.f8040g);
    }

    public boolean getUseCompatPadding() {
        return this.f8034a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i8, int i9) {
        if (f8033i instanceof androidx.cardview.widget.a) {
            super.onMeasure(i8, i9);
            return;
        }
        int mode = View.MeasureSpec.getMode(i8);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            i8 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.getMinWidth(this.f8040g)), View.MeasureSpec.getSize(i8)), mode);
        }
        int mode2 = View.MeasureSpec.getMode(i9);
        if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
            i9 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.getMinHeight(this.f8040g)), View.MeasureSpec.getSize(i9)), mode2);
        }
        super.onMeasure(i8, i9);
    }

    public void setCardBackgroundColor(int i8) {
        f8033i.setBackgroundColor(this.f8040g, ColorStateList.valueOf(i8));
    }

    public void setCardElevation(float f8) {
        f8033i.setElevation(this.f8040g, f8);
    }

    public void setContentPadding(int i8, int i9, int i10, int i11) {
        this.f8038e.set(i8, i9, i10, i11);
        f8033i.updatePadding(this.f8040g);
    }

    public void setMaxCardElevation(float f8) {
        f8033i.setMaxElevation(this.f8040g, f8);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i8) {
        this.f8037d = i8;
        super.setMinimumHeight(i8);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i8) {
        this.f8036c = i8;
        super.setMinimumWidth(i8);
    }

    @Override // android.view.View
    public void setPadding(int i8, int i9, int i10, int i11) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i8, int i9, int i10, int i11) {
    }

    public void setPreventCornerOverlap(boolean z8) {
        if (z8 != this.f8035b) {
            this.f8035b = z8;
            f8033i.onPreventCornerOverlapChanged(this.f8040g);
        }
    }

    public void setRadius(float f8) {
        f8033i.setRadius(this.f8040g, f8);
    }

    public void setUseCompatPadding(boolean z8) {
        if (this.f8034a != z8) {
            this.f8034a = z8;
            f8033i.onCompatPaddingChanged(this.f8040g);
        }
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, N.a.cardViewStyle);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f8033i.setBackgroundColor(this.f8040g, colorStateList);
    }

    public CardView(Context context, AttributeSet attributeSet, int i8) throws Resources.NotFoundException {
        int color;
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, i8);
        Rect rect = new Rect();
        this.f8038e = rect;
        this.f8039f = new Rect();
        a aVar = new a();
        this.f8040g = aVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, N.d.CardView, i8, N.c.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(N.d.CardView_cardBackgroundColor)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(N.d.CardView_cardBackgroundColor);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(f8032h);
            int color2 = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(N.b.cardview_light_background);
            } else {
                color = getResources().getColor(N.b.cardview_dark_background);
            }
            colorStateListValueOf = ColorStateList.valueOf(color);
        }
        ColorStateList colorStateList = colorStateListValueOf;
        float dimension = typedArrayObtainStyledAttributes.getDimension(N.d.CardView_cardCornerRadius, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(N.d.CardView_cardElevation, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(N.d.CardView_cardMaxElevation, 0.0f);
        this.f8034a = typedArrayObtainStyledAttributes.getBoolean(N.d.CardView_cardUseCompatPadding, false);
        this.f8035b = typedArrayObtainStyledAttributes.getBoolean(N.d.CardView_cardPreventCornerOverlap, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(N.d.CardView_contentPadding, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(N.d.CardView_contentPaddingLeft, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(N.d.CardView_contentPaddingTop, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(N.d.CardView_contentPaddingRight, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(N.d.CardView_contentPaddingBottom, dimensionPixelSize);
        float f8 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f8036c = typedArrayObtainStyledAttributes.getDimensionPixelSize(N.d.CardView_android_minWidth, 0);
        this.f8037d = typedArrayObtainStyledAttributes.getDimensionPixelSize(N.d.CardView_android_minHeight, 0);
        typedArrayObtainStyledAttributes.recycle();
        f8033i.initialize(aVar, context, colorStateList, dimension, dimension2, f8);
    }
}
