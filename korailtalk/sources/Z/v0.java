package z;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import z.InterfaceC6565N;

/* loaded from: classes.dex */
public class v0 implements InterfaceC6565N {

    /* renamed from: b, reason: collision with root package name */
    protected static final Comparator f37844b;

    /* renamed from: c, reason: collision with root package name */
    private static final v0 f37845c;

    /* renamed from: a, reason: collision with root package name */
    protected final TreeMap f37846a;

    static {
        Comparator comparator = new Comparator() { // from class: z.u0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return v0.b((InterfaceC6565N.a) obj, (InterfaceC6565N.a) obj2);
            }
        };
        f37844b = comparator;
        f37845c = new v0(new TreeMap(comparator));
    }

    v0(TreeMap treeMap) {
        this.f37846a = treeMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int b(InterfaceC6565N.a aVar, InterfaceC6565N.a aVar2) {
        return aVar.getId().compareTo(aVar2.getId());
    }

    public static v0 emptyBundle() {
        return f37845c;
    }

    public static v0 from(InterfaceC6565N interfaceC6565N) {
        if (v0.class.equals(interfaceC6565N.getClass())) {
            return (v0) interfaceC6565N;
        }
        TreeMap treeMap = new TreeMap(f37844b);
        for (InterfaceC6565N.a aVar : interfaceC6565N.listOptions()) {
            Set<InterfaceC6565N.c> priorities = interfaceC6565N.getPriorities(aVar);
            ArrayMap arrayMap = new ArrayMap();
            for (InterfaceC6565N.c cVar : priorities) {
                arrayMap.put(cVar, interfaceC6565N.retrieveOptionWithPriority(aVar, cVar));
            }
            treeMap.put(aVar, arrayMap);
        }
        return new v0(treeMap);
    }

    @Override // z.InterfaceC6565N
    public boolean containsOption(InterfaceC6565N.a aVar) {
        return this.f37846a.containsKey(aVar);
    }

    @Override // z.InterfaceC6565N
    public void findOptions(String str, InterfaceC6565N.b bVar) {
        for (Map.Entry entry : this.f37846a.tailMap(InterfaceC6565N.a.create(str, Void.class)).entrySet()) {
            if (!((InterfaceC6565N.a) entry.getKey()).getId().startsWith(str) || !bVar.onOptionMatched((InterfaceC6565N.a) entry.getKey())) {
                return;
            }
        }
    }

    @Override // z.InterfaceC6565N
    public InterfaceC6565N.c getOptionPriority(InterfaceC6565N.a aVar) {
        Map map = (Map) this.f37846a.get(aVar);
        if (map != null) {
            return (InterfaceC6565N.c) Collections.min(map.keySet());
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar);
    }

    @Override // z.InterfaceC6565N
    public Set<InterfaceC6565N.c> getPriorities(InterfaceC6565N.a aVar) {
        Map map = (Map) this.f37846a.get(aVar);
        return map == null ? Collections.emptySet() : Collections.unmodifiableSet(map.keySet());
    }

    @Override // z.InterfaceC6565N
    public Set<InterfaceC6565N.a> listOptions() {
        return Collections.unmodifiableSet(this.f37846a.keySet());
    }

    @Override // z.InterfaceC6565N
    public <ValueT> ValueT retrieveOption(InterfaceC6565N.a aVar) {
        Map map = (Map) this.f37846a.get(aVar);
        if (map != null) {
            return (ValueT) map.get((InterfaceC6565N.c) Collections.min(map.keySet()));
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar);
    }

    @Override // z.InterfaceC6565N
    public <ValueT> ValueT retrieveOptionWithPriority(InterfaceC6565N.a aVar, InterfaceC6565N.c cVar) {
        Map map = (Map) this.f37846a.get(aVar);
        if (map == null) {
            throw new IllegalArgumentException("Option does not exist: " + aVar);
        }
        if (map.containsKey(cVar)) {
            return (ValueT) map.get(cVar);
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar + " with priority=" + cVar);
    }

    @Override // z.InterfaceC6565N
    public <ValueT> ValueT retrieveOption(InterfaceC6565N.a aVar, ValueT valuet) {
        try {
            return (ValueT) retrieveOption(aVar);
        } catch (IllegalArgumentException unused) {
            return valuet;
        }
    }
}
