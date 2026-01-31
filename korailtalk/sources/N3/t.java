package n3;

import u3.InterfaceC6416a;

/* loaded from: classes2.dex */
public class t implements InterfaceC6416a {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f34247c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private volatile Object f34248a = f34247c;

    /* renamed from: b, reason: collision with root package name */
    private volatile InterfaceC6416a f34249b;

    public t(InterfaceC6416a interfaceC6416a) {
        this.f34249b = interfaceC6416a;
    }

    @Override // u3.InterfaceC6416a
    public Object get() {
        Object obj = this.f34248a;
        Object obj2 = f34247c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f34248a;
                    if (obj == obj2) {
                        obj = this.f34249b.get();
                        this.f34248a = obj;
                        this.f34249b = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
