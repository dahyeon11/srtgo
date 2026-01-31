package io.grpc.internal;

import e3.C5353C;
import io.grpc.AbstractC5787j0;
import io.grpc.AbstractC5789k0;
import java.net.InetSocketAddress;
import java.net.URI;
import java.util.Collection;
import java.util.Collections;

/* loaded from: classes.dex */
public final class F extends AbstractC5789k0 {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f32454a = io.grpc.W.isAndroid(F.class.getClassLoader());

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f32455b = 0;

    @Override // io.grpc.AbstractC5789k0
    protected Collection a() {
        return Collections.singleton(InetSocketAddress.class);
    }

    @Override // io.grpc.AbstractC5789k0
    protected boolean c() {
        return true;
    }

    @Override // io.grpc.AbstractC5787j0.d
    public String getDefaultScheme() {
        return "dns";
    }

    @Override // io.grpc.AbstractC5787j0.d
    public AbstractC5787j0 newNameResolver(URI uri, AbstractC5787j0.b bVar) {
        if (!"dns".equals(uri.getScheme())) {
            return null;
        }
        String str = (String) e3.w.checkNotNull(uri.getPath(), "targetPath");
        e3.w.checkArgument(str.startsWith("/"), "the path component (%s) of the target (%s) must start with '/'", str, uri);
        return new E(uri.getAuthority(), str.substring(1), bVar, U.SHARED_CHANNEL_EXECUTOR, C5353C.createUnstarted(), f32454a);
    }

    @Override // io.grpc.AbstractC5789k0
    public int priority() {
        return 5;
    }
}
