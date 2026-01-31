package s6;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import z4.N;

/* renamed from: s6.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6231b extends C6230a {

    /* renamed from: b, reason: collision with root package name */
    private TextView f36307b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f36308c;

    public C6231b(Context context) {
        super(context);
        g();
    }

    private void h() {
        this.f36307b = (TextView) findViewById(AbstractC5955f.tv_n_payment_amount_received);
        this.f36308c = (TextView) findViewById(AbstractC5955f.tv_n_payment_amount_discount);
        findViewById(AbstractC5955f.n_payment_amount_discount_layout).setVisibility(8);
    }

    protected void g() {
        View.inflate(getContext(), AbstractC5957h.view_n_payment_amount, this);
        h();
    }

    @Override // s6.C6230a
    public void setAmount(int i8, int i9) {
        this.f36306a = i8;
        this.f36307b.setText(c(AbstractC5959j.common_amount, N.getDecimalFormatString(i8)));
        this.f36307b.setContentDescription(c(AbstractC5959j.common_amount, N.getDecimalFormatString(i8)));
        this.f36308c.setText(c(AbstractC5959j.payment_total_won, N.getDecimalFormatString(i8 + i9), N.getDecimalFormatString(i9)));
    }

    public C6231b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g();
    }
}
