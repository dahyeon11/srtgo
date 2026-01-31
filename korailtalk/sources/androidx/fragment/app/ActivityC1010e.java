package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.core.app.AbstractC0918b;
import androidx.lifecycle.AbstractC1019h;
import androidx.lifecycle.C1026o;
import androidx.lifecycle.M;
import androidx.lifecycle.N;
import androidx.savedstate.a;
import e.InterfaceC5338c;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: androidx.fragment.app.e */
/* loaded from: classes.dex */
public class ActivityC1010e extends ComponentActivity implements AbstractC0918b.h, AbstractC0918b.j {
    static final String FRAGMENTS_TAG = "android:support:fragments";
    boolean mCreated;
    final C1026o mFragmentLifecycleRegistry;
    final h mFragments;
    boolean mResumed;
    boolean mStopped;

    /* renamed from: androidx.fragment.app.e$a */
    class a implements a.c {
        a() {
        }

        @Override // androidx.savedstate.a.c
        public Bundle saveState() {
            Bundle bundle = new Bundle();
            ActivityC1010e.this.markFragmentsCreated();
            ActivityC1010e.this.mFragmentLifecycleRegistry.handleLifecycleEvent(AbstractC1019h.a.ON_STOP);
            Parcelable parcelableSaveAllState = ActivityC1010e.this.mFragments.saveAllState();
            if (parcelableSaveAllState != null) {
                bundle.putParcelable(ActivityC1010e.FRAGMENTS_TAG, parcelableSaveAllState);
            }
            return bundle;
        }
    }

    /* renamed from: androidx.fragment.app.e$b */
    class b implements InterfaceC5338c {
        b() {
        }

        @Override // e.InterfaceC5338c
        public void onContextAvailable(Context context) {
            ActivityC1010e.this.mFragments.attachHost(null);
            Bundle bundleConsumeRestoredStateForKey = ActivityC1010e.this.getSavedStateRegistry().consumeRestoredStateForKey(ActivityC1010e.FRAGMENTS_TAG);
            if (bundleConsumeRestoredStateForKey != null) {
                ActivityC1010e.this.mFragments.restoreSaveState(bundleConsumeRestoredStateForKey.getParcelable(ActivityC1010e.FRAGMENTS_TAG));
            }
        }
    }

    /* renamed from: androidx.fragment.app.e$c */
    class c extends j implements N, androidx.activity.t, f.g, q {
        public c() {
            super(ActivityC1010e.this);
        }

        @Override // f.g
        public f.f getActivityResultRegistry() {
            return ActivityC1010e.this.getActivityResultRegistry();
        }

        @Override // androidx.activity.t
        public AbstractC1019h getLifecycle() {
            return ActivityC1010e.this.mFragmentLifecycleRegistry;
        }

        @Override // androidx.activity.t
        public OnBackPressedDispatcher getOnBackPressedDispatcher() {
            return ActivityC1010e.this.getOnBackPressedDispatcher();
        }

        @Override // androidx.lifecycle.N
        public M getViewModelStore() {
            return ActivityC1010e.this.getViewModelStore();
        }

        @Override // androidx.fragment.app.q
        public void onAttachFragment(FragmentManager fragmentManager, Fragment fragment) {
            ActivityC1010e.this.onAttachFragment(fragment);
        }

        @Override // androidx.fragment.app.j
        public void onDump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            ActivityC1010e.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // androidx.fragment.app.j, androidx.fragment.app.g
        public View onFindViewById(int i8) {
            return ActivityC1010e.this.findViewById(i8);
        }

        @Override // androidx.fragment.app.j
        public LayoutInflater onGetLayoutInflater() {
            return ActivityC1010e.this.getLayoutInflater().cloneInContext(ActivityC1010e.this);
        }

        @Override // androidx.fragment.app.j
        public int onGetWindowAnimations() {
            Window window = ActivityC1010e.this.getWindow();
            if (window == null) {
                return 0;
            }
            return window.getAttributes().windowAnimations;
        }

        @Override // androidx.fragment.app.j, androidx.fragment.app.g
        public boolean onHasView() {
            Window window = ActivityC1010e.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.fragment.app.j
        public boolean onHasWindowAnimations() {
            return ActivityC1010e.this.getWindow() != null;
        }

        @Override // androidx.fragment.app.j
        public boolean onShouldSaveFragmentState(Fragment fragment) {
            return !ActivityC1010e.this.isFinishing();
        }

        @Override // androidx.fragment.app.j
        public boolean onShouldShowRequestPermissionRationale(String str) {
            return AbstractC0918b.shouldShowRequestPermissionRationale(ActivityC1010e.this, str);
        }

        @Override // androidx.fragment.app.j
        public void onSupportInvalidateOptionsMenu() {
            ActivityC1010e.this.supportInvalidateOptionsMenu();
        }

        @Override // androidx.fragment.app.j
        public ActivityC1010e onGetHost() {
            return ActivityC1010e.this;
        }
    }

    public ActivityC1010e() {
        this.mFragments = h.createController(new c());
        this.mFragmentLifecycleRegistry = new C1026o(this);
        this.mStopped = true;
        q();
    }

    private void q() {
        getSavedStateRegistry().registerSavedStateProvider(FRAGMENTS_TAG, new a());
        addOnContextAvailableListener(new b());
    }

    private static boolean r(FragmentManager fragmentManager, AbstractC1019h.b bVar) {
        boolean zR = false;
        for (Fragment fragment : fragmentManager.getFragments()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    zR |= r(fragment.getChildFragmentManager(), bVar);
                }
                B b9 = fragment.f9476T;
                if (b9 != null && b9.getLifecycle().getCurrentState().isAtLeast(AbstractC1019h.b.STARTED)) {
                    fragment.f9476T.f(bVar);
                    zR = true;
                }
                if (fragment.f9475S.getCurrentState().isAtLeast(AbstractC1019h.b.STARTED)) {
                    fragment.f9475S.setCurrentState(bVar);
                    zR = true;
                }
            }
        }
        return zR;
    }

    final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.onCreateView(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.mCreated);
        printWriter.print(" mResumed=");
        printWriter.print(this.mResumed);
        printWriter.print(" mStopped=");
        printWriter.print(this.mStopped);
        if (getApplication() != null) {
            androidx.loader.app.a.getInstance(this).dump(str2, fileDescriptor, printWriter, strArr);
        }
        this.mFragments.getSupportFragmentManager().dump(str, fileDescriptor, printWriter, strArr);
    }

    public FragmentManager getSupportFragmentManager() {
        return this.mFragments.getSupportFragmentManager();
    }

    @Deprecated
    public androidx.loader.app.a getSupportLoaderManager() {
        return androidx.loader.app.a.getInstance(this);
    }

    void markFragmentsCreated() {
        while (r(getSupportFragmentManager(), AbstractC1019h.b.CREATED)) {
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i8, int i9, Intent intent) {
        this.mFragments.noteStateNotSaved();
        super.onActivityResult(i8, i9, intent);
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.mFragments.noteStateNotSaved();
        super.onConfigurationChanged(configuration);
        this.mFragments.dispatchConfigurationChanged(configuration);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(AbstractC1019h.a.ON_CREATE);
        this.mFragments.dispatchCreate();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i8, Menu menu) {
        return i8 == 0 ? super.onCreatePanelMenu(i8, menu) | this.mFragments.dispatchCreateOptionsMenu(menu, getMenuInflater()) : super.onCreatePanelMenu(i8, menu);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.mFragments.dispatchDestroy();
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(AbstractC1019h.a.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.mFragments.dispatchLowMemory();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i8, MenuItem menuItem) {
        if (super.onMenuItemSelected(i8, menuItem)) {
            return true;
        }
        if (i8 == 0) {
            return this.mFragments.dispatchOptionsItemSelected(menuItem);
        }
        if (i8 != 6) {
            return false;
        }
        return this.mFragments.dispatchContextItemSelected(menuItem);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onMultiWindowModeChanged(boolean z8) {
        this.mFragments.dispatchMultiWindowModeChanged(z8);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    protected void onNewIntent(Intent intent) {
        this.mFragments.noteStateNotSaved();
        super.onNewIntent(intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i8, Menu menu) {
        if (i8 == 0) {
            this.mFragments.dispatchOptionsMenuClosed(menu);
        }
        super.onPanelClosed(i8, menu);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.dispatchPause();
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(AbstractC1019h.a.ON_PAUSE);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onPictureInPictureModeChanged(boolean z8) {
        this.mFragments.dispatchPictureInPictureModeChanged(z8);
    }

    @Override // android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Deprecated
    protected boolean onPrepareOptionsPanel(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i8, View view, Menu menu) {
        return i8 == 0 ? onPrepareOptionsPanel(view, menu) | this.mFragments.dispatchPrepareOptionsMenu(menu) : super.onPreparePanel(i8, view, menu);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i8, String[] strArr, int[] iArr) {
        this.mFragments.noteStateNotSaved();
        super.onRequestPermissionsResult(i8, strArr, iArr);
    }

    @Override // android.app.Activity
    protected void onResume() {
        this.mFragments.noteStateNotSaved();
        super.onResume();
        this.mResumed = true;
        this.mFragments.execPendingActions();
    }

    protected void onResumeFragments() {
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(AbstractC1019h.a.ON_RESUME);
        this.mFragments.dispatchResume();
    }

    @Override // android.app.Activity
    protected void onStart() {
        this.mFragments.noteStateNotSaved();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            this.mFragments.dispatchActivityCreated();
        }
        this.mFragments.execPendingActions();
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(AbstractC1019h.a.ON_START);
        this.mFragments.dispatchStart();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.noteStateNotSaved();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        this.mFragments.dispatchStop();
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(AbstractC1019h.a.ON_STOP);
    }

    public void setEnterSharedElementCallback(androidx.core.app.E e8) {
        AbstractC0918b.setEnterSharedElementCallback(this, e8);
    }

    public void setExitSharedElementCallback(androidx.core.app.E e8) {
        AbstractC0918b.setExitSharedElementCallback(this, e8);
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i8) {
        startActivityFromFragment(fragment, intent, i8, (Bundle) null);
    }

    @Deprecated
    public void startIntentSenderFromFragment(Fragment fragment, IntentSender intentSender, int i8, Intent intent, int i9, int i10, int i11, Bundle bundle) throws IntentSender.SendIntentException {
        if (i8 == -1) {
            AbstractC0918b.startIntentSenderForResult(this, intentSender, i8, intent, i9, i10, i11, bundle);
        } else {
            fragment.startIntentSenderForResult(intentSender, i8, intent, i9, i10, i11, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        AbstractC0918b.finishAfterTransition(this);
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateOptionsMenu();
    }

    public void supportPostponeEnterTransition() {
        AbstractC0918b.postponeEnterTransition(this);
    }

    public void supportStartPostponedEnterTransition() {
        AbstractC0918b.startPostponedEnterTransition(this);
    }

    @Override // androidx.core.app.AbstractC0918b.j
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i8) {
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i8, Bundle bundle) {
        if (i8 == -1) {
            AbstractC0918b.startActivityForResult(this, intent, -1, bundle);
        } else {
            fragment.startActivityForResult(intent, i8, bundle);
        }
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    public ActivityC1010e(int i8) {
        super(i8);
        this.mFragments = h.createController(new c());
        this.mFragmentLifecycleRegistry = new C1026o(this);
        this.mStopped = true;
        q();
    }
}
