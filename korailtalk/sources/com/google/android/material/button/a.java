package com.google.android.material.button;

import J2.b;
import J2.l;
import X2.c;
import a3.g;
import a3.k;
import a3.o;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import androidx.core.view.AbstractC0985p0;

/* loaded from: classes2.dex */
class a {

    /* renamed from: t, reason: collision with root package name */
    private static final boolean f24502t = true;

    /* renamed from: a, reason: collision with root package name */
    private final MaterialButton f24503a;

    /* renamed from: b, reason: collision with root package name */
    private k f24504b;

    /* renamed from: c, reason: collision with root package name */
    private int f24505c;

    /* renamed from: d, reason: collision with root package name */
    private int f24506d;

    /* renamed from: e, reason: collision with root package name */
    private int f24507e;

    /* renamed from: f, reason: collision with root package name */
    private int f24508f;

    /* renamed from: g, reason: collision with root package name */
    private int f24509g;

    /* renamed from: h, reason: collision with root package name */
    private int f24510h;

    /* renamed from: i, reason: collision with root package name */
    private PorterDuff.Mode f24511i;

    /* renamed from: j, reason: collision with root package name */
    private ColorStateList f24512j;

    /* renamed from: k, reason: collision with root package name */
    private ColorStateList f24513k;

    /* renamed from: l, reason: collision with root package name */
    private ColorStateList f24514l;

    /* renamed from: m, reason: collision with root package name */
    private Drawable f24515m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f24516n = false;

    /* renamed from: o, reason: collision with root package name */
    private boolean f24517o = false;

    /* renamed from: p, reason: collision with root package name */
    private boolean f24518p = false;

    /* renamed from: q, reason: collision with root package name */
    private boolean f24519q;

    /* renamed from: r, reason: collision with root package name */
    private LayerDrawable f24520r;

    /* renamed from: s, reason: collision with root package name */
    private int f24521s;

    a(MaterialButton materialButton, k kVar) {
        this.f24503a = materialButton;
        this.f24504b = kVar;
    }

    private void A() {
        this.f24503a.setInternalBackground(a());
        g gVarC = c();
        if (gVarC != null) {
            gVarC.setElevation(this.f24521s);
        }
    }

    private void B(k kVar) {
        if (c() != null) {
            c().setShapeAppearanceModel(kVar);
        }
        if (k() != null) {
            k().setShapeAppearanceModel(kVar);
        }
        if (getMaskDrawable() != null) {
            getMaskDrawable().setShapeAppearanceModel(kVar);
        }
    }

    private void C() {
        g gVarC = c();
        g gVarK = k();
        if (gVarC != null) {
            gVarC.setStroke(this.f24510h, this.f24513k);
            if (gVarK != null) {
                gVarK.setStroke(this.f24510h, this.f24516n ? Q2.a.getColor(this.f24503a, b.colorSurface) : 0);
            }
        }
    }

    private InsetDrawable D(Drawable drawable) {
        return new InsetDrawable(drawable, this.f24505c, this.f24507e, this.f24506d, this.f24508f);
    }

    private Drawable a() {
        g gVar = new g(this.f24504b);
        gVar.initializeElevationOverlay(this.f24503a.getContext());
        androidx.core.graphics.drawable.a.setTintList(gVar, this.f24512j);
        PorterDuff.Mode mode = this.f24511i;
        if (mode != null) {
            androidx.core.graphics.drawable.a.setTintMode(gVar, mode);
        }
        gVar.setStroke(this.f24510h, this.f24513k);
        g gVar2 = new g(this.f24504b);
        gVar2.setTint(0);
        gVar2.setStroke(this.f24510h, this.f24516n ? Q2.a.getColor(this.f24503a, b.colorSurface) : 0);
        if (f24502t) {
            g gVar3 = new g(this.f24504b);
            this.f24515m = gVar3;
            androidx.core.graphics.drawable.a.setTint(gVar3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(Y2.b.sanitizeRippleDrawableColor(this.f24514l), D(new LayerDrawable(new Drawable[]{gVar2, gVar})), this.f24515m);
            this.f24520r = rippleDrawable;
            return rippleDrawable;
        }
        Y2.a aVar = new Y2.a(this.f24504b);
        this.f24515m = aVar;
        androidx.core.graphics.drawable.a.setTintList(aVar, Y2.b.sanitizeRippleDrawableColor(this.f24514l));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gVar2, gVar, this.f24515m});
        this.f24520r = layerDrawable;
        return D(layerDrawable);
    }

    private g d(boolean z8) {
        LayerDrawable layerDrawable = this.f24520r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return f24502t ? (g) ((LayerDrawable) ((InsetDrawable) this.f24520r.getDrawable(0)).getDrawable()).getDrawable(!z8 ? 1 : 0) : (g) this.f24520r.getDrawable(!z8 ? 1 : 0);
    }

    private g k() {
        return d(true);
    }

    private void z(int i8, int i9) {
        int paddingStart = AbstractC0985p0.getPaddingStart(this.f24503a);
        int paddingTop = this.f24503a.getPaddingTop();
        int paddingEnd = AbstractC0985p0.getPaddingEnd(this.f24503a);
        int paddingBottom = this.f24503a.getPaddingBottom();
        int i10 = this.f24507e;
        int i11 = this.f24508f;
        this.f24508f = i9;
        this.f24507e = i8;
        if (!this.f24517o) {
            A();
        }
        AbstractC0985p0.setPaddingRelative(this.f24503a, paddingStart, (paddingTop + i8) - i10, paddingEnd, (paddingBottom + i9) - i11);
    }

    int b() {
        return this.f24509g;
    }

    g c() {
        return d(false);
    }

    ColorStateList e() {
        return this.f24514l;
    }

    k f() {
        return this.f24504b;
    }

    ColorStateList g() {
        return this.f24513k;
    }

    public int getInsetBottom() {
        return this.f24508f;
    }

    public int getInsetTop() {
        return this.f24507e;
    }

    public o getMaskDrawable() {
        LayerDrawable layerDrawable = this.f24520r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f24520r.getNumberOfLayers() > 2 ? (o) this.f24520r.getDrawable(2) : (o) this.f24520r.getDrawable(1);
    }

    int h() {
        return this.f24510h;
    }

    ColorStateList i() {
        return this.f24512j;
    }

    PorterDuff.Mode j() {
        return this.f24511i;
    }

    boolean l() {
        return this.f24517o;
    }

    boolean m() {
        return this.f24519q;
    }

    void n(TypedArray typedArray) {
        this.f24505c = typedArray.getDimensionPixelOffset(l.MaterialButton_android_insetLeft, 0);
        this.f24506d = typedArray.getDimensionPixelOffset(l.MaterialButton_android_insetRight, 0);
        this.f24507e = typedArray.getDimensionPixelOffset(l.MaterialButton_android_insetTop, 0);
        this.f24508f = typedArray.getDimensionPixelOffset(l.MaterialButton_android_insetBottom, 0);
        if (typedArray.hasValue(l.MaterialButton_cornerRadius)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(l.MaterialButton_cornerRadius, -1);
            this.f24509g = dimensionPixelSize;
            t(this.f24504b.withCornerSize(dimensionPixelSize));
            this.f24518p = true;
        }
        this.f24510h = typedArray.getDimensionPixelSize(l.MaterialButton_strokeWidth, 0);
        this.f24511i = com.google.android.material.internal.o.parseTintMode(typedArray.getInt(l.MaterialButton_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.f24512j = c.getColorStateList(this.f24503a.getContext(), typedArray, l.MaterialButton_backgroundTint);
        this.f24513k = c.getColorStateList(this.f24503a.getContext(), typedArray, l.MaterialButton_strokeColor);
        this.f24514l = c.getColorStateList(this.f24503a.getContext(), typedArray, l.MaterialButton_rippleColor);
        this.f24519q = typedArray.getBoolean(l.MaterialButton_android_checkable, false);
        this.f24521s = typedArray.getDimensionPixelSize(l.MaterialButton_elevation, 0);
        int paddingStart = AbstractC0985p0.getPaddingStart(this.f24503a);
        int paddingTop = this.f24503a.getPaddingTop();
        int paddingEnd = AbstractC0985p0.getPaddingEnd(this.f24503a);
        int paddingBottom = this.f24503a.getPaddingBottom();
        if (typedArray.hasValue(l.MaterialButton_android_background)) {
            p();
        } else {
            A();
        }
        AbstractC0985p0.setPaddingRelative(this.f24503a, paddingStart + this.f24505c, paddingTop + this.f24507e, paddingEnd + this.f24506d, paddingBottom + this.f24508f);
    }

    void o(int i8) {
        if (c() != null) {
            c().setTint(i8);
        }
    }

    void p() {
        this.f24517o = true;
        this.f24503a.setSupportBackgroundTintList(this.f24512j);
        this.f24503a.setSupportBackgroundTintMode(this.f24511i);
    }

    void q(boolean z8) {
        this.f24519q = z8;
    }

    void r(int i8) {
        if (this.f24518p && this.f24509g == i8) {
            return;
        }
        this.f24509g = i8;
        this.f24518p = true;
        t(this.f24504b.withCornerSize(i8));
    }

    void s(ColorStateList colorStateList) {
        if (this.f24514l != colorStateList) {
            this.f24514l = colorStateList;
            boolean z8 = f24502t;
            if (z8 && (this.f24503a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f24503a.getBackground()).setColor(Y2.b.sanitizeRippleDrawableColor(colorStateList));
            } else {
                if (z8 || !(this.f24503a.getBackground() instanceof Y2.a)) {
                    return;
                }
                ((Y2.a) this.f24503a.getBackground()).setTintList(Y2.b.sanitizeRippleDrawableColor(colorStateList));
            }
        }
    }

    public void setInsetBottom(int i8) {
        z(this.f24507e, i8);
    }

    public void setInsetTop(int i8) {
        z(i8, this.f24508f);
    }

    void t(k kVar) {
        this.f24504b = kVar;
        B(kVar);
    }

    void u(boolean z8) {
        this.f24516n = z8;
        C();
    }

    void v(ColorStateList colorStateList) {
        if (this.f24513k != colorStateList) {
            this.f24513k = colorStateList;
            C();
        }
    }

    void w(int i8) {
        if (this.f24510h != i8) {
            this.f24510h = i8;
            C();
        }
    }

    void x(ColorStateList colorStateList) {
        if (this.f24512j != colorStateList) {
            this.f24512j = colorStateList;
            if (c() != null) {
                androidx.core.graphics.drawable.a.setTintList(c(), this.f24512j);
            }
        }
    }

    void y(PorterDuff.Mode mode) {
        if (this.f24511i != mode) {
            this.f24511i = mode;
            if (c() == null || this.f24511i == null) {
                return;
            }
            androidx.core.graphics.drawable.a.setTintMode(c(), this.f24511i);
        }
    }
}
