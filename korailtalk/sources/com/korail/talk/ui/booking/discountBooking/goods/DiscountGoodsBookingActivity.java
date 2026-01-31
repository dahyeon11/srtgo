package com.korail.talk.ui.booking.discountBooking.goods;

import T4.c;
import T4.g;
import V4.b;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import com.korail.talk.data.CalendarData;
import com.korail.talk.data.StationNameData;
import com.korail.talk.network.dao.pass.DiscountMenuDao;
import com.korail.talk.network.request.inquiry.ProductTrainInquiryRequest;
import com.korail.talk.network.request.inquiry.RsvInquiryRequest;
import com.korail.talk.network.request.reservation.ReservationRequest;
import com.korail.talk.ui.booking.option.date.a;
import com.korail.talk.ui.inquiry.rir.orr.DirectInquiryActivity;
import com.korail.talk.ui.inquiry.rir.orr.TransferInquiryActivity;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import n4.AbstractC5959j;
import r4.EnumC6175b;
import r4.d;
import r4.p;
import z4.C6630d;
import z4.C6631e;
import z4.C6637k;
import z4.M;
import z4.N;
import z4.t;

/* loaded from: classes.dex */
public class DiscountGoodsBookingActivity extends DiscountBookingActivity {

    /* renamed from: p, reason: collision with root package name */
    private DiscountMenuDao.DiscountMenu f27600p;

    /* renamed from: q, reason: collision with root package name */
    private String f27601q;

    private void B0() {
        this.f27600p = (DiscountMenuDao.DiscountMenu) getIntent().getSerializableExtra("DISCOUNT_MENU_DATA");
        this.f27601q = L0();
    }

    private void D0() {
        U0();
        S0();
        T0();
    }

    private int I0() {
        return this.f27600p.getAfterDay();
    }

    private String J0() {
        return this.f27600p.getTitle();
    }

    private DiscountMenuDao.GoodInfo K0() {
        return this.f27600p.getGoodsData();
    }

    private String L0() {
        return K0().getH_cnd_flg_disc_no();
    }

    private boolean O0() {
        return "Y".equals(K0().getPsg_infos().getH_chtn_allw_flg());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P0(Bundle bundle, int i8, String str) {
        this.f27598o.setEnabled(bundle.getInt("TOTAL_PERSON_COUNT") > 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q0() throws Resources.NotFoundException {
        StationNameData stationNameData = new StationNameData();
        stationNameData.setDepartureStationName(this.f27594k.getArrivalStationNm());
        stationNameData.setArrivalStationName(this.f27594k.getStartStationNm());
        onChangeStation(stationNameData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R0(DialogInterface dialogInterface, int i8) {
        if (100 == i8) {
            finish();
        }
    }

    private void S0() {
        String[] normalDateStrArray = C6631e.getNormalDateStrArray(I0());
        a aVar = new a(this);
        this.f27595l = aVar;
        this.f27592i.addView(aVar);
        this.f27595l.setHeaderSummary(getString(AbstractC5959j.common_departure_date));
        this.f27595l.setDate(normalDateStrArray);
    }

    private void T0() {
        g gVar = new g(this, K0());
        this.f27596m = gVar;
        this.f27592i.addView(gVar);
        this.f27596m.setOnChangePersonInfoListener(new c.a() { // from class: N4.c
            @Override // T4.c.a
            public final void onChangePersonInfo(Bundle bundle, int i8, String str) {
                this.f3237a.P0(bundle, i8, str);
            }
        });
    }

    private void U0() {
        b bVar = new b(this);
        this.f27594k = bVar;
        this.f27592i.addView(bVar);
        String[] stationNm = M.getStationNm();
        this.f27594k.setStationInfo(N.isNotNull(this.f27600p.getRepSegDpt()) ? this.f27600p.getRepSegDpt() : stationNm[0], N.isNotNull(this.f27600p.getRepSegArv()) ? this.f27600p.getRepSegArv() : stationNm[1], 0, 8);
        this.f27594k.setOnReverseStationsListener(new b.a() { // from class: N4.e
            @Override // V4.b.a
            public final void onReverseStation() throws Resources.NotFoundException {
                this.f3239a.Q0();
            }
        });
    }

    private void V0() {
        String agree = this.f27600p.getAgree();
        if (N.isNotNull(agree)) {
            C6637k.getCDialog(K(), 1002, 0, getString(AbstractC5959j.dialog_title_agree)).setContent(agree).setButtonListener(new DialogInterface.OnClickListener() { // from class: N4.d
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    this.f3238a.R0(dialogInterface, i8);
                }
            }).showDialog();
        }
    }

    protected RsvInquiryRequest[] M0(String str, CalendarData calendarData) {
        ProductTrainInquiryRequest[] productTrainInquiryRequestArr = {new ProductTrainInquiryRequest()};
        B4.b.getRsvInquiryRequest(getApplicationContext(), productTrainInquiryRequestArr, this.f27594k, this.f27595l, null, this.f27596m, str, calendarData, "41", p.DEFAULT.getCode());
        productTrainInquiryRequestArr[0].setTxtGdNo(this.f27601q);
        t.d("TxtGdNo = " + this.f27601q);
        return productTrainInquiryRequestArr;
    }

    protected ReservationRequest N0() {
        return D4.a.getOReservationRequest("41", p.DEFAULT.getCode(), this.f27601q, this.f27596m);
    }

    @Override // com.korail.talk.ui.booking.discountBooking.goods.DiscountBookingActivity, com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        if (C6630d.isNull(bundle)) {
            B0();
            D0();
            setText();
            C0();
            V0();
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
        intent.putExtra("IS_TRANSFER", O0());
        intent.putExtra("RESERVATION_TYPE", r4.c.RSV_DEFAULT);
        intent.putExtra("MENU_TYPE", EnumC6175b.THEME_DISCOUNT);
        intent.putExtra("INQUIRY_REQUEST", (Serializable) M0(str, calendarData));
        intent.putExtra("RESERVATION_REQUEST", N0());
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
