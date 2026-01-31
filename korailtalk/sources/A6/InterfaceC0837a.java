package a6;

import android.os.Bundle;
import android.view.View;
import com.korail.talk.data.WheelchairData;

/* renamed from: a6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0837a {
    void moveToCompanionMileageDetail(int i8);

    void moveToDelayedCertificate(int i8);

    void moveToDeliveredHistory(boolean z8, int i8);

    void moveToDeviceReset(int i8);

    void moveToGuardianReliefSMS(int i8);

    void moveToMaasServiceAddReservation(int i8);

    void moveToMaasServiceCancel(int i8);

    void moveToMaasServiceDetail(int i8);

    void moveToMaasServiceReceipt(int i8);

    void moveToProductList(int i8);

    void moveToReceipt(int i8, int i9);

    void moveToSeatAssignBooking(int i8, String str);

    void moveToSelfCheckinStatus(int i8, int i9, int i10);

    void moveToTicketChange(int i8);

    void moveToTicketReturn(int i8);

    void moveToTicketSeatChange(int i8);

    void moveToTicketSend(int i8);

    void moveToTrainFacility(String str, String str2);

    void moveToTrainServiceInfo(int i8, int i9);

    void moveToWheelchair(String str, WheelchairData wheelchairData);

    void nCardExtension(int i8);

    void onClickCallCrew(int i8, int i9, int i10);

    void onClickUpdatePlatform(int i8, int i9, int i10);

    void reservationLimousine(int i8);

    void ticketShareInfo(View view, View view2, Bundle bundle);
}
