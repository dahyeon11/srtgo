package n3;

import java.util.Set;
import u3.InterfaceC6416a;

/* loaded from: classes2.dex */
final /* synthetic */ class k implements InterfaceC6416a {

    /* renamed from: a, reason: collision with root package name */
    private final Set f34226a;

    private k(Set set) {
        this.f34226a = set;
    }

    public static InterfaceC6416a lambdaFactory$(Set set) {
        return new k(set);
    }

    @Override // u3.InterfaceC6416a
    public Object get() {
        return m.b(this.f34226a);
    }
}
