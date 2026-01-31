package n7;

/* renamed from: n7.w0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C6014w0 extends B0 implements InterfaceC6019z {

    /* renamed from: c, reason: collision with root package name */
    private final boolean f34355c;

    public C6014w0(InterfaceC6008t0 interfaceC6008t0) {
        super(true);
        v(interfaceC6008t0);
        this.f34355c = U();
    }

    private final boolean U() {
        B0 job;
        InterfaceC6007t parentHandle$kotlinx_coroutines_core = getParentHandle$kotlinx_coroutines_core();
        C6009u c6009u = parentHandle$kotlinx_coroutines_core instanceof C6009u ? (C6009u) parentHandle$kotlinx_coroutines_core : null;
        if (c6009u != null && (job = c6009u.getJob()) != null) {
            while (!job.getHandlesException$kotlinx_coroutines_core()) {
                InterfaceC6007t parentHandle$kotlinx_coroutines_core2 = job.getParentHandle$kotlinx_coroutines_core();
                C6009u c6009u2 = parentHandle$kotlinx_coroutines_core2 instanceof C6009u ? (C6009u) parentHandle$kotlinx_coroutines_core2 : null;
                if (c6009u2 == null || (job = c6009u2.getJob()) == null) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // n7.InterfaceC6019z
    public boolean complete() {
        return makeCompleting$kotlinx_coroutines_core(R6.G.INSTANCE);
    }

    @Override // n7.InterfaceC6019z
    public boolean completeExceptionally(Throwable th) {
        return makeCompleting$kotlinx_coroutines_core(new C5966B(th, false, 2, null));
    }

    @Override // n7.B0
    public boolean getHandlesException$kotlinx_coroutines_core() {
        return this.f34355c;
    }

    @Override // n7.B0
    public boolean getOnCancelComplete$kotlinx_coroutines_core() {
        return true;
    }
}
