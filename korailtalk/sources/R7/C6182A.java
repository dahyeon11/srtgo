package r7;

import p7.EnumC6064b;
import q7.C6123I;
import q7.InterfaceC6132S;

/* renamed from: r7.A, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6182A extends C6123I implements InterfaceC6132S {
    public C6182A(int i8) {
        super(1, Integer.MAX_VALUE, EnumC6064b.DROP_OLDEST);
        tryEmit(Integer.valueOf(i8));
    }

    public final boolean increment(int i8) {
        boolean zTryEmit;
        synchronized (this) {
            zTryEmit = tryEmit(Integer.valueOf(((Number) s()).intValue() + i8));
        }
        return zTryEmit;
    }

    @Override // q7.InterfaceC6132S
    public Integer getValue() {
        Integer numValueOf;
        synchronized (this) {
            numValueOf = Integer.valueOf(((Number) s()).intValue());
        }
        return numValueOf;
    }
}
