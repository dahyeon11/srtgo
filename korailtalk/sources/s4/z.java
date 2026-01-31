package s4;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.TypedValue;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import z4.C6630d;
import z4.N;

/* loaded from: classes.dex */
public class z extends C6219c {
    public static final int MAX_COUNT_ARRIVAL = 3;
    public static final int MAX_COUNT_DEPARTURE = 4;
    public static final int PUSH_TYPE_ARRIVAL = 20;
    public static final int PUSH_TYPE_DEPARTURE = 55;

    /* renamed from: q, reason: collision with root package name */
    private int f36297q;

    /* renamed from: r, reason: collision with root package name */
    private RadioGroup f36298r;

    /* renamed from: s, reason: collision with root package name */
    private EditText f36299s;

    /* renamed from: t, reason: collision with root package name */
    private TextView f36300t;

    public z(Context context) {
        super(context);
    }

    @Override // s4.C6219c, t4.C6364a
    protected void f() {
        g(AbstractC5957h.dialog_train_push);
    }

    @Override // s4.C6219c, t4.C6364a
    protected void i() {
        this.f36299s.addTextChangedListener(new a());
    }

    @Override // s4.C6219c, t4.C6364a
    protected void k() {
        super.k();
        RadioGroup radioGroup = (RadioGroup) a(AbstractC5955f.radioGroup);
        this.f36298r = radioGroup;
        radioGroup.setVisibility(8);
        this.f36299s = (EditText) a(AbstractC5955f.et_custom_minute);
        this.f36300t = (TextView) a(AbstractC5955f.tv_custom_minute_msg);
    }

    @Override // s4.C6219c
    protected int q() {
        return this.f36298r.indexOfChild((RadioButton) this.f36298r.findViewById(this.f36298r.getCheckedRadioButtonId()));
    }

    @Override // s4.C6219c
    protected String r() {
        if (C6630d.isNotNull(this.f36299s.getText())) {
            return this.f36299s.getText().toString();
        }
        return null;
    }

    public void setPushType(int i8) {
        this.f36297q = i8;
    }

    public z setRadioGroup(String[] strArr, int i8) {
        for (int i9 = 0; i9 < strArr.length; i9++) {
            RadioButton radioButton = (RadioButton) View.inflate(getContext(), AbstractC5957h.include_dialog_radio_btn, null);
            radioButton.setLineSpacing(TypedValue.applyDimension(1, 5.0f, getContext().getResources().getDisplayMetrics()), 1.0f);
            radioButton.setText(strArr[i9]);
            this.f36298r.addView(radioButton);
            if (i8 == i9) {
                radioButton.setChecked(true);
            }
        }
        this.f36298r.setVisibility(0);
        this.f36300t.setText(d(AbstractC5959j.notice_before_minute_message, Integer.valueOf(this.f36297q)));
        return this;
    }

    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) throws NumberFormatException {
            if (N.isNotNull(editable.toString())) {
                int i8 = Integer.parseInt(editable.toString());
                z4.t.d("afterTextChanged : " + i8 + ", ButtonIndex() :" + z.this.q());
                if (z.this.q() != (z.this.f36297q == 55 ? 4 : 3) || (i8 >= 5 && i8 <= z.this.f36297q)) {
                    z.this.f36179p.setEnabled(true);
                } else {
                    z.this.f36179p.setEnabled(false);
                }
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        }
    }
}
