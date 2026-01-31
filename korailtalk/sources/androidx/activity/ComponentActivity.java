package androidx.activity;

import R6.AbstractC0756j;
import R6.InterfaceC0755i;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.ComponentActivity;
import androidx.core.app.A;
import androidx.core.app.AbstractC0918b;
import androidx.core.app.AbstractC0920d;
import androidx.core.app.x;
import androidx.core.app.y;
import androidx.core.app.z;
import androidx.core.view.G;
import androidx.core.view.J;
import androidx.core.view.L;
import androidx.lifecycle.AbstractC1019h;
import androidx.lifecycle.C;
import androidx.lifecycle.C1026o;
import androidx.lifecycle.F;
import androidx.lifecycle.InterfaceC1018g;
import androidx.lifecycle.InterfaceC1023l;
import androidx.lifecycle.InterfaceC1025n;
import androidx.lifecycle.K;
import androidx.lifecycle.M;
import androidx.lifecycle.N;
import androidx.lifecycle.O;
import androidx.lifecycle.P;
import androidx.savedstate.a;
import e.C5337b;
import e.InterfaceC5336a;
import e.InterfaceC5338c;
import f.InterfaceC5379b;
import f.InterfaceC5380c;
import f7.InterfaceC5519a;
import g.AbstractC5530a;
import g.C5531b;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import k0.AbstractC5837a;
import k0.C5840d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import y0.AbstractC6513e;
import y0.C6511c;
import y0.InterfaceC6512d;

/* loaded from: classes.dex */
public class ComponentActivity extends androidx.core.app.i implements InterfaceC5336a, InterfaceC1025n, N, InterfaceC1018g, InterfaceC6512d, t, f.g, InterfaceC5380c, androidx.core.content.c, androidx.core.content.d, y, x, z, A, G, q {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private static final b Companion = new b(null);
    private M _viewModelStore;
    private final f.f activityResultRegistry;
    private int contentLayoutId;
    private final C5337b contextAwareHelper;
    private final InterfaceC0755i defaultViewModelProviderFactory$delegate;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;
    private final InterfaceC0755i fullyDrawnReporter$delegate;
    private final J menuHostHelper;
    private final AtomicInteger nextLocalRequestCode;
    private final InterfaceC0755i onBackPressedDispatcher$delegate;
    private final CopyOnWriteArrayList<Z.a> onConfigurationChangedListeners;
    private final CopyOnWriteArrayList<Z.a> onMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<Z.a> onNewIntentListeners;
    private final CopyOnWriteArrayList<Z.a> onPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<Z.a> onTrimMemoryListeners;
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;
    private final d reportFullyDrawnExecutor;
    private final C6511c savedStateRegistryController;

    /* renamed from: androidx.activity.ComponentActivity$4 */
    public static final class AnonymousClass4 implements InterfaceC1023l {
        AnonymousClass4() {
        }

        @Override // androidx.lifecycle.InterfaceC1023l
        public void onStateChanged(InterfaceC1025n source, AbstractC1019h.a event) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(event, "event");
            ComponentActivity.this.o();
            ComponentActivity.this.getLifecycle().removeObserver(this);
        }
    }

    private static final class a {
        public static final a INSTANCE = new a();

        private a() {
        }

        public final OnBackInvokedDispatcher getOnBackInvokedDispatcher(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            OnBackInvokedDispatcher onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
            Intrinsics.checkNotNullExpressionValue(onBackInvokedDispatcher, "activity.getOnBackInvokedDispatcher()");
            return onBackInvokedDispatcher;
        }
    }

    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public static final class c {

        /* renamed from: a */
        private Object f6180a;

        /* renamed from: b */
        private M f6181b;

        public final Object getCustom() {
            return this.f6180a;
        }

        public final M getViewModelStore() {
            return this.f6181b;
        }

        public final void setCustom(Object obj) {
            this.f6180a = obj;
        }

        public final void setViewModelStore(M m8) {
            this.f6181b = m8;
        }
    }

    private interface d extends Executor {
        void activityDestroyed();

        void viewCreated(View view);
    }

    final class e implements d, ViewTreeObserver.OnDrawListener, Runnable {

        /* renamed from: a */
        private final long f6182a = SystemClock.uptimeMillis() + 10000;

        /* renamed from: b */
        private Runnable f6183b;

        /* renamed from: c */
        private boolean f6184c;

        public e() {
        }

        public static final void b(e this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Runnable runnable = this$0.f6183b;
            if (runnable != null) {
                Intrinsics.checkNotNull(runnable);
                runnable.run();
                this$0.f6183b = null;
            }
        }

        @Override // androidx.activity.ComponentActivity.d
        public void activityDestroyed() {
            ComponentActivity.this.getWindow().getDecorView().removeCallbacks(this);
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            this.f6183b = runnable;
            View decorView = ComponentActivity.this.getWindow().getDecorView();
            Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
            if (!this.f6184c) {
                decorView.postOnAnimation(new Runnable() { // from class: androidx.activity.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        ComponentActivity.e.b(this.f6230a);
                    }
                });
            } else if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        public final Runnable getCurrentRunnable() {
            return this.f6183b;
        }

        public final long getEndWatchTimeMillis() {
            return this.f6182a;
        }

        public final boolean getOnDrawScheduled() {
            return this.f6184c;
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            Runnable runnable = this.f6183b;
            if (runnable == null) {
                if (SystemClock.uptimeMillis() > this.f6182a) {
                    this.f6184c = false;
                    ComponentActivity.this.getWindow().getDecorView().post(this);
                    return;
                }
                return;
            }
            runnable.run();
            this.f6183b = null;
            if (ComponentActivity.this.getFullyDrawnReporter().isFullyDrawnReported()) {
                this.f6184c = false;
                ComponentActivity.this.getWindow().getDecorView().post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        public final void setCurrentRunnable(Runnable runnable) {
            this.f6183b = runnable;
        }

        public final void setOnDrawScheduled(boolean z8) {
            this.f6184c = z8;
        }

        @Override // androidx.activity.ComponentActivity.d
        public void viewCreated(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            if (this.f6184c) {
                return;
            }
            this.f6184c = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }
    }

    public static final class f extends f.f {
        f() {
        }

        public static final void i(f this$0, int i8, AbstractC5530a.C0300a c0300a) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.dispatchResult(i8, c0300a.getValue());
        }

        public static final void j(f this$0, int i8, IntentSender.SendIntentException e8) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(e8, "$e");
            this$0.dispatchResult(i8, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", e8));
        }

        @Override // f.f
        public <I, O> void onLaunch(final int i8, AbstractC5530a contract, I i9, AbstractC0920d abstractC0920d) {
            Bundle bundle;
            Intrinsics.checkNotNullParameter(contract, "contract");
            ComponentActivity componentActivity = ComponentActivity.this;
            final AbstractC5530a.C0300a synchronousResult = contract.getSynchronousResult(componentActivity, i9);
            if (synchronousResult != null) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: androidx.activity.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        ComponentActivity.f.i(this.f6231a, i8, synchronousResult);
                    }
                });
                return;
            }
            Intent intentCreateIntent = contract.createIntent(componentActivity, i9);
            if (intentCreateIntent.getExtras() != null) {
                Bundle extras = intentCreateIntent.getExtras();
                Intrinsics.checkNotNull(extras);
                if (extras.getClassLoader() == null) {
                    intentCreateIntent.setExtrasClassLoader(componentActivity.getClassLoader());
                }
            }
            if (intentCreateIntent.hasExtra(g.c.EXTRA_ACTIVITY_OPTIONS_BUNDLE)) {
                Bundle bundleExtra = intentCreateIntent.getBundleExtra(g.c.EXTRA_ACTIVITY_OPTIONS_BUNDLE);
                intentCreateIntent.removeExtra(g.c.EXTRA_ACTIVITY_OPTIONS_BUNDLE);
                bundle = bundleExtra;
            } else {
                bundle = abstractC0920d != null ? abstractC0920d.toBundle() : null;
            }
            if (Intrinsics.areEqual(C5531b.ACTION_REQUEST_PERMISSIONS, intentCreateIntent.getAction())) {
                String[] stringArrayExtra = intentCreateIntent.getStringArrayExtra(C5531b.EXTRA_PERMISSIONS);
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                AbstractC0918b.requestPermissions(componentActivity, stringArrayExtra, i8);
                return;
            }
            if (!Intrinsics.areEqual("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST", intentCreateIntent.getAction())) {
                AbstractC0918b.startActivityForResult(componentActivity, intentCreateIntent, i8, bundle);
                return;
            }
            f.h hVar = (f.h) intentCreateIntent.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                Intrinsics.checkNotNull(hVar);
                AbstractC0918b.startIntentSenderForResult(componentActivity, hVar.getIntentSender(), i8, hVar.getFillInIntent(), hVar.getFlagsMask(), hVar.getFlagsValues(), 0, bundle);
            } catch (IntentSender.SendIntentException e8) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: androidx.activity.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        ComponentActivity.f.j(this.f6234a, i8, e8);
                    }
                });
            }
        }
    }

    static final class g extends Lambda implements InterfaceC5519a {
        g() {
            super(0);
        }

        @Override // f7.InterfaceC5519a
        public final F invoke() {
            Application application = ComponentActivity.this.getApplication();
            ComponentActivity componentActivity = ComponentActivity.this;
            return new F(application, componentActivity, componentActivity.getIntent() != null ? ComponentActivity.this.getIntent().getExtras() : null);
        }
    }

    static final class h extends Lambda implements InterfaceC5519a {

        static final class a extends Lambda implements InterfaceC5519a {

            /* renamed from: a */
            final /* synthetic */ ComponentActivity f6189a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ComponentActivity componentActivity) {
                super(0);
                this.f6189a = componentActivity;
            }

            @Override // f7.InterfaceC5519a
            public /* bridge */ /* synthetic */ Object invoke() {
                m383invoke();
                return R6.G.INSTANCE;
            }

            /* renamed from: invoke */
            public final void m383invoke() {
                this.f6189a.reportFullyDrawn();
            }
        }

        h() {
            super(0);
        }

        @Override // f7.InterfaceC5519a
        public final p invoke() {
            return new p(ComponentActivity.this.reportFullyDrawnExecutor, new a(ComponentActivity.this));
        }
    }

    static final class i extends Lambda implements InterfaceC5519a {
        i() {
            super(0);
        }

        public static final void c(ComponentActivity this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e8) {
                if (!Intrinsics.areEqual(e8.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e8;
                }
            } catch (NullPointerException e9) {
                if (!Intrinsics.areEqual(e9.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                    throw e9;
                }
            }
        }

        public static final void d(ComponentActivity this$0, OnBackPressedDispatcher dispatcher) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(dispatcher, "$dispatcher");
            this$0.l(dispatcher);
        }

        @Override // f7.InterfaceC5519a
        public final OnBackPressedDispatcher invoke() {
            final ComponentActivity componentActivity = ComponentActivity.this;
            final OnBackPressedDispatcher onBackPressedDispatcher = new OnBackPressedDispatcher(new Runnable() { // from class: androidx.activity.m
                @Override // java.lang.Runnable
                public final void run() {
                    ComponentActivity.i.c(componentActivity);
                }
            });
            final ComponentActivity componentActivity2 = ComponentActivity.this;
            if (Build.VERSION.SDK_INT >= 33) {
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    componentActivity2.l(onBackPressedDispatcher);
                } else {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: androidx.activity.n
                        @Override // java.lang.Runnable
                        public final void run() {
                            ComponentActivity.i.d(componentActivity2, onBackPressedDispatcher);
                        }
                    });
                }
            }
            return onBackPressedDispatcher;
        }
    }

    public ComponentActivity() {
        this.contextAwareHelper = new C5337b();
        this.menuHostHelper = new J(new Runnable() { // from class: androidx.activity.d
            @Override // java.lang.Runnable
            public final void run() {
                ComponentActivity.p(this.f6223a);
            }
        });
        C6511c c6511cCreate = C6511c.Companion.create(this);
        this.savedStateRegistryController = c6511cCreate;
        this.reportFullyDrawnExecutor = n();
        this.fullyDrawnReporter$delegate = AbstractC0756j.lazy(new h());
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new f();
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        getLifecycle().addObserver(new InterfaceC1023l() { // from class: androidx.activity.e
            @Override // androidx.lifecycle.InterfaceC1023l
            public final void onStateChanged(InterfaceC1025n interfaceC1025n, AbstractC1019h.a aVar) {
                ComponentActivity.h(this.f6224a, interfaceC1025n, aVar);
            }
        });
        getLifecycle().addObserver(new InterfaceC1023l() { // from class: androidx.activity.f
            @Override // androidx.lifecycle.InterfaceC1023l
            public final void onStateChanged(InterfaceC1025n interfaceC1025n, AbstractC1019h.a aVar) {
                ComponentActivity.i(this.f6225a, interfaceC1025n, aVar);
            }
        });
        getLifecycle().addObserver(new InterfaceC1023l() { // from class: androidx.activity.ComponentActivity.4
            AnonymousClass4() {
            }

            @Override // androidx.lifecycle.InterfaceC1023l
            public void onStateChanged(InterfaceC1025n source, AbstractC1019h.a event) {
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                ComponentActivity.this.o();
                ComponentActivity.this.getLifecycle().removeObserver(this);
            }
        });
        c6511cCreate.performAttach();
        C.enableSavedStateHandles(this);
        getSavedStateRegistry().registerSavedStateProvider(ACTIVITY_RESULT_TAG, new a.c() { // from class: androidx.activity.g
            @Override // androidx.savedstate.a.c
            public final Bundle saveState() {
                return ComponentActivity.j(this.f6226a);
            }
        });
        addOnContextAvailableListener(new InterfaceC5338c() { // from class: androidx.activity.h
            @Override // e.InterfaceC5338c
            public final void onContextAvailable(Context context) {
                ComponentActivity.k(this.f6227a, context);
            }
        });
        this.defaultViewModelProviderFactory$delegate = AbstractC0756j.lazy(new g());
        this.onBackPressedDispatcher$delegate = AbstractC0756j.lazy(new i());
    }

    public static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
    }

    public static final void h(ComponentActivity this$0, InterfaceC1025n interfaceC1025n, AbstractC1019h.a event) {
        Window window;
        View viewPeekDecorView;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(interfaceC1025n, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event != AbstractC1019h.a.ON_STOP || (window = this$0.getWindow()) == null || (viewPeekDecorView = window.peekDecorView()) == null) {
            return;
        }
        viewPeekDecorView.cancelPendingInputEvents();
    }

    public static final void i(ComponentActivity this$0, InterfaceC1025n interfaceC1025n, AbstractC1019h.a event) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(interfaceC1025n, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == AbstractC1019h.a.ON_DESTROY) {
            this$0.contextAwareHelper.clearAvailableContext();
            if (!this$0.isChangingConfigurations()) {
                this$0.getViewModelStore().clear();
            }
            this$0.reportFullyDrawnExecutor.activityDestroyed();
        }
    }

    public static final Bundle j(ComponentActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Bundle bundle = new Bundle();
        this$0.activityResultRegistry.onSaveInstanceState(bundle);
        return bundle;
    }

    public static final void k(ComponentActivity this$0, Context it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Bundle bundleConsumeRestoredStateForKey = this$0.getSavedStateRegistry().consumeRestoredStateForKey(ACTIVITY_RESULT_TAG);
        if (bundleConsumeRestoredStateForKey != null) {
            this$0.activityResultRegistry.onRestoreInstanceState(bundleConsumeRestoredStateForKey);
        }
    }

    public final void l(final OnBackPressedDispatcher onBackPressedDispatcher) {
        getLifecycle().addObserver(new InterfaceC1023l() { // from class: androidx.activity.i
            @Override // androidx.lifecycle.InterfaceC1023l
            public final void onStateChanged(InterfaceC1025n interfaceC1025n, AbstractC1019h.a aVar) {
                ComponentActivity.m(onBackPressedDispatcher, this, interfaceC1025n, aVar);
            }
        });
    }

    public static final void m(OnBackPressedDispatcher dispatcher, ComponentActivity this$0, InterfaceC1025n interfaceC1025n, AbstractC1019h.a event) {
        Intrinsics.checkNotNullParameter(dispatcher, "$dispatcher");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(interfaceC1025n, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == AbstractC1019h.a.ON_CREATE) {
            dispatcher.setOnBackInvokedDispatcher(a.INSTANCE.getOnBackInvokedDispatcher(this$0));
        }
    }

    private final d n() {
        return new e();
    }

    public final void o() {
        if (this._viewModelStore == null) {
            c cVar = (c) getLastNonConfigurationInstance();
            if (cVar != null) {
                this._viewModelStore = cVar.getViewModelStore();
            }
            if (this._viewModelStore == null) {
                this._viewModelStore = new M();
            }
        }
    }

    public static final void p(ComponentActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.invalidateMenu();
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        d dVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        dVar.viewCreated(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.core.view.G
    public void addMenuProvider(L provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.menuHostHelper.addMenuProvider(provider);
    }

    @Override // androidx.core.content.c
    public final void addOnConfigurationChangedListener(Z.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onConfigurationChangedListeners.add(listener);
    }

    @Override // e.InterfaceC5336a
    public final void addOnContextAvailableListener(InterfaceC5338c listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.contextAwareHelper.addOnContextAvailableListener(listener);
    }

    @Override // androidx.core.app.x
    public final void addOnMultiWindowModeChangedListener(Z.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onMultiWindowModeChangedListeners.add(listener);
    }

    @Override // androidx.core.app.y
    public final void addOnNewIntentListener(Z.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onNewIntentListeners.add(listener);
    }

    @Override // androidx.core.app.z
    public final void addOnPictureInPictureModeChangedListener(Z.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onPictureInPictureModeChangedListeners.add(listener);
    }

    @Override // androidx.core.content.d
    public final void addOnTrimMemoryListener(Z.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onTrimMemoryListeners.add(listener);
    }

    @Override // androidx.core.app.A
    public final void addOnUserLeaveHintListener(Runnable listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onUserLeaveHintListeners.add(listener);
    }

    @Override // f.g
    public final f.f getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    @Override // androidx.lifecycle.InterfaceC1018g
    public AbstractC5837a getDefaultViewModelCreationExtras() {
        C5840d c5840d = new C5840d(null, 1, null);
        if (getApplication() != null) {
            AbstractC5837a.b bVar = K.a.APPLICATION_KEY;
            Application application = getApplication();
            Intrinsics.checkNotNullExpressionValue(application, "application");
            c5840d.set(bVar, application);
        }
        c5840d.set(C.SAVED_STATE_REGISTRY_OWNER_KEY, this);
        c5840d.set(C.VIEW_MODEL_STORE_OWNER_KEY, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            c5840d.set(C.DEFAULT_ARGS_KEY, extras);
        }
        return c5840d;
    }

    @Override // androidx.lifecycle.InterfaceC1018g
    public K.b getDefaultViewModelProviderFactory() {
        return (K.b) this.defaultViewModelProviderFactory$delegate.getValue();
    }

    @Override // androidx.activity.q
    public p getFullyDrawnReporter() {
        return (p) this.fullyDrawnReporter$delegate.getValue();
    }

    public Object getLastCustomNonConfigurationInstance() {
        c cVar = (c) getLastNonConfigurationInstance();
        if (cVar != null) {
            return cVar.getCustom();
        }
        return null;
    }

    @Override // androidx.core.app.i, androidx.lifecycle.InterfaceC1025n, y0.InterfaceC6512d, androidx.activity.t
    public AbstractC1019h getLifecycle() {
        return super.getLifecycle();
    }

    @Override // androidx.activity.t
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return (OnBackPressedDispatcher) this.onBackPressedDispatcher$delegate.getValue();
    }

    @Override // y0.InterfaceC6512d
    public final androidx.savedstate.a getSavedStateRegistry() {
        return this.savedStateRegistryController.getSavedStateRegistry();
    }

    @Override // androidx.lifecycle.N
    public M getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        o();
        M m8 = this._viewModelStore;
        Intrinsics.checkNotNull(m8);
        return m8;
    }

    public void initializeViewTreeOwners() {
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        O.set(decorView, this);
        View decorView2 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView2, "window.decorView");
        P.set(decorView2, this);
        View decorView3 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView3, "window.decorView");
        AbstractC6513e.set(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView4, "window.decorView");
        w.set(decorView4, this);
        View decorView5 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView5, "window.decorView");
        v.set(decorView5, this);
    }

    @Override // androidx.core.view.G
    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i8, int i9, Intent intent) {
        if (this.activityResultRegistry.dispatchResult(i8, i9, intent)) {
            return;
        }
        super.onActivityResult(i8, i9, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        getOnBackPressedDispatcher().onBackPressed();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Iterator<Z.a> it = this.onConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(newConfig);
        }
    }

    @Override // androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) {
        this.savedStateRegistryController.performRestore(bundle);
        this.contextAwareHelper.dispatchOnContextAvailable(this);
        super.onCreate(bundle);
        androidx.lifecycle.y.Companion.injectIfNeededIn(this);
        int i8 = this.contentLayoutId;
        if (i8 != 0) {
            setContentView(i8);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i8, Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        if (i8 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i8, menu);
        this.menuHostHelper.onCreateMenu(menu, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i8, MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (super.onMenuItemSelected(i8, item)) {
            return true;
        }
        if (i8 == 0) {
            return this.menuHostHelper.onMenuItemSelected(item);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z8) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<Z.a> it = this.onMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new androidx.core.app.k(z8));
        }
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        Iterator<Z.a> it = this.onNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i8, Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        this.menuHostHelper.onMenuClosed(menu);
        super.onPanelClosed(i8, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z8) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<Z.a> it = this.onPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new androidx.core.app.C(z8));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i8, View view, Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        if (i8 != 0) {
            return true;
        }
        super.onPreparePanel(i8, view, menu);
        this.menuHostHelper.onPrepareMenu(menu);
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i8, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        if (this.activityResultRegistry.dispatchResult(i8, -1, new Intent().putExtra(C5531b.EXTRA_PERMISSIONS, permissions).putExtra(C5531b.EXTRA_PERMISSION_GRANT_RESULTS, grantResults))) {
            return;
        }
        super.onRequestPermissionsResult(i8, permissions, grantResults);
    }

    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        c cVar;
        Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        M viewModelStore = this._viewModelStore;
        if (viewModelStore == null && (cVar = (c) getLastNonConfigurationInstance()) != null) {
            viewModelStore = cVar.getViewModelStore();
        }
        if (viewModelStore == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        c cVar2 = new c();
        cVar2.setCustom(objOnRetainCustomNonConfigurationInstance);
        cVar2.setViewModelStore(viewModelStore);
        return cVar2;
    }

    @Override // androidx.core.app.i, android.app.Activity
    protected void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        if (getLifecycle() instanceof C1026o) {
            AbstractC1019h lifecycle = getLifecycle();
            Intrinsics.checkNotNull(lifecycle, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            ((C1026o) lifecycle).setCurrentState(AbstractC1019h.b.CREATED);
        }
        super.onSaveInstanceState(outState);
        this.savedStateRegistryController.performSave(outState);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i8) {
        super.onTrimMemory(i8);
        Iterator<Z.a> it = this.onTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i8));
        }
    }

    @Override // android.app.Activity
    protected void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator<Runnable> it = this.onUserLeaveHintListeners.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    @Override // e.InterfaceC5336a
    public Context peekAvailableContext() {
        return this.contextAwareHelper.peekAvailableContext();
    }

    @Override // f.InterfaceC5380c
    public final <I, O> f.d registerForActivityResult(AbstractC5530a contract, f.f registry, InterfaceC5379b callback) {
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return registry.register("activity_rq#" + this.nextLocalRequestCode.getAndIncrement(), this, contract, callback);
    }

    @Override // androidx.core.view.G
    public void removeMenuProvider(L provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.menuHostHelper.removeMenuProvider(provider);
    }

    @Override // androidx.core.content.c
    public final void removeOnConfigurationChangedListener(Z.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onConfigurationChangedListeners.remove(listener);
    }

    @Override // e.InterfaceC5336a
    public final void removeOnContextAvailableListener(InterfaceC5338c listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.contextAwareHelper.removeOnContextAvailableListener(listener);
    }

    @Override // androidx.core.app.x
    public final void removeOnMultiWindowModeChangedListener(Z.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onMultiWindowModeChangedListeners.remove(listener);
    }

    @Override // androidx.core.app.y
    public final void removeOnNewIntentListener(Z.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onNewIntentListeners.remove(listener);
    }

    @Override // androidx.core.app.z
    public final void removeOnPictureInPictureModeChangedListener(Z.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onPictureInPictureModeChangedListeners.remove(listener);
    }

    @Override // androidx.core.content.d
    public final void removeOnTrimMemoryListener(Z.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onTrimMemoryListeners.remove(listener);
    }

    @Override // androidx.core.app.A
    public final void removeOnUserLeaveHintListener(Runnable listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onUserLeaveHintListeners.remove(listener);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (C0.b.isEnabled()) {
                C0.b.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            getFullyDrawnReporter().fullyDrawnReported();
            C0.b.endSection();
        } catch (Throwable th) {
            C0.b.endSection();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i8) {
        initializeViewTreeOwners();
        d dVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        dVar.viewCreated(decorView);
        super.setContentView(i8);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i8) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.startActivityForResult(intent, i8);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intent, int i8, Intent intent2, int i9, int i10, int i11) throws IntentSender.SendIntentException {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.startIntentSenderForResult(intent, i8, intent2, i9, i10, i11);
    }

    @Override // androidx.core.view.G
    public void addMenuProvider(L provider, InterfaceC1025n owner) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.menuHostHelper.addMenuProvider(provider, owner);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i8, Bundle bundle) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.startActivityForResult(intent, i8, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intent, int i8, Intent intent2, int i9, int i10, int i11, Bundle bundle) throws IntentSender.SendIntentException {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.startIntentSenderForResult(intent, i8, intent2, i9, i10, i11, bundle);
    }

    @Override // androidx.core.view.G
    public void addMenuProvider(L provider, InterfaceC1025n owner, AbstractC1019h.b state) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(state, "state");
        this.menuHostHelper.addMenuProvider(provider, owner, state);
    }

    @Override // f.InterfaceC5380c
    public final <I, O> f.d registerForActivityResult(AbstractC5530a contract, InterfaceC5379b callback) {
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return registerForActivityResult(contract, this.activityResultRegistry, callback);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z8, Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z8, newConfig);
            this.dispatchingOnMultiWindowModeChanged = false;
            Iterator<Z.a> it = this.onMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new androidx.core.app.k(z8, newConfig));
            }
        } catch (Throwable th) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z8, Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z8, newConfig);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator<Z.a> it = this.onPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new androidx.core.app.C(z8, newConfig));
            }
        } catch (Throwable th) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        d dVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        dVar.viewCreated(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        d dVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        dVar.viewCreated(decorView);
        super.setContentView(view, layoutParams);
    }

    public ComponentActivity(int i8) {
        this();
        this.contentLayoutId = i8;
    }
}
