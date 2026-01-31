package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.AbstractC0985p0;
import androidx.core.view.C1001x0;
import h.AbstractC5563a;
import h.AbstractC5568f;
import h.AbstractC5569g;
import h.AbstractC5572j;
import l.AbstractC5876b;

/* loaded from: classes.dex */
public class ActionBarContextView extends AbstractC0841a {

    /* renamed from: i, reason: collision with root package name */
    private CharSequence f6716i;

    /* renamed from: j, reason: collision with root package name */
    private CharSequence f6717j;

    /* renamed from: k, reason: collision with root package name */
    private View f6718k;

    /* renamed from: l, reason: collision with root package name */
    private View f6719l;

    /* renamed from: m, reason: collision with root package name */
    private View f6720m;

    /* renamed from: n, reason: collision with root package name */
    private LinearLayout f6721n;

    /* renamed from: o, reason: collision with root package name */
    private TextView f6722o;

    /* renamed from: p, reason: collision with root package name */
    private TextView f6723p;

    /* renamed from: q, reason: collision with root package name */
    private int f6724q;

    /* renamed from: r, reason: collision with root package name */
    private int f6725r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f6726s;

    /* renamed from: t, reason: collision with root package name */
    private int f6727t;

    class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC5876b f6728a;

        a(AbstractC5876b abstractC5876b) {
            this.f6728a = abstractC5876b;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f6728a.finish();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    private void f() {
        if (this.f6721n == null) {
            LayoutInflater.from(getContext()).inflate(AbstractC5569g.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f6721n = linearLayout;
            this.f6722o = (TextView) linearLayout.findViewById(AbstractC5568f.action_bar_title);
            this.f6723p = (TextView) this.f6721n.findViewById(AbstractC5568f.action_bar_subtitle);
            if (this.f6724q != 0) {
                this.f6722o.setTextAppearance(getContext(), this.f6724q);
            }
            if (this.f6725r != 0) {
                this.f6723p.setTextAppearance(getContext(), this.f6725r);
            }
        }
        this.f6722o.setText(this.f6716i);
        this.f6723p.setText(this.f6717j);
        boolean zIsEmpty = TextUtils.isEmpty(this.f6716i);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f6717j);
        this.f6723p.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.f6721n.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.f6721n.getParent() == null) {
            addView(this.f6721n);
        }
    }

    @Override // androidx.appcompat.widget.AbstractC0841a
    public /* bridge */ /* synthetic */ void animateToVisibility(int i8) {
        super.animateToVisibility(i8);
    }

    @Override // androidx.appcompat.widget.AbstractC0841a
    public /* bridge */ /* synthetic */ boolean canShowOverflowMenu() {
        return super.canShowOverflowMenu();
    }

    public void closeMode() {
        if (this.f6718k == null) {
            killMode();
        }
    }

    @Override // androidx.appcompat.widget.AbstractC0841a
    public /* bridge */ /* synthetic */ void dismissPopupMenus() {
        super.dismissPopupMenus();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.AbstractC0841a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.AbstractC0841a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f6717j;
    }

    public CharSequence getTitle() {
        return this.f6716i;
    }

    @Override // androidx.appcompat.widget.AbstractC0841a
    public boolean hideOverflowMenu() {
        C0843c c0843c = this.f7014d;
        if (c0843c != null) {
            return c0843c.hideOverflowMenu();
        }
        return false;
    }

    public void initForMode(AbstractC5876b abstractC5876b) {
        View view = this.f6718k;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f6727t, (ViewGroup) this, false);
            this.f6718k = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f6718k);
        }
        View viewFindViewById = this.f6718k.findViewById(AbstractC5568f.action_mode_close_button);
        this.f6719l = viewFindViewById;
        viewFindViewById.setOnClickListener(new a(abstractC5876b));
        androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) abstractC5876b.getMenu();
        C0843c c0843c = this.f7014d;
        if (c0843c != null) {
            c0843c.dismissPopupMenus();
        }
        C0843c c0843c2 = new C0843c(getContext());
        this.f7014d = c0843c2;
        c0843c2.setReserveOverflow(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        eVar.addMenuPresenter(this.f7014d, this.f7012b);
        ActionMenuView actionMenuView = (ActionMenuView) this.f7014d.getMenuView(this);
        this.f7013c = actionMenuView;
        AbstractC0985p0.setBackground(actionMenuView, null);
        addView(this.f7013c, layoutParams);
    }

    @Override // androidx.appcompat.widget.AbstractC0841a
    public /* bridge */ /* synthetic */ boolean isOverflowMenuShowPending() {
        return super.isOverflowMenuShowPending();
    }

    @Override // androidx.appcompat.widget.AbstractC0841a
    public boolean isOverflowMenuShowing() {
        C0843c c0843c = this.f7014d;
        if (c0843c != null) {
            return c0843c.isOverflowMenuShowing();
        }
        return false;
    }

    @Override // androidx.appcompat.widget.AbstractC0841a
    public /* bridge */ /* synthetic */ boolean isOverflowReserved() {
        return super.isOverflowReserved();
    }

    public boolean isTitleOptional() {
        return this.f6726s;
    }

    public void killMode() {
        removeAllViews();
        this.f6720m = null;
        this.f7013c = null;
        this.f7014d = null;
        View view = this.f6719l;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0843c c0843c = this.f7014d;
        if (c0843c != null) {
            c0843c.hideOverflowMenu();
            this.f7014d.hideSubMenus();
        }
    }

    @Override // androidx.appcompat.widget.AbstractC0841a, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            return;
        }
        accessibilityEvent.setSource(this);
        accessibilityEvent.setClassName(getClass().getName());
        accessibilityEvent.setPackageName(getContext().getPackageName());
        accessibilityEvent.setContentDescription(this.f6716i);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        boolean zIsLayoutRtl = y0.isLayoutRtl(this);
        int paddingRight = zIsLayoutRtl ? (i10 - i8) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i11 - i9) - getPaddingTop()) - getPaddingBottom();
        View view = this.f6718k;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f6718k.getLayoutParams();
            int i12 = zIsLayoutRtl ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i13 = zIsLayoutRtl ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int iD = AbstractC0841a.d(paddingRight, i12, zIsLayoutRtl);
            paddingRight = AbstractC0841a.d(iD + e(this.f6718k, iD, paddingTop, paddingTop2, zIsLayoutRtl), i13, zIsLayoutRtl);
        }
        int iE = paddingRight;
        LinearLayout linearLayout = this.f6721n;
        if (linearLayout != null && this.f6720m == null && linearLayout.getVisibility() != 8) {
            iE += e(this.f6721n, iE, paddingTop, paddingTop2, zIsLayoutRtl);
        }
        int i14 = iE;
        View view2 = this.f6720m;
        if (view2 != null) {
            e(view2, i14, paddingTop, paddingTop2, zIsLayoutRtl);
        }
        int paddingLeft = zIsLayoutRtl ? getPaddingLeft() : (i10 - i8) - getPaddingRight();
        ActionMenuView actionMenuView = this.f7013c;
        if (actionMenuView != null) {
            e(actionMenuView, paddingLeft, paddingTop, paddingTop2, !zIsLayoutRtl);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i8, int i9) {
        if (View.MeasureSpec.getMode(i8) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if (View.MeasureSpec.getMode(i9) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        int size = View.MeasureSpec.getSize(i8);
        int size2 = this.f7015e;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i9);
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingTop;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f6718k;
        if (view != null) {
            int iC = c(view, paddingLeft, iMakeMeasureSpec, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f6718k.getLayoutParams();
            paddingLeft = iC - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f7013c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = c(this.f7013c, paddingLeft, iMakeMeasureSpec, 0);
        }
        LinearLayout linearLayout = this.f6721n;
        if (linearLayout != null && this.f6720m == null) {
            if (this.f6726s) {
                this.f6721n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f6721n.getMeasuredWidth();
                boolean z8 = measuredWidth <= paddingLeft;
                if (z8) {
                    paddingLeft -= measuredWidth;
                }
                this.f6721n.setVisibility(z8 ? 0 : 8);
            } else {
                paddingLeft = c(linearLayout, paddingLeft, iMakeMeasureSpec, 0);
            }
        }
        View view2 = this.f6720m;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i10 = layoutParams.width;
            int i11 = i10 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i10 >= 0) {
                paddingLeft = Math.min(i10, paddingLeft);
            }
            int i12 = layoutParams.height;
            int i13 = i12 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i12 >= 0) {
                iMin = Math.min(i12, iMin);
            }
            this.f6720m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i11), View.MeasureSpec.makeMeasureSpec(iMin, i13));
        }
        if (this.f7015e > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i14 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            int measuredHeight = getChildAt(i15).getMeasuredHeight() + paddingTop;
            if (measuredHeight > i14) {
                i14 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i14);
    }

    @Override // androidx.appcompat.widget.AbstractC0841a, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.widget.AbstractC0841a
    public /* bridge */ /* synthetic */ void postShowOverflowMenu() {
        super.postShowOverflowMenu();
    }

    @Override // androidx.appcompat.widget.AbstractC0841a
    public void setContentHeight(int i8) {
        this.f7015e = i8;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f6720m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f6720m = view;
        if (view != null && (linearLayout = this.f6721n) != null) {
            removeView(linearLayout);
            this.f6721n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f6717j = charSequence;
        f();
    }

    public void setTitle(CharSequence charSequence) {
        this.f6716i = charSequence;
        f();
    }

    public void setTitleOptional(boolean z8) {
        if (z8 != this.f6726s) {
            requestLayout();
        }
        this.f6726s = z8;
    }

    @Override // androidx.appcompat.widget.AbstractC0841a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i8) {
        super.setVisibility(i8);
    }

    @Override // androidx.appcompat.widget.AbstractC0841a
    public /* bridge */ /* synthetic */ C1001x0 setupAnimatorToVisibility(int i8, long j8) {
        return super.setupAnimatorToVisibility(i8, j8);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // androidx.appcompat.widget.AbstractC0841a
    public boolean showOverflowMenu() {
        C0843c c0843c = this.f7014d;
        if (c0843c != null) {
            return c0843c.showOverflowMenu();
        }
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC5563a.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        r0 r0VarObtainStyledAttributes = r0.obtainStyledAttributes(context, attributeSet, AbstractC5572j.ActionMode, i8, 0);
        AbstractC0985p0.setBackground(this, r0VarObtainStyledAttributes.getDrawable(AbstractC5572j.ActionMode_background));
        this.f6724q = r0VarObtainStyledAttributes.getResourceId(AbstractC5572j.ActionMode_titleTextStyle, 0);
        this.f6725r = r0VarObtainStyledAttributes.getResourceId(AbstractC5572j.ActionMode_subtitleTextStyle, 0);
        this.f7015e = r0VarObtainStyledAttributes.getLayoutDimension(AbstractC5572j.ActionMode_height, 0);
        this.f6727t = r0VarObtainStyledAttributes.getResourceId(AbstractC5572j.ActionMode_closeItemLayout, AbstractC5569g.abc_action_mode_close_item_material);
        r0VarObtainStyledAttributes.recycle();
    }
}
