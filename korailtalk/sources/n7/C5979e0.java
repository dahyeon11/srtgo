package n7;

/* renamed from: n7.e0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C5979e0 implements InterfaceC5999o0 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f34327a;

    public C5979e0(boolean z8) {
        this.f34327a = z8;
    }

    @Override // n7.InterfaceC5999o0
    public G0 getList() {
        return null;
    }

    @Override // n7.InterfaceC5999o0
    public boolean isActive() {
        return this.f34327a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        sb.append(isActive() ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
