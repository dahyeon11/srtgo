package androidx.appcompat.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.LinearLayoutCompat;
import h.AbstractC5563a;
import l.C5875a;

/* loaded from: classes.dex */
public class j0 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: l, reason: collision with root package name */
    private static final Interpolator f7151l = new DecelerateInterpolator();

    /* renamed from: a, reason: collision with root package name */
    Runnable f7152a;

    /* renamed from: b, reason: collision with root package name */
    private c f7153b;

    /* renamed from: c, reason: collision with root package name */
    LinearLayoutCompat f7154c;

    /* renamed from: d, reason: collision with root package name */
    private Spinner f7155d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f7156e;

    /* renamed from: f, reason: collision with root package name */
    int f7157f;

    /* renamed from: g, reason: collision with root package name */
    int f7158g;

    /* renamed from: h, reason: collision with root package name */
    private int f7159h;

    /* renamed from: i, reason: collision with root package name */
    private int f7160i;

    /* renamed from: j, reason: collision with root package name */
    protected ViewPropertyAnimator f7161j;

    /* renamed from: k, reason: collision with root package name */
    protected final e f7162k;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f7163a;

        a(View view) {
            this.f7163a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            j0.this.smoothScrollTo(this.f7163a.getLeft() - ((j0.this.getWidth() - this.f7163a.getWidth()) / 2), 0);
            j0.this.f7152a = null;
        }
    }

    private class b extends BaseAdapter {
        b() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return j0.this.f7154c.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i8) {
            return ((d) j0.this.f7154c.getChildAt(i8)).getTab();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i8) {
            return i8;
        }

        @Override // android.widget.Adapter
        public View getView(int i8, View view, ViewGroup viewGroup) {
            if (view == null) {
                return j0.this.c((a.d) getItem(i8), true);
            }
            ((d) view).bindTab((a.d) getItem(i8));
            return view;
        }
    }

    private class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((d) view).getTab().select();
            int childCount = j0.this.f7154c.getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = j0.this.f7154c.getChildAt(i8);
                childAt.setSelected(childAt == view);
            }
        }
    }

    private class d extends LinearLayout {

        /* renamed from: a, reason: collision with root package name */
        private final int[] f7167a;

        /* renamed from: b, reason: collision with root package name */
        private a.d f7168b;

        /* renamed from: c, reason: collision with root package name */
        private TextView f7169c;

        /* renamed from: d, reason: collision with root package name */
        private ImageView f7170d;

        /* renamed from: e, reason: collision with root package name */
        private View f7171e;

        public d(Context context, a.d dVar, boolean z8) {
            super(context, null, AbstractC5563a.actionBarTabStyle);
            int[] iArr = {R.attr.background};
            this.f7167a = iArr;
            this.f7168b = dVar;
            r0 r0VarObtainStyledAttributes = r0.obtainStyledAttributes(context, null, iArr, AbstractC5563a.actionBarTabStyle, 0);
            if (r0VarObtainStyledAttributes.hasValue(0)) {
                setBackgroundDrawable(r0VarObtainStyledAttributes.getDrawable(0));
            }
            r0VarObtainStyledAttributes.recycle();
            if (z8) {
                setGravity(8388627);
            }
            update();
        }

        public void bindTab(a.d dVar) {
            this.f7168b = dVar;
            update();
        }

        public a.d getTab() {
            return this.f7168b;
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i8, int i9) {
            super.onMeasure(i8, i9);
            if (j0.this.f7157f > 0) {
                int measuredWidth = getMeasuredWidth();
                int i10 = j0.this.f7157f;
                if (measuredWidth > i10) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), i9);
                }
            }
        }

        @Override // android.view.View
        public void setSelected(boolean z8) {
            boolean z9 = isSelected() != z8;
            super.setSelected(z8);
            if (z9 && z8) {
                sendAccessibilityEvent(4);
            }
        }

        public void update() {
            a.d dVar = this.f7168b;
            View customView = dVar.getCustomView();
            if (customView != null) {
                ViewParent parent = customView.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(customView);
                    }
                    addView(customView);
                }
                this.f7171e = customView;
                TextView textView = this.f7169c;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f7170d;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f7170d.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f7171e;
            if (view != null) {
                removeView(view);
                this.f7171e = null;
            }
            Drawable icon = dVar.getIcon();
            CharSequence text = dVar.getText();
            if (icon != null) {
                if (this.f7170d == null) {
                    AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView.setLayoutParams(layoutParams);
                    addView(appCompatImageView, 0);
                    this.f7170d = appCompatImageView;
                }
                this.f7170d.setImageDrawable(icon);
                this.f7170d.setVisibility(0);
            } else {
                ImageView imageView2 = this.f7170d;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f7170d.setImageDrawable(null);
                }
            }
            boolean zIsEmpty = TextUtils.isEmpty(text);
            if (zIsEmpty) {
                TextView textView2 = this.f7169c;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f7169c.setText((CharSequence) null);
                }
            } else {
                if (this.f7169c == null) {
                    J j8 = new J(getContext(), null, AbstractC5563a.actionBarTabTextStyle);
                    j8.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    j8.setLayoutParams(layoutParams2);
                    addView(j8);
                    this.f7169c = j8;
                }
                this.f7169c.setText(text);
                this.f7169c.setVisibility(0);
            }
            ImageView imageView3 = this.f7170d;
            if (imageView3 != null) {
                imageView3.setContentDescription(dVar.getContentDescription());
            }
            u0.setTooltipText(this, zIsEmpty ? dVar.getContentDescription() : null);
        }
    }

    protected class e extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        private boolean f7173a = false;

        /* renamed from: b, reason: collision with root package name */
        private int f7174b;

        protected e() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f7173a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f7173a) {
                return;
            }
            j0 j0Var = j0.this;
            j0Var.f7161j = null;
            j0Var.setVisibility(this.f7174b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            j0.this.setVisibility(0);
            this.f7173a = false;
        }

        public e withFinalVisibility(ViewPropertyAnimator viewPropertyAnimator, int i8) {
            this.f7174b = i8;
            j0.this.f7161j = viewPropertyAnimator;
            return this;
        }
    }

    public j0(Context context) {
        super(context);
        this.f7162k = new e();
        setHorizontalScrollBarEnabled(false);
        C5875a c5875a = C5875a.get(context);
        setContentHeight(c5875a.getTabContainerHeight());
        this.f7158g = c5875a.getStackedTabMaxWidth();
        LinearLayoutCompat linearLayoutCompatB = b();
        this.f7154c = linearLayoutCompatB;
        addView(linearLayoutCompatB, new ViewGroup.LayoutParams(-2, -1));
    }

    private Spinner a() {
        C0863x c0863x = new C0863x(getContext(), null, AbstractC5563a.actionDropDownStyle);
        c0863x.setLayoutParams(new LinearLayoutCompat.a(-2, -1));
        c0863x.setOnItemSelectedListener(this);
        return c0863x;
    }

    private LinearLayoutCompat b() {
        LinearLayoutCompat linearLayoutCompat = new LinearLayoutCompat(getContext(), null, AbstractC5563a.actionBarTabBarStyle);
        linearLayoutCompat.setMeasureWithLargestChildEnabled(true);
        linearLayoutCompat.setGravity(17);
        linearLayoutCompat.setLayoutParams(new LinearLayoutCompat.a(-2, -1));
        return linearLayoutCompat;
    }

    private boolean d() {
        Spinner spinner = this.f7155d;
        return spinner != null && spinner.getParent() == this;
    }

    private void e() {
        if (d()) {
            return;
        }
        if (this.f7155d == null) {
            this.f7155d = a();
        }
        removeView(this.f7154c);
        addView(this.f7155d, new ViewGroup.LayoutParams(-2, -1));
        if (this.f7155d.getAdapter() == null) {
            this.f7155d.setAdapter((SpinnerAdapter) new b());
        }
        Runnable runnable = this.f7152a;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f7152a = null;
        }
        this.f7155d.setSelection(this.f7160i);
    }

    private boolean f() {
        if (!d()) {
            return false;
        }
        removeView(this.f7155d);
        addView(this.f7154c, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f7155d.getSelectedItemPosition());
        return false;
    }

    public void addTab(a.d dVar, boolean z8) {
        d dVarC = c(dVar, false);
        this.f7154c.addView(dVarC, new LinearLayoutCompat.a(0, -1, 1.0f));
        Spinner spinner = this.f7155d;
        if (spinner != null) {
            ((b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (z8) {
            dVarC.setSelected(true);
        }
        if (this.f7156e) {
            requestLayout();
        }
    }

    public void animateToTab(int i8) {
        View childAt = this.f7154c.getChildAt(i8);
        Runnable runnable = this.f7152a;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        a aVar = new a(childAt);
        this.f7152a = aVar;
        post(aVar);
    }

    public void animateToVisibility(int i8) {
        ViewPropertyAnimator viewPropertyAnimator = this.f7161j;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        if (i8 != 0) {
            ViewPropertyAnimator viewPropertyAnimatorAlpha = animate().alpha(0.0f);
            viewPropertyAnimatorAlpha.setDuration(200L);
            viewPropertyAnimatorAlpha.setInterpolator(f7151l);
            viewPropertyAnimatorAlpha.setListener(this.f7162k.withFinalVisibility(viewPropertyAnimatorAlpha, i8));
            viewPropertyAnimatorAlpha.start();
            return;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        ViewPropertyAnimator viewPropertyAnimatorAlpha2 = animate().alpha(1.0f);
        viewPropertyAnimatorAlpha2.setDuration(200L);
        viewPropertyAnimatorAlpha2.setInterpolator(f7151l);
        viewPropertyAnimatorAlpha2.setListener(this.f7162k.withFinalVisibility(viewPropertyAnimatorAlpha2, i8));
        viewPropertyAnimatorAlpha2.start();
    }

    d c(a.d dVar, boolean z8) {
        d dVar2 = new d(getContext(), dVar, z8);
        if (z8) {
            dVar2.setBackgroundDrawable(null);
            dVar2.setLayoutParams(new AbsListView.LayoutParams(-1, this.f7159h));
        } else {
            dVar2.setFocusable(true);
            if (this.f7153b == null) {
                this.f7153b = new c();
            }
            dVar2.setOnClickListener(this.f7153b);
        }
        return dVar2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f7152a;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C5875a c5875a = C5875a.get(getContext());
        setContentHeight(c5875a.getTabContainerHeight());
        this.f7158g = c5875a.getStackedTabMaxWidth();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f7152a;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i8, long j8) {
        ((d) view).getTab().select();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i8, int i9) {
        int mode = View.MeasureSpec.getMode(i8);
        boolean z8 = mode == 1073741824;
        setFillViewport(z8);
        int childCount = this.f7154c.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.f7157f = -1;
        } else {
            if (childCount > 2) {
                this.f7157f = (int) (View.MeasureSpec.getSize(i8) * 0.4f);
            } else {
                this.f7157f = View.MeasureSpec.getSize(i8) / 2;
            }
            this.f7157f = Math.min(this.f7157f, this.f7158g);
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f7159h, 1073741824);
        if (z8 || !this.f7156e) {
            f();
        } else {
            this.f7154c.measure(0, iMakeMeasureSpec);
            if (this.f7154c.getMeasuredWidth() > View.MeasureSpec.getSize(i8)) {
                e();
            } else {
                f();
            }
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i8, iMakeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (!z8 || measuredWidth == measuredWidth2) {
            return;
        }
        setTabSelected(this.f7160i);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void removeAllTabs() {
        this.f7154c.removeAllViews();
        Spinner spinner = this.f7155d;
        if (spinner != null) {
            ((b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.f7156e) {
            requestLayout();
        }
    }

    public void removeTabAt(int i8) {
        this.f7154c.removeViewAt(i8);
        Spinner spinner = this.f7155d;
        if (spinner != null) {
            ((b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.f7156e) {
            requestLayout();
        }
    }

    public void setAllowCollapse(boolean z8) {
        this.f7156e = z8;
    }

    public void setContentHeight(int i8) {
        this.f7159h = i8;
        requestLayout();
    }

    public void setTabSelected(int i8) {
        this.f7160i = i8;
        int childCount = this.f7154c.getChildCount();
        int i9 = 0;
        while (i9 < childCount) {
            View childAt = this.f7154c.getChildAt(i9);
            boolean z8 = i9 == i8;
            childAt.setSelected(z8);
            if (z8) {
                animateToTab(i8);
            }
            i9++;
        }
        Spinner spinner = this.f7155d;
        if (spinner == null || i8 < 0) {
            return;
        }
        spinner.setSelection(i8);
    }

    public void updateTab(int i8) {
        ((d) this.f7154c.getChildAt(i8)).update();
        Spinner spinner = this.f7155d;
        if (spinner != null) {
            ((b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.f7156e) {
            requestLayout();
        }
    }

    public void addTab(a.d dVar, int i8, boolean z8) {
        d dVarC = c(dVar, false);
        this.f7154c.addView(dVarC, i8, new LinearLayoutCompat.a(0, -1, 1.0f));
        Spinner spinner = this.f7155d;
        if (spinner != null) {
            ((b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (z8) {
            dVarC.setSelected(true);
        }
        if (this.f7156e) {
            requestLayout();
        }
    }
}
