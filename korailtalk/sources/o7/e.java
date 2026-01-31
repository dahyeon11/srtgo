package o7;

import R6.G;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n7.F0;
import n7.InterfaceC5973b0;
import n7.InterfaceC5996n;
import n7.V;

/* loaded from: classes3.dex */
public abstract class e extends F0 implements V {
    public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // n7.V
    public Object delay(long j8, W6.d<? super G> dVar) {
        return V.a.delay(this, j8, dVar);
    }

    @Override // n7.F0
    public abstract e getImmediate();

    public InterfaceC5973b0 invokeOnTimeout(long j8, Runnable runnable, W6.g gVar) {
        return V.a.invokeOnTimeout(this, j8, runnable, gVar);
    }

    /* renamed from: scheduleResumeAfterDelay */
    public abstract /* synthetic */ void mo571scheduleResumeAfterDelay(long j8, InterfaceC5996n interfaceC5996n);

    private e() {
    }
}
