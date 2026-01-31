package v2;

import a2.C0829b;
import a2.InterfaceC0828a;
import g2.AbstractC5544f;
import g2.AbstractC5547i;
import i2.AbstractC5683p;

/* loaded from: classes2.dex */
public final class j implements InterfaceC0828a {
    @Override // a2.InterfaceC0828a
    public final AbstractC5547i getSpatulaHeader(AbstractC5544f abstractC5544f) {
        AbstractC5683p.checkNotNull(abstractC5544f);
        return abstractC5544f.execute(new m(this, abstractC5544f));
    }

    @Override // a2.InterfaceC0828a
    public final AbstractC5547i performProxyRequest(AbstractC5544f abstractC5544f, C0829b c0829b) {
        AbstractC5683p.checkNotNull(abstractC5544f);
        AbstractC5683p.checkNotNull(c0829b);
        return abstractC5544f.execute(new k(this, abstractC5544f, c0829b));
    }
}
