package q7;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p7.EnumC6064b;
import p7.InterfaceC6096u;
import r7.AbstractC6188e;

/* renamed from: q7.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C6144f extends AbstractC6188e {

    /* renamed from: a, reason: collision with root package name */
    private final f7.p f35258a;

    public /* synthetic */ C6144f(f7.p pVar, W6.g gVar, int i8, EnumC6064b enumC6064b, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this(pVar, (i9 & 2) != 0 ? W6.h.INSTANCE : gVar, (i9 & 4) != 0 ? -2 : i8, (i9 & 8) != 0 ? EnumC6064b.SUSPEND : enumC6064b);
    }

    static /* synthetic */ Object e(C6144f c6144f, InterfaceC6096u interfaceC6096u, W6.d dVar) {
        Object objInvoke = c6144f.f35258a.invoke(interfaceC6096u, dVar);
        return objInvoke == X6.b.getCOROUTINE_SUSPENDED() ? objInvoke : R6.G.INSTANCE;
    }

    @Override // r7.AbstractC6188e
    protected Object c(InterfaceC6096u interfaceC6096u, W6.d dVar) {
        return e(this, interfaceC6096u, dVar);
    }

    @Override // r7.AbstractC6188e
    protected AbstractC6188e d(W6.g gVar, int i8, EnumC6064b enumC6064b) {
        return new C6144f(this.f35258a, gVar, i8, enumC6064b);
    }

    @Override // r7.AbstractC6188e
    public String toString() {
        return "block[" + this.f35258a + "] -> " + super.toString();
    }

    public C6144f(f7.p pVar, W6.g gVar, int i8, EnumC6064b enumC6064b) {
        super(gVar, i8, enumC6064b);
        this.f35258a = pVar;
    }
}
