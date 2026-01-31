package com.korail.talk.ui.ticket.service;

import I4.c;
import I4.h;
import P4.C0693k;
import Q7.X;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.common.MaasMenuListDao;
import com.korail.talk.network.dao.common.MaasMenuListDao.MaasMenuRequest;
import com.korail.talk.ui.booking.mainBooking.MaasMainCalendarActivity;
import com.korail.talk.ui.web.IntegrationWebViewActivity;
import com.korail.talk.view.CTextView;
import com.korail.talk.view.base.BaseViewActivity;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
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
public class AdditionalServiceActivity extends BaseViewActivity {

    /* renamed from: A, reason: collision with root package name */
    private GridView f29158A;

    /* renamed from: B, reason: collision with root package name */
    private C0693k f29159B;

    /* renamed from: C, reason: collision with root package name */
    CTextView f29160C;

    /* renamed from: D, reason: collision with root package name */
    CTextView f29161D;

    /* renamed from: E, reason: collision with root package name */
    CTextView f29162E;

    /* renamed from: F, reason: collision with root package name */
    CTextView f29163F;

    /* renamed from: G, reason: collision with root package name */
    CTextView f29164G;

    /* renamed from: H, reason: collision with root package name */
    CTextView f29165H;

    /* renamed from: I, reason: collision with root package name */
    CTextView f29166I;

    /* renamed from: J, reason: collision with root package name */
    CTextView f29167J;

    /* renamed from: K, reason: collision with root package name */
    CTextView f29168K;

    /* renamed from: L, reason: collision with root package name */
    CTextView f29169L;

    /* renamed from: M, reason: collision with root package name */
    CTextView f29170M;

    /* renamed from: N, reason: collision with root package name */
    View f29171N;

    /* renamed from: O, reason: collision with root package name */
    String f29172O;

    /* renamed from: P, reason: collision with root package name */
    String f29173P;

    /* renamed from: Q, reason: collision with root package name */
    String f29174Q;

    /* renamed from: R, reason: collision with root package name */
    String f29175R;

    /* renamed from: S, reason: collision with root package name */
    String f29176S;

    /* renamed from: T, reason: collision with root package name */
    String f29177T;

    /* renamed from: U, reason: collision with root package name */
    String f29178U;

    /* renamed from: i, reason: collision with root package name */
    String f29179i;

    /* renamed from: j, reason: collision with root package name */
    String f29180j;

    /* renamed from: k, reason: collision with root package name */
    String f29181k;

    /* renamed from: l, reason: collision with root package name */
    String f29182l;

    /* renamed from: m, reason: collision with root package name */
    String f29183m;

    /* renamed from: n, reason: collision with root package name */
    String f29184n;

    /* renamed from: o, reason: collision with root package name */
    String f29185o;

    /* renamed from: p, reason: collision with root package name */
    String f29186p;

    /* renamed from: q, reason: collision with root package name */
    String f29187q;

    /* renamed from: r, reason: collision with root package name */
    String f29188r;

    /* renamed from: s, reason: collision with root package name */
    protected View f29189s;

    /* renamed from: t, reason: collision with root package name */
    protected View f29190t;

    /* renamed from: u, reason: collision with root package name */
    private Calendar f29191u;

    /* renamed from: v, reason: collision with root package name */
    private c f29192v;

    /* renamed from: w, reason: collision with root package name */
    private String f29193w;

    /* renamed from: x, reason: collision with root package name */
    private Calendar f29194x;

    /* renamed from: y, reason: collision with root package name */
    private MaasMenuListDao.Menu f29195y;

    /* renamed from: z, reason: collision with root package name */
    protected View[] f29196z;

    private void setLocationManager() {
        c cVar = new c();
        this.f29192v = cVar;
        cVar.requestLocationUpdates(getApplicationContext());
    }

    private void t0() {
        MaasMenuListDao maasMenuListDao = new MaasMenuListDao();
        MaasMenuListDao.MaasMenuRequest maasMenuRequest = maasMenuListDao.new MaasMenuRequest();
        maasMenuRequest.setPnrNo(this.f29187q);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(this.f29188r);
        maasMenuRequest.setTkRetNo(arrayList);
        maasMenuListDao.setRequest(maasMenuRequest);
        executeDao(maasMenuListDao);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ void u0(android.widget.AdapterView r1, android.view.View r2, int r3, long r4) {
        /*
            r0 = this;
            P4.k r1 = r0.f29159B
            com.korail.talk.network.dao.common.MaasMenuListDao$Menu r1 = r1.getItem(r3)
            r0.f29195y = r1
            I4.c r1 = r0.f29192v
            boolean r1 = z4.C6630d.isNotNull(r1)
            if (r1 == 0) goto L2d
            I4.c r1 = r0.f29192v
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
            com.korail.talk.network.dao.common.MaasMenuListDao$Menu r4 = r0.f29195y
            z4.w.moveToMaasService(r3, r4, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.korail.talk.ui.ticket.service.AdditionalServiceActivity.u0(android.widget.AdapterView, android.view.View, int, long):void");
    }

    private void w0() {
        Intent intent = getIntent();
        t.d("reavelv " + intent.getStringExtra("keylist"));
        this.f29179i = intent.getStringExtra("DEPARTURE_DATE");
        this.f29180j = intent.getStringExtra("DEPARTURE_TIME").replace(":", "");
        this.f29181k = C6634h.convertFormat(this.f29179i + this.f29180j, "yyyyMMddHHmm", "yyyy년 MM월 dd일 (E) HH:mm");
        this.f29182l = intent.getStringExtra("ARRIVAL_DATE");
        this.f29183m = intent.getStringExtra("ARRIVAL_TIME").replace(":", "");
        this.f29184n = C6634h.convertFormat(this.f29182l + this.f29183m, "yyyyMMddHHmm", "yyyy년 MM월 dd일 (E) HH:mm");
        this.f29185o = intent.getStringExtra("DEPARTURE_STATION_NAME");
        this.f29186p = intent.getStringExtra("ARRIVAL_STATION_NAME");
        this.f29187q = intent.getStringExtra("TICKET_PNR");
        this.f29188r = intent.getStringExtra("RETURN_NO");
        setLocationManager();
    }

    private void x0() {
        setContentView(AbstractC5957h.activity_maas_addional_service_full_layout);
        n0(true);
        setAppTitle(AbstractC5959j.maas_service_add);
        this.f29189s = findViewById(AbstractC5955f.maas_additional_service_start_station_layout);
        this.f29190t = findViewById(AbstractC5955f.maas_additional_service_end_station_layout);
        this.f29160C = (CTextView) this.f29189s.findViewById(AbstractC5955f.maas_additional_service_time_textview);
        this.f29161D = (CTextView) this.f29189s.findViewById(AbstractC5955f.maas_additional_service_station_textview);
        this.f29162E = (CTextView) this.f29189s.findViewById(AbstractC5955f.maas_additional_service_station_parking_textview);
        this.f29163F = (CTextView) this.f29189s.findViewById(AbstractC5955f.maas_additional_service_traffic_info_textview);
        this.f29164G = (CTextView) this.f29189s.findViewById(AbstractC5955f.maas_additional_service_elevator_textview);
        this.f29165H = (CTextView) this.f29190t.findViewById(AbstractC5955f.maas_additional_service_time_textview);
        this.f29166I = (CTextView) this.f29190t.findViewById(AbstractC5955f.maas_additional_service_station_textview);
        this.f29167J = (CTextView) this.f29190t.findViewById(AbstractC5955f.maas_additional_service_station_parking_textview);
        this.f29168K = (CTextView) this.f29190t.findViewById(AbstractC5955f.maas_additional_service_traffic_info_textview);
        this.f29169L = (CTextView) this.f29190t.findViewById(AbstractC5955f.maas_additional_service_elevator_textview);
        this.f29171N = this.f29190t.findViewById(AbstractC5955f.maas_additional_service_robot_view);
        this.f29170M = (CTextView) this.f29190t.findViewById(AbstractC5955f.maas_additional_service_robot_textview);
        this.f29160C.setText(this.f29181k);
        this.f29161D.setText("[출발] " + this.f29185o);
        this.f29165H.setText(this.f29184n);
        this.f29166I.setText("[도착] " + this.f29186p);
        this.f29163F.setText("역안내");
        this.f29196z = new View[5];
        this.f29158A = (GridView) findViewById(AbstractC5955f.gridview_maas_menu);
        C0693k c0693k = new C0693k();
        this.f29159B = c0693k;
        this.f29158A.setAdapter((ListAdapter) c0693k);
        this.f29158A.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: k6.a
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i8, long j8) {
                this.f33659a.u0(adapterView, view, i8, j8);
            }
        });
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i8, int i9, Intent intent) {
        String stringExtra;
        super.onActivityResult(i8, i9, intent);
        t.d("requestCode : " + i8);
        if (i9 == -1) {
            if (135 == i8) {
                this.f29193w = intent.getStringExtra("MAAS_STATION_CODE");
                t.d("mSelectedStationCode : " + this.f29193w);
                Intent intent2 = new Intent(getApplicationContext(), (Class<?>) MaasMainCalendarActivity.class);
                intent2.putExtra("MAAS_TITLE", this.f29195y.getName() + X.SPACE + getString(AbstractC5959j.maas_title_calendar));
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
                    intent3.putExtra("MAAS_TITLE", this.f29195y.getName() + X.SPACE + getString(AbstractC5959j.maas_title_calendar));
                    intent3.putExtra("MAAS_CALENDAR", true);
                    if (intent.hasExtra("MAAS_RESELECT_DATE_CODE") && (stringExtra = intent.getStringExtra("MAAS_RESELECT_DATE_CODE")) != null && !stringExtra.isEmpty()) {
                        intent3.putExtra("MAAS_RESELECT_DATE_CODE", stringExtra);
                        if (stringExtra.equals("MAAS_SERVICE_RENTCAR_RENT_DATE")) {
                            if (C6630d.isNotNull(this.f29191u)) {
                                intent3.putExtra("MAAS_ALREADY_CALENDAR", (Calendar) this.f29191u.clone());
                            }
                        } else if (stringExtra.equals("MAAS_SERVICE_RENTCAR_RETURN_DATE")) {
                            if (C6630d.isNotNull(this.f29191u)) {
                                intent3.putExtra("MAAS_ALREADY_CALENDAR", (Calendar) this.f29191u.clone());
                            }
                            if (C6630d.isNotNull(this.f29194x)) {
                                intent3.putExtra("MAAS_ALREADY_CALENDAR_RETURN", (Calendar) this.f29194x.clone());
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
            this.f29194x = (Calendar) intent.getSerializableExtra("TICKET_DATE_INFO");
            t.d("date : " + C6634h.getStringFromCalendar(this.f29194x, "yyyyMMdd"));
            Intent intent4 = new Intent(getApplicationContext(), (Class<?>) IntegrationWebViewActivity.class);
            intent4.putExtra("WEB_POST_URL", this.f29195y.getUrl());
            String stringExtra4 = intent.getStringExtra("MAAS_RENTCAR_UI");
            if (stringExtra4 != null && (stringExtra4.equals("M30") || stringExtra4.equals("M10"))) {
                intent4.putExtra("MAAS_RENTCAR_UI", stringExtra4);
            }
            if (intent.getBooleanExtra("INTEGRATION_RENT", false)) {
                this.f29191u = (Calendar) intent.getSerializableExtra("TICKET_DATE_INFO_FROM");
                intent4.putExtra("WEB_POST_PARAMETER", "custNo=" + h.getInstance().getCustNo() + "&mbCrdNo=" + h.getInstance().getMemberNum() + "&strStDt=" + C6634h.getStringFromCalendar(this.f29191u, "yyyyMMddHHmmss") + "&strClsDt=" + C6634h.getStringFromCalendar(this.f29194x, "yyyyMMddHHmmss") + "&stdrStnCd=" + this.f29193w + "&addsrvDvCd=" + this.f29195y.getAddSrvDvCd());
            } else {
                intent4.putExtra("WEB_POST_PARAMETER", "custNo=" + h.getInstance().getCustNo() + "&mbCrdNo=" + h.getInstance().getMemberNum() + "&stdrDt=" + C6634h.getStringFromCalendar(this.f29194x, "yyyyMMdd") + "&stdrStnCd=" + this.f29193w + "&addsrvDvCd=" + this.f29195y.getAddSrvDvCd());
            }
            startActivityForResult(intent4, 138);
        }
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, android.view.View.OnClickListener
    public void onClick(View view) {
        super.onClick(view);
        if (view == null || view.getTag() == null) {
            return;
        }
        String string = view.getTag().toString();
        t.d("reavelv url = " + string);
        if (TextUtils.isEmpty(string)) {
            return;
        }
        if (string.contains("korailtalk://stnLeadNavi") && C6630d.isShouldOverrideUrlLoading(this, string)) {
            return;
        }
        v0(string);
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    public void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        if (C6630d.isNull(bundle)) {
            w0();
            x0();
            t0();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        super.onReceive(iBaseDao);
        if (AbstractC5955f.dao_maas_menu_list == iBaseDao.getId()) {
            MaasMenuListDao.MaasMenuListResponse maasMenuListResponse = (MaasMenuListDao.MaasMenuListResponse) iBaseDao.getResponse();
            List<MaasMenuListDao.Menu> menuList = maasMenuListResponse.getMenuList();
            if (C6630d.isNotNull(menuList) && menuList.size() > 0) {
                this.f29159B.setData(menuList);
                double dCeil = Math.ceil(menuList.size() / 4.0d);
                this.f29158A.getLayoutParams().height = N.dpToPx(((int) dCeil) * 85);
                this.f29159B.notifyDataSetChanged();
            }
            this.f29174Q = maasMenuListResponse.getdElevatorUrl();
            this.f29172O = maasMenuListResponse.getdLeadNaviUrl();
            this.f29173P = maasMenuListResponse.getdParkingLotUrl();
            this.f29176S = maasMenuListResponse.getaElevatorUrl();
            this.f29178U = maasMenuListResponse.getaBisInfoUrl();
            this.f29175R = maasMenuListResponse.getaParkingLotUrl();
            this.f29177T = maasMenuListResponse.getaBggTrsfRbtUrl();
            if (!TextUtils.isEmpty(this.f29174Q)) {
                this.f29164G.setEnabled(true);
                this.f29164G.setTag(this.f29174Q);
                this.f29164G.setOnClickListener(this);
            }
            if (!TextUtils.isEmpty(this.f29172O)) {
                this.f29163F.setEnabled(true);
                this.f29163F.setTag(this.f29172O);
                this.f29163F.setOnClickListener(this);
            }
            if (!TextUtils.isEmpty(this.f29173P)) {
                this.f29162E.setEnabled(true);
                this.f29162E.setTag(this.f29173P);
                this.f29162E.setOnClickListener(this);
            }
            if (!TextUtils.isEmpty(this.f29176S)) {
                this.f29169L.setEnabled(true);
                this.f29169L.setTag(this.f29176S);
                this.f29169L.setOnClickListener(this);
            }
            if (!TextUtils.isEmpty(this.f29178U)) {
                this.f29168K.setEnabled(true);
                this.f29168K.setTag(this.f29178U);
                this.f29168K.setOnClickListener(this);
            }
            if (!TextUtils.isEmpty(this.f29175R)) {
                this.f29167J.setEnabled(true);
                this.f29167J.setTag(this.f29175R);
                this.f29167J.setOnClickListener(this);
            }
            if (TextUtils.isEmpty(this.f29177T)) {
                return;
            }
            this.f29171N.setVisibility(0);
            this.f29170M.setEnabled(true);
            this.f29170M.setTag(this.f29177T);
            this.f29170M.setOnClickListener(this);
        }
    }

    void v0(String str) {
        Intent intent = new Intent(getApplicationContext(), (Class<?>) IntegrationWebViewActivity.class);
        intent.putExtra("WEB_POST_URL", str);
        intent.putExtra("IS_CLOSE_VIEW", true);
        startActivity(intent);
    }
}
