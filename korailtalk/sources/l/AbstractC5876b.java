package l;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* renamed from: l.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5876b {

    /* renamed from: a, reason: collision with root package name */
    private Object f33832a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f33833b;

    /* renamed from: l.b$a */
    public interface a {
        boolean onActionItemClicked(AbstractC5876b abstractC5876b, MenuItem menuItem);

        boolean onCreateActionMode(AbstractC5876b abstractC5876b, Menu menu);

        void onDestroyActionMode(AbstractC5876b abstractC5876b);

        boolean onPrepareActionMode(AbstractC5876b abstractC5876b, Menu menu);
    }

    public abstract void finish();

    public abstract View getCustomView();

    public abstract Menu getMenu();

    public abstract MenuInflater getMenuInflater();

    public abstract CharSequence getSubtitle();

    public Object getTag() {
        return this.f33832a;
    }

    public abstract CharSequence getTitle();

    public boolean getTitleOptionalHint() {
        return this.f33833b;
    }

    public abstract void invalidate();

    public boolean isTitleOptional() {
        return false;
    }

    public boolean isUiFocusable() {
        return true;
    }

    public abstract void setCustomView(View view);

    public abstract void setSubtitle(int i8);

    public abstract void setSubtitle(CharSequence charSequence);

    public void setTag(Object obj) {
        this.f33832a = obj;
    }

    public abstract void setTitle(int i8);

    public abstract void setTitle(CharSequence charSequence);

    public void setTitleOptionalHint(boolean z8) {
        this.f33833b = z8;
    }
}
