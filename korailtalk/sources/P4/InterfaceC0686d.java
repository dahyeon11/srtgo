package P4;

import android.os.Bundle;
import com.korail.talk.data.CalendarData;
import com.korail.talk.ui.booking.option.station.StationSearch;

/* renamed from: P4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0686d {
    void hideStationSearch();

    void moveToTrainInquiryBySRT();

    void setDate(CalendarData calendarData);

    void setPassengerData(Bundle bundle);

    void setStationNm(String str, String str2);

    void showStationSearch(StationSearch.c cVar);
}
