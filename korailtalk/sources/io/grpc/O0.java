package io.grpc;

import io.grpc.C5804v;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
final class O0 extends C5804v.k {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f32043a = Logger.getLogger(O0.class.getName());

    /* renamed from: b, reason: collision with root package name */
    static final ThreadLocal f32044b = new ThreadLocal();

    O0() {
    }

    @Override // io.grpc.C5804v.k
    public C5804v current() {
        C5804v c5804v = (C5804v) f32044b.get();
        return c5804v == null ? C5804v.ROOT : c5804v;
    }

    @Override // io.grpc.C5804v.k
    public void detach(C5804v c5804v, C5804v c5804v2) {
        if (current() != c5804v) {
            f32043a.log(Level.SEVERE, "Context was not attached when detaching", new Throwable().fillInStackTrace());
        }
        if (c5804v2 != C5804v.ROOT) {
            f32044b.set(c5804v2);
        } else {
            f32044b.set(null);
        }
    }

    @Override // io.grpc.C5804v.k
    public C5804v doAttach(C5804v c5804v) {
        C5804v c5804vCurrent = current();
        f32044b.set(c5804v);
        return c5804vCurrent;
    }
}
