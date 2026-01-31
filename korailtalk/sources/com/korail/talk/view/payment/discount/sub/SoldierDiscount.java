package com.korail.talk.view.payment.discount.sub;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.korail.talk.data.DiscountObjectData;
import com.korail.talk.view.payment.discount.sub.DiscountDropDownSelector;
import g5.e;
import java.util.ArrayList;
import java.util.List;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import y6.C6550j;
import z4.C6630d;

/* loaded from: classes.dex */
public class SoldierDiscount extends C6550j implements View.OnClickListener {
    public static final int NOT_SELECT = -1;

    /* renamed from: f, reason: collision with root package name */
    private String f29467f;

    /* renamed from: g, reason: collision with root package name */
    private List f29468g;

    /* renamed from: h, reason: collision with root package name */
    private a f29469h;

    /* renamed from: i, reason: collision with root package name */
    private TextView f29470i;

    /* renamed from: j, reason: collision with root package name */
    private TextView f29471j;

    /* renamed from: k, reason: collision with root package name */
    private ViewGroup f29472k;

    public interface a {
        void onTargetSelect(int i8, int i9, DiscountObjectData discountObjectData);
    }

    public SoldierDiscount(Context context) {
        super(context);
        g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(DiscountDropDownSelector discountDropDownSelector, int i8, DiscountDropDownSelector discountDropDownSelector2, int i9) {
        if (discountDropDownSelector.getSelectIndex() == i9) {
            return;
        }
        this.f29469h.onTargetSelect(i8, i9, (DiscountObjectData) this.f29468g.get(i9));
    }

    private void k() {
        findViewById(AbstractC5955f.headerView).setOnClickListener(this);
    }

    private void l() {
        this.f29470i = (TextView) findViewById(AbstractC5955f.headerTitleTxt);
        this.f29471j = (TextView) findViewById(AbstractC5955f.headerValTxt);
        this.f29472k = (ViewGroup) findViewById(AbstractC5955f.inputContainer);
        findViewById(AbstractC5955f.optionDivider).setVisibility(8);
    }

    private void setText() {
        this.f29470i.setText(getContext().getString(AbstractC5959j.payment_soilder_discount));
        this.f29471j.setText(e.STATE_NAME_NONE);
    }

    public void addInputView() {
        final int inputViewCount = getInputViewCount();
        ViewGroup viewGroup = (ViewGroup) View.inflate(getContext(), AbstractC5957h.discount_soldier_input, null);
        this.f29472k.addView(viewGroup);
        viewGroup.findViewById(AbstractC5955f.divider).setVisibility(inputViewCount > 1 ? 0 : 8);
        final DiscountDropDownSelector discountDropDownSelector = (DiscountDropDownSelector) viewGroup.findViewById(AbstractC5955f.targetSelector);
        discountDropDownSelector.setDropDownData(this.f29467f, this.f29468g, -1);
        discountDropDownSelector.setOnSelectorItemClickListener(new DiscountDropDownSelector.b() { // from class: v6.r
            @Override // com.korail.talk.view.payment.discount.sub.DiscountDropDownSelector.b
            public final void onItemSelected(DiscountDropDownSelector discountDropDownSelector2, int i8) {
                this.f37319a.j(discountDropDownSelector, inputViewCount, discountDropDownSelector2, i8);
            }
        });
    }

    protected void g() {
        setAsMainOption(false);
        setAutoExpand(false);
        View.inflate(getContext(), AbstractC5957h.add_soldier_discount_sub_option, this);
        l();
        setText();
        k();
    }

    public int getInputViewCount() {
        return this.f29472k.getChildCount();
    }

    public ArrayList<Integer> getTargetData() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i8 = 0; i8 < getInputViewCount(); i8++) {
            ViewGroup viewGroup = (ViewGroup) this.f29472k.getChildAt(i8);
            arrayList.add(Integer.valueOf(C6630d.isNotNull(viewGroup.getTag(AbstractC5955f.index_target)) ? ((Integer) viewGroup.getTag(AbstractC5955f.index_target)).intValue() : -1));
        }
        return arrayList;
    }

    public boolean isEnableTarget(int i8) {
        for (int i9 = 0; i9 < getInputViewCount(); i9++) {
            ViewGroup viewGroup = (ViewGroup) this.f29472k.getChildAt(i9);
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
        this.f29467f = str;
        this.f29468g = list;
    }

    public void setHeaderValTxt(String str) {
        this.f29471j.setText(str);
    }

    public void setTargetIndex(int i8, int i9, int i10) {
        ViewGroup viewGroup = (ViewGroup) this.f29472k.getChildAt(i8);
        viewGroup.setTag(AbstractC5955f.index_target, Integer.valueOf(i10));
        DiscountDropDownSelector discountDropDownSelector = (DiscountDropDownSelector) viewGroup.findViewById(AbstractC5955f.targetSelector);
        discountDropDownSelector.setSelectIndex(i9);
        discountDropDownSelector.setEnabled(true);
    }

    public void setTargetSelectListener(a aVar) {
        this.f29469h = aVar;
    }

    public void updateTargets(List<DiscountObjectData> list) {
        this.f29468g = list;
        for (int i8 = 0; i8 < getInputViewCount(); i8++) {
            ((DiscountDropDownSelector) ((ViewGroup) this.f29472k.getChildAt(i8)).findViewById(AbstractC5955f.targetSelector)).setDropDownData(list);
        }
    }

    public SoldierDiscount(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g();
    }
}
