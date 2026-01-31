package I6;

import I6.f;
import io.grpc.AbstractC5724f0;
import io.grpc.AbstractC5725g;
import io.grpc.W;
import java.net.InetSocketAddress;
import java.util.Collection;
import java.util.Collections;

/* loaded from: classes.dex */
public final class g extends AbstractC5724f0 {
    @Override // io.grpc.AbstractC5724f0
    protected Collection a() {
        return Collections.singleton(InetSocketAddress.class);
    }

    @Override // io.grpc.AbstractC5724f0
    public boolean isAvailable() {
        return true;
    }

    @Override // io.grpc.AbstractC5724f0
    public AbstractC5724f0.a newChannelBuilder(String str, AbstractC5725g abstractC5725g) {
        f.g gVarI = f.i(abstractC5725g);
        String str2 = gVarI.error;
        return str2 != null ? AbstractC5724f0.a.error(str2) : AbstractC5724f0.a.channelBuilder(new f(str, abstractC5725g, gVarI.callCredentials, gVarI.factory));
    }

    @Override // io.grpc.AbstractC5724f0
    public int priority() {
        return W.isAndroid(g.class.getClassLoader()) ? 8 : 3;
    }

    @Override // io.grpc.AbstractC5724f0
    public f builderForAddress(String str, int i8) {
        return f.forAddress(str, i8);
    }

    @Override // io.grpc.AbstractC5724f0
    public f builderForTarget(String str) {
        return f.forTarget(str);
    }
}
