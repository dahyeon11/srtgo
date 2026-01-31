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
import s4.C6222f;
import y6.C6550j;
import z4.C6630d;
import z4.C6637k;
import z4.N;

/* loaded from: classes.dex */
public class DelayDiscountCoupon extends C6550j implements View.OnClickListener {
    public static final int NOT_SELECT = -1;

    /* renamed from: f */
    private boolean f29410f;

    /* renamed from: g */
    private String f29411g;

    /* renamed from: h */
    private String f29412h;

    /* renamed from: i */
    private List f29413i;

    /* renamed from: j */
    private List f29414j;

    /* renamed from: k */
    private b f29415k;

    /* renamed from: l */
    private c f29416l;

    /* renamed from: m */
    private a f29417m;

    /* renamed from: n */
    private TextView f29418n;

    /* renamed from: o */
    private TextView f29419o;

    /* renamed from: p */
    private ViewGroup f29420p;

    /* renamed from: q */
    private Button f29421q;

    public interface a {
        void onApplied(int i8, String str, String str2, String str3, String str4);
    }

    public interface b {
        void onCouponSelect();
    }

    public interface c {
        void onTargetSelect(int i8, int i9, DiscountObjectData discountObjectData);
    }

    public DelayDiscountCoupon(Context context) {
        super(context);
        g();
    }

    private boolean l(int i8) {
        for (int i9 = 0; i9 < getInputViewCount(); i9++) {
            ViewGroup viewGroup = (ViewGroup) this.f29420p.getChildAt(i9);
            if (C6630d.isNotNull(viewGroup.getTag(AbstractC5955f.index_coupon)) && i8 == ((Integer) viewGroup.getTag(AbstractC5955f.index_coupon)).intValue()) {
                return false;
            }
        }
        return true;
    }

    public /* synthetic */ void m(int i8, DialogInterface dialogInterface, int i9, String str, String str2, String str3, String str4) {
        if (102 == i9 && C6630d.isNotNull(this.f29417m)) {
            this.f29417m.onApplied(i8, str, str2, str3, str4);
        }
    }

    public /* synthetic */ void n(DiscountDropDownSelector discountDropDownSelector, final int i8, DiscountDropDownSelector discountDropDownSelector2, DiscountDropDownSelector discountDropDownSelector3, int i9) {
        if (discountDropDownSelector.getSelectIndex() == i9) {
            return;
        }
        if (i9 == discountDropDownSelector3.getDropDownSize() - 1) {
            ((C6222f) C6637k.getDialog(4, getContext(), 1002, 1, b(AbstractC5959j.dialog_delay_discount_direct_input))).setDiscountButtonListener(new C6222f.c() { // from class: v6.h
                @Override // s4.C6222f.c
                public final void onClick(DialogInterface dialogInterface, int i10, String str, String str2, String str3, String str4) {
                    this.f37294a.m(i8, dialogInterface, i10, str, str2, str3, str4);
                }
            }).setContent(b(AbstractC5959j.delay_discount_coupon_input_pop_message1)).setButtonNames(N.getStringArray(b(AbstractC5959j.common_cancel), b(AbstractC5959j.common_confirm))).showDialog();
            return;
        }
        if (i9 > 0) {
            discountDropDownSelector2.setEnabled(true);
        }
        if (!l(i9)) {
            C6637k.getCDialog(getContext(), 1001, 1, b(AbstractC5959j.dialog_title)).setContent(b(AbstractC5959j.payment_discount_member_coupon_select_another_coupon)).showDialog();
            return;
        }
        if (i9 == 0) {
            i9 = -1;
        }
        setCouponIndex(i8, i9);
        if (C6630d.isNotNull(this.f29415k)) {
            this.f29415k.onCouponSelect();
        }
    }

    public /* synthetic */ void o(DiscountDropDownSelector discountDropDownSelector, int i8, DiscountDropDownSelector discountDropDownSelector2, int i9) {
        if (discountDropDownSelector.getSelectIndex() == i9) {
            return;
        }
        this.f29421q.setEnabled(i9 > 0);
        this.f29416l.onTargetSelect(i8, i9, (DiscountObjectData) this.f29414j.get(i9));
    }

    private void p() {
        findViewById(AbstractC5955f.headerView).setOnClickListener(this);
        this.f29421q.setOnClickListener(this);
    }

    private void q() {
        this.f29418n = (TextView) findViewById(AbstractC5955f.headerTitleTxt);
        this.f29419o = (TextView) findViewById(AbstractC5955f.headerValTxt);
        this.f29420p = (ViewGroup) findViewById(AbstractC5955f.inputContainer);
        this.f29421q = (Button) findViewById(AbstractC5955f.inputAddBtn);
    }

    private void setText() {
        this.f29418n.setText(b(AbstractC5959j.payment_delay_discount_use));
        this.f29419o.setText(e.STATE_NAME_NONE);
        this.f29421q.setText(b(AbstractC5959j.payment_delay_discount_add));
    }

    public void addInputView() {
        this.f29421q.setEnabled(false);
        final int inputViewCount = getInputViewCount();
        ViewGroup viewGroup = (ViewGroup) View.inflate(getContext(), AbstractC5957h.delay_discount_coupon_input, null);
        this.f29420p.addView(viewGroup);
        viewGroup.findViewById(AbstractC5955f.divider).setVisibility(inputViewCount > 1 ? 0 : 8);
        ((TextView) viewGroup.findViewById(AbstractC5955f.couponTitle)).setText(c(AbstractC5959j.payment_delay_discount_count, Integer.valueOf(inputViewCount + 1)));
        final DiscountDropDownSelector discountDropDownSelector = (DiscountDropDownSelector) viewGroup.findViewById(AbstractC5955f.couponSelector);
        discountDropDownSelector.setDropDownData(this.f29411g, this.f29413i, -1);
        final DiscountDropDownSelector discountDropDownSelector2 = (DiscountDropDownSelector) viewGroup.findViewById(AbstractC5955f.targetSelector);
        discountDropDownSelector2.setDropDownData(this.f29412h, this.f29414j, -1);
        discountDropDownSelector2.setEnabled(false);
        discountDropDownSelector.setOnSelectorItemClickListener(new DiscountDropDownSelector.b() { // from class: v6.f
            @Override // com.korail.talk.view.payment.discount.sub.DiscountDropDownSelector.b
            public final void onItemSelected(DiscountDropDownSelector discountDropDownSelector3, int i8) {
                this.f37287a.n(discountDropDownSelector, inputViewCount, discountDropDownSelector2, discountDropDownSelector3, i8);
            }
        });
        discountDropDownSelector2.setOnSelectorItemClickListener(new DiscountDropDownSelector.b() { // from class: v6.g
            @Override // com.korail.talk.view.payment.discount.sub.DiscountDropDownSelector.b
            public final void onItemSelected(DiscountDropDownSelector discountDropDownSelector3, int i8) {
                this.f37291a.o(discountDropDownSelector2, inputViewCount, discountDropDownSelector3, i8);
            }
        });
    }

    protected void g() {
        setAsMainOption(false);
        setAutoExpand(false);
        View.inflate(getContext(), AbstractC5957h.add_discount_sub_option, this);
        q();
        setText();
        p();
    }

    public ArrayList<Integer> getCouponData() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i8 = 0; i8 < getInputViewCount(); i8++) {
            ViewGroup viewGroup = (ViewGroup) this.f29420p.getChildAt(i8);
            arrayList.add(Integer.valueOf(C6630d.isNotNull(viewGroup.getTag(AbstractC5955f.index_coupon)) ? ((Integer) viewGroup.getTag(AbstractC5955f.index_coupon)).intValue() : -1));
        }
        return arrayList;
    }

    public List<DiscountObjectData> getCouponEntries() {
        return this.f29413i;
    }

    public int getCouponIndex(int i8) {
        ViewGroup viewGroup = (ViewGroup) this.f29420p.getChildAt(i8);
        if (C6630d.isNotNull(viewGroup.getTag(AbstractC5955f.index_coupon))) {
            return ((Integer) viewGroup.getTag(AbstractC5955f.index_coupon)).intValue();
        }
        return -1;
    }

    public int getInputViewCount() {
        return this.f29420p.getChildCount();
    }

    public ArrayList<Integer> getTargetData() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i8 = 0; i8 < getInputViewCount(); i8++) {
            ViewGroup viewGroup = (ViewGroup) this.f29420p.getChildAt(i8);
            arrayList.add(Integer.valueOf(C6630d.isNotNull(viewGroup.getTag(AbstractC5955f.index_target)) ? ((Integer) viewGroup.getTag(AbstractC5955f.index_target)).intValue() : -1));
        }
        return arrayList;
    }

    public int getTargetIndex(int i8) {
        ViewGroup viewGroup = (ViewGroup) this.f29420p.getChildAt(i8);
        if (C6630d.isNotNull(viewGroup.getTag(AbstractC5955f.index_target))) {
            return ((Integer) viewGroup.getTag(AbstractC5955f.index_target)).intValue();
        }
        return -1;
    }

    public boolean isEnableTarget(int i8) {
        for (int i9 = 0; i9 < getInputViewCount(); i9++) {
            ViewGroup viewGroup = (ViewGroup) this.f29420p.getChildAt(i9);
            if (C6630d.isNotNull(viewGroup.getTag(AbstractC5955f.index_target)) && i8 == ((Integer) viewGroup.getTag(AbstractC5955f.index_target)).intValue()) {
                return false;
            }
        }
        return true;
    }

    public boolean isLoaded() {
        return this.f29410f;
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
        ViewGroup viewGroup = (ViewGroup) this.f29420p.getChildAt(i8);
        ((DiscountDropDownSelector) viewGroup.findViewById(AbstractC5955f.couponSelector)).setSelectIndex(i9);
        viewGroup.setTag(AbstractC5955f.index_coupon, Integer.valueOf(i9));
    }

    public void setAddBtnEnable(int i8) {
        this.f29421q.setEnabled(getCouponIndex(i8) > -1 && getTargetIndex(i8) > -1);
    }

    public void setCouponIndex(int i8, int i9) {
        ViewGroup viewGroup = (ViewGroup) this.f29420p.getChildAt(i8);
        viewGroup.setTag(AbstractC5955f.index_coupon, Integer.valueOf(i9));
        DiscountDropDownSelector discountDropDownSelector = (DiscountDropDownSelector) viewGroup.findViewById(AbstractC5955f.couponSelector);
        if (i9 == -1) {
            i9 = 0;
        }
        discountDropDownSelector.setSelectIndex(i9);
    }

    public void setCouponSelectListener(b bVar) {
        this.f29415k = bVar;
    }

    public void setEntries(String str, List<DiscountObjectData> list, String str2, List<DiscountObjectData> list2) {
        this.f29411g = str;
        this.f29413i = list;
        this.f29412h = str2;
        this.f29414j = list2;
    }

    public void setIsCouponListLoaded() {
        this.f29410f = true;
    }

    public void setOnCouponInputListener(a aVar) {
        this.f29417m = aVar;
    }

    public void setTargetDropDownSelectorEnable(int i8) {
        ((DiscountDropDownSelector) ((ViewGroup) this.f29420p.getChildAt(i8)).findViewById(AbstractC5955f.targetSelector)).setEnabled(true);
    }

    public void setTargetIndex(int i8, int i9, int i10) {
        ViewGroup viewGroup = (ViewGroup) this.f29420p.getChildAt(i8);
        viewGroup.setTag(AbstractC5955f.index_target, Integer.valueOf(i10));
        DiscountDropDownSelector discountDropDownSelector = (DiscountDropDownSelector) viewGroup.findViewById(AbstractC5955f.targetSelector);
        discountDropDownSelector.setSelectIndex(i9);
        discountDropDownSelector.setEnabled(true);
    }

    public void setTargetSelectListener(c cVar) {
        this.f29416l = cVar;
    }

    public void updateCouponList(List<DiscountObjectData> list) {
        this.f29413i = list;
        for (int i8 = 0; i8 < getInputViewCount(); i8++) {
            ((DiscountDropDownSelector) ((ViewGroup) this.f29420p.getChildAt(i8)).findViewById(AbstractC5955f.couponSelector)).setDropDownData(list);
        }
    }

    public void updateTargets(List<DiscountObjectData> list) {
        this.f29414j = list;
        for (int i8 = 0; i8 < getInputViewCount(); i8++) {
            ((DiscountDropDownSelector) ((ViewGroup) this.f29420p.getChildAt(i8)).findViewById(AbstractC5955f.targetSelector)).setDropDownData(list);
        }
    }

    public DelayDiscountCoupon(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g();
    }
}
