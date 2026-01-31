package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.view.menu.l;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class a implements k {

    /* renamed from: a, reason: collision with root package name */
    protected Context f6542a;

    /* renamed from: b, reason: collision with root package name */
    protected Context f6543b;

    /* renamed from: c, reason: collision with root package name */
    protected e f6544c;

    /* renamed from: d, reason: collision with root package name */
    protected LayoutInflater f6545d;

    /* renamed from: e, reason: collision with root package name */
    protected LayoutInflater f6546e;

    /* renamed from: f, reason: collision with root package name */
    private k.a f6547f;

    /* renamed from: g, reason: collision with root package name */
    private int f6548g;

    /* renamed from: h, reason: collision with root package name */
    private int f6549h;

    /* renamed from: i, reason: collision with root package name */
    protected l f6550i;

    /* renamed from: j, reason: collision with root package name */
    private int f6551j;

    public a(Context context, int i8, int i9) {
        this.f6542a = context;
        this.f6545d = LayoutInflater.from(context);
        this.f6548g = i8;
        this.f6549h = i9;
    }

    protected void a(View view, int i8) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f6550i).addView(view, i8);
    }

    public abstract void bindItemView(h hVar, l.a aVar);

    @Override // androidx.appcompat.view.menu.k
    public boolean collapseItemActionView(e eVar, h hVar) {
        return false;
    }

    public l.a createItemView(ViewGroup viewGroup) {
        return (l.a) this.f6545d.inflate(this.f6549h, viewGroup, false);
    }

    @Override // androidx.appcompat.view.menu.k
    public boolean expandItemActionView(e eVar, h hVar) {
        return false;
    }

    protected boolean filterLeftoverView(ViewGroup viewGroup, int i8) {
        viewGroup.removeViewAt(i8);
        return true;
    }

    @Override // androidx.appcompat.view.menu.k
    public boolean flagActionItems() {
        return false;
    }

    public k.a getCallback() {
        return this.f6547f;
    }

    @Override // androidx.appcompat.view.menu.k
    public int getId() {
        return this.f6551j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View getItemView(h hVar, View view, ViewGroup viewGroup) {
        l.a aVarCreateItemView = view instanceof l.a ? (l.a) view : createItemView(viewGroup);
        bindItemView(hVar, aVarCreateItemView);
        return (View) aVarCreateItemView;
    }

    @Override // androidx.appcompat.view.menu.k
    public l getMenuView(ViewGroup viewGroup) {
        if (this.f6550i == null) {
            l lVar = (l) this.f6545d.inflate(this.f6548g, viewGroup, false);
            this.f6550i = lVar;
            lVar.initialize(this.f6544c);
            updateMenuView(true);
        }
        return this.f6550i;
    }

    @Override // androidx.appcompat.view.menu.k
    public void initForMenu(Context context, e eVar) {
        this.f6543b = context;
        this.f6546e = LayoutInflater.from(context);
        this.f6544c = eVar;
    }

    @Override // androidx.appcompat.view.menu.k
    public void onCloseMenu(e eVar, boolean z8) {
        k.a aVar = this.f6547f;
        if (aVar != null) {
            aVar.onCloseMenu(eVar, z8);
        }
    }

    @Override // androidx.appcompat.view.menu.k
    public abstract /* synthetic */ void onRestoreInstanceState(Parcelable parcelable);

    @Override // androidx.appcompat.view.menu.k
    public abstract /* synthetic */ Parcelable onSaveInstanceState();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.appcompat.view.menu.e] */
    @Override // androidx.appcompat.view.menu.k
    public boolean onSubMenuSelected(n nVar) {
        k.a aVar = this.f6547f;
        n nVar2 = nVar;
        if (aVar == null) {
            return false;
        }
        if (nVar == null) {
            nVar2 = this.f6544c;
        }
        return aVar.onOpenSubMenu(nVar2);
    }

    @Override // androidx.appcompat.view.menu.k
    public void setCallback(k.a aVar) {
        this.f6547f = aVar;
    }

    public void setId(int i8) {
        this.f6551j = i8;
    }

    public boolean shouldIncludeItem(int i8, h hVar) {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.k
    public void updateMenuView(boolean z8) {
        ViewGroup viewGroup = (ViewGroup) this.f6550i;
        if (viewGroup == null) {
            return;
        }
        e eVar = this.f6544c;
        int i8 = 0;
        if (eVar != null) {
            eVar.flagActionItems();
            ArrayList<h> visibleItems = this.f6544c.getVisibleItems();
            int size = visibleItems.size();
            int i9 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                h hVar = visibleItems.get(i10);
                if (shouldIncludeItem(i9, hVar)) {
                    View childAt = viewGroup.getChildAt(i9);
                    h itemData = childAt instanceof l.a ? ((l.a) childAt).getItemData() : null;
                    View itemView = getItemView(hVar, childAt, viewGroup);
                    if (hVar != itemData) {
                        itemView.setPressed(false);
                        itemView.jumpDrawablesToCurrentState();
                    }
                    if (itemView != childAt) {
                        a(itemView, i9);
                    }
                    i9++;
                }
            }
            i8 = i9;
        }
        while (i8 < viewGroup.getChildCount()) {
            if (!filterLeftoverView(viewGroup, i8)) {
                i8++;
            }
        }
    }
}
