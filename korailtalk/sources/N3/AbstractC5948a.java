package n3;

import java.util.Set;
import u3.InterfaceC6416a;

/* renamed from: n3.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC5948a implements f {
    AbstractC5948a() {
    }

    @Override // n3.f
    public <T> T get(Class<T> cls) {
        InterfaceC6416a provider = getProvider(cls);
        if (provider == null) {
            return null;
        }
        return (T) provider.get();
    }

    @Override // n3.f
    public abstract /* synthetic */ InterfaceC6416a getProvider(Class cls);

    @Override // n3.f
    public <T> Set<T> setOf(Class<T> cls) {
        return (Set) setOfProvider(cls).get();
    }

    @Override // n3.f
    public abstract /* synthetic */ InterfaceC6416a setOfProvider(Class cls);
}
