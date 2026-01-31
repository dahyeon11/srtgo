package c2;

import com.google.android.gms.common.api.Status;
import g2.AbstractC5544f;
import g2.C5539a;

/* loaded from: classes.dex */
final class n extends p {
    n(AbstractC5544f abstractC5544f) {
        super(abstractC5544f);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1103b
    protected final /* synthetic */ void d(C5539a.b bVar) {
        h hVar = (h) bVar;
        ((v) hVar.getService()).zze(new q(this), hVar.zzo());
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* synthetic */ g2.n createFailedResult(Status status) {
        return status;
    }
}
