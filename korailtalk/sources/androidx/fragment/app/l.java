package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
class l {

    /* renamed from: a, reason: collision with root package name */
    private final CopyOnWriteArrayList f9738a = new CopyOnWriteArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final FragmentManager f9739b;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        final FragmentManager.m f9740a;

        /* renamed from: b, reason: collision with root package name */
        final boolean f9741b;

        a(FragmentManager.m mVar, boolean z8) {
            this.f9740a = mVar;
            this.f9741b = z8;
        }
    }

    l(FragmentManager fragmentManager) {
        this.f9739b = fragmentManager;
    }

    void a(Fragment fragment, Bundle bundle, boolean z8) {
        Fragment fragmentQ0 = this.f9739b.q0();
        if (fragmentQ0 != null) {
            fragmentQ0.getParentFragmentManager().p0().a(fragment, bundle, true);
        }
        Iterator it = this.f9738a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z8 || aVar.f9741b) {
                aVar.f9740a.onFragmentActivityCreated(this.f9739b, fragment, bundle);
            }
        }
    }

    void b(Fragment fragment, boolean z8) {
        Context contextB = this.f9739b.n0().b();
        Fragment fragmentQ0 = this.f9739b.q0();
        if (fragmentQ0 != null) {
            fragmentQ0.getParentFragmentManager().p0().b(fragment, true);
        }
        Iterator it = this.f9738a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z8 || aVar.f9741b) {
                aVar.f9740a.onFragmentAttached(this.f9739b, fragment, contextB);
            }
        }
    }

    void c(Fragment fragment, Bundle bundle, boolean z8) {
        Fragment fragmentQ0 = this.f9739b.q0();
        if (fragmentQ0 != null) {
            fragmentQ0.getParentFragmentManager().p0().c(fragment, bundle, true);
        }
        Iterator it = this.f9738a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z8 || aVar.f9741b) {
                aVar.f9740a.onFragmentCreated(this.f9739b, fragment, bundle);
            }
        }
    }

    void d(Fragment fragment, boolean z8) {
        Fragment fragmentQ0 = this.f9739b.q0();
        if (fragmentQ0 != null) {
            fragmentQ0.getParentFragmentManager().p0().d(fragment, true);
        }
        Iterator it = this.f9738a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z8 || aVar.f9741b) {
                aVar.f9740a.onFragmentDestroyed(this.f9739b, fragment);
            }
        }
    }

    void e(Fragment fragment, boolean z8) {
        Fragment fragmentQ0 = this.f9739b.q0();
        if (fragmentQ0 != null) {
            fragmentQ0.getParentFragmentManager().p0().e(fragment, true);
        }
        Iterator it = this.f9738a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z8 || aVar.f9741b) {
                aVar.f9740a.onFragmentDetached(this.f9739b, fragment);
            }
        }
    }

    void f(Fragment fragment, boolean z8) {
        Fragment fragmentQ0 = this.f9739b.q0();
        if (fragmentQ0 != null) {
            fragmentQ0.getParentFragmentManager().p0().f(fragment, true);
        }
        Iterator it = this.f9738a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z8 || aVar.f9741b) {
                aVar.f9740a.onFragmentPaused(this.f9739b, fragment);
            }
        }
    }

    void g(Fragment fragment, boolean z8) {
        Context contextB = this.f9739b.n0().b();
        Fragment fragmentQ0 = this.f9739b.q0();
        if (fragmentQ0 != null) {
            fragmentQ0.getParentFragmentManager().p0().g(fragment, true);
        }
        Iterator it = this.f9738a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z8 || aVar.f9741b) {
                aVar.f9740a.onFragmentPreAttached(this.f9739b, fragment, contextB);
            }
        }
    }

    void h(Fragment fragment, Bundle bundle, boolean z8) {
        Fragment fragmentQ0 = this.f9739b.q0();
        if (fragmentQ0 != null) {
            fragmentQ0.getParentFragmentManager().p0().h(fragment, bundle, true);
        }
        Iterator it = this.f9738a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z8 || aVar.f9741b) {
                aVar.f9740a.onFragmentPreCreated(this.f9739b, fragment, bundle);
            }
        }
    }

    void i(Fragment fragment, boolean z8) {
        Fragment fragmentQ0 = this.f9739b.q0();
        if (fragmentQ0 != null) {
            fragmentQ0.getParentFragmentManager().p0().i(fragment, true);
        }
        Iterator it = this.f9738a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z8 || aVar.f9741b) {
                aVar.f9740a.onFragmentResumed(this.f9739b, fragment);
            }
        }
    }

    void j(Fragment fragment, Bundle bundle, boolean z8) {
        Fragment fragmentQ0 = this.f9739b.q0();
        if (fragmentQ0 != null) {
            fragmentQ0.getParentFragmentManager().p0().j(fragment, bundle, true);
        }
        Iterator it = this.f9738a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z8 || aVar.f9741b) {
                aVar.f9740a.onFragmentSaveInstanceState(this.f9739b, fragment, bundle);
            }
        }
    }

    void k(Fragment fragment, boolean z8) {
        Fragment fragmentQ0 = this.f9739b.q0();
        if (fragmentQ0 != null) {
            fragmentQ0.getParentFragmentManager().p0().k(fragment, true);
        }
        Iterator it = this.f9738a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z8 || aVar.f9741b) {
                aVar.f9740a.onFragmentStarted(this.f9739b, fragment);
            }
        }
    }

    void l(Fragment fragment, boolean z8) {
        Fragment fragmentQ0 = this.f9739b.q0();
        if (fragmentQ0 != null) {
            fragmentQ0.getParentFragmentManager().p0().l(fragment, true);
        }
        Iterator it = this.f9738a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z8 || aVar.f9741b) {
                aVar.f9740a.onFragmentStopped(this.f9739b, fragment);
            }
        }
    }

    void m(Fragment fragment, View view, Bundle bundle, boolean z8) {
        Fragment fragmentQ0 = this.f9739b.q0();
        if (fragmentQ0 != null) {
            fragmentQ0.getParentFragmentManager().p0().m(fragment, view, bundle, true);
        }
        Iterator it = this.f9738a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z8 || aVar.f9741b) {
                aVar.f9740a.onFragmentViewCreated(this.f9739b, fragment, view, bundle);
            }
        }
    }

    void n(Fragment fragment, boolean z8) {
        Fragment fragmentQ0 = this.f9739b.q0();
        if (fragmentQ0 != null) {
            fragmentQ0.getParentFragmentManager().p0().n(fragment, true);
        }
        Iterator it = this.f9738a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z8 || aVar.f9741b) {
                aVar.f9740a.onFragmentViewDestroyed(this.f9739b, fragment);
            }
        }
    }

    public void registerFragmentLifecycleCallbacks(FragmentManager.m mVar, boolean z8) {
        this.f9738a.add(new a(mVar, z8));
    }

    public void unregisterFragmentLifecycleCallbacks(FragmentManager.m mVar) {
        synchronized (this.f9738a) {
            try {
                int size = this.f9738a.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size) {
                        break;
                    }
                    if (((a) this.f9738a.get(i8)).f9740a == mVar) {
                        this.f9738a.remove(i8);
                        break;
                    }
                    i8++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
