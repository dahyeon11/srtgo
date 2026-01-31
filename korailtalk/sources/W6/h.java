package W6;

import W6.g;
import f7.p;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class h implements g, Serializable {
    public static final h INSTANCE = new h();

    private h() {
    }

    @Override // W6.g
    public <R> R fold(R r8, p operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return r8;
    }

    @Override // W6.g
    public <E extends g.b> E get(g.c key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // W6.g
    public g minusKey(g.c key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this;
    }

    @Override // W6.g
    public g plus(g context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
