package d5;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import c5.d;
import com.korail.talk.network.dao.ticket.RecentDeliveryHistoryDao;
import k0.AbstractC5837a;
import n4.AbstractC5952c;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import z4.C6630d;
import z4.N;

/* renamed from: d5.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class ViewOnClickListenerC5326b extends d implements View.OnClickListener {
    public static final String TAG = "DeliveryKTNFragment";

    /* renamed from: e0, reason: collision with root package name */
    private EditText f30047e0;

    /* renamed from: f0, reason: collision with root package name */
    private EditText f30048f0;

    /* renamed from: g0, reason: collision with root package name */
    private EditText f30049g0;

    /* renamed from: h0, reason: collision with root package name */
    private EditText f30050h0;

    private void H0() {
        p0(AbstractC5955f.btn_delivery_kt_n_delivery).setOnClickListener(this);
    }

    private void I0() {
        N.setBulletSpan(r0(AbstractC5952c.delivery_korail_talk_notice), (TextView) p0(AbstractC5955f.tv_delivery_kt_n_notice));
    }

    private void J0() {
        this.f30047e0 = (EditText) p0(AbstractC5955f.et_delivery_kt_n_nm);
        this.f30048f0 = (EditText) p0(AbstractC5955f.et_delivery_kt_n_hp_no);
        this.f30049g0 = (EditText) p0(AbstractC5955f.et_delivery_kt_n_pw);
        this.f30050h0 = (EditText) p0(AbstractC5955f.et_delivery_kt_n_confirm_pw);
    }

    public static Fragment newInstance() {
        return new ViewOnClickListenerC5326b();
    }

    @Override // c5.d
    protected void D0(RecentDeliveryHistoryDao.Acep acep) {
        this.f30047e0.setText(acep.getAcepCustNm());
        this.f30048f0.setText(acep.getAcepCustTeln());
    }

    @Override // c5.d, com.korail.talk.view.base.a, androidx.fragment.app.Fragment, androidx.lifecycle.InterfaceC1018g
    public /* bridge */ /* synthetic */ AbstractC5837a getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (C6630d.isNull(bundle)) {
            J0();
            I0();
            H0();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (AbstractC5955f.btn_delivery_kt_n_delivery == view.getId()) {
            G0(this.f30047e0, this.f30048f0, this.f30049g0, this.f30050h0);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(AbstractC5957h.fragment_delivery_kt_n, viewGroup, false);
    }
}
