package androidx.activity;

import R6.G;
import S6.C0764h;
import android.os.Build;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.AbstractC1019h;
import androidx.lifecycle.InterfaceC1023l;
import androidx.lifecycle.InterfaceC1025n;
import f7.InterfaceC5519a;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {

    /* renamed from: a, reason: collision with root package name */
    private final Runnable f6196a;

    /* renamed from: b, reason: collision with root package name */
    private final Z.a f6197b;

    /* renamed from: c, reason: collision with root package name */
    private final C0764h f6198c;

    /* renamed from: d, reason: collision with root package name */
    private r f6199d;

    /* renamed from: e, reason: collision with root package name */
    private OnBackInvokedCallback f6200e;

    /* renamed from: f, reason: collision with root package name */
    private OnBackInvokedDispatcher f6201f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f6202g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f6203h;

    private final class LifecycleOnBackPressedCancellable implements InterfaceC1023l, androidx.activity.c {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC1019h f6204a;

        /* renamed from: b, reason: collision with root package name */
        private final r f6205b;

        /* renamed from: c, reason: collision with root package name */
        private androidx.activity.c f6206c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ OnBackPressedDispatcher f6207d;

        public LifecycleOnBackPressedCancellable(OnBackPressedDispatcher onBackPressedDispatcher, AbstractC1019h lifecycle, r onBackPressedCallback) {
            Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
            Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
            this.f6207d = onBackPressedDispatcher;
            this.f6204a = lifecycle;
            this.f6205b = onBackPressedCallback;
            lifecycle.addObserver(this);
        }

        @Override // androidx.activity.c
        public void cancel() {
            this.f6204a.removeObserver(this);
            this.f6205b.removeCancellable(this);
            androidx.activity.c cVar = this.f6206c;
            if (cVar != null) {
                cVar.cancel();
            }
            this.f6206c = null;
        }

        @Override // androidx.lifecycle.InterfaceC1023l
        public void onStateChanged(InterfaceC1025n source, AbstractC1019h.a event) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(event, "event");
            if (event == AbstractC1019h.a.ON_START) {
                this.f6206c = this.f6207d.addCancellableCallback$activity_release(this.f6205b);
                return;
            }
            if (event != AbstractC1019h.a.ON_STOP) {
                if (event == AbstractC1019h.a.ON_DESTROY) {
                    cancel();
                }
            } else {
                androidx.activity.c cVar = this.f6206c;
                if (cVar != null) {
                    cVar.cancel();
                }
            }
        }
    }

    static final class a extends Lambda implements f7.l {
        a() {
            super(1);
        }

        @Override // f7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((androidx.activity.b) obj);
            return G.INSTANCE;
        }

        public final void invoke(androidx.activity.b backEvent) {
            Intrinsics.checkNotNullParameter(backEvent, "backEvent");
            OnBackPressedDispatcher.this.c(backEvent);
        }
    }

    static final class b extends Lambda implements f7.l {
        b() {
            super(1);
        }

        @Override // f7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((androidx.activity.b) obj);
            return G.INSTANCE;
        }

        public final void invoke(androidx.activity.b backEvent) {
            Intrinsics.checkNotNullParameter(backEvent, "backEvent");
            OnBackPressedDispatcher.this.b(backEvent);
        }
    }

    static final class c extends Lambda implements InterfaceC5519a {
        c() {
            super(0);
        }

        @Override // f7.InterfaceC5519a
        public /* bridge */ /* synthetic */ Object invoke() {
            m384invoke();
            return G.INSTANCE;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m384invoke() {
            OnBackPressedDispatcher.this.onBackPressed();
        }
    }

    static final class d extends Lambda implements InterfaceC5519a {
        d() {
            super(0);
        }

        @Override // f7.InterfaceC5519a
        public /* bridge */ /* synthetic */ Object invoke() {
            m385invoke();
            return G.INSTANCE;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m385invoke() {
            OnBackPressedDispatcher.this.a();
        }
    }

    static final class e extends Lambda implements InterfaceC5519a {
        e() {
            super(0);
        }

        @Override // f7.InterfaceC5519a
        public /* bridge */ /* synthetic */ Object invoke() {
            m386invoke();
            return G.INSTANCE;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m386invoke() {
            OnBackPressedDispatcher.this.onBackPressed();
        }
    }

    public static final class f {
        public static final f INSTANCE = new f();

        private f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(InterfaceC5519a onBackInvoked) {
            Intrinsics.checkNotNullParameter(onBackInvoked, "$onBackInvoked");
            onBackInvoked.invoke();
        }

        public final OnBackInvokedCallback createOnBackInvokedCallback(final InterfaceC5519a onBackInvoked) {
            Intrinsics.checkNotNullParameter(onBackInvoked, "onBackInvoked");
            return new OnBackInvokedCallback() { // from class: androidx.activity.s
                public final void onBackInvoked() {
                    OnBackPressedDispatcher.f.b(onBackInvoked);
                }
            };
        }

        public final void registerOnBackInvokedCallback(Object dispatcher, int i8, Object callback) {
            Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
            Intrinsics.checkNotNullParameter(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).registerOnBackInvokedCallback(i8, (OnBackInvokedCallback) callback);
        }

        public final void unregisterOnBackInvokedCallback(Object dispatcher, Object callback) {
            Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
            Intrinsics.checkNotNullParameter(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).unregisterOnBackInvokedCallback((OnBackInvokedCallback) callback);
        }
    }

    public static final class g {
        public static final g INSTANCE = new g();

        public static final class a implements OnBackAnimationCallback {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ f7.l f6213a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ f7.l f6214b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC5519a f6215c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC5519a f6216d;

            a(f7.l lVar, f7.l lVar2, InterfaceC5519a interfaceC5519a, InterfaceC5519a interfaceC5519a2) {
                this.f6213a = lVar;
                this.f6214b = lVar2;
                this.f6215c = interfaceC5519a;
                this.f6216d = interfaceC5519a2;
            }

            public void onBackCancelled() {
                this.f6216d.invoke();
            }

            public void onBackInvoked() {
                this.f6215c.invoke();
            }

            public void onBackProgressed(BackEvent backEvent) {
                Intrinsics.checkNotNullParameter(backEvent, "backEvent");
                this.f6214b.invoke(new androidx.activity.b(backEvent));
            }

            public void onBackStarted(BackEvent backEvent) {
                Intrinsics.checkNotNullParameter(backEvent, "backEvent");
                this.f6213a.invoke(new androidx.activity.b(backEvent));
            }
        }

        private g() {
        }

        public final OnBackInvokedCallback createOnBackAnimationCallback(f7.l onBackStarted, f7.l onBackProgressed, InterfaceC5519a onBackInvoked, InterfaceC5519a onBackCancelled) {
            Intrinsics.checkNotNullParameter(onBackStarted, "onBackStarted");
            Intrinsics.checkNotNullParameter(onBackProgressed, "onBackProgressed");
            Intrinsics.checkNotNullParameter(onBackInvoked, "onBackInvoked");
            Intrinsics.checkNotNullParameter(onBackCancelled, "onBackCancelled");
            return new a(onBackStarted, onBackProgressed, onBackInvoked, onBackCancelled);
        }
    }

    private final class h implements androidx.activity.c {

        /* renamed from: a, reason: collision with root package name */
        private final r f6217a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ OnBackPressedDispatcher f6218b;

        public h(OnBackPressedDispatcher onBackPressedDispatcher, r onBackPressedCallback) {
            Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
            this.f6218b = onBackPressedDispatcher;
            this.f6217a = onBackPressedCallback;
        }

        @Override // androidx.activity.c
        public void cancel() {
            this.f6218b.f6198c.remove(this.f6217a);
            if (Intrinsics.areEqual(this.f6218b.f6199d, this.f6217a)) {
                this.f6217a.handleOnBackCancelled();
                this.f6218b.f6199d = null;
            }
            this.f6217a.removeCancellable(this);
            InterfaceC5519a enabledChangedCallback$activity_release = this.f6217a.getEnabledChangedCallback$activity_release();
            if (enabledChangedCallback$activity_release != null) {
                enabledChangedCallback$activity_release.invoke();
            }
            this.f6217a.setEnabledChangedCallback$activity_release(null);
        }
    }

    /* synthetic */ class i extends FunctionReferenceImpl implements InterfaceC5519a {
        i(Object obj) {
            super(0, obj, OnBackPressedDispatcher.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        @Override // f7.InterfaceC5519a
        public /* bridge */ /* synthetic */ Object invoke() {
            m387invoke();
            return G.INSTANCE;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m387invoke() {
            ((OnBackPressedDispatcher) this.receiver).e();
        }
    }

    /* synthetic */ class j extends FunctionReferenceImpl implements InterfaceC5519a {
        j(Object obj) {
            super(0, obj, OnBackPressedDispatcher.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        @Override // f7.InterfaceC5519a
        public /* bridge */ /* synthetic */ Object invoke() {
            m388invoke();
            return G.INSTANCE;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m388invoke() {
            ((OnBackPressedDispatcher) this.receiver).e();
        }
    }

    public OnBackPressedDispatcher() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void a() {
        r rVarPrevious;
        r rVar = this.f6199d;
        if (rVar == null) {
            C0764h c0764h = this.f6198c;
            ListIterator listIterator = c0764h.listIterator(c0764h.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    rVarPrevious = 0;
                    break;
                } else {
                    rVarPrevious = listIterator.previous();
                    if (((r) rVarPrevious).isEnabled()) {
                        break;
                    }
                }
            }
            rVar = rVarPrevious;
        }
        this.f6199d = null;
        if (rVar != null) {
            rVar.handleOnBackCancelled();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object] */
    public final void b(androidx.activity.b bVar) {
        r rVarPrevious;
        r rVar = this.f6199d;
        if (rVar == null) {
            C0764h c0764h = this.f6198c;
            ListIterator listIterator = c0764h.listIterator(c0764h.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    rVarPrevious = 0;
                    break;
                } else {
                    rVarPrevious = listIterator.previous();
                    if (((r) rVarPrevious).isEnabled()) {
                        break;
                    }
                }
            }
            rVar = rVarPrevious;
        }
        if (rVar != null) {
            rVar.handleOnBackProgressed(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(androidx.activity.b bVar) {
        Object objPrevious;
        C0764h c0764h = this.f6198c;
        ListIterator<E> listIterator = c0764h.listIterator(c0764h.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            } else {
                objPrevious = listIterator.previous();
                if (((r) objPrevious).isEnabled()) {
                    break;
                }
            }
        }
        r rVar = (r) objPrevious;
        if (this.f6199d != null) {
            a();
        }
        this.f6199d = rVar;
        if (rVar != null) {
            rVar.handleOnBackStarted(bVar);
        }
    }

    private final void d(boolean z8) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f6201f;
        OnBackInvokedCallback onBackInvokedCallback = this.f6200e;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        if (z8 && !this.f6202g) {
            f.INSTANCE.registerOnBackInvokedCallback(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f6202g = true;
        } else {
            if (z8 || !this.f6202g) {
                return;
            }
            f.INSTANCE.unregisterOnBackInvokedCallback(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f6202g = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e() {
        boolean z8 = this.f6203h;
        C0764h c0764h = this.f6198c;
        boolean z9 = false;
        if (c0764h == null || !c0764h.isEmpty()) {
            Iterator<E> it = c0764h.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((r) it.next()).isEnabled()) {
                    z9 = true;
                    break;
                }
            }
        }
        this.f6203h = z9;
        if (z9 != z8) {
            Z.a aVar = this.f6197b;
            if (aVar != null) {
                aVar.accept(Boolean.valueOf(z9));
            }
            if (Build.VERSION.SDK_INT >= 33) {
                d(z9);
            }
        }
    }

    public final void addCallback(r onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        addCancellableCallback$activity_release(onBackPressedCallback);
    }

    public final androidx.activity.c addCancellableCallback$activity_release(r onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        this.f6198c.add(onBackPressedCallback);
        h hVar = new h(this, onBackPressedCallback);
        onBackPressedCallback.addCancellable(hVar);
        e();
        onBackPressedCallback.setEnabledChangedCallback$activity_release(new j(this));
        return hVar;
    }

    public final void dispatchOnBackCancelled() {
        a();
    }

    public final void dispatchOnBackProgressed(androidx.activity.b backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        b(backEvent);
    }

    public final void dispatchOnBackStarted(androidx.activity.b backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        c(backEvent);
    }

    public final boolean hasEnabledCallbacks() {
        return this.f6203h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void onBackPressed() {
        r rVarPrevious;
        r rVar = this.f6199d;
        if (rVar == null) {
            C0764h c0764h = this.f6198c;
            ListIterator listIterator = c0764h.listIterator(c0764h.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    rVarPrevious = 0;
                    break;
                } else {
                    rVarPrevious = listIterator.previous();
                    if (((r) rVarPrevious).isEnabled()) {
                        break;
                    }
                }
            }
            rVar = rVarPrevious;
        }
        this.f6199d = null;
        if (rVar != null) {
            rVar.handleOnBackPressed();
            return;
        }
        Runnable runnable = this.f6196a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void setOnBackInvokedDispatcher(OnBackInvokedDispatcher invoker) {
        Intrinsics.checkNotNullParameter(invoker, "invoker");
        this.f6201f = invoker;
        d(this.f6203h);
    }

    public OnBackPressedDispatcher(Runnable runnable, Z.a aVar) {
        this.f6196a = runnable;
        this.f6197b = aVar;
        this.f6198c = new C0764h();
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 33) {
            this.f6200e = i8 >= 34 ? g.INSTANCE.createOnBackAnimationCallback(new a(), new b(), new c(), new d()) : f.INSTANCE.createOnBackInvokedCallback(new e());
        }
    }

    public final void addCallback(InterfaceC1025n owner, r onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        AbstractC1019h lifecycle = owner.getLifecycle();
        if (lifecycle.getCurrentState() == AbstractC1019h.b.DESTROYED) {
            return;
        }
        onBackPressedCallback.addCancellable(new LifecycleOnBackPressedCancellable(this, lifecycle, onBackPressedCallback));
        e();
        onBackPressedCallback.setEnabledChangedCallback$activity_release(new i(this));
    }

    public /* synthetic */ OnBackPressedDispatcher(Runnable runnable, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? null : runnable);
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this(runnable, null);
    }
}
