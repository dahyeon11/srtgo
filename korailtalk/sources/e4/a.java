package E4;

import com.korail.talk.network.dao.research.SearchSeatListDao;
import z4.N;

/* loaded from: classes.dex */
public class a {
    public static boolean isArrowView(SearchSeatListDao.Seat seat) {
        return "999".equals(seat.getRq_seat_att_cd());
    }

    public static boolean isAvailabilitySeat(SearchSeatListDao.Seat seat) {
        return "Y".equals(seat.getSale_psb_flg());
    }

    public static boolean isEmptyView(SearchSeatListDao.Seat seat) {
        return !"000".equals(seat.getEtc_seat_att_cd());
    }

    public static boolean isFloor(SearchSeatListDao.Seat seat) {
        return "BBB".equals(seat.getFloor());
    }

    public static boolean isSpecialRoom(SearchSeatListDao.Seat seat) {
        String sqr_no = seat.getSqr_no();
        return N.isNotNull(sqr_no) && !"000".equals(sqr_no);
    }
}
