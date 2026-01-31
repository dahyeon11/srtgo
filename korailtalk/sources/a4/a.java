package A4;

import F4.C0500a;
import I4.h;
import com.korail.talk.network.response.certification.ReservationResponse;
import java.util.Iterator;
import java.util.List;
import z4.J;
import z4.N;

/* loaded from: classes.dex */
public class a {
    public static boolean isApplyDiscount(String str) {
        return N.isNotNull(str) && ("202".equals(str) || "204".equals(str) || "205".equals(str) || "206".equals(str) || "208".equals(str) || "207".equals(str) || "209".equals(str) || "210".equals(str) || "403".equals(str) || "432".equals(str));
    }

    public static boolean isCongressPerson(String str) {
        return "402".equals(str);
    }

    public static boolean isCongressperson(String str) {
        return "431".equals(str);
    }

    public static boolean isCoupon(String str) {
        return "401".equals(str) || "402".equals(str) || "403".equals(str) || "404".equals(str) || "405".equals(str) || "406".equals(str) || "407".equals(str) || "408".equals(str);
    }

    public static boolean isDelayCoupon(String str) {
        return "712".equals(str);
    }

    public static boolean isDisabledProtector(String str) {
        return "208".equals(str);
    }

    public static boolean isDiscountReservation(ReservationResponse reservationResponse) {
        h hVar = h.getInstance();
        List<ReservationResponse.JrnyInfo> jrny_info = reservationResponse.getJrny_infos().getJrny_info();
        return "Y".equals(reservationResponse.getH_fmly_info_cfm_flg()) || !(hVar.isSejongMember().booleanValue() || hVar.isNaJuMember() || hVar.isSinGyeongJu() || C0500a.isLimousine(jrny_info) || J.isSpecialRoom(jrny_info) || isSeatAssign(jrny_info));
    }

    public static boolean isEmployee(String str) {
        return "411".equals(str);
    }

    public static boolean isMerit(String str) {
        return "207".equals(str);
    }

    public static boolean isMeritIntegratedDC(String str, String str2) {
        return b.isMeritFree(str, str2) || b.isMeritDC(str, str2);
    }

    public static boolean isMeritProjector(String str) {
        return "209".equals(str);
    }

    public static boolean isNCard(String str) {
        return "153".equals(str);
    }

    public static boolean isSeatAssign(List<ReservationResponse.JrnyInfo> list) {
        Iterator<ReservationResponse.JrnyInfo> it = list.iterator();
        boolean z8 = false;
        while (it.hasNext()) {
            for (ReservationResponse.SeatInfo seatInfo : it.next().getSeat_infos().getSeat_info()) {
                if ("442".equals(seatInfo.getH_dcnt_knd_cd1()) || "442".equals(seatInfo.getH_dcnt_knd_cd2()) || "442".equals(seatInfo.getH_dcnt_knd_cd3()) || "442".equals(seatInfo.getH_dcnt_knd_cd4()) || "442".equals(seatInfo.getH_dcnt_knd_cd5())) {
                    z8 = true;
                    break;
                }
            }
        }
        return z8;
    }

    public static boolean isSoldier(String str) {
        return "432".equals(str);
    }
}
