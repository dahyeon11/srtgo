package z;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import z.InterfaceC6565N;

/* loaded from: classes.dex */
public final class r0 extends v0 implements q0 {

    /* renamed from: d, reason: collision with root package name */
    private static final InterfaceC6565N.c f37841d = InterfaceC6565N.c.OPTIONAL;

    private r0(TreeMap treeMap) {
        super(treeMap);
    }

    public static r0 create() {
        return new r0(new TreeMap(v0.f37844b));
    }

    public static r0 from(InterfaceC6565N interfaceC6565N) {
        TreeMap treeMap = new TreeMap(v0.f37844b);
        for (InterfaceC6565N.a aVar : interfaceC6565N.listOptions()) {
            Set<InterfaceC6565N.c> priorities = interfaceC6565N.getPriorities(aVar);
            ArrayMap arrayMap = new ArrayMap();
            for (InterfaceC6565N.c cVar : priorities) {
                arrayMap.put(cVar, interfaceC6565N.retrieveOptionWithPriority(aVar, cVar));
            }
            treeMap.put(aVar, arrayMap);
        }
        return new r0(treeMap);
    }

    @Override // z.q0
    public <ValueT> void insertOption(InterfaceC6565N.a aVar, ValueT valuet) {
        insertOption(aVar, f37841d, valuet);
    }

    @Override // z.q0
    public <ValueT> ValueT removeOption(InterfaceC6565N.a aVar) {
        return (ValueT) this.f37846a.remove(aVar);
    }

    @Override // z.q0
    public <ValueT> void insertOption(InterfaceC6565N.a aVar, InterfaceC6565N.c cVar, ValueT valuet) {
        Map map = (Map) this.f37846a.get(aVar);
        if (map == null) {
            ArrayMap arrayMap = new ArrayMap();
            this.f37846a.put(aVar, arrayMap);
            arrayMap.put(cVar, valuet);
            return;
        }
        InterfaceC6565N.c cVar2 = (InterfaceC6565N.c) Collections.min(map.keySet());
        if (Objects.equals(map.get(cVar2), valuet) || !InterfaceC6565N.hasConflict(cVar2, cVar)) {
            map.put(cVar, valuet);
            return;
        }
        throw new IllegalArgumentException("Option values conflicts: " + aVar.getId() + ", existing value (" + cVar2 + ")=" + map.get(cVar2) + ", conflicting (" + cVar + ")=" + valuet);
    }
}
