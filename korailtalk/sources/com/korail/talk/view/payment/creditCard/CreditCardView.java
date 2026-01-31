package com.korail.talk.view.payment.creditCard;

import android.content.Context;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.style.UnderlineSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.korail.talk.viewGroup.DropDownSelector;
import g5.e;
import java.util.ArrayList;
import n4.AbstractC5952c;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import r4.h;
import w4.C6467a;
import x4.C6491a;
import y6.C6542b;
import z4.C6627a;
import z4.C6634h;
import z4.C6637k;
import z4.N;
import z4.t;

/* loaded from: classes.dex */
public class CreditCardView extends C6542b implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private final int f29360a;

    /* renamed from: b, reason: collision with root package name */
    private final int f29361b;

    /* renamed from: c, reason: collision with root package name */
    private ArrayList f29362c;

    /* renamed from: d, reason: collision with root package name */
    private Bundle f29363d;

    /* renamed from: e, reason: collision with root package name */
    private View f29364e;

    /* renamed from: f, reason: collision with root package name */
    private CheckBox f29365f;

    /* renamed from: g, reason: collision with root package name */
    private DropDownSelector f29366g;

    /* renamed from: h, reason: collision with root package name */
    private DropDownSelector f29367h;

    /* renamed from: i, reason: collision with root package name */
    private EditText f29368i;

    /* renamed from: j, reason: collision with root package name */
    private EditText f29369j;

    /* renamed from: k, reason: collision with root package name */
    private EditText f29370k;

    /* renamed from: l, reason: collision with root package name */
    private EditText f29371l;

    /* renamed from: m, reason: collision with root package name */
    private EditText f29372m;

    /* renamed from: n, reason: collision with root package name */
    private EditText f29373n;

    /* renamed from: o, reason: collision with root package name */
    private EditText f29374o;

    /* renamed from: p, reason: collision with root package name */
    private EditText f29375p;

    /* renamed from: q, reason: collision with root package name */
    private RadioGroup f29376q;

    /* renamed from: r, reason: collision with root package name */
    private TextView f29377r;

    /* renamed from: s, reason: collision with root package name */
    private CheckBox f29378s;

    /* renamed from: t, reason: collision with root package name */
    private final DropDownSelector.b f29379t;

    /* renamed from: u, reason: collision with root package name */
    private final RadioGroup.OnCheckedChangeListener f29380u;

    /* renamed from: v, reason: collision with root package name */
    private c f29381v;

    class a implements DropDownSelector.b {
        a() {
        }

        @Override // com.korail.talk.viewGroup.DropDownSelector.b
        public void onItemSelected(DropDownSelector dropDownSelector, int i8) {
            t.d("onItemSelected() selected index: " + i8 + " / item: " + dropDownSelector.getSelectItem());
            try {
                if (i8 > CreditCardView.this.f29362c.size() - 1) {
                    return;
                }
                Bundle bundle = (Bundle) CreditCardView.this.f29362c.get(i8);
                if (i8 >= CreditCardView.this.f29362c.size() - 1) {
                    CreditCardView.this.clearInput();
                    CreditCardView.this.f29363d = null;
                    return;
                }
                String[] strArrSplit = bundle.getString("CARD_NO").split(e.STATE_NAME_NONE);
                CreditCardView.this.f29368i.setText(strArrSplit[0]);
                CreditCardView.this.f29369j.setText(strArrSplit[1]);
                CreditCardView.this.f29370k.setText(strArrSplit[2]);
                CreditCardView.this.f29371l.setText(strArrSplit[3]);
                CreditCardView.this.f29372m.setText(bundle.getString("CARD_MONTH"));
                CreditCardView.this.f29373n.setText(bundle.getString("CARD_YEAR"));
                CreditCardView.this.f29367h.setEnabled(true);
                CreditCardView.this.f29374o.setText((CharSequence) null);
                CreditCardView.this.f29376q.check(AbstractC5955f.normalCardRadio);
                CreditCardView.this.f29375p.setText((CharSequence) null);
                String string = bundle.getString("CARD_TYPE");
                if (string != null && string.equals("1")) {
                    CreditCardView.this.f29376q.check(AbstractC5955f.corporateCardRadio);
                    String string2 = bundle.getString("CARD_BUSINESS_NUMBER");
                    if (string2 != null) {
                        CreditCardView.this.f29375p.setText(string2);
                    }
                }
                CreditCardView.this.f29363d = bundle;
            } catch (Exception e8) {
                t.e(e8.getMessage());
            }
        }
    }

    class b implements RadioGroup.OnCheckedChangeListener {

        class a extends InputFilter.LengthFilter {
            a(int i8) {
                super(i8);
            }
        }

        /* renamed from: com.korail.talk.view.payment.creditCard.CreditCardView$b$b, reason: collision with other inner class name */
        class C0262b extends InputFilter.LengthFilter {
            C0262b(int i8) {
                super(i8);
            }
        }

        b() {
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i8) {
            t.d("onCheckedChanged(): " + i8);
            if (i8 == AbstractC5955f.normalCardRadio) {
                CreditCardView.this.f29375p.setFilters(new InputFilter[]{new a(6)});
                CreditCardView.this.f29375p.setText("");
                ((TextView) CreditCardView.this.findViewById(AbstractC5955f.authNoHint)).setText(CreditCardView.this.b(AbstractC5959j.payment_social_number_6));
            } else if (i8 == AbstractC5955f.corporateCardRadio) {
                CreditCardView.this.f29375p.setFilters(new InputFilter[]{new C0262b(10)});
                CreditCardView.this.f29375p.setText("");
                ((TextView) CreditCardView.this.findViewById(AbstractC5955f.authNoHint)).setText(CreditCardView.this.b(AbstractC5959j.payment_card_pay_hint));
            }
        }
    }

    public interface c {
        void onCardScan(String str);
    }

    public CreditCardView(Context context) {
        super(context);
        this.f29360a = 6;
        this.f29361b = 10;
        this.f29379t = new a();
        this.f29380u = new b();
        w();
    }

    private void setText() {
        this.f29377r.setText(N.applySpannable("개인정보 수집 및 이용 동의", new UnderlineSpan()));
    }

    private void u() {
        this.f29374o.addTextChangedListener(new C6491a(2, this.f29375p));
        this.f29373n.addTextChangedListener(new C6491a(4, this.f29374o));
        this.f29372m.addTextChangedListener(new C6491a(2, this.f29373n));
        this.f29371l.addTextChangedListener(new C6491a(4, this.f29372m));
        this.f29370k.addTextChangedListener(new C6491a(4, this.f29371l));
        this.f29369j.addTextChangedListener(new C6491a(4, this.f29370k));
        this.f29368i.addTextChangedListener(new C6491a(4, this.f29369j));
    }

    private void v() {
        String[] strArr = new String[h.values().length];
        int i8 = 0;
        for (h hVar : h.values()) {
            strArr[i8] = hVar.getName();
            i8++;
        }
        this.f29367h.setEntries(strArr, (String[]) null, 0);
    }

    private void w() {
        x();
        z();
        setText();
        y();
        v();
    }

    private void x() {
        this.f29362c = new ArrayList();
    }

    private void y() {
        this.f29366g.setOnSelectorItemClickListener(this.f29379t);
        this.f29376q.setOnCheckedChangeListener(this.f29380u);
        findViewById(AbstractC5955f.resetBtn).setOnClickListener(this);
        this.f29377r.setOnClickListener(this);
        u();
        findViewById(AbstractC5955f.cardScanBtn).setOnClickListener(this);
    }

    private void z() {
        View.inflate(getContext(), AbstractC5957h.credit_card_input, this);
        this.f29364e = findViewById(AbstractC5955f.cardAddView);
        this.f29365f = (CheckBox) findViewById(AbstractC5955f.addCardCheck);
        this.f29366g = (DropDownSelector) findViewById(AbstractC5955f.cardSelector);
        this.f29367h = (DropDownSelector) findViewById(AbstractC5955f.installPlanSelector);
        this.f29368i = (EditText) findViewById(AbstractC5955f.cardNoEdit0);
        this.f29369j = (EditText) findViewById(AbstractC5955f.cardNoEdit1);
        this.f29370k = (EditText) findViewById(AbstractC5955f.cardNoEdit2);
        this.f29371l = (EditText) findViewById(AbstractC5955f.cardNoEdit3);
        this.f29372m = (EditText) findViewById(AbstractC5955f.cardMonthEdit);
        this.f29373n = (EditText) findViewById(AbstractC5955f.cardYearEdit);
        this.f29374o = (EditText) findViewById(AbstractC5955f.cardPwdEdit);
        this.f29375p = (EditText) findViewById(AbstractC5955f.authNoEdit);
        RadioGroup radioGroup = (RadioGroup) findViewById(AbstractC5955f.cardCateGroup);
        this.f29376q = radioGroup;
        radioGroup.check(AbstractC5955f.normalCardRadio);
        this.f29378s = (CheckBox) findViewById(AbstractC5955f.cb_credit_card_input);
        this.f29377r = (TextView) findViewById(AbstractC5955f.tv_credit_card_input);
        this.f29374o.setTransformationMethod(new C6467a());
        this.f29370k.setTransformationMethod(new C6467a());
        this.f29369j.setTransformationMethod(new C6467a());
        C6627a.setEditTextDescription(getContext().getApplicationContext(), this.f29368i, b(AbstractC5959j.description_card_input_0));
        C6627a.setEditTextDescription(getContext().getApplicationContext(), this.f29369j, b(AbstractC5959j.description_card_input_1));
        C6627a.setEditTextDescription(getContext().getApplicationContext(), this.f29370k, b(AbstractC5959j.description_card_input_2));
        C6627a.setEditTextDescription(getContext().getApplicationContext(), this.f29371l, b(AbstractC5959j.description_card_input_3));
        C6627a.setEditTextDescription(getContext().getApplicationContext(), this.f29372m, b(AbstractC5959j.description_card_mm));
        C6627a.setEditTextDescription(getContext().getApplicationContext(), this.f29373n, b(AbstractC5959j.description_card_yyyy));
        C6627a.setEditTextDescription(getContext().getApplicationContext(), this.f29374o, b(AbstractC5959j.description_card_pw));
    }

    public synchronized void clearInput() {
        this.f29368i.setText((CharSequence) null);
        this.f29369j.setText((CharSequence) null);
        this.f29370k.setText((CharSequence) null);
        this.f29371l.setText((CharSequence) null);
        this.f29372m.setText((CharSequence) null);
        this.f29373n.setText((CharSequence) null);
        this.f29374o.setText((CharSequence) null);
        this.f29376q.check(AbstractC5955f.normalCardRadio);
        this.f29375p.setText((CharSequence) null);
        this.f29367h.setDropDownIndex(0);
        this.f29368i.requestFocus();
    }

    public Bundle getCreditCardInputData() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f29363d;
        if (bundle2 != null) {
            bundle.putString("CARD_NICK_NAME", bundle2.getString("CARD_NICK_NAME"));
        }
        bundle.putString("CARD_NO", e(this.f29368i) + e(this.f29369j) + e(this.f29370k) + e(this.f29371l));
        bundle.putString("CARD_MONTH", e(this.f29372m));
        bundle.putString("CARD_YEAR", e(this.f29373n));
        bundle.putString("CARD_PASSWORD", e(this.f29374o));
        bundle.putBoolean("IS_NOMAL_CARD", this.f29376q.getCheckedRadioButtonId() == AbstractC5955f.normalCardRadio);
        bundle.putString("AUTH_NO", e(this.f29375p));
        bundle.putInt("INSTALLMENT_PERIOD", this.f29367h.getSelectIndex());
        return bundle;
    }

    public boolean isCardAdd() {
        return this.f29365f.isChecked();
    }

    public boolean isCardAddViewVisible() {
        return this.f29364e.getVisibility() == 0;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (AbstractC5955f.resetBtn == id) {
            clearInput();
        } else if (AbstractC5955f.tv_credit_card_input == id) {
            C6637k.getPDialog(getContext(), 1001, 1, b(AbstractC5959j.dialog_payment_private_collection_title)).setStringArray(d(AbstractC5952c.private_collection_payment)).showDialog();
        } else if (AbstractC5955f.cardScanBtn == id) {
            this.f29381v.onCardScan("cardScan");
        }
    }

    public void setCardNoEnable(boolean z8) {
        this.f29368i.setEnabled(z8);
        this.f29369j.setEnabled(z8);
        this.f29370k.setEnabled(z8);
        this.f29371l.setEnabled(z8);
        this.f29366g.setEnabled(z8);
        if (z8) {
            return;
        }
        this.f29374o.requestFocus();
    }

    public void setCreditCardInput(Bundle bundle) {
        setCreditCardInput(bundle.getString("CARD_NO_1"), bundle.getString("CARD_NO_2"), bundle.getString("CARD_NO_3"), bundle.getString("CARD_NO_4"), bundle.getString("CARD_YEAR"), bundle.getString("CARD_MONTH"));
    }

    public synchronized void setCreditCardList(ArrayList<Bundle> arrayList) {
        if (arrayList != null) {
            try {
                if (!arrayList.isEmpty()) {
                    try {
                        Bundle bundle = new Bundle();
                        bundle.putString("CARD_NICK_NAME", b(AbstractC5959j.payment_direct_input_plus));
                        bundle.putBoolean("IS_NOMAL_CARD", true);
                        bundle.putStringArray("INSTALLMENT_PERIOD", new String[]{b(AbstractC5959j.payment_lump_sum)});
                        arrayList.add(bundle);
                        String[] strArr = new String[arrayList.size()];
                        for (int i8 = 0; i8 < arrayList.size(); i8++) {
                            strArr[i8] = arrayList.get(i8).getString("CARD_NICK_NAME");
                        }
                        this.f29366g.setEntries(strArr, (String[]) null, 0);
                        this.f29366g.setEnabled(true);
                        this.f29362c.clear();
                        this.f29362c.addAll(arrayList);
                        this.f29364e.setVisibility(8);
                        this.f29379t.onItemSelected(this.f29366g, 0);
                    } catch (Exception e8) {
                        t.e(e8.getMessage());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void setNoCreditCard() {
        try {
            this.f29366g.setEntries(new String[]{b(AbstractC5959j.payment_no_saved_card)}, (String[]) null, 0);
            this.f29366g.setEnabled(false);
            this.f29362c.clear();
            this.f29363d = null;
            this.f29364e.setVisibility(0);
        } catch (Exception e8) {
            t.e(e8.getMessage());
        }
    }

    public void setScanCallback(c cVar) {
        this.f29381v = cVar;
    }

    public void setSelectedIndex(int i8) {
        this.f29366g.setDropDownIndex(i8);
    }

    public int validate() {
        String strE = e(this.f29375p);
        if (e(this.f29368i).length() == 0) {
            int i8 = AbstractC5959j.payment_card_num_message;
            this.f29368i.requestFocus();
            return i8;
        }
        if (e(this.f29369j).length() == 0) {
            int i9 = AbstractC5959j.payment_card_num_message;
            this.f29369j.requestFocus();
            return i9;
        }
        if (e(this.f29370k).length() == 0) {
            int i10 = AbstractC5959j.payment_card_num_message;
            this.f29370k.requestFocus();
            return i10;
        }
        if (e(this.f29371l).length() == 0) {
            int i11 = AbstractC5959j.payment_card_num_message;
            this.f29371l.requestFocus();
            return i11;
        }
        if (e(this.f29372m).length() != 2) {
            int i12 = AbstractC5959j.payment_valid_date_message1;
            this.f29372m.requestFocus();
            return i12;
        }
        if (C6634h.isInValidMonth(e(this.f29372m))) {
            int i13 = AbstractC5959j.payment_valid_date_message2;
            this.f29372m.requestFocus();
            return i13;
        }
        if (e(this.f29373n).length() != 4) {
            int i14 = AbstractC5959j.payment_valid_date_message3;
            this.f29373n.requestFocus();
            return i14;
        }
        if (C6634h.isInValidYear(e(this.f29373n))) {
            int i15 = AbstractC5959j.payment_valid_date_message4;
            this.f29373n.requestFocus();
            return i15;
        }
        if (e(this.f29374o).length() != 2) {
            int i16 = AbstractC5959j.payment_password_message2;
            this.f29374o.requestFocus();
            return i16;
        }
        if (this.f29376q.getCheckedRadioButtonId() == AbstractC5955f.normalCardRadio && strE.length() != 6) {
            int i17 = AbstractC5959j.payment_cert_num_message;
            this.f29375p.requestFocus();
            return i17;
        }
        if (this.f29376q.getCheckedRadioButtonId() != AbstractC5955f.corporateCardRadio || strE.length() == 10) {
            if (this.f29378s.isChecked()) {
                return -1;
            }
            return AbstractC5959j.dialog_payment_msg;
        }
        int i18 = AbstractC5959j.payment_biz_num_message;
        this.f29375p.requestFocus();
        return i18;
    }

    public CreditCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29360a = 6;
        this.f29361b = 10;
        this.f29379t = new a();
        this.f29380u = new b();
        w();
    }

    public void setCreditCardInput(String str, String str2, String str3, String str4, String str5, String str6) {
        String str7 = str + e.STATE_NAME_NONE + str2 + e.STATE_NAME_NONE + str3 + e.STATE_NAME_NONE + str4;
        int i8 = 0;
        while (true) {
            if (i8 >= this.f29362c.size()) {
                i8 = -1;
                break;
            } else if (str7.equals(((Bundle) this.f29362c.get(i8)).getString("CARD_NO"))) {
                break;
            } else {
                i8++;
            }
        }
        if (i8 == -1) {
            this.f29366g.setDropDownIndex(this.f29362c.isEmpty() ? 0 : this.f29362c.size() - 1);
            this.f29368i.setText(str);
            this.f29369j.setText(str2);
            this.f29370k.setText(str3);
            this.f29371l.setText(str4);
            this.f29373n.setText(str5);
            this.f29372m.setText(str6);
            return;
        }
        this.f29366g.setDropDownIndex(i8);
    }
}
