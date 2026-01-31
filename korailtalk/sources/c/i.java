package C;

import java.util.Set;
import java.util.concurrent.Executor;
import z.A0;
import z.InterfaceC6565N;

/* loaded from: classes.dex */
public interface i extends A0 {
    public static final InterfaceC6565N.a OPTION_BACKGROUND_EXECUTOR = InterfaceC6565N.a.create("camerax.core.thread.backgroundExecutor", Executor.class);

    public interface a {
        Object setBackgroundExecutor(Executor executor);
    }

    @Override // z.A0, z.InterfaceC6565N
    /* bridge */ /* synthetic */ default boolean containsOption(InterfaceC6565N.a aVar) {
        return super.containsOption(aVar);
    }

    @Override // z.A0, z.InterfaceC6565N
    /* bridge */ /* synthetic */ default void findOptions(String str, InterfaceC6565N.b bVar) {
        super.findOptions(str, bVar);
    }

    default Executor getBackgroundExecutor(Executor executor) {
        return (Executor) retrieveOption(OPTION_BACKGROUND_EXECUTOR, executor);
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

    default Executor getBackgroundExecutor() {
        return (Executor) retrieveOption(OPTION_BACKGROUND_EXECUTOR);
    }

    @Override // z.A0, z.InterfaceC6565N
    /* bridge */ /* synthetic */ default Object retrieveOption(InterfaceC6565N.a aVar, Object obj) {
        return super.retrieveOption(aVar, obj);
    }
}
