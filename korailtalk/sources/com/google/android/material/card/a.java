package com.google.android.material.card;

import J2.k;
import J2.l;
import a3.h;
import a3.o;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.cardview.widget.CardView;
import c3.AbstractC1090a;
import i.AbstractC5638a;

/* loaded from: classes2.dex */
public class a extends CardView implements Checkable, o {

    /* renamed from: n */
    private static final int[] f24522n = {R.attr.state_checkable};

    /* renamed from: o */
    private static final int[] f24523o = {R.attr.state_checked};

    /* renamed from: p */
    private static final int[] f24524p = {J2.b.state_dragged};

    /* renamed from: q */
    private static final int f24525q = k.Widget_MaterialComponents_CardView;

    /* renamed from: j */
    private final b f24526j;

    /* renamed from: k */
    private boolean f24527k;

    /* renamed from: l */
    private boolean f24528l;

    /* renamed from: m */
    private boolean f24529m;

    /* renamed from: com.google.android.material.card.a$a */
    public interface InterfaceC0196a {
    }

    public a(Context context) {
        this(context, null);
    }

    private void e() {
        if (Build.VERSION.SDK_INT > 26) {
            this.f24526j.j();
        }
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.f24526j.k().getBounds());
        return rectF;
    }

    void f(int i8, int i9, int i10, int i11) {
        super.setContentPadding(i8, i9, i10, i11);
    }

    @Override // androidx.cardview.widget.CardView
    public ColorStateList getCardBackgroundColor() {
        return this.f24526j.l();
    }

    public ColorStateList getCardForegroundColor() {
        return this.f24526j.m();
    }

    float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.f24526j.n();
    }

    public int getCheckedIconMargin() {
        return this.f24526j.o();
    }

    public int getCheckedIconSize() {
        return this.f24526j.p();
    }

    public ColorStateList getCheckedIconTint() {
        return this.f24526j.q();
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.f24526j.A().bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.f24526j.A().left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.f24526j.A().right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.f24526j.A().top;
    }

    public float getProgress() {
        return this.f24526j.u();
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.f24526j.s();
    }

    public ColorStateList getRippleColor() {
        return this.f24526j.v();
    }

    @Override // a3.o
    public a3.k getShapeAppearanceModel() {
        return this.f24526j.w();
    }

    @Deprecated
    public int getStrokeColor() {
        return this.f24526j.x();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.f24526j.y();
    }

    public int getStrokeWidth() {
        return this.f24526j.z();
    }

    public boolean isCheckable() {
        b bVar = this.f24526j;
        return bVar != null && bVar.D();
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f24528l;
    }

    public boolean isDragged() {
        return this.f24529m;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.setParentAbsoluteElevation(this, this.f24526j.k());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i8) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i8 + 3);
        if (isCheckable()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f24522n);
        }
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f24523o);
        }
        if (isDragged()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f24524p);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(isCheckable());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i8, int i9) {
        super.onMeasure(i8, i9);
        this.f24526j.F(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f24527k) {
            if (!this.f24526j.C()) {
                this.f24526j.G(true);
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i8) {
        this.f24526j.H(ColorStateList.valueOf(i8));
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f8) {
        super.setCardElevation(f8);
        this.f24526j.Z();
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        this.f24526j.I(colorStateList);
    }

    public void setCheckable(boolean z8) {
        this.f24526j.J(z8);
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z8) {
        if (this.f24528l != z8) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.f24526j.K(drawable);
    }

    public void setCheckedIconMargin(int i8) {
        this.f24526j.L(i8);
    }

    public void setCheckedIconMarginResource(int i8) {
        if (i8 != -1) {
            this.f24526j.L(getResources().getDimensionPixelSize(i8));
        }
    }

    public void setCheckedIconResource(int i8) {
        this.f24526j.K(AbstractC5638a.getDrawable(getContext(), i8));
    }

    public void setCheckedIconSize(int i8) {
        this.f24526j.M(i8);
    }

    public void setCheckedIconSizeResource(int i8) {
        if (i8 != 0) {
            this.f24526j.M(getResources().getDimensionPixelSize(i8));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        this.f24526j.N(colorStateList);
    }

    @Override // android.view.View
    public void setClickable(boolean z8) {
        super.setClickable(z8);
        b bVar = this.f24526j;
        if (bVar != null) {
            bVar.X();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setContentPadding(int i8, int i9, int i10, int i11) {
        this.f24526j.U(i8, i9, i10, i11);
    }

    public void setDragged(boolean z8) {
        if (this.f24529m != z8) {
            this.f24529m = z8;
            refreshDrawableState();
            e();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f8) {
        super.setMaxCardElevation(f8);
        this.f24526j.b0();
    }

    public void setOnCheckedChangeListener(InterfaceC0196a interfaceC0196a) {
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z8) {
        super.setPreventCornerOverlap(z8);
        this.f24526j.b0();
        this.f24526j.Y();
    }

    public void setProgress(float f8) {
        this.f24526j.P(f8);
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f8) {
        super.setRadius(f8);
        this.f24526j.O(f8);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        this.f24526j.Q(colorStateList);
    }

    public void setRippleColorResource(int i8) {
        this.f24526j.Q(AbstractC5638a.getColorStateList(getContext(), i8));
    }

    @Override // a3.o
    public void setShapeAppearanceModel(a3.k kVar) {
        setClipToOutline(kVar.isRoundRect(getBoundsAsRectF()));
        this.f24526j.R(kVar);
    }

    public void setStrokeColor(int i8) {
        this.f24526j.S(ColorStateList.valueOf(i8));
    }

    public void setStrokeWidth(int i8) {
        this.f24526j.T(i8);
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z8) {
        super.setUseCompatPadding(z8);
        this.f24526j.b0();
        this.f24526j.Y();
    }

    @Override // android.widget.Checkable
    public void toggle() {
        if (isCheckable() && isEnabled()) {
            this.f24528l = !this.f24528l;
            refreshDrawableState();
            e();
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, J2.b.materialCardViewStyle);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.f24526j.H(colorStateList);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f24526j.S(colorStateList);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(Context context, AttributeSet attributeSet, int i8) {
        int i9 = f24525q;
        super(AbstractC1090a.wrap(context, attributeSet, i8, i9), attributeSet, i8);
        this.f24528l = false;
        this.f24529m = false;
        this.f24527k = true;
        TypedArray typedArrayObtainStyledAttributes = com.google.android.material.internal.k.obtainStyledAttributes(getContext(), attributeSet, l.MaterialCardView, i8, i9, new int[0]);
        b bVar = new b(this, attributeSet, i8, i9);
        this.f24526j = bVar;
        bVar.H(super.getCardBackgroundColor());
        bVar.U(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        bVar.E(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }
}
