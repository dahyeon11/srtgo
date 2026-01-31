package T7;

import java.util.Objects;

/* renamed from: T7.z, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC0815z {
    public static final InterfaceC0815z NOP = new InterfaceC0815z() { // from class: T7.x
        @Override // T7.InterfaceC0815z
        public final void accept(Object obj, Object obj2) {
            InterfaceC0815z.a(obj, obj2);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default void b(InterfaceC0815z interfaceC0815z, Object obj, Object obj2) {
        accept(obj, obj2);
        interfaceC0815z.accept(obj, obj2);
    }

    static <T, U, E extends Throwable> InterfaceC0815z nop() {
        return NOP;
    }

    void accept(Object obj, Object obj2);

    default InterfaceC0815z andThen(final InterfaceC0815z interfaceC0815z) {
        Objects.requireNonNull(interfaceC0815z);
        return new InterfaceC0815z() { // from class: T7.y
            @Override // T7.InterfaceC0815z
            public final void accept(Object obj, Object obj2) {
                this.f5023a.b(interfaceC0815z, obj, obj2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ void a(Object obj, Object obj2) {
    }
}
