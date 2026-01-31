package F5;

import android.content.Context;
import com.korail.talk.data.DiscountObjectData;
import com.korail.talk.network.dao.passCard.DCCouponListDao;
import com.korail.talk.network.dao.passCard.DelayTicketListDao;
import com.korail.talk.network.request.payment.IPaymentRequest;
import com.korail.talk.network.response.certification.ReservationResponse;
import java.util.ArrayList;
import java.util.List;
import r4.i;
import r4.j;
import u6.C6420a;

/* loaded from: classes.dex */
public interface a {
    boolean disableDiscountPoint();

    int getDiscountAmount();

    IPaymentRequest getIPaymentRequest();

    String getJrnyCnt();

    ReservationResponse.JrnyInfo getJrnyInfo();

    List<ReservationResponse.JrnyInfo> getJrnyInfoList();

    String getPNRNo();

    i getPaymentType();

    int getReceivedAmount();

    ReservationResponse getReservationResponse();

    j getReservedTicketType();

    int getSelectedItemCount();

    boolean isCommPaymentRequest();

    boolean isEnableMeritProtector();

    boolean isEnableTarget(C6420a c6420a, int i8);

    boolean isExistHighDisable();

    boolean isIntgStlRequest();

    boolean isOnlyPayment();

    boolean isPassPaymentRequest();

    boolean isReservationHistory();

    boolean isReservationResponseNull();

    boolean isRsvPaymentRequest();

    boolean isTravelPackages();

    ArrayList<DiscountObjectData> makeDelayCouponEntries(Context context, List<DelayTicketListDao.DelayCoupon> list);

    ArrayList<DiscountObjectData> makeDiscountCouponEntries(Context context, List<DCCouponListDao.DiscountCoupon> list);

    void setIPaymentRequest(IPaymentRequest iPaymentRequest);

    void setReservationResponse(ReservationResponse reservationResponse);
}
