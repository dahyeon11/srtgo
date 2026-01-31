package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.e;
import androidx.core.view.AbstractC0985p0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
abstract class D {

    /* renamed from: a, reason: collision with root package name */
    private final ViewGroup f9434a;

    /* renamed from: b, reason: collision with root package name */
    final ArrayList f9435b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    final ArrayList f9436c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    boolean f9437d = false;

    /* renamed from: e, reason: collision with root package name */
    boolean f9438e = false;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f9439a;

        a(d dVar) {
            this.f9439a = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (D.this.f9435b.contains(this.f9439a)) {
                this.f9439a.getFinalState().a(this.f9439a.getFragment().f9464H);
            }
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f9441a;

        b(d dVar) {
            this.f9441a = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            D.this.f9435b.remove(this.f9441a);
            D.this.f9436c.remove(this.f9441a);
        }
    }

    static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f9443a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f9444b;

        static {
            int[] iArr = new int[e.b.values().length];
            f9444b = iArr;
            try {
                iArr[e.b.ADDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9444b[e.b.REMOVING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9444b[e.b.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[e.c.values().length];
            f9443a = iArr2;
            try {
                iArr2[e.c.REMOVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9443a[e.c.VISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9443a[e.c.GONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f9443a[e.c.INVISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private static class d extends e {

        /* renamed from: h, reason: collision with root package name */
        private final v f9445h;

        d(e.c cVar, e.b bVar, v vVar, androidx.core.os.e eVar) {
            super(cVar, bVar, vVar.k(), eVar);
            this.f9445h = vVar;
        }

        @Override // androidx.fragment.app.D.e
        public void complete() {
            super.complete();
            this.f9445h.m();
        }

        @Override // androidx.fragment.app.D.e
        void g() {
            if (c() == e.b.ADDING) {
                Fragment fragmentK = this.f9445h.k();
                View viewFindFocus = fragmentK.f9464H.findFocus();
                if (viewFindFocus != null) {
                    fragmentK.h0(viewFindFocus);
                    if (FragmentManager.x0(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("requestFocus: Saved focused view ");
                        sb.append(viewFindFocus);
                        sb.append(" for Fragment ");
                        sb.append(fragmentK);
                    }
                }
                View viewRequireView = getFragment().requireView();
                if (viewRequireView.getParent() == null) {
                    this.f9445h.b();
                    viewRequireView.setAlpha(0.0f);
                }
                if (viewRequireView.getAlpha() == 0.0f && viewRequireView.getVisibility() == 0) {
                    viewRequireView.setVisibility(4);
                }
                viewRequireView.setAlpha(fragmentK.r());
            }
        }
    }

    static class e {

        /* renamed from: a, reason: collision with root package name */
        private c f9446a;

        /* renamed from: b, reason: collision with root package name */
        private b f9447b;

        /* renamed from: c, reason: collision with root package name */
        private final Fragment f9448c;

        /* renamed from: d, reason: collision with root package name */
        private final List f9449d = new ArrayList();

        /* renamed from: e, reason: collision with root package name */
        private final HashSet f9450e = new HashSet();

        /* renamed from: f, reason: collision with root package name */
        private boolean f9451f = false;

        /* renamed from: g, reason: collision with root package name */
        private boolean f9452g = false;

        class a implements e.a {
            a() {
            }

            @Override // androidx.core.os.e.a
            public void onCancel() {
                e.this.b();
            }
        }

        enum b {
            NONE,
            ADDING,
            REMOVING
        }

        enum c {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            static c b(int i8) {
                if (i8 == 0) {
                    return VISIBLE;
                }
                if (i8 == 4) {
                    return INVISIBLE;
                }
                if (i8 == 8) {
                    return GONE;
                }
                throw new IllegalArgumentException("Unknown visibility " + i8);
            }

            static c c(View view) {
                return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? INVISIBLE : b(view.getVisibility());
            }

            void a(View view) {
                int i8 = c.f9443a[ordinal()];
                if (i8 == 1) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        if (FragmentManager.x0(2)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("SpecialEffectsController: Removing view ");
                            sb.append(view);
                            sb.append(" from container ");
                            sb.append(viewGroup);
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (i8 == 2) {
                    if (FragmentManager.x0(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: Setting view ");
                        sb2.append(view);
                        sb2.append(" to VISIBLE");
                    }
                    view.setVisibility(0);
                    return;
                }
                if (i8 == 3) {
                    if (FragmentManager.x0(2)) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("SpecialEffectsController: Setting view ");
                        sb3.append(view);
                        sb3.append(" to GONE");
                    }
                    view.setVisibility(8);
                    return;
                }
                if (i8 != 4) {
                    return;
                }
                if (FragmentManager.x0(2)) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("SpecialEffectsController: Setting view ");
                    sb4.append(view);
                    sb4.append(" to INVISIBLE");
                }
                view.setVisibility(4);
            }
        }

        e(c cVar, b bVar, Fragment fragment, androidx.core.os.e eVar) {
            this.f9446a = cVar;
            this.f9447b = bVar;
            this.f9448c = fragment;
            eVar.setOnCancelListener(new a());
        }

        final void a(Runnable runnable) {
            this.f9449d.add(runnable);
        }

        final void b() {
            if (d()) {
                return;
            }
            this.f9451f = true;
            if (this.f9450e.isEmpty()) {
                complete();
                return;
            }
            Iterator it = new ArrayList(this.f9450e).iterator();
            while (it.hasNext()) {
                ((androidx.core.os.e) it.next()).cancel();
            }
        }

        b c() {
            return this.f9447b;
        }

        public void complete() {
            if (this.f9452g) {
                return;
            }
            if (FragmentManager.x0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("SpecialEffectsController: ");
                sb.append(this);
                sb.append(" has called complete.");
            }
            this.f9452g = true;
            Iterator it = this.f9449d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }

        public final void completeSpecialEffect(androidx.core.os.e eVar) {
            if (this.f9450e.remove(eVar) && this.f9450e.isEmpty()) {
                complete();
            }
        }

        final boolean d() {
            return this.f9451f;
        }

        final boolean e() {
            return this.f9452g;
        }

        final void f(c cVar, b bVar) {
            int i8 = c.f9444b[bVar.ordinal()];
            if (i8 == 1) {
                if (this.f9446a == c.REMOVED) {
                    if (FragmentManager.x0(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: For fragment ");
                        sb.append(this.f9448c);
                        sb.append(" mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = ");
                        sb.append(this.f9447b);
                        sb.append(" to ADDING.");
                    }
                    this.f9446a = c.VISIBLE;
                    this.f9447b = b.ADDING;
                    return;
                }
                return;
            }
            if (i8 == 2) {
                if (FragmentManager.x0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: For fragment ");
                    sb2.append(this.f9448c);
                    sb2.append(" mFinalState = ");
                    sb2.append(this.f9446a);
                    sb2.append(" -> REMOVED. mLifecycleImpact  = ");
                    sb2.append(this.f9447b);
                    sb2.append(" to REMOVING.");
                }
                this.f9446a = c.REMOVED;
                this.f9447b = b.REMOVING;
                return;
            }
            if (i8 == 3 && this.f9446a != c.REMOVED) {
                if (FragmentManager.x0(2)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("SpecialEffectsController: For fragment ");
                    sb3.append(this.f9448c);
                    sb3.append(" mFinalState = ");
                    sb3.append(this.f9446a);
                    sb3.append(" -> ");
                    sb3.append(cVar);
                    sb3.append(". ");
                }
                this.f9446a = cVar;
            }
        }

        abstract void g();

        public c getFinalState() {
            return this.f9446a;
        }

        public final Fragment getFragment() {
            return this.f9448c;
        }

        public final void markStartedSpecialEffect(androidx.core.os.e eVar) {
            g();
            this.f9450e.add(eVar);
        }

        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + this.f9446a + "} {mLifecycleImpact = " + this.f9447b + "} {mFragment = " + this.f9448c + "}";
        }
    }

    D(ViewGroup viewGroup) {
        this.f9434a = viewGroup;
    }

    private void a(e.c cVar, e.b bVar, v vVar) {
        synchronized (this.f9435b) {
            try {
                androidx.core.os.e eVar = new androidx.core.os.e();
                e eVarH = h(vVar.k());
                if (eVarH != null) {
                    eVarH.f(cVar, bVar);
                    return;
                }
                d dVar = new d(cVar, bVar, vVar, eVar);
                this.f9435b.add(dVar);
                dVar.a(new a(dVar));
                dVar.a(new b(dVar));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private e h(Fragment fragment) {
        Iterator it = this.f9435b.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            if (eVar.getFragment().equals(fragment) && !eVar.d()) {
                return eVar;
            }
        }
        return null;
    }

    private e i(Fragment fragment) {
        Iterator it = this.f9436c.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            if (eVar.getFragment().equals(fragment) && !eVar.d()) {
                return eVar;
            }
        }
        return null;
    }

    static D m(ViewGroup viewGroup, FragmentManager fragmentManager) {
        return n(viewGroup, fragmentManager.r0());
    }

    static D n(ViewGroup viewGroup, E e8) {
        Object tag = viewGroup.getTag(f0.b.special_effects_controller_view_tag);
        if (tag instanceof D) {
            return (D) tag;
        }
        D dCreateController = e8.createController(viewGroup);
        viewGroup.setTag(f0.b.special_effects_controller_view_tag, dCreateController);
        return dCreateController;
    }

    private void p() {
        Iterator it = this.f9435b.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            if (eVar.c() == e.b.ADDING) {
                eVar.f(e.c.b(eVar.getFragment().requireView().getVisibility()), e.b.NONE);
            }
        }
    }

    void b(e.c cVar, v vVar) {
        if (FragmentManager.x0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("SpecialEffectsController: Enqueuing add operation for fragment ");
            sb.append(vVar.k());
        }
        a(cVar, e.b.ADDING, vVar);
    }

    void c(v vVar) {
        if (FragmentManager.x0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("SpecialEffectsController: Enqueuing hide operation for fragment ");
            sb.append(vVar.k());
        }
        a(e.c.GONE, e.b.NONE, vVar);
    }

    void d(v vVar) {
        if (FragmentManager.x0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("SpecialEffectsController: Enqueuing remove operation for fragment ");
            sb.append(vVar.k());
        }
        a(e.c.REMOVED, e.b.REMOVING, vVar);
    }

    void e(v vVar) {
        if (FragmentManager.x0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("SpecialEffectsController: Enqueuing show operation for fragment ");
            sb.append(vVar.k());
        }
        a(e.c.VISIBLE, e.b.NONE, vVar);
    }

    abstract void f(List list, boolean z8);

    void g() {
        if (this.f9438e) {
            return;
        }
        if (!AbstractC0985p0.isAttachedToWindow(this.f9434a)) {
            j();
            this.f9437d = false;
            return;
        }
        synchronized (this.f9435b) {
            try {
                if (!this.f9435b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.f9436c);
                    this.f9436c.clear();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        e eVar = (e) it.next();
                        if (FragmentManager.x0(2)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("SpecialEffectsController: Cancelling operation ");
                            sb.append(eVar);
                        }
                        eVar.b();
                        if (!eVar.e()) {
                            this.f9436c.add(eVar);
                        }
                    }
                    p();
                    ArrayList arrayList2 = new ArrayList(this.f9435b);
                    this.f9435b.clear();
                    this.f9436c.addAll(arrayList2);
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((e) it2.next()).g();
                    }
                    f(arrayList2, this.f9437d);
                    this.f9437d = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public ViewGroup getContainer() {
        return this.f9434a;
    }

    void j() {
        String str;
        String str2;
        boolean zIsAttachedToWindow = AbstractC0985p0.isAttachedToWindow(this.f9434a);
        synchronized (this.f9435b) {
            try {
                p();
                Iterator it = this.f9435b.iterator();
                while (it.hasNext()) {
                    ((e) it.next()).g();
                }
                Iterator it2 = new ArrayList(this.f9436c).iterator();
                while (it2.hasNext()) {
                    e eVar = (e) it2.next();
                    if (FragmentManager.x0(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: ");
                        if (zIsAttachedToWindow) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.f9434a + " is not attached to window. ";
                        }
                        sb.append(str2);
                        sb.append("Cancelling running operation ");
                        sb.append(eVar);
                    }
                    eVar.b();
                }
                Iterator it3 = new ArrayList(this.f9435b).iterator();
                while (it3.hasNext()) {
                    e eVar2 = (e) it3.next();
                    if (FragmentManager.x0(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: ");
                        if (zIsAttachedToWindow) {
                            str = "";
                        } else {
                            str = "Container " + this.f9434a + " is not attached to window. ";
                        }
                        sb2.append(str);
                        sb2.append("Cancelling pending operation ");
                        sb2.append(eVar2);
                    }
                    eVar2.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void k() {
        if (this.f9438e) {
            this.f9438e = false;
            g();
        }
    }

    e.b l(v vVar) {
        e eVarH = h(vVar.k());
        e.b bVarC = eVarH != null ? eVarH.c() : null;
        e eVarI = i(vVar.k());
        return (eVarI == null || !(bVarC == null || bVarC == e.b.NONE)) ? bVarC : eVarI.c();
    }

    void o() {
        synchronized (this.f9435b) {
            try {
                p();
                this.f9438e = false;
                int size = this.f9435b.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    e eVar = (e) this.f9435b.get(size);
                    e.c cVarC = e.c.c(eVar.getFragment().f9464H);
                    e.c finalState = eVar.getFinalState();
                    e.c cVar = e.c.VISIBLE;
                    if (finalState == cVar && cVarC != cVar) {
                        this.f9438e = eVar.getFragment().y();
                        break;
                    }
                    size--;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void q(boolean z8) {
        this.f9437d = z8;
    }
}
