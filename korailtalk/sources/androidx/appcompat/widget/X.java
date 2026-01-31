package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.view.C1001x0;
import h.AbstractC5563a;
import j.C5809a;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
class X extends ListView {
    public static final int INVALID_POSITION = -1;
    public static final int NO_POSITION = -1;

    /* renamed from: a, reason: collision with root package name */
    private final Rect f6984a;

    /* renamed from: b, reason: collision with root package name */
    private int f6985b;

    /* renamed from: c, reason: collision with root package name */
    private int f6986c;

    /* renamed from: d, reason: collision with root package name */
    private int f6987d;

    /* renamed from: e, reason: collision with root package name */
    private int f6988e;

    /* renamed from: f, reason: collision with root package name */
    private int f6989f;

    /* renamed from: g, reason: collision with root package name */
    private Field f6990g;

    /* renamed from: h, reason: collision with root package name */
    private a f6991h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f6992i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f6993j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f6994k;

    /* renamed from: l, reason: collision with root package name */
    private C1001x0 f6995l;

    /* renamed from: m, reason: collision with root package name */
    private androidx.core.widget.f f6996m;

    /* renamed from: n, reason: collision with root package name */
    b f6997n;

    private static class a extends C5809a {

        /* renamed from: b, reason: collision with root package name */
        private boolean f6998b;

        a(Drawable drawable) {
            super(drawable);
            this.f6998b = true;
        }

        void a(boolean z8) {
            this.f6998b = z8;
        }

        @Override // j.C5809a, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f6998b) {
                super.draw(canvas);
            }
        }

        @Override // j.C5809a, android.graphics.drawable.Drawable
        public void setHotspot(float f8, float f9) {
            if (this.f6998b) {
                super.setHotspot(f8, f9);
            }
        }

        @Override // j.C5809a, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i8, int i9, int i10, int i11) {
            if (this.f6998b) {
                super.setHotspotBounds(i8, i9, i10, i11);
            }
        }

        @Override // j.C5809a, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f6998b) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // j.C5809a, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z8, boolean z9) {
            if (this.f6998b) {
                return super.setVisible(z8, z9);
            }
            return false;
        }
    }

    private class b implements Runnable {
        b() {
        }

        public void cancel() {
            X x8 = X.this;
            x8.f6997n = null;
            x8.removeCallbacks(this);
        }

        public void post() {
            X.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            X x8 = X.this;
            x8.f6997n = null;
            x8.drawableStateChanged();
        }
    }

    X(Context context, boolean z8) throws NoSuchFieldException, SecurityException {
        super(context, null, AbstractC5563a.dropDownListViewStyle);
        this.f6984a = new Rect();
        this.f6985b = 0;
        this.f6986c = 0;
        this.f6987d = 0;
        this.f6988e = 0;
        this.f6993j = z8;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f6990g = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e8) {
            e8.printStackTrace();
        }
    }

    private void a() {
        this.f6994k = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f6989f - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        C1001x0 c1001x0 = this.f6995l;
        if (c1001x0 != null) {
            c1001x0.cancel();
            this.f6995l = null;
        }
    }

    private void b(View view, int i8) {
        performItemClick(view, i8, getItemIdAtPosition(i8));
    }

    private void c(Canvas canvas) {
        Drawable selector;
        if (this.f6984a.isEmpty() || (selector = getSelector()) == null) {
            return;
        }
        selector.setBounds(this.f6984a);
        selector.draw(canvas);
    }

    private void d(int i8, View view) throws IllegalAccessException, IllegalArgumentException {
        Rect rect = this.f6984a;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f6985b;
        rect.top -= this.f6986c;
        rect.right += this.f6987d;
        rect.bottom += this.f6988e;
        try {
            boolean z8 = this.f6990g.getBoolean(this);
            if (view.isEnabled() != z8) {
                this.f6990g.set(this, Boolean.valueOf(!z8));
                if (i8 != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e8) {
            e8.printStackTrace();
        }
    }

    private void e(int i8, View view) throws IllegalAccessException, IllegalArgumentException {
        Drawable selector = getSelector();
        boolean z8 = (selector == null || i8 == -1) ? false : true;
        if (z8) {
            selector.setVisible(false, false);
        }
        d(i8, view);
        if (z8) {
            Rect rect = this.f6984a;
            float fExactCenterX = rect.exactCenterX();
            float fExactCenterY = rect.exactCenterY();
            selector.setVisible(getVisibility() == 0, false);
            androidx.core.graphics.drawable.a.setHotspot(selector, fExactCenterX, fExactCenterY);
        }
    }

    private void f(int i8, View view, float f8, float f9) throws IllegalAccessException, IllegalArgumentException {
        e(i8, view);
        Drawable selector = getSelector();
        if (selector == null || i8 == -1) {
            return;
        }
        androidx.core.graphics.drawable.a.setHotspot(selector, f8, f9);
    }

    private void g(View view, int i8, float f8, float f9) throws IllegalAccessException, IllegalArgumentException {
        View childAt;
        this.f6994k = true;
        drawableHotspotChanged(f8, f9);
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i9 = this.f6989f;
        if (i9 != -1 && (childAt = getChildAt(i9 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.f6989f = i8;
        view.drawableHotspotChanged(f8 - view.getLeft(), f9 - view.getTop());
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        f(i8, view, f8, f9);
        h(false);
        refreshDrawableState();
    }

    private void h(boolean z8) {
        a aVar = this.f6991h;
        if (aVar != null) {
            aVar.a(z8);
        }
    }

    private boolean i() {
        return this.f6994k;
    }

    private void j() {
        Drawable selector = getSelector();
        if (selector != null && i() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        c(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.f6997n != null) {
            return;
        }
        super.drawableStateChanged();
        h(true);
        j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f6993j || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f6993j || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f6993j || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f6993j && this.f6992i) || super.isInTouchMode();
    }

    public int lookForSelectablePosition(int i8, boolean z8) {
        int iMin;
        ListAdapter adapter = getAdapter();
        if (adapter != null && !isInTouchMode()) {
            int count = adapter.getCount();
            if (!getAdapter().areAllItemsEnabled()) {
                if (z8) {
                    iMin = Math.max(0, i8);
                    while (iMin < count && !adapter.isEnabled(iMin)) {
                        iMin++;
                    }
                } else {
                    iMin = Math.min(i8, count - 1);
                    while (iMin >= 0 && !adapter.isEnabled(iMin)) {
                        iMin--;
                    }
                }
                if (iMin < 0 || iMin >= count) {
                    return -1;
                }
                return iMin;
            }
            if (i8 >= 0 && i8 < count) {
                return i8;
            }
        }
        return -1;
    }

    public int measureHeightOfChildrenCompat(int i8, int i9, int i10, int i11, int i12) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        View view = null;
        while (i13 < count) {
            int itemViewType = adapter.getItemViewType(i13);
            if (itemViewType != i14) {
                view = null;
                i14 = itemViewType;
            }
            view = adapter.getView(i13, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i16 = layoutParams.height;
            view.measure(i8, i16 > 0 ? View.MeasureSpec.makeMeasureSpec(i16, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i13 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i11) {
                return (i12 < 0 || i13 <= i12 || i15 <= 0 || measuredHeight == i11) ? i11 : i15;
            }
            if (i12 >= 0 && i13 >= i12) {
                i15 = measuredHeight;
            }
            i13++;
        }
        return measuredHeight;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.f6997n = null;
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onForwardedEvent(android.view.MotionEvent r8, int r9) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L16
            r3 = 2
            if (r0 == r3) goto L14
            r9 = 3
            if (r0 == r9) goto L11
        Le:
            r3 = r1
            r9 = r2
            goto L46
        L11:
            r9 = r2
            r3 = r9
            goto L46
        L14:
            r3 = r1
            goto L17
        L16:
            r3 = r2
        L17:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L1e
            goto L11
        L1e:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L31
            r9 = r1
            goto L46
        L31:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.g(r3, r5, r4, r9)
            if (r0 != r1) goto Le
            r7.b(r3, r5)
            goto Le
        L46:
            if (r3 == 0) goto L4a
            if (r9 == 0) goto L4d
        L4a:
            r7.a()
        L4d:
            if (r3 == 0) goto L65
            androidx.core.widget.f r9 = r7.f6996m
            if (r9 != 0) goto L5a
            androidx.core.widget.f r9 = new androidx.core.widget.f
            r9.<init>(r7)
            r7.f6996m = r9
        L5a:
            androidx.core.widget.f r9 = r7.f6996m
            r9.setEnabled(r1)
            androidx.core.widget.f r9 = r7.f6996m
            r9.onTouch(r7, r8)
            goto L6c
        L65:
            androidx.core.widget.f r8 = r7.f6996m
            if (r8 == 0) goto L6c
            r8.setEnabled(r2)
        L6c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.X.onForwardedEvent(android.view.MotionEvent, int):boolean");
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f6997n == null) {
            b bVar = new b();
            this.f6997n = bVar;
            bVar.post();
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                }
                j();
            }
        } else {
            setSelection(-1);
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f6989f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        b bVar = this.f6997n;
        if (bVar != null) {
            bVar.cancel();
        }
        return super.onTouchEvent(motionEvent);
    }

    void setListSelectionHidden(boolean z8) {
        this.f6992i = z8;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        a aVar = drawable != null ? new a(drawable) : null;
        this.f6991h = aVar;
        super.setSelector(aVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f6985b = rect.left;
        this.f6986c = rect.top;
        this.f6987d = rect.right;
        this.f6988e = rect.bottom;
    }
}
