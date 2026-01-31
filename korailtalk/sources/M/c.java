package m;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.AbstractC0942b;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import l.InterfaceC5877c;

/* loaded from: classes.dex */
public class c extends m.b implements MenuItem {

    /* renamed from: d, reason: collision with root package name */
    private final W.b f34082d;

    /* renamed from: e, reason: collision with root package name */
    private Method f34083e;

    private class a extends AbstractC0942b {

        /* renamed from: d, reason: collision with root package name */
        final ActionProvider f34084d;

        a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f34084d = actionProvider;
        }

        @Override // androidx.core.view.AbstractC0942b
        public boolean hasSubMenu() {
            return this.f34084d.hasSubMenu();
        }

        @Override // androidx.core.view.AbstractC0942b
        public View onCreateActionView() {
            return this.f34084d.onCreateActionView();
        }

        @Override // androidx.core.view.AbstractC0942b
        public boolean onPerformDefaultAction() {
            return this.f34084d.onPerformDefaultAction();
        }

        @Override // androidx.core.view.AbstractC0942b
        public void onPrepareSubMenu(SubMenu subMenu) {
            this.f34084d.onPrepareSubMenu(c.this.b(subMenu));
        }
    }

    private class b extends a implements ActionProvider.VisibilityListener {

        /* renamed from: f, reason: collision with root package name */
        private AbstractC0942b.InterfaceC0144b f34086f;

        b(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        @Override // androidx.core.view.AbstractC0942b
        public boolean isVisible() {
            return this.f34084d.isVisible();
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z8) {
            AbstractC0942b.InterfaceC0144b interfaceC0144b = this.f34086f;
            if (interfaceC0144b != null) {
                interfaceC0144b.onActionProviderVisibilityChanged(z8);
            }
        }

        @Override // androidx.core.view.AbstractC0942b
        public View onCreateActionView(MenuItem menuItem) {
            return this.f34084d.onCreateActionView(menuItem);
        }

        @Override // androidx.core.view.AbstractC0942b
        public boolean overridesItemVisibility() {
            return this.f34084d.overridesItemVisibility();
        }

        @Override // androidx.core.view.AbstractC0942b
        public void refreshVisibility() {
            this.f34084d.refreshVisibility();
        }

        @Override // androidx.core.view.AbstractC0942b
        public void setVisibilityListener(AbstractC0942b.InterfaceC0144b interfaceC0144b) {
            this.f34086f = interfaceC0144b;
            this.f34084d.setVisibilityListener(interfaceC0144b != null ? this : null);
        }
    }

    /* renamed from: m.c$c, reason: collision with other inner class name */
    static class C0349c extends FrameLayout implements InterfaceC5877c {

        /* renamed from: a, reason: collision with root package name */
        final CollapsibleActionView f34088a;

        /* JADX WARN: Multi-variable type inference failed */
        C0349c(View view) {
            super(view.getContext());
            this.f34088a = (CollapsibleActionView) view;
            addView(view);
        }

        View a() {
            return (View) this.f34088a;
        }

        @Override // l.InterfaceC5877c
        public void onActionViewCollapsed() {
            this.f34088a.onActionViewCollapsed();
        }

        @Override // l.InterfaceC5877c
        public void onActionViewExpanded() {
            this.f34088a.onActionViewExpanded();
        }
    }

    private class d implements MenuItem.OnActionExpandListener {

        /* renamed from: a, reason: collision with root package name */
        private final MenuItem.OnActionExpandListener f34089a;

        d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f34089a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f34089a.onMenuItemActionCollapse(c.this.a(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f34089a.onMenuItemActionExpand(c.this.a(menuItem));
        }
    }

    private class e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a, reason: collision with root package name */
        private final MenuItem.OnMenuItemClickListener f34091a;

        e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f34091a = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f34091a.onMenuItemClick(c.this.a(menuItem));
        }
    }

    public c(Context context, W.b bVar) {
        super(context);
        if (bVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f34082d = bVar;
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.f34082d.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.f34082d.expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        AbstractC0942b supportActionProvider = this.f34082d.getSupportActionProvider();
        if (supportActionProvider instanceof a) {
            return ((a) supportActionProvider).f34084d;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.f34082d.getActionView();
        return actionView instanceof C0349c ? ((C0349c) actionView).a() : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f34082d.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f34082d.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f34082d.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f34082d.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f34082d.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f34082d.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f34082d.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f34082d.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f34082d.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f34082d.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f34082d.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f34082d.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f34082d.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return b(this.f34082d.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f34082d.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f34082d.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f34082d.getTooltipText();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f34082d.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f34082d.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.f34082d.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.f34082d.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.f34082d.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.f34082d.isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        b bVar = new b(this.f34079a, actionProvider);
        W.b bVar2 = this.f34082d;
        if (actionProvider == null) {
            bVar = null;
        }
        bVar2.setSupportActionProvider(bVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C0349c(view);
        }
        this.f34082d.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c9) {
        this.f34082d.setAlphabeticShortcut(c9);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z8) {
        this.f34082d.setCheckable(z8);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z8) {
        this.f34082d.setChecked(z8);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f34082d.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z8) {
        this.f34082d.setEnabled(z8);
        return this;
    }

    public void setExclusiveCheckable(boolean z8) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            if (this.f34083e == null) {
                this.f34083e = this.f34082d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f34083e.invoke(this.f34082d, Boolean.valueOf(z8));
        } catch (Exception e8) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e8);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f34082d.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f34082d.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f34082d.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f34082d.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c9) {
        this.f34082d.setNumericShortcut(c9);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f34082d.setOnActionExpandListener(onActionExpandListener != null ? new d(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f34082d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new e(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c9, char c10) {
        this.f34082d.setShortcut(c9, c10);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i8) {
        this.f34082d.setShowAsAction(i8);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i8) {
        this.f34082d.setShowAsActionFlags(i8);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f34082d.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f34082d.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f34082d.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z8) {
        return this.f34082d.setVisible(z8);
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c9, int i8) {
        this.f34082d.setAlphabeticShortcut(c9, i8);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i8) {
        this.f34082d.setIcon(i8);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c9, int i8) {
        this.f34082d.setNumericShortcut(c9, i8);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c9, char c10, int i8, int i9) {
        this.f34082d.setShortcut(c9, c10, i8, i9);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i8) {
        this.f34082d.setTitle(i8);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i8) {
        this.f34082d.setActionView(i8);
        View actionView = this.f34082d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f34082d.setActionView(new C0349c(actionView));
        }
        return this;
    }
}
