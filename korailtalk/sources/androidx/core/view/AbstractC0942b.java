package androidx.core.view;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: androidx.core.view.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0942b {

    /* renamed from: a, reason: collision with root package name */
    private final Context f9172a;

    /* renamed from: b, reason: collision with root package name */
    private a f9173b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC0144b f9174c;

    /* renamed from: androidx.core.view.b$a */
    public interface a {
        void onSubUiVisibilityChanged(boolean z8);
    }

    /* renamed from: androidx.core.view.b$b, reason: collision with other inner class name */
    public interface InterfaceC0144b {
        void onActionProviderVisibilityChanged(boolean z8);
    }

    public AbstractC0942b(Context context) {
        this.f9172a = context;
    }

    public Context getContext() {
        return this.f9172a;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isVisible() {
        return true;
    }

    public abstract View onCreateActionView();

    public View onCreateActionView(MenuItem menuItem) {
        return onCreateActionView();
    }

    public boolean onPerformDefaultAction() {
        return false;
    }

    public void onPrepareSubMenu(SubMenu subMenu) {
    }

    public boolean overridesItemVisibility() {
        return false;
    }

    public void refreshVisibility() {
        if (this.f9174c == null || !overridesItemVisibility()) {
            return;
        }
        this.f9174c.onActionProviderVisibilityChanged(isVisible());
    }

    public void reset() {
        this.f9174c = null;
        this.f9173b = null;
    }

    public void setSubUiVisibilityListener(a aVar) {
        this.f9173b = aVar;
    }

    public void setVisibilityListener(InterfaceC0144b interfaceC0144b) {
        if (this.f9174c != null && interfaceC0144b != null) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f9174c = interfaceC0144b;
    }

    public void subUiVisibilityChanged(boolean z8) {
        a aVar = this.f9173b;
        if (aVar != null) {
            aVar.onSubUiVisibilityChanged(z8);
        }
    }
}
