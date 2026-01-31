package w2;

import Y1.a;
import android.app.PendingIntent;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.HintRequest;
import g2.AbstractC5544f;
import g2.AbstractC5547i;
import i2.AbstractC5683p;

/* loaded from: classes2.dex */
public final class i implements Z1.b {
    @Override // Z1.b
    public final AbstractC5547i delete(AbstractC5544f abstractC5544f, Credential credential) {
        AbstractC5683p.checkNotNull(abstractC5544f, "client must not be null");
        AbstractC5683p.checkNotNull(credential, "credential must not be null");
        return abstractC5544f.execute(new m(this, abstractC5544f, credential));
    }

    @Override // Z1.b
    public final AbstractC5547i disableAutoSignIn(AbstractC5544f abstractC5544f) {
        AbstractC5683p.checkNotNull(abstractC5544f, "client must not be null");
        return abstractC5544f.execute(new l(this, abstractC5544f));
    }

    @Override // Z1.b
    public final PendingIntent getHintPickerIntent(AbstractC5544f abstractC5544f, HintRequest hintRequest) {
        AbstractC5683p.checkNotNull(abstractC5544f, "client must not be null");
        AbstractC5683p.checkNotNull(hintRequest, "request must not be null");
        a.C0091a c0091aI = ((p) abstractC5544f.getClient(Y1.a.zzg)).I();
        return q.zzc(abstractC5544f.getContext(), c0091aI, hintRequest, c0091aI.getLogSessionId());
    }

    @Override // Z1.b
    public final AbstractC5547i request(AbstractC5544f abstractC5544f, com.google.android.gms.auth.api.credentials.a aVar) {
        AbstractC5683p.checkNotNull(abstractC5544f, "client must not be null");
        AbstractC5683p.checkNotNull(aVar, "request must not be null");
        return abstractC5544f.enqueue(new h(this, abstractC5544f, aVar));
    }

    @Override // Z1.b
    public final AbstractC5547i save(AbstractC5544f abstractC5544f, Credential credential) {
        AbstractC5683p.checkNotNull(abstractC5544f, "client must not be null");
        AbstractC5683p.checkNotNull(credential, "credential must not be null");
        return abstractC5544f.execute(new j(this, abstractC5544f, credential));
    }
}
