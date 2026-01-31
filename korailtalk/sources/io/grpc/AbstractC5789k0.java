package io.grpc;

import io.grpc.AbstractC5787j0;
import java.net.InetSocketAddress;
import java.util.Collection;
import java.util.Collections;

/* renamed from: io.grpc.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5789k0 extends AbstractC5787j0.d {
    protected Collection a() {
        return Collections.singleton(InetSocketAddress.class);
    }

    protected String b() {
        return getDefaultScheme();
    }

    protected abstract boolean c();

    protected abstract int priority();
}
