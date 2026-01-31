package com.korail.talk.view.payment.discount.sub;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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
public class DisabledPersonGuardianDiscount extends C6550j implements View.OnClickListener {
    public static final int NOT_SELECT = -1;

    /* renamed from: f, reason: collision with root package name */
    private String f29422f;

    /* renamed from: g, reason: collision with root package name */
    private List f29423g;

    /* renamed from: h, reason: collision with root package name */
    private a f29424h;

    /* renamed from: i, reason: collision with root package name */
    private TextView f29425i;

    /* renamed from: j, reason: collision with root package name */
    private TextView f29426j;

    /* renamed from: k, reason: collision with root package name */
    private ViewGroup f29427k;

    /* renamed from: l, reason: collision with root package name */
    private Button f29428l;

    public interface a {
        void onTargetSelect(int i8, int i9, DiscountObjectData discountObjectData);
    }

    public DisabledPersonGuardianDiscount(Context context) {
        super(context);
        g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(DiscountDropDownSelector discountDropDownSelector, int i8, DiscountDropDownSelector discountDropDownSelector2, int i9) {
        if (discountDropDownSelector.getSelectIndex() == i9) {
            return;
        }
        setInputAddBtn(i9 > 0);
        this.f29424h.onTargetSelect(i8, i9, (DiscountObjectData) this.f29423g.get(i9));
    }

    private void k() {
        findViewById(AbstractC5955f.headerView).setOnClickListener(this);
        this.f29428l.setOnClickListener(this);
    }

    private void l() {
        this.f29425i = (TextView) findViewById(AbstractC5955f.headerTitleTxt);
        this.f29426j = (TextView) findViewById(AbstractC5955f.headerValTxt);
        this.f29427k = (ViewGroup) findViewById(AbstractC5955f.inputContainer);
        this.f29428l = (Button) findViewById(AbstractC5955f.inputAddBtn);
    }

    private void setText() {
        this.f29425i.setText(getContext().getString(AbstractC5959j.payment_disabled_person_guardian_discount));
        this.f29426j.setText(getContext().getString(AbstractC5959j.common_no_applied_passenger));
        this.f29428l.setText(getContext().getString(AbstractC5959j.payment_disabled_person_guardian_discount_add));
    }

    public void addInputView() {
        this.f29428l.setEnabled(false);
        final int childCount = this.f29427k.getChildCount();
        ViewGroup viewGroup = (ViewGroup) View.inflate(getContext(), AbstractC5957h.disabled_person_guardian_discount_input, null);
        this.f29427k.addView(viewGroup);
        viewGroup.findViewById(AbstractC5955f.divider).setVisibility(childCount <= 1 ? 8 : 0);
        final DiscountDropDownSelector discountDropDownSelector = (DiscountDropDownSelector) viewGroup.findViewById(AbstractC5955f.targetSelector);
        discountDropDownSelector.setDropDownData(this.f29422f, this.f29423g, -1);
        discountDropDownSelector.setOnSelectorItemClickListener(new DiscountDropDownSelector.b() { // from class: v6.i
            @Override // com.korail.talk.view.payment.discount.sub.DiscountDropDownSelector.b
            public final void onItemSelected(DiscountDropDownSelector discountDropDownSelector2, int i8) {
                this.f37296a.j(discountDropDownSelector, childCount, discountDropDownSelector2, i8);
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
        return this.f29427k.getChildCount();
    }

    public ArrayList<Integer> getTargetData() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i8 = 0; i8 < getInputViewCount(); i8++) {
            ViewGroup viewGroup = (ViewGroup) this.f29427k.getChildAt(i8);
            arrayList.add(Integer.valueOf(C6630d.isNotNull(viewGroup.getTag(AbstractC5955f.index_target)) ? ((Integer) viewGroup.getTag(AbstractC5955f.index_target)).intValue() : -1));
        }
        return arrayList;
    }

    public boolean isEnableTarget(int i8) {
        for (int i9 = 0; i9 < getInputViewCount(); i9++) {
            ViewGroup viewGroup = (ViewGroup) this.f29427k.getChildAt(i9);
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
        } else if (AbstractC5955f.inputAddBtn == id) {
            addInputView();
        }
    }

    public void setEntries(String str, List<DiscountObjectData> list) {
        this.f29422f = str;
        this.f29423g = list;
    }

    public void setHeaderValTxt(String str) {
        this.f29426j.setText(str);
    }

    public void setInputAddBtn(boolean z8) {
        this.f29428l.setEnabled(z8);
    }

    public void setTargetIndex(int i8, int i9, int i10) {
        ViewGroup viewGroup = (ViewGroup) this.f29427k.getChildAt(i8);
        viewGroup.setTag(AbstractC5955f.index_target, Integer.valueOf(i10));
        DiscountDropDownSelector discountDropDownSelector = (DiscountDropDownSelector) viewGroup.findViewById(AbstractC5955f.targetSelector);
        discountDropDownSelector.setSelectIndex(i9);
        discountDropDownSelector.setEnabled(true);
    }

    public void setTargetSelectListener(a aVar) {
        this.f29424h = aVar;
    }

    public void updateTargets(List<DiscountObjectData> list) {
        this.f29423g = list;
        for (int i8 = 0; i8 < getInputViewCount(); i8++) {
            ((DiscountDropDownSelector) ((ViewGroup) this.f29427k.getChildAt(i8)).findViewById(AbstractC5955f.targetSelector)).setDropDownData(list);
        }
    }

    public DisabledPersonGuardianDiscount(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g();
    }
}
