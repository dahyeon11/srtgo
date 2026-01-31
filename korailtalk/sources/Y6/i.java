package Y6;

import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class i {
    public static final i INSTANCE = new i();

    /* renamed from: a, reason: collision with root package name */
    private static final a f5655a = new a(null, null, null);

    /* renamed from: b, reason: collision with root package name */
    private static a f5656b;

    private static final class a {
        public final Method getDescriptorMethod;
        public final Method getModuleMethod;
        public final Method nameMethod;

        public a(Method method, Method method2, Method method3) {
            this.getModuleMethod = method;
            this.getDescriptorMethod = method2;
            this.nameMethod = method3;
        }
    }

    private i() {
    }

    private final a a(Y6.a aVar) {
        try {
            a aVar2 = new a(Class.class.getDeclaredMethod("getModule", null), aVar.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), aVar.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
            f5656b = aVar2;
            return aVar2;
        } catch (Exception unused) {
            a aVar3 = f5655a;
            f5656b = aVar3;
            return aVar3;
        }
    }

    public final String getModuleName(Y6.a continuation) {
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        a aVarA = f5656b;
        if (aVarA == null) {
            aVarA = a(continuation);
        }
        if (aVarA == f5655a) {
            return null;
        }
        Method method = aVarA.getModuleMethod;
        Object objInvoke = method != null ? method.invoke(continuation.getClass(), null) : null;
        if (objInvoke == null) {
            return null;
        }
        Method method2 = aVarA.getDescriptorMethod;
        Object objInvoke2 = method2 != null ? method2.invoke(objInvoke, null) : null;
        if (objInvoke2 == null) {
            return null;
        }
        Method method3 = aVarA.nameMethod;
        Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
        if (objInvoke3 instanceof String) {
            return (String) objInvoke3;
        }
        return null;
    }
}
