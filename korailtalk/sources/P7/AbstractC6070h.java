package p7;

import p7.C6071i;

/* renamed from: p7.h */
/* loaded from: classes3.dex */
public abstract class AbstractC6070h {
    public static final <E> InterfaceC6067e Channel(int i8, EnumC6064b enumC6064b, f7.l lVar) {
        InterfaceC6067e c6065c;
        if (i8 == -2) {
            c6065c = enumC6064b == EnumC6064b.SUSPEND ? new C6065c(InterfaceC6067e.Factory.getCHANNEL_DEFAULT_CAPACITY$kotlinx_coroutines_core(), lVar) : new C6093r(1, enumC6064b, lVar);
        } else {
            if (i8 == -1) {
                if (enumC6064b == EnumC6064b.SUSPEND) {
                    return new C6093r(1, EnumC6064b.DROP_OLDEST, lVar);
                }
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
            }
            if (i8 != 0) {
                return i8 != Integer.MAX_VALUE ? enumC6064b == EnumC6064b.SUSPEND ? new C6065c(i8, lVar) : new C6093r(i8, enumC6064b, lVar) : new C6065c(Integer.MAX_VALUE, lVar);
            }
            c6065c = enumC6064b == EnumC6064b.SUSPEND ? new C6065c(0, lVar) : new C6093r(1, enumC6064b, lVar);
        }
        return c6065c;
    }

    public static /* synthetic */ InterfaceC6067e Channel$default(int i8, EnumC6064b enumC6064b, f7.l lVar, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = 0;
        }
        if ((i9 & 2) != 0) {
            enumC6064b = EnumC6064b.SUSPEND;
        }
        if ((i9 & 4) != 0) {
            lVar = null;
        }
        return Channel(i8, enumC6064b, lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getOrElse-WpGqRn0 */
    public static final <T> T m536getOrElseWpGqRn0(Object obj, f7.l lVar) {
        return obj instanceof C6071i.c ? (T) lVar.invoke(C6071i.m544exceptionOrNullimpl(obj)) : obj;
    }

    /* renamed from: onClosed-WpGqRn0 */
    public static final <T> Object m537onClosedWpGqRn0(Object obj, f7.l lVar) {
        if (obj instanceof C6071i.a) {
            lVar.invoke(C6071i.m544exceptionOrNullimpl(obj));
        }
        return obj;
    }

    /* renamed from: onFailure-WpGqRn0 */
    public static final <T> Object m538onFailureWpGqRn0(Object obj, f7.l lVar) {
        if (obj instanceof C6071i.c) {
            lVar.invoke(C6071i.m544exceptionOrNullimpl(obj));
        }
        return obj;
    }

    /* renamed from: onSuccess-WpGqRn0 */
    public static final <T> Object m539onSuccessWpGqRn0(Object obj, f7.l lVar) {
        if (!(obj instanceof C6071i.c)) {
            lVar.invoke(obj);
        }
        return obj;
    }

    public static /* synthetic */ InterfaceC6067e Channel$default(int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = 0;
        }
        return Channel(i8);
    }

    public static final /* synthetic */ InterfaceC6067e Channel(int i8) {
        return Channel$default(i8, null, null, 6, null);
    }
}
