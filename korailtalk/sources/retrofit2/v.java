package retrofit2;

import C7.C;
import C7.D;
import C7.H;
import C7.z;
import io.grpc.internal.U;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import retrofit2.n;

/* loaded from: classes3.dex */
final class v {

    /* renamed from: a */
    private final Method f36070a;

    /* renamed from: b */
    private final C7.A f36071b;

    /* renamed from: c */
    final String f36072c;

    /* renamed from: d */
    private final String f36073d;

    /* renamed from: e */
    private final C7.z f36074e;

    /* renamed from: f */
    private final C f36075f;

    /* renamed from: g */
    private final boolean f36076g;

    /* renamed from: h */
    private final boolean f36077h;

    /* renamed from: i */
    private final boolean f36078i;

    /* renamed from: j */
    private final n[] f36079j;

    /* renamed from: k */
    final boolean f36080k;

    static final class a {

        /* renamed from: x */
        private static final Pattern f36081x = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

        /* renamed from: y */
        private static final Pattern f36082y = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

        /* renamed from: a */
        final x f36083a;

        /* renamed from: b */
        final Method f36084b;

        /* renamed from: c */
        final Annotation[] f36085c;

        /* renamed from: d */
        final Annotation[][] f36086d;

        /* renamed from: e */
        final Type[] f36087e;

        /* renamed from: f */
        boolean f36088f;

        /* renamed from: g */
        boolean f36089g;

        /* renamed from: h */
        boolean f36090h;

        /* renamed from: i */
        boolean f36091i;

        /* renamed from: j */
        boolean f36092j;

        /* renamed from: k */
        boolean f36093k;

        /* renamed from: l */
        boolean f36094l;

        /* renamed from: m */
        boolean f36095m;

        /* renamed from: n */
        String f36096n;

        /* renamed from: o */
        boolean f36097o;

        /* renamed from: p */
        boolean f36098p;

        /* renamed from: q */
        boolean f36099q;

        /* renamed from: r */
        String f36100r;

        /* renamed from: s */
        C7.z f36101s;

        /* renamed from: t */
        C f36102t;

        /* renamed from: u */
        Set f36103u;

        /* renamed from: v */
        n[] f36104v;

        /* renamed from: w */
        boolean f36105w;

        a(x xVar, Method method) {
            this.f36083a = xVar;
            this.f36084b = method;
            this.f36085c = method.getAnnotations();
            this.f36087e = method.getGenericParameterTypes();
            this.f36086d = method.getParameterAnnotations();
        }

        private static Class a(Class cls) {
            return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
        }

        private C7.z c(String[] strArr) {
            z.a aVar = new z.a();
            for (String str : strArr) {
                int iIndexOf = str.indexOf(58);
                if (iIndexOf == -1 || iIndexOf == 0 || iIndexOf == str.length() - 1) {
                    throw B.n(this.f36084b, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String strSubstring = str.substring(0, iIndexOf);
                String strTrim = str.substring(iIndexOf + 1).trim();
                if ("Content-Type".equalsIgnoreCase(strSubstring)) {
                    try {
                        this.f36102t = C.get(strTrim);
                    } catch (IllegalArgumentException e8) {
                        throw B.o(this.f36084b, e8, "Malformed content type: %s", strTrim);
                    }
                } else {
                    aVar.add(strSubstring, strTrim);
                }
            }
            return aVar.build();
        }

        private void d(String str, String str2, boolean z8) {
            String str3 = this.f36096n;
            if (str3 != null) {
                throw B.n(this.f36084b, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
            }
            this.f36096n = str;
            this.f36097o = z8;
            if (str2.isEmpty()) {
                return;
            }
            int iIndexOf = str2.indexOf(63);
            if (iIndexOf != -1 && iIndexOf < str2.length() - 1) {
                String strSubstring = str2.substring(iIndexOf + 1);
                if (f36081x.matcher(strSubstring).find()) {
                    throw B.n(this.f36084b, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", strSubstring);
                }
            }
            this.f36100r = str2;
            this.f36103u = h(str2);
        }

        private void e(Annotation annotation) {
            if (annotation instanceof d8.b) {
                d("DELETE", ((d8.b) annotation).value(), false);
                return;
            }
            if (annotation instanceof d8.f) {
                d("GET", ((d8.f) annotation).value(), false);
                return;
            }
            if (annotation instanceof d8.g) {
                d("HEAD", ((d8.g) annotation).value(), false);
                return;
            }
            if (annotation instanceof d8.n) {
                d("PATCH", ((d8.n) annotation).value(), true);
                return;
            }
            if (annotation instanceof d8.o) {
                d(U.HTTP_METHOD, ((d8.o) annotation).value(), true);
                return;
            }
            if (annotation instanceof d8.p) {
                d("PUT", ((d8.p) annotation).value(), true);
                return;
            }
            if (annotation instanceof d8.m) {
                d("OPTIONS", ((d8.m) annotation).value(), false);
                return;
            }
            if (annotation instanceof d8.h) {
                d8.h hVar = (d8.h) annotation;
                d(hVar.method(), hVar.path(), hVar.hasBody());
                return;
            }
            if (annotation instanceof d8.k) {
                String[] strArrValue = ((d8.k) annotation).value();
                if (strArrValue.length == 0) {
                    throw B.n(this.f36084b, "@Headers annotation is empty.", new Object[0]);
                }
                this.f36101s = c(strArrValue);
                return;
            }
            if (annotation instanceof d8.l) {
                if (this.f36098p) {
                    throw B.n(this.f36084b, "Only one encoding annotation is allowed.", new Object[0]);
                }
                this.f36099q = true;
            } else if (annotation instanceof d8.e) {
                if (this.f36099q) {
                    throw B.n(this.f36084b, "Only one encoding annotation is allowed.", new Object[0]);
                }
                this.f36098p = true;
            }
        }

        private n f(int i8, Type type, Annotation[] annotationArr, boolean z8) {
            n nVar;
            if (annotationArr != null) {
                nVar = null;
                for (Annotation annotation : annotationArr) {
                    n nVarG = g(i8, type, annotationArr, annotation);
                    if (nVarG != null) {
                        if (nVar != null) {
                            throw B.p(this.f36084b, i8, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                        }
                        nVar = nVarG;
                    }
                }
            } else {
                nVar = null;
            }
            if (nVar != null) {
                return nVar;
            }
            if (z8) {
                try {
                    if (B.i(type) == W6.d.class) {
                        this.f36105w = true;
                        return null;
                    }
                } catch (NoClassDefFoundError unused) {
                }
            }
            throw B.p(this.f36084b, i8, "No Retrofit annotation found.", new Object[0]);
        }

        private n g(int i8, Type type, Annotation[] annotationArr, Annotation annotation) {
            if (annotation instanceof d8.y) {
                j(i8, type);
                if (this.f36095m) {
                    throw B.p(this.f36084b, i8, "Multiple @Url method annotations found.", new Object[0]);
                }
                if (this.f36091i) {
                    throw B.p(this.f36084b, i8, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.f36092j) {
                    throw B.p(this.f36084b, i8, "A @Url parameter must not come after a @Query.", new Object[0]);
                }
                if (this.f36093k) {
                    throw B.p(this.f36084b, i8, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.f36094l) {
                    throw B.p(this.f36084b, i8, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.f36100r != null) {
                    throw B.p(this.f36084b, i8, "@Url cannot be used with @%s URL", this.f36096n);
                }
                this.f36095m = true;
                if (type == C7.A.class || type == String.class || type == URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                    return new n.p(this.f36084b, i8);
                }
                throw B.p(this.f36084b, i8, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
            }
            if (annotation instanceof d8.s) {
                j(i8, type);
                if (this.f36092j) {
                    throw B.p(this.f36084b, i8, "A @Path parameter must not come after a @Query.", new Object[0]);
                }
                if (this.f36093k) {
                    throw B.p(this.f36084b, i8, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.f36094l) {
                    throw B.p(this.f36084b, i8, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.f36095m) {
                    throw B.p(this.f36084b, i8, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.f36100r == null) {
                    throw B.p(this.f36084b, i8, "@Path can only be used with relative url on @%s", this.f36096n);
                }
                this.f36091i = true;
                d8.s sVar = (d8.s) annotation;
                String strValue = sVar.value();
                i(i8, strValue);
                return new n.k(this.f36084b, i8, strValue, this.f36083a.stringConverter(type, annotationArr), sVar.encoded());
            }
            if (annotation instanceof d8.t) {
                j(i8, type);
                d8.t tVar = (d8.t) annotation;
                String strValue2 = tVar.value();
                boolean zEncoded = tVar.encoded();
                Class clsI = B.i(type);
                this.f36092j = true;
                if (!Iterable.class.isAssignableFrom(clsI)) {
                    if (!clsI.isArray()) {
                        return new n.l(strValue2, this.f36083a.stringConverter(type, annotationArr), zEncoded);
                    }
                    return new n.l(strValue2, this.f36083a.stringConverter(a(clsI.getComponentType()), annotationArr), zEncoded).b();
                }
                if (type instanceof ParameterizedType) {
                    return new n.l(strValue2, this.f36083a.stringConverter(B.h(0, (ParameterizedType) type), annotationArr), zEncoded).c();
                }
                throw B.p(this.f36084b, i8, clsI.getSimpleName() + " must include generic type (e.g., " + clsI.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof d8.v) {
                j(i8, type);
                boolean zEncoded2 = ((d8.v) annotation).encoded();
                Class clsI2 = B.i(type);
                this.f36093k = true;
                if (!Iterable.class.isAssignableFrom(clsI2)) {
                    if (!clsI2.isArray()) {
                        return new n.C0415n(this.f36083a.stringConverter(type, annotationArr), zEncoded2);
                    }
                    return new n.C0415n(this.f36083a.stringConverter(a(clsI2.getComponentType()), annotationArr), zEncoded2).b();
                }
                if (type instanceof ParameterizedType) {
                    return new n.C0415n(this.f36083a.stringConverter(B.h(0, (ParameterizedType) type), annotationArr), zEncoded2).c();
                }
                throw B.p(this.f36084b, i8, clsI2.getSimpleName() + " must include generic type (e.g., " + clsI2.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof d8.u) {
                j(i8, type);
                Class clsI3 = B.i(type);
                this.f36094l = true;
                if (!Map.class.isAssignableFrom(clsI3)) {
                    throw B.p(this.f36084b, i8, "@QueryMap parameter type must be Map.", new Object[0]);
                }
                Type typeJ = B.j(type, clsI3, Map.class);
                if (!(typeJ instanceof ParameterizedType)) {
                    throw B.p(this.f36084b, i8, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType = (ParameterizedType) typeJ;
                Type typeH = B.h(0, parameterizedType);
                if (String.class == typeH) {
                    return new n.m(this.f36084b, i8, this.f36083a.stringConverter(B.h(1, parameterizedType), annotationArr), ((d8.u) annotation).encoded());
                }
                throw B.p(this.f36084b, i8, "@QueryMap keys must be of type String: " + typeH, new Object[0]);
            }
            if (annotation instanceof d8.i) {
                j(i8, type);
                String strValue3 = ((d8.i) annotation).value();
                Class clsI4 = B.i(type);
                if (!Iterable.class.isAssignableFrom(clsI4)) {
                    if (!clsI4.isArray()) {
                        return new n.f(strValue3, this.f36083a.stringConverter(type, annotationArr));
                    }
                    return new n.f(strValue3, this.f36083a.stringConverter(a(clsI4.getComponentType()), annotationArr)).b();
                }
                if (type instanceof ParameterizedType) {
                    return new n.f(strValue3, this.f36083a.stringConverter(B.h(0, (ParameterizedType) type), annotationArr)).c();
                }
                throw B.p(this.f36084b, i8, clsI4.getSimpleName() + " must include generic type (e.g., " + clsI4.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof d8.j) {
                if (type == C7.z.class) {
                    return new n.h(this.f36084b, i8);
                }
                j(i8, type);
                Class clsI5 = B.i(type);
                if (!Map.class.isAssignableFrom(clsI5)) {
                    throw B.p(this.f36084b, i8, "@HeaderMap parameter type must be Map.", new Object[0]);
                }
                Type typeJ2 = B.j(type, clsI5, Map.class);
                if (!(typeJ2 instanceof ParameterizedType)) {
                    throw B.p(this.f36084b, i8, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType2 = (ParameterizedType) typeJ2;
                Type typeH2 = B.h(0, parameterizedType2);
                if (String.class == typeH2) {
                    return new n.g(this.f36084b, i8, this.f36083a.stringConverter(B.h(1, parameterizedType2), annotationArr));
                }
                throw B.p(this.f36084b, i8, "@HeaderMap keys must be of type String: " + typeH2, new Object[0]);
            }
            if (annotation instanceof d8.c) {
                j(i8, type);
                if (!this.f36098p) {
                    throw B.p(this.f36084b, i8, "@Field parameters can only be used with form encoding.", new Object[0]);
                }
                d8.c cVar = (d8.c) annotation;
                String strValue4 = cVar.value();
                boolean zEncoded3 = cVar.encoded();
                this.f36088f = true;
                Class clsI6 = B.i(type);
                if (!Iterable.class.isAssignableFrom(clsI6)) {
                    if (!clsI6.isArray()) {
                        return new n.d(strValue4, this.f36083a.stringConverter(type, annotationArr), zEncoded3);
                    }
                    return new n.d(strValue4, this.f36083a.stringConverter(a(clsI6.getComponentType()), annotationArr), zEncoded3).b();
                }
                if (type instanceof ParameterizedType) {
                    return new n.d(strValue4, this.f36083a.stringConverter(B.h(0, (ParameterizedType) type), annotationArr), zEncoded3).c();
                }
                throw B.p(this.f36084b, i8, clsI6.getSimpleName() + " must include generic type (e.g., " + clsI6.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof d8.d) {
                j(i8, type);
                if (!this.f36098p) {
                    throw B.p(this.f36084b, i8, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                }
                Class clsI7 = B.i(type);
                if (!Map.class.isAssignableFrom(clsI7)) {
                    throw B.p(this.f36084b, i8, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                Type typeJ3 = B.j(type, clsI7, Map.class);
                if (!(typeJ3 instanceof ParameterizedType)) {
                    throw B.p(this.f36084b, i8, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType3 = (ParameterizedType) typeJ3;
                Type typeH3 = B.h(0, parameterizedType3);
                if (String.class == typeH3) {
                    f fVarStringConverter = this.f36083a.stringConverter(B.h(1, parameterizedType3), annotationArr);
                    this.f36088f = true;
                    return new n.e(this.f36084b, i8, fVarStringConverter, ((d8.d) annotation).encoded());
                }
                throw B.p(this.f36084b, i8, "@FieldMap keys must be of type String: " + typeH3, new Object[0]);
            }
            if (!(annotation instanceof d8.q)) {
                if (annotation instanceof d8.r) {
                    j(i8, type);
                    if (!this.f36099q) {
                        throw B.p(this.f36084b, i8, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                    }
                    this.f36089g = true;
                    Class clsI8 = B.i(type);
                    if (!Map.class.isAssignableFrom(clsI8)) {
                        throw B.p(this.f36084b, i8, "@PartMap parameter type must be Map.", new Object[0]);
                    }
                    Type typeJ4 = B.j(type, clsI8, Map.class);
                    if (!(typeJ4 instanceof ParameterizedType)) {
                        throw B.p(this.f36084b, i8, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    ParameterizedType parameterizedType4 = (ParameterizedType) typeJ4;
                    Type typeH4 = B.h(0, parameterizedType4);
                    if (String.class == typeH4) {
                        Type typeH5 = B.h(1, parameterizedType4);
                        if (D.b.class.isAssignableFrom(B.i(typeH5))) {
                            throw B.p(this.f36084b, i8, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                        }
                        return new n.j(this.f36084b, i8, this.f36083a.requestBodyConverter(typeH5, annotationArr, this.f36085c), ((d8.r) annotation).encoding());
                    }
                    throw B.p(this.f36084b, i8, "@PartMap keys must be of type String: " + typeH4, new Object[0]);
                }
                if (annotation instanceof d8.a) {
                    j(i8, type);
                    if (this.f36098p || this.f36099q) {
                        throw B.p(this.f36084b, i8, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                    }
                    if (this.f36090h) {
                        throw B.p(this.f36084b, i8, "Multiple @Body method annotations found.", new Object[0]);
                    }
                    try {
                        f fVarRequestBodyConverter = this.f36083a.requestBodyConverter(type, annotationArr, this.f36085c);
                        this.f36090h = true;
                        return new n.c(this.f36084b, i8, fVarRequestBodyConverter);
                    } catch (RuntimeException e8) {
                        throw B.q(this.f36084b, e8, i8, "Unable to create @Body converter for %s", type);
                    }
                }
                if (!(annotation instanceof d8.x)) {
                    return null;
                }
                j(i8, type);
                Class clsI9 = B.i(type);
                for (int i9 = i8 - 1; i9 >= 0; i9--) {
                    n nVar = this.f36104v[i9];
                    if ((nVar instanceof n.q) && ((n.q) nVar).f36052a.equals(clsI9)) {
                        throw B.p(this.f36084b, i8, "@Tag type " + clsI9.getName() + " is duplicate of parameter #" + (i9 + 1) + " and would always overwrite its value.", new Object[0]);
                    }
                }
                return new n.q(clsI9);
            }
            j(i8, type);
            if (!this.f36099q) {
                throw B.p(this.f36084b, i8, "@Part parameters can only be used with multipart encoding.", new Object[0]);
            }
            d8.q qVar = (d8.q) annotation;
            this.f36089g = true;
            String strValue5 = qVar.value();
            Class clsI10 = B.i(type);
            if (strValue5.isEmpty()) {
                if (!Iterable.class.isAssignableFrom(clsI10)) {
                    if (clsI10.isArray()) {
                        if (D.b.class.isAssignableFrom(clsI10.getComponentType())) {
                            return n.o.f36049a.b();
                        }
                        throw B.p(this.f36084b, i8, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    }
                    if (D.b.class.isAssignableFrom(clsI10)) {
                        return n.o.f36049a;
                    }
                    throw B.p(this.f36084b, i8, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                }
                if (type instanceof ParameterizedType) {
                    if (D.b.class.isAssignableFrom(B.i(B.h(0, (ParameterizedType) type)))) {
                        return n.o.f36049a.c();
                    }
                    throw B.p(this.f36084b, i8, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                }
                throw B.p(this.f36084b, i8, clsI10.getSimpleName() + " must include generic type (e.g., " + clsI10.getSimpleName() + "<String>)", new Object[0]);
            }
            C7.z zVarOf = C7.z.of("Content-Disposition", "form-data; name=\"" + strValue5 + "\"", "Content-Transfer-Encoding", qVar.encoding());
            if (!Iterable.class.isAssignableFrom(clsI10)) {
                if (!clsI10.isArray()) {
                    if (D.b.class.isAssignableFrom(clsI10)) {
                        throw B.p(this.f36084b, i8, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                    }
                    return new n.i(this.f36084b, i8, zVarOf, this.f36083a.requestBodyConverter(type, annotationArr, this.f36085c));
                }
                Class clsA = a(clsI10.getComponentType());
                if (D.b.class.isAssignableFrom(clsA)) {
                    throw B.p(this.f36084b, i8, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                }
                return new n.i(this.f36084b, i8, zVarOf, this.f36083a.requestBodyConverter(clsA, annotationArr, this.f36085c)).b();
            }
            if (type instanceof ParameterizedType) {
                Type typeH6 = B.h(0, (ParameterizedType) type);
                if (D.b.class.isAssignableFrom(B.i(typeH6))) {
                    throw B.p(this.f36084b, i8, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                }
                return new n.i(this.f36084b, i8, zVarOf, this.f36083a.requestBodyConverter(typeH6, annotationArr, this.f36085c)).c();
            }
            throw B.p(this.f36084b, i8, clsI10.getSimpleName() + " must include generic type (e.g., " + clsI10.getSimpleName() + "<String>)", new Object[0]);
        }

        static Set h(String str) {
            Matcher matcher = f36081x.matcher(str);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            return linkedHashSet;
        }

        private void i(int i8, String str) {
            if (!f36082y.matcher(str).matches()) {
                throw B.p(this.f36084b, i8, "@Path parameter name must match %s. Found: %s", f36081x.pattern(), str);
            }
            if (!this.f36103u.contains(str)) {
                throw B.p(this.f36084b, i8, "URL \"%s\" does not contain \"{%s}\".", this.f36100r, str);
            }
        }

        private void j(int i8, Type type) {
            if (B.k(type)) {
                throw B.p(this.f36084b, i8, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }

        v b() {
            for (Annotation annotation : this.f36085c) {
                e(annotation);
            }
            if (this.f36096n == null) {
                throw B.n(this.f36084b, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
            }
            if (!this.f36097o) {
                if (this.f36099q) {
                    throw B.n(this.f36084b, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
                if (this.f36098p) {
                    throw B.n(this.f36084b, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
            }
            int length = this.f36086d.length;
            this.f36104v = new n[length];
            int i8 = length - 1;
            int i9 = 0;
            while (i9 < length) {
                this.f36104v[i9] = f(i9, this.f36087e[i9], this.f36086d[i9], i9 == i8);
                i9++;
            }
            if (this.f36100r == null && !this.f36095m) {
                throw B.n(this.f36084b, "Missing either @%s URL or @Url parameter.", this.f36096n);
            }
            boolean z8 = this.f36098p;
            if (!z8 && !this.f36099q && !this.f36097o && this.f36090h) {
                throw B.n(this.f36084b, "Non-body HTTP method cannot contain @Body.", new Object[0]);
            }
            if (z8 && !this.f36088f) {
                throw B.n(this.f36084b, "Form-encoded method must contain at least one @Field.", new Object[0]);
            }
            if (!this.f36099q || this.f36089g) {
                return new v(this);
            }
            throw B.n(this.f36084b, "Multipart method must contain at least one @Part.", new Object[0]);
        }
    }

    v(a aVar) {
        this.f36070a = aVar.f36084b;
        this.f36071b = aVar.f36083a.f36111c;
        this.f36072c = aVar.f36096n;
        this.f36073d = aVar.f36100r;
        this.f36074e = aVar.f36101s;
        this.f36075f = aVar.f36102t;
        this.f36076g = aVar.f36097o;
        this.f36077h = aVar.f36098p;
        this.f36078i = aVar.f36099q;
        this.f36079j = aVar.f36104v;
        this.f36080k = aVar.f36105w;
    }

    static v b(x xVar, Method method) {
        return new a(xVar, method).b();
    }

    H a(Object[] objArr) {
        n[] nVarArr = this.f36079j;
        int length = objArr.length;
        if (length != nVarArr.length) {
            throw new IllegalArgumentException("Argument count (" + length + ") doesn't match expected count (" + nVarArr.length + ")");
        }
        u uVar = new u(this.f36072c, this.f36071b, this.f36073d, this.f36074e, this.f36075f, this.f36076g, this.f36077h, this.f36078i);
        if (this.f36080k) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i8 = 0; i8 < length; i8++) {
            arrayList.add(objArr[i8]);
            nVarArr[i8].a(uVar, objArr[i8]);
        }
        return uVar.k().tag(j.class, new j(this.f36070a, arrayList)).build();
    }
}
