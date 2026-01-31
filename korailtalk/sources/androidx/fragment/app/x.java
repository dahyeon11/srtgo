package androidx.fragment.app;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.AbstractC0985p0;
import androidx.lifecycle.AbstractC1019h;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class x {
    public static final int TRANSIT_ENTER_MASK = 4096;
    public static final int TRANSIT_EXIT_MASK = 8192;
    public static final int TRANSIT_FRAGMENT_CLOSE = 8194;
    public static final int TRANSIT_FRAGMENT_FADE = 4099;
    public static final int TRANSIT_FRAGMENT_OPEN = 4097;
    public static final int TRANSIT_NONE = 0;
    public static final int TRANSIT_UNSET = -1;

    /* renamed from: a */
    private final i f9790a;

    /* renamed from: b */
    private final ClassLoader f9791b;

    /* renamed from: c */
    ArrayList f9792c;

    /* renamed from: d */
    int f9793d;

    /* renamed from: e */
    int f9794e;

    /* renamed from: f */
    int f9795f;

    /* renamed from: g */
    int f9796g;

    /* renamed from: h */
    int f9797h;

    /* renamed from: i */
    boolean f9798i;

    /* renamed from: j */
    boolean f9799j;

    /* renamed from: k */
    String f9800k;

    /* renamed from: l */
    int f9801l;

    /* renamed from: m */
    CharSequence f9802m;

    /* renamed from: n */
    int f9803n;

    /* renamed from: o */
    CharSequence f9804o;

    /* renamed from: p */
    ArrayList f9805p;

    /* renamed from: q */
    ArrayList f9806q;

    /* renamed from: r */
    boolean f9807r;

    /* renamed from: s */
    ArrayList f9808s;

    static final class a {

        /* renamed from: a */
        int f9809a;

        /* renamed from: b */
        Fragment f9810b;

        /* renamed from: c */
        int f9811c;

        /* renamed from: d */
        int f9812d;

        /* renamed from: e */
        int f9813e;

        /* renamed from: f */
        int f9814f;

        /* renamed from: g */
        AbstractC1019h.b f9815g;

        /* renamed from: h */
        AbstractC1019h.b f9816h;

        a() {
        }

        a(int i8, Fragment fragment) {
            this.f9809a = i8;
            this.f9810b = fragment;
            AbstractC1019h.b bVar = AbstractC1019h.b.RESUMED;
            this.f9815g = bVar;
            this.f9816h = bVar;
        }

        a(int i8, Fragment fragment, AbstractC1019h.b bVar) {
            this.f9809a = i8;
            this.f9810b = fragment;
            this.f9815g = fragment.f9474R;
            this.f9816h = bVar;
        }
    }

    @Deprecated
    public x() {
        this.f9792c = new ArrayList();
        this.f9799j = true;
        this.f9807r = false;
        this.f9790a = null;
        this.f9791b = null;
    }

    private Fragment c(Class cls, Bundle bundle) {
        i iVar = this.f9790a;
        if (iVar == null) {
            throw new IllegalStateException("Creating a Fragment requires that this FragmentTransaction was built with FragmentManager.beginTransaction()");
        }
        ClassLoader classLoader = this.f9791b;
        if (classLoader == null) {
            throw new IllegalStateException("The FragmentManager must be attached to itshost to create a Fragment");
        }
        Fragment fragmentInstantiate = iVar.instantiate(classLoader, cls.getName());
        if (bundle != null) {
            fragmentInstantiate.setArguments(bundle);
        }
        return fragmentInstantiate;
    }

    x a(ViewGroup viewGroup, Fragment fragment, String str) {
        fragment.f9463G = viewGroup;
        return add(viewGroup.getId(), fragment, str);
    }

    public final x add(Class<? extends Fragment> cls, Bundle bundle, String str) {
        return add(c(cls, bundle), str);
    }

    public x addSharedElement(View view, String str) {
        if (y.B()) {
            String transitionName = AbstractC0985p0.getTransitionName(view);
            if (transitionName == null) {
                throw new IllegalArgumentException("Unique transitionNames are required for all sharedElements");
            }
            if (this.f9805p == null) {
                this.f9805p = new ArrayList();
                this.f9806q = new ArrayList();
            } else {
                if (this.f9806q.contains(str)) {
                    throw new IllegalArgumentException("A shared element with the target name '" + str + "' has already been added to the transaction.");
                }
                if (this.f9805p.contains(transitionName)) {
                    throw new IllegalArgumentException("A shared element with the source name '" + transitionName + "' has already been added to the transaction.");
                }
            }
            this.f9805p.add(transitionName);
            this.f9806q.add(str);
        }
        return this;
    }

    public x addToBackStack(String str) {
        if (!this.f9799j) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.f9798i = true;
        this.f9800k = str;
        return this;
    }

    public x attach(Fragment fragment) {
        b(new a(7, fragment));
        return this;
    }

    void b(a aVar) {
        this.f9792c.add(aVar);
        aVar.f9811c = this.f9793d;
        aVar.f9812d = this.f9794e;
        aVar.f9813e = this.f9795f;
        aVar.f9814f = this.f9796g;
    }

    public abstract int commit();

    public abstract int commitAllowingStateLoss();

    public abstract void commitNow();

    public abstract void commitNowAllowingStateLoss();

    void d(int i8, Fragment fragment, String str, int i9) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str2 = fragment.f9507y;
            if (str2 != null && !str.equals(str2)) {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.f9507y + " now " + str);
            }
            fragment.f9507y = str;
        }
        if (i8 != 0) {
            if (i8 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i10 = fragment.f9505w;
            if (i10 != 0 && i10 != i8) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.f9505w + " now " + i8);
            }
            fragment.f9505w = i8;
            fragment.f9506x = i8;
        }
        b(new a(i9, fragment));
    }

    public x detach(Fragment fragment) {
        b(new a(6, fragment));
        return this;
    }

    public x disallowAddToBackStack() {
        if (this.f9798i) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f9799j = false;
        return this;
    }

    public x hide(Fragment fragment) {
        b(new a(4, fragment));
        return this;
    }

    public boolean isAddToBackStackAllowed() {
        return this.f9799j;
    }

    public boolean isEmpty() {
        return this.f9792c.isEmpty();
    }

    public x remove(Fragment fragment) {
        b(new a(3, fragment));
        return this;
    }

    public final x replace(int i8, Class<? extends Fragment> cls, Bundle bundle) {
        return replace(i8, cls, bundle, null);
    }

    public x runOnCommit(Runnable runnable) {
        disallowAddToBackStack();
        if (this.f9808s == null) {
            this.f9808s = new ArrayList();
        }
        this.f9808s.add(runnable);
        return this;
    }

    @Deprecated
    public x setAllowOptimization(boolean z8) {
        return setReorderingAllowed(z8);
    }

    @Deprecated
    public x setBreadCrumbShortTitle(int i8) {
        this.f9803n = i8;
        this.f9804o = null;
        return this;
    }

    @Deprecated
    public x setBreadCrumbTitle(int i8) {
        this.f9801l = i8;
        this.f9802m = null;
        return this;
    }

    public x setCustomAnimations(int i8, int i9) {
        return setCustomAnimations(i8, i9, 0, 0);
    }

    public x setMaxLifecycle(Fragment fragment, AbstractC1019h.b bVar) {
        b(new a(10, fragment, bVar));
        return this;
    }

    public x setPrimaryNavigationFragment(Fragment fragment) {
        b(new a(8, fragment));
        return this;
    }

    public x setReorderingAllowed(boolean z8) {
        this.f9807r = z8;
        return this;
    }

    public x setTransition(int i8) {
        this.f9797h = i8;
        return this;
    }

    @Deprecated
    public x setTransitionStyle(int i8) {
        return this;
    }

    public x show(Fragment fragment) {
        b(new a(5, fragment));
        return this;
    }

    public x add(Fragment fragment, String str) {
        d(0, fragment, str, 1);
        return this;
    }

    public x replace(int i8, Fragment fragment) {
        return replace(i8, fragment, (String) null);
    }

    public x setCustomAnimations(int i8, int i9, int i10, int i11) {
        this.f9793d = i8;
        this.f9794e = i9;
        this.f9795f = i10;
        this.f9796g = i11;
        return this;
    }

    public final x add(int i8, Class<? extends Fragment> cls, Bundle bundle) {
        return add(i8, c(cls, bundle));
    }

    public final x replace(int i8, Class<? extends Fragment> cls, Bundle bundle, String str) {
        return replace(i8, c(cls, bundle), str);
    }

    @Deprecated
    public x setBreadCrumbShortTitle(CharSequence charSequence) {
        this.f9803n = 0;
        this.f9804o = charSequence;
        return this;
    }

    @Deprecated
    public x setBreadCrumbTitle(CharSequence charSequence) {
        this.f9801l = 0;
        this.f9802m = charSequence;
        return this;
    }

    public x add(int i8, Fragment fragment) {
        d(i8, fragment, null, 1);
        return this;
    }

    public x replace(int i8, Fragment fragment, String str) {
        if (i8 != 0) {
            d(i8, fragment, str, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    public final x add(int i8, Class<? extends Fragment> cls, Bundle bundle, String str) {
        return add(i8, c(cls, bundle), str);
    }

    public x add(int i8, Fragment fragment, String str) {
        d(i8, fragment, str, 1);
        return this;
    }

    x(i iVar, ClassLoader classLoader) {
        this.f9792c = new ArrayList();
        this.f9799j = true;
        this.f9807r = false;
        this.f9790a = iVar;
        this.f9791b = classLoader;
    }
}
