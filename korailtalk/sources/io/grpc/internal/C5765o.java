package io.grpc.internal;

import io.grpc.O;

/* renamed from: io.grpc.internal.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5765o {

    /* renamed from: f, reason: collision with root package name */
    static final b f33030f = new a();

    /* renamed from: a, reason: collision with root package name */
    private final S0 f33031a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC5751h0 f33032b = AbstractC5753i0.create();

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC5751h0 f33033c = AbstractC5753i0.create();

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC5751h0 f33034d = AbstractC5753i0.create();

    /* renamed from: e, reason: collision with root package name */
    private volatile long f33035e;

    /* renamed from: io.grpc.internal.o$a */
    class a implements b {
        a() {
        }

        @Override // io.grpc.internal.C5765o.b
        public C5765o create() {
            return new C5765o(S0.SYSTEM_TIME_PROVIDER);
        }
    }

    /* renamed from: io.grpc.internal.o$b */
    public interface b {
        C5765o create();
    }

    C5765o(S0 s02) {
        this.f33031a = s02;
    }

    public static b getDefaultFactory() {
        return f33030f;
    }

    void a(O.b.a aVar) {
        aVar.setCallsStarted(this.f33032b.value()).setCallsSucceeded(this.f33033c.value()).setCallsFailed(this.f33034d.value()).setLastCallStartedNanos(this.f33035e);
    }

    public void reportCallEnded(boolean z8) {
        if (z8) {
            this.f33033c.add(1L);
        } else {
            this.f33034d.add(1L);
        }
    }

    public void reportCallStarted() {
        this.f33032b.add(1L);
        this.f33035e = this.f33031a.currentTimeNanos();
    }
}
