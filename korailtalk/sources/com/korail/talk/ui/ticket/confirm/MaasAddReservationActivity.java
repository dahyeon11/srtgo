package com.korail.talk.ui.ticket.confirm;

import I4.c;
import I4.h;
import P4.C0693k;
import Q7.X;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.common.MaasMenuListDao;
import com.korail.talk.network.dao.common.MaasMenuListDao.MaasMenuRequest;
import com.korail.talk.ui.booking.mainBooking.MaasMainCalendarActivity;
import com.korail.talk.ui.booking.mainBooking.MainBookingActivity;
import com.korail.talk.ui.web.IntegrationWebViewActivity;
import com.korail.talk.view.base.BaseViewActivity;
import java.lang.reflect.InvocationTargetException;
import java.util.Calendar;
import java.util.List;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import z4.C6630d;
import z4.C6634h;
import z4.N;
import z4.t;

/* loaded from: classes.dex */
public class MaasAddReservationActivity extends BaseViewActivity {

    /* renamed from: i, reason: collision with root package name */
    private c f28966i;

    /* renamed from: j, reason: collision with root package name */
    private Calendar f28967j;

    /* renamed from: k, reason: collision with root package name */
    private String f28968k;

    /* renamed from: l, reason: collision with root package name */
    private Calendar f28969l;

    /* renamed from: m, reason: collision with root package name */
    private MaasMenuListDao.Menu f28970m;

    /* renamed from: n, reason: collision with root package name */
    protected View[] f28971n;

    /* renamed from: o, reason: collision with root package name */
    private GridView f28972o;

    /* renamed from: p, reason: collision with root package name */
    private C0693k f28973p;

    /* renamed from: q, reason: collision with root package name */
    private String f28974q = "";

    private void setLocationManager() {
        c cVar = new c();
        this.f28966i = cVar;
        cVar.requestLocationUpdates(getApplicationContext());
    }

    private void setText() {
        setAppTitle(AbstractC5959j.title_maas_add_reservation);
    }

    private void u0() {
        MaasMenuListDao maasMenuListDao = new MaasMenuListDao();
        MaasMenuListDao.MaasMenuRequest maasMenuRequest = maasMenuListDao.new MaasMenuRequest();
        maasMenuRequest.setAddSrvReqNo(this.f28974q);
        maasMenuListDao.setRequest(maasMenuRequest);
        executeDao(maasMenuListDao);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ void v0(android.widget.AdapterView r1, android.view.View r2, int r3, long r4) {
        /*
            r0 = this;
            P4.k r1 = r0.f28973p
            com.korail.talk.network.dao.common.MaasMenuListDao$Menu r1 = r1.getItem(r3)
            r0.f28970m = r1
            I4.c r1 = r0.f28966i
            boolean r1 = z4.C6630d.isNotNull(r1)
            if (r1 == 0) goto L2d
            I4.c r1 = r0.f28966i
            android.location.Location r1 = r1.getLastKnownLocation()
            boolean r2 = z4.C6630d.isNotNull(r1)
            if (r2 == 0) goto L2d
            double r2 = r1.getLatitude()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            double r3 = r1.getLongitude()
            java.lang.String r1 = java.lang.String.valueOf(r3)
            goto L30
        L2d:
            java.lang.String r2 = ""
            r1 = r2
        L30:
            android.app.Activity r3 = r0.K()
            com.korail.talk.network.dao.common.MaasMenuListDao$Menu r4 = r0.f28970m
            z4.w.moveToMaasService(r3, r4, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.korail.talk.ui.ticket.confirm.MaasAddReservationActivity.v0(android.widget.AdapterView, android.view.View, int, long):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w0(View view) {
        Intent intent = new Intent(getApplicationContext(), (Class<?>) MainBookingActivity.class);
        intent.addFlags(603979776);
        startActivity(intent);
    }

    private void x0() {
        setLocationManager();
    }

    private void y0() {
        this.f28972o.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: f6.c
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i8, long j8) {
                this.f31220a.v0(adapterView, view, i8, j8);
            }
        });
        findViewById(AbstractC5955f.tv_move_main_booking).setOnClickListener(new View.OnClickListener() { // from class: f6.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f31221a.w0(view);
            }
        });
    }

    private void z0() {
        n0(false);
        this.f28971n = new View[5];
        this.f28972o = (GridView) findViewById(AbstractC5955f.gridview_maas_menu);
        C0693k c0693k = new C0693k();
        this.f28973p = c0693k;
        this.f28972o.setAdapter((ListAdapter) c0693k);
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i8, int i9, Intent intent) {
        String stringExtra;
        super.onActivityResult(i8, i9, intent);
        t.d("requestCode : " + i8);
        if (i9 == -1) {
            if (135 == i8) {
                this.f28968k = intent.getStringExtra("MAAS_STATION_CODE");
                t.d("mSelectedStationCode : " + this.f28968k);
                Intent intent2 = new Intent(getApplicationContext(), (Class<?>) MaasMainCalendarActivity.class);
                intent2.putExtra("MAAS_TITLE", this.f28970m.getName() + X.SPACE + getString(AbstractC5959j.maas_title_calendar));
                intent2.putExtra("MAAS_CALENDAR", true);
                String stringExtra2 = intent.getStringExtra("MAAS_RENTCAR_UI");
                if (stringExtra2 != null && (stringExtra2.equals("M30") || stringExtra2.equals("M10"))) {
                    intent2.putExtra("MAAS_RENTCAR_UI", stringExtra2);
                }
                startActivityForResult(intent2, 137);
                return;
            }
            if (137 != i8) {
                if (138 == i8) {
                    Intent intent3 = new Intent(getApplicationContext(), (Class<?>) MaasMainCalendarActivity.class);
                    intent3.putExtra("MAAS_TITLE", this.f28970m.getName() + X.SPACE + getString(AbstractC5959j.maas_title_calendar));
                    intent3.putExtra("MAAS_CALENDAR", true);
                    if (intent.hasExtra("MAAS_RESELECT_DATE_CODE") && (stringExtra = intent.getStringExtra("MAAS_RESELECT_DATE_CODE")) != null && !stringExtra.isEmpty()) {
                        intent3.putExtra("MAAS_RESELECT_DATE_CODE", stringExtra);
                        if (stringExtra.equals("MAAS_SERVICE_RENTCAR_RENT_DATE")) {
                            if (C6630d.isNotNull(this.f28967j)) {
                                intent3.putExtra("MAAS_ALREADY_CALENDAR", (Calendar) this.f28967j.clone());
                            }
                        } else if (stringExtra.equals("MAAS_SERVICE_RENTCAR_RETURN_DATE")) {
                            if (C6630d.isNotNull(this.f28967j)) {
                                intent3.putExtra("MAAS_ALREADY_CALENDAR", (Calendar) this.f28967j.clone());
                            }
                            if (C6630d.isNotNull(this.f28969l)) {
                                intent3.putExtra("MAAS_ALREADY_CALENDAR_RETURN", (Calendar) this.f28969l.clone());
                            }
                        }
                    }
                    String stringExtra3 = intent.getStringExtra("MAAS_RENTCAR_UI");
                    if (stringExtra3 != null && (stringExtra3.equals("M30") || stringExtra3.equals("M10"))) {
                        intent3.putExtra("MAAS_RENTCAR_UI", stringExtra3);
                    }
                    startActivityForResult(intent3, 137);
                    return;
                }
                return;
            }
            this.f28969l = (Calendar) intent.getSerializableExtra("TICKET_DATE_INFO");
            t.d("date : " + C6634h.getStringFromCalendar(this.f28969l, "yyyyMMdd"));
            Intent intent4 = new Intent(getApplicationContext(), (Class<?>) IntegrationWebViewActivity.class);
            intent4.putExtra("WEB_POST_URL", this.f28970m.getUrl());
            String stringExtra4 = intent.getStringExtra("MAAS_RENTCAR_UI");
            if (stringExtra4 != null && (stringExtra4.equals("M30") || stringExtra4.equals("M10"))) {
                intent4.putExtra("MAAS_RENTCAR_UI", stringExtra4);
            }
            if (intent.getBooleanExtra("INTEGRATION_RENT", false)) {
                this.f28967j = (Calendar) intent.getSerializableExtra("TICKET_DATE_INFO_FROM");
                intent4.putExtra("WEB_POST_PARAMETER", "custNo=" + h.getInstance().getCustNo() + "&mbCrdNo=" + h.getInstance().getMemberNum() + "&strStDt=" + C6634h.getStringFromCalendar(this.f28967j, "yyyyMMddHHmmss") + "&strClsDt=" + C6634h.getStringFromCalendar(this.f28969l, "yyyyMMddHHmmss") + "&stdrStnCd=" + this.f28968k + "&addsrvDvCd=" + this.f28970m.getAddSrvDvCd());
            } else {
                intent4.putExtra("WEB_POST_PARAMETER", "custNo=" + h.getInstance().getCustNo() + "&mbCrdNo=" + h.getInstance().getMemberNum() + "&stdrDt=" + C6634h.getStringFromCalendar(this.f28969l, "yyyyMMdd") + "&stdrStnCd=" + this.f28968k + "&addsrvDvCd=" + this.f28970m.getAddSrvDvCd());
            }
            startActivityForResult(intent4, 138);
        }
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, android.view.View.OnClickListener
    public void onClick(View view) {
        if (AbstractC5955f.btn_left == view.getId()) {
            return;
        }
        super.onClick(view);
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    public void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_maas_add_reservation);
        if (C6630d.isNull(bundle)) {
            if (getIntent().hasExtra("PARAM_MAAS_ADD_SRV_REQ_NO")) {
                this.f28974q = getIntent().getStringExtra("PARAM_MAAS_ADD_SRV_REQ_NO");
            }
            x0();
            z0();
            setText();
            y0();
            u0();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        super.onReceive(iBaseDao);
        if (AbstractC5955f.dao_maas_menu_list == iBaseDao.getId()) {
            List<MaasMenuListDao.Menu> menuList = ((MaasMenuListDao.MaasMenuListResponse) iBaseDao.getResponse()).getMenuList();
            if (!C6630d.isNotNull(menuList) || menuList.size() <= 0) {
                return;
            }
            this.f28973p.setData(menuList);
            double dCeil = Math.ceil(menuList.size() / 4.0d);
            this.f28972o.getLayoutParams().height = N.dpToPx(((int) dCeil) * 85);
            this.f28973p.notifyDataSetChanged();
        }
    }
}
