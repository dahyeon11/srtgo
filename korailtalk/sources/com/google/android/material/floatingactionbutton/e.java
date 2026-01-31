package com.google.android.material.floatingactionbutton;

import Z.h;
import a3.g;
import a3.k;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import java.util.ArrayList;

/* loaded from: classes2.dex */
class e extends d {

    static class a extends g {
        a(k kVar) {
            super(kVar);
        }

        @Override // a3.g, android.graphics.drawable.Drawable
        public boolean isStateful() {
            return true;
        }
    }

    e(FloatingActionButton floatingActionButton, Z2.b bVar) {
        super(floatingActionButton, bVar);
    }

    private Animator i0(float f8, float f9) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f24891y, "elevation", f8).setDuration(0L)).with(ObjectAnimator.ofFloat(this.f24891y, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f9).setDuration(100L));
        animatorSet.setInterpolator(d.f24855F);
        return animatorSet;
    }

    @Override // com.google.android.material.floatingactionbutton.d
    void B(int[] iArr) {
    }

    @Override // com.google.android.material.floatingactionbutton.d
    void C(float f8, float f9, float f10) {
        int i8 = Build.VERSION.SDK_INT;
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(d.f24856G, i0(f8, f10));
        stateListAnimator.addState(d.f24857H, i0(f8, f9));
        stateListAnimator.addState(d.f24858I, i0(f8, f9));
        stateListAnimator.addState(d.f24859J, i0(f8, f9));
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.f24891y, "elevation", f8).setDuration(0L));
        if (i8 <= 24) {
            FloatingActionButton floatingActionButton = this.f24891y;
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
        }
        arrayList.add(ObjectAnimator.ofFloat(this.f24891y, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
        animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
        animatorSet.setInterpolator(d.f24855F);
        stateListAnimator.addState(d.f24860K, animatorSet);
        stateListAnimator.addState(d.f24861L, i0(0.0f, 0.0f));
        this.f24891y.setStateListAnimator(stateListAnimator);
        if (Y()) {
            e0();
        }
    }

    @Override // com.google.android.material.floatingactionbutton.d
    boolean J() {
        return false;
    }

    @Override // com.google.android.material.floatingactionbutton.d
    void U(ColorStateList colorStateList) {
        Drawable drawable = this.f24869c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(Y2.b.sanitizeRippleDrawableColor(colorStateList));
        } else {
            super.U(colorStateList);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.d
    boolean Y() {
        return this.f24892z.isCompatPaddingEnabled() || !a0();
    }

    @Override // com.google.android.material.floatingactionbutton.d
    void c0() {
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public float getElevation() {
        return this.f24891y.getElevation();
    }

    c h0(int i8, ColorStateList colorStateList) {
        Context context = this.f24891y.getContext();
        c cVar = new c((k) h.checkNotNull(this.f24867a));
        cVar.d(androidx.core.content.a.getColor(context, J2.c.design_fab_stroke_top_outer_color), androidx.core.content.a.getColor(context, J2.c.design_fab_stroke_top_inner_color), androidx.core.content.a.getColor(context, J2.c.design_fab_stroke_end_inner_color), androidx.core.content.a.getColor(context, J2.c.design_fab_stroke_end_outer_color));
        cVar.setBorderWidth(i8);
        cVar.c(colorStateList);
        return cVar;
    }

    g j0() {
        return new a((k) h.checkNotNull(this.f24867a));
    }

    @Override // com.google.android.material.floatingactionbutton.d
    void p(Rect rect) {
        if (this.f24892z.isCompatPaddingEnabled()) {
            super.p(rect);
        } else if (a0()) {
            rect.set(0, 0, 0, 0);
        } else {
            int sizeDimension = (this.f24877k - this.f24891y.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.d
    void u(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i8) {
        Drawable layerDrawable;
        g gVarJ0 = j0();
        this.f24868b = gVarJ0;
        gVarJ0.setTintList(colorStateList);
        if (mode != null) {
            this.f24868b.setTintMode(mode);
        }
        this.f24868b.initializeElevationOverlay(this.f24891y.getContext());
        if (i8 > 0) {
            this.f24870d = h0(i8, colorStateList);
            layerDrawable = new LayerDrawable(new Drawable[]{(Drawable) h.checkNotNull(this.f24870d), (Drawable) h.checkNotNull(this.f24868b)});
        } else {
            this.f24870d = null;
            layerDrawable = this.f24868b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(Y2.b.sanitizeRippleDrawableColor(colorStateList2), layerDrawable, null);
        this.f24869c = rippleDrawable;
        this.f24871e = rippleDrawable;
    }

    @Override // com.google.android.material.floatingactionbutton.d
    void x() {
    }

    @Override // com.google.android.material.floatingactionbutton.d
    void z() {
        e0();
    }
}
