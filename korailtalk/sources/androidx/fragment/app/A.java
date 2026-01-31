package androidx.fragment.app;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.AbstractC0985p0;
import androidx.core.view.AbstractC0995u0;
import androidx.core.view.Z;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class A {

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f9415a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f9416b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ArrayList f9417c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ArrayList f9418d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ArrayList f9419e;

        a(int i8, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f9415a = i8;
            this.f9416b = arrayList;
            this.f9417c = arrayList2;
            this.f9418d = arrayList3;
            this.f9419e = arrayList4;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i8 = 0; i8 < this.f9415a; i8++) {
                AbstractC0985p0.setTransitionName((View) this.f9416b.get(i8), (String) this.f9417c.get(i8));
                AbstractC0985p0.setTransitionName((View) this.f9418d.get(i8), (String) this.f9419e.get(i8));
            }
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f9421a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f9422b;

        b(ArrayList arrayList, Map map) {
            this.f9421a = arrayList;
            this.f9422b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f9421a.size();
            for (int i8 = 0; i8 < size; i8++) {
                View view = (View) this.f9421a.get(i8);
                String transitionName = AbstractC0985p0.getTransitionName(view);
                if (transitionName != null) {
                    AbstractC0985p0.setTransitionName(view, A.d(this.f9422b, transitionName));
                }
            }
        }
    }

    class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f9424a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f9425b;

        c(ArrayList arrayList, Map map) {
            this.f9424a = arrayList;
            this.f9425b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f9424a.size();
            for (int i8 = 0; i8 < size; i8++) {
                View view = (View) this.f9424a.get(i8);
                AbstractC0985p0.setTransitionName(view, (String) this.f9425b.get(AbstractC0985p0.getTransitionName(view)));
            }
        }
    }

    protected static void a(List list, View view) {
        int size = list.size();
        if (c(list, view, size)) {
            return;
        }
        if (AbstractC0985p0.getTransitionName(view) != null) {
            list.add(view);
        }
        for (int i8 = size; i8 < list.size(); i8++) {
            View view2 = (View) list.get(i8);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i9 = 0; i9 < childCount; i9++) {
                    View childAt = viewGroup.getChildAt(i9);
                    if (!c(list, childAt, size) && AbstractC0985p0.getTransitionName(childAt) != null) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    private static boolean c(List list, View view, int i8) {
        for (int i9 = 0; i9 < i8; i9++) {
            if (list.get(i9) == view) {
                return true;
            }
        }
        return false;
    }

    static String d(Map map, String str) {
        for (Map.Entry entry : map.entrySet()) {
            if (str.equals(entry.getValue())) {
                return (String) entry.getKey();
            }
        }
        return null;
    }

    protected static boolean g(List list) {
        return list == null || list.isEmpty();
    }

    public abstract void addTarget(Object obj, View view);

    public abstract void addTargets(Object obj, ArrayList<View> arrayList);

    void b(ArrayList arrayList, View view) {
        if (view.getVisibility() == 0) {
            if (!(view instanceof ViewGroup)) {
                arrayList.add(view);
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (AbstractC0995u0.isTransitionGroup(viewGroup)) {
                arrayList.add(viewGroup);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                b(arrayList, viewGroup.getChildAt(i8));
            }
        }
    }

    public abstract void beginDelayedTransition(ViewGroup viewGroup, Object obj);

    public abstract boolean canHandle(Object obj);

    public abstract Object cloneTransition(Object obj);

    void e(Map map, View view) {
        if (view.getVisibility() == 0) {
            String transitionName = AbstractC0985p0.getTransitionName(view);
            if (transitionName != null) {
                map.put(transitionName, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i8 = 0; i8 < childCount; i8++) {
                    e(map, viewGroup.getChildAt(i8));
                }
            }
        }
    }

    protected void f(View view, Rect rect) {
        if (AbstractC0985p0.isAttachedToWindow(view)) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            Object parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectF);
                rectF.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            view.getRootView().getLocationOnScreen(new int[2]);
            rectF.offset(r1[0], r1[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    ArrayList h(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            View view = (View) arrayList.get(i8);
            arrayList2.add(AbstractC0985p0.getTransitionName(view));
            AbstractC0985p0.setTransitionName(view, null);
        }
        return arrayList2;
    }

    void i(ViewGroup viewGroup, ArrayList arrayList, Map map) {
        Z.add(viewGroup, new c(arrayList, map));
    }

    void j(View view, ArrayList arrayList, Map map) {
        Z.add(view, new b(arrayList, map));
    }

    void k(View view, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Map map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i8 = 0; i8 < size; i8++) {
            View view2 = (View) arrayList.get(i8);
            String transitionName = AbstractC0985p0.getTransitionName(view2);
            arrayList4.add(transitionName);
            if (transitionName != null) {
                AbstractC0985p0.setTransitionName(view2, null);
                String str = (String) map.get(transitionName);
                int i9 = 0;
                while (true) {
                    if (i9 >= size) {
                        break;
                    }
                    if (str.equals(arrayList3.get(i9))) {
                        AbstractC0985p0.setTransitionName((View) arrayList2.get(i9), transitionName);
                        break;
                    }
                    i9++;
                }
            }
        }
        Z.add(view, new a(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    public abstract Object mergeTransitionsInSequence(Object obj, Object obj2, Object obj3);

    public abstract Object mergeTransitionsTogether(Object obj, Object obj2, Object obj3);

    public abstract void removeTarget(Object obj, View view);

    public abstract void replaceTargets(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract void scheduleHideFragmentView(Object obj, View view, ArrayList<View> arrayList);

    public abstract void scheduleRemoveTargets(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    public abstract void setEpicenter(Object obj, Rect rect);

    public abstract void setEpicenter(Object obj, View view);

    public void setListenerForTransitionEnd(Fragment fragment, Object obj, androidx.core.os.e eVar, Runnable runnable) {
        runnable.run();
    }

    public abstract void setSharedElementTargets(Object obj, View view, ArrayList<View> arrayList);

    public abstract void swapSharedElementTargets(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract Object wrapTransitionInSet(Object obj);
}
