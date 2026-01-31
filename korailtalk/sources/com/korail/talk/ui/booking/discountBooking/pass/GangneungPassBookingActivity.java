package com.korail.talk.ui.booking.discountBooking.pass;

import R4.b;
import T4.c;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.pass.DiscountMenuDao;
import com.korail.talk.network.dao.pass.EnableDateDao;
import com.korail.talk.network.dao.pass.EnableDateDao.EnableDateRequest;
import com.korail.talk.network.dao.pass.PassPaymentDao;
import com.korail.talk.network.dao.pass.PassPaymentDao.PassPaymentRequest;
import com.korail.talk.network.dao.pass.PassReservationDao;
import com.korail.talk.network.dao.pass.PassReservationDao.PassReservationRequest;
import com.korail.talk.ui.booking.option.date.a;
import com.korail.talk.ui.payment.PaymentActivity;
import com.korail.talk.view.base.BaseViewActivity;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import r4.i;
import v4.g;
import y6.C6550j;
import z4.C6625A;
import z4.C6630d;
import z4.C6634h;
import z4.C6637k;
import z4.N;
import z4.q;
import z4.t;

/* loaded from: classes.dex */
public class GangneungPassBookingActivity extends BaseViewActivity implements g, b.a {

    /* renamed from: i, reason: collision with root package name */
    private DiscountMenuDao.DiscountMenu f27622i;

    /* renamed from: j, reason: collision with root package name */
    private String f27623j;

    /* renamed from: k, reason: collision with root package name */
    private String f27624k;

    /* renamed from: l, reason: collision with root package name */
    private ViewGroup f27625l;

    /* renamed from: m, reason: collision with root package name */
    private ScrollView f27626m;

    /* renamed from: n, reason: collision with root package name */
    private T4.g f27627n;

    /* renamed from: o, reason: collision with root package name */
    private b f27628o;

    /* renamed from: p, reason: collision with root package name */
    private a f27629p;

    /* renamed from: q, reason: collision with root package name */
    private Button f27630q;

    private void A0() {
        EnableDateDao enableDateDao = new EnableDateDao();
        EnableDateDao.EnableDateRequest enableDateRequest = enableDateDao.new EnableDateRequest();
        enableDateRequest.setTxtCmtrKndCd(G0());
        enableDateRequest.setTxtCmtrUtlTrmCd(this.f27623j);
        enableDateRequest.setTxtCmtrUtlAgeCd(this.f27624k);
        enableDateDao.setRequest(enableDateRequest);
        enableDateDao.setFinishView(true);
        executeDao(enableDateDao);
    }

    private void B0() {
        PassReservationDao passReservationDao = new PassReservationDao();
        PassReservationDao.PassReservationRequest passReservationRequest = passReservationDao.new PassReservationRequest();
        passReservationRequest.setHidCmtrKndCd(C0());
        passReservationRequest.setHidCmtrUtlAgeCd(this.f27624k);
        passReservationRequest.setHidCmtrUtlTrmCd(this.f27623j);
        passReservationRequest.setHidUseOpenDt(this.f27629p.getSelectedDay());
        passReservationDao.setRequest(passReservationRequest);
        executeDao(passReservationDao);
    }

    private String C0() {
        Bundle passengerInfo = this.f27627n.getPassengerInfo();
        int i8 = passengerInfo.getInt("ADULT_COUNT");
        int i9 = passengerInfo.getInt("CHILD_COUNT");
        int i10 = i8 == 2 ? 34 : i8 == 3 ? 37 : i8 == 4 ? 39 : 30;
        t.e("cmtrKndCd = " + i10);
        return String.valueOf(N.addZero(4, i10 + i9));
    }

    private List D0() {
        return E0().getPass_ageinfo();
    }

    private DiscountMenuDao.PassMainInfo E0() {
        return this.f27622i.getPassData();
    }

    private List F0() {
        return E0().getPass_periodinfo();
    }

    private String G0() {
        return E0().getH_cmtr_knd_cd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H0(DialogInterface dialogInterface, int i8) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I0() {
        this.f27626m.fullScroll(130);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J0(View view) {
        this.f27626m.smoothScrollTo(0, view.getTop());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K0(int i8) {
        this.f27626m.smoothScrollTo(0, i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L0(int i8) {
        this.f27623j = ((DiscountMenuDao.PassPeriodInfo) F0().get(i8)).getH_cmtr_utl_trm_cd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M0(Bundle bundle, int i8, String str) {
        this.f27628o.setCompanionDetailView(bundle, i8, getString(i8 == 0 ? AbstractC5959j.common_adult : AbstractC5959j.common_child));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N0(DialogInterface dialogInterface, int i8) {
        if (100 == i8) {
            finish();
        } else if (102 == i8) {
            A0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O0(DialogInterface dialogInterface, int i8) {
        if (102 == i8) {
            B0();
        }
    }

    private void P0(PassPaymentDao.PassPaymentRequest passPaymentRequest) {
        Intent intent = new Intent(getApplicationContext(), (Class<?>) PaymentActivity.class);
        intent.putExtra("PAYMENT_TYPE", i.PAYMENT_DEFAULT);
        intent.putExtra("PAYMENT_REQUEST", passPaymentRequest);
        intent.putExtra("IS_POINT_STEP", true);
        intent.putExtra("RECEIVED_AMOUNT", N.getInteger(passPaymentRequest.getH_rcvd_prc()));
        intent.putExtra("DISCOUNT_AMOUNT", 0);
        intent.putExtra("DISABLE_DISCOUNT_POINT", G0().equals("0007"));
        startActivity(intent);
    }

    private void Q0() {
        b bVar = new b(this);
        this.f27628o = bVar;
        bVar.setICompanionView(this);
        this.f27628o.setVisibility(8);
        this.f27625l.addView(this.f27628o);
    }

    private void R0() {
        this.f27622i = (DiscountMenuDao.DiscountMenu) getIntent().getSerializableExtra("DISCOUNT_MENU_DATA");
        this.f27623j = ((DiscountMenuDao.PassPeriodInfo) F0().get(0)).getH_cmtr_utl_trm_cd();
        int age = C6634h.getAge();
        for (DiscountMenuDao.PassAgeInfo passAgeInfo : D0()) {
            if (N.getInteger(passAgeInfo.getH_min_age()) <= age && N.getInteger(passAgeInfo.getH_max_age()) >= age) {
                this.f27624k = passAgeInfo.getH_cmtr_utl_age_cd();
                return;
            }
        }
    }

    private void S0() {
        a aVar = new a(this);
        this.f27629p = aVar;
        this.f27625l.addView(aVar);
        List listF0 = F0();
        String[] strArr = new String[listF0.size()];
        for (int i8 = 0; i8 < listF0.size(); i8++) {
            strArr[i8] = ((DiscountMenuDao.PassPeriodInfo) listF0.get(i8)).getH_comn_cd_nm();
        }
        this.f27629p.setHeaderSummary(getString(AbstractC5959j.comm_pass_warning_use_period));
        this.f27629p.setPass(true);
        this.f27629p.setSelectDateMsg(getString(AbstractC5959j.booking_departure_date));
        this.f27629p.setPassDate(strArr);
        this.f27629p.setOnChangeRadioButtonListener(new a.e() { // from class: O4.m
            @Override // com.korail.talk.ui.booking.option.date.a.e
            public final void onChangeRadioButton(int i9) {
                this.f3439a.L0(i9);
            }
        });
    }

    private void T0() {
        this.f27630q.setOnClickListener(this);
        for (int i8 = 0; i8 < this.f27625l.getChildCount(); i8++) {
            View childAt = this.f27625l.getChildAt(i8);
            if (childAt instanceof C6550j) {
                ((C6550j) childAt).setHeaderClickListener(this);
            }
        }
    }

    private void U0() {
        T4.g gVar;
        c.a aVar;
        try {
            try {
                T4.g gVar2 = new T4.g(this, (DiscountMenuDao.GoodInfo) q.fromJson(N.convertStreamToString(getAssets().open("gangneungPass.text")), DiscountMenuDao.GoodInfo.class));
                this.f27627n = gVar2;
                this.f27625l.addView(gVar2);
                gVar = this.f27627n;
                aVar = new c.a() { // from class: O4.r
                    @Override // T4.c.a
                    public final void onChangePersonInfo(Bundle bundle, int i8, String str) {
                        this.f3446a.M0(bundle, i8, str);
                    }
                };
            } catch (IOException e8) {
                t.e(e8.getMessage());
                this.f27625l.addView(this.f27627n);
                gVar = this.f27627n;
                aVar = new c.a() { // from class: O4.r
                    @Override // T4.c.a
                    public final void onChangePersonInfo(Bundle bundle, int i8, String str) {
                        this.f3446a.M0(bundle, i8, str);
                    }
                };
            }
            gVar.setOnChangePersonInfoListener(aVar);
        } catch (Throwable th) {
            this.f27625l.addView(this.f27627n);
            this.f27627n.setOnChangePersonInfoListener(new c.a() { // from class: O4.r
                @Override // T4.c.a
                public final void onChangePersonInfo(Bundle bundle, int i8, String str) {
                    this.f3446a.M0(bundle, i8, str);
                }
            });
            throw th;
        }
    }

    private void V0() {
        m0();
        this.f27625l = (ViewGroup) findViewById(AbstractC5955f.v_gangneung_pass_booking);
        this.f27626m = (ScrollView) findViewById(AbstractC5955f.sv_gangneung_pass_booking);
        this.f27630q = (Button) findViewById(AbstractC5955f.btn_gangneung_pass_booking_payment);
        U0();
        S0();
        Q0();
    }

    private void W0() {
        String agree = this.f27622i.getAgree();
        if (N.isNull(agree)) {
            A0();
        } else {
            C6637k.getCDialog(K(), 1002, 0, getString(AbstractC5959j.dialog_title)).setContent(agree).setButtonListener(new DialogInterface.OnClickListener() { // from class: O4.k
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    this.f3437a.N0(dialogInterface, i8);
                }
            }).showDialog();
        }
    }

    private void X0() {
        C6637k.getCDialog(K(), 1002, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.dialog_period_notice, this.f27622i.getTitle(), this.f27629p.getSelectedDay("yyyy.MM.dd"))).setButtonListener(new DialogInterface.OnClickListener() { // from class: O4.l
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                this.f3438a.O0(dialogInterface, i8);
            }
        }).showDialog();
    }

    private void setText() {
        setAppTitle(this.f27622i.getTitle());
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, android.view.View.OnClickListener
    public void onClick(View view) {
        if (AbstractC5955f.btn_gangneung_pass_booking_payment != view.getId()) {
            super.onClick(view);
        } else if (this.f27628o.isValid()) {
            X0();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_gangneung_pass_booking);
        if (C6630d.isNull(bundle)) {
            R0();
            V0();
            setText();
            T0();
            W0();
        }
    }

    @Override // v4.g
    public void onOptionHeaderClick(C6550j c6550j, boolean z8) {
        if (C6630d.isNull(c6550j)) {
            return;
        }
        scrollToOption(c6550j);
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        super.onReceive(iBaseDao);
        int id = iBaseDao.getId();
        int i8 = 0;
        if (AbstractC5955f.dao_enable_date == id) {
            List<EnableDateDao.PassInfo> pass_info = ((EnableDateDao.EnableDateResponse) iBaseDao.getResponse()).getPass_info();
            if (C6630d.isNull(pass_info) || pass_info.size() == 0) {
                C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.comm_pass_disable_buy)).setButtonListener(new DialogInterface.OnClickListener() { // from class: O4.n
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i9) {
                        this.f3440a.H0(dialogInterface, i9);
                    }
                }).showDialog();
                return;
            }
            String[] strArr = new String[pass_info.size()];
            while (i8 < pass_info.size()) {
                strArr[i8] = pass_info.get(i8).getH_use_open_dt();
                i8++;
            }
            this.f27629p.setDate(strArr);
            return;
        }
        if (AbstractC5955f.dao_pass_reservation == id) {
            try {
                PassReservationDao.MainInfo main_info = ((PassReservationDao.PassReservationResponse) iBaseDao.getResponse()).getMain_info();
                PassPaymentDao.PassPaymentRequest passPaymentRequest = new PassPaymentDao().new PassPaymentRequest();
                passPaymentRequest.setH_rcvd_prc(main_info.getH_rcvd_amt());
                passPaymentRequest.setPassPaymentMap(C6625A.convertObjectToMap(main_info));
                ArrayList<R4.a> companionData = this.f27628o.getCompanionData();
                if (!companionData.isEmpty()) {
                    HashMap<String, String> map = new HashMap<>();
                    map.put("h_cmpa_cnt", String.valueOf(companionData.size()));
                    while (i8 < companionData.size()) {
                        R4.a aVar = companionData.get(i8);
                        map.put("h_cmpa_nm_" + i8, aVar.getCompanionName());
                        map.put("h_cmpa_btdt_" + i8, aVar.getCompanionBirthDate());
                        map.put("h_cmpa_sex_dv_cd_" + i8, aVar.getGender());
                        i8++;
                    }
                    passPaymentRequest.setHashMap(map);
                }
                P0(passPaymentRequest);
            } catch (Exception e8) {
                t.e(e8.getMessage());
            }
        }
    }

    @Override // R4.b.a
    public void scrollToBottom() {
        this.f27626m.post(new Runnable() { // from class: O4.q
            @Override // java.lang.Runnable
            public final void run() {
                this.f3445a.I0();
            }
        });
    }

    public void scrollToOption(final View view) {
        this.f27626m.post(new Runnable() { // from class: O4.p
            @Override // java.lang.Runnable
            public final void run() {
                this.f3443a.J0(view);
            }
        });
    }

    @Override // R4.b.a
    public void scrollToView(final int i8) {
        this.f27626m.post(new Runnable() { // from class: O4.o
            @Override // java.lang.Runnable
            public final void run() {
                this.f3441a.K0(i8);
            }
        });
    }
}
