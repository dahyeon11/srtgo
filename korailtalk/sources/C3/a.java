package C3;

import Q7.C;
import com.google.gson.internal.b;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final Class f416a;

    /* renamed from: b, reason: collision with root package name */
    private final Type f417b;

    /* renamed from: c, reason: collision with root package name */
    private final int f418c;

    private a(Type type) {
        Objects.requireNonNull(type);
        Type typeCanonicalize = b.canonicalize(type);
        this.f417b = typeCanonicalize;
        this.f416a = b.getRawType(typeCanonicalize);
        this.f418c = typeCanonicalize.hashCode();
    }

    private static AssertionError a(Type type, Class... clsArr) {
        StringBuilder sb = new StringBuilder("Unexpected type. Expected one of: ");
        for (Class cls : clsArr) {
            sb.append(cls.getName());
            sb.append(", ");
        }
        sb.append("but got: ");
        sb.append(type.getClass().getName());
        sb.append(", for type token: ");
        sb.append(type.toString());
        sb.append(C.PACKAGE_SEPARATOR_CHAR);
        return new AssertionError(sb.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r1v9 */
    private static boolean b(Type type, GenericArrayType genericArrayType) {
        Type genericComponentType = genericArrayType.getGenericComponentType();
        if (!(genericComponentType instanceof ParameterizedType)) {
            return true;
        }
        if (type instanceof GenericArrayType) {
            type = ((GenericArrayType) type).getGenericComponentType();
        } else if (type instanceof Class) {
            type = (Class) type;
            while (type.isArray()) {
                type = type.getComponentType();
            }
        }
        return c(type, (ParameterizedType) genericComponentType, new HashMap());
    }

    private static boolean c(Type type, ParameterizedType parameterizedType, Map map) {
        if (type == null) {
            return false;
        }
        if (parameterizedType.equals(type)) {
            return true;
        }
        Class<?> rawType = b.getRawType(type);
        ParameterizedType parameterizedType2 = type instanceof ParameterizedType ? (ParameterizedType) type : null;
        if (parameterizedType2 != null) {
            Type[] actualTypeArguments = parameterizedType2.getActualTypeArguments();
            TypeVariable<Class<?>>[] typeParameters = rawType.getTypeParameters();
            for (int i8 = 0; i8 < actualTypeArguments.length; i8++) {
                Type type2 = actualTypeArguments[i8];
                TypeVariable<Class<?>> typeVariable = typeParameters[i8];
                while (type2 instanceof TypeVariable) {
                    type2 = (Type) map.get(((TypeVariable) type2).getName());
                }
                map.put(typeVariable.getName(), type2);
            }
            if (e(parameterizedType2, parameterizedType, map)) {
                return true;
            }
        }
        for (Type type3 : rawType.getGenericInterfaces()) {
            if (c(type3, parameterizedType, new HashMap(map))) {
                return true;
            }
        }
        return c(rawType.getGenericSuperclass(), parameterizedType, new HashMap(map));
    }

    private static boolean d(Type type, Type type2, Map map) {
        return type2.equals(type) || ((type instanceof TypeVariable) && type2.equals(map.get(((TypeVariable) type).getName())));
    }

    private static boolean e(ParameterizedType parameterizedType, ParameterizedType parameterizedType2, Map map) {
        if (!parameterizedType.getRawType().equals(parameterizedType2.getRawType())) {
            return false;
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        Type[] actualTypeArguments2 = parameterizedType2.getActualTypeArguments();
        for (int i8 = 0; i8 < actualTypeArguments.length; i8++) {
            if (!d(actualTypeArguments[i8], actualTypeArguments2[i8], map)) {
                return false;
            }
        }
        return true;
    }

    public static a get(Type type) {
        return new a(type);
    }

    public static a getArray(Type type) {
        return new a(b.arrayOf(type));
    }

    public static a getParameterized(Type type, Type... typeArr) {
        Objects.requireNonNull(type);
        Objects.requireNonNull(typeArr);
        if (!(type instanceof Class)) {
            throw new IllegalArgumentException("rawType must be of type Class, but was " + type);
        }
        Class cls = (Class) type;
        TypeVariable[] typeParameters = cls.getTypeParameters();
        int length = typeParameters.length;
        int length2 = typeArr.length;
        if (length2 != length) {
            throw new IllegalArgumentException(cls.getName() + " requires " + length + " type arguments, but got " + length2);
        }
        for (int i8 = 0; i8 < length; i8++) {
            Type type2 = typeArr[i8];
            Class<?> rawType = b.getRawType(type2);
            TypeVariable typeVariable = typeParameters[i8];
            for (Type type3 : typeVariable.getBounds()) {
                if (!b.getRawType(type3).isAssignableFrom(rawType)) {
                    throw new IllegalArgumentException("Type argument " + type2 + " does not satisfy bounds for type variable " + typeVariable + " declared by " + type);
                }
            }
        }
        return new a(b.newParameterizedTypeWithOwner(null, type, typeArr));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && b.equals(this.f417b, ((a) obj).f417b);
    }

    public final Class<Object> getRawType() {
        return this.f416a;
    }

    public final Type getType() {
        return this.f417b;
    }

    public final int hashCode() {
        return this.f418c;
    }

    @Deprecated
    public boolean isAssignableFrom(Class<?> cls) {
        return isAssignableFrom((Type) cls);
    }

    public final String toString() {
        return b.typeToString(this.f417b);
    }

    public static <T> a get(Class<T> cls) {
        return new a(cls);
    }

    @Deprecated
    public boolean isAssignableFrom(Type type) {
        if (type == null) {
            return false;
        }
        if (this.f417b.equals(type)) {
            return true;
        }
        Type type2 = this.f417b;
        if (type2 instanceof Class) {
            return this.f416a.isAssignableFrom(b.getRawType(type));
        }
        if (type2 instanceof ParameterizedType) {
            return c(type, (ParameterizedType) type2, new HashMap());
        }
        if (type2 instanceof GenericArrayType) {
            return this.f416a.isAssignableFrom(b.getRawType(type)) && b(type, (GenericArrayType) this.f417b);
        }
        throw a(type2, Class.class, ParameterizedType.class, GenericArrayType.class);
    }

    @Deprecated
    public boolean isAssignableFrom(a aVar) {
        return isAssignableFrom(aVar.getType());
    }
}
