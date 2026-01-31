package s6;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.korail.talk.ui.payment.PaymentActivity;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import z4.N;

/* renamed from: s6.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6232c extends C6230a {

    /* renamed from: b, reason: collision with root package name */
    private TextView f36309b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f36310c;

    /* renamed from: d, reason: collision with root package name */
    private TextView f36311d;

    /* renamed from: e, reason: collision with root package name */
    private TextView f36312e;

    /* renamed from: f, reason: collision with root package name */
    private TextView f36313f;

    /* renamed from: g, reason: collision with root package name */
    private PaymentActivity f36314g;

    public C6232c(Context context) {
        super(context);
        this.f36314g = (PaymentActivity) context;
        g();
    }

    private void h() {
        this.f36309b = (TextView) findViewById(AbstractC5955f.tv_new_fare_payment_price_amount);
        this.f36310c = (TextView) findViewById(AbstractC5955f.tv_new_fare_payment_fare_amount);
        this.f36311d = (TextView) findViewById(AbstractC5955f.tv_new_fare_payment_price_discount_amount);
        this.f36312e = (TextView) findViewById(AbstractC5955f.tv_new_fare_payment_fare_discount_amount);
        this.f36313f = (TextView) findViewById(AbstractC5955f.tv_new_fare_payment_tot_amount);
    }

    protected void g() {
        View.inflate(getContext(), AbstractC5957h.view_new_fare_payment_amount, this);
        h();
    }

    @Override // s6.C6230a
    public void setAmount(String str, String str2, String str3, String str4) {
        int i8 = Integer.parseInt(str);
        int i9 = Integer.parseInt(str2);
        int i10 = Integer.parseInt(str4);
        int i11 = Integer.parseInt(str3);
        this.f36309b.setText(c(AbstractC5959j.common_amount, N.getDecimalFormatString(i8)));
        this.f36310c.setText(c(AbstractC5959j.common_amount, N.getDecimalFormatString(i9)));
        this.f36311d.setText(c(AbstractC5959j.common_amount, N.getDecimalFormatString(-(i11 - i10))));
        this.f36312e.setText(c(AbstractC5959j.common_amount, N.getDecimalFormatString(-i10)));
        this.f36313f.setText(c(AbstractC5959j.common_amount, N.getDecimalFormatString((i8 + i9) - i11)));
    }

    public C6232c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36314g = (PaymentActivity) context;
        g();
    }
}
