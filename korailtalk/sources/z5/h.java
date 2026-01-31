package z5;

import Q7.X;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.refund.RefundExecuteTicketRefundDao;
import com.korail.talk.network.dao.refund.RefundExecuteTicketRefundDao.RefundExecuteTicketRefundRequest;
import com.korail.talk.network.dao.refund.RefundVerifyTicketDao;
import k0.AbstractC5837a;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import q4.C6111b;
import z4.C6630d;
import z4.C6634h;
import z4.C6637k;
import z4.N;
import z4.O;

/* loaded from: classes.dex */
public class h extends com.korail.talk.view.base.a implements CompoundButton.OnCheckedChangeListener, View.OnClickListener {
    public static final String TAG = "OfflineReturnInputFragment";

    /* renamed from: d0, reason: collision with root package name */
    private RefundVerifyTicketDao.RefundVerifyTicketResponse f37929d0;

    /* renamed from: e0, reason: collision with root package name */
    private InterfaceC6646d f37930e0;

    /* renamed from: f0, reason: collision with root package name */
    private CheckBox f37931f0;

    /* renamed from: g0, reason: collision with root package name */
    private Button f37932g0;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A0(DialogInterface dialogInterface, int i8) {
        if (100 == i8) {
            this.f37930e0.againCallOfflineReturnInputFragment();
        } else if (102 == i8) {
            this.f37930e0.setOfflineReturnNoticeFragment();
        }
    }

    private void B0() {
        this.f37929d0 = (RefundVerifyTicketDao.RefundVerifyTicketResponse) getArguments().getSerializable("OFFLINE_RETURN_RESPONSE");
    }

    private void C0() {
        this.f37931f0.setOnCheckedChangeListener(this);
        this.f37932g0.setOnClickListener(this);
    }

    private void D0() {
        StringBuilder sb = new StringBuilder();
        RefundVerifyTicketDao.RefundVerifyTicketResponse.Orgtkinfo orgtkinfo = this.f37929d0.getOrgTkInfos().get(0);
        sb.append(C6634h.convertFormat(orgtkinfo.getJrnyinfo_list().get(0).getDpt_dt(), "yyyyMMdd", "yyyy년 MM월 dd일 (E)"));
        sb.append(X.LF);
        for (int i8 = 0; i8 < orgtkinfo.getJrnyinfo_list().size(); i8++) {
            RefundVerifyTicketDao.RefundVerifyTicketResponse.JrnyInfo jrnyInfo = orgtkinfo.getJrnyinfo_list().get(i8);
            sb.append("[");
            sb.append(O.getTrainGroupName(jrnyInfo.getTrn_gp_cd()));
            sb.append("] ");
            sb.append(N.getInteger(jrnyInfo.getTrn_no()) + X.SPACE);
            sb.append(C6111b.getInstance().getStationNameByCode(jrnyInfo.getDpt_rs_stn_cd()));
            sb.append(X.SPACE);
            sb.append(C6634h.convertFormat(jrnyInfo.getDpt_tm(), "HHmmss", "HH:mm"));
            sb.append(" → ");
            sb.append(C6111b.getInstance().getStationNameByCode(jrnyInfo.getArv_rs_stn_cd()));
            sb.append(X.SPACE);
            sb.append(C6634h.convertFormat(jrnyInfo.geArv_tm(), "HHmmss", "HH:mm"));
            sb.append(X.LF);
            sb.append(N.getInteger(jrnyInfo.getSeatinfo_list().get(0).getScar_no()) + getString(AbstractC5959j.offline_return_ticket_train_number) + X.SPACE);
            sb.append(jrnyInfo.getSeatinfo_list().get(0).getPsrm_cl_nm());
            sb.append(X.SPACE);
            sb.append(jrnyInfo.getSeatinfo_list().get(0).getSeat_no());
            if (i8 < orgtkinfo.getJrnyinfo_list().size() - 1) {
                sb.append(X.LF);
            }
        }
        ((TextView) p0(AbstractC5955f.ticketInfoTxt)).setText(sb.toString());
        ((TextView) p0(AbstractC5955f.ticketReturnNoTxt)).setText(getArguments().getString("TICKET_RETURN_NUMBER", ""));
        ((TextView) p0(AbstractC5955f.receiptSumTxt)).setText(getString(AbstractC5959j.common_amount, N.getDecimalFormatString(this.f37929d0.getRcvd_amt())));
        ((TextView) p0(AbstractC5955f.returnChargeSumTxt)).setText(getString(AbstractC5959j.common_amount, N.getDecimalFormatString(this.f37929d0.getRet_fee())));
        ((TextView) p0(AbstractC5955f.returnAmount)).setText(getString(AbstractC5959j.common_amount, N.getDecimalFormatString(this.f37929d0.getRet_amt())));
    }

    private void E0() {
        this.f37931f0 = (CheckBox) p0(AbstractC5955f.agreeCheck);
        Button button = (Button) p0(AbstractC5955f.bottomBtn);
        this.f37932g0 = button;
        button.setEnabled(false);
    }

    public static h newInstance(RefundVerifyTicketDao.RefundVerifyTicketResponse refundVerifyTicketResponse, String str, String str2, String str3) {
        h hVar = new h();
        Bundle bundle = new Bundle();
        bundle.putSerializable("OFFLINE_RETURN_RESPONSE", refundVerifyTicketResponse);
        bundle.putString("TICKET_RETURN_NUMBER", str);
        bundle.putString("CUSTOMER_NUMBER", str2);
        bundle.putString("PHONE_NUMBER", str3);
        hVar.setArguments(bundle);
        return hVar;
    }

    private void y0() {
        RefundExecuteTicketRefundDao refundExecuteTicketRefundDao = new RefundExecuteTicketRefundDao();
        RefundExecuteTicketRefundDao.RefundExecuteTicketRefundRequest refundExecuteTicketRefundRequest = refundExecuteTicketRefundDao.new RefundExecuteTicketRefundRequest();
        refundExecuteTicketRefundRequest.setOgtkSaleDt(this.f37929d0.getOrgTkInfos().get(0).getOgtk_sale_dt());
        refundExecuteTicketRefundRequest.setOgtkSaleWctNo(this.f37929d0.getOrgTkInfos().get(0).getOgtk_sale_wct_no());
        refundExecuteTicketRefundRequest.setOgtkSaleSqno(this.f37929d0.getOrgTkInfos().get(0).getOgtk_sale_sqno());
        refundExecuteTicketRefundRequest.setOgtkRetPwd(this.f37929d0.getOrgTkInfos().get(0).getOgtk_ret_pwd());
        refundExecuteTicketRefundRequest.setPnrNo(this.f37929d0.getOrgTkInfos().get(0).getPrnNo());
        refundExecuteTicketRefundRequest.setTkKndCd(this.f37929d0.getOrgTkInfos().get(0).getTk_knd_cd());
        refundExecuteTicketRefundRequest.setRetDvCd(this.f37929d0.getOrgTkInfos().get(0).getRet_dv_cd());
        refundExecuteTicketRefundRequest.setRetRsnCd(this.f37929d0.getOrgTkInfos().get(0).getRet_rsn_cd());
        refundExecuteTicketRefundRequest.setAcepCustNm(getArguments().getString("CUSTOMER_NUMBER", ""));
        refundExecuteTicketRefundRequest.setCustTeln(getArguments().getString("PHONE_NUMBER", ""));
        refundExecuteTicketRefundRequest.setRetFee(this.f37929d0.getRet_fee());
        refundExecuteTicketRefundRequest.setRetAmt(this.f37929d0.getRet_amt());
        refundExecuteTicketRefundDao.setRequest(refundExecuteTicketRefundRequest);
        executeDao(refundExecuteTicketRefundDao);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z0(DialogInterface dialogInterface, int i8) {
        if (102 == i8) {
            y0();
        }
    }

    @Override // com.korail.talk.view.base.a, androidx.fragment.app.Fragment, androidx.lifecycle.InterfaceC1018g
    public /* bridge */ /* synthetic */ AbstractC5837a getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (C6630d.isNull(bundle)) {
            B0();
            E0();
            D0();
            C0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.korail.talk.view.base.a, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        this.f37930e0 = (InterfaceC6646d) context;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z8) {
        this.f37932g0.setEnabled(z8);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        t0(view);
        if (AbstractC5955f.bottomBtn == view.getId()) {
            C6637k.getCDialog(getActivity(), 1002, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.offline_return_ticket_refund_popup_message, N.getDecimalFormatString(this.f37929d0.getRet_fee()))).setButtonListener(new DialogInterface.OnClickListener() { // from class: z5.f
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    this.f37927a.z0(dialogInterface, i8);
                }
            }).showDialog();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(AbstractC5957h.offline_return_request_fragment, viewGroup, false);
    }

    @Override // com.korail.talk.view.base.a, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        super.onReceive(iBaseDao);
        if (AbstractC5955f.dao_execute_ticket_refund == iBaseDao.getId()) {
            C6637k.getCDialog(getActivity(), 1002, 0, getString(AbstractC5959j.dialog_title)).setContent("02".equals(((RefundExecuteTicketRefundDao.RefundExecuteTicketRefundResponse) iBaseDao.getResponse()).getH_ret_dv_cd()) ? getString(AbstractC5959j.offline_return_ticket_refund_complete_message) : getString(AbstractC5959j.offline_return_ticket_refund_success_message)).setButtonNames(N.getStringArray(getString(AbstractC5959j.offline_return_ticket_refund_success_positive), getString(AbstractC5959j.common_confirm))).setButtonListener(new DialogInterface.OnClickListener() { // from class: z5.g
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    this.f37928a.A0(dialogInterface, i8);
                }
            }).showDialog();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        u0(AbstractC5959j.offline_return_ticket_title_refund_info);
    }
}
