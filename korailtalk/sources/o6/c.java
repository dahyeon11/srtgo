package O6;

import e3.p;
import io.grpc.AbstractC5714a0;
import io.grpc.AbstractC5720d0;
import io.grpc.AbstractC5722e0;
import io.grpc.AbstractC5725g;
import io.grpc.AbstractC5727h;
import io.grpc.AbstractC5787j0;
import io.grpc.C;
import io.grpc.C5791l0;
import io.grpc.EnumC5802t;
import io.grpc.N0;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public abstract class c extends AbstractC5714a0.d {
    protected abstract AbstractC5714a0.d a();

    @Override // io.grpc.AbstractC5714a0.d
    public AbstractC5720d0 createOobChannel(C c9, String str) {
        return a().createOobChannel(c9, str);
    }

    @Override // io.grpc.AbstractC5714a0.d
    public AbstractC5720d0 createResolvingOobChannel(String str) {
        return a().createResolvingOobChannel(str);
    }

    @Override // io.grpc.AbstractC5714a0.d
    @Deprecated
    public AbstractC5722e0 createResolvingOobChannelBuilder(String str) {
        return a().createResolvingOobChannelBuilder(str);
    }

    @Override // io.grpc.AbstractC5714a0.d
    public AbstractC5714a0.h createSubchannel(AbstractC5714a0.b bVar) {
        return a().createSubchannel(bVar);
    }

    @Override // io.grpc.AbstractC5714a0.d
    public String getAuthority() {
        return a().getAuthority();
    }

    @Override // io.grpc.AbstractC5714a0.d
    public AbstractC5725g getChannelCredentials() {
        return a().getChannelCredentials();
    }

    @Override // io.grpc.AbstractC5714a0.d
    public AbstractC5727h getChannelLogger() {
        return a().getChannelLogger();
    }

    @Override // io.grpc.AbstractC5714a0.d
    public AbstractC5787j0.b getNameResolverArgs() {
        return a().getNameResolverArgs();
    }

    @Override // io.grpc.AbstractC5714a0.d
    public C5791l0 getNameResolverRegistry() {
        return a().getNameResolverRegistry();
    }

    @Override // io.grpc.AbstractC5714a0.d
    public ScheduledExecutorService getScheduledExecutorService() {
        return a().getScheduledExecutorService();
    }

    @Override // io.grpc.AbstractC5714a0.d
    public N0 getSynchronizationContext() {
        return a().getSynchronizationContext();
    }

    @Override // io.grpc.AbstractC5714a0.d
    public AbstractC5725g getUnsafeChannelCredentials() {
        return a().getUnsafeChannelCredentials();
    }

    @Override // io.grpc.AbstractC5714a0.d
    @Deprecated
    public void ignoreRefreshNameResolutionCheck() {
        a().ignoreRefreshNameResolutionCheck();
    }

    @Override // io.grpc.AbstractC5714a0.d
    public void refreshNameResolution() {
        a().refreshNameResolution();
    }

    public String toString() {
        return p.toStringHelper(this).add("delegate", a()).toString();
    }

    @Override // io.grpc.AbstractC5714a0.d
    public void updateBalancingState(EnumC5802t enumC5802t, AbstractC5714a0.i iVar) {
        a().updateBalancingState(enumC5802t, iVar);
    }

    @Override // io.grpc.AbstractC5714a0.d
    public void updateOobChannelAddresses(AbstractC5720d0 abstractC5720d0, C c9) {
        a().updateOobChannelAddresses(abstractC5720d0, c9);
    }

    @Override // io.grpc.AbstractC5714a0.d
    public AbstractC5720d0 createOobChannel(List<C> list, String str) {
        return a().createOobChannel(list, str);
    }

    @Override // io.grpc.AbstractC5714a0.d
    public AbstractC5722e0 createResolvingOobChannelBuilder(String str, AbstractC5725g abstractC5725g) {
        return a().createResolvingOobChannelBuilder(str, abstractC5725g);
    }

    @Override // io.grpc.AbstractC5714a0.d
    public void updateOobChannelAddresses(AbstractC5720d0 abstractC5720d0, List<C> list) {
        a().updateOobChannelAddresses(abstractC5720d0, list);
    }
}
