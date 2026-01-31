package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.l;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.u0;
import androidx.core.view.AbstractC0985p0;
import androidx.core.view.C0923a;
import androidx.core.view.accessibility.H;
import h.AbstractC5563a;

/* loaded from: classes2.dex */
public class NavigationMenuItemView extends d implements l.a {

    /* renamed from: F, reason: collision with root package name */
    private static final int[] f24919F = {R.attr.state_checked};

    /* renamed from: A, reason: collision with root package name */
    private androidx.appcompat.view.menu.h f24920A;

    /* renamed from: B, reason: collision with root package name */
    private ColorStateList f24921B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f24922C;

    /* renamed from: D, reason: collision with root package name */
    private Drawable f24923D;

    /* renamed from: E, reason: collision with root package name */
    private final C0923a f24924E;

    /* renamed from: v, reason: collision with root package name */
    private int f24925v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f24926w;

    /* renamed from: x, reason: collision with root package name */
    boolean f24927x;

    /* renamed from: y, reason: collision with root package name */
    private final CheckedTextView f24928y;

    /* renamed from: z, reason: collision with root package name */
    private FrameLayout f24929z;

    class a extends C0923a {
        a() {
        }

        @Override // androidx.core.view.C0923a
        public void onInitializeAccessibilityNodeInfo(View view, H h8) {
            super.onInitializeAccessibilityNodeInfo(view, h8);
            h8.setCheckable(NavigationMenuItemView.this.f24927x);
        }
    }

    public NavigationMenuItemView(Context context) {
        this(context, null);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f24929z == null) {
                this.f24929z = (FrameLayout) ((ViewStub) findViewById(J2.f.design_menu_item_action_area_stub)).inflate();
            }
            this.f24929z.removeAllViews();
            this.f24929z.addView(view);
        }
    }

    private void u() {
        if (w()) {
            this.f24928y.setVisibility(8);
            FrameLayout frameLayout = this.f24929z;
            if (frameLayout != null) {
                LinearLayoutCompat.a aVar = (LinearLayoutCompat.a) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) aVar).width = -1;
                this.f24929z.setLayoutParams(aVar);
                return;
            }
            return;
        }
        this.f24928y.setVisibility(0);
        FrameLayout frameLayout2 = this.f24929z;
        if (frameLayout2 != null) {
            LinearLayoutCompat.a aVar2 = (LinearLayoutCompat.a) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) aVar2).width = -2;
            this.f24929z.setLayoutParams(aVar2);
        }
    }

    private StateListDrawable v() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(AbstractC5563a.colorControlHighlight, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(f24919F, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    private boolean w() {
        return this.f24920A.getTitle() == null && this.f24920A.getIcon() == null && this.f24920A.getActionView() != null;
    }

    @Override // androidx.appcompat.view.menu.l.a
    public androidx.appcompat.view.menu.h getItemData() {
        return this.f24920A;
    }

    @Override // androidx.appcompat.view.menu.l.a
    public void initialize(androidx.appcompat.view.menu.h hVar, int i8) {
        this.f24920A = hVar;
        if (hVar.getItemId() > 0) {
            setId(hVar.getItemId());
        }
        setVisibility(hVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            AbstractC0985p0.setBackground(this, v());
        }
        setCheckable(hVar.isCheckable());
        setChecked(hVar.isChecked());
        setEnabled(hVar.isEnabled());
        setTitle(hVar.getTitle());
        setIcon(hVar.getIcon());
        setActionView(hVar.getActionView());
        setContentDescription(hVar.getContentDescription());
        u0.setTooltipText(this, hVar.getTooltipText());
        u();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i8) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i8 + 1);
        androidx.appcompat.view.menu.h hVar = this.f24920A;
        if (hVar != null && hVar.isCheckable() && this.f24920A.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f24919F);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.view.menu.l.a
    public boolean prefersCondensedTitle() {
        return false;
    }

    public void recycle() {
        FrameLayout frameLayout = this.f24929z;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.f24928y.setCompoundDrawables(null, null, null, null);
    }

    @Override // androidx.appcompat.view.menu.l.a
    public void setCheckable(boolean z8) {
        refreshDrawableState();
        if (this.f24927x != z8) {
            this.f24927x = z8;
            this.f24924E.sendAccessibilityEvent(this.f24928y, 2048);
        }
    }

    @Override // androidx.appcompat.view.menu.l.a
    public void setChecked(boolean z8) {
        refreshDrawableState();
        this.f24928y.setChecked(z8);
    }

    public void setHorizontalPadding(int i8) {
        setPadding(i8, 0, i8, 0);
    }

    @Override // androidx.appcompat.view.menu.l.a
    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f24922C) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = androidx.core.graphics.drawable.a.wrap(drawable).mutate();
                androidx.core.graphics.drawable.a.setTintList(drawable, this.f24921B);
            }
            int i8 = this.f24925v;
            drawable.setBounds(0, 0, i8, i8);
        } else if (this.f24926w) {
            if (this.f24923D == null) {
                Drawable drawable2 = androidx.core.content.res.h.getDrawable(getResources(), J2.e.navigation_empty_icon, getContext().getTheme());
                this.f24923D = drawable2;
                if (drawable2 != null) {
                    int i9 = this.f24925v;
                    drawable2.setBounds(0, 0, i9, i9);
                }
            }
            drawable = this.f24923D;
        }
        androidx.core.widget.h.setCompoundDrawablesRelative(this.f24928y, drawable, null, null, null);
    }

    public void setIconPadding(int i8) {
        this.f24928y.setCompoundDrawablePadding(i8);
    }

    public void setIconSize(int i8) {
        this.f24925v = i8;
    }

    void setIconTintList(ColorStateList colorStateList) {
        this.f24921B = colorStateList;
        this.f24922C = colorStateList != null;
        androidx.appcompat.view.menu.h hVar = this.f24920A;
        if (hVar != null) {
            setIcon(hVar.getIcon());
        }
    }

    public void setMaxLines(int i8) {
        this.f24928y.setMaxLines(i8);
    }

    public void setNeedsEmptyIcon(boolean z8) {
        this.f24926w = z8;
    }

    @Override // androidx.appcompat.view.menu.l.a
    public void setShortcut(boolean z8, char c9) {
    }

    public void setTextAppearance(int i8) {
        androidx.core.widget.h.setTextAppearance(this.f24928y, i8);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f24928y.setTextColor(colorStateList);
    }

    @Override // androidx.appcompat.view.menu.l.a
    public void setTitle(CharSequence charSequence) {
        this.f24928y.setText(charSequence);
    }

    @Override // androidx.appcompat.view.menu.l.a
    public boolean showsIcon() {
        return true;
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        a aVar = new a();
        this.f24924E = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(J2.h.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(J2.d.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(J2.f.design_menu_item_text);
        this.f24928y = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        AbstractC0985p0.setAccessibilityDelegate(checkedTextView, aVar);
    }
}
