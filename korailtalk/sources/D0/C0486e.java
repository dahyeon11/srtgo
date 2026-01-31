package D0;

import D0.AbstractC0494m;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* renamed from: D0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0486e extends androidx.fragment.app.A {

    /* renamed from: D0.e$a */
    class a extends AbstractC0494m.f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Rect f791a;

        a(Rect rect) {
            this.f791a = rect;
        }

        @Override // D0.AbstractC0494m.f
        public Rect onGetEpicenter(AbstractC0494m abstractC0494m) {
            return this.f791a;
        }
    }

    /* renamed from: D0.e$c */
    class c extends C0495n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f796a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f797b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f798c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ArrayList f799d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object f800e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ArrayList f801f;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f796a = obj;
            this.f797b = arrayList;
            this.f798c = obj2;
            this.f799d = arrayList2;
            this.f800e = obj3;
            this.f801f = arrayList3;
        }

        @Override // D0.C0495n, D0.AbstractC0494m.g
        public void onTransitionEnd(AbstractC0494m abstractC0494m) {
            abstractC0494m.removeListener(this);
        }

        @Override // D0.C0495n, D0.AbstractC0494m.g
        public void onTransitionStart(AbstractC0494m abstractC0494m) {
            Object obj = this.f796a;
            if (obj != null) {
                C0486e.this.replaceTargets(obj, this.f797b, null);
            }
            Object obj2 = this.f798c;
            if (obj2 != null) {
                C0486e.this.replaceTargets(obj2, this.f799d, null);
            }
            Object obj3 = this.f800e;
            if (obj3 != null) {
                C0486e.this.replaceTargets(obj3, this.f801f, null);
            }
        }
    }

    /* renamed from: D0.e$d */
    class d extends AbstractC0494m.f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Rect f803a;

        d(Rect rect) {
            this.f803a = rect;
        }

        @Override // D0.AbstractC0494m.f
        public Rect onGetEpicenter(AbstractC0494m abstractC0494m) {
            Rect rect = this.f803a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f803a;
        }
    }

    private static boolean l(AbstractC0494m abstractC0494m) {
        return (androidx.fragment.app.A.g(abstractC0494m.getTargetIds()) && androidx.fragment.app.A.g(abstractC0494m.getTargetNames()) && androidx.fragment.app.A.g(abstractC0494m.getTargetTypes())) ? false : true;
    }

    @Override // androidx.fragment.app.A
    public void addTarget(Object obj, View view) {
        if (obj != null) {
            ((AbstractC0494m) obj).addTarget(view);
        }
    }

    @Override // androidx.fragment.app.A
    public void addTargets(Object obj, ArrayList<View> arrayList) {
        AbstractC0494m abstractC0494m = (AbstractC0494m) obj;
        if (abstractC0494m == null) {
            return;
        }
        int i8 = 0;
        if (abstractC0494m instanceof C0498q) {
            C0498q c0498q = (C0498q) abstractC0494m;
            int transitionCount = c0498q.getTransitionCount();
            while (i8 < transitionCount) {
                addTargets(c0498q.getTransitionAt(i8), arrayList);
                i8++;
            }
            return;
        }
        if (l(abstractC0494m) || !androidx.fragment.app.A.g(abstractC0494m.getTargets())) {
            return;
        }
        int size = arrayList.size();
        while (i8 < size) {
            abstractC0494m.addTarget(arrayList.get(i8));
            i8++;
        }
    }

    @Override // androidx.fragment.app.A
    public void beginDelayedTransition(ViewGroup viewGroup, Object obj) {
        C0496o.beginDelayedTransition(viewGroup, (AbstractC0494m) obj);
    }

    @Override // androidx.fragment.app.A
    public boolean canHandle(Object obj) {
        return obj instanceof AbstractC0494m;
    }

    @Override // androidx.fragment.app.A
    public Object cloneTransition(Object obj) {
        if (obj != null) {
            return ((AbstractC0494m) obj).mo6clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.A
    public Object mergeTransitionsInSequence(Object obj, Object obj2, Object obj3) {
        AbstractC0494m ordering = (AbstractC0494m) obj;
        AbstractC0494m abstractC0494m = (AbstractC0494m) obj2;
        AbstractC0494m abstractC0494m2 = (AbstractC0494m) obj3;
        if (ordering != null && abstractC0494m != null) {
            ordering = new C0498q().addTransition(ordering).addTransition(abstractC0494m).setOrdering(1);
        } else if (ordering == null) {
            ordering = abstractC0494m != null ? abstractC0494m : null;
        }
        if (abstractC0494m2 == null) {
            return ordering;
        }
        C0498q c0498q = new C0498q();
        if (ordering != null) {
            c0498q.addTransition(ordering);
        }
        c0498q.addTransition(abstractC0494m2);
        return c0498q;
    }

    @Override // androidx.fragment.app.A
    public Object mergeTransitionsTogether(Object obj, Object obj2, Object obj3) {
        C0498q c0498q = new C0498q();
        if (obj != null) {
            c0498q.addTransition((AbstractC0494m) obj);
        }
        if (obj2 != null) {
            c0498q.addTransition((AbstractC0494m) obj2);
        }
        if (obj3 != null) {
            c0498q.addTransition((AbstractC0494m) obj3);
        }
        return c0498q;
    }

    @Override // androidx.fragment.app.A
    public void removeTarget(Object obj, View view) {
        if (obj != null) {
            ((AbstractC0494m) obj).removeTarget(view);
        }
    }

    @Override // androidx.fragment.app.A
    public void replaceTargets(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        AbstractC0494m abstractC0494m = (AbstractC0494m) obj;
        int i8 = 0;
        if (abstractC0494m instanceof C0498q) {
            C0498q c0498q = (C0498q) abstractC0494m;
            int transitionCount = c0498q.getTransitionCount();
            while (i8 < transitionCount) {
                replaceTargets(c0498q.getTransitionAt(i8), arrayList, arrayList2);
                i8++;
            }
            return;
        }
        if (l(abstractC0494m)) {
            return;
        }
        List<View> targets = abstractC0494m.getTargets();
        if (targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i8 < size) {
                abstractC0494m.addTarget(arrayList2.get(i8));
                i8++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                abstractC0494m.removeTarget(arrayList.get(size2));
            }
        }
    }

    @Override // androidx.fragment.app.A
    public void scheduleHideFragmentView(Object obj, View view, ArrayList<View> arrayList) {
        ((AbstractC0494m) obj).addListener(new b(view, arrayList));
    }

    @Override // androidx.fragment.app.A
    public void scheduleRemoveTargets(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((AbstractC0494m) obj).addListener(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.A
    public void setEpicenter(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            f(view, rect);
            ((AbstractC0494m) obj).setEpicenterCallback(new a(rect));
        }
    }

    @Override // androidx.fragment.app.A
    public void setSharedElementTargets(Object obj, View view, ArrayList<View> arrayList) {
        C0498q c0498q = (C0498q) obj;
        List<View> targets = c0498q.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            androidx.fragment.app.A.a(targets, arrayList.get(i8));
        }
        targets.add(view);
        arrayList.add(view);
        addTargets(c0498q, arrayList);
    }

    @Override // androidx.fragment.app.A
    public void swapSharedElementTargets(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        C0498q c0498q = (C0498q) obj;
        if (c0498q != null) {
            c0498q.getTargets().clear();
            c0498q.getTargets().addAll(arrayList2);
            replaceTargets(c0498q, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.A
    public Object wrapTransitionInSet(Object obj) {
        if (obj == null) {
            return null;
        }
        C0498q c0498q = new C0498q();
        c0498q.addTransition((AbstractC0494m) obj);
        return c0498q;
    }

    @Override // androidx.fragment.app.A
    public void setEpicenter(Object obj, Rect rect) {
        if (obj != null) {
            ((AbstractC0494m) obj).setEpicenterCallback(new d(rect));
        }
    }

    /* renamed from: D0.e$b */
    class b implements AbstractC0494m.g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f793a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f794b;

        b(View view, ArrayList arrayList) {
            this.f793a = view;
            this.f794b = arrayList;
        }

        @Override // D0.AbstractC0494m.g
        public void onTransitionEnd(AbstractC0494m abstractC0494m) {
            abstractC0494m.removeListener(this);
            this.f793a.setVisibility(8);
            int size = this.f794b.size();
            for (int i8 = 0; i8 < size; i8++) {
                ((View) this.f794b.get(i8)).setVisibility(0);
            }
        }

        @Override // D0.AbstractC0494m.g
        public void onTransitionCancel(AbstractC0494m abstractC0494m) {
        }

        @Override // D0.AbstractC0494m.g
        public void onTransitionPause(AbstractC0494m abstractC0494m) {
        }

        @Override // D0.AbstractC0494m.g
        public void onTransitionResume(AbstractC0494m abstractC0494m) {
        }

        @Override // D0.AbstractC0494m.g
        public void onTransitionStart(AbstractC0494m abstractC0494m) {
        }
    }
}
