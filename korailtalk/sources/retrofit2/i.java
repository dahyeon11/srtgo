package retrofit2;

import C7.InterfaceC0472f;
import C7.J;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import retrofit2.B;

/* loaded from: classes3.dex */
abstract class i extends y {

    /* renamed from: a, reason: collision with root package name */
    private final v f35972a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC0472f.a f35973b;

    /* renamed from: c, reason: collision with root package name */
    private final f f35974c;

    static final class a extends i {

        /* renamed from: d, reason: collision with root package name */
        private final retrofit2.c f35975d;

        a(v vVar, InterfaceC0472f.a aVar, f fVar, retrofit2.c cVar) {
            super(vVar, aVar, fVar);
            this.f35975d = cVar;
        }

        @Override // retrofit2.i
        protected Object c(InterfaceC6201b interfaceC6201b, Object[] objArr) {
            return this.f35975d.adapt(interfaceC6201b);
        }
    }

    static final class b extends i {

        /* renamed from: d, reason: collision with root package name */
        private final retrofit2.c f35976d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f35977e;

        b(v vVar, InterfaceC0472f.a aVar, f fVar, retrofit2.c cVar, boolean z8) {
            super(vVar, aVar, fVar);
            this.f35976d = cVar;
            this.f35977e = z8;
        }

        @Override // retrofit2.i
        protected Object c(InterfaceC6201b interfaceC6201b, Object[] objArr) {
            InterfaceC6201b interfaceC6201b2 = (InterfaceC6201b) this.f35976d.adapt(interfaceC6201b);
            W6.d dVar = (W6.d) objArr[objArr.length - 1];
            try {
                return this.f35977e ? k.awaitNullable(interfaceC6201b2, dVar) : k.await(interfaceC6201b2, dVar);
            } catch (Exception e8) {
                return k.yieldAndThrow(e8, dVar);
            }
        }
    }

    static final class c extends i {

        /* renamed from: d, reason: collision with root package name */
        private final retrofit2.c f35978d;

        c(v vVar, InterfaceC0472f.a aVar, f fVar, retrofit2.c cVar) {
            super(vVar, aVar, fVar);
            this.f35978d = cVar;
        }

        @Override // retrofit2.i
        protected Object c(InterfaceC6201b interfaceC6201b, Object[] objArr) {
            InterfaceC6201b interfaceC6201b2 = (InterfaceC6201b) this.f35978d.adapt(interfaceC6201b);
            W6.d dVar = (W6.d) objArr[objArr.length - 1];
            try {
                return k.awaitResponse(interfaceC6201b2, dVar);
            } catch (Exception e8) {
                return k.yieldAndThrow(e8, dVar);
            }
        }
    }

    i(v vVar, InterfaceC0472f.a aVar, f fVar) {
        this.f35972a = vVar;
        this.f35973b = aVar;
        this.f35974c = fVar;
    }

    private static retrofit2.c d(x xVar, Method method, Type type, Annotation[] annotationArr) {
        try {
            return xVar.callAdapter(type, annotationArr);
        } catch (RuntimeException e8) {
            throw B.o(method, e8, "Unable to create call adapter for %s", type);
        }
    }

    private static f e(x xVar, Method method, Type type) {
        try {
            return xVar.responseBodyConverter(type, method.getAnnotations());
        } catch (RuntimeException e8) {
            throw B.o(method, e8, "Unable to create converter for %s", type);
        }
    }

    static i f(x xVar, Method method, v vVar) {
        Type genericReturnType;
        boolean z8;
        boolean z9 = vVar.f36080k;
        Annotation[] annotations = method.getAnnotations();
        if (z9) {
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            Type typeG = B.g(0, (ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]);
            if (B.i(typeG) == w.class && (typeG instanceof ParameterizedType)) {
                typeG = B.h(0, (ParameterizedType) typeG);
                z8 = true;
            } else {
                z8 = false;
            }
            genericReturnType = new B.b(null, InterfaceC6201b.class, typeG);
            annotations = A.a(annotations);
        } else {
            genericReturnType = method.getGenericReturnType();
            z8 = false;
        }
        retrofit2.c cVarD = d(xVar, method, genericReturnType, annotations);
        Type typeResponseType = cVarD.responseType();
        if (typeResponseType == J.class) {
            throw B.n(method, "'" + B.i(typeResponseType).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
        }
        if (typeResponseType == w.class) {
            throw B.n(method, "Response must include generic type (e.g., Response<String>)", new Object[0]);
        }
        if (vVar.f36072c.equals("HEAD") && !Void.class.equals(typeResponseType)) {
            throw B.n(method, "HEAD method must use Void as response type.", new Object[0]);
        }
        f fVarE = e(xVar, method, typeResponseType);
        InterfaceC0472f.a aVar = xVar.f36110b;
        return !z9 ? new a(vVar, aVar, fVarE, cVarD) : z8 ? new c(vVar, aVar, fVarE, cVarD) : new b(vVar, aVar, fVarE, cVarD, false);
    }

    @Override // retrofit2.y
    final Object a(Object[] objArr) {
        return c(new l(this.f35972a, objArr, this.f35973b, this.f35974c), objArr);
    }

    protected abstract Object c(InterfaceC6201b interfaceC6201b, Object[] objArr);
}
