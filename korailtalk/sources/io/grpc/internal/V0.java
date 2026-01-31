package io.grpc.internal;

import io.grpc.O;

/* loaded from: classes.dex */
public final class V0 {

    /* renamed from: m, reason: collision with root package name */
    private static final b f32562m = new b(S0.SYSTEM_TIME_PROVIDER);

    /* renamed from: a, reason: collision with root package name */
    private final S0 f32563a;

    /* renamed from: b, reason: collision with root package name */
    private long f32564b;

    /* renamed from: c, reason: collision with root package name */
    private long f32565c;

    /* renamed from: d, reason: collision with root package name */
    private long f32566d;

    /* renamed from: e, reason: collision with root package name */
    private long f32567e;

    /* renamed from: f, reason: collision with root package name */
    private long f32568f;

    /* renamed from: g, reason: collision with root package name */
    private long f32569g;

    /* renamed from: h, reason: collision with root package name */
    private c f32570h;

    /* renamed from: i, reason: collision with root package name */
    private long f32571i;

    /* renamed from: j, reason: collision with root package name */
    private long f32572j;

    /* renamed from: k, reason: collision with root package name */
    private final InterfaceC5751h0 f32573k;

    /* renamed from: l, reason: collision with root package name */
    private volatile long f32574l;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final S0 f32575a;

        public b(S0 s02) {
            this.f32575a = s02;
        }

        public V0 create() {
            return new V0(this.f32575a);
        }
    }

    public interface c {
        d read();
    }

    public static final class d {
        public final long localBytes;
        public final long remoteBytes;

        public d(long j8, long j9) {
            this.localBytes = j8;
            this.remoteBytes = j9;
        }
    }

    public static b getDefaultFactory() {
        return f32562m;
    }

    public O.n getStats() {
        c cVar = this.f32570h;
        long j8 = cVar == null ? -1L : cVar.read().localBytes;
        c cVar2 = this.f32570h;
        return new O.n(this.f32564b, this.f32565c, this.f32566d, this.f32567e, this.f32568f, this.f32571i, this.f32573k.value(), this.f32569g, this.f32572j, this.f32574l, j8, cVar2 != null ? cVar2.read().remoteBytes : -1L);
    }

    public void reportKeepAliveSent() {
        this.f32569g++;
    }

    public void reportLocalStreamStarted() {
        this.f32564b++;
        this.f32565c = this.f32563a.currentTimeNanos();
    }

    public void reportMessageReceived() {
        this.f32573k.add(1L);
        this.f32574l = this.f32563a.currentTimeNanos();
    }

    public void reportMessageSent(int i8) {
        if (i8 == 0) {
            return;
        }
        this.f32571i += i8;
        this.f32572j = this.f32563a.currentTimeNanos();
    }

    public void reportRemoteStreamStarted() {
        this.f32564b++;
        this.f32566d = this.f32563a.currentTimeNanos();
    }

    public void reportStreamClosed(boolean z8) {
        if (z8) {
            this.f32567e++;
        } else {
            this.f32568f++;
        }
    }

    public void setFlowControlWindowReader(c cVar) {
        this.f32570h = (c) e3.w.checkNotNull(cVar);
    }

    public V0() {
        this.f32573k = AbstractC5753i0.create();
        this.f32563a = S0.SYSTEM_TIME_PROVIDER;
    }

    private V0(S0 s02) {
        this.f32573k = AbstractC5753i0.create();
        this.f32563a = s02;
    }
}
