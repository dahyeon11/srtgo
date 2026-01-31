package androidx.fragment.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.N;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private final j f9728a;

    private h(j jVar) {
        this.f9728a = jVar;
    }

    public static h createController(j jVar) {
        return new h((j) Z.h.checkNotNull(jVar, "callbacks == null"));
    }

    public void attachHost(Fragment fragment) {
        j jVar = this.f9728a;
        jVar.f9734e.j(jVar, jVar, fragment);
    }

    public void dispatchActivityCreated() {
        this.f9728a.f9734e.w();
    }

    public void dispatchConfigurationChanged(Configuration configuration) {
        this.f9728a.f9734e.y(configuration);
    }

    public boolean dispatchContextItemSelected(MenuItem menuItem) {
        return this.f9728a.f9734e.z(menuItem);
    }

    public void dispatchCreate() {
        this.f9728a.f9734e.A();
    }

    public boolean dispatchCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        return this.f9728a.f9734e.B(menu, menuInflater);
    }

    public void dispatchDestroy() {
        this.f9728a.f9734e.C();
    }

    public void dispatchDestroyView() {
        this.f9728a.f9734e.D();
    }

    public void dispatchLowMemory() {
        this.f9728a.f9734e.E();
    }

    public void dispatchMultiWindowModeChanged(boolean z8) {
        this.f9728a.f9734e.F(z8);
    }

    public boolean dispatchOptionsItemSelected(MenuItem menuItem) {
        return this.f9728a.f9734e.H(menuItem);
    }

    public void dispatchOptionsMenuClosed(Menu menu) {
        this.f9728a.f9734e.I(menu);
    }

    public void dispatchPause() {
        this.f9728a.f9734e.K();
    }

    public void dispatchPictureInPictureModeChanged(boolean z8) {
        this.f9728a.f9734e.L(z8);
    }

    public boolean dispatchPrepareOptionsMenu(Menu menu) {
        return this.f9728a.f9734e.M(menu);
    }

    @Deprecated
    public void dispatchReallyStop() {
    }

    public void dispatchResume() {
        this.f9728a.f9734e.O();
    }

    public void dispatchStart() {
        this.f9728a.f9734e.P();
    }

    public void dispatchStop() {
        this.f9728a.f9734e.R();
    }

    @Deprecated
    public void doLoaderDestroy() {
    }

    @Deprecated
    public void doLoaderRetain() {
    }

    @Deprecated
    public void doLoaderStart() {
    }

    @Deprecated
    public void doLoaderStop(boolean z8) {
    }

    @Deprecated
    public void dumpLoaders(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public boolean execPendingActions() {
        return this.f9728a.f9734e.X(true);
    }

    public Fragment findFragmentByWho(String str) {
        return this.f9728a.f9734e.d0(str);
    }

    public List<Fragment> getActiveFragments(List<Fragment> list) {
        return this.f9728a.f9734e.i0();
    }

    public int getActiveFragmentsCount() {
        return this.f9728a.f9734e.h0();
    }

    public FragmentManager getSupportFragmentManager() {
        return this.f9728a.f9734e;
    }

    @Deprecated
    public androidx.loader.app.a getSupportLoaderManager() {
        throw new UnsupportedOperationException("Loaders are managed separately from FragmentController, use LoaderManager.getInstance() to obtain a LoaderManager.");
    }

    public void noteStateNotSaved() {
        this.f9728a.f9734e.K0();
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f9728a.f9734e.o0().onCreateView(view, str, context, attributeSet);
    }

    @Deprecated
    public void reportLoaderStart() {
    }

    @Deprecated
    public void restoreAllState(Parcelable parcelable, List<Fragment> list) {
        this.f9728a.f9734e.V0(parcelable, new n(list, null, null));
    }

    public void restoreSaveState(Parcelable parcelable) {
        j jVar = this.f9728a;
        if (!(jVar instanceof N)) {
            throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
        }
        jVar.f9734e.W0(parcelable);
    }

    @Deprecated
    public O.h retainLoaderNonConfig() {
        return null;
    }

    @Deprecated
    public n retainNestedNonConfig() {
        return this.f9728a.f9734e.X0();
    }

    @Deprecated
    public List<Fragment> retainNonConfig() {
        n nVarX0 = this.f9728a.f9734e.X0();
        if (nVarX0 == null || nVarX0.b() == null) {
            return null;
        }
        return new ArrayList(nVarX0.b());
    }

    public Parcelable saveAllState() {
        return this.f9728a.f9734e.Z0();
    }

    @Deprecated
    public void restoreAllState(Parcelable parcelable, n nVar) {
        this.f9728a.f9734e.V0(parcelable, nVar);
    }

    @Deprecated
    public void restoreLoaderNonConfig(O.h hVar) {
    }
}
