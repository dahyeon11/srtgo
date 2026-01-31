package I5;

import android.os.Bundle;
import android.view.ViewGroup;
import com.korail.talk.ui.payment.PaymentActivity;
import k0.AbstractC5837a;
import n4.AbstractC5955f;
import r4.i;
import s6.C6230a;
import s6.C6231b;
import s6.C6232c;
import s6.C6233d;
import z4.C6630d;

/* loaded from: classes.dex */
public class h extends e {
    public static final String TAG = "NPaymentFragment";

    /* renamed from: F0 */
    private C6230a f2153F0;

    /* renamed from: G0 */
    String f2154G0;

    /* renamed from: H0 */
    String f2155H0;

    /* renamed from: I0 */
    String f2156I0;

    /* renamed from: J0 */
    String f2157J0;

    private void C0() {
        ViewGroup viewGroup = (ViewGroup) p0(AbstractC5955f.v_payment_container);
        if (i.PAYMENT_TICKET_CHANGE.equals(getPaymentType())) {
            this.f2153F0 = new C6233d(getActivity());
        } else if (this.f2154G0 == null) {
            this.f2153F0 = new C6231b(getActivity());
        } else {
            this.f2153F0 = new C6232c(getActivity());
        }
        viewGroup.addView(this.f2153F0, 0);
    }

    private void Q1(String str, String str2, String str3, String str4) {
        this.f2154G0 = str;
        this.f2155H0 = str2;
        this.f2156I0 = str3;
        this.f2157J0 = str4;
    }

    public static h newInstance() {
        return new h();
    }

    @Override // I5.e, G5.a, com.korail.talk.view.base.a, androidx.fragment.app.Fragment, androidx.lifecycle.InterfaceC1018g
    public /* bridge */ /* synthetic */ AbstractC5837a getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }

    @Override // I5.e, G5.a, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (C6630d.isNull(bundle)) {
            PaymentActivity paymentActivity = (PaymentActivity) getActivity();
            Q1(paymentActivity.getmTotPrc(), paymentActivity.getmTotFare(), paymentActivity.getmTotDcnt(), paymentActivity.getmSprmFareAmount());
            C0();
            y0();
            w0();
        }
    }

    protected void w0() {
        if (C6630d.isNotNull(this.f2153F0)) {
            if (i.PAYMENT_TICKET_CHANGE == getPaymentType()) {
                this.f2153F0.setAmount(getReservationResponse());
            } else if (this.f2154G0 == null) {
                this.f2153F0.setAmount(getReceivedAmount(), getDiscountAmount());
            } else {
                this.f2153F0.setAmount(getReceivedAmount(), getDiscountAmount());
                this.f2153F0.setAmount(this.f2154G0, this.f2155H0, this.f2156I0, this.f2157J0);
            }
        }
    }
}
