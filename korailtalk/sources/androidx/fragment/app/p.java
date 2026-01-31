package androidx.fragment.app;

import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.lifecycle.M;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import k0.AbstractC5837a;

/* loaded from: classes.dex */
final class p extends J {

    /* renamed from: k, reason: collision with root package name */
    private static final K.b f9753k = new a();

    /* renamed from: g, reason: collision with root package name */
    private final boolean f9757g;

    /* renamed from: d, reason: collision with root package name */
    private final HashMap f9754d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final HashMap f9755e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private final HashMap f9756f = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    private boolean f9758h = false;

    /* renamed from: i, reason: collision with root package name */
    private boolean f9759i = false;

    /* renamed from: j, reason: collision with root package name */
    private boolean f9760j = false;

    class a implements K.b {
        a() {
        }

        @Override // androidx.lifecycle.K.b
        public /* bridge */ /* synthetic */ J create(Class cls, AbstractC5837a abstractC5837a) {
            return super.create(cls, abstractC5837a);
        }

        @Override // androidx.lifecycle.K.b
        public <T extends J> T create(Class<T> cls) {
            return new p(true);
        }
    }

    p(boolean z8) {
        this.f9757g = z8;
    }

    static p j(M m8) {
        return (p) new K(m8, f9753k).get(p.class);
    }

    @Override // androidx.lifecycle.J
    protected void d() {
        if (FragmentManager.x0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("onCleared called for ");
            sb.append(this);
        }
        this.f9758h = true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        return this.f9754d.equals(pVar.f9754d) && this.f9755e.equals(pVar.f9755e) && this.f9756f.equals(pVar.f9756f);
    }

    void f(Fragment fragment) {
        if (this.f9760j) {
            FragmentManager.x0(2);
            return;
        }
        if (this.f9754d.containsKey(fragment.f9488f)) {
            return;
        }
        this.f9754d.put(fragment.f9488f, fragment);
        if (FragmentManager.x0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Updating retained Fragments: Added ");
            sb.append(fragment);
        }
    }

    void g(Fragment fragment) {
        if (FragmentManager.x0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Clearing non-config state for ");
            sb.append(fragment);
        }
        p pVar = (p) this.f9755e.get(fragment.f9488f);
        if (pVar != null) {
            pVar.d();
            this.f9755e.remove(fragment.f9488f);
        }
        M m8 = (M) this.f9756f.get(fragment.f9488f);
        if (m8 != null) {
            m8.clear();
            this.f9756f.remove(fragment.f9488f);
        }
    }

    Fragment h(String str) {
        return (Fragment) this.f9754d.get(str);
    }

    public int hashCode() {
        return (((this.f9754d.hashCode() * 31) + this.f9755e.hashCode()) * 31) + this.f9756f.hashCode();
    }

    p i(Fragment fragment) {
        p pVar = (p) this.f9755e.get(fragment.f9488f);
        if (pVar != null) {
            return pVar;
        }
        p pVar2 = new p(this.f9757g);
        this.f9755e.put(fragment.f9488f, pVar2);
        return pVar2;
    }

    Collection k() {
        return new ArrayList(this.f9754d.values());
    }

    n l() {
        if (this.f9754d.isEmpty() && this.f9755e.isEmpty() && this.f9756f.isEmpty()) {
            return null;
        }
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f9755e.entrySet()) {
            n nVarL = ((p) entry.getValue()).l();
            if (nVarL != null) {
                map.put(entry.getKey(), nVarL);
            }
        }
        this.f9759i = true;
        if (this.f9754d.isEmpty() && map.isEmpty() && this.f9756f.isEmpty()) {
            return null;
        }
        return new n(new ArrayList(this.f9754d.values()), map, new HashMap(this.f9756f));
    }

    M m(Fragment fragment) {
        M m8 = (M) this.f9756f.get(fragment.f9488f);
        if (m8 != null) {
            return m8;
        }
        M m9 = new M();
        this.f9756f.put(fragment.f9488f, m9);
        return m9;
    }

    boolean n() {
        return this.f9758h;
    }

    void o(Fragment fragment) {
        if (this.f9760j) {
            FragmentManager.x0(2);
        } else {
            if (this.f9754d.remove(fragment.f9488f) == null || !FragmentManager.x0(2)) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Updating retained Fragments: Removed ");
            sb.append(fragment);
        }
    }

    void p(n nVar) {
        this.f9754d.clear();
        this.f9755e.clear();
        this.f9756f.clear();
        if (nVar != null) {
            Collection<Fragment> collectionB = nVar.b();
            if (collectionB != null) {
                for (Fragment fragment : collectionB) {
                    if (fragment != null) {
                        this.f9754d.put(fragment.f9488f, fragment);
                    }
                }
            }
            Map mapA = nVar.a();
            if (mapA != null) {
                for (Map.Entry entry : mapA.entrySet()) {
                    p pVar = new p(this.f9757g);
                    pVar.p((n) entry.getValue());
                    this.f9755e.put(entry.getKey(), pVar);
                }
            }
            Map mapC = nVar.c();
            if (mapC != null) {
                this.f9756f.putAll(mapC);
            }
        }
        this.f9759i = false;
    }

    void q(boolean z8) {
        this.f9760j = z8;
    }

    boolean r(Fragment fragment) {
        if (this.f9754d.containsKey(fragment.f9488f)) {
            return this.f9757g ? this.f9758h : !this.f9759i;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f9754d.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f9755e.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f9756f.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
