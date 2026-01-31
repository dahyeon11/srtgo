package f6;

import android.os.Bundle;
import android.view.View;
import com.korail.talk.ui.booking.mainBooking.MainBookingActivity;
import k0.AbstractC5837a;
import n4.AbstractC5955f;
import z4.C6630d;
import z4.C6641o;

/* loaded from: classes.dex */
public class h extends com.korail.talk.ui.ticket.confirm.a {
    public /* synthetic */ void A0(View view) {
        C6641o.navigation(getApplicationContext(), MainBookingActivity.class);
    }

    private void D0() {
        p0(AbstractC5955f.goToInquiry).setOnClickListener(new View.OnClickListener() { // from class: f6.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f31228a.A0(view);
            }
        });
    }

    public static h newInstance(boolean z8) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("IS_EMERGENCY", z8);
        h hVar = new h();
        hVar.setArguments(bundle);
        return hVar;
    }

    @Override // com.korail.talk.ui.ticket.confirm.a, com.korail.talk.view.base.a, androidx.fragment.app.Fragment, androidx.lifecycle.InterfaceC1018g
    public /* bridge */ /* synthetic */ AbstractC5837a getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }

    @Override // com.korail.talk.ui.ticket.confirm.a, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (C6630d.isNull(bundle)) {
            D0();
        }
    }
}
