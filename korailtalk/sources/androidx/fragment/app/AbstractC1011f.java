package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import androidx.core.os.e;
import androidx.core.view.Z;
import androidx.fragment.app.y;
import f0.AbstractC5381a;

/* renamed from: androidx.fragment.app.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC1011f {

    /* renamed from: androidx.fragment.app.f$a */
    class a implements e.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f9712a;

        a(Fragment fragment) {
            this.f9712a = fragment;
        }

        @Override // androidx.core.os.e.a
        public void onCancel() {
            if (this.f9712a.f() != null) {
                View viewF = this.f9712a.f();
                this.f9712a.e0(null);
                viewF.clearAnimation();
            }
            this.f9712a.g0(null);
        }
    }

    /* renamed from: androidx.fragment.app.f$b */
    class b implements Animation.AnimationListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f9713a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Fragment f9714b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ y.g f9715c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.core.os.e f9716d;

        /* renamed from: androidx.fragment.app.f$b$a */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (b.this.f9714b.f() != null) {
                    b.this.f9714b.e0(null);
                    b bVar = b.this;
                    bVar.f9715c.onComplete(bVar.f9714b, bVar.f9716d);
                }
            }
        }

        b(ViewGroup viewGroup, Fragment fragment, y.g gVar, androidx.core.os.e eVar) {
            this.f9713a = viewGroup;
            this.f9714b = fragment;
            this.f9715c = gVar;
            this.f9716d = eVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f9713a.post(new a());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: androidx.fragment.app.f$c */
    class c extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f9718a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f9719b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Fragment f9720c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ y.g f9721d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.core.os.e f9722e;

        c(ViewGroup viewGroup, View view, Fragment fragment, y.g gVar, androidx.core.os.e eVar) {
            this.f9718a = viewGroup;
            this.f9719b = view;
            this.f9720c = fragment;
            this.f9721d = gVar;
            this.f9722e = eVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f9718a.endViewTransition(this.f9719b);
            Animator animatorG = this.f9720c.g();
            this.f9720c.g0(null);
            if (animatorG == null || this.f9718a.indexOfChild(this.f9719b) >= 0) {
                return;
            }
            this.f9721d.onComplete(this.f9720c, this.f9722e);
        }
    }

    static void a(Fragment fragment, d dVar, y.g gVar) {
        View view = fragment.f9464H;
        ViewGroup viewGroup = fragment.f9463G;
        viewGroup.startViewTransition(view);
        androidx.core.os.e eVar = new androidx.core.os.e();
        eVar.setOnCancelListener(new a(fragment));
        gVar.onStart(fragment, eVar);
        if (dVar.animation != null) {
            e eVar2 = new e(dVar.animation, viewGroup, view);
            fragment.e0(fragment.f9464H);
            eVar2.setAnimationListener(new b(viewGroup, fragment, gVar, eVar));
            fragment.f9464H.startAnimation(eVar2);
            return;
        }
        Animator animator = dVar.animator;
        fragment.g0(animator);
        animator.addListener(new c(viewGroup, view, fragment, gVar, eVar));
        animator.setTarget(fragment.f9464H);
        animator.start();
    }

    private static int b(Fragment fragment, boolean z8, boolean z9) {
        return z9 ? z8 ? fragment.p() : fragment.q() : z8 ? fragment.h() : fragment.j();
    }

    static d c(Context context, Fragment fragment, boolean z8, boolean z9) {
        int iN = fragment.n();
        int iB = b(fragment, z8, z9);
        fragment.f0(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.f9463G;
        if (viewGroup != null && viewGroup.getTag(f0.b.visible_removing_fragment_view_tag) != null) {
            fragment.f9463G.setTag(f0.b.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup2 = fragment.f9463G;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation animationOnCreateAnimation = fragment.onCreateAnimation(iN, z8, iB);
        if (animationOnCreateAnimation != null) {
            return new d(animationOnCreateAnimation);
        }
        Animator animatorOnCreateAnimator = fragment.onCreateAnimator(iN, z8, iB);
        if (animatorOnCreateAnimator != null) {
            return new d(animatorOnCreateAnimator);
        }
        if (iB == 0 && iN != 0) {
            iB = d(iN, z8);
        }
        if (iB != 0) {
            boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(iB));
            if (zEquals) {
                try {
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, iB);
                    if (animationLoadAnimation != null) {
                        return new d(animationLoadAnimation);
                    }
                } catch (Resources.NotFoundException e8) {
                    throw e8;
                } catch (RuntimeException unused) {
                }
            } else {
                try {
                    Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, iB);
                    if (animatorLoadAnimator != null) {
                        return new d(animatorLoadAnimator);
                    }
                } catch (RuntimeException e9) {
                    if (zEquals) {
                        throw e9;
                    }
                    Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, iB);
                    if (animationLoadAnimation2 != null) {
                        return new d(animationLoadAnimation2);
                    }
                }
            }
        }
        return null;
    }

    private static int d(int i8, boolean z8) {
        if (i8 == 4097) {
            return z8 ? AbstractC5381a.fragment_open_enter : AbstractC5381a.fragment_open_exit;
        }
        if (i8 == 4099) {
            return z8 ? AbstractC5381a.fragment_fade_enter : AbstractC5381a.fragment_fade_exit;
        }
        if (i8 != 8194) {
            return -1;
        }
        return z8 ? AbstractC5381a.fragment_close_enter : AbstractC5381a.fragment_close_exit;
    }

    /* renamed from: androidx.fragment.app.f$d */
    static class d {
        public final Animation animation;
        public final Animator animator;

        d(Animation animation) {
            this.animation = animation;
            this.animator = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        d(Animator animator) {
            this.animation = null;
            this.animator = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* renamed from: androidx.fragment.app.f$e */
    static class e extends AnimationSet implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final ViewGroup f9723a;

        /* renamed from: b, reason: collision with root package name */
        private final View f9724b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f9725c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f9726d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f9727e;

        e(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f9727e = true;
            this.f9723a = viewGroup;
            this.f9724b = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j8, Transformation transformation) {
            this.f9727e = true;
            if (this.f9725c) {
                return !this.f9726d;
            }
            if (!super.getTransformation(j8, transformation)) {
                this.f9725c = true;
                Z.add(this.f9723a, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f9725c || !this.f9727e) {
                this.f9723a.endViewTransition(this.f9724b);
                this.f9726d = true;
            } else {
                this.f9727e = false;
                this.f9723a.post(this);
            }
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j8, Transformation transformation, float f8) {
            this.f9727e = true;
            if (this.f9725c) {
                return !this.f9726d;
            }
            if (!super.getTransformation(j8, transformation, f8)) {
                this.f9725c = true;
                Z.add(this.f9723a, this);
            }
            return true;
        }
    }
}
