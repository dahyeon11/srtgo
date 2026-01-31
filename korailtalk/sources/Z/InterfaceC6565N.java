package z;

import java.util.Set;

/* renamed from: z.N, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC6565N {

    /* renamed from: z.N$a */
    public static abstract class a {
        a() {
        }

        public static <T> a create(String str, Class<?> cls) {
            return create(str, cls, null);
        }

        public abstract String getId();

        public abstract Object getToken();

        public abstract Class<Object> getValueClass();

        public static <T> a create(String str, Class<?> cls, Object obj) {
            return new C6572c(str, cls, obj);
        }
    }

    /* renamed from: z.N$b */
    public interface b {
        boolean onOptionMatched(a aVar);
    }

    /* renamed from: z.N$c */
    public enum c {
        ALWAYS_OVERRIDE,
        REQUIRED,
        OPTIONAL
    }

    static boolean hasConflict(c cVar, c cVar2) {
        c cVar3 = c.ALWAYS_OVERRIDE;
        if (cVar == cVar3 && cVar2 == cVar3) {
            return true;
        }
        c cVar4 = c.REQUIRED;
        return cVar == cVar4 && cVar2 == cVar4;
    }

    static InterfaceC6565N mergeConfigs(InterfaceC6565N interfaceC6565N, InterfaceC6565N interfaceC6565N2) {
        if (interfaceC6565N == null && interfaceC6565N2 == null) {
            return v0.emptyBundle();
        }
        r0 r0VarFrom = interfaceC6565N2 != null ? r0.from(interfaceC6565N2) : r0.create();
        if (interfaceC6565N != null) {
            for (a aVar : interfaceC6565N.listOptions()) {
                r0VarFrom.insertOption(aVar, interfaceC6565N.getOptionPriority(aVar), interfaceC6565N.retrieveOption(aVar));
            }
        }
        return v0.from(r0VarFrom);
    }

    boolean containsOption(a aVar);

    void findOptions(String str, b bVar);

    c getOptionPriority(a aVar);

    Set<c> getPriorities(a aVar);

    Set<a> listOptions();

    <ValueT> ValueT retrieveOption(a aVar);

    <ValueT> ValueT retrieveOption(a aVar, ValueT valuet);

    <ValueT> ValueT retrieveOptionWithPriority(a aVar, c cVar);
}
