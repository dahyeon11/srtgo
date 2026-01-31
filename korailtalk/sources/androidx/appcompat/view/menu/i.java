package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.k;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class i implements m.e, k, AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    private Rect f6667a;

    i() {
    }

    protected static int b(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i8) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i9 = 0;
        int i10 = 0;
        View view = null;
        for (int i11 = 0; i11 < count; i11++) {
            int itemViewType = listAdapter.getItemViewType(i11);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i11, view, viewGroup);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i8) {
                return i8;
            }
            if (measuredWidth > i9) {
                i9 = measuredWidth;
            }
        }
        return i9;
    }

    protected static boolean c(e eVar) {
        int size = eVar.size();
        for (int i8 = 0; i8 < size; i8++) {
            MenuItem item = eVar.getItem(i8);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    protected static d d(ListAdapter listAdapter) {
        return listAdapter instanceof HeaderViewListAdapter ? (d) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (d) listAdapter;
    }

    protected boolean a() {
        return true;
    }

    public abstract void addMenu(e eVar);

    @Override // androidx.appcompat.view.menu.k
    public boolean collapseItemActionView(e eVar, h hVar) {
        return false;
    }

    @Override // m.e
    public abstract /* synthetic */ void dismiss();

    @Override // androidx.appcompat.view.menu.k
    public boolean expandItemActionView(e eVar, h hVar) {
        return false;
    }

    public abstract /* synthetic */ boolean flagActionItems();

    public Rect getEpicenterBounds() {
        return this.f6667a;
    }

    @Override // androidx.appcompat.view.menu.k
    public int getId() {
        return 0;
    }

    @Override // m.e
    public abstract /* synthetic */ ListView getListView();

    @Override // androidx.appcompat.view.menu.k
    public l getMenuView(ViewGroup viewGroup) {
        throw new UnsupportedOperationException("MenuPopups manage their own views");
    }

    @Override // androidx.appcompat.view.menu.k
    public void initForMenu(Context context, e eVar) {
    }

    @Override // m.e
    public abstract /* synthetic */ boolean isShowing();

    public abstract /* synthetic */ void onCloseMenu(e eVar, boolean z8);

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i8, long j8) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        d(listAdapter).f6598a.performItemAction((MenuItem) listAdapter.getItem(i8), this, a() ? 0 : 4);
    }

    public abstract /* synthetic */ void onRestoreInstanceState(Parcelable parcelable);

    public abstract /* synthetic */ Parcelable onSaveInstanceState();

    public abstract /* synthetic */ boolean onSubMenuSelected(n nVar);

    public abstract void setAnchorView(View view);

    public abstract /* synthetic */ void setCallback(k.a aVar);

    public void setEpicenterBounds(Rect rect) {
        this.f6667a = rect;
    }

    public abstract void setForceShowIcon(boolean z8);

    public abstract void setGravity(int i8);

    public abstract void setHorizontalOffset(int i8);

    public abstract void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener);

    public abstract void setShowTitle(boolean z8);

    public abstract void setVerticalOffset(int i8);

    @Override // m.e
    public abstract /* synthetic */ void show();

    public abstract /* synthetic */ void updateMenuView(boolean z8);
}
