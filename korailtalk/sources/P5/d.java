package P5;

import com.korail.talk.network.response.certification.ReservationResponse;
import r4.k;

/* loaded from: classes.dex */
public interface d {
    void executeAddCart(ReservationResponse reservationResponse);

    void executeAddProduct(ReservationResponse reservationResponse);

    void executeRsvCancel(ReservationResponse reservationResponse);

    void executeTicketChangeCancel(ReservationResponse reservationResponse);

    k getReservationType();

    boolean isLinkageReservation();

    boolean isWait();

    void moveToWebView(String str);

    void setFinish(int i8);
}
