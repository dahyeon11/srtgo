package z4;

import Q7.X;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.korail.talk.network.dao.pass.CommRsvInquiryDao;
import com.korail.talk.network.dao.refund.TicketDetailDao;
import com.korail.talk.network.dao.research.NCardInquiryDao;
import com.korail.talk.network.dao.reservation.TicketRsvHistoryDao;
import com.korail.talk.network.response.certification.ReservationResponse;
import java.text.ParseException;
import java.util.List;
import n4.AbstractC5953d;
import n4.AbstractC5959j;

/* renamed from: z4.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6642p extends C6632f {
    private static String c(ReservationResponse.JrnyInfo jrnyInfo) {
        String str;
        boolean zIsLimousine = O.isLimousine(jrnyInfo);
        StringBuilder sb = new StringBuilder();
        sb.append(jrnyInfo.getH_dpt_rs_stn_nm());
        String str2 = "";
        if (zIsLimousine) {
            str = "";
        } else {
            str = "(" + C6634h.convertFormat(jrnyInfo.getH_dpt_tm(), "HHmmss", "HH:mm") + ")";
        }
        sb.append(str);
        sb.append(" → ");
        sb.append(jrnyInfo.getH_arv_rs_stn_nm());
        if (!zIsLimousine) {
            str2 = "(" + C6634h.convertFormat(jrnyInfo.getH_arv_tm(), "HHmmss", "HH:mm") + ")";
        }
        sb.append(str2);
        return sb.toString();
    }

    private static String d(ReservationResponse.JrnyInfo jrnyInfo) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(jrnyInfo.getH_trn_clsf_nm());
        if (O.isLimousine(jrnyInfo.getH_trn_clsf_cd())) {
            str = "";
        } else {
            str = X.SPACE + jrnyInfo.getH_trn_no();
        }
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }

    public static String getDate(ReservationResponse reservationResponse) {
        return C6634h.convertFormat(reservationResponse.getJrny_infos().getJrny_info().get(0).getH_dpt_dt(), "yyyyMMdd", "yyyy년 MM월 dd일 (E)");
    }

    public static String getLimit(ReservationResponse reservationResponse) throws ParseException {
        String strConvertFormat;
        if (N.isNotNull(reservationResponse.getH_ise_psb_dt()) && N.isNotNull(reservationResponse.getH_ise_psb_tm())) {
            strConvertFormat = C6634h.convertFormat(reservationResponse.getH_ise_psb_dt() + reservationResponse.getH_ise_psb_tm(), "yyyyMMddHHmmss", "yyyy. MM. dd(E) HH:mm");
        } else {
            strConvertFormat = null;
        }
        if (!N.isNotNull(reservationResponse.getH_ntisu_lmt_dt()) || !N.isNotNull(reservationResponse.getH_ntisu_lmt_tm())) {
            return strConvertFormat;
        }
        if (strConvertFormat == null) {
            return C6634h.convertFormat(reservationResponse.getH_ntisu_lmt_dt() + reservationResponse.getH_ntisu_lmt_tm(), "yyyyMMddHHmmss", "yyyy. MM. dd(E) HH:mm");
        }
        return strConvertFormat + "~" + C6634h.convertFormat(reservationResponse.getH_ntisu_lmt_dt() + reservationResponse.getH_ntisu_lmt_tm(), "yyyyMMddHHmmss", "yyyy. MM. dd(E) HH:mm");
    }

    public static String getRoute(List<TicketDetailDao.TicketInfo> list, String str) {
        StringBuilder sb = new StringBuilder();
        for (int i8 = 0; i8 < list.size(); i8++) {
            TicketDetailDao.TicketInfo ticketInfo = list.get(i8);
            sb.append("[");
            sb.append(ticketInfo.getH_trn_clsf_nm());
            sb.append(X.SPACE);
            sb.append(ticketInfo.getH_trn_no());
            sb.append("] ");
            sb.append(ticketInfo.getH_dpt_rs_stn_nm());
            sb.append(X.SPACE);
            sb.append(C6634h.convertFormat(ticketInfo.getH_dpt_tm(), "HHmmss", "HH:mm"));
            sb.append(" → ");
            sb.append(ticketInfo.getH_arv_rs_stn_nm());
            sb.append(X.SPACE);
            sb.append(C6634h.convertFormat(ticketInfo.getH_arv_tm(), "HHmmss", "HH:mm"));
            if (i8 == 0 && list.size() > 1) {
                sb.append(X.LF);
            } else if (!N.isNull(str)) {
                sb.append(" (");
                sb.append(str);
                sb.append(")");
            }
        }
        return sb.toString();
    }

    public static SpannableStringBuilder getSeat(Context context, ReservationResponse.JrnyInfo jrnyInfo) {
        List<ReservationResponse.SeatInfo> seat_info = jrnyInfo.getSeat_infos().getSeat_info();
        String h_trn_gp_cd = jrnyInfo.getH_trn_gp_cd();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i8 = 0;
        while (true) {
            if (i8 >= seat_info.size()) {
                break;
            }
            ReservationResponse.SeatInfo seatInfo = seat_info.get(i8);
            if (!O.isTourTrainGroup(h_trn_gp_cd)) {
                spannableStringBuilder.append((CharSequence) seatInfo.getH_psrm_cl_nm());
                spannableStringBuilder.append((CharSequence) X.SPACE);
            }
            spannableStringBuilder.append((CharSequence) C6632f.b(context, AbstractC5959j.common_cart_no, Integer.valueOf(N.getInteger(seatInfo.getH_srcar_no()))));
            spannableStringBuilder.append((CharSequence) X.SPACE);
            if (J.isSpecialRoom(seatInfo.getH_rq_seat_att_cd())) {
                spannableStringBuilder.append((CharSequence) seatInfo.getH_sgr_nm());
                break;
            }
            spannableStringBuilder.append((CharSequence) seatInfo.getH_seat_no());
            r4.l lVar = r4.l.REVERSE;
            if (lVar.getCode().equals(seatInfo.getH_dir_seat_att_cd())) {
                int length = spannableStringBuilder.toString().length() + 1;
                int length2 = lVar.getName().length() + length;
                spannableStringBuilder.append((CharSequence) "(").append((CharSequence) J.getSeatDirectionName(seatInfo.getH_dir_seat_att_cd())).append((CharSequence) ")");
                spannableStringBuilder.setSpan(new ForegroundColorSpan(I.getColor(context, AbstractC5953d.tomato)), length, length2, 33);
            }
            spannableStringBuilder.append((CharSequence) (i8 < seat_info.size() + (-1) ? ", " : ""));
            i8++;
        }
        return spannableStringBuilder;
    }

    public static String getTicketCount(Context context, r4.k kVar, ReservationResponse reservationResponse) {
        ReservationResponse.JrnyInfo jrnyInfo = reservationResponse.getJrny_infos().getJrny_info().get(0);
        t.e("getH_tot_seat_cnt : " + jrnyInfo.getH_tot_seat_cnt());
        t.e("getH_tot_stnd_cnt : " + jrnyInfo.getH_tot_stnd_cnt());
        t.e("getH_fres_cnt : " + jrnyInfo.getH_fres_cnt());
        t.e("getH_seat_cnt : " + jrnyInfo.getH_seat_cnt());
        return C6632f.b(context, AbstractC5959j.common_s_ticket_count, Integer.valueOf(r4.k.TICKET_CHANGE == kVar ? jrnyInfo.getH_seat_cnt() : jrnyInfo.getH_tot_seat_cnt() + jrnyInfo.getH_fres_cnt()));
    }

    public static String getTrainData(TicketDetailDao.TicketDetailResponse ticketDetailResponse) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        List<TicketDetailDao.TicketInfo> ticket_info = ticketDetailResponse.getTicket_infos().getTicket_info();
        for (int i8 = 0; i8 < ticket_info.size(); i8++) {
            TicketDetailDao.TicketInfo ticketInfo = ticket_info.get(i8);
            if (i8 == 0) {
                sb.append(C6634h.convertFormat(ticketInfo.getH_dpt_dt(), "yyyyMMdd", "yyyy년 MM월 dd일 (E)"));
            }
            sb2.append(ticketInfo.getH_trn_clsf_nm());
            sb2.append(X.SPACE);
            sb2.append(ticketInfo.getH_trn_no());
            sb3.append(ticketInfo.getH_dpt_rs_stn_nm());
            sb3.append(X.SPACE);
            sb3.append(C6634h.convertFormat(ticketInfo.getH_dpt_tm(), "HHmmss", "HH:mm"));
            sb3.append(" > ");
            sb3.append(ticketInfo.getH_arv_rs_stn_nm());
            sb3.append(X.SPACE);
            sb3.append(C6634h.convertFormat(ticketInfo.getH_arv_tm(), "HHmmss", "HH:mm"));
            if (i8 != 0 || ticket_info.size() <= 1) {
                String h_dtour = ticketDetailResponse.getH_dtour();
                if (!N.isNull(h_dtour)) {
                    sb3.append(" (");
                    sb3.append(h_dtour);
                    sb3.append(")");
                }
            } else {
                sb3.append(" > ");
                sb2.append(" > ");
            }
        }
        return sb.toString() + ", " + sb2.toString() + X.LF + sb3.toString();
    }

    public static String getTrainInfo(NCardInquiryDao.TrainInfo trainInfo) {
        StringBuilder sb = new StringBuilder();
        sb.append(trainInfo.getDptRsStnNm());
        sb.append(" ⇄ ");
        if (N.isNotNull(trainInfo.getDturNm())) {
            sb.append("<font color='#159aff'>");
            sb.append(trainInfo.getDturNm());
            sb.append("</font>");
            sb.append(" ⇄ ");
        }
        sb.append(trainInfo.getArvRsStnNm());
        return sb.toString();
    }

    public static String getTrainRoute(ReservationResponse.JrnyInfo jrnyInfo) {
        return d(jrnyInfo) + X.SPACE + c(jrnyInfo);
    }

    public static String getTrainInfo(List<TicketRsvHistoryDao.TrainInfo> list) {
        StringBuilder sb = new StringBuilder();
        for (int i8 = 0; i8 < list.size(); i8++) {
            TicketRsvHistoryDao.TrainInfo trainInfo = list.get(i8);
            String h_trn_clsf_cd = trainInfo.getH_trn_clsf_cd();
            sb.append("[");
            sb.append(trainInfo.getH_trn_clsf_nm());
            sb.append(O.isLimousine(h_trn_clsf_cd) ? "" : X.SPACE + trainInfo.getH_trn_no());
            sb.append("] ");
            sb.append(trainInfo.getH_dpt_rs_stn_nm());
            sb.append("98".equals(trainInfo.getH_trn_clsf_cd()) ? "" : X.SPACE + C6634h.convertFormat(trainInfo.getH_dpt_tm(), "HHmmss", "HH:mm") + "");
            sb.append(" → ");
            sb.append(trainInfo.getH_arv_rs_stn_nm());
            sb.append(O.isLimousine(h_trn_clsf_cd) ? "" : X.SPACE + C6634h.convertFormat(trainInfo.getH_arv_tm(), "HHmmss", "HH:mm"));
            if (i8 < list.size() - 1) {
                sb.append(X.LF);
            }
        }
        return sb.toString();
    }

    public static String getRoute(List<CommRsvInquiryDao.TrainList> list) {
        StringBuilder sb = new StringBuilder();
        for (int i8 = 0; i8 < list.size(); i8++) {
            CommRsvInquiryDao.TrainList trainList = list.get(i8);
            if (i8 == 0) {
                sb.append(trainList.getH_dpt_rs_stn_nm());
                sb.append(" ⇄ ");
            }
            if (N.isNotNull(trainList.getH_dtour())) {
                sb.append("<font color='#159aff'>");
                sb.append(trainList.getH_dtour());
                sb.append("</font>");
                sb.append(" ⇄ ");
            }
            sb.append(trainList.getH_arv_rs_stn_nm());
            if (i8 == 0 && list.size() > 1) {
                sb.append(" ⇄ ");
            }
        }
        return sb.toString();
    }
}
