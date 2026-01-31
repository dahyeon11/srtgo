package m;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.view.AbstractC0942b;

/* renamed from: m.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5901a implements W.b {

    /* renamed from: a, reason: collision with root package name */
    private final int f34059a;

    /* renamed from: b, reason: collision with root package name */
    private final int f34060b;

    /* renamed from: c, reason: collision with root package name */
    private final int f34061c;

    /* renamed from: d, reason: collision with root package name */
    private CharSequence f34062d;

    /* renamed from: e, reason: collision with root package name */
    private CharSequence f34063e;

    /* renamed from: f, reason: collision with root package name */
    private Intent f34064f;

    /* renamed from: g, reason: collision with root package name */
    private char f34065g;

    /* renamed from: i, reason: collision with root package name */
    private char f34067i;

    /* renamed from: k, reason: collision with root package name */
    private Drawable f34069k;

    /* renamed from: l, reason: collision with root package name */
    private Context f34070l;

    /* renamed from: m, reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f34071m;

    /* renamed from: n, reason: collision with root package name */
    private CharSequence f34072n;

    /* renamed from: o, reason: collision with root package name */
    private CharSequence f34073o;

    /* renamed from: h, reason: collision with root package name */
    private int f34066h = 4096;

    /* renamed from: j, reason: collision with root package name */
    private int f34068j = 4096;

    /* renamed from: p, reason: collision with root package name */
    private ColorStateList f34074p = null;

    /* renamed from: q, reason: collision with root package name */
    private PorterDuff.Mode f34075q = null;

    /* renamed from: r, reason: collision with root package name */
    private boolean f34076r = false;

    /* renamed from: s, reason: collision with root package name */
    private boolean f34077s = false;

    /* renamed from: t, reason: collision with root package name */
    private int f34078t = 16;

    public C5901a(Context context, int i8, int i9, int i10, int i11, CharSequence charSequence) {
        this.f34070l = context;
        this.f34059a = i9;
        this.f34060b = i8;
        this.f34061c = i11;
        this.f34062d = charSequence;
    }

    private void a() {
        Drawable drawable = this.f34069k;
        if (drawable != null) {
            if (this.f34076r || this.f34077s) {
                Drawable drawableWrap = androidx.core.graphics.drawable.a.wrap(drawable);
                this.f34069k = drawableWrap;
                Drawable drawableMutate = drawableWrap.mutate();
                this.f34069k = drawableMutate;
                if (this.f34076r) {
                    androidx.core.graphics.drawable.a.setTintList(drawableMutate, this.f34074p);
                }
                if (this.f34077s) {
                    androidx.core.graphics.drawable.a.setTintMode(this.f34069k, this.f34075q);
                }
            }
        }
    }

    @Override // W.b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // W.b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // W.b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // W.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f34068j;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f34067i;
    }

    @Override // W.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f34072n;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f34060b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f34069k;
    }

    @Override // W.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f34074p;
    }

    @Override // W.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f34075q;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f34064f;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f34059a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // W.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f34066h;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f34065g;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f34061c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // W.b
    public AbstractC0942b getSupportActionProvider() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f34062d;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f34063e;
        return charSequence != null ? charSequence : this.f34062d;
    }

    @Override // W.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f34073o;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    public boolean invoke() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f34071m;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        Intent intent = this.f34064f;
        if (intent == null) {
            return false;
        }
        this.f34070l.startActivity(intent);
        return true;
    }

    @Override // W.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f34078t & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f34078t & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f34078t & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f34078t & 8) == 0;
    }

    @Override // W.b
    public boolean requiresActionButton() {
        return true;
    }

    @Override // W.b
    public boolean requiresOverflow() {
        return false;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c9) {
        this.f34067i = Character.toLowerCase(c9);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z8) {
        this.f34078t = (z8 ? 1 : 0) | (this.f34078t & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z8) {
        this.f34078t = (z8 ? 2 : 0) | (this.f34078t & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z8) {
        this.f34078t = (z8 ? 16 : 0) | (this.f34078t & (-17));
        return this;
    }

    public C5901a setExclusiveCheckable(boolean z8) {
        this.f34078t = (z8 ? 4 : 0) | (this.f34078t & (-5));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f34069k = drawable;
        a();
        return this;
    }

    @Override // W.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f34074p = colorStateList;
        this.f34076r = true;
        a();
        return this;
    }

    @Override // W.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f34075q = mode;
        this.f34077s = true;
        a();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f34064f = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c9) {
        this.f34065g = c9;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f34071m = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c9, char c10) {
        this.f34065g = c9;
        this.f34067i = Character.toLowerCase(c10);
        return this;
    }

    @Override // W.b
    public W.b setSupportActionProvider(AbstractC0942b abstractC0942b) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f34062d = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f34063e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z8) {
        this.f34078t = (this.f34078t & 8) | (z8 ? 0 : 8);
        return this;
    }

    @Override // W.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c9, int i8) {
        this.f34067i = Character.toLowerCase(c9);
        this.f34068j = KeyEvent.normalizeMetaState(i8);
        return this;
    }

    @Override // W.b, android.view.MenuItem
    public W.b setContentDescription(CharSequence charSequence) {
        this.f34072n = charSequence;
        return this;
    }

    @Override // W.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c9, int i8) {
        this.f34065g = c9;
        this.f34066h = KeyEvent.normalizeMetaState(i8);
        return this;
    }

    @Override // W.b, android.view.MenuItem
    public W.b setShowAsActionFlags(int i8) {
        setShowAsAction(i8);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i8) {
        this.f34062d = this.f34070l.getResources().getString(i8);
        return this;
    }

    @Override // W.b, android.view.MenuItem
    public W.b setTooltipText(CharSequence charSequence) {
        this.f34073o = charSequence;
        return this;
    }

    @Override // W.b, android.view.MenuItem
    public W.b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i8) {
        this.f34069k = androidx.core.content.a.getDrawable(this.f34070l, i8);
        a();
        return this;
    }

    @Override // W.b, android.view.MenuItem
    public MenuItem setShortcut(char c9, char c10, int i8, int i9) {
        this.f34065g = c9;
        this.f34066h = KeyEvent.normalizeMetaState(i8);
        this.f34067i = Character.toLowerCase(c10);
        this.f34068j = KeyEvent.normalizeMetaState(i9);
        return this;
    }

    @Override // W.b, android.view.MenuItem
    public W.b setActionView(int i8) {
        throw new UnsupportedOperationException();
    }

    @Override // W.b, android.view.MenuItem
    public void setShowAsAction(int i8) {
    }
}
