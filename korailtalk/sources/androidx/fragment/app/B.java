package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1019h;
import androidx.lifecycle.C1026o;
import androidx.lifecycle.InterfaceC1018g;
import androidx.lifecycle.K;
import androidx.lifecycle.M;
import androidx.lifecycle.N;
import k0.AbstractC5837a;
import y0.C6511c;
import y0.InterfaceC6512d;

/* loaded from: classes.dex */
class B implements InterfaceC1018g, InterfaceC6512d, N {

    /* renamed from: a, reason: collision with root package name */
    private final Fragment f9427a;

    /* renamed from: b, reason: collision with root package name */
    private final M f9428b;

    /* renamed from: c, reason: collision with root package name */
    private K.b f9429c;

    /* renamed from: d, reason: collision with root package name */
    private C1026o f9430d = null;

    /* renamed from: e, reason: collision with root package name */
    private C6511c f9431e = null;

    B(Fragment fragment, M m8) {
        this.f9427a = fragment;
        this.f9428b = m8;
    }

    void a(AbstractC1019h.a aVar) {
        this.f9430d.handleLifecycleEvent(aVar);
    }

    void b() {
        if (this.f9430d == null) {
            this.f9430d = new C1026o(this);
            this.f9431e = C6511c.create(this);
        }
    }

    boolean c() {
        return this.f9430d != null;
    }

    void d(Bundle bundle) {
        this.f9431e.performRestore(bundle);
    }

    void e(Bundle bundle) {
        this.f9431e.performSave(bundle);
    }

    void f(AbstractC1019h.b bVar) {
        this.f9430d.setCurrentState(bVar);
    }

    @Override // androidx.lifecycle.InterfaceC1018g
    public /* bridge */ /* synthetic */ AbstractC5837a getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }

    @Override // androidx.lifecycle.InterfaceC1018g
    public K.b getDefaultViewModelProviderFactory() {
        Application application;
        K.b defaultViewModelProviderFactory = this.f9427a.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(this.f9427a.f9478V)) {
            this.f9429c = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.f9429c == null) {
            Context applicationContext = this.f9427a.requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            this.f9429c = new androidx.lifecycle.F(application, this, this.f9427a.getArguments());
        }
        return this.f9429c;
    }

    @Override // y0.InterfaceC6512d, androidx.activity.t
    public AbstractC1019h getLifecycle() {
        b();
        return this.f9430d;
    }

    @Override // y0.InterfaceC6512d
    public androidx.savedstate.a getSavedStateRegistry() {
        b();
        return this.f9431e.getSavedStateRegistry();
    }

    @Override // androidx.lifecycle.N
    public M getViewModelStore() {
        b();
        return this.f9428b;
    }
}
