package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.l;
import androidx.core.view.AbstractC0942b;
import h.AbstractC5570h;
import i.AbstractC5638a;

/* loaded from: classes.dex */
public final class h implements W.b {

    /* renamed from: A, reason: collision with root package name */
    private View f6635A;

    /* renamed from: B, reason: collision with root package name */
    private AbstractC0942b f6636B;

    /* renamed from: C, reason: collision with root package name */
    private MenuItem.OnActionExpandListener f6637C;

    /* renamed from: E, reason: collision with root package name */
    private ContextMenu.ContextMenuInfo f6639E;

    /* renamed from: a, reason: collision with root package name */
    private final int f6640a;

    /* renamed from: b, reason: collision with root package name */
    private final int f6641b;

    /* renamed from: c, reason: collision with root package name */
    private final int f6642c;

    /* renamed from: d, reason: collision with root package name */
    private final int f6643d;

    /* renamed from: e, reason: collision with root package name */
    private CharSequence f6644e;

    /* renamed from: f, reason: collision with root package name */
    private CharSequence f6645f;

    /* renamed from: g, reason: collision with root package name */
    private Intent f6646g;

    /* renamed from: h, reason: collision with root package name */
    private char f6647h;

    /* renamed from: j, reason: collision with root package name */
    private char f6649j;

    /* renamed from: l, reason: collision with root package name */
    private Drawable f6651l;

    /* renamed from: n, reason: collision with root package name */
    e f6653n;

    /* renamed from: o, reason: collision with root package name */
    private n f6654o;

    /* renamed from: p, reason: collision with root package name */
    private Runnable f6655p;

    /* renamed from: q, reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f6656q;

    /* renamed from: r, reason: collision with root package name */
    private CharSequence f6657r;

    /* renamed from: s, reason: collision with root package name */
    private CharSequence f6658s;

    /* renamed from: z, reason: collision with root package name */
    private int f6665z;

    /* renamed from: i, reason: collision with root package name */
    private int f6648i = 4096;

    /* renamed from: k, reason: collision with root package name */
    private int f6650k = 4096;

    /* renamed from: m, reason: collision with root package name */
    private int f6652m = 0;

    /* renamed from: t, reason: collision with root package name */
    private ColorStateList f6659t = null;

    /* renamed from: u, reason: collision with root package name */
    private PorterDuff.Mode f6660u = null;

    /* renamed from: v, reason: collision with root package name */
    private boolean f6661v = false;

    /* renamed from: w, reason: collision with root package name */
    private boolean f6662w = false;

    /* renamed from: x, reason: collision with root package name */
    private boolean f6663x = false;

    /* renamed from: y, reason: collision with root package name */
    private int f6664y = 16;

    /* renamed from: D, reason: collision with root package name */
    private boolean f6638D = false;

    class a implements AbstractC0942b.InterfaceC0144b {
        a() {
        }

        @Override // androidx.core.view.AbstractC0942b.InterfaceC0144b
        public void onActionProviderVisibilityChanged(boolean z8) {
            h hVar = h.this;
            hVar.f6653n.o(hVar);
        }
    }

    h(e eVar, int i8, int i9, int i10, int i11, CharSequence charSequence, int i12) {
        this.f6653n = eVar;
        this.f6640a = i9;
        this.f6641b = i8;
        this.f6642c = i10;
        this.f6643d = i11;
        this.f6644e = charSequence;
        this.f6665z = i12;
    }

    private static void a(StringBuilder sb, int i8, int i9, String str) {
        if ((i8 & i9) == i9) {
            sb.append(str);
        }
    }

    private Drawable b(Drawable drawable) {
        if (drawable != null && this.f6663x && (this.f6661v || this.f6662w)) {
            drawable = androidx.core.graphics.drawable.a.wrap(drawable).mutate();
            if (this.f6661v) {
                androidx.core.graphics.drawable.a.setTintList(drawable, this.f6659t);
            }
            if (this.f6662w) {
                androidx.core.graphics.drawable.a.setTintMode(drawable, this.f6660u);
            }
            this.f6663x = false;
        }
        return drawable;
    }

    public void actionFormatChanged() {
        this.f6653n.n(this);
    }

    char c() {
        return this.f6653n.isQwertyMode() ? this.f6649j : this.f6647h;
    }

    @Override // W.b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f6665z & 8) == 0) {
            return false;
        }
        if (this.f6635A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f6637C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f6653n.collapseItemActionView(this);
        }
        return false;
    }

    String d() {
        char c9 = c();
        if (c9 == 0) {
            return "";
        }
        Resources resources = this.f6653n.getContext().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f6653n.getContext()).hasPermanentMenuKey()) {
            sb.append(resources.getString(AbstractC5570h.abc_prepend_shortcut_label));
        }
        int i8 = this.f6653n.isQwertyMode() ? this.f6650k : this.f6648i;
        a(sb, i8, 65536, resources.getString(AbstractC5570h.abc_menu_meta_shortcut_label));
        a(sb, i8, 4096, resources.getString(AbstractC5570h.abc_menu_ctrl_shortcut_label));
        a(sb, i8, 2, resources.getString(AbstractC5570h.abc_menu_alt_shortcut_label));
        a(sb, i8, 1, resources.getString(AbstractC5570h.abc_menu_shift_shortcut_label));
        a(sb, i8, 4, resources.getString(AbstractC5570h.abc_menu_sym_shortcut_label));
        a(sb, i8, 8, resources.getString(AbstractC5570h.abc_menu_function_shortcut_label));
        if (c9 == '\b') {
            sb.append(resources.getString(AbstractC5570h.abc_menu_delete_shortcut_label));
        } else if (c9 == '\n') {
            sb.append(resources.getString(AbstractC5570h.abc_menu_enter_shortcut_label));
        } else if (c9 != ' ') {
            sb.append(c9);
        } else {
            sb.append(resources.getString(AbstractC5570h.abc_menu_space_shortcut_label));
        }
        return sb.toString();
    }

    CharSequence e(l.a aVar) {
        return (aVar == null || !aVar.prefersCondensedTitle()) ? getTitle() : getTitleCondensed();
    }

    @Override // W.b, android.view.MenuItem
    public boolean expandActionView() {
        if (!hasCollapsibleActionView()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f6637C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f6653n.expandItemActionView(this);
        }
        return false;
    }

    void f(boolean z8) {
        int i8 = this.f6664y;
        int i9 = (z8 ? 2 : 0) | (i8 & (-3));
        this.f6664y = i9;
        if (i8 != i9) {
            this.f6653n.onItemsChanged(false);
        }
    }

    void g(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f6639E = contextMenuInfo;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // W.b, android.view.MenuItem
    public View getActionView() {
        View view = this.f6635A;
        if (view != null) {
            return view;
        }
        AbstractC0942b abstractC0942b = this.f6636B;
        if (abstractC0942b == null) {
            return null;
        }
        View viewOnCreateActionView = abstractC0942b.onCreateActionView(this);
        this.f6635A = viewOnCreateActionView;
        return viewOnCreateActionView;
    }

    @Override // W.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f6650k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f6649j;
    }

    @Override // W.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f6657r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f6641b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f6651l;
        if (drawable != null) {
            return b(drawable);
        }
        if (this.f6652m == 0) {
            return null;
        }
        Drawable drawable2 = AbstractC5638a.getDrawable(this.f6653n.getContext(), this.f6652m);
        this.f6652m = 0;
        this.f6651l = drawable2;
        return b(drawable2);
    }

    @Override // W.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f6659t;
    }

    @Override // W.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f6660u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f6646g;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f6640a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f6639E;
    }

    @Override // W.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f6648i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f6647h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f6642c;
    }

    public int getOrdering() {
        return this.f6643d;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f6654o;
    }

    @Override // W.b
    public AbstractC0942b getSupportActionProvider() {
        return this.f6636B;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f6644e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f6645f;
        return charSequence != null ? charSequence : this.f6644e;
    }

    @Override // W.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f6658s;
    }

    boolean h(boolean z8) {
        int i8 = this.f6664y;
        int i9 = (z8 ? 0 : 8) | (i8 & (-9));
        this.f6664y = i9;
        return i8 != i9;
    }

    public boolean hasCollapsibleActionView() {
        AbstractC0942b abstractC0942b;
        if ((this.f6665z & 8) == 0) {
            return false;
        }
        if (this.f6635A == null && (abstractC0942b = this.f6636B) != null) {
            this.f6635A = abstractC0942b.onCreateActionView(this);
        }
        return this.f6635A != null;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f6654o != null;
    }

    boolean i() {
        return this.f6653n.isShortcutsVisible() && c() != 0;
    }

    public boolean invoke() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f6656q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        e eVar = this.f6653n;
        if (eVar.c(eVar, this)) {
            return true;
        }
        Runnable runnable = this.f6655p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f6646g != null) {
            try {
                this.f6653n.getContext().startActivity(this.f6646g);
                return true;
            } catch (ActivityNotFoundException e8) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e8);
            }
        }
        AbstractC0942b abstractC0942b = this.f6636B;
        return abstractC0942b != null && abstractC0942b.onPerformDefaultAction();
    }

    public boolean isActionButton() {
        return (this.f6664y & 32) == 32;
    }

    @Override // W.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f6638D;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f6664y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f6664y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f6664y & 16) != 0;
    }

    public boolean isExclusiveCheckable() {
        return (this.f6664y & 4) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        AbstractC0942b abstractC0942b = this.f6636B;
        return (abstractC0942b == null || !abstractC0942b.overridesItemVisibility()) ? (this.f6664y & 8) == 0 : (this.f6664y & 8) == 0 && this.f6636B.isVisible();
    }

    public boolean requestsActionButton() {
        return (this.f6665z & 1) == 1;
    }

    @Override // W.b
    public boolean requiresActionButton() {
        return (this.f6665z & 2) == 2;
    }

    @Override // W.b
    public boolean requiresOverflow() {
        return (requiresActionButton() || requestsActionButton()) ? false : true;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public void setActionViewExpanded(boolean z8) {
        this.f6638D = z8;
        this.f6653n.onItemsChanged(false);
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c9) {
        if (this.f6649j == c9) {
            return this;
        }
        this.f6649j = Character.toLowerCase(c9);
        this.f6653n.onItemsChanged(false);
        return this;
    }

    public MenuItem setCallback(Runnable runnable) {
        this.f6655p = runnable;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z8) {
        int i8 = this.f6664y;
        int i9 = (z8 ? 1 : 0) | (i8 & (-2));
        this.f6664y = i9;
        if (i8 != i9) {
            this.f6653n.onItemsChanged(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z8) {
        if ((this.f6664y & 4) != 0) {
            this.f6653n.q(this);
        } else {
            f(z8);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z8) {
        if (z8) {
            this.f6664y |= 16;
        } else {
            this.f6664y &= -17;
        }
        this.f6653n.onItemsChanged(false);
        return this;
    }

    public void setExclusiveCheckable(boolean z8) {
        this.f6664y = (z8 ? 4 : 0) | (this.f6664y & (-5));
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f6652m = 0;
        this.f6651l = drawable;
        this.f6663x = true;
        this.f6653n.onItemsChanged(false);
        return this;
    }

    @Override // W.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f6659t = colorStateList;
        this.f6661v = true;
        this.f6663x = true;
        this.f6653n.onItemsChanged(false);
        return this;
    }

    @Override // W.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f6660u = mode;
        this.f6662w = true;
        this.f6663x = true;
        this.f6653n.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f6646g = intent;
        return this;
    }

    public void setIsActionButton(boolean z8) {
        if (z8) {
            this.f6664y |= 32;
        } else {
            this.f6664y &= -33;
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c9) {
        if (this.f6647h == c9) {
            return this;
        }
        this.f6647h = c9;
        this.f6653n.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f6637C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f6656q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c9, char c10) {
        this.f6647h = c9;
        this.f6649j = Character.toLowerCase(c10);
        this.f6653n.onItemsChanged(false);
        return this;
    }

    @Override // W.b, android.view.MenuItem
    public void setShowAsAction(int i8) {
        int i9 = i8 & 3;
        if (i9 != 0 && i9 != 1 && i9 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f6665z = i8;
        this.f6653n.n(this);
    }

    public void setSubMenu(n nVar) {
        this.f6654o = nVar;
        nVar.setHeaderTitle(getTitle());
    }

    @Override // W.b
    public W.b setSupportActionProvider(AbstractC0942b abstractC0942b) {
        AbstractC0942b abstractC0942b2 = this.f6636B;
        if (abstractC0942b2 != null) {
            abstractC0942b2.reset();
        }
        this.f6635A = null;
        this.f6636B = abstractC0942b;
        this.f6653n.onItemsChanged(true);
        AbstractC0942b abstractC0942b3 = this.f6636B;
        if (abstractC0942b3 != null) {
            abstractC0942b3.setVisibilityListener(new a());
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f6644e = charSequence;
        this.f6653n.onItemsChanged(false);
        n nVar = this.f6654o;
        if (nVar != null) {
            nVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f6645f = charSequence;
        this.f6653n.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z8) {
        if (h(z8)) {
            this.f6653n.o(this);
        }
        return this;
    }

    public boolean shouldShowIcon() {
        return this.f6653n.k();
    }

    public boolean showsTextAsAction() {
        return (this.f6665z & 4) == 4;
    }

    public String toString() {
        CharSequence charSequence = this.f6644e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // W.b, android.view.MenuItem
    public W.b setContentDescription(CharSequence charSequence) {
        this.f6657r = charSequence;
        this.f6653n.onItemsChanged(false);
        return this;
    }

    @Override // W.b, android.view.MenuItem
    public W.b setShowAsActionFlags(int i8) {
        setShowAsAction(i8);
        return this;
    }

    @Override // W.b, android.view.MenuItem
    public W.b setTooltipText(CharSequence charSequence) {
        this.f6658s = charSequence;
        this.f6653n.onItemsChanged(false);
        return this;
    }

    @Override // W.b, android.view.MenuItem
    public W.b setActionView(View view) {
        int i8;
        this.f6635A = view;
        this.f6636B = null;
        if (view != null && view.getId() == -1 && (i8 = this.f6640a) > 0) {
            view.setId(i8);
        }
        this.f6653n.n(this);
        return this;
    }

    @Override // W.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c9, int i8) {
        if (this.f6649j == c9 && this.f6650k == i8) {
            return this;
        }
        this.f6649j = Character.toLowerCase(c9);
        this.f6650k = KeyEvent.normalizeMetaState(i8);
        this.f6653n.onItemsChanged(false);
        return this;
    }

    @Override // W.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c9, int i8) {
        if (this.f6647h == c9 && this.f6648i == i8) {
            return this;
        }
        this.f6647h = c9;
        this.f6648i = KeyEvent.normalizeMetaState(i8);
        this.f6653n.onItemsChanged(false);
        return this;
    }

    @Override // W.b, android.view.MenuItem
    public MenuItem setShortcut(char c9, char c10, int i8, int i9) {
        this.f6647h = c9;
        this.f6648i = KeyEvent.normalizeMetaState(i8);
        this.f6649j = Character.toLowerCase(c10);
        this.f6650k = KeyEvent.normalizeMetaState(i9);
        this.f6653n.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i8) {
        this.f6651l = null;
        this.f6652m = i8;
        this.f6663x = true;
        this.f6653n.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i8) {
        return setTitle(this.f6653n.getContext().getString(i8));
    }

    @Override // W.b, android.view.MenuItem
    public W.b setActionView(int i8) {
        Context context = this.f6653n.getContext();
        setActionView(LayoutInflater.from(context).inflate(i8, (ViewGroup) new LinearLayout(context), false));
        return this;
    }
}
