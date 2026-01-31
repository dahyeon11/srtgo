package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1019h;
import androidx.lifecycle.LegacySavedStateHandleController;
import androidx.savedstate.a;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import y0.InterfaceC6512d;

/* loaded from: classes.dex */
public final class LegacySavedStateHandleController {
    public static final LegacySavedStateHandleController INSTANCE = new LegacySavedStateHandleController();
    public static final String TAG_SAVED_STATE_HANDLE_CONTROLLER = "androidx.lifecycle.savedstate.vm.tag";

    public static final class a implements a.InterfaceC0170a {
        @Override // androidx.savedstate.a.InterfaceC0170a
        public void onRecreated(InterfaceC6512d owner) throws NoSuchMethodException, SecurityException {
            Intrinsics.checkNotNullParameter(owner, "owner");
            if (!(owner instanceof N)) {
                throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
            }
            M viewModelStore = ((N) owner).getViewModelStore();
            androidx.savedstate.a savedStateRegistry = owner.getSavedStateRegistry();
            Iterator<String> it = viewModelStore.keys().iterator();
            while (it.hasNext()) {
                J j8 = viewModelStore.get(it.next());
                Intrinsics.checkNotNull(j8);
                LegacySavedStateHandleController.attachHandleIfNeeded(j8, savedStateRegistry, owner.getLifecycle());
            }
            if (viewModelStore.keys().isEmpty()) {
                return;
            }
            savedStateRegistry.runOnNextRecreation(a.class);
        }
    }

    private LegacySavedStateHandleController() {
    }

    private final void a(final androidx.savedstate.a aVar, final AbstractC1019h abstractC1019h) throws NoSuchMethodException, SecurityException {
        AbstractC1019h.b currentState = abstractC1019h.getCurrentState();
        if (currentState == AbstractC1019h.b.INITIALIZED || currentState.isAtLeast(AbstractC1019h.b.STARTED)) {
            aVar.runOnNextRecreation(a.class);
        } else {
            abstractC1019h.addObserver(new InterfaceC1023l() { // from class: androidx.lifecycle.LegacySavedStateHandleController$tryToAddRecreator$1
                @Override // androidx.lifecycle.InterfaceC1023l
                public void onStateChanged(InterfaceC1025n source, AbstractC1019h.a event) throws NoSuchMethodException, SecurityException {
                    Intrinsics.checkNotNullParameter(source, "source");
                    Intrinsics.checkNotNullParameter(event, "event");
                    if (event == AbstractC1019h.a.ON_START) {
                        abstractC1019h.removeObserver(this);
                        aVar.runOnNextRecreation(LegacySavedStateHandleController.a.class);
                    }
                }
            });
        }
    }

    public static final void attachHandleIfNeeded(J viewModel, androidx.savedstate.a registry, AbstractC1019h lifecycle) throws NoSuchMethodException, SecurityException {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) viewModel.c(TAG_SAVED_STATE_HANDLE_CONTROLLER);
        if (savedStateHandleController == null || savedStateHandleController.isAttached()) {
            return;
        }
        savedStateHandleController.attachToLifecycle(registry, lifecycle);
        INSTANCE.a(registry, lifecycle);
    }

    public static final SavedStateHandleController create(androidx.savedstate.a registry, AbstractC1019h lifecycle, String str, Bundle bundle) throws NoSuchMethodException, SecurityException {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNull(str);
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, B.Companion.createHandle(registry.consumeRestoredStateForKey(str), bundle));
        savedStateHandleController.attachToLifecycle(registry, lifecycle);
        INSTANCE.a(registry, lifecycle);
        return savedStateHandleController;
    }
}
