package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.view.menu.l;
import h.AbstractC5569g;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class c implements k, AdapterView.OnItemClickListener {
    public static final String VIEWS_TAG = "android:menu:list";

    /* renamed from: a */
    Context f6586a;

    /* renamed from: b */
    LayoutInflater f6587b;

    /* renamed from: c */
    e f6588c;

    /* renamed from: d */
    ExpandedMenuView f6589d;

    /* renamed from: e */
    int f6590e;

    /* renamed from: f */
    int f6591f;

    /* renamed from: g */
    int f6592g;

    /* renamed from: h */
    private k.a f6593h;

    /* renamed from: i */
    a f6594i;

    /* renamed from: j */
    private int f6595j;

    private class a extends BaseAdapter {

        /* renamed from: a */
        private int f6596a = -1;

        public a() {
            a();
        }

        void a() {
            h expandedItem = c.this.f6588c.getExpandedItem();
            if (expandedItem != null) {
                ArrayList<h> nonActionItems = c.this.f6588c.getNonActionItems();
                int size = nonActionItems.size();
                for (int i8 = 0; i8 < size; i8++) {
                    if (nonActionItems.get(i8) == expandedItem) {
                        this.f6596a = i8;
                        return;
                    }
                }
            }
            this.f6596a = -1;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = c.this.f6588c.getNonActionItems().size() - c.this.f6590e;
            return this.f6596a < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i8) {
            return i8;
        }

        @Override // android.widget.Adapter
        public View getView(int i8, View view, ViewGroup viewGroup) {
            if (view == null) {
                c cVar = c.this;
                view = cVar.f6587b.inflate(cVar.f6592g, viewGroup, false);
            }
            ((l.a) view).initialize(getItem(i8), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }

        @Override // android.widget.Adapter
        public h getItem(int i8) {
            ArrayList<h> nonActionItems = c.this.f6588c.getNonActionItems();
            int i9 = i8 + c.this.f6590e;
            int i10 = this.f6596a;
            if (i10 >= 0 && i9 >= i10) {
                i9++;
            }
            return nonActionItems.get(i9);
        }
    }

    public c(Context context, int i8) {
        this(i8, 0);
        this.f6586a = context;
        this.f6587b = LayoutInflater.from(context);
    }

    @Override // androidx.appcompat.view.menu.k
    public boolean collapseItemActionView(e eVar, h hVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.k
    public boolean expandItemActionView(e eVar, h hVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.k
    public boolean flagActionItems() {
        return false;
    }

    public ListAdapter getAdapter() {
        if (this.f6594i == null) {
            this.f6594i = new a();
        }
        return this.f6594i;
    }

    @Override // androidx.appcompat.view.menu.k
    public int getId() {
        return this.f6595j;
    }

    @Override // androidx.appcompat.view.menu.k
    public l getMenuView(ViewGroup viewGroup) {
        if (this.f6589d == null) {
            this.f6589d = (ExpandedMenuView) this.f6587b.inflate(AbstractC5569g.abc_expanded_menu_layout, viewGroup, false);
            if (this.f6594i == null) {
                this.f6594i = new a();
            }
            this.f6589d.setAdapter((ListAdapter) this.f6594i);
            this.f6589d.setOnItemClickListener(this);
        }
        return this.f6589d;
    }

    @Override // androidx.appcompat.view.menu.k
    public void initForMenu(Context context, e eVar) {
        if (this.f6591f != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f6591f);
            this.f6586a = contextThemeWrapper;
            this.f6587b = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f6586a != null) {
            this.f6586a = context;
            if (this.f6587b == null) {
                this.f6587b = LayoutInflater.from(context);
            }
        }
        this.f6588c = eVar;
        a aVar = this.f6594i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.k
    public void onCloseMenu(e eVar, boolean z8) {
        k.a aVar = this.f6593h;
        if (aVar != null) {
            aVar.onCloseMenu(eVar, z8);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i8, long j8) {
        this.f6588c.performItemAction(this.f6594i.getItem(i8), this, 0);
    }

    @Override // androidx.appcompat.view.menu.k
    public void onRestoreInstanceState(Parcelable parcelable) {
        restoreHierarchyState((Bundle) parcelable);
    }

    @Override // androidx.appcompat.view.menu.k
    public Parcelable onSaveInstanceState() {
        if (this.f6589d == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        saveHierarchyState(bundle);
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.k
    public boolean onSubMenuSelected(n nVar) {
        if (!nVar.hasVisibleItems()) {
            return false;
        }
        new f(nVar).show(null);
        k.a aVar = this.f6593h;
        if (aVar == null) {
            return true;
        }
        aVar.onOpenSubMenu(nVar);
        return true;
    }

    public void restoreHierarchyState(Bundle bundle) {
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(VIEWS_TAG);
        if (sparseParcelableArray != null) {
            this.f6589d.restoreHierarchyState(sparseParcelableArray);
        }
    }

    public void saveHierarchyState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f6589d;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray(VIEWS_TAG, sparseArray);
    }

    @Override // androidx.appcompat.view.menu.k
    public void setCallback(k.a aVar) {
        this.f6593h = aVar;
    }

    public void setId(int i8) {
        this.f6595j = i8;
    }

    public void setItemIndexOffset(int i8) {
        this.f6590e = i8;
        if (this.f6589d != null) {
            updateMenuView(false);
        }
    }

    @Override // androidx.appcompat.view.menu.k
    public void updateMenuView(boolean z8) {
        a aVar = this.f6594i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public c(int i8, int i9) {
        this.f6592g = i8;
        this.f6591f = i9;
    }
}
