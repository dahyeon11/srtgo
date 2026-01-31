package com.korail.talk.ui.ticket.history;

import D1.a;
import F4.C0501b;
import I4.h;
import a6.C0839c;
import a6.InterfaceC0837a;
import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.korail.talk.data.WheelchairData;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.myTicket.TicketListDao;
import com.korail.talk.network.dao.myTicket.TicketListDao.TicketListRequest;
import com.korail.talk.network.dao.refund.TicketDetailDao;
import com.korail.talk.network.dao.refund.TicketDetailDao.TicketDetailRequest;
import com.korail.talk.network.dao.ticket.MaasServiceDetailListDao;
import com.korail.talk.network.dao.ticket.MaasServiceDetailListDao.MaasServivceDetailRequest;
import com.korail.talk.ui.booking.mainBooking.MainBookingActivity;
import com.korail.talk.ui.delivery.DeliveredActivity;
import com.korail.talk.ui.extraproduct.ExtraProductListActivity;
import com.korail.talk.ui.mileage.CompanionMileageDetailActivity;
import com.korail.talk.ui.ticket.receipt.TicketReceiptActivity;
import com.korail.talk.ui.ticket.ticketReturn.LimousineReturnActivity;
import com.korail.talk.ui.ticket.ticketReturn.TicketReturnActivity;
import com.korail.talk.ui.web.ExtraProductWebViewActivity;
import com.korail.talk.ui.web.IntegrationWebViewActivity;
import com.korail.talk.view.base.BaseViewActivity;
import g5.e;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import l4.C5890a;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import o4.C6038a;
import r4.g;
import z4.C6630d;
import z4.C6634h;
import z4.C6637k;
import z4.C6641o;
import z4.N;
import z4.t;

/* loaded from: classes.dex */
public class TicketPurchaseHistoryActivity extends BaseViewActivity implements InterfaceC0837a {

    /* renamed from: A, reason: collision with root package name */
    private TextView f29067A;

    /* renamed from: B, reason: collision with root package name */
    private TextView f29068B;

    /* renamed from: C, reason: collision with root package name */
    private Calendar f29069C;

    /* renamed from: D, reason: collision with root package name */
    private Calendar f29070D;

    /* renamed from: E, reason: collision with root package name */
    private Calendar f29071E;

    /* renamed from: F, reason: collision with root package name */
    private Calendar f29072F;

    /* renamed from: G, reason: collision with root package name */
    private Button f29073G;

    /* renamed from: H, reason: collision with root package name */
    private Button f29074H;

    /* renamed from: r, reason: collision with root package name */
    private int f29086r;

    /* renamed from: s, reason: collision with root package name */
    private int f29087s;

    /* renamed from: t, reason: collision with root package name */
    private List f29088t;

    /* renamed from: u, reason: collision with root package name */
    private List f29089u;

    /* renamed from: v, reason: collision with root package name */
    private ArrayList f29090v;

    /* renamed from: w, reason: collision with root package name */
    private List f29091w;

    /* renamed from: x, reason: collision with root package name */
    private ArrayList f29092x;

    /* renamed from: y, reason: collision with root package name */
    private C0839c f29093y;

    /* renamed from: z, reason: collision with root package name */
    private RecyclerView f29094z;

    /* renamed from: i, reason: collision with root package name */
    private final int f29077i = -12;

    /* renamed from: j, reason: collision with root package name */
    private final int f29078j = 3;

    /* renamed from: k, reason: collision with root package name */
    private final int f29079k = 0;

    /* renamed from: l, reason: collision with root package name */
    private final int f29080l = 1;

    /* renamed from: m, reason: collision with root package name */
    private final int f29081m = 2;

    /* renamed from: n, reason: collision with root package name */
    private final int f29082n = 3;

    /* renamed from: o, reason: collision with root package name */
    private final int f29083o = 4;

    /* renamed from: p, reason: collision with root package name */
    private SimpleDateFormat f29084p = new SimpleDateFormat("yyyyMMdd");

    /* renamed from: q, reason: collision with root package name */
    private SimpleDateFormat f29085q = new SimpleDateFormat("yyyy.MM.dd");

    /* renamed from: I, reason: collision with root package name */
    private DatePickerDialog.OnDateSetListener f29075I = new a();

    /* renamed from: J, reason: collision with root package name */
    private DatePickerDialog.OnDateSetListener f29076J = new b();

    class a implements DatePickerDialog.OnDateSetListener {
        a() {
        }

        @Override // android.app.DatePickerDialog.OnDateSetListener
        public void onDateSet(DatePicker datePicker, int i8, int i9, int i10) {
            TicketPurchaseHistoryActivity.this.f29069C.set(i8, i9, i10);
            TicketPurchaseHistoryActivity.this.f29067A.setText(TicketPurchaseHistoryActivity.this.f29085q.format(TicketPurchaseHistoryActivity.this.f29069C.getTime()));
        }
    }

    class b implements DatePickerDialog.OnDateSetListener {
        b() {
        }

        @Override // android.app.DatePickerDialog.OnDateSetListener
        public void onDateSet(DatePicker datePicker, int i8, int i9, int i10) {
            TicketPurchaseHistoryActivity.this.f29070D.set(i8, i9, i10);
            TicketPurchaseHistoryActivity.this.f29068B.setText(TicketPurchaseHistoryActivity.this.f29085q.format(TicketPurchaseHistoryActivity.this.f29070D.getTime()));
        }
    }

    private class c implements H4.a {
        private c() {
        }

        @Override // H4.a
        public /* bridge */ /* synthetic */ void callTicketKind(TicketDetailDao.TicketDetailResponse ticketDetailResponse) {
            super.callTicketKind(ticketDetailResponse);
        }

        @Override // H4.a
        public void setCommutationTicket(int i8) {
            TicketPurchaseHistoryActivity.this.f29092x.add(C0501b.getCommutationData((TicketListDao.ReservationList) TicketPurchaseHistoryActivity.this.f29088t.get(i8), (List) TicketPurchaseHistoryActivity.this.f29089u.get(i8), i8, true, false));
        }

        @Override // H4.a
        public void setGPassTicket(int i8) {
            TicketPurchaseHistoryActivity.this.f29092x.add(C0501b.getPassData((TicketListDao.ReservationList) TicketPurchaseHistoryActivity.this.f29088t.get(i8), (List) TicketPurchaseHistoryActivity.this.f29089u.get(i8), i8, true, false));
        }

        @Override // H4.a
        public void setGeneralTicket(int i8) {
            TicketPurchaseHistoryActivity.this.f29092x.add(C0501b.getNormalTicketData((TicketListDao.ReservationList) TicketPurchaseHistoryActivity.this.f29088t.get(i8), (List) TicketPurchaseHistoryActivity.this.f29089u.get(i8), i8, true, false));
        }

        @Override // H4.a
        public void setNCCardTicket(int i8) {
            TicketPurchaseHistoryActivity.this.f29092x.add(C0501b.getNCardData((TicketListDao.ReservationList) TicketPurchaseHistoryActivity.this.f29088t.get(i8), (List) TicketPurchaseHistoryActivity.this.f29089u.get(i8), i8, true, false));
        }

        @Override // H4.a
        public void setPassTicket(int i8) {
            TicketPurchaseHistoryActivity.this.f29092x.add(C0501b.getPassData((TicketListDao.ReservationList) TicketPurchaseHistoryActivity.this.f29088t.get(i8), (List) TicketPurchaseHistoryActivity.this.f29089u.get(i8), i8, true, false));
        }

        /* synthetic */ c(TicketPurchaseHistoryActivity ticketPurchaseHistoryActivity, a aVar) {
            this();
        }

        @Override // H4.a
        public /* bridge */ /* synthetic */ void callTicketKind(TicketDetailDao.TicketDetailResponse ticketDetailResponse, boolean z8) {
            super.callTicketKind(ticketDetailResponse, z8);
        }

        @Override // H4.a
        public /* bridge */ /* synthetic */ void callTicketKind(TicketDetailDao.TicketDetailResponse ticketDetailResponse, boolean z8, int i8) {
            super.callTicketKind(ticketDetailResponse, z8, i8);
        }
    }

    private void K0() {
        this.f29088t.clear();
        this.f29089u.clear();
        this.f29090v.clear();
        this.f29092x.clear();
        C0839c c0839c = this.f29093y;
        if (c0839c != null) {
            c0839c.notifyDataSetChanged();
        }
    }

    private void L0(String str, String str2) {
        MaasServiceDetailListDao maasServiceDetailListDao = new MaasServiceDetailListDao();
        MaasServiceDetailListDao.MaasServivceDetailRequest maasServivceDetailRequest = maasServiceDetailListDao.new MaasServivceDetailRequest();
        maasServivceDetailRequest.setQryDtFrom(str);
        maasServivceDetailRequest.setQryDtTo(str2);
        maasServiceDetailListDao.setRequest(maasServivceDetailRequest);
        executeDao(maasServiceDetailListDao);
    }

    private void M0(int i8, int i9) {
        List<TicketListDao.TrainInfo> train_info = ((TicketListDao.ReservationList) this.f29088t.get(i8)).getTicket_list().get(i9).getTrain_info();
        String h_orgtk_wct_no = train_info.get(0).getH_orgtk_wct_no();
        String h_orgtk_ret_sale_dt = train_info.get(0).getH_orgtk_ret_sale_dt();
        String h_orgtk_sale_sqno = train_info.get(0).getH_orgtk_sale_sqno();
        String h_orgtk_ret_pwd = train_info.get(0).getH_orgtk_ret_pwd();
        TicketDetailDao ticketDetailDao = new TicketDetailDao();
        TicketDetailDao.TicketDetailRequest ticketDetailRequest = ticketDetailDao.new TicketDetailRequest();
        ticketDetailRequest.setSaleDt(h_orgtk_ret_sale_dt);
        ticketDetailRequest.setWctNo(h_orgtk_wct_no);
        ticketDetailRequest.setSaleSqNo(h_orgtk_sale_sqno);
        ticketDetailRequest.setRetPwd(h_orgtk_ret_pwd);
        ticketDetailRequest.setH_purchase_history("Y");
        ticketDetailDao.setRequest(ticketDetailRequest);
        executeDao(ticketDetailDao);
    }

    private void N0(String str, String str2, String str3) {
        t.d("구매이력(직접입력) : " + str + " ~ " + str2 + ", advertisingId : " + str3);
        TicketListDao ticketListDao = new TicketListDao();
        TicketListDao.TicketListRequest ticketListRequest = ticketListDao.new TicketListRequest();
        ticketListRequest.setTxtDeviceId(str3);
        ticketListRequest.setTxtIndex("2");
        ticketListRequest.sethPageNo(String.valueOf(1));
        ticketListRequest.sethAbrdDtFrom(str);
        ticketListRequest.sethAbrdDtTo(str2);
        h hVar = h.getInstance();
        if (hVar.isNonMember()) {
            ticketListRequest.setHiduserYn("N");
            ticketListRequest.setHidName(hVar.getNonMemberName());
            ticketListRequest.setHidTeleNo(hVar.getNonMemberPhoneNumber());
            ticketListRequest.setHidPwd(hVar.getNonMemberPassword());
        } else {
            ticketListRequest.setHiduserYn("Y");
        }
        ticketListDao.setRequest(ticketListRequest);
        ticketListDao.setNotShowDialog(true);
        executeDao(ticketListDao);
    }

    private void O0(final String str, final String str2) {
        new C5890a().getAdvertising(getApplicationContext(), new C5890a.InterfaceC0346a() { // from class: h6.a
            @Override // l4.C5890a.InterfaceC0346a
            public final void getAdvertisingIdClientInfo(a.C0017a c0017a) {
                this.f31643a.Q0(str, str2, c0017a);
            }
        });
    }

    private void P0(String str, String str2) {
        L0(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q0(String str, String str2, a.C0017a c0017a) {
        try {
            N0(str, str2, c0017a.getId());
        } catch (Exception unused) {
            N0(str, str2, "");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R0(View view) {
        a1(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S0(View view) {
        a1(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void T0(View view) {
        a1(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void U0(View view) {
        a1(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V0(View view) {
        DatePickerDialog datePickerDialog = new DatePickerDialog(this, this.f29075I, this.f29069C.get(1), this.f29069C.get(2), this.f29069C.get(5));
        datePickerDialog.getDatePicker().setMinDate(this.f29071E.getTimeInMillis());
        datePickerDialog.getDatePicker().setMaxDate(this.f29072F.getTimeInMillis());
        datePickerDialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void W0(View view) {
        DatePickerDialog datePickerDialog = new DatePickerDialog(this, this.f29076J, this.f29070D.get(1), this.f29070D.get(2), this.f29070D.get(5));
        datePickerDialog.getDatePicker().setMinDate(this.f29071E.getTimeInMillis());
        datePickerDialog.getDatePicker().setMaxDate(this.f29072F.getTimeInMillis());
        datePickerDialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void X0(View view) {
        onCancelDao();
        K0();
        P0(this.f29084p.format(this.f29069C.getTime()), this.f29084p.format(this.f29070D.getTime()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Y0(View view) {
        onCancelDao();
        K0();
        O0(this.f29084p.format(this.f29069C.getTime()), this.f29084p.format(this.f29070D.getTime()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Z0(DialogInterface dialogInterface, int i8) {
        C6641o.navigation(getApplicationContext(), MainBookingActivity.class);
        finish();
    }

    private void a1(int i8) {
        t.d("mode - " + i8);
        if (this.f29067A == null || this.f29068B == null) {
            t.e("Err - CalendarEditText is null");
            return;
        }
        onCancelDao();
        K0();
        if (i8 == 0) {
            Calendar calendar = Calendar.getInstance();
            this.f29069C = calendar;
            calendar.add(5, -7);
            this.f29070D = Calendar.getInstance();
            this.f29067A.setText(this.f29085q.format(this.f29069C.getTime()));
            this.f29068B.setText(this.f29085q.format(this.f29070D.getTime()));
            return;
        }
        if (i8 == 1) {
            DatePickerDialog datePickerDialog = new DatePickerDialog(this, this.f29075I, this.f29069C.get(1), this.f29069C.get(2), this.f29069C.get(5));
            datePickerDialog.getDatePicker().setMinDate(this.f29071E.getTimeInMillis());
            datePickerDialog.getDatePicker().setMaxDate(this.f29072F.getTimeInMillis());
            datePickerDialog.show();
            return;
        }
        if (i8 == 2) {
            String strAddDay = C6634h.addDay("yyyyMMdd", -14);
            Calendar calendar2 = Calendar.getInstance();
            this.f29069C = calendar2;
            calendar2.add(5, -14);
            this.f29070D = Calendar.getInstance();
            this.f29067A.setText(this.f29085q.format(this.f29069C.getTime()));
            this.f29068B.setText(this.f29085q.format(this.f29070D.getTime()));
            O0(strAddDay, C6634h.addDay("yyyyMMdd", 0));
            return;
        }
        if (i8 == 3) {
            String strAddMonth = C6634h.addMonth("yyyyMMdd", -1);
            Calendar calendar3 = Calendar.getInstance();
            this.f29069C = calendar3;
            calendar3.add(2, -1);
            this.f29070D = Calendar.getInstance();
            this.f29067A.setText(this.f29085q.format(this.f29069C.getTime()));
            this.f29068B.setText(this.f29085q.format(this.f29070D.getTime()));
            O0(strAddMonth, C6634h.addDay("yyyyMMdd", 0));
            return;
        }
        if (i8 != 4) {
            String strAddMonth2 = C6634h.addMonth("yyyyMMdd", -14);
            Calendar calendar4 = Calendar.getInstance();
            this.f29069C = calendar4;
            calendar4.add(5, -14);
            this.f29070D = Calendar.getInstance();
            this.f29067A.setText(this.f29085q.format(this.f29069C.getTime()));
            this.f29068B.setText(this.f29085q.format(this.f29070D.getTime()));
            O0(strAddMonth2, C6634h.addDay("yyyyMMdd", 0));
            return;
        }
        String strAddMonth3 = C6634h.addMonth("yyyyMMdd", -12);
        Calendar calendar5 = Calendar.getInstance();
        this.f29069C = calendar5;
        calendar5.add(2, -12);
        this.f29070D = Calendar.getInstance();
        this.f29067A.setText(this.f29085q.format(this.f29069C.getTime()));
        this.f29068B.setText(this.f29085q.format(this.f29070D.getTime()));
        O0(strAddMonth3, C6634h.addDay("yyyyMMdd", 0));
    }

    private void b1() {
        this.f29088t = new ArrayList();
        this.f29089u = new ArrayList();
        this.f29090v = new ArrayList();
        this.f29092x = new ArrayList();
        this.f29069C = Calendar.getInstance();
        this.f29070D = Calendar.getInstance();
        this.f29071E = Calendar.getInstance();
        this.f29072F = Calendar.getInstance();
        this.f29071E.add(2, -12);
        this.f29072F.add(2, 3);
    }

    private void c1() {
        findViewById(AbstractC5955f.ticketlist_custom).setOnClickListener(new View.OnClickListener() { // from class: h6.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f31646a.R0(view);
            }
        });
        findViewById(AbstractC5955f.ticketlist_day_14).setOnClickListener(new View.OnClickListener() { // from class: h6.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f31647a.S0(view);
            }
        });
        findViewById(AbstractC5955f.ticketlist_month_1).setOnClickListener(new View.OnClickListener() { // from class: h6.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f31648a.T0(view);
            }
        });
        findViewById(AbstractC5955f.ticketlist_month_3).setOnClickListener(new View.OnClickListener() { // from class: h6.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f31649a.U0(view);
            }
        });
        this.f29067A.setOnClickListener(new View.OnClickListener() { // from class: h6.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f31650a.V0(view);
            }
        });
        this.f29068B.setOnClickListener(new View.OnClickListener() { // from class: h6.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f31651a.W0(view);
            }
        });
        this.f29073G.setOnClickListener(new View.OnClickListener() { // from class: h6.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f31652a.X0(view);
            }
        });
        this.f29074H.setOnClickListener(new View.OnClickListener() { // from class: h6.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f31653a.Y0(view);
            }
        });
    }

    private void d1(boolean z8) {
        findViewById(AbstractC5955f.v_no_content).setVisibility(z8 ? 0 : 8);
    }

    private void e1() {
        n0(false);
        this.f29067A = (TextView) findViewById(AbstractC5955f.startCal);
        this.f29068B = (TextView) findViewById(AbstractC5955f.endCal);
        this.f29073G = (Button) findViewById(AbstractC5955f.btn_maas_search);
        this.f29074H = (Button) findViewById(AbstractC5955f.searchByCal);
        this.f29094z = (RecyclerView) findViewById(AbstractC5955f.ticketList);
        this.f29094z.setLayoutManager(new LinearLayoutManager(getApplicationContext(), 1, false));
        this.f29094z.setHasFixedSize(true);
        C0839c c0839c = new C0839c(this.f29092x);
        this.f29093y = c0839c;
        c0839c.setITicketListEventListener(this);
        this.f29094z.setAdapter(this.f29093y);
    }

    private void f1(String str) {
        C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(str).setButtonListener(new DialogInterface.OnClickListener() { // from class: h6.j
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                this.f31654a.Z0(dialogInterface, i8);
            }
        }).showDialog();
    }

    private void setList() {
        for (int i8 = 0; i8 < this.f29088t.size(); i8++) {
            new c(this, null).callTicketKind((TicketDetailDao.TicketDetailResponse) ((List) this.f29089u.get(i8)).get(0), true, i8);
        }
        d1(this.f29092x.isEmpty());
        this.f29094z.setAdapter(this.f29093y);
    }

    private void setText() {
        setAppTitle(AbstractC5959j.title_ticket_history);
    }

    @Override // a6.InterfaceC0837a
    public void moveToCompanionMileageDetail(int i8) {
        Intent intent = new Intent(getApplicationContext(), (Class<?>) CompanionMileageDetailActivity.class);
        intent.putExtra("TICKET_PNR_NUMBER", ((TicketDetailDao.TicketDetailResponse) ((List) this.f29089u.get(i8)).get(0)).getH_pnr_no());
        startActivity(intent);
    }

    @Override // a6.InterfaceC0837a
    public void moveToDelayedCertificate(int i8) {
        Intent intent = new Intent(getApplicationContext(), (Class<?>) TicketDelayCertificateActivity.class);
        intent.putExtra("TICKET_RESPONSE", (Serializable) ((List) this.f29089u.get(i8)).get(0));
        startActivity(intent);
    }

    @Override // a6.InterfaceC0837a
    public void moveToDeliveredHistory(boolean z8, int i8) {
        t.e("moveToDeliveredHistory isOneTicket : " + z8 + ", index : " + i8);
        ArrayList arrayList = new ArrayList();
        for (TicketDetailDao.TicketDetailResponse ticketDetailResponse : (List) this.f29089u.get(i8)) {
            if (C0501b.isDelivered(ticketDetailResponse)) {
                arrayList.add(ticketDetailResponse.getH_orgtk_wct_no() + e.STATE_NAME_NONE + ticketDetailResponse.getH_sale_dt() + e.STATE_NAME_NONE + ticketDetailResponse.getH_orgtk_sale_sqno() + e.STATE_NAME_NONE + ticketDetailResponse.getH_orgtk_ret_pwd());
            }
            if (z8) {
                break;
            }
        }
        Intent intent = new Intent(getApplicationContext(), (Class<?>) DeliveredActivity.class);
        intent.putExtra("DELIVERED_DATA", arrayList);
        startActivityForResult(intent, 127);
    }

    @Override // a6.InterfaceC0837a
    public void moveToDeviceReset(int i8) {
        t.d("moveToDeviceReset");
    }

    @Override // a6.InterfaceC0837a
    public void moveToGuardianReliefSMS(int i8) {
        t.d("moveToGuardianReliefSMS");
    }

    @Override // a6.InterfaceC0837a
    public void moveToMaasServiceAddReservation(int i8) {
        t.d("moveToMaasServiceAddReservation");
    }

    @Override // a6.InterfaceC0837a
    public void moveToMaasServiceCancel(int i8) {
        t.d("moveToMaasCancel");
    }

    @Override // a6.InterfaceC0837a
    public void moveToMaasServiceDetail(int i8) {
        String rsvSpecUrl = ((MaasServiceDetailListDao.AddSrvItem) this.f29091w.get(i8)).getRsvSpecUrl();
        t.e("moveToMaasServiceDetail() : " + i8 + ", url : " + rsvSpecUrl);
        if (C6630d.isNotNull(rsvSpecUrl)) {
            Intent intent = new Intent(getApplicationContext(), (Class<?>) IntegrationWebViewActivity.class);
            intent.putExtra("WEB_GET_URL", rsvSpecUrl);
            intent.putExtra("IS_MAAS_URL", true);
            startActivity(intent);
        }
    }

    @Override // a6.InterfaceC0837a
    public void moveToMaasServiceReceipt(int i8) {
        String addSrvReqNo = ((MaasServiceDetailListDao.AddSrvItem) this.f29091w.get(i8)).getAddSrvReqNo();
        t.e("moveToMaasServiceReceipt() : " + i8 + ", url : " + addSrvReqNo);
        if (C6630d.isNotNull(addSrvReqNo)) {
            Intent intent = new Intent(getApplicationContext(), (Class<?>) ExtraProductWebViewActivity.class);
            intent.addFlags(268435456);
            intent.putExtra("IS_SCREEN_CAPTURE", true);
            intent.putExtra("WEB_POST_URL", g.PRODUCT_MAAS_RECEIPT_URL);
            if (N.isNotNull(((MaasServiceDetailListDao.AddSrvItem) this.f29091w.get(i8)).getPnrNo())) {
                intent.putExtra("WEB_POST_PARAMETER", g.PRODUCT_MAAS_RECEIPT_POST_DATA_PNR + addSrvReqNo);
            } else {
                intent.putExtra("WEB_POST_PARAMETER", g.PRODUCT_MAAS_RECEIPT_POST_DATA + addSrvReqNo);
            }
            startActivity(intent);
        }
    }

    @Override // a6.InterfaceC0837a
    public void moveToProductList(int i8) {
        Intent intent = new Intent(getApplicationContext(), (Class<?>) ExtraProductListActivity.class);
        intent.putExtra("TICKET_PNR_NUMBER", ((TicketDetailDao.TicketDetailResponse) ((List) this.f29089u.get(i8)).get(0)).getH_pnr_no());
        startActivityForResult(intent, androidx.appcompat.app.g.FEATURE_SUPPORT_ACTION_BAR);
    }

    @Override // a6.InterfaceC0837a
    public void moveToReceipt(int i8, int i9) {
        t.d("moveToReceipt");
        Intent intent = new Intent(getApplicationContext(), (Class<?>) TicketReceiptActivity.class);
        intent.putExtra("TICKET_RESPONSE", (Serializable) ((List) this.f29089u.get(i8)).get(i9));
        startActivityForResult(intent, 0);
    }

    @Override // a6.InterfaceC0837a
    public void moveToSeatAssignBooking(int i8, String str) {
        t.d("moveToSeatAssignBooking");
    }

    @Override // a6.InterfaceC0837a
    public void moveToSelfCheckinStatus(int i8, int i9, int i10) {
        t.d("moveToSelfCheckinStatus");
    }

    @Override // a6.InterfaceC0837a
    public void moveToTicketChange(int i8) {
        t.d("moveToTicketChange");
    }

    @Override // a6.InterfaceC0837a
    public void moveToTicketReturn(int i8) {
        t.d("moveToTicketReturn");
        String h_trn_clsf_cd = ((TicketDetailDao.TicketDetailResponse) ((List) this.f29089u.get(i8)).get(0)).getTicket_infos().getTicket_info().get(0).getH_trn_clsf_cd();
        ArrayList arrayList = new ArrayList();
        for (TicketDetailDao.TicketDetailResponse ticketDetailResponse : (List) this.f29089u.get(i8)) {
            if (20 == C0501b.getSeatType(ticketDetailResponse)) {
                arrayList.add(ticketDetailResponse);
            }
        }
        Intent intent = new Intent(getApplicationContext(), (Class<?>) ("98".equals(h_trn_clsf_cd) ? LimousineReturnActivity.class : TicketReturnActivity.class));
        intent.putExtra("IS_DELIVERED", true);
        intent.putExtra("TICKET_RESPONSE", arrayList);
        startActivityForResult(intent, 107);
    }

    @Override // a6.InterfaceC0837a
    public void moveToTicketSeatChange(int i8) {
        t.d("moveToTicketSeatChange");
    }

    @Override // a6.InterfaceC0837a
    public void moveToTicketSend(int i8) {
        t.d("moveToTicketSend");
    }

    @Override // a6.InterfaceC0837a
    public void moveToTrainFacility(String str, String str2) {
        t.d("moveToTrainServiceInfo");
    }

    @Override // a6.InterfaceC0837a
    public void moveToTrainServiceInfo(int i8, int i9) {
        t.d("moveToTrainServiceInfo");
    }

    @Override // a6.InterfaceC0837a
    public void moveToWheelchair(String str, WheelchairData wheelchairData) {
        t.d("moveToWheelchair");
    }

    @Override // a6.InterfaceC0837a
    public void nCardExtension(int i8) {
        t.d("nCardExtension");
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i8, int i9, Intent intent) {
        super.onActivityResult(i8, i9, intent);
        if (i9 == -1) {
            if (107 == i8 || 127 == i8) {
                K0();
                O0(this.f29084p.format(this.f29069C.getTime()), this.f29084p.format(this.f29070D.getTime()));
            }
        }
    }

    @Override // a6.InterfaceC0837a
    public void onClickCallCrew(int i8, int i9, int i10) {
        t.d("onClickCallCrew");
    }

    @Override // a6.InterfaceC0837a
    public void onClickUpdatePlatform(int i8, int i9, int i10) {
        t.d("onClickRefreshPlatform");
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    public void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_ticket_history_list);
        if (C6630d.isNull(bundle)) {
            b1();
            e1();
            setText();
            c1();
            a1(0);
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.appcompat.app.e, androidx.fragment.app.ActivityC1010e, android.app.Activity
    protected void onDestroy() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        h hVar = h.getInstance();
        if (hVar.isNonMember()) {
            hVar.setNonMember(false);
        }
        super.onDestroy();
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        MaasServiceDetailListDao.MaasServivceDetailResponse maasServivceDetailResponse;
        super.onReceive(iBaseDao);
        int id = iBaseDao.getId();
        if (AbstractC5955f.dao_ticket_list == id) {
            TicketListDao.TicketListResponse ticketListResponse = (TicketListDao.TicketListResponse) iBaseDao.getResponse();
            if (ticketListResponse != null && ticketListResponse.gethMsgCd().equals("P114")) {
                f1(ticketListResponse.gethMsgTxt());
                return;
            }
            List<TicketListDao.ReservationList> reorderTicketList = C6038a.getReorderTicketList("2", ticketListResponse.getReservation_list());
            this.f29088t.addAll(reorderTicketList);
            if (reorderTicketList.size() <= 0) {
                setList();
                return;
            }
            this.f29089u = new ArrayList();
            this.f29086r = 0;
            this.f29087s = 0;
            M0(0, 0);
            return;
        }
        if (AbstractC5955f.dao_ticket_detail == id) {
            TicketDetailDao.TicketDetailResponse ticketDetailResponse = (TicketDetailDao.TicketDetailResponse) iBaseDao.getResponse();
            if (this.f29087s == 0) {
                this.f29090v = new ArrayList();
            }
            this.f29090v.add(ticketDetailResponse);
            int i8 = this.f29087s + 1;
            this.f29087s = i8;
            if (i8 < ((TicketListDao.ReservationList) this.f29088t.get(this.f29086r)).getTicket_list().size()) {
                M0(this.f29086r, this.f29087s);
                return;
            }
            this.f29089u.add(this.f29090v);
            int i9 = this.f29086r + 1;
            this.f29086r = i9;
            this.f29087s = 0;
            if (i9 < this.f29088t.size()) {
                M0(this.f29086r, this.f29087s);
                return;
            } else {
                setList();
                return;
            }
        }
        if (AbstractC5955f.dao_maas_service_detail == id && (maasServivceDetailResponse = (MaasServiceDetailListDao.MaasServivceDetailResponse) iBaseDao.getResponse()) != null && C6630d.isNotNull(maasServivceDetailResponse.getAddSrvList())) {
            this.f29091w = maasServivceDetailResponse.getAddSrvList();
            for (int i10 = 0; i10 < maasServivceDetailResponse.getAddSrvList().size(); i10++) {
                MaasServiceDetailListDao.AddSrvItem addSrvItem = maasServivceDetailResponse.getAddSrvList().get(i10);
                Bundle bundle = new Bundle();
                bundle.putInt("INDEX", i10);
                bundle.putBoolean("IS_PURCHASE_HISTORY", true);
                bundle.putInt("TICKET_KIND", 9);
                bundle.putString("MAAS_SERVICE_DV_CD", addSrvItem.getAddSrvDvCd());
                bundle.putString("MAAS_SERVICE_NAME", addSrvItem.getAddSrvNm());
                bundle.putString("MAAS_RESERVATION_NUM", addSrvItem.getAddSrvReqNo());
                bundle.putString("MAAS_PNR_NUM", addSrvItem.getPnrNo());
                bundle.putString("MAAS_MESSAGE_1", addSrvItem.getCgPsRefAtclCont());
                bundle.putString("MAAS_SERVICE_DETAIL_URL", addSrvItem.getRsvSpecUrl());
                t.d("addSrvItem.getAddSrvDvCd() : " + addSrvItem.getAddSrvDvCd());
                this.f29092x.add(bundle);
            }
            setList();
        }
    }

    @Override // a6.InterfaceC0837a
    public void reservationLimousine(int i8) {
        t.d("reservationLimousine");
    }

    @Override // a6.InterfaceC0837a
    public void ticketShareInfo(View view, View view2, Bundle bundle) {
        t.d("ticketShareInfo");
    }
}
