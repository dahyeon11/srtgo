package y0;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1019h;
import androidx.savedstate.Recreator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: y0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6511c {
    public static final a Companion = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6512d f37556a;

    /* renamed from: b, reason: collision with root package name */
    private final androidx.savedstate.a f37557b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f37558c;

    /* renamed from: y0.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C6511c create(InterfaceC6512d owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            return new C6511c(owner, null);
        }

        private a() {
        }
    }

    public /* synthetic */ C6511c(InterfaceC6512d interfaceC6512d, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC6512d);
    }

    public static final C6511c create(InterfaceC6512d interfaceC6512d) {
        return Companion.create(interfaceC6512d);
    }

    public final androidx.savedstate.a getSavedStateRegistry() {
        return this.f37557b;
    }

    public final void performAttach() {
        AbstractC1019h lifecycle = this.f37556a.getLifecycle();
        if (lifecycle.getCurrentState() != AbstractC1019h.b.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        lifecycle.addObserver(new Recreator(this.f37556a));
        this.f37557b.performAttach$savedstate_release(lifecycle);
        this.f37558c = true;
    }

    public final void performRestore(Bundle bundle) {
        if (!this.f37558c) {
            performAttach();
        }
        AbstractC1019h lifecycle = this.f37556a.getLifecycle();
        if (!lifecycle.getCurrentState().isAtLeast(AbstractC1019h.b.STARTED)) {
            this.f37557b.performRestore$savedstate_release(bundle);
            return;
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + lifecycle.getCurrentState()).toString());
    }

    public final void performSave(Bundle outBundle) {
        Intrinsics.checkNotNullParameter(outBundle, "outBundle");
        this.f37557b.performSave(outBundle);
    }

    private C6511c(InterfaceC6512d interfaceC6512d) {
        this.f37556a = interfaceC6512d;
        this.f37557b = new androidx.savedstate.a();
    }
}
