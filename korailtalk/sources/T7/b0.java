package T7;

import java.util.Objects;

/* loaded from: classes3.dex */
public interface b0 {
    public static final b0 NOP = new b0() { // from class: T7.Z
        @Override // T7.b0
        public final void accept(int i8) {
            b0.c(i8);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default void a(b0 b0Var, int i8) {
        accept(i8);
        b0Var.accept(i8);
    }

    static <E extends Throwable> b0 nop() {
        return NOP;
    }

    void accept(int i8);

    default b0 andThen(final b0 b0Var) {
        Objects.requireNonNull(b0Var);
        return new b0() { // from class: T7.a0
            @Override // T7.b0
            public final void accept(int i8) {
                this.f4983a.a(b0Var, i8);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ void c(int i8) {
    }
}
