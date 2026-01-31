package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Parcelable;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public interface k {

    public interface a {
        void onCloseMenu(e eVar, boolean z8);

        boolean onOpenSubMenu(e eVar);
    }

    boolean collapseItemActionView(e eVar, h hVar);

    boolean expandItemActionView(e eVar, h hVar);

    boolean flagActionItems();

    int getId();

    l getMenuView(ViewGroup viewGroup);

    void initForMenu(Context context, e eVar);

    void onCloseMenu(e eVar, boolean z8);

    void onRestoreInstanceState(Parcelable parcelable);

    Parcelable onSaveInstanceState();

    boolean onSubMenuSelected(n nVar);

    void setCallback(a aVar);

    void updateMenuView(boolean z8);
}
