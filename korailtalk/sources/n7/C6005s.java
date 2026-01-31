package n7;

/* renamed from: n7.s */
/* loaded from: classes3.dex */
public final class C6005s extends AbstractC6012v0 {
    public final C5998o child;

    public C6005s(C5998o c5998o) {
        this.child = c5998o;
    }

    @Override // n7.AbstractC6012v0, n7.A0, n7.AbstractC5968D, f7.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return R6.G.INSTANCE;
    }

    @Override // n7.AbstractC5968D
    public void invoke(Throwable th) {
        C5998o c5998o = this.child;
        c5998o.parentCancelled$kotlinx_coroutines_core(c5998o.getContinuationCancellationCause(getJob()));
    }
}
