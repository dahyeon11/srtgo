package o1;

import java.util.Set;
import m1.C5904b;

/* loaded from: classes.dex */
final class m implements m1.g {

    /* renamed from: a */
    private final Set f34425a;

    /* renamed from: b */
    private final l f34426b;

    /* renamed from: c */
    private final p f34427c;

    m(Set set, l lVar, p pVar) {
        this.f34425a = set;
        this.f34426b = lVar;
        this.f34427c = pVar;
    }

    @Override // m1.g
    public <T> m1.f getTransport(String str, Class<T> cls, m1.e eVar) {
        return getTransport(str, cls, C5904b.of("proto"), eVar);
    }

    @Override // m1.g
    public <T> m1.f getTransport(String str, Class<T> cls, C5904b c5904b, m1.e eVar) {
        if (this.f34425a.contains(c5904b)) {
            return new o(this.f34426b, str, c5904b, eVar, this.f34427c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", c5904b, this.f34425a));
    }
}
