package com.korail.talk.view.payment.discount.sub;

import I4.h;
import android.content.Context;
import android.text.style.UnderlineSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import com.korail.talk.data.DiscountObjectData;
import com.korail.talk.view.payment.discount.sub.DiscountDropDownSelector;
import g5.e;
import java.util.ArrayList;
import java.util.List;
import n4.AbstractC5952c;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import y6.C6550j;
import z4.C6630d;
import z4.C6637k;
import z4.N;
import z4.P;

/* loaded from: classes.dex */
public class CongresspersonDiscountOption extends C6550j implements View.OnClickListener {
    public static final int NOT_SELECT = -1;

    /* renamed from: f */
    private String f29401f;

    /* renamed from: g */
    private List f29402g;

    /* renamed from: h */
    private a f29403h;

    /* renamed from: i */
    private b f29404i;

    /* renamed from: j */
    private TextView f29405j;

    /* renamed from: k */
    private TextView f29406k;

    /* renamed from: l */
    private TextView f29407l;

    /* renamed from: m */
    private ViewGroup f29408m;

    /* renamed from: n */
    private CheckBox f29409n;

    public interface a {
        void onCertify(int i8, String str, String str2);
    }

    public interface b {
        void onTargetSelect(int i8, int i9, DiscountObjectData discountObjectData);
    }

    public CongresspersonDiscountOption(Context context) {
        super(context);
        g();
    }

    public /* synthetic */ void k(ViewGroup viewGroup, int i8, View view) {
        P.hideIME(getContext(), view);
        String text = N.getText((EditText) viewGroup.findViewById(AbstractC5955f.veteransNoEdit));
        String text2 = N.getText((EditText) viewGroup.findViewById(AbstractC5955f.authNoEdit));
        if (text.length() != 10 || text2.length() != 6) {
            C6637k.getCDialog(getContext(), 1001, 1, b(AbstractC5959j.dialog_title)).setContent(b(AbstractC5959j.dc_national_assembly_congressperson_info_num_message)).showDialog();
        } else if (C6630d.isNotNull(this.f29403h)) {
            this.f29403h.onCertify(i8, text, text2);
        }
    }

    public /* synthetic */ void l(DiscountDropDownSelector discountDropDownSelector, int i8, DiscountDropDownSelector discountDropDownSelector2, int i9) {
        if (discountDropDownSelector.getSelectIndex() != i9 && C6630d.isNotNull(this.f29404i)) {
            this.f29404i.onTargetSelect(i8, i9, (DiscountObjectData) this.f29402g.get(i9));
        }
    }

    private void m() {
        findViewById(AbstractC5955f.headerView).setOnClickListener(this);
        this.f29407l.setOnClickListener(this);
    }

    private void n() {
        this.f29405j = (TextView) findViewById(AbstractC5955f.headerTitleTxt);
        this.f29406k = (TextView) findViewById(AbstractC5955f.headerValTxt);
        this.f29408m = (ViewGroup) findViewById(AbstractC5955f.inputContainer);
        this.f29409n = (CheckBox) findViewById(AbstractC5955f.cb_add_congressperson);
        this.f29407l = (TextView) findViewById(AbstractC5955f.tv_add_congressperson);
    }

    private void setText() {
        this.f29405j.setText(b(AbstractC5959j.payment_national_congressperson_discount));
        this.f29406k.setText(e.STATE_NAME_NONE);
        this.f29407l.setText(N.applySpannable("개인정보 수집 및 이용 동의", new UnderlineSpan()));
    }

    public void addInputView() {
        final int childCount = this.f29408m.getChildCount();
        final ViewGroup viewGroup = (ViewGroup) View.inflate(getContext(), AbstractC5957h.congressperson_discount_input, null);
        this.f29408m.addView(viewGroup);
        viewGroup.findViewById(AbstractC5955f.divider).setVisibility(childCount > 1 ? 0 : 8);
        final DiscountDropDownSelector discountDropDownSelector = (DiscountDropDownSelector) viewGroup.findViewById(AbstractC5955f.targetSelector);
        discountDropDownSelector.setDropDownData(this.f29401f, this.f29402g, -1);
        discountDropDownSelector.setEnabled(false);
        viewGroup.findViewById(AbstractC5955f.veteranNoQueryBtn).setOnClickListener(new View.OnClickListener() { // from class: v6.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f37281a.k(viewGroup, childCount, view);
            }
        });
        discountDropDownSelector.setOnSelectorItemClickListener(new DiscountDropDownSelector.b() { // from class: v6.e
            @Override // com.korail.talk.view.payment.discount.sub.DiscountDropDownSelector.b
            public final void onItemSelected(DiscountDropDownSelector discountDropDownSelector2, int i8) {
                this.f37284a.l(discountDropDownSelector, childCount, discountDropDownSelector2, i8);
            }
        });
        String memberNum = h.getInstance().getMemberNum();
        ((EditText) viewGroup.findViewById(AbstractC5955f.veteransNoEdit)).setText(memberNum);
        if (N.isNotNull(memberNum)) {
            viewGroup.findViewById(AbstractC5955f.veteransNoEdit).setEnabled(false);
        }
    }

    protected void g() {
        setAsMainOption(false);
        setAutoExpand(true);
        View.inflate(getContext(), AbstractC5957h.add_congressperson_sub_option, this);
        n();
        setText();
        m();
    }

    public String getCoupon(int i8) {
        return (String) ((ViewGroup) this.f29408m.getChildAt(i8)).getTag(AbstractC5955f.coupon_no);
    }

    public int getInputViewCount() {
        return this.f29408m.getChildCount();
    }

    public ArrayList<Integer> getTargetIndexArray() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i8 = 0; i8 < this.f29408m.getChildCount(); i8++) {
            ViewGroup viewGroup = (ViewGroup) this.f29408m.getChildAt(i8);
            arrayList.add(Integer.valueOf(C6630d.isNotNull(viewGroup.getTag(AbstractC5955f.index_target)) ? ((Integer) viewGroup.getTag(AbstractC5955f.index_target)).intValue() : -1));
        }
        return arrayList;
    }

    public boolean isCheck() {
        return this.f29409n.isChecked();
    }

    public boolean isEnableTarget(int i8) {
        for (int i9 = 0; i9 < getInputViewCount(); i9++) {
            ViewGroup viewGroup = (ViewGroup) this.f29408m.getChildAt(i9);
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
        } else if (AbstractC5955f.tv_add_congressperson == id) {
            C6637k.getPDialog(getContext(), 1001, 1, b(AbstractC5959j.dialog_payment_private_collection_title)).setStringArray(d(AbstractC5952c.private_collection_congress)).showDialog();
        }
    }

    public void setCheck(boolean z8) {
        this.f29409n.setChecked(z8);
    }

    public void setCoupon(int i8, String str) {
        ((ViewGroup) this.f29408m.getChildAt(i8)).setTag(AbstractC5955f.coupon_no, str);
    }

    public void setEnableTargetSelect(int i8) {
        ((DiscountDropDownSelector) ((ViewGroup) this.f29408m.getChildAt(i8)).findViewById(AbstractC5955f.targetSelector)).setEnabled(true);
    }

    public void setEntries(String str, List<DiscountObjectData> list) {
        this.f29401f = str;
        this.f29402g = list;
    }

    public void setOnCertifyListener(a aVar) {
        this.f29403h = aVar;
    }

    public void setTargetIndex(int i8, int i9, int i10) {
        ViewGroup viewGroup = (ViewGroup) this.f29408m.getChildAt(i8);
        viewGroup.setTag(AbstractC5955f.index_target, Integer.valueOf(i10));
        DiscountDropDownSelector discountDropDownSelector = (DiscountDropDownSelector) viewGroup.findViewById(AbstractC5955f.targetSelector);
        discountDropDownSelector.setSelectIndex(i9);
        discountDropDownSelector.setEnabled(true);
    }

    public void setTargetSelectListener(b bVar) {
        this.f29404i = bVar;
    }

    public void updateTargets(List<DiscountObjectData> list) {
        this.f29402g = list;
        for (int i8 = 0; i8 < getInputViewCount(); i8++) {
            ((DiscountDropDownSelector) ((ViewGroup) this.f29408m.getChildAt(i8)).findViewById(AbstractC5955f.targetSelector)).setDropDownData(list);
        }
    }

    public CongresspersonDiscountOption(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g();
    }
}
