package q7;

import p7.EnumC6064b;

/* renamed from: q7.U */
/* loaded from: classes3.dex */
public abstract class AbstractC6134U {

    /* renamed from: a */
    private static final s7.K f35225a = new s7.K("NONE");

    /* renamed from: b */
    private static final s7.K f35226b = new s7.K("PENDING");

    public static final <T> InterfaceC6118D MutableStateFlow(T t8) {
        if (t8 == null) {
            t8 = (T) r7.u.NULL;
        }
        return new C6133T(t8);
    }

    public static final <T> InterfaceC6147i fuseStateFlow(InterfaceC6132S interfaceC6132S, W6.g gVar, int i8, EnumC6064b enumC6064b) {
        return (((i8 < 0 || i8 >= 2) && i8 != -2) || enumC6064b != EnumC6064b.DROP_OLDEST) ? AbstractC6124J.fuseSharedFlow(interfaceC6132S, gVar, i8, enumC6064b) : interfaceC6132S;
    }

    public static final <T> T getAndUpdate(InterfaceC6118D interfaceC6118D, f7.l lVar) {
        T t8;
        do {
            t8 = (T) interfaceC6118D.getValue();
        } while (!interfaceC6118D.compareAndSet(t8, lVar.invoke(t8)));
        return t8;
    }

    public static final <T> void update(InterfaceC6118D interfaceC6118D, f7.l lVar) {
        Object value;
        do {
            value = interfaceC6118D.getValue();
        } while (!interfaceC6118D.compareAndSet(value, lVar.invoke(value)));
    }

    public static final <T> T updateAndGet(InterfaceC6118D interfaceC6118D, f7.l lVar) {
        Object value;
        T t8;
        do {
            value = interfaceC6118D.getValue();
            t8 = (T) lVar.invoke(value);
        } while (!interfaceC6118D.compareAndSet(value, t8));
        return t8;
    }
}
