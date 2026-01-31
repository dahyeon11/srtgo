package androidx.camera.extensions;

import java.util.Set;
import z.D0;
import z.InterfaceC6565N;
import z.InterfaceC6601s;
import z.O0;
import z.Z;
import z.r0;

/* loaded from: classes.dex */
class b implements InterfaceC6601s {
    public static final InterfaceC6565N.a OPTION_EXTENSION_MODE = InterfaceC6565N.a.create("camerax.extensions.extensionMode", Integer.TYPE);

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6565N f7898a;

    static final class a implements InterfaceC6601s.a {

        /* renamed from: a, reason: collision with root package name */
        private final r0 f7899a = r0.create();

        a() {
        }

        b a() {
            return new b(this.f7899a);
        }

        public a setExtensionMode(int i8) {
            this.f7899a.insertOption(b.OPTION_EXTENSION_MODE, Integer.valueOf(i8));
            return this;
        }

        @Override // z.InterfaceC6601s.a
        public a setCompatibilityId(Z z8) {
            this.f7899a.insertOption(InterfaceC6601s.OPTION_COMPATIBILITY_ID, z8);
            return this;
        }

        @Override // z.InterfaceC6601s.a
        public a setSessionProcessor(D0 d02) {
            this.f7899a.insertOption(InterfaceC6601s.OPTION_SESSION_PROCESSOR, d02);
            return this;
        }

        @Override // z.InterfaceC6601s.a
        public a setUseCaseCombinationRequiredRule(int i8) {
            this.f7899a.insertOption(InterfaceC6601s.OPTION_USE_CASE_COMBINATION_REQUIRED_RULE, Integer.valueOf(i8));
            return this;
        }

        @Override // z.InterfaceC6601s.a
        public a setUseCaseConfigFactory(O0 o02) {
            this.f7899a.insertOption(InterfaceC6601s.OPTION_USECASE_CONFIG_FACTORY, o02);
            return this;
        }
    }

    b(InterfaceC6565N interfaceC6565N) {
        this.f7898a = interfaceC6565N;
    }

    @Override // z.InterfaceC6601s, z.A0, z.InterfaceC6565N
    public /* bridge */ /* synthetic */ boolean containsOption(InterfaceC6565N.a aVar) {
        return super.containsOption(aVar);
    }

    @Override // z.InterfaceC6601s, z.A0, z.InterfaceC6565N
    public /* bridge */ /* synthetic */ void findOptions(String str, InterfaceC6565N.b bVar) {
        super.findOptions(str, bVar);
    }

    @Override // z.InterfaceC6601s
    public Z getCompatibilityId() {
        return (Z) retrieveOption(InterfaceC6601s.OPTION_COMPATIBILITY_ID);
    }

    @Override // z.InterfaceC6601s, z.A0
    public InterfaceC6565N getConfig() {
        return this.f7898a;
    }

    public int getExtensionMode() {
        return ((Integer) retrieveOption(OPTION_EXTENSION_MODE)).intValue();
    }

    @Override // z.InterfaceC6601s, z.A0, z.InterfaceC6565N
    public /* bridge */ /* synthetic */ InterfaceC6565N.c getOptionPriority(InterfaceC6565N.a aVar) {
        return super.getOptionPriority(aVar);
    }

    @Override // z.InterfaceC6601s, z.A0, z.InterfaceC6565N
    public /* bridge */ /* synthetic */ Set getPriorities(InterfaceC6565N.a aVar) {
        return super.getPriorities(aVar);
    }

    @Override // z.InterfaceC6601s
    public /* bridge */ /* synthetic */ D0 getSessionProcessor() {
        return super.getSessionProcessor();
    }

    @Override // z.InterfaceC6601s
    public /* bridge */ /* synthetic */ int getUseCaseCombinationRequiredRule() {
        return super.getUseCaseCombinationRequiredRule();
    }

    @Override // z.InterfaceC6601s
    public /* bridge */ /* synthetic */ O0 getUseCaseConfigFactory() {
        return super.getUseCaseConfigFactory();
    }

    @Override // z.InterfaceC6601s, z.A0, z.InterfaceC6565N
    public /* bridge */ /* synthetic */ Set listOptions() {
        return super.listOptions();
    }

    @Override // z.InterfaceC6601s, z.A0, z.InterfaceC6565N
    public /* bridge */ /* synthetic */ Object retrieveOption(InterfaceC6565N.a aVar) {
        return super.retrieveOption(aVar);
    }

    @Override // z.InterfaceC6601s, z.A0, z.InterfaceC6565N
    public /* bridge */ /* synthetic */ Object retrieveOptionWithPriority(InterfaceC6565N.a aVar, InterfaceC6565N.c cVar) {
        return super.retrieveOptionWithPriority(aVar, cVar);
    }

    @Override // z.InterfaceC6601s
    public /* bridge */ /* synthetic */ D0 getSessionProcessor(D0 d02) {
        return super.getSessionProcessor(d02);
    }

    @Override // z.InterfaceC6601s, z.A0, z.InterfaceC6565N
    public /* bridge */ /* synthetic */ Object retrieveOption(InterfaceC6565N.a aVar, Object obj) {
        return super.retrieveOption(aVar, obj);
    }
}
