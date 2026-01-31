package com.korail.talk.viewGroup;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import g6.InterfaceC5558a;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import y6.C6542b;
import z4.C;
import z4.C6630d;
import z4.C6637k;
import z4.N;
import z4.P;

/* loaded from: classes.dex */
public class TicketDeliveryMember extends C6542b implements View.OnClickListener {
    public static final int CHECK_E_MAIL = 2;
    public static final int CHECK_MEMBER_NO = 0;
    public static final int CHECK_PHONE_NO = 1;

    /* renamed from: a, reason: collision with root package name */
    private String f29586a;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC5558a f29587b;

    /* renamed from: c, reason: collision with root package name */
    private RadioGroup f29588c;

    /* renamed from: d, reason: collision with root package name */
    private EditText f29589d;

    /* renamed from: e, reason: collision with root package name */
    private EditText f29590e;

    /* renamed from: f, reason: collision with root package name */
    private EditText f29591f;

    /* renamed from: g, reason: collision with root package name */
    private TextView f29592g;

    /* renamed from: h, reason: collision with root package name */
    private Button f29593h;

    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TicketDeliveryMember.this.f29586a = null;
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        }
    }

    public TicketDeliveryMember(Context context) {
        super(context);
        h();
    }

    private void i() {
        String text = N.getText(this.f29589d);
        String text2 = N.getText(this.f29591f);
        String strB = text.isEmpty() ? b(AbstractC5959j.ticket_delivery_input_name_warning) : N.isNull(this.f29586a) ? b(AbstractC5959j.ticket_delivery_certification_warning) : N.isNull(C.makePhoneNumber(text2)) ? b(AbstractC5959j.ticket_delivery_input_cellphone_number_correct_warning) : null;
        if (!N.isNull(strB)) {
            C6637k.getCDialog(getContext(), 1001, 0, b(AbstractC5959j.dialog_title)).setContent(strB).showDialog();
        } else if (C6630d.isNotNull(this.f29587b)) {
            this.f29587b.requestDelivery(text, text2, this.f29586a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void j() {
        /*
            r7 = this;
            android.widget.EditText r0 = r7.f29589d
            java.lang.String r0 = z4.N.getText(r0)
            android.widget.EditText r1 = r7.f29590e
            java.lang.String r1 = z4.N.getText(r1)
            android.widget.RadioGroup r2 = r7.f29588c
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
            java.lang.String r3 = r7.b(r3)
            goto L62
        L33:
            boolean r3 = z4.C.isInvalidName(r0)
            if (r3 != 0) goto L40
            int r3 = n4.AbstractC5959j.nonmember_check_name_message2
            java.lang.String r3 = r7.b(r3)
            goto L62
        L40:
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L61
            if (r2 != 0) goto L4f
            int r3 = n4.AbstractC5959j.ticket_delivery_input_member_number_warning
            java.lang.String r3 = r7.b(r3)
            goto L62
        L4f:
            if (r2 != r5) goto L58
            int r3 = n4.AbstractC5959j.ticket_delivery_input_cellphone_number_warning
            java.lang.String r3 = r7.b(r3)
            goto L62
        L58:
            if (r2 != r4) goto L61
            int r3 = n4.AbstractC5959j.ticket_delivery_input_email_warning
            java.lang.String r3 = r7.b(r3)
            goto L62
        L61:
            r3 = 0
        L62:
            boolean r4 = z4.N.isNull(r3)
            if (r4 == 0) goto L7d
            g6.a r3 = r7.f29587b
            boolean r3 = z4.C6630d.isNotNull(r3)
            if (r3 == 0) goto L98
            g6.a r3 = r7.f29587b
            r3.requestMemberQuery(r0, r1, r2)
            if (r2 != r5) goto L98
            android.widget.EditText r0 = r7.f29591f
            r0.setText(r1)
            goto L98
        L7d:
            android.content.Context r0 = r7.getContext()
            int r1 = n4.AbstractC5959j.dialog_title
            java.lang.String r1 = r7.b(r1)
            r2 = 1001(0x3e9, float:1.403E-42)
            s4.c r0 = z4.C6637k.getCDialog(r0, r2, r6, r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r3}
            s4.c r0 = r0.setContent(r1)
            r0.showDialog()
        L98:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.korail.talk.viewGroup.TicketDeliveryMember.j():void");
    }

    private void k() {
        findViewById(AbstractC5955f.memQueryBtn).setOnClickListener(this);
        findViewById(AbstractC5955f.deliveryBtn).setOnClickListener(this);
        findViewById(AbstractC5955f.memberNoRadio).setOnClickListener(this);
        findViewById(AbstractC5955f.cellNoRadio).setOnClickListener(this);
        findViewById(AbstractC5955f.emailRadio).setOnClickListener(this);
        this.f29590e.addTextChangedListener(new a());
    }

    private void l() {
        View.inflate(getContext(), AbstractC5957h.ticket_delivery_member_view, this);
        this.f29588c = (RadioGroup) findViewById(AbstractC5955f.memVeriTypeGroup);
        this.f29589d = (EditText) findViewById(AbstractC5955f.nameEdit);
        this.f29590e = (EditText) findViewById(AbstractC5955f.memQueryEdit);
        this.f29591f = (EditText) findViewById(AbstractC5955f.recCellNoEdit);
        this.f29592g = (TextView) findViewById(AbstractC5955f.noticeMsg0);
        this.f29593h = (Button) findViewById(AbstractC5955f.deliveryBtn);
    }

    protected void h() {
        l();
        k();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        P.hideIME(getContext(), view);
        int id = view.getId();
        if (AbstractC5955f.memQueryBtn == id) {
            j();
            return;
        }
        if (AbstractC5955f.deliveryBtn == id) {
            i();
            return;
        }
        if (AbstractC5955f.memberNoRadio == id) {
            this.f29590e.setInputType(2);
        } else if (AbstractC5955f.cellNoRadio == id) {
            this.f29590e.setInputType(3);
        } else if (AbstractC5955f.emailRadio == id) {
            this.f29590e.setInputType(32);
        }
    }

    public void setBottomMessage(int i8) {
        this.f29593h.setText(i8);
    }

    public void setCustomerNo(String str) {
        this.f29586a = str;
    }

    public void setHistoryData(String str, String str2, String str3, String str4) {
        this.f29589d.setText(str);
        this.f29588c.check(AbstractC5955f.memberNoRadio);
        this.f29590e.setText(str2);
        this.f29591f.setText(str3);
        this.f29586a = str4;
    }

    public void setITicketDelivery(InterfaceC5558a interfaceC5558a) {
        this.f29587b = interfaceC5558a;
    }

    public void setName(String str) {
        this.f29589d.setText(str);
    }

    public void setNoticeMessage(int i8) {
        this.f29592g.setText(i8);
    }

    public TicketDeliveryMember(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        h();
    }
}
