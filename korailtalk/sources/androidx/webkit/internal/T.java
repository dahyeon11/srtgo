package androidx.webkit.internal;

import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.ScriptHandlerBoundaryInterface;

/* loaded from: classes.dex */
public class T implements G0.c {

    /* renamed from: a, reason: collision with root package name */
    private final ScriptHandlerBoundaryInterface f11047a;

    private T(ScriptHandlerBoundaryInterface scriptHandlerBoundaryInterface) {
        this.f11047a = scriptHandlerBoundaryInterface;
    }

    public static T toScriptHandler(InvocationHandler invocationHandler) {
        return new T((ScriptHandlerBoundaryInterface) b8.a.castToSuppLibClass(ScriptHandlerBoundaryInterface.class, invocationHandler));
    }

    @Override // G0.c
    public void remove() {
        this.f11047a.remove();
    }
}
