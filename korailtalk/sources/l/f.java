package l;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;
import l.AbstractC5876b;

/* loaded from: classes.dex */
public class f extends ActionMode {

    /* renamed from: a, reason: collision with root package name */
    final Context f33846a;

    /* renamed from: b, reason: collision with root package name */
    final AbstractC5876b f33847b;

    public static class a implements AbstractC5876b.a {

        /* renamed from: a, reason: collision with root package name */
        final ActionMode.Callback f33848a;

        /* renamed from: b, reason: collision with root package name */
        final Context f33849b;

        /* renamed from: c, reason: collision with root package name */
        final ArrayList f33850c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        final O.h f33851d = new O.h();

        public a(Context context, ActionMode.Callback callback) {
            this.f33849b = context;
            this.f33848a = callback;
        }

        private Menu a(Menu menu) {
            Menu menu2 = (Menu) this.f33851d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            m.d dVar = new m.d(this.f33849b, (W.a) menu);
            this.f33851d.put(menu, dVar);
            return dVar;
        }

        public ActionMode getActionModeWrapper(AbstractC5876b abstractC5876b) {
            int size = this.f33850c.size();
            for (int i8 = 0; i8 < size; i8++) {
                f fVar = (f) this.f33850c.get(i8);
                if (fVar != null && fVar.f33847b == abstractC5876b) {
                    return fVar;
                }
            }
            f fVar2 = new f(this.f33849b, abstractC5876b);
            this.f33850c.add(fVar2);
            return fVar2;
        }

        @Override // l.AbstractC5876b.a
        public boolean onActionItemClicked(AbstractC5876b abstractC5876b, MenuItem menuItem) {
            return this.f33848a.onActionItemClicked(getActionModeWrapper(abstractC5876b), new m.c(this.f33849b, (W.b) menuItem));
        }

        @Override // l.AbstractC5876b.a
        public boolean onCreateActionMode(AbstractC5876b abstractC5876b, Menu menu) {
            return this.f33848a.onCreateActionMode(getActionModeWrapper(abstractC5876b), a(menu));
        }

        @Override // l.AbstractC5876b.a
        public void onDestroyActionMode(AbstractC5876b abstractC5876b) {
            this.f33848a.onDestroyActionMode(getActionModeWrapper(abstractC5876b));
        }

        @Override // l.AbstractC5876b.a
        public boolean onPrepareActionMode(AbstractC5876b abstractC5876b, Menu menu) {
            return this.f33848a.onPrepareActionMode(getActionModeWrapper(abstractC5876b), a(menu));
        }
    }

    public f(Context context, AbstractC5876b abstractC5876b) {
        this.f33846a = context;
        this.f33847b = abstractC5876b;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f33847b.finish();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f33847b.getCustomView();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new m.d(this.f33846a, (W.a) this.f33847b.getMenu());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f33847b.getMenuInflater();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f33847b.getSubtitle();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f33847b.getTag();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f33847b.getTitle();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f33847b.getTitleOptionalHint();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f33847b.invalidate();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f33847b.isTitleOptional();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f33847b.setCustomView(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f33847b.setSubtitle(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f33847b.setTag(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f33847b.setTitle(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z8) {
        this.f33847b.setTitleOptionalHint(z8);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i8) {
        this.f33847b.setSubtitle(i8);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i8) {
        this.f33847b.setTitle(i8);
    }
}
