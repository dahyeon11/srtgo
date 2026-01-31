package Y4;

import com.korail.talk.data.CalendarData;
import com.korail.talk.network.dao.refund.TicketDetailDao;
import com.korail.talk.ui.booking.option.station.StationSearch;

/* loaded from: classes.dex */
public interface a {
    TicketDetailDao.TicketDetailResponse getDetailResponse();

    void hideStationSearch();

    void setDate(CalendarData calendarData);

    void setInquiryEnable(boolean z8);

    void setStationNm(String str, String str2);

    void showStationSearch(StationSearch.c cVar);
}
