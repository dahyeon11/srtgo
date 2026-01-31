package T7;

import java.util.function.Supplier;

/* loaded from: classes3.dex */
public class s0 {

    /* renamed from: a, reason: collision with root package name */
    private static Supplier f5014a = new Supplier() { // from class: T7.r0
        @Override // java.util.function.Supplier
        public final Object get() {
            return s0.b();
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object b() {
        return null;
    }

    public static <T> T get(Supplier<T> supplier) {
        if (supplier == null) {
            return null;
        }
        return supplier.get();
    }

    public static <T> Supplier<T> nul() {
        return f5014a;
    }
}
