package l;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import l.AbstractC5876b;

/* loaded from: classes.dex */
public class e extends AbstractC5876b implements e.a {

    /* renamed from: c, reason: collision with root package name */
    private Context f33839c;

    /* renamed from: d, reason: collision with root package name */
    private ActionBarContextView f33840d;

    /* renamed from: e, reason: collision with root package name */
    private AbstractC5876b.a f33841e;

    /* renamed from: f, reason: collision with root package name */
    private WeakReference f33842f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f33843g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f33844h;

    /* renamed from: i, reason: collision with root package name */
    private androidx.appcompat.view.menu.e f33845i;

    public e(Context context, ActionBarContextView actionBarContextView, AbstractC5876b.a aVar, boolean z8) {
        this.f33839c = context;
        this.f33840d = actionBarContextView;
        this.f33841e = aVar;
        androidx.appcompat.view.menu.e defaultShowAsAction = new androidx.appcompat.view.menu.e(actionBarContextView.getContext()).setDefaultShowAsAction(1);
        this.f33845i = defaultShowAsAction;
        defaultShowAsAction.setCallback(this);
        this.f33844h = z8;
    }

    @Override // l.AbstractC5876b
    public void finish() {
        if (this.f33843g) {
            return;
        }
        this.f33843g = true;
        this.f33840d.sendAccessibilityEvent(32);
        this.f33841e.onDestroyActionMode(this);
    }

    @Override // l.AbstractC5876b
    public View getCustomView() {
        WeakReference weakReference = this.f33842f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // l.AbstractC5876b
    public Menu getMenu() {
        return this.f33845i;
    }

    @Override // l.AbstractC5876b
    public MenuInflater getMenuInflater() {
        return new g(this.f33840d.getContext());
    }

    @Override // l.AbstractC5876b
    public CharSequence getSubtitle() {
        return this.f33840d.getSubtitle();
    }

    @Override // l.AbstractC5876b
    public CharSequence getTitle() {
        return this.f33840d.getTitle();
    }

    @Override // l.AbstractC5876b
    public void invalidate() {
        this.f33841e.onPrepareActionMode(this, this.f33845i);
    }

    @Override // l.AbstractC5876b
    public boolean isTitleOptional() {
        return this.f33840d.isTitleOptional();
    }

    @Override // l.AbstractC5876b
    public boolean isUiFocusable() {
        return this.f33844h;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean onMenuItemSelected(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        return this.f33841e.onActionItemClicked(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void onMenuModeChange(androidx.appcompat.view.menu.e eVar) {
        invalidate();
        this.f33840d.showOverflowMenu();
    }

    public boolean onSubMenuSelected(n nVar) {
        if (!nVar.hasVisibleItems()) {
            return true;
        }
        new androidx.appcompat.view.menu.j(this.f33840d.getContext(), nVar).show();
        return true;
    }

    @Override // l.AbstractC5876b
    public void setCustomView(View view) {
        this.f33840d.setCustomView(view);
        this.f33842f = view != null ? new WeakReference(view) : null;
    }

    @Override // l.AbstractC5876b
    public void setSubtitle(CharSequence charSequence) {
        this.f33840d.setSubtitle(charSequence);
    }

    @Override // l.AbstractC5876b
    public void setTitle(CharSequence charSequence) {
        this.f33840d.setTitle(charSequence);
    }

    @Override // l.AbstractC5876b
    public void setTitleOptionalHint(boolean z8) {
        super.setTitleOptionalHint(z8);
        this.f33840d.setTitleOptional(z8);
    }

    @Override // l.AbstractC5876b
    public void setSubtitle(int i8) {
        setSubtitle(this.f33839c.getString(i8));
    }

    @Override // l.AbstractC5876b
    public void setTitle(int i8) {
        setTitle(this.f33839c.getString(i8));
    }

    public void onCloseSubMenu(n nVar) {
    }

    public void onCloseMenu(androidx.appcompat.view.menu.e eVar, boolean z8) {
    }
}
