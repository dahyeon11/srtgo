package o1;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class j implements H6.b {

    /* renamed from: a, reason: collision with root package name */
    private static final j f34424a = new j();

    public static j create() {
        return f34424a;
    }

    public static Executor executor() {
        return (Executor) H6.e.checkNotNull(i.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // H6.b, Q6.a, G6.a
    public Executor get() {
        return executor();
    }
}
