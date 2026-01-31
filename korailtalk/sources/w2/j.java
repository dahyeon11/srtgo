package w2;

import android.content.Context;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;
import g2.AbstractC5544f;

/* loaded from: classes2.dex */
final class j extends n {

    /* renamed from: r, reason: collision with root package name */
    private final /* synthetic */ Credential f37384r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(i iVar, AbstractC5544f abstractC5544f, Credential credential) {
        super(abstractC5544f);
        this.f37384r = credential;
    }

    @Override // w2.n
    protected final void g(Context context, w wVar) {
        wVar.zzc(new o(this), new y(this.f37384r));
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* synthetic */ g2.n createFailedResult(Status status) {
        return status;
    }
}
