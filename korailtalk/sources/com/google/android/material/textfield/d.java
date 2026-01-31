package com.google.android.material.textfield;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.core.view.AbstractC0985p0;
import androidx.core.view.accessibility.H;
import com.google.android.material.textfield.TextInputLayout;
import i.AbstractC5638a;

/* loaded from: classes2.dex */
class d extends com.google.android.material.textfield.e {

    /* renamed from: q, reason: collision with root package name */
    private static final boolean f25312q = true;

    /* renamed from: d, reason: collision with root package name */
    private final TextWatcher f25313d;

    /* renamed from: e, reason: collision with root package name */
    private final View.OnFocusChangeListener f25314e;

    /* renamed from: f, reason: collision with root package name */
    private final TextInputLayout.e f25315f;

    /* renamed from: g, reason: collision with root package name */
    private final TextInputLayout.f f25316g;

    /* renamed from: h, reason: collision with root package name */
    private final TextInputLayout.g f25317h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f25318i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f25319j;

    /* renamed from: k, reason: collision with root package name */
    private long f25320k;

    /* renamed from: l, reason: collision with root package name */
    private StateListDrawable f25321l;

    /* renamed from: m, reason: collision with root package name */
    private a3.g f25322m;

    /* renamed from: n, reason: collision with root package name */
    private AccessibilityManager f25323n;

    /* renamed from: o, reason: collision with root package name */
    private ValueAnimator f25324o;

    /* renamed from: p, reason: collision with root package name */
    private ValueAnimator f25325p;

    class a extends com.google.android.material.internal.j {

        /* renamed from: com.google.android.material.textfield.d$a$a, reason: collision with other inner class name */
        class RunnableC0205a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AutoCompleteTextView f25327a;

            RunnableC0205a(AutoCompleteTextView autoCompleteTextView) {
                this.f25327a = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean zIsPopupShowing = this.f25327a.isPopupShowing();
                d.this.E(zIsPopupShowing);
                d.this.f25318i = zIsPopupShowing;
            }
        }

        a() {
        }

        @Override // com.google.android.material.internal.j, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            AutoCompleteTextView autoCompleteTextViewY = d.y(d.this.f25341a.getEditText());
            if (d.this.f25323n.isTouchExplorationEnabled() && d.D(autoCompleteTextViewY) && !d.this.f25343c.hasFocus()) {
                autoCompleteTextViewY.dismissDropDown();
            }
            autoCompleteTextViewY.post(new RunnableC0205a(autoCompleteTextViewY));
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            d.this.f25343c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    class c implements View.OnFocusChangeListener {
        c() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z8) {
            d.this.f25341a.setEndIconActivated(z8);
            if (z8) {
                return;
            }
            d.this.E(false);
            d.this.f25318i = false;
        }
    }

    /* renamed from: com.google.android.material.textfield.d$d, reason: collision with other inner class name */
    class C0206d extends TextInputLayout.e {
        C0206d(TextInputLayout textInputLayout) {
            super(textInputLayout);
        }

        @Override // com.google.android.material.textfield.TextInputLayout.e, androidx.core.view.C0923a
        public void onInitializeAccessibilityNodeInfo(View view, H h8) {
            super.onInitializeAccessibilityNodeInfo(view, h8);
            if (!d.D(d.this.f25341a.getEditText())) {
                h8.setClassName(Spinner.class.getName());
            }
            if (h8.isShowingHintText()) {
                h8.setHintText(null);
            }
        }

        @Override // androidx.core.view.C0923a
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            AutoCompleteTextView autoCompleteTextViewY = d.y(d.this.f25341a.getEditText());
            if (accessibilityEvent.getEventType() == 1 && d.this.f25323n.isTouchExplorationEnabled() && !d.D(d.this.f25341a.getEditText())) {
                d.this.H(autoCompleteTextViewY);
            }
        }
    }

    class e implements TextInputLayout.f {
        e() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void onEditTextAttached(TextInputLayout textInputLayout) {
            AutoCompleteTextView autoCompleteTextViewY = d.y(textInputLayout.getEditText());
            d.this.F(autoCompleteTextViewY);
            d.this.v(autoCompleteTextViewY);
            d.this.G(autoCompleteTextViewY);
            autoCompleteTextViewY.setThreshold(0);
            autoCompleteTextViewY.removeTextChangedListener(d.this.f25313d);
            autoCompleteTextViewY.addTextChangedListener(d.this.f25313d);
            textInputLayout.setEndIconCheckable(true);
            textInputLayout.setErrorIconDrawable((Drawable) null);
            if (!d.D(autoCompleteTextViewY)) {
                AbstractC0985p0.setImportantForAccessibility(d.this.f25343c, 2);
            }
            textInputLayout.setTextInputAccessibilityDelegate(d.this.f25315f);
            textInputLayout.setEndIconVisible(true);
        }
    }

    class f implements TextInputLayout.g {

        class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AutoCompleteTextView f25334a;

            a(AutoCompleteTextView autoCompleteTextView) {
                this.f25334a = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f25334a.removeTextChangedListener(d.this.f25313d);
            }
        }

        f() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public void onEndIconChanged(TextInputLayout textInputLayout, int i8) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText();
            if (autoCompleteTextView == null || i8 != 3) {
                return;
            }
            autoCompleteTextView.post(new a(autoCompleteTextView));
            if (autoCompleteTextView.getOnFocusChangeListener() == d.this.f25314e) {
                autoCompleteTextView.setOnFocusChangeListener(null);
            }
            autoCompleteTextView.setOnTouchListener(null);
            if (d.f25312q) {
                autoCompleteTextView.setOnDismissListener(null);
            }
        }
    }

    class g implements View.OnClickListener {
        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d.this.H((AutoCompleteTextView) d.this.f25341a.getEditText());
        }
    }

    class h implements View.OnTouchListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AutoCompleteTextView f25337a;

        h(AutoCompleteTextView autoCompleteTextView) {
            this.f25337a = autoCompleteTextView;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                if (d.this.C()) {
                    d.this.f25318i = false;
                }
                d.this.H(this.f25337a);
            }
            return false;
        }
    }

    class i implements AutoCompleteTextView.OnDismissListener {
        i() {
        }

        @Override // android.widget.AutoCompleteTextView.OnDismissListener
        public void onDismiss() {
            d.this.f25318i = true;
            d.this.f25320k = System.currentTimeMillis();
            d.this.E(false);
        }
    }

    class j extends AnimatorListenerAdapter {
        j() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            d dVar = d.this;
            dVar.f25343c.setChecked(dVar.f25319j);
            d.this.f25325p.start();
        }
    }

    d(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f25313d = new a();
        this.f25314e = new c();
        this.f25315f = new C0206d(this.f25341a);
        this.f25316g = new e();
        this.f25317h = new f();
        this.f25318i = false;
        this.f25319j = false;
        this.f25320k = Long.MAX_VALUE;
    }

    private a3.g A(float f8, float f9, float f10, int i8) {
        a3.k kVarBuild = a3.k.builder().setTopLeftCornerSize(f8).setTopRightCornerSize(f8).setBottomLeftCornerSize(f9).setBottomRightCornerSize(f9).build();
        a3.g gVarCreateWithElevationOverlay = a3.g.createWithElevationOverlay(this.f25342b, f10);
        gVarCreateWithElevationOverlay.setShapeAppearanceModel(kVarBuild);
        gVarCreateWithElevationOverlay.setPadding(0, i8, 0, i8);
        return gVarCreateWithElevationOverlay;
    }

    private void B() {
        this.f25325p = z(67, 0.0f, 1.0f);
        ValueAnimator valueAnimatorZ = z(50, 1.0f, 0.0f);
        this.f25324o = valueAnimatorZ;
        valueAnimatorZ.addListener(new j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean C() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f25320k;
        return jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean D(EditText editText) {
        return editText.getKeyListener() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E(boolean z8) {
        if (this.f25319j != z8) {
            this.f25319j = z8;
            this.f25325p.cancel();
            this.f25324o.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F(AutoCompleteTextView autoCompleteTextView) {
        if (f25312q) {
            int boxBackgroundMode = this.f25341a.getBoxBackgroundMode();
            if (boxBackgroundMode == 2) {
                autoCompleteTextView.setDropDownBackgroundDrawable(this.f25322m);
            } else if (boxBackgroundMode == 1) {
                autoCompleteTextView.setDropDownBackgroundDrawable(this.f25321l);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G(AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.setOnTouchListener(new h(autoCompleteTextView));
        autoCompleteTextView.setOnFocusChangeListener(this.f25314e);
        if (f25312q) {
            autoCompleteTextView.setOnDismissListener(new i());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView == null) {
            return;
        }
        if (C()) {
            this.f25318i = false;
        }
        if (this.f25318i) {
            this.f25318i = false;
            return;
        }
        if (f25312q) {
            E(!this.f25319j);
        } else {
            this.f25319j = !this.f25319j;
            this.f25343c.toggle();
        }
        if (!this.f25319j) {
            autoCompleteTextView.dismissDropDown();
        } else {
            autoCompleteTextView.requestFocus();
            autoCompleteTextView.showDropDown();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(AutoCompleteTextView autoCompleteTextView) {
        if (D(autoCompleteTextView)) {
            return;
        }
        int boxBackgroundMode = this.f25341a.getBoxBackgroundMode();
        a3.g boxBackground = this.f25341a.getBoxBackground();
        int color = Q2.a.getColor(autoCompleteTextView, J2.b.colorControlHighlight);
        int[][] iArr = {new int[]{R.attr.state_pressed}, new int[0]};
        if (boxBackgroundMode == 2) {
            x(autoCompleteTextView, color, iArr, boxBackground);
        } else if (boxBackgroundMode == 1) {
            w(autoCompleteTextView, color, iArr, boxBackground);
        }
    }

    private void w(AutoCompleteTextView autoCompleteTextView, int i8, int[][] iArr, a3.g gVar) {
        int boxBackgroundColor = this.f25341a.getBoxBackgroundColor();
        int[] iArr2 = {Q2.a.layer(i8, boxBackgroundColor, 0.1f), boxBackgroundColor};
        if (f25312q) {
            AbstractC0985p0.setBackground(autoCompleteTextView, new RippleDrawable(new ColorStateList(iArr, iArr2), gVar, gVar));
            return;
        }
        a3.g gVar2 = new a3.g(gVar.getShapeAppearanceModel());
        gVar2.setFillColor(new ColorStateList(iArr, iArr2));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gVar, gVar2});
        int paddingStart = AbstractC0985p0.getPaddingStart(autoCompleteTextView);
        int paddingTop = autoCompleteTextView.getPaddingTop();
        int paddingEnd = AbstractC0985p0.getPaddingEnd(autoCompleteTextView);
        int paddingBottom = autoCompleteTextView.getPaddingBottom();
        AbstractC0985p0.setBackground(autoCompleteTextView, layerDrawable);
        AbstractC0985p0.setPaddingRelative(autoCompleteTextView, paddingStart, paddingTop, paddingEnd, paddingBottom);
    }

    private void x(AutoCompleteTextView autoCompleteTextView, int i8, int[][] iArr, a3.g gVar) {
        LayerDrawable layerDrawable;
        int color = Q2.a.getColor(autoCompleteTextView, J2.b.colorSurface);
        a3.g gVar2 = new a3.g(gVar.getShapeAppearanceModel());
        int iLayer = Q2.a.layer(i8, color, 0.1f);
        gVar2.setFillColor(new ColorStateList(iArr, new int[]{iLayer, 0}));
        if (f25312q) {
            gVar2.setTint(color);
            ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iLayer, color});
            a3.g gVar3 = new a3.g(gVar.getShapeAppearanceModel());
            gVar3.setTint(-1);
            layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar2, gVar3), gVar});
        } else {
            layerDrawable = new LayerDrawable(new Drawable[]{gVar2, gVar});
        }
        AbstractC0985p0.setBackground(autoCompleteTextView, layerDrawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AutoCompleteTextView y(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    private ValueAnimator z(int i8, float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(K2.a.LINEAR_INTERPOLATOR);
        valueAnimatorOfFloat.setDuration(i8);
        valueAnimatorOfFloat.addUpdateListener(new b());
        return valueAnimatorOfFloat;
    }

    @Override // com.google.android.material.textfield.e
    void a() throws Resources.NotFoundException {
        float dimensionPixelOffset = this.f25342b.getResources().getDimensionPixelOffset(J2.d.mtrl_shape_corner_size_small_component);
        float dimensionPixelOffset2 = this.f25342b.getResources().getDimensionPixelOffset(J2.d.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset3 = this.f25342b.getResources().getDimensionPixelOffset(J2.d.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        a3.g gVarA = A(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        a3.g gVarA2 = A(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.f25322m = gVarA;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.f25321l = stateListDrawable;
        stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, gVarA);
        this.f25321l.addState(new int[0], gVarA2);
        this.f25341a.setEndIconDrawable(AbstractC5638a.getDrawable(this.f25342b, f25312q ? J2.e.mtrl_dropdown_arrow : J2.e.mtrl_ic_arrow_drop_down));
        TextInputLayout textInputLayout = this.f25341a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(J2.j.exposed_dropdown_menu_content_description));
        this.f25341a.setEndIconOnClickListener(new g());
        this.f25341a.addOnEditTextAttachedListener(this.f25316g);
        this.f25341a.addOnEndIconChangedListener(this.f25317h);
        B();
        this.f25323n = (AccessibilityManager) this.f25342b.getSystemService("accessibility");
    }

    @Override // com.google.android.material.textfield.e
    boolean b(int i8) {
        return i8 != 0;
    }

    @Override // com.google.android.material.textfield.e
    boolean d() {
        return true;
    }
}
