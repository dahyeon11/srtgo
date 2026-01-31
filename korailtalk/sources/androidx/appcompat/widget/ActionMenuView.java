package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.LinearLayoutCompat;

/* loaded from: classes.dex */
public class ActionMenuView extends LinearLayoutCompat implements e.b, androidx.appcompat.view.menu.l {

    /* renamed from: A */
    e f6765A;

    /* renamed from: p */
    private androidx.appcompat.view.menu.e f6766p;

    /* renamed from: q */
    private Context f6767q;

    /* renamed from: r */
    private int f6768r;

    /* renamed from: s */
    private boolean f6769s;

    /* renamed from: t */
    private C0843c f6770t;

    /* renamed from: u */
    private k.a f6771u;

    /* renamed from: v */
    e.a f6772v;

    /* renamed from: w */
    private boolean f6773w;

    /* renamed from: x */
    private int f6774x;

    /* renamed from: y */
    private int f6775y;

    /* renamed from: z */
    private int f6776z;

    public interface a {
        boolean needsDividerAfter();

        boolean needsDividerBefore();
    }

    private static class b implements k.a {
        b() {
        }

        @Override // androidx.appcompat.view.menu.k.a
        public void onCloseMenu(androidx.appcompat.view.menu.e eVar, boolean z8) {
        }

        @Override // androidx.appcompat.view.menu.k.a
        public boolean onOpenSubMenu(androidx.appcompat.view.menu.e eVar) {
            return false;
        }
    }

    public static class c extends LinearLayoutCompat.a {

        /* renamed from: a */
        boolean f6777a;

        @ViewDebug.ExportedProperty
        public int cellsUsed;

        @ViewDebug.ExportedProperty
        public boolean expandable;

        @ViewDebug.ExportedProperty
        public int extraPixels;

        @ViewDebug.ExportedProperty
        public boolean isOverflowButton;

        @ViewDebug.ExportedProperty
        public boolean preventEdgeOffset;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super((ViewGroup.LayoutParams) cVar);
            this.isOverflowButton = cVar.isOverflowButton;
        }

        public c(int i8, int i9) {
            super(i8, i9);
            this.isOverflowButton = false;
        }
    }

    private class d implements e.a {
        d() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean onMenuItemSelected(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            e eVar2 = ActionMenuView.this.f6765A;
            return eVar2 != null && eVar2.onMenuItemClick(menuItem);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void onMenuModeChange(androidx.appcompat.view.menu.e eVar) {
            e.a aVar = ActionMenuView.this.f6772v;
            if (aVar != null) {
                aVar.onMenuModeChange(eVar);
            }
        }
    }

    public interface e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static int x(android.view.View r5, int r6, int r7, int r8, int r9) {
        /*
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$c r0 = (androidx.appcompat.widget.ActionMenuView.c) r0
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            int r1 = r1 - r9
            int r8 = android.view.View.MeasureSpec.getMode(r8)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
            boolean r9 = r5 instanceof androidx.appcompat.view.menu.ActionMenuItemView
            if (r9 == 0) goto L1b
            r9 = r5
            androidx.appcompat.view.menu.ActionMenuItemView r9 = (androidx.appcompat.view.menu.ActionMenuItemView) r9
            goto L1c
        L1b:
            r9 = 0
        L1c:
            r1 = 0
            r2 = 1
            if (r9 == 0) goto L28
            boolean r9 = r9.hasText()
            if (r9 == 0) goto L28
            r9 = r2
            goto L29
        L28:
            r9 = r1
        L29:
            if (r7 <= 0) goto L4c
            r3 = 2
            if (r9 == 0) goto L30
            if (r7 < r3) goto L4c
        L30:
            int r7 = r7 * r6
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r4)
            r5.measure(r7, r8)
            int r7 = r5.getMeasuredWidth()
            int r4 = r7 / r6
            int r7 = r7 % r6
            if (r7 == 0) goto L45
            int r4 = r4 + 1
        L45:
            if (r9 == 0) goto L4a
            if (r4 >= r3) goto L4a
            goto L4d
        L4a:
            r3 = r4
            goto L4d
        L4c:
            r3 = r1
        L4d:
            boolean r7 = r0.isOverflowButton
            if (r7 != 0) goto L54
            if (r9 == 0) goto L54
            r1 = r2
        L54:
            r0.expandable = r1
            r0.cellsUsed = r3
            int r6 = r6 * r3
            r7 = 1073741824(0x40000000, float:2.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r7)
            r5.measure(r6, r8)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionMenuView.x(android.view.View, int, int, int, int):int");
    }

    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v14 */
    private void y(int i8, int i9) {
        int i10;
        int i11;
        boolean z8;
        int i12;
        int i13;
        boolean z9;
        boolean z10;
        int i14;
        ?? r14;
        int mode = View.MeasureSpec.getMode(i9);
        int size = View.MeasureSpec.getSize(i8);
        int size2 = View.MeasureSpec.getSize(i9);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i9, paddingTop, -2);
        int i15 = size - paddingLeft;
        int i16 = this.f6775y;
        int i17 = i15 / i16;
        int i18 = i15 % i16;
        if (i17 == 0) {
            setMeasuredDimension(i15, 0);
            return;
        }
        int i19 = i16 + (i18 / i17);
        int childCount = getChildCount();
        int iMax = 0;
        int i20 = 0;
        boolean z11 = false;
        int i21 = 0;
        int iMax2 = 0;
        int i22 = 0;
        long j8 = 0;
        while (i20 < childCount) {
            View childAt = getChildAt(i20);
            int i23 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z12 = childAt instanceof ActionMenuItemView;
                int i24 = i21 + 1;
                if (z12) {
                    int i25 = this.f6776z;
                    i14 = i24;
                    r14 = 0;
                    childAt.setPadding(i25, 0, i25, 0);
                } else {
                    i14 = i24;
                    r14 = 0;
                }
                c cVar = (c) childAt.getLayoutParams();
                cVar.f6777a = r14;
                cVar.extraPixels = r14;
                cVar.cellsUsed = r14;
                cVar.expandable = r14;
                ((LinearLayout.LayoutParams) cVar).leftMargin = r14;
                ((LinearLayout.LayoutParams) cVar).rightMargin = r14;
                cVar.preventEdgeOffset = z12 && ((ActionMenuItemView) childAt).hasText();
                int iX = x(childAt, i19, cVar.isOverflowButton ? 1 : i17, childMeasureSpec, paddingTop);
                iMax2 = Math.max(iMax2, iX);
                if (cVar.expandable) {
                    i22++;
                }
                if (cVar.isOverflowButton) {
                    z11 = true;
                }
                i17 -= iX;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (iX == 1) {
                    j8 |= 1 << i20;
                    iMax = iMax;
                }
                i21 = i14;
            }
            i20++;
            size2 = i23;
        }
        int i26 = size2;
        boolean z13 = z11 && i21 == 2;
        boolean z14 = false;
        while (i22 > 0 && i17 > 0) {
            int i27 = Integer.MAX_VALUE;
            int i28 = 0;
            int i29 = 0;
            long j9 = 0;
            while (i29 < childCount) {
                boolean z15 = z14;
                c cVar2 = (c) getChildAt(i29).getLayoutParams();
                int i30 = iMax;
                if (cVar2.expandable) {
                    int i31 = cVar2.cellsUsed;
                    if (i31 < i27) {
                        j9 = 1 << i29;
                        i27 = i31;
                        i28 = 1;
                    } else if (i31 == i27) {
                        i28++;
                        j9 |= 1 << i29;
                    }
                }
                i29++;
                iMax = i30;
                z14 = z15;
            }
            z8 = z14;
            i12 = iMax;
            j8 |= j9;
            if (i28 > i17) {
                i10 = mode;
                i11 = i15;
                break;
            }
            int i32 = i27 + 1;
            int i33 = 0;
            while (i33 < childCount) {
                View childAt2 = getChildAt(i33);
                c cVar3 = (c) childAt2.getLayoutParams();
                int i34 = i15;
                int i35 = mode;
                long j10 = 1 << i33;
                if ((j9 & j10) == 0) {
                    if (cVar3.cellsUsed == i32) {
                        j8 |= j10;
                    }
                    z10 = z13;
                } else {
                    if (z13 && cVar3.preventEdgeOffset && i17 == 1) {
                        int i36 = this.f6776z;
                        z10 = z13;
                        childAt2.setPadding(i36 + i19, 0, i36, 0);
                    } else {
                        z10 = z13;
                    }
                    cVar3.cellsUsed++;
                    cVar3.f6777a = true;
                    i17--;
                }
                i33++;
                mode = i35;
                i15 = i34;
                z13 = z10;
            }
            iMax = i12;
            z14 = true;
        }
        i10 = mode;
        i11 = i15;
        z8 = z14;
        i12 = iMax;
        boolean z16 = !z11 && i21 == 1;
        if (i17 <= 0 || j8 == 0 || (i17 >= i21 - 1 && !z16 && iMax2 <= 1)) {
            i13 = 0;
            z9 = z8;
        } else {
            float fBitCount = Long.bitCount(j8);
            if (z16) {
                i13 = 0;
            } else {
                i13 = 0;
                if ((j8 & 1) != 0 && !((c) getChildAt(0).getLayoutParams()).preventEdgeOffset) {
                    fBitCount -= 0.5f;
                }
                int i37 = childCount - 1;
                if ((j8 & (1 << i37)) != 0 && !((c) getChildAt(i37).getLayoutParams()).preventEdgeOffset) {
                    fBitCount -= 0.5f;
                }
            }
            int i38 = fBitCount > 0.0f ? (int) ((i17 * i19) / fBitCount) : i13;
            z9 = z8;
            for (int i39 = i13; i39 < childCount; i39++) {
                if ((j8 & (1 << i39)) != 0) {
                    View childAt3 = getChildAt(i39);
                    c cVar4 = (c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar4.extraPixels = i38;
                        cVar4.f6777a = true;
                        if (i39 == 0 && !cVar4.preventEdgeOffset) {
                            ((LinearLayout.LayoutParams) cVar4).leftMargin = (-i38) / 2;
                        }
                        z9 = true;
                    } else if (cVar4.isOverflowButton) {
                        cVar4.extraPixels = i38;
                        cVar4.f6777a = true;
                        ((LinearLayout.LayoutParams) cVar4).rightMargin = (-i38) / 2;
                        z9 = true;
                    } else {
                        if (i39 != 0) {
                            ((LinearLayout.LayoutParams) cVar4).leftMargin = i38 / 2;
                        }
                        if (i39 != childCount - 1) {
                            ((LinearLayout.LayoutParams) cVar4).rightMargin = i38 / 2;
                        }
                    }
                }
            }
        }
        if (z9) {
            for (int i40 = i13; i40 < childCount; i40++) {
                View childAt4 = getChildAt(i40);
                c cVar5 = (c) childAt4.getLayoutParams();
                if (cVar5.f6777a) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar5.cellsUsed * i19) + cVar5.extraPixels, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i11, i10 != 1073741824 ? i12 : i26);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    public void dismissPopupMenus() {
        C0843c c0843c = this.f6770t;
        if (c0843c != null) {
            c0843c.dismissPopupMenus();
        }
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public c generateOverflowButtonLayoutParams() {
        c cVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        cVarGenerateDefaultLayoutParams.isOverflowButton = true;
        return cVarGenerateDefaultLayoutParams;
    }

    public Menu getMenu() {
        if (this.f6766p == null) {
            Context context = getContext();
            androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
            this.f6766p = eVar;
            eVar.setCallback(new d());
            C0843c c0843c = new C0843c(context);
            this.f6770t = c0843c;
            c0843c.setReserveOverflow(true);
            C0843c c0843c2 = this.f6770t;
            k.a bVar = this.f6771u;
            if (bVar == null) {
                bVar = new b();
            }
            c0843c2.setCallback(bVar);
            this.f6766p.addMenuPresenter(this.f6770t, this.f6767q);
            this.f6770t.setMenuView(this);
        }
        return this.f6766p;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f6770t.getOverflowIcon();
    }

    public int getPopupTheme() {
        return this.f6768r;
    }

    @Override // androidx.appcompat.view.menu.l
    public int getWindowAnimations() {
        return 0;
    }

    public boolean hideOverflowMenu() {
        C0843c c0843c = this.f6770t;
        return c0843c != null && c0843c.hideOverflowMenu();
    }

    @Override // androidx.appcompat.view.menu.l
    public void initialize(androidx.appcompat.view.menu.e eVar) {
        this.f6766p = eVar;
    }

    @Override // androidx.appcompat.view.menu.e.b
    public boolean invokeItem(androidx.appcompat.view.menu.h hVar) {
        return this.f6766p.performItemAction(hVar, 0);
    }

    public boolean isOverflowMenuShowPending() {
        C0843c c0843c = this.f6770t;
        return c0843c != null && c0843c.isOverflowMenuShowPending();
    }

    public boolean isOverflowMenuShowing() {
        C0843c c0843c = this.f6770t;
        return c0843c != null && c0843c.isOverflowMenuShowing();
    }

    public boolean isOverflowReserved() {
        return this.f6769s;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0843c c0843c = this.f6770t;
        if (c0843c != null) {
            c0843c.updateMenuView(false);
            if (this.f6770t.isOverflowMenuShowing()) {
                this.f6770t.hideOverflowMenu();
                this.f6770t.showOverflowMenu();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        dismissPopupMenus();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        int width;
        int paddingLeft;
        if (!this.f6773w) {
            super.onLayout(z8, i8, i9, i10, i11);
            return;
        }
        int childCount = getChildCount();
        int i12 = (i11 - i9) / 2;
        int dividerWidth = getDividerWidth();
        int i13 = i10 - i8;
        int paddingRight = (i13 - getPaddingRight()) - getPaddingLeft();
        boolean zIsLayoutRtl = y0.isLayoutRtl(this);
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.isOverflowButton) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (w(i16)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zIsLayoutRtl) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) cVar).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) cVar).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i17 = i12 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i17, width, measuredHeight + i17);
                    paddingRight -= measuredWidth;
                    i14 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) cVar).leftMargin) + ((LinearLayout.LayoutParams) cVar).rightMargin;
                    w(i16);
                    i15++;
                }
            }
        }
        if (childCount == 1 && i14 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i18 = (i13 / 2) - (measuredWidth2 / 2);
            int i19 = i12 - (measuredHeight2 / 2);
            childAt2.layout(i18, i19, measuredWidth2 + i18, measuredHeight2 + i19);
            return;
        }
        int i20 = i15 - (i14 ^ 1);
        int iMax = Math.max(0, i20 > 0 ? paddingRight / i20 : 0);
        if (zIsLayoutRtl) {
            int width2 = getWidth() - getPaddingRight();
            for (int i21 = 0; i21 < childCount; i21++) {
                View childAt3 = getChildAt(i21);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.isOverflowButton) {
                    int i22 = width2 - ((LinearLayout.LayoutParams) cVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i23 = i12 - (measuredHeight3 / 2);
                    childAt3.layout(i22 - measuredWidth3, i23, i22, measuredHeight3 + i23);
                    width2 = i22 - ((measuredWidth3 + ((LinearLayout.LayoutParams) cVar2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i24 = 0; i24 < childCount; i24++) {
            View childAt4 = getChildAt(i24);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.isOverflowButton) {
                int i25 = paddingLeft2 + ((LinearLayout.LayoutParams) cVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i26 = i12 - (measuredHeight4 / 2);
                childAt4.layout(i25, i26, i25 + measuredWidth4, measuredHeight4 + i26);
                paddingLeft2 = i25 + measuredWidth4 + ((LinearLayout.LayoutParams) cVar3).rightMargin + iMax;
            }
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    protected void onMeasure(int i8, int i9) {
        androidx.appcompat.view.menu.e eVar;
        boolean z8 = this.f6773w;
        boolean z9 = View.MeasureSpec.getMode(i8) == 1073741824;
        this.f6773w = z9;
        if (z8 != z9) {
            this.f6774x = 0;
        }
        int size = View.MeasureSpec.getSize(i8);
        if (this.f6773w && (eVar = this.f6766p) != null && size != this.f6774x) {
            this.f6774x = size;
            eVar.onItemsChanged(true);
        }
        int childCount = getChildCount();
        if (this.f6773w && childCount > 0) {
            y(i8, i9);
            return;
        }
        for (int i10 = 0; i10 < childCount; i10++) {
            c cVar = (c) getChildAt(i10).getLayoutParams();
            ((LinearLayout.LayoutParams) cVar).rightMargin = 0;
            ((LinearLayout.LayoutParams) cVar).leftMargin = 0;
        }
        super.onMeasure(i8, i9);
    }

    public androidx.appcompat.view.menu.e peekMenu() {
        return this.f6766p;
    }

    public void setExpandedActionViewsExclusive(boolean z8) {
        this.f6770t.setExpandedActionViewsExclusive(z8);
    }

    public void setMenuCallbacks(k.a aVar, e.a aVar2) {
        this.f6771u = aVar;
        this.f6772v = aVar2;
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.f6765A = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f6770t.setOverflowIcon(drawable);
    }

    public void setOverflowReserved(boolean z8) {
        this.f6769s = z8;
    }

    public void setPopupTheme(int i8) {
        if (this.f6768r != i8) {
            this.f6768r = i8;
            if (i8 == 0) {
                this.f6767q = getContext();
            } else {
                this.f6767q = new ContextThemeWrapper(getContext(), i8);
            }
        }
    }

    public void setPresenter(C0843c c0843c) {
        this.f6770t = c0843c;
        c0843c.setMenuView(this);
    }

    public boolean showOverflowMenu() {
        C0843c c0843c = this.f6770t;
        return c0843c != null && c0843c.showOverflowMenu();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    /* renamed from: u */
    public c generateDefaultLayoutParams() {
        c cVar = new c(-2, -2);
        ((LinearLayout.LayoutParams) cVar).gravity = 16;
        return cVar;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: v */
    public c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        c cVar = layoutParams instanceof c ? new c((c) layoutParams) : new c(layoutParams);
        if (((LinearLayout.LayoutParams) cVar).gravity <= 0) {
            ((LinearLayout.LayoutParams) cVar).gravity = 16;
        }
        return cVar;
    }

    protected boolean w(int i8) {
        boolean zNeedsDividerAfter = false;
        if (i8 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i8 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i8);
        if (i8 < getChildCount() && (childAt instanceof a)) {
            zNeedsDividerAfter = ((a) childAt).needsDividerAfter();
        }
        return (i8 <= 0 || !(childAt2 instanceof a)) ? zNeedsDividerAfter : zNeedsDividerAfter | ((a) childAt2).needsDividerBefore();
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f8 = context.getResources().getDisplayMetrics().density;
        this.f6775y = (int) (56.0f * f8);
        this.f6776z = (int) (f8 * 4.0f);
        this.f6767q = context;
        this.f6768r = 0;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public c generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }
}
