package z;

import java.util.Set;
import z.InterfaceC6565N;

/* loaded from: classes.dex */
public interface A0 extends InterfaceC6565N {
    @Override // z.InterfaceC6565N
    default boolean containsOption(InterfaceC6565N.a aVar) {
        return getConfig().containsOption(aVar);
    }

    @Override // z.InterfaceC6565N
    default void findOptions(String str, InterfaceC6565N.b bVar) {
        getConfig().findOptions(str, bVar);
    }

    InterfaceC6565N getConfig();

    @Override // z.InterfaceC6565N
    default InterfaceC6565N.c getOptionPriority(InterfaceC6565N.a aVar) {
        return getConfig().getOptionPriority(aVar);
    }

    @Override // z.InterfaceC6565N
    default Set<InterfaceC6565N.c> getPriorities(InterfaceC6565N.a aVar) {
        return getConfig().getPriorities(aVar);
    }

    @Override // z.InterfaceC6565N
    default Set<InterfaceC6565N.a> listOptions() {
        return getConfig().listOptions();
    }

    @Override // z.InterfaceC6565N
    default <ValueT> ValueT retrieveOption(InterfaceC6565N.a aVar) {
        return (ValueT) getConfig().retrieveOption(aVar);
    }

    @Override // z.InterfaceC6565N
    default <ValueT> ValueT retrieveOptionWithPriority(InterfaceC6565N.a aVar, InterfaceC6565N.c cVar) {
        return (ValueT) getConfig().retrieveOptionWithPriority(aVar, cVar);
    }

    @Override // z.InterfaceC6565N
    default <ValueT> ValueT retrieveOption(InterfaceC6565N.a aVar, ValueT valuet) {
        return (ValueT) getConfig().retrieveOption(aVar, valuet);
    }
}
