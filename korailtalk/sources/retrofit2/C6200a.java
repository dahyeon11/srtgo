package retrofit2;

import C7.I;
import C7.K;
import R6.G;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import retrofit2.f;

/* renamed from: retrofit2.a */
/* loaded from: classes3.dex */
final class C6200a extends f.a {

    /* renamed from: a */
    private boolean f35939a = true;

    /* renamed from: retrofit2.a$a */
    static final class C0410a implements retrofit2.f {

        /* renamed from: a */
        static final C0410a f35940a = new C0410a();

        C0410a() {
        }

        @Override // retrofit2.f
        public K convert(K k8) throws IOException {
            try {
                return B.a(k8);
            } finally {
                k8.close();
            }
        }
    }

    /* renamed from: retrofit2.a$b */
    static final class b implements retrofit2.f {

        /* renamed from: a */
        static final b f35941a = new b();

        b() {
        }

        @Override // retrofit2.f
        public I convert(I i8) {
            return i8;
        }
    }

    /* renamed from: retrofit2.a$c */
    static final class c implements retrofit2.f {

        /* renamed from: a */
        static final c f35942a = new c();

        c() {
        }

        @Override // retrofit2.f
        public K convert(K k8) {
            return k8;
        }
    }

    /* renamed from: retrofit2.a$d */
    static final class d implements retrofit2.f {

        /* renamed from: a */
        static final d f35943a = new d();

        d() {
        }

        @Override // retrofit2.f
        public String convert(Object obj) {
            return obj.toString();
        }
    }

    /* renamed from: retrofit2.a$e */
    static final class e implements retrofit2.f {

        /* renamed from: a */
        static final e f35944a = new e();

        e() {
        }

        @Override // retrofit2.f
        public G convert(K k8) throws IOException {
            k8.close();
            return G.INSTANCE;
        }
    }

    /* renamed from: retrofit2.a$f */
    static final class f implements retrofit2.f {

        /* renamed from: a */
        static final f f35945a = new f();

        f() {
        }

        @Override // retrofit2.f
        public Void convert(K k8) throws IOException {
            k8.close();
            return null;
        }
    }

    C6200a() {
    }

    @Override // retrofit2.f.a
    public retrofit2.f requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, x xVar) {
        if (I.class.isAssignableFrom(B.i(type))) {
            return b.f35941a;
        }
        return null;
    }

    @Override // retrofit2.f.a
    public retrofit2.f responseBodyConverter(Type type, Annotation[] annotationArr, x xVar) {
        if (type == K.class) {
            return B.m(annotationArr, d8.w.class) ? c.f35942a : C0410a.f35940a;
        }
        if (type == Void.class) {
            return f.f35945a;
        }
        if (!this.f35939a || type != G.class) {
            return null;
        }
        try {
            return e.f35944a;
        } catch (NoClassDefFoundError unused) {
            this.f35939a = false;
            return null;
        }
    }
}
