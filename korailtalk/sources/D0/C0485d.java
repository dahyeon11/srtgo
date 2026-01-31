package D0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.AbstractC0985p0;

/* renamed from: D0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0485d extends P {
    public static final int IN = 1;
    public static final int OUT = 2;

    /* renamed from: D0.d$a */
    class a extends C0495n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f787a;

        a(View view) {
            this.f787a = view;
        }

        @Override // D0.C0495n, D0.AbstractC0494m.g
        public void onTransitionEnd(AbstractC0494m abstractC0494m) {
            B.g(this.f787a, 1.0f);
            B.a(this.f787a);
            abstractC0494m.removeListener(this);
        }
    }

    /* renamed from: D0.d$b */
    private static class b extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        private final View f789a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f790b = false;

        b(View view) {
            this.f789a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            B.g(this.f789a, 1.0f);
            if (this.f790b) {
                this.f789a.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (AbstractC0985p0.hasOverlappingRendering(this.f789a) && this.f789a.getLayerType() == 0) {
                this.f790b = true;
                this.f789a.setLayerType(2, null);
            }
        }
    }

    public C0485d(int i8) {
        setMode(i8);
    }

    private Animator J(View view, float f8, float f9) {
        if (f8 == f9) {
            return null;
        }
        B.g(view, f8);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) B.f718b, f9);
        objectAnimatorOfFloat.addListener(new b(view));
        addListener(new a(view));
        return objectAnimatorOfFloat;
    }

    private static float K(t tVar, float f8) {
        Float f9;
        return (tVar == null || (f9 = (Float) tVar.values.get("android:fade:transitionAlpha")) == null) ? f8 : f9.floatValue();
    }

    @Override // D0.P, D0.AbstractC0494m
    public void captureStartValues(t tVar) {
        super.captureStartValues(tVar);
        tVar.values.put("android:fade:transitionAlpha", Float.valueOf(B.c(tVar.view)));
    }

    @Override // D0.P
    public Animator onAppear(ViewGroup viewGroup, View view, t tVar, t tVar2) {
        float fK = K(tVar, 0.0f);
        return J(view, fK != 1.0f ? fK : 0.0f, 1.0f);
    }

    @Override // D0.P
    public Animator onDisappear(ViewGroup viewGroup, View view, t tVar, t tVar2) {
        B.e(view);
        return J(view, K(tVar, 1.0f), 0.0f);
    }

    public C0485d() {
    }

    public C0485d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0493l.f817f);
        setMode(androidx.core.content.res.k.getNamedInt(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "fadingMode", 0, getMode()));
        typedArrayObtainStyledAttributes.recycle();
    }
}
