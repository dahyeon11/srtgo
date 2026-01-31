package z4;

import F4.C0500a;
import Q7.X;
import android.content.Context;
import com.korail.talk.network.dao.refund.RefundCommissionDao;
import com.korail.talk.network.dao.refund.TicketDetailDao;
import com.korail.talk.network.response.certification.ReservationResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n4.AbstractC5959j;
import p4.C6054a;

/* loaded from: classes.dex */
public class x {
    private static String a(Context context, String str, String str2, String str3) throws NumberFormatException {
        String decimalFormatString = N.getDecimalFormatString(str3);
        return (str.equalsIgnoreCase(C6054a.BEFORE_DEPARTURE) || "13".equals(str2)) ? context.getString(AbstractC5959j.ticket_before_return_msg, context.getString(AbstractC5959j.common_ticket), decimalFormatString) : context.getString(AbstractC5959j.ticket_return_msg, decimalFormatString);
    }

    private static String b(RefundCommissionDao.RefundCommissionResponse refundCommissionResponse, String str) {
        String str2 = refundCommissionResponse.gethMsgCd();
        String str3 = refundCommissionResponse.gethMsgTxt();
        String h_msg_cd2 = refundCommissionResponse.getH_msg_cd2();
        String h_msg_txt2 = refundCommissionResponse.getH_msg_txt2();
        if (!str2.equals("IRT200311") && !str2.equals("IRT200312")) {
            if (!str2.equals("MRT200608")) {
                return "";
            }
            if (N.isNull(h_msg_cd2)) {
                return str3 + "\n\n";
            }
            return str3 + "\n\n" + h_msg_txt2 + "\n\n";
        }
        if (N.isNull(h_msg_cd2)) {
            return str3 + " : " + str + "\n\n";
        }
        return str3 + " : " + str + "\n\n" + h_msg_txt2 + "\n\n";
    }

    private static int c(List list) {
        Iterator it = list.iterator();
        int integer = 0;
        while (it.hasNext()) {
            integer += N.getInteger(((RefundCommissionDao.RefundCommissionResponse) it.next()).getRet_amt());
        }
        return integer;
    }

    private static String d(Context context, String str) throws NumberFormatException {
        return context.getString(AbstractC5959j.ticket_ncard_return_msg, N.getDecimalFormatString(str));
    }

    private static String e(Context context, List list, List list2) {
        StringBuilder sb = new StringBuilder();
        for (int i8 = 0; i8 < list2.size(); i8++) {
            List<TicketDetailDao.TicketInfo> ticket_info = ((TicketDetailDao.TicketDetailResponse) list2.get(i8)).getTicket_infos().getTicket_info();
            RefundCommissionDao.RefundCommissionResponse refundCommissionResponse = (RefundCommissionDao.RefundCommissionResponse) list.get(i8);
            String str = refundCommissionResponse.gethMsgCd();
            String h_msg_cd2 = refundCommissionResponse.getH_msg_cd2();
            if (str.equals("IRT200311") || str.equals("IRT200312") || h_msg_cd2.equals("IRT200311") || h_msg_cd2.equals("IRT200312")) {
                Iterator<TicketDetailDao.TicketInfo> it = ticket_info.iterator();
                while (it.hasNext()) {
                    for (TicketDetailDao.TicketSeatInfo ticketSeatInfo : it.next().getTk_seat_info()) {
                        sb.append(context.getString(AbstractC5959j.common_s_seat, ticketSeatInfo.getH_srcar_no(), ticketSeatInfo.getH_seat_no()));
                        sb.append(X.SPACE);
                    }
                }
            }
        }
        return sb.toString();
    }

    public static int getCommissionAmount(List<RefundCommissionDao.RefundCommissionResponse> list) {
        Iterator<RefundCommissionDao.RefundCommissionResponse> it = list.iterator();
        int integer = 0;
        while (it.hasNext()) {
            integer += N.getInteger(it.next().getRet_fee());
        }
        return integer;
    }

    public static String getCommissionMessage(Context context, List<RefundCommissionDao.RefundCommissionResponse> list, List<TicketDetailDao.TicketDetailResponse> list2) {
        RefundCommissionDao.RefundCommissionResponse refundCommissionResponse = list.get(0);
        TicketDetailDao.TicketDetailResponse ticketDetailResponse = list2.get(0);
        String strD = C0500a.isNTicket(ticketDetailResponse.getH_tk_knd_cd()) ? d(context, String.valueOf(c(list))) : a(context, refundCommissionResponse.getTk_ret_tms_dv_cd(), ticketDetailResponse.getH_tk_knd_cd(), String.valueOf(getCommissionAmount(list)));
        String str = refundCommissionResponse.gethMsgCd();
        if (!str.equals("IRT200311") && !str.equals("IRT200312") && !str.equals("MRT200608")) {
            return strD;
        }
        return b(refundCommissionResponse, e(context, list, list2)) + strD;
    }

    public static List<String> getReservationMessage(Context context, boolean z8, r4.c cVar, ReservationResponse reservationResponse) {
        ArrayList arrayList = new ArrayList();
        String h_msg_mndry = reservationResponse.getH_msg_mndry();
        t.e("msgMndry : " + h_msg_mndry);
        if (r4.c.RSV_DEFAULT == cVar && !z8 && N.isNotNull(h_msg_mndry)) {
            for (String str : h_msg_mndry.replaceAll("\\n\\n", X.LF).split(X.LF)) {
                arrayList.add(str);
            }
        }
        String h_msg_txt5 = reservationResponse.getH_msg_txt5();
        String str2 = reservationResponse.gethMsgCd();
        t.e("msgCd : " + str2 + ", msgTxt5 : " + h_msg_txt5);
        if (N.isNotNull(h_msg_txt5.trim()) && N.isNotNull(str2)) {
            for (String str3 : h_msg_txt5.replaceAll("\\n\\n", X.LF).split(X.LF)) {
                arrayList.add(str3);
            }
        }
        if (I4.h.getInstance().isLogin()) {
            String payLimitMsg = reservationResponse.getPayLimitMsg();
            t.e("message_pay_limit : " + payLimitMsg);
            if (N.isNotNull(payLimitMsg.trim())) {
                for (String str4 : payLimitMsg.replaceAll("\\n\\n", X.LF).split(X.LF)) {
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (!((String) it.next()).contains(str4)) {
                            arrayList.add(str4);
                            break;
                        }
                    }
                }
            }
        } else {
            arrayList.add("비회원은 예약 완료 후, 바로 결제하지 않으면 자동 예약 취소됩니다.");
            arrayList.add("선택하신 승차권으로 바로 결제하시겠습니까?");
        }
        if (r4.c.RSV_INCOMING == cVar) {
            arrayList.add("'장바구니' 버튼을 선택하시면 해당 승차권이 예약되며 장바구니 화면으로 이동합니다.");
            arrayList.add("할인승차권 이용시에는 관련 신분증 또는 증명서를 소지하셔야 합니다.");
        } else {
            arrayList.add("승차권을 발권받은 스마트폰에서만 확인할 수 있습니다.");
            arrayList.add("할인승차권 이용시에는 관련 신분증 또는 증명서를 소지하셔야 합니다.");
        }
        String superiorClassMessage = getSuperiorClassMessage(reservationResponse);
        if (N.isNotNull(superiorClassMessage)) {
            arrayList.add(superiorClassMessage);
        }
        return arrayList;
    }

    public static String getSuperiorClassMessage(ReservationResponse reservationResponse) {
        ReservationResponse.JrnyInfo jrnyInfo = reservationResponse.getJrny_infos().getJrny_info().get(0);
        if (O.isSuperiorClass(jrnyInfo.getH_trn_clsf_cd(), jrnyInfo.getSeat_infos().getSeat_info().get(0).getH_psrm_cl_cd())) {
            return "KTX-이음의 우등실은 물품 및 도서, 잡지 서비스를 제공하지 않습니다.";
        }
        return null;
    }
}
