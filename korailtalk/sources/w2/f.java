package w2;

import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
public final class f implements Z1.a {

    /* renamed from: a, reason: collision with root package name */
    private final Status f37381a;

    /* renamed from: b, reason: collision with root package name */
    private final Credential f37382b;

    public f(Status status, Credential credential) {
        this.f37381a = status;
        this.f37382b = credential;
    }

    public static f zzc(Status status) {
        return new f(status, null);
    }

    @Override // Z1.a
    public final Credential getCredential() {
        return this.f37382b;
    }

    @Override // Z1.a, g2.n
    public final Status getStatus() {
        return this.f37381a;
    }
}
