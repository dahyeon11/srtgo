package f6;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.korail.talk.ui.menu.discountMenu.NewDiscountMenuActivity;
import com.korail.talk.ui.ticket.confirm.TicketListActivity;
import java.lang.reflect.InvocationTargetException;
import k0.AbstractC5837a;
import n4.AbstractC5955f;
import n4.AbstractC5959j;
import z4.C6630d;
import z4.C6641o;

/* renamed from: f6.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5513b extends com.korail.talk.ui.ticket.confirm.a {
    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A0(View view) {
        Bundle bundle = new Bundle();
        bundle.putString("DISCOUNT_MENU_NO", "1");
        C6641o.navigation(getApplicationContext(), NewDiscountMenuActivity.class, bundle);
    }

    private void D0() {
        Button button = (Button) p0(AbstractC5955f.goToInquiry);
        button.setText(AbstractC5959j.common_commutation_inquiry);
        button.setOnClickListener(new View.OnClickListener() { // from class: f6.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f31219a.A0(view);
            }
        });
    }

    public static C5513b newInstance(boolean z8) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("IS_EMERGENCY", z8);
        C5513b c5513b = new C5513b();
        c5513b.setArguments(bundle);
        return c5513b;
    }

    @Override // com.korail.talk.ui.ticket.confirm.a, com.korail.talk.view.base.a, androidx.fragment.app.Fragment, androidx.lifecycle.InterfaceC1018g
    public /* bridge */ /* synthetic */ AbstractC5837a getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }

    @Override // com.korail.talk.ui.ticket.confirm.a, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onActivityCreated(bundle);
        if (C6630d.isNull(bundle)) {
            D0();
            if (this.f29020d0) {
                ((TicketListActivity) getActivity()).setList();
            }
        }
    }
}
