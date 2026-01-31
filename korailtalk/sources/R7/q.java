package r7;

import q7.InterfaceC6148j;

/* loaded from: classes3.dex */
public abstract class q {
    public static final int checkIndexOverflow(int i8) {
        if (i8 >= 0) {
            return i8;
        }
        throw new ArithmeticException("Index overflow has happened");
    }

    public static final void checkOwnership(C6184a c6184a, InterfaceC6148j interfaceC6148j) {
        if (c6184a.owner != interfaceC6148j) {
            throw c6184a;
        }
    }
}
