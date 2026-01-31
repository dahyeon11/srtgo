package Y4;

import T4.c;
import V4.b;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.korail.talk.data.CalendarData;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.refund.TicketDetailDao;
import com.korail.talk.network.dao.research.CmtrInfoDao;
import com.korail.talk.network.dao.research.CmtrInfoDao.CmtrInfoRequest;
import com.korail.talk.ui.booking.option.date.a;
import com.korail.talk.ui.booking.option.station.StationSearch;
import k0.AbstractC5837a;
import n4.AbstractC5955f;
import n4.AbstractC5959j;
import y6.C6550j;
import z4.C6630d;
import z4.C6631e;
import z4.C6637k;
import z4.M;

/* loaded from: classes.dex */
public class g extends l {

    /* renamed from: j0, reason: collision with root package name */
    private T4.a f5629j0;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B0(DialogInterface dialogInterface, int i8) {
        q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C0(CalendarData calendarData) {
        this.f5635d0.setDate(calendarData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D0() {
        K0(this.f5639h0.getArrivalStationNm(), this.f5639h0.getStartStationNm(), 0);
    }

    private void Q0(String str, String str2, String str3, String str4) {
        CmtrInfoDao cmtrInfoDao = new CmtrInfoDao();
        CmtrInfoDao.CmtrInfoRequest cmtrInfoRequest = cmtrInfoDao.new CmtrInfoRequest();
        cmtrInfoRequest.setJobDvCd(CmtrInfoDao.CmtrInfoRequest.JOB_DV_CD_C);
        cmtrInfoRequest.setOgtkSaleWctNo(str);
        cmtrInfoRequest.setOgtkSaleDd(str2);
        cmtrInfoRequest.setOgtkSaleSqno(str3);
        cmtrInfoRequest.setOgtkRetPwd(str4);
        cmtrInfoRequest.setInquiryType(getArguments().getString("INQUIRY_TYPE", "0"));
        cmtrInfoDao.setRequest(cmtrInfoRequest);
        executeDao(cmtrInfoDao);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R0(Bundle bundle, int i8, String str) {
        this.f5635d0.setInquiryEnable(bundle.getInt("TOTAL_PERSON_COUNT") > 0);
    }

    public static Fragment newInstance(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("INQUIRY_TYPE", str);
        g gVar = new g();
        gVar.setArguments(bundle);
        return gVar;
    }

    @Override // Y4.l
    protected void G0() {
        com.korail.talk.ui.booking.option.date.a aVar = new com.korail.talk.ui.booking.option.date.a(getActivity());
        this.f5640i0 = aVar;
        this.f5638g0.addView(aVar);
        this.f5640i0.setHeaderSummary(getString(AbstractC5959j.common_departure_date));
        String[] normalDateStrArray = C6631e.getNormalDateStrArray(this.f5635d0.getDetailResponse().getTicket_infos().getTicket_info().get(0).getH_dpt_dt());
        if (normalDateStrArray.length == 0) {
            C6637k.getCDialog(getActivity(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.n_card_not_use_day)).setButtonListener(new DialogInterface.OnClickListener() { // from class: Y4.e
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    this.f5627a.B0(dialogInterface, i8);
                }
            }).showDialog();
        } else {
            this.f5640i0.setDate(normalDateStrArray);
        }
        this.f5640i0.setOnChangeDateOptionListener(new a.d() { // from class: Y4.f
            @Override // com.korail.talk.ui.booking.option.date.a.d
            public final void onChangeDateOption(CalendarData calendarData) {
                this.f5628a.C0(calendarData);
            }
        });
    }

    @Override // Y4.l
    protected void I0() {
        T4.a aVar = new T4.a(getActivity());
        this.f5629j0 = aVar;
        aVar.setOnChangePersonInfoListener(new c.a() { // from class: Y4.d
            @Override // T4.c.a
            public final void onChangePersonInfo(Bundle bundle, int i8, String str) {
                this.f5626a.R0(bundle, i8, str);
            }
        });
        this.f5638g0.addView(this.f5629j0);
    }

    @Override // Y4.l
    protected void J0() {
        V4.b bVar = new V4.b(getActivity());
        this.f5639h0 = bVar;
        this.f5638g0.addView(bVar);
        String[] stationNm = M.getStationNm();
        this.f5639h0.setStationInfo(stationNm[0], stationNm[1], 0);
        this.f5639h0.setOnReverseStationsListener(new b.a() { // from class: Y4.c
            @Override // V4.b.a
            public final void onReverseStation() {
                this.f5625a.D0();
            }
        });
    }

    @Override // Y4.l, com.korail.talk.view.base.a, androidx.fragment.app.Fragment, androidx.lifecycle.InterfaceC1018g
    public /* bridge */ /* synthetic */ AbstractC5837a getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }

    @Override // Y4.l, Y4.b
    public int getPassengerCount() {
        return this.f5629j0.getPassengerInfo().getInt("TOTAL_PERSON_COUNT");
    }

    @Override // Y4.l, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (C6630d.isNull(bundle)) {
            TicketDetailDao.TicketDetailResponse detailResponse = this.f5635d0.getDetailResponse();
            Q0(detailResponse.getH_orgtk_wct_no(), detailResponse.getH_orgtk_ret_sale_dt(), detailResponse.getH_orgtk_sale_sqno(), detailResponse.getH_orgtk_ret_pwd());
        }
    }

    @Override // Y4.l, v4.g
    public void onOptionHeaderClick(C6550j c6550j, boolean z8) {
        if (C6630d.isNotNull(c6550j)) {
            if (c6550j instanceof V4.b) {
                this.f5635d0.showStationSearch(((V4.b) c6550j).isDepartureSelected() ? StationSearch.c.START : StationSearch.c.ARRIVAL);
            }
            super.onOptionHeaderClick(c6550j, z8);
        }
    }

    @Override // com.korail.talk.view.base.a, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        super.onReceive(iBaseDao);
        if (AbstractC5955f.dao_cmtr_info == iBaseDao.getId()) {
            CmtrInfoDao cmtrInfoDao = (CmtrInfoDao) iBaseDao;
            CmtrInfoDao.CmtrInfoRequest cmtrInfoRequest = (CmtrInfoDao.CmtrInfoRequest) cmtrInfoDao.getRequest();
            CmtrInfoDao.CmtrInfoResponse cmtrInfoResponse = (CmtrInfoDao.CmtrInfoResponse) cmtrInfoDao.getResponse();
            this.f5636e0.setMenuId(cmtrInfoResponse.getMenuId());
            this.f5636e0.setSeatAttCd1(cmtrInfoResponse.getSeatAttCd1());
            this.f5629j0.init(cmtrInfoRequest.getJobDvCd(), cmtrInfoResponse);
        }
    }
}
