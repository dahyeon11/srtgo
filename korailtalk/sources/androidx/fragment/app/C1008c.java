package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.os.e;
import androidx.core.view.AbstractC0985p0;
import androidx.core.view.AbstractC0995u0;
import androidx.core.view.Z;
import androidx.fragment.app.AbstractC1011f;
import androidx.fragment.app.D;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.fragment.app.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C1008c extends D {

    /* renamed from: androidx.fragment.app.c$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f9645a;

        static {
            int[] iArr = new int[D.e.c.values().length];
            f9645a = iArr;
            try {
                iArr[D.e.c.GONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9645a[D.e.c.INVISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9645a[D.e.c.REMOVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9645a[D.e.c.VISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: androidx.fragment.app.c$b */
    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f9646a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ D.e f9647b;

        b(List list, D.e eVar) {
            this.f9646a = list;
            this.f9647b = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f9646a.contains(this.f9647b)) {
                this.f9646a.remove(this.f9647b);
                C1008c.this.r(this.f9647b);
            }
        }
    }

    /* renamed from: androidx.fragment.app.c$c, reason: collision with other inner class name */
    class C0148c extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f9649a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f9650b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f9651c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ D.e f9652d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ k f9653e;

        C0148c(ViewGroup viewGroup, View view, boolean z8, D.e eVar, k kVar) {
            this.f9649a = viewGroup;
            this.f9650b = view;
            this.f9651c = z8;
            this.f9652d = eVar;
            this.f9653e = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f9649a.endViewTransition(this.f9650b);
            if (this.f9651c) {
                this.f9652d.getFinalState().a(this.f9650b);
            }
            this.f9653e.a();
        }
    }

    /* renamed from: androidx.fragment.app.c$d */
    class d implements e.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Animator f9655a;

        d(Animator animator) {
            this.f9655a = animator;
        }

        @Override // androidx.core.os.e.a
        public void onCancel() {
            this.f9655a.end();
        }
    }

    /* renamed from: androidx.fragment.app.c$e */
    class e implements Animation.AnimationListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f9657a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f9658b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k f9659c;

        /* renamed from: androidx.fragment.app.c$e$a */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e eVar = e.this;
                eVar.f9657a.endViewTransition(eVar.f9658b);
                e.this.f9659c.a();
            }
        }

        e(ViewGroup viewGroup, View view, k kVar) {
            this.f9657a = viewGroup;
            this.f9658b = view;
            this.f9659c = kVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f9657a.post(new a());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: androidx.fragment.app.c$f */
    class f implements e.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f9662a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewGroup f9663b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k f9664c;

        f(View view, ViewGroup viewGroup, k kVar) {
            this.f9662a = view;
            this.f9663b = viewGroup;
            this.f9664c = kVar;
        }

        @Override // androidx.core.os.e.a
        public void onCancel() {
            this.f9662a.clearAnimation();
            this.f9663b.endViewTransition(this.f9662a);
            this.f9664c.a();
        }
    }

    /* renamed from: androidx.fragment.app.c$g */
    class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ D.e f9666a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ D.e f9667b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f9668c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ O.a f9669d;

        g(D.e eVar, D.e eVar2, boolean z8, O.a aVar) {
            this.f9666a = eVar;
            this.f9667b = eVar2;
            this.f9668c = z8;
            this.f9669d = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            y.d(this.f9666a.getFragment(), this.f9667b.getFragment(), this.f9668c, this.f9669d, false);
        }
    }

    /* renamed from: androidx.fragment.app.c$h */
    class h implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ A f9671a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f9672b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Rect f9673c;

        h(A a9, View view, Rect rect) {
            this.f9671a = a9;
            this.f9672b = view;
            this.f9673c = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f9671a.f(this.f9672b, this.f9673c);
        }
    }

    /* renamed from: androidx.fragment.app.c$i */
    class i implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f9675a;

        i(ArrayList arrayList) {
            this.f9675a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            y.z(this.f9675a, 4);
        }
    }

    /* renamed from: androidx.fragment.app.c$j */
    class j implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ m f9677a;

        j(m mVar) {
            this.f9677a = mVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f9677a.a();
        }
    }

    /* renamed from: androidx.fragment.app.c$k */
    private static class k extends l {

        /* renamed from: c, reason: collision with root package name */
        private boolean f9679c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f9680d;

        /* renamed from: e, reason: collision with root package name */
        private AbstractC1011f.d f9681e;

        k(D.e eVar, androidx.core.os.e eVar2, boolean z8) {
            super(eVar, eVar2);
            this.f9680d = false;
            this.f9679c = z8;
        }

        AbstractC1011f.d e(Context context) {
            if (this.f9680d) {
                return this.f9681e;
            }
            AbstractC1011f.d dVarC = AbstractC1011f.c(context, b().getFragment(), b().getFinalState() == D.e.c.VISIBLE, this.f9679c);
            this.f9681e = dVarC;
            this.f9680d = true;
            return dVarC;
        }
    }

    /* renamed from: androidx.fragment.app.c$l */
    private static class l {

        /* renamed from: a, reason: collision with root package name */
        private final D.e f9682a;

        /* renamed from: b, reason: collision with root package name */
        private final androidx.core.os.e f9683b;

        l(D.e eVar, androidx.core.os.e eVar2) {
            this.f9682a = eVar;
            this.f9683b = eVar2;
        }

        void a() {
            this.f9682a.completeSpecialEffect(this.f9683b);
        }

        D.e b() {
            return this.f9682a;
        }

        androidx.core.os.e c() {
            return this.f9683b;
        }

        boolean d() {
            D.e.c cVar;
            D.e.c cVarC = D.e.c.c(this.f9682a.getFragment().f9464H);
            D.e.c finalState = this.f9682a.getFinalState();
            return cVarC == finalState || !(cVarC == (cVar = D.e.c.VISIBLE) || finalState == cVar);
        }
    }

    /* renamed from: androidx.fragment.app.c$m */
    private static class m extends l {

        /* renamed from: c, reason: collision with root package name */
        private final Object f9684c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f9685d;

        /* renamed from: e, reason: collision with root package name */
        private final Object f9686e;

        m(D.e eVar, androidx.core.os.e eVar2, boolean z8, boolean z9) {
            super(eVar, eVar2);
            if (eVar.getFinalState() == D.e.c.VISIBLE) {
                this.f9684c = z8 ? eVar.getFragment().getReenterTransition() : eVar.getFragment().getEnterTransition();
                this.f9685d = z8 ? eVar.getFragment().getAllowReturnTransitionOverlap() : eVar.getFragment().getAllowEnterTransitionOverlap();
            } else {
                this.f9684c = z8 ? eVar.getFragment().getReturnTransition() : eVar.getFragment().getExitTransition();
                this.f9685d = true;
            }
            if (!z9) {
                this.f9686e = null;
            } else if (z8) {
                this.f9686e = eVar.getFragment().getSharedElementReturnTransition();
            } else {
                this.f9686e = eVar.getFragment().getSharedElementEnterTransition();
            }
        }

        private A f(Object obj) {
            if (obj == null) {
                return null;
            }
            A a9 = y.f9818b;
            if (a9 != null && a9.canHandle(obj)) {
                return a9;
            }
            A a10 = y.f9819c;
            if (a10 != null && a10.canHandle(obj)) {
                return a10;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + b().getFragment() + " is not a valid framework Transition or AndroidX Transition");
        }

        A e() {
            A aF = f(this.f9684c);
            A aF2 = f(this.f9686e);
            if (aF == null || aF2 == null || aF == aF2) {
                return aF != null ? aF : aF2;
            }
            throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + b().getFragment() + " returned Transition " + this.f9684c + " which uses a different Transition  type than its shared element transition " + this.f9686e);
        }

        Object g() {
            return this.f9684c;
        }

        public Object getSharedElementTransition() {
            return this.f9686e;
        }

        boolean h() {
            return this.f9685d;
        }

        public boolean hasSharedElementTransition() {
            return this.f9686e != null;
        }
    }

    C1008c(ViewGroup viewGroup) {
        super(viewGroup);
    }

    private void v(List list, List list2, boolean z8, Map map) {
        ViewGroup container = getContainer();
        Context context = container.getContext();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        boolean z9 = false;
        while (it.hasNext()) {
            k kVar = (k) it.next();
            if (kVar.d()) {
                kVar.a();
            } else {
                AbstractC1011f.d dVarE = kVar.e(context);
                if (dVarE == null) {
                    kVar.a();
                } else {
                    Animator animator = dVarE.animator;
                    if (animator == null) {
                        arrayList.add(kVar);
                    } else {
                        D.e eVarB = kVar.b();
                        Fragment fragment = eVarB.getFragment();
                        if (Boolean.TRUE.equals(map.get(eVarB))) {
                            if (FragmentManager.x0(2)) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("Ignoring Animator set on ");
                                sb.append(fragment);
                                sb.append(" as this Fragment was involved in a Transition.");
                            }
                            kVar.a();
                        } else {
                            boolean z10 = eVarB.getFinalState() == D.e.c.GONE;
                            if (z10) {
                                list2.remove(eVarB);
                            }
                            View view = fragment.f9464H;
                            container.startViewTransition(view);
                            animator.addListener(new C0148c(container, view, z10, eVarB, kVar));
                            animator.setTarget(view);
                            animator.start();
                            kVar.c().setOnCancelListener(new d(animator));
                            z9 = true;
                        }
                    }
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            k kVar2 = (k) it2.next();
            D.e eVarB2 = kVar2.b();
            Fragment fragment2 = eVarB2.getFragment();
            if (z8) {
                if (FragmentManager.x0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Ignoring Animation set on ");
                    sb2.append(fragment2);
                    sb2.append(" as Animations cannot run alongside Transitions.");
                }
                kVar2.a();
            } else if (z9) {
                if (FragmentManager.x0(2)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Ignoring Animation set on ");
                    sb3.append(fragment2);
                    sb3.append(" as Animations cannot run alongside Animators.");
                }
                kVar2.a();
            } else {
                View view2 = fragment2.f9464H;
                Animation animation = (Animation) Z.h.checkNotNull(((AbstractC1011f.d) Z.h.checkNotNull(kVar2.e(context))).animation);
                if (eVarB2.getFinalState() != D.e.c.REMOVED) {
                    view2.startAnimation(animation);
                    kVar2.a();
                } else {
                    container.startViewTransition(view2);
                    AbstractC1011f.e eVar = new AbstractC1011f.e(animation, container, view2);
                    eVar.setAnimationListener(new e(container, view2, kVar2));
                    view2.startAnimation(eVar);
                }
                kVar2.c().setOnCancelListener(new f(view2, container, kVar2));
            }
        }
    }

    private Map w(List list, List list2, boolean z8, D.e eVar, D.e eVar2) {
        Iterator it;
        View view;
        Object obj;
        ArrayList<View> arrayList;
        Object obj2;
        ArrayList arrayList2;
        D.e eVar3;
        D.e eVar4;
        View view2;
        Object objMergeTransitionsTogether;
        O.a aVar;
        ArrayList arrayList3;
        C1008c c1008c;
        D.e eVar5;
        ArrayList<View> arrayList4;
        Rect rect;
        A a9;
        D.e eVar6;
        View view3;
        androidx.core.app.E eK;
        androidx.core.app.E e8;
        ArrayList arrayList5;
        View view4;
        View view5;
        String strO;
        ArrayList arrayList6;
        C1008c c1008c2 = this;
        boolean z9 = z8;
        D.e eVar7 = eVar;
        D.e eVar8 = eVar2;
        HashMap map = new HashMap();
        Iterator it2 = list.iterator();
        A a10 = null;
        while (it2.hasNext()) {
            m mVar = (m) it2.next();
            if (!mVar.d()) {
                A aE = mVar.e();
                if (a10 == null) {
                    a10 = aE;
                } else if (aE != null && a10 != aE) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + mVar.b().getFragment() + " returned Transition " + mVar.g() + " which uses a different Transition  type than other Fragments.");
                }
            }
        }
        if (a10 == null) {
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                m mVar2 = (m) it3.next();
                map.put(mVar2.b(), Boolean.FALSE);
                mVar2.a();
            }
            return map;
        }
        View view6 = new View(getContainer().getContext());
        Rect rect2 = new Rect();
        ArrayList<View> arrayList7 = new ArrayList<>();
        ArrayList arrayList8 = new ArrayList();
        O.a aVar2 = new O.a();
        Iterator it4 = list.iterator();
        Object obj3 = null;
        View view7 = null;
        boolean z10 = false;
        while (it4.hasNext()) {
            m mVar3 = (m) it4.next();
            if (!mVar3.hasSharedElementTransition() || eVar7 == null || eVar8 == null) {
                aVar = aVar2;
                arrayList3 = arrayList8;
                c1008c = c1008c2;
                eVar5 = eVar7;
                arrayList4 = arrayList7;
                rect = rect2;
                a9 = a10;
                eVar6 = eVar8;
                view3 = view6;
                view7 = view7;
            } else {
                Object objWrapTransitionInSet = a10.wrapTransitionInSet(a10.cloneTransition(mVar3.getSharedElementTransition()));
                ArrayList arrayListS = eVar2.getFragment().s();
                ArrayList arrayListS2 = eVar.getFragment().s();
                ArrayList arrayListT = eVar.getFragment().t();
                View view8 = view7;
                int i8 = 0;
                while (i8 < arrayListT.size()) {
                    int iIndexOf = arrayListS.indexOf(arrayListT.get(i8));
                    ArrayList arrayList9 = arrayListT;
                    if (iIndexOf != -1) {
                        arrayListS.set(iIndexOf, arrayListS2.get(i8));
                    }
                    i8++;
                    arrayListT = arrayList9;
                }
                ArrayList arrayListT2 = eVar2.getFragment().t();
                if (z9) {
                    androidx.core.app.E eI = eVar.getFragment().i();
                    eK = eVar2.getFragment().k();
                    e8 = eI;
                } else {
                    androidx.core.app.E eK2 = eVar.getFragment().k();
                    eK = eVar2.getFragment().i();
                    e8 = eK2;
                }
                int i9 = 0;
                for (int size = arrayListS.size(); i9 < size; size = size) {
                    aVar2.put((String) arrayListS.get(i9), (String) arrayListT2.get(i9));
                    i9++;
                }
                O.a aVar3 = new O.a();
                c1008c2.t(aVar3, eVar.getFragment().f9464H);
                aVar3.retainAll(arrayListS);
                if (e8 != null) {
                    e8.onMapSharedElements(arrayListS, aVar3);
                    int size2 = arrayListS.size() - 1;
                    while (size2 >= 0) {
                        String str = (String) arrayListS.get(size2);
                        View view9 = (View) aVar3.get(str);
                        if (view9 == null) {
                            aVar2.remove(str);
                            arrayList6 = arrayListS;
                        } else {
                            arrayList6 = arrayListS;
                            if (!str.equals(AbstractC0985p0.getTransitionName(view9))) {
                                aVar2.put(AbstractC0985p0.getTransitionName(view9), (String) aVar2.remove(str));
                            }
                        }
                        size2--;
                        arrayListS = arrayList6;
                    }
                    arrayList5 = arrayListS;
                } else {
                    arrayList5 = arrayListS;
                    aVar2.retainAll(aVar3.keySet());
                }
                O.a aVar4 = new O.a();
                c1008c2.t(aVar4, eVar2.getFragment().f9464H);
                aVar4.retainAll(arrayListT2);
                aVar4.retainAll(aVar2.values());
                if (eK != null) {
                    eK.onMapSharedElements(arrayListT2, aVar4);
                    for (int size3 = arrayListT2.size() - 1; size3 >= 0; size3--) {
                        String str2 = (String) arrayListT2.get(size3);
                        View view10 = (View) aVar4.get(str2);
                        if (view10 == null) {
                            String strO2 = y.o(aVar2, str2);
                            if (strO2 != null) {
                                aVar2.remove(strO2);
                            }
                        } else if (!str2.equals(AbstractC0985p0.getTransitionName(view10)) && (strO = y.o(aVar2, str2)) != null) {
                            aVar2.put(strO, AbstractC0985p0.getTransitionName(view10));
                        }
                    }
                } else {
                    y.w(aVar2, aVar4);
                }
                c1008c2.u(aVar3, aVar2.keySet());
                c1008c2.u(aVar4, aVar2.values());
                if (aVar2.isEmpty()) {
                    arrayList7.clear();
                    arrayList8.clear();
                    eVar5 = eVar;
                    aVar = aVar2;
                    arrayList3 = arrayList8;
                    c1008c = c1008c2;
                    arrayList4 = arrayList7;
                    rect = rect2;
                    view3 = view6;
                    a9 = a10;
                    view7 = view8;
                    obj3 = null;
                    eVar6 = eVar2;
                } else {
                    y.d(eVar2.getFragment(), eVar.getFragment(), z9, aVar3, true);
                    ArrayList arrayList10 = arrayList5;
                    HashMap map2 = map;
                    View view11 = view6;
                    aVar = aVar2;
                    ArrayList arrayList11 = arrayList8;
                    Z.add(getContainer(), new g(eVar2, eVar, z8, aVar4));
                    arrayList7.addAll(aVar3.values());
                    if (arrayList10.isEmpty()) {
                        view7 = view8;
                    } else {
                        view7 = (View) aVar3.get((String) arrayList10.get(0));
                        a10.setEpicenter(objWrapTransitionInSet, view7);
                    }
                    arrayList3 = arrayList11;
                    arrayList3.addAll(aVar4.values());
                    if (arrayListT2.isEmpty() || (view5 = (View) aVar4.get((String) arrayListT2.get(0))) == null) {
                        c1008c = this;
                        view4 = view11;
                    } else {
                        c1008c = this;
                        Z.add(getContainer(), c1008c.new h(a10, view5, rect2));
                        view4 = view11;
                        z10 = true;
                    }
                    a10.setSharedElementTargets(objWrapTransitionInSet, view4, arrayList7);
                    arrayList4 = arrayList7;
                    rect = rect2;
                    view3 = view4;
                    a9 = a10;
                    a10.scheduleRemoveTargets(objWrapTransitionInSet, null, null, null, null, objWrapTransitionInSet, arrayList3);
                    Boolean bool = Boolean.TRUE;
                    eVar5 = eVar;
                    map = map2;
                    map.put(eVar5, bool);
                    eVar6 = eVar2;
                    map.put(eVar6, bool);
                    obj3 = objWrapTransitionInSet;
                }
            }
            z9 = z8;
            arrayList7 = arrayList4;
            c1008c2 = c1008c;
            rect2 = rect;
            view6 = view3;
            eVar8 = eVar6;
            aVar2 = aVar;
            arrayList8 = arrayList3;
            eVar7 = eVar5;
            a10 = a9;
        }
        View view12 = view7;
        O.a aVar5 = aVar2;
        ArrayList arrayList12 = arrayList8;
        C1008c c1008c3 = c1008c2;
        D.e eVar9 = eVar7;
        ArrayList<View> arrayList13 = arrayList7;
        Rect rect3 = rect2;
        A a11 = a10;
        D.e eVar10 = eVar8;
        View view13 = view6;
        ArrayList arrayList14 = new ArrayList();
        Iterator it5 = list.iterator();
        Object obj4 = null;
        Object objMergeTransitionsTogether2 = null;
        while (it5.hasNext()) {
            m mVar4 = (m) it5.next();
            if (mVar4.d()) {
                map.put(mVar4.b(), Boolean.FALSE);
                mVar4.a();
            } else {
                Object objCloneTransition = a11.cloneTransition(mVar4.g());
                D.e eVarB = mVar4.b();
                boolean z11 = obj3 != null && (eVarB == eVar9 || eVarB == eVar10);
                if (objCloneTransition == null) {
                    if (!z11) {
                        map.put(eVarB, Boolean.FALSE);
                        mVar4.a();
                    }
                    arrayList2 = arrayList12;
                    arrayList = arrayList13;
                    it = it5;
                    view = view13;
                    objMergeTransitionsTogether = obj4;
                    eVar3 = eVar10;
                    view2 = view12;
                } else {
                    it = it5;
                    ArrayList arrayList15 = new ArrayList();
                    Object obj5 = obj4;
                    c1008c3.s(arrayList15, eVarB.getFragment().f9464H);
                    if (z11) {
                        if (eVarB == eVar9) {
                            arrayList15.removeAll(arrayList13);
                        } else {
                            arrayList15.removeAll(arrayList12);
                        }
                    }
                    if (arrayList15.isEmpty()) {
                        a11.addTarget(objCloneTransition, view13);
                        arrayList2 = arrayList12;
                        arrayList = arrayList13;
                        view = view13;
                        eVar4 = eVarB;
                        obj2 = objMergeTransitionsTogether2;
                        eVar3 = eVar10;
                        obj = obj5;
                    } else {
                        a11.addTargets(objCloneTransition, arrayList15);
                        view = view13;
                        obj = obj5;
                        arrayList = arrayList13;
                        obj2 = objMergeTransitionsTogether2;
                        arrayList2 = arrayList12;
                        eVar3 = eVar10;
                        a11.scheduleRemoveTargets(objCloneTransition, objCloneTransition, arrayList15, null, null, null, null);
                        if (eVarB.getFinalState() == D.e.c.GONE) {
                            eVar4 = eVarB;
                            list2.remove(eVar4);
                            ArrayList<View> arrayList16 = new ArrayList<>(arrayList15);
                            arrayList16.remove(eVar4.getFragment().f9464H);
                            a11.scheduleHideFragmentView(objCloneTransition, eVar4.getFragment().f9464H, arrayList16);
                            Z.add(getContainer(), c1008c3.new i(arrayList15));
                        } else {
                            eVar4 = eVarB;
                        }
                    }
                    if (eVar4.getFinalState() == D.e.c.VISIBLE) {
                        arrayList14.addAll(arrayList15);
                        if (z10) {
                            a11.setEpicenter(objCloneTransition, rect3);
                        }
                        view2 = view12;
                    } else {
                        view2 = view12;
                        a11.setEpicenter(objCloneTransition, view2);
                    }
                    map.put(eVar4, Boolean.TRUE);
                    if (mVar4.h()) {
                        objMergeTransitionsTogether2 = a11.mergeTransitionsTogether(obj2, objCloneTransition, null);
                        objMergeTransitionsTogether = obj;
                    } else {
                        objMergeTransitionsTogether = a11.mergeTransitionsTogether(obj, objCloneTransition, null);
                        objMergeTransitionsTogether2 = obj2;
                    }
                }
                eVar10 = eVar3;
                obj4 = objMergeTransitionsTogether;
                view12 = view2;
                view13 = view;
                arrayList13 = arrayList;
                arrayList12 = arrayList2;
                it5 = it;
            }
        }
        ArrayList arrayList17 = arrayList12;
        ArrayList<View> arrayList18 = arrayList13;
        D.e eVar11 = eVar10;
        Object objMergeTransitionsInSequence = a11.mergeTransitionsInSequence(objMergeTransitionsTogether2, obj4, obj3);
        Iterator it6 = list.iterator();
        while (it6.hasNext()) {
            m mVar5 = (m) it6.next();
            if (!mVar5.d()) {
                Object objG = mVar5.g();
                D.e eVarB2 = mVar5.b();
                boolean z12 = obj3 != null && (eVarB2 == eVar9 || eVarB2 == eVar11);
                if (objG != null || z12) {
                    if (AbstractC0985p0.isLaidOut(getContainer())) {
                        a11.setListenerForTransitionEnd(mVar5.b().getFragment(), objMergeTransitionsInSequence, mVar5.c(), c1008c3.new j(mVar5));
                    } else {
                        if (FragmentManager.x0(2)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("SpecialEffectsController: Container ");
                            sb.append(getContainer());
                            sb.append(" has not been laid out. Completing operation ");
                            sb.append(eVarB2);
                        }
                        mVar5.a();
                    }
                }
            }
        }
        if (!AbstractC0985p0.isLaidOut(getContainer())) {
            return map;
        }
        y.z(arrayList14, 4);
        ArrayList arrayListH = a11.h(arrayList17);
        a11.beginDelayedTransition(getContainer(), objMergeTransitionsInSequence);
        a11.k(getContainer(), arrayList18, arrayList17, arrayListH, aVar5);
        y.z(arrayList14, 0);
        a11.swapSharedElementTargets(obj3, arrayList18, arrayList17);
        return map;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0082  */
    @Override // androidx.fragment.app.D
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void f(java.util.List r11, boolean r12) {
        /*
            r10 = this;
            java.util.Iterator r0 = r11.iterator()
            r1 = 0
            r6 = r1
            r7 = r6
        L7:
            boolean r1 = r0.hasNext()
            r2 = 1
            if (r1 == 0) goto L44
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.D$e r1 = (androidx.fragment.app.D.e) r1
            androidx.fragment.app.Fragment r3 = r1.getFragment()
            android.view.View r3 = r3.f9464H
            androidx.fragment.app.D$e$c r3 = androidx.fragment.app.D.e.c.c(r3)
            int[] r4 = androidx.fragment.app.C1008c.a.f9645a
            androidx.fragment.app.D$e$c r5 = r1.getFinalState()
            int r5 = r5.ordinal()
            r4 = r4[r5]
            if (r4 == r2) goto L3c
            r2 = 2
            if (r4 == r2) goto L3c
            r2 = 3
            if (r4 == r2) goto L3c
            r2 = 4
            if (r4 == r2) goto L36
            goto L7
        L36:
            androidx.fragment.app.D$e$c r2 = androidx.fragment.app.D.e.c.VISIBLE
            if (r3 == r2) goto L7
            r7 = r1
            goto L7
        L3c:
            androidx.fragment.app.D$e$c r2 = androidx.fragment.app.D.e.c.VISIBLE
            if (r3 != r2) goto L7
            if (r6 != 0) goto L7
            r6 = r1
            goto L7
        L44:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r11)
            java.util.Iterator r11 = r11.iterator()
        L57:
            boolean r4 = r11.hasNext()
            if (r4 == 0) goto L96
            java.lang.Object r4 = r11.next()
            androidx.fragment.app.D$e r4 = (androidx.fragment.app.D.e) r4
            androidx.core.os.e r5 = new androidx.core.os.e
            r5.<init>()
            r4.markStartedSpecialEffect(r5)
            androidx.fragment.app.c$k r8 = new androidx.fragment.app.c$k
            r8.<init>(r4, r5, r12)
            r0.add(r8)
            androidx.core.os.e r5 = new androidx.core.os.e
            r5.<init>()
            r4.markStartedSpecialEffect(r5)
            androidx.fragment.app.c$m r8 = new androidx.fragment.app.c$m
            r9 = 0
            if (r12 == 0) goto L84
            if (r4 != r6) goto L87
        L82:
            r9 = r2
            goto L87
        L84:
            if (r4 != r7) goto L87
            goto L82
        L87:
            r8.<init>(r4, r5, r12, r9)
            r3.add(r8)
            androidx.fragment.app.c$b r5 = new androidx.fragment.app.c$b
            r5.<init>(r1, r4)
            r4.a(r5)
            goto L57
        L96:
            r2 = r10
            r4 = r1
            r5 = r12
            java.util.Map r11 = r2.w(r3, r4, r5, r6, r7)
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            boolean r12 = r11.containsValue(r12)
            r10.v(r0, r1, r12, r11)
            java.util.Iterator r11 = r1.iterator()
        Laa:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto Lba
            java.lang.Object r12 = r11.next()
            androidx.fragment.app.D$e r12 = (androidx.fragment.app.D.e) r12
            r10.r(r12)
            goto Laa
        Lba:
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C1008c.f(java.util.List, boolean):void");
    }

    void r(D.e eVar) {
        eVar.getFinalState().a(eVar.getFragment().f9464H);
    }

    void s(ArrayList arrayList, View view) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (AbstractC0995u0.isTransitionGroup(viewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = viewGroup.getChildAt(i8);
            if (childAt.getVisibility() == 0) {
                s(arrayList, childAt);
            }
        }
    }

    void t(Map map, View view) {
        String transitionName = AbstractC0985p0.getTransitionName(view);
        if (transitionName != null) {
            map.put(transitionName, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = viewGroup.getChildAt(i8);
                if (childAt.getVisibility() == 0) {
                    t(map, childAt);
                }
            }
        }
    }

    void u(O.a aVar, Collection collection) {
        Iterator<Map.Entry<Object, Object>> it = aVar.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(AbstractC0985p0.getTransitionName((View) it.next().getValue()))) {
                it.remove();
            }
        }
    }
}
