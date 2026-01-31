package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.AbstractC1019h;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class H {

    /* renamed from: a, reason: collision with root package name */
    private final C1026o f9953a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f9954b;

    /* renamed from: c, reason: collision with root package name */
    private a f9955c;

    public static final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final C1026o f9956a;

        /* renamed from: b, reason: collision with root package name */
        private final AbstractC1019h.a f9957b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f9958c;

        public a(C1026o registry, AbstractC1019h.a event) {
            Intrinsics.checkNotNullParameter(registry, "registry");
            Intrinsics.checkNotNullParameter(event, "event");
            this.f9956a = registry;
            this.f9957b = event;
        }

        public final AbstractC1019h.a getEvent() {
            return this.f9957b;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f9958c) {
                return;
            }
            this.f9956a.handleLifecycleEvent(this.f9957b);
            this.f9958c = true;
        }
    }

    public H(InterfaceC1025n provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f9953a = new C1026o(provider);
        this.f9954b = new Handler();
    }

    private final void a(AbstractC1019h.a aVar) {
        a aVar2 = this.f9955c;
        if (aVar2 != null) {
            aVar2.run();
        }
        a aVar3 = new a(this.f9953a, aVar);
        this.f9955c = aVar3;
        Handler handler = this.f9954b;
        Intrinsics.checkNotNull(aVar3);
        handler.postAtFrontOfQueue(aVar3);
    }

    public AbstractC1019h getLifecycle() {
        return this.f9953a;
    }

    public void onServicePreSuperOnBind() {
        a(AbstractC1019h.a.ON_START);
    }

    public void onServicePreSuperOnCreate() {
        a(AbstractC1019h.a.ON_CREATE);
    }

    public void onServicePreSuperOnDestroy() {
        a(AbstractC1019h.a.ON_STOP);
        a(AbstractC1019h.a.ON_DESTROY);
    }

    public void onServicePreSuperOnStart() {
        a(AbstractC1019h.a.ON_START);
    }
}
