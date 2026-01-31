package v2;

import a2.InterfaceC0828a;
import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC1103b;
import g2.AbstractC5544f;
import g2.C5539a;

/* loaded from: classes2.dex */
abstract class i extends AbstractC1103b {
    public i(AbstractC5544f abstractC5544f) {
        super(Y1.b.API, abstractC5544f);
    }

    protected static InterfaceC0828a.b h(Status status) {
        return new p(status);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected /* synthetic */ g2.n createFailedResult(Status status) {
        return h(status);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1103b
    protected /* synthetic */ void d(C5539a.b bVar) {
        c cVar = (c) bVar;
        g(cVar.getContext(), (f) cVar.getService());
    }

    protected abstract void g(Context context, f fVar);
}
