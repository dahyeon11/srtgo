package q7;

import java.util.List;
import n7.InterfaceC6008t0;
import p7.EnumC6064b;

/* renamed from: q7.E, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6119E implements InterfaceC6122H, InterfaceC6141c, r7.r {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6008t0 f35175a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ InterfaceC6122H f35176b;

    public C6119E(InterfaceC6122H interfaceC6122H, InterfaceC6008t0 interfaceC6008t0) {
        this.f35175a = interfaceC6008t0;
        this.f35176b = interfaceC6122H;
    }

    @Override // q7.InterfaceC6122H, q7.InterfaceC6147i
    public Object collect(InterfaceC6148j interfaceC6148j, W6.d<?> dVar) {
        return this.f35176b.collect(interfaceC6148j, dVar);
    }

    @Override // r7.r
    public InterfaceC6147i fuse(W6.g gVar, int i8, EnumC6064b enumC6064b) {
        return AbstractC6124J.fuseSharedFlow(this, gVar, i8, enumC6064b);
    }

    @Override // q7.InterfaceC6122H
    public List<Object> getReplayCache() {
        return this.f35176b.getReplayCache();
    }
}
