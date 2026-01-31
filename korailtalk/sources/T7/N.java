package T7;

import java.util.Objects;
import java.util.function.Function;

/* loaded from: classes3.dex */
public interface N {
    public static final N NOP;

    static {
        final Function functionIdentity = Function.identity();
        Objects.requireNonNull(functionIdentity);
        NOP = new N() { // from class: T7.L
            @Override // T7.N
            public final void accept(Object obj) {
                functionIdentity.apply(obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default void a(N n8, Object obj) {
        accept(obj);
        n8.accept(obj);
    }

    static <T, E extends Throwable> N nop() {
        return NOP;
    }

    void accept(Object obj);

    default N andThen(final N n8) {
        Objects.requireNonNull(n8);
        return new N() { // from class: T7.M
            @Override // T7.N
            public final void accept(Object obj) {
                this.f4974a.a(n8, obj);
            }
        };
    }
}
