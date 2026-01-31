package r7;

import R6.G;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p7.EnumC6064b;
import q7.InterfaceC6147i;
import q7.InterfaceC6148j;

/* renamed from: r7.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6192i extends AbstractC6191h {
    public /* synthetic */ C6192i(InterfaceC6147i interfaceC6147i, W6.g gVar, int i8, EnumC6064b enumC6064b, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC6147i, (i9 & 2) != 0 ? W6.h.INSTANCE : gVar, (i9 & 4) != 0 ? -3 : i8, (i9 & 8) != 0 ? EnumC6064b.SUSPEND : enumC6064b);
    }

    @Override // r7.AbstractC6188e
    protected AbstractC6188e d(W6.g gVar, int i8, EnumC6064b enumC6064b) {
        return new C6192i(this.f35826a, gVar, i8, enumC6064b);
    }

    @Override // r7.AbstractC6188e
    public InterfaceC6147i dropChannelOperators() {
        return this.f35826a;
    }

    @Override // r7.AbstractC6191h
    protected Object h(InterfaceC6148j interfaceC6148j, W6.d dVar) {
        Object objCollect = this.f35826a.collect(interfaceC6148j, dVar);
        return objCollect == X6.b.getCOROUTINE_SUSPENDED() ? objCollect : G.INSTANCE;
    }

    public C6192i(InterfaceC6147i interfaceC6147i, W6.g gVar, int i8, EnumC6064b enumC6064b) {
        super(interfaceC6147i, gVar, i8, enumC6064b);
    }
}
