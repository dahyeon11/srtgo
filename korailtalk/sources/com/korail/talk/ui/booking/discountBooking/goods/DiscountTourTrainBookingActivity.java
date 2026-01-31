package com.korail.talk.ui.booking.discountBooking.goods;

import I4.h;
import T4.c;
import T4.k;
import U4.b;
import V4.b;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import com.korail.talk.data.CalendarData;
import com.korail.talk.data.StationNameData;
import com.korail.talk.network.dao.trainsInfo.TourTrainInfoDao;
import com.korail.talk.network.request.inquiry.RsvInquiryRequest;
import com.korail.talk.network.request.inquiry.TrainInquiryRequest;
import com.korail.talk.network.request.reservation.ReservationRequest;
import com.korail.talk.ui.booking.option.date.a;
import com.korail.talk.ui.inquiry.rir.orr.DirectInquiryActivity;
import com.korail.talk.ui.inquiry.rir.orr.TransferInquiryActivity;
import com.korail.talk.ui.ticket.confirm.TicketSelfCheckinStatusActivity;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import n4.AbstractC5959j;
import r4.EnumC6175b;
import r4.d;
import r4.p;
import r4.r;
import r4.s;
import z4.C6630d;
import z4.C6631e;
import z4.C6637k;
import z4.t;

/* loaded from: classes.dex */
public class DiscountTourTrainBookingActivity extends DiscountBookingActivity {

    /* renamed from: p, reason: collision with root package name */
    private TourTrainInfoDao.SeatInfos f27602p;

    /* renamed from: q, reason: collision with root package name */
    private b f27603q;

    private void B0() {
        this.f27602p = (TourTrainInfoDao.SeatInfos) getIntent().getSerializableExtra("TOUR_TRAIN_DATA");
    }

    private void D0() {
        Q0();
        N0();
        O0();
        R0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K0(Bundle bundle, int i8, String str) {
        this.f27598o.setEnabled(bundle.getInt("TOTAL_PERSON_COUNT") > 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L0() throws Resources.NotFoundException {
        StationNameData stationNameData = new StationNameData();
        stationNameData.setDepartureStationName(this.f27594k.getArrivalStationNm());
        stationNameData.setArrivalStationName(this.f27594k.getStartStationNm());
        onChangeStation(stationNameData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M0(p pVar, r rVar) {
        ((k) this.f27596m).init(rVar, this.f27602p);
        t.d("specialRoom = " + rVar);
        if (rVar == null || !rVar.equals(r.ONDOL)) {
            return;
        }
        t.d("getCode = " + rVar.getCode() + "getName = " + rVar.getName());
        C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.fare_price_info)).setContent(getString(AbstractC5959j.seat_select_ondol_room_seat)).showDialog();
    }

    private void N0() {
        String[] trainDateListByJobDvCode = C6631e.getTrainDateListByJobDvCode(getIntent().getStringExtra("JOB_DV"));
        a aVar = new a(this);
        this.f27595l = aVar;
        this.f27592i.addView(aVar);
        this.f27595l.setHeaderSummary(getString(AbstractC5959j.common_departure_date));
        this.f27595l.setDate(trainDateListByJobDvCode);
    }

    private void O0() {
        k kVar = new k(this, null, this.f27602p);
        this.f27596m = kVar;
        this.f27592i.addView(kVar);
        this.f27596m.setOnChangePersonInfoListener(new c.a() { // from class: N4.f
            @Override // T4.c.a
            public final void onChangePersonInfo(Bundle bundle, int i8, String str) {
                this.f3240a.K0(bundle, i8, str);
            }
        });
    }

    private void P0() {
        if (C6630d.isNotNull(this.f27596m)) {
            this.f27596m.setGuideDogView(h.getInstance().isCustLeadFlg());
        }
    }

    private void Q0() {
        V4.b bVar = new V4.b(this);
        this.f27594k = bVar;
        this.f27592i.addView(bVar);
        String[] strArr = {getIntent().getStringExtra("START_STN"), getIntent().getStringExtra("ARRIVAL_STN")};
        this.f27594k.setStationInfo(strArr[0], strArr[1], 0, 8);
        this.f27594k.setOnReverseStationsListener(new b.a() { // from class: N4.g
            @Override // V4.b.a
            public final void onReverseStation() throws Resources.NotFoundException {
                this.f3241a.L0();
            }
        });
    }

    private void R0() {
        U4.b bVar = new U4.b(this, p.DEFAULT.getCode(), this.f27602p);
        this.f27603q = bVar;
        this.f27592i.addView(bVar);
        this.f27603q.setSeatTypeOptionListener(new b.a() { // from class: N4.h
            @Override // U4.b.a
            public final void onSeatTypeOptionSelected(p pVar, r rVar) {
                this.f3242a.M0(pVar, rVar);
            }
        });
    }

    private void setText() {
        setAppTitle(getIntent().getStringExtra("TITLE_NAME"));
    }

    protected RsvInquiryRequest[] I0(String str, CalendarData calendarData) {
        TrainInquiryRequest[] trainInquiryRequestArr = {new TrainInquiryRequest()};
        B4.b.getRsvInquiryRequest(getApplicationContext(), trainInquiryRequestArr, this.f27594k, this.f27595l, null, this.f27596m, str, calendarData, "11", this.f27603q.getSeatOption());
        trainInquiryRequestArr[0].setTxtJobDv(getIntent().getStringExtra("JOB_DV"));
        trainInquiryRequestArr[0].setSelGoTrain(TicketSelfCheckinStatusActivity.CHECKIN_STATUS_NOT_USE);
        trainInquiryRequestArr[0].setTxtTrnGpCd(getIntent().getStringExtra("TRN_GP_CD"));
        t.d("JobDv = " + getIntent().getStringExtra("JOB_DV") + ", TrainGroupType = " + getIntent().getStringExtra("TRN_GP_CD"));
        t.d("============================================================");
        return trainInquiryRequestArr;
    }

    protected ReservationRequest J0() {
        return D4.a.getOReservationRequest("11", this.f27603q.getSeatOption(), this.f27596m);
    }

    @Override // com.korail.talk.ui.booking.discountBooking.goods.DiscountBookingActivity, com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        if (C6630d.isNull(bundle)) {
            B0();
            D0();
            setText();
            C0();
        }
    }

    @Override // com.korail.talk.ui.booking.discountBooking.goods.DiscountBookingActivity, com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, android.app.Activity
    public void onResume() throws Resources.NotFoundException {
        P0();
        super.onResume();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.korail.talk.network.request.inquiry.RsvInquiryRequest[], java.io.Serializable] */
    @Override // com.korail.talk.ui.booking.discountBooking.goods.DiscountBookingActivity
    protected void x0(String str, CalendarData calendarData, Bundle bundle) {
        Context applicationContext = getApplicationContext();
        d dVar = d.DIRECT_SQ_NO;
        Intent intent = new Intent(applicationContext, (Class<?>) (dVar.getCode().equals(str) ? DirectInquiryActivity.class : TransferInquiryActivity.class));
        intent.putExtra("IS_DIRECT", dVar.getCode().equals(str));
        intent.putExtra("IS_TRANSFER", true);
        intent.putExtra("RESERVATION_TYPE", r4.c.RSV_DEFAULT);
        intent.putExtra("MENU_TYPE", EnumC6175b.TOUR_TRAIN);
        intent.putExtra("TRAIN_GROUP_CODE", s.SAEMAUL.getCode());
        intent.putExtra("INQUIRY_REQUEST", (Serializable) I0(str, calendarData));
        intent.putExtra("RESERVATION_REQUEST", J0());
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
