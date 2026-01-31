package r4;

import com.korail.talk.ui.ticket.confirm.TicketSelfCheckinStatusActivity;
import o6.InterfaceC6042a;
import p4.C6054a;

/* loaded from: classes.dex */
public enum e implements InterfaceC6042a {
    DIRECT("직통", "11"),
    TRANSFER("환승", TicketSelfCheckinStatusActivity.CHECKIN_STATUS_EXCEED),
    STANDING_SEAT_1("병합 선행", C6054a.BEFORE_DEPARTURE),
    STANDING_SEAT_2("병합 후행", "22");


    /* renamed from: a, reason: collision with root package name */
    private String f35737a;

    /* renamed from: b, reason: collision with root package name */
    private String f35738b;

    e(String str, String str2) {
        this.f35737a = str;
        this.f35738b = str2;
    }

    @Override // o6.InterfaceC6042a
    public String getCode() {
        return this.f35738b;
    }

    @Override // o6.InterfaceC6042a
    public String getName() {
        return this.f35737a;
    }
}
