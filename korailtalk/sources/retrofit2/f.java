package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* loaded from: classes3.dex */
public interface f {

    public static abstract class a {
        protected static Type getParameterUpperBound(int i8, ParameterizedType parameterizedType) {
            return B.h(i8, parameterizedType);
        }

        protected static Class<?> getRawType(Type type) {
            return B.i(type);
        }

        public f requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, x xVar) {
            return null;
        }

        public f responseBodyConverter(Type type, Annotation[] annotationArr, x xVar) {
            return null;
        }

        public f stringConverter(Type type, Annotation[] annotationArr, x xVar) {
            return null;
        }
    }

    Object convert(Object obj);
}
