package z;

import java.util.Set;
import z.InterfaceC6565N;

/* renamed from: z.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6604v {

    /* renamed from: a, reason: collision with root package name */
    private static final InterfaceC6601s f37842a = new a();

    /* renamed from: z.v$a */
    static final class a implements InterfaceC6601s {

        /* renamed from: a, reason: collision with root package name */
        private final Z f37843a = Z.create(new Object());

        a() {
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
            return this.f37843a;
        }

        @Override // z.InterfaceC6601s, z.A0
        public InterfaceC6565N getConfig() {
            return v0.emptyBundle();
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

    public static InterfaceC6601s emptyConfig() {
        return f37842a;
    }
}
