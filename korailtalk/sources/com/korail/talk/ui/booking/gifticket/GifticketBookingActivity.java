package com.korail.talk.ui.booking.gifticket;

import I4.h;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Selection;
import android.text.Spanned;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.gifticket.GifticketBookingDao;
import com.korail.talk.network.dao.gifticket.GifticketBookingDao.GifticketBookingRequest;
import com.korail.talk.network.dao.login.MemberCertDao;
import com.korail.talk.network.dao.login.MemberCertDao.MemberCertRequest;
import com.korail.talk.ui.payment.PaymentActivity;
import com.korail.talk.view.base.BaseViewActivity;
import java.lang.reflect.InvocationTargetException;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import r4.i;
import z4.C6637k;
import z4.N;
import z4.t;

/* loaded from: classes.dex */
public class GifticketBookingActivity extends BaseViewActivity {

    /* renamed from: i, reason: collision with root package name */
    private final int f27648i = 0;

    /* renamed from: j, reason: collision with root package name */
    private final int f27649j = 1;

    /* renamed from: k, reason: collision with root package name */
    private final int f27650k = 2;

    /* renamed from: l, reason: collision with root package name */
    private final int f27651l = 100000;

    /* renamed from: m, reason: collision with root package name */
    private String f27652m;

    /* renamed from: n, reason: collision with root package name */
    private RadioGroup f27653n;

    /* renamed from: o, reason: collision with root package name */
    private RadioGroup f27654o;

    /* renamed from: p, reason: collision with root package name */
    private RadioGroup f27655p;

    /* renamed from: q, reason: collision with root package name */
    private EditText f27656q;

    /* renamed from: r, reason: collision with root package name */
    private EditText f27657r;

    /* renamed from: s, reason: collision with root package name */
    private EditText f27658s;

    /* renamed from: t, reason: collision with root package name */
    private Button f27659t;

    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            GifticketBookingActivity.this.f27653n.clearCheck();
            GifticketBookingActivity.this.f27654o.clearCheck();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        }
    }

    private void setText() {
        setAppTitle(AbstractC5959j.title_gifticket);
    }

    private void u0() {
        GifticketBookingDao gifticketBookingDao = new GifticketBookingDao();
        GifticketBookingDao.GifticketBookingRequest gifticketBookingRequest = gifticketBookingDao.new GifticketBookingRequest();
        boolean zIsChecked = ((CheckBox) findViewById(AbstractC5955f.cb_mine)).isChecked();
        this.f27652m = zIsChecked ? h.getInstance().getMemberNum() : this.f27652m;
        String memberName = zIsChecked ? h.getInstance().getMemberName() : N(this.f27657r);
        t.d("회원번호 :" + this.f27652m + ", 이름 : " + memberName + ", 기프티켓 금액 : " + N(this.f27656q) + ", 나에게 선물 : " + zIsChecked);
        gifticketBookingRequest.setItmCnt("1");
        gifticketBookingRequest.setPrnbCnt("1");
        gifticketBookingRequest.setMrkAmt(N(this.f27656q));
        gifticketBookingRequest.setMbCrdNo(this.f27652m);
        gifticketBookingRequest.setGdUtlPsNm(memberName);
        gifticketBookingDao.setRequest(gifticketBookingRequest);
        executeDao(gifticketBookingDao);
    }

    private void v0(String str, String str2, int i8) {
        MemberCertDao memberCertDao = new MemberCertDao();
        MemberCertDao.MemberCertRequest memberCertRequest = memberCertDao.new MemberCertRequest();
        memberCertRequest.setTxtAcptPsNm(str);
        if (i8 == 0) {
            memberCertRequest.setAcept("1");
            memberCertRequest.setMemNum(str2);
        } else if (i8 == 1) {
            memberCertRequest.setAcept("3");
            memberCertRequest.setTxtCpNo(str2);
        } else if (i8 == 2) {
            memberCertRequest.setAcept("2");
            memberCertRequest.setTxtEmailNo(str2);
        }
        memberCertDao.setRequest(memberCertRequest);
        executeDao(memberCertDao);
    }

    private void w0(GifticketBookingDao.GifticketBookingResponse gifticketBookingResponse) {
        Intent intent = new Intent(getApplicationContext(), (Class<?>) PaymentActivity.class);
        intent.putExtra("PAYMENT_TYPE", i.PAYMENT_DEFAULT);
        intent.putExtra("PAYMENT_REQUEST", C4.b.getIntgStlRequest(gifticketBookingResponse.getLumpStlTgtNo()));
        intent.putExtra("IS_POINT_STEP", true);
        intent.putExtra("SELECTED_ITEM_COUNT", 1);
        intent.putExtra("RECEIVED_AMOUNT", N.getInteger(gifticketBookingResponse.getRcvdAmt()));
        intent.putExtra("DISCOUNT_AMOUNT", 0);
        intent.putExtra("IS_TRAVEL_PACKAGES", true);
        startActivity(intent);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void x0() {
        /*
            r7 = this;
            android.widget.EditText r0 = r7.f27657r
            java.lang.String r0 = z4.N.getText(r0)
            android.widget.EditText r1 = r7.f27658s
            java.lang.String r1 = z4.N.getText(r1)
            android.widget.RadioGroup r2 = r7.f27655p
            int r2 = r2.getCheckedRadioButtonId()
            int r3 = n4.AbstractC5955f.memberNoRadio
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 != r2) goto L1b
        L19:
            r2 = r6
            goto L26
        L1b:
            int r3 = n4.AbstractC5955f.cellNoRadio
            if (r3 != r2) goto L21
            r2 = r5
            goto L26
        L21:
            int r3 = n4.AbstractC5955f.emailRadio
            if (r3 != r2) goto L19
            r2 = r4
        L26:
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L33
            int r3 = n4.AbstractC5959j.ticket_delivery_input_name_warning
            java.lang.String r3 = r7.getString(r3)
            goto L62
        L33:
            boolean r3 = z4.C.isInvalidName(r0)
            if (r3 != 0) goto L40
            int r3 = n4.AbstractC5959j.nonmember_check_name_message2
            java.lang.String r3 = r7.getString(r3)
            goto L62
        L40:
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L61
            if (r2 != 0) goto L4f
            int r3 = n4.AbstractC5959j.ticket_delivery_input_member_number_warning
            java.lang.String r3 = r7.getString(r3)
            goto L62
        L4f:
            if (r2 != r5) goto L58
            int r3 = n4.AbstractC5959j.ticket_delivery_input_cellphone_number_warning
            java.lang.String r3 = r7.getString(r3)
            goto L62
        L58:
            if (r2 != r4) goto L61
            int r3 = n4.AbstractC5959j.ticket_delivery_input_email_warning
            java.lang.String r3 = r7.getString(r3)
            goto L62
        L61:
            r3 = 0
        L62:
            boolean r4 = z4.N.isNull(r3)
            if (r4 == 0) goto L6c
            r7.v0(r0, r1, r2)
            goto L87
        L6c:
            android.app.Activity r0 = r7.K()
            int r1 = n4.AbstractC5959j.dialog_title
            java.lang.String r1 = r7.getString(r1)
            r2 = 1001(0x3e9, float:1.403E-42)
            s4.c r0 = z4.C6637k.getCDialog(r0, r2, r6, r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r3}
            s4.c r0 = r0.setContent(r1)
            r0.showDialog()
        L87:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.korail.talk.ui.booking.gifticket.GifticketBookingActivity.x0():void");
    }

    private void y0() {
        findViewById(AbstractC5955f.rb_gift_money_1).setOnClickListener(this);
        findViewById(AbstractC5955f.rb_gift_money_2).setOnClickListener(this);
        findViewById(AbstractC5955f.rb_gift_money_3).setOnClickListener(this);
        findViewById(AbstractC5955f.rb_gift_money_4).setOnClickListener(this);
        findViewById(AbstractC5955f.rb_gift_money_5).setOnClickListener(this);
        findViewById(AbstractC5955f.memberNoRadio).setOnClickListener(this);
        findViewById(AbstractC5955f.cellNoRadio).setOnClickListener(this);
        findViewById(AbstractC5955f.emailRadio).setOnClickListener(this);
        this.f27656q.setFilters(new InputFilter[]{new b(0, 100000)});
        this.f27656q.addTextChangedListener(new a());
        findViewById(AbstractC5955f.btn_query).setOnClickListener(this);
        this.f27659t.setOnClickListener(this);
    }

    private void z0() {
        n0(false);
        this.f27653n = (RadioGroup) findViewById(AbstractC5955f.rg_gift_money1);
        this.f27654o = (RadioGroup) findViewById(AbstractC5955f.rg_gift_money2);
        this.f27656q = (EditText) findViewById(AbstractC5955f.et_money);
        this.f27655p = (RadioGroup) findViewById(AbstractC5955f.memVeriTypeGroup);
        this.f27657r = (EditText) findViewById(AbstractC5955f.et_name);
        this.f27658s = (EditText) findViewById(AbstractC5955f.et_query);
        this.f27659t = (Button) findViewById(AbstractC5955f.btn_bottom);
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (AbstractC5955f.rb_gift_money_1 == id) {
            this.f27656q.setText("5000");
            Editable text = this.f27656q.getText();
            Selection.setSelection(text, text.length());
            this.f27656q.clearFocus();
            this.f27654o.clearCheck();
            this.f27653n.check(AbstractC5955f.rb_gift_money_1);
            return;
        }
        if (AbstractC5955f.rb_gift_money_2 == id) {
            this.f27656q.setText("10000");
            Editable text2 = this.f27656q.getText();
            Selection.setSelection(text2, text2.length());
            this.f27654o.clearCheck();
            this.f27653n.check(AbstractC5955f.rb_gift_money_2);
            return;
        }
        if (AbstractC5955f.rb_gift_money_3 == id) {
            this.f27656q.setText("30000");
            Editable text3 = this.f27656q.getText();
            Selection.setSelection(text3, text3.length());
            this.f27654o.clearCheck();
            this.f27653n.check(AbstractC5955f.rb_gift_money_3);
            return;
        }
        if (AbstractC5955f.rb_gift_money_4 == id) {
            this.f27656q.setText("50000");
            Editable text4 = this.f27656q.getText();
            Selection.setSelection(text4, text4.length());
            this.f27653n.clearCheck();
            this.f27654o.check(AbstractC5955f.rb_gift_money_4);
            return;
        }
        if (AbstractC5955f.rb_gift_money_5 == id) {
            this.f27656q.setText("100000");
            Editable text5 = this.f27656q.getText();
            Selection.setSelection(text5, text5.length());
            this.f27653n.clearCheck();
            this.f27654o.check(AbstractC5955f.rb_gift_money_5);
            return;
        }
        if (AbstractC5955f.memberNoRadio == id) {
            this.f27658s.setInputType(2);
            return;
        }
        if (AbstractC5955f.cellNoRadio == id) {
            this.f27658s.setInputType(3);
            return;
        }
        if (AbstractC5955f.emailRadio == id) {
            this.f27658s.setInputType(32);
            return;
        }
        if (AbstractC5955f.btn_query == id) {
            x0();
        } else if (AbstractC5955f.btn_bottom == id) {
            u0();
        } else {
            super.onClick(view);
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_gifticket_booking);
        z0();
        setText();
        y0();
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        super.onReceive(iBaseDao);
        int id = iBaseDao.getId();
        if (AbstractC5955f.dao_cert_member == id) {
            this.f27652m = ((MemberCertDao.MemberCertResponse) iBaseDao.getResponse()).getMbCrdNo();
            C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.ticket_delivery_input_verified)).showDialog();
        } else if (AbstractC5955f.dao_gifticket_reservation == id) {
            w0((GifticketBookingDao.GifticketBookingResponse) iBaseDao.getResponse());
        }
    }

    public class b implements InputFilter {

        /* renamed from: a, reason: collision with root package name */
        private int f27661a;

        /* renamed from: b, reason: collision with root package name */
        private int f27662b;

        public b(int i8, int i9) {
            this.f27661a = i8;
            this.f27662b = i9;
        }

        private boolean a(int i8, int i9, int i10) {
            if (i9 > i8) {
                if (i10 < i8 || i10 > i9) {
                    return false;
                }
            } else if (i10 < i9 || i10 > i8) {
                return false;
            }
            return true;
        }

        @Override // android.text.InputFilter
        public CharSequence filter(CharSequence charSequence, int i8, int i9, Spanned spanned, int i10, int i11) throws NumberFormatException {
            try {
                if (a(this.f27661a, this.f27662b, Integer.parseInt(spanned.toString() + charSequence.toString()))) {
                    return null;
                }
                return "";
            } catch (NumberFormatException e8) {
                t.e(e8.getMessage());
                return "";
            }
        }

        public b(String str, String str2) {
            this.f27661a = Integer.parseInt(str);
            this.f27662b = Integer.parseInt(str2);
        }
    }
}
