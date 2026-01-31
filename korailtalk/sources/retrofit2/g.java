package retrofit2;

import C7.H;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import retrofit2.c;

/* loaded from: classes3.dex */
final class g extends c.a {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f35957a;

    class a implements c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Type f35958a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Executor f35959b;

        a(Type type, Executor executor) {
            this.f35958a = type;
            this.f35959b = executor;
        }

        @Override // retrofit2.c
        public /* bridge */ /* synthetic */ Object adapt(InterfaceC6201b interfaceC6201b) {
            return adapt((InterfaceC6201b<Object>) interfaceC6201b);
        }

        @Override // retrofit2.c
        public Type responseType() {
            return this.f35958a;
        }

        @Override // retrofit2.c
        public InterfaceC6201b<Object> adapt(InterfaceC6201b<Object> interfaceC6201b) {
            Executor executor = this.f35959b;
            return executor == null ? interfaceC6201b : new b(executor, interfaceC6201b);
        }
    }

    static final class b implements InterfaceC6201b {

        /* renamed from: a, reason: collision with root package name */
        final Executor f35961a;

        /* renamed from: b, reason: collision with root package name */
        final InterfaceC6201b f35962b;

        class a implements d {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f35963a;

            /* renamed from: retrofit2.g$b$a$a, reason: collision with other inner class name */
            class RunnableC0413a implements Runnable {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ w f35965a;

                RunnableC0413a(w wVar) {
                    this.f35965a = wVar;
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (b.this.f35962b.isCanceled()) {
                        a aVar = a.this;
                        aVar.f35963a.onFailure(b.this, new IOException("Canceled"));
                    } else {
                        a aVar2 = a.this;
                        aVar2.f35963a.onResponse(b.this, this.f35965a);
                    }
                }
            }

            /* renamed from: retrofit2.g$b$a$b, reason: collision with other inner class name */
            class RunnableC0414b implements Runnable {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ Throwable f35967a;

                RunnableC0414b(Throwable th) {
                    this.f35967a = th;
                }

                @Override // java.lang.Runnable
                public void run() {
                    a aVar = a.this;
                    aVar.f35963a.onFailure(b.this, this.f35967a);
                }
            }

            a(d dVar) {
                this.f35963a = dVar;
            }

            @Override // retrofit2.d
            public void onFailure(InterfaceC6201b<Object> interfaceC6201b, Throwable th) {
                b.this.f35961a.execute(new RunnableC0414b(th));
            }

            @Override // retrofit2.d
            public void onResponse(InterfaceC6201b<Object> interfaceC6201b, w<Object> wVar) {
                b.this.f35961a.execute(new RunnableC0413a(wVar));
            }
        }

        b(Executor executor, InterfaceC6201b interfaceC6201b) {
            this.f35961a = executor;
            this.f35962b = interfaceC6201b;
        }

        @Override // retrofit2.InterfaceC6201b
        public void cancel() {
            this.f35962b.cancel();
        }

        @Override // retrofit2.InterfaceC6201b
        public void enqueue(d dVar) {
            B.b(dVar, "callback == null");
            this.f35962b.enqueue(new a(dVar));
        }

        @Override // retrofit2.InterfaceC6201b
        public w<Object> execute() {
            return this.f35962b.execute();
        }

        @Override // retrofit2.InterfaceC6201b
        public boolean isCanceled() {
            return this.f35962b.isCanceled();
        }

        @Override // retrofit2.InterfaceC6201b
        public boolean isExecuted() {
            return this.f35962b.isExecuted();
        }

        @Override // retrofit2.InterfaceC6201b
        public H request() {
            return this.f35962b.request();
        }

        @Override // retrofit2.InterfaceC6201b
        public InterfaceC6201b<Object> clone() {
            return new b(this.f35961a, this.f35962b.clone());
        }
    }

    g(Executor executor) {
        this.f35957a = executor;
    }

    @Override // retrofit2.c.a
    public c get(Type type, Annotation[] annotationArr, x xVar) {
        if (c.a.b(type) != InterfaceC6201b.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new a(B.h(0, (ParameterizedType) type), B.m(annotationArr, z.class) ? null : this.f35957a);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
