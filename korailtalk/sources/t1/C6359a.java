package t1;

import java.util.Map;
import w1.InterfaceC6458a;

/* renamed from: t1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6359a extends d {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6458a f36884a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f36885b;

    C6359a(InterfaceC6458a interfaceC6458a, Map map) {
        if (interfaceC6458a == null) {
            throw new NullPointerException("Null clock");
        }
        this.f36884a = interfaceC6458a;
        if (map == null) {
            throw new NullPointerException("Null values");
        }
        this.f36885b = map;
    }

    @Override // t1.d
    InterfaceC6458a b() {
        return this.f36884a;
    }

    @Override // t1.d
    Map c() {
        return this.f36885b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f36884a.equals(dVar.b()) && this.f36885b.equals(dVar.c());
    }

    public int hashCode() {
        return ((this.f36884a.hashCode() ^ 1000003) * 1000003) ^ this.f36885b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f36884a + ", values=" + this.f36885b + "}";
    }
}
