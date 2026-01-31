package w2;

import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
final class k extends g {

    /* renamed from: a */
    private final /* synthetic */ h f37385a;

    k(h hVar) {
        this.f37385a = hVar;
    }

    @Override // w2.g, w2.t, w2.u
    public final void zzc(Status status, Credential credential) {
        this.f37385a.setResult((h) new f(status, credential));
    }

    @Override // w2.g, w2.t, w2.u
    public final void zzd(Status status) {
        this.f37385a.setResult((h) f.zzc(status));
    }
}
