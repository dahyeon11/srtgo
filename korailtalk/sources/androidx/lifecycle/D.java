package androidx.lifecycle;

import R6.AbstractC0756j;
import R6.InterfaceC0755i;
import android.os.Bundle;
import androidx.savedstate.a;
import f7.InterfaceC5519a;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class D implements a.c {

    /* renamed from: a, reason: collision with root package name */
    private final androidx.savedstate.a f9939a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f9940b;

    /* renamed from: c, reason: collision with root package name */
    private Bundle f9941c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC0755i f9942d;

    static final class a extends Lambda implements InterfaceC5519a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ N f9943a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(N n8) {
            super(0);
            this.f9943a = n8;
        }

        @Override // f7.InterfaceC5519a
        public final E invoke() {
            return C.getSavedStateHandlesVM(this.f9943a);
        }
    }

    public D(androidx.savedstate.a savedStateRegistry, N viewModelStoreOwner) {
        Intrinsics.checkNotNullParameter(savedStateRegistry, "savedStateRegistry");
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
        this.f9939a = savedStateRegistry;
        this.f9942d = AbstractC0756j.lazy(new a(viewModelStoreOwner));
    }

    private final E a() {
        return (E) this.f9942d.getValue();
    }

    public final Bundle consumeRestoredStateForKey(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        performRestore();
        Bundle bundle = this.f9941c;
        Bundle bundle2 = bundle != null ? bundle.getBundle(key) : null;
        Bundle bundle3 = this.f9941c;
        if (bundle3 != null) {
            bundle3.remove(key);
        }
        Bundle bundle4 = this.f9941c;
        if (bundle4 != null && bundle4.isEmpty()) {
            this.f9941c = null;
        }
        return bundle2;
    }

    public final void performRestore() {
        if (this.f9940b) {
            return;
        }
        Bundle bundleConsumeRestoredStateForKey = this.f9939a.consumeRestoredStateForKey("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f9941c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (bundleConsumeRestoredStateForKey != null) {
            bundle.putAll(bundleConsumeRestoredStateForKey);
        }
        this.f9941c = bundle;
        this.f9940b = true;
        a();
    }

    @Override // androidx.savedstate.a.c
    public Bundle saveState() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f9941c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry<String, B> entry : a().getHandles().entrySet()) {
            String key = entry.getKey();
            Bundle bundleSaveState = entry.getValue().savedStateProvider().saveState();
            if (!Intrinsics.areEqual(bundleSaveState, Bundle.EMPTY)) {
                bundle.putBundle(key, bundleSaveState);
            }
        }
        this.f9940b = false;
        return bundle;
    }
}
