package w2;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import g2.AbstractC5544f;

/* loaded from: classes2.dex */
final class h extends n {

    /* renamed from: r, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.auth.api.credentials.a f37383r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(i iVar, AbstractC5544f abstractC5544f, com.google.android.gms.auth.api.credentials.a aVar) {
        super(abstractC5544f);
        this.f37383r = aVar;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* synthetic */ g2.n createFailedResult(Status status) {
        return f.zzc(status);
    }

    @Override // w2.n
    protected final void g(Context context, w wVar) {
        wVar.zzc(new k(this), this.f37383r);
    }
}
