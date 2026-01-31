package retrofit2;

import C7.K;
import com.j256.ormlite.stmt.query.SimpleComparison;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
abstract class B {

    /* renamed from: a, reason: collision with root package name */
    static final Type[] f35932a = new Type[0];

    private static final class a implements GenericArrayType {

        /* renamed from: a, reason: collision with root package name */
        private final Type f35933a;

        a(Type type) {
            this.f35933a = type;
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && B.e(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.f35933a;
        }

        public int hashCode() {
            return this.f35933a.hashCode();
        }

        public String toString() {
            return B.u(this.f35933a) + "[]";
        }
    }

    static final class b implements ParameterizedType {

        /* renamed from: a, reason: collision with root package name */
        private final Type f35934a;

        /* renamed from: b, reason: collision with root package name */
        private final Type f35935b;

        /* renamed from: c, reason: collision with root package name */
        private final Type[] f35936c;

        b(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                if ((type == null) != (((Class) type2).getEnclosingClass() == null)) {
                    throw new IllegalArgumentException();
                }
            }
            for (Type type3 : typeArr) {
                B.b(type3, "typeArgument == null");
                B.c(type3);
            }
            this.f35934a = type;
            this.f35935b = type2;
            this.f35936c = (Type[]) typeArr.clone();
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && B.e(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.f35936c.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.f35934a;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.f35935b;
        }

        public int hashCode() {
            int iHashCode = Arrays.hashCode(this.f35936c) ^ this.f35935b.hashCode();
            Type type = this.f35934a;
            return iHashCode ^ (type != null ? type.hashCode() : 0);
        }

        public String toString() {
            Type[] typeArr = this.f35936c;
            if (typeArr.length == 0) {
                return B.u(this.f35935b);
            }
            StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
            sb.append(B.u(this.f35935b));
            sb.append(SimpleComparison.LESS_THAN_OPERATION);
            sb.append(B.u(this.f35936c[0]));
            for (int i8 = 1; i8 < this.f35936c.length; i8++) {
                sb.append(", ");
                sb.append(B.u(this.f35936c[i8]));
            }
            sb.append(SimpleComparison.GREATER_THAN_OPERATION);
            return sb.toString();
        }
    }

    private static final class c implements WildcardType {

        /* renamed from: a, reason: collision with root package name */
        private final Type f35937a;

        /* renamed from: b, reason: collision with root package name */
        private final Type f35938b;

        c(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr.length != 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr2.length != 1) {
                typeArr[0].getClass();
                B.c(typeArr[0]);
                this.f35938b = null;
                this.f35937a = typeArr[0];
                return;
            }
            typeArr2[0].getClass();
            B.c(typeArr2[0]);
            if (typeArr[0] != Object.class) {
                throw new IllegalArgumentException();
            }
            this.f35938b = typeArr2[0];
            this.f35937a = Object.class;
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && B.e(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.f35938b;
            return type != null ? new Type[]{type} : B.f35932a;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.f35937a};
        }

        public int hashCode() {
            Type type = this.f35938b;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f35937a.hashCode() + 31);
        }

        public String toString() {
            if (this.f35938b != null) {
                return "? super " + B.u(this.f35938b);
            }
            if (this.f35937a == Object.class) {
                return "?";
            }
            return "? extends " + B.u(this.f35937a);
        }
    }

    static K a(K k8) {
        P7.c cVar = new P7.c();
        k8.source().readAll(cVar);
        return K.create(k8.contentType(), k8.contentLength(), cVar);
    }

    static Object b(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    static void c(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    private static Class d(TypeVariable typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    static boolean e(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            return (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return e(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    static Type f(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i8 = 0; i8 < length; i8++) {
                Class<?> cls3 = interfaces[i8];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i8];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return f(cls.getGenericInterfaces()[i8], interfaces[i8], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return f(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    static Type g(int i8, ParameterizedType parameterizedType) {
        Type type = parameterizedType.getActualTypeArguments()[i8];
        return type instanceof WildcardType ? ((WildcardType) type).getLowerBounds()[0] : type;
    }

    static Type h(int i8, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i8 >= 0 && i8 < actualTypeArguments.length) {
            Type type = actualTypeArguments[i8];
            return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
        }
        throw new IllegalArgumentException("Index " + i8 + " not in range [0," + actualTypeArguments.length + ") for " + parameterizedType);
    }

    static Class i(Type type) {
        b(type, "type == null");
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            throw new IllegalArgumentException();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) i(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return i(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + type.getClass().getName());
    }

    static Type j(Type type, Class cls, Class cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return r(type, cls, f(type, cls, cls2));
        }
        throw new IllegalArgumentException();
    }

    static boolean k(Type type) {
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
                if (k(type2)) {
                    return true;
                }
            }
            return false;
        }
        if (type instanceof GenericArrayType) {
            return k(((GenericArrayType) type).getGenericComponentType());
        }
        if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
            return true;
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    private static int l(Object[] objArr, Object obj) {
        for (int i8 = 0; i8 < objArr.length; i8++) {
            if (obj.equals(objArr[i8])) {
                return i8;
            }
        }
        throw new NoSuchElementException();
    }

    static boolean m(Annotation[] annotationArr, Class cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    static RuntimeException n(Method method, String str, Object... objArr) {
        return o(method, null, str, objArr);
    }

    static RuntimeException o(Method method, Throwable th, String str, Object... objArr) {
        return new IllegalArgumentException(String.format(str, objArr) + "\n    for method " + method.getDeclaringClass().getSimpleName() + "." + method.getName(), th);
    }

    static RuntimeException p(Method method, int i8, String str, Object... objArr) {
        return n(method, str + " (parameter #" + (i8 + 1) + ")", objArr);
    }

    static RuntimeException q(Method method, Throwable th, int i8, String str, Object... objArr) {
        return o(method, th, str + " (parameter #" + (i8 + 1) + ")", objArr);
    }

    static Type r(Type type, Class cls, Type type2) {
        Type type3 = type2;
        while (type3 instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type3;
            Type typeS = s(type, cls, typeVariable);
            if (typeS == typeVariable) {
                return typeS;
            }
            type3 = typeS;
        }
        if (type3 instanceof Class) {
            Class cls2 = (Class) type3;
            if (cls2.isArray()) {
                Class<?> componentType = cls2.getComponentType();
                Type typeR = r(type, cls, componentType);
                return componentType == typeR ? cls2 : new a(typeR);
            }
        }
        if (type3 instanceof GenericArrayType) {
            GenericArrayType genericArrayType = (GenericArrayType) type3;
            Type genericComponentType = genericArrayType.getGenericComponentType();
            Type typeR2 = r(type, cls, genericComponentType);
            return genericComponentType == typeR2 ? genericArrayType : new a(typeR2);
        }
        if (type3 instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type3;
            Type ownerType = parameterizedType.getOwnerType();
            Type typeR3 = r(type, cls, ownerType);
            boolean z8 = typeR3 != ownerType;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            for (int i8 = 0; i8 < length; i8++) {
                Type typeR4 = r(type, cls, actualTypeArguments[i8]);
                if (typeR4 != actualTypeArguments[i8]) {
                    if (!z8) {
                        actualTypeArguments = (Type[]) actualTypeArguments.clone();
                        z8 = true;
                    }
                    actualTypeArguments[i8] = typeR4;
                }
            }
            return z8 ? new b(typeR3, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
        }
        boolean z9 = type3 instanceof WildcardType;
        Type type4 = type3;
        if (z9) {
            WildcardType wildcardType = (WildcardType) type3;
            Type[] lowerBounds = wildcardType.getLowerBounds();
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (lowerBounds.length == 1) {
                Type typeR5 = r(type, cls, lowerBounds[0]);
                type4 = wildcardType;
                if (typeR5 != lowerBounds[0]) {
                    return new c(new Type[]{Object.class}, new Type[]{typeR5});
                }
            } else {
                type4 = wildcardType;
                if (upperBounds.length == 1) {
                    Type typeR6 = r(type, cls, upperBounds[0]);
                    type4 = wildcardType;
                    if (typeR6 != upperBounds[0]) {
                        return new c(new Type[]{typeR6}, f35932a);
                    }
                }
            }
        }
        return type4;
    }

    private static Type s(Type type, Class cls, TypeVariable typeVariable) {
        Class clsD = d(typeVariable);
        if (clsD == null) {
            return typeVariable;
        }
        Type typeF = f(type, cls, clsD);
        if (!(typeF instanceof ParameterizedType)) {
            return typeVariable;
        }
        return ((ParameterizedType) typeF).getActualTypeArguments()[l(clsD.getTypeParameters(), typeVariable)];
    }

    static void t(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    static String u(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    static void v(Class cls) {
        if (!cls.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        }
        if (cls.getInterfaces().length > 0) {
            throw new IllegalArgumentException("API interfaces must not extend other interfaces.");
        }
    }
}
