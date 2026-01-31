package androidx.work.impl.utils.futures;

import com.google.common.util.concurrent.C;

/* loaded from: classes.dex */
public final class c extends a {
    private c() {
    }

    public static <V> c create() {
        return new c();
    }

    @Override // androidx.work.impl.utils.futures.a
    public boolean set(Object obj) {
        return super.set(obj);
    }

    @Override // androidx.work.impl.utils.futures.a
    public boolean setException(Throwable th) {
        return super.setException(th);
    }

    @Override // androidx.work.impl.utils.futures.a
    public boolean setFuture(C c9) {
        return super.setFuture(c9);
    }
}
