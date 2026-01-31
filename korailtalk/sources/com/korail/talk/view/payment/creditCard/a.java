package com.korail.talk.view.payment.creditCard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.korail.talk.view.payment.creditCard.CreditCardView;
import n4.AbstractC5954e;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import y6.C6550j;
import z4.N;

/* loaded from: classes.dex */
public class a extends C6550j implements View.OnClickListener {

    /* renamed from: f, reason: collision with root package name */
    private View f29386f;

    /* renamed from: g, reason: collision with root package name */
    private TextView f29387g;

    /* renamed from: h, reason: collision with root package name */
    private CreditCardView f29388h;

    /* renamed from: i, reason: collision with root package name */
    private CreditCardView.c f29389i;

    public a(Context context) {
        super(context);
        this.f29389i = null;
        g();
    }

    private void i() {
        this.f29386f.setOnClickListener(this);
    }

    private void j() {
        View.inflate(getContext(), AbstractC5957h.pay_selection_option, this);
        this.f29386f = findViewById(AbstractC5955f.headerView);
        this.f29387g = (TextView) findViewById(AbstractC5955f.headerValTitle);
        CreditCardView creditCardView = (CreditCardView) findViewById(AbstractC5955f.creditCardView);
        this.f29388h = creditCardView;
        CreditCardView.c cVar = this.f29389i;
        if (cVar != null) {
            creditCardView.setScanCallback(cVar);
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f29386f.getLayoutParams();
        layoutParams.height = N.dpToPx(68.0f);
        this.f29386f.setLayoutParams(layoutParams);
        findViewById(AbstractC5955f.headerDiscountLayout).setVisibility(8);
        findViewById(AbstractC5955f.headerValTxt).setVisibility(8);
        setFoldArrowIcon(AbstractC5954e.btn_fold_b, AbstractC5954e.btn_unfold_b);
    }

    private void setText() {
        this.f29387g.setText(b(AbstractC5959j.payment_option_title_card));
    }

    protected void g() {
        j();
        setText();
        i();
    }

    public CreditCardView getCreditCardView() {
        return this.f29388h;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (AbstractC5955f.headerView == view.getId()) {
            onHeaderClick();
        }
    }

    public a(Context context, CreditCardView.c cVar) {
        super(context);
        this.f29389i = cVar;
        g();
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29389i = null;
        g();
    }
}
