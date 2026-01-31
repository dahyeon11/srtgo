package com.korail.talk.view.payment.discount.sub;

import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.korail.talk.data.DiscountObjectData;
import com.korail.talk.view.payment.discount.sub.DiscountDropDownSelector;
import g5.e;
import java.util.ArrayList;
import java.util.List;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import s4.C6218b;
import y6.C6550j;
import z4.C6630d;
import z4.C6637k;
import z4.N;
import z4.t;

/* loaded from: classes.dex */
public class BusinessTripCoupon extends C6550j implements View.OnClickListener {
    public static final int NOT_SELECT = -1;

    /* renamed from: f */
    private String f29390f;

    /* renamed from: g */
    private String f29391g;

    /* renamed from: h */
    private List f29392h;

    /* renamed from: i */
    private List f29393i;

    /* renamed from: j */
    private b f29394j;

    /* renamed from: k */
    private a f29395k;

    /* renamed from: l */
    private c f29396l;

    /* renamed from: m */
    private TextView f29397m;

    /* renamed from: n */
    private TextView f29398n;

    /* renamed from: o */
    private ViewGroup f29399o;

    /* renamed from: p */
    private Button f29400p;

    public interface a {
        void onApplied(int i8, String str);
    }

    public interface b {
        void onCouponSelect();
    }

    public interface c {
        void onTargetSelect(int i8, int i9, DiscountObjectData discountObjectData);
    }

    public BusinessTripCoupon(Context context) {
        super(context);
        g();
    }

    public /* synthetic */ void l(int i8, DialogInterface dialogInterface, int i9, String str) {
        if (102 == i9 && C6630d.isNotNull(this.f29395k)) {
            this.f29395k.onApplied(i8, str);
        }
    }

    public /* synthetic */ void m(DiscountDropDownSelector discountDropDownSelector, final int i8, DiscountDropDownSelector discountDropDownSelector2, DiscountDropDownSelector discountDropDownSelector3, int i9) {
        if (discountDropDownSelector.getSelectIndex() == i9) {
            return;
        }
        if (i9 == discountDropDownSelector3.getDropDownSize() - 1) {
            ((C6218b) C6637k.getDialog(5, getContext(), 1002, 1, b(AbstractC5959j.dialog_business_trip_coupon_direct_input))).setDiscountButtonListener(new C6218b.c() { // from class: v6.c
                @Override // s4.C6218b.c
                public final void onClick(DialogInterface dialogInterface, int i10, String str) {
                    this.f37279a.l(i8, dialogInterface, i10, str);
                }
            }).setContent(b(AbstractC5959j.business_trip_coupon_input_pop_message)).setButtonNames(N.getStringArray(b(AbstractC5959j.common_cancel), b(AbstractC5959j.common_confirm))).showDialog();
            return;
        }
        if (i9 > 0) {
            discountDropDownSelector2.setEnabled(true);
        }
        setCouponIndex(i8, i9);
        if (C6630d.isNotNull(this.f29394j)) {
            this.f29394j.onCouponSelect();
        }
    }

    public /* synthetic */ void n(DiscountDropDownSelector discountDropDownSelector, int i8, DiscountDropDownSelector discountDropDownSelector2, int i9) {
        if (discountDropDownSelector.getSelectIndex() == i9) {
            return;
        }
        this.f29400p.setEnabled(i9 > 0);
        this.f29396l.onTargetSelect(i8, i9, (DiscountObjectData) this.f29393i.get(i9));
    }

    private void o() {
        findViewById(AbstractC5955f.headerView).setOnClickListener(this);
        this.f29400p.setOnClickListener(this);
    }

    private void p() {
        this.f29397m = (TextView) findViewById(AbstractC5955f.headerTitleTxt);
        this.f29398n = (TextView) findViewById(AbstractC5955f.headerValTxt);
        this.f29399o = (ViewGroup) findViewById(AbstractC5955f.inputContainer);
        this.f29400p = (Button) findViewById(AbstractC5955f.inputAddBtn);
    }

    private void setText() {
        this.f29397m.setText(b(AbstractC5959j.payment_employee_business_trip_coupon));
        this.f29398n.setText(e.STATE_NAME_NONE);
        this.f29400p.setText(b(AbstractC5959j.payment_employee_business_trip_coupon_add));
    }

    public void addInputView() {
        this.f29400p.setEnabled(false);
        final int inputViewCount = getInputViewCount();
        ViewGroup viewGroup = (ViewGroup) View.inflate(getContext(), AbstractC5957h.employee_business_trip_discount_input, null);
        this.f29399o.addView(viewGroup);
        viewGroup.findViewById(AbstractC5955f.divider).setVisibility(inputViewCount > 1 ? 0 : 8);
        ((TextView) viewGroup.findViewById(AbstractC5955f.couponTitle)).setText(AbstractC5959j.payment_employee_business_trip_discount_no_text);
        final DiscountDropDownSelector discountDropDownSelector = (DiscountDropDownSelector) viewGroup.findViewById(AbstractC5955f.couponSelector);
        discountDropDownSelector.setDropDownData(this.f29390f, this.f29392h, -1);
        final DiscountDropDownSelector discountDropDownSelector2 = (DiscountDropDownSelector) viewGroup.findViewById(AbstractC5955f.targetSelector);
        discountDropDownSelector2.setDropDownData(this.f29391g, this.f29393i, -1);
        discountDropDownSelector2.setEnabled(false);
        discountDropDownSelector.setOnSelectorItemClickListener(new DiscountDropDownSelector.b() { // from class: v6.a
            @Override // com.korail.talk.view.payment.discount.sub.DiscountDropDownSelector.b
            public final void onItemSelected(DiscountDropDownSelector discountDropDownSelector3, int i8) {
                this.f37272a.m(discountDropDownSelector, inputViewCount, discountDropDownSelector2, discountDropDownSelector3, i8);
            }
        });
        discountDropDownSelector2.setOnSelectorItemClickListener(new DiscountDropDownSelector.b() { // from class: v6.b
            @Override // com.korail.talk.view.payment.discount.sub.DiscountDropDownSelector.b
            public final void onItemSelected(DiscountDropDownSelector discountDropDownSelector3, int i8) {
                this.f37276a.n(discountDropDownSelector2, inputViewCount, discountDropDownSelector3, i8);
            }
        });
    }

    protected void g() {
        setAsMainOption(false);
        setAutoExpand(true);
        View.inflate(getContext(), AbstractC5957h.add_discount_sub_option, this);
        p();
        setText();
        o();
    }

    public ArrayList<Integer> getCouponData() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i8 = 0; i8 < getInputViewCount(); i8++) {
            ViewGroup viewGroup = (ViewGroup) this.f29399o.getChildAt(i8);
            arrayList.add(Integer.valueOf(C6630d.isNotNull(viewGroup.getTag(AbstractC5955f.index_coupon)) ? ((Integer) viewGroup.getTag(AbstractC5955f.index_coupon)).intValue() : -1));
        }
        return arrayList;
    }

    public List<DiscountObjectData> getCouponEntries() {
        return this.f29392h;
    }

    public int getCouponIndex(int i8) {
        ViewGroup viewGroup = (ViewGroup) this.f29399o.getChildAt(i8);
        if (C6630d.isNotNull(viewGroup.getTag(AbstractC5955f.index_coupon))) {
            return ((Integer) viewGroup.getTag(AbstractC5955f.index_coupon)).intValue();
        }
        return -1;
    }

    public int getInputViewCount() {
        return this.f29399o.getChildCount();
    }

    public ArrayList<Integer> getTargetData() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i8 = 0; i8 < getInputViewCount(); i8++) {
            ViewGroup viewGroup = (ViewGroup) this.f29399o.getChildAt(i8);
            arrayList.add(Integer.valueOf(C6630d.isNotNull(viewGroup.getTag(AbstractC5955f.index_target)) ? ((Integer) viewGroup.getTag(AbstractC5955f.index_target)).intValue() : -1));
        }
        return arrayList;
    }

    public int getTargetIndex(int i8) {
        ViewGroup viewGroup = (ViewGroup) this.f29399o.getChildAt(i8);
        if (C6630d.isNotNull(viewGroup.getTag(AbstractC5955f.index_target))) {
            return ((Integer) viewGroup.getTag(AbstractC5955f.index_target)).intValue();
        }
        return -1;
    }

    public boolean isEnableTarget(int i8) {
        for (int i9 = 0; i9 < getInputViewCount(); i9++) {
            ViewGroup viewGroup = (ViewGroup) this.f29399o.getChildAt(i9);
            if (viewGroup.getTag(AbstractC5955f.index_target) != null && i8 == ((Integer) viewGroup.getTag(AbstractC5955f.index_target)).intValue()) {
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
        } else if (AbstractC5955f.inputAddBtn == id) {
            addInputView();
        }
    }

    public void selectCoupon(int i8, int i9) {
        ViewGroup viewGroup = (ViewGroup) this.f29399o.getChildAt(i8);
        ((DiscountDropDownSelector) viewGroup.findViewById(AbstractC5955f.couponSelector)).setSelectIndex(i9);
        viewGroup.setTag(AbstractC5955f.index_coupon, Integer.valueOf(i9));
    }

    public void setAddBtnEnable(int i8) {
        this.f29400p.setEnabled(getCouponIndex(i8) > 0 && getTargetIndex(i8) > -1);
    }

    public void setCouponEntries(int i8, List<DiscountObjectData> list) {
        this.f29392h = list;
        ((DiscountDropDownSelector) ((ViewGroup) this.f29399o.getChildAt(i8)).findViewById(AbstractC5955f.couponSelector)).setDropDownData(this.f29390f, list, -1);
    }

    public void setCouponIndex(int i8, int i9) {
        ViewGroup viewGroup = (ViewGroup) this.f29399o.getChildAt(i8);
        viewGroup.setTag(AbstractC5955f.index_coupon, Integer.valueOf(i9));
        DiscountDropDownSelector discountDropDownSelector = (DiscountDropDownSelector) viewGroup.findViewById(AbstractC5955f.couponSelector);
        if (i9 == -1) {
            i9 = 0;
        }
        discountDropDownSelector.setSelectIndex(i9);
    }

    public void setCouponSelectListener(b bVar) {
        this.f29394j = bVar;
    }

    public void setEntries(String str, List<DiscountObjectData> list, String str2, List<DiscountObjectData> list2) {
        this.f29390f = str;
        this.f29392h = list;
        this.f29391g = str2;
        this.f29393i = list2;
    }

    public void setOnCouponInputListener(a aVar) {
        this.f29395k = aVar;
    }

    public void setTargetDropDownSelectorEnable(int i8) {
        ((DiscountDropDownSelector) ((ViewGroup) this.f29399o.getChildAt(i8)).findViewById(AbstractC5955f.targetSelector)).setEnabled(true);
    }

    public void setTargetIndex(int i8, int i9, int i10) {
        t.d("inputViewIndex : " + i8 + ", targetListIndex : " + i9 + ", " + i10);
        ViewGroup viewGroup = (ViewGroup) this.f29399o.getChildAt(i8);
        viewGroup.setTag(AbstractC5955f.index_target, Integer.valueOf(i10));
        DiscountDropDownSelector discountDropDownSelector = (DiscountDropDownSelector) viewGroup.findViewById(AbstractC5955f.targetSelector);
        discountDropDownSelector.setSelectIndex(i9);
        discountDropDownSelector.setEnabled(true);
    }

    public void setTargetSelectListener(c cVar) {
        this.f29396l = cVar;
    }

    public void updateTargets(List<DiscountObjectData> list) {
        this.f29393i = list;
        for (int i8 = 0; i8 < getInputViewCount(); i8++) {
            ((DiscountDropDownSelector) ((ViewGroup) this.f29399o.getChildAt(i8)).findViewById(AbstractC5955f.targetSelector)).setDropDownData(list);
        }
    }

    public BusinessTripCoupon(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g();
    }
}
