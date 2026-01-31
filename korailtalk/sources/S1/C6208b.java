package s1;

import o1.l;
import v1.InterfaceC6428b;

/* renamed from: s1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final /* synthetic */ class C6208b implements InterfaceC6428b.a {

    /* renamed from: a, reason: collision with root package name */
    private final C6209c f36138a;

    /* renamed from: b, reason: collision with root package name */
    private final l f36139b;

    /* renamed from: c, reason: collision with root package name */
    private final o1.h f36140c;

    private C6208b(C6209c c6209c, l lVar, o1.h hVar) {
        this.f36138a = c6209c;
        this.f36139b = lVar;
        this.f36140c = hVar;
    }

    /* JADX WARN: Method inline analysis failed
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList.removeIf(Unknown Source)
     */
    public static InterfaceC6428b.a lambdaFactory$(C6209c c6209c, l lVar, o1.h hVar) {
        return new C6208b(c6209c, lVar, hVar);
    }

    @Override // v1.InterfaceC6428b.a
    public Object execute() {
        return C6209c.a(this.f36138a, this.f36139b, this.f36140c);
    }
}
