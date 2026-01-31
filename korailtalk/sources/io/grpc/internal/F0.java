package io.grpc.internal;

import io.grpc.AbstractC5787j0;
import io.grpc.C5713a;

/* loaded from: classes.dex */
final class F0 extends P {

    /* renamed from: e, reason: collision with root package name */
    static final C5713a.c f32456e = C5713a.c.create("io.grpc.internal.RetryingNameResolver.RESOLUTION_RESULT_LISTENER_KEY");

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC5787j0 f32457b;

    /* renamed from: c, reason: collision with root package name */
    private final E0 f32458c;

    /* renamed from: d, reason: collision with root package name */
    private final io.grpc.N0 f32459d;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            F0.this.refresh();
        }
    }

    class b {
        b() {
        }

        public void resolutionAttempted(boolean z8) {
            if (z8) {
                F0.this.f32458c.reset();
            } else {
                F0.this.f32458c.schedule(F0.this.new a());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class c extends AbstractC5787j0.e {

        /* renamed from: a, reason: collision with root package name */
        private AbstractC5787j0.e f32462a;

        c(AbstractC5787j0.e eVar) {
            this.f32462a = eVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b() {
            F0.this.f32458c.schedule(F0.this.new a());
        }

        @Override // io.grpc.AbstractC5787j0.e, io.grpc.AbstractC5787j0.f
        public void onError(io.grpc.J0 j02) {
            this.f32462a.onError(j02);
            F0.this.f32459d.execute(new Runnable() { // from class: io.grpc.internal.G0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f32470a.b();
                }
            });
        }

        @Override // io.grpc.AbstractC5787j0.e
        public void onResult(AbstractC5787j0.g gVar) {
            C5713a attributes = gVar.getAttributes();
            C5713a.c cVar = F0.f32456e;
            if (attributes.get(cVar) != null) {
                throw new IllegalStateException("RetryingNameResolver can only be used once to wrap a NameResolver");
            }
            this.f32462a.onResult(gVar.toBuilder().setAttributes(gVar.getAttributes().toBuilder().set(cVar, F0.this.new b()).build()).build());
        }
    }

    F0(AbstractC5787j0 abstractC5787j0, E0 e02, io.grpc.N0 n02) {
        super(abstractC5787j0);
        this.f32457b = abstractC5787j0;
        this.f32458c = e02;
        this.f32459d = n02;
    }

    @Override // io.grpc.internal.P, io.grpc.AbstractC5787j0
    public void shutdown() {
        super.shutdown();
        this.f32458c.reset();
    }

    @Override // io.grpc.internal.P, io.grpc.AbstractC5787j0
    public void start(AbstractC5787j0.e eVar) {
        super.start((AbstractC5787j0.e) new c(eVar));
    }
}
