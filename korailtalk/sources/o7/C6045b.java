package o7;

import android.os.Build;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import n7.J;

/* renamed from: o7.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6045b extends W6.a implements J {
    private volatile Object _preHandler;

    public C6045b() {
        super(J.Key);
        this._preHandler = this;
    }

    private final Method b() {
        Object obj = this._preHandler;
        if (obj != this) {
            return (Method) obj;
        }
        Method method = null;
        try {
            Method declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", null);
            if (Modifier.isPublic(declaredMethod.getModifiers())) {
                if (Modifier.isStatic(declaredMethod.getModifiers())) {
                    method = declaredMethod;
                }
            }
        } catch (Throwable unused) {
        }
        this._preHandler = method;
        return method;
    }

    @Override // n7.J
    public void handleException(W6.g gVar, Throwable th) {
        int i8 = Build.VERSION.SDK_INT;
        if (26 > i8 || i8 >= 28) {
            return;
        }
        Method methodB = b();
        Object objInvoke = methodB != null ? methodB.invoke(null, null) : null;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = objInvoke instanceof Thread.UncaughtExceptionHandler ? (Thread.UncaughtExceptionHandler) objInvoke : null;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        }
    }
}
