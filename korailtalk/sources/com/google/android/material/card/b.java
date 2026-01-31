package com.google.android.material.card;

import J2.f;
import J2.l;
import X2.c;
import a3.d;
import a3.e;
import a3.g;
import a3.j;
import a3.k;
import android.R;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import androidx.core.view.AbstractC0985p0;

/* loaded from: classes2.dex */
class b {

    /* renamed from: t, reason: collision with root package name */
    private static final int[] f24530t = {R.attr.state_checked};

    /* renamed from: u, reason: collision with root package name */
    private static final double f24531u = Math.cos(Math.toRadians(45.0d));

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.material.card.a f24532a;

    /* renamed from: c, reason: collision with root package name */
    private final g f24534c;

    /* renamed from: d, reason: collision with root package name */
    private final g f24535d;

    /* renamed from: e, reason: collision with root package name */
    private int f24536e;

    /* renamed from: f, reason: collision with root package name */
    private int f24537f;

    /* renamed from: g, reason: collision with root package name */
    private int f24538g;

    /* renamed from: h, reason: collision with root package name */
    private Drawable f24539h;

    /* renamed from: i, reason: collision with root package name */
    private Drawable f24540i;

    /* renamed from: j, reason: collision with root package name */
    private ColorStateList f24541j;

    /* renamed from: k, reason: collision with root package name */
    private ColorStateList f24542k;

    /* renamed from: l, reason: collision with root package name */
    private k f24543l;

    /* renamed from: m, reason: collision with root package name */
    private ColorStateList f24544m;

    /* renamed from: n, reason: collision with root package name */
    private Drawable f24545n;

    /* renamed from: o, reason: collision with root package name */
    private LayerDrawable f24546o;

    /* renamed from: p, reason: collision with root package name */
    private g f24547p;

    /* renamed from: q, reason: collision with root package name */
    private g f24548q;

    /* renamed from: s, reason: collision with root package name */
    private boolean f24550s;

    /* renamed from: b, reason: collision with root package name */
    private final Rect f24533b = new Rect();

    /* renamed from: r, reason: collision with root package name */
    private boolean f24549r = false;

    class a extends InsetDrawable {
        a(Drawable drawable, int i8, int i9, int i10, int i11) {
            super(drawable, i8, i9, i10, i11);
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumHeight() {
            return -1;
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumWidth() {
            return -1;
        }

        @Override // android.graphics.drawable.InsetDrawable, android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public boolean getPadding(Rect rect) {
            return false;
        }
    }

    public b(com.google.android.material.card.a aVar, AttributeSet attributeSet, int i8, int i9) {
        this.f24532a = aVar;
        g gVar = new g(aVar.getContext(), attributeSet, i8, i9);
        this.f24534c = gVar;
        gVar.initializeElevationOverlay(aVar.getContext());
        gVar.setShadowColor(-12303292);
        k.b builder = gVar.getShapeAppearanceModel().toBuilder();
        TypedArray typedArrayObtainStyledAttributes = aVar.getContext().obtainStyledAttributes(attributeSet, l.CardView, i8, J2.k.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(l.CardView_cardCornerRadius)) {
            builder.setAllCornerSizes(typedArrayObtainStyledAttributes.getDimension(l.CardView_cardCornerRadius, 0.0f));
        }
        this.f24535d = new g();
        R(builder.build());
        typedArrayObtainStyledAttributes.recycle();
    }

    private Drawable B(Drawable drawable) {
        int iCeil;
        int iCeil2;
        if (this.f24532a.getUseCompatPadding()) {
            iCeil2 = (int) Math.ceil(d());
            iCeil = (int) Math.ceil(c());
        } else {
            iCeil = 0;
            iCeil2 = 0;
        }
        return new a(drawable, iCeil, iCeil2, iCeil, iCeil2);
    }

    private boolean V() {
        return this.f24532a.getPreventCornerOverlap() && !e();
    }

    private boolean W() {
        return this.f24532a.getPreventCornerOverlap() && e() && this.f24532a.getUseCompatPadding();
    }

    private float a() {
        return Math.max(Math.max(b(this.f24543l.getTopLeftCorner(), this.f24534c.getTopLeftCornerResolvedSize()), b(this.f24543l.getTopRightCorner(), this.f24534c.getTopRightCornerResolvedSize())), Math.max(b(this.f24543l.getBottomRightCorner(), this.f24534c.getBottomRightCornerResolvedSize()), b(this.f24543l.getBottomLeftCorner(), this.f24534c.getBottomLeftCornerResolvedSize())));
    }

    private void a0(Drawable drawable) {
        if (this.f24532a.getForeground() instanceof InsetDrawable) {
            ((InsetDrawable) this.f24532a.getForeground()).setDrawable(drawable);
        } else {
            this.f24532a.setForeground(B(drawable));
        }
    }

    private float b(d dVar, float f8) {
        if (dVar instanceof j) {
            return (float) ((1.0d - f24531u) * f8);
        }
        if (dVar instanceof e) {
            return f8 / 2.0f;
        }
        return 0.0f;
    }

    private float c() {
        return this.f24532a.getMaxCardElevation() + (W() ? a() : 0.0f);
    }

    private void c0() {
        Drawable drawable;
        if (Y2.b.USE_FRAMEWORK_RIPPLE && (drawable = this.f24545n) != null) {
            ((RippleDrawable) drawable).setColor(this.f24541j);
            return;
        }
        g gVar = this.f24547p;
        if (gVar != null) {
            gVar.setFillColor(this.f24541j);
        }
    }

    private float d() {
        return (this.f24532a.getMaxCardElevation() * 1.5f) + (W() ? a() : 0.0f);
    }

    private boolean e() {
        return this.f24534c.isRoundRect();
    }

    private Drawable f() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        Drawable drawable = this.f24540i;
        if (drawable != null) {
            stateListDrawable.addState(f24530t, drawable);
        }
        return stateListDrawable;
    }

    private Drawable g() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        g gVarI = i();
        this.f24547p = gVarI;
        gVarI.setFillColor(this.f24541j);
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, this.f24547p);
        return stateListDrawable;
    }

    private Drawable h() {
        if (!Y2.b.USE_FRAMEWORK_RIPPLE) {
            return g();
        }
        this.f24548q = i();
        return new RippleDrawable(this.f24541j, null, this.f24548q);
    }

    private g i() {
        return new g(this.f24543l);
    }

    private Drawable r() {
        if (this.f24545n == null) {
            this.f24545n = h();
        }
        if (this.f24546o == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f24545n, this.f24535d, f()});
            this.f24546o = layerDrawable;
            layerDrawable.setId(2, f.mtrl_card_checked_layer_id);
        }
        return this.f24546o;
    }

    private float t() {
        if (this.f24532a.getPreventCornerOverlap() && this.f24532a.getUseCompatPadding()) {
            return (float) ((1.0d - f24531u) * this.f24532a.getCardViewRadius());
        }
        return 0.0f;
    }

    Rect A() {
        return this.f24533b;
    }

    boolean C() {
        return this.f24549r;
    }

    boolean D() {
        return this.f24550s;
    }

    void E(TypedArray typedArray) {
        ColorStateList colorStateList = c.getColorStateList(this.f24532a.getContext(), typedArray, l.MaterialCardView_strokeColor);
        this.f24544m = colorStateList;
        if (colorStateList == null) {
            this.f24544m = ColorStateList.valueOf(-1);
        }
        this.f24538g = typedArray.getDimensionPixelSize(l.MaterialCardView_strokeWidth, 0);
        boolean z8 = typedArray.getBoolean(l.MaterialCardView_android_checkable, false);
        this.f24550s = z8;
        this.f24532a.setLongClickable(z8);
        this.f24542k = c.getColorStateList(this.f24532a.getContext(), typedArray, l.MaterialCardView_checkedIconTint);
        K(c.getDrawable(this.f24532a.getContext(), typedArray, l.MaterialCardView_checkedIcon));
        M(typedArray.getDimensionPixelSize(l.MaterialCardView_checkedIconSize, 0));
        L(typedArray.getDimensionPixelSize(l.MaterialCardView_checkedIconMargin, 0));
        ColorStateList colorStateList2 = c.getColorStateList(this.f24532a.getContext(), typedArray, l.MaterialCardView_rippleColor);
        this.f24541j = colorStateList2;
        if (colorStateList2 == null) {
            this.f24541j = ColorStateList.valueOf(Q2.a.getColor(this.f24532a, J2.b.colorControlHighlight));
        }
        I(c.getColorStateList(this.f24532a.getContext(), typedArray, l.MaterialCardView_cardForegroundColor));
        c0();
        Z();
        d0();
        this.f24532a.setBackgroundInternal(B(this.f24534c));
        Drawable drawableR = this.f24532a.isClickable() ? r() : this.f24535d;
        this.f24539h = drawableR;
        this.f24532a.setForeground(B(drawableR));
    }

    void F(int i8, int i9) {
        int i10;
        int i11;
        if (this.f24546o != null) {
            int i12 = this.f24536e;
            int i13 = this.f24537f;
            int iCeil = (i8 - i12) - i13;
            int iCeil2 = (i9 - i12) - i13;
            if (this.f24532a.getUseCompatPadding()) {
                iCeil2 -= (int) Math.ceil(d() * 2.0f);
                iCeil -= (int) Math.ceil(c() * 2.0f);
            }
            int i14 = iCeil2;
            int i15 = this.f24536e;
            if (AbstractC0985p0.getLayoutDirection(this.f24532a) == 1) {
                i11 = iCeil;
                i10 = i15;
            } else {
                i10 = iCeil;
                i11 = i15;
            }
            this.f24546o.setLayerInset(2, i10, this.f24536e, i11, i14);
        }
    }

    void G(boolean z8) {
        this.f24549r = z8;
    }

    void H(ColorStateList colorStateList) {
        this.f24534c.setFillColor(colorStateList);
    }

    void I(ColorStateList colorStateList) {
        g gVar = this.f24535d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        gVar.setFillColor(colorStateList);
    }

    void J(boolean z8) {
        this.f24550s = z8;
    }

    void K(Drawable drawable) {
        this.f24540i = drawable;
        if (drawable != null) {
            Drawable drawableWrap = androidx.core.graphics.drawable.a.wrap(drawable.mutate());
            this.f24540i = drawableWrap;
            androidx.core.graphics.drawable.a.setTintList(drawableWrap, this.f24542k);
        }
        if (this.f24546o != null) {
            this.f24546o.setDrawableByLayerId(f.mtrl_card_checked_layer_id, f());
        }
    }

    void L(int i8) {
        this.f24536e = i8;
    }

    void M(int i8) {
        this.f24537f = i8;
    }

    void N(ColorStateList colorStateList) {
        this.f24542k = colorStateList;
        Drawable drawable = this.f24540i;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.setTintList(drawable, colorStateList);
        }
    }

    void O(float f8) {
        R(this.f24543l.withCornerSize(f8));
        this.f24539h.invalidateSelf();
        if (W() || V()) {
            Y();
        }
        if (W()) {
            b0();
        }
    }

    void P(float f8) {
        this.f24534c.setInterpolation(f8);
        g gVar = this.f24535d;
        if (gVar != null) {
            gVar.setInterpolation(f8);
        }
        g gVar2 = this.f24548q;
        if (gVar2 != null) {
            gVar2.setInterpolation(f8);
        }
    }

    void Q(ColorStateList colorStateList) {
        this.f24541j = colorStateList;
        c0();
    }

    void R(k kVar) {
        this.f24543l = kVar;
        this.f24534c.setShapeAppearanceModel(kVar);
        this.f24534c.setShadowBitmapDrawingEnable(!r0.isRoundRect());
        g gVar = this.f24535d;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(kVar);
        }
        g gVar2 = this.f24548q;
        if (gVar2 != null) {
            gVar2.setShapeAppearanceModel(kVar);
        }
        g gVar3 = this.f24547p;
        if (gVar3 != null) {
            gVar3.setShapeAppearanceModel(kVar);
        }
    }

    void S(ColorStateList colorStateList) {
        if (this.f24544m == colorStateList) {
            return;
        }
        this.f24544m = colorStateList;
        d0();
    }

    void T(int i8) {
        if (i8 == this.f24538g) {
            return;
        }
        this.f24538g = i8;
        d0();
    }

    void U(int i8, int i9, int i10, int i11) {
        this.f24533b.set(i8, i9, i10, i11);
        Y();
    }

    void X() {
        Drawable drawable = this.f24539h;
        Drawable drawableR = this.f24532a.isClickable() ? r() : this.f24535d;
        this.f24539h = drawableR;
        if (drawable != drawableR) {
            a0(drawableR);
        }
    }

    void Y() {
        int iA = (int) (((V() || W()) ? a() : 0.0f) - t());
        com.google.android.material.card.a aVar = this.f24532a;
        Rect rect = this.f24533b;
        aVar.f(rect.left + iA, rect.top + iA, rect.right + iA, rect.bottom + iA);
    }

    void Z() {
        this.f24534c.setElevation(this.f24532a.getCardElevation());
    }

    void b0() {
        if (!C()) {
            this.f24532a.setBackgroundInternal(B(this.f24534c));
        }
        this.f24532a.setForeground(B(this.f24539h));
    }

    void d0() {
        this.f24535d.setStroke(this.f24538g, this.f24544m);
    }

    void j() {
        Drawable drawable = this.f24545n;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int i8 = bounds.bottom;
            this.f24545n.setBounds(bounds.left, bounds.top, bounds.right, i8 - 1);
            this.f24545n.setBounds(bounds.left, bounds.top, bounds.right, i8);
        }
    }

    g k() {
        return this.f24534c;
    }

    ColorStateList l() {
        return this.f24534c.getFillColor();
    }

    ColorStateList m() {
        return this.f24535d.getFillColor();
    }

    Drawable n() {
        return this.f24540i;
    }

    int o() {
        return this.f24536e;
    }

    int p() {
        return this.f24537f;
    }

    ColorStateList q() {
        return this.f24542k;
    }

    float s() {
        return this.f24534c.getTopLeftCornerResolvedSize();
    }

    float u() {
        return this.f24534c.getInterpolation();
    }

    ColorStateList v() {
        return this.f24541j;
    }

    k w() {
        return this.f24543l;
    }

    int x() {
        ColorStateList colorStateList = this.f24544m;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    ColorStateList y() {
        return this.f24544m;
    }

    int z() {
        return this.f24538g;
    }
}
