package io.grpc.internal;

import io.grpc.AbstractC5719d;
import io.grpc.AbstractC5725g;
import io.grpc.AbstractC5727h;
import io.grpc.C5713a;
import java.io.Closeable;
import java.net.SocketAddress;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: io.grpc.internal.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC5778v extends Closeable {

    /* renamed from: io.grpc.internal.v$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private AbstractC5727h f33188a;

        /* renamed from: b, reason: collision with root package name */
        private String f33189b = "unknown-authority";

        /* renamed from: c, reason: collision with root package name */
        private C5713a f33190c = C5713a.EMPTY;

        /* renamed from: d, reason: collision with root package name */
        private String f33191d;

        /* renamed from: e, reason: collision with root package name */
        private io.grpc.M f33192e;

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f33189b.equals(aVar.f33189b) && this.f33190c.equals(aVar.f33190c) && e3.r.equal(this.f33191d, aVar.f33191d) && e3.r.equal(this.f33192e, aVar.f33192e);
        }

        public String getAuthority() {
            return this.f33189b;
        }

        public AbstractC5727h getChannelLogger() {
            return this.f33188a;
        }

        public C5713a getEagAttributes() {
            return this.f33190c;
        }

        public io.grpc.M getHttpConnectProxiedSocketAddress() {
            return this.f33192e;
        }

        public String getUserAgent() {
            return this.f33191d;
        }

        public int hashCode() {
            return e3.r.hashCode(this.f33189b, this.f33190c, this.f33191d, this.f33192e);
        }

        public a setAuthority(String str) {
            this.f33189b = (String) e3.w.checkNotNull(str, "authority");
            return this;
        }

        public a setChannelLogger(AbstractC5727h abstractC5727h) {
            this.f33188a = abstractC5727h;
            return this;
        }

        public a setEagAttributes(C5713a c5713a) {
            e3.w.checkNotNull(c5713a, "eagAttributes");
            this.f33190c = c5713a;
            return this;
        }

        public a setHttpConnectProxiedSocketAddress(io.grpc.M m8) {
            this.f33192e = m8;
            return this;
        }

        public a setUserAgent(String str) {
            this.f33191d = str;
            return this;
        }
    }

    /* renamed from: io.grpc.internal.v$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        final InterfaceC5778v f33193a;

        /* renamed from: b, reason: collision with root package name */
        final AbstractC5719d f33194b;

        public b(InterfaceC5778v interfaceC5778v, AbstractC5719d abstractC5719d) {
            this.f33193a = (InterfaceC5778v) e3.w.checkNotNull(interfaceC5778v, "transportFactory");
            this.f33194b = abstractC5719d;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    ScheduledExecutorService getScheduledExecutorService();

    InterfaceC5782x newClientTransport(SocketAddress socketAddress, a aVar, AbstractC5727h abstractC5727h);

    b swapChannelCredentials(AbstractC5725g abstractC5725g);
}
