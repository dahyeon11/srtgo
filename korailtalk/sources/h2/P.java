package h2;

import I2.AbstractC0608l;
import I2.InterfaceC0599c;
import com.google.android.gms.common.api.Status;
import g2.C5540b;

/* loaded from: classes.dex */
final class P implements InterfaceC0599c {
    P() {
    }

    @Override // I2.InterfaceC0599c
    public final /* bridge */ /* synthetic */ Object then(AbstractC0608l abstractC0608l) throws C5540b {
        if (((Boolean) abstractC0608l.getResult()).booleanValue()) {
            return null;
        }
        throw new C5540b(new Status(13, "listener already unregistered"));
    }
}
