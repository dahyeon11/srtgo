package z;

import java.util.Set;
import z.InterfaceC6565N;

/* renamed from: z.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC6601s extends A0 {
    public static final int REQUIRED_RULE_COEXISTING_PREVIEW_AND_IMAGE_CAPTURE = 1;
    public static final int REQUIRED_RULE_NONE = 0;
    public static final InterfaceC6565N.a OPTION_USECASE_CONFIG_FACTORY = InterfaceC6565N.a.create("camerax.core.camera.useCaseConfigFactory", O0.class);
    public static final InterfaceC6565N.a OPTION_COMPATIBILITY_ID = InterfaceC6565N.a.create("camerax.core.camera.compatibilityId", Z.class);
    public static final InterfaceC6565N.a OPTION_USE_CASE_COMBINATION_REQUIRED_RULE = InterfaceC6565N.a.create("camerax.core.camera.useCaseCombinationRequiredRule", Integer.class);
    public static final InterfaceC6565N.a OPTION_SESSION_PROCESSOR = InterfaceC6565N.a.create("camerax.core.camera.SessionProcessor", D0.class);

    /* renamed from: z.s$a */
    public interface a {
        Object setCompatibilityId(Z z8);

        Object setSessionProcessor(D0 d02);

        Object setUseCaseCombinationRequiredRule(int i8);

        Object setUseCaseConfigFactory(O0 o02);
    }

    @Override // z.A0, z.InterfaceC6565N
    /* bridge */ /* synthetic */ default boolean containsOption(InterfaceC6565N.a aVar) {
        return super.containsOption(aVar);
    }

    @Override // z.A0, z.InterfaceC6565N
    /* bridge */ /* synthetic */ default void findOptions(String str, InterfaceC6565N.b bVar) {
        super.findOptions(str, bVar);
    }

    Z getCompatibilityId();

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

    default D0 getSessionProcessor(D0 d02) {
        return (D0) retrieveOption(OPTION_SESSION_PROCESSOR, d02);
    }

    default int getUseCaseCombinationRequiredRule() {
        return ((Integer) retrieveOption(OPTION_USE_CASE_COMBINATION_REQUIRED_RULE, 0)).intValue();
    }

    default O0 getUseCaseConfigFactory() {
        return (O0) retrieveOption(OPTION_USECASE_CONFIG_FACTORY, O0.EMPTY_INSTANCE);
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

    default D0 getSessionProcessor() {
        return (D0) retrieveOption(OPTION_SESSION_PROCESSOR);
    }

    @Override // z.A0, z.InterfaceC6565N
    /* bridge */ /* synthetic */ default Object retrieveOption(InterfaceC6565N.a aVar, Object obj) {
        return super.retrieveOption(aVar, obj);
    }
}
