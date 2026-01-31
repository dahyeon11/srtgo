package R6;

import f7.InterfaceC5519a;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
final class t implements InterfaceC0755i, Serializable {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC5519a f4486a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f4487b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f4488c;

    public t(InterfaceC5519a initializer, Object obj) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.f4486a = initializer;
        this.f4487b = C.INSTANCE;
        this.f4488c = obj == null ? this : obj;
    }

    @Override // R6.InterfaceC0755i
    public Object getValue() {
        Object objInvoke;
        Object obj = this.f4487b;
        C c9 = C.INSTANCE;
        if (obj != c9) {
            return obj;
        }
        synchronized (this.f4488c) {
            objInvoke = this.f4487b;
            if (objInvoke == c9) {
                InterfaceC5519a interfaceC5519a = this.f4486a;
                Intrinsics.checkNotNull(interfaceC5519a);
                objInvoke = interfaceC5519a.invoke();
                this.f4487b = objInvoke;
                this.f4486a = null;
            }
        }
        return objInvoke;
    }

    @Override // R6.InterfaceC0755i
    public boolean isInitialized() {
        return this.f4487b != C.INSTANCE;
    }

    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    public /* synthetic */ t(InterfaceC5519a interfaceC5519a, Object obj, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC5519a, (i8 & 2) != 0 ? null : obj);
    }
}
