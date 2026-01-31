package com.google.android.material.timepicker;

import J2.f;
import J2.h;
import android.content.Context;
import android.content.res.Configuration;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.view.AbstractC0985p0;
import androidx.core.view.C0923a;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.j;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Arrays;

/* loaded from: classes2.dex */
class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: a, reason: collision with root package name */
    private final Chip f25383a;

    /* renamed from: b, reason: collision with root package name */
    private final TextInputLayout f25384b;

    /* renamed from: c, reason: collision with root package name */
    private final EditText f25385c;

    /* renamed from: d, reason: collision with root package name */
    private TextWatcher f25386d;

    /* renamed from: e, reason: collision with root package name */
    private TextView f25387e;

    private class b extends j {
        private b() {
        }

        @Override // com.google.android.material.internal.j, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView.this.f25383a.setText(ChipTextInputComboView.this.c("00"));
            } else {
                ChipTextInputComboView.this.f25383a.setText(ChipTextInputComboView.this.c(editable));
            }
        }
    }

    public ChipTextInputComboView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String c(CharSequence charSequence) {
        return c.formatText(getResources(), charSequence);
    }

    private void d() {
        this.f25385c.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    public void addInputFilter(InputFilter inputFilter) {
        InputFilter[] filters = this.f25385c.getFilters();
        InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
        inputFilterArr[filters.length] = inputFilter;
        this.f25385c.setFilters(inputFilterArr);
    }

    public TextInputLayout getTextInput() {
        return this.f25384b;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f25383a.isChecked();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        d();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z8) {
        this.f25383a.setChecked(z8);
        this.f25385c.setVisibility(z8 ? 0 : 4);
        this.f25383a.setVisibility(z8 ? 8 : 0);
        if (isChecked()) {
            this.f25385c.requestFocus();
            if (TextUtils.isEmpty(this.f25385c.getText())) {
                return;
            }
            EditText editText = this.f25385c;
            editText.setSelection(editText.getText().length());
        }
    }

    public void setChipDelegate(C0923a c0923a) {
        AbstractC0985p0.setAccessibilityDelegate(this.f25383a, c0923a);
    }

    public void setCursorVisible(boolean z8) {
        this.f25385c.setCursorVisible(z8);
    }

    public void setHelperText(CharSequence charSequence) {
        this.f25387e.setText(charSequence);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f25383a.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setTag(int i8, Object obj) {
        this.f25383a.setTag(i8, obj);
    }

    public void setText(CharSequence charSequence) {
        this.f25383a.setText(c(charSequence));
        if (TextUtils.isEmpty(this.f25385c.getText())) {
            return;
        }
        this.f25385c.removeTextChangedListener(this.f25386d);
        this.f25385c.setText((CharSequence) null);
        this.f25385c.addTextChangedListener(this.f25386d);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        this.f25383a.toggle();
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        Chip chip = (Chip) layoutInflaterFrom.inflate(h.material_time_chip, (ViewGroup) this, false);
        this.f25383a = chip;
        TextInputLayout textInputLayout = (TextInputLayout) layoutInflaterFrom.inflate(h.material_time_input, (ViewGroup) this, false);
        this.f25384b = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.f25385c = editText;
        editText.setVisibility(4);
        b bVar = new b();
        this.f25386d = bVar;
        editText.addTextChangedListener(bVar);
        d();
        addView(chip);
        addView(textInputLayout);
        this.f25387e = (TextView) findViewById(f.material_label);
        editText.setSaveEnabled(false);
    }
}
