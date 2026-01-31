package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* loaded from: classes3.dex */
public interface c {

    public static abstract class a {
        protected static Type a(int i8, ParameterizedType parameterizedType) {
            return B.h(i8, parameterizedType);
        }

        protected static Class b(Type type) {
            return B.i(type);
        }

        public abstract c get(Type type, Annotation[] annotationArr, x xVar);
    }

    Object adapt(InterfaceC6201b<Object> interfaceC6201b);

    Type responseType();
}
