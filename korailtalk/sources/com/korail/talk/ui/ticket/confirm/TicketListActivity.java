package com.korail.talk.ui.ticket.confirm;

import D1.a;
import F4.C0500a;
import F4.C0501b;
import H0.y;
import Q7.X;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.r;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.korail.talk.data.WheelchairData;
import com.korail.talk.database.model.IssueList;
import com.korail.talk.database.model.SMSData;
import com.korail.talk.database.model.TicketDetail;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.certification.LReservationDao;
import com.korail.talk.network.dao.myTicket.TicketListDao;
import com.korail.talk.network.dao.myTicket.TicketListDao.TicketListRequest;
import com.korail.talk.network.dao.payment.RsvPaymentDao;
import com.korail.talk.network.dao.payment.RsvPaymentDao.RsvPaymentRequest;
import com.korail.talk.network.dao.push.CallCrewDao;
import com.korail.talk.network.dao.push.CallCrewDao.CallCrewDaoRequest;
import com.korail.talk.network.dao.refund.RefundCommissionDao;
import com.korail.talk.network.dao.refund.RefundCommissionDao.RefundCommissionRequest;
import com.korail.talk.network.dao.refund.RefundDao;
import com.korail.talk.network.dao.refund.RefundDao.RefundRequest;
import com.korail.talk.network.dao.refund.TicketDetailDao;
import com.korail.talk.network.dao.refund.TicketDetailDao.TicketDetailRequest;
import com.korail.talk.network.dao.research.NCardExtensionDao;
import com.korail.talk.network.dao.research.NCardExtensionDao.NCardExtensionRequest;
import com.korail.talk.network.dao.ticket.GuardianReliefSmsDao;
import com.korail.talk.network.dao.ticket.GuardianReliefSmsDao.GuardianReliefSmsRequest;
import com.korail.talk.network.dao.ticket.MaasServiceCancelDao;
import com.korail.talk.network.dao.ticket.MaasServiceCancelDao.MaasServiceCancelRequest;
import com.korail.talk.network.dao.ticket.MaasServiceCancelFeeDao;
import com.korail.talk.network.dao.ticket.MaasServiceCancelFeeDao.MaasServiceCancelFeeRequest;
import com.korail.talk.network.dao.ticket.MaasServiceDetailListDao;
import com.korail.talk.network.dao.ticket.MaasServiceDetailListDao.MaasServivceDetailRequest;
import com.korail.talk.network.dao.ticket.UpdatePlatformDao;
import com.korail.talk.network.dao.ticket.UpdatePlatformDao.PlfNoRequest;
import com.korail.talk.network.dao.trainsInfo.Price2FareDao;
import com.korail.talk.network.data.reservation.old.OJrny;
import com.korail.talk.network.data.reservation.old.OPsg;
import com.korail.talk.network.request.reservation.ReservationRequest;
import com.korail.talk.network.response.certification.ReservationResponse;
import com.korail.talk.network.response.seatMovie.RsvInquiryResponse;
import com.korail.talk.network.response.seatMovie.RsvInquiryResponse.TrainInfo;
import com.korail.talk.ui.booking.mainBooking.MainBookingActivity;
import com.korail.talk.ui.booking.seatAssign.SeatAssignBookingActivity;
import com.korail.talk.ui.delivery.DeliveredActivity;
import com.korail.talk.ui.extraproduct.ExtraProductListActivity;
import com.korail.talk.ui.menu.ReservedTicketActivity;
import com.korail.talk.ui.mtit.CallCrewActivity;
import com.korail.talk.ui.payment.PaymentActivity;
import com.korail.talk.ui.service.sms.GuardianReliefSmsActivity;
import com.korail.talk.ui.service.wheelchair.WheelchairConfirmActivity;
import com.korail.talk.ui.service.wheelchair.WheelchairRequestActivity;
import com.korail.talk.ui.setting.favoriteCards.FavoriteCardsSettingActivity;
import com.korail.talk.ui.ticket.change.TCActivity;
import com.korail.talk.ui.ticket.change.TCSActivity;
import com.korail.talk.ui.ticket.delivery.TicketDeliveryListActivity;
import com.korail.talk.ui.ticket.receipt.TicketReceiptActivity;
import com.korail.talk.ui.ticket.ticketReturn.LimousineReturnActivity;
import com.korail.talk.ui.ticket.ticketReturn.TicketReturnActivity;
import com.korail.talk.ui.web.ExtraProductWebViewActivity;
import com.korail.talk.ui.web.IntegrationWebViewActivity;
import com.korail.talk.ui.web.TrainServiceInfoWebViewActivity;
import com.korail.talk.ui.web.TrainServiceWebViewActivity;
import com.korail.talk.view.base.BaseViewActivity;
import f6.C5513b;
import f6.C5517f;
import f6.h;
import g5.e;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import l4.C5890a;
import m4.C5908a;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import o4.C6038a;
import p4.C6054a;
import q4.C6111b;
import r4.g;
import r4.i;
import r4.p;
import r4.s;
import y4.C6536a;
import z4.C6630d;
import z4.C6637k;
import z4.C6641o;
import z4.G;
import z4.H;
import z4.N;
import z4.q;
import z4.t;
import z4.x;

/* loaded from: classes.dex */
public class TicketListActivity extends BaseViewActivity {

    /* renamed from: A */
    private ArrayList f28975A;

    /* renamed from: B */
    private h f28976B;

    /* renamed from: C */
    private C5513b f28977C;

    /* renamed from: D */
    private C5517f f28978D;

    /* renamed from: F */
    private Timer f28980F;

    /* renamed from: G */
    private TimerTask f28981G;

    /* renamed from: J */
    private Runnable f28984J;

    /* renamed from: i */
    private boolean f28985i;

    /* renamed from: j */
    private boolean f28986j;

    /* renamed from: k */
    private boolean f28987k;

    /* renamed from: l */
    private String f28988l;

    /* renamed from: m */
    private int f28989m;

    /* renamed from: n */
    private int f28990n;

    /* renamed from: o */
    private int f28991o;

    /* renamed from: p */
    private String f28992p;

    /* renamed from: q */
    private int f28993q;

    /* renamed from: r */
    private int f28994r;

    /* renamed from: s */
    private I4.c f28995s;

    /* renamed from: t */
    private List f28996t;

    /* renamed from: u */
    private List f28997u;

    /* renamed from: v */
    private List f28998v;

    /* renamed from: w */
    private List f28999w;

    /* renamed from: x */
    private TabLayout f29000x;

    /* renamed from: y */
    private ViewPager f29001y;

    /* renamed from: z */
    private d f29002z;

    /* renamed from: E */
    private int f28979E = 0;

    /* renamed from: H */
    private boolean f28982H = false;

    /* renamed from: I */
    private Handler f28983I = new Handler(Looper.getMainLooper());

    class a extends TimerTask {

        /* renamed from: com.korail.talk.ui.ticket.confirm.TicketListActivity$a$a */
        class RunnableC0257a implements Runnable {
            RunnableC0257a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                TicketListActivity.this.I1();
            }
        }

        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            TicketListActivity.this.runOnUiThread(new RunnableC0257a());
        }
    }

    class b implements ViewPager.j {
        b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageScrollStateChanged(int i8) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageScrolled(int i8, float f8, int i9) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageSelected(int i8) {
            TicketListActivity.this.f28979E = i8;
            TicketListActivity.this.R1(true);
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
            TicketListActivity.this.f28977C.setListData(C0501b.getCommutationData((TicketListDao.ReservationList) TicketListActivity.this.f28996t.get(i8), (List) TicketListActivity.this.f28997u.get(i8), i8, false, TicketListActivity.this.f28985i));
        }

        @Override // H4.a
        public void setGPassTicket(int i8) {
            TicketListActivity.this.f28977C.setListData(C0501b.getGPassData((TicketListDao.ReservationList) TicketListActivity.this.f28996t.get(i8), (List) TicketListActivity.this.f28997u.get(i8), i8, false, TicketListActivity.this.f28985i));
        }

        @Override // H4.a
        public void setGeneralTicket(int i8) {
            TicketListDao.ReservationList reservationList = (TicketListDao.ReservationList) TicketListActivity.this.f28996t.get(i8);
            List list = (List) TicketListActivity.this.f28997u.get(i8);
            TicketDetailDao.TicketDetailResponse ticketDetailResponse = (TicketDetailDao.TicketDetailResponse) list.get(0);
            String h_tk_knd_cd = ticketDetailResponse.getH_tk_knd_cd();
            Bundle normalTicketData = C0501b.getNormalTicketData(reservationList, list, i8, false, TicketListActivity.this.f28985i);
            if (!C0500a.isSeatAssignTicket(h_tk_knd_cd)) {
                TicketListActivity.this.f28976B.setListData(normalTicketData);
                if (N.isNotNull(TicketListActivity.this.f28988l) && ticketDetailResponse.getH_pnr_no().equals(TicketListActivity.this.f28988l)) {
                    TicketListActivity.this.f28976B.setTargetPosition();
                    return;
                }
                return;
            }
            TicketListActivity.this.f28977C.setListData(normalTicketData);
            if (N.isNotNull(TicketListActivity.this.f28988l) && ticketDetailResponse.getH_pnr_no().equals(TicketListActivity.this.f28988l)) {
                TicketListActivity.this.f29001y.setCurrentItem(1);
                TicketListActivity.this.f28977C.setTargetPosition();
            }
        }

        @Override // H4.a
        public void setNCCardTicket(int i8) {
            TicketListActivity.this.f28977C.setListData(C0501b.getNCardData((TicketListDao.ReservationList) TicketListActivity.this.f28996t.get(i8), (List) TicketListActivity.this.f28997u.get(i8), i8, false, TicketListActivity.this.f28985i));
        }

        @Override // H4.a
        public void setPassTicket(int i8) {
            TicketListActivity.this.f28977C.setListData(C0501b.getPassData((TicketListDao.ReservationList) TicketListActivity.this.f28996t.get(i8), (List) TicketListActivity.this.f28997u.get(i8), i8, false, TicketListActivity.this.f28985i));
        }

        /* synthetic */ c(TicketListActivity ticketListActivity, a aVar) {
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

    private class d extends r {
        /* synthetic */ d(TicketListActivity ticketListActivity, FragmentManager fragmentManager, a aVar) {
            this(fragmentManager);
        }

        @Override // androidx.viewpager.widget.a
        public int getCount() {
            return TicketListActivity.this.f28975A.size();
        }

        @Override // androidx.fragment.app.r
        public Fragment getItem(int i8) {
            return (Fragment) TicketListActivity.this.f28975A.get(i8);
        }

        private d(FragmentManager fragmentManager) {
            super(fragmentManager, 1);
        }
    }

    public /* synthetic */ void A1(DialogInterface dialogInterface, int i8) {
        if (100 == i8) {
            j1();
        } else if (102 == i8) {
            k1("Y");
        }
    }

    public /* synthetic */ void B1(RefundCommissionDao.RefundCommissionResponse refundCommissionResponse, boolean z8, DialogInterface dialogInterface, int i8) {
        if (102 == i8) {
            String prg_psb_flg = refundCommissionResponse.getPrg_psb_flg();
            int integer = N.getInteger(refundCommissionResponse.getUse_psb_mlg_num());
            String ret_fee = refundCommissionResponse.getRet_fee();
            String ret_amt = refundCommissionResponse.getRet_amt();
            if (z8 && N.getInteger(ret_amt) == 0) {
                C6637k.getCDialog(K(), 1005, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.ticket_ncard_return_confirm_msg)).setCheckBoxMessage(getString(AbstractC5959j.dialog_n_card_return_confirm_checkbox_message)).setButtonNames(N.getStringArray(getString(AbstractC5959j.ticket_refund_cancel), getString(AbstractC5959j.ticket_refund_complete))).setButtonListener(new DialogInterface.OnClickListener() { // from class: f6.q
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface2, int i9) {
                        this.f31241a.z1(dialogInterface2, i9);
                    }
                }).showDialog();
            } else if (!prg_psb_flg.equals("M") || integer < N.getInteger(ret_fee)) {
                j1();
            } else {
                C6637k.getCDialog(K(), 1002, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.ticket_commission_message, N.getDecimalFormatString(String.valueOf(integer)))).setButtonListener(new DialogInterface.OnClickListener() { // from class: f6.r
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface2, int i9) {
                        this.f31242a.A1(dialogInterface2, i9);
                    }
                }).showDialog();
            }
        }
    }

    public /* synthetic */ void C1(int i8, DialogInterface dialogInterface, int i9) {
        if (102 != i9 || C6630d.isNull(K())) {
            return;
        }
        Z0(i8);
    }

    public /* synthetic */ void D1(DialogInterface dialogInterface, int i8) {
        C6641o.navigation(getApplicationContext(), MainBookingActivity.class);
        finish();
    }

    public /* synthetic */ void E1(DialogInterface dialogInterface, int i8) {
        H1();
    }

    public /* synthetic */ void F1(DialogInterface dialogInterface, int i8) {
        if (100 == i8) {
            if (I4.b.getInstance().isCorpTransfer()) {
                showTransferTrainDialog();
            }
        } else if (102 == i8) {
            if (I4.b.getInstance().isCorpTransfer()) {
                C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent("자주쓰는 카드 등록 화면으로 이동합니다.\nSRT 환승 예약을 취소합니다.").setButtonListener(new DialogInterface.OnClickListener() { // from class: f6.p
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface2, int i9) {
                        this.f31240a.E1(dialogInterface2, i9);
                    }
                }).showDialog();
            } else {
                H1();
            }
        }
    }

    public /* synthetic */ void G1(I4.b bVar, DialogInterface dialogInterface, int i8) {
        if (100 == i8) {
            M1();
        } else if (102 == i8) {
            G.playApp(K(), G.getIntentSRT(K(), bVar.getJsonObject()));
        }
    }

    private void H1() {
        Intent intent = new Intent(getApplicationContext(), (Class<?>) FavoriteCardsSettingActivity.class);
        intent.putExtras(getIntent().getExtras());
        startActivity(intent);
    }

    public void I1() {
        Q1();
        X0();
        m1();
    }

    private void J1() {
        setLocationManager();
        this.f28996t = new ArrayList();
        this.f28997u = new ArrayList();
        this.f28998v = new ArrayList();
        Intent intent = getIntent();
        this.f28985i = intent.getBooleanExtra("IS_OFFLINE", false);
        this.f28986j = intent.getBooleanExtra("IS_COMMUTATION_PASS_TICKET", false);
        this.f28987k = intent.getBooleanExtra("IS_MAAS_SERVICE_TICKET", false);
        this.f28988l = intent.getStringExtra("TICKET_PNR_NUMBER");
        this.f28975A = new ArrayList();
        this.f28976B = h.newInstance(this.f28985i);
        this.f28978D = C5517f.newInstance(this.f28985i);
        this.f28977C = C5513b.newInstance(this.f28985i);
        this.f28975A.add(this.f28976B);
        this.f28975A.add(this.f28978D);
        this.f28975A.add(this.f28977C);
    }

    private void K1() {
        t.d("ViewPagerAdapter.getCount() :  " + this.f29002z.getCount());
        int i8 = 0;
        while (i8 < this.f29002z.getCount()) {
            this.f29000x.getTabAt(i8).setCustomView(AbstractC5957h.tab_item);
            ((TextView) this.f29000x.getTabAt(i8).getCustomView().findViewById(AbstractC5955f.tab_tv)).setText(i8 != 1 ? i8 != 2 ? AbstractC5959j.normal_ticket : AbstractC5959j.commutation_pass_ticket : AbstractC5959j.maas_ticket);
            i8++;
        }
    }

    private void L1() throws Resources.NotFoundException {
        if (this.f28985i) {
            l0();
            i0();
        } else {
            n0(false);
        }
        this.f29001y = (ViewPager) findViewById(AbstractC5955f.ticketPager);
        d dVar = new d(this, getSupportFragmentManager(), null);
        this.f29002z = dVar;
        this.f29001y.setAdapter(dVar);
        this.f29001y.setOffscreenPageLimit(this.f28975A.size());
        this.f29001y.addOnPageChangeListener(new b());
        TabLayout tabLayout = (TabLayout) findViewById(AbstractC5955f.tabs);
        this.f29000x = tabLayout;
        tabLayout.setupWithViewPager(this.f29001y);
        K1();
    }

    private void M1() {
        final I4.b bVar = I4.b.getInstance();
        C6637k.getCDialog(K(), 1002, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.srt_manager_dialog_message_cancel_reservation)).setButtonListener(new DialogInterface.OnClickListener() { // from class: f6.l
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                this.f31232a.y1(bVar, dialogInterface, i8);
            }
        }).showDialog();
    }

    private void N1(final RefundCommissionDao.RefundCommissionResponse refundCommissionResponse) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(refundCommissionResponse);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add((TicketDetailDao.TicketDetailResponse) ((List) this.f28997u.get(this.f28991o)).get(0));
        String commissionMessage = x.getCommissionMessage(getApplicationContext(), arrayList, arrayList2);
        final boolean zEquals = "81".equals(((TicketDetailDao.TicketDetailResponse) arrayList2.get(0)).getH_tk_knd_cd());
        C6637k.getCDialog(K(), 1005, 0, getString(AbstractC5959j.dialog_title)).setContent(commissionMessage).setCheckBoxMessage(getString(zEquals ? AbstractC5959j.dialog_n_card_return_checkbox_message : AbstractC5959j.dialog_commission_return_checkbox_message)).setButtonNames(N.getStringArray(getString(AbstractC5959j.ticket_refund_cancel), getString(AbstractC5959j.ticket_refund_complete))).setButtonListener(new DialogInterface.OnClickListener() { // from class: f6.o
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                this.f31237a.B1(refundCommissionResponse, zEquals, dialogInterface, i8);
            }
        }).showDialog();
    }

    private void O1(String str) {
        C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(str).setButtonListener(new DialogInterface.OnClickListener() { // from class: f6.m
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                this.f31234a.D1(dialogInterface, i8);
            }
        }).showDialog();
    }

    private void P1() {
        if (getIntent().hasExtra("CARD_NO")) {
            C6637k.getCDialog(K(), 1002, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.payment_cart_ticket_message_favorite_card)).setButtonListener(new DialogInterface.OnClickListener() { // from class: f6.j
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    this.f31230a.F1(dialogInterface, i8);
                }
            }).showDialog();
        } else if (I4.b.getInstance().isCorpTransfer()) {
            showTransferTrainDialog();
        }
    }

    private void Q1() {
        Timer timer = this.f28980F;
        if (timer != null) {
            timer.cancel();
        }
        TimerTask timerTask = this.f28981G;
        if (timerTask != null) {
            timerTask.cancel();
        }
        this.f28980F = null;
        this.f28981G = null;
    }

    public void R1(boolean z8) {
        if (W0()) {
            if (z8) {
                S1();
            } else {
                Q1();
            }
        }
    }

    private void S1() {
        if (this.f28979E != 0) {
            Q1();
        } else if (this.f28980F == null) {
            this.f28980F = new Timer();
            a aVar = new a();
            this.f28981G = aVar;
            this.f28980F.schedule(aVar, y.DEFAULT_BACKOFF_DELAY_MILLIS);
        }
    }

    private boolean W0() {
        return C6054a.IS_AUTO_REFRESH_ACTIVE && this.f28982H && H.getBoolean(getApplicationContext(), "IS_TICKET_AUTO_REFRESH", true);
    }

    private void X0() {
        if (C6630d.isNotNull(this.f28996t)) {
            this.f28996t.clear();
        }
        if (C6630d.isNotNull(this.f28997u)) {
            this.f28997u.clear();
        }
        if (C6630d.isNotNull(this.f28998v)) {
            this.f28998v.clear();
        }
        if (C6630d.isNotNull(this.f28976B)) {
            this.f28976B.clearData();
        }
        if (C6630d.isNotNull(this.f28978D)) {
            this.f28978D.clearData();
        }
        if (C6630d.isNotNull(this.f28977C)) {
            this.f28977C.clearData();
        }
    }

    private void Y0(final String str) {
        Runnable runnable = this.f28984J;
        if (runnable != null) {
            this.f28983I.removeCallbacks(runnable);
        }
        Runnable runnable2 = new Runnable() { // from class: f6.n
            @Override // java.lang.Runnable
            public final void run() {
                this.f31235a.o1(str);
            }
        };
        this.f28984J = runnable2;
        this.f28983I.postDelayed(runnable2, 500L);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void Z0(int r7) {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "index : "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            z4.t.d(r0)
            com.korail.talk.network.dao.ticket.DeviceResetDao r0 = new com.korail.talk.network.dao.ticket.DeviceResetDao
            r0.<init>()
            com.korail.talk.network.dao.ticket.DeviceResetDao$DeviceResetRequest r1 = new com.korail.talk.network.dao.ticket.DeviceResetDao$DeviceResetRequest
            r1.<init>()
            I4.h r2 = I4.h.getInstance()
            boolean r3 = r2.isNonMember()
            if (r3 == 0) goto L3d
            java.lang.String r3 = r2.getNonMemberPhoneNumber()
            r1.setTeln(r3)
            java.lang.String r3 = r2.getNonMemberName()
            r1.setCustNm(r3)
            java.lang.String r2 = r2.getNonMemberPassword()
            r1.setNonMbPwd(r2)
        L3d:
            java.util.List r2 = r6.f28996t
            java.lang.Object r7 = r2.get(r7)
            com.korail.talk.network.dao.myTicket.TicketListDao$ReservationList r7 = (com.korail.talk.network.dao.myTicket.TicketListDao.ReservationList) r7
            java.util.List r7 = r7.getTicket_list()
            r2 = 0
            java.lang.Object r7 = r7.get(r2)
            com.korail.talk.network.dao.myTicket.TicketListDao$TicketList r7 = (com.korail.talk.network.dao.myTicket.TicketListDao.TicketList) r7
            java.util.List r7 = r7.getTrain_info()
            java.lang.Object r7 = r7.get(r2)
            com.korail.talk.network.dao.myTicket.TicketListDao$TrainInfo r7 = (com.korail.talk.network.dao.myTicket.TicketListDao.TrainInfo) r7
            java.lang.String r2 = r7.getH_trn_clsf_cd()
            r1.setStlbTrnClsfCd(r2)
            java.lang.String r2 = r7.getH_tk_knd_cd()
            java.lang.String r3 = "13"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto Lda
            java.lang.String r3 = "81"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto Lda
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "mKTLocationManager : "
            r2.append(r3)
            I4.c r3 = r6.f28995s
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            z4.t.d(r2)
            I4.c r2 = r6.f28995s
            boolean r2 = z4.C6630d.isNotNull(r2)
            if (r2 == 0) goto Lb0
            I4.c r2 = r6.f28995s
            android.location.Location r2 = r2.getLastKnownLocation()
            boolean r3 = z4.C6630d.isNotNull(r2)
            if (r3 == 0) goto Lb0
            double r3 = r2.getLatitude()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            double r4 = r2.getLongitude()
            java.lang.String r2 = java.lang.String.valueOf(r4)
            goto Lb3
        Lb0:
            java.lang.String r3 = ""
            r2 = r3
        Lb3:
            r1.setLatitude(r3)
            r1.setLongitude(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r7.getH_run_dt()
            r2.append(r3)
            java.lang.String r3 = r7.getH_dpt_tm()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.setDptDttm(r2)
            java.lang.String r7 = r7.getH_trn_no()
            r1.setTrnNo(r7)
        Lda:
            r0.setRequest(r1)
            r6.executeDao(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.korail.talk.ui.ticket.confirm.TicketListActivity.Z0(int):void");
    }

    private void a1(GuardianReliefSmsDao.GuardianReliefSmsRequest guardianReliefSmsRequest) {
        GuardianReliefSmsDao guardianReliefSmsDao = new GuardianReliefSmsDao();
        guardianReliefSmsDao.setRequest(guardianReliefSmsRequest);
        executeDao(guardianReliefSmsDao);
    }

    private void b1(MaasServiceCancelDao.MaasServiceCancelRequest maasServiceCancelRequest) {
        MaasServiceCancelDao maasServiceCancelDao = new MaasServiceCancelDao();
        maasServiceCancelDao.setRequest(maasServiceCancelRequest);
        executeDao(maasServiceCancelDao);
    }

    private void c1(MaasServiceCancelFeeDao.MaasServiceCancelFeeRequest maasServiceCancelFeeRequest) {
        MaasServiceCancelFeeDao maasServiceCancelFeeDao = new MaasServiceCancelFeeDao();
        maasServiceCancelFeeDao.setRequest(maasServiceCancelFeeRequest);
        executeDao(maasServiceCancelFeeDao);
    }

    private void d1() {
        MaasServiceDetailListDao maasServiceDetailListDao = new MaasServiceDetailListDao();
        maasServiceDetailListDao.setRequest(maasServiceDetailListDao.new MaasServivceDetailRequest());
        executeDao(maasServiceDetailListDao);
    }

    private void e1(NCardExtensionDao.NCardExtensionRequest nCardExtensionRequest) {
        NCardExtensionDao nCardExtensionDao = new NCardExtensionDao();
        nCardExtensionDao.setRequest(nCardExtensionRequest);
        executeDao(nCardExtensionDao);
    }

    private void f1(ReservationRequest reservationRequest) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("WRR800029");
        arrayList.add("ERR911531");
        arrayList.add("ERR911051");
        IBaseDao lReservationDao = new LReservationDao();
        lReservationDao.setRequest(reservationRequest);
        lReservationDao.setErrorMsgCdNotShowDialog(arrayList);
        executeDao(lReservationDao);
    }

    private void g1() {
        TicketListDao.TrainInfo trainInfo = ((TicketListDao.ReservationList) this.f28996t.get(this.f28991o)).getTicket_list().get(0).getTrain_info().get(0);
        String h_orgtk_wct_no = trainInfo.getH_orgtk_wct_no();
        String h_orgtk_ret_sale_dt = trainInfo.getH_orgtk_ret_sale_dt();
        String h_orgtk_sale_sqno = trainInfo.getH_orgtk_sale_sqno();
        String h_orgtk_ret_pwd = trainInfo.getH_orgtk_ret_pwd();
        RefundCommissionDao refundCommissionDao = new RefundCommissionDao();
        RefundCommissionDao.RefundCommissionRequest refundCommissionRequest = refundCommissionDao.new RefundCommissionRequest();
        refundCommissionRequest.setH_orgtk_ret_sale_dt(h_orgtk_ret_sale_dt);
        refundCommissionRequest.setH_orgtk_wct_no(h_orgtk_wct_no);
        refundCommissionRequest.setH_orgtk_sale_sqno(h_orgtk_sale_sqno);
        refundCommissionRequest.setH_orgtk_ret_pwd(h_orgtk_ret_pwd);
        refundCommissionRequest.setH_comp_nm(((TicketDetailDao.TicketDetailResponse) ((List) this.f28997u.get(this.f28991o)).get(0)).getH_compa_nm());
        refundCommissionRequest.setH_comp_cert_no(((TicketDetailDao.TicketDetailResponse) ((List) this.f28997u.get(this.f28991o)).get(0)).getH_compa_brth());
        refundCommissionDao.setRequest(refundCommissionRequest);
        executeDao(refundCommissionDao);
    }

    private void h1(int i8, int i9) {
        List<TicketListDao.TrainInfo> train_info = ((TicketListDao.ReservationList) this.f28996t.get(i8)).getTicket_list().get(i9).getTrain_info();
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
        ticketDetailRequest.setH_purchase_history("N");
        ticketDetailDao.setRequest(ticketDetailRequest);
        executeDao(ticketDetailDao);
    }

    /* renamed from: i1 */
    public void o1(String str) {
        t.e("deviceId : " + str);
        TicketListDao ticketListDao = new TicketListDao();
        TicketListDao.TicketListRequest ticketListRequest = ticketListDao.new TicketListRequest();
        ticketListRequest.setTxtDeviceId(str);
        ticketListRequest.setTxtIndex("1");
        ticketListRequest.sethPageNo("1");
        ticketListRequest.sethAbrdDtFrom("");
        ticketListRequest.sethAbrdDtTo("");
        I4.h hVar = I4.h.getInstance();
        if (hVar.isNonMember()) {
            ticketListRequest.setHiduserYn("N");
            ticketListRequest.setHidName(hVar.getNonMemberName());
            ticketListRequest.setHidTeleNo(hVar.getNonMemberPhoneNumber());
            ticketListRequest.setHidPwd(hVar.getNonMemberPassword());
        } else {
            ticketListRequest.setHiduserYn("Y");
        }
        ticketListDao.setRequest(ticketListRequest);
        ticketListDao.setFinishView(true);
        executeDao(ticketListDao);
    }

    private void j1() {
        k1("N");
    }

    private void k1(String str) {
        TicketDetailDao.TicketDetailResponse ticketDetailResponse = (TicketDetailDao.TicketDetailResponse) ((List) this.f28997u.get(this.f28991o)).get(0);
        RefundDao refundDao = new RefundDao();
        RefundDao.RefundRequest refundRequest = refundDao.new RefundRequest();
        refundRequest.setTxtPnrNo(ticketDetailResponse.getH_pnr_no());
        refundRequest.setH_orgtk_sale_dt(ticketDetailResponse.getH_sale_dt());
        refundRequest.setH_orgtk_wct_no(ticketDetailResponse.getH_orgtk_wct_no());
        refundRequest.setH_orgtk_sale_sqno(ticketDetailResponse.getH_orgtk_sale_sqno());
        refundRequest.setH_orgtk_ret_pwd(ticketDetailResponse.getH_orgtk_ret_pwd());
        refundRequest.setH_mlg_stl(str);
        refundRequest.setPbpAcepTgtFlg(ticketDetailResponse.getH_pbp_acep_tgt_flg());
        refundDao.setRequest(refundRequest);
        executeDao(refundDao);
    }

    private void l1(UpdatePlatformDao.PlfNoRequest plfNoRequest) {
        UpdatePlatformDao updatePlatformDao = new UpdatePlatformDao();
        updatePlatformDao.setRequest(plfNoRequest);
        executeDao(updatePlatformDao);
    }

    private void m1() {
        new C5890a().getAdvertising(getApplicationContext(), new C5890a.InterfaceC0346a() { // from class: f6.i
            @Override // l4.C5890a.InterfaceC0346a
            public final void getAdvertisingIdClientInfo(a.C0017a c0017a) {
                this.f31229a.p1(c0017a);
            }
        });
    }

    private List n1(int i8) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) this.f28997u.get(i8);
        for (int i9 = 0; i9 < arrayList2.size(); i9++) {
            arrayList.add(((TicketListDao.ReservationList) this.f28996t.get(this.f28991o)).getTicket_list().get(i9));
        }
        return arrayList;
    }

    public /* synthetic */ void p1(a.C0017a c0017a) {
        try {
            if (!c0017a.isLimitAdTrackingEnabled()) {
                t.d("기기정보 = 광고 ID");
                Y0(c0017a.getId());
            } else if (H.getBoolean(getApplicationContext(), "KEY_SETTING_SECURE_ANDROID_ID")) {
                t.d("기기정보 = SSAID");
                Y0(Settings.Secure.getString(getApplicationContext().getContentResolver(), "android_id"));
            } else {
                t.d("비상승차권 유무 : " + C6038a.decryptIssueListData(getApplicationContext()).isEmpty());
                if (C6038a.decryptIssueListData(getApplicationContext()).isEmpty()) {
                    t.d("기기정보 = SSAID. 비상승차권 없음. 광고ID Off && SSAID On ");
                    String string = Settings.Secure.getString(getApplicationContext().getContentResolver(), "android_id");
                    H.putBoolean(getApplicationContext(), "KEY_SETTING_SECURE_ANDROID_ID", true);
                    Y0(string);
                } else {
                    t.d("기기정보 = 00000000-0000.. 비상승차권 존재");
                    H.putBoolean(getApplicationContext(), "KEY_SETTING_SECURE_ANDROID_ID", false);
                    Y0(c0017a.getId());
                }
            }
        } catch (Exception unused) {
            Y0("");
        }
    }

    public /* synthetic */ void q1() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        String json = q.toJson(this.f28998v);
        if (!C6630d.isNotNull(this.f28998v) || this.f28998v.size() <= 0) {
            return;
        }
        TicketDetail ticketDetail = new TicketDetail();
        ticketDetail.setPnrNo(((TicketDetailDao.TicketDetailResponse) this.f28998v.get(0)).getH_pnr_no());
        ticketDetail.setTicketDetail(C5908a.encryptAES(getApplicationContext(), json));
        C6111b.getInstance().insertTicketDetail(ticketDetail);
    }

    public /* synthetic */ void r1(DialogInterface dialogInterface, int i8) {
        Intent intent = new Intent(getApplicationContext(), (Class<?>) MainBookingActivity.class);
        intent.addFlags(603979776);
        startActivity(intent);
    }

    public /* synthetic */ void s1(RefundCommissionDao.RefundCommissionResponse refundCommissionResponse, DialogInterface dialogInterface, int i8) {
        if (100 == i8) {
            C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_buy_miss_title)).setContent(getString(AbstractC5959j.dialog_buy_miss_msg)).setButtonListener(new DialogInterface.OnClickListener() { // from class: f6.k
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface2, int i9) {
                    this.f31231a.r1(dialogInterface2, i9);
                }
            }).showDialog();
        } else if (102 == i8) {
            N1(refundCommissionResponse);
        }
    }

    private void setText() {
        setAppTitle(AbstractC5959j.title_ticket_confirm);
    }

    public /* synthetic */ void t1(DialogInterface dialogInterface, int i8) {
        X0();
        m1();
    }

    public /* synthetic */ void u1(DialogInterface dialogInterface, int i8) {
        X0();
        m1();
    }

    public /* synthetic */ void v1(MaasServiceCancelFeeDao.MaasServiceCancelFeeRequest maasServiceCancelFeeRequest, String str, DialogInterface dialogInterface, int i8) {
        if (102 == i8) {
            MaasServiceCancelDao.MaasServiceCancelRequest maasServiceCancelRequest = new MaasServiceCancelDao().new MaasServiceCancelRequest();
            maasServiceCancelRequest.setCncTgtCnt("0001");
            maasServiceCancelRequest.setCncAddSrvReqNo(maasServiceCancelFeeRequest.getAddSrvReqNo());
            maasServiceCancelRequest.setCncRetFee(str);
            b1(maasServiceCancelRequest);
        }
    }

    public /* synthetic */ void w1(DialogInterface dialogInterface, int i8) {
        startActivity(new Intent(getApplicationContext(), (Class<?>) ReservedTicketActivity.class));
    }

    public /* synthetic */ void x1(int i8, DialogInterface dialogInterface, int i9) {
        if (i9 != 102) {
            return;
        }
        ReservationRequest reservationRequest = new ReservationRequest();
        reservationRequest.setPnrNo(((TicketDetailDao.TicketDetailResponse) ((List) this.f28997u.get(i8)).get(0)).getH_pnr_no());
        reservationRequest.setHidFreeFlg("N");
        reservationRequest.setStndFlg("N");
        OJrny oJrny = new OJrny();
        oJrny.setJrnyCnt(r4.d.DIRECT_SQ_NO.getCode());
        oJrny.setTrnGpCd(1, s.LIMOUSINE.getCode());
        oJrny.setTrnClsfCd(1, "98");
        reservationRequest.setOJrny(oJrny);
        Iterator it = ((List) this.f28997u.get(i8)).iterator();
        int i10 = 0;
        int i11 = 0;
        while (it.hasNext()) {
            for (TicketDetailDao.TicketSeatInfo ticketSeatInfo : ((TicketDetailDao.TicketDetailResponse) it.next()).getTicket_infos().getTicket_info().get(0).getTk_seat_info()) {
                if ("1".equals(ticketSeatInfo.getH_psg_tp_cd())) {
                    i10++;
                } else if ("3".equals(ticketSeatInfo.getH_psg_tp_cd())) {
                    i11++;
                }
            }
        }
        t.e(i10 + X.SPACE + i11);
        OPsg oPsg = new OPsg();
        oPsg.setCompaCnt(1, String.valueOf(i10));
        oPsg.setPsgTpCd(1, "1");
        oPsg.setDiscKndCd(1, "000");
        oPsg.setCompaCnt(2, String.valueOf(i11));
        oPsg.setPsgTpCd(2, "3");
        oPsg.setDiscKndCd(2, "000");
        oPsg.setTotPsgCnt(String.valueOf(i10 + i11));
        reservationRequest.setOPsg(oPsg);
        f1(reservationRequest);
    }

    public /* synthetic */ void y1(I4.b bVar, DialogInterface dialogInterface, int i8) {
        if (100 == i8) {
            G.playApp(K(), G.getIntentSRT(K(), bVar.getJsonObject()));
        } else if (102 == i8) {
            I4.b.getInstance().setCorpTransfer(false);
        }
    }

    public /* synthetic */ void z1(DialogInterface dialogInterface, int i8) {
        if (102 == i8) {
            j1();
        }
    }

    public void NCardExtension(int i8) {
        TicketListDao.TrainInfo trainInfo = ((TicketListDao.ReservationList) this.f28996t.get(i8)).getTicket_list().get(0).getTrain_info().get(0);
        NCardExtensionDao.NCardExtensionRequest nCardExtensionRequest = new NCardExtensionDao().new NCardExtensionRequest();
        nCardExtensionRequest.setSaleWctNo(trainInfo.getH_orgtk_wct_no());
        nCardExtensionRequest.setSaleDd(trainInfo.getH_orgtk_ret_sale_dt());
        nCardExtensionRequest.setSaleSqno(trainInfo.getH_orgtk_sale_sqno());
        nCardExtensionRequest.setTkRetPwd(trainInfo.getH_orgtk_ret_pwd());
        e1(nCardExtensionRequest);
    }

    public void gotoCallCrew(int i8, int i9, int i10) {
        t.e(i8 + X.SPACE + i9 + X.SPACE + i10);
        CallCrewDao.CallCrewDaoRequest callCrewDaoRequest = new CallCrewDao().new CallCrewDaoRequest();
        callCrewDaoRequest.setPnrNo(((TicketDetailDao.TicketDetailResponse) ((List) this.f28997u.get(i8)).get(i10)).getH_pnr_no());
        String h_jrny_sqno = ((TicketDetailDao.TicketDetailResponse) ((List) this.f28997u.get(i8)).get(i10)).getTicket_infos().getTicket_info().get(i9).getH_jrny_sqno();
        if (!C6630d.isNotNull(h_jrny_sqno)) {
            h_jrny_sqno = "0001";
        }
        callCrewDaoRequest.setJrnySqno(h_jrny_sqno);
        callCrewDaoRequest.setSaleWctNo(((TicketDetailDao.TicketDetailResponse) ((List) this.f28997u.get(i8)).get(i10)).getH_orgtk_wct_no());
        callCrewDaoRequest.setSaleDt(((TicketDetailDao.TicketDetailResponse) ((List) this.f28997u.get(i8)).get(i10)).getH_sale_dt());
        callCrewDaoRequest.setSaleSqno(((TicketDetailDao.TicketDetailResponse) ((List) this.f28997u.get(i8)).get(i10)).getH_orgtk_sale_sqno());
        callCrewDaoRequest.setTkRetPwd(((TicketDetailDao.TicketDetailResponse) ((List) this.f28997u.get(i8)).get(i10)).getH_orgtk_ret_pwd());
        Intent intent = new Intent(getApplicationContext(), (Class<?>) CallCrewActivity.class);
        intent.putExtra("CALL_CREW", callCrewDaoRequest);
        try {
            intent.putExtra("IS_FREE_SEAT", p.NORMAL_FREE.getCode().equals(((TicketDetailDao.TicketDetailResponse) ((List) this.f28997u.get(i8)).get(i10)).getTicket_infos().getTicket_info().get(i9).getTk_seat_info().get(i10).getH_seat_att_cd_4()));
            t.d("Test 현재 값 : " + ((TicketDetailDao.TicketDetailResponse) ((List) this.f28997u.get(i8)).get(i10)).getTicket_infos().getTicket_info().get(i9).getTk_seat_info().get(i10).getH_seat_att_cd_4());
            t.d("Test 수정 값 : " + ((TicketDetailDao.TicketDetailResponse) ((List) this.f28997u.get(i8)).get(i10)).getTicket_infos().getTicket_info().get(i9).getTk_seat_info().get(0).getH_seat_att_cd_4());
        } catch (IndexOutOfBoundsException e8) {
            if (C6054a.IS_DEBUG_LOG) {
                e8.printStackTrace();
            }
            intent.putExtra("IS_FREE_SEAT", true);
        }
        startActivity(intent);
    }

    public void moveToDeliveredHistory(boolean z8, int i8) {
        t.e("moveToDeliveredHistory isOneTicket : " + z8 + ", index : " + i8);
        ArrayList arrayList = new ArrayList();
        for (TicketDetailDao.TicketDetailResponse ticketDetailResponse : (List) this.f28997u.get(i8)) {
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

    public void moveToGuardianReliefSMS(int i8) {
        t.e("index : " + i8);
        TicketListDao.TrainInfo trainInfo = ((TicketListDao.ReservationList) this.f28996t.get(i8)).getTicket_list().get(0).getTrain_info().get(0);
        String h_pnr_no = trainInfo.getH_pnr_no();
        SMSData sMSData = new SMSData();
        sMSData.setPnrNo(h_pnr_no);
        SMSData sMSData2 = C6111b.getInstance().getSMSData(sMSData);
        GuardianReliefSmsDao.GuardianReliefSmsRequest guardianReliefSmsRequest = new GuardianReliefSmsDao().new GuardianReliefSmsRequest();
        guardianReliefSmsRequest.setPnrNo(trainInfo.getH_pnr_no());
        guardianReliefSmsRequest.setJrnySqno(trainInfo.getH_jrny_sqno());
        if (!C6630d.isNull(sMSData2)) {
            guardianReliefSmsRequest.setRcvPsHndyTeln(C5908a.decryptAES(getApplicationContext(), sMSData2.getPhoneNumber()));
            a1(guardianReliefSmsRequest);
        } else {
            Intent intent = new Intent(getApplicationContext(), (Class<?>) GuardianReliefSmsActivity.class);
            intent.putExtra("SMS_DATA", sMSData);
            intent.putExtra("SMS_REQUEST", guardianReliefSmsRequest);
            startActivity(intent);
        }
    }

    public void moveToMaasServiceAddReservation(int i8) {
        t.e("moveToMaasServiceAddReservation() : " + i8);
        String addSrvReqNo = !((MaasServiceDetailListDao.AddSrvItem) this.f28999w.get(i8)).getAddSrvReqNo().isEmpty() ? ((MaasServiceDetailListDao.AddSrvItem) this.f28999w.get(i8)).getAddSrvReqNo() : "";
        Intent intent = new Intent(getApplicationContext(), (Class<?>) MaasAddReservationActivity.class);
        intent.putExtra("PARAM_MAAS_ADD_SRV_REQ_NO", addSrvReqNo);
        startActivity(intent);
    }

    public void moveToMaasServiceCancel(int i8) {
        t.e("moveToMaasServiceCancel() : " + i8);
        MaasServiceCancelFeeDao.MaasServiceCancelFeeRequest maasServiceCancelFeeRequest = new MaasServiceCancelFeeDao().new MaasServiceCancelFeeRequest();
        maasServiceCancelFeeRequest.setAddSrvReqNo(((MaasServiceDetailListDao.AddSrvItem) this.f28999w.get(i8)).getAddSrvReqNo());
        maasServiceCancelFeeRequest.setAddSrvDvCd(((MaasServiceDetailListDao.AddSrvItem) this.f28999w.get(i8)).getAddSrvDvCd());
        maasServiceCancelFeeRequest.setCoptEntRsvNo(((MaasServiceDetailListDao.AddSrvItem) this.f28999w.get(i8)).getCoptEntRsvNo());
        c1(maasServiceCancelFeeRequest);
    }

    public void moveToMaasServiceDetail(int i8) {
        String rsvSpecUrl = ((MaasServiceDetailListDao.AddSrvItem) this.f28999w.get(i8)).getRsvSpecUrl();
        t.e("moveToMaasServiceDetail() : " + i8 + ", url : " + rsvSpecUrl);
        if (C6630d.isNotNull(rsvSpecUrl)) {
            Intent intent = new Intent(getApplicationContext(), (Class<?>) IntegrationWebViewActivity.class);
            intent.putExtra("WEB_GET_URL", rsvSpecUrl);
            intent.putExtra("IS_MAAS_URL", true);
            startActivity(intent);
        }
    }

    public void moveToMaasServiceReceipt(int i8) {
        String addSrvReqNo = ((MaasServiceDetailListDao.AddSrvItem) this.f28999w.get(i8)).getAddSrvReqNo();
        t.e("moveToMaasServiceReceipt() : " + i8 + ", url : " + addSrvReqNo);
        if (C6630d.isNotNull(addSrvReqNo)) {
            Intent intent = new Intent(getApplicationContext(), (Class<?>) ExtraProductWebViewActivity.class);
            intent.addFlags(268435456);
            intent.putExtra("IS_SCREEN_CAPTURE", true);
            intent.putExtra("WEB_POST_URL", g.PRODUCT_MAAS_RECEIPT_URL);
            if (N.isNotNull(((MaasServiceDetailListDao.AddSrvItem) this.f28999w.get(i8)).getPnrNo())) {
                intent.putExtra("WEB_POST_PARAMETER", g.PRODUCT_MAAS_RECEIPT_POST_DATA_PNR + addSrvReqNo);
            } else {
                intent.putExtra("WEB_POST_PARAMETER", g.PRODUCT_MAAS_RECEIPT_POST_DATA + addSrvReqNo);
            }
            startActivity(intent);
        }
    }

    public void moveToProductList(int i8) {
        Intent intent = new Intent(getApplicationContext(), (Class<?>) ExtraProductListActivity.class);
        intent.putExtra("TICKET_PNR_NUMBER", ((TicketDetailDao.TicketDetailResponse) ((List) this.f28997u.get(i8)).get(0)).getH_pnr_no());
        startActivityForResult(intent, androidx.appcompat.app.g.FEATURE_SUPPORT_ACTION_BAR);
    }

    public void moveToReceipt(int i8, int i9) {
        Intent intent = new Intent(getApplicationContext(), (Class<?>) TicketReceiptActivity.class);
        intent.putExtra("TICKET_RESPONSE", (Serializable) ((List) this.f28997u.get(i8)).get(i9));
        startActivity(intent);
    }

    public void moveToSeatAssignBooking(int i8, String str) {
        TicketListDao.TrainInfo trainInfo = ((TicketListDao.ReservationList) this.f28996t.get(i8)).getTicket_list().get(0).getTrain_info().get(0);
        Intent intent = new Intent(getApplicationContext(), (Class<?>) SeatAssignBookingActivity.class);
        intent.putExtra("WCT_NO", trainInfo.getH_orgtk_wct_no());
        intent.putExtra("RET_SALE_DT", trainInfo.getH_orgtk_ret_sale_dt());
        intent.putExtra("SALE_SQ_NO", trainInfo.getH_orgtk_sale_sqno());
        intent.putExtra("RET_PWD", trainInfo.getH_orgtk_ret_pwd());
        intent.putExtra("activity_name", ((TicketDetailDao.TicketDetailResponse) ((List) this.f28997u.get(i8)).get(0)).getH_tk_knd_nm());
        intent.putExtra("INQUIRY_TYPE", str);
        startActivity(intent);
    }

    public void moveToSelfCheckinStatus(int i8, int i9, int i10) {
        Intent intent = new Intent(getApplicationContext(), (Class<?>) TicketSelfCheckinStatusActivity.class);
        String h_jrny_sqno = ((TicketDetailDao.TicketDetailResponse) ((List) this.f28997u.get(i8)).get(i10)).getTicket_infos().getTicket_info().get(i9).getH_jrny_sqno();
        if (!C6630d.isNotNull(h_jrny_sqno)) {
            h_jrny_sqno = "0001";
        }
        intent.putExtra(Price2FareDao.Price2Fare.jrnySqnoString, h_jrny_sqno);
        intent.putExtra("WCT_NO", ((TicketDetailDao.TicketDetailResponse) ((List) this.f28997u.get(i8)).get(i10)).getH_orgtk_wct_no());
        intent.putExtra("RET_SALE_DD", ((TicketDetailDao.TicketDetailResponse) ((List) this.f28997u.get(i8)).get(i10)).getH_orgtk_ret_sale_dt());
        intent.putExtra("RET_SALE_DT", ((TicketDetailDao.TicketDetailResponse) ((List) this.f28997u.get(i8)).get(i10)).getH_sale_dt());
        intent.putExtra("SALE_SQ_NO", ((TicketDetailDao.TicketDetailResponse) ((List) this.f28997u.get(i8)).get(i10)).getH_orgtk_sale_sqno());
        intent.putExtra("RET_PWD", ((TicketDetailDao.TicketDetailResponse) ((List) this.f28997u.get(i8)).get(i10)).getH_orgtk_ret_pwd());
        intent.putExtra("SELF_CHECKIN_STATUS", ((TicketDetailDao.TicketDetailResponse) ((List) this.f28997u.get(i8)).get(i10)).getTicket_infos().getTicket_info().get(0).getTk_seat_info().get(0).getH_chckn_stt_cd());
        t.d("code : " + ((TicketDetailDao.TicketDetailResponse) ((List) this.f28997u.get(i8)).get(i10)).getTicket_infos().getTicket_info().get(0).getTk_seat_info().get(0).getH_chckn_stt_cd());
        startActivity(intent);
    }

    public void moveToTicketChange(int i8) {
        this.f28991o = i8;
        ArrayList arrayList = new ArrayList();
        for (TicketDetailDao.TicketDetailResponse ticketDetailResponse : (List) this.f28997u.get(i8)) {
            if (20 != C0501b.getSeatType(ticketDetailResponse)) {
                arrayList.add(ticketDetailResponse);
            }
        }
        Intent intent = new Intent(getApplicationContext(), (Class<?>) TCActivity.class);
        intent.putExtra("TICKET_RESPONSE", arrayList);
        startActivity(intent);
    }

    public void moveToTicketReturn(int i8) {
        this.f28991o = i8;
        String h_tk_knd_cd = ((TicketDetailDao.TicketDetailResponse) ((List) this.f28997u.get(i8)).get(0)).getH_tk_knd_cd();
        String h_trn_clsf_cd = ((TicketDetailDao.TicketDetailResponse) ((List) this.f28997u.get(i8)).get(0)).getTicket_infos().getTicket_info().get(0).getH_trn_clsf_cd();
        if (h_tk_knd_cd.equals("13") || h_tk_knd_cd.equals("81")) {
            g1();
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (TicketDetailDao.TicketDetailResponse ticketDetailResponse : (List) this.f28997u.get(i8)) {
            if (20 != C0501b.getSeatType(ticketDetailResponse)) {
                arrayList.add(ticketDetailResponse);
            }
        }
        Intent intent = new Intent(getApplicationContext(), (Class<?>) ("98".equals(h_trn_clsf_cd) ? LimousineReturnActivity.class : TicketReturnActivity.class));
        intent.putExtra("TICKET_RESPONSE", arrayList);
        startActivityForResult(intent, 107);
    }

    public void moveToTicketSeatChange(int i8) {
        this.f28991o = i8;
        ArrayList arrayList = new ArrayList();
        for (TicketDetailDao.TicketDetailResponse ticketDetailResponse : (List) this.f28997u.get(i8)) {
            if (20 != C0501b.getSeatType(ticketDetailResponse)) {
                arrayList.add(ticketDetailResponse);
            }
        }
        Serializable serializable = (TicketListDao.TrainInfo) ((TicketListDao.ReservationList) this.f28996t.get(i8)).getTicket_list().get(0).getTrain_info().get(0);
        Intent intent = new Intent(getApplicationContext(), (Class<?>) TCSActivity.class);
        intent.putExtra("TICKET_RESPONSE", arrayList);
        intent.putExtra("TICKET_TRAIN_RESPONSE", serializable);
        startActivity(intent);
    }

    public void moveToTicketSend(int i8) {
        this.f28991o = i8;
        ArrayList arrayList = new ArrayList();
        for (TicketDetailDao.TicketDetailResponse ticketDetailResponse : (List) this.f28997u.get(i8)) {
            if (20 != C0501b.getSeatType(ticketDetailResponse)) {
                arrayList.add(ticketDetailResponse);
            }
        }
        Intent intent = new Intent(getApplicationContext(), (Class<?>) TicketDeliveryListActivity.class);
        intent.putExtra("TICKET_RESPONSE", arrayList);
        intent.putExtra("NUMBER_RESERVATION_CHANGES", ((TicketListDao.TicketList) n1(this.f28991o).get(0)).getTrain_info().get(0).getH_rsv_chg_tno());
        startActivityForResult(intent, 106);
    }

    protected void moveToTrainFacility(String str, String str2) {
        Intent intent = new Intent(getApplicationContext(), (Class<?>) TrainServiceWebViewActivity.class);
        intent.putExtra("WEB_POST_URL", str);
        intent.putExtra("WEB_POST_URL_2", str2);
        startActivity(intent);
    }

    protected void moveToTrainServiceInfo(int i8, int i9) {
        List<TicketListDao.TicketList> ticket_list = ((TicketListDao.ReservationList) this.f28996t.get(i8)).getTicket_list();
        RsvInquiryResponse.TrainInfo trainInfo = new RsvInquiryResponse().new TrainInfo();
        TicketListDao.TrainInfo trainInfo2 = ticket_list.get(0).getTrain_info().get(i9);
        trainInfo.setH_run_dt(trainInfo2.getH_run_dt());
        trainInfo.setH_trn_no(trainInfo2.getH_trn_no());
        trainInfo.setH_trn_clsf_nm(trainInfo2.getH_trn_clsf_nm());
        trainInfo.setH_dpt_rs_stn_nm(trainInfo2.getH_dpt_rs_stn_nm());
        trainInfo.setH_arv_rs_stn_nm(trainInfo2.getH_arv_rs_stn_nm());
        trainInfo.setH_dpt_rs_stn_cd(C6111b.getInstance().getStationDataByName(trainInfo2.getH_dpt_rs_stn_nm()).getStnCd());
        trainInfo.setH_dpt_dt(trainInfo2.getH_dpt_dt());
        Intent intent = new Intent(getApplicationContext(), (Class<?>) TrainServiceInfoWebViewActivity.class);
        intent.putExtra("TRAIN_INFO", trainInfo);
        startActivity(intent);
    }

    public void moveToWheelchair(String str, WheelchairData wheelchairData) {
        Intent intent = new Intent(getApplicationContext(), (Class<?>) ("Y".equals(str) ? WheelchairConfirmActivity.class : WheelchairRequestActivity.class));
        intent.putExtra("WHEELCHAIR_DATA", wheelchairData);
        startActivityForResult(intent, 123);
    }

    public void onClickUpdatePlatform(int i8, int i9, int i10) {
        TicketDetailDao.TicketDetailResponse ticketDetailResponse = (TicketDetailDao.TicketDetailResponse) ((List) this.f28997u.get(i8)).get(i10);
        this.f28992p = C6038a.getReturnNumberWithDash(ticketDetailResponse.getH_orgtk_wct_no(), ticketDetailResponse.getH_sale_dt(), ticketDetailResponse.getH_orgtk_sale_sqno(), ticketDetailResponse.getH_orgtk_ret_pwd());
        this.f28993q = i9;
        this.f28994r = i10;
        UpdatePlatformDao.PlfNoRequest plfNoRequest = new UpdatePlatformDao().new PlfNoRequest();
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(ticketDetailResponse.getH_orgtk_wct_no() + e.STATE_NAME_NONE + ticketDetailResponse.getH_sale_dt() + e.STATE_NAME_NONE + ticketDetailResponse.getH_orgtk_sale_sqno() + e.STATE_NAME_NONE + ticketDetailResponse.getH_orgtk_ret_pwd());
        plfNoRequest.setTkCnt(Integer.toString(arrayList.size()));
        plfNoRequest.setTkRetNo(arrayList);
        l1(plfNoRequest);
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    public void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, Resources.NotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.ticket_list_activity);
        if (C6630d.isNull(bundle)) {
            j0();
            J1();
            L1();
            setText();
            P1();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.appcompat.app.e, androidx.fragment.app.ActivityC1010e, android.app.Activity
    protected void onDestroy() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onDestroy();
        I4.h hVar = I4.h.getInstance();
        if (hVar.isNonMember()) {
            hVar.initNonmemberData();
        }
        Runnable runnable = this.f28984J;
        if (runnable != null) {
            this.f28983I.removeCallbacks(runnable);
            this.f28984J = null;
        }
    }

    @Override // androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // com.korail.talk.view.base.BaseActivity
    public void onNonMemberLoginSuccess() {
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, android.app.Activity
    protected void onPause() {
        super.onPause();
        R1(false);
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onReceive(iBaseDao);
        int id = iBaseDao.getId();
        if (AbstractC5955f.dao_ticket_list == id) {
            C6111b.getInstance().deleteIssueList();
            C6111b.getInstance().deleteTicketDetail();
            TicketListDao.TicketListResponse ticketListResponse = (TicketListDao.TicketListResponse) iBaseDao.getResponse();
            if (ticketListResponse.gethMsgCd().equals("P114")) {
                O1(ticketListResponse.gethMsgTxt());
                return;
            }
            if (I4.h.getInstance().isLogin()) {
                try {
                    TicketListDao.TicketListResponse ticketListResponse2 = (TicketListDao.TicketListResponse) ((TicketListDao) iBaseDao).getResponse();
                    if (N.isNotNull(C5908a.decryptAES(getApplicationContext(), H.getString(getApplicationContext(), "KEY_LOGIN_ID")))) {
                        IssueList issueList = new IssueList();
                        issueList.setIssueList(C5908a.encryptAES(getApplicationContext(), q.toJson(ticketListResponse2)));
                        C6111b.getInstance().insertIssueList(issueList);
                    }
                } catch (Exception e8) {
                    t.e(e8.getMessage());
                }
            }
            List<TicketListDao.ReservationList> reorderTicketList = C6038a.getReorderTicketList("1", ticketListResponse.getReservation_list());
            this.f28996t.addAll(reorderTicketList);
            if (reorderTicketList.size() > 0) {
                this.f28997u = new ArrayList();
                this.f28989m = 0;
                this.f28990n = 0;
                h1(0, 0);
                return;
            }
            setList();
            if (I4.h.getInstance().isLogin()) {
                d1();
                return;
            }
            return;
        }
        if (AbstractC5955f.dao_ticket_detail == id) {
            TicketDetailDao.TicketDetailResponse ticketDetailResponse = (TicketDetailDao.TicketDetailResponse) iBaseDao.getResponse();
            if (this.f28990n == 0) {
                this.f28998v = new ArrayList();
            }
            this.f28998v.add(ticketDetailResponse);
            int i8 = this.f28990n + 1;
            this.f28990n = i8;
            if (i8 < ((TicketListDao.ReservationList) this.f28996t.get(this.f28989m)).getTicket_list().size()) {
                h1(this.f28989m, this.f28990n);
                return;
            }
            new Handler().post(new Runnable() { // from class: f6.s
                @Override // java.lang.Runnable
                public final void run() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
                    this.f31243a.q1();
                }
            });
            this.f28997u.add(this.f28998v);
            int i9 = this.f28989m + 1;
            this.f28989m = i9;
            this.f28990n = 0;
            if (i9 < this.f28996t.size()) {
                h1(this.f28989m, this.f28990n);
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (TicketListDao.ReservationList reservationList : this.f28996t) {
                SMSData sMSData = new SMSData();
                sMSData.setPnrNo(reservationList.getTicket_list().get(0).getTrain_info().get(0).getH_pnr_no());
                arrayList.add(sMSData);
            }
            C6111b.getInstance().deleteSMSData(arrayList);
            setList();
            if (I4.h.getInstance().isLogin()) {
                d1();
            }
            if (!this.f28982H) {
                this.f28982H = true;
            }
            R1(true);
            return;
        }
        if (AbstractC5955f.dao_ticket_commition == id) {
            final RefundCommissionDao.RefundCommissionResponse refundCommissionResponse = (RefundCommissionDao.RefundCommissionResponse) iBaseDao.getResponse();
            if (refundCommissionResponse.gethMsgCd().equals("WRT800078") || refundCommissionResponse.getH_msg_cd2().equals("WRT800078")) {
                C6637k.getCDialog(K(), 1002, 0, getString(AbstractC5959j.dialog_title)).setContent(refundCommissionResponse.gethMsgCd().equals("WRT800078") ? refundCommissionResponse.gethMsgTxt() : refundCommissionResponse.getH_msg_txt2()).setButtonNames(N.getStringArray(getString(AbstractC5959j.dialog_button_repurchase), getString(AbstractC5959j.dialog_button_return))).setButtonListener(new DialogInterface.OnClickListener() { // from class: f6.t
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        this.f31244a.s1(refundCommissionResponse, dialogInterface, i10);
                    }
                }).showDialog();
                return;
            } else {
                N1(refundCommissionResponse);
                return;
            }
        }
        if (AbstractC5955f.dao_ticket_return == id) {
            Iterator<RefundDao.StlList> it = ((RefundDao.RefundResponse) iBaseDao.getResponse()).getStlList().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().getStl_mns_cd().equals("13")) {
                        C6630d.syncRailPlus(getApplicationContext());
                        break;
                    }
                } else {
                    break;
                }
            }
            C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.ticket_refund_complete)).setContent(getString(AbstractC5959j.ticket_refund_content_modified)).setButtonListener(new DialogInterface.OnClickListener() { // from class: f6.u
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    this.f31246a.t1(dialogInterface, i10);
                }
            }).showDialog();
            return;
        }
        if (AbstractC5955f.dao_l_reservation == id) {
            ReservationResponse reservationResponse = (ReservationResponse) iBaseDao.getResponse();
            RsvPaymentDao.RsvPaymentRequest rsvPaymentRequest = new RsvPaymentDao().new RsvPaymentRequest();
            rsvPaymentRequest.setHidPnrNo(reservationResponse.getH_pnr_no());
            rsvPaymentRequest.setWctNo(reservationResponse.getH_wct_no());
            rsvPaymentRequest.setJobSqNo1(reservationResponse.getH_tmp_job_sqno1());
            rsvPaymentRequest.setJobSqNo2(reservationResponse.getH_tmp_job_sqno2());
            rsvPaymentRequest.setHidRsvChgNo(reservationResponse.getJrny_infos().getJrny_info().get(0).getH_rsv_chg_no());
            Intent intent = new Intent(getApplicationContext(), (Class<?>) PaymentActivity.class);
            intent.putExtra("PAYMENT_TYPE", i.PAYMENT_DEFAULT);
            intent.putExtra("PAYMENT_REQUEST", rsvPaymentRequest);
            intent.putExtra("COMMON_RESERVATION_RESPONSE", reservationResponse);
            intent.putExtra("IS_POINT_STEP", true);
            startActivity(intent);
            return;
        }
        if (AbstractC5955f.dao_n_card_extension == id) {
            C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.common_period_extension)).setContent(iBaseDao.getResponse().gethMsgTxt()).setButtonListener(new DialogInterface.OnClickListener() { // from class: f6.v
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    this.f31247a.u1(dialogInterface, i10);
                }
            }).showDialog();
            return;
        }
        if (AbstractC5955f.dao_guardian_relief_sms == id) {
            C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(iBaseDao.getResponse().gethMsgTxt()).showDialog();
            return;
        }
        if (AbstractC5955f.dao_update_platform == id) {
            this.f28976B.updatePlatform((UpdatePlatformDao.PlfNoResponse) iBaseDao.getResponse(), this.f28992p, this.f28993q, this.f28994r);
            return;
        }
        if (AbstractC5955f.dao_device_reset == id) {
            onCancelDao();
            X0();
            m1();
            return;
        }
        if (AbstractC5955f.dao_maas_service_detail != id) {
            if (AbstractC5955f.dao_maas_service_cancel == id) {
                onCancelDao();
                X0();
                m1();
                return;
            } else {
                if (AbstractC5955f.dao_maas_service_cancel_fee == id) {
                    MaasServiceCancelFeeDao.MaasServiceCancelFeeResponse maasServiceCancelFeeResponse = (MaasServiceCancelFeeDao.MaasServiceCancelFeeResponse) iBaseDao.getResponse();
                    final MaasServiceCancelFeeDao.MaasServiceCancelFeeRequest maasServiceCancelFeeRequest = (MaasServiceCancelFeeDao.MaasServiceCancelFeeRequest) iBaseDao.getRequest();
                    final String cncRetFee = maasServiceCancelFeeResponse.getCncRetFee();
                    C6637k.getCDialog(K(), 1002, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.maas_service_cancel_content_fee, String.format(Locale.KOREA, "%,d", Integer.valueOf(Integer.parseInt(cncRetFee))))).setButtonNames(N.getStringArray(getString(AbstractC5959j.common_close), getString(AbstractC5959j.dialog_button_cancel_request))).setButtonListener(new DialogInterface.OnClickListener() { // from class: f6.w
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i10) {
                            this.f31248a.v1(maasServiceCancelFeeRequest, cncRetFee, dialogInterface, i10);
                        }
                    }).showDialog();
                    return;
                }
                return;
            }
        }
        MaasServiceDetailListDao.MaasServivceDetailResponse maasServivceDetailResponse = (MaasServiceDetailListDao.MaasServivceDetailResponse) iBaseDao.getResponse();
        if (maasServivceDetailResponse == null || !C6630d.isNotNull(maasServivceDetailResponse.getAddSrvList())) {
            return;
        }
        this.f28999w = maasServivceDetailResponse.getAddSrvList();
        for (int i10 = 0; i10 < maasServivceDetailResponse.getAddSrvList().size(); i10++) {
            MaasServiceDetailListDao.AddSrvItem addSrvItem = maasServivceDetailResponse.getAddSrvList().get(i10);
            Bundle bundle = new Bundle();
            bundle.putInt("INDEX", i10);
            bundle.putInt("TICKET_KIND", 9);
            bundle.putString("MAAS_SERVICE_DV_CD", addSrvItem.getAddSrvDvCd());
            bundle.putString("MAAS_SERVICE_NAME", addSrvItem.getAddSrvNm());
            bundle.putString("MAAS_RESERVATION_NUM", addSrvItem.getAddSrvReqNo());
            bundle.putString("MAAS_PNR_NUM", addSrvItem.getPnrNo());
            bundle.putString("MAAS_MESSAGE_1", addSrvItem.getCgPsRefAtclCont());
            bundle.putString("MAAS_SERVICE_DETAIL_URL", addSrvItem.getRsvSpecUrl());
            bundle.putString("MAAS_PSB_START_DATE", addSrvItem.getUtlStDt());
            bundle.putString("MAAS_PSB_END_DATE", addSrvItem.getUtlClsDt());
            bundle.putString("MAAS_PSB_START_TIME", addSrvItem.getDlivPsbStTm());
            bundle.putString("MAAS_PSB_END_TIME", addSrvItem.getDlivPsbClsTm());
            t.d("addSrvItem.getAddSrvDvCd() : " + addSrvItem.getAddSrvDvCd());
            this.f28978D.setMaasListData(bundle);
        }
        this.f28978D.updateList();
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceiveError(IBaseDao iBaseDao, C6536a c6536a) {
        super.onReceiveError(iBaseDao, c6536a);
        if (AbstractC5955f.dao_l_reservation == iBaseDao.getId()) {
            ReservationResponse reservationResponse = (ReservationResponse) iBaseDao.getResponse();
            if ("WRR800029".equals(reservationResponse.gethMsgCd()) || "ERR911531".equals(reservationResponse.gethMsgCd()) || "ERR911051".equals(reservationResponse.gethMsgCd())) {
                C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(c6536a.getMessage()).setButtonListener(new DialogInterface.OnClickListener() { // from class: f6.A
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i8) {
                        this.f31206a.w1(dialogInterface, i8);
                    }
                }).showDialog();
            }
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, android.app.Activity
    protected void onResume() {
        super.onResume();
        if (!this.f28985i) {
            onCancelDao();
            X0();
            m1();
        }
        R1(true);
    }

    public void reservationLimousine(final int i8) {
        Z(new DialogInterface.OnClickListener() { // from class: f6.z
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i9) {
                this.f31255a.x1(i8, dialogInterface, i9);
            }
        });
    }

    public void setList() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.f28985i) {
            List<TicketListDao.ReservationList> listDecryptIssueListData = C6038a.decryptIssueListData(getApplicationContext());
            this.f28996t = listDecryptIssueListData;
            Iterator<TicketListDao.ReservationList> it = listDecryptIssueListData.iterator();
            while (it.hasNext()) {
                List<TicketDetailDao.TicketDetailResponse> listDecryptIssueDetailListData = C6038a.decryptIssueDetailListData(getApplicationContext(), it.next().getTicket_list().get(0).getTrain_info().get(0).getH_pnr_no());
                if (listDecryptIssueDetailListData.isEmpty()) {
                    return;
                } else {
                    this.f28997u.add(listDecryptIssueDetailListData);
                }
            }
        }
        t.d("// 티켓수 만큼 for 문 : " + this.f28996t.size());
        for (int i8 = 0; i8 < this.f28996t.size(); i8++) {
            new c(this, null).callTicketKind((TicketDetailDao.TicketDetailResponse) ((List) this.f28997u.get(i8)).get(0), false, i8);
        }
        this.f28976B.updateList();
        this.f28978D.updateList();
        this.f28977C.updateList();
        if (this.f28987k) {
            this.f29000x.getTabAt(1).select();
            this.f29001y.setCurrentItem(1);
        } else if (this.f28986j || (this.f28976B.getListDataSize() == 0 && this.f28977C.getListDataSize() > 0)) {
            this.f29000x.getTabAt(2).select();
            this.f29001y.setCurrentItem(2);
        }
    }

    public void setLocationManager() {
        I4.c cVar = new I4.c();
        this.f28995s = cVar;
        cVar.requestLocationUpdates(getApplicationContext());
    }

    public void setTabBadge(int i8, int i9) {
        if (C6630d.isNull(this.f29000x) || C6630d.isNull(this.f29000x.getTabAt(i8))) {
            return;
        }
        TextView textView = (TextView) this.f29000x.getTabAt(i8).getCustomView().findViewById(AbstractC5955f.tab_tv);
        int i10 = i8 != 1 ? i8 != 2 ? AbstractC5959j.normal_ticket : AbstractC5959j.commutation_pass_ticket : AbstractC5959j.maas_ticket;
        if (i9 <= 0) {
            if (i9 == 0) {
                textView.setText(getString(i10));
            }
        } else {
            textView.setText(getString(i10) + "(" + i9 + ")");
        }
    }

    public void showDeviceReset(final int i8) {
        C6637k.getCDialog(K(), 1002, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.ticket_reset_confirm)).setButtonListener(new DialogInterface.OnClickListener() { // from class: f6.y
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i9) {
                this.f31253a.C1(i8, dialogInterface, i9);
            }
        }).showDialog();
    }

    public void showTransferTrainDialog() {
        final I4.b bVar = I4.b.getInstance();
        C6637k.getCDialog(K(), 1002, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.srt_manager_dialog_message_transfer_execution)).setButtonListener(new DialogInterface.OnClickListener() { // from class: f6.x
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                this.f31251a.G1(bVar, dialogInterface, i8);
            }
        }).showDialog();
    }

    public void moveToProductList(String str) {
        Intent intent = new Intent(getApplicationContext(), (Class<?>) ExtraProductListActivity.class);
        intent.putExtra("TICKET_PNR_NUMBER", str);
        startActivityForResult(intent, androidx.appcompat.app.g.FEATURE_SUPPORT_ACTION_BAR);
    }
}
