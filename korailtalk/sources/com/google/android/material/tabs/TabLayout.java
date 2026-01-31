package com.google.android.material.tabs;

import J2.k;
import J2.l;
import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.u0;
import androidx.core.view.A;
import androidx.core.view.AbstractC0985p0;
import androidx.core.view.C0924a0;
import androidx.core.view.F;
import androidx.core.view.accessibility.H;
import androidx.viewpager.widget.ViewPager;
import c3.AbstractC1090a;
import com.google.android.material.internal.o;
import h.AbstractC5572j;
import i.AbstractC5638a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

@ViewPager.e
/* loaded from: classes2.dex */
public class TabLayout extends HorizontalScrollView {
    public static final int GRAVITY_CENTER = 1;
    public static final int GRAVITY_FILL = 0;
    public static final int GRAVITY_START = 2;
    public static final int INDICATOR_ANIMATION_MODE_ELASTIC = 1;
    public static final int INDICATOR_ANIMATION_MODE_LINEAR = 0;
    public static final int INDICATOR_GRAVITY_BOTTOM = 0;
    public static final int INDICATOR_GRAVITY_CENTER = 1;
    public static final int INDICATOR_GRAVITY_STRETCH = 3;
    public static final int INDICATOR_GRAVITY_TOP = 2;
    public static final int MODE_AUTO = 2;
    public static final int MODE_FIXED = 1;
    public static final int MODE_SCROLLABLE = 0;

    /* renamed from: Q */
    private static final int f25112Q = k.Widget_Design_TabLayout;

    /* renamed from: R */
    private static final Z.e f25113R = new Z.g(16);
    public static final int TAB_LABEL_VISIBILITY_LABELED = 1;
    public static final int TAB_LABEL_VISIBILITY_UNLABELED = 0;

    /* renamed from: A */
    boolean f25114A;

    /* renamed from: B */
    boolean f25115B;

    /* renamed from: C */
    int f25116C;

    /* renamed from: D */
    boolean f25117D;

    /* renamed from: E */
    private com.google.android.material.tabs.b f25118E;

    /* renamed from: F */
    private c f25119F;

    /* renamed from: G */
    private final ArrayList f25120G;

    /* renamed from: H */
    private c f25121H;

    /* renamed from: I */
    private ValueAnimator f25122I;

    /* renamed from: J */
    ViewPager f25123J;

    /* renamed from: K */
    private androidx.viewpager.widget.a f25124K;

    /* renamed from: L */
    private DataSetObserver f25125L;

    /* renamed from: M */
    private h f25126M;

    /* renamed from: N */
    private b f25127N;

    /* renamed from: O */
    private boolean f25128O;

    /* renamed from: P */
    private final Z.e f25129P;

    /* renamed from: a */
    private final ArrayList f25130a;

    /* renamed from: b */
    private g f25131b;

    /* renamed from: c */
    final f f25132c;

    /* renamed from: d */
    int f25133d;

    /* renamed from: e */
    int f25134e;

    /* renamed from: f */
    int f25135f;

    /* renamed from: g */
    int f25136g;

    /* renamed from: h */
    int f25137h;

    /* renamed from: i */
    ColorStateList f25138i;

    /* renamed from: j */
    ColorStateList f25139j;

    /* renamed from: k */
    ColorStateList f25140k;

    /* renamed from: l */
    Drawable f25141l;

    /* renamed from: m */
    private int f25142m;

    /* renamed from: n */
    PorterDuff.Mode f25143n;

    /* renamed from: o */
    float f25144o;

    /* renamed from: p */
    float f25145p;

    /* renamed from: q */
    final int f25146q;

    /* renamed from: r */
    int f25147r;

    /* renamed from: s */
    private final int f25148s;

    /* renamed from: t */
    private final int f25149t;

    /* renamed from: u */
    private final int f25150u;

    /* renamed from: v */
    private int f25151v;

    /* renamed from: w */
    int f25152w;

    /* renamed from: x */
    int f25153x;

    /* renamed from: y */
    int f25154y;

    /* renamed from: z */
    int f25155z;

    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    private class b implements ViewPager.i {

        /* renamed from: a */
        private boolean f25157a;

        b() {
        }

        void a(boolean z8) {
            this.f25157a = z8;
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void onAdapterChanged(ViewPager viewPager, androidx.viewpager.widget.a aVar, androidx.viewpager.widget.a aVar2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f25123J == viewPager) {
                tabLayout.v(aVar2, this.f25157a);
            }
        }
    }

    public interface c {
        void onTabReselected(g gVar);

        void onTabSelected(g gVar);

        void onTabUnselected(g gVar);
    }

    public interface d extends c {
        @Override // com.google.android.material.tabs.TabLayout.c
        /* synthetic */ void onTabReselected(g gVar);

        @Override // com.google.android.material.tabs.TabLayout.c
        /* synthetic */ void onTabSelected(g gVar);

        @Override // com.google.android.material.tabs.TabLayout.c
        /* synthetic */ void onTabUnselected(g gVar);
    }

    private class e extends DataSetObserver {
        e() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            TabLayout.this.s();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            TabLayout.this.s();
        }
    }

    class f extends LinearLayout {

        /* renamed from: a */
        ValueAnimator f25160a;

        /* renamed from: b */
        int f25161b;

        /* renamed from: c */
        float f25162c;

        /* renamed from: d */
        private int f25163d;

        class a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ View f25165a;

            /* renamed from: b */
            final /* synthetic */ View f25166b;

            a(View view, View view2) {
                this.f25165a = view;
                this.f25166b = view2;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                f.this.g(this.f25165a, this.f25166b, valueAnimator.getAnimatedFraction());
            }
        }

        class b extends AnimatorListenerAdapter {

            /* renamed from: a */
            final /* synthetic */ int f25168a;

            b(int i8) {
                this.f25168a = i8;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                f.this.f25161b = this.f25168a;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                f.this.f25161b = this.f25168a;
            }
        }

        f(Context context) {
            super(context);
            this.f25161b = -1;
            this.f25163d = -1;
            setWillNotDraw(false);
        }

        private void d() {
            View childAt = getChildAt(this.f25161b);
            com.google.android.material.tabs.b bVar = TabLayout.this.f25118E;
            TabLayout tabLayout = TabLayout.this;
            bVar.d(tabLayout, childAt, tabLayout.f25141l);
        }

        public void g(View view, View view2, float f8) {
            if (view == null || view.getWidth() <= 0) {
                Drawable drawable = TabLayout.this.f25141l;
                drawable.setBounds(-1, drawable.getBounds().top, -1, TabLayout.this.f25141l.getBounds().bottom);
            } else {
                com.google.android.material.tabs.b bVar = TabLayout.this.f25118E;
                TabLayout tabLayout = TabLayout.this;
                bVar.c(tabLayout, view, view2, f8, tabLayout.f25141l);
            }
            AbstractC0985p0.postInvalidateOnAnimation(this);
        }

        private void h(boolean z8, int i8, int i9) {
            View childAt = getChildAt(this.f25161b);
            View childAt2 = getChildAt(i8);
            if (childAt2 == null) {
                d();
                return;
            }
            a aVar = new a(childAt, childAt2);
            if (!z8) {
                this.f25160a.removeAllUpdateListeners();
                this.f25160a.addUpdateListener(aVar);
                return;
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f25160a = valueAnimator;
            valueAnimator.setInterpolator(K2.a.FAST_OUT_SLOW_IN_INTERPOLATOR);
            valueAnimator.setDuration(i9);
            valueAnimator.setFloatValues(0.0f, 1.0f);
            valueAnimator.addUpdateListener(aVar);
            valueAnimator.addListener(new b(i8));
            valueAnimator.start();
        }

        void b(int i8, int i9) {
            ValueAnimator valueAnimator = this.f25160a;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f25160a.cancel();
            }
            h(true, i8, i9);
        }

        boolean c() {
            int childCount = getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                if (getChildAt(i8).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.view.View
        public void draw(Canvas canvas) {
            int height;
            int iHeight = TabLayout.this.f25141l.getBounds().height();
            if (iHeight < 0) {
                iHeight = TabLayout.this.f25141l.getIntrinsicHeight();
            }
            int i8 = TabLayout.this.f25154y;
            if (i8 == 0) {
                height = getHeight() - iHeight;
                iHeight = getHeight();
            } else if (i8 != 1) {
                height = 0;
                if (i8 != 2) {
                    iHeight = i8 != 3 ? 0 : getHeight();
                }
            } else {
                height = (getHeight() - iHeight) / 2;
                iHeight = (getHeight() + iHeight) / 2;
            }
            if (TabLayout.this.f25141l.getBounds().width() > 0) {
                Rect bounds = TabLayout.this.f25141l.getBounds();
                TabLayout.this.f25141l.setBounds(bounds.left, height, bounds.right, iHeight);
                TabLayout tabLayout = TabLayout.this;
                Drawable drawableWrap = tabLayout.f25141l;
                if (tabLayout.f25142m != 0) {
                    drawableWrap = androidx.core.graphics.drawable.a.wrap(drawableWrap);
                    androidx.core.graphics.drawable.a.setTint(drawableWrap, TabLayout.this.f25142m);
                }
                drawableWrap.draw(canvas);
            }
            super.draw(canvas);
        }

        void e(int i8, float f8) {
            ValueAnimator valueAnimator = this.f25160a;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f25160a.cancel();
            }
            this.f25161b = i8;
            this.f25162c = f8;
            g(getChildAt(i8), getChildAt(this.f25161b + 1), this.f25162c);
        }

        void f(int i8) {
            Rect bounds = TabLayout.this.f25141l.getBounds();
            TabLayout.this.f25141l.setBounds(bounds.left, 0, bounds.right, i8);
            requestLayout();
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
            super.onLayout(z8, i8, i9, i10, i11);
            ValueAnimator valueAnimator = this.f25160a;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                d();
            } else {
                h(false, this.f25161b, -1);
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        protected void onMeasure(int i8, int i9) {
            super.onMeasure(i8, i9);
            if (View.MeasureSpec.getMode(i8) != 1073741824) {
                return;
            }
            TabLayout tabLayout = TabLayout.this;
            boolean z8 = true;
            if (tabLayout.f25152w == 1 || tabLayout.f25155z == 2) {
                int childCount = getChildCount();
                int iMax = 0;
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = getChildAt(i10);
                    if (childAt.getVisibility() == 0) {
                        iMax = Math.max(iMax, childAt.getMeasuredWidth());
                    }
                }
                if (iMax <= 0) {
                    return;
                }
                if (iMax * childCount <= getMeasuredWidth() - (((int) o.dpToPx(getContext(), 16)) * 2)) {
                    boolean z9 = false;
                    for (int i11 = 0; i11 < childCount; i11++) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i11).getLayoutParams();
                        if (layoutParams.width != iMax || layoutParams.weight != 0.0f) {
                            layoutParams.width = iMax;
                            layoutParams.weight = 0.0f;
                            z9 = true;
                        }
                    }
                    z8 = z9;
                } else {
                    TabLayout tabLayout2 = TabLayout.this;
                    tabLayout2.f25152w = 0;
                    tabLayout2.z(false);
                }
                if (z8) {
                    super.onMeasure(i8, i9);
                }
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onRtlPropertiesChanged(int i8) {
            super.onRtlPropertiesChanged(i8);
        }
    }

    public static class h implements ViewPager.j {

        /* renamed from: a */
        private final WeakReference f25178a;

        /* renamed from: b */
        private int f25179b;

        /* renamed from: c */
        private int f25180c;

        public h(TabLayout tabLayout) {
            this.f25178a = new WeakReference(tabLayout);
        }

        void a() {
            this.f25180c = 0;
            this.f25179b = 0;
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageScrollStateChanged(int i8) {
            this.f25179b = this.f25180c;
            this.f25180c = i8;
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageScrolled(int i8, float f8, int i9) {
            TabLayout tabLayout = (TabLayout) this.f25178a.get();
            if (tabLayout != null) {
                int i10 = this.f25180c;
                tabLayout.setScrollPosition(i8, f8, i10 != 2 || this.f25179b == 1, (i10 == 2 && this.f25179b == 0) ? false : true);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageSelected(int i8) {
            TabLayout tabLayout = (TabLayout) this.f25178a.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i8 || i8 >= tabLayout.getTabCount()) {
                return;
            }
            int i9 = this.f25180c;
            tabLayout.selectTab(tabLayout.getTabAt(i8), i9 == 0 || (i9 == 2 && this.f25179b == 0));
        }
    }

    public final class i extends LinearLayout {

        /* renamed from: a */
        private g f25181a;

        /* renamed from: b */
        private TextView f25182b;

        /* renamed from: c */
        private ImageView f25183c;

        /* renamed from: d */
        private View f25184d;

        /* renamed from: e */
        private L2.a f25185e;

        /* renamed from: f */
        private View f25186f;

        /* renamed from: g */
        private TextView f25187g;

        /* renamed from: h */
        private ImageView f25188h;

        /* renamed from: i */
        private Drawable f25189i;

        /* renamed from: j */
        private int f25190j;

        class a implements View.OnLayoutChangeListener {

            /* renamed from: a */
            final /* synthetic */ View f25192a;

            a(View view) {
                this.f25192a = view;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
                if (this.f25192a.getVisibility() == 0) {
                    i.this.w(this.f25192a);
                }
            }
        }

        public i(Context context) {
            super(context);
            this.f25190j = 2;
            y(context);
            AbstractC0985p0.setPaddingRelative(this, TabLayout.this.f25133d, TabLayout.this.f25134e, TabLayout.this.f25135f, TabLayout.this.f25136g);
            setGravity(17);
            setOrientation(!TabLayout.this.f25114A ? 1 : 0);
            setClickable(true);
            AbstractC0985p0.setPointerIcon(this, C0924a0.getSystemIcon(getContext(), 1002));
        }

        private void A(TextView textView, ImageView imageView) {
            g gVar = this.f25181a;
            Drawable drawableMutate = (gVar == null || gVar.getIcon() == null) ? null : androidx.core.graphics.drawable.a.wrap(this.f25181a.getIcon()).mutate();
            g gVar2 = this.f25181a;
            CharSequence text = gVar2 != null ? gVar2.getText() : null;
            if (imageView != null) {
                if (drawableMutate != null) {
                    imageView.setImageDrawable(drawableMutate);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean zIsEmpty = TextUtils.isEmpty(text);
            if (textView != null) {
                if (zIsEmpty) {
                    textView.setVisibility(8);
                    textView.setText((CharSequence) null);
                } else {
                    textView.setText(text);
                    if (this.f25181a.f25176g == 1) {
                        textView.setVisibility(0);
                    } else {
                        textView.setVisibility(8);
                    }
                    setVisibility(0);
                }
            }
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int iDpToPx = (zIsEmpty || imageView.getVisibility() != 0) ? 0 : (int) o.dpToPx(getContext(), 8);
                if (TabLayout.this.f25114A) {
                    if (iDpToPx != F.getMarginEnd(marginLayoutParams)) {
                        F.setMarginEnd(marginLayoutParams, iDpToPx);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (iDpToPx != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = iDpToPx;
                    F.setMarginEnd(marginLayoutParams, 0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            g gVar3 = this.f25181a;
            CharSequence charSequence = gVar3 != null ? gVar3.f25173d : null;
            if (zIsEmpty) {
                text = charSequence;
            }
            u0.setTooltipText(this, text);
        }

        public L2.a getBadge() {
            return this.f25185e;
        }

        public L2.a getOrCreateBadge() {
            if (this.f25185e == null) {
                this.f25185e = L2.a.create(getContext());
            }
            v();
            L2.a aVar = this.f25185e;
            if (aVar != null) {
                return aVar;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        private void i(View view) {
            if (view == null) {
                return;
            }
            view.addOnLayoutChangeListener(new a(view));
        }

        private float j(Layout layout, int i8, float f8) {
            return layout.getLineWidth(i8) * (f8 / layout.getPaint().getTextSize());
        }

        private void k(boolean z8) {
            setClipChildren(z8);
            setClipToPadding(z8);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(z8);
                viewGroup.setClipToPadding(z8);
            }
        }

        private FrameLayout l() {
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            return frameLayout;
        }

        public void m(Canvas canvas) {
            Drawable drawable = this.f25189i;
            if (drawable != null) {
                drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.f25189i.draw(canvas);
            }
        }

        private FrameLayout n(View view) {
            if ((view == this.f25183c || view == this.f25182b) && L2.b.USE_COMPAT_PARENT) {
                return (FrameLayout) view.getParent();
            }
            return null;
        }

        public boolean o() {
            return this.f25185e != null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void p() {
            FrameLayout frameLayoutL;
            if (L2.b.USE_COMPAT_PARENT) {
                frameLayoutL = l();
                addView(frameLayoutL, 0);
            } else {
                frameLayoutL = this;
            }
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(J2.h.design_layout_tab_icon, (ViewGroup) frameLayoutL, false);
            this.f25183c = imageView;
            frameLayoutL.addView(imageView, 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void q() {
            FrameLayout frameLayoutL;
            if (L2.b.USE_COMPAT_PARENT) {
                frameLayoutL = l();
                addView(frameLayoutL);
            } else {
                frameLayoutL = this;
            }
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(J2.h.design_layout_tab_text, (ViewGroup) frameLayoutL, false);
            this.f25182b = textView;
            frameLayoutL.addView(textView);
        }

        public void r() {
            if (this.f25184d != null) {
                u();
            }
            this.f25185e = null;
        }

        private void t(View view) {
            if (o() && view != null) {
                k(false);
                L2.b.attachBadgeDrawable(this.f25185e, view, n(view));
                this.f25184d = view;
            }
        }

        private void u() {
            if (o()) {
                k(true);
                View view = this.f25184d;
                if (view != null) {
                    L2.b.detachBadgeDrawable(this.f25185e, view);
                    this.f25184d = null;
                }
            }
        }

        private void v() {
            g gVar;
            g gVar2;
            if (o()) {
                if (this.f25186f != null) {
                    u();
                    return;
                }
                if (this.f25183c != null && (gVar2 = this.f25181a) != null && gVar2.getIcon() != null) {
                    View view = this.f25184d;
                    ImageView imageView = this.f25183c;
                    if (view == imageView) {
                        w(imageView);
                        return;
                    } else {
                        u();
                        t(this.f25183c);
                        return;
                    }
                }
                if (this.f25182b == null || (gVar = this.f25181a) == null || gVar.getTabLabelVisibility() != 1) {
                    u();
                    return;
                }
                View view2 = this.f25184d;
                TextView textView = this.f25182b;
                if (view2 == textView) {
                    w(textView);
                } else {
                    u();
                    t(this.f25182b);
                }
            }
        }

        public void w(View view) {
            if (o() && view == this.f25184d) {
                L2.b.setBadgeDrawableBounds(this.f25185e, view, n(view));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v0, types: [android.graphics.drawable.RippleDrawable] */
        public void y(Context context) {
            int i8 = TabLayout.this.f25146q;
            if (i8 != 0) {
                Drawable drawable = AbstractC5638a.getDrawable(context, i8);
                this.f25189i = drawable;
                if (drawable != null && drawable.isStateful()) {
                    this.f25189i.setState(getDrawableState());
                }
            } else {
                this.f25189i = null;
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(0);
            if (TabLayout.this.f25140k != null) {
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setCornerRadius(1.0E-5f);
                gradientDrawable2.setColor(-1);
                ColorStateList colorStateListConvertToRippleDrawableColor = Y2.b.convertToRippleDrawableColor(TabLayout.this.f25140k);
                boolean z8 = TabLayout.this.f25117D;
                if (z8) {
                    gradientDrawable = null;
                }
                gradientDrawable = new RippleDrawable(colorStateListConvertToRippleDrawableColor, gradientDrawable, z8 ? null : gradientDrawable2);
            }
            AbstractC0985p0.setBackground(this, gradientDrawable);
            TabLayout.this.invalidate();
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.f25189i;
            if ((drawable == null || !drawable.isStateful()) ? false : this.f25189i.setState(drawableState)) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        int getContentHeight() {
            View[] viewArr = {this.f25182b, this.f25183c, this.f25186f};
            int iMax = 0;
            int iMin = 0;
            boolean z8 = false;
            for (int i8 = 0; i8 < 3; i8++) {
                View view = viewArr[i8];
                if (view != null && view.getVisibility() == 0) {
                    iMin = z8 ? Math.min(iMin, view.getTop()) : view.getTop();
                    iMax = z8 ? Math.max(iMax, view.getBottom()) : view.getBottom();
                    z8 = true;
                }
            }
            return iMax - iMin;
        }

        int getContentWidth() {
            View[] viewArr = {this.f25182b, this.f25183c, this.f25186f};
            int iMax = 0;
            int iMin = 0;
            boolean z8 = false;
            for (int i8 = 0; i8 < 3; i8++) {
                View view = viewArr[i8];
                if (view != null && view.getVisibility() == 0) {
                    iMin = z8 ? Math.min(iMin, view.getLeft()) : view.getLeft();
                    iMax = z8 ? Math.max(iMax, view.getRight()) : view.getRight();
                    z8 = true;
                }
            }
            return iMax - iMin;
        }

        public g getTab() {
            return this.f25181a;
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            L2.a aVar = this.f25185e;
            if (aVar != null && aVar.isVisible()) {
                accessibilityNodeInfo.setContentDescription(((Object) getContentDescription()) + ", " + ((Object) this.f25185e.getContentDescription()));
            }
            H hWrap = H.wrap(accessibilityNodeInfo);
            hWrap.setCollectionItemInfo(H.f.obtain(0, 1, this.f25181a.getPosition(), 1, false, isSelected()));
            if (isSelected()) {
                hWrap.setClickable(false);
                hWrap.removeAction(H.a.ACTION_CLICK);
            }
            hWrap.setRoleDescription(getResources().getString(J2.j.item_view_role_description));
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i8, int i9) {
            Layout layout;
            int size = View.MeasureSpec.getSize(i8);
            int mode = View.MeasureSpec.getMode(i8);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i8 = View.MeasureSpec.makeMeasureSpec(TabLayout.this.f25147r, Integer.MIN_VALUE);
            }
            super.onMeasure(i8, i9);
            if (this.f25182b != null) {
                float f8 = TabLayout.this.f25144o;
                int i10 = this.f25190j;
                ImageView imageView = this.f25183c;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.f25182b;
                    if (textView != null && textView.getLineCount() > 1) {
                        f8 = TabLayout.this.f25145p;
                    }
                } else {
                    i10 = 1;
                }
                float textSize = this.f25182b.getTextSize();
                int lineCount = this.f25182b.getLineCount();
                int maxLines = androidx.core.widget.h.getMaxLines(this.f25182b);
                if (f8 != textSize || (maxLines >= 0 && i10 != maxLines)) {
                    if (TabLayout.this.f25155z != 1 || f8 <= textSize || lineCount != 1 || ((layout = this.f25182b.getLayout()) != null && j(layout, 0, f8) <= (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                        this.f25182b.setTextSize(0, f8);
                        this.f25182b.setMaxLines(i10);
                        super.onMeasure(i8, i9);
                    }
                }
            }
        }

        @Override // android.view.View
        public boolean performClick() {
            boolean zPerformClick = super.performClick();
            if (this.f25181a == null) {
                return zPerformClick;
            }
            if (!zPerformClick) {
                playSoundEffect(0);
            }
            this.f25181a.select();
            return true;
        }

        void s() {
            setTab(null);
            setSelected(false);
        }

        @Override // android.view.View
        public void setSelected(boolean z8) {
            isSelected();
            super.setSelected(z8);
            TextView textView = this.f25182b;
            if (textView != null) {
                textView.setSelected(z8);
            }
            ImageView imageView = this.f25183c;
            if (imageView != null) {
                imageView.setSelected(z8);
            }
            View view = this.f25186f;
            if (view != null) {
                view.setSelected(z8);
            }
        }

        void setTab(g gVar) {
            if (gVar != this.f25181a) {
                this.f25181a = gVar;
                x();
            }
        }

        final void x() {
            g gVar = this.f25181a;
            Drawable drawableMutate = null;
            View customView = gVar != null ? gVar.getCustomView() : null;
            if (customView != null) {
                ViewParent parent = customView.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(customView);
                    }
                    addView(customView);
                }
                this.f25186f = customView;
                TextView textView = this.f25182b;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f25183c;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f25183c.setImageDrawable(null);
                }
                TextView textView2 = (TextView) customView.findViewById(R.id.text1);
                this.f25187g = textView2;
                if (textView2 != null) {
                    this.f25190j = androidx.core.widget.h.getMaxLines(textView2);
                }
                this.f25188h = (ImageView) customView.findViewById(R.id.icon);
            } else {
                View view = this.f25186f;
                if (view != null) {
                    removeView(view);
                    this.f25186f = null;
                }
                this.f25187g = null;
                this.f25188h = null;
            }
            if (this.f25186f == null) {
                if (this.f25183c == null) {
                    p();
                }
                if (gVar != null && gVar.getIcon() != null) {
                    drawableMutate = androidx.core.graphics.drawable.a.wrap(gVar.getIcon()).mutate();
                }
                if (drawableMutate != null) {
                    androidx.core.graphics.drawable.a.setTintList(drawableMutate, TabLayout.this.f25139j);
                    PorterDuff.Mode mode = TabLayout.this.f25143n;
                    if (mode != null) {
                        androidx.core.graphics.drawable.a.setTintMode(drawableMutate, mode);
                    }
                }
                if (this.f25182b == null) {
                    q();
                    this.f25190j = androidx.core.widget.h.getMaxLines(this.f25182b);
                }
                androidx.core.widget.h.setTextAppearance(this.f25182b, TabLayout.this.f25137h);
                ColorStateList colorStateList = TabLayout.this.f25138i;
                if (colorStateList != null) {
                    this.f25182b.setTextColor(colorStateList);
                }
                A(this.f25182b, this.f25183c);
                v();
                i(this.f25183c);
                i(this.f25182b);
            } else {
                TextView textView3 = this.f25187g;
                if (textView3 != null || this.f25188h != null) {
                    A(textView3, this.f25188h);
                }
            }
            if (gVar != null && !TextUtils.isEmpty(gVar.f25173d)) {
                setContentDescription(gVar.f25173d);
            }
            setSelected(gVar != null && gVar.isSelected());
        }

        final void z() {
            setOrientation(!TabLayout.this.f25114A ? 1 : 0);
            TextView textView = this.f25187g;
            if (textView == null && this.f25188h == null) {
                A(this.f25182b, this.f25183c);
            } else {
                A(textView, this.f25188h);
            }
        }
    }

    public static class j implements d {

        /* renamed from: a */
        private final ViewPager f25194a;

        public j(ViewPager viewPager) {
            this.f25194a = viewPager;
        }

        @Override // com.google.android.material.tabs.TabLayout.d, com.google.android.material.tabs.TabLayout.c
        public void onTabReselected(g gVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.d, com.google.android.material.tabs.TabLayout.c
        public void onTabSelected(g gVar) {
            this.f25194a.setCurrentItem(gVar.getPosition());
        }

        @Override // com.google.android.material.tabs.TabLayout.d, com.google.android.material.tabs.TabLayout.c
        public void onTabUnselected(g gVar) {
        }
    }

    public TabLayout(Context context) {
        this(context, null);
    }

    private void c(TabItem tabItem) {
        g gVarNewTab = newTab();
        CharSequence charSequence = tabItem.text;
        if (charSequence != null) {
            gVarNewTab.setText(charSequence);
        }
        Drawable drawable = tabItem.icon;
        if (drawable != null) {
            gVarNewTab.setIcon(drawable);
        }
        int i8 = tabItem.customLayout;
        if (i8 != 0) {
            gVarNewTab.setCustomView(i8);
        }
        if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
            gVarNewTab.setContentDescription(tabItem.getContentDescription());
        }
        addTab(gVarNewTab);
    }

    private void d(g gVar) {
        i iVar = gVar.view;
        iVar.setSelected(false);
        iVar.setActivated(false);
        this.f25132c.addView(iVar, gVar.getPosition(), l());
    }

    private void e(View view) {
        if (!(view instanceof TabItem)) {
            throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
        }
        c((TabItem) view);
    }

    private void f(int i8) {
        if (i8 == -1) {
            return;
        }
        if (getWindowToken() == null || !AbstractC0985p0.isLaidOut(this) || this.f25132c.c()) {
            setScrollPosition(i8, 0.0f, true);
            return;
        }
        int scrollX = getScrollX();
        int i9 = i(i8, 0.0f);
        if (scrollX != i9) {
            r();
            this.f25122I.setIntValues(scrollX, i9);
            this.f25122I.start();
        }
        this.f25132c.b(i8, this.f25153x);
    }

    private void g(int i8) {
        if (i8 == 0) {
            Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
        } else if (i8 == 1) {
            this.f25132c.setGravity(1);
            return;
        } else if (i8 != 2) {
            return;
        }
        this.f25132c.setGravity(A.START);
    }

    private int getDefaultHeight() {
        int size = this.f25130a.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                break;
            }
            g gVar = (g) this.f25130a.get(i8);
            if (gVar == null || gVar.getIcon() == null || TextUtils.isEmpty(gVar.getText())) {
                i8++;
            } else if (!this.f25114A) {
                return 72;
            }
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i8 = this.f25148s;
        if (i8 != -1) {
            return i8;
        }
        int i9 = this.f25155z;
        if (i9 == 0 || i9 == 2) {
            return this.f25150u;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f25132c.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void h() {
        int i8 = this.f25155z;
        AbstractC0985p0.setPaddingRelative(this.f25132c, (i8 == 0 || i8 == 2) ? Math.max(0, this.f25151v - this.f25133d) : 0, 0, 0, 0);
        int i9 = this.f25155z;
        if (i9 == 0) {
            g(this.f25152w);
        } else if (i9 == 1 || i9 == 2) {
            if (this.f25152w == 2) {
                Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
            }
            this.f25132c.setGravity(1);
        }
        z(true);
    }

    private int i(int i8, float f8) {
        int i9 = this.f25155z;
        if (i9 != 0 && i9 != 2) {
            return 0;
        }
        View childAt = this.f25132c.getChildAt(i8);
        int i10 = i8 + 1;
        View childAt2 = i10 < this.f25132c.getChildCount() ? this.f25132c.getChildAt(i10) : null;
        int width = childAt != null ? childAt.getWidth() : 0;
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i11 = (int) ((width + width2) * 0.5f * f8);
        return AbstractC0985p0.getLayoutDirection(this) == 0 ? left + i11 : left - i11;
    }

    private void j(g gVar, int i8) {
        gVar.f(i8);
        this.f25130a.add(i8, gVar);
        int size = this.f25130a.size();
        while (true) {
            i8++;
            if (i8 >= size) {
                return;
            } else {
                ((g) this.f25130a.get(i8)).f(i8);
            }
        }
    }

    private static ColorStateList k(int i8, int i9) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i9, i8});
    }

    private LinearLayout.LayoutParams l() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        y(layoutParams);
        return layoutParams;
    }

    private i n(g gVar) {
        Z.e eVar = this.f25129P;
        i iVar = eVar != null ? (i) eVar.acquire() : null;
        if (iVar == null) {
            iVar = new i(getContext());
        }
        iVar.setTab(gVar);
        iVar.setFocusable(true);
        iVar.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(gVar.f25173d)) {
            iVar.setContentDescription(gVar.f25172c);
        } else {
            iVar.setContentDescription(gVar.f25173d);
        }
        return iVar;
    }

    private void o(g gVar) {
        for (int size = this.f25120G.size() - 1; size >= 0; size--) {
            ((c) this.f25120G.get(size)).onTabReselected(gVar);
        }
    }

    private void p(g gVar) {
        for (int size = this.f25120G.size() - 1; size >= 0; size--) {
            ((c) this.f25120G.get(size)).onTabSelected(gVar);
        }
    }

    private void q(g gVar) {
        for (int size = this.f25120G.size() - 1; size >= 0; size--) {
            ((c) this.f25120G.get(size)).onTabUnselected(gVar);
        }
    }

    private void r() {
        if (this.f25122I == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f25122I = valueAnimator;
            valueAnimator.setInterpolator(K2.a.FAST_OUT_SLOW_IN_INTERPOLATOR);
            this.f25122I.setDuration(this.f25153x);
            this.f25122I.addUpdateListener(new a());
        }
    }

    private void setSelectedTabView(int i8) {
        int childCount = this.f25132c.getChildCount();
        if (i8 < childCount) {
            int i9 = 0;
            while (i9 < childCount) {
                View childAt = this.f25132c.getChildAt(i9);
                boolean z8 = true;
                childAt.setSelected(i9 == i8);
                if (i9 != i8) {
                    z8 = false;
                }
                childAt.setActivated(z8);
                i9++;
            }
        }
    }

    private void u(int i8) {
        i iVar = (i) this.f25132c.getChildAt(i8);
        this.f25132c.removeViewAt(i8);
        if (iVar != null) {
            iVar.s();
            this.f25129P.release(iVar);
        }
        requestLayout();
    }

    private void w(ViewPager viewPager, boolean z8, boolean z9) {
        ViewPager viewPager2 = this.f25123J;
        if (viewPager2 != null) {
            h hVar = this.f25126M;
            if (hVar != null) {
                viewPager2.removeOnPageChangeListener(hVar);
            }
            b bVar = this.f25127N;
            if (bVar != null) {
                this.f25123J.removeOnAdapterChangeListener(bVar);
            }
        }
        c cVar = this.f25121H;
        if (cVar != null) {
            removeOnTabSelectedListener(cVar);
            this.f25121H = null;
        }
        if (viewPager != null) {
            this.f25123J = viewPager;
            if (this.f25126M == null) {
                this.f25126M = new h(this);
            }
            this.f25126M.a();
            viewPager.addOnPageChangeListener(this.f25126M);
            j jVar = new j(viewPager);
            this.f25121H = jVar;
            addOnTabSelectedListener((c) jVar);
            androidx.viewpager.widget.a adapter = viewPager.getAdapter();
            if (adapter != null) {
                v(adapter, z8);
            }
            if (this.f25127N == null) {
                this.f25127N = new b();
            }
            this.f25127N.a(z8);
            viewPager.addOnAdapterChangeListener(this.f25127N);
            setScrollPosition(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.f25123J = null;
            v(null, false);
        }
        this.f25128O = z9;
    }

    private void x() {
        int size = this.f25130a.size();
        for (int i8 = 0; i8 < size; i8++) {
            ((g) this.f25130a.get(i8)).g();
        }
    }

    private void y(LinearLayout.LayoutParams layoutParams) {
        if (this.f25155z == 1 && this.f25152w == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
    }

    public void addOnTabSelectedListener(d dVar) {
        addOnTabSelectedListener((c) dVar);
    }

    public void addTab(g gVar) {
        addTab(gVar, this.f25130a.isEmpty());
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        e(view);
    }

    public void clearOnTabSelectedListeners() {
        this.f25120G.clear();
    }

    public int getSelectedTabPosition() {
        g gVar = this.f25131b;
        if (gVar != null) {
            return gVar.getPosition();
        }
        return -1;
    }

    public g getTabAt(int i8) {
        if (i8 < 0 || i8 >= getTabCount()) {
            return null;
        }
        return (g) this.f25130a.get(i8);
    }

    public int getTabCount() {
        return this.f25130a.size();
    }

    public int getTabGravity() {
        return this.f25152w;
    }

    public ColorStateList getTabIconTint() {
        return this.f25139j;
    }

    public int getTabIndicatorAnimationMode() {
        return this.f25116C;
    }

    public int getTabIndicatorGravity() {
        return this.f25154y;
    }

    int getTabMaxWidth() {
        return this.f25147r;
    }

    public int getTabMode() {
        return this.f25155z;
    }

    public ColorStateList getTabRippleColor() {
        return this.f25140k;
    }

    public Drawable getTabSelectedIndicator() {
        return this.f25141l;
    }

    public ColorStateList getTabTextColors() {
        return this.f25138i;
    }

    public boolean hasUnboundedRipple() {
        return this.f25117D;
    }

    public boolean isInlineLabel() {
        return this.f25114A;
    }

    public boolean isTabIndicatorFullWidth() {
        return this.f25115B;
    }

    protected g m() {
        g gVar = (g) f25113R.acquire();
        return gVar == null ? new g() : gVar;
    }

    public g newTab() {
        g gVarM = m();
        gVarM.parent = this;
        gVarM.view = n(gVarM);
        if (gVarM.f25177h != -1) {
            gVarM.view.setId(gVarM.f25177h);
        }
        return gVarM;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3.h.setParentAbsoluteElevation(this);
        if (this.f25123J == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                w((ViewPager) parent, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f25128O) {
            setupWithViewPager(null);
            this.f25128O = false;
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        for (int i8 = 0; i8 < this.f25132c.getChildCount(); i8++) {
            View childAt = this.f25132c.getChildAt(i8);
            if (childAt instanceof i) {
                ((i) childAt).m(canvas);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        H.wrap(accessibilityNodeInfo).setCollectionInfo(H.e.obtain(1, getTabCount(), false, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.getContext()
            int r1 = r6.getDefaultHeight()
            float r0 = com.google.android.material.internal.o.dpToPx(r0, r1)
            int r0 = java.lang.Math.round(r0)
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 0
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = 1
            if (r1 == r2) goto L2e
            if (r1 == 0) goto L1f
            goto L41
        L1f:
            int r8 = r6.getPaddingTop()
            int r0 = r0 + r8
            int r8 = r6.getPaddingBottom()
            int r0 = r0 + r8
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r4)
            goto L41
        L2e:
            int r1 = r6.getChildCount()
            if (r1 != r5) goto L41
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            if (r1 < r0) goto L41
            android.view.View r1 = r6.getChildAt(r3)
            r1.setMinimumHeight(r0)
        L41:
            int r0 = android.view.View.MeasureSpec.getSize(r7)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            if (r1 == 0) goto L5f
            int r1 = r6.f25149t
            if (r1 <= 0) goto L50
            goto L5d
        L50:
            float r0 = (float) r0
            android.content.Context r1 = r6.getContext()
            r2 = 56
            float r1 = com.google.android.material.internal.o.dpToPx(r1, r2)
            float r0 = r0 - r1
            int r1 = (int) r0
        L5d:
            r6.f25147r = r1
        L5f:
            super.onMeasure(r7, r8)
            int r7 = r6.getChildCount()
            if (r7 != r5) goto La9
            android.view.View r7 = r6.getChildAt(r3)
            int r0 = r6.f25155z
            if (r0 == 0) goto L81
            if (r0 == r5) goto L76
            r1 = 2
            if (r0 == r1) goto L81
            goto La9
        L76:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 == r1) goto La9
            goto L8b
        L81:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 >= r1) goto La9
        L8b:
            int r0 = r6.getPaddingTop()
            int r1 = r6.getPaddingBottom()
            int r0 = r0 + r1
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            int r1 = r1.height
            int r8 = android.view.ViewGroup.getChildMeasureSpec(r8, r0, r1)
            int r0 = r6.getMeasuredWidth()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r4)
            r7.measure(r0, r8)
        La9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onMeasure(int, int):void");
    }

    public void removeAllTabs() {
        for (int childCount = this.f25132c.getChildCount() - 1; childCount >= 0; childCount--) {
            u(childCount);
        }
        Iterator it = this.f25130a.iterator();
        while (it.hasNext()) {
            g gVar = (g) it.next();
            it.remove();
            gVar.e();
            t(gVar);
        }
        this.f25131b = null;
    }

    public void removeOnTabSelectedListener(d dVar) {
        removeOnTabSelectedListener((c) dVar);
    }

    public void removeTab(g gVar) {
        if (gVar.parent != this) {
            throw new IllegalArgumentException("Tab does not belong to this TabLayout.");
        }
        removeTabAt(gVar.getPosition());
    }

    public void removeTabAt(int i8) {
        g gVar = this.f25131b;
        int position = gVar != null ? gVar.getPosition() : 0;
        u(i8);
        g gVar2 = (g) this.f25130a.remove(i8);
        if (gVar2 != null) {
            gVar2.e();
            t(gVar2);
        }
        int size = this.f25130a.size();
        for (int i9 = i8; i9 < size; i9++) {
            ((g) this.f25130a.get(i9)).f(i9);
        }
        if (position == i8) {
            selectTab(this.f25130a.isEmpty() ? null : (g) this.f25130a.get(Math.max(0, i8 - 1)));
        }
    }

    void s() {
        int currentItem;
        removeAllTabs();
        androidx.viewpager.widget.a aVar = this.f25124K;
        if (aVar != null) {
            int count = aVar.getCount();
            for (int i8 = 0; i8 < count; i8++) {
                addTab(newTab().setText(this.f25124K.getPageTitle(i8)), false);
            }
            ViewPager viewPager = this.f25123J;
            if (viewPager == null || count <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            selectTab(getTabAt(currentItem));
        }
    }

    public void selectTab(g gVar) {
        selectTab(gVar, true);
    }

    @Override // android.view.View
    public void setElevation(float f8) {
        super.setElevation(f8);
        a3.h.setElevation(this, f8);
    }

    public void setInlineLabel(boolean z8) {
        if (this.f25114A != z8) {
            this.f25114A = z8;
            for (int i8 = 0; i8 < this.f25132c.getChildCount(); i8++) {
                View childAt = this.f25132c.getChildAt(i8);
                if (childAt instanceof i) {
                    ((i) childAt).z();
                }
            }
            h();
        }
    }

    public void setInlineLabelResource(int i8) {
        setInlineLabel(getResources().getBoolean(i8));
    }

    @Deprecated
    public void setOnTabSelectedListener(d dVar) {
        setOnTabSelectedListener((c) dVar);
    }

    void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        r();
        this.f25122I.addListener(animatorListener);
    }

    public void setScrollPosition(int i8, float f8, boolean z8) {
        setScrollPosition(i8, f8, z8, true);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (this.f25141l != drawable) {
            if (drawable == null) {
                drawable = new GradientDrawable();
            }
            this.f25141l = drawable;
        }
    }

    public void setSelectedTabIndicatorColor(int i8) {
        this.f25142m = i8;
    }

    public void setSelectedTabIndicatorGravity(int i8) {
        if (this.f25154y != i8) {
            this.f25154y = i8;
            AbstractC0985p0.postInvalidateOnAnimation(this.f25132c);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i8) {
        this.f25132c.f(i8);
    }

    public void setTabGravity(int i8) {
        if (this.f25152w != i8) {
            this.f25152w = i8;
            h();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.f25139j != colorStateList) {
            this.f25139j = colorStateList;
            x();
        }
    }

    public void setTabIconTintResource(int i8) {
        setTabIconTint(AbstractC5638a.getColorStateList(getContext(), i8));
    }

    public void setTabIndicatorAnimationMode(int i8) {
        this.f25116C = i8;
        if (i8 == 0) {
            this.f25118E = new com.google.android.material.tabs.b();
        } else {
            if (i8 == 1) {
                this.f25118E = new com.google.android.material.tabs.a();
                return;
            }
            throw new IllegalArgumentException(i8 + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z8) {
        this.f25115B = z8;
        AbstractC0985p0.postInvalidateOnAnimation(this.f25132c);
    }

    public void setTabMode(int i8) {
        if (i8 != this.f25155z) {
            this.f25155z = i8;
            h();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.f25140k != colorStateList) {
            this.f25140k = colorStateList;
            for (int i8 = 0; i8 < this.f25132c.getChildCount(); i8++) {
                View childAt = this.f25132c.getChildAt(i8);
                if (childAt instanceof i) {
                    ((i) childAt).y(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(int i8) {
        setTabRippleColor(AbstractC5638a.getColorStateList(getContext(), i8));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f25138i != colorStateList) {
            this.f25138i = colorStateList;
            x();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(androidx.viewpager.widget.a aVar) {
        v(aVar, false);
    }

    public void setUnboundedRipple(boolean z8) {
        if (this.f25117D != z8) {
            this.f25117D = z8;
            for (int i8 = 0; i8 < this.f25132c.getChildCount(); i8++) {
                View childAt = this.f25132c.getChildAt(i8);
                if (childAt instanceof i) {
                    ((i) childAt).y(getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i8) {
        setUnboundedRipple(getResources().getBoolean(i8));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        setupWithViewPager(viewPager, true);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    protected boolean t(g gVar) {
        return f25113R.release(gVar);
    }

    void v(androidx.viewpager.widget.a aVar, boolean z8) {
        DataSetObserver dataSetObserver;
        androidx.viewpager.widget.a aVar2 = this.f25124K;
        if (aVar2 != null && (dataSetObserver = this.f25125L) != null) {
            aVar2.unregisterDataSetObserver(dataSetObserver);
        }
        this.f25124K = aVar;
        if (z8 && aVar != null) {
            if (this.f25125L == null) {
                this.f25125L = new e();
            }
            aVar.registerDataSetObserver(this.f25125L);
        }
        s();
    }

    void z(boolean z8) {
        for (int i8 = 0; i8 < this.f25132c.getChildCount(); i8++) {
            View childAt = this.f25132c.getChildAt(i8);
            childAt.setMinimumWidth(getTabMinWidth());
            y((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z8) {
                childAt.requestLayout();
            }
        }
    }

    public static class g {
        public static final int INVALID_POSITION = -1;

        /* renamed from: a */
        private Object f25170a;

        /* renamed from: b */
        private Drawable f25171b;

        /* renamed from: c */
        private CharSequence f25172c;

        /* renamed from: d */
        private CharSequence f25173d;

        /* renamed from: f */
        private View f25175f;
        public TabLayout parent;
        public i view;

        /* renamed from: e */
        private int f25174e = -1;

        /* renamed from: g */
        private int f25176g = 1;

        /* renamed from: h */
        private int f25177h = -1;

        void e() {
            this.parent = null;
            this.view = null;
            this.f25170a = null;
            this.f25171b = null;
            this.f25177h = -1;
            this.f25172c = null;
            this.f25173d = null;
            this.f25174e = -1;
            this.f25175f = null;
        }

        void f(int i8) {
            this.f25174e = i8;
        }

        void g() {
            i iVar = this.view;
            if (iVar != null) {
                iVar.x();
            }
        }

        public L2.a getBadge() {
            return this.view.getBadge();
        }

        public CharSequence getContentDescription() {
            i iVar = this.view;
            if (iVar == null) {
                return null;
            }
            return iVar.getContentDescription();
        }

        public View getCustomView() {
            return this.f25175f;
        }

        public Drawable getIcon() {
            return this.f25171b;
        }

        public int getId() {
            return this.f25177h;
        }

        public L2.a getOrCreateBadge() {
            return this.view.getOrCreateBadge();
        }

        public int getPosition() {
            return this.f25174e;
        }

        public int getTabLabelVisibility() {
            return this.f25176g;
        }

        public Object getTag() {
            return this.f25170a;
        }

        public CharSequence getText() {
            return this.f25172c;
        }

        public boolean isSelected() {
            TabLayout tabLayout = this.parent;
            if (tabLayout != null) {
                return tabLayout.getSelectedTabPosition() == this.f25174e;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        public void removeBadge() {
            this.view.r();
        }

        public void select() {
            TabLayout tabLayout = this.parent;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            tabLayout.selectTab(this);
        }

        public g setContentDescription(int i8) {
            TabLayout tabLayout = this.parent;
            if (tabLayout != null) {
                return setContentDescription(tabLayout.getResources().getText(i8));
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        public g setCustomView(View view) {
            this.f25175f = view;
            g();
            return this;
        }

        public g setIcon(Drawable drawable) {
            this.f25171b = drawable;
            TabLayout tabLayout = this.parent;
            if (tabLayout.f25152w == 1 || tabLayout.f25155z == 2) {
                tabLayout.z(true);
            }
            g();
            if (L2.b.USE_COMPAT_PARENT && this.view.o() && this.view.f25185e.isVisible()) {
                this.view.invalidate();
            }
            return this;
        }

        public g setId(int i8) {
            this.f25177h = i8;
            i iVar = this.view;
            if (iVar != null) {
                iVar.setId(i8);
            }
            return this;
        }

        public g setTabLabelVisibility(int i8) {
            this.f25176g = i8;
            TabLayout tabLayout = this.parent;
            if (tabLayout.f25152w == 1 || tabLayout.f25155z == 2) {
                tabLayout.z(true);
            }
            g();
            if (L2.b.USE_COMPAT_PARENT && this.view.o() && this.view.f25185e.isVisible()) {
                this.view.invalidate();
            }
            return this;
        }

        public g setTag(Object obj) {
            this.f25170a = obj;
            return this;
        }

        public g setText(CharSequence charSequence) {
            if (TextUtils.isEmpty(this.f25173d) && !TextUtils.isEmpty(charSequence)) {
                this.view.setContentDescription(charSequence);
            }
            this.f25172c = charSequence;
            g();
            return this;
        }

        public g setCustomView(int i8) {
            return setCustomView(LayoutInflater.from(this.view.getContext()).inflate(i8, (ViewGroup) this.view, false));
        }

        public g setContentDescription(CharSequence charSequence) {
            this.f25173d = charSequence;
            g();
            return this;
        }

        public g setText(int i8) {
            TabLayout tabLayout = this.parent;
            if (tabLayout != null) {
                return setText(tabLayout.getResources().getText(i8));
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        public g setIcon(int i8) {
            TabLayout tabLayout = this.parent;
            if (tabLayout != null) {
                return setIcon(AbstractC5638a.getDrawable(tabLayout.getContext(), i8));
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, J2.b.tabStyle);
    }

    @Deprecated
    public void addOnTabSelectedListener(c cVar) {
        if (this.f25120G.contains(cVar)) {
            return;
        }
        this.f25120G.add(cVar);
    }

    public void addTab(g gVar, int i8) {
        addTab(gVar, i8, this.f25130a.isEmpty());
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i8) {
        e(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void removeOnTabSelectedListener(c cVar) {
        this.f25120G.remove(cVar);
    }

    public void selectTab(g gVar, boolean z8) {
        g gVar2 = this.f25131b;
        if (gVar2 == gVar) {
            if (gVar2 != null) {
                o(gVar);
                f(gVar.getPosition());
                return;
            }
            return;
        }
        int position = gVar != null ? gVar.getPosition() : -1;
        if (z8) {
            if ((gVar2 == null || gVar2.getPosition() == -1) && position != -1) {
                setScrollPosition(position, 0.0f, true);
            } else {
                f(position);
            }
            if (position != -1) {
                setSelectedTabView(position);
            }
        }
        this.f25131b = gVar;
        if (gVar2 != null) {
            q(gVar2);
        }
        if (gVar != null) {
            p(gVar);
        }
    }

    @Deprecated
    public void setOnTabSelectedListener(c cVar) {
        c cVar2 = this.f25119F;
        if (cVar2 != null) {
            removeOnTabSelectedListener(cVar2);
        }
        this.f25119F = cVar;
        if (cVar != null) {
            addOnTabSelectedListener(cVar);
        }
    }

    public void setScrollPosition(int i8, float f8, boolean z8, boolean z9) {
        int iRound = Math.round(i8 + f8);
        if (iRound < 0 || iRound >= this.f25132c.getChildCount()) {
            return;
        }
        if (z9) {
            this.f25132c.e(i8, f8);
        }
        ValueAnimator valueAnimator = this.f25122I;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f25122I.cancel();
        }
        scrollTo(i(i8, f8), 0);
        if (z8) {
            setSelectedTabView(iRound);
        }
    }

    public void setupWithViewPager(ViewPager viewPager, boolean z8) {
        w(viewPager, z8, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TabLayout(Context context, AttributeSet attributeSet, int i8) throws Resources.NotFoundException {
        int i9 = f25112Q;
        super(AbstractC1090a.wrap(context, attributeSet, i8, i9), attributeSet, i8);
        this.f25130a = new ArrayList();
        this.f25141l = new GradientDrawable();
        this.f25142m = 0;
        this.f25147r = Integer.MAX_VALUE;
        this.f25120G = new ArrayList();
        this.f25129P = new Z.f(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        f fVar = new f(context2);
        this.f25132c = fVar;
        super.addView(fVar, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray typedArrayObtainStyledAttributes = com.google.android.material.internal.k.obtainStyledAttributes(context2, attributeSet, l.TabLayout, i8, i9, l.TabLayout_tabTextAppearance);
        if (getBackground() instanceof ColorDrawable) {
            ColorDrawable colorDrawable = (ColorDrawable) getBackground();
            a3.g gVar = new a3.g();
            gVar.setFillColor(ColorStateList.valueOf(colorDrawable.getColor()));
            gVar.initializeElevationOverlay(context2);
            gVar.setElevation(AbstractC0985p0.getElevation(this));
            AbstractC0985p0.setBackground(this, gVar);
        }
        setSelectedTabIndicator(X2.c.getDrawable(context2, typedArrayObtainStyledAttributes, l.TabLayout_tabIndicator));
        setSelectedTabIndicatorColor(typedArrayObtainStyledAttributes.getColor(l.TabLayout_tabIndicatorColor, 0));
        fVar.f(typedArrayObtainStyledAttributes.getDimensionPixelSize(l.TabLayout_tabIndicatorHeight, -1));
        setSelectedTabIndicatorGravity(typedArrayObtainStyledAttributes.getInt(l.TabLayout_tabIndicatorGravity, 0));
        setTabIndicatorFullWidth(typedArrayObtainStyledAttributes.getBoolean(l.TabLayout_tabIndicatorFullWidth, true));
        setTabIndicatorAnimationMode(typedArrayObtainStyledAttributes.getInt(l.TabLayout_tabIndicatorAnimationMode, 0));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(l.TabLayout_tabPadding, 0);
        this.f25136g = dimensionPixelSize;
        this.f25135f = dimensionPixelSize;
        this.f25134e = dimensionPixelSize;
        this.f25133d = dimensionPixelSize;
        this.f25133d = typedArrayObtainStyledAttributes.getDimensionPixelSize(l.TabLayout_tabPaddingStart, dimensionPixelSize);
        this.f25134e = typedArrayObtainStyledAttributes.getDimensionPixelSize(l.TabLayout_tabPaddingTop, this.f25134e);
        this.f25135f = typedArrayObtainStyledAttributes.getDimensionPixelSize(l.TabLayout_tabPaddingEnd, this.f25135f);
        this.f25136g = typedArrayObtainStyledAttributes.getDimensionPixelSize(l.TabLayout_tabPaddingBottom, this.f25136g);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(l.TabLayout_tabTextAppearance, k.TextAppearance_Design_Tab);
        this.f25137h = resourceId;
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(resourceId, AbstractC5572j.TextAppearance);
        try {
            this.f25144o = typedArrayObtainStyledAttributes2.getDimensionPixelSize(AbstractC5572j.TextAppearance_android_textSize, 0);
            this.f25138i = X2.c.getColorStateList(context2, typedArrayObtainStyledAttributes2, AbstractC5572j.TextAppearance_android_textColor);
            typedArrayObtainStyledAttributes2.recycle();
            if (typedArrayObtainStyledAttributes.hasValue(l.TabLayout_tabTextColor)) {
                this.f25138i = X2.c.getColorStateList(context2, typedArrayObtainStyledAttributes, l.TabLayout_tabTextColor);
            }
            if (typedArrayObtainStyledAttributes.hasValue(l.TabLayout_tabSelectedTextColor)) {
                this.f25138i = k(this.f25138i.getDefaultColor(), typedArrayObtainStyledAttributes.getColor(l.TabLayout_tabSelectedTextColor, 0));
            }
            this.f25139j = X2.c.getColorStateList(context2, typedArrayObtainStyledAttributes, l.TabLayout_tabIconTint);
            this.f25143n = o.parseTintMode(typedArrayObtainStyledAttributes.getInt(l.TabLayout_tabIconTintMode, -1), null);
            this.f25140k = X2.c.getColorStateList(context2, typedArrayObtainStyledAttributes, l.TabLayout_tabRippleColor);
            this.f25153x = typedArrayObtainStyledAttributes.getInt(l.TabLayout_tabIndicatorAnimationDuration, 300);
            this.f25148s = typedArrayObtainStyledAttributes.getDimensionPixelSize(l.TabLayout_tabMinWidth, -1);
            this.f25149t = typedArrayObtainStyledAttributes.getDimensionPixelSize(l.TabLayout_tabMaxWidth, -1);
            this.f25146q = typedArrayObtainStyledAttributes.getResourceId(l.TabLayout_tabBackground, 0);
            this.f25151v = typedArrayObtainStyledAttributes.getDimensionPixelSize(l.TabLayout_tabContentStart, 0);
            this.f25155z = typedArrayObtainStyledAttributes.getInt(l.TabLayout_tabMode, 1);
            this.f25152w = typedArrayObtainStyledAttributes.getInt(l.TabLayout_tabGravity, 0);
            this.f25114A = typedArrayObtainStyledAttributes.getBoolean(l.TabLayout_tabInlineLabel, false);
            this.f25117D = typedArrayObtainStyledAttributes.getBoolean(l.TabLayout_tabUnboundedRipple, false);
            typedArrayObtainStyledAttributes.recycle();
            Resources resources = getResources();
            this.f25145p = resources.getDimensionPixelSize(J2.d.design_tab_text_size_2line);
            this.f25150u = resources.getDimensionPixelSize(J2.d.design_tab_scrollable_min_width);
            h();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes2.recycle();
            throw th;
        }
    }

    public void addTab(g gVar, boolean z8) {
        addTab(gVar, this.f25130a.size(), z8);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        e(view);
    }

    public void setSelectedTabIndicator(int i8) {
        if (i8 != 0) {
            setSelectedTabIndicator(AbstractC5638a.getDrawable(getContext(), i8));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }

    public void addTab(g gVar, int i8, boolean z8) {
        if (gVar.parent == this) {
            j(gVar, i8);
            d(gVar);
            if (z8) {
                gVar.select();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i8, ViewGroup.LayoutParams layoutParams) {
        e(view);
    }

    public void setTabTextColors(int i8, int i9) {
        setTabTextColors(k(i8, i9));
    }
}
