package com.korail.talk.ui.ticket.ticketReturn;

import I4.c;
import Q7.X;
import android.content.DialogInterface;
import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.addService.AdditionalServiceDao;
import com.korail.talk.network.dao.addService.AdditionalServiceDao.AdditionalServiceRequest;
import com.korail.talk.network.dao.addService.ExtraProductListDao;
import com.korail.talk.network.dao.addService.ExtraProductListDao.ExtraProductListRequest;
import com.korail.talk.network.dao.refund.RefundCommissionDao;
import com.korail.talk.network.dao.refund.RefundCommissionDao.RefundCommissionRequest;
import com.korail.talk.network.dao.refund.RefundDao;
import com.korail.talk.network.dao.refund.TicketDetailDao;
import com.korail.talk.network.data.addService.ExtraProductInfo;
import com.korail.talk.ui.booking.mainBooking.MainBookingActivity;
import com.korail.talk.view.base.BaseViewActivity;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import n4.AbstractC5955f;
import n4.AbstractC5959j;
import p4.C6054a;
import y4.C6536a;
import z4.C6630d;
import z4.C6637k;
import z4.E;
import z4.N;
import z4.t;
import z4.x;

/* loaded from: classes.dex */
public class a extends BaseViewActivity implements LocationListener {

    /* renamed from: p, reason: collision with root package name */
    protected int f29238p;

    /* renamed from: q, reason: collision with root package name */
    private c f29239q;

    /* renamed from: r, reason: collision with root package name */
    protected ArrayList f29240r;

    /* renamed from: s, reason: collision with root package name */
    protected List f29241s;

    /* renamed from: t, reason: collision with root package name */
    protected List f29242t;

    /* renamed from: u, reason: collision with root package name */
    protected TreeMap f29243u;

    /* renamed from: v, reason: collision with root package name */
    protected ArrayList f29244v;

    /* renamed from: w, reason: collision with root package name */
    protected HashMap f29245w;

    /* renamed from: x, reason: collision with root package name */
    protected boolean f29246x;

    /* renamed from: i, reason: collision with root package name */
    private final int f29231i = 3000;

    /* renamed from: j, reason: collision with root package name */
    protected final String f29232j = "AMOUNT";

    /* renamed from: k, reason: collision with root package name */
    protected final String f29233k = "AGE_TYPE";

    /* renamed from: l, reason: collision with root package name */
    protected final String f29234l = "SEAT_NO";

    /* renamed from: m, reason: collision with root package name */
    protected final String f29235m = "START_STATION_NM";

    /* renamed from: n, reason: collision with root package name */
    protected final String f29236n = "ARRIVAL_STATION_NM";

    /* renamed from: o, reason: collision with root package name */
    protected final String f29237o = "SEAT_TOTAL_COUNT";

    /* renamed from: y, reason: collision with root package name */
    private final Handler f29247y = new HandlerC0261a();

    /* renamed from: com.korail.talk.ui.ticket.ticketReturn.a$a, reason: collision with other inner class name */
    class HandlerC0261a extends Handler {
        HandlerC0261a() {
        }

        @Override // android.os.Handler
        public void dispatchMessage(Message message) {
            if (C6630d.isNotNull(a.this.f29239q)) {
                a.this.dismissLoading();
                a.this.f29239q.removeUpdates(a.this);
                a.this.U0();
            }
        }
    }

    private void D0() {
        if (!E.grantedLocationPermissions(K())) {
            t.e("Permission OFF");
            C6637k.getCDialog(K(), 1002, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.ticket_return_permission_message)).setButtonListener(new DialogInterface.OnClickListener() { // from class: l6.e
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    this.f33987a.L0(dialogInterface, i8);
                }
            }).showDialog();
            return;
        }
        this.f29239q.requestLocationUpdates(getApplicationContext(), this);
        if (!this.f29239q.isProviderEnabled()) {
            t.e("GPS OFF");
            C6637k.getCDialog(K(), 1002, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.ticket_return_gps_message)).setButtonListener(new DialogInterface.OnClickListener() { // from class: l6.d
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    this.f33986a.K0(dialogInterface, i8);
                }
            }).showDialog();
            return;
        }
        t.e("GPS ON");
        if (C6630d.isNotNull(this.f29239q.getLocation())) {
            U0();
        } else {
            showLoading(false);
            this.f29247y.sendEmptyMessageDelayed(0, 3000L);
        }
    }

    private String J0() {
        return ((TicketDetailDao.TicketDetailResponse) this.f29240r.get(0)).getH_pnr_no();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K0(DialogInterface dialogInterface, int i8) {
        if (100 == i8) {
            this.f29239q.removeUpdates(this);
        } else if (102 == i8) {
            C6630d.runLocationSourceSettings(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L0(DialogInterface dialogInterface, int i8) {
        if (100 == i8) {
            this.f29239q.removeUpdates(this);
        } else if (102 == i8) {
            C6630d.runApplicationDetailSetting(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M0(DialogInterface dialogInterface, int i8) {
        setResult(-1);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N0(DialogInterface dialogInterface, int i8) {
        if (100 == i8) {
            H0();
        } else if (102 == i8) {
            I0("Y");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O0(DialogInterface dialogInterface, int i8) {
        if (100 == i8) {
            this.f29239q.removeUpdates(this);
            return;
        }
        if (102 == i8) {
            RefundCommissionDao.RefundCommissionResponse refundCommissionResponse = (RefundCommissionDao.RefundCommissionResponse) this.f29241s.get(this.f29238p);
            String prg_psb_flg = refundCommissionResponse.getPrg_psb_flg();
            int integer = N.getInteger(refundCommissionResponse.getUse_psb_mlg_num());
            int commissionAmount = x.getCommissionAmount(this.f29241s);
            if (!prg_psb_flg.equals("M") || integer < commissionAmount) {
                H0();
            } else {
                C6637k.getCDialog(K(), 1002, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.ticket_commission_message, N.getDecimalFormatString(String.valueOf(integer)))).setButtonListener(new DialogInterface.OnClickListener() { // from class: l6.g
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface2, int i9) {
                        this.f33989a.N0(dialogInterface2, i9);
                    }
                }).showDialog();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P0(DialogInterface dialogInterface, int i8) {
        if (100 == i8) {
            H0();
        } else if (102 == i8) {
            I0("Y");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q0(DialogInterface dialogInterface, int i8) {
        if (102 == i8) {
            RefundCommissionDao.RefundCommissionResponse refundCommissionResponse = (RefundCommissionDao.RefundCommissionResponse) this.f29241s.get(this.f29238p);
            String prg_psb_flg = refundCommissionResponse.getPrg_psb_flg();
            int integer = N.getInteger(refundCommissionResponse.getUse_psb_mlg_num());
            int commissionAmount = x.getCommissionAmount(this.f29241s);
            if (!prg_psb_flg.equals("M") || integer < commissionAmount) {
                H0();
            } else {
                C6637k.getCDialog(K(), 1002, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.ticket_commission_message, N.getDecimalFormatString(String.valueOf(integer)))).setButtonListener(new DialogInterface.OnClickListener() { // from class: l6.f
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface2, int i9) {
                        this.f33988a.P0(dialogInterface2, i9);
                    }
                }).showDialog();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R0(DialogInterface dialogInterface, int i8) {
        Intent intent = new Intent(getApplicationContext(), (Class<?>) MainBookingActivity.class);
        intent.addFlags(603979776);
        startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S0(DialogInterface dialogInterface, int i8) {
        if (100 == i8) {
            C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_buy_miss_title)).setContent(getString(AbstractC5959j.dialog_buy_miss_msg)).setButtonListener(new DialogInterface.OnClickListener() { // from class: l6.i
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface2, int i9) {
                    this.f33991a.R0(dialogInterface2, i9);
                }
            }).showDialog();
        } else if (102 == i8) {
            U0();
        }
    }

    private void T0() {
        this.f29239q = new c();
        this.f29240r = (ArrayList) M(getIntent(), "TICKET_RESPONSE");
        this.f29238p = 0;
        this.f29241s = new ArrayList();
        this.f29242t = new ArrayList();
        this.f29243u = new TreeMap();
        this.f29244v = new ArrayList();
        this.f29245w = new HashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U0() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f29243u.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((TicketDetailDao.TicketDetailResponse) ((Map.Entry) it.next()).getValue());
        }
        String commissionMessage = x.getCommissionMessage(getApplicationContext(), this.f29241s, arrayList);
        RefundCommissionDao.RefundCommissionResponse refundCommissionResponse = (RefundCommissionDao.RefundCommissionResponse) this.f29241s.get(0);
        TicketDetailDao.TicketDetailResponse ticketDetailResponse = (TicketDetailDao.TicketDetailResponse) arrayList.get(0);
        if (C6054a.BEFORE_DEPARTURE.equalsIgnoreCase(refundCommissionResponse.getTk_ret_tms_dv_cd()) || "13".equals(ticketDetailResponse.getH_tk_knd_cd())) {
            C6637k.getCDialog(K(), 1002, 0, getString(AbstractC5959j.dialog_title)).setContent(commissionMessage).setButtonNames(N.getStringArray(getString(AbstractC5959j.ticket_refund_cancel), getString(AbstractC5959j.ticket_refund_complete))).setButtonListener(new DialogInterface.OnClickListener() { // from class: l6.a
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    this.f33983a.O0(dialogInterface, i8);
                }
            }).showDialog();
        } else {
            C6637k.getCDialog(K(), 1005, 0, getString(AbstractC5959j.dialog_title)).setContent(commissionMessage).setCheckBoxMessage(getString(AbstractC5959j.dialog_checkbox_message_agree)).setButtonNames(N.getStringArray(getString(AbstractC5959j.ticket_refund_cancel), getString(AbstractC5959j.ticket_refund_complete))).setButtonListener(new DialogInterface.OnClickListener() { // from class: l6.b
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    this.f33984a.Q0(dialogInterface, i8);
                }
            }).showDialog();
        }
    }

    private void V0(RefundCommissionDao.RefundCommissionResponse refundCommissionResponse) {
        if (refundCommissionResponse.gethMsgCd().equals("WRT800078") || refundCommissionResponse.getH_msg_cd2().equals("WRT800078")) {
            C6637k.getCDialog(K(), 1005, 0, getString(AbstractC5959j.dialog_title)).setContent(refundCommissionResponse.gethMsgCd().equals("WRT800078") ? refundCommissionResponse.gethMsgTxt() : refundCommissionResponse.getH_msg_txt2()).setCheckBoxMessage(getString(AbstractC5959j.dialog_checkbox_confirm)).setButtonNames(N.getStringArray(getString(AbstractC5959j.dialog_button_repurchase), getString(AbstractC5959j.dialog_button_return))).setButtonListener(new DialogInterface.OnClickListener() { // from class: l6.h
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    this.f33990a.S0(dialogInterface, i8);
                }
            }).showDialog();
        } else {
            U0();
        }
    }

    protected void E0() {
        ExtraProductListDao extraProductListDao = new ExtraProductListDao();
        ExtraProductListDao.ExtraProductListRequest extraProductListRequest = extraProductListDao.new ExtraProductListRequest();
        extraProductListRequest.setPnrNo(J0());
        extraProductListDao.setRequest(extraProductListRequest);
        executeDao(extraProductListDao);
    }

    protected void F0() {
        AdditionalServiceDao additionalServiceDao = new AdditionalServiceDao();
        AdditionalServiceDao.AdditionalServiceRequest additionalServiceRequest = additionalServiceDao.new AdditionalServiceRequest();
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator it = this.f29245w.keySet().iterator();
        while (it.hasNext()) {
            arrayList.add(((ExtraProductInfo.AddSrvInfo) this.f29245w.get((Integer) it.next())).getAddSrvReqNo());
        }
        additionalServiceRequest.setPnrNo(J0());
        additionalServiceRequest.setJrnySqno("0");
        additionalServiceRequest.setJobDbCd("C");
        additionalServiceRequest.setCncTgtCnt(this.f29245w.size());
        additionalServiceRequest.setAddSrvReqNo(arrayList);
        additionalServiceDao.setRequest(additionalServiceRequest);
        executeDao(additionalServiceDao);
    }

    protected void G0() {
        ArrayList arrayList = this.f29244v;
        int i8 = this.f29238p;
        this.f29238p = i8 + 1;
        Integer num = (Integer) arrayList.get(i8);
        num.intValue();
        TicketDetailDao.TicketDetailResponse ticketDetailResponse = (TicketDetailDao.TicketDetailResponse) this.f29243u.get(num);
        RefundCommissionDao refundCommissionDao = new RefundCommissionDao();
        RefundCommissionDao.RefundCommissionRequest refundCommissionRequest = refundCommissionDao.new RefundCommissionRequest();
        refundCommissionRequest.setH_orgtk_wct_no(ticketDetailResponse.getH_orgtk_wct_no());
        refundCommissionRequest.setH_orgtk_ret_sale_dt(ticketDetailResponse.getH_orgtk_ret_sale_dt());
        refundCommissionRequest.setH_orgtk_sale_sqno(ticketDetailResponse.getH_orgtk_sale_sqno());
        refundCommissionRequest.setH_orgtk_ret_pwd(ticketDetailResponse.getH_orgtk_ret_pwd());
        refundCommissionRequest.setH_comp_nm(ticketDetailResponse.getH_compa_nm());
        refundCommissionRequest.setH_comp_cert_no(ticketDetailResponse.getH_compa_brth());
        refundCommissionDao.setRequest(refundCommissionRequest);
        executeDao(refundCommissionDao);
    }

    protected void H0() {
        I0("N");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void I0(java.lang.String r9) {
        /*
            r8 = this;
            java.util.ArrayList r0 = r8.f29240r
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.korail.talk.network.dao.refund.TicketDetailDao$TicketDetailResponse r0 = (com.korail.talk.network.dao.refund.TicketDetailDao.TicketDetailResponse) r0
            com.korail.talk.network.dao.refund.TicketDetailDao$TicketInfos r0 = r0.getTicket_infos()
            java.util.List r0 = r0.getTicket_info()
            java.lang.Object r0 = r0.get(r1)
            com.korail.talk.network.dao.refund.TicketDetailDao$TicketInfo r0 = (com.korail.talk.network.dao.refund.TicketDetailDao.TicketInfo) r0
            java.lang.String r0 = r0.getH_trn_no()
            I4.c r1 = r8.f29239q
            boolean r1 = z4.C6630d.isNotNull(r1)
            if (r1 == 0) goto L40
            I4.c r1 = r8.f29239q
            android.location.Location r1 = r1.getLocation()
            boolean r2 = z4.C6630d.isNotNull(r1)
            if (r2 == 0) goto L40
            double r2 = r1.getLatitude()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            double r3 = r1.getLongitude()
            java.lang.String r1 = java.lang.String.valueOf(r3)
            goto L43
        L40:
            java.lang.String r2 = ""
            r1 = r2
        L43:
            java.util.ArrayList r3 = r8.f29244v
            int r4 = r8.f29238p
            java.lang.Object r3 = r3.get(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            r3.intValue()
            java.util.TreeMap r4 = r8.f29243u
            java.lang.Object r3 = r4.get(r3)
            com.korail.talk.network.dao.refund.TicketDetailDao$TicketDetailResponse r3 = (com.korail.talk.network.dao.refund.TicketDetailDao.TicketDetailResponse) r3
            com.korail.talk.network.dao.refund.RefundDao r4 = new com.korail.talk.network.dao.refund.RefundDao
            r4.<init>()
            com.korail.talk.network.dao.refund.RefundDao$RefundRequest r5 = new com.korail.talk.network.dao.refund.RefundDao$RefundRequest
            r5.<init>()
            java.lang.String r6 = r3.getH_pnr_no()
            r5.setTxtPnrNo(r6)
            java.lang.String r6 = r3.getH_sale_dt()
            r5.setH_orgtk_sale_dt(r6)
            java.lang.String r6 = r3.getH_orgtk_wct_no()
            r5.setH_orgtk_wct_no(r6)
            java.lang.String r6 = r3.getH_orgtk_sale_sqno()
            r5.setH_orgtk_sale_sqno(r6)
            java.lang.String r6 = r3.getH_orgtk_ret_pwd()
            r5.setH_orgtk_ret_pwd(r6)
            r5.setH_mlg_stl(r9)
            java.util.List r9 = r8.f29241s
            int r6 = r8.f29238p
            int r7 = r6 + 1
            r8.f29238p = r7
            java.lang.Object r9 = r9.get(r6)
            com.korail.talk.network.dao.refund.RefundCommissionDao$RefundCommissionResponse r9 = (com.korail.talk.network.dao.refund.RefundCommissionDao.RefundCommissionResponse) r9
            java.lang.String r9 = r9.getTk_ret_tms_dv_cd()
            r5.setTk_ret_tms_dv_cd(r9)
            r5.setTrnNo(r0)
            java.lang.String r9 = r3.getH_pbp_acep_tgt_flg()
            r5.setPbpAcepTgtFlg(r9)
            r5.setLatitude(r2)
            r5.setLongitude(r1)
            r4.setRequest(r5)
            r8.executeDao(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.korail.talk.ui.ticket.ticketReturn.a.I0(java.lang.String):void");
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i8, int i9, Intent intent) {
        t.e("onActivityResult " + i8 + X.SPACE + i9);
        super.onActivityResult(i8, i9, intent);
        if (i8 == 110 || i8 == 111) {
            D0();
        }
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, android.view.View.OnClickListener
    public void onClick(View view) {
        O(view);
        if (AbstractC5955f.returnBtn != view.getId()) {
            super.onClick(view);
            return;
        }
        this.f29241s.clear();
        this.f29238p = 0;
        this.f29246x = false;
        if (this.f29243u.size() <= 0) {
            F0();
        } else {
            Collections.sort(this.f29244v);
            G0();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        if (C6630d.isNull(bundle)) {
            T0();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.appcompat.app.e, androidx.fragment.app.ActivityC1010e, android.app.Activity
    protected void onDestroy() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (C6630d.isNotNull(this.f29239q)) {
            this.f29239q.removeUpdates(this);
        }
        super.onDestroy();
    }

    @Override // android.location.LocationListener
    public void onLocationChanged(Location location) {
        t.e("");
        if (C6630d.isNotNull(this.f29239q)) {
            boolean zIsNull = C6630d.isNull(this.f29239q.getLocation());
            dismissLoading();
            this.f29247y.removeMessages(0);
            this.f29239q.setLocation(location);
            if (zIsNull) {
                U0();
            }
        }
    }

    @Override // android.location.LocationListener
    public void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    public void onProviderEnabled(String str) {
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        super.onReceive(iBaseDao);
        int id = iBaseDao.getId();
        if (AbstractC5955f.dao_ticket_commition == id) {
            int size = this.f29243u.size();
            RefundCommissionDao.RefundCommissionResponse refundCommissionResponse = (RefundCommissionDao.RefundCommissionResponse) iBaseDao.getResponse();
            this.f29241s.add(refundCommissionResponse);
            if (this.f29238p < size) {
                G0();
                return;
            }
            this.f29238p = 0;
            if (C6054a.BEFORE_DEPARTURE.equals(refundCommissionResponse.getTk_ret_tms_dv_cd())) {
                V0(refundCommissionResponse);
                return;
            } else {
                D0();
                return;
            }
        }
        if (AbstractC5955f.dao_ticket_return == id) {
            RefundDao.RefundRequest refundRequest = (RefundDao.RefundRequest) iBaseDao.getRequest();
            Iterator<RefundDao.StlList> it = ((RefundDao.RefundResponse) iBaseDao.getResponse()).getStlList().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if ("13".equals(it.next().getStl_mns_cd())) {
                    this.f29246x = true;
                    break;
                }
            }
            if (this.f29238p < this.f29243u.size()) {
                I0(refundRequest.getH_mlg_stl());
                return;
            }
            if (this.f29246x) {
                C6630d.syncRailPlus(getApplicationContext());
            }
            C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.ticket_handling_return_refund_complete)).setContent(getString(AbstractC5959j.ticket_handling_return_refund_complete_content)).setButtonListener(new DialogInterface.OnClickListener() { // from class: l6.c
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    this.f33985a.M0(dialogInterface, i8);
                }
            }).showDialog();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceiveError(IBaseDao iBaseDao, C6536a c6536a) {
        super.onReceiveError(iBaseDao, c6536a);
        if (AbstractC5955f.dao_ticket_return == iBaseDao.getId() && this.f29246x) {
            C6630d.syncRailPlus(getApplicationContext());
        }
    }

    @Override // android.location.LocationListener
    public void onStatusChanged(String str, int i8, Bundle bundle) {
    }
}
