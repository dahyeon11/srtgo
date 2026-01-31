package T7;

import java.util.Objects;

/* loaded from: classes3.dex */
public interface S {
    public static final S NOP = new S() { // from class: T7.P
        @Override // T7.S
        public final void accept(double d9) {
            S.d(d9);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default void c(S s8, double d9) {
        accept(d9);
        s8.accept(d9);
    }

    static <E extends Throwable> S nop() {
        return NOP;
    }

    void accept(double d9);

    default S andThen(final S s8) {
        Objects.requireNonNull(s8);
        return new S() { // from class: T7.Q
            @Override // T7.S
            public final void accept(double d9) {
                this.f4976a.c(s8, d9);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ void d(double d9) {
    }
}
