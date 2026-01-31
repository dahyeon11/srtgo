package com.korail.talk.ui.payment.fragment.payment.option.easyPay;

import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import com.korail.talk.ui.ticket.confirm.TicketSelfCheckinStatusActivity;
import com.korail.talk.viewGroup.DropDownSelector;
import n4.AbstractC5952c;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import y6.C6541a;
import z4.C6630d;
import z4.C6637k;
import z4.N;
import z4.P;
import z4.t;

/* loaded from: classes.dex */
public class EasyStbkPayOption extends C6541a implements RadioGroup.OnCheckedChangeListener {

    /* renamed from: a */
    private CheckBox f28551a;

    /* renamed from: b */
    private RadioGroup f28552b;

    /* renamed from: c */
    private DropDownSelector f28553c;

    /* renamed from: d */
    private EditText f28554d;

    public EasyStbkPayOption(Context context) {
        super(context);
        e();
    }

    private void e() {
        View.inflate(getContext(), AbstractC5957h.easy_stbk_pay_option, this);
        g();
        j();
        i();
        h();
    }

    public /* synthetic */ void f(DialogInterface dialogInterface, int i8) {
        this.f28554d.requestFocus();
        P.showIME(getContext());
    }

    private void g() {
    }

    private void h() {
        this.f28552b.setOnCheckedChangeListener(this);
    }

    private void i() {
        this.f28553c.setEntries(c(AbstractC5952c.cash_receipt_personal), (String[]) null, 0);
    }

    private void j() {
        this.f28551a = (CheckBox) findViewById(AbstractC5955f.cb_easy_stbk_pay_option);
        this.f28552b = (RadioGroup) findViewById(AbstractC5955f.rg_easy_stbk_pay_option);
        this.f28553c = (DropDownSelector) findViewById(AbstractC5955f.dd_easy_stbk_pay_option);
        this.f28554d = (EditText) findViewById(AbstractC5955f.et_easy_stbk_pay_option);
    }

    public boolean getCheckBoxIsChecked() {
        return this.f28551a.isChecked();
    }

    public String getCheckedRadioButtonValue() {
        return AbstractC5955f.rb_easy_stbk_pay_option_business == this.f28552b.getCheckedRadioButtonId() ? TicketSelfCheckinStatusActivity.CHECKIN_STATUS_NOT_USE : "00";
    }

    public String getDropDownValue() {
        int selectIndex = this.f28553c.getSelectIndex();
        return String.valueOf(1 == selectIndex ? 3 : 2 == selectIndex ? 5 : 2);
    }

    public String getEditText() {
        return N.getText(this.f28554d);
    }

    public boolean isValid() {
        String strA;
        boolean z8;
        String strA2;
        if (this.f28551a.isChecked()) {
            String text = N.getText(this.f28554d);
            z8 = false;
            if (text.isEmpty()) {
                strA = a(AbstractC5959j.dialog_cash_receipt_warning_msg);
            } else if (C6630d.isOnlyNumberString(text)) {
                int length = text.length();
                if (this.f28553c.getSelectIndex() == 0) {
                    if (length < 10 || length > 13) {
                        strA2 = a(AbstractC5959j.dialog_cash_receipt_recheck_num_msg);
                        t.d("자릿수 재 확인" + text.length());
                        strA = strA2;
                    } else {
                        t.d("정상" + text.length());
                        strA = null;
                        z8 = true;
                    }
                } else if (this.f28553c.getSelectIndex() == 1) {
                    if (text.length() < 11) {
                        strA2 = a(AbstractC5959j.dialog_cash_receipt_recheck_num_msg);
                        t.d("11자리 보다 낮은 숫자" + text.length());
                    } else if (length < 13 || length > 20) {
                        strA2 = a(AbstractC5959j.dialog_cash_receipt_recheck_num_msg);
                        t.d("13자리 보다 낮은 숫자 20자리 보다 높은 숫자 " + text.length());
                    } else {
                        t.d("정상" + text.length());
                        strA = null;
                        z8 = true;
                    }
                    strA = strA2;
                } else if (length == 10) {
                    t.d("정상" + text.length());
                    strA = null;
                    z8 = true;
                } else {
                    strA2 = a(AbstractC5959j.dialog_cash_receipt_recheck_num_msg);
                    t.d("자릿수 재 확인" + text.length());
                    strA = strA2;
                }
            } else {
                strA = a(AbstractC5959j.dialog_cash_receipt_only_input_num_msg);
            }
        } else {
            strA = null;
            z8 = true;
        }
        if (!z8 && strA != null) {
            C6637k.getCDialog(getContext(), 1001, 1, a(AbstractC5959j.dialog_title)).setContent(strA).setButtonListener(new DialogInterface.OnClickListener() { // from class: J5.e
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    this.f2624a.f(dialogInterface, i8);
                }
            }).showDialog();
        }
        return z8;
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public void onCheckedChanged(RadioGroup radioGroup, int i8) {
        if (AbstractC5955f.rb_easy_stbk_pay_option_business == i8) {
            this.f28553c.setEntries(c(AbstractC5952c.cash_receipt_business), (String[]) null, 0);
        } else {
            this.f28553c.setEntries(c(AbstractC5952c.cash_receipt_personal), (String[]) null, 0);
        }
    }

    public EasyStbkPayOption(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e();
    }

    public EasyStbkPayOption(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        e();
    }
}
