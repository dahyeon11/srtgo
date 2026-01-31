package T7;

import java.util.Objects;

/* loaded from: classes3.dex */
public interface f0 {
    public static final f0 NOP = new f0() { // from class: T7.d0
        @Override // T7.f0
        public final void accept(long j8) {
            f0.b(j8);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default void a(f0 f0Var, long j8) {
        accept(j8);
        f0Var.accept(j8);
    }

    static <E extends Throwable> f0 nop() {
        return NOP;
    }

    void accept(long j8);

    default f0 andThen(final f0 f0Var) {
        Objects.requireNonNull(f0Var);
        return new f0() { // from class: T7.e0
            @Override // T7.f0
            public final void accept(long j8) {
                this.f4991a.a(f0Var, j8);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ void b(long j8) {
    }
}
