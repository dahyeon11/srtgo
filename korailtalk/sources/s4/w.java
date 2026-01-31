package s4;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import z4.C6630d;

/* loaded from: classes.dex */
public class w extends C6219c {

    /* renamed from: q, reason: collision with root package name */
    private RadioGroup f36281q;

    public w(Context context) {
        super(context);
    }

    @Override // s4.C6219c, t4.C6364a
    protected void f() {
        g(AbstractC5957h.dialog_radio_selection);
    }

    @Override // s4.C6219c, t4.C6364a
    protected void k() {
        super.k();
        RadioGroup radioGroup = (RadioGroup) a(AbstractC5955f.radioGroup);
        this.f36281q = radioGroup;
        radioGroup.setVisibility(8);
    }

    @Override // s4.C6219c
    protected int q() {
        return this.f36281q.indexOfChild((RadioButton) this.f36281q.findViewById(this.f36281q.getCheckedRadioButtonId()));
    }

    public w setRadioGroup(String[] strArr, int i8) {
        if (C6630d.isNotNull(strArr)) {
            for (int i9 = 0; i9 < strArr.length; i9++) {
                RadioButton radioButton = (RadioButton) View.inflate(getContext(), AbstractC5957h.include_dialog_radio_btn, null);
                radioButton.setLineSpacing(TypedValue.applyDimension(1, 5.0f, getContext().getResources().getDisplayMetrics()), 1.0f);
                radioButton.setText(strArr[i9]);
                this.f36281q.addView(radioButton);
                if (i8 == i9) {
                    radioButton.setChecked(true);
                }
            }
            this.f36281q.setVisibility(0);
        }
        return this;
    }
}
