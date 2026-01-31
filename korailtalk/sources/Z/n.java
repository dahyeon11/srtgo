package Z;

import java.util.Objects;

/* loaded from: classes.dex */
public interface n {
    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default boolean c(Object obj) {
        return !test(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default boolean d(n nVar, Object obj) {
        return test(obj) && nVar.test(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default boolean g(n nVar, Object obj) {
        return test(obj) || nVar.test(obj);
    }

    static <T> n isEqual(final Object obj) {
        return obj == null ? new n() { // from class: Z.i
            @Override // Z.n
            public final boolean test(Object obj2) {
                return Objects.isNull(obj2);
            }
        } : new n() { // from class: Z.j
            @Override // Z.n
            public final boolean test(Object obj2) {
                return obj.equals(obj2);
            }
        };
    }

    static <T> n not(n nVar) {
        Objects.requireNonNull(nVar);
        return nVar.negate();
    }

    default n and(final n nVar) {
        Objects.requireNonNull(nVar);
        return new n() { // from class: Z.l
            @Override // Z.n
            public final boolean test(Object obj) {
                return this.f5689a.d(nVar, obj);
            }
        };
    }

    default n negate() {
        return new n() { // from class: Z.m
            @Override // Z.n
            public final boolean test(Object obj) {
                return this.f5691a.c(obj);
            }
        };
    }

    default n or(final n nVar) {
        Objects.requireNonNull(nVar);
        return new n() { // from class: Z.k
            @Override // Z.n
            public final boolean test(Object obj) {
                return this.f5687a.g(nVar, obj);
            }
        };
    }

    boolean test(Object obj);
}
