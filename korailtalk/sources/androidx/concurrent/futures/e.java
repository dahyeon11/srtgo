package androidx.concurrent.futures;

import com.google.common.util.concurrent.C;

/* loaded from: classes.dex */
public final class e extends a {
    private e() {
    }

    public static <V> e create() {
        return new e();
    }

    @Override // androidx.concurrent.futures.a
    public boolean set(Object obj) {
        return super.set(obj);
    }

    @Override // androidx.concurrent.futures.a
    public boolean setException(Throwable th) {
        return super.setException(th);
    }

    @Override // androidx.concurrent.futures.a
    public boolean setFuture(C c9) {
        return super.setFuture(c9);
    }
}
