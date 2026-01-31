package D0;

import D0.AbstractC0482a;
import D0.AbstractC0494m;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class P extends AbstractC0494m {

    /* renamed from: L, reason: collision with root package name */
    private static final String[] f731L = {"android:visibility:visibility", "android:visibility:parent"};
    public static final int MODE_IN = 1;
    public static final int MODE_OUT = 2;

    /* renamed from: K, reason: collision with root package name */
    private int f732K;

    class a extends C0495n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f733a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f734b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f735c;

        a(ViewGroup viewGroup, View view, View view2) {
            this.f733a = viewGroup;
            this.f734b = view;
            this.f735c = view2;
        }

        @Override // D0.C0495n, D0.AbstractC0494m.g
        public void onTransitionEnd(AbstractC0494m abstractC0494m) {
            this.f735c.setTag(AbstractC0490i.save_overlay_view, null);
            y.a(this.f733a).remove(this.f734b);
            abstractC0494m.removeListener(this);
        }

        @Override // D0.C0495n, D0.AbstractC0494m.g
        public void onTransitionPause(AbstractC0494m abstractC0494m) {
            y.a(this.f733a).remove(this.f734b);
        }

        @Override // D0.C0495n, D0.AbstractC0494m.g
        public void onTransitionResume(AbstractC0494m abstractC0494m) {
            if (this.f734b.getParent() == null) {
                y.a(this.f733a).add(this.f734b);
            } else {
                P.this.cancel();
            }
        }
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        boolean f743a;

        /* renamed from: b, reason: collision with root package name */
        boolean f744b;

        /* renamed from: c, reason: collision with root package name */
        int f745c;

        /* renamed from: d, reason: collision with root package name */
        int f746d;

        /* renamed from: e, reason: collision with root package name */
        ViewGroup f747e;

        /* renamed from: f, reason: collision with root package name */
        ViewGroup f748f;

        c() {
        }
    }

    public P() {
        this.f732K = 3;
    }

    private void H(t tVar) {
        tVar.values.put("android:visibility:visibility", Integer.valueOf(tVar.view.getVisibility()));
        tVar.values.put("android:visibility:parent", tVar.view.getParent());
        int[] iArr = new int[2];
        tVar.view.getLocationOnScreen(iArr);
        tVar.values.put("android:visibility:screenLocation", iArr);
    }

    private c I(t tVar, t tVar2) {
        c cVar = new c();
        cVar.f743a = false;
        cVar.f744b = false;
        if (tVar == null || !tVar.values.containsKey("android:visibility:visibility")) {
            cVar.f745c = -1;
            cVar.f747e = null;
        } else {
            cVar.f745c = ((Integer) tVar.values.get("android:visibility:visibility")).intValue();
            cVar.f747e = (ViewGroup) tVar.values.get("android:visibility:parent");
        }
        if (tVar2 == null || !tVar2.values.containsKey("android:visibility:visibility")) {
            cVar.f746d = -1;
            cVar.f748f = null;
        } else {
            cVar.f746d = ((Integer) tVar2.values.get("android:visibility:visibility")).intValue();
            cVar.f748f = (ViewGroup) tVar2.values.get("android:visibility:parent");
        }
        if (tVar != null && tVar2 != null) {
            int i8 = cVar.f745c;
            int i9 = cVar.f746d;
            if (i8 == i9 && cVar.f747e == cVar.f748f) {
                return cVar;
            }
            if (i8 != i9) {
                if (i8 == 0) {
                    cVar.f744b = false;
                    cVar.f743a = true;
                } else if (i9 == 0) {
                    cVar.f744b = true;
                    cVar.f743a = true;
                }
            } else if (cVar.f748f == null) {
                cVar.f744b = false;
                cVar.f743a = true;
            } else if (cVar.f747e == null) {
                cVar.f744b = true;
                cVar.f743a = true;
            }
        } else if (tVar == null && cVar.f746d == 0) {
            cVar.f744b = true;
            cVar.f743a = true;
        } else if (tVar2 == null && cVar.f745c == 0) {
            cVar.f744b = false;
            cVar.f743a = true;
        }
        return cVar;
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
        c cVarI = I(tVar, tVar2);
        if (!cVarI.f743a) {
            return null;
        }
        if (cVarI.f747e == null && cVarI.f748f == null) {
            return null;
        }
        return cVarI.f744b ? onAppear(viewGroup, tVar, cVarI.f745c, tVar2, cVarI.f746d) : onDisappear(viewGroup, tVar, cVarI.f745c, tVar2, cVarI.f746d);
    }

    public int getMode() {
        return this.f732K;
    }

    @Override // D0.AbstractC0494m
    public String[] getTransitionProperties() {
        return f731L;
    }

    @Override // D0.AbstractC0494m
    public boolean isTransitionRequired(t tVar, t tVar2) {
        if (tVar == null && tVar2 == null) {
            return false;
        }
        if (tVar != null && tVar2 != null && tVar2.values.containsKey("android:visibility:visibility") != tVar.values.containsKey("android:visibility:visibility")) {
            return false;
        }
        c cVarI = I(tVar, tVar2);
        if (cVarI.f743a) {
            return cVarI.f745c == 0 || cVarI.f746d == 0;
        }
        return false;
    }

    public boolean isVisible(t tVar) {
        if (tVar == null) {
            return false;
        }
        return ((Integer) tVar.values.get("android:visibility:visibility")).intValue() == 0 && ((View) tVar.values.get("android:visibility:parent")) != null;
    }

    public Animator onAppear(ViewGroup viewGroup, t tVar, int i8, t tVar2, int i9) {
        if ((this.f732K & 1) != 1 || tVar2 == null) {
            return null;
        }
        if (tVar == null) {
            View view = (View) tVar2.view.getParent();
            if (I(p(view, false), getTransitionValues(view, false)).f743a) {
                return null;
            }
        }
        return onAppear(viewGroup, tVar2.view, tVar, tVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0069 A[PHI: r2
  0x0069: PHI (r2v3 android.view.View) = 
  (r2v2 android.view.View)
  (r2v2 android.view.View)
  (r2v2 android.view.View)
  (r2v2 android.view.View)
  (r2v2 android.view.View)
  (r2v2 android.view.View)
  (r2v6 android.view.View)
 binds: [B:26:0x003e, B:31:0x004d, B:37:0x0076, B:39:0x0079, B:41:0x007f, B:43:0x0083, B:34:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.animation.Animator onDisappear(android.view.ViewGroup r11, D0.t r12, int r13, D0.t r14, int r15) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: D0.P.onDisappear(android.view.ViewGroup, D0.t, int, D0.t, int):android.animation.Animator");
    }

    public void setMode(int i8) {
        if ((i8 & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.f732K = i8;
    }

    public P(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f732K = 3;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0493l.f816e);
        int namedInt = androidx.core.content.res.k.getNamedInt(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionVisibilityMode", 0, 0);
        typedArrayObtainStyledAttributes.recycle();
        if (namedInt != 0) {
            setMode(namedInt);
        }
    }

    public Animator onAppear(ViewGroup viewGroup, View view, t tVar, t tVar2) {
        return null;
    }

    private static class b extends AnimatorListenerAdapter implements AbstractC0494m.g, AbstractC0482a.InterfaceC0014a {

        /* renamed from: a, reason: collision with root package name */
        private final View f737a;

        /* renamed from: b, reason: collision with root package name */
        private final int f738b;

        /* renamed from: c, reason: collision with root package name */
        private final ViewGroup f739c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f740d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f741e;

        /* renamed from: f, reason: collision with root package name */
        boolean f742f = false;

        b(View view, int i8, boolean z8) {
            this.f737a = view;
            this.f738b = i8;
            this.f739c = (ViewGroup) view.getParent();
            this.f740d = z8;
            b(true);
        }

        private void a() {
            if (!this.f742f) {
                B.h(this.f737a, this.f738b);
                ViewGroup viewGroup = this.f739c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            b(false);
        }

        private void b(boolean z8) {
            ViewGroup viewGroup;
            if (!this.f740d || this.f741e == z8 || (viewGroup = this.f739c) == null) {
                return;
            }
            this.f741e = z8;
            y.c(viewGroup, z8);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f742f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, D0.AbstractC0482a.InterfaceC0014a
        public void onAnimationPause(Animator animator) {
            if (this.f742f) {
                return;
            }
            B.h(this.f737a, this.f738b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, D0.AbstractC0482a.InterfaceC0014a
        public void onAnimationResume(Animator animator) {
            if (this.f742f) {
                return;
            }
            B.h(this.f737a, 0);
        }

        @Override // D0.AbstractC0494m.g
        public void onTransitionEnd(AbstractC0494m abstractC0494m) {
            a();
            abstractC0494m.removeListener(this);
        }

        @Override // D0.AbstractC0494m.g
        public void onTransitionPause(AbstractC0494m abstractC0494m) {
            b(false);
        }

        @Override // D0.AbstractC0494m.g
        public void onTransitionResume(AbstractC0494m abstractC0494m) {
            b(true);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        @Override // D0.AbstractC0494m.g
        public void onTransitionCancel(AbstractC0494m abstractC0494m) {
        }

        @Override // D0.AbstractC0494m.g
        public void onTransitionStart(AbstractC0494m abstractC0494m) {
        }
    }

    public Animator onDisappear(ViewGroup viewGroup, View view, t tVar, t tVar2) {
        return null;
    }
}
