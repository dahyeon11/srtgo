package O6;

import e3.p;
import io.grpc.AbstractC5714a0;
import io.grpc.AbstractC5723f;
import io.grpc.AbstractC5727h;
import io.grpc.C;
import io.grpc.C5713a;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class d extends AbstractC5714a0.h {
    protected abstract AbstractC5714a0.h a();

    @Override // io.grpc.AbstractC5714a0.h
    public AbstractC5723f asChannel() {
        return a().asChannel();
    }

    @Override // io.grpc.AbstractC5714a0.h
    public List<C> getAllAddresses() {
        return a().getAllAddresses();
    }

    @Override // io.grpc.AbstractC5714a0.h
    public C5713a getAttributes() {
        return a().getAttributes();
    }

    @Override // io.grpc.AbstractC5714a0.h
    public AbstractC5727h getChannelLogger() {
        return a().getChannelLogger();
    }

    @Override // io.grpc.AbstractC5714a0.h
    public Object getInternalSubchannel() {
        return a().getInternalSubchannel();
    }

    @Override // io.grpc.AbstractC5714a0.h
    public void requestConnection() {
        a().requestConnection();
    }

    @Override // io.grpc.AbstractC5714a0.h
    public void shutdown() {
        a().shutdown();
    }

    @Override // io.grpc.AbstractC5714a0.h
    public void start(AbstractC5714a0.j jVar) {
        a().start(jVar);
    }

    public String toString() {
        return p.toStringHelper(this).add("delegate", a()).toString();
    }

    @Override // io.grpc.AbstractC5714a0.h
    public void updateAddresses(List<C> list) {
        a().updateAddresses(list);
    }
}
