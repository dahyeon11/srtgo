package io.grpc;

import io.grpc.AbstractC5719d;
import java.util.concurrent.Executor;

/* renamed from: io.grpc.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5798p extends AbstractC5719d {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC5719d f33269a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC5719d f33270b;

    /* renamed from: io.grpc.p$a */
    private static final class a extends AbstractC5719d.a {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC5719d.a f33271a;

        /* renamed from: b, reason: collision with root package name */
        private final C5728h0 f33272b;

        public a(AbstractC5719d.a aVar, C5728h0 c5728h0) {
            this.f33271a = aVar;
            this.f33272b = c5728h0;
        }

        @Override // io.grpc.AbstractC5719d.a
        public void apply(C5728h0 c5728h0) {
            e3.w.checkNotNull(c5728h0, "headers");
            C5728h0 c5728h02 = new C5728h0();
            c5728h02.merge(this.f33272b);
            c5728h02.merge(c5728h0);
            this.f33271a.apply(c5728h02);
        }

        @Override // io.grpc.AbstractC5719d.a
        public void fail(J0 j02) {
            this.f33271a.fail(j02);
        }
    }

    /* renamed from: io.grpc.p$b */
    private final class b extends AbstractC5719d.a {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC5719d.b f33273a;

        /* renamed from: b, reason: collision with root package name */
        private final Executor f33274b;

        /* renamed from: c, reason: collision with root package name */
        private final AbstractC5719d.a f33275c;

        /* renamed from: d, reason: collision with root package name */
        private final C5804v f33276d;

        public b(AbstractC5719d.b bVar, Executor executor, AbstractC5719d.a aVar, C5804v c5804v) {
            this.f33273a = bVar;
            this.f33274b = executor;
            this.f33275c = (AbstractC5719d.a) e3.w.checkNotNull(aVar, "delegate");
            this.f33276d = (C5804v) e3.w.checkNotNull(c5804v, "context");
        }

        @Override // io.grpc.AbstractC5719d.a
        public void apply(C5728h0 c5728h0) {
            e3.w.checkNotNull(c5728h0, "headers");
            C5804v c5804vAttach = this.f33276d.attach();
            try {
                C5798p.this.f33270b.applyRequestMetadata(this.f33273a, this.f33274b, new a(this.f33275c, c5728h0));
            } finally {
                this.f33276d.detach(c5804vAttach);
            }
        }

        @Override // io.grpc.AbstractC5719d.a
        public void fail(J0 j02) {
            this.f33275c.fail(j02);
        }
    }

    public C5798p(AbstractC5719d abstractC5719d, AbstractC5719d abstractC5719d2) {
        this.f33269a = (AbstractC5719d) e3.w.checkNotNull(abstractC5719d, "creds1");
        this.f33270b = (AbstractC5719d) e3.w.checkNotNull(abstractC5719d2, "creds2");
    }

    @Override // io.grpc.AbstractC5719d
    public void applyRequestMetadata(AbstractC5719d.b bVar, Executor executor, AbstractC5719d.a aVar) {
        this.f33269a.applyRequestMetadata(bVar, executor, new b(bVar, executor, aVar, C5804v.current()));
    }
}
