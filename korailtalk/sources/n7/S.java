package n7;

import s7.AbstractC6234A;

/* loaded from: classes3.dex */
public abstract class S {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f34312a = s7.L.systemProp("kotlinx.coroutines.main.delay", false);

    /* renamed from: b, reason: collision with root package name */
    private static final V f34313b = a();

    /* JADX WARN: Multi-variable type inference failed */
    private static final V a() {
        if (!f34312a) {
            return Q.INSTANCE;
        }
        F0 main = C5971a0.getMain();
        return (AbstractC6234A.isMissing(main) || !(main instanceof V)) ? Q.INSTANCE : (V) main;
    }

    public static final V getDefaultDelay() {
        return f34313b;
    }
}
