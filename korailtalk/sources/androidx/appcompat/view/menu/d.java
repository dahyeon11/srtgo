package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.l;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class d extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    e f6598a;

    /* renamed from: b, reason: collision with root package name */
    private int f6599b = -1;

    /* renamed from: c, reason: collision with root package name */
    private boolean f6600c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f6601d;

    /* renamed from: e, reason: collision with root package name */
    private final LayoutInflater f6602e;

    /* renamed from: f, reason: collision with root package name */
    private final int f6603f;

    public d(e eVar, LayoutInflater layoutInflater, boolean z8, int i8) {
        this.f6601d = z8;
        this.f6602e = layoutInflater;
        this.f6598a = eVar;
        this.f6603f = i8;
        a();
    }

    void a() {
        h expandedItem = this.f6598a.getExpandedItem();
        if (expandedItem != null) {
            ArrayList<h> nonActionItems = this.f6598a.getNonActionItems();
            int size = nonActionItems.size();
            for (int i8 = 0; i8 < size; i8++) {
                if (nonActionItems.get(i8) == expandedItem) {
                    this.f6599b = i8;
                    return;
                }
            }
        }
        this.f6599b = -1;
    }

    public e getAdapterMenu() {
        return this.f6598a;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f6599b < 0 ? (this.f6601d ? this.f6598a.getNonActionItems() : this.f6598a.getVisibleItems()).size() : r0.size() - 1;
    }

    public boolean getForceShowIcon() {
        return this.f6600c;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i8) {
        return i8;
    }

    @Override // android.widget.Adapter
    public View getView(int i8, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f6602e.inflate(this.f6603f, viewGroup, false);
        }
        int groupId = getItem(i8).getGroupId();
        int i9 = i8 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f6598a.isGroupDividerEnabled() && groupId != (i9 >= 0 ? getItem(i9).getGroupId() : groupId));
        l.a aVar = (l.a) view;
        if (this.f6600c) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.initialize(getItem(i8), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }

    public void setForceShowIcon(boolean z8) {
        this.f6600c = z8;
    }

    @Override // android.widget.Adapter
    public h getItem(int i8) {
        ArrayList<h> nonActionItems = this.f6601d ? this.f6598a.getNonActionItems() : this.f6598a.getVisibleItems();
        int i9 = this.f6599b;
        if (i9 >= 0 && i8 >= i9) {
            i8++;
        }
        return nonActionItems.get(i8);
    }
}
