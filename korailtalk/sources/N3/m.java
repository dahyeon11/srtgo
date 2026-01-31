package n3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import u3.InterfaceC6416a;

/* loaded from: classes2.dex */
public class m extends AbstractC5948a {

    /* renamed from: e, reason: collision with root package name */
    private static final InterfaceC6416a f34228e = l.f34227a;

    /* renamed from: a, reason: collision with root package name */
    private final Map f34229a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map f34230b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Map f34231c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final s f34232d;

    public m(Executor executor, Iterable<i> iterable, e... eVarArr) {
        s sVar = new s(executor);
        this.f34232d = sVar;
        ArrayList<e> arrayList = new ArrayList();
        arrayList.add(e.of(sVar, s.class, r3.d.class, r3.c.class));
        Iterator<i> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next().getComponents());
        }
        for (e eVar : eVarArr) {
            if (eVar != null) {
                arrayList.add(eVar);
            }
        }
        n.a(arrayList);
        for (e eVar2 : arrayList) {
            this.f34229a.put(eVar2, new t(j.lambdaFactory$(this, eVar2)));
        }
        c();
        d();
    }

    static /* synthetic */ Object a(m mVar, e eVar) {
        return eVar.getFactory().create(new w(eVar, mVar));
    }

    static /* synthetic */ Set b(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(((t) it.next()).get());
        }
        return Collections.unmodifiableSet(hashSet);
    }

    private void c() {
        for (Map.Entry entry : this.f34229a.entrySet()) {
            e eVar = (e) entry.getKey();
            if (eVar.isValue()) {
                t tVar = (t) entry.getValue();
                Iterator<Class<Object>> it = eVar.getProvidedInterfaces().iterator();
                while (it.hasNext()) {
                    this.f34230b.put(it.next(), tVar);
                }
            }
        }
        e();
    }

    private void d() {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f34229a.entrySet()) {
            e eVar = (e) entry.getKey();
            if (!eVar.isValue()) {
                t tVar = (t) entry.getValue();
                for (Class<Object> cls : eVar.getProvidedInterfaces()) {
                    if (!map.containsKey(cls)) {
                        map.put(cls, new HashSet());
                    }
                    ((Set) map.get(cls)).add(tVar);
                }
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            this.f34231c.put((Class) entry2.getKey(), new t(k.lambdaFactory$((Set) entry2.getValue())));
        }
    }

    private void e() {
        for (e eVar : this.f34229a.keySet()) {
            for (o oVar : eVar.getDependencies()) {
                if (oVar.isRequired() && !this.f34230b.containsKey(oVar.getInterface())) {
                    throw new u(String.format("Unsatisfied dependency for component %s: %s", eVar, oVar.getInterface()));
                }
            }
        }
    }

    @Override // n3.AbstractC5948a, n3.f
    public /* bridge */ /* synthetic */ Object get(Class cls) {
        return super.get(cls);
    }

    @Override // n3.AbstractC5948a, n3.f
    public <T> InterfaceC6416a getProvider(Class<T> cls) {
        v.checkNotNull(cls, "Null interface requested.");
        return (InterfaceC6416a) this.f34230b.get(cls);
    }

    public void initializeEagerComponents(boolean z8) {
        for (Map.Entry entry : this.f34229a.entrySet()) {
            e eVar = (e) entry.getKey();
            t tVar = (t) entry.getValue();
            if (eVar.isAlwaysEager() || (eVar.isEagerInDefaultApp() && z8)) {
                tVar.get();
            }
        }
        this.f34232d.a();
    }

    @Override // n3.AbstractC5948a, n3.f
    public /* bridge */ /* synthetic */ Set setOf(Class cls) {
        return super.setOf(cls);
    }

    @Override // n3.AbstractC5948a, n3.f
    public <T> InterfaceC6416a setOfProvider(Class<T> cls) {
        t tVar = (t) this.f34231c.get(cls);
        return tVar != null ? tVar : f34228e;
    }
}
