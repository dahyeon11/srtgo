package z;

import java.util.Set;
import z.InterfaceC6565N;

/* renamed from: z.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC6575d0 extends A0 {
    public static final InterfaceC6565N.a OPTION_INPUT_FORMAT = InterfaceC6565N.a.create("camerax.core.imageInput.inputFormat", Integer.TYPE);

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

    default int getInputFormat() {
        return ((Integer) retrieveOption(OPTION_INPUT_FORMAT)).intValue();
    }

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

    @Override // z.A0, z.InterfaceC6565N
    /* bridge */ /* synthetic */ default Object retrieveOption(InterfaceC6565N.a aVar, Object obj) {
        return super.retrieveOption(aVar, obj);
    }
}
