package q7;

import p7.EnumC6064b;
import r7.C6192i;

/* renamed from: q7.J */
/* loaded from: classes3.dex */
public abstract class AbstractC6124J {
    public static final s7.K NO_VALUE = new s7.K("NO_VALUE");

    public static final <T> InterfaceC6117C MutableSharedFlow(int i8, int i9, EnumC6064b enumC6064b) {
        if (i8 < 0) {
            throw new IllegalArgumentException(("replay cannot be negative, but was " + i8).toString());
        }
        if (i9 < 0) {
            throw new IllegalArgumentException(("extraBufferCapacity cannot be negative, but was " + i9).toString());
        }
        if (i8 > 0 || i9 > 0 || enumC6064b == EnumC6064b.SUSPEND) {
            int i10 = i9 + i8;
            if (i10 < 0) {
                i10 = Integer.MAX_VALUE;
            }
            return new C6123I(i8, i10, enumC6064b);
        }
        throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + enumC6064b).toString());
    }

    public static /* synthetic */ InterfaceC6117C MutableSharedFlow$default(int i8, int i9, EnumC6064b enumC6064b, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i8 = 0;
        }
        if ((i10 & 2) != 0) {
            i9 = 0;
        }
        if ((i10 & 4) != 0) {
            enumC6064b = EnumC6064b.SUSPEND;
        }
        return MutableSharedFlow(i8, i9, enumC6064b);
    }

    public static final Object a(Object[] objArr, long j8) {
        return objArr[((int) j8) & (objArr.length - 1)];
    }

    public static final void b(Object[] objArr, long j8, Object obj) {
        objArr[((int) j8) & (objArr.length - 1)] = obj;
    }

    public static final <T> InterfaceC6147i fuseSharedFlow(InterfaceC6122H interfaceC6122H, W6.g gVar, int i8, EnumC6064b enumC6064b) {
        return ((i8 == 0 || i8 == -3) && enumC6064b == EnumC6064b.SUSPEND) ? interfaceC6122H : new C6192i(interfaceC6122H, gVar, i8, enumC6064b);
    }
}
