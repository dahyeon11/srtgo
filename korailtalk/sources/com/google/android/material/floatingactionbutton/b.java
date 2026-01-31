package com.google.android.material.floatingactionbutton;

import K2.h;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.Property;
import android.view.View;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
abstract class b implements f {

    /* renamed from: a */
    private final Context f24831a;

    /* renamed from: b */
    private final ExtendedFloatingActionButton f24832b;

    /* renamed from: c */
    private final ArrayList f24833c = new ArrayList();

    /* renamed from: d */
    private final com.google.android.material.floatingactionbutton.a f24834d;

    /* renamed from: e */
    private h f24835e;

    /* renamed from: f */
    private h f24836f;

    class a extends Property {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Float get(ExtendedFloatingActionButton extendedFloatingActionButton) {
            return Float.valueOf(K2.a.lerp(0.0f, 1.0f, (Color.alpha(extendedFloatingActionButton.getCurrentTextColor()) / 255.0f) / Color.alpha(extendedFloatingActionButton.f24779F.getColorForState(extendedFloatingActionButton.getDrawableState(), b.this.f24832b.f24779F.getDefaultColor()))));
        }

        @Override // android.util.Property
        public void set(ExtendedFloatingActionButton extendedFloatingActionButton, Float f8) {
            int colorForState = extendedFloatingActionButton.f24779F.getColorForState(extendedFloatingActionButton.getDrawableState(), b.this.f24832b.f24779F.getDefaultColor());
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(Color.argb((int) (K2.a.lerp(0.0f, Color.alpha(colorForState) / 255.0f, f8.floatValue()) * 255.0f), Color.red(colorForState), Color.green(colorForState), Color.blue(colorForState)));
            if (f8.floatValue() == 1.0f) {
                extendedFloatingActionButton.A(extendedFloatingActionButton.f24779F);
            } else {
                extendedFloatingActionButton.A(colorStateListValueOf);
            }
        }
    }

    b(ExtendedFloatingActionButton extendedFloatingActionButton, com.google.android.material.floatingactionbutton.a aVar) {
        this.f24832b = extendedFloatingActionButton;
        this.f24831a = extendedFloatingActionButton.getContext();
        this.f24834d = aVar;
    }

    @Override // com.google.android.material.floatingactionbutton.f
    public final void addAnimationListener(Animator.AnimatorListener animatorListener) {
        this.f24833c.add(animatorListener);
    }

    AnimatorSet b(h hVar) {
        ArrayList arrayList = new ArrayList();
        if (hVar.hasPropertyValues("opacity")) {
            arrayList.add(hVar.getAnimator("opacity", this.f24832b, View.ALPHA));
        }
        if (hVar.hasPropertyValues("scale")) {
            arrayList.add(hVar.getAnimator("scale", this.f24832b, View.SCALE_Y));
            arrayList.add(hVar.getAnimator("scale", this.f24832b, View.SCALE_X));
        }
        if (hVar.hasPropertyValues("width")) {
            arrayList.add(hVar.getAnimator("width", this.f24832b, ExtendedFloatingActionButton.f24770H));
        }
        if (hVar.hasPropertyValues("height")) {
            arrayList.add(hVar.getAnimator("height", this.f24832b, ExtendedFloatingActionButton.f24771I));
        }
        if (hVar.hasPropertyValues("paddingStart")) {
            arrayList.add(hVar.getAnimator("paddingStart", this.f24832b, ExtendedFloatingActionButton.f24772J));
        }
        if (hVar.hasPropertyValues("paddingEnd")) {
            arrayList.add(hVar.getAnimator("paddingEnd", this.f24832b, ExtendedFloatingActionButton.f24773K));
        }
        if (hVar.hasPropertyValues("labelOpacity")) {
            arrayList.add(hVar.getAnimator("labelOpacity", this.f24832b, new a(Float.class, "LABEL_OPACITY_PROPERTY")));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        K2.b.playTogether(animatorSet, arrayList);
        return animatorSet;
    }

    @Override // com.google.android.material.floatingactionbutton.f
    public AnimatorSet createAnimator() {
        return b(getCurrentMotionSpec());
    }

    @Override // com.google.android.material.floatingactionbutton.f
    public final h getCurrentMotionSpec() {
        h hVar = this.f24836f;
        if (hVar != null) {
            return hVar;
        }
        if (this.f24835e == null) {
            this.f24835e = h.createFromResource(this.f24831a, getDefaultMotionSpecResource());
        }
        return (h) Z.h.checkNotNull(this.f24835e);
    }

    @Override // com.google.android.material.floatingactionbutton.f
    public abstract /* synthetic */ int getDefaultMotionSpecResource();

    @Override // com.google.android.material.floatingactionbutton.f
    public final List<Animator.AnimatorListener> getListeners() {
        return this.f24833c;
    }

    @Override // com.google.android.material.floatingactionbutton.f
    public h getMotionSpec() {
        return this.f24836f;
    }

    @Override // com.google.android.material.floatingactionbutton.f
    public void onAnimationCancel() {
        this.f24834d.clear();
    }

    @Override // com.google.android.material.floatingactionbutton.f
    public void onAnimationEnd() {
        this.f24834d.clear();
    }

    @Override // com.google.android.material.floatingactionbutton.f
    public void onAnimationStart(Animator animator) {
        this.f24834d.onNextAnimationStart(animator);
    }

    @Override // com.google.android.material.floatingactionbutton.f
    public abstract /* synthetic */ void onChange(ExtendedFloatingActionButton.j jVar);

    @Override // com.google.android.material.floatingactionbutton.f
    public abstract /* synthetic */ void performNow();

    @Override // com.google.android.material.floatingactionbutton.f
    public final void removeAnimationListener(Animator.AnimatorListener animatorListener) {
        this.f24833c.remove(animatorListener);
    }

    @Override // com.google.android.material.floatingactionbutton.f
    public final void setMotionSpec(h hVar) {
        this.f24836f = hVar;
    }

    @Override // com.google.android.material.floatingactionbutton.f
    public abstract /* synthetic */ boolean shouldCancel();
}
