package q7;

import java.util.List;
import n7.InterfaceC6008t0;
import p7.EnumC6064b;

/* renamed from: q7.F, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6120F implements InterfaceC6132S, InterfaceC6141c, r7.r {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6008t0 f35177a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ InterfaceC6132S f35178b;

    public C6120F(InterfaceC6132S interfaceC6132S, InterfaceC6008t0 interfaceC6008t0) {
        this.f35177a = interfaceC6008t0;
        this.f35178b = interfaceC6132S;
    }

    @Override // q7.InterfaceC6132S, q7.InterfaceC6122H, q7.InterfaceC6147i
    public Object collect(InterfaceC6148j interfaceC6148j, W6.d<?> dVar) {
        return this.f35178b.collect(interfaceC6148j, dVar);
    }

    @Override // r7.r
    public InterfaceC6147i fuse(W6.g gVar, int i8, EnumC6064b enumC6064b) {
        return AbstractC6134U.fuseStateFlow(this, gVar, i8, enumC6064b);
    }

    @Override // q7.InterfaceC6132S, q7.InterfaceC6122H
    public List<Object> getReplayCache() {
        return this.f35178b.getReplayCache();
    }

    @Override // q7.InterfaceC6132S
    public Object getValue() {
        return this.f35178b.getValue();
    }
}
