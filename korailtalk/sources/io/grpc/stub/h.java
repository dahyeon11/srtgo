package io.grpc.stub;

import e3.w;
import io.grpc.AbstractC5723f;
import io.grpc.AbstractC5786j;
import io.grpc.C5721e;
import io.grpc.C5728h0;
import io.grpc.C5730i0;
import io.grpc.E;
import io.grpc.F;
import io.grpc.InterfaceC5788k;
import io.grpc.J0;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class h {

    private static final class a implements InterfaceC5788k {

        /* renamed from: a, reason: collision with root package name */
        private final C5728h0 f33318a;

        /* renamed from: io.grpc.stub.h$a$a, reason: collision with other inner class name */
        private final class C0327a extends E.a {
            C0327a(AbstractC5786j abstractC5786j) {
                super(abstractC5786j);
            }

            @Override // io.grpc.E, io.grpc.AbstractC5786j
            public void start(AbstractC5786j.a aVar, C5728h0 c5728h0) {
                c5728h0.merge(a.this.f33318a);
                super.start(aVar, c5728h0);
            }
        }

        a(C5728h0 c5728h0) {
            this.f33318a = (C5728h0) w.checkNotNull(c5728h0, "extraHeaders");
        }

        @Override // io.grpc.InterfaceC5788k
        public <ReqT, RespT> AbstractC5786j interceptCall(C5730i0 c5730i0, C5721e c5721e, AbstractC5723f abstractC5723f) {
            return new C0327a(abstractC5723f.newCall(c5730i0, c5721e));
        }
    }

    private static final class b implements InterfaceC5788k {

        /* renamed from: a, reason: collision with root package name */
        final AtomicReference f33320a;

        /* renamed from: b, reason: collision with root package name */
        final AtomicReference f33321b;

        private final class a extends E.a {

            /* renamed from: io.grpc.stub.h$b$a$a, reason: collision with other inner class name */
            private final class C0328a extends F.a {
                C0328a(AbstractC5786j.a aVar) {
                    super(aVar);
                }

                @Override // io.grpc.F.a, io.grpc.F, io.grpc.AbstractC5795n0, io.grpc.AbstractC5786j.a
                public void onClose(J0 j02, C5728h0 c5728h0) {
                    b.this.f33321b.set(c5728h0);
                    super.onClose(j02, c5728h0);
                }

                @Override // io.grpc.F.a, io.grpc.F, io.grpc.AbstractC5795n0, io.grpc.AbstractC5786j.a
                public void onHeaders(C5728h0 c5728h0) {
                    b.this.f33320a.set(c5728h0);
                    super.onHeaders(c5728h0);
                }
            }

            a(AbstractC5786j abstractC5786j) {
                super(abstractC5786j);
            }

            @Override // io.grpc.E, io.grpc.AbstractC5786j
            public void start(AbstractC5786j.a aVar, C5728h0 c5728h0) {
                b.this.f33320a.set(null);
                b.this.f33321b.set(null);
                super.start(new C0328a(aVar), c5728h0);
            }
        }

        b(AtomicReference atomicReference, AtomicReference atomicReference2) {
            this.f33320a = (AtomicReference) w.checkNotNull(atomicReference, "headersCapture");
            this.f33321b = (AtomicReference) w.checkNotNull(atomicReference2, "trailersCapture");
        }

        @Override // io.grpc.InterfaceC5788k
        public <ReqT, RespT> AbstractC5786j interceptCall(C5730i0 c5730i0, C5721e c5721e, AbstractC5723f abstractC5723f) {
            return new a(abstractC5723f.newCall(c5730i0, c5721e));
        }
    }

    @Deprecated
    public static <T extends d> T attachHeaders(T t8, C5728h0 c5728h0) {
        return (T) t8.withInterceptors(newAttachHeadersInterceptor(c5728h0));
    }

    @Deprecated
    public static <T extends d> T captureMetadata(T t8, AtomicReference<C5728h0> atomicReference, AtomicReference<C5728h0> atomicReference2) {
        return (T) t8.withInterceptors(newCaptureMetadataInterceptor(atomicReference, atomicReference2));
    }

    public static InterfaceC5788k newAttachHeadersInterceptor(C5728h0 c5728h0) {
        return new a(c5728h0);
    }

    public static InterfaceC5788k newCaptureMetadataInterceptor(AtomicReference<C5728h0> atomicReference, AtomicReference<C5728h0> atomicReference2) {
        return new b(atomicReference, atomicReference2);
    }
}
