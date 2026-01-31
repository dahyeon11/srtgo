package T7;

import java.util.Objects;

/* loaded from: classes3.dex */
public interface I {
    public static final I FALSE = new I() { // from class: T7.D
        @Override // T7.I
        public final boolean test(Object obj, Object obj2) {
            return I.a(obj, obj2);
        }
    };
    public static final I TRUE = new I() { // from class: T7.E
        @Override // T7.I
        public final boolean test(Object obj, Object obj2) {
            return I.d(obj, obj2);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ boolean a(Object obj, Object obj2) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ boolean d(Object obj, Object obj2) {
        return true;
    }

    static <T, U, E extends Throwable> I falsePredicate() {
        return FALSE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default boolean g(I i8, Object obj, Object obj2) {
        return test(obj, obj2) || i8.test(obj, obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default boolean h(I i8, Object obj, Object obj2) {
        return test(obj, obj2) && i8.test(obj, obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default boolean j(Object obj, Object obj2) {
        return !test(obj, obj2);
    }

    static <T, U, E extends Throwable> I truePredicate() {
        return TRUE;
    }

    default I and(final I i8) {
        Objects.requireNonNull(i8);
        return new I() { // from class: T7.G
            @Override // T7.I
            public final boolean test(Object obj, Object obj2) {
                return this.f4969a.h(i8, obj, obj2);
            }
        };
    }

    default I negate() {
        return new I() { // from class: T7.F
            @Override // T7.I
            public final boolean test(Object obj, Object obj2) {
                return this.f4968a.j(obj, obj2);
            }
        };
    }

    default I or(final I i8) {
        Objects.requireNonNull(i8);
        return new I() { // from class: T7.H
            @Override // T7.I
            public final boolean test(Object obj, Object obj2) {
                return this.f4971a.g(i8, obj, obj2);
            }
        };
    }

    boolean test(Object obj, Object obj2);
}
