package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.AbstractC0985p0;
import androidx.core.view.C1001x0;
import androidx.core.view.C1005z0;
import h.AbstractC5563a;
import h.AbstractC5567e;
import h.AbstractC5568f;
import h.AbstractC5570h;
import h.AbstractC5572j;
import i.AbstractC5638a;
import m.C5901a;

/* loaded from: classes.dex */
public class s0 implements P {

    /* renamed from: a */
    Toolbar f7230a;

    /* renamed from: b */
    private int f7231b;

    /* renamed from: c */
    private View f7232c;

    /* renamed from: d */
    private Spinner f7233d;

    /* renamed from: e */
    private View f7234e;

    /* renamed from: f */
    private Drawable f7235f;

    /* renamed from: g */
    private Drawable f7236g;

    /* renamed from: h */
    private Drawable f7237h;

    /* renamed from: i */
    private boolean f7238i;

    /* renamed from: j */
    CharSequence f7239j;

    /* renamed from: k */
    private CharSequence f7240k;

    /* renamed from: l */
    private CharSequence f7241l;

    /* renamed from: m */
    Window.Callback f7242m;

    /* renamed from: n */
    boolean f7243n;

    /* renamed from: o */
    private C0843c f7244o;

    /* renamed from: p */
    private int f7245p;

    /* renamed from: q */
    private int f7246q;

    /* renamed from: r */
    private Drawable f7247r;

    class a implements View.OnClickListener {

        /* renamed from: a */
        final C5901a f7248a;

        a() {
            this.f7248a = new C5901a(s0.this.f7230a.getContext(), 0, R.id.home, 0, 0, s0.this.f7239j);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            s0 s0Var = s0.this;
            Window.Callback callback = s0Var.f7242m;
            if (callback == null || !s0Var.f7243n) {
                return;
            }
            callback.onMenuItemSelected(0, this.f7248a);
        }
    }

    class b extends C1005z0 {

        /* renamed from: a */
        private boolean f7250a = false;

        /* renamed from: b */
        final /* synthetic */ int f7251b;

        b(int i8) {
            this.f7251b = i8;
        }

        @Override // androidx.core.view.C1005z0, androidx.core.view.InterfaceC1003y0
        public void onAnimationCancel(View view) {
            this.f7250a = true;
        }

        @Override // androidx.core.view.C1005z0, androidx.core.view.InterfaceC1003y0
        public void onAnimationEnd(View view) {
            if (this.f7250a) {
                return;
            }
            s0.this.f7230a.setVisibility(this.f7251b);
        }

        @Override // androidx.core.view.C1005z0, androidx.core.view.InterfaceC1003y0
        public void onAnimationStart(View view) {
            s0.this.f7230a.setVisibility(0);
        }
    }

    public s0(Toolbar toolbar, boolean z8) {
        this(toolbar, z8, AbstractC5570h.abc_action_bar_up_description, AbstractC5567e.abc_ic_ab_back_material);
    }

    private int a() {
        if (this.f7230a.getNavigationIcon() == null) {
            return 11;
        }
        this.f7247r = this.f7230a.getNavigationIcon();
        return 15;
    }

    private void b() {
        if (this.f7233d == null) {
            this.f7233d = new C0863x(getContext(), null, AbstractC5563a.actionDropDownStyle);
            this.f7233d.setLayoutParams(new Toolbar.e(-2, -2, 8388627));
        }
    }

    private void c(CharSequence charSequence) {
        this.f7239j = charSequence;
        if ((this.f7231b & 8) != 0) {
            this.f7230a.setTitle(charSequence);
        }
    }

    private void d() {
        if ((this.f7231b & 4) != 0) {
            if (TextUtils.isEmpty(this.f7241l)) {
                this.f7230a.setNavigationContentDescription(this.f7246q);
            } else {
                this.f7230a.setNavigationContentDescription(this.f7241l);
            }
        }
    }

    private void e() {
        if ((this.f7231b & 4) == 0) {
            this.f7230a.setNavigationIcon((Drawable) null);
            return;
        }
        Toolbar toolbar = this.f7230a;
        Drawable drawable = this.f7237h;
        if (drawable == null) {
            drawable = this.f7247r;
        }
        toolbar.setNavigationIcon(drawable);
    }

    private void f() {
        Drawable drawable;
        int i8 = this.f7231b;
        if ((i8 & 2) == 0) {
            drawable = null;
        } else if ((i8 & 1) == 0 || (drawable = this.f7236g) == null) {
            drawable = this.f7235f;
        }
        this.f7230a.setLogo(drawable);
    }

    @Override // androidx.appcompat.widget.P
    public void animateToVisibility(int i8) {
        C1001x0 c1001x0 = setupAnimatorToVisibility(i8, 200L);
        if (c1001x0 != null) {
            c1001x0.start();
        }
    }

    @Override // androidx.appcompat.widget.P
    public boolean canShowOverflowMenu() {
        return this.f7230a.canShowOverflowMenu();
    }

    @Override // androidx.appcompat.widget.P
    public void collapseActionView() {
        this.f7230a.collapseActionView();
    }

    @Override // androidx.appcompat.widget.P
    public void dismissPopupMenus() {
        this.f7230a.dismissPopupMenus();
    }

    @Override // androidx.appcompat.widget.P
    public Context getContext() {
        return this.f7230a.getContext();
    }

    @Override // androidx.appcompat.widget.P
    public View getCustomView() {
        return this.f7234e;
    }

    @Override // androidx.appcompat.widget.P
    public int getDisplayOptions() {
        return this.f7231b;
    }

    @Override // androidx.appcompat.widget.P
    public int getDropdownItemCount() {
        Spinner spinner = this.f7233d;
        if (spinner != null) {
            return spinner.getCount();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.P
    public int getDropdownSelectedPosition() {
        Spinner spinner = this.f7233d;
        if (spinner != null) {
            return spinner.getSelectedItemPosition();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.P
    public int getHeight() {
        return this.f7230a.getHeight();
    }

    @Override // androidx.appcompat.widget.P
    public Menu getMenu() {
        return this.f7230a.getMenu();
    }

    @Override // androidx.appcompat.widget.P
    public int getNavigationMode() {
        return this.f7245p;
    }

    @Override // androidx.appcompat.widget.P
    public CharSequence getSubtitle() {
        return this.f7230a.getSubtitle();
    }

    @Override // androidx.appcompat.widget.P
    public CharSequence getTitle() {
        return this.f7230a.getTitle();
    }

    @Override // androidx.appcompat.widget.P
    public ViewGroup getViewGroup() {
        return this.f7230a;
    }

    @Override // androidx.appcompat.widget.P
    public int getVisibility() {
        return this.f7230a.getVisibility();
    }

    @Override // androidx.appcompat.widget.P
    public boolean hasEmbeddedTabs() {
        return this.f7232c != null;
    }

    @Override // androidx.appcompat.widget.P
    public boolean hasExpandedActionView() {
        return this.f7230a.hasExpandedActionView();
    }

    @Override // androidx.appcompat.widget.P
    public boolean hasIcon() {
        return this.f7235f != null;
    }

    @Override // androidx.appcompat.widget.P
    public boolean hasLogo() {
        return this.f7236g != null;
    }

    @Override // androidx.appcompat.widget.P
    public boolean hideOverflowMenu() {
        return this.f7230a.hideOverflowMenu();
    }

    @Override // androidx.appcompat.widget.P
    public void initIndeterminateProgress() {
    }

    @Override // androidx.appcompat.widget.P
    public void initProgress() {
    }

    @Override // androidx.appcompat.widget.P
    public boolean isOverflowMenuShowPending() {
        return this.f7230a.isOverflowMenuShowPending();
    }

    @Override // androidx.appcompat.widget.P
    public boolean isOverflowMenuShowing() {
        return this.f7230a.isOverflowMenuShowing();
    }

    @Override // androidx.appcompat.widget.P
    public boolean isTitleTruncated() {
        return this.f7230a.isTitleTruncated();
    }

    @Override // androidx.appcompat.widget.P
    public void restoreHierarchyState(SparseArray<Parcelable> sparseArray) {
        this.f7230a.restoreHierarchyState(sparseArray);
    }

    @Override // androidx.appcompat.widget.P
    public void saveHierarchyState(SparseArray<Parcelable> sparseArray) {
        this.f7230a.saveHierarchyState(sparseArray);
    }

    @Override // androidx.appcompat.widget.P
    public void setBackgroundDrawable(Drawable drawable) {
        AbstractC0985p0.setBackground(this.f7230a, drawable);
    }

    @Override // androidx.appcompat.widget.P
    public void setCollapsible(boolean z8) {
        this.f7230a.setCollapsible(z8);
    }

    @Override // androidx.appcompat.widget.P
    public void setCustomView(View view) {
        View view2 = this.f7234e;
        if (view2 != null && (this.f7231b & 16) != 0) {
            this.f7230a.removeView(view2);
        }
        this.f7234e = view;
        if (view == null || (this.f7231b & 16) == 0) {
            return;
        }
        this.f7230a.addView(view);
    }

    @Override // androidx.appcompat.widget.P
    public void setDefaultNavigationContentDescription(int i8) {
        if (i8 == this.f7246q) {
            return;
        }
        this.f7246q = i8;
        if (TextUtils.isEmpty(this.f7230a.getNavigationContentDescription())) {
            setNavigationContentDescription(this.f7246q);
        }
    }

    @Override // androidx.appcompat.widget.P
    public void setDefaultNavigationIcon(Drawable drawable) {
        if (this.f7247r != drawable) {
            this.f7247r = drawable;
            e();
        }
    }

    @Override // androidx.appcompat.widget.P
    public void setDisplayOptions(int i8) {
        View view;
        int i9 = this.f7231b ^ i8;
        this.f7231b = i8;
        if (i9 != 0) {
            if ((i9 & 4) != 0) {
                if ((i8 & 4) != 0) {
                    d();
                }
                e();
            }
            if ((i9 & 3) != 0) {
                f();
            }
            if ((i9 & 8) != 0) {
                if ((i8 & 8) != 0) {
                    this.f7230a.setTitle(this.f7239j);
                    this.f7230a.setSubtitle(this.f7240k);
                } else {
                    this.f7230a.setTitle((CharSequence) null);
                    this.f7230a.setSubtitle((CharSequence) null);
                }
            }
            if ((i9 & 16) == 0 || (view = this.f7234e) == null) {
                return;
            }
            if ((i8 & 16) != 0) {
                this.f7230a.addView(view);
            } else {
                this.f7230a.removeView(view);
            }
        }
    }

    @Override // androidx.appcompat.widget.P
    public void setDropdownParams(SpinnerAdapter spinnerAdapter, AdapterView.OnItemSelectedListener onItemSelectedListener) {
        b();
        this.f7233d.setAdapter(spinnerAdapter);
        this.f7233d.setOnItemSelectedListener(onItemSelectedListener);
    }

    @Override // androidx.appcompat.widget.P
    public void setDropdownSelectedPosition(int i8) {
        Spinner spinner = this.f7233d;
        if (spinner == null) {
            throw new IllegalStateException("Can't set dropdown selected position without an adapter");
        }
        spinner.setSelection(i8);
    }

    @Override // androidx.appcompat.widget.P
    public void setEmbeddedTabView(j0 j0Var) {
        View view = this.f7232c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f7230a;
            if (parent == toolbar) {
                toolbar.removeView(this.f7232c);
            }
        }
        this.f7232c = j0Var;
        if (j0Var == null || this.f7245p != 2) {
            return;
        }
        this.f7230a.addView(j0Var, 0);
        Toolbar.e eVar = (Toolbar.e) this.f7232c.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) eVar).width = -2;
        ((ViewGroup.MarginLayoutParams) eVar).height = -2;
        eVar.gravity = L2.a.BOTTOM_START;
        j0Var.setAllowCollapse(true);
    }

    @Override // androidx.appcompat.widget.P
    public void setHomeButtonEnabled(boolean z8) {
    }

    @Override // androidx.appcompat.widget.P
    public void setIcon(int i8) {
        setIcon(i8 != 0 ? AbstractC5638a.getDrawable(getContext(), i8) : null);
    }

    @Override // androidx.appcompat.widget.P
    public void setLogo(int i8) {
        setLogo(i8 != 0 ? AbstractC5638a.getDrawable(getContext(), i8) : null);
    }

    @Override // androidx.appcompat.widget.P
    public void setMenu(Menu menu, k.a aVar) {
        if (this.f7244o == null) {
            C0843c c0843c = new C0843c(this.f7230a.getContext());
            this.f7244o = c0843c;
            c0843c.setId(AbstractC5568f.action_menu_presenter);
        }
        this.f7244o.setCallback(aVar);
        this.f7230a.setMenu((androidx.appcompat.view.menu.e) menu, this.f7244o);
    }

    @Override // androidx.appcompat.widget.P
    public void setMenuCallbacks(k.a aVar, e.a aVar2) {
        this.f7230a.setMenuCallbacks(aVar, aVar2);
    }

    @Override // androidx.appcompat.widget.P
    public void setMenuPrepared() {
        this.f7243n = true;
    }

    @Override // androidx.appcompat.widget.P
    public void setNavigationContentDescription(CharSequence charSequence) {
        this.f7241l = charSequence;
        d();
    }

    @Override // androidx.appcompat.widget.P
    public void setNavigationIcon(Drawable drawable) {
        this.f7237h = drawable;
        e();
    }

    @Override // androidx.appcompat.widget.P
    public void setNavigationMode(int i8) {
        View view;
        int i9 = this.f7245p;
        if (i8 != i9) {
            if (i9 == 1) {
                Spinner spinner = this.f7233d;
                if (spinner != null) {
                    ViewParent parent = spinner.getParent();
                    Toolbar toolbar = this.f7230a;
                    if (parent == toolbar) {
                        toolbar.removeView(this.f7233d);
                    }
                }
            } else if (i9 == 2 && (view = this.f7232c) != null) {
                ViewParent parent2 = view.getParent();
                Toolbar toolbar2 = this.f7230a;
                if (parent2 == toolbar2) {
                    toolbar2.removeView(this.f7232c);
                }
            }
            this.f7245p = i8;
            if (i8 != 0) {
                if (i8 == 1) {
                    b();
                    this.f7230a.addView(this.f7233d, 0);
                    return;
                }
                if (i8 != 2) {
                    throw new IllegalArgumentException("Invalid navigation mode " + i8);
                }
                View view2 = this.f7232c;
                if (view2 != null) {
                    this.f7230a.addView(view2, 0);
                    Toolbar.e eVar = (Toolbar.e) this.f7232c.getLayoutParams();
                    ((ViewGroup.MarginLayoutParams) eVar).width = -2;
                    ((ViewGroup.MarginLayoutParams) eVar).height = -2;
                    eVar.gravity = L2.a.BOTTOM_START;
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.P
    public void setSubtitle(CharSequence charSequence) {
        this.f7240k = charSequence;
        if ((this.f7231b & 8) != 0) {
            this.f7230a.setSubtitle(charSequence);
        }
    }

    @Override // androidx.appcompat.widget.P
    public void setTitle(CharSequence charSequence) {
        this.f7238i = true;
        c(charSequence);
    }

    @Override // androidx.appcompat.widget.P
    public void setVisibility(int i8) {
        this.f7230a.setVisibility(i8);
    }

    @Override // androidx.appcompat.widget.P
    public void setWindowCallback(Window.Callback callback) {
        this.f7242m = callback;
    }

    @Override // androidx.appcompat.widget.P
    public void setWindowTitle(CharSequence charSequence) {
        if (this.f7238i) {
            return;
        }
        c(charSequence);
    }

    @Override // androidx.appcompat.widget.P
    public C1001x0 setupAnimatorToVisibility(int i8, long j8) {
        return AbstractC0985p0.animate(this.f7230a).alpha(i8 == 0 ? 1.0f : 0.0f).setDuration(j8).setListener(new b(i8));
    }

    @Override // androidx.appcompat.widget.P
    public boolean showOverflowMenu() {
        return this.f7230a.showOverflowMenu();
    }

    public s0(Toolbar toolbar, boolean z8, int i8, int i9) {
        Drawable drawable;
        this.f7245p = 0;
        this.f7246q = 0;
        this.f7230a = toolbar;
        this.f7239j = toolbar.getTitle();
        this.f7240k = toolbar.getSubtitle();
        this.f7238i = this.f7239j != null;
        this.f7237h = toolbar.getNavigationIcon();
        r0 r0VarObtainStyledAttributes = r0.obtainStyledAttributes(toolbar.getContext(), null, AbstractC5572j.ActionBar, AbstractC5563a.actionBarStyle, 0);
        this.f7247r = r0VarObtainStyledAttributes.getDrawable(AbstractC5572j.ActionBar_homeAsUpIndicator);
        if (z8) {
            CharSequence text = r0VarObtainStyledAttributes.getText(AbstractC5572j.ActionBar_title);
            if (!TextUtils.isEmpty(text)) {
                setTitle(text);
            }
            CharSequence text2 = r0VarObtainStyledAttributes.getText(AbstractC5572j.ActionBar_subtitle);
            if (!TextUtils.isEmpty(text2)) {
                setSubtitle(text2);
            }
            Drawable drawable2 = r0VarObtainStyledAttributes.getDrawable(AbstractC5572j.ActionBar_logo);
            if (drawable2 != null) {
                setLogo(drawable2);
            }
            Drawable drawable3 = r0VarObtainStyledAttributes.getDrawable(AbstractC5572j.ActionBar_icon);
            if (drawable3 != null) {
                setIcon(drawable3);
            }
            if (this.f7237h == null && (drawable = this.f7247r) != null) {
                setNavigationIcon(drawable);
            }
            setDisplayOptions(r0VarObtainStyledAttributes.getInt(AbstractC5572j.ActionBar_displayOptions, 0));
            int resourceId = r0VarObtainStyledAttributes.getResourceId(AbstractC5572j.ActionBar_customNavigationLayout, 0);
            if (resourceId != 0) {
                setCustomView(LayoutInflater.from(this.f7230a.getContext()).inflate(resourceId, (ViewGroup) this.f7230a, false));
                setDisplayOptions(this.f7231b | 16);
            }
            int layoutDimension = r0VarObtainStyledAttributes.getLayoutDimension(AbstractC5572j.ActionBar_height, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = this.f7230a.getLayoutParams();
                layoutParams.height = layoutDimension;
                this.f7230a.setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = r0VarObtainStyledAttributes.getDimensionPixelOffset(AbstractC5572j.ActionBar_contentInsetStart, -1);
            int dimensionPixelOffset2 = r0VarObtainStyledAttributes.getDimensionPixelOffset(AbstractC5572j.ActionBar_contentInsetEnd, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                this.f7230a.setContentInsetsRelative(Math.max(dimensionPixelOffset, 0), Math.max(dimensionPixelOffset2, 0));
            }
            int resourceId2 = r0VarObtainStyledAttributes.getResourceId(AbstractC5572j.ActionBar_titleTextStyle, 0);
            if (resourceId2 != 0) {
                Toolbar toolbar2 = this.f7230a;
                toolbar2.setTitleTextAppearance(toolbar2.getContext(), resourceId2);
            }
            int resourceId3 = r0VarObtainStyledAttributes.getResourceId(AbstractC5572j.ActionBar_subtitleTextStyle, 0);
            if (resourceId3 != 0) {
                Toolbar toolbar3 = this.f7230a;
                toolbar3.setSubtitleTextAppearance(toolbar3.getContext(), resourceId3);
            }
            int resourceId4 = r0VarObtainStyledAttributes.getResourceId(AbstractC5572j.ActionBar_popupTheme, 0);
            if (resourceId4 != 0) {
                this.f7230a.setPopupTheme(resourceId4);
            }
        } else {
            this.f7231b = a();
        }
        r0VarObtainStyledAttributes.recycle();
        setDefaultNavigationContentDescription(i8);
        this.f7241l = this.f7230a.getNavigationContentDescription();
        this.f7230a.setNavigationOnClickListener(new a());
    }

    @Override // androidx.appcompat.widget.P
    public void setIcon(Drawable drawable) {
        this.f7235f = drawable;
        f();
    }

    @Override // androidx.appcompat.widget.P
    public void setLogo(Drawable drawable) {
        this.f7236g = drawable;
        f();
    }

    @Override // androidx.appcompat.widget.P
    public void setNavigationContentDescription(int i8) {
        setNavigationContentDescription(i8 == 0 ? null : getContext().getString(i8));
    }

    @Override // androidx.appcompat.widget.P
    public void setNavigationIcon(int i8) {
        setNavigationIcon(i8 != 0 ? AbstractC5638a.getDrawable(getContext(), i8) : null);
    }
}
