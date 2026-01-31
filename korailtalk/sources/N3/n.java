package n3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
abstract class n {

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private final e f34233a;

        /* renamed from: b, reason: collision with root package name */
        private final Set f34234b = new HashSet();

        /* renamed from: c, reason: collision with root package name */
        private final Set f34235c = new HashSet();

        b(e eVar) {
            this.f34233a = eVar;
        }

        void a(b bVar) {
            this.f34234b.add(bVar);
        }

        void b(b bVar) {
            this.f34235c.add(bVar);
        }

        e c() {
            return this.f34233a;
        }

        Set d() {
            return this.f34234b;
        }

        boolean e() {
            return this.f34234b.isEmpty();
        }

        boolean f() {
            return this.f34235c.isEmpty();
        }

        void g(b bVar) {
            this.f34235c.remove(bVar);
        }
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        private final Class f34236a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f34237b;

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.f34236a.equals(this.f34236a) && cVar.f34237b == this.f34237b;
        }

        public int hashCode() {
            return ((this.f34236a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f34237b).hashCode();
        }

        private c(Class cls, boolean z8) {
            this.f34236a = cls;
            this.f34237b = z8;
        }
    }

    static void a(List list) {
        Set<b> setC = c(list);
        Set setB = b(setC);
        int i8 = 0;
        while (!setB.isEmpty()) {
            b bVar = (b) setB.iterator().next();
            setB.remove(bVar);
            i8++;
            for (b bVar2 : bVar.d()) {
                bVar2.g(bVar);
                if (bVar2.f()) {
                    setB.add(bVar2);
                }
            }
        }
        if (i8 == list.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (b bVar3 : setC) {
            if (!bVar3.f() && !bVar3.e()) {
                arrayList.add(bVar3.c());
            }
        }
        throw new p(arrayList);
    }

    private static Set b(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.f()) {
                hashSet.add(bVar);
            }
        }
        return hashSet;
    }

    private static Set c(List list) {
        Set<b> set;
        HashMap map = new HashMap(list.size());
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (b bVar : (Set) it2.next()) {
                        for (o oVar : bVar.c().getDependencies()) {
                            if (oVar.isDirectInjection() && (set = (Set) map.get(new c(oVar.getInterface(), oVar.isSet()))) != null) {
                                for (b bVar2 : set) {
                                    bVar.a(bVar2);
                                    bVar2.b(bVar);
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                return hashSet;
            }
            e eVar = (e) it.next();
            b bVar3 = new b(eVar);
            for (Class<Object> cls : eVar.getProvidedInterfaces()) {
                c cVar = new c(cls, !eVar.isValue());
                if (!map.containsKey(cVar)) {
                    map.put(cVar, new HashSet());
                }
                Set set2 = (Set) map.get(cVar);
                if (!set2.isEmpty() && !cVar.f34237b) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", cls));
                }
                set2.add(bVar3);
            }
        }
    }
}
