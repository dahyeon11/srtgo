package v2;

import a2.InterfaceC0828a;
import com.google.android.gms.common.api.Status;
import i2.AbstractC5683p;

/* loaded from: classes2.dex */
public final class p implements InterfaceC0828a.b {

    /* renamed from: a, reason: collision with root package name */
    private Status f37221a;

    /* renamed from: b, reason: collision with root package name */
    private String f37222b;

    public p(String str) {
        this.f37222b = (String) AbstractC5683p.checkNotNull(str);
        this.f37221a = Status.RESULT_SUCCESS;
    }

    @Override // a2.InterfaceC0828a.b
    public final String getSpatulaHeader() {
        return this.f37222b;
    }

    @Override // a2.InterfaceC0828a.b, g2.n
    public final Status getStatus() {
        return this.f37221a;
    }

    public p(Status status) {
        this.f37221a = (Status) AbstractC5683p.checkNotNull(status);
    }
}
