package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1019h;
import androidx.lifecycle.InterfaceC1023l;
import androidx.lifecycle.InterfaceC1025n;
import androidx.savedstate.Recreator;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C6021b;
import y0.InterfaceC6512d;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: g, reason: collision with root package name */
    private static final b f10762g = new b(null);

    /* renamed from: b, reason: collision with root package name */
    private boolean f10764b;

    /* renamed from: c, reason: collision with root package name */
    private Bundle f10765c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f10766d;

    /* renamed from: e, reason: collision with root package name */
    private Recreator.b f10767e;

    /* renamed from: a, reason: collision with root package name */
    private final C6021b f10763a = new C6021b();

    /* renamed from: f, reason: collision with root package name */
    private boolean f10768f = true;

    /* renamed from: androidx.savedstate.a$a, reason: collision with other inner class name */
    public interface InterfaceC0170a {
        void onRecreated(InterfaceC6512d interfaceC6512d);
    }

    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public interface c {
        Bundle saveState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(a this$0, InterfaceC1025n interfaceC1025n, AbstractC1019h.a event) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(interfaceC1025n, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == AbstractC1019h.a.ON_START) {
            this$0.f10768f = true;
        } else if (event == AbstractC1019h.a.ON_STOP) {
            this$0.f10768f = false;
        }
    }

    public final Bundle consumeRestoredStateForKey(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (!this.f10766d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = this.f10765c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle != null ? bundle.getBundle(key) : null;
        Bundle bundle3 = this.f10765c;
        if (bundle3 != null) {
            bundle3.remove(key);
        }
        Bundle bundle4 = this.f10765c;
        if (bundle4 == null || bundle4.isEmpty()) {
            this.f10765c = null;
        }
        return bundle2;
    }

    public final c getSavedStateProvider(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Iterator<Map.Entry<Object, Object>> it = this.f10763a.iterator();
        while (it.hasNext()) {
            Map.Entry<Object, Object> components = it.next();
            Intrinsics.checkNotNullExpressionValue(components, "components");
            String str = (String) components.getKey();
            c cVar = (c) components.getValue();
            if (Intrinsics.areEqual(str, key)) {
                return cVar;
            }
        }
        return null;
    }

    public final boolean isAllowingSavingState$savedstate_release() {
        return this.f10768f;
    }

    public final boolean isRestored() {
        return this.f10766d;
    }

    public final void performAttach$savedstate_release(AbstractC1019h lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        if (this.f10764b) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        lifecycle.addObserver(new InterfaceC1023l() { // from class: y0.b
            @Override // androidx.lifecycle.InterfaceC1023l
            public final void onStateChanged(InterfaceC1025n interfaceC1025n, AbstractC1019h.a aVar) {
                androidx.savedstate.a.b(this.f37555a, interfaceC1025n, aVar);
            }
        });
        this.f10764b = true;
    }

    public final void performRestore$savedstate_release(Bundle bundle) {
        if (!this.f10764b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (this.f10766d) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        this.f10765c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        this.f10766d = true;
    }

    public final void performSave(Bundle outBundle) {
        Intrinsics.checkNotNullParameter(outBundle, "outBundle");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f10765c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        C6021b.d dVarIteratorWithAdditions = this.f10763a.iteratorWithAdditions();
        Intrinsics.checkNotNullExpressionValue(dVarIteratorWithAdditions, "this.components.iteratorWithAdditions()");
        while (dVarIteratorWithAdditions.hasNext()) {
            Map.Entry entry = (Map.Entry) dVarIteratorWithAdditions.next();
            bundle.putBundle((String) entry.getKey(), ((c) entry.getValue()).saveState());
        }
        if (bundle.isEmpty()) {
            return;
        }
        outBundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
    }

    public final void registerSavedStateProvider(String key, c provider) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(provider, "provider");
        if (((c) this.f10763a.putIfAbsent(key, provider)) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public final void runOnNextRecreation(Class<? extends InterfaceC0170a> clazz) throws NoSuchMethodException, SecurityException {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        if (!this.f10768f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        Recreator.b bVar = this.f10767e;
        if (bVar == null) {
            bVar = new Recreator.b(this);
        }
        this.f10767e = bVar;
        try {
            clazz.getDeclaredConstructor(null);
            Recreator.b bVar2 = this.f10767e;
            if (bVar2 != null) {
                String name = clazz.getName();
                Intrinsics.checkNotNullExpressionValue(name, "clazz.name");
                bVar2.add(name);
            }
        } catch (NoSuchMethodException e8) {
            throw new IllegalArgumentException("Class " + clazz.getSimpleName() + " must have default constructor in order to be automatically recreated", e8);
        }
    }

    public final void setAllowingSavingState$savedstate_release(boolean z8) {
        this.f10768f = z8;
    }

    public final void unregisterSavedStateProvider(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f10763a.remove(key);
    }
}
