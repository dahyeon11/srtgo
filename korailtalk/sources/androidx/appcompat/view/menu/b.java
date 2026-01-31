package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.d0;
import androidx.appcompat.widget.f0;
import androidx.core.view.A;
import androidx.core.view.AbstractC0985p0;
import h.AbstractC5566d;
import h.AbstractC5569g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class b extends i implements k, View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: B */
    private static final int f6552B = AbstractC5569g.abc_cascading_menu_item_layout;

    /* renamed from: A */
    boolean f6553A;

    /* renamed from: b */
    private final Context f6554b;

    /* renamed from: c */
    private final int f6555c;

    /* renamed from: d */
    private final int f6556d;

    /* renamed from: e */
    private final int f6557e;

    /* renamed from: f */
    private final boolean f6558f;

    /* renamed from: g */
    final Handler f6559g;

    /* renamed from: o */
    private View f6567o;

    /* renamed from: p */
    View f6568p;

    /* renamed from: r */
    private boolean f6570r;

    /* renamed from: s */
    private boolean f6571s;

    /* renamed from: t */
    private int f6572t;

    /* renamed from: u */
    private int f6573u;

    /* renamed from: w */
    private boolean f6575w;

    /* renamed from: x */
    private k.a f6576x;

    /* renamed from: y */
    ViewTreeObserver f6577y;

    /* renamed from: z */
    private PopupWindow.OnDismissListener f6578z;

    /* renamed from: h */
    private final List f6560h = new ArrayList();

    /* renamed from: i */
    final List f6561i = new ArrayList();

    /* renamed from: j */
    final ViewTreeObserver.OnGlobalLayoutListener f6562j = new a();

    /* renamed from: k */
    private final View.OnAttachStateChangeListener f6563k = new ViewOnAttachStateChangeListenerC0112b();

    /* renamed from: l */
    private final d0 f6564l = new c();

    /* renamed from: m */
    private int f6565m = 0;

    /* renamed from: n */
    private int f6566n = 0;

    /* renamed from: v */
    private boolean f6574v = false;

    /* renamed from: q */
    private int f6569q = i();

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!b.this.isShowing() || b.this.f6561i.size() <= 0 || ((d) b.this.f6561i.get(0)).window.isModal()) {
                return;
            }
            View view = b.this.f6568p;
            if (view == null || !view.isShown()) {
                b.this.dismiss();
                return;
            }
            Iterator it = b.this.f6561i.iterator();
            while (it.hasNext()) {
                ((d) it.next()).window.show();
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$b */
    class ViewOnAttachStateChangeListenerC0112b implements View.OnAttachStateChangeListener {
        ViewOnAttachStateChangeListenerC0112b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = b.this.f6577y;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    b.this.f6577y = view.getViewTreeObserver();
                }
                b bVar = b.this;
                bVar.f6577y.removeGlobalOnLayoutListener(bVar.f6562j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    class c implements d0 {

        class a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ d f6582a;

            /* renamed from: b */
            final /* synthetic */ MenuItem f6583b;

            /* renamed from: c */
            final /* synthetic */ e f6584c;

            a(d dVar, MenuItem menuItem, e eVar) {
                this.f6582a = dVar;
                this.f6583b = menuItem;
                this.f6584c = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = this.f6582a;
                if (dVar != null) {
                    b.this.f6553A = true;
                    dVar.menu.close(false);
                    b.this.f6553A = false;
                }
                if (this.f6583b.isEnabled() && this.f6583b.hasSubMenu()) {
                    this.f6584c.performItemAction(this.f6583b, 4);
                }
            }
        }

        c() {
        }

        @Override // androidx.appcompat.widget.d0
        public void onItemHoverEnter(e eVar, MenuItem menuItem) {
            b.this.f6559g.removeCallbacksAndMessages(null);
            int size = b.this.f6561i.size();
            int i8 = 0;
            while (true) {
                if (i8 >= size) {
                    i8 = -1;
                    break;
                } else if (eVar == ((d) b.this.f6561i.get(i8)).menu) {
                    break;
                } else {
                    i8++;
                }
            }
            if (i8 == -1) {
                return;
            }
            int i9 = i8 + 1;
            b.this.f6559g.postAtTime(new a(i9 < b.this.f6561i.size() ? (d) b.this.f6561i.get(i9) : null, menuItem, eVar), eVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.d0
        public void onItemHoverExit(e eVar, MenuItem menuItem) {
            b.this.f6559g.removeCallbacksAndMessages(eVar);
        }
    }

    private static class d {
        public final e menu;
        public final int position;
        public final f0 window;

        public d(f0 f0Var, e eVar, int i8) {
            this.window = f0Var;
            this.menu = eVar;
            this.position = i8;
        }

        public ListView getListView() {
            return this.window.getListView();
        }
    }

    public b(Context context, View view, int i8, int i9, boolean z8) {
        this.f6554b = context;
        this.f6567o = view;
        this.f6556d = i8;
        this.f6557e = i9;
        this.f6558f = z8;
        Resources resources = context.getResources();
        this.f6555c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(AbstractC5566d.abc_config_prefDialogWidth));
        this.f6559g = new Handler();
    }

    private f0 e() {
        f0 f0Var = new f0(this.f6554b, null, this.f6556d, this.f6557e);
        f0Var.setHoverListener(this.f6564l);
        f0Var.setOnItemClickListener(this);
        f0Var.setOnDismissListener(this);
        f0Var.setAnchorView(this.f6567o);
        f0Var.setDropDownGravity(this.f6566n);
        f0Var.setModal(true);
        f0Var.setInputMethodMode(2);
        return f0Var;
    }

    private int f(e eVar) {
        int size = this.f6561i.size();
        for (int i8 = 0; i8 < size; i8++) {
            if (eVar == ((d) this.f6561i.get(i8)).menu) {
                return i8;
            }
        }
        return -1;
    }

    private MenuItem g(e eVar, e eVar2) {
        int size = eVar.size();
        for (int i8 = 0; i8 < size; i8++) {
            MenuItem item = eVar.getItem(i8);
            if (item.hasSubMenu() && eVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    private View h(d dVar, e eVar) {
        androidx.appcompat.view.menu.d dVar2;
        int headersCount;
        int firstVisiblePosition;
        MenuItem menuItemG = g(dVar.menu, eVar);
        if (menuItemG == null) {
            return null;
        }
        ListView listView = dVar.getListView();
        ListAdapter adapter = listView.getAdapter();
        int i8 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            headersCount = headerViewListAdapter.getHeadersCount();
            dVar2 = (androidx.appcompat.view.menu.d) headerViewListAdapter.getWrappedAdapter();
        } else {
            dVar2 = (androidx.appcompat.view.menu.d) adapter;
            headersCount = 0;
        }
        int count = dVar2.getCount();
        while (true) {
            if (i8 >= count) {
                i8 = -1;
                break;
            }
            if (menuItemG == dVar2.getItem(i8)) {
                break;
            }
            i8++;
        }
        if (i8 != -1 && (firstVisiblePosition = (i8 + headersCount) - listView.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < listView.getChildCount()) {
            return listView.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    private int i() {
        return AbstractC0985p0.getLayoutDirection(this.f6567o) == 1 ? 0 : 1;
    }

    private int j(int i8) {
        List list = this.f6561i;
        ListView listView = ((d) list.get(list.size() - 1)).getListView();
        int[] iArr = new int[2];
        listView.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f6568p.getWindowVisibleDisplayFrame(rect);
        return this.f6569q == 1 ? (iArr[0] + listView.getWidth()) + i8 > rect.right ? 0 : 1 : iArr[0] - i8 < 0 ? 1 : 0;
    }

    private void k(e eVar) {
        d dVar;
        View viewH;
        int i8;
        int i9;
        int i10;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f6554b);
        androidx.appcompat.view.menu.d dVar2 = new androidx.appcompat.view.menu.d(eVar, layoutInflaterFrom, this.f6558f, f6552B);
        if (!isShowing() && this.f6574v) {
            dVar2.setForceShowIcon(true);
        } else if (isShowing()) {
            dVar2.setForceShowIcon(i.c(eVar));
        }
        int iB = i.b(dVar2, null, this.f6554b, this.f6555c);
        f0 f0VarE = e();
        f0VarE.setAdapter(dVar2);
        f0VarE.setContentWidth(iB);
        f0VarE.setDropDownGravity(this.f6566n);
        if (this.f6561i.size() > 0) {
            List list = this.f6561i;
            dVar = (d) list.get(list.size() - 1);
            viewH = h(dVar, eVar);
        } else {
            dVar = null;
            viewH = null;
        }
        if (viewH != null) {
            f0VarE.setTouchModal(false);
            f0VarE.setEnterTransition(null);
            int iJ = j(iB);
            boolean z8 = iJ == 1;
            this.f6569q = iJ;
            if (Build.VERSION.SDK_INT >= 26) {
                f0VarE.setAnchorView(viewH);
                i9 = 0;
                i8 = 0;
            } else {
                int[] iArr = new int[2];
                this.f6567o.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                viewH.getLocationOnScreen(iArr2);
                if ((this.f6566n & 7) == 5) {
                    iArr[0] = iArr[0] + this.f6567o.getWidth();
                    iArr2[0] = iArr2[0] + viewH.getWidth();
                }
                i8 = iArr2[0] - iArr[0];
                i9 = iArr2[1] - iArr[1];
            }
            if ((this.f6566n & 5) == 5) {
                if (!z8) {
                    iB = viewH.getWidth();
                    i10 = i8 - iB;
                }
                i10 = i8 + iB;
            } else {
                if (z8) {
                    iB = viewH.getWidth();
                    i10 = i8 + iB;
                }
                i10 = i8 - iB;
            }
            f0VarE.setHorizontalOffset(i10);
            f0VarE.setOverlapAnchor(true);
            f0VarE.setVerticalOffset(i9);
        } else {
            if (this.f6570r) {
                f0VarE.setHorizontalOffset(this.f6572t);
            }
            if (this.f6571s) {
                f0VarE.setVerticalOffset(this.f6573u);
            }
            f0VarE.setEpicenterBounds(getEpicenterBounds());
        }
        this.f6561i.add(new d(f0VarE, eVar, this.f6569q));
        f0VarE.show();
        ListView listView = f0VarE.getListView();
        listView.setOnKeyListener(this);
        if (dVar == null && this.f6575w && eVar.getHeaderTitle() != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(AbstractC5569g.abc_popup_menu_header_item_layout, (ViewGroup) listView, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(eVar.getHeaderTitle());
            listView.addHeaderView(frameLayout, null, false);
            f0VarE.show();
        }
    }

    @Override // androidx.appcompat.view.menu.i
    protected boolean a() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public void addMenu(e eVar) {
        eVar.addMenuPresenter(this, this.f6554b);
        if (isShowing()) {
            k(eVar);
        } else {
            this.f6560h.add(eVar);
        }
    }

    @Override // androidx.appcompat.view.menu.i, m.e
    public void dismiss() {
        int size = this.f6561i.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.f6561i.toArray(new d[size]);
            for (int i8 = size - 1; i8 >= 0; i8--) {
                d dVar = dVarArr[i8];
                if (dVar.window.isShowing()) {
                    dVar.window.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.i, androidx.appcompat.view.menu.k
    public boolean flagActionItems() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i, m.e
    public ListView getListView() {
        if (this.f6561i.isEmpty()) {
            return null;
        }
        return ((d) this.f6561i.get(r0.size() - 1)).getListView();
    }

    @Override // androidx.appcompat.view.menu.i, m.e
    public boolean isShowing() {
        return this.f6561i.size() > 0 && ((d) this.f6561i.get(0)).window.isShowing();
    }

    @Override // androidx.appcompat.view.menu.i, androidx.appcompat.view.menu.k
    public void onCloseMenu(e eVar, boolean z8) {
        int iF = f(eVar);
        if (iF < 0) {
            return;
        }
        int i8 = iF + 1;
        if (i8 < this.f6561i.size()) {
            ((d) this.f6561i.get(i8)).menu.close(false);
        }
        d dVar = (d) this.f6561i.remove(iF);
        dVar.menu.removeMenuPresenter(this);
        if (this.f6553A) {
            dVar.window.setExitTransition(null);
            dVar.window.setAnimationStyle(0);
        }
        dVar.window.dismiss();
        int size = this.f6561i.size();
        if (size > 0) {
            this.f6569q = ((d) this.f6561i.get(size - 1)).position;
        } else {
            this.f6569q = i();
        }
        if (size != 0) {
            if (z8) {
                ((d) this.f6561i.get(0)).menu.close(false);
                return;
            }
            return;
        }
        dismiss();
        k.a aVar = this.f6576x;
        if (aVar != null) {
            aVar.onCloseMenu(eVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f6577y;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f6577y.removeGlobalOnLayoutListener(this.f6562j);
            }
            this.f6577y = null;
        }
        this.f6568p.removeOnAttachStateChangeListener(this.f6563k);
        this.f6578z.onDismiss();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        d dVar;
        int size = this.f6561i.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                dVar = null;
                break;
            }
            dVar = (d) this.f6561i.get(i8);
            if (!dVar.window.isShowing()) {
                break;
            } else {
                i8++;
            }
        }
        if (dVar != null) {
            dVar.menu.close(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i8, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i8 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.i, androidx.appcompat.view.menu.k
    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.i, androidx.appcompat.view.menu.k
    public Parcelable onSaveInstanceState() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.i, androidx.appcompat.view.menu.k
    public boolean onSubMenuSelected(n nVar) {
        for (d dVar : this.f6561i) {
            if (nVar == dVar.menu) {
                dVar.getListView().requestFocus();
                return true;
            }
        }
        if (!nVar.hasVisibleItems()) {
            return false;
        }
        addMenu(nVar);
        k.a aVar = this.f6576x;
        if (aVar != null) {
            aVar.onOpenSubMenu(nVar);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.i
    public void setAnchorView(View view) {
        if (this.f6567o != view) {
            this.f6567o = view;
            this.f6566n = A.getAbsoluteGravity(this.f6565m, AbstractC0985p0.getLayoutDirection(view));
        }
    }

    @Override // androidx.appcompat.view.menu.i, androidx.appcompat.view.menu.k
    public void setCallback(k.a aVar) {
        this.f6576x = aVar;
    }

    @Override // androidx.appcompat.view.menu.i
    public void setForceShowIcon(boolean z8) {
        this.f6574v = z8;
    }

    @Override // androidx.appcompat.view.menu.i
    public void setGravity(int i8) {
        if (this.f6565m != i8) {
            this.f6565m = i8;
            this.f6566n = A.getAbsoluteGravity(i8, AbstractC0985p0.getLayoutDirection(this.f6567o));
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public void setHorizontalOffset(int i8) {
        this.f6570r = true;
        this.f6572t = i8;
    }

    @Override // androidx.appcompat.view.menu.i
    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.f6578z = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.i
    public void setShowTitle(boolean z8) {
        this.f6575w = z8;
    }

    @Override // androidx.appcompat.view.menu.i
    public void setVerticalOffset(int i8) {
        this.f6571s = true;
        this.f6573u = i8;
    }

    @Override // androidx.appcompat.view.menu.i, m.e
    public void show() {
        if (isShowing()) {
            return;
        }
        Iterator it = this.f6560h.iterator();
        while (it.hasNext()) {
            k((e) it.next());
        }
        this.f6560h.clear();
        View view = this.f6567o;
        this.f6568p = view;
        if (view != null) {
            boolean z8 = this.f6577y == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f6577y = viewTreeObserver;
            if (z8) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f6562j);
            }
            this.f6568p.addOnAttachStateChangeListener(this.f6563k);
        }
    }

    @Override // androidx.appcompat.view.menu.i, androidx.appcompat.view.menu.k
    public void updateMenuView(boolean z8) {
        Iterator it = this.f6561i.iterator();
        while (it.hasNext()) {
            i.d(((d) it.next()).getListView().getAdapter()).notifyDataSetChanged();
        }
    }
}
