package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.core.view.AbstractC0985p0;
import h.AbstractC5563a;
import h.AbstractC5572j;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class c0 implements m.e {

    /* renamed from: G, reason: collision with root package name */
    private static Method f7053G = null;

    /* renamed from: H, reason: collision with root package name */
    private static Method f7054H = null;
    public static final int INPUT_METHOD_FROM_FOCUSABLE = 0;
    public static final int INPUT_METHOD_NEEDED = 1;
    public static final int INPUT_METHOD_NOT_NEEDED = 2;
    public static final int MATCH_PARENT = -1;
    public static final int POSITION_PROMPT_ABOVE = 0;
    public static final int POSITION_PROMPT_BELOW = 1;
    public static final int WRAP_CONTENT = -2;

    /* renamed from: A, reason: collision with root package name */
    private Runnable f7055A;

    /* renamed from: B, reason: collision with root package name */
    final Handler f7056B;

    /* renamed from: C, reason: collision with root package name */
    private final Rect f7057C;

    /* renamed from: D, reason: collision with root package name */
    private Rect f7058D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f7059E;

    /* renamed from: F, reason: collision with root package name */
    PopupWindow f7060F;

    /* renamed from: a, reason: collision with root package name */
    private Context f7061a;

    /* renamed from: b, reason: collision with root package name */
    private ListAdapter f7062b;

    /* renamed from: c, reason: collision with root package name */
    X f7063c;

    /* renamed from: d, reason: collision with root package name */
    private int f7064d;

    /* renamed from: e, reason: collision with root package name */
    private int f7065e;

    /* renamed from: f, reason: collision with root package name */
    private int f7066f;

    /* renamed from: g, reason: collision with root package name */
    private int f7067g;

    /* renamed from: h, reason: collision with root package name */
    private int f7068h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f7069i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f7070j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f7071k;

    /* renamed from: l, reason: collision with root package name */
    private int f7072l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f7073m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f7074n;

    /* renamed from: o, reason: collision with root package name */
    int f7075o;

    /* renamed from: p, reason: collision with root package name */
    private View f7076p;

    /* renamed from: q, reason: collision with root package name */
    private int f7077q;

    /* renamed from: r, reason: collision with root package name */
    private DataSetObserver f7078r;

    /* renamed from: s, reason: collision with root package name */
    private View f7079s;

    /* renamed from: t, reason: collision with root package name */
    private Drawable f7080t;

    /* renamed from: u, reason: collision with root package name */
    private AdapterView.OnItemClickListener f7081u;

    /* renamed from: v, reason: collision with root package name */
    private AdapterView.OnItemSelectedListener f7082v;

    /* renamed from: w, reason: collision with root package name */
    final h f7083w;

    /* renamed from: x, reason: collision with root package name */
    private final g f7084x;

    /* renamed from: y, reason: collision with root package name */
    private final f f7085y;

    /* renamed from: z, reason: collision with root package name */
    private final d f7086z;

    class a extends Z {
        a(View view) {
            super(view);
        }

        @Override // androidx.appcompat.widget.Z
        public c0 getPopup() {
            return c0.this;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View anchorView = c0.this.getAnchorView();
            if (anchorView == null || anchorView.getWindowToken() == null) {
                return;
            }
            c0.this.show();
        }
    }

    class c implements AdapterView.OnItemSelectedListener {
        c() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i8, long j8) {
            X x8;
            if (i8 == -1 || (x8 = c0.this.f7063c) == null) {
                return;
            }
            x8.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    private class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c0.this.clearListSelection();
        }
    }

    private class e extends DataSetObserver {
        e() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (c0.this.isShowing()) {
                c0.this.show();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            c0.this.dismiss();
        }
    }

    private class f implements AbsListView.OnScrollListener {
        f() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i8, int i9, int i10) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i8) {
            if (i8 != 1 || c0.this.isInputMethodNotNeeded() || c0.this.f7060F.getContentView() == null) {
                return;
            }
            c0 c0Var = c0.this;
            c0Var.f7056B.removeCallbacks(c0Var.f7083w);
            c0.this.f7083w.run();
        }
    }

    private class g implements View.OnTouchListener {
        g() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x8 = (int) motionEvent.getX();
            int y8 = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = c0.this.f7060F) != null && popupWindow.isShowing() && x8 >= 0 && x8 < c0.this.f7060F.getWidth() && y8 >= 0 && y8 < c0.this.f7060F.getHeight()) {
                c0 c0Var = c0.this;
                c0Var.f7056B.postDelayed(c0Var.f7083w, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            c0 c0Var2 = c0.this;
            c0Var2.f7056B.removeCallbacks(c0Var2.f7083w);
            return false;
        }
    }

    private class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            X x8 = c0.this.f7063c;
            if (x8 == null || !AbstractC0985p0.isAttachedToWindow(x8) || c0.this.f7063c.getCount() <= c0.this.f7063c.getChildCount()) {
                return;
            }
            int childCount = c0.this.f7063c.getChildCount();
            c0 c0Var = c0.this;
            if (childCount <= c0Var.f7075o) {
                c0Var.f7060F.setInputMethodMode(2);
                c0.this.show();
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f7053G = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
            }
            try {
                f7054H = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
            }
        }
    }

    public c0(Context context) {
        this(context, null, AbstractC5563a.listPopupWindowStyle);
    }

    private int a() {
        int measuredHeight;
        int i8;
        int iMakeMeasureSpec;
        int i9;
        if (this.f7063c == null) {
            Context context = this.f7061a;
            this.f7055A = new b();
            X xB = b(context, !this.f7059E);
            this.f7063c = xB;
            Drawable drawable = this.f7080t;
            if (drawable != null) {
                xB.setSelector(drawable);
            }
            this.f7063c.setAdapter(this.f7062b);
            this.f7063c.setOnItemClickListener(this.f7081u);
            this.f7063c.setFocusable(true);
            this.f7063c.setFocusableInTouchMode(true);
            this.f7063c.setOnItemSelectedListener(new c());
            this.f7063c.setOnScrollListener(this.f7085y);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f7082v;
            if (onItemSelectedListener != null) {
                this.f7063c.setOnItemSelectedListener(onItemSelectedListener);
            }
            View view = this.f7063c;
            View view2 = this.f7076p;
            if (view2 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i10 = this.f7077q;
                if (i10 == 0) {
                    linearLayout.addView(view2);
                    linearLayout.addView(view, layoutParams);
                } else if (i10 != 1) {
                    Log.e("ListPopupWindow", "Invalid hint position " + this.f7077q);
                } else {
                    linearLayout.addView(view, layoutParams);
                    linearLayout.addView(view2);
                }
                int i11 = this.f7065e;
                if (i11 >= 0) {
                    i9 = Integer.MIN_VALUE;
                } else {
                    i11 = 0;
                    i9 = 0;
                }
                view2.measure(View.MeasureSpec.makeMeasureSpec(i11, i9), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                measuredHeight = view2.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                view = linearLayout;
            } else {
                measuredHeight = 0;
            }
            this.f7060F.setContentView(view);
        } else {
            View view3 = this.f7076p;
            if (view3 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view3.getLayoutParams();
                measuredHeight = view3.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                measuredHeight = 0;
            }
        }
        Drawable background = this.f7060F.getBackground();
        if (background != null) {
            background.getPadding(this.f7057C);
            Rect rect = this.f7057C;
            int i12 = rect.top;
            i8 = rect.bottom + i12;
            if (!this.f7069i) {
                this.f7067g = -i12;
            }
        } else {
            this.f7057C.setEmpty();
            i8 = 0;
        }
        int iC = c(getAnchorView(), this.f7067g, this.f7060F.getInputMethodMode() == 2);
        if (this.f7073m || this.f7064d == -1) {
            return iC + i8;
        }
        int i13 = this.f7065e;
        if (i13 == -2) {
            int i14 = this.f7061a.getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.f7057C;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14 - (rect2.left + rect2.right), Integer.MIN_VALUE);
        } else if (i13 != -1) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
        } else {
            int i15 = this.f7061a.getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = this.f7057C;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15 - (rect3.left + rect3.right), 1073741824);
        }
        int iMeasureHeightOfChildrenCompat = this.f7063c.measureHeightOfChildrenCompat(iMakeMeasureSpec, 0, -1, iC - measuredHeight, -1);
        if (iMeasureHeightOfChildrenCompat > 0) {
            measuredHeight += i8 + this.f7063c.getPaddingTop() + this.f7063c.getPaddingBottom();
        }
        return iMeasureHeightOfChildrenCompat + measuredHeight;
    }

    private int c(View view, int i8, boolean z8) {
        return this.f7060F.getMaxAvailableHeight(view, i8, z8);
    }

    private static boolean d(int i8) {
        return i8 == 66 || i8 == 23;
    }

    private void e() {
        View view = this.f7076p;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f7076p);
            }
        }
    }

    private void f(boolean z8) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT > 28) {
            this.f7060F.setIsClippedToScreen(z8);
            return;
        }
        Method method = f7053G;
        if (method != null) {
            try {
                method.invoke(this.f7060F, Boolean.valueOf(z8));
            } catch (Exception unused) {
            }
        }
    }

    X b(Context context, boolean z8) {
        return new X(context, z8);
    }

    public void clearListSelection() {
        X x8 = this.f7063c;
        if (x8 != null) {
            x8.setListSelectionHidden(true);
            x8.requestLayout();
        }
    }

    public View.OnTouchListener createDragToOpenListener(View view) {
        return new a(view);
    }

    @Override // m.e
    public void dismiss() {
        this.f7060F.dismiss();
        e();
        this.f7060F.setContentView(null);
        this.f7063c = null;
        this.f7056B.removeCallbacks(this.f7083w);
    }

    public View getAnchorView() {
        return this.f7079s;
    }

    public int getAnimationStyle() {
        return this.f7060F.getAnimationStyle();
    }

    public Drawable getBackground() {
        return this.f7060F.getBackground();
    }

    public Rect getEpicenterBounds() {
        if (this.f7058D != null) {
            return new Rect(this.f7058D);
        }
        return null;
    }

    public int getHeight() {
        return this.f7064d;
    }

    public int getHorizontalOffset() {
        return this.f7066f;
    }

    public int getInputMethodMode() {
        return this.f7060F.getInputMethodMode();
    }

    @Override // m.e
    public ListView getListView() {
        return this.f7063c;
    }

    public int getPromptPosition() {
        return this.f7077q;
    }

    public Object getSelectedItem() {
        if (isShowing()) {
            return this.f7063c.getSelectedItem();
        }
        return null;
    }

    public long getSelectedItemId() {
        if (isShowing()) {
            return this.f7063c.getSelectedItemId();
        }
        return Long.MIN_VALUE;
    }

    public int getSelectedItemPosition() {
        if (isShowing()) {
            return this.f7063c.getSelectedItemPosition();
        }
        return -1;
    }

    public View getSelectedView() {
        if (isShowing()) {
            return this.f7063c.getSelectedView();
        }
        return null;
    }

    public int getSoftInputMode() {
        return this.f7060F.getSoftInputMode();
    }

    public int getVerticalOffset() {
        if (this.f7069i) {
            return this.f7067g;
        }
        return 0;
    }

    public int getWidth() {
        return this.f7065e;
    }

    public boolean isDropDownAlwaysVisible() {
        return this.f7073m;
    }

    public boolean isInputMethodNotNeeded() {
        return this.f7060F.getInputMethodMode() == 2;
    }

    public boolean isModal() {
        return this.f7059E;
    }

    @Override // m.e
    public boolean isShowing() {
        return this.f7060F.isShowing();
    }

    public boolean onKeyDown(int i8, KeyEvent keyEvent) {
        int iLookForSelectablePosition;
        int count;
        if (isShowing() && i8 != 62 && (this.f7063c.getSelectedItemPosition() >= 0 || !d(i8))) {
            int selectedItemPosition = this.f7063c.getSelectedItemPosition();
            boolean zIsAboveAnchor = this.f7060F.isAboveAnchor();
            ListAdapter listAdapter = this.f7062b;
            if (listAdapter != null) {
                boolean zAreAllItemsEnabled = listAdapter.areAllItemsEnabled();
                iLookForSelectablePosition = zAreAllItemsEnabled ? 0 : this.f7063c.lookForSelectablePosition(0, true);
                count = zAreAllItemsEnabled ? listAdapter.getCount() - 1 : this.f7063c.lookForSelectablePosition(listAdapter.getCount() - 1, false);
            } else {
                iLookForSelectablePosition = Integer.MAX_VALUE;
                count = Integer.MIN_VALUE;
            }
            if ((!zIsAboveAnchor && i8 == 19 && selectedItemPosition <= iLookForSelectablePosition) || (zIsAboveAnchor && i8 == 20 && selectedItemPosition >= count)) {
                clearListSelection();
                this.f7060F.setInputMethodMode(1);
                show();
                return true;
            }
            this.f7063c.setListSelectionHidden(false);
            if (this.f7063c.onKeyDown(i8, keyEvent)) {
                this.f7060F.setInputMethodMode(2);
                this.f7063c.requestFocusFromTouch();
                show();
                if (i8 == 19 || i8 == 20 || i8 == 23 || i8 == 66) {
                    return true;
                }
            } else if (zIsAboveAnchor || i8 != 20) {
                if (zIsAboveAnchor && i8 == 19 && selectedItemPosition == iLookForSelectablePosition) {
                    return true;
                }
            } else if (selectedItemPosition == count) {
                return true;
            }
        }
        return false;
    }

    public boolean onKeyPreIme(int i8, KeyEvent keyEvent) {
        if (i8 != 4 || !isShowing()) {
            return false;
        }
        View view = this.f7079s;
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            KeyEvent.DispatcherState keyDispatcherState = view.getKeyDispatcherState();
            if (keyDispatcherState != null) {
                keyDispatcherState.startTracking(keyEvent, this);
            }
            return true;
        }
        if (keyEvent.getAction() != 1) {
            return false;
        }
        KeyEvent.DispatcherState keyDispatcherState2 = view.getKeyDispatcherState();
        if (keyDispatcherState2 != null) {
            keyDispatcherState2.handleUpEvent(keyEvent);
        }
        if (!keyEvent.isTracking() || keyEvent.isCanceled()) {
            return false;
        }
        dismiss();
        return true;
    }

    public boolean onKeyUp(int i8, KeyEvent keyEvent) {
        if (!isShowing() || this.f7063c.getSelectedItemPosition() < 0) {
            return false;
        }
        boolean zOnKeyUp = this.f7063c.onKeyUp(i8, keyEvent);
        if (zOnKeyUp && d(i8)) {
            dismiss();
        }
        return zOnKeyUp;
    }

    public boolean performItemClick(int i8) {
        if (!isShowing()) {
            return false;
        }
        if (this.f7081u == null) {
            return true;
        }
        X x8 = this.f7063c;
        this.f7081u.onItemClick(x8, x8.getChildAt(i8 - x8.getFirstVisiblePosition()), i8, x8.getAdapter().getItemId(i8));
        return true;
    }

    public void postShow() {
        this.f7056B.post(this.f7055A);
    }

    public void setAdapter(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f7078r;
        if (dataSetObserver == null) {
            this.f7078r = new e();
        } else {
            ListAdapter listAdapter2 = this.f7062b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f7062b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f7078r);
        }
        X x8 = this.f7063c;
        if (x8 != null) {
            x8.setAdapter(this.f7062b);
        }
    }

    public void setAnchorView(View view) {
        this.f7079s = view;
    }

    public void setAnimationStyle(int i8) {
        this.f7060F.setAnimationStyle(i8);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        this.f7060F.setBackgroundDrawable(drawable);
    }

    public void setContentWidth(int i8) {
        Drawable background = this.f7060F.getBackground();
        if (background == null) {
            setWidth(i8);
            return;
        }
        background.getPadding(this.f7057C);
        Rect rect = this.f7057C;
        this.f7065e = rect.left + rect.right + i8;
    }

    public void setDropDownAlwaysVisible(boolean z8) {
        this.f7073m = z8;
    }

    public void setDropDownGravity(int i8) {
        this.f7072l = i8;
    }

    public void setEpicenterBounds(Rect rect) {
        this.f7058D = rect != null ? new Rect(rect) : null;
    }

    public void setForceIgnoreOutsideTouch(boolean z8) {
        this.f7074n = z8;
    }

    public void setHeight(int i8) {
        if (i8 < 0 && -2 != i8 && -1 != i8) {
            throw new IllegalArgumentException("Invalid height. Must be a positive value, MATCH_PARENT, or WRAP_CONTENT.");
        }
        this.f7064d = i8;
    }

    public void setHorizontalOffset(int i8) {
        this.f7066f = i8;
    }

    public void setInputMethodMode(int i8) {
        this.f7060F.setInputMethodMode(i8);
    }

    public void setListSelector(Drawable drawable) {
        this.f7080t = drawable;
    }

    public void setModal(boolean z8) {
        this.f7059E = z8;
        this.f7060F.setFocusable(z8);
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.f7060F.setOnDismissListener(onDismissListener);
    }

    public void setOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener) {
        this.f7081u = onItemClickListener;
    }

    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.f7082v = onItemSelectedListener;
    }

    public void setOverlapAnchor(boolean z8) {
        this.f7071k = true;
        this.f7070j = z8;
    }

    public void setPromptPosition(int i8) {
        this.f7077q = i8;
    }

    public void setPromptView(View view) {
        boolean zIsShowing = isShowing();
        if (zIsShowing) {
            e();
        }
        this.f7076p = view;
        if (zIsShowing) {
            show();
        }
    }

    public void setSelection(int i8) {
        X x8 = this.f7063c;
        if (!isShowing() || x8 == null) {
            return;
        }
        x8.setListSelectionHidden(false);
        x8.setSelection(i8);
        if (x8.getChoiceMode() != 0) {
            x8.setItemChecked(i8, true);
        }
    }

    public void setSoftInputMode(int i8) {
        this.f7060F.setSoftInputMode(i8);
    }

    public void setVerticalOffset(int i8) {
        this.f7067g = i8;
        this.f7069i = true;
    }

    public void setWidth(int i8) {
        this.f7065e = i8;
    }

    public void setWindowLayoutType(int i8) {
        this.f7068h = i8;
    }

    @Override // m.e
    public void show() {
        int iA = a();
        boolean zIsInputMethodNotNeeded = isInputMethodNotNeeded();
        androidx.core.widget.g.setWindowLayoutType(this.f7060F, this.f7068h);
        if (this.f7060F.isShowing()) {
            if (AbstractC0985p0.isAttachedToWindow(getAnchorView())) {
                int width = this.f7065e;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = getAnchorView().getWidth();
                }
                int i8 = this.f7064d;
                if (i8 == -1) {
                    if (!zIsInputMethodNotNeeded) {
                        iA = -1;
                    }
                    if (zIsInputMethodNotNeeded) {
                        this.f7060F.setWidth(this.f7065e == -1 ? -1 : 0);
                        this.f7060F.setHeight(0);
                    } else {
                        this.f7060F.setWidth(this.f7065e == -1 ? -1 : 0);
                        this.f7060F.setHeight(-1);
                    }
                } else if (i8 != -2) {
                    iA = i8;
                }
                this.f7060F.setOutsideTouchable((this.f7074n || this.f7073m) ? false : true);
                this.f7060F.update(getAnchorView(), this.f7066f, this.f7067g, width < 0 ? -1 : width, iA < 0 ? -1 : iA);
                return;
            }
            return;
        }
        int width2 = this.f7065e;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = getAnchorView().getWidth();
        }
        int i9 = this.f7064d;
        if (i9 == -1) {
            iA = -1;
        } else if (i9 != -2) {
            iA = i9;
        }
        this.f7060F.setWidth(width2);
        this.f7060F.setHeight(iA);
        f(true);
        this.f7060F.setOutsideTouchable((this.f7074n || this.f7073m) ? false : true);
        this.f7060F.setTouchInterceptor(this.f7084x);
        if (this.f7071k) {
            androidx.core.widget.g.setOverlapAnchor(this.f7060F, this.f7070j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f7054H;
            if (method != null) {
                try {
                    method.invoke(this.f7060F, this.f7058D);
                } catch (Exception e8) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e8);
                }
            }
        } else {
            this.f7060F.setEpicenterBounds(this.f7058D);
        }
        androidx.core.widget.g.showAsDropDown(this.f7060F, getAnchorView(), this.f7066f, this.f7067g, this.f7072l);
        this.f7063c.setSelection(-1);
        if (!this.f7059E || this.f7063c.isInTouchMode()) {
            clearListSelection();
        }
        if (this.f7059E) {
            return;
        }
        this.f7056B.post(this.f7086z);
    }

    public c0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC5563a.listPopupWindowStyle);
    }

    public c0(Context context, AttributeSet attributeSet, int i8) {
        this(context, attributeSet, i8, 0);
    }

    public c0(Context context, AttributeSet attributeSet, int i8, int i9) {
        this.f7064d = -2;
        this.f7065e = -2;
        this.f7068h = 1002;
        this.f7072l = 0;
        this.f7073m = false;
        this.f7074n = false;
        this.f7075o = Integer.MAX_VALUE;
        this.f7077q = 0;
        this.f7083w = new h();
        this.f7084x = new g();
        this.f7085y = new f();
        this.f7086z = new d();
        this.f7057C = new Rect();
        this.f7061a = context;
        this.f7056B = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC5572j.ListPopupWindow, i8, i9);
        this.f7066f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(AbstractC5572j.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(AbstractC5572j.ListPopupWindow_android_dropDownVerticalOffset, 0);
        this.f7067g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f7069i = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        C0856p c0856p = new C0856p(context, attributeSet, i8, i9);
        this.f7060F = c0856p;
        c0856p.setInputMethodMode(1);
    }
}
