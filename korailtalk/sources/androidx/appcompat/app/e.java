package androidx.appcompat.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.x0;
import androidx.core.app.AbstractC0918b;
import androidx.core.app.F;
import androidx.fragment.app.ActivityC1010e;
import androidx.lifecycle.O;
import androidx.lifecycle.P;
import androidx.savedstate.a;
import e.InterfaceC5338c;
import l.AbstractC5876b;
import y0.AbstractC6513e;

/* loaded from: classes.dex */
public class e extends ActivityC1010e implements f, F.a, c {
    private static final String DELEGATE_TAG = "androidx:appcompat";
    private g mDelegate;
    private Resources mResources;

    class a implements a.c {
        a() {
        }

        @Override // androidx.savedstate.a.c
        public Bundle saveState() {
            Bundle bundle = new Bundle();
            e.this.getDelegate().onSaveInstanceState(bundle);
            return bundle;
        }
    }

    class b implements InterfaceC5338c {
        b() {
        }

        @Override // e.InterfaceC5338c
        public void onContextAvailable(Context context) {
            g delegate = e.this.getDelegate();
            delegate.installViewFactory();
            delegate.onCreate(e.this.getSavedStateRegistry().consumeRestoredStateForKey(e.DELEGATE_TAG));
        }
    }

    public e() {
        s();
    }

    private void s() {
        getSavedStateRegistry().registerSavedStateProvider(DELEGATE_TAG, new a());
        addOnContextAvailableListener(new b());
    }

    private void t() {
        O.set(getWindow().getDecorView(), this);
        P.set(getWindow().getDecorView(), this);
        AbstractC6513e.set(getWindow().getDecorView(), this);
    }

    private boolean u(KeyEvent keyEvent) {
        Window window;
        return (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        t();
        getDelegate().addContentView(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(getDelegate().attachBaseContext2(context));
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        androidx.appcompat.app.a supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.closeOptionsMenu()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // androidx.core.app.i, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        androidx.appcompat.app.a supportActionBar = getSupportActionBar();
        if (keyCode == 82 && supportActionBar != null && supportActionBar.onMenuKeyEvent(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i8) {
        return (T) getDelegate().findViewById(i8);
    }

    public g getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = g.create(this, this);
        }
        return this.mDelegate;
    }

    @Override // androidx.appcompat.app.c
    public androidx.appcompat.app.b getDrawerToggleDelegate() {
        return getDelegate().getDrawerToggleDelegate();
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return getDelegate().getMenuInflater();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.mResources == null && x0.shouldBeUsed()) {
            this.mResources = new x0(this, super.getResources());
        }
        Resources resources = this.mResources;
        return resources == null ? super.getResources() : resources;
    }

    public androidx.appcompat.app.a getSupportActionBar() {
        return getDelegate().getSupportActionBar();
    }

    @Override // androidx.core.app.F.a
    public Intent getSupportParentActivityIntent() {
        return androidx.core.app.l.getParentActivityIntent(this);
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        getDelegate().invalidateOptionsMenu();
    }

    @Override // androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        getDelegate().onConfigurationChanged(configuration);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        onSupportContentChanged();
    }

    public void onCreateSupportNavigateUpTaskStack(F f8) {
        f8.addParentStack(this);
    }

    @Override // androidx.fragment.app.ActivityC1010e, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        getDelegate().onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i8, KeyEvent keyEvent) {
        if (u(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i8, keyEvent);
    }

    @Override // androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i8, MenuItem menuItem) {
        if (super.onMenuItemSelected(i8, menuItem)) {
            return true;
        }
        androidx.appcompat.app.a supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.getDisplayOptions() & 4) == 0) {
            return false;
        }
        return onSupportNavigateUp();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i8, Menu menu) {
        return super.onMenuOpened(i8, menu);
    }

    protected void onNightModeChanged(int i8) {
    }

    @Override // androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i8, Menu menu) {
        super.onPanelClosed(i8, menu);
    }

    @Override // android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        getDelegate().onPostCreate(bundle);
    }

    @Override // androidx.fragment.app.ActivityC1010e, android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        getDelegate().onPostResume();
    }

    public void onPrepareSupportNavigateUpTaskStack(F f8) {
    }

    @Override // androidx.fragment.app.ActivityC1010e, android.app.Activity
    protected void onStart() {
        super.onStart();
        getDelegate().onStart();
    }

    @Override // androidx.fragment.app.ActivityC1010e, android.app.Activity
    protected void onStop() {
        super.onStop();
        getDelegate().onStop();
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            return false;
        }
        if (!supportShouldUpRecreateTask(supportParentActivityIntent)) {
            supportNavigateUpTo(supportParentActivityIntent);
            return true;
        }
        F fCreate = F.create(this);
        onCreateSupportNavigateUpTaskStack(fCreate);
        onPrepareSupportNavigateUpTaskStack(fCreate);
        fCreate.startActivities();
        try {
            AbstractC0918b.finishAffinity(this);
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    @Override // android.app.Activity
    protected void onTitleChanged(CharSequence charSequence, int i8) {
        super.onTitleChanged(charSequence, i8);
        getDelegate().setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.f
    public AbstractC5876b onWindowStartingSupportActionMode(AbstractC5876b.a aVar) {
        return null;
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        androidx.appcompat.app.a supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.openOptionsMenu()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i8) {
        t();
        getDelegate().setContentView(i8);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        getDelegate().setSupportActionBar(toolbar);
    }

    @Deprecated
    public void setSupportProgress(int i8) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean z8) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z8) {
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean z8) {
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i8) {
        super.setTheme(i8);
        getDelegate().setTheme(i8);
    }

    public AbstractC5876b startSupportActionMode(AbstractC5876b.a aVar) {
        return getDelegate().startSupportActionMode(aVar);
    }

    @Override // androidx.fragment.app.ActivityC1010e
    public void supportInvalidateOptionsMenu() {
        getDelegate().invalidateOptionsMenu();
    }

    public void supportNavigateUpTo(Intent intent) {
        androidx.core.app.l.navigateUpTo(this, intent);
    }

    public boolean supportRequestWindowFeature(int i8) {
        return getDelegate().requestWindowFeature(i8);
    }

    public boolean supportShouldUpRecreateTask(Intent intent) {
        return androidx.core.app.l.shouldUpRecreateTask(this, intent);
    }

    public e(int i8) {
        super(i8);
        s();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        t();
        getDelegate().setContentView(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        t();
        getDelegate().setContentView(view, layoutParams);
    }

    @Override // androidx.appcompat.app.f
    public void onSupportActionModeFinished(AbstractC5876b abstractC5876b) {
    }

    @Override // androidx.appcompat.app.f
    public void onSupportActionModeStarted(AbstractC5876b abstractC5876b) {
    }
}
