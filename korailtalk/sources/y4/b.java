package Y4;

import com.korail.talk.data.CalendarData;
import com.korail.talk.data.SeatAssignData;

/* loaded from: classes.dex */
public interface b {
    com.korail.talk.ui.booking.option.date.a getDateOption();

    int getPassengerCount();

    V4.b getRouteOption();

    SeatAssignData getSeatAssignData();

    void setDate(CalendarData calendarData);

    void setStationNm(String str, String str2);

    void unSelectStation();
}
