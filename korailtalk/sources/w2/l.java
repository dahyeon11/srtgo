package w2;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import g2.AbstractC5544f;

/* loaded from: classes2.dex */
final class l extends n {
    l(i iVar, AbstractC5544f abstractC5544f) {
        super(abstractC5544f);
    }

    @Override // w2.n
    protected final void g(Context context, w wVar) {
        wVar.zzc(new o(this));
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* synthetic */ g2.n createFailedResult(Status status) {
        return status;
    }
}
