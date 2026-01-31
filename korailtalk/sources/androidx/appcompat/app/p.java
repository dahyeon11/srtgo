package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.SpinnerAdapter;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.P;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.s0;
import androidx.core.view.AbstractC0985p0;
import java.util.ArrayList;

/* loaded from: classes.dex */
class p extends androidx.appcompat.app.a {

    /* renamed from: a */
    P f6437a;

    /* renamed from: b */
    boolean f6438b;

    /* renamed from: c */
    Window.Callback f6439c;

    /* renamed from: d */
    private boolean f6440d;

    /* renamed from: e */
    private boolean f6441e;

    /* renamed from: f */
    private ArrayList f6442f = new ArrayList();

    /* renamed from: g */
    private final Runnable f6443g = new a();

    /* renamed from: h */
    private final Toolbar.f f6444h;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            p.this.c();
        }
    }

    class b implements Toolbar.f {
        b() {
        }

        @Override // androidx.appcompat.widget.Toolbar.f
        public boolean onMenuItemClick(MenuItem menuItem) {
            return p.this.f6439c.onMenuItemSelected(0, menuItem);
        }
    }

    private final class c implements k.a {

        /* renamed from: a */
        private boolean f6447a;

        c() {
        }

        @Override // androidx.appcompat.view.menu.k.a
        public void onCloseMenu(androidx.appcompat.view.menu.e eVar, boolean z8) {
            if (this.f6447a) {
                return;
            }
            this.f6447a = true;
            p.this.f6437a.dismissPopupMenus();
            Window.Callback callback = p.this.f6439c;
            if (callback != null) {
                callback.onPanelClosed(g.FEATURE_SUPPORT_ACTION_BAR, eVar);
            }
            this.f6447a = false;
        }

        @Override // androidx.appcompat.view.menu.k.a
        public boolean onOpenSubMenu(androidx.appcompat.view.menu.e eVar) {
            Window.Callback callback = p.this.f6439c;
            if (callback == null) {
                return false;
            }
            callback.onMenuOpened(g.FEATURE_SUPPORT_ACTION_BAR, eVar);
            return true;
        }
    }

    private final class d implements e.a {
        d() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean onMenuItemSelected(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void onMenuModeChange(androidx.appcompat.view.menu.e eVar) {
            p pVar = p.this;
            if (pVar.f6439c != null) {
                if (pVar.f6437a.isOverflowMenuShowing()) {
                    p.this.f6439c.onPanelClosed(g.FEATURE_SUPPORT_ACTION_BAR, eVar);
                } else if (p.this.f6439c.onPreparePanel(0, null, eVar)) {
                    p.this.f6439c.onMenuOpened(g.FEATURE_SUPPORT_ACTION_BAR, eVar);
                }
            }
        }
    }

    private class e extends l.j {
        public e(Window.Callback callback) {
            super(callback);
        }

        @Override // l.j, android.view.Window.Callback
        public View onCreatePanelView(int i8) {
            return i8 == 0 ? new View(p.this.f6437a.getContext()) : super.onCreatePanelView(i8);
        }

        @Override // l.j, android.view.Window.Callback
        public boolean onPreparePanel(int i8, View view, Menu menu) {
            boolean zOnPreparePanel = super.onPreparePanel(i8, view, menu);
            if (zOnPreparePanel) {
                p pVar = p.this;
                if (!pVar.f6438b) {
                    pVar.f6437a.setMenuPrepared();
                    p.this.f6438b = true;
                }
            }
            return zOnPreparePanel;
        }
    }

    p(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        b bVar = new b();
        this.f6444h = bVar;
        this.f6437a = new s0(toolbar, false);
        e eVar = new e(callback);
        this.f6439c = eVar;
        this.f6437a.setWindowCallback(eVar);
        toolbar.setOnMenuItemClickListener(bVar);
        this.f6437a.setWindowTitle(charSequence);
    }

    private Menu b() {
        if (!this.f6440d) {
            this.f6437a.setMenuCallbacks(new c(), new d());
            this.f6440d = true;
        }
        return this.f6437a.getMenu();
    }

    @Override // androidx.appcompat.app.a
    void a() {
        this.f6437a.getViewGroup().removeCallbacks(this.f6443g);
    }

    @Override // androidx.appcompat.app.a
    public void addOnMenuVisibilityListener(a.b bVar) {
        this.f6442f.add(bVar);
    }

    @Override // androidx.appcompat.app.a
    public void addTab(a.d dVar) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    void c() {
        Menu menuB = b();
        androidx.appcompat.view.menu.e eVar = menuB instanceof androidx.appcompat.view.menu.e ? (androidx.appcompat.view.menu.e) menuB : null;
        if (eVar != null) {
            eVar.stopDispatchingItemsChanged();
        }
        try {
            menuB.clear();
            if (!this.f6439c.onCreatePanelMenu(0, menuB) || !this.f6439c.onPreparePanel(0, null, menuB)) {
                menuB.clear();
            }
            if (eVar != null) {
                eVar.startDispatchingItemsChanged();
            }
        } catch (Throwable th) {
            if (eVar != null) {
                eVar.startDispatchingItemsChanged();
            }
            throw th;
        }
    }

    @Override // androidx.appcompat.app.a
    public boolean closeOptionsMenu() {
        return this.f6437a.hideOverflowMenu();
    }

    @Override // androidx.appcompat.app.a
    public boolean collapseActionView() {
        if (!this.f6437a.hasExpandedActionView()) {
            return false;
        }
        this.f6437a.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void dispatchMenuVisibilityChanged(boolean z8) {
        if (z8 == this.f6441e) {
            return;
        }
        this.f6441e = z8;
        if (this.f6442f.size() <= 0) {
            return;
        }
        android.support.v4.media.session.f.a(this.f6442f.get(0));
        throw null;
    }

    @Override // androidx.appcompat.app.a
    public View getCustomView() {
        return this.f6437a.getCustomView();
    }

    @Override // androidx.appcompat.app.a
    public int getDisplayOptions() {
        return this.f6437a.getDisplayOptions();
    }

    @Override // androidx.appcompat.app.a
    public float getElevation() {
        return AbstractC0985p0.getElevation(this.f6437a.getViewGroup());
    }

    @Override // androidx.appcompat.app.a
    public int getHeight() {
        return this.f6437a.getHeight();
    }

    @Override // androidx.appcompat.app.a
    public int getNavigationItemCount() {
        return 0;
    }

    @Override // androidx.appcompat.app.a
    public int getNavigationMode() {
        return 0;
    }

    @Override // androidx.appcompat.app.a
    public int getSelectedNavigationIndex() {
        return -1;
    }

    @Override // androidx.appcompat.app.a
    public a.d getSelectedTab() {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.a
    public CharSequence getSubtitle() {
        return this.f6437a.getSubtitle();
    }

    @Override // androidx.appcompat.app.a
    public a.d getTabAt(int i8) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.a
    public int getTabCount() {
        return 0;
    }

    @Override // androidx.appcompat.app.a
    public Context getThemedContext() {
        return this.f6437a.getContext();
    }

    @Override // androidx.appcompat.app.a
    public CharSequence getTitle() {
        return this.f6437a.getTitle();
    }

    public Window.Callback getWrappedWindowCallback() {
        return this.f6439c;
    }

    @Override // androidx.appcompat.app.a
    public void hide() {
        this.f6437a.setVisibility(8);
    }

    @Override // androidx.appcompat.app.a
    public boolean invalidateOptionsMenu() {
        this.f6437a.getViewGroup().removeCallbacks(this.f6443g);
        AbstractC0985p0.postOnAnimation(this.f6437a.getViewGroup(), this.f6443g);
        return true;
    }

    @Override // androidx.appcompat.app.a
    public boolean isShowing() {
        return this.f6437a.getVisibility() == 0;
    }

    @Override // androidx.appcompat.app.a
    public boolean isTitleTruncated() {
        return super.isTitleTruncated();
    }

    @Override // androidx.appcompat.app.a
    public a.d newTab() {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.a
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // androidx.appcompat.app.a
    public boolean onKeyShortcut(int i8, KeyEvent keyEvent) {
        Menu menuB = b();
        if (menuB == null) {
            return false;
        }
        menuB.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuB.performShortcut(i8, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.a
    public boolean onMenuKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            openOptionsMenu();
        }
        return true;
    }

    @Override // androidx.appcompat.app.a
    public boolean openOptionsMenu() {
        return this.f6437a.showOverflowMenu();
    }

    @Override // androidx.appcompat.app.a
    public void removeAllTabs() {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.a
    public void removeOnMenuVisibilityListener(a.b bVar) {
        this.f6442f.remove(bVar);
    }

    @Override // androidx.appcompat.app.a
    public void removeTab(a.d dVar) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.a
    public void removeTabAt(int i8) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    public boolean requestFocus() {
        ViewGroup viewGroup = this.f6437a.getViewGroup();
        if (viewGroup == null || viewGroup.hasFocus()) {
            return false;
        }
        viewGroup.requestFocus();
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void selectTab(a.d dVar) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.a
    public void setBackgroundDrawable(Drawable drawable) {
        this.f6437a.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.app.a
    public void setCustomView(View view) {
        setCustomView(view, new a.C0110a(-2, -2));
    }

    @Override // androidx.appcompat.app.a
    public void setDefaultDisplayHomeAsUpEnabled(boolean z8) {
    }

    @Override // androidx.appcompat.app.a
    public void setDisplayHomeAsUpEnabled(boolean z8) {
        setDisplayOptions(z8 ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.a
    public void setDisplayOptions(int i8) {
        setDisplayOptions(i8, -1);
    }

    @Override // androidx.appcompat.app.a
    public void setDisplayShowCustomEnabled(boolean z8) {
        setDisplayOptions(z8 ? 16 : 0, 16);
    }

    @Override // androidx.appcompat.app.a
    public void setDisplayShowHomeEnabled(boolean z8) {
        setDisplayOptions(z8 ? 2 : 0, 2);
    }

    @Override // androidx.appcompat.app.a
    public void setDisplayShowTitleEnabled(boolean z8) {
        setDisplayOptions(z8 ? 8 : 0, 8);
    }

    @Override // androidx.appcompat.app.a
    public void setDisplayUseLogoEnabled(boolean z8) {
        setDisplayOptions(z8 ? 1 : 0, 1);
    }

    @Override // androidx.appcompat.app.a
    public void setElevation(float f8) {
        AbstractC0985p0.setElevation(this.f6437a.getViewGroup(), f8);
    }

    @Override // androidx.appcompat.app.a
    public void setHomeActionContentDescription(CharSequence charSequence) {
        this.f6437a.setNavigationContentDescription(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void setHomeAsUpIndicator(Drawable drawable) {
        this.f6437a.setNavigationIcon(drawable);
    }

    @Override // androidx.appcompat.app.a
    public void setHomeButtonEnabled(boolean z8) {
    }

    @Override // androidx.appcompat.app.a
    public void setIcon(int i8) {
        this.f6437a.setIcon(i8);
    }

    @Override // androidx.appcompat.app.a
    public void setListNavigationCallbacks(SpinnerAdapter spinnerAdapter, a.c cVar) {
        this.f6437a.setDropdownParams(spinnerAdapter, new n(cVar));
    }

    @Override // androidx.appcompat.app.a
    public void setLogo(int i8) {
        this.f6437a.setLogo(i8);
    }

    @Override // androidx.appcompat.app.a
    public void setNavigationMode(int i8) {
        if (i8 == 2) {
            throw new IllegalArgumentException("Tabs not supported in this configuration");
        }
        this.f6437a.setNavigationMode(i8);
    }

    @Override // androidx.appcompat.app.a
    public void setSelectedNavigationItem(int i8) {
        if (this.f6437a.getNavigationMode() != 1) {
            throw new IllegalStateException("setSelectedNavigationIndex not valid for current navigation mode");
        }
        this.f6437a.setDropdownSelectedPosition(i8);
    }

    @Override // androidx.appcompat.app.a
    public void setShowHideAnimationEnabled(boolean z8) {
    }

    @Override // androidx.appcompat.app.a
    public void setSplitBackgroundDrawable(Drawable drawable) {
    }

    @Override // androidx.appcompat.app.a
    public void setStackedBackgroundDrawable(Drawable drawable) {
    }

    @Override // androidx.appcompat.app.a
    public void setSubtitle(CharSequence charSequence) {
        this.f6437a.setSubtitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void setTitle(CharSequence charSequence) {
        this.f6437a.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void setWindowTitle(CharSequence charSequence) {
        this.f6437a.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void show() {
        this.f6437a.setVisibility(0);
    }

    @Override // androidx.appcompat.app.a
    public void addTab(a.d dVar, boolean z8) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.a
    public void setCustomView(View view, a.C0110a c0110a) {
        if (view != null) {
            view.setLayoutParams(c0110a);
        }
        this.f6437a.setCustomView(view);
    }

    @Override // androidx.appcompat.app.a
    public void setDisplayOptions(int i8, int i9) {
        this.f6437a.setDisplayOptions((i8 & i9) | ((~i9) & this.f6437a.getDisplayOptions()));
    }

    @Override // androidx.appcompat.app.a
    public void setHomeActionContentDescription(int i8) {
        this.f6437a.setNavigationContentDescription(i8);
    }

    @Override // androidx.appcompat.app.a
    public void setHomeAsUpIndicator(int i8) {
        this.f6437a.setNavigationIcon(i8);
    }

    @Override // androidx.appcompat.app.a
    public void setIcon(Drawable drawable) {
        this.f6437a.setIcon(drawable);
    }

    @Override // androidx.appcompat.app.a
    public void setLogo(Drawable drawable) {
        this.f6437a.setLogo(drawable);
    }

    @Override // androidx.appcompat.app.a
    public void setSubtitle(int i8) {
        P p8 = this.f6437a;
        p8.setSubtitle(i8 != 0 ? p8.getContext().getText(i8) : null);
    }

    @Override // androidx.appcompat.app.a
    public void setTitle(int i8) {
        P p8 = this.f6437a;
        p8.setTitle(i8 != 0 ? p8.getContext().getText(i8) : null);
    }

    @Override // androidx.appcompat.app.a
    public void addTab(a.d dVar, int i8) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.a
    public void addTab(a.d dVar, int i8, boolean z8) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.a
    public void setCustomView(int i8) {
        setCustomView(LayoutInflater.from(this.f6437a.getContext()).inflate(i8, this.f6437a.getViewGroup(), false));
    }
}
