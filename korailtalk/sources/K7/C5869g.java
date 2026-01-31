package k7;

import S6.D;
import java.util.Iterator;

/* renamed from: k7.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C5869g implements m, InterfaceC5867e {
    public static final C5869g INSTANCE = new C5869g();

    private C5869g() {
    }

    @Override // k7.m
    public Iterator iterator() {
        return D.INSTANCE;
    }

    @Override // k7.InterfaceC5867e
    public C5869g drop(int i8) {
        return INSTANCE;
    }

    @Override // k7.InterfaceC5867e
    public C5869g take(int i8) {
        return INSTANCE;
    }
}
