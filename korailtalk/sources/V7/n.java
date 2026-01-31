package v7;

import R6.G;
import f7.q;
import kotlin.jvm.internal.Lambda;
import n7.InterfaceC5996n;
import s7.K;

/* loaded from: classes3.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    private static final q f37355a = a.INSTANCE;

    /* renamed from: b, reason: collision with root package name */
    private static final K f37356b = new K("STATE_REG");

    /* renamed from: c, reason: collision with root package name */
    private static final K f37357c = new K("STATE_COMPLETED");

    /* renamed from: d, reason: collision with root package name */
    private static final K f37358d = new K("STATE_CANCELLED");

    /* renamed from: e, reason: collision with root package name */
    private static final K f37359e = new K("NO_RESULT");

    /* renamed from: f, reason: collision with root package name */
    private static final K f37360f = new K("PARAM_CLAUSE_0");

    static final class a extends Lambda implements q {
        public static final a INSTANCE = new a();

        a() {
            super(3);
        }

        @Override // f7.q
        public final Void invoke(Object obj, Object obj2, Object obj3) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o a(int i8) {
        if (i8 == 0) {
            return o.SUCCESSFUL;
        }
        if (i8 == 1) {
            return o.REREGISTER;
        }
        if (i8 == 2) {
            return o.CANCELLED;
        }
        if (i8 == 3) {
            return o.ALREADY_SELECTED;
        }
        throw new IllegalStateException(("Unexpected internal result: " + i8).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(InterfaceC5996n interfaceC5996n, f7.l lVar) {
        Object objTryResume = interfaceC5996n.tryResume(G.INSTANCE, null, lVar);
        if (objTryResume == null) {
            return false;
        }
        interfaceC5996n.completeResume(objTryResume);
        return true;
    }

    public static final K getPARAM_CLAUSE_0() {
        return f37360f;
    }

    public static final <R> Object select(f7.l lVar, W6.d<? super R> dVar) {
        k kVar = new k(dVar.getContext());
        lVar.invoke(kVar);
        return kVar.doSelect(dVar);
    }

    public static /* synthetic */ void OnCancellationConstructor$annotations() {
    }

    public static /* synthetic */ void ProcessResultFunction$annotations() {
    }

    public static /* synthetic */ void RegistrationFunction$annotations() {
    }
}
