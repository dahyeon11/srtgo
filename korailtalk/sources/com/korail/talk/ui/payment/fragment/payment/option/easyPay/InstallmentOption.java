package com.korail.talk.ui.payment.fragment.payment.option.easyPay;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.korail.talk.viewGroup.DropDownSelector;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import r4.h;
import y6.C6541a;

/* loaded from: classes.dex */
public class InstallmentOption extends C6541a {

    /* renamed from: a, reason: collision with root package name */
    private DropDownSelector f28555a;

    public InstallmentOption(Context context) {
        super(context);
        e();
    }

    private void d() {
        String[] strArr = new String[h.values().length];
        int i8 = 0;
        for (h hVar : h.values()) {
            strArr[i8] = hVar.getName();
            i8++;
        }
        this.f28555a.setEntries(strArr, (String[]) null, 0);
    }

    private void e() {
        View.inflate(getContext(), AbstractC5957h.easy_shinhan_pay_option, this);
        f();
        i();
        h();
        g();
        d();
    }

    private void f() {
    }

    private void g() {
    }

    private void h() {
    }

    private void i() {
        this.f28555a = (DropDownSelector) findViewById(AbstractC5955f.installPlanSelector);
    }

    public int getSelectedDropDownId() {
        return this.f28555a.getSelectIndex();
    }

    public InstallmentOption(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e();
    }

    public InstallmentOption(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        e();
    }
}
