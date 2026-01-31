package com.korail.talk.ui.booking.discountBooking.goods;

import T4.c;
import T4.f;
import V4.b;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import com.korail.talk.data.CalendarData;
import com.korail.talk.data.StationNameData;
import com.korail.talk.network.dao.pass.DiscountMenuDao;
import com.korail.talk.network.request.inquiry.RsvInquiryRequest;
import com.korail.talk.network.request.inquiry.TrainInquiryRequest;
import com.korail.talk.network.request.reservation.ReservationRequest;
import com.korail.talk.ui.booking.option.date.a;
import com.korail.talk.ui.inquiry.rir.orr.DirectInquiryActivity;
import com.korail.talk.ui.inquiry.rir.orr.TransferInquiryActivity;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import n4.AbstractC5959j;
import r4.EnumC6175b;
import r4.d;
import r4.r;
import r4.s;
import z4.C6630d;
import z4.C6631e;
import z4.C6637k;
import z4.M;
import z4.N;

/* loaded from: classes.dex */
public class FamilyBookingActivity extends DiscountBookingActivity {

    /* renamed from: p, reason: collision with root package name */
    private DiscountMenuDao.DiscountMenu f27604p;

    private void B0() {
        this.f27604p = (DiscountMenuDao.DiscountMenu) getIntent().getSerializableExtra("DISCOUNT_MENU_DATA");
    }

    private void D0() {
        R0();
        P0();
        Q0();
    }

    private int I0() {
        return this.f27604p.getAfterDay();
    }

    private String J0() {
        return this.f27604p.getTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M0(Bundle bundle, int i8, String str) {
        this.f27598o.setEnabled(bundle.getInt("TOTAL_PERSON_COUNT") == 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N0() throws Resources.NotFoundException {
        StationNameData stationNameData = new StationNameData();
        stationNameData.setDepartureStationName(this.f27594k.getArrivalStationNm());
        stationNameData.setArrivalStationName(this.f27594k.getStartStationNm());
        onChangeStation(stationNameData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O0(DialogInterface dialogInterface, int i8) {
        if (100 == i8) {
            finish();
        }
    }

    private void P0() {
        String[] normalDateStrArray = C6631e.getNormalDateStrArray(I0());
        a aVar = new a(this);
        this.f27595l = aVar;
        this.f27592i.addView(aVar);
        this.f27595l.setHeaderSummary(getString(AbstractC5959j.common_departure_date));
        this.f27595l.setDate(normalDateStrArray);
    }

    private void Q0() {
        f fVar = new f(this);
        this.f27596m = fVar;
        this.f27592i.addView(fVar);
        this.f27596m.setOnChangePersonInfoListener(new c.a() { // from class: N4.i
            @Override // T4.c.a
            public final void onChangePersonInfo(Bundle bundle, int i8, String str) {
                this.f3243a.M0(bundle, i8, str);
            }
        });
    }

    private void R0() {
        b bVar = new b(this);
        this.f27594k = bVar;
        this.f27592i.addView(bVar);
        String[] stationNm = M.getStationNm();
        this.f27594k.setStationInfo(stationNm[0], stationNm[1], 0, 8);
        this.f27594k.setOnReverseStationsListener(new b.a() { // from class: N4.k
            @Override // V4.b.a
            public final void onReverseStation() throws Resources.NotFoundException {
                this.f3245a.N0();
            }
        });
    }

    private void S0() {
        String agree = this.f27604p.getAgree();
        if (N.isNotNull(agree)) {
            C6637k.getCDialog(K(), 1002, 0, getString(AbstractC5959j.dialog_title_agree)).setContent(agree).setButtonListener(new DialogInterface.OnClickListener() { // from class: N4.j
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    this.f3244a.O0(dialogInterface, i8);
                }
            }).showDialog();
        }
    }

    protected RsvInquiryRequest[] K0(String str, CalendarData calendarData) {
        TrainInquiryRequest[] trainInquiryRequestArr = {new TrainInquiryRequest()};
        B4.b.getRsvInquiryRequest(getApplicationContext(), trainInquiryRequestArr, this.f27594k, this.f27595l, null, this.f27596m, str, calendarData, "51", r.FAMILY.getCode());
        TrainInquiryRequest trainInquiryRequest = trainInquiryRequestArr[0];
        s sVar = s.KTX;
        trainInquiryRequest.setSelGoTrain(sVar.getCode());
        trainInquiryRequestArr[0].setTxtTrnGpCd(sVar.getCode());
        return trainInquiryRequestArr;
    }

    protected ReservationRequest L0() {
        return D4.a.getOReservationRequest("51", r.FAMILY.getCode(), this.f27596m);
    }

    @Override // com.korail.talk.ui.booking.discountBooking.goods.DiscountBookingActivity, com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        if (C6630d.isNull(bundle)) {
            B0();
            D0();
            setText();
            C0();
            S0();
        }
    }

    public void setText() {
        setAppTitle(J0());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.korail.talk.network.request.inquiry.RsvInquiryRequest[], java.io.Serializable] */
    @Override // com.korail.talk.ui.booking.discountBooking.goods.DiscountBookingActivity
    protected void x0(String str, CalendarData calendarData, Bundle bundle) {
        Context applicationContext = getApplicationContext();
        d dVar = d.DIRECT_SQ_NO;
        Intent intent = new Intent(applicationContext, (Class<?>) (dVar.getCode().equals(str) ? DirectInquiryActivity.class : TransferInquiryActivity.class));
        intent.putExtra("IS_DIRECT", dVar.getCode().equals(str));
        intent.putExtra("IS_TRANSFER", false);
        intent.putExtra("RESERVATION_TYPE", r4.c.RSV_DEFAULT);
        intent.putExtra("MENU_TYPE", EnumC6175b.THEME_FAMILY);
        intent.putExtra("TRAIN_GROUP_CODE", s.KTX.getCode());
        intent.putExtra("INQUIRY_REQUEST", (Serializable) K0(str, calendarData));
        intent.putExtra("RESERVATION_REQUEST", L0());
        if (bundle != null) {
            String string = bundle.getString("TRANSFER_CHTNRSSTNCD");
            String string2 = bundle.getString("TRANSFER_TRNGPCD");
            boolean z8 = bundle.getBoolean("IS_SELECT_TRANSFER");
            intent.putExtra("TRANSFER_CHTNRSSTNCD", string);
            intent.putExtra("TRANSFER_TRNGPCD", string2);
            intent.putExtra("IS_SELECT_TRANSFER", z8);
        }
        startActivityForResult(intent, 117);
    }
}
