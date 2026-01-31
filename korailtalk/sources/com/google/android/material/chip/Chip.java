package com.google.android.material.chip;

import J2.j;
import J2.k;
import J2.l;
import K2.h;
import X2.d;
import X2.f;
import a3.o;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.C0847g;
import androidx.core.view.AbstractC0985p0;
import androidx.core.view.accessibility.H;
import c3.AbstractC1090a;
import com.google.android.material.chip.a;
import d0.AbstractC5299a;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/* loaded from: classes2.dex */
public class Chip extends C0847g implements a.InterfaceC0197a, o {

    /* renamed from: t, reason: collision with root package name */
    private static final int f24552t = k.Widget_MaterialComponents_Chip_Action;

    /* renamed from: u, reason: collision with root package name */
    private static final Rect f24553u = new Rect();

    /* renamed from: v, reason: collision with root package name */
    private static final int[] f24554v = {R.attr.state_selected};

    /* renamed from: w, reason: collision with root package name */
    private static final int[] f24555w = {R.attr.state_checkable};

    /* renamed from: d, reason: collision with root package name */
    private com.google.android.material.chip.a f24556d;

    /* renamed from: e, reason: collision with root package name */
    private InsetDrawable f24557e;

    /* renamed from: f, reason: collision with root package name */
    private RippleDrawable f24558f;

    /* renamed from: g, reason: collision with root package name */
    private View.OnClickListener f24559g;

    /* renamed from: h, reason: collision with root package name */
    private CompoundButton.OnCheckedChangeListener f24560h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f24561i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f24562j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f24563k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f24564l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f24565m;

    /* renamed from: n, reason: collision with root package name */
    private int f24566n;

    /* renamed from: o, reason: collision with root package name */
    private int f24567o;

    /* renamed from: p, reason: collision with root package name */
    private final c f24568p;

    /* renamed from: q, reason: collision with root package name */
    private final Rect f24569q;

    /* renamed from: r, reason: collision with root package name */
    private final RectF f24570r;

    /* renamed from: s, reason: collision with root package name */
    private final f f24571s;

    class a extends f {
        a() {
        }

        @Override // X2.f
        public void onFontRetrievalFailed(int i8) {
        }

        @Override // X2.f
        public void onFontRetrieved(Typeface typeface, boolean z8) {
            Chip chip = Chip.this;
            chip.setText(chip.f24556d.j0() ? Chip.this.f24556d.getText() : Chip.this.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    class b extends ViewOutlineProvider {
        b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (Chip.this.f24556d != null) {
                Chip.this.f24556d.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    private class c extends AbstractC5299a {
        c(Chip chip) {
            super(chip);
        }

        @Override // d0.AbstractC5299a
        protected int n(float f8, float f9) {
            return (Chip.this.l() && Chip.this.getCloseIconTouchBounds().contains(f8, f9)) ? 1 : 0;
        }

        @Override // d0.AbstractC5299a
        protected void o(List list) {
            list.add(0);
            if (Chip.this.l() && Chip.this.isCloseIconVisible() && Chip.this.f24559g != null) {
                list.add(1);
            }
        }

        @Override // d0.AbstractC5299a
        protected boolean u(int i8, int i9, Bundle bundle) {
            if (i9 != 16) {
                return false;
            }
            if (i8 == 0) {
                return Chip.this.performClick();
            }
            if (i8 == 1) {
                return Chip.this.performCloseIconClick();
            }
            return false;
        }

        @Override // d0.AbstractC5299a
        protected void x(H h8) {
            h8.setCheckable(Chip.this.isCheckable());
            h8.setClickable(Chip.this.isClickable());
            if (Chip.this.isCheckable() || Chip.this.isClickable()) {
                h8.setClassName(Chip.this.isCheckable() ? "android.widget.CompoundButton" : "android.widget.Button");
            } else {
                h8.setClassName("android.view.View");
            }
            h8.setText(Chip.this.getText());
        }

        @Override // d0.AbstractC5299a
        protected void y(int i8, H h8) {
            if (i8 != 1) {
                h8.setContentDescription("");
                h8.setBoundsInParent(Chip.f24553u);
                return;
            }
            CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                h8.setContentDescription(closeIconContentDescription);
            } else {
                CharSequence text = Chip.this.getText();
                h8.setContentDescription(Chip.this.getContext().getString(j.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
            }
            h8.setBoundsInParent(Chip.this.getCloseIconTouchBoundsInt());
            h8.addAction(H.a.ACTION_CLICK);
            h8.setEnabled(Chip.this.isEnabled());
        }

        @Override // d0.AbstractC5299a
        protected void z(int i8, boolean z8) {
            if (i8 == 1) {
                Chip.this.f24564l = z8;
                Chip.this.refreshDrawableState();
            }
        }
    }

    public Chip(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.f24570r.setEmpty();
        if (l() && this.f24559g != null) {
            this.f24556d.getCloseIconTouchBounds(this.f24570r);
        }
        return this.f24570r;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f24569q.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f24569q;
    }

    private d getTextAppearance() {
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            return aVar.getTextAppearance();
        }
        return null;
    }

    private void h(com.google.android.material.chip.a aVar) {
        aVar.setDelegate(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    private int[] i() {
        ?? IsEnabled = isEnabled();
        int i8 = IsEnabled;
        if (this.f24564l) {
            i8 = IsEnabled + 1;
        }
        int i9 = i8;
        if (this.f24563k) {
            i9 = i8 + 1;
        }
        int i10 = i9;
        if (this.f24562j) {
            i10 = i9 + 1;
        }
        int i11 = i10;
        if (isChecked()) {
            i11 = i10 + 1;
        }
        int[] iArr = new int[i11];
        int i12 = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i12 = 1;
        }
        if (this.f24564l) {
            iArr[i12] = 16842908;
            i12++;
        }
        if (this.f24563k) {
            iArr[i12] = 16843623;
            i12++;
        }
        if (this.f24562j) {
            iArr[i12] = 16842919;
            i12++;
        }
        if (isChecked()) {
            iArr[i12] = 16842913;
        }
        return iArr;
    }

    private void j() {
        if (getBackgroundDrawable() == this.f24557e && this.f24556d.getCallback() == null) {
            this.f24556d.setCallback(this.f24557e);
        }
    }

    private boolean k(MotionEvent motionEvent) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (motionEvent.getAction() != 10) {
            return false;
        }
        try {
            Field declaredField = AbstractC5299a.class.getDeclaredField("m");
            declaredField.setAccessible(true);
            if (((Integer) declaredField.get(this.f24568p)).intValue() == Integer.MIN_VALUE) {
                return false;
            }
            Method declaredMethod = AbstractC5299a.class.getDeclaredMethod("E", Integer.TYPE);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(this.f24568p, Integer.MIN_VALUE);
            return true;
        } catch (IllegalAccessException e8) {
            Log.e("Chip", "Unable to send Accessibility Exit event", e8);
            return false;
        } catch (NoSuchFieldException e9) {
            Log.e("Chip", "Unable to send Accessibility Exit event", e9);
            return false;
        } catch (NoSuchMethodException e10) {
            Log.e("Chip", "Unable to send Accessibility Exit event", e10);
            return false;
        } catch (InvocationTargetException e11) {
            Log.e("Chip", "Unable to send Accessibility Exit event", e11);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean l() {
        com.google.android.material.chip.a aVar = this.f24556d;
        return (aVar == null || aVar.getCloseIcon() == null) ? false : true;
    }

    private void m(Context context, AttributeSet attributeSet, int i8) {
        TypedArray typedArrayObtainStyledAttributes = com.google.android.material.internal.k.obtainStyledAttributes(context, attributeSet, l.Chip, i8, f24552t, new int[0]);
        this.f24565m = typedArrayObtainStyledAttributes.getBoolean(l.Chip_ensureMinTouchTargetSize, false);
        this.f24567o = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(l.Chip_chipMinTouchTargetSize, (float) Math.ceil(com.google.android.material.internal.o.dpToPx(getContext(), 48))));
        typedArrayObtainStyledAttributes.recycle();
    }

    private void n() {
        setOutlineProvider(new b());
    }

    private void o(int i8, int i9, int i10, int i11) {
        this.f24557e = new InsetDrawable((Drawable) this.f24556d, i8, i9, i10, i11);
    }

    private void p() {
        if (this.f24557e != null) {
            this.f24557e = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            s();
        }
    }

    private void q(com.google.android.material.chip.a aVar) {
        if (aVar != null) {
            aVar.setDelegate(null);
        }
    }

    private void r() {
        if (l() && isCloseIconVisible() && this.f24559g != null) {
            AbstractC0985p0.setAccessibilityDelegate(this, this.f24568p);
        } else {
            AbstractC0985p0.setAccessibilityDelegate(this, null);
        }
    }

    private void s() {
        if (Y2.b.USE_FRAMEWORK_RIPPLE) {
            t();
            return;
        }
        this.f24556d.setUseCompatRipple(true);
        AbstractC0985p0.setBackground(this, getBackgroundDrawable());
        u();
        j();
    }

    private void setCloseIconHovered(boolean z8) {
        if (this.f24563k != z8) {
            this.f24563k = z8;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z8) {
        if (this.f24562j != z8) {
            this.f24562j = z8;
            refreshDrawableState();
        }
    }

    private void t() {
        this.f24558f = new RippleDrawable(Y2.b.sanitizeRippleDrawableColor(this.f24556d.getRippleColor()), getBackgroundDrawable(), null);
        this.f24556d.setUseCompatRipple(false);
        AbstractC0985p0.setBackground(this, this.f24558f);
        u();
    }

    private void u() {
        com.google.android.material.chip.a aVar;
        if (TextUtils.isEmpty(getText()) || (aVar = this.f24556d) == null) {
            return;
        }
        int chipEndPadding = (int) (aVar.getChipEndPadding() + this.f24556d.getTextEndPadding() + this.f24556d.J());
        int chipStartPadding = (int) (this.f24556d.getChipStartPadding() + this.f24556d.getTextStartPadding() + this.f24556d.F());
        if (this.f24557e != null) {
            Rect rect = new Rect();
            this.f24557e.getPadding(rect);
            chipStartPadding += rect.left;
            chipEndPadding += rect.right;
        }
        AbstractC0985p0.setPaddingRelative(this, chipStartPadding, getPaddingTop(), chipEndPadding, getPaddingBottom());
    }

    private void v() {
        TextPaint paint = getPaint();
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.updateDrawState(getContext(), paint, this.f24571s);
        }
    }

    private void w(AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        }
    }

    @Override // android.view.View
    protected boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return k(motionEvent) || this.f24568p.dispatchHoverEvent(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f24568p.dispatchKeyEvent(keyEvent) || this.f24568p.getKeyboardFocusedVirtualViewId() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // androidx.appcompat.widget.C0847g, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        com.google.android.material.chip.a aVar = this.f24556d;
        if ((aVar == null || !aVar.isCloseIconStateful()) ? false : this.f24556d.setCloseIconState(i())) {
            invalidate();
        }
    }

    public boolean ensureAccessibleTouchTarget(int i8) {
        this.f24567o = i8;
        if (!shouldEnsureMinTouchTargetSize()) {
            if (this.f24557e != null) {
                p();
            } else {
                s();
            }
            return false;
        }
        int iMax = Math.max(0, i8 - this.f24556d.getIntrinsicHeight());
        int iMax2 = Math.max(0, i8 - this.f24556d.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            if (this.f24557e != null) {
                p();
            } else {
                s();
            }
            return false;
        }
        int i9 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i10 = iMax > 0 ? iMax / 2 : 0;
        if (this.f24557e != null) {
            Rect rect = new Rect();
            this.f24557e.getPadding(rect);
            if (rect.top == i10 && rect.bottom == i10 && rect.left == i9 && rect.right == i9) {
                s();
                return true;
            }
        }
        if (getMinHeight() != i8) {
            setMinHeight(i8);
        }
        if (getMinWidth() != i8) {
            setMinWidth(i8);
        }
        o(i9, i10, i9, i10);
        s();
        return true;
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f24557e;
        return insetDrawable == null ? this.f24556d : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            return aVar.getCheckedIcon();
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            return aVar.getCheckedIconTint();
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            return aVar.getChipBackgroundColor();
        }
        return null;
    }

    public float getChipCornerRadius() {
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            return Math.max(0.0f, aVar.getChipCornerRadius());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f24556d;
    }

    public float getChipEndPadding() {
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            return aVar.getChipEndPadding();
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            return aVar.getChipIcon();
        }
        return null;
    }

    public float getChipIconSize() {
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            return aVar.getChipIconSize();
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            return aVar.getChipIconTint();
        }
        return null;
    }

    public float getChipMinHeight() {
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            return aVar.getChipMinHeight();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            return aVar.getChipStartPadding();
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            return aVar.getChipStrokeColor();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            return aVar.getChipStrokeWidth();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            return aVar.getCloseIcon();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            return aVar.getCloseIconContentDescription();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            return aVar.getCloseIconEndPadding();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            return aVar.getCloseIconSize();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            return aVar.getCloseIconStartPadding();
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            return aVar.getCloseIconTint();
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            return aVar.getEllipsize();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        if (this.f24568p.getKeyboardFocusedVirtualViewId() == 1 || this.f24568p.getAccessibilityFocusedVirtualViewId() == 1) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public h getHideMotionSpec() {
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            return aVar.getHideMotionSpec();
        }
        return null;
    }

    public float getIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            return aVar.getIconEndPadding();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            return aVar.getIconStartPadding();
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            return aVar.getRippleColor();
        }
        return null;
    }

    @Override // a3.o
    public a3.k getShapeAppearanceModel() {
        return this.f24556d.getShapeAppearanceModel();
    }

    public h getShowMotionSpec() {
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            return aVar.getShowMotionSpec();
        }
        return null;
    }

    public float getTextEndPadding() {
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            return aVar.getTextEndPadding();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            return aVar.getTextStartPadding();
        }
        return 0.0f;
    }

    public boolean isCheckable() {
        com.google.android.material.chip.a aVar = this.f24556d;
        return aVar != null && aVar.isCheckable();
    }

    @Deprecated
    public boolean isCheckedIconEnabled() {
        return isCheckedIconVisible();
    }

    public boolean isCheckedIconVisible() {
        com.google.android.material.chip.a aVar = this.f24556d;
        return aVar != null && aVar.isCheckedIconVisible();
    }

    @Deprecated
    public boolean isChipIconEnabled() {
        return isChipIconVisible();
    }

    public boolean isChipIconVisible() {
        com.google.android.material.chip.a aVar = this.f24556d;
        return aVar != null && aVar.isChipIconVisible();
    }

    @Deprecated
    public boolean isCloseIconEnabled() {
        return isCloseIconVisible();
    }

    public boolean isCloseIconVisible() {
        com.google.android.material.chip.a aVar = this.f24556d;
        return aVar != null && aVar.isCloseIconVisible();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3.h.setParentAbsoluteElevation(this, this.f24556d);
    }

    @Override // com.google.android.material.chip.a.InterfaceC0197a
    public void onChipDrawableSizeChange() {
        ensureAccessibleTouchTarget(this.f24567o);
        requestLayout();
        invalidateOutline();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i8) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i8 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f24554v);
        }
        if (isCheckable()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f24555w);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean z8, int i8, Rect rect) {
        super.onFocusChanged(z8, i8, rect);
        this.f24568p.onFocusChanged(z8, i8, rect);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (isCheckable() || isClickable()) {
            accessibilityNodeInfo.setClassName(isCheckable() ? "android.widget.CompoundButton" : "android.widget.Button");
        } else {
            accessibilityNodeInfo.setClassName("android.view.View");
        }
        accessibilityNodeInfo.setCheckable(isCheckable());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            H.wrap(accessibilityNodeInfo).setCollectionItemInfo(H.f.obtain(chipGroup.getRowIndex(this), 1, chipGroup.isSingleLine() ? chipGroup.k(this) : -1, 1, false, isChecked()));
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i8) {
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), 1002);
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void onRtlPropertiesChanged(int i8) {
        super.onRtlPropertiesChanged(i8);
        if (this.f24566n != i8) {
            this.f24566n = i8;
            u();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r0 != 3) goto L22;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L3a
            if (r0 == r2) goto L2c
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L35
            goto L40
        L21:
            boolean r0 = r5.f24562j
            if (r0 == 0) goto L40
            if (r1 != 0) goto L2a
            r5.setCloseIconPressed(r3)
        L2a:
            r0 = r2
            goto L41
        L2c:
            boolean r0 = r5.f24562j
            if (r0 == 0) goto L35
            r5.performCloseIconClick()
            r0 = r2
            goto L36
        L35:
            r0 = r3
        L36:
            r5.setCloseIconPressed(r3)
            goto L41
        L3a:
            if (r1 == 0) goto L40
            r5.setCloseIconPressed(r2)
            goto L2a
        L40:
            r0 = r3
        L41:
            if (r0 != 0) goto L4b
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L4a
            goto L4b
        L4a:
            r2 = r3
        L4b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean performCloseIconClick() {
        boolean z8 = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f24559g;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z8 = true;
        }
        this.f24568p.sendEventForVirtualView(1, 1);
        return z8;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f24558f) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i8) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.C0847g, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f24558f) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // androidx.appcompat.widget.C0847g, android.view.View
    public void setBackgroundResource(int i8) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z8) {
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            aVar.setCheckable(z8);
        }
    }

    public void setCheckableResource(int i8) {
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            aVar.setCheckableResource(i8);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z8) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar == null) {
            this.f24561i = z8;
            return;
        }
        if (aVar.isCheckable()) {
            boolean zIsChecked = isChecked();
            super.setChecked(z8);
            if (zIsChecked == z8 || (onCheckedChangeListener = this.f24560h) == null) {
                return;
            }
            onCheckedChangeListener.onCheckedChanged(this, z8);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            aVar.setCheckedIcon(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z8) {
        setCheckedIconVisible(z8);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i8) {
        setCheckedIconVisible(i8);
    }

    public void setCheckedIconResource(int i8) {
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            aVar.setCheckedIconResource(i8);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            aVar.setCheckedIconTint(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i8) {
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            aVar.setCheckedIconTintResource(i8);
        }
    }

    public void setCheckedIconVisible(int i8) {
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            aVar.setCheckedIconVisible(i8);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            aVar.setChipBackgroundColor(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i8) {
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            aVar.setChipBackgroundColorResource(i8);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f8) {
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            aVar.setChipCornerRadius(f8);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i8) {
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            aVar.setChipCornerRadiusResource(i8);
        }
    }

    public void setChipDrawable(com.google.android.material.chip.a aVar) {
        com.google.android.material.chip.a aVar2 = this.f24556d;
        if (aVar2 != aVar) {
            q(aVar2);
            this.f24556d = aVar;
            aVar.i0(false);
            h(this.f24556d);
            ensureAccessibleTouchTarget(this.f24567o);
        }
    }

    public void setChipEndPadding(float f8) {
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            aVar.setChipEndPadding(f8);
        }
    }

    public void setChipEndPaddingResource(int i8) {
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            aVar.setChipEndPaddingResource(i8);
        }
    }

    public void setChipIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            aVar.setChipIcon(drawable);
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
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            aVar.setChipIconResource(i8);
        }
    }

    public void setChipIconSize(float f8) {
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            aVar.setChipIconSize(f8);
        }
    }

    public void setChipIconSizeResource(int i8) {
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            aVar.setChipIconSizeResource(i8);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            aVar.setChipIconTint(colorStateList);
        }
    }

    public void setChipIconTintResource(int i8) {
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            aVar.setChipIconTintResource(i8);
        }
    }

    public void setChipIconVisible(int i8) {
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            aVar.setChipIconVisible(i8);
        }
    }

    public void setChipMinHeight(float f8) {
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            aVar.setChipMinHeight(f8);
        }
    }

    public void setChipMinHeightResource(int i8) {
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            aVar.setChipMinHeightResource(i8);
        }
    }

    public void setChipStartPadding(float f8) {
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            aVar.setChipStartPadding(f8);
        }
    }

    public void setChipStartPaddingResource(int i8) {
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            aVar.setChipStartPaddingResource(i8);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            aVar.setChipStrokeColor(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i8) {
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            aVar.setChipStrokeColorResource(i8);
        }
    }

    public void setChipStrokeWidth(float f8) {
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            aVar.setChipStrokeWidth(f8);
        }
    }

    public void setChipStrokeWidthResource(int i8) {
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            aVar.setChipStrokeWidthResource(i8);
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i8) {
        setText(getResources().getString(i8));
    }

    public void setCloseIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            aVar.setCloseIcon(drawable);
        }
        r();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            aVar.setCloseIconContentDescription(charSequence);
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
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            aVar.setCloseIconEndPadding(f8);
        }
    }

    public void setCloseIconEndPaddingResource(int i8) {
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            aVar.setCloseIconEndPaddingResource(i8);
        }
    }

    public void setCloseIconResource(int i8) {
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            aVar.setCloseIconResource(i8);
        }
        r();
    }

    public void setCloseIconSize(float f8) {
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            aVar.setCloseIconSize(f8);
        }
    }

    public void setCloseIconSizeResource(int i8) {
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            aVar.setCloseIconSizeResource(i8);
        }
    }

    public void setCloseIconStartPadding(float f8) {
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            aVar.setCloseIconStartPadding(f8);
        }
    }

    public void setCloseIconStartPaddingResource(int i8) {
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            aVar.setCloseIconStartPaddingResource(i8);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            aVar.setCloseIconTint(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i8) {
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            aVar.setCloseIconTintResource(i8);
        }
    }

    public void setCloseIconVisible(int i8) {
        setCloseIconVisible(getResources().getBoolean(i8));
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i8, int i9, int i10, int i11) {
        if (i8 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i8, i9, i10, i11);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i8, int i9, int i10, int i11) {
        if (i8 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i8, i9, i10, i11);
    }

    @Override // android.view.View
    public void setElevation(float f8) {
        super.setElevation(f8);
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            aVar.setElevation(f8);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f24556d == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            aVar.setEllipsize(truncateAt);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z8) {
        this.f24565m = z8;
        ensureAccessibleTouchTarget(this.f24567o);
    }

    @Override // android.widget.TextView
    public void setGravity(int i8) {
        if (i8 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i8);
        }
    }

    public void setHideMotionSpec(h hVar) {
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            aVar.setHideMotionSpec(hVar);
        }
    }

    public void setHideMotionSpecResource(int i8) {
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            aVar.setHideMotionSpecResource(i8);
        }
    }

    public void setIconEndPadding(float f8) {
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            aVar.setIconEndPadding(f8);
        }
    }

    public void setIconEndPaddingResource(int i8) {
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            aVar.setIconEndPaddingResource(i8);
        }
    }

    public void setIconStartPadding(float f8) {
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            aVar.setIconStartPadding(f8);
        }
    }

    public void setIconStartPaddingResource(int i8) {
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            aVar.setIconStartPaddingResource(i8);
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i8) {
        if (this.f24556d == null) {
            return;
        }
        super.setLayoutDirection(i8);
    }

    @Override // android.widget.TextView
    public void setLines(int i8) {
        if (i8 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i8);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i8) {
        if (i8 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i8);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i8) {
        super.setMaxWidth(i8);
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            aVar.setMaxWidth(i8);
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i8) {
        if (i8 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i8);
    }

    void setOnCheckedChangeListenerInternal(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f24560h = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f24559g = onClickListener;
        r();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            aVar.setRippleColor(colorStateList);
        }
        if (this.f24556d.getUseCompatRipple()) {
            return;
        }
        t();
    }

    public void setRippleColorResource(int i8) {
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            aVar.setRippleColorResource(i8);
            if (this.f24556d.getUseCompatRipple()) {
                return;
            }
            t();
        }
    }

    @Override // a3.o
    public void setShapeAppearanceModel(a3.k kVar) {
        this.f24556d.setShapeAppearanceModel(kVar);
    }

    public void setShowMotionSpec(h hVar) {
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            aVar.setShowMotionSpec(hVar);
        }
    }

    public void setShowMotionSpecResource(int i8) {
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            aVar.setShowMotionSpecResource(i8);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z8) {
        if (!z8) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z8);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(aVar.j0() ? null : charSequence, bufferType);
        com.google.android.material.chip.a aVar2 = this.f24556d;
        if (aVar2 != null) {
            aVar2.setText(charSequence);
        }
    }

    public void setTextAppearance(d dVar) {
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            aVar.setTextAppearance(dVar);
        }
        v();
    }

    public void setTextAppearanceResource(int i8) {
        setTextAppearance(getContext(), i8);
    }

    public void setTextEndPadding(float f8) {
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            aVar.setTextEndPadding(f8);
        }
    }

    public void setTextEndPaddingResource(int i8) {
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            aVar.setTextEndPaddingResource(i8);
        }
    }

    public void setTextStartPadding(float f8) {
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            aVar.setTextStartPadding(f8);
        }
    }

    public void setTextStartPaddingResource(int i8) {
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            aVar.setTextStartPaddingResource(i8);
        }
    }

    public boolean shouldEnsureMinTouchTargetSize() {
        return this.f24565m;
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, J2.b.chipStyle);
    }

    public void setCloseIconVisible(boolean z8) {
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            aVar.setCloseIconVisible(z8);
        }
        r();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Chip(Context context, AttributeSet attributeSet, int i8) {
        int i9 = f24552t;
        super(AbstractC1090a.wrap(context, attributeSet, i8, i9), attributeSet, i8);
        this.f24569q = new Rect();
        this.f24570r = new RectF();
        this.f24571s = new a();
        Context context2 = getContext();
        w(attributeSet);
        com.google.android.material.chip.a aVarCreateFromAttributes = com.google.android.material.chip.a.createFromAttributes(context2, attributeSet, i8, i9);
        m(context2, attributeSet, i8);
        setChipDrawable(aVarCreateFromAttributes);
        aVarCreateFromAttributes.setElevation(AbstractC0985p0.getElevation(this));
        TypedArray typedArrayObtainStyledAttributes = com.google.android.material.internal.k.obtainStyledAttributes(context2, attributeSet, l.Chip, i8, i9, new int[0]);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(l.Chip_shapeAppearance);
        typedArrayObtainStyledAttributes.recycle();
        this.f24568p = new c(this);
        r();
        if (!zHasValue) {
            n();
        }
        setChecked(this.f24561i);
        setText(aVarCreateFromAttributes.getText());
        setEllipsize(aVarCreateFromAttributes.getEllipsize());
        v();
        if (!this.f24556d.j0()) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        u();
        if (shouldEnsureMinTouchTargetSize()) {
            setMinHeight(this.f24567o);
        }
        this.f24566n = AbstractC0985p0.getLayoutDirection(this);
    }

    public void setCheckedIconVisible(boolean z8) {
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            aVar.setCheckedIconVisible(z8);
        }
    }

    public void setChipIconVisible(boolean z8) {
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            aVar.setChipIconVisible(z8);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i8) {
        super.setTextAppearance(context, i8);
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            aVar.setTextAppearanceResource(i8);
        }
        v();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i8) {
        super.setTextAppearance(i8);
        com.google.android.material.chip.a aVar = this.f24556d;
        if (aVar != null) {
            aVar.setTextAppearanceResource(i8);
        }
        v();
    }
}
