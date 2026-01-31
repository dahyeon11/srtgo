package z4;

import com.korail.talk.network.response.certification.ReservationResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class J extends C6632f {
    public static ArrayList<String> getProductTrainSeatFilterData() {
        r4.p[] pVarArrValues = r4.p.values();
        ArrayList<String> arrayList = new ArrayList<>();
        for (r4.p pVar : pVarArrValues) {
            if (pVar.isProductVisible()) {
                arrayList.add(pVar.getName());
            }
        }
        return arrayList;
    }

    public static String getSeatDirectionName(String str) {
        String name = "";
        for (r4.l lVar : r4.l.values()) {
            if (lVar.getCode().equalsIgnoreCase(str)) {
                name = lVar.getName();
            }
        }
        return name;
    }

    public static ArrayList<String> getTrainSeatFilterData() {
        r4.p[] pVarArrValues = r4.p.values();
        ArrayList<String> arrayList = new ArrayList<>();
        for (r4.p pVar : pVarArrValues) {
            if (pVar.isVisible()) {
                arrayList.add(pVar.getName());
            }
        }
        return arrayList;
    }

    public static boolean isFamilySeatType(r4.r rVar) {
        return C6630d.isNotNull(rVar) && isFamilySeatType(rVar.getCode());
    }

    public static boolean isFreeSeat(String str, String str2, String str3) {
        return r4.o.GENERAL.getCode().equals(str) && "13".equals(str2) && "11".equals(str3);
    }

    public static boolean isMixedSeat(String str, String str2) {
        return ((r4.o.GENERAL.getCode().equals(str) || "M".equals(str2)) ? y1.x.MAX_AD_CONTENT_RATING_G : "S").equals(str2);
    }

    public static boolean isSpecialRoom(List<ReservationResponse.JrnyInfo> list) {
        Iterator<ReservationResponse.JrnyInfo> it = list.iterator();
        boolean z8 = false;
        while (it.hasNext()) {
            Iterator<ReservationResponse.SeatInfo> it2 = it.next().getSeat_infos().getSeat_info().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (isSpecialRoom(it2.next().getH_rq_seat_att_cd())) {
                    z8 = true;
                    break;
                }
            }
        }
        return z8;
    }

    public static boolean isStndSeat(String str, String str2, String str3) {
        return r4.o.GENERAL.getCode().equals(str) && "13".equals(str2) && "11".equals(str3);
    }

    public static boolean isFamilySeatType(String str) {
        return N.isNotNull(str) && r4.r.FAMILY.getCode().equals(str);
    }

    public static boolean isSpecialRoom(r4.r rVar) {
        return C6630d.isNotNull(rVar) && isSpecialRoom(rVar.getCode());
    }

    public static boolean isSpecialRoom(String str) {
        if (N.isNotNull(str)) {
            return r4.r.FAMILY.getCode().equals(str) || r4.r.ONDOL.getCode().equals(str) || r4.r.COUPLE.getCode().equals(str) || r4.r.FAMILY_ROOM.getCode().equals(str);
        }
        return false;
    }
}
