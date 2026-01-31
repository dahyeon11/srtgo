package n3;

import java.util.Set;
import u3.InterfaceC6416a;

/* loaded from: classes2.dex */
public interface f {
    <T> T get(Class<T> cls);

    <T> InterfaceC6416a getProvider(Class<T> cls);

    <T> Set<T> setOf(Class<T> cls);

    <T> InterfaceC6416a setOfProvider(Class<T> cls);
}
