package f3;

import f3.AbstractC5469j0;
import java.util.EnumMap;
import java.util.Map;

/* renamed from: f3.f0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5461f0 extends AbstractC5469j0.c {

    /* renamed from: f, reason: collision with root package name */
    private final transient EnumMap f30930f;

    private C5461f0(EnumMap enumMap) {
        this.f30930f = enumMap;
        e3.w.checkArgument(!enumMap.isEmpty());
    }

    static AbstractC5469j0 h(EnumMap enumMap) {
        int size = enumMap.size();
        if (size == 0) {
            return AbstractC5469j0.of();
        }
        if (size != 1) {
            return new C5461f0(enumMap);
        }
        Map.Entry entry = (Map.Entry) AbstractC5493v0.getOnlyElement(enumMap.entrySet());
        return AbstractC5469j0.of((Enum) entry.getKey(), entry.getValue());
    }

    @Override // f3.AbstractC5469j0, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f30930f.containsKey(obj);
    }

    @Override // f3.AbstractC5469j0
    boolean e() {
        return false;
    }

    @Override // f3.AbstractC5469j0, java.util.Map
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5461f0) {
            obj = ((C5461f0) obj).f30930f;
        }
        return this.f30930f.equals(obj);
    }

    @Override // f3.AbstractC5469j0
    t1 f() {
        return AbstractC5495w0.unmodifiableIterator(this.f30930f.keySet().iterator());
    }

    @Override // f3.AbstractC5469j0.c
    t1 g() {
        return E0.J(this.f30930f.entrySet().iterator());
    }

    @Override // f3.AbstractC5469j0, java.util.Map
    public Object get(Object obj) {
        return this.f30930f.get(obj);
    }

    @Override // java.util.Map
    public int size() {
        return this.f30930f.size();
    }
}
