package z;

import java.util.Set;
import z.InterfaceC6565N;

/* loaded from: classes.dex */
public interface q0 extends InterfaceC6565N {
    @Override // z.InterfaceC6565N
    /* synthetic */ boolean containsOption(InterfaceC6565N.a aVar);

    @Override // z.InterfaceC6565N
    /* synthetic */ void findOptions(String str, InterfaceC6565N.b bVar);

    @Override // z.InterfaceC6565N
    /* synthetic */ InterfaceC6565N.c getOptionPriority(InterfaceC6565N.a aVar);

    @Override // z.InterfaceC6565N
    /* synthetic */ Set getPriorities(InterfaceC6565N.a aVar);

    <ValueT> void insertOption(InterfaceC6565N.a aVar, ValueT valuet);

    <ValueT> void insertOption(InterfaceC6565N.a aVar, InterfaceC6565N.c cVar, ValueT valuet);

    @Override // z.InterfaceC6565N
    /* synthetic */ Set listOptions();

    <ValueT> ValueT removeOption(InterfaceC6565N.a aVar);

    @Override // z.InterfaceC6565N
    /* synthetic */ Object retrieveOption(InterfaceC6565N.a aVar);

    @Override // z.InterfaceC6565N
    /* synthetic */ Object retrieveOption(InterfaceC6565N.a aVar, Object obj);

    @Override // z.InterfaceC6565N
    /* synthetic */ Object retrieveOptionWithPriority(InterfaceC6565N.a aVar, InterfaceC6565N.c cVar);
}
