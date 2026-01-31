package Z;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class g extends f {

    /* renamed from: c, reason: collision with root package name */
    private final Object f5685c;

    public g(int i8) {
        super(i8);
        this.f5685c = new Object();
    }

    @Override // Z.f, Z.e
    public Object acquire() {
        Object objAcquire;
        synchronized (this.f5685c) {
            objAcquire = super.acquire();
        }
        return objAcquire;
    }

    @Override // Z.f, Z.e
    public boolean release(Object instance) {
        boolean zRelease;
        Intrinsics.checkNotNullParameter(instance, "instance");
        synchronized (this.f5685c) {
            zRelease = super.release(instance);
        }
        return zRelease;
    }
}
