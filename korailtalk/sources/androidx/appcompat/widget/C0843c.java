package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.view.menu.l;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.AbstractC0942b;
import h.AbstractC5563a;
import h.AbstractC5569g;
import java.util.ArrayList;
import l.C5875a;

/* renamed from: androidx.appcompat.widget.c */
/* loaded from: classes.dex */
class C0843c extends androidx.appcompat.view.menu.a implements AbstractC0942b.a {

    /* renamed from: A */
    RunnableC0114c f7024A;

    /* renamed from: B */
    private b f7025B;

    /* renamed from: C */
    final f f7026C;

    /* renamed from: D */
    int f7027D;

    /* renamed from: k */
    d f7028k;

    /* renamed from: l */
    private Drawable f7029l;

    /* renamed from: m */
    private boolean f7030m;

    /* renamed from: n */
    private boolean f7031n;

    /* renamed from: o */
    private boolean f7032o;

    /* renamed from: p */
    private int f7033p;

    /* renamed from: q */
    private int f7034q;

    /* renamed from: r */
    private int f7035r;

    /* renamed from: s */
    private boolean f7036s;

    /* renamed from: t */
    private boolean f7037t;

    /* renamed from: u */
    private boolean f7038u;

    /* renamed from: v */
    private boolean f7039v;

    /* renamed from: w */
    private int f7040w;

    /* renamed from: x */
    private final SparseBooleanArray f7041x;

    /* renamed from: y */
    e f7042y;

    /* renamed from: z */
    a f7043z;

    /* renamed from: androidx.appcompat.widget.c$a */
    private class a extends androidx.appcompat.view.menu.j {
        public a(Context context, androidx.appcompat.view.menu.n nVar, View view) {
            super(context, nVar, view, false, AbstractC5563a.actionOverflowMenuStyle);
            if (!((androidx.appcompat.view.menu.h) nVar.getItem()).isActionButton()) {
                View view2 = C0843c.this.f7028k;
                setAnchorView(view2 == null ? (View) ((androidx.appcompat.view.menu.a) C0843c.this).f6550i : view2);
            }
            setPresenterCallback(C0843c.this.f7026C);
        }

        @Override // androidx.appcompat.view.menu.j
        protected void b() {
            C0843c c0843c = C0843c.this;
            c0843c.f7043z = null;
            c0843c.f7027D = 0;
            super.b();
        }
    }

    /* renamed from: androidx.appcompat.widget.c$b */
    private class b extends ActionMenuItemView.b {
        b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.b
        public m.e getPopup() {
            a aVar = C0843c.this.f7043z;
            if (aVar != null) {
                return aVar.getPopup();
            }
            return null;
        }
    }

    /* renamed from: androidx.appcompat.widget.c$c */
    private class RunnableC0114c implements Runnable {

        /* renamed from: a */
        private e f7046a;

        public RunnableC0114c(e eVar) {
            this.f7046a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((androidx.appcompat.view.menu.a) C0843c.this).f6544c != null) {
                ((androidx.appcompat.view.menu.a) C0843c.this).f6544c.changeMenuMode();
            }
            View view = (View) ((androidx.appcompat.view.menu.a) C0843c.this).f6550i;
            if (view != null && view.getWindowToken() != null && this.f7046a.tryShow()) {
                C0843c.this.f7042y = this.f7046a;
            }
            C0843c.this.f7024A = null;
        }
    }

    /* renamed from: androidx.appcompat.widget.c$d */
    private class d extends AppCompatImageView implements ActionMenuView.a {

        /* renamed from: androidx.appcompat.widget.c$d$a */
        class a extends Z {

            /* renamed from: j */
            final /* synthetic */ C0843c f7049j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(View view, C0843c c0843c) {
                super(view);
                this.f7049j = c0843c;
            }

            @Override // androidx.appcompat.widget.Z
            public m.e getPopup() {
                e eVar = C0843c.this.f7042y;
                if (eVar == null) {
                    return null;
                }
                return eVar.getPopup();
            }

            @Override // androidx.appcompat.widget.Z
            public boolean onForwardingStarted() {
                C0843c.this.showOverflowMenu();
                return true;
            }

            @Override // androidx.appcompat.widget.Z
            public boolean onForwardingStopped() {
                C0843c c0843c = C0843c.this;
                if (c0843c.f7024A != null) {
                    return false;
                }
                c0843c.hideOverflowMenu();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, AbstractC5563a.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            u0.setTooltipText(this, getContentDescription());
            setOnTouchListener(new a(this, C0843c.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean needsDividerAfter() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean needsDividerBefore() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            C0843c.this.showOverflowMenu();
            return true;
        }

        @Override // android.widget.ImageView
        protected boolean setFrame(int i8, int i9, int i10, int i11) {
            boolean frame = super.setFrame(i8, i9, i10, i11);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int iMax = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                androidx.core.graphics.drawable.a.setHotspotBounds(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
            }
            return frame;
        }
    }

    /* renamed from: androidx.appcompat.widget.c$e */
    private class e extends androidx.appcompat.view.menu.j {
        public e(Context context, androidx.appcompat.view.menu.e eVar, View view, boolean z8) {
            super(context, eVar, view, z8, AbstractC5563a.actionOverflowMenuStyle);
            setGravity(androidx.core.view.A.END);
            setPresenterCallback(C0843c.this.f7026C);
        }

        @Override // androidx.appcompat.view.menu.j
        protected void b() {
            if (((androidx.appcompat.view.menu.a) C0843c.this).f6544c != null) {
                ((androidx.appcompat.view.menu.a) C0843c.this).f6544c.close();
            }
            C0843c.this.f7042y = null;
            super.b();
        }
    }

    /* renamed from: androidx.appcompat.widget.c$f */
    private class f implements k.a {
        f() {
        }

        @Override // androidx.appcompat.view.menu.k.a
        public void onCloseMenu(androidx.appcompat.view.menu.e eVar, boolean z8) {
            if (eVar instanceof androidx.appcompat.view.menu.n) {
                eVar.getRootMenu().close(false);
            }
            k.a callback = C0843c.this.getCallback();
            if (callback != null) {
                callback.onCloseMenu(eVar, z8);
            }
        }

        @Override // androidx.appcompat.view.menu.k.a
        public boolean onOpenSubMenu(androidx.appcompat.view.menu.e eVar) {
            if (eVar == ((androidx.appcompat.view.menu.a) C0843c.this).f6544c) {
                return false;
            }
            C0843c.this.f7027D = ((androidx.appcompat.view.menu.n) eVar).getItem().getItemId();
            k.a callback = C0843c.this.getCallback();
            if (callback != null) {
                return callback.onOpenSubMenu(eVar);
            }
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.c$g */
    private static class g implements Parcelable {
        public static final Parcelable.Creator<g> CREATOR = new a();
        public int openSubMenuId;

        /* renamed from: androidx.appcompat.widget.c$g$a */
        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public g createFromParcel(Parcel parcel) {
                return new g(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public g[] newArray(int i8) {
                return new g[i8];
            }
        }

        g() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            parcel.writeInt(this.openSubMenuId);
        }

        g(Parcel parcel) {
            this.openSubMenuId = parcel.readInt();
        }
    }

    public C0843c(Context context) {
        super(context, AbstractC5569g.abc_action_menu_layout, AbstractC5569g.abc_action_menu_item_layout);
        this.f7041x = new SparseBooleanArray();
        this.f7026C = new f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private View i(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f6550i;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = viewGroup.getChildAt(i8);
            if ((childAt instanceof l.a) && ((l.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.view.menu.a
    public void bindItemView(androidx.appcompat.view.menu.h hVar, l.a aVar) {
        aVar.initialize(hVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f6550i);
        if (this.f7025B == null) {
            this.f7025B = new b();
        }
        actionMenuItemView.setPopupCallback(this.f7025B);
    }

    public boolean dismissPopupMenus() {
        return hideOverflowMenu() | hideSubMenus();
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean filterLeftoverView(ViewGroup viewGroup, int i8) {
        if (viewGroup.getChildAt(i8) == this.f7028k) {
            return false;
        }
        return super.filterLeftoverView(viewGroup, i8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12 */
    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.k
    public boolean flagActionItems() {
        ArrayList<androidx.appcompat.view.menu.h> visibleItems;
        int size;
        int i8;
        int iX;
        boolean z8;
        int i9;
        C0843c c0843c = this;
        androidx.appcompat.view.menu.e eVar = c0843c.f6544c;
        View view = null;
        ?? r32 = 0;
        if (eVar != null) {
            visibleItems = eVar.getVisibleItems();
            size = visibleItems.size();
        } else {
            visibleItems = null;
            size = 0;
        }
        int i10 = c0843c.f7035r;
        int i11 = c0843c.f7034q;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) c0843c.f6550i;
        boolean z9 = false;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            androidx.appcompat.view.menu.h hVar = visibleItems.get(i14);
            if (hVar.requiresActionButton()) {
                i12++;
            } else if (hVar.requestsActionButton()) {
                i13++;
            } else {
                z9 = true;
            }
            if (c0843c.f7039v && hVar.isActionViewExpanded()) {
                i10 = 0;
            }
        }
        if (c0843c.f7031n && (z9 || i13 + i12 > i10)) {
            i10--;
        }
        int i15 = i10 - i12;
        SparseBooleanArray sparseBooleanArray = c0843c.f7041x;
        sparseBooleanArray.clear();
        if (c0843c.f7037t) {
            int i16 = c0843c.f7040w;
            iX = i11 / i16;
            i8 = i16 + ((i11 % i16) / iX);
        } else {
            i8 = 0;
            iX = 0;
        }
        int i17 = 0;
        int i18 = 0;
        while (i17 < size) {
            androidx.appcompat.view.menu.h hVar2 = visibleItems.get(i17);
            if (hVar2.requiresActionButton()) {
                View itemView = c0843c.getItemView(hVar2, view, viewGroup);
                if (c0843c.f7037t) {
                    iX -= ActionMenuView.x(itemView, i8, iX, iMakeMeasureSpec, r32);
                } else {
                    itemView.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                }
                int measuredWidth = itemView.getMeasuredWidth();
                i11 -= measuredWidth;
                if (i18 == 0) {
                    i18 = measuredWidth;
                }
                int groupId = hVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                hVar2.setIsActionButton(true);
                z8 = r32;
                i9 = size;
            } else if (hVar2.requestsActionButton()) {
                int groupId2 = hVar2.getGroupId();
                boolean z10 = sparseBooleanArray.get(groupId2);
                boolean z11 = (i15 > 0 || z10) && i11 > 0 && (!c0843c.f7037t || iX > 0);
                boolean z12 = z11;
                i9 = size;
                if (z11) {
                    View itemView2 = c0843c.getItemView(hVar2, null, viewGroup);
                    if (c0843c.f7037t) {
                        int iX2 = ActionMenuView.x(itemView2, i8, iX, iMakeMeasureSpec, 0);
                        iX -= iX2;
                        if (iX2 == 0) {
                            z12 = false;
                        }
                    } else {
                        itemView2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    }
                    boolean z13 = z12;
                    int measuredWidth2 = itemView2.getMeasuredWidth();
                    i11 -= measuredWidth2;
                    if (i18 == 0) {
                        i18 = measuredWidth2;
                    }
                    z11 = z13 & (!c0843c.f7037t ? i11 + i18 <= 0 : i11 < 0);
                }
                if (z11 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z10) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i19 = 0; i19 < i17; i19++) {
                        androidx.appcompat.view.menu.h hVar3 = visibleItems.get(i19);
                        if (hVar3.getGroupId() == groupId2) {
                            if (hVar3.isActionButton()) {
                                i15++;
                            }
                            hVar3.setIsActionButton(false);
                        }
                    }
                }
                if (z11) {
                    i15--;
                }
                hVar2.setIsActionButton(z11);
                z8 = false;
            } else {
                z8 = r32;
                i9 = size;
                hVar2.setIsActionButton(z8);
            }
            i17++;
            r32 = z8;
            size = i9;
            view = null;
            c0843c = this;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.a
    public View getItemView(androidx.appcompat.view.menu.h hVar, View view, ViewGroup viewGroup) {
        View actionView = hVar.getActionView();
        if (actionView == null || hVar.hasCollapsibleActionView()) {
            actionView = super.getItemView(hVar, view, viewGroup);
        }
        actionView.setVisibility(hVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.k
    public androidx.appcompat.view.menu.l getMenuView(ViewGroup viewGroup) {
        androidx.appcompat.view.menu.l lVar = this.f6550i;
        androidx.appcompat.view.menu.l menuView = super.getMenuView(viewGroup);
        if (lVar != menuView) {
            ((ActionMenuView) menuView).setPresenter(this);
        }
        return menuView;
    }

    public Drawable getOverflowIcon() {
        d dVar = this.f7028k;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f7030m) {
            return this.f7029l;
        }
        return null;
    }

    public boolean hideOverflowMenu() {
        Object obj;
        RunnableC0114c runnableC0114c = this.f7024A;
        if (runnableC0114c != null && (obj = this.f6550i) != null) {
            ((View) obj).removeCallbacks(runnableC0114c);
            this.f7024A = null;
            return true;
        }
        e eVar = this.f7042y;
        if (eVar == null) {
            return false;
        }
        eVar.dismiss();
        return true;
    }

    public boolean hideSubMenus() {
        a aVar = this.f7043z;
        if (aVar == null) {
            return false;
        }
        aVar.dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.k
    public void initForMenu(Context context, androidx.appcompat.view.menu.e eVar) {
        super.initForMenu(context, eVar);
        Resources resources = context.getResources();
        C5875a c5875a = C5875a.get(context);
        if (!this.f7032o) {
            this.f7031n = c5875a.showsOverflowMenuButton();
        }
        if (!this.f7038u) {
            this.f7033p = c5875a.getEmbeddedMenuWidthLimit();
        }
        if (!this.f7036s) {
            this.f7035r = c5875a.getMaxActionButtons();
        }
        int measuredWidth = this.f7033p;
        if (this.f7031n) {
            if (this.f7028k == null) {
                d dVar = new d(this.f6542a);
                this.f7028k = dVar;
                if (this.f7030m) {
                    dVar.setImageDrawable(this.f7029l);
                    this.f7029l = null;
                    this.f7030m = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f7028k.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f7028k.getMeasuredWidth();
        } else {
            this.f7028k = null;
        }
        this.f7034q = measuredWidth;
        this.f7040w = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    public boolean isOverflowMenuShowPending() {
        return this.f7024A != null || isOverflowMenuShowing();
    }

    public boolean isOverflowMenuShowing() {
        e eVar = this.f7042y;
        return eVar != null && eVar.isShowing();
    }

    public boolean isOverflowReserved() {
        return this.f7031n;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.k
    public void onCloseMenu(androidx.appcompat.view.menu.e eVar, boolean z8) {
        dismissPopupMenus();
        super.onCloseMenu(eVar, z8);
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (!this.f7036s) {
            this.f7035r = C5875a.get(this.f6543b).getMaxActionButtons();
        }
        androidx.appcompat.view.menu.e eVar = this.f6544c;
        if (eVar != null) {
            eVar.onItemsChanged(true);
        }
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.k
    public void onRestoreInstanceState(Parcelable parcelable) {
        int i8;
        MenuItem menuItemFindItem;
        if ((parcelable instanceof g) && (i8 = ((g) parcelable).openSubMenuId) > 0 && (menuItemFindItem = this.f6544c.findItem(i8)) != null) {
            onSubMenuSelected((androidx.appcompat.view.menu.n) menuItemFindItem.getSubMenu());
        }
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.k
    public Parcelable onSaveInstanceState() {
        g gVar = new g();
        gVar.openSubMenuId = this.f7027D;
        return gVar;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.k
    public boolean onSubMenuSelected(androidx.appcompat.view.menu.n nVar) {
        boolean z8 = false;
        if (!nVar.hasVisibleItems()) {
            return false;
        }
        androidx.appcompat.view.menu.n nVar2 = nVar;
        while (nVar2.getParentMenu() != this.f6544c) {
            nVar2 = (androidx.appcompat.view.menu.n) nVar2.getParentMenu();
        }
        View viewI = i(nVar2.getItem());
        if (viewI == null) {
            return false;
        }
        this.f7027D = nVar.getItem().getItemId();
        int size = nVar.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                break;
            }
            MenuItem item = nVar.getItem(i8);
            if (item.isVisible() && item.getIcon() != null) {
                z8 = true;
                break;
            }
            i8++;
        }
        a aVar = new a(this.f6543b, nVar, viewI);
        this.f7043z = aVar;
        aVar.setForceShowIcon(z8);
        this.f7043z.show();
        super.onSubMenuSelected(nVar);
        return true;
    }

    @Override // androidx.core.view.AbstractC0942b.a
    public void onSubUiVisibilityChanged(boolean z8) {
        if (z8) {
            super.onSubMenuSelected(null);
            return;
        }
        androidx.appcompat.view.menu.e eVar = this.f6544c;
        if (eVar != null) {
            eVar.close(false);
        }
    }

    public void setExpandedActionViewsExclusive(boolean z8) {
        this.f7039v = z8;
    }

    public void setItemLimit(int i8) {
        this.f7035r = i8;
        this.f7036s = true;
    }

    public void setMenuView(ActionMenuView actionMenuView) {
        this.f6550i = actionMenuView;
        actionMenuView.initialize(this.f6544c);
    }

    public void setOverflowIcon(Drawable drawable) {
        d dVar = this.f7028k;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
        } else {
            this.f7030m = true;
            this.f7029l = drawable;
        }
    }

    public void setReserveOverflow(boolean z8) {
        this.f7031n = z8;
        this.f7032o = true;
    }

    public void setWidthLimit(int i8, boolean z8) {
        this.f7033p = i8;
        this.f7037t = z8;
        this.f7038u = true;
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean shouldIncludeItem(int i8, androidx.appcompat.view.menu.h hVar) {
        return hVar.isActionButton();
    }

    public boolean showOverflowMenu() {
        androidx.appcompat.view.menu.e eVar;
        if (!this.f7031n || isOverflowMenuShowing() || (eVar = this.f6544c) == null || this.f6550i == null || this.f7024A != null || eVar.getNonActionItems().isEmpty()) {
            return false;
        }
        RunnableC0114c runnableC0114c = new RunnableC0114c(new e(this.f6543b, this.f6544c, this.f7028k, true));
        this.f7024A = runnableC0114c;
        ((View) this.f6550i).post(runnableC0114c);
        return true;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.k
    public void updateMenuView(boolean z8) {
        super.updateMenuView(z8);
        ((View) this.f6550i).requestLayout();
        androidx.appcompat.view.menu.e eVar = this.f6544c;
        boolean z9 = false;
        if (eVar != null) {
            ArrayList<androidx.appcompat.view.menu.h> actionItems = eVar.getActionItems();
            int size = actionItems.size();
            for (int i8 = 0; i8 < size; i8++) {
                AbstractC0942b supportActionProvider = actionItems.get(i8).getSupportActionProvider();
                if (supportActionProvider != null) {
                    supportActionProvider.setSubUiVisibilityListener(this);
                }
            }
        }
        androidx.appcompat.view.menu.e eVar2 = this.f6544c;
        ArrayList<androidx.appcompat.view.menu.h> nonActionItems = eVar2 != null ? eVar2.getNonActionItems() : null;
        if (this.f7031n && nonActionItems != null) {
            int size2 = nonActionItems.size();
            if (size2 == 1) {
                z9 = !nonActionItems.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z9 = true;
            }
        }
        if (z9) {
            if (this.f7028k == null) {
                this.f7028k = new d(this.f6542a);
            }
            ViewGroup viewGroup = (ViewGroup) this.f7028k.getParent();
            if (viewGroup != this.f6550i) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f7028k);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f6550i;
                actionMenuView.addView(this.f7028k, actionMenuView.generateOverflowButtonLayoutParams());
            }
        } else {
            d dVar = this.f7028k;
            if (dVar != null) {
                Object parent = dVar.getParent();
                Object obj = this.f6550i;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f7028k);
                }
            }
        }
        ((ActionMenuView) this.f6550i).setOverflowReserved(this.f7031n);
    }
}
