package m;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* loaded from: classes.dex */
public class d extends b implements Menu {

    /* renamed from: d, reason: collision with root package name */
    private final W.a f34093d;

    public d(Context context, W.a aVar) {
        super(context);
        if (aVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f34093d = aVar;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return a(this.f34093d.add(charSequence));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i8, int i9, int i10, ComponentName componentName, Intent[] intentArr, Intent intent, int i11, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f34093d.addIntentOptions(i8, i9, i10, componentName, intentArr, intent, i11, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i12 = 0; i12 < length; i12++) {
                menuItemArr[i12] = a(menuItemArr2[i12]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return b(this.f34093d.addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public void clear() {
        c();
        this.f34093d.clear();
    }

    @Override // android.view.Menu
    public void close() {
        this.f34093d.close();
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i8) {
        return a(this.f34093d.findItem(i8));
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i8) {
        return a(this.f34093d.getItem(i8));
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        return this.f34093d.hasVisibleItems();
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i8, KeyEvent keyEvent) {
        return this.f34093d.isShortcutKey(i8, keyEvent);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i8, int i9) {
        return this.f34093d.performIdentifierAction(i8, i9);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i8, KeyEvent keyEvent, int i9) {
        return this.f34093d.performShortcut(i8, keyEvent, i9);
    }

    @Override // android.view.Menu
    public void removeGroup(int i8) {
        d(i8);
        this.f34093d.removeGroup(i8);
    }

    @Override // android.view.Menu
    public void removeItem(int i8) {
        e(i8);
        this.f34093d.removeItem(i8);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i8, boolean z8, boolean z9) {
        this.f34093d.setGroupCheckable(i8, z8, z9);
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i8, boolean z8) {
        this.f34093d.setGroupEnabled(i8, z8);
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i8, boolean z8) {
        this.f34093d.setGroupVisible(i8, z8);
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z8) {
        this.f34093d.setQwertyMode(z8);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f34093d.size();
    }

    @Override // android.view.Menu
    public MenuItem add(int i8) {
        return a(this.f34093d.add(i8));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i8) {
        return b(this.f34093d.addSubMenu(i8));
    }

    @Override // android.view.Menu
    public MenuItem add(int i8, int i9, int i10, CharSequence charSequence) {
        return a(this.f34093d.add(i8, i9, i10, charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i8, int i9, int i10, CharSequence charSequence) {
        return b(this.f34093d.addSubMenu(i8, i9, i10, charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(int i8, int i9, int i10, int i11) {
        return a(this.f34093d.add(i8, i9, i10, i11));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i8, int i9, int i10, int i11) {
        return b(this.f34093d.addSubMenu(i8, i9, i10, i11));
    }
}
