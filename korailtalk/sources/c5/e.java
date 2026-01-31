package c5;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.korail.talk.network.dao.ticket.RecentDeliveryHistoryDao;
import k0.AbstractC5837a;
import n4.AbstractC5952c;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import z4.C6630d;
import z4.N;

/* loaded from: classes.dex */
public class e extends d implements View.OnClickListener {
    public static final String INP_DV_CD = "INP_DV_CD";
    public static final String TAG = "DeliveryKKTFragment";

    /* renamed from: e0, reason: collision with root package name */
    private String f11494e0;

    /* renamed from: f0, reason: collision with root package name */
    private EditText f11495f0;

    /* renamed from: g0, reason: collision with root package name */
    private EditText f11496g0;

    private void H0() {
        this.f11494e0 = getArguments().getString(INP_DV_CD);
    }

    private void I0() {
        p0(AbstractC5955f.btn_delivery_kkt_history).setOnClickListener(this);
        p0(AbstractC5955f.btn_delivery_kkt_delivery).setOnClickListener(this);
    }

    private void J0() {
        if (this.f11494e0 == "S") {
            N.setBulletSpan(r0(AbstractC5952c.delivery_etc_notice), (TextView) p0(AbstractC5955f.tv_delivery_kkt_notice));
        } else {
            N.setBulletSpanRed(r0(AbstractC5952c.delivery_kakao_notice), (TextView) p0(AbstractC5955f.tv_delivery_kkt_notice), getString(AbstractC5959j.delivery_korail_talk_notice_stress), getApplicationContext());
        }
    }

    private void K0() {
        this.f11495f0 = (EditText) p0(AbstractC5955f.et_delivery_kkt_nm);
        this.f11496g0 = (EditText) p0(AbstractC5955f.et_delivery_kkt_hp_no);
    }

    public static Fragment newInstance(String str) {
        Bundle bundle = new Bundle();
        bundle.putString(INP_DV_CD, str);
        e eVar = new e();
        eVar.setArguments(bundle);
        return eVar;
    }

    @Override // c5.d
    protected void D0(RecentDeliveryHistoryDao.Acep acep) {
        this.f11495f0.setText(acep.getAcepCustNm());
        this.f11496g0.setText(acep.getAcepCustTeln());
    }

    @Override // c5.d, com.korail.talk.view.base.a, androidx.fragment.app.Fragment, androidx.lifecycle.InterfaceC1018g
    public /* bridge */ /* synthetic */ AbstractC5837a getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (C6630d.isNull(bundle)) {
            H0();
            K0();
            J0();
            I0();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (AbstractC5955f.btn_delivery_kkt_history == id) {
            C0();
        } else if (AbstractC5955f.btn_delivery_kkt_delivery == id) {
            E0(this.f11494e0, this.f11495f0, this.f11496g0);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(AbstractC5957h.fragment_delivery_kkt, viewGroup, false);
    }
}
