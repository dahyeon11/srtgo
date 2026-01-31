package T7;

import java.util.Objects;

/* loaded from: classes3.dex */
public interface Y {
    public static final Y NOP = new Y() { // from class: T7.U
        @Override // T7.Y
        public final Object apply(Object obj) {
            return Y.a(obj);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ Object a(Object obj) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default Object c(Y y8, Object obj) {
        return apply(y8.apply(obj));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default Object h(Y y8, Object obj) {
        return y8.apply(apply(obj));
    }

    static <T, E extends Throwable> Y identity() {
        return new Y() { // from class: T7.V
            @Override // T7.Y
            public final Object apply(Object obj) {
                return Y.d(obj);
            }
        };
    }

    static <T, R, E extends Throwable> Y nop() {
        return NOP;
    }

    default <V> Y andThen(final Y y8) {
        Objects.requireNonNull(y8);
        return new Y() { // from class: T7.X
            @Override // T7.Y
            public final Object apply(Object obj) {
                return this.f4980a.h(y8, obj);
            }
        };
    }

    Object apply(Object obj);

    default <V> Y compose(final Y y8) {
        Objects.requireNonNull(y8);
        return new Y() { // from class: T7.W
            @Override // T7.Y
            public final Object apply(Object obj) {
                return this.f4978a.c(y8, obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ Object d(Object obj) {
        return obj;
    }

    static <T, R, E extends Throwable> Y function(Y y8) {
        return y8;
    }
}
