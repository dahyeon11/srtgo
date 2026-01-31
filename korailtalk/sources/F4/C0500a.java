package F4;

import com.korail.talk.network.response.certification.ReservationResponse;
import com.korail.talk.ui.ticket.confirm.TicketSelfCheckinStatusActivity;
import java.util.Iterator;
import java.util.List;

/* renamed from: F4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0500a {
    private static boolean a(String str) {
        return "11".equals(str) || TicketSelfCheckinStatusActivity.CHECKIN_STATUS_USING.equals(str) || "12".equals(str) || "04".equals(str);
    }

    private static boolean b(String str) {
        return "020".equals(str);
    }

    private static boolean c(String str) {
        return isYCommutation(str) || a(str);
    }

    private static boolean d(String str) {
        return isYPeriodCommutation(str) || b(str);
    }

    public static boolean isCommutation(String str, String str2) {
        return c(str) || d(str2);
    }

    public static boolean isGPass(String str) {
        return "56".equals(str);
    }

    public static boolean isGeneralTicket(String str, String str2, boolean z8) {
        return ("10".equals(str) && z8) || "72".equals(str) || "74".equals(str) || "75".equals(str) || "87".equals(str) || "89".equals(str) || "94".equals(str) || "90".equals(str) || "92".equals(str) || "93".equals(str) || "98".equals(str2);
    }

    public static boolean isLimousine(List<ReservationResponse.JrnyInfo> list) {
        Iterator<ReservationResponse.JrnyInfo> it = list.iterator();
        while (it.hasNext()) {
            if (z4.O.isLimousine(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean isNTicket(String str) {
        return "81".equals(str);
    }

    public static boolean isOneTicket(ReservationResponse.JrnyInfo jrnyInfo) {
        List<ReservationResponse.SeatInfo> seat_info = jrnyInfo.getSeat_infos().getSeat_info();
        boolean z8 = false;
        for (int i8 = 0; i8 < seat_info.size(); i8++) {
            if (A4.a.isMeritProjector(seat_info.get(i8).getH_dcnt_knd_cd1()) || A4.a.isMeritProjector(seat_info.get(i8).getH_dcnt_knd_cd2()) || A4.a.isDisabledProtector(seat_info.get(i8).getH_dcnt_knd_cd1()) || A4.a.isDisabledProtector(seat_info.get(i8).getH_dcnt_knd_cd2())) {
                z8 = true;
            }
        }
        return z8;
    }

    public static boolean isSeatAssignTicket(String str) {
        return "22".equals(str);
    }

    public static boolean isStandingSeat(String str) {
        return r4.e.STANDING_SEAT_1.getCode().equals(str) || r4.e.STANDING_SEAT_2.getCode().equals(str);
    }

    public static boolean isYCommutation(String str) {
        return "09".equals(str) || "03".equals(str) || "10".equals(str) || TicketSelfCheckinStatusActivity.CHECKIN_STATUS_NOT_USE.equals(str);
    }

    public static boolean isYPeriodCommutation(String str) {
        return "011".equals(str);
    }
}
