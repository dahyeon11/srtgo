package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1019h;
import androidx.lifecycle.K;
import androidx.savedstate.a;
import k0.AbstractC5837a;
import k0.C5839c;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import y0.InterfaceC6512d;

/* loaded from: classes.dex */
public abstract class C {
    public static final AbstractC5837a.b SAVED_STATE_REGISTRY_OWNER_KEY = new b();
    public static final AbstractC5837a.b VIEW_MODEL_STORE_OWNER_KEY = new c();
    public static final AbstractC5837a.b DEFAULT_ARGS_KEY = new a();

    public static final class a implements AbstractC5837a.b {
        a() {
        }
    }

    public static final class b implements AbstractC5837a.b {
        b() {
        }
    }

    public static final class c implements AbstractC5837a.b {
        c() {
        }
    }

    static final class d extends Lambda implements f7.l {
        public static final d INSTANCE = new d();

        d() {
            super(1);
        }

        @Override // f7.l
        public final E invoke(AbstractC5837a initializer) {
            Intrinsics.checkNotNullParameter(initializer, "$this$initializer");
            return new E();
        }
    }

    private static final B a(InterfaceC6512d interfaceC6512d, N n8, String str, Bundle bundle) {
        D savedStateHandlesProvider = getSavedStateHandlesProvider(interfaceC6512d);
        E savedStateHandlesVM = getSavedStateHandlesVM(n8);
        B b9 = savedStateHandlesVM.getHandles().get(str);
        if (b9 != null) {
            return b9;
        }
        B bCreateHandle = B.Companion.createHandle(savedStateHandlesProvider.consumeRestoredStateForKey(str), bundle);
        savedStateHandlesVM.getHandles().put(str, bCreateHandle);
        return bCreateHandle;
    }

    public static final B createSavedStateHandle(AbstractC5837a abstractC5837a) {
        Intrinsics.checkNotNullParameter(abstractC5837a, "<this>");
        InterfaceC6512d interfaceC6512d = (InterfaceC6512d) abstractC5837a.get(SAVED_STATE_REGISTRY_OWNER_KEY);
        if (interfaceC6512d == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        N n8 = (N) abstractC5837a.get(VIEW_MODEL_STORE_OWNER_KEY);
        if (n8 == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) abstractC5837a.get(DEFAULT_ARGS_KEY);
        String str = (String) abstractC5837a.get(K.c.VIEW_MODEL_KEY);
        if (str != null) {
            return a(interfaceC6512d, n8, str, bundle);
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
    }

    public static final <T extends InterfaceC6512d & N> void enableSavedStateHandles(T t8) {
        Intrinsics.checkNotNullParameter(t8, "<this>");
        AbstractC1019h.b currentState = t8.getLifecycle().getCurrentState();
        if (currentState != AbstractC1019h.b.INITIALIZED && currentState != AbstractC1019h.b.CREATED) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (t8.getSavedStateRegistry().getSavedStateProvider("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            D d9 = new D(t8.getSavedStateRegistry(), t8);
            t8.getSavedStateRegistry().registerSavedStateProvider("androidx.lifecycle.internal.SavedStateHandlesProvider", d9);
            t8.getLifecycle().addObserver(new SavedStateHandleAttacher(d9));
        }
    }

    public static final D getSavedStateHandlesProvider(InterfaceC6512d interfaceC6512d) {
        Intrinsics.checkNotNullParameter(interfaceC6512d, "<this>");
        a.c savedStateProvider = interfaceC6512d.getSavedStateRegistry().getSavedStateProvider("androidx.lifecycle.internal.SavedStateHandlesProvider");
        D d9 = savedStateProvider instanceof D ? (D) savedStateProvider : null;
        if (d9 != null) {
            return d9;
        }
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }

    public static final E getSavedStateHandlesVM(N n8) {
        Intrinsics.checkNotNullParameter(n8, "<this>");
        C5839c c5839c = new C5839c();
        c5839c.addInitializer(Reflection.getOrCreateKotlinClass(E.class), d.INSTANCE);
        return (E) new K(n8, c5839c.build()).get("androidx.lifecycle.internal.SavedStateHandlesVM", E.class);
    }
}
