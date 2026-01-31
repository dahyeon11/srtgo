package com.google.android.material.textfield;

import a3.k;
import android.R;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.C0850j;
import androidx.appcompat.widget.J;
import androidx.appcompat.widget.W;
import androidx.appcompat.widget.r0;
import androidx.core.view.A;
import androidx.core.view.AbstractC0985p0;
import androidx.core.view.C0923a;
import androidx.core.view.F;
import androidx.core.view.accessibility.H;
import c0.AbstractC1087a;
import c3.AbstractC1090a;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.o;
import i.AbstractC5638a;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes2.dex */
public class TextInputLayout extends LinearLayout {
    public static final int BOX_BACKGROUND_FILLED = 1;
    public static final int BOX_BACKGROUND_NONE = 0;
    public static final int BOX_BACKGROUND_OUTLINE = 2;
    public static final int END_ICON_CLEAR_TEXT = 2;
    public static final int END_ICON_CUSTOM = -1;
    public static final int END_ICON_DROPDOWN_MENU = 3;
    public static final int END_ICON_NONE = 0;
    public static final int END_ICON_PASSWORD_TOGGLE = 1;

    /* renamed from: J0 */
    private static final int f25197J0 = J2.k.Widget_Design_TextInputLayout;

    /* renamed from: A */
    private boolean f25198A;

    /* renamed from: A0 */
    private int f25199A0;

    /* renamed from: B */
    private a3.g f25200B;

    /* renamed from: B0 */
    private int f25201B0;

    /* renamed from: C */
    private a3.g f25202C;

    /* renamed from: C0 */
    private boolean f25203C0;

    /* renamed from: D */
    private a3.k f25204D;

    /* renamed from: D0 */
    final com.google.android.material.internal.a f25205D0;

    /* renamed from: E */
    private final int f25206E;

    /* renamed from: E0 */
    private boolean f25207E0;

    /* renamed from: F */
    private int f25208F;

    /* renamed from: F0 */
    private boolean f25209F0;

    /* renamed from: G */
    private int f25210G;

    /* renamed from: G0 */
    private ValueAnimator f25211G0;

    /* renamed from: H */
    private int f25212H;

    /* renamed from: H0 */
    private boolean f25213H0;

    /* renamed from: I */
    private int f25214I;

    /* renamed from: I0 */
    private boolean f25215I0;

    /* renamed from: J */
    private int f25216J;

    /* renamed from: K */
    private int f25217K;

    /* renamed from: L */
    private int f25218L;

    /* renamed from: M */
    private final Rect f25219M;

    /* renamed from: N */
    private final Rect f25220N;

    /* renamed from: O */
    private final RectF f25221O;

    /* renamed from: P */
    private Typeface f25222P;

    /* renamed from: Q */
    private final CheckableImageButton f25223Q;

    /* renamed from: R */
    private ColorStateList f25224R;

    /* renamed from: S */
    private boolean f25225S;

    /* renamed from: T */
    private PorterDuff.Mode f25226T;

    /* renamed from: U */
    private boolean f25227U;

    /* renamed from: V */
    private Drawable f25228V;

    /* renamed from: W */
    private int f25229W;

    /* renamed from: a */
    private final FrameLayout f25230a;

    /* renamed from: a0 */
    private View.OnLongClickListener f25231a0;

    /* renamed from: b */
    private final LinearLayout f25232b;

    /* renamed from: b0 */
    private final LinkedHashSet f25233b0;

    /* renamed from: c */
    private final LinearLayout f25234c;

    /* renamed from: c0 */
    private int f25235c0;

    /* renamed from: d */
    private final FrameLayout f25236d;

    /* renamed from: d0 */
    private final SparseArray f25237d0;

    /* renamed from: e */
    EditText f25238e;

    /* renamed from: e0 */
    private final CheckableImageButton f25239e0;

    /* renamed from: f */
    private CharSequence f25240f;

    /* renamed from: f0 */
    private final LinkedHashSet f25241f0;

    /* renamed from: g */
    private final com.google.android.material.textfield.f f25242g;

    /* renamed from: g0 */
    private ColorStateList f25243g0;

    /* renamed from: h */
    boolean f25244h;

    /* renamed from: h0 */
    private boolean f25245h0;

    /* renamed from: i */
    private int f25246i;

    /* renamed from: i0 */
    private PorterDuff.Mode f25247i0;

    /* renamed from: j */
    private boolean f25248j;

    /* renamed from: j0 */
    private boolean f25249j0;

    /* renamed from: k */
    private TextView f25250k;

    /* renamed from: k0 */
    private Drawable f25251k0;

    /* renamed from: l */
    private int f25252l;

    /* renamed from: l0 */
    private int f25253l0;

    /* renamed from: m */
    private int f25254m;

    /* renamed from: m0 */
    private Drawable f25255m0;

    /* renamed from: n */
    private CharSequence f25256n;

    /* renamed from: n0 */
    private View.OnLongClickListener f25257n0;

    /* renamed from: o */
    private boolean f25258o;

    /* renamed from: o0 */
    private View.OnLongClickListener f25259o0;

    /* renamed from: p */
    private TextView f25260p;

    /* renamed from: p0 */
    private final CheckableImageButton f25261p0;

    /* renamed from: q */
    private ColorStateList f25262q;

    /* renamed from: q0 */
    private ColorStateList f25263q0;

    /* renamed from: r */
    private int f25264r;

    /* renamed from: r0 */
    private ColorStateList f25265r0;

    /* renamed from: s */
    private ColorStateList f25266s;

    /* renamed from: s0 */
    private ColorStateList f25267s0;

    /* renamed from: t */
    private ColorStateList f25268t;

    /* renamed from: t0 */
    private int f25269t0;

    /* renamed from: u */
    private CharSequence f25270u;

    /* renamed from: u0 */
    private int f25271u0;

    /* renamed from: v */
    private final TextView f25272v;

    /* renamed from: v0 */
    private int f25273v0;

    /* renamed from: w */
    private CharSequence f25274w;

    /* renamed from: w0 */
    private ColorStateList f25275w0;

    /* renamed from: x */
    private final TextView f25276x;

    /* renamed from: x0 */
    private int f25277x0;

    /* renamed from: y */
    private boolean f25278y;

    /* renamed from: y0 */
    private int f25279y0;

    /* renamed from: z */
    private CharSequence f25280z;

    /* renamed from: z0 */
    private int f25281z0;

    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TextInputLayout.this.l0(!r0.f25215I0);
            TextInputLayout textInputLayout = TextInputLayout.this;
            if (textInputLayout.f25244h) {
                textInputLayout.e0(editable.length());
            }
            if (TextInputLayout.this.f25258o) {
                TextInputLayout.this.p0(editable.length());
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f25239e0.performClick();
            TextInputLayout.this.f25239e0.jumpDrawablesToCurrentState();
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f25238e.requestLayout();
        }
    }

    class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.f25205D0.setExpansionFraction(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static class e extends C0923a {

        /* renamed from: d */
        private final TextInputLayout f25286d;

        public e(TextInputLayout textInputLayout) {
            this.f25286d = textInputLayout;
        }

        @Override // androidx.core.view.C0923a
        public void onInitializeAccessibilityNodeInfo(View view, H h8) {
            super.onInitializeAccessibilityNodeInfo(view, h8);
            EditText editText = this.f25286d.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f25286d.getHint();
            CharSequence error = this.f25286d.getError();
            CharSequence placeholderText = this.f25286d.getPlaceholderText();
            int counterMaxLength = this.f25286d.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f25286d.getCounterOverflowDescription();
            boolean zIsEmpty = TextUtils.isEmpty(text);
            boolean zIsEmpty2 = TextUtils.isEmpty(hint);
            boolean zJ = this.f25286d.J();
            boolean zIsEmpty3 = TextUtils.isEmpty(error);
            boolean z8 = (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
            String string = !zIsEmpty2 ? hint.toString() : "";
            if (!zIsEmpty) {
                h8.setText(text);
            } else if (!TextUtils.isEmpty(string)) {
                h8.setText(string);
                if (!zJ && placeholderText != null) {
                    h8.setText(string + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                h8.setText(placeholderText);
            }
            if (!TextUtils.isEmpty(string)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    h8.setHintText(string);
                } else {
                    if (!zIsEmpty) {
                        string = ((Object) text) + ", " + string;
                    }
                    h8.setText(string);
                }
                h8.setShowingHintText(zIsEmpty);
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            h8.setMaxTextLength(counterMaxLength);
            if (z8) {
                if (zIsEmpty3) {
                    error = counterOverflowDescription;
                }
                h8.setError(error);
            }
            if (editText != null) {
                editText.setLabelFor(J2.f.textinput_helper_text);
            }
        }
    }

    public interface f {
        void onEditTextAttached(TextInputLayout textInputLayout);
    }

    public interface g {
        void onEndIconChanged(TextInputLayout textInputLayout, int i8);
    }

    static class h extends AbstractC1087a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: b */
        CharSequence f25287b;

        /* renamed from: c */
        boolean f25288c;

        /* renamed from: d */
        CharSequence f25289d;

        /* renamed from: e */
        CharSequence f25290e;

        /* renamed from: f */
        CharSequence f25291f;

        static class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public h[] newArray(int i8) {
                return new h[i8];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public h createFromParcel(Parcel parcel) {
                return new h(parcel, null);
            }
        }

        h(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f25287b) + " hint=" + ((Object) this.f25289d) + " helperText=" + ((Object) this.f25290e) + " placeholderText=" + ((Object) this.f25291f) + "}";
        }

        @Override // c0.AbstractC1087a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            super.writeToParcel(parcel, i8);
            TextUtils.writeToParcel(this.f25287b, parcel, i8);
            parcel.writeInt(this.f25288c ? 1 : 0);
            TextUtils.writeToParcel(this.f25289d, parcel, i8);
            TextUtils.writeToParcel(this.f25290e, parcel, i8);
            TextUtils.writeToParcel(this.f25291f, parcel, i8);
        }

        h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
            this.f25287b = (CharSequence) creator.createFromParcel(parcel);
            this.f25288c = parcel.readInt() == 1;
            this.f25289d = (CharSequence) creator.createFromParcel(parcel);
            this.f25290e = (CharSequence) creator.createFromParcel(parcel);
            this.f25291f = (CharSequence) creator.createFromParcel(parcel);
        }
    }

    public TextInputLayout(Context context) {
        this(context, null);
    }

    private void A(int i8) {
        Iterator it = this.f25241f0.iterator();
        while (it.hasNext()) {
            ((g) it.next()).onEndIconChanged(this, i8);
        }
    }

    private void B(Canvas canvas) {
        a3.g gVar = this.f25202C;
        if (gVar != null) {
            Rect bounds = gVar.getBounds();
            bounds.top = bounds.bottom - this.f25212H;
            this.f25202C.draw(canvas);
        }
    }

    private void C(Canvas canvas) {
        if (this.f25278y) {
            this.f25205D0.draw(canvas);
        }
    }

    private void D(boolean z8) {
        ValueAnimator valueAnimator = this.f25211G0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f25211G0.cancel();
        }
        if (z8 && this.f25209F0) {
            g(0.0f);
        } else {
            this.f25205D0.setExpansionFraction(0.0f);
        }
        if (y() && ((com.google.android.material.textfield.c) this.f25200B).D()) {
            w();
        }
        this.f25203C0 = true;
        H();
        r0();
        u0();
    }

    private int E(int i8, boolean z8) {
        int compoundPaddingLeft = i8 + this.f25238e.getCompoundPaddingLeft();
        return (this.f25270u == null || z8) ? compoundPaddingLeft : (compoundPaddingLeft - this.f25272v.getMeasuredWidth()) + this.f25272v.getPaddingLeft();
    }

    private int F(int i8, boolean z8) {
        int compoundPaddingRight = i8 - this.f25238e.getCompoundPaddingRight();
        return (this.f25270u == null || !z8) ? compoundPaddingRight : compoundPaddingRight + (this.f25272v.getMeasuredWidth() - this.f25272v.getPaddingRight());
    }

    private boolean G() {
        return this.f25235c0 != 0;
    }

    private void H() {
        TextView textView = this.f25260p;
        if (textView == null || !this.f25258o) {
            return;
        }
        textView.setText((CharSequence) null);
        this.f25260p.setVisibility(4);
    }

    private boolean I() {
        return this.f25261p0.getVisibility() == 0;
    }

    private boolean K() {
        return this.f25208F == 1 && this.f25238e.getMinLines() <= 1;
    }

    private int[] L(CheckableImageButton checkableImageButton) {
        int[] drawableState = getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
        return iArrCopyOf;
    }

    private void M() {
        n();
        R();
        v0();
        b0();
        f();
        if (this.f25208F != 0) {
            k0();
        }
    }

    private void N() {
        if (y()) {
            RectF rectF = this.f25221O;
            this.f25205D0.getCollapsedTextActualBounds(rectF, this.f25238e.getWidth(), this.f25238e.getGravity());
            j(rectF);
            rectF.offset(-getPaddingLeft(), -getPaddingTop());
            ((com.google.android.material.textfield.c) this.f25200B).J(rectF);
        }
    }

    private static void O(ViewGroup viewGroup, boolean z8) {
        int childCount = viewGroup.getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = viewGroup.getChildAt(i8);
            childAt.setEnabled(z8);
            if (childAt instanceof ViewGroup) {
                O((ViewGroup) childAt, z8);
            }
        }
    }

    private void P(CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int colorForState = colorStateList.getColorForState(L(checkableImageButton), colorStateList.getDefaultColor());
        Drawable drawableMutate = androidx.core.graphics.drawable.a.wrap(drawable).mutate();
        androidx.core.graphics.drawable.a.setTintList(drawableMutate, ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    private void Q() {
        TextView textView = this.f25260p;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    private void R() {
        if (Y()) {
            AbstractC0985p0.setBackground(this.f25238e, this.f25200B);
        }
    }

    private static void S(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean zHasOnClickListeners = AbstractC0985p0.hasOnClickListeners(checkableImageButton);
        boolean z8 = onLongClickListener != null;
        boolean z9 = zHasOnClickListeners || z8;
        checkableImageButton.setFocusable(z9);
        checkableImageButton.setClickable(zHasOnClickListeners);
        checkableImageButton.setPressable(zHasOnClickListeners);
        checkableImageButton.setLongClickable(z8);
        AbstractC0985p0.setImportantForAccessibility(checkableImageButton, z9 ? 1 : 2);
    }

    private static void T(CheckableImageButton checkableImageButton, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        S(checkableImageButton, onLongClickListener);
    }

    private static void U(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        S(checkableImageButton, onLongClickListener);
    }

    private boolean W() {
        return (this.f25261p0.getVisibility() == 0 || ((G() && isEndIconVisible()) || this.f25274w != null)) && this.f25234c.getMeasuredWidth() > 0;
    }

    private boolean X() {
        return !(getStartIconDrawable() == null && this.f25270u == null) && this.f25232b.getMeasuredWidth() > 0;
    }

    private boolean Y() {
        EditText editText = this.f25238e;
        return (editText == null || this.f25200B == null || editText.getBackground() != null || this.f25208F == 0) ? false : true;
    }

    private void Z() {
        TextView textView = this.f25260p;
        if (textView == null || !this.f25258o) {
            return;
        }
        textView.setText(this.f25256n);
        this.f25260p.setVisibility(0);
        this.f25260p.bringToFront();
    }

    private void a0(boolean z8) {
        if (!z8 || getEndIconDrawable() == null) {
            k();
            return;
        }
        Drawable drawableMutate = androidx.core.graphics.drawable.a.wrap(getEndIconDrawable()).mutate();
        androidx.core.graphics.drawable.a.setTint(drawableMutate, this.f25242g.o());
        this.f25239e0.setImageDrawable(drawableMutate);
    }

    private void b0() {
        if (this.f25208F == 1) {
            if (X2.c.isFontScaleAtLeast2_0(getContext())) {
                this.f25210G = getResources().getDimensionPixelSize(J2.d.material_font_2_0_box_collapsed_padding_top);
            } else if (X2.c.isFontScaleAtLeast1_3(getContext())) {
                this.f25210G = getResources().getDimensionPixelSize(J2.d.material_font_1_3_box_collapsed_padding_top);
            }
        }
    }

    private void c0(Rect rect) {
        a3.g gVar = this.f25202C;
        if (gVar != null) {
            int i8 = rect.bottom;
            gVar.setBounds(rect.left, i8 - this.f25216J, rect.right, i8);
        }
    }

    private void d0() {
        if (this.f25250k != null) {
            EditText editText = this.f25238e;
            e0(editText == null ? 0 : editText.getText().length());
        }
    }

    private void e() {
        TextView textView = this.f25260p;
        if (textView != null) {
            this.f25230a.addView(textView);
            this.f25260p.setVisibility(0);
        }
    }

    private void f() {
        if (this.f25238e == null || this.f25208F != 1) {
            return;
        }
        if (X2.c.isFontScaleAtLeast2_0(getContext())) {
            EditText editText = this.f25238e;
            AbstractC0985p0.setPaddingRelative(editText, AbstractC0985p0.getPaddingStart(editText), getResources().getDimensionPixelSize(J2.d.material_filled_edittext_font_2_0_padding_top), AbstractC0985p0.getPaddingEnd(this.f25238e), getResources().getDimensionPixelSize(J2.d.material_filled_edittext_font_2_0_padding_bottom));
        } else if (X2.c.isFontScaleAtLeast1_3(getContext())) {
            EditText editText2 = this.f25238e;
            AbstractC0985p0.setPaddingRelative(editText2, AbstractC0985p0.getPaddingStart(editText2), getResources().getDimensionPixelSize(J2.d.material_filled_edittext_font_1_3_padding_top), AbstractC0985p0.getPaddingEnd(this.f25238e), getResources().getDimensionPixelSize(J2.d.material_filled_edittext_font_1_3_padding_bottom));
        }
    }

    private static void f0(Context context, TextView textView, int i8, int i9, boolean z8) {
        textView.setContentDescription(context.getString(z8 ? J2.j.character_counter_overflowed_content_description : J2.j.character_counter_content_description, Integer.valueOf(i8), Integer.valueOf(i9)));
    }

    private void g0() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f25250k;
        if (textView != null) {
            V(textView, this.f25248j ? this.f25252l : this.f25254m);
            if (!this.f25248j && (colorStateList2 = this.f25266s) != null) {
                this.f25250k.setTextColor(colorStateList2);
            }
            if (!this.f25248j || (colorStateList = this.f25268t) == null) {
                return;
            }
            this.f25250k.setTextColor(colorStateList);
        }
    }

    private com.google.android.material.textfield.e getEndIconDelegate() {
        com.google.android.material.textfield.e eVar = (com.google.android.material.textfield.e) this.f25237d0.get(this.f25235c0);
        return eVar != null ? eVar : (com.google.android.material.textfield.e) this.f25237d0.get(0);
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.f25261p0.getVisibility() == 0) {
            return this.f25261p0;
        }
        if (G() && isEndIconVisible()) {
            return this.f25239e0;
        }
        return null;
    }

    private void h() {
        a3.g gVar = this.f25200B;
        if (gVar == null) {
            return;
        }
        gVar.setShapeAppearanceModel(this.f25204D);
        if (u()) {
            this.f25200B.setStroke(this.f25212H, this.f25217K);
        }
        int iO = o();
        this.f25218L = iO;
        this.f25200B.setFillColor(ColorStateList.valueOf(iO));
        if (this.f25235c0 == 3) {
            this.f25238e.getBackground().invalidateSelf();
        }
        i();
        invalidate();
    }

    private boolean h0() {
        boolean z8;
        if (this.f25238e == null) {
            return false;
        }
        boolean z9 = true;
        if (X()) {
            int measuredWidth = this.f25232b.getMeasuredWidth() - this.f25238e.getPaddingLeft();
            if (this.f25228V == null || this.f25229W != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.f25228V = colorDrawable;
                this.f25229W = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] compoundDrawablesRelative = androidx.core.widget.h.getCompoundDrawablesRelative(this.f25238e);
            Drawable drawable = compoundDrawablesRelative[0];
            Drawable drawable2 = this.f25228V;
            if (drawable != drawable2) {
                androidx.core.widget.h.setCompoundDrawablesRelative(this.f25238e, drawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                z8 = true;
            }
            z8 = false;
        } else {
            if (this.f25228V != null) {
                Drawable[] compoundDrawablesRelative2 = androidx.core.widget.h.getCompoundDrawablesRelative(this.f25238e);
                androidx.core.widget.h.setCompoundDrawablesRelative(this.f25238e, null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                this.f25228V = null;
                z8 = true;
            }
            z8 = false;
        }
        if (W()) {
            int measuredWidth2 = this.f25276x.getMeasuredWidth() - this.f25238e.getPaddingRight();
            CheckableImageButton endIconToUpdateDummyDrawable = getEndIconToUpdateDummyDrawable();
            if (endIconToUpdateDummyDrawable != null) {
                measuredWidth2 = measuredWidth2 + endIconToUpdateDummyDrawable.getMeasuredWidth() + F.getMarginStart((ViewGroup.MarginLayoutParams) endIconToUpdateDummyDrawable.getLayoutParams());
            }
            Drawable[] compoundDrawablesRelative3 = androidx.core.widget.h.getCompoundDrawablesRelative(this.f25238e);
            Drawable drawable3 = this.f25251k0;
            if (drawable3 == null || this.f25253l0 == measuredWidth2) {
                if (drawable3 == null) {
                    ColorDrawable colorDrawable2 = new ColorDrawable();
                    this.f25251k0 = colorDrawable2;
                    this.f25253l0 = measuredWidth2;
                    colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
                }
                Drawable drawable4 = compoundDrawablesRelative3[2];
                Drawable drawable5 = this.f25251k0;
                if (drawable4 != drawable5) {
                    this.f25255m0 = drawable4;
                    androidx.core.widget.h.setCompoundDrawablesRelative(this.f25238e, compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], drawable5, compoundDrawablesRelative3[3]);
                } else {
                    z9 = z8;
                }
            } else {
                this.f25253l0 = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                androidx.core.widget.h.setCompoundDrawablesRelative(this.f25238e, compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.f25251k0, compoundDrawablesRelative3[3]);
            }
        } else {
            if (this.f25251k0 == null) {
                return z8;
            }
            Drawable[] compoundDrawablesRelative4 = androidx.core.widget.h.getCompoundDrawablesRelative(this.f25238e);
            if (compoundDrawablesRelative4[2] == this.f25251k0) {
                androidx.core.widget.h.setCompoundDrawablesRelative(this.f25238e, compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.f25255m0, compoundDrawablesRelative4[3]);
            } else {
                z9 = z8;
            }
            this.f25251k0 = null;
        }
        return z9;
    }

    private void i() {
        if (this.f25202C == null) {
            return;
        }
        if (v()) {
            this.f25202C.setFillColor(ColorStateList.valueOf(this.f25217K));
        }
        invalidate();
    }

    private void j(RectF rectF) {
        float f8 = rectF.left;
        int i8 = this.f25206E;
        rectF.left = f8 - i8;
        rectF.top -= i8;
        rectF.right += i8;
        rectF.bottom += i8;
    }

    private boolean j0() {
        int iMax;
        if (this.f25238e == null || this.f25238e.getMeasuredHeight() >= (iMax = Math.max(this.f25234c.getMeasuredHeight(), this.f25232b.getMeasuredHeight()))) {
            return false;
        }
        this.f25238e.setMinimumHeight(iMax);
        return true;
    }

    private void k() {
        l(this.f25239e0, this.f25245h0, this.f25243g0, this.f25249j0, this.f25247i0);
    }

    private void k0() {
        if (this.f25208F != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f25230a.getLayoutParams();
            int iT = t();
            if (iT != layoutParams.topMargin) {
                layoutParams.topMargin = iT;
                this.f25230a.requestLayout();
            }
        }
    }

    private void l(CheckableImageButton checkableImageButton, boolean z8, ColorStateList colorStateList, boolean z9, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null && (z8 || z9)) {
            drawable = androidx.core.graphics.drawable.a.wrap(drawable).mutate();
            if (z8) {
                androidx.core.graphics.drawable.a.setTintList(drawable, colorStateList);
            }
            if (z9) {
                androidx.core.graphics.drawable.a.setTintMode(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    private void m() {
        l(this.f25223Q, this.f25225S, this.f25224R, this.f25227U, this.f25226T);
    }

    private void m0(boolean z8, boolean z9) {
        ColorStateList colorStateList;
        TextView textView;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f25238e;
        boolean z10 = false;
        boolean z11 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f25238e;
        if (editText2 != null && editText2.hasFocus()) {
            z10 = true;
        }
        boolean zK = this.f25242g.k();
        ColorStateList colorStateList2 = this.f25265r0;
        if (colorStateList2 != null) {
            this.f25205D0.setCollapsedTextColor(colorStateList2);
            this.f25205D0.setExpandedTextColor(this.f25265r0);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.f25265r0;
            int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f25201B0) : this.f25201B0;
            this.f25205D0.setCollapsedTextColor(ColorStateList.valueOf(colorForState));
            this.f25205D0.setExpandedTextColor(ColorStateList.valueOf(colorForState));
        } else if (zK) {
            this.f25205D0.setCollapsedTextColor(this.f25242g.p());
        } else if (this.f25248j && (textView = this.f25250k) != null) {
            this.f25205D0.setCollapsedTextColor(textView.getTextColors());
        } else if (z10 && (colorStateList = this.f25267s0) != null) {
            this.f25205D0.setCollapsedTextColor(colorStateList);
        }
        if (z11 || !this.f25207E0 || (isEnabled() && z10)) {
            if (z9 || this.f25203C0) {
                x(z8);
                return;
            }
            return;
        }
        if (z9 || !this.f25203C0) {
            D(z8);
        }
    }

    private void n() {
        int i8 = this.f25208F;
        if (i8 == 0) {
            this.f25200B = null;
            this.f25202C = null;
            return;
        }
        if (i8 == 1) {
            this.f25200B = new a3.g(this.f25204D);
            this.f25202C = new a3.g();
        } else {
            if (i8 != 2) {
                throw new IllegalArgumentException(this.f25208F + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.f25278y || (this.f25200B instanceof com.google.android.material.textfield.c)) {
                this.f25200B = new a3.g(this.f25204D);
            } else {
                this.f25200B = new com.google.android.material.textfield.c(this.f25204D);
            }
            this.f25202C = null;
        }
    }

    private void n0() {
        EditText editText;
        if (this.f25260p == null || (editText = this.f25238e) == null) {
            return;
        }
        this.f25260p.setGravity(editText.getGravity());
        this.f25260p.setPadding(this.f25238e.getCompoundPaddingLeft(), this.f25238e.getCompoundPaddingTop(), this.f25238e.getCompoundPaddingRight(), this.f25238e.getCompoundPaddingBottom());
    }

    private int o() {
        return this.f25208F == 1 ? Q2.a.layer(Q2.a.getColor(this, J2.b.colorSurface, 0), this.f25218L) : this.f25218L;
    }

    private void o0() {
        EditText editText = this.f25238e;
        p0(editText == null ? 0 : editText.getText().length());
    }

    private Rect p(Rect rect) {
        if (this.f25238e == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.f25220N;
        boolean z8 = AbstractC0985p0.getLayoutDirection(this) == 1;
        rect2.bottom = rect.bottom;
        int i8 = this.f25208F;
        if (i8 == 1) {
            rect2.left = E(rect.left, z8);
            rect2.top = rect.top + this.f25210G;
            rect2.right = F(rect.right, z8);
            return rect2;
        }
        if (i8 != 2) {
            rect2.left = E(rect.left, z8);
            rect2.top = getPaddingTop();
            rect2.right = F(rect.right, z8);
            return rect2;
        }
        rect2.left = rect.left + this.f25238e.getPaddingLeft();
        rect2.top = rect.top - t();
        rect2.right = rect.right - this.f25238e.getPaddingRight();
        return rect2;
    }

    public void p0(int i8) {
        if (i8 != 0 || this.f25203C0) {
            H();
        } else {
            Z();
        }
    }

    private int q(Rect rect, Rect rect2, float f8) {
        return K() ? (int) (rect2.top + f8) : rect.bottom - this.f25238e.getCompoundPaddingBottom();
    }

    private void q0() {
        if (this.f25238e == null) {
            return;
        }
        AbstractC0985p0.setPaddingRelative(this.f25272v, isStartIconVisible() ? 0 : AbstractC0985p0.getPaddingStart(this.f25238e), this.f25238e.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(J2.d.material_input_text_to_prefix_suffix_padding), this.f25238e.getCompoundPaddingBottom());
    }

    private int r(Rect rect, float f8) {
        return K() ? (int) (rect.centerY() - (f8 / 2.0f)) : rect.top + this.f25238e.getCompoundPaddingTop();
    }

    private void r0() {
        this.f25272v.setVisibility((this.f25270u == null || J()) ? 8 : 0);
        h0();
    }

    private Rect s(Rect rect) {
        if (this.f25238e == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.f25220N;
        float expandedTextHeight = this.f25205D0.getExpandedTextHeight();
        rect2.left = rect.left + this.f25238e.getCompoundPaddingLeft();
        rect2.top = r(rect, expandedTextHeight);
        rect2.right = rect.right - this.f25238e.getCompoundPaddingRight();
        rect2.bottom = q(rect, rect2, expandedTextHeight);
        return rect2;
    }

    private void s0(boolean z8, boolean z9) {
        int defaultColor = this.f25275w0.getDefaultColor();
        int colorForState = this.f25275w0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f25275w0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z8) {
            this.f25217K = colorForState2;
        } else if (z9) {
            this.f25217K = colorForState;
        } else {
            this.f25217K = defaultColor;
        }
    }

    private void setEditText(EditText editText) {
        if (this.f25238e != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (this.f25235c0 != 3) {
            boolean z8 = editText instanceof TextInputEditText;
        }
        this.f25238e = editText;
        M();
        setTextInputAccessibilityDelegate(new e(this));
        this.f25205D0.setTypefaces(this.f25238e.getTypeface());
        this.f25205D0.setExpandedTextSize(this.f25238e.getTextSize());
        int gravity = this.f25238e.getGravity();
        this.f25205D0.setCollapsedTextGravity((gravity & (-113)) | 48);
        this.f25205D0.setExpandedTextGravity(gravity);
        this.f25238e.addTextChangedListener(new a());
        if (this.f25265r0 == null) {
            this.f25265r0 = this.f25238e.getHintTextColors();
        }
        if (this.f25278y) {
            if (TextUtils.isEmpty(this.f25280z)) {
                CharSequence hint = this.f25238e.getHint();
                this.f25240f = hint;
                setHint(hint);
                this.f25238e.setHint((CharSequence) null);
            }
            this.f25198A = true;
        }
        if (this.f25250k != null) {
            e0(this.f25238e.getText().length());
        }
        i0();
        this.f25242g.e();
        this.f25232b.bringToFront();
        this.f25234c.bringToFront();
        this.f25236d.bringToFront();
        this.f25261p0.bringToFront();
        z();
        q0();
        t0();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        m0(false, true);
    }

    private void setErrorIconVisible(boolean z8) {
        this.f25261p0.setVisibility(z8 ? 0 : 8);
        this.f25236d.setVisibility(z8 ? 8 : 0);
        t0();
        if (G()) {
            return;
        }
        h0();
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f25280z)) {
            return;
        }
        this.f25280z = charSequence;
        this.f25205D0.setText(charSequence);
        if (this.f25203C0) {
            return;
        }
        N();
    }

    private void setPlaceholderTextEnabled(boolean z8) {
        if (this.f25258o == z8) {
            return;
        }
        if (z8) {
            J j8 = new J(getContext());
            this.f25260p = j8;
            j8.setId(J2.f.textinput_placeholder);
            AbstractC0985p0.setAccessibilityLiveRegion(this.f25260p, 1);
            setPlaceholderTextAppearance(this.f25264r);
            setPlaceholderTextColor(this.f25262q);
            e();
        } else {
            Q();
            this.f25260p = null;
        }
        this.f25258o = z8;
    }

    private int t() {
        float collapsedTextHeight;
        if (!this.f25278y) {
            return 0;
        }
        int i8 = this.f25208F;
        if (i8 == 0 || i8 == 1) {
            collapsedTextHeight = this.f25205D0.getCollapsedTextHeight();
        } else {
            if (i8 != 2) {
                return 0;
            }
            collapsedTextHeight = this.f25205D0.getCollapsedTextHeight() / 2.0f;
        }
        return (int) collapsedTextHeight;
    }

    private void t0() {
        if (this.f25238e == null) {
            return;
        }
        AbstractC0985p0.setPaddingRelative(this.f25276x, getContext().getResources().getDimensionPixelSize(J2.d.material_input_text_to_prefix_suffix_padding), this.f25238e.getPaddingTop(), (isEndIconVisible() || I()) ? 0 : AbstractC0985p0.getPaddingEnd(this.f25238e), this.f25238e.getPaddingBottom());
    }

    private boolean u() {
        return this.f25208F == 2 && v();
    }

    private void u0() {
        int visibility = this.f25276x.getVisibility();
        boolean z8 = (this.f25274w == null || J()) ? false : true;
        this.f25276x.setVisibility(z8 ? 0 : 8);
        if (visibility != this.f25276x.getVisibility()) {
            getEndIconDelegate().c(z8);
        }
        h0();
    }

    private boolean v() {
        return this.f25212H > -1 && this.f25217K != 0;
    }

    private void w() {
        if (y()) {
            ((com.google.android.material.textfield.c) this.f25200B).G();
        }
    }

    private void x(boolean z8) {
        ValueAnimator valueAnimator = this.f25211G0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f25211G0.cancel();
        }
        if (z8 && this.f25209F0) {
            g(1.0f);
        } else {
            this.f25205D0.setExpansionFraction(1.0f);
        }
        this.f25203C0 = false;
        if (y()) {
            N();
        }
        o0();
        r0();
        u0();
    }

    private boolean y() {
        return this.f25278y && !TextUtils.isEmpty(this.f25280z) && (this.f25200B instanceof com.google.android.material.textfield.c);
    }

    private void z() {
        Iterator it = this.f25233b0.iterator();
        while (it.hasNext()) {
            ((f) it.next()).onEditTextAttached(this);
        }
    }

    final boolean J() {
        return this.f25203C0;
    }

    void V(TextView textView, int i8) {
        try {
            androidx.core.widget.h.setTextAppearance(textView, i8);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        androidx.core.widget.h.setTextAppearance(textView, J2.k.TextAppearance_AppCompat_Caption);
        textView.setTextColor(androidx.core.content.a.getColor(getContext(), J2.c.design_error));
    }

    public void addOnEditTextAttachedListener(f fVar) {
        this.f25233b0.add(fVar);
        if (this.f25238e != null) {
            fVar.onEditTextAttached(this);
        }
    }

    public void addOnEndIconChangedListener(g gVar) {
        this.f25241f0.add(gVar);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i8, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i8, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        this.f25230a.addView(view, layoutParams2);
        this.f25230a.setLayoutParams(layoutParams);
        k0();
        setEditText((EditText) view);
    }

    public void clearOnEditTextAttachedListeners() {
        this.f25233b0.clear();
    }

    public void clearOnEndIconChangedListeners() {
        this.f25241f0.clear();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i8) {
        EditText editText = this.f25238e;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i8);
            return;
        }
        if (this.f25240f != null) {
            boolean z8 = this.f25198A;
            this.f25198A = false;
            CharSequence hint = editText.getHint();
            this.f25238e.setHint(this.f25240f);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i8);
                return;
            } finally {
                this.f25238e.setHint(hint);
                this.f25198A = z8;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i8);
        onProvideAutofillVirtualStructure(viewStructure, i8);
        viewStructure.setChildCount(this.f25230a.getChildCount());
        for (int i9 = 0; i9 < this.f25230a.getChildCount(); i9++) {
            View childAt = this.f25230a.getChildAt(i9);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i9);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i8);
            if (childAt == this.f25238e) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f25215I0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f25215I0 = false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        C(canvas);
        B(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.f25213H0) {
            return;
        }
        this.f25213H0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        com.google.android.material.internal.a aVar = this.f25205D0;
        boolean state = aVar != null ? aVar.setState(drawableState) : false;
        if (this.f25238e != null) {
            l0(AbstractC0985p0.isLaidOut(this) && isEnabled());
        }
        i0();
        v0();
        if (state) {
            invalidate();
        }
        this.f25213H0 = false;
    }

    void e0(int i8) {
        boolean z8 = this.f25248j;
        int i9 = this.f25246i;
        if (i9 == -1) {
            this.f25250k.setText(String.valueOf(i8));
            this.f25250k.setContentDescription(null);
            this.f25248j = false;
        } else {
            this.f25248j = i8 > i9;
            f0(getContext(), this.f25250k, i8, this.f25246i, this.f25248j);
            if (z8 != this.f25248j) {
                g0();
            }
            this.f25250k.setText(androidx.core.text.a.getInstance().unicodeWrap(getContext().getString(J2.j.character_counter_pattern, Integer.valueOf(i8), Integer.valueOf(this.f25246i))));
        }
        if (this.f25238e == null || z8 == this.f25248j) {
            return;
        }
        l0(false);
        v0();
        i0();
    }

    void g(float f8) {
        if (this.f25205D0.getExpansionFraction() == f8) {
            return;
        }
        if (this.f25211G0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f25211G0 = valueAnimator;
            valueAnimator.setInterpolator(K2.a.FAST_OUT_SLOW_IN_INTERPOLATOR);
            this.f25211G0.setDuration(167L);
            this.f25211G0.addUpdateListener(new d());
        }
        this.f25211G0.setFloatValues(this.f25205D0.getExpansionFraction(), f8);
        this.f25211G0.start();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f25238e;
        return editText != null ? editText.getBaseline() + getPaddingTop() + t() : super.getBaseline();
    }

    a3.g getBoxBackground() {
        int i8 = this.f25208F;
        if (i8 == 1 || i8 == 2) {
            return this.f25200B;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f25218L;
    }

    public int getBoxBackgroundMode() {
        return this.f25208F;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return this.f25200B.getBottomLeftCornerResolvedSize();
    }

    public float getBoxCornerRadiusBottomStart() {
        return this.f25200B.getBottomRightCornerResolvedSize();
    }

    public float getBoxCornerRadiusTopEnd() {
        return this.f25200B.getTopRightCornerResolvedSize();
    }

    public float getBoxCornerRadiusTopStart() {
        return this.f25200B.getTopLeftCornerResolvedSize();
    }

    public int getBoxStrokeColor() {
        return this.f25273v0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f25275w0;
    }

    public int getBoxStrokeWidth() {
        return this.f25214I;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f25216J;
    }

    public int getCounterMaxLength() {
        return this.f25246i;
    }

    CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.f25244h && this.f25248j && (textView = this.f25250k) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f25266s;
    }

    public ColorStateList getCounterTextColor() {
        return this.f25266s;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f25265r0;
    }

    public EditText getEditText() {
        return this.f25238e;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f25239e0.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f25239e0.getDrawable();
    }

    public int getEndIconMode() {
        return this.f25235c0;
    }

    CheckableImageButton getEndIconView() {
        return this.f25239e0;
    }

    public CharSequence getError() {
        if (this.f25242g.x()) {
            return this.f25242g.n();
        }
        return null;
    }

    public CharSequence getErrorContentDescription() {
        return this.f25242g.m();
    }

    public int getErrorCurrentTextColors() {
        return this.f25242g.o();
    }

    public Drawable getErrorIconDrawable() {
        return this.f25261p0.getDrawable();
    }

    final int getErrorTextCurrentColor() {
        return this.f25242g.o();
    }

    public CharSequence getHelperText() {
        if (this.f25242g.y()) {
            return this.f25242g.q();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.f25242g.r();
    }

    public CharSequence getHint() {
        if (this.f25278y) {
            return this.f25280z;
        }
        return null;
    }

    final float getHintCollapsedTextHeight() {
        return this.f25205D0.getCollapsedTextHeight();
    }

    final int getHintCurrentCollapsedTextColor() {
        return this.f25205D0.getCurrentCollapsedTextColor();
    }

    public ColorStateList getHintTextColor() {
        return this.f25267s0;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f25239e0.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f25239e0.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f25258o) {
            return this.f25256n;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f25264r;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f25262q;
    }

    public CharSequence getPrefixText() {
        return this.f25270u;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f25272v.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f25272v;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f25223Q.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f25223Q.getDrawable();
    }

    public CharSequence getSuffixText() {
        return this.f25274w;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f25276x.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f25276x;
    }

    public Typeface getTypeface() {
        return this.f25222P;
    }

    void i0() {
        Drawable background;
        TextView textView;
        EditText editText = this.f25238e;
        if (editText == null || this.f25208F != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (W.canSafelyMutateDrawable(background)) {
            background = background.mutate();
        }
        if (this.f25242g.k()) {
            background.setColorFilter(C0850j.getPorterDuffColorFilter(this.f25242g.o(), PorterDuff.Mode.SRC_IN));
        } else if (this.f25248j && (textView = this.f25250k) != null) {
            background.setColorFilter(C0850j.getPorterDuffColorFilter(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            androidx.core.graphics.drawable.a.clearColorFilter(background);
            this.f25238e.refreshDrawableState();
        }
    }

    public boolean isCounterEnabled() {
        return this.f25244h;
    }

    public boolean isEndIconCheckable() {
        return this.f25239e0.isCheckable();
    }

    public boolean isEndIconVisible() {
        return this.f25236d.getVisibility() == 0 && this.f25239e0.getVisibility() == 0;
    }

    public boolean isErrorEnabled() {
        return this.f25242g.x();
    }

    public boolean isExpandedHintEnabled() {
        return this.f25207E0;
    }

    public boolean isHelperTextEnabled() {
        return this.f25242g.y();
    }

    public boolean isHintAnimationEnabled() {
        return this.f25209F0;
    }

    public boolean isHintEnabled() {
        return this.f25278y;
    }

    @Deprecated
    public boolean isPasswordVisibilityToggleEnabled() {
        return this.f25235c0 == 1;
    }

    public boolean isProvidingHint() {
        return this.f25198A;
    }

    public boolean isStartIconCheckable() {
        return this.f25223Q.isCheckable();
    }

    public boolean isStartIconVisible() {
        return this.f25223Q.getVisibility() == 0;
    }

    void l0(boolean z8) {
        m0(z8, false);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        super.onLayout(z8, i8, i9, i10, i11);
        EditText editText = this.f25238e;
        if (editText != null) {
            Rect rect = this.f25219M;
            com.google.android.material.internal.b.getDescendantRect(this, editText, rect);
            c0(rect);
            if (this.f25278y) {
                this.f25205D0.setExpandedTextSize(this.f25238e.getTextSize());
                int gravity = this.f25238e.getGravity();
                this.f25205D0.setCollapsedTextGravity((gravity & (-113)) | 48);
                this.f25205D0.setExpandedTextGravity(gravity);
                this.f25205D0.setCollapsedBounds(p(rect));
                this.f25205D0.setExpandedBounds(s(rect));
                this.f25205D0.recalculate();
                if (!y() || this.f25203C0) {
                    return;
                }
                N();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i8, int i9) {
        super.onMeasure(i8, i9);
        boolean zJ0 = j0();
        boolean zH0 = h0();
        if (zJ0 || zH0) {
            this.f25238e.post(new c());
        }
        n0();
        q0();
        t0();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.getSuperState());
        setError(hVar.f25287b);
        if (hVar.f25288c) {
            this.f25239e0.post(new b());
        }
        setHint(hVar.f25289d);
        setHelperText(hVar.f25290e);
        setPlaceholderText(hVar.f25291f);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        h hVar = new h(super.onSaveInstanceState());
        if (this.f25242g.k()) {
            hVar.f25287b = getError();
        }
        hVar.f25288c = G() && this.f25239e0.isChecked();
        hVar.f25289d = getHint();
        hVar.f25290e = getHelperText();
        hVar.f25291f = getPlaceholderText();
        return hVar;
    }

    @Deprecated
    public void passwordVisibilityToggleRequested(boolean z8) {
        if (this.f25235c0 == 1) {
            this.f25239e0.performClick();
            if (z8) {
                this.f25239e0.jumpDrawablesToCurrentState();
            }
        }
    }

    public void refreshEndIconDrawableState() {
        P(this.f25239e0, this.f25243g0);
    }

    public void refreshErrorIconDrawableState() {
        P(this.f25261p0, this.f25263q0);
    }

    public void refreshStartIconDrawableState() {
        P(this.f25223Q, this.f25224R);
    }

    public void removeOnEditTextAttachedListener(f fVar) {
        this.f25233b0.remove(fVar);
    }

    public void removeOnEndIconChangedListener(g gVar) {
        this.f25241f0.remove(gVar);
    }

    public void setBoxBackgroundColor(int i8) {
        if (this.f25218L != i8) {
            this.f25218L = i8;
            this.f25277x0 = i8;
            this.f25281z0 = i8;
            this.f25199A0 = i8;
            h();
        }
    }

    public void setBoxBackgroundColorResource(int i8) {
        setBoxBackgroundColor(androidx.core.content.a.getColor(getContext(), i8));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f25277x0 = defaultColor;
        this.f25218L = defaultColor;
        this.f25279y0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f25281z0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f25199A0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        h();
    }

    public void setBoxBackgroundMode(int i8) {
        if (i8 == this.f25208F) {
            return;
        }
        this.f25208F = i8;
        if (this.f25238e != null) {
            M();
        }
    }

    public void setBoxCornerRadii(float f8, float f9, float f10, float f11) {
        a3.g gVar = this.f25200B;
        if (gVar != null && gVar.getTopLeftCornerResolvedSize() == f8 && this.f25200B.getTopRightCornerResolvedSize() == f9 && this.f25200B.getBottomRightCornerResolvedSize() == f11 && this.f25200B.getBottomLeftCornerResolvedSize() == f10) {
            return;
        }
        this.f25204D = this.f25204D.toBuilder().setTopLeftCornerSize(f8).setTopRightCornerSize(f9).setBottomRightCornerSize(f11).setBottomLeftCornerSize(f10).build();
        h();
    }

    public void setBoxCornerRadiiResources(int i8, int i9, int i10, int i11) {
        setBoxCornerRadii(getContext().getResources().getDimension(i8), getContext().getResources().getDimension(i9), getContext().getResources().getDimension(i11), getContext().getResources().getDimension(i10));
    }

    public void setBoxStrokeColor(int i8) {
        if (this.f25273v0 != i8) {
            this.f25273v0 = i8;
            v0();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f25269t0 = colorStateList.getDefaultColor();
            this.f25201B0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f25271u0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f25273v0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f25273v0 != colorStateList.getDefaultColor()) {
            this.f25273v0 = colorStateList.getDefaultColor();
        }
        v0();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f25275w0 != colorStateList) {
            this.f25275w0 = colorStateList;
            v0();
        }
    }

    public void setBoxStrokeWidth(int i8) {
        this.f25214I = i8;
        v0();
    }

    public void setBoxStrokeWidthFocused(int i8) {
        this.f25216J = i8;
        v0();
    }

    public void setBoxStrokeWidthFocusedResource(int i8) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i8));
    }

    public void setBoxStrokeWidthResource(int i8) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i8));
    }

    public void setCounterEnabled(boolean z8) {
        if (this.f25244h != z8) {
            if (z8) {
                J j8 = new J(getContext());
                this.f25250k = j8;
                j8.setId(J2.f.textinput_counter);
                Typeface typeface = this.f25222P;
                if (typeface != null) {
                    this.f25250k.setTypeface(typeface);
                }
                this.f25250k.setMaxLines(1);
                this.f25242g.d(this.f25250k, 2);
                F.setMarginStart((ViewGroup.MarginLayoutParams) this.f25250k.getLayoutParams(), getResources().getDimensionPixelOffset(J2.d.mtrl_textinput_counter_margin_start));
                g0();
                d0();
            } else {
                this.f25242g.z(this.f25250k, 2);
                this.f25250k = null;
            }
            this.f25244h = z8;
        }
    }

    public void setCounterMaxLength(int i8) {
        if (this.f25246i != i8) {
            if (i8 > 0) {
                this.f25246i = i8;
            } else {
                this.f25246i = -1;
            }
            if (this.f25244h) {
                d0();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i8) {
        if (this.f25252l != i8) {
            this.f25252l = i8;
            g0();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f25268t != colorStateList) {
            this.f25268t = colorStateList;
            g0();
        }
    }

    public void setCounterTextAppearance(int i8) {
        if (this.f25254m != i8) {
            this.f25254m = i8;
            g0();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f25266s != colorStateList) {
            this.f25266s = colorStateList;
            g0();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f25265r0 = colorStateList;
        this.f25267s0 = colorStateList;
        if (this.f25238e != null) {
            l0(false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z8) {
        O(this, z8);
        super.setEnabled(z8);
    }

    public void setEndIconActivated(boolean z8) {
        this.f25239e0.setActivated(z8);
    }

    public void setEndIconCheckable(boolean z8) {
        this.f25239e0.setCheckable(z8);
    }

    public void setEndIconContentDescription(int i8) {
        setEndIconContentDescription(i8 != 0 ? getResources().getText(i8) : null);
    }

    public void setEndIconDrawable(int i8) {
        setEndIconDrawable(i8 != 0 ? AbstractC5638a.getDrawable(getContext(), i8) : null);
    }

    public void setEndIconMode(int i8) {
        int i9 = this.f25235c0;
        this.f25235c0 = i8;
        A(i9);
        setEndIconVisible(i8 != 0);
        if (getEndIconDelegate().b(this.f25208F)) {
            getEndIconDelegate().a();
            k();
            return;
        }
        throw new IllegalStateException("The current box background mode " + this.f25208F + " is not supported by the end icon mode " + i8);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        T(this.f25239e0, onClickListener, this.f25257n0);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f25257n0 = onLongClickListener;
        U(this.f25239e0, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.f25243g0 != colorStateList) {
            this.f25243g0 = colorStateList;
            this.f25245h0 = true;
            k();
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.f25247i0 != mode) {
            this.f25247i0 = mode;
            this.f25249j0 = true;
            k();
        }
    }

    public void setEndIconVisible(boolean z8) {
        if (isEndIconVisible() != z8) {
            this.f25239e0.setVisibility(z8 ? 0 : 8);
            t0();
            h0();
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.f25242g.x()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.f25242g.t();
        } else {
            this.f25242g.M(charSequence);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.f25242g.B(charSequence);
    }

    public void setErrorEnabled(boolean z8) {
        this.f25242g.C(z8);
    }

    public void setErrorIconDrawable(int i8) {
        setErrorIconDrawable(i8 != 0 ? AbstractC5638a.getDrawable(getContext(), i8) : null);
        refreshErrorIconDrawableState();
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        T(this.f25261p0, onClickListener, this.f25259o0);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f25259o0 = onLongClickListener;
        U(this.f25261p0, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.f25263q0 = colorStateList;
        Drawable drawable = this.f25261p0.getDrawable();
        if (drawable != null) {
            drawable = androidx.core.graphics.drawable.a.wrap(drawable).mutate();
            androidx.core.graphics.drawable.a.setTintList(drawable, colorStateList);
        }
        if (this.f25261p0.getDrawable() != drawable) {
            this.f25261p0.setImageDrawable(drawable);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f25261p0.getDrawable();
        if (drawable != null) {
            drawable = androidx.core.graphics.drawable.a.wrap(drawable).mutate();
            androidx.core.graphics.drawable.a.setTintMode(drawable, mode);
        }
        if (this.f25261p0.getDrawable() != drawable) {
            this.f25261p0.setImageDrawable(drawable);
        }
    }

    public void setErrorTextAppearance(int i8) {
        this.f25242g.D(i8);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.f25242g.E(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z8) {
        if (this.f25207E0 != z8) {
            this.f25207E0 = z8;
            l0(false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (isHelperTextEnabled()) {
                setHelperTextEnabled(false);
            }
        } else {
            if (!isHelperTextEnabled()) {
                setHelperTextEnabled(true);
            }
            this.f25242g.N(charSequence);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.f25242g.H(colorStateList);
    }

    public void setHelperTextEnabled(boolean z8) {
        this.f25242g.G(z8);
    }

    public void setHelperTextTextAppearance(int i8) {
        this.f25242g.F(i8);
    }

    public void setHint(CharSequence charSequence) {
        if (this.f25278y) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z8) {
        this.f25209F0 = z8;
    }

    public void setHintEnabled(boolean z8) {
        if (z8 != this.f25278y) {
            this.f25278y = z8;
            if (z8) {
                CharSequence hint = this.f25238e.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f25280z)) {
                        setHint(hint);
                    }
                    this.f25238e.setHint((CharSequence) null);
                }
                this.f25198A = true;
            } else {
                this.f25198A = false;
                if (!TextUtils.isEmpty(this.f25280z) && TextUtils.isEmpty(this.f25238e.getHint())) {
                    this.f25238e.setHint(this.f25280z);
                }
                setHintInternal(null);
            }
            if (this.f25238e != null) {
                k0();
            }
        }
    }

    public void setHintTextAppearance(int i8) {
        this.f25205D0.setCollapsedTextAppearance(i8);
        this.f25267s0 = this.f25205D0.getCollapsedTextColor();
        if (this.f25238e != null) {
            l0(false);
            k0();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f25267s0 != colorStateList) {
            if (this.f25265r0 == null) {
                this.f25205D0.setCollapsedTextColor(colorStateList);
            }
            this.f25267s0 = colorStateList;
            if (this.f25238e != null) {
                l0(false);
            }
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i8) {
        setPasswordVisibilityToggleContentDescription(i8 != 0 ? getResources().getText(i8) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i8) {
        setPasswordVisibilityToggleDrawable(i8 != 0 ? AbstractC5638a.getDrawable(getContext(), i8) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z8) {
        if (z8 && this.f25235c0 != 1) {
            setEndIconMode(1);
        } else {
            if (z8) {
                return;
            }
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f25243g0 = colorStateList;
        this.f25245h0 = true;
        k();
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f25247i0 = mode;
        this.f25249j0 = true;
        k();
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f25258o && TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f25258o) {
                setPlaceholderTextEnabled(true);
            }
            this.f25256n = charSequence;
        }
        o0();
    }

    public void setPlaceholderTextAppearance(int i8) {
        this.f25264r = i8;
        TextView textView = this.f25260p;
        if (textView != null) {
            androidx.core.widget.h.setTextAppearance(textView, i8);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f25262q != colorStateList) {
            this.f25262q = colorStateList;
            TextView textView = this.f25260p;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.f25270u = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f25272v.setText(charSequence);
        r0();
    }

    public void setPrefixTextAppearance(int i8) {
        androidx.core.widget.h.setTextAppearance(this.f25272v, i8);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f25272v.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z8) {
        this.f25223Q.setCheckable(z8);
    }

    public void setStartIconContentDescription(int i8) {
        setStartIconContentDescription(i8 != 0 ? getResources().getText(i8) : null);
    }

    public void setStartIconDrawable(int i8) {
        setStartIconDrawable(i8 != 0 ? AbstractC5638a.getDrawable(getContext(), i8) : null);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        T(this.f25223Q, onClickListener, this.f25231a0);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f25231a0 = onLongClickListener;
        U(this.f25223Q, onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        if (this.f25224R != colorStateList) {
            this.f25224R = colorStateList;
            this.f25225S = true;
            m();
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        if (this.f25226T != mode) {
            this.f25226T = mode;
            this.f25227U = true;
            m();
        }
    }

    public void setStartIconVisible(boolean z8) {
        if (isStartIconVisible() != z8) {
            this.f25223Q.setVisibility(z8 ? 0 : 8);
            q0();
            h0();
        }
    }

    public void setSuffixText(CharSequence charSequence) {
        this.f25274w = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f25276x.setText(charSequence);
        u0();
    }

    public void setSuffixTextAppearance(int i8) {
        androidx.core.widget.h.setTextAppearance(this.f25276x, i8);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f25276x.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(e eVar) {
        EditText editText = this.f25238e;
        if (editText != null) {
            AbstractC0985p0.setAccessibilityDelegate(editText, eVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f25222P) {
            this.f25222P = typeface;
            this.f25205D0.setTypefaces(typeface);
            this.f25242g.J(typeface);
            TextView textView = this.f25250k;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    void v0() {
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.f25200B == null || this.f25208F == 0) {
            return;
        }
        boolean z8 = false;
        boolean z9 = isFocused() || ((editText2 = this.f25238e) != null && editText2.hasFocus());
        boolean z10 = isHovered() || ((editText = this.f25238e) != null && editText.isHovered());
        if (!isEnabled()) {
            this.f25217K = this.f25201B0;
        } else if (this.f25242g.k()) {
            if (this.f25275w0 != null) {
                s0(z9, z10);
            } else {
                this.f25217K = this.f25242g.o();
            }
        } else if (!this.f25248j || (textView = this.f25250k) == null) {
            if (z9) {
                this.f25217K = this.f25273v0;
            } else if (z10) {
                this.f25217K = this.f25271u0;
            } else {
                this.f25217K = this.f25269t0;
            }
        } else if (this.f25275w0 != null) {
            s0(z9, z10);
        } else {
            this.f25217K = textView.getCurrentTextColor();
        }
        if (getErrorIconDrawable() != null && this.f25242g.x() && this.f25242g.k()) {
            z8 = true;
        }
        setErrorIconVisible(z8);
        refreshErrorIconDrawableState();
        refreshStartIconDrawableState();
        refreshEndIconDrawableState();
        if (getEndIconDelegate().d()) {
            a0(this.f25242g.k());
        }
        if (z9 && isEnabled()) {
            this.f25212H = this.f25216J;
        } else {
            this.f25212H = this.f25214I;
        }
        if (this.f25208F == 1) {
            if (!isEnabled()) {
                this.f25218L = this.f25279y0;
            } else if (z10 && !z9) {
                this.f25218L = this.f25199A0;
            } else if (z9) {
                this.f25218L = this.f25281z0;
            } else {
                this.f25218L = this.f25277x0;
            }
        }
        h();
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, J2.b.textInputStyle);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.f25239e0.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.f25239e0.setImageDrawable(drawable);
        refreshEndIconDrawableState();
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.f25223Q.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f25223Q.setImageDrawable(drawable);
        if (drawable != null) {
            setStartIconVisible(true);
            refreshStartIconDrawableState();
        } else {
            setStartIconVisible(false);
            setStartIconOnClickListener(null);
            setStartIconOnLongClickListener(null);
            setStartIconContentDescription((CharSequence) null);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v40 */
    public TextInputLayout(Context context, AttributeSet attributeSet, int i8) {
        int i9;
        ?? r32;
        int i10 = f25197J0;
        super(AbstractC1090a.wrap(context, attributeSet, i8, i10), attributeSet, i8);
        this.f25242g = new com.google.android.material.textfield.f(this);
        this.f25219M = new Rect();
        this.f25220N = new Rect();
        this.f25221O = new RectF();
        this.f25233b0 = new LinkedHashSet();
        this.f25235c0 = 0;
        SparseArray sparseArray = new SparseArray();
        this.f25237d0 = sparseArray;
        this.f25241f0 = new LinkedHashSet();
        com.google.android.material.internal.a aVar = new com.google.android.material.internal.a(this);
        this.f25205D0 = aVar;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f25230a = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        addView(frameLayout);
        LinearLayout linearLayout = new LinearLayout(context2);
        this.f25232b = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -1, A.START));
        frameLayout.addView(linearLayout);
        LinearLayout linearLayout2 = new LinearLayout(context2);
        this.f25234c = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setLayoutParams(new FrameLayout.LayoutParams(-2, -1, A.END));
        frameLayout.addView(linearLayout2);
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.f25236d = frameLayout2;
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        TimeInterpolator timeInterpolator = K2.a.LINEAR_INTERPOLATOR;
        aVar.setTextSizeInterpolator(timeInterpolator);
        aVar.setPositionInterpolator(timeInterpolator);
        aVar.setCollapsedTextGravity(L2.a.TOP_START);
        r0 r0VarObtainTintedStyledAttributes = com.google.android.material.internal.k.obtainTintedStyledAttributes(context2, attributeSet, J2.l.TextInputLayout, i8, i10, J2.l.TextInputLayout_counterTextAppearance, J2.l.TextInputLayout_counterOverflowTextAppearance, J2.l.TextInputLayout_errorTextAppearance, J2.l.TextInputLayout_helperTextTextAppearance, J2.l.TextInputLayout_hintTextAppearance);
        this.f25278y = r0VarObtainTintedStyledAttributes.getBoolean(J2.l.TextInputLayout_hintEnabled, true);
        setHint(r0VarObtainTintedStyledAttributes.getText(J2.l.TextInputLayout_android_hint));
        this.f25209F0 = r0VarObtainTintedStyledAttributes.getBoolean(J2.l.TextInputLayout_hintAnimationEnabled, true);
        this.f25207E0 = r0VarObtainTintedStyledAttributes.getBoolean(J2.l.TextInputLayout_expandedHintEnabled, true);
        this.f25204D = a3.k.builder(context2, attributeSet, i8, i10).build();
        this.f25206E = context2.getResources().getDimensionPixelOffset(J2.d.mtrl_textinput_box_label_cutout_padding);
        this.f25210G = r0VarObtainTintedStyledAttributes.getDimensionPixelOffset(J2.l.TextInputLayout_boxCollapsedPaddingTop, 0);
        this.f25214I = r0VarObtainTintedStyledAttributes.getDimensionPixelSize(J2.l.TextInputLayout_boxStrokeWidth, context2.getResources().getDimensionPixelSize(J2.d.mtrl_textinput_box_stroke_width_default));
        this.f25216J = r0VarObtainTintedStyledAttributes.getDimensionPixelSize(J2.l.TextInputLayout_boxStrokeWidthFocused, context2.getResources().getDimensionPixelSize(J2.d.mtrl_textinput_box_stroke_width_focused));
        this.f25212H = this.f25214I;
        float dimension = r0VarObtainTintedStyledAttributes.getDimension(J2.l.TextInputLayout_boxCornerRadiusTopStart, -1.0f);
        float dimension2 = r0VarObtainTintedStyledAttributes.getDimension(J2.l.TextInputLayout_boxCornerRadiusTopEnd, -1.0f);
        float dimension3 = r0VarObtainTintedStyledAttributes.getDimension(J2.l.TextInputLayout_boxCornerRadiusBottomEnd, -1.0f);
        float dimension4 = r0VarObtainTintedStyledAttributes.getDimension(J2.l.TextInputLayout_boxCornerRadiusBottomStart, -1.0f);
        k.b builder = this.f25204D.toBuilder();
        if (dimension >= 0.0f) {
            builder.setTopLeftCornerSize(dimension);
        }
        if (dimension2 >= 0.0f) {
            builder.setTopRightCornerSize(dimension2);
        }
        if (dimension3 >= 0.0f) {
            builder.setBottomRightCornerSize(dimension3);
        }
        if (dimension4 >= 0.0f) {
            builder.setBottomLeftCornerSize(dimension4);
        }
        this.f25204D = builder.build();
        ColorStateList colorStateList = X2.c.getColorStateList(context2, r0VarObtainTintedStyledAttributes, J2.l.TextInputLayout_boxBackgroundColor);
        if (colorStateList != null) {
            int defaultColor = colorStateList.getDefaultColor();
            this.f25277x0 = defaultColor;
            this.f25218L = defaultColor;
            if (colorStateList.isStateful()) {
                i9 = -1;
                this.f25279y0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
                this.f25281z0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f25199A0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                i9 = -1;
                this.f25281z0 = this.f25277x0;
                ColorStateList colorStateList2 = AbstractC5638a.getColorStateList(context2, J2.c.mtrl_filled_background_color);
                this.f25279y0 = colorStateList2.getColorForState(new int[]{-16842910}, -1);
                this.f25199A0 = colorStateList2.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            i9 = -1;
            this.f25218L = 0;
            this.f25277x0 = 0;
            this.f25279y0 = 0;
            this.f25281z0 = 0;
            this.f25199A0 = 0;
        }
        if (r0VarObtainTintedStyledAttributes.hasValue(J2.l.TextInputLayout_android_textColorHint)) {
            ColorStateList colorStateList3 = r0VarObtainTintedStyledAttributes.getColorStateList(J2.l.TextInputLayout_android_textColorHint);
            this.f25267s0 = colorStateList3;
            this.f25265r0 = colorStateList3;
        }
        ColorStateList colorStateList4 = X2.c.getColorStateList(context2, r0VarObtainTintedStyledAttributes, J2.l.TextInputLayout_boxStrokeColor);
        this.f25273v0 = r0VarObtainTintedStyledAttributes.getColor(J2.l.TextInputLayout_boxStrokeColor, 0);
        this.f25269t0 = androidx.core.content.a.getColor(context2, J2.c.mtrl_textinput_default_box_stroke_color);
        this.f25201B0 = androidx.core.content.a.getColor(context2, J2.c.mtrl_textinput_disabled_color);
        this.f25271u0 = androidx.core.content.a.getColor(context2, J2.c.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateList4 != null) {
            setBoxStrokeColorStateList(colorStateList4);
        }
        if (r0VarObtainTintedStyledAttributes.hasValue(J2.l.TextInputLayout_boxStrokeErrorColor)) {
            setBoxStrokeErrorColor(X2.c.getColorStateList(context2, r0VarObtainTintedStyledAttributes, J2.l.TextInputLayout_boxStrokeErrorColor));
        }
        if (r0VarObtainTintedStyledAttributes.getResourceId(J2.l.TextInputLayout_hintTextAppearance, i9) != i9) {
            r32 = 0;
            setHintTextAppearance(r0VarObtainTintedStyledAttributes.getResourceId(J2.l.TextInputLayout_hintTextAppearance, 0));
        } else {
            r32 = 0;
        }
        int resourceId = r0VarObtainTintedStyledAttributes.getResourceId(J2.l.TextInputLayout_errorTextAppearance, r32);
        CharSequence text = r0VarObtainTintedStyledAttributes.getText(J2.l.TextInputLayout_errorContentDescription);
        boolean z8 = r0VarObtainTintedStyledAttributes.getBoolean(J2.l.TextInputLayout_errorEnabled, r32);
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(J2.h.design_text_input_end_icon, linearLayout2, (boolean) r32);
        this.f25261p0 = checkableImageButton;
        checkableImageButton.setId(J2.f.text_input_error_icon);
        checkableImageButton.setVisibility(8);
        if (X2.c.isFontScaleAtLeast1_3(context2)) {
            F.setMarginStart((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), r32);
        }
        if (r0VarObtainTintedStyledAttributes.hasValue(J2.l.TextInputLayout_errorIconDrawable)) {
            setErrorIconDrawable(r0VarObtainTintedStyledAttributes.getDrawable(J2.l.TextInputLayout_errorIconDrawable));
        }
        if (r0VarObtainTintedStyledAttributes.hasValue(J2.l.TextInputLayout_errorIconTint)) {
            setErrorIconTintList(X2.c.getColorStateList(context2, r0VarObtainTintedStyledAttributes, J2.l.TextInputLayout_errorIconTint));
        }
        if (r0VarObtainTintedStyledAttributes.hasValue(J2.l.TextInputLayout_errorIconTintMode)) {
            setErrorIconTintMode(o.parseTintMode(r0VarObtainTintedStyledAttributes.getInt(J2.l.TextInputLayout_errorIconTintMode, i9), null));
        }
        checkableImageButton.setContentDescription(getResources().getText(J2.j.error_icon_content_description));
        AbstractC0985p0.setImportantForAccessibility(checkableImageButton, 2);
        checkableImageButton.setClickable(false);
        checkableImageButton.setPressable(false);
        checkableImageButton.setFocusable(false);
        int resourceId2 = r0VarObtainTintedStyledAttributes.getResourceId(J2.l.TextInputLayout_helperTextTextAppearance, 0);
        boolean z9 = r0VarObtainTintedStyledAttributes.getBoolean(J2.l.TextInputLayout_helperTextEnabled, false);
        CharSequence text2 = r0VarObtainTintedStyledAttributes.getText(J2.l.TextInputLayout_helperText);
        int resourceId3 = r0VarObtainTintedStyledAttributes.getResourceId(J2.l.TextInputLayout_placeholderTextAppearance, 0);
        CharSequence text3 = r0VarObtainTintedStyledAttributes.getText(J2.l.TextInputLayout_placeholderText);
        int resourceId4 = r0VarObtainTintedStyledAttributes.getResourceId(J2.l.TextInputLayout_prefixTextAppearance, 0);
        CharSequence text4 = r0VarObtainTintedStyledAttributes.getText(J2.l.TextInputLayout_prefixText);
        int resourceId5 = r0VarObtainTintedStyledAttributes.getResourceId(J2.l.TextInputLayout_suffixTextAppearance, 0);
        CharSequence text5 = r0VarObtainTintedStyledAttributes.getText(J2.l.TextInputLayout_suffixText);
        boolean z10 = r0VarObtainTintedStyledAttributes.getBoolean(J2.l.TextInputLayout_counterEnabled, false);
        setCounterMaxLength(r0VarObtainTintedStyledAttributes.getInt(J2.l.TextInputLayout_counterMaxLength, -1));
        this.f25254m = r0VarObtainTintedStyledAttributes.getResourceId(J2.l.TextInputLayout_counterTextAppearance, 0);
        this.f25252l = r0VarObtainTintedStyledAttributes.getResourceId(J2.l.TextInputLayout_counterOverflowTextAppearance, 0);
        CheckableImageButton checkableImageButton2 = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(J2.h.design_text_input_start_icon, (ViewGroup) linearLayout, false);
        this.f25223Q = checkableImageButton2;
        checkableImageButton2.setVisibility(8);
        if (X2.c.isFontScaleAtLeast1_3(context2)) {
            F.setMarginEnd((ViewGroup.MarginLayoutParams) checkableImageButton2.getLayoutParams(), 0);
        }
        setStartIconOnClickListener(null);
        setStartIconOnLongClickListener(null);
        if (r0VarObtainTintedStyledAttributes.hasValue(J2.l.TextInputLayout_startIconDrawable)) {
            setStartIconDrawable(r0VarObtainTintedStyledAttributes.getDrawable(J2.l.TextInputLayout_startIconDrawable));
            if (r0VarObtainTintedStyledAttributes.hasValue(J2.l.TextInputLayout_startIconContentDescription)) {
                setStartIconContentDescription(r0VarObtainTintedStyledAttributes.getText(J2.l.TextInputLayout_startIconContentDescription));
            }
            setStartIconCheckable(r0VarObtainTintedStyledAttributes.getBoolean(J2.l.TextInputLayout_startIconCheckable, true));
        }
        if (r0VarObtainTintedStyledAttributes.hasValue(J2.l.TextInputLayout_startIconTint)) {
            setStartIconTintList(X2.c.getColorStateList(context2, r0VarObtainTintedStyledAttributes, J2.l.TextInputLayout_startIconTint));
        }
        if (r0VarObtainTintedStyledAttributes.hasValue(J2.l.TextInputLayout_startIconTintMode)) {
            setStartIconTintMode(o.parseTintMode(r0VarObtainTintedStyledAttributes.getInt(J2.l.TextInputLayout_startIconTintMode, -1), null));
        }
        setBoxBackgroundMode(r0VarObtainTintedStyledAttributes.getInt(J2.l.TextInputLayout_boxBackgroundMode, 0));
        CheckableImageButton checkableImageButton3 = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(J2.h.design_text_input_end_icon, (ViewGroup) frameLayout2, false);
        this.f25239e0 = checkableImageButton3;
        frameLayout2.addView(checkableImageButton3);
        checkableImageButton3.setVisibility(8);
        if (X2.c.isFontScaleAtLeast1_3(context2)) {
            F.setMarginStart((ViewGroup.MarginLayoutParams) checkableImageButton3.getLayoutParams(), 0);
        }
        sparseArray.append(-1, new com.google.android.material.textfield.b(this));
        sparseArray.append(0, new com.google.android.material.textfield.h(this));
        sparseArray.append(1, new i(this));
        sparseArray.append(2, new com.google.android.material.textfield.a(this));
        sparseArray.append(3, new com.google.android.material.textfield.d(this));
        if (r0VarObtainTintedStyledAttributes.hasValue(J2.l.TextInputLayout_endIconMode)) {
            setEndIconMode(r0VarObtainTintedStyledAttributes.getInt(J2.l.TextInputLayout_endIconMode, 0));
            if (r0VarObtainTintedStyledAttributes.hasValue(J2.l.TextInputLayout_endIconDrawable)) {
                setEndIconDrawable(r0VarObtainTintedStyledAttributes.getDrawable(J2.l.TextInputLayout_endIconDrawable));
            }
            if (r0VarObtainTintedStyledAttributes.hasValue(J2.l.TextInputLayout_endIconContentDescription)) {
                setEndIconContentDescription(r0VarObtainTintedStyledAttributes.getText(J2.l.TextInputLayout_endIconContentDescription));
            }
            setEndIconCheckable(r0VarObtainTintedStyledAttributes.getBoolean(J2.l.TextInputLayout_endIconCheckable, true));
        } else if (r0VarObtainTintedStyledAttributes.hasValue(J2.l.TextInputLayout_passwordToggleEnabled)) {
            setEndIconMode(r0VarObtainTintedStyledAttributes.getBoolean(J2.l.TextInputLayout_passwordToggleEnabled, false) ? 1 : 0);
            setEndIconDrawable(r0VarObtainTintedStyledAttributes.getDrawable(J2.l.TextInputLayout_passwordToggleDrawable));
            setEndIconContentDescription(r0VarObtainTintedStyledAttributes.getText(J2.l.TextInputLayout_passwordToggleContentDescription));
            if (r0VarObtainTintedStyledAttributes.hasValue(J2.l.TextInputLayout_passwordToggleTint)) {
                setEndIconTintList(X2.c.getColorStateList(context2, r0VarObtainTintedStyledAttributes, J2.l.TextInputLayout_passwordToggleTint));
            }
            if (r0VarObtainTintedStyledAttributes.hasValue(J2.l.TextInputLayout_passwordToggleTintMode)) {
                setEndIconTintMode(o.parseTintMode(r0VarObtainTintedStyledAttributes.getInt(J2.l.TextInputLayout_passwordToggleTintMode, -1), null));
            }
        }
        if (!r0VarObtainTintedStyledAttributes.hasValue(J2.l.TextInputLayout_passwordToggleEnabled)) {
            if (r0VarObtainTintedStyledAttributes.hasValue(J2.l.TextInputLayout_endIconTint)) {
                setEndIconTintList(X2.c.getColorStateList(context2, r0VarObtainTintedStyledAttributes, J2.l.TextInputLayout_endIconTint));
            }
            if (r0VarObtainTintedStyledAttributes.hasValue(J2.l.TextInputLayout_endIconTintMode)) {
                setEndIconTintMode(o.parseTintMode(r0VarObtainTintedStyledAttributes.getInt(J2.l.TextInputLayout_endIconTintMode, -1), null));
            }
        }
        J j8 = new J(context2);
        this.f25272v = j8;
        j8.setId(J2.f.textinput_prefix_text);
        j8.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        AbstractC0985p0.setAccessibilityLiveRegion(j8, 1);
        linearLayout.addView(checkableImageButton2);
        linearLayout.addView(j8);
        J j9 = new J(context2);
        this.f25276x = j9;
        j9.setId(J2.f.textinput_suffix_text);
        j9.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 80));
        AbstractC0985p0.setAccessibilityLiveRegion(j9, 1);
        linearLayout2.addView(j9);
        linearLayout2.addView(checkableImageButton);
        linearLayout2.addView(frameLayout2);
        setHelperTextEnabled(z9);
        setHelperText(text2);
        setHelperTextTextAppearance(resourceId2);
        setErrorEnabled(z8);
        setErrorTextAppearance(resourceId);
        setErrorContentDescription(text);
        setCounterTextAppearance(this.f25254m);
        setCounterOverflowTextAppearance(this.f25252l);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        setPrefixText(text4);
        setPrefixTextAppearance(resourceId4);
        setSuffixText(text5);
        setSuffixTextAppearance(resourceId5);
        if (r0VarObtainTintedStyledAttributes.hasValue(J2.l.TextInputLayout_errorTextColor)) {
            setErrorTextColor(r0VarObtainTintedStyledAttributes.getColorStateList(J2.l.TextInputLayout_errorTextColor));
        }
        if (r0VarObtainTintedStyledAttributes.hasValue(J2.l.TextInputLayout_helperTextTextColor)) {
            setHelperTextColor(r0VarObtainTintedStyledAttributes.getColorStateList(J2.l.TextInputLayout_helperTextTextColor));
        }
        if (r0VarObtainTintedStyledAttributes.hasValue(J2.l.TextInputLayout_hintTextColor)) {
            setHintTextColor(r0VarObtainTintedStyledAttributes.getColorStateList(J2.l.TextInputLayout_hintTextColor));
        }
        if (r0VarObtainTintedStyledAttributes.hasValue(J2.l.TextInputLayout_counterTextColor)) {
            setCounterTextColor(r0VarObtainTintedStyledAttributes.getColorStateList(J2.l.TextInputLayout_counterTextColor));
        }
        if (r0VarObtainTintedStyledAttributes.hasValue(J2.l.TextInputLayout_counterOverflowTextColor)) {
            setCounterOverflowTextColor(r0VarObtainTintedStyledAttributes.getColorStateList(J2.l.TextInputLayout_counterOverflowTextColor));
        }
        if (r0VarObtainTintedStyledAttributes.hasValue(J2.l.TextInputLayout_placeholderTextColor)) {
            setPlaceholderTextColor(r0VarObtainTintedStyledAttributes.getColorStateList(J2.l.TextInputLayout_placeholderTextColor));
        }
        if (r0VarObtainTintedStyledAttributes.hasValue(J2.l.TextInputLayout_prefixTextColor)) {
            setPrefixTextColor(r0VarObtainTintedStyledAttributes.getColorStateList(J2.l.TextInputLayout_prefixTextColor));
        }
        if (r0VarObtainTintedStyledAttributes.hasValue(J2.l.TextInputLayout_suffixTextColor)) {
            setSuffixTextColor(r0VarObtainTintedStyledAttributes.getColorStateList(J2.l.TextInputLayout_suffixTextColor));
        }
        setCounterEnabled(z10);
        setEnabled(r0VarObtainTintedStyledAttributes.getBoolean(J2.l.TextInputLayout_android_enabled, true));
        r0VarObtainTintedStyledAttributes.recycle();
        AbstractC0985p0.setImportantForAccessibility(this, 2);
        if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0985p0.setImportantForAutofill(this, 1);
        }
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f25261p0.setImageDrawable(drawable);
        setErrorIconVisible(drawable != null && this.f25242g.x());
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f25239e0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f25239e0.setImageDrawable(drawable);
    }

    public void setHint(int i8) {
        setHint(i8 != 0 ? getResources().getText(i8) : null);
    }
}
