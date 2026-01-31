package com.google.android.material.textfield;

import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import i.AbstractC5638a;

/* loaded from: classes2.dex */
class i extends e {

    /* renamed from: d, reason: collision with root package name */
    private final TextWatcher f25374d;

    /* renamed from: e, reason: collision with root package name */
    private final TextInputLayout.f f25375e;

    /* renamed from: f, reason: collision with root package name */
    private final TextInputLayout.g f25376f;

    class a extends com.google.android.material.internal.j {
        a() {
        }

        @Override // com.google.android.material.internal.j, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
            i.this.f25343c.setChecked(!r1.g());
        }
    }

    class b implements TextInputLayout.f {
        b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void onEditTextAttached(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(true);
            textInputLayout.setEndIconCheckable(true);
            i.this.f25343c.setChecked(!r4.g());
            editText.removeTextChangedListener(i.this.f25374d);
            editText.addTextChangedListener(i.this.f25374d);
        }
    }

    class c implements TextInputLayout.g {

        class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ EditText f25380a;

            a(EditText editText) {
                this.f25380a = editText;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f25380a.removeTextChangedListener(i.this.f25374d);
            }
        }

        c() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public void onEndIconChanged(TextInputLayout textInputLayout, int i8) {
            EditText editText = textInputLayout.getEditText();
            if (editText == null || i8 != 1) {
                return;
            }
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            editText.post(new a(editText));
        }
    }

    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EditText editText = i.this.f25341a.getEditText();
            if (editText == null) {
                return;
            }
            int selectionEnd = editText.getSelectionEnd();
            if (i.this.g()) {
                editText.setTransformationMethod(null);
            } else {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            if (selectionEnd >= 0) {
                editText.setSelection(selectionEnd);
            }
            i.this.f25341a.refreshEndIconDrawableState();
        }
    }

    i(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f25374d = new a();
        this.f25375e = new b();
        this.f25376f = new c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g() {
        EditText editText = this.f25341a.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    private static boolean h(EditText editText) {
        return editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224);
    }

    @Override // com.google.android.material.textfield.e
    void a() {
        this.f25341a.setEndIconDrawable(AbstractC5638a.getDrawable(this.f25342b, J2.e.design_password_eye));
        TextInputLayout textInputLayout = this.f25341a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(J2.j.password_toggle_content_description));
        this.f25341a.setEndIconOnClickListener(new d());
        this.f25341a.addOnEditTextAttachedListener(this.f25375e);
        this.f25341a.addOnEndIconChangedListener(this.f25376f);
        EditText editText = this.f25341a.getEditText();
        if (h(editText)) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
