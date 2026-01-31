package P4;

import android.os.Bundle;
import com.korail.talk.data.CalendarData;

/* renamed from: P4.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0688f {
    W4.c getBookingToggleOption();

    com.korail.talk.ui.booking.option.date.a getDepartureDateOption();

    com.korail.talk.ui.booking.option.date.a getInComingDateOption();

    T4.d getPassengerAgeSeatCountOption();

    V4.b getRouteOption();

    void refreshDate();

    void setDate(CalendarData calendarData);

    void setExternalAppDate(Bundle bundle);

    void setExternalAppStationNm(Bundle bundle);

    void setPassengerData(Bundle bundle);

    void setStationNm(String str, String str2);

    void unSelectStation();
}
