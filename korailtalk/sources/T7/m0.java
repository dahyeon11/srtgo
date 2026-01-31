package T7;

import java.util.Objects;

/* loaded from: classes3.dex */
public interface m0 {
    public static final m0 FALSE = new m0() { // from class: T7.h0
        @Override // T7.m0
        public final boolean test(Object obj) {
            return m0.a(obj);
        }
    };
    public static final m0 TRUE = new m0() { // from class: T7.i0
        @Override // T7.m0
        public final boolean test(Object obj) {
            return m0.f(obj);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ boolean a(Object obj) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default boolean b(m0 m0Var, Object obj) {
        return test(obj) && m0Var.test(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default boolean c(Object obj) {
        return !test(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ boolean f(Object obj) {
        return true;
    }

    static <T, E extends Throwable> m0 falsePredicate() {
        return FALSE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default boolean h(m0 m0Var, Object obj) {
        return test(obj) || m0Var.test(obj);
    }

    static <T, E extends Throwable> m0 truePredicate() {
        return TRUE;
    }

    default m0 and(final m0 m0Var) {
        Objects.requireNonNull(m0Var);
        return new m0() { // from class: T7.k0
            @Override // T7.m0
            public final boolean test(Object obj) {
                return this.f5001a.b(m0Var, obj);
            }
        };
    }

    default m0 negate() {
        return new m0() { // from class: T7.l0
            @Override // T7.m0
            public final boolean test(Object obj) {
                return this.f5005a.c(obj);
            }
        };
    }

    default m0 or(final m0 m0Var) {
        Objects.requireNonNull(m0Var);
        return new m0() { // from class: T7.j0
            @Override // T7.m0
            public final boolean test(Object obj) {
                return this.f4999a.h(m0Var, obj);
            }
        };
    }

    boolean test(Object obj);
}
