package R6;

import f7.InterfaceC5519a;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class H implements InterfaceC0755i, Serializable {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC5519a f4470a;

    /* renamed from: b, reason: collision with root package name */
    private Object f4471b;

    public H(InterfaceC5519a initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.f4470a = initializer;
        this.f4471b = C.INSTANCE;
    }

    @Override // R6.InterfaceC0755i
    public Object getValue() {
        if (this.f4471b == C.INSTANCE) {
            InterfaceC5519a interfaceC5519a = this.f4470a;
            Intrinsics.checkNotNull(interfaceC5519a);
            this.f4471b = interfaceC5519a.invoke();
            this.f4470a = null;
        }
        return this.f4471b;
    }

    @Override // R6.InterfaceC0755i
    public boolean isInitialized() {
        return this.f4471b != C.INSTANCE;
    }

    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
