package F4;

import Q7.X;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.korail.talk.data.WheelchairData;
import com.korail.talk.network.dao.myTicket.TicketListDao;
import com.korail.talk.network.dao.refund.TicketDetailDao;
import com.korail.talk.network.data.addService.ExtraProductInfo;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n4.AbstractC5959j;
import z4.C6630d;
import z4.C6632f;
import z4.C6634h;

/* renamed from: F4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0501b extends C6632f {

    /* renamed from: F4.b$b, reason: collision with other inner class name */
    private static class C0029b implements H4.a {

        /* renamed from: a, reason: collision with root package name */
        private final TicketDetailDao.TicketDetailResponse f1212a;

        /* renamed from: b, reason: collision with root package name */
        private final int f1213b;

        /* renamed from: c, reason: collision with root package name */
        private int f1214c;

        /* renamed from: d, reason: collision with root package name */
        private int f1215d;

        /* renamed from: e, reason: collision with root package name */
        private String f1216e;

        /* JADX INFO: Access modifiers changed from: private */
        public int d() {
            return this.f1214c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String e() {
            return this.f1216e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int f() {
            return this.f1215d;
        }

        @Override // H4.a
        public /* bridge */ /* synthetic */ void callTicketKind(TicketDetailDao.TicketDetailResponse ticketDetailResponse) {
            super.callTicketKind(ticketDetailResponse);
        }

        @Override // H4.a
        public void setCommutationTicket(int i8) {
            String h_jrny_tp_cd = this.f1212a.getTicket_infos().getTicket_info().get(0).getH_jrny_tp_cd();
            String h_schd_tk_knd_cd = this.f1212a.getH_schd_tk_knd_cd();
            String h_cmtr_utl_trm_age_cd = this.f1212a.getH_cmtr_utl_trm_age_cd();
            if (r4.e.DIRECT.getCode().equals(h_jrny_tp_cd)) {
                this.f1214c = 3;
            } else {
                this.f1214c = 4;
            }
            if (C0500a.isYCommutation(h_schd_tk_knd_cd) || C0500a.isYPeriodCommutation(h_cmtr_utl_trm_age_cd)) {
                this.f1215d = 33;
            } else {
                this.f1215d = 34;
            }
        }

        @Override // H4.a
        public void setGPassTicket(int i8) {
            this.f1214c = 10;
            this.f1215d = 37;
        }

        @Override // H4.a
        public void setGeneralTicket(int i8) {
            TicketDetailDao.TicketInfo ticketInfo = this.f1212a.getTicket_infos().getTicket_info().get(0);
            String h_trn_clsf_cd = ticketInfo.getH_trn_clsf_cd();
            String h_jrny_tp_cd = ticketInfo.getH_jrny_tp_cd();
            if (C0500a.isStandingSeat(h_jrny_tp_cd)) {
                this.f1214c = 2;
                this.f1215d = 31;
                this.f1216e += this.f1213b + "매";
                return;
            }
            if (C0501b.o(h_trn_clsf_cd)) {
                if (C0501b.p(ticketInfo.getH_dpt_dt(), "20241031")) {
                    this.f1214c = 7;
                } else {
                    this.f1214c = -7;
                }
                this.f1215d = 30;
                this.f1216e += X.SPACE + ticketInfo.getTk_seat_info().size() + "매";
                return;
            }
            if (r4.e.DIRECT.getCode().equals(h_jrny_tp_cd)) {
                this.f1214c = 0;
            } else {
                this.f1214c = 1;
            }
            if ("스마트티켓".equals(this.f1212a.getH_tk_knd_nm())) {
                this.f1215d = 30;
            } else {
                this.f1215d = 32;
            }
            this.f1216e += this.f1213b + "매";
        }

        @Override // H4.a
        public void setNCCardTicket(int i8) {
            this.f1214c = 8;
            this.f1215d = 36;
        }

        @Override // H4.a
        public void setPassTicket(int i8) {
            this.f1214c = 5;
            this.f1215d = 35;
        }

        private C0029b(List list) {
            TicketDetailDao.TicketDetailResponse ticketDetailResponse = (TicketDetailDao.TicketDetailResponse) list.get(0);
            this.f1212a = ticketDetailResponse;
            this.f1216e = ticketDetailResponse.getH_tk_knd_nm();
            this.f1213b = list.size();
        }

        @Override // H4.a
        public /* bridge */ /* synthetic */ void callTicketKind(TicketDetailDao.TicketDetailResponse ticketDetailResponse, boolean z8) {
            super.callTicketKind(ticketDetailResponse, z8);
        }

        @Override // H4.a
        public /* bridge */ /* synthetic */ void callTicketKind(TicketDetailDao.TicketDetailResponse ticketDetailResponse, boolean z8, int i8) {
            super.callTicketKind(ticketDetailResponse, z8, i8);
        }
    }

    private static void e(TicketListDao.ReservationList reservationList, List list) {
        List<TicketListDao.TicketList> ticket_list = reservationList.getTicket_list();
        for (int i8 = 0; i8 < ticket_list.size(); i8++) {
            List<TicketListDao.TrainInfo> train_info = ticket_list.get(i8).getTrain_info();
            TicketDetailDao.TicketDetailResponse ticketDetailResponse = (TicketDetailDao.TicketDetailResponse) list.get(i8);
            for (int i9 = 0; i9 < train_info.size(); i9++) {
                ticketDetailResponse.setH_pbp_acep_tgt_flg(train_info.get(i9).getH_pbp_acep_tgt_flg());
            }
        }
    }

    private static Bundle f(TicketDetailDao.TicketDetailResponse ticketDetailResponse) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("SEAT_APP_PSB_FLG", "Y".equals(ticketDetailResponse.getSeatAppPsbFlg()));
        bundle.putBoolean("STND_APP_PSB_FLG", "Y".equals(ticketDetailResponse.getStndAppPsbFlg()));
        bundle.putString(j4.r.QR_CODE, ticketDetailResponse.getH_qrcode());
        bundle.putString("RETURN_NO", ticketDetailResponse.getH_orgtk_wct_no() + g5.e.STATE_NAME_NONE + ticketDetailResponse.getH_orgtk_ret_sale_dt() + g5.e.STATE_NAME_NONE + ticketDetailResponse.getH_orgtk_sale_sqno() + g5.e.STATE_NAME_NONE + ticketDetailResponse.getH_orgtk_ret_pwd());
        bundle.putString("CUSTOMER_NAME", ticketDetailResponse.getH_abrd_ps_nm());
        bundle.putString("CUSTOMER_SEX", ticketDetailResponse.getH_abrd_ps_sex());
        bundle.putString("CUSTOMER_BIRTH", C6634h.convertFormatTimeZone(ticketDetailResponse.getS_brth(), "yyyyMMdd", "yyyy년 MM월 dd일"));
        bundle.putString("SELF_CHECKIN_STATUS", ticketDetailResponse.getTicket_infos().getTicket_info().get(0).getTk_seat_info().get(0).getH_chckn_stt_cd());
        StringBuilder sb = new StringBuilder();
        sb.append(" 정기권 셀프체크인 : ");
        sb.append(ticketDetailResponse.getTicket_infos().getTicket_info().get(0).getTk_seat_info().get(0).getH_chckn_stt_cd());
        z4.t.d(sb.toString());
        return bundle;
    }

    private static Bundle g(TicketListDao.ReservationList reservationList, List list, int i8, boolean z8, boolean z9) {
        boolean z10;
        TicketDetailDao.TicketDetailResponse ticketDetailResponse = (TicketDetailDao.TicketDetailResponse) list.get(0);
        TicketDetailDao.TicketInfo ticketInfo = ticketDetailResponse.getTicket_infos().getTicket_info().get(0);
        String h_tk_knd_cd = ticketDetailResponse.getH_tk_knd_cd();
        C0029b c0029b = new C0029b(list);
        c0029b.callTicketKind(ticketDetailResponse, z8);
        Bundle bundle = new Bundle();
        bundle.putInt("INDEX", i8);
        bundle.putBoolean("IS_PURCHASE_HISTORY", z8);
        bundle.putBoolean("IS_EMERGENCY", z9);
        for (int i9 = 0; i9 < reservationList.getTicket_list().size(); i9++) {
            z4.t.d(i9 + ", Flag : " + reservationList.getTicket_list().get(i9).getTrain_info().get(0).getH_pbp_acep_tgt_flg());
            if ("N".equals(reservationList.getTicket_list().get(i9).getTrain_info().get(0).getH_pbp_acep_tgt_flg()) || "F".equals(reservationList.getTicket_list().get(i9).getTrain_info().get(0).getH_pbp_acep_tgt_flg()) || y1.x.MAX_AD_CONTENT_RATING_G.equals(reservationList.getTicket_list().get(i9).getTrain_info().get(0).getH_pbp_acep_tgt_flg())) {
                z10 = false;
                break;
            }
        }
        z10 = true;
        bundle.putBoolean("IS_DELIVERY_ALL", z10);
        bundle.putString("DVC_INFO_SMNS_FLG", reservationList.getTicket_list().get(0).getTrain_info().get(0).getDvcInfoSmnsFlg());
        bundle.putString("CMTR_VLID_FLG", reservationList.getTicket_list().get(0).getTrain_info().get(0).getCmtrVlidFlg());
        bundle.putString("TRAIN_RUNNING_CLOSE_FLG", reservationList.getTicket_list().get(0).getTrain_info().get(0).getRunClsFlg());
        bundle.putString("TRAIN_RUNNING_STPV_FLG", reservationList.getTicket_list().get(0).getTrain_info().get(0).getStpvFlg());
        bundle.putString("TRAIN_RUNNING_FLG", ticketDetailResponse.getH_trn_running_flg());
        bundle.putString("CURRENT_TIME_BACKGROUND", ticketDetailResponse.getTicketTimeBgColor());
        bundle.putString("IS_DELAY_TRAIN", ticketDetailResponse.getH_dlay_flg());
        bundle.putString("IS_DELAY_ACCEPT", ticketDetailResponse.getH_dlay_tk_flg());
        bundle.putString("TRIP_CHG_FLG", ticketDetailResponse.getTripChgFlg());
        bundle.putString("TICKET_PNR", ticketDetailResponse.getH_pnr_no());
        bundle.putString("TRAIN_CLSF_CD", ticketInfo.getH_trn_clsf_cd());
        bundle.putInt("TICKET_KIND", c0029b.d());
        bundle.putString("TICKET_KIND_CODE", h_tk_knd_cd);
        bundle.putInt("TICKET_TYPE", m(ticketDetailResponse, z8));
        bundle.putInt("TICKET_TITLE_BG", c0029b.f());
        bundle.putString("TICKET_TITLE", c0029b.e());
        bundle.putString("D_TOUR", ticketDetailResponse.getH_dtour());
        bundle.putString("MERGE_CODE", ticketInfo.getH_dvd_anx_dv_cd());
        bundle.putString("MERGE_NUMBER", ticketInfo.getH_ddck_scar_no());
        bundle.putBoolean("IS_ONE_TICKET", ticketInfo.getTk_seat_info().size() > 1);
        bundle.putString("PBP_ACEP_PSBFLG", ticketDetailResponse.getPbpAcepPsbFlg());
        bundle.putString("RET_PSB_FLG", ticketDetailResponse.getRetPsbFlg());
        bundle.putString("CUSTOMER_PHRASE", ticketDetailResponse.getCstmzPhrase());
        return bundle;
    }

    public static Bundle getCommutationData(TicketListDao.ReservationList reservationList, List<TicketDetailDao.TicketDetailResponse> list, int i8, boolean z8, boolean z9) {
        z4.t.e("-------------------------------------------------------------------------");
        z4.t.e("정기권");
        e(reservationList, list);
        int i9 = 0;
        TicketDetailDao.TicketDetailResponse ticketDetailResponse = list.get(0);
        String h_cmtr_utl_trm_cd_nm = z4.N.isNotNull(ticketDetailResponse.getH_cmtr_utl_trm_cd_nm()) ? ticketDetailResponse.getH_cmtr_utl_trm_cd_nm() : "";
        Bundle bundle = new Bundle();
        bundle.putAll(g(reservationList, list, i8, z8, z9));
        bundle.putAll(f(ticketDetailResponse));
        bundle.putString("PERIOD_COMMUTATION_INCLUDE_HOLIDAY", z4.N.isNotNull(h_cmtr_utl_trm_cd_nm) ? h_cmtr_utl_trm_cd_nm : "");
        List<TicketDetailDao.TicketInfo> ticket_info = ticketDetailResponse.getTicket_infos().getTicket_info();
        while (i9 < ticket_info.size()) {
            String h_dpt_dt = ticket_info.get(i9).getH_dpt_dt();
            String h_arv_dt = ticket_info.get(i9).getH_arv_dt();
            String h_dpt_rs_stn_nm = ticket_info.get(i9).getH_dpt_rs_stn_nm();
            String h_arv_rs_stn_nm = ticket_info.get(i9).getH_arv_rs_stn_nm();
            String h_trn_clsf_nm = ticket_info.get(i9).getH_trn_clsf_nm();
            bundle.putString(i9 == 0 ? "DEPARTURE_DATE" : "TRANSFER_DEPARTURE_DATE", C6634h.convertFormat(h_dpt_dt, "yyyyMMdd", "yyyy년 MM월 dd일 (E)"));
            bundle.putString(i9 == 0 ? "ARRIVAL_DATE" : "TRANSFER_ARRIVAL_DATE", C6634h.convertFormat(h_arv_dt, "yyyyMMdd", "yyyy년 MM월 dd일 (E)"));
            bundle.putString(i9 == 0 ? "DEPARTURE_STATION_NAME" : "TRANSFER_DEPARTURE_STATION_NAME", h_dpt_rs_stn_nm);
            bundle.putString(i9 == 0 ? "ARRIVAL_STATION_NAME" : "TRANSFER_ARRIVAL_STATION_NAME", h_arv_rs_stn_nm);
            bundle.putString(i9 == 0 ? "TRAIN_NAME" : "TRANSFER_TRAILING_TRAIN_NAME", h_trn_clsf_nm);
            i9++;
        }
        z4.t.e("-------------------------------------------------------------------------");
        return bundle;
    }

    public static Bundle getGPassData(TicketListDao.ReservationList reservationList, List<TicketDetailDao.TicketDetailResponse> list, int i8, boolean z8, boolean z9) {
        z4.t.e("-------------------------------------------------------------------------");
        z4.t.e("G패스");
        e(reservationList, list);
        TicketDetailDao.TicketDetailResponse ticketDetailResponse = list.get(0);
        TicketDetailDao.TicketInfo ticketInfo = ticketDetailResponse.getTicket_infos().getTicket_info().get(0);
        Bundle bundle = new Bundle();
        bundle.putAll(g(reservationList, list, i8, z8, z9));
        bundle.putAll(f(ticketDetailResponse));
        String h_dpt_dt = ticketInfo.getH_dpt_dt();
        String h_arv_dt = ticketInfo.getH_arv_dt();
        bundle.putString("DEPARTURE_DATE", C6634h.convertFormat(h_dpt_dt, "yyyyMMdd", "yyyy년 MM월 dd일 (E)"));
        if (!h_dpt_dt.equals(h_arv_dt)) {
            bundle.putString("ARRIVAL_DATE", C6634h.convertFormat(h_arv_dt, "yyyyMMdd", "yyyy년 MM월 dd일 (E)"));
        }
        bundle.putString("PASS_STATION_NAME", ticketDetailResponse.getH_wct_nm());
        bundle.putString("PASS_COUPON_NUMBER", ticketDetailResponse.getH_dscp_no());
        List<TicketDetailDao.CompanionInfo> cmpa_info = ticketDetailResponse.getCmpa_info();
        if (C6630d.isNotNull(cmpa_info) && !cmpa_info.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            for (TicketDetailDao.CompanionInfo companionInfo : cmpa_info) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("COMPANION_NAME", companionInfo.getH_cmpa_nm());
                bundle2.putString("COMPANION_BIRTH", companionInfo.getH_cmpa_btdt());
                bundle2.putString("COMPANION_GENDER", companionInfo.getH_cmpa_sex_dv_cd());
                arrayList.add(bundle2);
            }
            bundle.putParcelableArrayList("COMPANION_LIST_DATA", arrayList);
        }
        z4.t.e("-------------------------------------------------------------------------");
        return bundle;
    }

    public static Bundle getNCardData(TicketListDao.ReservationList reservationList, List<TicketDetailDao.TicketDetailResponse> list, int i8, boolean z8, boolean z9) {
        z4.t.e("-------------------------------------------------------------------------");
        z4.t.e("N 카드");
        e(reservationList, list);
        TicketDetailDao.TicketDetailResponse ticketDetailResponse = list.get(0);
        Bundle bundle = new Bundle();
        bundle.putAll(g(reservationList, list, i8, z8, z9));
        bundle.putAll(f(ticketDetailResponse));
        bundle.putBoolean("N_CARD_PERIOD_EXTENSION_FLG", "Y".equals(ticketDetailResponse.getDcnt_crd_info().getH_dcnt_crd_trm_extn_psb_flg()));
        bundle.putBoolean("N_CARD_SECOND_USER_FLG", "Y".equals(reservationList.getTicket_list().get(0).getTrain_info().get(0).getApdUsrFlg()));
        bundle.putString("N_CARD_DISCOUNT_CRD_CODE", ticketDetailResponse.getDcnt_crd_info().getH_dcnt_crd_no());
        List<TicketDetailDao.TicketInfo> ticket_info = ticketDetailResponse.getTicket_infos().getTicket_info();
        int i9 = 0;
        while (true) {
            if (i9 >= ticket_info.size()) {
                break;
            }
            String h_dpt_dt = ticket_info.get(i9).getH_dpt_dt();
            String h_arv_dt = ticket_info.get(i9).getH_arv_dt();
            String h_dpt_rs_stn_nm = ticket_info.get(i9).getH_dpt_rs_stn_nm();
            String h_arv_rs_stn_nm = ticket_info.get(i9).getH_arv_rs_stn_nm();
            String h_trn_clsf_nm = ticket_info.get(i9).getH_trn_clsf_nm();
            bundle.putString(i9 == 0 ? "DEPARTURE_DATE" : "TRANSFER_DEPARTURE_DATE", C6634h.convertFormat(h_dpt_dt, "yyyyMMdd", "yyyy년 MM월 dd일 (E)"));
            bundle.putString(i9 == 0 ? "ARRIVAL_DATE" : "TRANSFER_ARRIVAL_DATE", C6634h.convertFormat(h_arv_dt, "yyyyMMdd", "yyyy년 MM월 dd일 (E)"));
            bundle.putString(i9 != 0 ? "TRANSFER_DEPARTURE_STATION_NAME" : "DEPARTURE_STATION_NAME", h_dpt_rs_stn_nm);
            bundle.putString(i9 != 0 ? "TRANSFER_ARRIVAL_STATION_NAME" : "ARRIVAL_STATION_NAME", h_arv_rs_stn_nm);
            bundle.putString(i9 == 0 ? "TRAIN_NAME" : "TRANSFER_TRAILING_TRAIN_NAME", h_trn_clsf_nm);
            i9++;
        }
        List<TicketDetailDao.AppSegInfo> appSeg_info = ticketDetailResponse.getDcnt_crd_info().getAppSeg_info();
        if (C6630d.isNotNull(appSeg_info)) {
            bundle.putInt("N_CARD_SECTION_COUNT", appSeg_info.size());
            for (int i10 = 0; i10 < appSeg_info.size(); i10++) {
                bundle.putString("DEPARTURE_STATION_NAME" + i10, appSeg_info.get(i10).getDptRsStnNm());
                bundle.putString("ARRIVAL_STATION_NAME" + i10, appSeg_info.get(i10).getArvRsStnNm());
                bundle.putString("D_TOUR" + i10, appSeg_info.get(i10).getStlbDturDvNm());
            }
        }
        z4.t.e("-------------------------------------------------------------------------");
        return bundle;
    }

    public static Bundle getNormalTicketData(TicketListDao.ReservationList reservationList, List<TicketDetailDao.TicketDetailResponse> list, int i8, boolean z8, boolean z9) {
        z4.t.e("-------------------------------------------------------------------------");
        z4.t.e("일반승차권");
        e(reservationList, list);
        TicketDetailDao.TicketDetailResponse ticketDetailResponse = list.get(0);
        Bundle bundle = new Bundle();
        bundle.putAll(g(reservationList, list, i8, z8, z9));
        bundle.putAll(l(ticketDetailResponse));
        bundle.putAll(h(list));
        bundle.putAll(j(ticketDetailResponse));
        bundle.putAll(i(ticketDetailResponse));
        bundle.putAll(k(list));
        z4.t.e("-------------------------------------------------------------------------");
        return bundle;
    }

    public static Bundle getPassData(TicketListDao.ReservationList reservationList, List<TicketDetailDao.TicketDetailResponse> list, int i8, boolean z8, boolean z9) {
        z4.t.e("-------------------------------------------------------------------------");
        z4.t.e("패스");
        e(reservationList, list);
        TicketDetailDao.TicketDetailResponse ticketDetailResponse = list.get(0);
        TicketDetailDao.TicketInfo ticketInfo = ticketDetailResponse.getTicket_infos().getTicket_info().get(0);
        Bundle bundle = new Bundle();
        bundle.putAll(g(reservationList, list, i8, z8, z9));
        bundle.putAll(f(ticketDetailResponse));
        String h_dpt_dt = ticketInfo.getH_dpt_dt();
        String h_arv_dt = ticketInfo.getH_arv_dt();
        bundle.putString("DEPARTURE_DATE", C6634h.convertFormat(h_dpt_dt, "yyyyMMdd", "yyyy년 MM월 dd일 (E)"));
        if (!h_dpt_dt.equals(h_arv_dt)) {
            bundle.putString("ARRIVAL_DATE", C6634h.convertFormat(h_arv_dt, "yyyyMMdd", "yyyy년 MM월 dd일 (E)"));
        }
        bundle.putString("PASS_STATION_NAME", ticketDetailResponse.getH_wct_nm());
        bundle.putString("PASS_COUPON_NUMBER", ticketDetailResponse.getH_dscp_no());
        List<TicketDetailDao.CompanionInfo> cmpa_info = ticketDetailResponse.getCmpa_info();
        if (C6630d.isNotNull(cmpa_info) && !cmpa_info.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            for (TicketDetailDao.CompanionInfo companionInfo : cmpa_info) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("COMPANION_NAME", companionInfo.getH_cmpa_nm());
                bundle2.putString("COMPANION_BIRTH", companionInfo.getH_cmpa_btdt());
                bundle2.putString("COMPANION_GENDER", companionInfo.getH_cmpa_sex_dv_cd());
                arrayList.add(bundle2);
            }
            bundle.putParcelableArrayList("COMPANION_LIST_DATA", arrayList);
        }
        z4.t.e("-------------------------------------------------------------------------");
        return bundle;
    }

    public static int getSeatType(TicketDetailDao.TicketDetailResponse ticketDetailResponse) {
        if (r(ticketDetailResponse)) {
            return 21;
        }
        if (isDelivered(ticketDetailResponse)) {
            return 20;
        }
        return q(ticketDetailResponse) ? 22 : 0;
    }

    public static String getShareText(Context context, Bundle bundle) {
        StringBuilder sb = new StringBuilder();
        sb.append(C6634h.convertFormat(bundle.getString("DEPARTURE_DATE"), "yyyyMMdd", "yyyy년 MM월 dd일 (E)"));
        sb.append(X.LF);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("JRNY_LIST_DATA");
        for (int i8 = 0; i8 < parcelableArrayList.size(); i8++) {
            sb.append(((Bundle) parcelableArrayList.get(i8)).getString("TRAIN_NAME"));
            if (i8 < parcelableArrayList.size() - 1) {
                sb.append(" -> ");
            }
        }
        sb.append(X.LF);
        sb.append(bundle.getString("DEPARTURE_STATION_NAME"));
        sb.append(C6632f.b(context, AbstractC5959j.common_bracket, bundle.getString("DEPARTURE_TIME")));
        sb.append(context.getString(AbstractC5959j.common_departure));
        sb.append(" -> ");
        if (!C6630d.isNull(bundle.getString("TRANSFER_ARRIVAL_STATION_NAME")) && !C6630d.isNull(bundle.getString("TRANSFER_ARRIVAL_TIME"))) {
            sb.append(bundle.getString("TRANSFER_ARRIVAL_STATION_NAME"));
            sb.append(C6632f.b(context, AbstractC5959j.common_bracket, bundle.getString("TRANSFER_ARRIVAL_TIME")));
            sb.append(context.getString(AbstractC5959j.common_arrival));
            sb.append(X.LF);
            if (C6630d.isNull(bundle.getString("TRANSFER_DEPARTURE_STATION_NAME")) || C6630d.isNull(bundle.getString("TRANSFER_DEPARTURE_TIME"))) {
                sb.append(bundle.getString("TRANSFER_ARRIVAL_STATION_NAME"));
                sb.append(C6632f.b(context, AbstractC5959j.common_bracket, bundle.getString("TRANSFER_DEPARTURE_TIME")));
                sb.append(context.getString(AbstractC5959j.common_departure));
                sb.append(" -> ");
            } else {
                sb.append(bundle.getString("TRANSFER_DEPARTURE_STATION_NAME"));
                sb.append(C6632f.b(context, AbstractC5959j.common_bracket, bundle.getString("TRANSFER_DEPARTURE_TIME")));
                sb.append(context.getString(AbstractC5959j.common_departure));
                sb.append(" -> ");
            }
        }
        sb.append(bundle.getString("ARRIVAL_STATION_NAME"));
        sb.append(C6632f.b(context, AbstractC5959j.common_bracket, bundle.getString("ARRIVAL_TIME")));
        sb.append(context.getString(AbstractC5959j.common_arrival));
        if (z4.N.isNotNull(bundle.getString("D_TOUR", ""))) {
            sb.append(C6632f.b(context, AbstractC5959j.common_bracket, bundle.getString("D_TOUR", "")));
        }
        return sb.toString();
    }

    private static Bundle h(List list) {
        List list2 = list;
        int i8 = 0;
        List<TicketDetailDao.TicketInfo> ticket_info = ((TicketDetailDao.TicketDetailResponse) list2.get(0)).getTicket_infos().getTicket_info();
        Bundle bundle = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        int i9 = 0;
        String str = "N";
        while (i9 < ticket_info.size()) {
            Bundle bundle2 = new Bundle();
            TicketDetailDao.TicketInfo ticketInfo = ((TicketDetailDao.TicketDetailResponse) list2.get(i8)).getTicket_infos().getTicket_info().get(i9);
            bundle2.putString("TRAIN_NAME", ticketInfo.getH_trn_clsf_nm() + X.SPACE + ticketInfo.getH_trn_no());
            bundle2.putString("TRAIN_CLSF_CODE", ticketInfo.getH_trn_clsf_cd());
            bundle2.putString("TRAIN_IS_ITX_SIXED", (ticketInfo.getH_itx_sixed_yn() == null || ticketInfo.getH_itx_sixed_yn().isEmpty()) ? "N" : ticketInfo.getH_itx_sixed_yn());
            bundle2.putString("TRAIN_NUMBER", ticketInfo.getH_trn_no());
            bundle2.putString("TRAIN_FACILITY", ticketInfo.getCabFaclLead());
            bundle2.putString("TRAIN_FACILITY_VR", ticketInfo.getVrBnrUrl());
            bundle2.putString("TRAIN_SELF_SEAT", ((TicketDetailDao.TicketDetailResponse) list2.get(i8)).getTripChgFlg());
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
            int i10 = i8;
            while (i10 < list.size()) {
                TicketDetailDao.TicketDetailResponse ticketDetailResponse = (TicketDetailDao.TicketDetailResponse) list2.get(i10);
                List<TicketDetailDao.TicketSeatInfo> tk_seat_info = ticketDetailResponse.getTicket_infos().getTicket_info().get(i9).getTk_seat_info();
                int i11 = i8;
                while (i11 < tk_seat_info.size()) {
                    Bundle bundle3 = new Bundle();
                    TicketDetailDao.TicketSeatInfo ticketSeatInfo = tk_seat_info.get(i11);
                    bundle3.putInt("SEAT_TYPE", getSeatType(ticketDetailResponse));
                    bundle3.putBoolean("IS_DELIVERED", isDelivered(ticketDetailResponse));
                    bundle3.putString(j4.r.QR_CODE, ticketDetailResponse.getH_qrcode());
                    StringBuilder sb = new StringBuilder();
                    sb.append(ticketDetailResponse.getH_orgtk_wct_no());
                    sb.append(g5.e.STATE_NAME_NONE);
                    List<TicketDetailDao.TicketInfo> list3 = ticket_info;
                    sb.append(ticketDetailResponse.getH_orgtk_ret_sale_dt());
                    sb.append(g5.e.STATE_NAME_NONE);
                    sb.append(ticketDetailResponse.getH_orgtk_sale_sqno());
                    sb.append(g5.e.STATE_NAME_NONE);
                    sb.append(ticketDetailResponse.getH_orgtk_ret_pwd());
                    bundle3.putString("RETURN_NO", sb.toString());
                    if (!z4.O.isTourTrainGroup(ticketInfo.getH_trn_gp_cd())) {
                        bundle3.putString("SEAT_CLASS", ticketInfo.getH_psrm_cl_nm());
                    }
                    String h_srcar_no = ticketSeatInfo.getH_srcar_no();
                    if (z4.N.isNotNull(h_srcar_no) && !"03".equals(ticketInfo.getH_trn_clsf_cd())) {
                        bundle3.putString("SRCAR_NO", h_srcar_no);
                    }
                    String h_seat_no = ticketSeatInfo.getH_seat_no();
                    if (z4.N.isNotNull(h_seat_no)) {
                        bundle3.putString("SEAT_NUMBER", h_seat_no);
                    }
                    String h_sgr_nm = ticketSeatInfo.getH_sgr_nm();
                    if (z4.N.isNotNull(h_sgr_nm)) {
                        bundle3.putString("SPECIAL_SEAT_NAME", h_sgr_nm);
                    }
                    String h_seat_att_cd_2 = ticketSeatInfo.getH_seat_att_cd_2();
                    if (z4.N.isNotNull(h_seat_att_cd_2)) {
                        bundle3.putString("SEAT_DIRECTION", z4.J.getSeatDirectionName(h_seat_att_cd_2));
                    }
                    String h_psg_tp_nm = ticketSeatInfo.getH_psg_tp_nm();
                    if (z4.N.isNotNull(h_psg_tp_nm)) {
                        bundle3.putString("AGE_TYPE", h_psg_tp_nm);
                    }
                    String h_seat_att_cd_4 = ticketSeatInfo.getH_seat_att_cd_4();
                    if (z4.N.isNotNull(h_seat_att_cd_4)) {
                        bundle3.putString("SEAT_OPTION", h_seat_att_cd_4);
                        if (r4.p.WHEELCHAIR.getCode().equals(ticketSeatInfo.getH_seat_att_cd_4()) || r4.p.AUTO_WHEELCHAIR.getCode().equals(ticketSeatInfo.getH_seat_att_cd_4())) {
                            str = "Y";
                        }
                    }
                    String h_dcnt_knd_cd = ticketSeatInfo.getH_dcnt_knd_cd();
                    if (z4.N.isNotNull(h_dcnt_knd_cd)) {
                        bundle3.putString("DISCOUNT_KIND_CODE", h_dcnt_knd_cd);
                    }
                    String h_dcnt_knd_nm = ticketSeatInfo.getH_dcnt_knd_nm();
                    if (z4.N.isNotNull(h_dcnt_knd_nm)) {
                        bundle3.putString("DISCOUNT_KIND_NAME", h_dcnt_knd_nm);
                    }
                    if (C6630d.isNotNull(ticketDetailResponse.getPsgNmList()) && ticketDetailResponse.getPsgNmList().size() > i11) {
                        bundle3.putString("PASSENGER_NAME", ticketDetailResponse.getPsgNmList().get(i11).getPsgNm());
                    }
                    String h_chckn_stt_cd = ticketSeatInfo.getH_chckn_stt_cd();
                    if (z4.N.isNotNull(h_chckn_stt_cd)) {
                        bundle3.putString("SELF_CHECKIN_STATUS", h_chckn_stt_cd);
                    }
                    bundle3.putString("KEY_PLF_NO", ticketInfo.getH_plf_no());
                    bundle3.putString("TRAIN_RUNNING_FLG", ticketDetailResponse.getH_trn_running_flg());
                    bundle3.putString("KEY_MENU_ACTV_FLG", ticketInfo.getH_menu_actv_flg());
                    arrayList2.add(bundle3);
                    i11++;
                    ticket_info = list3;
                }
                bundle2.putParcelableArrayList("SEAT_LIST_DATA", arrayList2);
                i10++;
                list2 = list;
                i8 = 0;
            }
            arrayList.add(bundle2);
            i9++;
            list2 = list;
            i8 = 0;
        }
        bundle.putParcelableArrayList("JRNY_LIST_DATA", arrayList);
        bundle.putString("IS_WHCH_TICKET", str);
        return bundle;
    }

    private static Bundle i(TicketDetailDao.TicketDetailResponse ticketDetailResponse) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("LIMOUSINE_RSV_PSB_FLG", "Y".equals(ticketDetailResponse.getLimousineRsvPsbFlg()));
        TicketDetailDao.Limousine limousine = ticketDetailResponse.getLimousine();
        if (C6630d.isNotNull(limousine)) {
            bundle.putString("LIMOUSINE_RUN_TIME", limousine.getRunTm());
            bundle.putString("LIMOUSINE_ABRD_SPOT", limousine.getAbrdSpot());
            bundle.putString("LIMOUSINE_GUIDE", limousine.getGuide());
        }
        return bundle;
    }

    public static boolean isDelivered(TicketDetailDao.TicketDetailResponse ticketDetailResponse) {
        return "Y".equals(ticketDetailResponse.getH_pbp_acep_tgt_flg());
    }

    private static Bundle j(TicketDetailDao.TicketDetailResponse ticketDetailResponse) {
        Bundle bundle = new Bundle();
        bundle.putString("IS_PRODUCT_BUY", ticketDetailResponse.getAddSrvFlg());
        bundle.putString("RETURN_NO", ticketDetailResponse.getH_orgtk_wct_no() + g5.e.STATE_NAME_NONE + ticketDetailResponse.getH_orgtk_ret_sale_dt() + g5.e.STATE_NAME_NONE + ticketDetailResponse.getH_orgtk_sale_sqno() + g5.e.STATE_NAME_NONE + ticketDetailResponse.getH_orgtk_ret_pwd());
        bundle.putString("PRODUCT_BUY_HISTORY", ticketDetailResponse.getAddSrvCancel());
        if (z4.N.isNotNull(ticketDetailResponse.getAddSrvCancel()) && ticketDetailResponse.getAddSrvCancel().equals("Y")) {
            bundle.putString("PRODUCT_RECEIPT_PARAM", "sale_wct_no=" + ticketDetailResponse.getH_orgtk_wct_no() + "&sale_dd=" + ticketDetailResponse.getH_orgtk_ret_sale_dt() + "&sale_sqno=" + ticketDetailResponse.getH_orgtk_sale_sqno() + "&tk_ret_pwd=" + ticketDetailResponse.getH_orgtk_ret_pwd());
        } else {
            TicketDetailDao.AddSrvList addSrvList = ticketDetailResponse.getAddSrvList();
            if (!addSrvList.getPnrList().isEmpty()) {
                if (!addSrvList.getPnrList().get(0).getAddSrvList().isEmpty()) {
                    List<ExtraProductInfo.AddSrvInfo> addSrvList2 = addSrvList.getPnrList().get(0).getAddSrvList();
                    ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                    int i8 = 0;
                    for (int i9 = 0; i9 < addSrvList2.size(); i9++) {
                        Bundle bundle2 = new Bundle();
                        ExtraProductInfo.AddSrvInfo addSrvInfo = addSrvList2.get(i9);
                        bundle2.putString("PRODUCT_NAME", addSrvInfo.getAddSrvNm());
                        bundle2.putString("PRODUCT_STORE_NAME", addSrvInfo.getAddSrvMrkEntNm());
                        bundle2.putString("PRODUCT_RECEIPT_PARAM", "sale_wct_no=" + ticketDetailResponse.getH_orgtk_wct_no() + "&sale_dd=" + ticketDetailResponse.getH_orgtk_ret_sale_dt() + "&sale_sqno=" + ticketDetailResponse.getH_orgtk_sale_sqno() + "&tk_ret_pwd=" + ticketDetailResponse.getH_orgtk_ret_pwd());
                        int integer = z4.N.getInteger(addSrvInfo.getReqQnty());
                        i8 += integer;
                        bundle2.putInt("PRODUCT_COUNT", integer);
                        bundle2.putInt("PRODUCT_TOTAL_COUNT", i8);
                        arrayList.add(bundle2);
                    }
                    bundle.putParcelableArrayList("PRODUCT_LIST_DATA", arrayList);
                }
            }
        }
        return bundle;
    }

    private static Bundle k(List list) {
        Bundle bundle = new Bundle();
        bundle.putString("WHCH_SRV_REQ_PSB_FLG", "N");
        bundle.putString("WHCH_SRV_RCP_FLG", "N");
        bundle.putString("GUARDIAN_RELIEF_SMS", list.size() == 1 ? "Y" : "N");
        Iterator it = list.iterator();
        String mlgSaveFlg = "";
        while (it.hasNext()) {
            TicketDetailDao.TicketDetailResponse ticketDetailResponse = (TicketDetailDao.TicketDetailResponse) it.next();
            String whchSrvReqPsbFlg = ticketDetailResponse.getWhchSrvReqPsbFlg();
            String whchSrvRcpFlg = ticketDetailResponse.getWhchSrvRcpFlg();
            String gurdSmsFlg = ticketDetailResponse.getGurdSmsFlg();
            if ("N".equals(bundle.getString("WHCH_SRV_REQ_PSB_FLG", "")) && ("Y".equals(whchSrvReqPsbFlg) || "X".equals(whchSrvReqPsbFlg))) {
                bundle.putString("WHCH_SRV_REQ_PSB_FLG", whchSrvReqPsbFlg);
                bundle.putSerializable("WHCH_SRV_REQ_DATA", n(ticketDetailResponse, false));
            }
            if ("N".equals(bundle.getString("WHCH_SRV_RCP_FLG", "")) && "Y".equals(whchSrvRcpFlg)) {
                bundle.putString("WHCH_SRV_RCP_FLG", whchSrvRcpFlg);
                bundle.putSerializable("WHCH_SRV_REQ_DATA", n(ticketDetailResponse, true));
            }
            if ("Y".equals(bundle.getString("GUARDIAN_RELIEF_SMS", "")) && ("N".equals(gurdSmsFlg) || "H".equals(gurdSmsFlg))) {
                bundle.putString("GUARDIAN_RELIEF_SMS", gurdSmsFlg);
            }
            if ("Y".equals(ticketDetailResponse.getMlgSaveFlg()) || "N".equals(ticketDetailResponse.getMlgSaveFlg())) {
                mlgSaveFlg = ticketDetailResponse.getMlgSaveFlg();
            }
        }
        if (list.size() > 1) {
            bundle.putString("COMPANION_MILEAGE_FLG", mlgSaveFlg);
        }
        return bundle;
    }

    private static Bundle l(TicketDetailDao.TicketDetailResponse ticketDetailResponse) {
        List<TicketDetailDao.TicketInfo> ticket_info = ticketDetailResponse.getTicket_infos().getTicket_info();
        String h_jrny_tp_cd = ticket_info.get(0).getH_jrny_tp_cd();
        List<TicketDetailDao.DelayInfo> dtlList = ticketDetailResponse.getDtlList();
        Bundle bundle = new Bundle();
        if (r4.e.DIRECT.getCode().equals(h_jrny_tp_cd)) {
            TicketDetailDao.TicketInfo ticketInfo = ticket_info.get(0);
            bundle.putString("DEPARTURE_STATION_NAME", ticketInfo.getH_dpt_rs_stn_nm());
            bundle.putString("DEPARTURE_TIME", C6634h.convertFormat(ticketInfo.getH_dpt_tm(), "HHmmss", "HH:mm"));
            bundle.putString("DEPARTURE_STATION_CODE", ticketInfo.getH_dpt_rs_stn_cd());
            bundle.putString("ARRIVAL_STATION_CODE", ticketInfo.getH_arv_rs_stn_cd());
            bundle.putString("ARRIVAL_STATION_NAME", ticketInfo.getH_arv_rs_stn_nm());
            bundle.putString("ARRIVAL_TIME", C6634h.convertFormat(ticketInfo.getH_arv_tm(), "HHmmss", "HH:mm"));
            if (C6630d.isNotNull(dtlList) && dtlList.size() > 0) {
                bundle.putString("DEPARTURE_EXPECT_DELAY_TIME", dtlList.get(0).getExpDptDlayTnum());
                bundle.putString("DEPARTURE_ACTUAL_DELAY_TIME", dtlList.get(0).getActDptDlayTnum());
                bundle.putString("ARRIVAL_EXPECT_DELAY_TIME", dtlList.get(0).getExpArvDlayTnum());
                bundle.putString("ARRIVAL_ACTUAL_DELAY_TIME", dtlList.get(0).getActArvDlayTnum());
                bundle.putString("ARRIVAL_MYTRAIN_INTERVAL_STATION", dtlList.get(0).getOrgTmnRsStnNm1());
                bundle.putString("ARRIVAL_SUBTRAIN_INTERVAL_STATION", dtlList.get(0).getOrgTmnRsStnNm2());
            }
        } else {
            bundle.putString("DEPARTURE_STATION_NAME", ticket_info.get(0).getH_dpt_rs_stn_nm());
            bundle.putString("DEPARTURE_TIME", C6634h.convertFormat(ticket_info.get(0).getH_dpt_tm(), "HHmmss", "HH:mm"));
            bundle.putString("DEPARTURE_STATION_CODE", ticket_info.get(0).getH_dpt_rs_stn_cd());
            bundle.putString("ARRIVAL_STATION_CODE", ticket_info.get(0).getH_arv_rs_stn_cd());
            bundle.putString("TRANSFER_ARRIVAL_STATION_NAME", ticket_info.get(0).getH_arv_rs_stn_nm());
            if (!ticket_info.get(0).getH_arv_rs_stn_nm().equals(ticket_info.get(1).getH_dpt_rs_stn_nm())) {
                bundle.putString("TRANSFER_DEPARTURE_STATION_NAME", ticket_info.get(1).getH_dpt_rs_stn_nm());
            }
            bundle.putString("TRANSFER_ARRIVAL_TIME", C6634h.convertFormat(ticket_info.get(0).getH_arv_tm(), "HHmmss", "HH:mm"));
            bundle.putString("TRANSFER_DEPARTURE_TIME", C6634h.convertFormat(ticket_info.get(1).getH_dpt_tm(), "HHmmss", "HH:mm"));
            bundle.putString("ARRIVAL_STATION_NAME", ticket_info.get(1).getH_arv_rs_stn_nm());
            bundle.putString("ARRIVAL_TIME", C6634h.convertFormat(ticket_info.get(1).getH_arv_tm(), "HHmmss", "HH:mm"));
        }
        String h_dpt_dt = ticket_info.get(0).getH_dpt_dt();
        String h_arv_dt = ticket_info.get(0).getH_arv_dt();
        bundle.putString("DEPARTURE_DATE", h_dpt_dt);
        bundle.putString("ARRIVAL_DATE", h_arv_dt);
        return bundle;
    }

    private static int m(TicketDetailDao.TicketDetailResponse ticketDetailResponse, boolean z8) {
        String h_tk_knd_cd = ticketDetailResponse.getH_tk_knd_cd();
        String h_trn_clsf_cd = ticketDetailResponse.getTicket_infos().getTicket_info().get(0).getH_trn_clsf_cd();
        if (o(h_trn_clsf_cd) || !z8 || (z8 && !C0500a.isGeneralTicket(h_tk_knd_cd, h_trn_clsf_cd, true))) {
            return getSeatType(ticketDetailResponse);
        }
        return -1;
    }

    private static WheelchairData n(TicketDetailDao.TicketDetailResponse ticketDetailResponse, boolean z8) {
        TicketDetailDao.TicketInfo ticketInfo = ticketDetailResponse.getTicket_infos().getTicket_info().get(0);
        WheelchairData wheelchairData = new WheelchairData();
        wheelchairData.setWctNo(ticketDetailResponse.getH_orgtk_wct_no());
        wheelchairData.setSaleDt(ticketDetailResponse.getH_sale_dt());
        wheelchairData.setSqNo(ticketDetailResponse.getH_orgtk_sale_sqno());
        wheelchairData.setDptDt(C6634h.convertFormat(ticketInfo.getH_dpt_dt(), "yyyyMMdd", "yyyy.MM.dd. (E)"));
        wheelchairData.setTrnNm(ticketInfo.getH_trn_clsf_nm() + X.SPACE + ticketInfo.getH_trn_no());
        wheelchairData.setShowCancelButton(z8);
        return wheelchairData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean o(String str) {
        return "98".equals(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean p(String str, String str2) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        try {
            return simpleDateFormat.parse(str).after(simpleDateFormat.parse(str2));
        } catch (Exception unused) {
            return false;
        }
    }

    private static boolean q(TicketDetailDao.TicketDetailResponse ticketDetailResponse) {
        return "F".equals(ticketDetailResponse.getH_pbp_acep_tgt_flg());
    }

    private static boolean r(TicketDetailDao.TicketDetailResponse ticketDetailResponse) {
        return "Y".equals(ticketDetailResponse.getH_ret_flg());
    }
}
