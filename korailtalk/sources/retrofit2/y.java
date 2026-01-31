package retrofit2;

import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* loaded from: classes3.dex */
abstract class y {
    y() {
    }

    static y b(x xVar, Method method) {
        v vVarB = v.b(xVar, method);
        Type genericReturnType = method.getGenericReturnType();
        if (B.k(genericReturnType)) {
            throw B.n(method, "Method return type must not include a type variable or wildcard: %s", genericReturnType);
        }
        if (genericReturnType != Void.TYPE) {
            return i.f(xVar, method, vVarB);
        }
        throw B.n(method, "Service methods cannot return void.", new Object[0]);
    }

    abstract Object a(Object[] objArr);
}
