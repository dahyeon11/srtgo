package m;

import O.h;
import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;

/* loaded from: classes.dex */
abstract class b {

    /* renamed from: a, reason: collision with root package name */
    final Context f34079a;

    /* renamed from: b, reason: collision with root package name */
    private h f34080b;

    /* renamed from: c, reason: collision with root package name */
    private h f34081c;

    b(Context context) {
        this.f34079a = context;
    }

    final MenuItem a(MenuItem menuItem) {
        if (!(menuItem instanceof W.b)) {
            return menuItem;
        }
        W.b bVar = (W.b) menuItem;
        if (this.f34080b == null) {
            this.f34080b = new h();
        }
        MenuItem menuItem2 = (MenuItem) this.f34080b.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        c cVar = new c(this.f34079a, bVar);
        this.f34080b.put(bVar, cVar);
        return cVar;
    }

    final void c() {
        h hVar = this.f34080b;
        if (hVar != null) {
            hVar.clear();
        }
        h hVar2 = this.f34081c;
        if (hVar2 != null) {
            hVar2.clear();
        }
    }

    final void d(int i8) {
        if (this.f34080b == null) {
            return;
        }
        int i9 = 0;
        while (i9 < this.f34080b.size()) {
            if (((W.b) this.f34080b.keyAt(i9)).getGroupId() == i8) {
                this.f34080b.removeAt(i9);
                i9--;
            }
            i9++;
        }
    }

    final void e(int i8) {
        if (this.f34080b == null) {
            return;
        }
        for (int i9 = 0; i9 < this.f34080b.size(); i9++) {
            if (((W.b) this.f34080b.keyAt(i9)).getItemId() == i8) {
                this.f34080b.removeAt(i9);
                return;
            }
        }
    }

    final SubMenu b(SubMenu subMenu) {
        return subMenu;
    }
}
