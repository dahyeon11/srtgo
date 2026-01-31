package a2;

import com.google.android.gms.common.api.Status;
import g2.AbstractC5544f;
import g2.AbstractC5547i;
import g2.n;

/* renamed from: a2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0828a {

    /* renamed from: a2.a$a, reason: collision with other inner class name */
    public interface InterfaceC0095a extends n {
        C0830c getResponse();

        @Override // g2.n
        /* synthetic */ Status getStatus();
    }

    /* renamed from: a2.a$b */
    public interface b extends n {
        String getSpatulaHeader();

        @Override // g2.n
        /* synthetic */ Status getStatus();
    }

    AbstractC5547i getSpatulaHeader(AbstractC5544f abstractC5544f);

    AbstractC5547i performProxyRequest(AbstractC5544f abstractC5544f, C0829b c0829b);
}
