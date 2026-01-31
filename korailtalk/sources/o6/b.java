package O6;

import e3.p;
import io.grpc.AbstractC5714a0;
import io.grpc.C5803u;
import io.grpc.J0;

/* loaded from: classes2.dex */
public abstract class b extends AbstractC5714a0 {
    protected abstract AbstractC5714a0 a();

    @Override // io.grpc.AbstractC5714a0
    public boolean canHandleEmptyAddressListFromNameResolution() {
        return a().canHandleEmptyAddressListFromNameResolution();
    }

    @Override // io.grpc.AbstractC5714a0
    public void handleNameResolutionError(J0 j02) {
        a().handleNameResolutionError(j02);
    }

    @Override // io.grpc.AbstractC5714a0
    public void handleResolvedAddresses(AbstractC5714a0.g gVar) {
        a().handleResolvedAddresses(gVar);
    }

    @Override // io.grpc.AbstractC5714a0
    @Deprecated
    public void handleSubchannelState(AbstractC5714a0.h hVar, C5803u c5803u) {
        a().handleSubchannelState(hVar, c5803u);
    }

    @Override // io.grpc.AbstractC5714a0
    public void requestConnection() {
        a().requestConnection();
    }

    @Override // io.grpc.AbstractC5714a0
    public void shutdown() {
        a().shutdown();
    }

    public String toString() {
        return p.toStringHelper(this).add("delegate", a()).toString();
    }
}
