package androidx.fragment.app;

import D0.C0486e;
import android.content.Context;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.AbstractC0985p0;
import androidx.core.view.Z;
import androidx.fragment.app.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
abstract class y {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f9817a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* renamed from: b, reason: collision with root package name */
    static final A f9818b = new z();

    /* renamed from: c, reason: collision with root package name */
    static final A f9819c = v();

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f9820a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Fragment f9821b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.core.os.e f9822c;

        a(g gVar, Fragment fragment, androidx.core.os.e eVar) {
            this.f9820a = gVar;
            this.f9821b = fragment;
            this.f9822c = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f9820a.onComplete(this.f9821b, this.f9822c);
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f9823a;

        b(ArrayList arrayList) {
            this.f9823a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            y.z(this.f9823a, 4);
        }
    }

    class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f9824a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Fragment f9825b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.core.os.e f9826c;

        c(g gVar, Fragment fragment, androidx.core.os.e eVar) {
            this.f9824a = gVar;
            this.f9825b = fragment;
            this.f9826c = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f9824a.onComplete(this.f9825b, this.f9826c);
        }
    }

    class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f9827a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ A f9828b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f9829c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Fragment f9830d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ArrayList f9831e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ArrayList f9832f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ArrayList f9833g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Object f9834h;

        d(Object obj, A a9, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.f9827a = obj;
            this.f9828b = a9;
            this.f9829c = view;
            this.f9830d = fragment;
            this.f9831e = arrayList;
            this.f9832f = arrayList2;
            this.f9833g = arrayList3;
            this.f9834h = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj = this.f9827a;
            if (obj != null) {
                this.f9828b.removeTarget(obj, this.f9829c);
                this.f9832f.addAll(y.i(this.f9828b, this.f9827a, this.f9830d, this.f9831e, this.f9829c));
            }
            if (this.f9833g != null) {
                if (this.f9834h != null) {
                    ArrayList<View> arrayList = new ArrayList<>();
                    arrayList.add(this.f9829c);
                    this.f9828b.replaceTargets(this.f9834h, this.f9833g, arrayList);
                }
                this.f9833g.clear();
                this.f9833g.add(this.f9829c);
            }
        }
    }

    class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f9835a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Fragment f9836b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f9837c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ O.a f9838d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ View f9839e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ A f9840f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Rect f9841g;

        e(Fragment fragment, Fragment fragment2, boolean z8, O.a aVar, View view, A a9, Rect rect) {
            this.f9835a = fragment;
            this.f9836b = fragment2;
            this.f9837c = z8;
            this.f9838d = aVar;
            this.f9839e = view;
            this.f9840f = a9;
            this.f9841g = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            y.d(this.f9835a, this.f9836b, this.f9837c, this.f9838d, false);
            View view = this.f9839e;
            if (view != null) {
                this.f9840f.f(view, this.f9841g);
            }
        }
    }

    class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ A f9842a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ O.a f9843b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f9844c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ h f9845d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ArrayList f9846e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ View f9847f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Fragment f9848g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Fragment f9849h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f9850i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ ArrayList f9851j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Object f9852k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Rect f9853l;

        f(A a9, O.a aVar, Object obj, h hVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z8, ArrayList arrayList2, Object obj2, Rect rect) {
            this.f9842a = a9;
            this.f9843b = aVar;
            this.f9844c = obj;
            this.f9845d = hVar;
            this.f9846e = arrayList;
            this.f9847f = view;
            this.f9848g = fragment;
            this.f9849h = fragment2;
            this.f9850i = z8;
            this.f9851j = arrayList2;
            this.f9852k = obj2;
            this.f9853l = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            O.a aVarF = y.f(this.f9842a, this.f9843b, this.f9844c, this.f9845d);
            if (aVarF != null) {
                this.f9846e.addAll(aVarF.values());
                this.f9846e.add(this.f9847f);
            }
            y.d(this.f9848g, this.f9849h, this.f9850i, aVarF, false);
            Object obj = this.f9844c;
            if (obj != null) {
                this.f9842a.swapSharedElementTargets(obj, this.f9851j, this.f9846e);
                View viewR = y.r(aVarF, this.f9845d, this.f9852k, this.f9850i);
                if (viewR != null) {
                    this.f9842a.f(viewR, this.f9853l);
                }
            }
        }
    }

    interface g {
        void onComplete(Fragment fragment, androidx.core.os.e eVar);

        void onStart(Fragment fragment, androidx.core.os.e eVar);
    }

    static class h {
        public Fragment firstOut;
        public boolean firstOutIsPop;
        public C1006a firstOutTransaction;
        public Fragment lastIn;
        public boolean lastInIsPop;
        public C1006a lastInTransaction;

        h() {
        }
    }

    static void A(Context context, androidx.fragment.app.g gVar, ArrayList arrayList, ArrayList arrayList2, int i8, int i9, boolean z8, g gVar2) {
        ViewGroup viewGroup;
        SparseArray sparseArray = new SparseArray();
        for (int i10 = i8; i10 < i9; i10++) {
            C1006a c1006a = (C1006a) arrayList.get(i10);
            if (((Boolean) arrayList2.get(i10)).booleanValue()) {
                calculatePopFragments(c1006a, sparseArray, z8);
            } else {
                calculateFragments(c1006a, sparseArray, z8);
            }
        }
        if (sparseArray.size() != 0) {
            View view = new View(context);
            int size = sparseArray.size();
            for (int i11 = 0; i11 < size; i11++) {
                int iKeyAt = sparseArray.keyAt(i11);
                O.a aVarC = c(iKeyAt, arrayList, arrayList2, i8, i9);
                h hVar = (h) sparseArray.valueAt(i11);
                if (gVar.onHasView() && (viewGroup = (ViewGroup) gVar.onFindViewById(iKeyAt)) != null) {
                    if (z8) {
                        m(viewGroup, hVar, view, aVarC, gVar2);
                    } else {
                        l(viewGroup, hVar, view, aVarC, gVar2);
                    }
                }
            }
        }
    }

    static boolean B() {
        return (f9818b == null && f9819c == null) ? false : true;
    }

    private static void a(ArrayList arrayList, O.a aVar, Collection collection) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View view = (View) aVar.valueAt(size);
            if (collection.contains(AbstractC0985p0.getTransitionName(view))) {
                arrayList.add(view);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void b(androidx.fragment.app.C1006a r8, androidx.fragment.app.x.a r9, android.util.SparseArray r10, boolean r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.y.b(androidx.fragment.app.a, androidx.fragment.app.x$a, android.util.SparseArray, boolean, boolean):void");
    }

    private static O.a c(int i8, ArrayList arrayList, ArrayList arrayList2, int i9, int i10) {
        ArrayList arrayList3;
        ArrayList arrayList4;
        O.a aVar = new O.a();
        for (int i11 = i10 - 1; i11 >= i9; i11--) {
            C1006a c1006a = (C1006a) arrayList.get(i11);
            if (c1006a.j(i8)) {
                boolean zBooleanValue = ((Boolean) arrayList2.get(i11)).booleanValue();
                ArrayList arrayList5 = c1006a.f9805p;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (zBooleanValue) {
                        arrayList3 = c1006a.f9805p;
                        arrayList4 = c1006a.f9806q;
                    } else {
                        ArrayList arrayList6 = c1006a.f9805p;
                        arrayList3 = c1006a.f9806q;
                        arrayList4 = arrayList6;
                    }
                    for (int i12 = 0; i12 < size; i12++) {
                        String str = (String) arrayList4.get(i12);
                        String str2 = (String) arrayList3.get(i12);
                        String str3 = (String) aVar.remove(str2);
                        if (str3 != null) {
                            aVar.put(str, str3);
                        } else {
                            aVar.put(str, str2);
                        }
                    }
                }
            }
        }
        return aVar;
    }

    public static void calculateFragments(C1006a c1006a, SparseArray<h> sparseArray, boolean z8) {
        int size = c1006a.f9792c.size();
        for (int i8 = 0; i8 < size; i8++) {
            b(c1006a, (x.a) c1006a.f9792c.get(i8), sparseArray, false, z8);
        }
    }

    public static void calculatePopFragments(C1006a c1006a, SparseArray<h> sparseArray, boolean z8) {
        if (c1006a.f9628t.k0().onHasView()) {
            for (int size = c1006a.f9792c.size() - 1; size >= 0; size--) {
                b(c1006a, (x.a) c1006a.f9792c.get(size), sparseArray, true, z8);
            }
        }
    }

    static void d(Fragment fragment, Fragment fragment2, boolean z8, O.a aVar, boolean z9) {
        androidx.core.app.E eI = z8 ? fragment2.i() : fragment.i();
        if (eI != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = aVar == null ? 0 : aVar.size();
            for (int i8 = 0; i8 < size; i8++) {
                arrayList2.add(aVar.keyAt(i8));
                arrayList.add(aVar.valueAt(i8));
            }
            if (z9) {
                eI.onSharedElementStart(arrayList2, arrayList, null);
            } else {
                eI.onSharedElementEnd(arrayList2, arrayList, null);
            }
        }
    }

    private static boolean e(A a9, List list) {
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            if (!a9.canHandle(list.get(i8))) {
                return false;
            }
        }
        return true;
    }

    static O.a f(A a9, O.a aVar, Object obj, h hVar) {
        androidx.core.app.E eI;
        ArrayList arrayList;
        String strO;
        Fragment fragment = hVar.lastIn;
        View view = fragment.getView();
        if (aVar.isEmpty() || obj == null || view == null) {
            aVar.clear();
            return null;
        }
        O.a aVar2 = new O.a();
        a9.e(aVar2, view);
        C1006a c1006a = hVar.lastInTransaction;
        if (hVar.lastInIsPop) {
            eI = fragment.k();
            arrayList = c1006a.f9805p;
        } else {
            eI = fragment.i();
            arrayList = c1006a.f9806q;
        }
        if (arrayList != null) {
            aVar2.retainAll(arrayList);
            aVar2.retainAll(aVar.values());
        }
        if (eI != null) {
            eI.onMapSharedElements(arrayList, aVar2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = (String) arrayList.get(size);
                View view2 = (View) aVar2.get(str);
                if (view2 == null) {
                    String strO2 = o(aVar, str);
                    if (strO2 != null) {
                        aVar.remove(strO2);
                    }
                } else if (!str.equals(AbstractC0985p0.getTransitionName(view2)) && (strO = o(aVar, str)) != null) {
                    aVar.put(strO, AbstractC0985p0.getTransitionName(view2));
                }
            }
        } else {
            w(aVar, aVar2);
        }
        return aVar2;
    }

    private static O.a g(A a9, O.a aVar, Object obj, h hVar) {
        androidx.core.app.E eK;
        ArrayList arrayList;
        if (aVar.isEmpty() || obj == null) {
            aVar.clear();
            return null;
        }
        Fragment fragment = hVar.firstOut;
        O.a aVar2 = new O.a();
        a9.e(aVar2, fragment.requireView());
        C1006a c1006a = hVar.firstOutTransaction;
        if (hVar.firstOutIsPop) {
            eK = fragment.i();
            arrayList = c1006a.f9806q;
        } else {
            eK = fragment.k();
            arrayList = c1006a.f9805p;
        }
        if (arrayList != null) {
            aVar2.retainAll(arrayList);
        }
        if (eK != null) {
            eK.onMapSharedElements(arrayList, aVar2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = (String) arrayList.get(size);
                View view = (View) aVar2.get(str);
                if (view == null) {
                    aVar.remove(str);
                } else if (!str.equals(AbstractC0985p0.getTransitionName(view))) {
                    aVar.put(AbstractC0985p0.getTransitionName(view), (String) aVar.remove(str));
                }
            }
        } else {
            aVar.retainAll(aVar2.keySet());
        }
        return aVar2;
    }

    private static A h(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object exitTransition = fragment.getExitTransition();
            if (exitTransition != null) {
                arrayList.add(exitTransition);
            }
            Object returnTransition = fragment.getReturnTransition();
            if (returnTransition != null) {
                arrayList.add(returnTransition);
            }
            Object sharedElementReturnTransition = fragment.getSharedElementReturnTransition();
            if (sharedElementReturnTransition != null) {
                arrayList.add(sharedElementReturnTransition);
            }
        }
        if (fragment2 != null) {
            Object enterTransition = fragment2.getEnterTransition();
            if (enterTransition != null) {
                arrayList.add(enterTransition);
            }
            Object reenterTransition = fragment2.getReenterTransition();
            if (reenterTransition != null) {
                arrayList.add(reenterTransition);
            }
            Object sharedElementEnterTransition = fragment2.getSharedElementEnterTransition();
            if (sharedElementEnterTransition != null) {
                arrayList.add(sharedElementEnterTransition);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        A a9 = f9818b;
        if (a9 != null && e(a9, arrayList)) {
            return a9;
        }
        A a10 = f9819c;
        if (a10 != null && e(a10, arrayList)) {
            return a10;
        }
        if (a9 == null && a10 == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    static ArrayList i(A a9, Object obj, Fragment fragment, ArrayList arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View view2 = fragment.getView();
        if (view2 != null) {
            a9.b(arrayList2, view2);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        a9.addTargets(obj, arrayList2);
        return arrayList2;
    }

    private static Object j(A a9, ViewGroup viewGroup, View view, O.a aVar, h hVar, ArrayList arrayList, ArrayList arrayList2, Object obj, Object obj2) {
        Object objS;
        O.a aVar2;
        Object obj3;
        Rect rect;
        Fragment fragment = hVar.lastIn;
        Fragment fragment2 = hVar.firstOut;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z8 = hVar.lastInIsPop;
        if (aVar.isEmpty()) {
            aVar2 = aVar;
            objS = null;
        } else {
            objS = s(a9, fragment, fragment2, z8);
            aVar2 = aVar;
        }
        O.a aVarG = g(a9, aVar2, objS, hVar);
        if (aVar.isEmpty()) {
            obj3 = null;
        } else {
            arrayList.addAll(aVarG.values());
            obj3 = objS;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        d(fragment, fragment2, z8, aVarG, true);
        if (obj3 != null) {
            rect = new Rect();
            a9.setSharedElementTargets(obj3, view, arrayList);
            y(a9, obj3, obj2, aVarG, hVar.firstOutIsPop, hVar.firstOutTransaction);
            if (obj != null) {
                a9.setEpicenter(obj, rect);
            }
        } else {
            rect = null;
        }
        Z.add(viewGroup, new f(a9, aVar, obj3, hVar, arrayList2, view, fragment, fragment2, z8, arrayList, obj, rect));
        return obj3;
    }

    private static Object k(A a9, ViewGroup viewGroup, View view, O.a aVar, h hVar, ArrayList arrayList, ArrayList arrayList2, Object obj, Object obj2) {
        Object obj3;
        View view2;
        Rect rect;
        Fragment fragment = hVar.lastIn;
        Fragment fragment2 = hVar.firstOut;
        if (fragment != null) {
            fragment.requireView().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z8 = hVar.lastInIsPop;
        Object objS = aVar.isEmpty() ? null : s(a9, fragment, fragment2, z8);
        O.a aVarG = g(a9, aVar, objS, hVar);
        O.a aVarF = f(a9, aVar, objS, hVar);
        if (aVar.isEmpty()) {
            if (aVarG != null) {
                aVarG.clear();
            }
            if (aVarF != null) {
                aVarF.clear();
            }
            obj3 = null;
        } else {
            a(arrayList, aVarG, aVar.keySet());
            a(arrayList2, aVarF, aVar.values());
            obj3 = objS;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        d(fragment, fragment2, z8, aVarG, true);
        if (obj3 != null) {
            arrayList2.add(view);
            a9.setSharedElementTargets(obj3, view, arrayList);
            y(a9, obj3, obj2, aVarG, hVar.firstOutIsPop, hVar.firstOutTransaction);
            Rect rect2 = new Rect();
            View viewR = r(aVarF, hVar, obj, z8);
            if (viewR != null) {
                a9.setEpicenter(obj, rect2);
            }
            rect = rect2;
            view2 = viewR;
        } else {
            view2 = null;
            rect = null;
        }
        Z.add(viewGroup, new e(fragment, fragment2, z8, aVarF, view2, a9, rect));
        return obj3;
    }

    private static void l(ViewGroup viewGroup, h hVar, View view, O.a aVar, g gVar) {
        Object obj;
        Fragment fragment = hVar.lastIn;
        Fragment fragment2 = hVar.firstOut;
        A aH = h(fragment2, fragment);
        if (aH == null) {
            return;
        }
        boolean z8 = hVar.lastInIsPop;
        boolean z9 = hVar.firstOutIsPop;
        Object objP = p(aH, fragment, z8);
        Object objQ = q(aH, fragment2, z9);
        ArrayList arrayList = new ArrayList();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object objJ = j(aH, viewGroup, view, aVar, hVar, arrayList, arrayList2, objP, objQ);
        if (objP == null && objJ == null) {
            obj = objQ;
            if (obj == null) {
                return;
            }
        } else {
            obj = objQ;
        }
        ArrayList<View> arrayListI = i(aH, obj, fragment2, arrayList, view);
        if (arrayListI == null || arrayListI.isEmpty()) {
            obj = null;
        }
        Object obj2 = obj;
        aH.addTarget(objP, view);
        Object objT = t(aH, objP, obj2, objJ, fragment, hVar.lastInIsPop);
        if (fragment2 != null && arrayListI != null && (arrayListI.size() > 0 || arrayList.size() > 0)) {
            androidx.core.os.e eVar = new androidx.core.os.e();
            gVar.onStart(fragment2, eVar);
            aH.setListenerForTransitionEnd(fragment2, objT, eVar, new c(gVar, fragment2, eVar));
        }
        if (objT != null) {
            ArrayList<View> arrayList3 = new ArrayList<>();
            aH.scheduleRemoveTargets(objT, objP, arrayList3, obj2, arrayListI, objJ, arrayList2);
            x(aH, viewGroup, fragment, view, arrayList2, objP, arrayList3, obj2, arrayListI);
            aH.j(viewGroup, arrayList2, aVar);
            aH.beginDelayedTransition(viewGroup, objT);
            aH.i(viewGroup, arrayList2, aVar);
        }
    }

    private static void m(ViewGroup viewGroup, h hVar, View view, O.a aVar, g gVar) {
        Object obj;
        Fragment fragment = hVar.lastIn;
        Fragment fragment2 = hVar.firstOut;
        A aH = h(fragment2, fragment);
        if (aH == null) {
            return;
        }
        boolean z8 = hVar.lastInIsPop;
        boolean z9 = hVar.firstOutIsPop;
        ArrayList arrayList = new ArrayList();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object objP = p(aH, fragment, z8);
        Object objQ = q(aH, fragment2, z9);
        Object objK = k(aH, viewGroup, view, aVar, hVar, arrayList2, arrayList, objP, objQ);
        if (objP == null && objK == null) {
            obj = objQ;
            if (obj == null) {
                return;
            }
        } else {
            obj = objQ;
        }
        ArrayList<View> arrayListI = i(aH, obj, fragment2, arrayList2, view);
        ArrayList<View> arrayListI2 = i(aH, objP, fragment, arrayList, view);
        z(arrayListI2, 4);
        Object objT = t(aH, objP, obj, objK, fragment, z8);
        if (fragment2 != null && arrayListI != null && (arrayListI.size() > 0 || arrayList2.size() > 0)) {
            androidx.core.os.e eVar = new androidx.core.os.e();
            gVar.onStart(fragment2, eVar);
            aH.setListenerForTransitionEnd(fragment2, objT, eVar, new a(gVar, fragment2, eVar));
        }
        if (objT != null) {
            u(aH, obj, fragment2, arrayListI);
            ArrayList arrayListH = aH.h(arrayList);
            aH.scheduleRemoveTargets(objT, objP, arrayListI2, obj, arrayListI, objK, arrayList);
            aH.beginDelayedTransition(viewGroup, objT);
            aH.k(viewGroup, arrayList2, arrayList, arrayListH, aVar);
            z(arrayListI2, 0);
            aH.swapSharedElementTargets(objK, arrayList2, arrayList);
        }
    }

    private static h n(h hVar, SparseArray sparseArray, int i8) {
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h();
        sparseArray.put(i8, hVar2);
        return hVar2;
    }

    static String o(O.a aVar, String str) {
        int size = aVar.size();
        for (int i8 = 0; i8 < size; i8++) {
            if (str.equals(aVar.valueAt(i8))) {
                return (String) aVar.keyAt(i8);
            }
        }
        return null;
    }

    private static Object p(A a9, Fragment fragment, boolean z8) {
        if (fragment == null) {
            return null;
        }
        return a9.cloneTransition(z8 ? fragment.getReenterTransition() : fragment.getEnterTransition());
    }

    private static Object q(A a9, Fragment fragment, boolean z8) {
        if (fragment == null) {
            return null;
        }
        return a9.cloneTransition(z8 ? fragment.getReturnTransition() : fragment.getExitTransition());
    }

    static View r(O.a aVar, h hVar, Object obj, boolean z8) {
        ArrayList arrayList;
        C1006a c1006a = hVar.lastInTransaction;
        if (obj == null || aVar == null || (arrayList = c1006a.f9805p) == null || arrayList.isEmpty()) {
            return null;
        }
        return (View) aVar.get(z8 ? (String) c1006a.f9805p.get(0) : (String) c1006a.f9806q.get(0));
    }

    private static Object s(A a9, Fragment fragment, Fragment fragment2, boolean z8) {
        if (fragment == null || fragment2 == null) {
            return null;
        }
        return a9.wrapTransitionInSet(a9.cloneTransition(z8 ? fragment2.getSharedElementReturnTransition() : fragment.getSharedElementEnterTransition()));
    }

    private static Object t(A a9, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z8) {
        return (obj == null || obj2 == null || fragment == null) ? true : z8 ? fragment.getAllowReturnTransitionOverlap() : fragment.getAllowEnterTransitionOverlap() ? a9.mergeTransitionsTogether(obj2, obj, obj3) : a9.mergeTransitionsInSequence(obj2, obj, obj3);
    }

    private static void u(A a9, Object obj, Fragment fragment, ArrayList arrayList) {
        if (fragment != null && obj != null && fragment.f9494l && fragment.f9508z && fragment.f9470N) {
            fragment.i0(true);
            a9.scheduleHideFragmentView(obj, fragment.getView(), arrayList);
            Z.add(fragment.f9463G, new b(arrayList));
        }
    }

    private static A v() {
        try {
            return (A) C0486e.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }

    static void w(O.a aVar, O.a aVar2) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            if (!aVar2.containsKey((String) aVar.valueAt(size))) {
                aVar.removeAt(size);
            }
        }
    }

    private static void x(A a9, ViewGroup viewGroup, Fragment fragment, View view, ArrayList arrayList, Object obj, ArrayList arrayList2, Object obj2, ArrayList arrayList3) {
        Z.add(viewGroup, new d(obj, a9, view, fragment, arrayList, arrayList2, arrayList3, obj2));
    }

    private static void y(A a9, Object obj, Object obj2, O.a aVar, boolean z8, C1006a c1006a) {
        ArrayList arrayList = c1006a.f9805p;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        View view = (View) aVar.get(z8 ? (String) c1006a.f9806q.get(0) : (String) c1006a.f9805p.get(0));
        a9.setEpicenter(obj, view);
        if (obj2 != null) {
            a9.setEpicenter(obj2, view);
        }
    }

    static void z(ArrayList arrayList, int i8) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((View) arrayList.get(size)).setVisibility(i8);
        }
    }
}
