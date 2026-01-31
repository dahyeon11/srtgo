package com.google.android.material.button;

import J2.k;
import J2.l;
import a3.o;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.C0846f;
import androidx.core.view.AbstractC0985p0;
import androidx.core.widget.h;
import c0.AbstractC1087a;
import c3.AbstractC1090a;
import i.AbstractC5638a;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes2.dex */
public class MaterialButton extends C0846f implements Checkable, o {
    public static final int ICON_GRAVITY_END = 3;
    public static final int ICON_GRAVITY_START = 1;
    public static final int ICON_GRAVITY_TEXT_END = 4;
    public static final int ICON_GRAVITY_TEXT_START = 2;
    public static final int ICON_GRAVITY_TEXT_TOP = 32;
    public static final int ICON_GRAVITY_TOP = 16;

    /* renamed from: p */
    private static final int[] f24464p = {R.attr.state_checkable};

    /* renamed from: q */
    private static final int[] f24465q = {R.attr.state_checked};

    /* renamed from: r */
    private static final int f24466r = k.Widget_MaterialComponents_Button;

    /* renamed from: c */
    private final com.google.android.material.button.a f24467c;

    /* renamed from: d */
    private final LinkedHashSet f24468d;

    /* renamed from: e */
    private b f24469e;

    /* renamed from: f */
    private PorterDuff.Mode f24470f;

    /* renamed from: g */
    private ColorStateList f24471g;

    /* renamed from: h */
    private Drawable f24472h;

    /* renamed from: i */
    private int f24473i;

    /* renamed from: j */
    private int f24474j;

    /* renamed from: k */
    private int f24475k;

    /* renamed from: l */
    private int f24476l;

    /* renamed from: m */
    private boolean f24477m;

    /* renamed from: n */
    private boolean f24478n;

    /* renamed from: o */
    private int f24479o;

    public interface a {
        void onCheckedChanged(MaterialButton materialButton, boolean z8);
    }

    interface b {
        void onPressedChanged(MaterialButton materialButton, boolean z8);
    }

    static class c extends AbstractC1087a {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: b */
        boolean f24480b;

        static class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public c[] newArray(int i8) {
                return new c[i8];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public c createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new c(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public c createFromParcel(Parcel parcel) {
                return new c(parcel, null);
            }
        }

        public c(Parcelable parcelable) {
            super(parcelable);
        }

        private void b(Parcel parcel) {
            this.f24480b = parcel.readInt() == 1;
        }

        @Override // c0.AbstractC1087a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            super.writeToParcel(parcel, i8);
            parcel.writeInt(this.f24480b ? 1 : 0);
        }

        public c(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            b(parcel);
        }
    }

    public MaterialButton(Context context) {
        this(context, null);
    }

    private boolean a() {
        int i8 = this.f24479o;
        return i8 == 3 || i8 == 4;
    }

    private boolean b() {
        int i8 = this.f24479o;
        return i8 == 1 || i8 == 2;
    }

    private boolean c() {
        int i8 = this.f24479o;
        return i8 == 16 || i8 == 32;
    }

    private boolean d() {
        return AbstractC0985p0.getLayoutDirection(this) == 1;
    }

    private boolean e() {
        com.google.android.material.button.a aVar = this.f24467c;
        return (aVar == null || aVar.l()) ? false : true;
    }

    private void f() {
        if (b()) {
            h.setCompoundDrawablesRelative(this, this.f24472h, null, null, null);
        } else if (a()) {
            h.setCompoundDrawablesRelative(this, null, null, this.f24472h, null);
        } else if (c()) {
            h.setCompoundDrawablesRelative(this, null, this.f24472h, null, null);
        }
    }

    private void g(boolean z8) {
        Drawable drawable = this.f24472h;
        if (drawable != null) {
            Drawable drawableMutate = androidx.core.graphics.drawable.a.wrap(drawable).mutate();
            this.f24472h = drawableMutate;
            androidx.core.graphics.drawable.a.setTintList(drawableMutate, this.f24471g);
            PorterDuff.Mode mode = this.f24470f;
            if (mode != null) {
                androidx.core.graphics.drawable.a.setTintMode(this.f24472h, mode);
            }
            int intrinsicWidth = this.f24473i;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f24472h.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f24473i;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f24472h.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f24472h;
            int i8 = this.f24474j;
            int i9 = this.f24475k;
            drawable2.setBounds(i8, i9, intrinsicWidth + i8, intrinsicHeight + i9);
        }
        if (z8) {
            f();
            return;
        }
        Drawable[] compoundDrawablesRelative = h.getCompoundDrawablesRelative(this);
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        if ((!b() || drawable3 == this.f24472h) && ((!a() || drawable5 == this.f24472h) && (!c() || drawable4 == this.f24472h))) {
            return;
        }
        f();
    }

    private String getA11yClassName() {
        return (isCheckable() ? CompoundButton.class : Button.class).getName();
    }

    private int getTextHeight() {
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextWidth() {
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        return Math.min((int) paint.measureText(string), getLayout().getEllipsizedWidth());
    }

    private void h(int i8, int i9) {
        if (this.f24472h == null || getLayout() == null) {
            return;
        }
        if (!b() && !a()) {
            if (c()) {
                this.f24474j = 0;
                if (this.f24479o == 16) {
                    this.f24475k = 0;
                    g(false);
                    return;
                }
                int intrinsicHeight = this.f24473i;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.f24472h.getIntrinsicHeight();
                }
                int textHeight = (((((i9 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.f24476l) - getPaddingBottom()) / 2;
                if (this.f24475k != textHeight) {
                    this.f24475k = textHeight;
                    g(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f24475k = 0;
        int i10 = this.f24479o;
        if (i10 == 1 || i10 == 3) {
            this.f24474j = 0;
            g(false);
            return;
        }
        int intrinsicWidth = this.f24473i;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.f24472h.getIntrinsicWidth();
        }
        int textWidth = (((((i8 - getTextWidth()) - AbstractC0985p0.getPaddingEnd(this)) - intrinsicWidth) - this.f24476l) - AbstractC0985p0.getPaddingStart(this)) / 2;
        if (d() != (this.f24479o == 4)) {
            textWidth = -textWidth;
        }
        if (this.f24474j != textWidth) {
            this.f24474j = textWidth;
            g(false);
        }
    }

    public void addOnCheckedChangeListener(a aVar) {
        this.f24468d.add(aVar);
    }

    public void clearOnCheckedChangeListeners() {
        this.f24468d.clear();
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (e()) {
            return this.f24467c.b();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f24472h;
    }

    public int getIconGravity() {
        return this.f24479o;
    }

    public int getIconPadding() {
        return this.f24476l;
    }

    public int getIconSize() {
        return this.f24473i;
    }

    public ColorStateList getIconTint() {
        return this.f24471g;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f24470f;
    }

    public int getInsetBottom() {
        return this.f24467c.getInsetBottom();
    }

    public int getInsetTop() {
        return this.f24467c.getInsetTop();
    }

    public ColorStateList getRippleColor() {
        if (e()) {
            return this.f24467c.e();
        }
        return null;
    }

    @Override // a3.o
    public a3.k getShapeAppearanceModel() {
        if (e()) {
            return this.f24467c.f();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (e()) {
            return this.f24467c.g();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (e()) {
            return this.f24467c.h();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.C0846f, androidx.core.view.InterfaceC0973l0
    public ColorStateList getSupportBackgroundTintList() {
        return e() ? this.f24467c.i() : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.C0846f, androidx.core.view.InterfaceC0973l0
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return e() ? this.f24467c.j() : super.getSupportBackgroundTintMode();
    }

    public boolean isCheckable() {
        com.google.android.material.button.a aVar = this.f24467c;
        return aVar != null && aVar.m();
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f24477m;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (e()) {
            a3.h.setParentAbsoluteElevation(this, this.f24467c.c());
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i8) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i8 + 2);
        if (isCheckable()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f24464p);
        }
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f24465q);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.C0846f, android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.C0846f, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(isCheckable());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.C0846f, android.widget.TextView, android.view.View
    protected void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        super.onLayout(z8, i8, i9, i10, i11);
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.getSuperState());
        setChecked(cVar.f24480b);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.f24480b = this.f24477m;
        return cVar;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i8, int i9, int i10, int i11) {
        super.onSizeChanged(i8, i9, i10, i11);
        h(i8, i9);
    }

    @Override // androidx.appcompat.widget.C0846f, android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        super.onTextChanged(charSequence, i8, i9, i10);
        h(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    public void removeOnCheckedChangeListener(a aVar) {
        this.f24468d.remove(aVar);
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i8) {
        if (e()) {
            this.f24467c.o(i8);
        } else {
            super.setBackgroundColor(i8);
        }
    }

    @Override // androidx.appcompat.widget.C0846f, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!e()) {
            super.setBackgroundDrawable(drawable);
        } else {
            if (drawable == getBackground()) {
                getBackground().setState(drawable.getState());
                return;
            }
            Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
            this.f24467c.p();
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // androidx.appcompat.widget.C0846f, android.view.View
    public void setBackgroundResource(int i8) {
        setBackgroundDrawable(i8 != 0 ? AbstractC5638a.getDrawable(getContext(), i8) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z8) {
        if (e()) {
            this.f24467c.q(z8);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z8) {
        if (isCheckable() && isEnabled() && this.f24477m != z8) {
            this.f24477m = z8;
            refreshDrawableState();
            if (this.f24478n) {
                return;
            }
            this.f24478n = true;
            Iterator it = this.f24468d.iterator();
            while (it.hasNext()) {
                ((a) it.next()).onCheckedChanged(this, this.f24477m);
            }
            this.f24478n = false;
        }
    }

    public void setCornerRadius(int i8) {
        if (e()) {
            this.f24467c.r(i8);
        }
    }

    public void setCornerRadiusResource(int i8) {
        if (e()) {
            setCornerRadius(getResources().getDimensionPixelSize(i8));
        }
    }

    @Override // android.view.View
    public void setElevation(float f8) {
        super.setElevation(f8);
        if (e()) {
            this.f24467c.c().setElevation(f8);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f24472h != drawable) {
            this.f24472h = drawable;
            g(true);
            h(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i8) {
        if (this.f24479o != i8) {
            this.f24479o = i8;
            h(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i8) {
        if (this.f24476l != i8) {
            this.f24476l = i8;
            setCompoundDrawablePadding(i8);
        }
    }

    public void setIconResource(int i8) {
        setIcon(i8 != 0 ? AbstractC5638a.getDrawable(getContext(), i8) : null);
    }

    public void setIconSize(int i8) {
        if (i8 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f24473i != i8) {
            this.f24473i = i8;
            g(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f24471g != colorStateList) {
            this.f24471g = colorStateList;
            g(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f24470f != mode) {
            this.f24470f = mode;
            g(false);
        }
    }

    public void setIconTintResource(int i8) {
        setIconTint(AbstractC5638a.getColorStateList(getContext(), i8));
    }

    public void setInsetBottom(int i8) {
        this.f24467c.setInsetBottom(i8);
    }

    public void setInsetTop(int i8) {
        this.f24467c.setInsetTop(i8);
    }

    void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    void setOnPressedChangeListenerInternal(b bVar) {
        this.f24469e = bVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z8) {
        b bVar = this.f24469e;
        if (bVar != null) {
            bVar.onPressedChanged(this, z8);
        }
        super.setPressed(z8);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (e()) {
            this.f24467c.s(colorStateList);
        }
    }

    public void setRippleColorResource(int i8) {
        if (e()) {
            setRippleColor(AbstractC5638a.getColorStateList(getContext(), i8));
        }
    }

    @Override // a3.o
    public void setShapeAppearanceModel(a3.k kVar) {
        if (!e()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f24467c.t(kVar);
    }

    void setShouldDrawSurfaceColorStroke(boolean z8) {
        if (e()) {
            this.f24467c.u(z8);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (e()) {
            this.f24467c.v(colorStateList);
        }
    }

    public void setStrokeColorResource(int i8) {
        if (e()) {
            setStrokeColor(AbstractC5638a.getColorStateList(getContext(), i8));
        }
    }

    public void setStrokeWidth(int i8) {
        if (e()) {
            this.f24467c.w(i8);
        }
    }

    public void setStrokeWidthResource(int i8) {
        if (e()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i8));
        }
    }

    @Override // androidx.appcompat.widget.C0846f, androidx.core.view.InterfaceC0973l0
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (e()) {
            this.f24467c.x(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // androidx.appcompat.widget.C0846f, androidx.core.view.InterfaceC0973l0
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (e()) {
            this.f24467c.y(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f24477m);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, J2.b.materialButtonStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButton(Context context, AttributeSet attributeSet, int i8) {
        int i9 = f24466r;
        super(AbstractC1090a.wrap(context, attributeSet, i8, i9), attributeSet, i8);
        this.f24468d = new LinkedHashSet();
        this.f24477m = false;
        this.f24478n = false;
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = com.google.android.material.internal.k.obtainStyledAttributes(context2, attributeSet, l.MaterialButton, i8, i9, new int[0]);
        this.f24476l = typedArrayObtainStyledAttributes.getDimensionPixelSize(l.MaterialButton_iconPadding, 0);
        this.f24470f = com.google.android.material.internal.o.parseTintMode(typedArrayObtainStyledAttributes.getInt(l.MaterialButton_iconTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.f24471g = X2.c.getColorStateList(getContext(), typedArrayObtainStyledAttributes, l.MaterialButton_iconTint);
        this.f24472h = X2.c.getDrawable(getContext(), typedArrayObtainStyledAttributes, l.MaterialButton_icon);
        this.f24479o = typedArrayObtainStyledAttributes.getInteger(l.MaterialButton_iconGravity, 1);
        this.f24473i = typedArrayObtainStyledAttributes.getDimensionPixelSize(l.MaterialButton_iconSize, 0);
        com.google.android.material.button.a aVar = new com.google.android.material.button.a(this, a3.k.builder(context2, attributeSet, i8, i9).build());
        this.f24467c = aVar;
        aVar.n(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        setCompoundDrawablePadding(this.f24476l);
        g(this.f24472h != null);
    }
}
