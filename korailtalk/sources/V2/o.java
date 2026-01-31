package v2;

import a2.C0830c;
import a2.InterfaceC0828a;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
final class o implements InterfaceC0828a.InterfaceC0095a {

    /* renamed from: a, reason: collision with root package name */
    private Status f37219a;

    /* renamed from: b, reason: collision with root package name */
    private C0830c f37220b;

    public o(C0830c c0830c) {
        this.f37220b = c0830c;
        this.f37219a = Status.RESULT_SUCCESS;
    }

    @Override // a2.InterfaceC0828a.InterfaceC0095a
    public final C0830c getResponse() {
        return this.f37220b;
    }

    @Override // a2.InterfaceC0828a.InterfaceC0095a, g2.n
    public final Status getStatus() {
        return this.f37219a;
    }

    public o(Status status) {
        this.f37219a = status;
    }
}
