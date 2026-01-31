package s7;

import R6.C0751e;
import java.util.List;
import n7.F0;

/* renamed from: s7.A */
/* loaded from: classes3.dex */
public abstract class AbstractC6234A {
    private static final C6235B a(Throwable th, String str) throws Throwable {
        if (th != null) {
            throw th;
        }
        throwMissingMainDispatcherException();
        throw new C0751e();
    }

    static /* synthetic */ C6235B b(Throwable th, String str, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            th = null;
        }
        if ((i8 & 2) != 0) {
            str = null;
        }
        return a(th, str);
    }

    public static final boolean isMissing(F0 f02) {
        return f02.getImmediate() instanceof C6235B;
    }

    public static final Void throwMissingMainDispatcherException() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    public static final F0 tryCreateDispatcher(y yVar, List<? extends y> list) {
        try {
            return yVar.createDispatcher(list);
        } catch (Throwable th) {
            return a(th, yVar.hintOnError());
        }
    }
}
