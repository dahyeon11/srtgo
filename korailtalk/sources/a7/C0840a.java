package a7;

import S6.AbstractC0765i;
import S6.r;
import h7.f;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.regex.MatchResult;
import kotlin.jvm.internal.Intrinsics;
import l7.i;

/* renamed from: a7.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0840a {

    /* renamed from: a7.a$a, reason: collision with other inner class name */
    private static final class C0097a {
        public static final C0097a INSTANCE = new C0097a();
        public static final Method addSuppressed;
        public static final Method getSuppressed;

        static {
            Method method;
            Method method2;
            Method[] methods = Throwable.class.getMethods();
            Intrinsics.checkNotNull(methods);
            int length = methods.length;
            int i8 = 0;
            int i9 = 0;
            while (true) {
                method = null;
                if (i9 >= length) {
                    method2 = null;
                    break;
                }
                method2 = methods[i9];
                if (Intrinsics.areEqual(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    Intrinsics.checkNotNullExpressionValue(parameterTypes, "getParameterTypes(...)");
                    if (Intrinsics.areEqual(AbstractC0765i.singleOrNull(parameterTypes), Throwable.class)) {
                        break;
                    }
                }
                i9++;
            }
            addSuppressed = method2;
            int length2 = methods.length;
            while (true) {
                if (i8 >= length2) {
                    break;
                }
                Method method3 = methods[i8];
                if (Intrinsics.areEqual(method3.getName(), "getSuppressed")) {
                    method = method3;
                    break;
                }
                i8++;
            }
            getSuppressed = method;
        }

        private C0097a() {
        }
    }

    public void addSuppressed(Throwable cause, Throwable exception) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(cause, "cause");
        Intrinsics.checkNotNullParameter(exception, "exception");
        Method method = C0097a.addSuppressed;
        if (method != null) {
            method.invoke(cause, exception);
        }
    }

    public f defaultPlatformRandom() {
        return new h7.b();
    }

    public i getMatchResultNamedGroup(MatchResult matchResult, String name) {
        Intrinsics.checkNotNullParameter(matchResult, "matchResult");
        Intrinsics.checkNotNullParameter(name, "name");
        throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
    }

    public List<Throwable> getSuppressed(Throwable exception) {
        Object objInvoke;
        List<Throwable> listAsList;
        Intrinsics.checkNotNullParameter(exception, "exception");
        Method method = C0097a.getSuppressed;
        return (method == null || (objInvoke = method.invoke(exception, null)) == null || (listAsList = AbstractC0765i.asList((Throwable[]) objInvoke)) == null) ? r.emptyList() : listAsList;
    }
}
