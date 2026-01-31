package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.e;

/* loaded from: classes.dex */
public class n extends e implements SubMenu {

    /* renamed from: B, reason: collision with root package name */
    private e f6704B;

    /* renamed from: C, reason: collision with root package name */
    private h f6705C;

    public n(Context context, e eVar, h hVar) {
        super(context);
        this.f6704B = eVar;
        this.f6705C = hVar;
    }

    @Override // androidx.appcompat.view.menu.e
    boolean c(e eVar, MenuItem menuItem) {
        return super.c(eVar, menuItem) || this.f6704B.c(eVar, menuItem);
    }

    @Override // androidx.appcompat.view.menu.e
    public boolean collapseItemActionView(h hVar) {
        return this.f6704B.collapseItemActionView(hVar);
    }

    @Override // androidx.appcompat.view.menu.e
    public boolean expandItemActionView(h hVar) {
        return this.f6704B.expandItemActionView(hVar);
    }

    @Override // androidx.appcompat.view.menu.e
    public String getActionViewStatesKey() {
        h hVar = this.f6705C;
        int itemId = hVar != null ? hVar.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.getActionViewStatesKey() + ":" + itemId;
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.f6705C;
    }

    public Menu getParentMenu() {
        return this.f6704B;
    }

    @Override // androidx.appcompat.view.menu.e
    public e getRootMenu() {
        return this.f6704B.getRootMenu();
    }

    @Override // androidx.appcompat.view.menu.e
    public boolean isGroupDividerEnabled() {
        return this.f6704B.isGroupDividerEnabled();
    }

    @Override // androidx.appcompat.view.menu.e
    public boolean isQwertyMode() {
        return this.f6704B.isQwertyMode();
    }

    @Override // androidx.appcompat.view.menu.e
    public boolean isShortcutsVisible() {
        return this.f6704B.isShortcutsVisible();
    }

    @Override // androidx.appcompat.view.menu.e
    public void setCallback(e.a aVar) {
        this.f6704B.setCallback(aVar);
    }

    @Override // androidx.appcompat.view.menu.e, W.a, android.view.Menu
    public void setGroupDividerEnabled(boolean z8) {
        this.f6704B.setGroupDividerEnabled(z8);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.s(drawable);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.v(charSequence);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.w(view);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f6705C.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.e, android.view.Menu
    public void setQwertyMode(boolean z8) {
        this.f6704B.setQwertyMode(z8);
    }

    @Override // androidx.appcompat.view.menu.e
    public void setShortcutsVisible(boolean z8) {
        this.f6704B.setShortcutsVisible(z8);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i8) {
        return (SubMenu) super.r(i8);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i8) {
        return (SubMenu) super.u(i8);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i8) {
        this.f6705C.setIcon(i8);
        return this;
    }
}
