package R6;

import java.io.Serializable;

/* renamed from: R6.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0750d implements InterfaceC0755i, Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final Object f4472a;

    public C0750d(Object obj) {
        this.f4472a = obj;
    }

    @Override // R6.InterfaceC0755i
    public Object getValue() {
        return this.f4472a;
    }

    @Override // R6.InterfaceC0755i
    public boolean isInitialized() {
        return true;
    }

    public String toString() {
        return String.valueOf(getValue());
    }
}
