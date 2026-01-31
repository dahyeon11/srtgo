package androidx.lifecycle;

import androidx.lifecycle.AbstractC1019h;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class SavedStateHandleAttacher implements InterfaceC1023l {

    /* renamed from: a, reason: collision with root package name */
    private final D f10013a;

    public SavedStateHandleAttacher(D provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f10013a = provider;
    }

    @Override // androidx.lifecycle.InterfaceC1023l
    public void onStateChanged(InterfaceC1025n source, AbstractC1019h.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == AbstractC1019h.a.ON_CREATE) {
            source.getLifecycle().removeObserver(this);
            this.f10013a.performRestore();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + event).toString());
        }
    }
}
