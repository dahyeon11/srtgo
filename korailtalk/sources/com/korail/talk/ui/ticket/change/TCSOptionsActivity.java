package com.korail.talk.ui.ticket.change;

import E4.b;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.myTicket.TicketListDao;
import com.korail.talk.network.dao.refund.TicketDetailDao;
import com.korail.talk.network.dao.ticket.change.CallSelfSeatChgInfoDao;
import com.korail.talk.network.dao.ticket.change.CallSelfSeatChgInfoDao.CallSelfSeatChgInfoDaoRequest;
import com.korail.talk.network.dao.ticket.change.StartStationDto;
import com.korail.talk.network.request.research.SeatSearchRequest;
import com.korail.talk.network.response.seatMovie.RsvInquiryResponse;
import com.korail.talk.network.response.seatMovie.RsvInquiryResponse.TrainInfo;
import com.korail.talk.ui.seat.SeatSearchActivity;
import com.korail.talk.ui.ticket.change.TCSOptionsActivity;
import com.korail.talk.view.CCheckBox;
import com.korail.talk.view.base.BaseViewActivity;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import p4.C6054a;
import r4.o;
import y4.C6536a;
import z4.C6626B;
import z4.C6630d;
import z4.C6637k;

/* loaded from: classes.dex */
public class TCSOptionsActivity extends BaseViewActivity {

    /* renamed from: i, reason: collision with root package name */
    private ArrayList f28947i;

    /* renamed from: j, reason: collision with root package name */
    private TicketListDao.TrainInfo f28948j;

    /* renamed from: k, reason: collision with root package name */
    private int f28949k;

    /* renamed from: l, reason: collision with root package name */
    private Bundle f28950l;

    /* renamed from: m, reason: collision with root package name */
    private Button f28951m;

    /* renamed from: n, reason: collision with root package name */
    private Button f28952n;

    /* renamed from: o, reason: collision with root package name */
    private CCheckBox f28953o;

    /* renamed from: p, reason: collision with root package name */
    private CCheckBox f28954p;

    /* renamed from: r, reason: collision with root package name */
    private View f28956r;

    /* renamed from: s, reason: collision with root package name */
    private View f28957s;

    /* renamed from: t, reason: collision with root package name */
    private LinearLayout f28958t;

    /* renamed from: u, reason: collision with root package name */
    private LinearLayout f28959u;

    /* renamed from: y, reason: collision with root package name */
    private LayoutInflater f28963y;

    /* renamed from: z, reason: collision with root package name */
    private CallSelfSeatChgInfoDao.CallSelfSeatChgInfoResponse f28964z;

    /* renamed from: q, reason: collision with root package name */
    private final AtomicBoolean f28955q = new AtomicBoolean(false);

    /* renamed from: v, reason: collision with root package name */
    private final ArrayList f28960v = new ArrayList();

    /* renamed from: w, reason: collision with root package name */
    private final ArrayList f28961w = new ArrayList();

    /* renamed from: x, reason: collision with root package name */
    private final AtomicBoolean f28962x = new AtomicBoolean(false);

    /* renamed from: A, reason: collision with root package name */
    private final int f28945A = 0;

    /* renamed from: B, reason: collision with root package name */
    protected final String f28946B = C6054a.AFTER_DEPARTURE;

    private View A0(LinearLayout linearLayout, final ArrayList arrayList, String str, Object obj, boolean z8, final boolean z9) {
        View viewInflate = this.f28963y.inflate(AbstractC5957h.list_item_single_select, (ViewGroup) linearLayout, false);
        final CCheckBox cCheckBox = (CCheckBox) viewInflate.findViewById(AbstractC5955f.item_check);
        ((TextView) viewInflate.findViewById(AbstractC5955f.item_text)).setText(str != null ? str : "");
        viewInflate.setTag(obj);
        final boolean z10 = linearLayout.getId() == AbstractC5955f.llStartStation;
        cCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: e6.b
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                this.f30463a.G0(z10, cCheckBox, arrayList, z9, compoundButton, z11);
            }
        });
        viewInflate.setOnClickListener(new View.OnClickListener() { // from class: e6.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TCSOptionsActivity.H0(cCheckBox, view);
            }
        });
        linearLayout.addView(viewInflate);
        arrayList.add(cCheckBox);
        if (z8) {
            cCheckBox.setChecked(true);
        }
        return viewInflate;
    }

    private void B0() {
        CallSelfSeatChgInfoDao callSelfSeatChgInfoDao = new CallSelfSeatChgInfoDao();
        CallSelfSeatChgInfoDao.CallSelfSeatChgInfoDaoRequest callSelfSeatChgInfoDaoRequest = callSelfSeatChgInfoDao.new CallSelfSeatChgInfoDaoRequest();
        callSelfSeatChgInfoDaoRequest.setRunDt(this.f28948j.getH_run_dt());
        callSelfSeatChgInfoDaoRequest.setTrnNo(this.f28948j.getH_trn_no());
        callSelfSeatChgInfoDaoRequest.setDptRsStnCd(this.f28948j.getH_dpt_rs_stn_cd());
        callSelfSeatChgInfoDaoRequest.setArvRsStnCd(this.f28948j.getH_arv_rs_stn_cd());
        String h_psrm_cl_cd = ((TicketDetailDao.TicketDetailResponse) this.f28947i.get(0)).getTicket_infos().getTicket_info().get(0).getH_psrm_cl_cd();
        if (h_psrm_cl_cd.equals(o.GENERAL.getCode()) || h_psrm_cl_cd.equals(o.SPECIAL.getCode())) {
            callSelfSeatChgInfoDaoRequest.setPsrmClCd(h_psrm_cl_cd);
        }
        callSelfSeatChgInfoDao.setRequest(callSelfSeatChgInfoDaoRequest);
        executeDao(callSelfSeatChgInfoDao);
    }

    private String C0() {
        for (int i8 = 0; i8 < this.f28959u.getChildCount(); i8++) {
            View childAt = this.f28959u.getChildAt(i8);
            CCheckBox cCheckBox = (CCheckBox) childAt.findViewById(AbstractC5955f.item_check);
            if (cCheckBox != null && cCheckBox.isChecked()) {
                Object tag = childAt.getTag();
                if (tag != null) {
                    return String.valueOf(tag);
                }
                return null;
            }
        }
        return null;
    }

    private String D0() {
        if (this.f28953o.isChecked()) {
            return "1";
        }
        if (this.f28954p.isChecked()) {
            return "2";
        }
        return null;
    }

    private CallSelfSeatChgInfoDao.ChgStnList E0() {
        for (int i8 = 0; i8 < this.f28958t.getChildCount(); i8++) {
            View childAt = this.f28958t.getChildAt(i8);
            CCheckBox cCheckBox = (CCheckBox) childAt.findViewById(AbstractC5955f.item_check);
            if (cCheckBox != null && cCheckBox.isChecked()) {
                Object tag = childAt.getTag();
                if (tag instanceof CallSelfSeatChgInfoDao.ChgStnList) {
                    return (CallSelfSeatChgInfoDao.ChgStnList) tag;
                }
            }
        }
        return null;
    }

    private RsvInquiryResponse.TrainInfo F0(CallSelfSeatChgInfoDao.ChgStnList chgStnList) {
        RsvInquiryResponse.TrainInfo trainInfo = new RsvInquiryResponse().new TrainInfo();
        trainInfo.setH_run_dt(this.f28964z.getRunDt());
        trainInfo.setH_dpt_dt(chgStnList.getDptDt());
        trainInfo.setH_trn_no(this.f28964z.getTrnNo());
        trainInfo.setH_dpt_rs_stn_cd(chgStnList.getDptRsStnCd());
        trainInfo.setH_arv_rs_stn_cd(this.f28948j.getH_arv_rs_stn_cd());
        trainInfo.setH_dpt_stn_run_ordr(chgStnList.getDptStnRunOrdr());
        trainInfo.setH_arv_stn_run_ordr(this.f28964z.getExsArvStnRunOrdr());
        trainInfo.setH_trn_clsf_nm(this.f28964z.getTrnClsfNm());
        trainInfo.setH_trn_clsf_cd(this.f28964z.getTrnClsfCd());
        trainInfo.setH_trn_gp_cd(this.f28964z.getTrnGpCd());
        trainInfo.setH_seat_att_cd(C6054a.AFTER_DEPARTURE);
        trainInfo.setTotPsgCnt(1);
        return trainInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G0(boolean z8, CCheckBox cCheckBox, ArrayList arrayList, boolean z9, CompoundButton compoundButton, boolean z10) {
        if (this.f28962x.get()) {
            return;
        }
        if (z8 && D0() == null) {
            this.f28962x.set(true);
            cCheckBox.setChecked(false);
            this.f28962x.set(false);
            X0();
            return;
        }
        if (z10) {
            this.f28962x.set(true);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                CCheckBox cCheckBox2 = (CCheckBox) it.next();
                if (cCheckBox2 != compoundButton && cCheckBox2.isChecked()) {
                    cCheckBox2.setChecked(false);
                }
            }
            this.f28962x.set(false);
            return;
        }
        if (z9) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (((CCheckBox) it2.next()).isChecked()) {
                    return;
                }
            }
            this.f28962x.set(true);
            compoundButton.setChecked(true);
            this.f28962x.set(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void H0(CCheckBox cCheckBox, View view) {
        if (cCheckBox.isChecked()) {
            return;
        }
        cCheckBox.setChecked(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I0(View view) {
        if (this.f28953o.isEnabled() && !this.f28953o.isChecked()) {
            this.f28953o.setChecked(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J0(View view) {
        if (this.f28954p.isEnabled() && !this.f28954p.isChecked()) {
            this.f28954p.setChecked(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K0(CompoundButton compoundButton, boolean z8) {
        if (this.f28955q.get()) {
            return;
        }
        if (!z8) {
            if (this.f28953o.isChecked() || this.f28954p.isChecked()) {
                return;
            }
            z0();
            O0();
            return;
        }
        this.f28955q.set(true);
        CCheckBox cCheckBox = this.f28953o;
        if (compoundButton == cCheckBox) {
            this.f28954p.setChecked(false);
        } else if (compoundButton == this.f28954p) {
            cCheckBox.setChecked(false);
        }
        this.f28955q.set(false);
        z0();
        O0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L0(DialogInterface dialogInterface, int i8) {
        finish();
    }

    private void M0(CallSelfSeatChgInfoDao.CallSelfSeatChgInfoResponse callSelfSeatChgInfoResponse) {
        this.f28959u.removeAllViews();
        this.f28961w.clear();
        List<CallSelfSeatChgInfoDao.ChgRsnList> chgRsnList = callSelfSeatChgInfoResponse.getChgRsnList();
        if (chgRsnList == null || chgRsnList.isEmpty()) {
            return;
        }
        for (int i8 = 0; i8 < chgRsnList.size(); i8++) {
            CallSelfSeatChgInfoDao.ChgRsnList chgRsnList2 = chgRsnList.get(i8);
            A0(this.f28959u, this.f28961w, chgRsnList2.getFrcSaleRsnCont(), chgRsnList2.getQryCode(), false, false);
        }
    }

    private void N0(CallSelfSeatChgInfoDao.CallSelfSeatChgInfoResponse callSelfSeatChgInfoResponse) {
        this.f28958t.removeAllViews();
        this.f28960v.clear();
        List<CallSelfSeatChgInfoDao.ChgStnList> chgStnList = callSelfSeatChgInfoResponse.getChgStnList();
        if (chgStnList == null || chgStnList.isEmpty()) {
            return;
        }
        for (int i8 = 0; i8 < chgStnList.size(); i8++) {
            CallSelfSeatChgInfoDao.ChgStnList chgStnList2 = chgStnList.get(i8);
            A0(this.f28958t, this.f28960v, chgStnList2.getDptRsStnNm(), chgStnList2, false, false);
        }
        O0();
    }

    private void O0() {
        String strD0 = D0();
        if (strD0 == null) {
            for (int i8 = 0; i8 < this.f28958t.getChildCount(); i8++) {
                S0(this.f28958t.getChildAt(i8), true);
            }
            return;
        }
        for (int i9 = 0; i9 < this.f28958t.getChildCount(); i9++) {
            View childAt = this.f28958t.getChildAt(i9);
            CCheckBox cCheckBox = (CCheckBox) childAt.findViewById(AbstractC5955f.item_check);
            CallSelfSeatChgInfoDao.ChgStnList chgStnList = (CallSelfSeatChgInfoDao.ChgStnList) childAt.getTag();
            boolean z8 = ("1".equals(strD0) ? P0(chgStnList.getGnrmRestSeatNum()) : "2".equals(strD0) ? P0(chgStnList.getSprmRestSeatNum()) : 0) > 0;
            if (!z8 && cCheckBox.isChecked()) {
                this.f28962x.set(true);
                cCheckBox.setChecked(false);
                this.f28962x.set(false);
            }
            S0(childAt, z8);
        }
    }

    private int P0(String str) {
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            return 0;
        }
    }

    private void Q0() {
        ArrayList arrayList = (ArrayList) getIntent().getSerializableExtra("TICKET_RESPONSE");
        this.f28947i = arrayList;
        this.f28949k = arrayList.size();
        this.f28950l = C6626B.getPassengerBundleData((ArrayList<TicketDetailDao.TicketDetailResponse>) this.f28947i);
        this.f28948j = (TicketListDao.TrainInfo) M(getIntent(), "TICKET_TRAIN_RESPONSE");
    }

    private void R0() {
        this.f28951m.setOnClickListener(this);
        this.f28952n.setOnClickListener(this);
        V0();
        U0();
    }

    private void S0(View view, boolean z8) {
        view.setEnabled(z8);
        view.setClickable(z8);
        view.setAlpha(z8 ? 1.0f : 0.4f);
        CCheckBox cCheckBox = (CCheckBox) view.findViewById(AbstractC5955f.item_check);
        if (cCheckBox != null) {
            cCheckBox.setEnabled(z8);
        }
    }

    private void T0() {
        n0(false);
        this.f28963y = LayoutInflater.from(this);
        this.f28951m = (Button) findViewById(AbstractC5955f.changeBtn);
        this.f28952n = (Button) findViewById(AbstractC5955f.cancelBtn);
        this.f28953o = (CCheckBox) findViewById(AbstractC5955f.cb_gnr);
        this.f28954p = (CCheckBox) findViewById(AbstractC5955f.cb_product);
        this.f28956r = findViewById(AbstractC5955f.row_gnr);
        this.f28957s = findViewById(AbstractC5955f.row_product);
        this.f28958t = (LinearLayout) findViewById(AbstractC5955f.llStartStation);
        this.f28959u = (LinearLayout) findViewById(AbstractC5955f.llReason);
    }

    private void U0() {
        this.f28956r.setOnClickListener(new View.OnClickListener() { // from class: e6.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f30470a.I0(view);
            }
        });
        this.f28957s.setOnClickListener(new View.OnClickListener() { // from class: e6.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f30471a.J0(view);
            }
        });
    }

    private void V0() {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = new CompoundButton.OnCheckedChangeListener() { // from class: e6.a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z8) {
                this.f30462a.K0(compoundButton, z8);
            }
        };
        this.f28953o.setOnCheckedChangeListener(onCheckedChangeListener);
        this.f28954p.setOnCheckedChangeListener(onCheckedChangeListener);
    }

    private void W0(String str) {
        C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(str).setButtonListener(new DialogInterface.OnClickListener() { // from class: e6.d
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                this.f30469a.L0(dialogInterface, i8);
            }
        }).showDialog();
    }

    private void X0() {
        C6637k.getCDialog(this, 1001, 0, getString(AbstractC5959j.dialog_title)).setContent("차실 선택을 먼저 해주세요.").showDialog();
    }

    private void setText() {
        setAppTitle(AbstractC5959j.common_seat_change);
    }

    private void y0(CallSelfSeatChgInfoDao.CallSelfSeatChgInfoResponse callSelfSeatChgInfoResponse) {
        boolean zEqualsIgnoreCase = "0009".equalsIgnoreCase(callSelfSeatChgInfoResponse.getGnrmRsvPsbCd());
        boolean zEqualsIgnoreCase2 = "0009".equalsIgnoreCase(callSelfSeatChgInfoResponse.getSprmRsvPsbCd());
        this.f28953o.setEnabled(zEqualsIgnoreCase);
        this.f28954p.setEnabled(zEqualsIgnoreCase2);
        if (((TicketDetailDao.TicketDetailResponse) this.f28947i.get(0)).getTicket_infos().getTicket_info().get(0).getH_psrm_cl_cd().equals(o.SPECIAL.getCode())) {
            this.f28953o.setEnabled(false);
        }
        if (!zEqualsIgnoreCase && this.f28953o.isChecked()) {
            this.f28953o.setChecked(false);
        }
        if (!zEqualsIgnoreCase2 && this.f28954p.isChecked()) {
            this.f28954p.setChecked(false);
        }
        z0();
        O0();
    }

    private void z0() {
        this.f28962x.set(true);
        for (int i8 = 0; i8 < this.f28958t.getChildCount(); i8++) {
            CCheckBox cCheckBox = (CCheckBox) this.f28958t.getChildAt(i8).findViewById(AbstractC5955f.item_check);
            if (cCheckBox != null && cCheckBox.isChecked()) {
                cCheckBox.setChecked(false);
            }
        }
        this.f28962x.set(false);
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (AbstractC5955f.changeBtn != id) {
            if (AbstractC5955f.cancelBtn == id) {
                finish();
                return;
            } else {
                super.onClick(view);
                return;
            }
        }
        String strD0 = D0();
        CallSelfSeatChgInfoDao.ChgStnList chgStnListE0 = E0();
        String strC0 = C0();
        if (strD0 == null) {
            C6637k.getCDialog(this, 1001, 0, getString(AbstractC5959j.dialog_title)).setContent("차실을 선택하세요.").showDialog();
            return;
        }
        if (chgStnListE0 == null) {
            C6637k.getCDialog(this, 1001, 0, getString(AbstractC5959j.dialog_title)).setContent("좌석변경 시작역을 선택하세요.").showDialog();
            return;
        }
        if (strC0 == null || strC0.length() == 0) {
            C6637k.getCDialog(this, 1001, 0, getString(AbstractC5959j.dialog_title)).setContent("좌석변경 사유를 선택하세요.").showDialog();
            return;
        }
        StartStationDto startStationDto = new StartStationDto();
        startStationDto.seatClass = strD0;
        startStationDto.reasonCode = strC0;
        startStationDto.dptRsStnCd = chgStnListE0.getDptRsStnCd();
        startStationDto.dptRsStnNm = chgStnListE0.getDptRsStnNm();
        startStationDto.dptStnRunOrdr = chgStnListE0.getDptStnRunOrdr();
        startStationDto.dptStnConsOrdr = chgStnListE0.getDptStnConsOrdr();
        startStationDto.arvDt = chgStnListE0.getArvDt();
        startStationDto.arvTm = chgStnListE0.getArvTm();
        startStationDto.dptDt = chgStnListE0.getDptDt();
        startStationDto.dptTm = chgStnListE0.getDptTm();
        startStationDto.gnrmRestSeatNum = chgStnListE0.getGnrmRestSeatNum();
        startStationDto.sprmRestSeatNum = chgStnListE0.getSprmRestSeatNum();
        startStationDto.trnGpCd = this.f28964z.getTrnGpCd();
        startStationDto.trnGpNm = this.f28964z.getTrnGpNm();
        startStationDto.trnClsfCd = this.f28964z.getTrnClsfCd();
        startStationDto.trnClsfNm = this.f28964z.getTrnClsfNm();
        startStationDto.runDt = this.f28964z.getRunDt();
        startStationDto.trnNo = this.f28964z.getTrnNo();
        startStationDto.exsDptStnRunOrdr = this.f28964z.getExsDptStnRunOrdr();
        startStationDto.chgBfDptStnConsOrdr = this.f28964z.getChgBfDptStnConsOrdr();
        startStationDto.exsArvStnRunOrdr = this.f28964z.getExsArvStnRunOrdr();
        startStationDto.chgBfArvStnConsOrdr = this.f28964z.getChgBfArvStnConsOrdr();
        SeatSearchRequest searchRequest = b.getSearchRequest("11", strD0, F0(chgStnListE0));
        searchRequest.setCtlDvCd("3584");
        Intent intent = new Intent(getApplicationContext(), (Class<?>) SeatSearchActivity.class);
        intent.putExtra("TYPE", "TYPE_TCSO_SEAT_CHANGE");
        intent.putExtra("TICKET_RESPONSE", this.f28947i);
        intent.putExtra("SEAT_SEARCH_REQUEST", searchRequest);
        intent.putExtra("TRAIN_INDEX", 0);
        intent.putExtra("TICKET_TRAIN_RESPONSE", (TicketListDao.TrainInfo) M(getIntent(), "TICKET_TRAIN_RESPONSE"));
        intent.putExtra("START_STATION_DTO", startStationDto);
        startActivity(intent);
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_tcsoptions);
        if (C6630d.isNull(bundle)) {
            T0();
            setText();
            Q0();
            R0();
            B0();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        super.onReceive(iBaseDao);
        if (AbstractC5955f.dao_ticket_self_seat_chg_info == iBaseDao.getId()) {
            CallSelfSeatChgInfoDao.CallSelfSeatChgInfoResponse callSelfSeatChgInfoResponse = (CallSelfSeatChgInfoDao.CallSelfSeatChgInfoResponse) ((CallSelfSeatChgInfoDao) iBaseDao).getResponse();
            this.f28964z = callSelfSeatChgInfoResponse;
            if (callSelfSeatChgInfoResponse == null) {
                return;
            }
            y0(callSelfSeatChgInfoResponse);
            N0(this.f28964z);
            M0(this.f28964z);
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceiveError(IBaseDao iBaseDao, C6536a c6536a) {
        super.onReceiveError(iBaseDao, c6536a);
        if (AbstractC5955f.dao_ticket_self_seat_chg_info == iBaseDao.getId()) {
            CallSelfSeatChgInfoDao.CallSelfSeatChgInfoResponse callSelfSeatChgInfoResponse = (CallSelfSeatChgInfoDao.CallSelfSeatChgInfoResponse) iBaseDao.getResponse();
            String str = callSelfSeatChgInfoResponse.gethMsgCd();
            if ("ERR211161".equals(str)) {
                W0(getString(AbstractC5959j.tss_dialog_no_left_seat));
                return;
            }
            if ("ERT800077".equals(str)) {
                W0(getString(AbstractC5959j.tss_dialog_no_left_seat_error));
            } else if ("WRT800176".equals(str)) {
                W0(getString(AbstractC5959j.tss_dialog_no_left_seat_not_time));
            } else {
                W0(callSelfSeatChgInfoResponse.gethMsgTxt());
            }
        }
    }
}
