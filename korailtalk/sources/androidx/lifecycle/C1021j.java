package androidx.lifecycle;

import androidx.lifecycle.AbstractC1019h;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import n7.InterfaceC6008t0;

/* renamed from: androidx.lifecycle.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1021j {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC1019h f10035a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC1019h.b f10036b;

    /* renamed from: c, reason: collision with root package name */
    private final C1016e f10037c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC1023l f10038d;

    public C1021j(AbstractC1019h lifecycle, AbstractC1019h.b minState, C1016e dispatchQueue, final InterfaceC6008t0 parentJob) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(minState, "minState");
        Intrinsics.checkNotNullParameter(dispatchQueue, "dispatchQueue");
        Intrinsics.checkNotNullParameter(parentJob, "parentJob");
        this.f10035a = lifecycle;
        this.f10036b = minState;
        this.f10037c = dispatchQueue;
        InterfaceC1023l interfaceC1023l = new InterfaceC1023l() { // from class: androidx.lifecycle.i
            @Override // androidx.lifecycle.InterfaceC1023l
            public final void onStateChanged(InterfaceC1025n interfaceC1025n, AbstractC1019h.a aVar) {
                C1021j.b(this.f10033a, parentJob, interfaceC1025n, aVar);
            }
        };
        this.f10038d = interfaceC1023l;
        if (lifecycle.getCurrentState() != AbstractC1019h.b.DESTROYED) {
            lifecycle.addObserver(interfaceC1023l);
        } else {
            InterfaceC6008t0.a.cancel$default(parentJob, (CancellationException) null, 1, (Object) null);
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C1021j this$0, InterfaceC6008t0 parentJob, InterfaceC1025n source, AbstractC1019h.a aVar) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(parentJob, "$parentJob");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(aVar, "<anonymous parameter 1>");
        if (source.getLifecycle().getCurrentState() == AbstractC1019h.b.DESTROYED) {
            InterfaceC6008t0.a.cancel$default(parentJob, (CancellationException) null, 1, (Object) null);
            this$0.finish();
        } else if (source.getLifecycle().getCurrentState().compareTo(this$0.f10036b) < 0) {
            this$0.f10037c.pause();
        } else {
            this$0.f10037c.resume();
        }
    }

    public final void finish() {
        this.f10035a.removeObserver(this.f10038d);
        this.f10037c.finish();
    }
}
