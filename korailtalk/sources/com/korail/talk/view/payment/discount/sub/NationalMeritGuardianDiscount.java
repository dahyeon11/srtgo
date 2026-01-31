package com.korail.talk.view.payment.discount.sub;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.korail.talk.data.DiscountObjectData;
import com.korail.talk.view.payment.discount.sub.DiscountDropDownSelector;
import java.util.ArrayList;
import java.util.List;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import y6.C6550j;
import z4.C6630d;

/* loaded from: classes.dex */
public class NationalMeritGuardianDiscount extends C6550j implements View.OnClickListener {
    public static final int NOT_SELECT = -1;

    /* renamed from: f */
    private String f29452f;

    /* renamed from: g */
    private List f29453g;

    /* renamed from: h */
    private a f29454h;

    /* renamed from: i */
    private TextView f29455i;

    /* renamed from: j */
    private TextView f29456j;

    /* renamed from: k */
    private ViewGroup f29457k;

    public interface a {
        void onTargetSelect(int i8, int i9, DiscountObjectData discountObjectData);
    }

    public NationalMeritGuardianDiscount(Context context) {
        super(context);
        g();
    }

    public /* synthetic */ void j(DiscountDropDownSelector discountDropDownSelector, int i8, DiscountDropDownSelector discountDropDownSelector2, int i9) {
        if (discountDropDownSelector.getSelectIndex() != i9 && C6630d.isNotNull(this.f29454h)) {
            this.f29454h.onTargetSelect(i8, i9, (DiscountObjectData) this.f29453g.get(i9));
        }
    }

    private void k() {
        findViewById(AbstractC5955f.headerView).setOnClickListener(this);
    }

    private void l() {
        this.f29455i = (TextView) findViewById(AbstractC5955f.headerTitleTxt);
        this.f29456j = (TextView) findViewById(AbstractC5955f.headerValTxt);
        this.f29457k = (ViewGroup) findViewById(AbstractC5955f.inputContainer);
        findViewById(AbstractC5955f.inputAddBtn).setVisibility(8);
    }

    private void setText() {
        this.f29455i.setText(b(AbstractC5959j.payment_national_merit_guardian_discount));
        this.f29456j.setText(b(AbstractC5959j.common_no_applied_passenger));
    }

    public void addInputView() {
        final int childCount = this.f29457k.getChildCount();
        ViewGroup viewGroup = (ViewGroup) View.inflate(getContext(), AbstractC5957h.national_merit_guardian_discount_input, null);
        this.f29457k.addView(viewGroup);
        viewGroup.findViewById(AbstractC5955f.divider).setVisibility(childCount > 1 ? 0 : 8);
        final DiscountDropDownSelector discountDropDownSelector = (DiscountDropDownSelector) viewGroup.findViewById(AbstractC5955f.targetSelector);
        discountDropDownSelector.setDropDownData(this.f29452f, this.f29453g, -1);
        discountDropDownSelector.setOnSelectorItemClickListener(new DiscountDropDownSelector.b() { // from class: v6.n
            @Override // com.korail.talk.view.payment.discount.sub.DiscountDropDownSelector.b
            public final void onItemSelected(DiscountDropDownSelector discountDropDownSelector2, int i8) {
                this.f37309a.j(discountDropDownSelector, childCount, discountDropDownSelector2, i8);
            }
        });
    }

    protected void g() {
        setAsMainOption(false);
        setAutoExpand(false);
        View.inflate(getContext(), AbstractC5957h.add_discount_sub_option, this);
        l();
        setText();
        k();
    }

    public int getInputViewCount() {
        return this.f29457k.getChildCount();
    }

    public ArrayList<Integer> getTargetData() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i8 = 0; i8 < getInputViewCount(); i8++) {
            ViewGroup viewGroup = (ViewGroup) this.f29457k.getChildAt(i8);
            arrayList.add(Integer.valueOf(C6630d.isNotNull(viewGroup.getTag(AbstractC5955f.index_target)) ? ((Integer) viewGroup.getTag(AbstractC5955f.index_target)).intValue() : -1));
        }
        return arrayList;
    }

    public boolean isEnableTarget(int i8) {
        for (int i9 = 0; i9 < getInputViewCount(); i9++) {
            ViewGroup viewGroup = (ViewGroup) this.f29457k.getChildAt(i9);
            if (C6630d.isNotNull(viewGroup.getTag(AbstractC5955f.index_target)) && i8 == ((Integer) viewGroup.getTag(AbstractC5955f.index_target)).intValue()) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (AbstractC5955f.headerView == view.getId()) {
            onHeaderClick();
        }
    }

    public void setEntries(String str, List<DiscountObjectData> list) {
        this.f29452f = str;
        this.f29453g = list;
    }

    public void setHeaderValTxt(String str) {
        this.f29456j.setText(str);
    }

    public void setTargetIndex(int i8, int i9, int i10) {
        ViewGroup viewGroup = (ViewGroup) this.f29457k.getChildAt(i8);
        viewGroup.setTag(AbstractC5955f.index_target, Integer.valueOf(i10));
        DiscountDropDownSelector discountDropDownSelector = (DiscountDropDownSelector) viewGroup.findViewById(AbstractC5955f.targetSelector);
        discountDropDownSelector.setSelectIndex(i9);
        discountDropDownSelector.setEnabled(true);
    }

    public void setTargetSelectListener(a aVar) {
        this.f29454h = aVar;
    }

    public void updateTargets(List<DiscountObjectData> list) {
        this.f29453g = list;
        for (int i8 = 0; i8 < getInputViewCount(); i8++) {
            ((DiscountDropDownSelector) ((ViewGroup) this.f29457k.getChildAt(i8)).findViewById(AbstractC5955f.targetSelector)).setDropDownData(list);
        }
    }

    public NationalMeritGuardianDiscount(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g();
    }
}
