package q7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p7.EnumC6064b;
import p7.InterfaceC6096u;
import p7.InterfaceC6098w;
import r7.AbstractC6188e;

/* renamed from: q7.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6143e extends AbstractC6188e {

    /* renamed from: c, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f35255c = AtomicIntegerFieldUpdater.newUpdater(C6143e.class, "consumed");

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6098w f35256a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f35257b;
    private volatile int consumed;

    public /* synthetic */ C6143e(InterfaceC6098w interfaceC6098w, boolean z8, W6.g gVar, int i8, EnumC6064b enumC6064b, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC6098w, z8, (i9 & 4) != 0 ? W6.h.INSTANCE : gVar, (i9 & 8) != 0 ? -3 : i8, (i9 & 16) != 0 ? EnumC6064b.SUSPEND : enumC6064b);
    }

    private final void e() {
        if (this.f35257b && f35255c.getAndSet(this, 1) != 0) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
        }
    }

    @Override // r7.AbstractC6188e
    protected String a() {
        return "channel=" + this.f35256a;
    }

    @Override // r7.AbstractC6188e
    protected Object c(InterfaceC6096u interfaceC6096u, W6.d dVar) throws Throwable {
        Object objA = AbstractC6151m.a(new r7.y(interfaceC6096u), this.f35256a, this.f35257b, dVar);
        return objA == X6.b.getCOROUTINE_SUSPENDED() ? objA : R6.G.INSTANCE;
    }

    @Override // r7.AbstractC6188e, r7.r, q7.InterfaceC6147i
    public Object collect(InterfaceC6148j interfaceC6148j, W6.d<? super R6.G> dVar) throws Throwable {
        if (this.capacity != -3) {
            Object objCollect = super.collect(interfaceC6148j, dVar);
            return objCollect == X6.b.getCOROUTINE_SUSPENDED() ? objCollect : R6.G.INSTANCE;
        }
        e();
        Object objA = AbstractC6151m.a(interfaceC6148j, this.f35256a, this.f35257b, dVar);
        return objA == X6.b.getCOROUTINE_SUSPENDED() ? objA : R6.G.INSTANCE;
    }

    @Override // r7.AbstractC6188e
    protected AbstractC6188e d(W6.g gVar, int i8, EnumC6064b enumC6064b) {
        return new C6143e(this.f35256a, this.f35257b, gVar, i8, enumC6064b);
    }

    @Override // r7.AbstractC6188e
    public InterfaceC6147i dropChannelOperators() {
        return new C6143e(this.f35256a, this.f35257b, null, 0, null, 28, null);
    }

    @Override // r7.AbstractC6188e
    public InterfaceC6098w produceImpl(n7.L l8) {
        e();
        return this.capacity == -3 ? this.f35256a : super.produceImpl(l8);
    }

    public C6143e(InterfaceC6098w interfaceC6098w, boolean z8, W6.g gVar, int i8, EnumC6064b enumC6064b) {
        super(gVar, i8, enumC6064b);
        this.f35256a = interfaceC6098w;
        this.f35257b = z8;
        this.consumed = 0;
    }
}
