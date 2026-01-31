package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.f0;
import androidx.core.view.AbstractC0985p0;
import h.AbstractC5566d;
import h.AbstractC5569g;

/* loaded from: classes.dex */
final class m extends i implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, k, View.OnKeyListener {

    /* renamed from: v */
    private static final int f6681v = AbstractC5569g.abc_popup_menu_item_layout;

    /* renamed from: b */
    private final Context f6682b;

    /* renamed from: c */
    private final e f6683c;

    /* renamed from: d */
    private final d f6684d;

    /* renamed from: e */
    private final boolean f6685e;

    /* renamed from: f */
    private final int f6686f;

    /* renamed from: g */
    private final int f6687g;

    /* renamed from: h */
    private final int f6688h;

    /* renamed from: i */
    final f0 f6689i;

    /* renamed from: l */
    private PopupWindow.OnDismissListener f6692l;

    /* renamed from: m */
    private View f6693m;

    /* renamed from: n */
    View f6694n;

    /* renamed from: o */
    private k.a f6695o;

    /* renamed from: p */
    ViewTreeObserver f6696p;

    /* renamed from: q */
    private boolean f6697q;

    /* renamed from: r */
    private boolean f6698r;

    /* renamed from: s */
    private int f6699s;

    /* renamed from: u */
    private boolean f6701u;

    /* renamed from: j */
    final ViewTreeObserver.OnGlobalLayoutListener f6690j = new a();

    /* renamed from: k */
    private final View.OnAttachStateChangeListener f6691k = new b();

    /* renamed from: t */
    private int f6700t = 0;

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!m.this.isShowing() || m.this.f6689i.isModal()) {
                return;
            }
            View view = m.this.f6694n;
            if (view == null || !view.isShown()) {
                m.this.dismiss();
            } else {
                m.this.f6689i.show();
            }
        }
    }

    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = m.this.f6696p;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    m.this.f6696p = view.getViewTreeObserver();
                }
                m mVar = m.this;
                mVar.f6696p.removeGlobalOnLayoutListener(mVar.f6690j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public m(Context context, e eVar, View view, int i8, int i9, boolean z8) {
        this.f6682b = context;
        this.f6683c = eVar;
        this.f6685e = z8;
        this.f6684d = new d(eVar, LayoutInflater.from(context), z8, f6681v);
        this.f6687g = i8;
        this.f6688h = i9;
        Resources resources = context.getResources();
        this.f6686f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(AbstractC5566d.abc_config_prefDialogWidth));
        this.f6693m = view;
        this.f6689i = new f0(context, null, i8, i9);
        eVar.addMenuPresenter(this, context);
    }

    private boolean e() {
        View view;
        if (isShowing()) {
            return true;
        }
        if (this.f6697q || (view = this.f6693m) == null) {
            return false;
        }
        this.f6694n = view;
        this.f6689i.setOnDismissListener(this);
        this.f6689i.setOnItemClickListener(this);
        this.f6689i.setModal(true);
        View view2 = this.f6694n;
        boolean z8 = this.f6696p == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f6696p = viewTreeObserver;
        if (z8) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f6690j);
        }
        view2.addOnAttachStateChangeListener(this.f6691k);
        this.f6689i.setAnchorView(view2);
        this.f6689i.setDropDownGravity(this.f6700t);
        if (!this.f6698r) {
            this.f6699s = i.b(this.f6684d, null, this.f6682b, this.f6686f);
            this.f6698r = true;
        }
        this.f6689i.setContentWidth(this.f6699s);
        this.f6689i.setInputMethodMode(2);
        this.f6689i.setEpicenterBounds(getEpicenterBounds());
        this.f6689i.show();
        ListView listView = this.f6689i.getListView();
        listView.setOnKeyListener(this);
        if (this.f6701u && this.f6683c.getHeaderTitle() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f6682b).inflate(AbstractC5569g.abc_popup_menu_header_item_layout, (ViewGroup) listView, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(this.f6683c.getHeaderTitle());
            }
            frameLayout.setEnabled(false);
            listView.addHeaderView(frameLayout, null, false);
        }
        this.f6689i.setAdapter(this.f6684d);
        this.f6689i.show();
        return true;
    }

    @Override // androidx.appcompat.view.menu.i
    public void addMenu(e eVar) {
    }

    @Override // androidx.appcompat.view.menu.i, m.e
    public void dismiss() {
        if (isShowing()) {
            this.f6689i.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.i, androidx.appcompat.view.menu.k
    public boolean flagActionItems() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i, m.e
    public ListView getListView() {
        return this.f6689i.getListView();
    }

    @Override // androidx.appcompat.view.menu.i, m.e
    public boolean isShowing() {
        return !this.f6697q && this.f6689i.isShowing();
    }

    @Override // androidx.appcompat.view.menu.i, androidx.appcompat.view.menu.k
    public void onCloseMenu(e eVar, boolean z8) {
        if (eVar != this.f6683c) {
            return;
        }
        dismiss();
        k.a aVar = this.f6695o;
        if (aVar != null) {
            aVar.onCloseMenu(eVar, z8);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f6697q = true;
        this.f6683c.close();
        ViewTreeObserver viewTreeObserver = this.f6696p;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f6696p = this.f6694n.getViewTreeObserver();
            }
            this.f6696p.removeGlobalOnLayoutListener(this.f6690j);
            this.f6696p = null;
        }
        this.f6694n.removeOnAttachStateChangeListener(this.f6691k);
        PopupWindow.OnDismissListener onDismissListener = this.f6692l;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
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
        if (nVar.hasVisibleItems()) {
            j jVar = new j(this.f6682b, nVar, this.f6694n, this.f6685e, this.f6687g, this.f6688h);
            jVar.setPresenterCallback(this.f6695o);
            jVar.setForceShowIcon(i.c(nVar));
            jVar.setOnDismissListener(this.f6692l);
            this.f6692l = null;
            this.f6683c.close(false);
            int horizontalOffset = this.f6689i.getHorizontalOffset();
            int verticalOffset = this.f6689i.getVerticalOffset();
            if ((Gravity.getAbsoluteGravity(this.f6700t, AbstractC0985p0.getLayoutDirection(this.f6693m)) & 7) == 5) {
                horizontalOffset += this.f6693m.getWidth();
            }
            if (jVar.tryShow(horizontalOffset, verticalOffset)) {
                k.a aVar = this.f6695o;
                if (aVar == null) {
                    return true;
                }
                aVar.onOpenSubMenu(nVar);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public void setAnchorView(View view) {
        this.f6693m = view;
    }

    @Override // androidx.appcompat.view.menu.i, androidx.appcompat.view.menu.k
    public void setCallback(k.a aVar) {
        this.f6695o = aVar;
    }

    @Override // androidx.appcompat.view.menu.i
    public void setForceShowIcon(boolean z8) {
        this.f6684d.setForceShowIcon(z8);
    }

    @Override // androidx.appcompat.view.menu.i
    public void setGravity(int i8) {
        this.f6700t = i8;
    }

    @Override // androidx.appcompat.view.menu.i
    public void setHorizontalOffset(int i8) {
        this.f6689i.setHorizontalOffset(i8);
    }

    @Override // androidx.appcompat.view.menu.i
    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.f6692l = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.i
    public void setShowTitle(boolean z8) {
        this.f6701u = z8;
    }

    @Override // androidx.appcompat.view.menu.i
    public void setVerticalOffset(int i8) {
        this.f6689i.setVerticalOffset(i8);
    }

    @Override // androidx.appcompat.view.menu.i, m.e
    public void show() {
        if (!e()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // androidx.appcompat.view.menu.i, androidx.appcompat.view.menu.k
    public void updateMenuView(boolean z8) {
        this.f6698r = false;
        d dVar = this.f6684d;
        if (dVar != null) {
            dVar.notifyDataSetChanged();
        }
    }
}
