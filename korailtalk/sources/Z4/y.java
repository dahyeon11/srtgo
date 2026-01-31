package z4;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.korail.talk.ui.booking.discountBooking.commutation.CommutationBookingActivity;
import com.korail.talk.ui.booking.discountBooking.commutation.PeriodCommutationBookingActivity;
import com.korail.talk.ui.booking.mainBooking.MainBookingActivity;
import com.korail.talk.ui.menu.DelayDiscountCouponActivity;
import com.korail.talk.ui.menu.DiscountCouponActivity;
import com.korail.talk.ui.menu.ReservedTicketActivity;
import com.korail.talk.ui.menu.discountMenu.NewDiscountMenuActivity;
import com.korail.talk.ui.menu.discountMenu.NewTripMenuActivity;
import com.korail.talk.ui.menu.offline.OfflineTicketReturnActivity;
import com.korail.talk.ui.menu.tripbooking.TripBookingListActivity;
import com.korail.talk.ui.mileage.AccumulatingKTXMileageActivity;
import com.korail.talk.ui.mileage.MileageHistoryActivity;
import com.korail.talk.ui.push.PushHistoryActivity;
import com.korail.talk.ui.reservation.BixbyReservationActivity;
import com.korail.talk.ui.setting.memberCard.MemberCardActivity;
import com.korail.talk.ui.ticket.confirm.TicketListActivity;
import com.korail.talk.ui.web.IntegrationWebViewActivity;

/* loaded from: classes.dex */
public class y {
    public static Class getClassNm(Uri uri) {
        String queryParameter = uri.getQueryParameter("view");
        if ("booking".equals(queryParameter)) {
            return MainBookingActivity.class;
        }
        if (!"ticket".equals(queryParameter)) {
            if ("memberCard".equals(queryParameter)) {
                return MemberCardActivity.class;
            }
            if ("web".equals(queryParameter)) {
                return IntegrationWebViewActivity.class;
            }
            if ("discountCoupon".equals(queryParameter)) {
                return DiscountCouponActivity.class;
            }
            if ("delayDiscountCoupon".equals(queryParameter)) {
                return DelayDiscountCouponActivity.class;
            }
            if ("mileage".equals(queryParameter)) {
                return MileageHistoryActivity.class;
            }
            if ("seasonTicket".equals(queryParameter)) {
                return CommutationBookingActivity.class;
            }
            if ("periodSeasonTicket".equals(queryParameter)) {
                return PeriodCommutationBookingActivity.class;
            }
            if ("reservation".equals(queryParameter)) {
                return BixbyReservationActivity.class;
            }
            if ("discountMenuList".equals(queryParameter)) {
                return NewDiscountMenuActivity.class;
            }
            if (!"tripMenuList".equals(queryParameter)) {
                if ("pushHistory".equals(queryParameter)) {
                    return PushHistoryActivity.class;
                }
                if ("bookedTicket".equals(queryParameter)) {
                    return ReservedTicketActivity.class;
                }
                if (!"bookedTrip".equals(queryParameter)) {
                    if (!"offlineTikcetReturn".equals(queryParameter)) {
                        if (!"accumulatingMilege".equals(queryParameter)) {
                            if (!"tourReserved".equals(queryParameter)) {
                                if (!"ticketRefund".equals(queryParameter)) {
                                    if (!"offlineTicketRefund".equals(queryParameter)) {
                                        if (!"togetherMileage".equals(queryParameter)) {
                                            if (!"tourMenuList".equals(queryParameter)) {
                                                return null;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return AccumulatingKTXMileageActivity.class;
                    }
                    return OfflineTicketReturnActivity.class;
                }
                return TripBookingListActivity.class;
            }
            return NewTripMenuActivity.class;
        }
        return TicketListActivity.class;
    }

    public static Bundle getNavigationBundle(Uri uri) {
        Bundle bundle = new Bundle();
        for (String str : uri.getQueryParameterNames()) {
            if (!"view".equals(str)) {
                bundle.putString(str, uri.getQueryParameter(str));
            }
        }
        return bundle;
    }

    public static boolean isNavigation(Intent intent) {
        return C6630d.isNotNull(intent) && intent.hasExtra("TYPE") && "TYPE_NAVIGATION".equals(intent.getStringExtra("TYPE"));
    }
}
