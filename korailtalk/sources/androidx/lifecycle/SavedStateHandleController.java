package androidx.lifecycle;

import androidx.lifecycle.AbstractC1019h;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nSavedStateHandleController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandleController.kt\nandroidx/lifecycle/SavedStateHandleController\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,41:1\n1#2:42\n*E\n"})
/* loaded from: classes.dex */
public final class SavedStateHandleController implements InterfaceC1023l {

    /* renamed from: a, reason: collision with root package name */
    private final String f10014a;

    /* renamed from: b, reason: collision with root package name */
    private final B f10015b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f10016c;

    public SavedStateHandleController(String key, B handle) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(handle, "handle");
        this.f10014a = key;
        this.f10015b = handle;
    }

    public final void attachToLifecycle(androidx.savedstate.a registry, AbstractC1019h lifecycle) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        if (this.f10016c) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f10016c = true;
        lifecycle.addObserver(this);
        registry.registerSavedStateProvider(this.f10014a, this.f10015b.savedStateProvider());
    }

    public final B getHandle() {
        return this.f10015b;
    }

    public final boolean isAttached() {
        return this.f10016c;
    }

    @Override // androidx.lifecycle.InterfaceC1023l
    public void onStateChanged(InterfaceC1025n source, AbstractC1019h.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == AbstractC1019h.a.ON_DESTROY) {
            this.f10016c = false;
            source.getLifecycle().removeObserver(this);
        }
    }
}
