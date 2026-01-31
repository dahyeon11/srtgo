package p5;

import com.korail.talk.data.CalendarData;

/* renamed from: p5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC6055a {
    com.korail.talk.ui.booking.option.date.a getDepartureDateOption();

    T4.d getPassengerAgeSeatCountOption();

    V4.b getRouteOption();

    void refreshDate();

    void setDate(CalendarData calendarData);

    void setStationNm(String str, String str2);

    void unSelectStation();
}
