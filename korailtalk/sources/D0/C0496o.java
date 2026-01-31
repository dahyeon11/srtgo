package D0;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.core.view.AbstractC0985p0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: D0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0496o {

    /* renamed from: c, reason: collision with root package name */
    private static AbstractC0494m f867c = new C0483b();

    /* renamed from: d, reason: collision with root package name */
    private static ThreadLocal f868d = new ThreadLocal();

    /* renamed from: e, reason: collision with root package name */
    static ArrayList f869e = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    private O.a f870a = new O.a();

    /* renamed from: b, reason: collision with root package name */
    private O.a f871b = new O.a();

    private static void a(C0492k c0492k, AbstractC0494m abstractC0494m) {
        ViewGroup sceneRoot = c0492k.getSceneRoot();
        if (f869e.contains(sceneRoot)) {
            return;
        }
        C0492k currentScene = C0492k.getCurrentScene(sceneRoot);
        if (abstractC0494m == null) {
            if (currentScene != null) {
                currentScene.exit();
            }
            c0492k.enter();
            return;
        }
        f869e.add(sceneRoot);
        AbstractC0494m abstractC0494mMo6clone = abstractC0494m.mo6clone();
        abstractC0494mMo6clone.E(sceneRoot);
        if (currentScene != null && currentScene.a()) {
            abstractC0494mMo6clone.D(true);
        }
        e(sceneRoot, abstractC0494mMo6clone);
        c0492k.enter();
        d(sceneRoot, abstractC0494mMo6clone);
    }

    static O.a b() {
        O.a aVar;
        WeakReference weakReference = (WeakReference) f868d.get();
        if (weakReference != null && (aVar = (O.a) weakReference.get()) != null) {
            return aVar;
        }
        O.a aVar2 = new O.a();
        f868d.set(new WeakReference(aVar2));
        return aVar2;
    }

    public static void beginDelayedTransition(ViewGroup viewGroup) {
        beginDelayedTransition(viewGroup, null);
    }

    private AbstractC0494m c(C0492k c0492k) {
        C0492k currentScene;
        O.a aVar;
        AbstractC0494m abstractC0494m;
        ViewGroup sceneRoot = c0492k.getSceneRoot();
        if (sceneRoot != null && (currentScene = C0492k.getCurrentScene(sceneRoot)) != null && (aVar = (O.a) this.f871b.get(c0492k)) != null && (abstractC0494m = (AbstractC0494m) aVar.get(currentScene)) != null) {
            return abstractC0494m;
        }
        AbstractC0494m abstractC0494m2 = (AbstractC0494m) this.f870a.get(c0492k);
        return abstractC0494m2 != null ? abstractC0494m2 : f867c;
    }

    private static void d(ViewGroup viewGroup, AbstractC0494m abstractC0494m) {
        if (abstractC0494m == null || viewGroup == null) {
            return;
        }
        a aVar = new a(abstractC0494m, viewGroup);
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    private static void e(ViewGroup viewGroup, AbstractC0494m abstractC0494m) {
        ArrayList arrayList = (ArrayList) b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((AbstractC0494m) it.next()).pause(viewGroup);
            }
        }
        if (abstractC0494m != null) {
            abstractC0494m.g(viewGroup, true);
        }
        C0492k currentScene = C0492k.getCurrentScene(viewGroup);
        if (currentScene != null) {
            currentScene.exit();
        }
    }

    public static void endTransitions(ViewGroup viewGroup) {
        f869e.remove(viewGroup);
        ArrayList arrayList = (ArrayList) b().get(viewGroup);
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            ((AbstractC0494m) arrayList2.get(size)).o(viewGroup);
        }
    }

    public static void go(C0492k c0492k) {
        a(c0492k, f867c);
    }

    public void setTransition(C0492k c0492k, AbstractC0494m abstractC0494m) {
        this.f870a.put(c0492k, abstractC0494m);
    }

    public void transitionTo(C0492k c0492k) {
        a(c0492k, c(c0492k));
    }

    public static void beginDelayedTransition(ViewGroup viewGroup, AbstractC0494m abstractC0494m) {
        if (f869e.contains(viewGroup) || !AbstractC0985p0.isLaidOut(viewGroup)) {
            return;
        }
        f869e.add(viewGroup);
        if (abstractC0494m == null) {
            abstractC0494m = f867c;
        }
        AbstractC0494m abstractC0494mMo6clone = abstractC0494m.mo6clone();
        e(viewGroup, abstractC0494mMo6clone);
        C0492k.b(viewGroup, null);
        d(viewGroup, abstractC0494mMo6clone);
    }

    public static void go(C0492k c0492k, AbstractC0494m abstractC0494m) {
        a(c0492k, abstractC0494m);
    }

    public void setTransition(C0492k c0492k, C0492k c0492k2, AbstractC0494m abstractC0494m) {
        O.a aVar = (O.a) this.f871b.get(c0492k2);
        if (aVar == null) {
            aVar = new O.a();
            this.f871b.put(c0492k2, aVar);
        }
        aVar.put(c0492k, abstractC0494m);
    }

    /* renamed from: D0.o$a */
    private static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        AbstractC0494m f872a;

        /* renamed from: b, reason: collision with root package name */
        ViewGroup f873b;

        /* renamed from: D0.o$a$a, reason: collision with other inner class name */
        class C0016a extends C0495n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ O.a f874a;

            C0016a(O.a aVar) {
                this.f874a = aVar;
            }

            @Override // D0.C0495n, D0.AbstractC0494m.g
            public void onTransitionEnd(AbstractC0494m abstractC0494m) {
                ((ArrayList) this.f874a.get(a.this.f873b)).remove(abstractC0494m);
                abstractC0494m.removeListener(this);
            }
        }

        a(AbstractC0494m abstractC0494m, ViewGroup viewGroup) {
            this.f872a = abstractC0494m;
            this.f873b = viewGroup;
        }

        private void a() {
            this.f873b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f873b.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            a();
            if (!C0496o.f869e.remove(this.f873b)) {
                return true;
            }
            O.a aVarB = C0496o.b();
            ArrayList arrayList = (ArrayList) aVarB.get(this.f873b);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList();
                aVarB.put(this.f873b, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f872a);
            this.f872a.addListener(new C0016a(aVarB));
            this.f872a.g(this.f873b, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((AbstractC0494m) it.next()).resume(this.f873b);
                }
            }
            this.f872a.A(this.f873b);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            a();
            C0496o.f869e.remove(this.f873b);
            ArrayList arrayList = (ArrayList) C0496o.b().get(this.f873b);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((AbstractC0494m) it.next()).resume(this.f873b);
                }
            }
            this.f872a.h(true);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }
    }
}
