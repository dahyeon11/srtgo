package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import retrofit2.c;

/* loaded from: classes3.dex */
final class e extends c.a {

    /* renamed from: a, reason: collision with root package name */
    static final c.a f35946a = new e();

    private static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        private final Type f35947a;

        /* renamed from: retrofit2.e$a$a, reason: collision with other inner class name */
        class C0411a extends CompletableFuture {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC6201b f35948a;

            C0411a(InterfaceC6201b interfaceC6201b) {
                this.f35948a = interfaceC6201b;
            }

            @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
            public boolean cancel(boolean z8) {
                if (z8) {
                    this.f35948a.cancel();
                }
                return super.cancel(z8);
            }
        }

        class b implements d {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ CompletableFuture f35950a;

            b(CompletableFuture completableFuture) {
                this.f35950a = completableFuture;
            }

            @Override // retrofit2.d
            public void onFailure(InterfaceC6201b<Object> interfaceC6201b, Throwable th) {
                this.f35950a.completeExceptionally(th);
            }

            @Override // retrofit2.d
            public void onResponse(InterfaceC6201b<Object> interfaceC6201b, w<Object> wVar) {
                if (wVar.isSuccessful()) {
                    this.f35950a.complete(wVar.body());
                } else {
                    this.f35950a.completeExceptionally(new h(wVar));
                }
            }
        }

        a(Type type) {
            this.f35947a = type;
        }

        @Override // retrofit2.c
        public /* bridge */ /* synthetic */ Object adapt(InterfaceC6201b interfaceC6201b) {
            return adapt((InterfaceC6201b<Object>) interfaceC6201b);
        }

        @Override // retrofit2.c
        public Type responseType() {
            return this.f35947a;
        }

        @Override // retrofit2.c
        public CompletableFuture<Object> adapt(InterfaceC6201b<Object> interfaceC6201b) {
            C0411a c0411a = new C0411a(interfaceC6201b);
            interfaceC6201b.enqueue(new b(c0411a));
            return c0411a;
        }
    }

    private static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        private final Type f35952a;

        class a extends CompletableFuture {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC6201b f35953a;

            a(InterfaceC6201b interfaceC6201b) {
                this.f35953a = interfaceC6201b;
            }

            @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
            public boolean cancel(boolean z8) {
                if (z8) {
                    this.f35953a.cancel();
                }
                return super.cancel(z8);
            }
        }

        /* renamed from: retrofit2.e$b$b, reason: collision with other inner class name */
        class C0412b implements d {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ CompletableFuture f35955a;

            C0412b(CompletableFuture completableFuture) {
                this.f35955a = completableFuture;
            }

            @Override // retrofit2.d
            public void onFailure(InterfaceC6201b<Object> interfaceC6201b, Throwable th) {
                this.f35955a.completeExceptionally(th);
            }

            @Override // retrofit2.d
            public void onResponse(InterfaceC6201b<Object> interfaceC6201b, w<Object> wVar) {
                this.f35955a.complete(wVar);
            }
        }

        b(Type type) {
            this.f35952a = type;
        }

        @Override // retrofit2.c
        public /* bridge */ /* synthetic */ Object adapt(InterfaceC6201b interfaceC6201b) {
            return adapt((InterfaceC6201b<Object>) interfaceC6201b);
        }

        @Override // retrofit2.c
        public Type responseType() {
            return this.f35952a;
        }

        @Override // retrofit2.c
        public CompletableFuture<w<Object>> adapt(InterfaceC6201b<Object> interfaceC6201b) {
            a aVar = new a(interfaceC6201b);
            interfaceC6201b.enqueue(new C0412b(aVar));
            return aVar;
        }
    }

    e() {
    }

    @Override // retrofit2.c.a
    public c get(Type type, Annotation[] annotationArr, x xVar) {
        if (c.a.b(type) != CompletableFuture.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
        }
        Type typeA = c.a.a(0, (ParameterizedType) type);
        if (c.a.b(typeA) != w.class) {
            return new a(typeA);
        }
        if (typeA instanceof ParameterizedType) {
            return new b(c.a.a(0, (ParameterizedType) typeA));
        }
        throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
    }
}
