package x4;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import z4.C6630d;

/* renamed from: x4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6491a implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    protected int f37513a;

    /* renamed from: b, reason: collision with root package name */
    protected EditText f37514b;

    public C6491a(int i8, EditText editText) {
        this.f37513a = i8;
        this.f37514b = editText;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        if (editable.toString().length() == this.f37513a && C6630d.isNotNull(this.f37514b)) {
            this.f37514b.requestFocus();
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
    }
}
