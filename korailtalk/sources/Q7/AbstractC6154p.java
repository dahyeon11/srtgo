package q7;

import kotlin.jvm.internal.Intrinsics;
import n7.InterfaceC6008t0;
import p7.EnumC6064b;
import r7.C6192i;
import r7.r;

/* renamed from: q7.p */
/* loaded from: classes3.dex */
abstract /* synthetic */ class AbstractC6154p {
    private static final void a(W6.g gVar) {
        if (gVar.get(InterfaceC6008t0.Key) == null) {
            return;
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + gVar).toString());
    }

    public static final <T> InterfaceC6147i buffer(InterfaceC6147i interfaceC6147i, int i8, EnumC6064b enumC6064b) {
        if (i8 < 0 && i8 != -2 && i8 != -1) {
            throw new IllegalArgumentException(("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was " + i8).toString());
        }
        if (i8 == -1 && enumC6064b != EnumC6064b.SUSPEND) {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        if (i8 == -1) {
            enumC6064b = EnumC6064b.DROP_OLDEST;
            i8 = 0;
        }
        int i9 = i8;
        EnumC6064b enumC6064b2 = enumC6064b;
        return interfaceC6147i instanceof r7.r ? r.a.fuse$default((r7.r) interfaceC6147i, null, i9, enumC6064b2, 1, null) : new C6192i(interfaceC6147i, null, i9, enumC6064b2, 2, null);
    }

    public static /* synthetic */ InterfaceC6147i buffer$default(InterfaceC6147i interfaceC6147i, int i8, EnumC6064b enumC6064b, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = -2;
        }
        if ((i9 & 2) != 0) {
            enumC6064b = EnumC6064b.SUSPEND;
        }
        return AbstractC6149k.buffer(interfaceC6147i, i8, enumC6064b);
    }

    public static final <T> InterfaceC6147i cancellable(InterfaceC6147i interfaceC6147i) {
        return interfaceC6147i instanceof InterfaceC6141c ? interfaceC6147i : new C6142d(interfaceC6147i);
    }

    public static final <T> InterfaceC6147i conflate(InterfaceC6147i interfaceC6147i) {
        return buffer$default(interfaceC6147i, -1, null, 2, null);
    }

    public static final <T> InterfaceC6147i flowOn(InterfaceC6147i interfaceC6147i, W6.g gVar) {
        a(gVar);
        return Intrinsics.areEqual(gVar, W6.h.INSTANCE) ? interfaceC6147i : interfaceC6147i instanceof r7.r ? r.a.fuse$default((r7.r) interfaceC6147i, gVar, 0, null, 6, null) : new C6192i(interfaceC6147i, gVar, 0, null, 12, null);
    }

    public static /* synthetic */ InterfaceC6147i buffer$default(InterfaceC6147i interfaceC6147i, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = -2;
        }
        return buffer(interfaceC6147i, i8);
    }

    public static final /* synthetic */ InterfaceC6147i buffer(InterfaceC6147i interfaceC6147i, int i8) {
        return buffer$default(interfaceC6147i, i8, null, 2, null);
    }
}
