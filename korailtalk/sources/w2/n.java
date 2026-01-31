package w2;

import android.content.Context;
import com.google.android.gms.common.api.internal.AbstractC1103b;
import g2.AbstractC5544f;
import g2.C5539a;

/* loaded from: classes2.dex */
abstract class n extends AbstractC1103b {
    n(AbstractC5544f abstractC5544f) {
        super(Y1.a.CREDENTIALS_API, abstractC5544f);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1103b
    protected /* synthetic */ void d(C5539a.b bVar) {
        p pVar = (p) bVar;
        g(pVar.getContext(), (w) pVar.getService());
    }

    protected abstract void g(Context context, w wVar);

    @Override // com.google.android.gms.common.api.internal.AbstractC1103b, h2.InterfaceC5586c
    public /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((n) obj);
    }
}
