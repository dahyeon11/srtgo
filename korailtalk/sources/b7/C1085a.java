package b7;

import S6.AbstractC0765i;
import a7.C0840a;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: b7.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1085a extends C0840a {

    /* renamed from: b7.a$a, reason: collision with other inner class name */
    private static final class C0188a {
        public static final C0188a INSTANCE = new C0188a();
        public static final Integer sdkVersion;

        static {
            Object obj;
            Integer num = null;
            try {
                obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Throwable unused) {
            }
            Integer num2 = obj instanceof Integer ? (Integer) obj : null;
            if (num2 != null && num2.intValue() > 0) {
                num = num2;
            }
            sdkVersion = num;
        }

        private C0188a() {
        }
    }

    private final boolean a(int i8) {
        Integer num = C0188a.sdkVersion;
        return num == null || num.intValue() >= i8;
    }

    @Override // a7.C0840a
    public void addSuppressed(Throwable cause, Throwable exception) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(cause, "cause");
        Intrinsics.checkNotNullParameter(exception, "exception");
        if (a(19)) {
            cause.addSuppressed(exception);
        } else {
            super.addSuppressed(cause, exception);
        }
    }

    @Override // a7.C0840a
    public List<Throwable> getSuppressed(Throwable exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        if (!a(19)) {
            return super.getSuppressed(exception);
        }
        Throwable[] suppressed = exception.getSuppressed();
        Intrinsics.checkNotNullExpressionValue(suppressed, "getSuppressed(...)");
        return AbstractC0765i.asList(suppressed);
    }
}
