package com.korail.talk.view.payment.discount.sub;

import android.content.Context;
import android.content.res.Resources;
import android.text.style.UnderlineSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import com.korail.talk.data.DiscountObjectData;
import com.korail.talk.view.payment.discount.sub.DiscountDropDownSelector;
import g5.e;
import java.util.ArrayList;
import java.util.List;
import m4.C5908a;
import n4.AbstractC5952c;
import n4.AbstractC5955f;
import n4.AbstractC5956g;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import y6.C6550j;
import z4.C6630d;
import z4.C6637k;
import z4.H;
import z4.N;
import z4.P;

/* loaded from: classes.dex */
public class NationalMeritPersonDiscount extends C6550j implements View.OnClickListener {
    public static final int NOT_SELECT = -1;

    /* renamed from: f */
    private String f29458f;

    /* renamed from: g */
    private List f29459g;

    /* renamed from: h */
    private a f29460h;

    /* renamed from: i */
    private b f29461i;

    /* renamed from: j */
    private c f29462j;

    /* renamed from: k */
    private TextView f29463k;

    /* renamed from: l */
    private TextView f29464l;

    /* renamed from: m */
    private ViewGroup f29465m;

    /* renamed from: n */
    private CheckBox f29466n;

    public interface a {
        void onCertify(int i8, String str, String str2, String str3);
    }

    public interface b {
        void OnCheckedChange();
    }

    public interface c {
        void onTargetSelect(int i8, int i9, DiscountObjectData discountObjectData);
    }

    public NationalMeritPersonDiscount(Context context) {
        super(context);
        g();
    }

    public /* synthetic */ void l(ViewGroup viewGroup, int i8, View view) {
        P.hideIME(getContext(), view);
        String text = N.getText((EditText) viewGroup.findViewById(AbstractC5955f.veteransNoEdit));
        String text2 = N.getText((EditText) viewGroup.findViewById(AbstractC5955f.pwdEdit));
        String text3 = N.getText((EditText) viewGroup.findViewById(AbstractC5955f.authNoEdit));
        if (text.length() != 8) {
            C6637k.getCDialog(getContext(), 1001, 1, b(AbstractC5959j.dialog_title)).setContent(b(AbstractC5959j.dc_merit_info_num_message)).showDialog();
            return;
        }
        if (text2.length() != 4) {
            C6637k.getCDialog(getContext(), 1001, 1, b(AbstractC5959j.dialog_title)).setContent(b(AbstractC5959j.dc_merit_pwd_num_message)).showDialog();
        } else if (text3.length() != 6) {
            C6637k.getCDialog(getContext(), 1001, 1, b(AbstractC5959j.dialog_title)).setContent(b(AbstractC5959j.dc_merit_cert_num_message)).showDialog();
        } else if (C6630d.isNotNull(this.f29460h)) {
            this.f29460h.onCertify(i8, text, text2, text3);
        }
    }

    public /* synthetic */ void m(CompoundButton compoundButton, boolean z8) {
        if (C6630d.isNotNull(this.f29461i)) {
            this.f29461i.OnCheckedChange();
        }
    }

    public /* synthetic */ void n(DiscountDropDownSelector discountDropDownSelector, int i8, DiscountDropDownSelector discountDropDownSelector2, int i9) {
        if (discountDropDownSelector.getSelectIndex() != i9 && C6630d.isNotNull(this.f29462j)) {
            this.f29462j.onTargetSelect(i8, i9, (DiscountObjectData) this.f29459g.get(i9));
        }
    }

    private void o() {
        findViewById(AbstractC5955f.headerView).setOnClickListener(this);
    }

    private void p() {
        this.f29463k = (TextView) findViewById(AbstractC5955f.headerTitleTxt);
        this.f29464l = (TextView) findViewById(AbstractC5955f.headerValTxt);
        this.f29465m = (ViewGroup) findViewById(AbstractC5955f.inputContainer);
        findViewById(AbstractC5955f.inputAddBtn).setVisibility(8);
    }

    private void setText() {
        this.f29463k.setText(b(AbstractC5959j.payment_national_merit_person_discount));
        this.f29464l.setText(e.STATE_NAME_NONE);
    }

    public void addInputView(Context context) {
        final int childCount = this.f29465m.getChildCount();
        final ViewGroup viewGroup = (ViewGroup) View.inflate(getContext(), AbstractC5957h.national_merit_person_discount_input, null);
        this.f29465m.addView(viewGroup);
        viewGroup.findViewById(AbstractC5955f.divider).setVisibility(childCount > 1 ? 0 : 8);
        final DiscountDropDownSelector discountDropDownSelector = (DiscountDropDownSelector) viewGroup.findViewById(AbstractC5955f.targetSelector);
        discountDropDownSelector.setDropDownData(this.f29458f, this.f29459g, -1);
        discountDropDownSelector.setEnabled(false);
        viewGroup.findViewById(AbstractC5955f.veteranNoQueryBtn).setOnClickListener(new View.OnClickListener() { // from class: v6.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f37312a.l(viewGroup, childCount, view);
            }
        });
        ((RadioButton) viewGroup.findViewById(AbstractC5955f.freeRadio)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: v6.p
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z8) {
                this.f37315a.m(compoundButton, z8);
            }
        });
        discountDropDownSelector.setOnSelectorItemClickListener(new DiscountDropDownSelector.b() { // from class: v6.q
            @Override // com.korail.talk.view.payment.discount.sub.DiscountDropDownSelector.b
            public final void onItemSelected(DiscountDropDownSelector discountDropDownSelector2, int i8) {
                this.f37316a.n(discountDropDownSelector, childCount, discountDropDownSelector2, i8);
            }
        });
        ((EditText) viewGroup.findViewById(AbstractC5955f.veteransNoEdit)).setText(C5908a.decryptAES(context, H.getString(getContext(), "보훈번호")));
        this.f29466n = (CheckBox) findViewById(AbstractC5955f.cb_merit_person);
        TextView textView = (TextView) viewGroup.findViewById(AbstractC5955f.tv_merit_person);
        textView.setText(N.applySpannable("개인정보 수집 및 이용 동의", new UnderlineSpan()));
        textView.setOnClickListener(this);
    }

    protected void g() {
        setAsMainOption(false);
        View.inflate(getContext(), AbstractC5957h.add_discount_sub_option, this);
        p();
        p();
        setText();
        o();
    }

    public String getCoupon(int i8) {
        return (String) ((ViewGroup) this.f29465m.getChildAt(i8)).getTag(AbstractC5955f.coupon_no);
    }

    public int getInputViewCount() {
        return this.f29465m.getChildCount();
    }

    public boolean getIsFee(int i8) {
        return ((RadioButton) this.f29465m.getChildAt(i8).findViewById(AbstractC5955f.freeRadio)).isChecked();
    }

    public ArrayList<Integer> getTargetData() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i8 = 0; i8 < this.f29465m.getChildCount(); i8++) {
            ViewGroup viewGroup = (ViewGroup) this.f29465m.getChildAt(i8);
            arrayList.add(Integer.valueOf(C6630d.isNotNull(viewGroup.getTag(AbstractC5955f.index_target)) ? ((Integer) viewGroup.getTag(AbstractC5955f.index_target)).intValue() : -1));
        }
        return arrayList;
    }

    public boolean isCheck() {
        return this.f29466n.isChecked();
    }

    public boolean isEnableTarget(int i8) {
        for (int i9 = 0; i9 < getInputViewCount(); i9++) {
            ViewGroup viewGroup = (ViewGroup) this.f29465m.getChildAt(i9);
            if (C6630d.isNotNull(viewGroup.getTag(AbstractC5955f.index_target)) && i8 == ((Integer) viewGroup.getTag(AbstractC5955f.index_target)).intValue()) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (AbstractC5955f.headerView == id) {
            onHeaderClick();
        } else if (AbstractC5955f.tv_merit_person == id) {
            C6637k.getPDialog(getContext(), 1001, 1, b(AbstractC5959j.dialog_payment_private_collection_title)).setStringArray(d(AbstractC5952c.private_collection_merit)).showDialog();
        }
    }

    public void setCheck(boolean z8) {
        this.f29466n.setChecked(z8);
    }

    public void setCoupon(int i8, String str) throws Resources.NotFoundException {
        ViewGroup viewGroup = (ViewGroup) this.f29465m.getChildAt(i8);
        viewGroup.setTag(AbstractC5955f.coupon_no, str);
        ((TextView) viewGroup.findViewById(AbstractC5955f.veteransNoEdit)).setText(str.substring(str.length() - getResources().getInteger(AbstractC5956g.nation_merit_person_discount_max_length)));
    }

    public void setEnableTargetSelect(int i8) {
        ViewGroup viewGroup = (ViewGroup) this.f29465m.getChildAt(i8);
        viewGroup.findViewById(AbstractC5955f.discountRadio).setEnabled(true);
        viewGroup.findViewById(AbstractC5955f.freeRadio).setEnabled(true);
        ((RadioButton) viewGroup.findViewById(AbstractC5955f.freeRadio)).setChecked(true);
        viewGroup.findViewById(AbstractC5955f.targetSelector).setEnabled(true);
    }

    public void setEntries(String str, List<DiscountObjectData> list) {
        this.f29458f = str;
        this.f29459g = list;
    }

    public void setOnCertifyListener(a aVar) {
        this.f29460h = aVar;
    }

    public void setOnCheckedChangeListener(b bVar) {
        this.f29461i = bVar;
    }

    public void setTargetIndex(int i8, int i9, int i10) {
        ViewGroup viewGroup = (ViewGroup) this.f29465m.getChildAt(i8);
        viewGroup.setTag(AbstractC5955f.index_target, Integer.valueOf(i10));
        DiscountDropDownSelector discountDropDownSelector = (DiscountDropDownSelector) viewGroup.findViewById(AbstractC5955f.targetSelector);
        discountDropDownSelector.setSelectIndex(i9);
        discountDropDownSelector.setEnabled(true);
    }

    public void setTargetSelectListener(c cVar) {
        this.f29462j = cVar;
    }

    public void updateTargets(List<DiscountObjectData> list) {
        this.f29459g = list;
        for (int i8 = 0; i8 < getInputViewCount(); i8++) {
            ((DiscountDropDownSelector) ((ViewGroup) this.f29465m.getChildAt(i8)).findViewById(AbstractC5955f.targetSelector)).setDropDownData(list);
        }
    }

    public NationalMeritPersonDiscount(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g();
    }

    public void setEnableTargetSelect(int i8, boolean z8) {
        ViewGroup viewGroup = (ViewGroup) this.f29465m.getChildAt(i8);
        viewGroup.findViewById(AbstractC5955f.discountRadio).setEnabled(true);
        viewGroup.findViewById(AbstractC5955f.freeRadio).setEnabled(true);
        ((RadioButton) viewGroup.findViewById(z8 ? AbstractC5955f.discountRadio : AbstractC5955f.freeRadio)).setChecked(true);
        viewGroup.findViewById(AbstractC5955f.targetSelector).setEnabled(true);
    }
}
