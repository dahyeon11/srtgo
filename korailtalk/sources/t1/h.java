package t1;

import u1.InterfaceC6407c;
import v1.InterfaceC6428b;

/* loaded from: classes.dex */
final /* synthetic */ class h implements InterfaceC6428b.a {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6407c f36909a;

    private h(InterfaceC6407c interfaceC6407c) {
        this.f36909a = interfaceC6407c;
    }

    public static InterfaceC6428b.a lambdaFactory$(InterfaceC6407c interfaceC6407c) {
        return new h(interfaceC6407c);
    }

    @Override // v1.InterfaceC6428b.a
    public Object execute() {
        return Integer.valueOf(this.f36909a.cleanUp());
    }
}
