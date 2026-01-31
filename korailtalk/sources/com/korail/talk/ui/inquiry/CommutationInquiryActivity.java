package com.korail.talk.ui.inquiry;

import I4.h;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.korail.talk.data.reservation.CReservationData;
import com.korail.talk.data.reservation.ReservationMessageData;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.pass.CommPaymentDao;
import com.korail.talk.network.dao.pass.CommPaymentDao.CommPaymentRequest;
import com.korail.talk.network.dao.pass.CommReservationDao;
import com.korail.talk.network.dao.pass.CommReservationDao.CommReservationRequest;
import com.korail.talk.network.dao.pass.CommRsvInquiryDao;
import com.korail.talk.ui.reservation.confirm.activity.CReservationConfirmActivity;
import com.korail.talk.view.base.BaseViewActivity;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import n4.AbstractC5952c;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import r4.d;
import r4.i;
import r4.k;
import y4.C6536a;
import z4.C6625A;
import z4.C6630d;
import z4.C6637k;
import z4.C6642p;
import z4.N;
import z4.O;
import z4.t;

/* loaded from: classes.dex */
public class CommutationInquiryActivity extends BaseViewActivity implements AdapterView.OnItemClickListener {

    /* renamed from: i, reason: collision with root package name */
    private final String f28024i = "TRAIN_NAME";

    /* renamed from: j, reason: collision with root package name */
    private final String f28025j = "TOTAL_AMOUNT";

    /* renamed from: k, reason: collision with root package name */
    private final String f28026k = "STATION_NAME";

    /* renamed from: l, reason: collision with root package name */
    private CommRsvInquiryDao.CommRsvInquiryRequest f28027l;

    /* renamed from: m, reason: collision with root package name */
    private List f28028m;

    /* renamed from: n, reason: collision with root package name */
    private ArrayList f28029n;

    /* renamed from: o, reason: collision with root package name */
    private ListView f28030o;

    /* renamed from: p, reason: collision with root package name */
    private b f28031p;

    private class b extends BaseAdapter {

        /* renamed from: a, reason: collision with root package name */
        private final LayoutInflater f28032a;

        private class a {

            /* renamed from: a, reason: collision with root package name */
            TextView f28034a;

            /* renamed from: b, reason: collision with root package name */
            TextView f28035b;

            /* renamed from: c, reason: collision with root package name */
            TextView f28036c;

            private a() {
            }
        }

        public b() {
            this.f28032a = CommutationInquiryActivity.this.getLayoutInflater();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            if (C6630d.isNotNull(CommutationInquiryActivity.this.f28029n)) {
                return CommutationInquiryActivity.this.f28029n.size();
            }
            return 0;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i8) {
            return CommutationInquiryActivity.this.f28029n.get(i8);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i8) {
            return 0L;
        }

        @Override // android.widget.Adapter
        public View getView(int i8, View view, ViewGroup viewGroup) {
            View viewInflate;
            a aVar;
            if (C6630d.isNull(view)) {
                aVar = new a();
                viewInflate = this.f28032a.inflate(AbstractC5957h.item_commutation_inquiry, viewGroup, false);
                aVar.f28034a = (TextView) viewInflate.findViewById(AbstractC5955f.item_tv_commutation_inquiry_train_nm);
                aVar.f28035b = (TextView) viewInflate.findViewById(AbstractC5955f.item_tv_commutation_inquiry_total_amount);
                aVar.f28036c = (TextView) viewInflate.findViewById(AbstractC5955f.item_tv_commutation_inquiry_station_nm);
                viewInflate.setTag(aVar);
            } else {
                viewInflate = view;
                aVar = (a) view.getTag();
            }
            Bundle bundle = (Bundle) getItem(i8);
            aVar.f28034a.setText(bundle.getString("TRAIN_NAME"));
            aVar.f28035b.setText(bundle.getString("TOTAL_AMOUNT"));
            aVar.f28036c.setText(N.fromHtml(bundle.getString("STATION_NAME")));
            return viewInflate;
        }
    }

    private void A0() {
        this.f28027l = (CommRsvInquiryDao.CommRsvInquiryRequest) getIntent().getSerializableExtra("COMMUTATION_REQUEST");
        this.f28029n = new ArrayList();
    }

    private void B0() {
        this.f28030o.setOnItemClickListener(this);
    }

    private void C0() {
        m0();
        x0();
        ListView listView = (ListView) findViewById(AbstractC5955f.lv_commutation_inquiry);
        this.f28030o = listView;
        listView.setEmptyView(findViewById(AbstractC5955f.tv_commutation_inquiry_empty));
        b bVar = new b();
        this.f28031p = bVar;
        this.f28030o.setAdapter((ListAdapter) bVar);
        this.f28030o.getEmptyView().setVisibility(8);
    }

    private void D0(final CommReservationDao.CommReservationRequest commReservationRequest, final CommReservationDao.CommReservationResponse commReservationResponse) {
        if (N.isNotNull(commReservationResponse.getH_guide())) {
            C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(commReservationResponse.getH_guide()).setButtonListener(new DialogInterface.OnClickListener() { // from class: f5.a
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    this.f31199a.y0(commReservationRequest, commReservationResponse, dialogInterface, i8);
                }
            }).showDialog();
        } else {
            z0(commReservationRequest, commReservationResponse);
        }
    }

    private void setText() {
        setAppTitle(AbstractC5959j.title_select_train_inquiry);
    }

    private void u0(int i8) {
        CommReservationDao commReservationDao = new CommReservationDao();
        commReservationDao.setRequest(w0(i8));
        executeDao(commReservationDao);
    }

    private void v0() {
        CommRsvInquiryDao commRsvInquiryDao = new CommRsvInquiryDao();
        this.f28027l.setTxtSelPage("1");
        this.f28027l.setTxtCntPerPage("");
        commRsvInquiryDao.setErrorMsgCdNotShowDialog("WRG000000");
        commRsvInquiryDao.setFinishView(true);
        commRsvInquiryDao.setRequest(this.f28027l);
        executeDao(commRsvInquiryDao);
    }

    private CommReservationDao.CommReservationRequest w0(int i8) {
        CommReservationDao.CommReservationRequest commReservationRequest = new CommReservationDao().new CommReservationRequest();
        commReservationRequest.setHidCmtrKndCd(this.f28027l.getTxtCmtrKndCd());
        commReservationRequest.setHidCmtrUtlTrmCd(this.f28027l.getTxtCmtrUtlTrmCd());
        commReservationRequest.setHidCmtrUtlTrmNm(this.f28027l.getTxtCmtrUtlTrmNm());
        commReservationRequest.setHidCmtrUtlAgeCd(this.f28027l.getTxtCmtrUtlAgeCd());
        commReservationRequest.setHidUseOpenDt(this.f28027l.getSelGoAbrdDt());
        commReservationRequest.setStationInfo(((Bundle) this.f28029n.get(i8)).getString("STATION_NAME"));
        List<CommRsvInquiryDao.TrainList> train_list = ((CommRsvInquiryDao.CommRsvInquiryResponse.ScheduleInfoList) this.f28028m.get(i8)).getTrain_list();
        int i9 = 0;
        while (i9 < train_list.size()) {
            CommRsvInquiryDao.TrainList trainList = train_list.get(i9);
            if (i9 == 0) {
                commReservationRequest.setHidAppDptStnCd(trainList.getH_dpt_rs_stn_cd());
                commReservationRequest.setHidAppDptStnNm(trainList.getH_dpt_rs_stn_nm());
                commReservationRequest.setHidTrnNo1(trainList.getH_trn_no());
                commReservationRequest.setHidTrnGpCd1(trainList.getH_trn_gp_cd());
                commReservationRequest.setHidDtour1(trainList.getH_dtour());
            } else {
                commReservationRequest.setHidTrnNo2(trainList.getH_trn_no());
                commReservationRequest.setHidTrnGpCd2(trainList.getH_trn_gp_cd());
                commReservationRequest.setHidDtour2(trainList.getH_dtour());
            }
            String h_dpt_rs_stn_nm = "";
            commReservationRequest.setHidChtrnStnCd(i9 == 0 ? "" : trainList.getH_dpt_rs_stn_cd());
            if (i9 != 0) {
                h_dpt_rs_stn_nm = trainList.getH_dpt_rs_stn_nm();
            }
            commReservationRequest.setHidChtrnStnNm(h_dpt_rs_stn_nm);
            commReservationRequest.setHidAppArvStnCd(trainList.getH_arv_rs_stn_cd());
            commReservationRequest.setHidAppArvStnNm(trainList.getH_arv_rs_stn_nm());
            i9++;
        }
        return commReservationRequest;
    }

    private void x0() {
        View.inflate(this, d.DIRECT_SQ_NO.getCode().equals(this.f28027l.getRadChgTrnDvCd()) ? AbstractC5957h.round_two_stations_name : AbstractC5957h.round_three_stations_name, (ViewGroup) findViewById(AbstractC5955f.v_commutation_inquiry_route_bar));
        ((TextView) findViewById(AbstractC5955f.departureTxt)).setText(this.f28027l.getTxtGoStart());
        ((TextView) findViewById(AbstractC5955f.arrivalTxt)).setText(this.f28027l.getTxtGoEnd());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y0(CommReservationDao.CommReservationRequest commReservationRequest, CommReservationDao.CommReservationResponse commReservationResponse, DialogInterface dialogInterface, int i8) {
        z0(commReservationRequest, commReservationResponse);
    }

    private void z0(CommReservationDao.CommReservationRequest commReservationRequest, CommReservationDao.CommReservationResponse commReservationResponse) {
        try {
            CommReservationDao.CommReservationResponse.MainInfo main_info = commReservationResponse.getMain_info();
            main_info.setStationInfo(commReservationRequest.getStationInfo());
            main_info.setUserNames(h.getInstance().getMemberName() + getString(AbstractC5959j.common_respect));
            main_info.setIncludeHoliday("Y".equals(this.f28027l.getTxtWkndUseFlg()));
            CommPaymentDao.CommPaymentRequest commPaymentRequest = new CommPaymentDao().new CommPaymentRequest();
            commPaymentRequest.setCommPaymentMap(C6625A.convertObjectToMap(main_info));
            CReservationData cReservationData = new CReservationData();
            cReservationData.setPaymentType(i.PAYMENT_DEFAULT);
            cReservationData.setPaymentRequest(commPaymentRequest);
            cReservationData.setReservationType(k.COMMUTATION);
            cReservationData.setMainInfo(main_info);
            ArrayList arrayList = new ArrayList();
            ReservationMessageData reservationMessageData = new ReservationMessageData();
            reservationMessageData.setTitle(getString(AbstractC5959j.notice_must_know));
            reservationMessageData.setMessageList(Arrays.asList(getResources().getStringArray(main_info.isIncludeHoliday() ? AbstractC5952c.commutation_holiday_commission_message : AbstractC5952c.commutation_commission_message)));
            ReservationMessageData reservationMessageData2 = new ReservationMessageData();
            reservationMessageData2.setTitle(getString(AbstractC5959j.common_additional_fare));
            reservationMessageData2.setMessageList(Arrays.asList(getResources().getStringArray(AbstractC5952c.commutation_message)));
            arrayList.add(reservationMessageData);
            arrayList.add(reservationMessageData2);
            cReservationData.setReservationMessageDataList(arrayList);
            Intent intent = new Intent(getApplicationContext(), (Class<?>) CReservationConfirmActivity.class);
            intent.putExtra("RESERVATION_DATA", cReservationData);
            startActivity(intent);
        } catch (Exception e8) {
            t.e(e8.getMessage());
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    public void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_commutation_inquiry);
        if (C6630d.isNull(bundle)) {
            A0();
            C0();
            setText();
            B0();
            v0();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i8, long j8) {
        u0(i8);
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        super.onReceive(iBaseDao);
        int id = iBaseDao.getId();
        if (AbstractC5955f.dao_comm_rsv_inquiry != id) {
            if (AbstractC5955f.dao_comm_reservation == id) {
                D0((CommReservationDao.CommReservationRequest) iBaseDao.getRequest(), (CommReservationDao.CommReservationResponse) iBaseDao.getResponse());
                return;
            }
            return;
        }
        this.f28028m = ((CommRsvInquiryDao.CommRsvInquiryResponse) iBaseDao.getResponse()).getSchedule_info();
        for (int i8 = 0; i8 < this.f28028m.size(); i8++) {
            Bundle bundle = new Bundle();
            List<CommRsvInquiryDao.TrainList> train_list = ((CommRsvInquiryDao.CommRsvInquiryResponse.ScheduleInfoList) this.f28028m.get(i8)).getTrain_list();
            bundle.putString("TRAIN_NAME", O.getTrainGroupName(N.getIntegerString(train_list.get(0).getH_trn_gp_cd())));
            bundle.putString("TOTAL_AMOUNT", getString(AbstractC5959j.common_amount, N.getDecimalFormatString(train_list.get(0).getH_schd_prc())));
            bundle.putString("STATION_NAME", C6642p.getRoute(train_list));
            this.f28029n.add(bundle);
        }
        this.f28031p.notifyDataSetChanged();
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceiveError(IBaseDao iBaseDao, C6536a c6536a) {
        if (AbstractC5955f.dao_comm_rsv_inquiry == iBaseDao.getId()) {
            this.f28031p.notifyDataSetChanged();
        }
    }
}
