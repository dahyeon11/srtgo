package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.AbstractC0985p0;
import c0.AbstractC1087a;
import h.AbstractC5563a;
import h.AbstractC5572j;
import i.AbstractC5638a;
import java.util.ArrayList;
import java.util.List;
import l.InterfaceC5877c;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* renamed from: A, reason: collision with root package name */
    private ColorStateList f6927A;

    /* renamed from: B, reason: collision with root package name */
    private boolean f6928B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f6929C;

    /* renamed from: D, reason: collision with root package name */
    private final ArrayList f6930D;

    /* renamed from: E, reason: collision with root package name */
    private final ArrayList f6931E;

    /* renamed from: F, reason: collision with root package name */
    private final int[] f6932F;

    /* renamed from: G, reason: collision with root package name */
    f f6933G;

    /* renamed from: H, reason: collision with root package name */
    private final ActionMenuView.e f6934H;

    /* renamed from: I, reason: collision with root package name */
    private s0 f6935I;

    /* renamed from: J, reason: collision with root package name */
    private C0843c f6936J;

    /* renamed from: K, reason: collision with root package name */
    private d f6937K;

    /* renamed from: L, reason: collision with root package name */
    private k.a f6938L;

    /* renamed from: M, reason: collision with root package name */
    private e.a f6939M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f6940N;

    /* renamed from: O, reason: collision with root package name */
    private final Runnable f6941O;

    /* renamed from: a, reason: collision with root package name */
    private ActionMenuView f6942a;

    /* renamed from: b, reason: collision with root package name */
    private TextView f6943b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f6944c;

    /* renamed from: d, reason: collision with root package name */
    private ImageButton f6945d;

    /* renamed from: e, reason: collision with root package name */
    private ImageView f6946e;

    /* renamed from: f, reason: collision with root package name */
    private Drawable f6947f;

    /* renamed from: g, reason: collision with root package name */
    private CharSequence f6948g;

    /* renamed from: h, reason: collision with root package name */
    ImageButton f6949h;

    /* renamed from: i, reason: collision with root package name */
    View f6950i;

    /* renamed from: j, reason: collision with root package name */
    private Context f6951j;

    /* renamed from: k, reason: collision with root package name */
    private int f6952k;

    /* renamed from: l, reason: collision with root package name */
    private int f6953l;

    /* renamed from: m, reason: collision with root package name */
    private int f6954m;

    /* renamed from: n, reason: collision with root package name */
    int f6955n;

    /* renamed from: o, reason: collision with root package name */
    private int f6956o;

    /* renamed from: p, reason: collision with root package name */
    private int f6957p;

    /* renamed from: q, reason: collision with root package name */
    private int f6958q;

    /* renamed from: r, reason: collision with root package name */
    private int f6959r;

    /* renamed from: s, reason: collision with root package name */
    private int f6960s;

    /* renamed from: t, reason: collision with root package name */
    private i0 f6961t;

    /* renamed from: u, reason: collision with root package name */
    private int f6962u;

    /* renamed from: v, reason: collision with root package name */
    private int f6963v;

    /* renamed from: w, reason: collision with root package name */
    private int f6964w;

    /* renamed from: x, reason: collision with root package name */
    private CharSequence f6965x;

    /* renamed from: y, reason: collision with root package name */
    private CharSequence f6966y;

    /* renamed from: z, reason: collision with root package name */
    private ColorStateList f6967z;

    class a implements ActionMenuView.e {
        a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.e
        public boolean onMenuItemClick(MenuItem menuItem) {
            f fVar = Toolbar.this.f6933G;
            if (fVar != null) {
                return fVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.showOverflowMenu();
        }
    }

    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.collapseActionView();
        }
    }

    private class d implements androidx.appcompat.view.menu.k {

        /* renamed from: a, reason: collision with root package name */
        androidx.appcompat.view.menu.e f6971a;

        /* renamed from: b, reason: collision with root package name */
        androidx.appcompat.view.menu.h f6972b;

        d() {
        }

        @Override // androidx.appcompat.view.menu.k
        public boolean collapseItemActionView(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.h hVar) {
            KeyEvent.Callback callback = Toolbar.this.f6950i;
            if (callback instanceof InterfaceC5877c) {
                ((InterfaceC5877c) callback).onActionViewCollapsed();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f6950i);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f6949h);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f6950i = null;
            toolbar3.a();
            this.f6972b = null;
            Toolbar.this.requestLayout();
            hVar.setActionViewExpanded(false);
            return true;
        }

        @Override // androidx.appcompat.view.menu.k
        public boolean expandItemActionView(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.h hVar) {
            Toolbar.this.d();
            ViewParent parent = Toolbar.this.f6949h.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f6949h);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f6949h);
            }
            Toolbar.this.f6950i = hVar.getActionView();
            this.f6972b = hVar;
            ViewParent parent2 = Toolbar.this.f6950i.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f6950i);
                }
                e eVarGenerateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                eVarGenerateDefaultLayoutParams.gravity = (toolbar4.f6955n & 112) | androidx.core.view.A.START;
                eVarGenerateDefaultLayoutParams.f6974a = 2;
                toolbar4.f6950i.setLayoutParams(eVarGenerateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f6950i);
            }
            Toolbar.this.x();
            Toolbar.this.requestLayout();
            hVar.setActionViewExpanded(true);
            KeyEvent.Callback callback = Toolbar.this.f6950i;
            if (callback instanceof InterfaceC5877c) {
                ((InterfaceC5877c) callback).onActionViewExpanded();
            }
            return true;
        }

        @Override // androidx.appcompat.view.menu.k
        public boolean flagActionItems() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.k
        public int getId() {
            return 0;
        }

        @Override // androidx.appcompat.view.menu.k
        public androidx.appcompat.view.menu.l getMenuView(ViewGroup viewGroup) {
            return null;
        }

        @Override // androidx.appcompat.view.menu.k
        public void initForMenu(Context context, androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.h hVar;
            androidx.appcompat.view.menu.e eVar2 = this.f6971a;
            if (eVar2 != null && (hVar = this.f6972b) != null) {
                eVar2.collapseItemActionView(hVar);
            }
            this.f6971a = eVar;
        }

        @Override // androidx.appcompat.view.menu.k
        public void onCloseMenu(androidx.appcompat.view.menu.e eVar, boolean z8) {
        }

        @Override // androidx.appcompat.view.menu.k
        public void onRestoreInstanceState(Parcelable parcelable) {
        }

        @Override // androidx.appcompat.view.menu.k
        public Parcelable onSaveInstanceState() {
            return null;
        }

        @Override // androidx.appcompat.view.menu.k
        public boolean onSubMenuSelected(androidx.appcompat.view.menu.n nVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.k
        public void setCallback(k.a aVar) {
        }

        @Override // androidx.appcompat.view.menu.k
        public void updateMenuView(boolean z8) {
            if (this.f6972b != null) {
                androidx.appcompat.view.menu.e eVar = this.f6971a;
                if (eVar != null) {
                    int size = eVar.size();
                    for (int i8 = 0; i8 < size; i8++) {
                        if (this.f6971a.getItem(i8) == this.f6972b) {
                            return;
                        }
                    }
                }
                collapseItemActionView(this.f6971a, this.f6972b);
            }
        }
    }

    public interface f {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public static class g extends AbstractC1087a {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        int f6975b;

        /* renamed from: c, reason: collision with root package name */
        boolean f6976c;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public g[] newArray(int i8) {
                return new g[i8];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, null);
            }
        }

        public g(Parcel parcel) {
            this(parcel, null);
        }

        @Override // c0.AbstractC1087a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            super.writeToParcel(parcel, i8);
            parcel.writeInt(this.f6975b);
            parcel.writeInt(this.f6976c ? 1 : 0);
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f6975b = parcel.readInt();
            this.f6976c = parcel.readInt() != 0;
        }

        public g(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public Toolbar(Context context) {
        this(context, null);
    }

    private void b(List list, int i8) {
        boolean z8 = AbstractC0985p0.getLayoutDirection(this) == 1;
        int childCount = getChildCount();
        int absoluteGravity = androidx.core.view.A.getAbsoluteGravity(i8, AbstractC0985p0.getLayoutDirection(this));
        list.clear();
        if (!z8) {
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = getChildAt(i9);
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.f6974a == 0 && z(childAt) && l(eVar.gravity) == absoluteGravity) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i10 = childCount - 1; i10 >= 0; i10--) {
            View childAt2 = getChildAt(i10);
            e eVar2 = (e) childAt2.getLayoutParams();
            if (eVar2.f6974a == 0 && z(childAt2) && l(eVar2.gravity) == absoluteGravity) {
                list.add(childAt2);
            }
        }
    }

    private void c(View view, boolean z8) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        e eVarGenerateDefaultLayoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (e) layoutParams;
        eVarGenerateDefaultLayoutParams.f6974a = 1;
        if (!z8 || this.f6950i == null) {
            addView(view, eVarGenerateDefaultLayoutParams);
        } else {
            view.setLayoutParams(eVarGenerateDefaultLayoutParams);
            this.f6931E.add(view);
        }
    }

    private void e() {
        if (this.f6961t == null) {
            this.f6961t = new i0();
        }
    }

    private void f() {
        if (this.f6946e == null) {
            this.f6946e = new AppCompatImageView(getContext());
        }
    }

    private void g() {
        h();
        if (this.f6942a.peekMenu() == null) {
            androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) this.f6942a.getMenu();
            if (this.f6937K == null) {
                this.f6937K = new d();
            }
            this.f6942a.setExpandedActionViewsExclusive(true);
            eVar.addMenuPresenter(this.f6937K, this.f6951j);
        }
    }

    private MenuInflater getMenuInflater() {
        return new l.g(getContext());
    }

    private void h() {
        if (this.f6942a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f6942a = actionMenuView;
            actionMenuView.setPopupTheme(this.f6952k);
            this.f6942a.setOnMenuItemClickListener(this.f6934H);
            this.f6942a.setMenuCallbacks(this.f6938L, this.f6939M);
            e eVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            eVarGenerateDefaultLayoutParams.gravity = (this.f6955n & 112) | androidx.core.view.A.END;
            this.f6942a.setLayoutParams(eVarGenerateDefaultLayoutParams);
            c(this.f6942a, false);
        }
    }

    private void i() {
        if (this.f6945d == null) {
            this.f6945d = new C0853m(getContext(), null, AbstractC5563a.toolbarNavigationButtonStyle);
            e eVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            eVarGenerateDefaultLayoutParams.gravity = (this.f6955n & 112) | androidx.core.view.A.START;
            this.f6945d.setLayoutParams(eVarGenerateDefaultLayoutParams);
        }
    }

    private int l(int i8) {
        int layoutDirection = AbstractC0985p0.getLayoutDirection(this);
        int absoluteGravity = androidx.core.view.A.getAbsoluteGravity(i8, layoutDirection) & 7;
        return (absoluteGravity == 1 || absoluteGravity == 3 || absoluteGravity == 5) ? absoluteGravity : layoutDirection == 1 ? 5 : 3;
    }

    private int m(View view, int i8) {
        e eVar = (e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i9 = i8 > 0 ? (measuredHeight - i8) / 2 : 0;
        int iN = n(eVar.gravity);
        if (iN == 48) {
            return getPaddingTop() - i9;
        }
        if (iN == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) - i9;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i10 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
        if (iMax < i10) {
            iMax = i10;
        } else {
            int i11 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i12 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
            if (i11 < i12) {
                iMax = Math.max(0, iMax - (i12 - i11));
            }
        }
        return paddingTop + iMax;
    }

    private int n(int i8) {
        int i9 = i8 & 112;
        return (i9 == 16 || i9 == 48 || i9 == 80) ? i9 : this.f6964w & 112;
    }

    private int o(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return androidx.core.view.F.getMarginStart(marginLayoutParams) + androidx.core.view.F.getMarginEnd(marginLayoutParams);
    }

    private int p(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private int q(List list, int[] iArr) {
        int i8 = iArr[0];
        int i9 = iArr[1];
        int size = list.size();
        int i10 = 0;
        int measuredWidth = 0;
        while (i10 < size) {
            View view = (View) list.get(i10);
            e eVar = (e) view.getLayoutParams();
            int i11 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin - i8;
            int i12 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin - i9;
            int iMax = Math.max(0, i11);
            int iMax2 = Math.max(0, i12);
            int iMax3 = Math.max(0, -i11);
            int iMax4 = Math.max(0, -i12);
            measuredWidth += iMax + view.getMeasuredWidth() + iMax2;
            i10++;
            i9 = iMax4;
            i8 = iMax3;
        }
        return measuredWidth;
    }

    private boolean r(View view) {
        return view.getParent() == this || this.f6931E.contains(view);
    }

    private int s(View view, int i8, int[] iArr, int i9) {
        e eVar = (e) view.getLayoutParams();
        int i10 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin - iArr[0];
        int iMax = i8 + Math.max(0, i10);
        iArr[0] = Math.max(0, -i10);
        int iM = m(view, i9);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iM, iMax + measuredWidth, view.getMeasuredHeight() + iM);
        return iMax + measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
    }

    private int t(View view, int i8, int[] iArr, int i9) {
        e eVar = (e) view.getLayoutParams();
        int i10 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin - iArr[1];
        int iMax = i8 - Math.max(0, i10);
        iArr[1] = Math.max(0, -i10);
        int iM = m(view, i9);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iM, iMax, view.getMeasuredHeight() + iM);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).leftMargin);
    }

    private int u(View view, int i8, int i9, int i10, int i11, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i12 = marginLayoutParams.leftMargin - iArr[0];
        int i13 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i12) + Math.max(0, i13);
        iArr[0] = Math.max(0, -i12);
        iArr[1] = Math.max(0, -i13);
        view.measure(ViewGroup.getChildMeasureSpec(i8, getPaddingLeft() + getPaddingRight() + iMax + i9, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i10, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i11, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    private void v(View view, int i8, int i9, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i8, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i9, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i10, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i11, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i12 >= 0) {
            if (mode != 0) {
                i12 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i12);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void w() {
        removeCallbacks(this.f6941O);
        post(this.f6941O);
    }

    private boolean y() {
        if (!this.f6940N) {
            return false;
        }
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (z(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean z(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    void a() {
        for (int size = this.f6931E.size() - 1; size >= 0; size--) {
            addView((View) this.f6931E.get(size));
        }
        this.f6931E.clear();
    }

    public boolean canShowOverflowMenu() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.f6942a) != null && actionMenuView.isOverflowReserved();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof e);
    }

    public void collapseActionView() {
        d dVar = this.f6937K;
        androidx.appcompat.view.menu.h hVar = dVar == null ? null : dVar.f6972b;
        if (hVar != null) {
            hVar.collapseActionView();
        }
    }

    void d() {
        if (this.f6949h == null) {
            C0853m c0853m = new C0853m(getContext(), null, AbstractC5563a.toolbarNavigationButtonStyle);
            this.f6949h = c0853m;
            c0853m.setImageDrawable(this.f6947f);
            this.f6949h.setContentDescription(this.f6948g);
            e eVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            eVarGenerateDefaultLayoutParams.gravity = (this.f6955n & 112) | androidx.core.view.A.START;
            eVarGenerateDefaultLayoutParams.f6974a = 2;
            this.f6949h.setLayoutParams(eVarGenerateDefaultLayoutParams);
            this.f6949h.setOnClickListener(new c());
        }
    }

    public void dismissPopupMenus() {
        ActionMenuView actionMenuView = this.f6942a;
        if (actionMenuView != null) {
            actionMenuView.dismissPopupMenus();
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f6949h;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f6949h;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        i0 i0Var = this.f6961t;
        if (i0Var != null) {
            return i0Var.getEnd();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i8 = this.f6963v;
        return i8 != Integer.MIN_VALUE ? i8 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        i0 i0Var = this.f6961t;
        if (i0Var != null) {
            return i0Var.getLeft();
        }
        return 0;
    }

    public int getContentInsetRight() {
        i0 i0Var = this.f6961t;
        if (i0Var != null) {
            return i0Var.getRight();
        }
        return 0;
    }

    public int getContentInsetStart() {
        i0 i0Var = this.f6961t;
        if (i0Var != null) {
            return i0Var.getStart();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i8 = this.f6962u;
        return i8 != Integer.MIN_VALUE ? i8 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.e eVarPeekMenu;
        ActionMenuView actionMenuView = this.f6942a;
        return (actionMenuView == null || (eVarPeekMenu = actionMenuView.peekMenu()) == null || !eVarPeekMenu.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f6963v, 0));
    }

    public int getCurrentContentInsetLeft() {
        return AbstractC0985p0.getLayoutDirection(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return AbstractC0985p0.getLayoutDirection(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f6962u, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f6946e;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f6946e;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        g();
        return this.f6942a.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f6945d;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f6945d;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    C0843c getOuterActionMenuPresenter() {
        return this.f6936J;
    }

    public Drawable getOverflowIcon() {
        g();
        return this.f6942a.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.f6951j;
    }

    public int getPopupTheme() {
        return this.f6952k;
    }

    public CharSequence getSubtitle() {
        return this.f6966y;
    }

    final TextView getSubtitleTextView() {
        return this.f6944c;
    }

    public CharSequence getTitle() {
        return this.f6965x;
    }

    public int getTitleMarginBottom() {
        return this.f6960s;
    }

    public int getTitleMarginEnd() {
        return this.f6958q;
    }

    public int getTitleMarginStart() {
        return this.f6957p;
    }

    public int getTitleMarginTop() {
        return this.f6959r;
    }

    final TextView getTitleTextView() {
        return this.f6943b;
    }

    public P getWrapper() {
        if (this.f6935I == null) {
            this.f6935I = new s0(this, true);
        }
        return this.f6935I;
    }

    public boolean hasExpandedActionView() {
        d dVar = this.f6937K;
        return (dVar == null || dVar.f6972b == null) ? false : true;
    }

    public boolean hideOverflowMenu() {
        ActionMenuView actionMenuView = this.f6942a;
        return actionMenuView != null && actionMenuView.hideOverflowMenu();
    }

    public void inflateMenu(int i8) {
        getMenuInflater().inflate(i8, getMenu());
    }

    public boolean isOverflowMenuShowPending() {
        ActionMenuView actionMenuView = this.f6942a;
        return actionMenuView != null && actionMenuView.isOverflowMenuShowPending();
    }

    public boolean isOverflowMenuShowing() {
        ActionMenuView actionMenuView = this.f6942a;
        return actionMenuView != null && actionMenuView.isOverflowMenuShowing();
    }

    public boolean isTitleTruncated() {
        Layout layout;
        TextView textView = this.f6943b;
        if (textView == null || (layout = textView.getLayout()) == null) {
            return false;
        }
        int lineCount = layout.getLineCount();
        for (int i8 = 0; i8 < lineCount; i8++) {
            if (layout.getEllipsisCount(i8) > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public e generateDefaultLayoutParams() {
        return new e(-2, -2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e ? new e((e) layoutParams) : layoutParams instanceof a.C0110a ? new e((a.C0110a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f6941O);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f6929C = false;
        }
        if (!this.f6929C) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f6929C = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f6929C = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x02a1 A[LOOP:0: B:106:0x029f->B:107:0x02a1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02c3 A[LOOP:1: B:109:0x02c1->B:110:0x02c3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02fc A[LOOP:2: B:118:0x02fa->B:119:0x02fc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0227  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 785
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    protected void onMeasure(int i8, int i9) {
        int measuredWidth;
        int iMax;
        int iCombineMeasuredStates;
        int measuredWidth2;
        int measuredHeight;
        int iCombineMeasuredStates2;
        int iMax2;
        int[] iArr = this.f6932F;
        boolean zIsLayoutRtl = y0.isLayoutRtl(this);
        int i10 = !zIsLayoutRtl ? 1 : 0;
        if (z(this.f6945d)) {
            v(this.f6945d, i8, 0, i9, 0, this.f6956o);
            measuredWidth = this.f6945d.getMeasuredWidth() + o(this.f6945d);
            iMax = Math.max(0, this.f6945d.getMeasuredHeight() + p(this.f6945d));
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f6945d.getMeasuredState());
        } else {
            measuredWidth = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (z(this.f6949h)) {
            v(this.f6949h, i8, 0, i9, 0, this.f6956o);
            measuredWidth = this.f6949h.getMeasuredWidth() + o(this.f6949h);
            iMax = Math.max(iMax, this.f6949h.getMeasuredHeight() + p(this.f6949h));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f6949h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, measuredWidth);
        iArr[zIsLayoutRtl ? 1 : 0] = Math.max(0, currentContentInsetStart - measuredWidth);
        if (z(this.f6942a)) {
            v(this.f6942a, i8, iMax3, i9, 0, this.f6956o);
            measuredWidth2 = this.f6942a.getMeasuredWidth() + o(this.f6942a);
            iMax = Math.max(iMax, this.f6942a.getMeasuredHeight() + p(this.f6942a));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f6942a.getMeasuredState());
        } else {
            measuredWidth2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax4 = iMax3 + Math.max(currentContentInsetEnd, measuredWidth2);
        iArr[i10] = Math.max(0, currentContentInsetEnd - measuredWidth2);
        if (z(this.f6950i)) {
            iMax4 += u(this.f6950i, i8, iMax4, i9, 0, iArr);
            iMax = Math.max(iMax, this.f6950i.getMeasuredHeight() + p(this.f6950i));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f6950i.getMeasuredState());
        }
        if (z(this.f6946e)) {
            iMax4 += u(this.f6946e, i8, iMax4, i9, 0, iArr);
            iMax = Math.max(iMax, this.f6946e.getMeasuredHeight() + p(this.f6946e));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f6946e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (((e) childAt.getLayoutParams()).f6974a == 0 && z(childAt)) {
                iMax4 += u(childAt, i8, iMax4, i9, 0, iArr);
                iMax = Math.max(iMax, childAt.getMeasuredHeight() + p(childAt));
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
        }
        int i12 = this.f6959r + this.f6960s;
        int i13 = this.f6957p + this.f6958q;
        if (z(this.f6943b)) {
            u(this.f6943b, i8, iMax4 + i13, i9, i12, iArr);
            int measuredWidth3 = this.f6943b.getMeasuredWidth() + o(this.f6943b);
            measuredHeight = this.f6943b.getMeasuredHeight() + p(this.f6943b);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f6943b.getMeasuredState());
            iMax2 = measuredWidth3;
        } else {
            measuredHeight = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (z(this.f6944c)) {
            iMax2 = Math.max(iMax2, u(this.f6944c, i8, iMax4 + i13, i9, measuredHeight + i12, iArr));
            measuredHeight += this.f6944c.getMeasuredHeight() + p(this.f6944c);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f6944c.getMeasuredState());
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax4 + iMax2 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i8, (-16777216) & iCombineMeasuredStates2), y() ? 0 : View.resolveSizeAndState(Math.max(Math.max(iMax, measuredHeight) + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i9, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.getSuperState());
        ActionMenuView actionMenuView = this.f6942a;
        androidx.appcompat.view.menu.e eVarPeekMenu = actionMenuView != null ? actionMenuView.peekMenu() : null;
        int i8 = gVar.f6975b;
        if (i8 != 0 && this.f6937K != null && eVarPeekMenu != null && (menuItemFindItem = eVarPeekMenu.findItem(i8)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (gVar.f6976c) {
            w();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i8) {
        super.onRtlPropertiesChanged(i8);
        e();
        this.f6961t.setDirection(i8 == 1);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.h hVar;
        g gVar = new g(super.onSaveInstanceState());
        d dVar = this.f6937K;
        if (dVar != null && (hVar = dVar.f6972b) != null) {
            gVar.f6975b = hVar.getItemId();
        }
        gVar.f6976c = isOverflowMenuShowing();
        return gVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f6928B = false;
        }
        if (!this.f6928B) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f6928B = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f6928B = false;
        }
        return true;
    }

    public void setCollapseContentDescription(int i8) {
        setCollapseContentDescription(i8 != 0 ? getContext().getText(i8) : null);
    }

    public void setCollapseIcon(int i8) {
        setCollapseIcon(AbstractC5638a.getDrawable(getContext(), i8));
    }

    public void setCollapsible(boolean z8) {
        this.f6940N = z8;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i8) {
        if (i8 < 0) {
            i8 = Integer.MIN_VALUE;
        }
        if (i8 != this.f6963v) {
            this.f6963v = i8;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i8) {
        if (i8 < 0) {
            i8 = Integer.MIN_VALUE;
        }
        if (i8 != this.f6962u) {
            this.f6962u = i8;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetsAbsolute(int i8, int i9) {
        e();
        this.f6961t.setAbsolute(i8, i9);
    }

    public void setContentInsetsRelative(int i8, int i9) {
        e();
        this.f6961t.setRelative(i8, i9);
    }

    public void setLogo(int i8) {
        setLogo(AbstractC5638a.getDrawable(getContext(), i8));
    }

    public void setLogoDescription(int i8) {
        setLogoDescription(getContext().getText(i8));
    }

    public void setMenu(androidx.appcompat.view.menu.e eVar, C0843c c0843c) {
        if (eVar == null && this.f6942a == null) {
            return;
        }
        h();
        androidx.appcompat.view.menu.e eVarPeekMenu = this.f6942a.peekMenu();
        if (eVarPeekMenu == eVar) {
            return;
        }
        if (eVarPeekMenu != null) {
            eVarPeekMenu.removeMenuPresenter(this.f6936J);
            eVarPeekMenu.removeMenuPresenter(this.f6937K);
        }
        if (this.f6937K == null) {
            this.f6937K = new d();
        }
        c0843c.setExpandedActionViewsExclusive(true);
        if (eVar != null) {
            eVar.addMenuPresenter(c0843c, this.f6951j);
            eVar.addMenuPresenter(this.f6937K, this.f6951j);
        } else {
            c0843c.initForMenu(this.f6951j, null);
            this.f6937K.initForMenu(this.f6951j, null);
            c0843c.updateMenuView(true);
            this.f6937K.updateMenuView(true);
        }
        this.f6942a.setPopupTheme(this.f6952k);
        this.f6942a.setPresenter(c0843c);
        this.f6936J = c0843c;
    }

    public void setMenuCallbacks(k.a aVar, e.a aVar2) {
        this.f6938L = aVar;
        this.f6939M = aVar2;
        ActionMenuView actionMenuView = this.f6942a;
        if (actionMenuView != null) {
            actionMenuView.setMenuCallbacks(aVar, aVar2);
        }
    }

    public void setNavigationContentDescription(int i8) {
        setNavigationContentDescription(i8 != 0 ? getContext().getText(i8) : null);
    }

    public void setNavigationIcon(int i8) {
        setNavigationIcon(AbstractC5638a.getDrawable(getContext(), i8));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        i();
        this.f6945d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(f fVar) {
        this.f6933G = fVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        g();
        this.f6942a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i8) {
        if (this.f6952k != i8) {
            this.f6952k = i8;
            if (i8 == 0) {
                this.f6951j = getContext();
            } else {
                this.f6951j = new ContextThemeWrapper(getContext(), i8);
            }
        }
    }

    public void setSubtitle(int i8) {
        setSubtitle(getContext().getText(i8));
    }

    public void setSubtitleTextAppearance(Context context, int i8) {
        this.f6954m = i8;
        TextView textView = this.f6944c;
        if (textView != null) {
            textView.setTextAppearance(context, i8);
        }
    }

    public void setSubtitleTextColor(int i8) {
        setSubtitleTextColor(ColorStateList.valueOf(i8));
    }

    public void setTitle(int i8) {
        setTitle(getContext().getText(i8));
    }

    public void setTitleMargin(int i8, int i9, int i10, int i11) {
        this.f6957p = i8;
        this.f6959r = i9;
        this.f6958q = i10;
        this.f6960s = i11;
        requestLayout();
    }

    public void setTitleMarginBottom(int i8) {
        this.f6960s = i8;
        requestLayout();
    }

    public void setTitleMarginEnd(int i8) {
        this.f6958q = i8;
        requestLayout();
    }

    public void setTitleMarginStart(int i8) {
        this.f6957p = i8;
        requestLayout();
    }

    public void setTitleMarginTop(int i8) {
        this.f6959r = i8;
        requestLayout();
    }

    public void setTitleTextAppearance(Context context, int i8) {
        this.f6953l = i8;
        TextView textView = this.f6943b;
        if (textView != null) {
            textView.setTextAppearance(context, i8);
        }
    }

    public void setTitleTextColor(int i8) {
        setTitleTextColor(ColorStateList.valueOf(i8));
    }

    public boolean showOverflowMenu() {
        ActionMenuView actionMenuView = this.f6942a;
        return actionMenuView != null && actionMenuView.showOverflowMenu();
    }

    void x() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((e) childAt.getLayoutParams()).f6974a != 2 && childAt != this.f6942a) {
                removeViewAt(childCount);
                this.f6931E.add(childAt);
            }
        }
    }

    public static class e extends a.C0110a {

        /* renamed from: a, reason: collision with root package name */
        int f6974a;

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f6974a = 0;
        }

        void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public e(int i8, int i9) {
            super(i8, i9);
            this.f6974a = 0;
            this.gravity = 8388627;
        }

        public e(int i8, int i9, int i10) {
            super(i8, i9);
            this.f6974a = 0;
            this.gravity = i10;
        }

        public e(int i8) {
            this(-2, -1, i8);
        }

        public e(e eVar) {
            super((a.C0110a) eVar);
            this.f6974a = 0;
            this.f6974a = eVar.f6974a;
        }

        public e(a.C0110a c0110a) {
            super(c0110a);
            this.f6974a = 0;
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f6974a = 0;
            a(marginLayoutParams);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f6974a = 0;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC5563a.toolbarStyle);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            d();
        }
        ImageButton imageButton = this.f6949h;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            d();
            this.f6949h.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.f6949h;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.f6947f);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            f();
            if (!r(this.f6946e)) {
                c(this.f6946e, true);
            }
        } else {
            ImageView imageView = this.f6946e;
            if (imageView != null && r(imageView)) {
                removeView(this.f6946e);
                this.f6931E.remove(this.f6946e);
            }
        }
        ImageView imageView2 = this.f6946e;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            f();
        }
        ImageView imageView = this.f6946e;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            i();
        }
        ImageButton imageButton = this.f6945d;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            i();
            if (!r(this.f6945d)) {
                c(this.f6945d, true);
            }
        } else {
            ImageButton imageButton = this.f6945d;
            if (imageButton != null && r(imageButton)) {
                removeView(this.f6945d);
                this.f6931E.remove(this.f6945d);
            }
        }
        ImageButton imageButton2 = this.f6945d;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f6944c;
            if (textView != null && r(textView)) {
                removeView(this.f6944c);
                this.f6931E.remove(this.f6944c);
            }
        } else {
            if (this.f6944c == null) {
                Context context = getContext();
                J j8 = new J(context);
                this.f6944c = j8;
                j8.setSingleLine();
                this.f6944c.setEllipsize(TextUtils.TruncateAt.END);
                int i8 = this.f6954m;
                if (i8 != 0) {
                    this.f6944c.setTextAppearance(context, i8);
                }
                ColorStateList colorStateList = this.f6927A;
                if (colorStateList != null) {
                    this.f6944c.setTextColor(colorStateList);
                }
            }
            if (!r(this.f6944c)) {
                c(this.f6944c, true);
            }
        }
        TextView textView2 = this.f6944c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f6966y = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f6927A = colorStateList;
        TextView textView = this.f6944c;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f6943b;
            if (textView != null && r(textView)) {
                removeView(this.f6943b);
                this.f6931E.remove(this.f6943b);
            }
        } else {
            if (this.f6943b == null) {
                Context context = getContext();
                J j8 = new J(context);
                this.f6943b = j8;
                j8.setSingleLine();
                this.f6943b.setEllipsize(TextUtils.TruncateAt.END);
                int i8 = this.f6953l;
                if (i8 != 0) {
                    this.f6943b.setTextAppearance(context, i8);
                }
                ColorStateList colorStateList = this.f6967z;
                if (colorStateList != null) {
                    this.f6943b.setTextColor(colorStateList);
                }
            }
            if (!r(this.f6943b)) {
                c(this.f6943b, true);
            }
        }
        TextView textView2 = this.f6943b;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f6965x = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f6967z = colorStateList;
        TextView textView = this.f6943b;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f6964w = 8388627;
        this.f6930D = new ArrayList();
        this.f6931E = new ArrayList();
        this.f6932F = new int[2];
        this.f6934H = new a();
        this.f6941O = new b();
        r0 r0VarObtainStyledAttributes = r0.obtainStyledAttributes(getContext(), attributeSet, AbstractC5572j.Toolbar, i8, 0);
        AbstractC0985p0.saveAttributeDataForStyleable(this, context, AbstractC5572j.Toolbar, attributeSet, r0VarObtainStyledAttributes.getWrappedTypeArray(), i8, 0);
        this.f6953l = r0VarObtainStyledAttributes.getResourceId(AbstractC5572j.Toolbar_titleTextAppearance, 0);
        this.f6954m = r0VarObtainStyledAttributes.getResourceId(AbstractC5572j.Toolbar_subtitleTextAppearance, 0);
        this.f6964w = r0VarObtainStyledAttributes.getInteger(AbstractC5572j.Toolbar_android_gravity, this.f6964w);
        this.f6955n = r0VarObtainStyledAttributes.getInteger(AbstractC5572j.Toolbar_buttonGravity, 48);
        int dimensionPixelOffset = r0VarObtainStyledAttributes.getDimensionPixelOffset(AbstractC5572j.Toolbar_titleMargin, 0);
        dimensionPixelOffset = r0VarObtainStyledAttributes.hasValue(AbstractC5572j.Toolbar_titleMargins) ? r0VarObtainStyledAttributes.getDimensionPixelOffset(AbstractC5572j.Toolbar_titleMargins, dimensionPixelOffset) : dimensionPixelOffset;
        this.f6960s = dimensionPixelOffset;
        this.f6959r = dimensionPixelOffset;
        this.f6958q = dimensionPixelOffset;
        this.f6957p = dimensionPixelOffset;
        int dimensionPixelOffset2 = r0VarObtainStyledAttributes.getDimensionPixelOffset(AbstractC5572j.Toolbar_titleMarginStart, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f6957p = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = r0VarObtainStyledAttributes.getDimensionPixelOffset(AbstractC5572j.Toolbar_titleMarginEnd, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f6958q = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = r0VarObtainStyledAttributes.getDimensionPixelOffset(AbstractC5572j.Toolbar_titleMarginTop, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f6959r = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = r0VarObtainStyledAttributes.getDimensionPixelOffset(AbstractC5572j.Toolbar_titleMarginBottom, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f6960s = dimensionPixelOffset5;
        }
        this.f6956o = r0VarObtainStyledAttributes.getDimensionPixelSize(AbstractC5572j.Toolbar_maxButtonHeight, -1);
        int dimensionPixelOffset6 = r0VarObtainStyledAttributes.getDimensionPixelOffset(AbstractC5572j.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = r0VarObtainStyledAttributes.getDimensionPixelOffset(AbstractC5572j.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        int dimensionPixelSize = r0VarObtainStyledAttributes.getDimensionPixelSize(AbstractC5572j.Toolbar_contentInsetLeft, 0);
        int dimensionPixelSize2 = r0VarObtainStyledAttributes.getDimensionPixelSize(AbstractC5572j.Toolbar_contentInsetRight, 0);
        e();
        this.f6961t.setAbsolute(dimensionPixelSize, dimensionPixelSize2);
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            this.f6961t.setRelative(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f6962u = r0VarObtainStyledAttributes.getDimensionPixelOffset(AbstractC5572j.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
        this.f6963v = r0VarObtainStyledAttributes.getDimensionPixelOffset(AbstractC5572j.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
        this.f6947f = r0VarObtainStyledAttributes.getDrawable(AbstractC5572j.Toolbar_collapseIcon);
        this.f6948g = r0VarObtainStyledAttributes.getText(AbstractC5572j.Toolbar_collapseContentDescription);
        CharSequence text = r0VarObtainStyledAttributes.getText(AbstractC5572j.Toolbar_title);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = r0VarObtainStyledAttributes.getText(AbstractC5572j.Toolbar_subtitle);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f6951j = getContext();
        setPopupTheme(r0VarObtainStyledAttributes.getResourceId(AbstractC5572j.Toolbar_popupTheme, 0));
        Drawable drawable = r0VarObtainStyledAttributes.getDrawable(AbstractC5572j.Toolbar_navigationIcon);
        if (drawable != null) {
            setNavigationIcon(drawable);
        }
        CharSequence text3 = r0VarObtainStyledAttributes.getText(AbstractC5572j.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawable2 = r0VarObtainStyledAttributes.getDrawable(AbstractC5572j.Toolbar_logo);
        if (drawable2 != null) {
            setLogo(drawable2);
        }
        CharSequence text4 = r0VarObtainStyledAttributes.getText(AbstractC5572j.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (r0VarObtainStyledAttributes.hasValue(AbstractC5572j.Toolbar_titleTextColor)) {
            setTitleTextColor(r0VarObtainStyledAttributes.getColorStateList(AbstractC5572j.Toolbar_titleTextColor));
        }
        if (r0VarObtainStyledAttributes.hasValue(AbstractC5572j.Toolbar_subtitleTextColor)) {
            setSubtitleTextColor(r0VarObtainStyledAttributes.getColorStateList(AbstractC5572j.Toolbar_subtitleTextColor));
        }
        if (r0VarObtainStyledAttributes.hasValue(AbstractC5572j.Toolbar_menu)) {
            inflateMenu(r0VarObtainStyledAttributes.getResourceId(AbstractC5572j.Toolbar_menu, 0));
        }
        r0VarObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }
}
