package retrofit2;

import C7.E;
import C7.InterfaceC0472f;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import retrofit2.C6200a;
import retrofit2.c;
import retrofit2.f;

/* loaded from: classes3.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    private final Map f36109a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    final InterfaceC0472f.a f36110b;

    /* renamed from: c, reason: collision with root package name */
    final C7.A f36111c;

    /* renamed from: d, reason: collision with root package name */
    final List f36112d;

    /* renamed from: e, reason: collision with root package name */
    final List f36113e;

    /* renamed from: f, reason: collision with root package name */
    final Executor f36114f;

    /* renamed from: g, reason: collision with root package name */
    final boolean f36115g;

    class a implements InvocationHandler {

        /* renamed from: a, reason: collision with root package name */
        private final o f36116a = o.f();

        /* renamed from: b, reason: collision with root package name */
        private final Object[] f36117b = new Object[0];

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Class f36118c;

        a(Class cls) {
            this.f36118c = cls;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (this.f36116a.h(method)) {
                return this.f36116a.g(method, this.f36118c, obj, objArr);
            }
            y yVarB = x.this.b(method);
            if (objArr == null) {
                objArr = this.f36117b;
            }
            return yVarB.a(objArr);
        }
    }

    x(InterfaceC0472f.a aVar, C7.A a9, List list, List list2, Executor executor, boolean z8) {
        this.f36110b = aVar;
        this.f36111c = a9;
        this.f36112d = list;
        this.f36113e = list2;
        this.f36114f = executor;
        this.f36115g = z8;
    }

    private void a(Class cls) throws SecurityException {
        o oVarF = o.f();
        for (Method method : cls.getDeclaredMethods()) {
            if (!oVarF.h(method) && !Modifier.isStatic(method.getModifiers())) {
                b(method);
            }
        }
    }

    y b(Method method) {
        y yVarB;
        y yVar = (y) this.f36109a.get(method);
        if (yVar != null) {
            return yVar;
        }
        synchronized (this.f36109a) {
            try {
                yVarB = (y) this.f36109a.get(method);
                if (yVarB == null) {
                    yVarB = y.b(this, method);
                    this.f36109a.put(method, yVarB);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return yVarB;
    }

    public C7.A baseUrl() {
        return this.f36111c;
    }

    public c callAdapter(Type type, Annotation[] annotationArr) {
        return nextCallAdapter(null, type, annotationArr);
    }

    public List<c.a> callAdapterFactories() {
        return this.f36113e;
    }

    public InterfaceC0472f.a callFactory() {
        return this.f36110b;
    }

    public Executor callbackExecutor() {
        return this.f36114f;
    }

    public List<f.a> converterFactories() {
        return this.f36112d;
    }

    public <T> T create(Class<T> cls) throws SecurityException {
        B.v(cls);
        if (this.f36115g) {
            a(cls);
        }
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(cls));
    }

    public b newBuilder() {
        return new b(this);
    }

    public c nextCallAdapter(c.a aVar, Type type, Annotation[] annotationArr) {
        B.b(type, "returnType == null");
        B.b(annotationArr, "annotations == null");
        int iIndexOf = this.f36113e.indexOf(aVar) + 1;
        int size = this.f36113e.size();
        for (int i8 = iIndexOf; i8 < size; i8++) {
            c cVar = ((c.a) this.f36113e.get(i8)).get(type, annotationArr, this);
            if (cVar != null) {
                return cVar;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i9 = 0; i9 < iIndexOf; i9++) {
                sb.append("\n   * ");
                sb.append(((c.a) this.f36113e.get(i9)).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.f36113e.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(((c.a) this.f36113e.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public <T> f nextRequestBodyConverter(f.a aVar, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        B.b(type, "type == null");
        B.b(annotationArr, "parameterAnnotations == null");
        B.b(annotationArr2, "methodAnnotations == null");
        int iIndexOf = this.f36112d.indexOf(aVar) + 1;
        int size = this.f36112d.size();
        for (int i8 = iIndexOf; i8 < size; i8++) {
            f fVarRequestBodyConverter = ((f.a) this.f36112d.get(i8)).requestBodyConverter(type, annotationArr, annotationArr2, this);
            if (fVarRequestBodyConverter != null) {
                return fVarRequestBodyConverter;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i9 = 0; i9 < iIndexOf; i9++) {
                sb.append("\n   * ");
                sb.append(((f.a) this.f36112d.get(i9)).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.f36112d.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(((f.a) this.f36112d.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public <T> f nextResponseBodyConverter(f.a aVar, Type type, Annotation[] annotationArr) {
        B.b(type, "type == null");
        B.b(annotationArr, "annotations == null");
        int iIndexOf = this.f36112d.indexOf(aVar) + 1;
        int size = this.f36112d.size();
        for (int i8 = iIndexOf; i8 < size; i8++) {
            f fVarResponseBodyConverter = ((f.a) this.f36112d.get(i8)).responseBodyConverter(type, annotationArr, this);
            if (fVarResponseBodyConverter != null) {
                return fVarResponseBodyConverter;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i9 = 0; i9 < iIndexOf; i9++) {
                sb.append("\n   * ");
                sb.append(((f.a) this.f36112d.get(i9)).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.f36112d.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(((f.a) this.f36112d.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public <T> f requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return nextRequestBodyConverter(null, type, annotationArr, annotationArr2);
    }

    public <T> f responseBodyConverter(Type type, Annotation[] annotationArr) {
        return nextResponseBodyConverter(null, type, annotationArr);
    }

    public <T> f stringConverter(Type type, Annotation[] annotationArr) {
        B.b(type, "type == null");
        B.b(annotationArr, "annotations == null");
        int size = this.f36112d.size();
        for (int i8 = 0; i8 < size; i8++) {
            f fVarStringConverter = ((f.a) this.f36112d.get(i8)).stringConverter(type, annotationArr, this);
            if (fVarStringConverter != null) {
                return fVarStringConverter;
            }
        }
        return C6200a.d.f35943a;
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final o f36120a;

        /* renamed from: b, reason: collision with root package name */
        private InterfaceC0472f.a f36121b;

        /* renamed from: c, reason: collision with root package name */
        private C7.A f36122c;

        /* renamed from: d, reason: collision with root package name */
        private final List f36123d;

        /* renamed from: e, reason: collision with root package name */
        private final List f36124e;

        /* renamed from: f, reason: collision with root package name */
        private Executor f36125f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f36126g;

        b(o oVar) {
            this.f36123d = new ArrayList();
            this.f36124e = new ArrayList();
            this.f36120a = oVar;
        }

        public b addCallAdapterFactory(c.a aVar) {
            this.f36124e.add(B.b(aVar, "factory == null"));
            return this;
        }

        public b addConverterFactory(f.a aVar) {
            this.f36123d.add(B.b(aVar, "factory == null"));
            return this;
        }

        public b baseUrl(URL url) {
            B.b(url, "baseUrl == null");
            return baseUrl(C7.A.get(url.toString()));
        }

        public x build() {
            if (this.f36122c == null) {
                throw new IllegalStateException("Base URL required.");
            }
            InterfaceC0472f.a e8 = this.f36121b;
            if (e8 == null) {
                e8 = new E();
            }
            InterfaceC0472f.a aVar = e8;
            Executor executorDefaultCallbackExecutor = this.f36125f;
            if (executorDefaultCallbackExecutor == null) {
                executorDefaultCallbackExecutor = this.f36120a.defaultCallbackExecutor();
            }
            Executor executor = executorDefaultCallbackExecutor;
            ArrayList arrayList = new ArrayList(this.f36124e);
            arrayList.addAll(this.f36120a.a(executor));
            ArrayList arrayList2 = new ArrayList(this.f36123d.size() + 1 + this.f36120a.d());
            arrayList2.add(new C6200a());
            arrayList2.addAll(this.f36123d);
            arrayList2.addAll(this.f36120a.c());
            return new x(aVar, this.f36122c, Collections.unmodifiableList(arrayList2), Collections.unmodifiableList(arrayList), executor, this.f36126g);
        }

        public List<c.a> callAdapterFactories() {
            return this.f36124e;
        }

        public b callFactory(InterfaceC0472f.a aVar) {
            this.f36121b = (InterfaceC0472f.a) B.b(aVar, "factory == null");
            return this;
        }

        public b callbackExecutor(Executor executor) {
            this.f36125f = (Executor) B.b(executor, "executor == null");
            return this;
        }

        public b client(E e8) {
            return callFactory((InterfaceC0472f.a) B.b(e8, "client == null"));
        }

        public List<f.a> converterFactories() {
            return this.f36123d;
        }

        public b validateEagerly(boolean z8) {
            this.f36126g = z8;
            return this;
        }

        public b baseUrl(String str) {
            B.b(str, "baseUrl == null");
            return baseUrl(C7.A.get(str));
        }

        public b() {
            this(o.f());
        }

        public b baseUrl(C7.A a9) {
            B.b(a9, "baseUrl == null");
            if ("".equals(a9.pathSegments().get(r0.size() - 1))) {
                this.f36122c = a9;
                return this;
            }
            throw new IllegalArgumentException("baseUrl must end in /: " + a9);
        }

        b(x xVar) {
            this.f36123d = new ArrayList();
            this.f36124e = new ArrayList();
            o oVarF = o.f();
            this.f36120a = oVarF;
            this.f36121b = xVar.f36110b;
            this.f36122c = xVar.f36111c;
            int size = xVar.f36112d.size() - oVarF.d();
            for (int i8 = 1; i8 < size; i8++) {
                this.f36123d.add(xVar.f36112d.get(i8));
            }
            int size2 = xVar.f36113e.size() - this.f36120a.b();
            for (int i9 = 0; i9 < size2; i9++) {
                this.f36124e.add(xVar.f36113e.get(i9));
            }
            this.f36125f = xVar.f36114f;
            this.f36126g = xVar.f36115g;
        }
    }
}
