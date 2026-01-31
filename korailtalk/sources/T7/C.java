package T7;

import java.util.Objects;

/* loaded from: classes3.dex */
public interface C {
    public static final C NOP = new C() { // from class: T7.A
        @Override // T7.C
        public final Object apply(Object obj, Object obj2) {
            return C.a(obj, obj2);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ Object a(Object obj, Object obj2) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default Object c(Y y8, Object obj, Object obj2) {
        return y8.apply(apply(obj, obj2));
    }

    static <T, U, R, E extends Throwable> C nop() {
        return NOP;
    }

    default <V> C andThen(final Y y8) {
        Objects.requireNonNull(y8);
        return new C() { // from class: T7.B
            @Override // T7.C
            public final Object apply(Object obj, Object obj2) {
                return this.f4966a.c(y8, obj, obj2);
            }
        };
    }

    Object apply(Object obj, Object obj2);
}
