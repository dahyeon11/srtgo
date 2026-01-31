package s6;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.korail.talk.network.response.certification.ReservationResponse;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import z4.N;

/* renamed from: s6.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6233d extends C6230a {

    /* renamed from: b, reason: collision with root package name */
    private TextView f36315b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f36316c;

    /* renamed from: d, reason: collision with root package name */
    private TextView f36317d;

    public C6233d(Context context) {
        super(context);
        g();
    }

    private void h() {
        this.f36315b = (TextView) findViewById(AbstractC5955f.tv_t_payment_amount_received);
        this.f36316c = (TextView) findViewById(AbstractC5955f.tv_t_payment_amount_compare);
        this.f36317d = (TextView) findViewById(AbstractC5955f.tv_t_payment_amount_refund);
    }

    protected void g() {
        View.inflate(getContext(), AbstractC5957h.view_t_payment_amount, this);
        h();
    }

    @Override // s6.C6230a
    public void setAmount(ReservationResponse reservationResponse) {
        this.f36306a = reservationResponse.getScnIndcAmt();
        int ogtkRcvdAmt = reservationResponse.getOgtkRcvdAmt();
        int iIntValue = N.intValue(reservationResponse.getH_tot_rcvd_amt(), 0);
        int iIntValue2 = reservationResponse.getTotRetAmt().intValue();
        this.f36315b.setText(c(AbstractC5959j.common_amount, N.getDecimalFormatString(this.f36306a)));
        this.f36316c.setText(c(AbstractC5959j.payment_compare_amount, N.getDecimalFormatString(ogtkRcvdAmt), N.getDecimalFormatString(iIntValue)));
        this.f36317d.setText(c(AbstractC5959j.common_amount, N.getDecimalFormatString(iIntValue2)));
    }

    public C6233d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g();
    }
}
