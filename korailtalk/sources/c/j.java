package C;

import androidx.camera.core.h1;
import java.util.Set;
import z.A0;
import z.InterfaceC6565N;

/* loaded from: classes.dex */
public interface j extends A0 {
    public static final InterfaceC6565N.a OPTION_USE_CASE_EVENT_CALLBACK = InterfaceC6565N.a.create("camerax.core.useCaseEventCallback", h1.b.class);

    public interface a {
        Object setUseCaseEventCallback(h1.b bVar);
    }

    @Override // z.A0, z.InterfaceC6565N
    /* bridge */ /* synthetic */ default boolean containsOption(InterfaceC6565N.a aVar) {
        return super.containsOption(aVar);
    }

    @Override // z.A0, z.InterfaceC6565N
    /* bridge */ /* synthetic */ default void findOptions(String str, InterfaceC6565N.b bVar) {
        super.findOptions(str, bVar);
    }

    @Override // z.A0
    /* synthetic */ InterfaceC6565N getConfig();

    @Override // z.A0, z.InterfaceC6565N
    /* bridge */ /* synthetic */ default InterfaceC6565N.c getOptionPriority(InterfaceC6565N.a aVar) {
        return super.getOptionPriority(aVar);
    }

    @Override // z.A0, z.InterfaceC6565N
    /* bridge */ /* synthetic */ default Set getPriorities(InterfaceC6565N.a aVar) {
        return super.getPriorities(aVar);
    }

    default h1.b getUseCaseEventCallback(h1.b bVar) {
        return (h1.b) retrieveOption(OPTION_USE_CASE_EVENT_CALLBACK, bVar);
    }

    @Override // z.A0, z.InterfaceC6565N
    /* bridge */ /* synthetic */ default Set listOptions() {
        return super.listOptions();
    }

    @Override // z.A0, z.InterfaceC6565N
    /* bridge */ /* synthetic */ default Object retrieveOption(InterfaceC6565N.a aVar) {
        return super.retrieveOption(aVar);
    }

    @Override // z.A0, z.InterfaceC6565N
    /* bridge */ /* synthetic */ default Object retrieveOptionWithPriority(InterfaceC6565N.a aVar, InterfaceC6565N.c cVar) {
        return super.retrieveOptionWithPriority(aVar, cVar);
    }

    default h1.b getUseCaseEventCallback() {
        return (h1.b) retrieveOption(OPTION_USE_CASE_EVENT_CALLBACK);
    }

    @Override // z.A0, z.InterfaceC6565N
    /* bridge */ /* synthetic */ default Object retrieveOption(InterfaceC6565N.a aVar, Object obj) {
        return super.retrieveOption(aVar, obj);
    }
}
