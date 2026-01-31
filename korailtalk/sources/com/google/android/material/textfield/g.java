package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import androidx.appcompat.widget.C0844d;
import androidx.appcompat.widget.c0;
import c3.AbstractC1090a;

/* loaded from: classes2.dex */
public class g extends C0844d {

    /* renamed from: d, reason: collision with root package name */
    private final c0 f25370d;

    /* renamed from: e, reason: collision with root package name */
    private final AccessibilityManager f25371e;

    /* renamed from: f, reason: collision with root package name */
    private final Rect f25372f;

    class a implements AdapterView.OnItemClickListener {
        a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i8, long j8) {
            g.this.e(i8 < 0 ? g.this.f25370d.getSelectedItem() : g.this.getAdapter().getItem(i8));
            AdapterView.OnItemClickListener onItemClickListener = g.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i8 < 0) {
                    view = g.this.f25370d.getSelectedView();
                    i8 = g.this.f25370d.getSelectedItemPosition();
                    j8 = g.this.f25370d.getSelectedItemId();
                }
                onItemClickListener.onItemClick(g.this.f25370d.getListView(), view, i8, j8);
            }
            g.this.f25370d.dismiss();
        }
    }

    public g(Context context) {
        this(context, null);
    }

    private TextInputLayout c() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    private int d() {
        ListAdapter adapter = getAdapter();
        TextInputLayout textInputLayoutC = c();
        int i8 = 0;
        if (adapter == null || textInputLayoutC == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMin = Math.min(adapter.getCount(), Math.max(0, this.f25370d.getSelectedItemPosition()) + 15);
        View view = null;
        int iMax = 0;
        for (int iMax2 = Math.max(0, iMin - 15); iMax2 < iMin; iMax2++) {
            int itemViewType = adapter.getItemViewType(iMax2);
            if (itemViewType != i8) {
                view = null;
                i8 = itemViewType;
            }
            view = adapter.getView(iMax2, view, textInputLayoutC);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax = Math.max(iMax, view.getMeasuredWidth());
        }
        Drawable background = this.f25370d.getBackground();
        if (background != null) {
            background.getPadding(this.f25372f);
            Rect rect = this.f25372f;
            iMax += rect.left + rect.right;
        }
        return iMax + textInputLayoutC.getEndIconView().getMeasuredWidth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Object obj) {
        setText(convertSelectionToString(obj), false);
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayoutC = c();
        return (textInputLayoutC == null || !textInputLayoutC.isProvidingHint()) ? super.getHint() : textInputLayoutC.getHint();
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutC = c();
        if (textInputLayoutC != null && textInputLayoutC.isProvidingHint() && super.getHint() == null && com.google.android.material.internal.e.isMeizuDevice()) {
            setHint("");
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i8, int i9) {
        super.onMeasure(i8, i9);
        if (View.MeasureSpec.getMode(i8) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), d()), View.MeasureSpec.getSize(i8)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t8) {
        super.setAdapter(t8);
        this.f25370d.setAdapter(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        AccessibilityManager accessibilityManager = this.f25371e;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.showDropDown();
        } else {
            this.f25370d.show();
        }
    }

    public g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, J2.b.autoCompleteTextViewStyle);
    }

    public g(Context context, AttributeSet attributeSet, int i8) {
        super(AbstractC1090a.wrap(context, attributeSet, i8, 0), attributeSet, i8);
        this.f25372f = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = com.google.android.material.internal.k.obtainStyledAttributes(context2, attributeSet, J2.l.MaterialAutoCompleteTextView, i8, J2.k.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (typedArrayObtainStyledAttributes.hasValue(J2.l.MaterialAutoCompleteTextView_android_inputType) && typedArrayObtainStyledAttributes.getInt(J2.l.MaterialAutoCompleteTextView_android_inputType, 0) == 0) {
            setKeyListener(null);
        }
        this.f25371e = (AccessibilityManager) context2.getSystemService("accessibility");
        c0 c0Var = new c0(context2);
        this.f25370d = c0Var;
        c0Var.setModal(true);
        c0Var.setAnchorView(this);
        c0Var.setInputMethodMode(2);
        c0Var.setAdapter(getAdapter());
        c0Var.setOnItemClickListener(new a());
        typedArrayObtainStyledAttributes.recycle();
    }
}
