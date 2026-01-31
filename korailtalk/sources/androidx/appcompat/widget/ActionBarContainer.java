package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.AbstractC0985p0;
import h.AbstractC5568f;
import h.AbstractC5572j;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private boolean f6706a;

    /* renamed from: b, reason: collision with root package name */
    private View f6707b;

    /* renamed from: c, reason: collision with root package name */
    private View f6708c;

    /* renamed from: d, reason: collision with root package name */
    private View f6709d;

    /* renamed from: e, reason: collision with root package name */
    Drawable f6710e;

    /* renamed from: f, reason: collision with root package name */
    Drawable f6711f;

    /* renamed from: g, reason: collision with root package name */
    Drawable f6712g;

    /* renamed from: h, reason: collision with root package name */
    boolean f6713h;

    /* renamed from: i, reason: collision with root package name */
    boolean f6714i;

    /* renamed from: j, reason: collision with root package name */
    private int f6715j;

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    private int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    private boolean b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f6710e;
        if (drawable != null && drawable.isStateful()) {
            this.f6710e.setState(getDrawableState());
        }
        Drawable drawable2 = this.f6711f;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f6711f.setState(getDrawableState());
        }
        Drawable drawable3 = this.f6712g;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f6712g.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f6707b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f6710e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f6711f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f6712g;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f6708c = findViewById(AbstractC5568f.action_bar);
        this.f6709d = findViewById(AbstractC5568f.action_context_bar);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f6706a || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0048 A[PHI: r0
  0x0048: PHI (r0v8 boolean) = (r0v1 boolean), (r0v1 boolean), (r0v0 boolean) binds: [B:31:0x00a5, B:33:0x00a9, B:15:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
        /*
            r4 = this;
            super.onLayout(r5, r6, r7, r8, r9)
            android.view.View r5 = r4.f6707b
            r7 = 8
            r9 = 1
            r0 = 0
            if (r5 == 0) goto L13
            int r1 = r5.getVisibility()
            if (r1 == r7) goto L13
            r1 = r9
            goto L14
        L13:
            r1 = r0
        L14:
            if (r5 == 0) goto L33
            int r2 = r5.getVisibility()
            if (r2 == r7) goto L33
            int r7 = r4.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r2 = r5.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            int r3 = r5.getMeasuredHeight()
            int r3 = r7 - r3
            int r2 = r2.bottomMargin
            int r3 = r3 - r2
            int r7 = r7 - r2
            r5.layout(r6, r3, r8, r7)
        L33:
            boolean r6 = r4.f6713h
            if (r6 == 0) goto L4b
            android.graphics.drawable.Drawable r5 = r4.f6712g
            if (r5 == 0) goto L48
            int r6 = r4.getMeasuredWidth()
            int r7 = r4.getMeasuredHeight()
            r5.setBounds(r0, r0, r6, r7)
            goto Lbe
        L48:
            r9 = r0
            goto Lbe
        L4b:
            android.graphics.drawable.Drawable r6 = r4.f6710e
            if (r6 == 0) goto La3
            android.view.View r6 = r4.f6708c
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L75
            android.graphics.drawable.Drawable r6 = r4.f6710e
            android.view.View r7 = r4.f6708c
            int r7 = r7.getLeft()
            android.view.View r8 = r4.f6708c
            int r8 = r8.getTop()
            android.view.View r0 = r4.f6708c
            int r0 = r0.getRight()
            android.view.View r2 = r4.f6708c
            int r2 = r2.getBottom()
            r6.setBounds(r7, r8, r0, r2)
            goto La2
        L75:
            android.view.View r6 = r4.f6709d
            if (r6 == 0) goto L9d
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L9d
            android.graphics.drawable.Drawable r6 = r4.f6710e
            android.view.View r7 = r4.f6709d
            int r7 = r7.getLeft()
            android.view.View r8 = r4.f6709d
            int r8 = r8.getTop()
            android.view.View r0 = r4.f6709d
            int r0 = r0.getRight()
            android.view.View r2 = r4.f6709d
            int r2 = r2.getBottom()
            r6.setBounds(r7, r8, r0, r2)
            goto La2
        L9d:
            android.graphics.drawable.Drawable r6 = r4.f6710e
            r6.setBounds(r0, r0, r0, r0)
        La2:
            r0 = r9
        La3:
            r4.f6714i = r1
            if (r1 == 0) goto L48
            android.graphics.drawable.Drawable r6 = r4.f6711f
            if (r6 == 0) goto L48
            int r7 = r5.getLeft()
            int r8 = r5.getTop()
            int r0 = r5.getRight()
            int r5 = r5.getBottom()
            r6.setBounds(r7, r8, r0, r5)
        Lbe:
            if (r9 == 0) goto Lc3
            r4.invalidate()
        Lc3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i8, int i9) {
        int i10;
        if (this.f6708c == null && View.MeasureSpec.getMode(i9) == Integer.MIN_VALUE && (i10 = this.f6715j) >= 0) {
            i9 = View.MeasureSpec.makeMeasureSpec(Math.min(i10, View.MeasureSpec.getSize(i9)), Integer.MIN_VALUE);
        }
        super.onMeasure(i8, i9);
        if (this.f6708c == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i9);
        View view = this.f6707b;
        if (view == null || view.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min((!b(this.f6708c) ? a(this.f6708c) : !b(this.f6709d) ? a(this.f6709d) : 0) + a(this.f6707b), mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i9) : Integer.MAX_VALUE));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f6710e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f6710e);
        }
        this.f6710e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f6708c;
            if (view != null) {
                this.f6710e.setBounds(view.getLeft(), this.f6708c.getTop(), this.f6708c.getRight(), this.f6708c.getBottom());
            }
        }
        boolean z8 = false;
        if (!this.f6713h ? !(this.f6710e != null || this.f6711f != null) : this.f6712g == null) {
            z8 = true;
        }
        setWillNotDraw(z8);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f6712g;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f6712g);
        }
        this.f6712g = drawable;
        boolean z8 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f6713h && (drawable2 = this.f6712g) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f6713h ? !(this.f6710e != null || this.f6711f != null) : this.f6712g == null) {
            z8 = true;
        }
        setWillNotDraw(z8);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f6711f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f6711f);
        }
        this.f6711f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f6714i && (drawable2 = this.f6711f) != null) {
                drawable2.setBounds(this.f6707b.getLeft(), this.f6707b.getTop(), this.f6707b.getRight(), this.f6707b.getBottom());
            }
        }
        boolean z8 = false;
        if (!this.f6713h ? !(this.f6710e != null || this.f6711f != null) : this.f6712g == null) {
            z8 = true;
        }
        setWillNotDraw(z8);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(j0 j0Var) {
        View view = this.f6707b;
        if (view != null) {
            removeView(view);
        }
        this.f6707b = j0Var;
        if (j0Var != null) {
            addView(j0Var);
            ViewGroup.LayoutParams layoutParams = j0Var.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            j0Var.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z8) {
        this.f6706a = z8;
        setDescendantFocusability(z8 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i8) {
        super.setVisibility(i8);
        boolean z8 = i8 == 0;
        Drawable drawable = this.f6710e;
        if (drawable != null) {
            drawable.setVisible(z8, false);
        }
        Drawable drawable2 = this.f6711f;
        if (drawable2 != null) {
            drawable2.setVisible(z8, false);
        }
        Drawable drawable3 = this.f6712g;
        if (drawable3 != null) {
            drawable3.setVisible(z8, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f6710e && !this.f6713h) || (drawable == this.f6711f && this.f6714i) || ((drawable == this.f6712g && this.f6713h) || super.verifyDrawable(drawable));
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC0985p0.setBackground(this, new C0842b(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC5572j.ActionBar);
        this.f6710e = typedArrayObtainStyledAttributes.getDrawable(AbstractC5572j.ActionBar_background);
        this.f6711f = typedArrayObtainStyledAttributes.getDrawable(AbstractC5572j.ActionBar_backgroundStacked);
        this.f6715j = typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC5572j.ActionBar_height, -1);
        boolean z8 = true;
        if (getId() == AbstractC5568f.split_action_bar) {
            this.f6713h = true;
            this.f6712g = typedArrayObtainStyledAttributes.getDrawable(AbstractC5572j.ActionBar_backgroundSplit);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f6713h ? this.f6710e != null || this.f6711f != null : this.f6712g != null) {
            z8 = false;
        }
        setWillNotDraw(z8);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i8) {
        if (i8 != 0) {
            return super.startActionModeForChild(view, callback, i8);
        }
        return null;
    }
}
