package D0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.AbstractC0985p0;
import java.util.Map;

/* renamed from: D0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0484c extends AbstractC0494m {

    /* renamed from: N, reason: collision with root package name */
    private static final String[] f750N = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: O, reason: collision with root package name */
    private static final Property f751O = new b(PointF.class, "boundsOrigin");

    /* renamed from: P, reason: collision with root package name */
    private static final Property f752P = new C0015c(PointF.class, "topLeft");

    /* renamed from: Q, reason: collision with root package name */
    private static final Property f753Q = new d(PointF.class, "bottomRight");

    /* renamed from: R, reason: collision with root package name */
    private static final Property f754R = new e(PointF.class, "bottomRight");

    /* renamed from: S, reason: collision with root package name */
    private static final Property f755S = new f(PointF.class, "topLeft");

    /* renamed from: T, reason: collision with root package name */
    private static final Property f756T = new g(PointF.class, "position");

    /* renamed from: U, reason: collision with root package name */
    private static C0491j f757U = new C0491j();

    /* renamed from: K, reason: collision with root package name */
    private int[] f758K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f759L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f760M;

    /* renamed from: D0.c$a */
    class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f761a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ BitmapDrawable f762b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f763c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f764d;

        a(ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f8) {
            this.f761a = viewGroup;
            this.f762b = bitmapDrawable;
            this.f763c = view;
            this.f764d = f8;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            B.b(this.f761a).remove(this.f762b);
            B.g(this.f763c, this.f764d);
        }
    }

    /* renamed from: D0.c$b */
    static class b extends Property {

        /* renamed from: a, reason: collision with root package name */
        private Rect f766a;

        b(Class cls, String str) {
            super(cls, str);
            this.f766a = new Rect();
        }

        @Override // android.util.Property
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f766a);
            Rect rect = this.f766a;
            return new PointF(rect.left, rect.top);
        }

        @Override // android.util.Property
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f766a);
            this.f766a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f766a);
        }
    }

    /* renamed from: D0.c$c, reason: collision with other inner class name */
    static class C0015c extends Property {
        C0015c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        public void set(k kVar, PointF pointF) {
            kVar.c(pointF);
        }
    }

    /* renamed from: D0.c$d */
    static class d extends Property {
        d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        public void set(k kVar, PointF pointF) {
            kVar.a(pointF);
        }
    }

    /* renamed from: D0.c$e */
    static class e extends Property {
        e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public void set(View view, PointF pointF) {
            B.f(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* renamed from: D0.c$f */
    static class f extends Property {
        f(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public void set(View view, PointF pointF) {
            B.f(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: D0.c$g */
    static class g extends Property {
        g(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public void set(View view, PointF pointF) {
            int iRound = Math.round(pointF.x);
            int iRound2 = Math.round(pointF.y);
            B.f(view, iRound, iRound2, view.getWidth() + iRound, view.getHeight() + iRound2);
        }
    }

    /* renamed from: D0.c$h */
    class h extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k f767a;
        private k mViewBounds;

        h(k kVar) {
            this.f767a = kVar;
            this.mViewBounds = kVar;
        }
    }

    /* renamed from: D0.c$i */
    class i extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        private boolean f769a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f770b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Rect f771c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f772d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f773e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f774f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f775g;

        i(View view, Rect rect, int i8, int i9, int i10, int i11) {
            this.f770b = view;
            this.f771c = rect;
            this.f772d = i8;
            this.f773e = i9;
            this.f774f = i10;
            this.f775g = i11;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f769a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f769a) {
                return;
            }
            AbstractC0985p0.setClipBounds(this.f770b, this.f771c);
            B.f(this.f770b, this.f772d, this.f773e, this.f774f, this.f775g);
        }
    }

    /* renamed from: D0.c$j */
    class j extends C0495n {

        /* renamed from: a, reason: collision with root package name */
        boolean f777a = false;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewGroup f778b;

        j(ViewGroup viewGroup) {
            this.f778b = viewGroup;
        }

        @Override // D0.C0495n, D0.AbstractC0494m.g
        public void onTransitionCancel(AbstractC0494m abstractC0494m) {
            y.c(this.f778b, false);
            this.f777a = true;
        }

        @Override // D0.C0495n, D0.AbstractC0494m.g
        public void onTransitionEnd(AbstractC0494m abstractC0494m) {
            if (!this.f777a) {
                y.c(this.f778b, false);
            }
            abstractC0494m.removeListener(this);
        }

        @Override // D0.C0495n, D0.AbstractC0494m.g
        public void onTransitionPause(AbstractC0494m abstractC0494m) {
            y.c(this.f778b, false);
        }

        @Override // D0.C0495n, D0.AbstractC0494m.g
        public void onTransitionResume(AbstractC0494m abstractC0494m) {
            y.c(this.f778b, true);
        }
    }

    /* renamed from: D0.c$k */
    private static class k {

        /* renamed from: a, reason: collision with root package name */
        private int f780a;

        /* renamed from: b, reason: collision with root package name */
        private int f781b;

        /* renamed from: c, reason: collision with root package name */
        private int f782c;

        /* renamed from: d, reason: collision with root package name */
        private int f783d;

        /* renamed from: e, reason: collision with root package name */
        private View f784e;

        /* renamed from: f, reason: collision with root package name */
        private int f785f;

        /* renamed from: g, reason: collision with root package name */
        private int f786g;

        k(View view) {
            this.f784e = view;
        }

        private void b() {
            B.f(this.f784e, this.f780a, this.f781b, this.f782c, this.f783d);
            this.f785f = 0;
            this.f786g = 0;
        }

        void a(PointF pointF) {
            this.f782c = Math.round(pointF.x);
            this.f783d = Math.round(pointF.y);
            int i8 = this.f786g + 1;
            this.f786g = i8;
            if (this.f785f == i8) {
                b();
            }
        }

        void c(PointF pointF) {
            this.f780a = Math.round(pointF.x);
            this.f781b = Math.round(pointF.y);
            int i8 = this.f785f + 1;
            this.f785f = i8;
            if (i8 == this.f786g) {
                b();
            }
        }
    }

    public C0484c() {
        this.f758K = new int[2];
        this.f759L = false;
        this.f760M = false;
    }

    private void H(t tVar) {
        View view = tVar.view;
        if (!AbstractC0985p0.isLaidOut(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        tVar.values.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        tVar.values.put("android:changeBounds:parent", tVar.view.getParent());
        if (this.f760M) {
            tVar.view.getLocationInWindow(this.f758K);
            tVar.values.put("android:changeBounds:windowX", Integer.valueOf(this.f758K[0]));
            tVar.values.put("android:changeBounds:windowY", Integer.valueOf(this.f758K[1]));
        }
        if (this.f759L) {
            tVar.values.put("android:changeBounds:clip", AbstractC0985p0.getClipBounds(view));
        }
    }

    private boolean I(View view, View view2) {
        if (!this.f760M) {
            return true;
        }
        t tVarP = p(view, true);
        if (tVarP == null) {
            if (view == view2) {
                return true;
            }
        } else if (view2 == tVarP.view) {
            return true;
        }
        return false;
    }

    @Override // D0.AbstractC0494m
    public void captureEndValues(t tVar) {
        H(tVar);
    }

    @Override // D0.AbstractC0494m
    public void captureStartValues(t tVar) {
        H(tVar);
    }

    @Override // D0.AbstractC0494m
    public Animator createAnimator(ViewGroup viewGroup, t tVar, t tVar2) {
        int i8;
        View view;
        int i9;
        ObjectAnimator objectAnimator;
        Animator animatorC;
        if (tVar == null || tVar2 == null) {
            return null;
        }
        Map<String, Object> map = tVar.values;
        Map<String, Object> map2 = tVar2.values;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = tVar2.view;
        if (!I(viewGroup2, viewGroup3)) {
            int iIntValue = ((Integer) tVar.values.get("android:changeBounds:windowX")).intValue();
            int iIntValue2 = ((Integer) tVar.values.get("android:changeBounds:windowY")).intValue();
            int iIntValue3 = ((Integer) tVar2.values.get("android:changeBounds:windowX")).intValue();
            int iIntValue4 = ((Integer) tVar2.values.get("android:changeBounds:windowY")).intValue();
            if (iIntValue == iIntValue3 && iIntValue2 == iIntValue4) {
                return null;
            }
            viewGroup.getLocationInWindow(this.f758K);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
            view2.draw(new Canvas(bitmapCreateBitmap));
            BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            float fC = B.c(view2);
            B.g(view2, 0.0f);
            B.b(viewGroup).add(bitmapDrawable);
            AbstractC0488g pathMotion = getPathMotion();
            int[] iArr = this.f758K;
            int i10 = iArr[0];
            int i11 = iArr[1];
            ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, AbstractC0489h.a(f751O, pathMotion.getPath(iIntValue - i10, iIntValue2 - i11, iIntValue3 - i10, iIntValue4 - i11)));
            objectAnimatorOfPropertyValuesHolder.addListener(new a(viewGroup, bitmapDrawable, view2, fC));
            return objectAnimatorOfPropertyValuesHolder;
        }
        Rect rect = (Rect) tVar.values.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) tVar2.values.get("android:changeBounds:bounds");
        int i12 = rect.left;
        int i13 = rect2.left;
        int i14 = rect.top;
        int i15 = rect2.top;
        int i16 = rect.right;
        int i17 = rect2.right;
        int i18 = rect.bottom;
        int i19 = rect2.bottom;
        int i20 = i16 - i12;
        int i21 = i18 - i14;
        int i22 = i17 - i13;
        int i23 = i19 - i15;
        Rect rect3 = (Rect) tVar.values.get("android:changeBounds:clip");
        Rect rect4 = (Rect) tVar2.values.get("android:changeBounds:clip");
        if ((i20 == 0 || i21 == 0) && (i22 == 0 || i23 == 0)) {
            i8 = 0;
        } else {
            i8 = (i12 == i13 && i14 == i15) ? 0 : 1;
            if (i16 != i17 || i18 != i19) {
                i8++;
            }
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i8++;
        }
        if (i8 <= 0) {
            return null;
        }
        if (this.f759L) {
            view = view2;
            B.f(view, i12, i14, Math.max(i20, i22) + i12, Math.max(i21, i23) + i14);
            ObjectAnimator objectAnimatorA = (i12 == i13 && i14 == i15) ? null : AbstractC0487f.a(view, f756T, getPathMotion().getPath(i12, i14, i13, i15));
            if (rect3 == null) {
                i9 = 0;
                rect3 = new Rect(0, 0, i20, i21);
            } else {
                i9 = 0;
            }
            Rect rect5 = rect4 == null ? new Rect(i9, i9, i22, i23) : rect4;
            if (rect3.equals(rect5)) {
                objectAnimator = null;
            } else {
                AbstractC0985p0.setClipBounds(view, rect3);
                ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(view, "clipBounds", f757U, rect3, rect5);
                objectAnimatorOfObject.addListener(new i(view, rect4, i13, i15, i17, i19));
                objectAnimator = objectAnimatorOfObject;
            }
            animatorC = AbstractC0499s.c(objectAnimatorA, objectAnimator);
        } else {
            view = view2;
            B.f(view, i12, i14, i16, i18);
            if (i8 != 2) {
                animatorC = (i12 == i13 && i14 == i15) ? AbstractC0487f.a(view, f754R, getPathMotion().getPath(i16, i18, i17, i19)) : AbstractC0487f.a(view, f755S, getPathMotion().getPath(i12, i14, i13, i15));
            } else if (i20 == i22 && i21 == i23) {
                animatorC = AbstractC0487f.a(view, f756T, getPathMotion().getPath(i12, i14, i13, i15));
            } else {
                k kVar = new k(view);
                ObjectAnimator objectAnimatorA2 = AbstractC0487f.a(kVar, f752P, getPathMotion().getPath(i12, i14, i13, i15));
                ObjectAnimator objectAnimatorA3 = AbstractC0487f.a(kVar, f753Q, getPathMotion().getPath(i16, i18, i17, i19));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(objectAnimatorA2, objectAnimatorA3);
                animatorSet.addListener(new h(kVar));
                animatorC = animatorSet;
            }
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            y.c(viewGroup4, true);
            addListener(new j(viewGroup4));
        }
        return animatorC;
    }

    public boolean getResizeClip() {
        return this.f759L;
    }

    @Override // D0.AbstractC0494m
    public String[] getTransitionProperties() {
        return f750N;
    }

    public void setResizeClip(boolean z8) {
        this.f759L = z8;
    }

    public C0484c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f758K = new int[2];
        this.f759L = false;
        this.f760M = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0493l.f815d);
        boolean namedBoolean = androidx.core.content.res.k.getNamedBoolean(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "resizeClip", 0, false);
        typedArrayObtainStyledAttributes.recycle();
        setResizeClip(namedBoolean);
    }
}
