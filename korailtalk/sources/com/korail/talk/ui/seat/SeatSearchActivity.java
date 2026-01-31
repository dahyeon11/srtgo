package com.korail.talk.ui.seat;

import J2.f;
import Q7.X;
import T4.e;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Property;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.material.snackbar.Snackbar;
import com.korail.talk.application.KTApplication;
import com.korail.talk.data.reservation.DReservationData;
import com.korail.talk.data.reservation.ReservationMessageData;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.myTicket.TicketListDao;
import com.korail.talk.network.dao.refund.TicketDetailDao;
import com.korail.talk.network.dao.research.OgTkInquiryDao;
import com.korail.talk.network.dao.research.OgTkInquiryDao.OgTkInquiryRequest;
import com.korail.talk.network.dao.research.SearchCarListDao;
import com.korail.talk.network.dao.research.SearchSeatListDao;
import com.korail.talk.network.dao.reservation.TCReservationDao;
import com.korail.talk.network.dao.ticket.change.StartStationDto;
import com.korail.talk.network.data.reservation.RJrny;
import com.korail.talk.network.data.reservation.ROrtg;
import com.korail.talk.network.data.reservation.RSeat;
import com.korail.talk.network.data.reservation.RSrcar;
import com.korail.talk.network.data.reservation.old.OSrcar;
import com.korail.talk.network.request.research.SeatSearchRequest;
import com.korail.talk.network.response.certification.ReservationResponse;
import com.korail.talk.network.response.seatMovie.RsvInquiryResponse;
import com.korail.talk.network.response.seatMovie.RsvInquiryResponse.TrainInfo;
import com.korail.talk.ui.reservation.confirm.activity.DReservationConfirmActivity;
import com.korail.talk.ui.seat.a;
import com.korail.talk.ui.ticket.confirm.TicketSelfCheckinStatusActivity;
import com.korail.talk.ui.web.IntegrationWebViewActivity;
import com.korail.talk.ui.web.TrainServiceInfoWebViewActivity;
import com.korail.talk.view.base.BaseViewActivity;
import com.korail.talk.viewGroup.DropDownSelector;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import n4.AbstractC5953d;
import n4.AbstractC5954e;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import q4.C6111b;
import r4.d;
import r4.i;
import r4.k;
import r4.p;
import r4.r;
import y4.C6536a;
import z4.C6625A;
import z4.C6626B;
import z4.C6630d;
import z4.C6637k;
import z4.N;
import z4.t;

/* loaded from: classes.dex */
public class SeatSearchActivity extends BaseViewActivity implements DropDownSelector.b, a.InterfaceC0245a {

    /* renamed from: A */
    private TextView f28625A;

    /* renamed from: B */
    private TextView f28626B;

    /* renamed from: C */
    private Button f28627C;

    /* renamed from: E */
    private List f28629E;

    /* renamed from: F */
    private Snackbar f28630F;

    /* renamed from: G */
    private ArrayList f28631G;

    /* renamed from: H */
    private e f28632H;

    /* renamed from: l */
    private String f28640l;

    /* renamed from: m */
    private SeatSearchRequest f28641m;

    /* renamed from: n */
    private int f28642n;

    /* renamed from: o */
    private SearchCarListDao.SearchCarListResponse f28643o;

    /* renamed from: p */
    private boolean f28644p;

    /* renamed from: q */
    private ObjectAnimator f28645q;

    /* renamed from: r */
    private DropDownSelector f28646r;

    /* renamed from: s */
    private TextView f28647s;

    /* renamed from: t */
    private TextView f28648t;

    /* renamed from: u */
    private Button f28649u;

    /* renamed from: v */
    private Button f28650v;

    /* renamed from: w */
    private ImageView f28651w;

    /* renamed from: x */
    private ScrollView f28652x;

    /* renamed from: y */
    private com.korail.talk.ui.seat.a f28653y;

    /* renamed from: z */
    private ViewGroup f28654z;

    /* renamed from: i */
    private final int f28637i = 0;

    /* renamed from: j */
    private final int f28638j = 1;

    /* renamed from: k */
    private final String f28639k = X.SPACE;

    /* renamed from: D */
    private boolean f28628D = true;

    /* renamed from: I */
    private String f28633I = "";

    /* renamed from: J */
    private String f28634J = "";

    /* renamed from: K */
    private String f28635K = "";

    /* renamed from: L */
    private String f28636L = "";

    class a implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ int f28655a;

        a(int i8) {
            this.f28655a = i8;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            SeatSearchActivity.this.f28654z.clearAnimation();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            SeatSearchActivity.this.f28644p = this.f28655a == 0;
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SeatSearchActivity.this.f28630F.dismiss();
        }
    }

    private void A0(int i8) {
        this.f28641m.setTxtSrcarNo(i8);
        if (this.f28641m.getCtlDvCd() != null) {
            SeatSearchRequest seatSearchRequest = this.f28641m;
            seatSearchRequest.setCtlDvCd(seatSearchRequest.getCtlDvCd());
        } else {
            this.f28641m.setCtlDvCd("");
        }
        SearchSeatListDao searchSeatListDao = new SearchSeatListDao();
        searchSeatListDao.setRequest(this.f28641m);
        searchSeatListDao.setNotShowDialog(true);
        searchSeatListDao.setFinishView(true);
        executeDao(searchSeatListDao);
    }

    private TCReservationDao.TCReservationRequest B0(OgTkInquiryDao.OgTkInquiryResponse ogTkInquiryResponse, e eVar) {
        return D4.b.getTicketChangeReservationRequest(ogTkInquiryResponse, eVar, null);
    }

    private int C0(SearchCarListDao.SearchCarListResponse searchCarListResponse) throws NumberFormatException {
        StartStationDto startStationDto = (StartStationDto) getIntent().getSerializableExtra("START_STATION_DTO");
        int hRcmdSrcarNo = searchCarListResponse.getHRcmdSrcarNo();
        List<SearchCarListDao.CarInfo> srcarInfoList = searchCarListResponse.getSrcar_infos().getSrcarInfoList();
        if (startStationDto != null && startStationDto.seatClass.equals(((TicketDetailDao.TicketDetailResponse) this.f28631G.get(0)).getTicket_infos().getTicket_info().get(0).getH_psrm_cl_cd())) {
            int i8 = Integer.parseInt(((TicketDetailDao.TicketDetailResponse) this.f28631G.get(0)).getTicket_infos().getTicket_info().get(0).getTk_seat_info().get(0).getH_srcar_no());
            int i9 = 0;
            while (true) {
                if (i9 >= srcarInfoList.size()) {
                    break;
                }
                if (i8 == srcarInfoList.get(i9).getHSrcarNo()) {
                    hRcmdSrcarNo = i8;
                    break;
                }
                i9++;
            }
        }
        for (int i10 = 0; i10 < srcarInfoList.size(); i10++) {
            if (hRcmdSrcarNo == srcarInfoList.get(i10).getHSrcarNo()) {
                return i10;
            }
        }
        return 0;
    }

    private String[] D0(SearchCarListDao.CarInfo carInfo) {
        return E0(carInfo, carInfo.getH_rest_seat_cnt());
    }

    private String[] E0(SearchCarListDao.CarInfo carInfo, int i8) {
        String[] strArr = new String[2];
        strArr[0] = getString(AbstractC5959j.seat_search_srcar, Integer.valueOf(carInfo.getHSrcarNo()), Integer.valueOf(i8));
        List<SearchCarListDao.SeatAttInfo> seatAttInfoList = carInfo.getSeatAttInfoList();
        if (C6630d.isNull(seatAttInfoList) || seatAttInfoList.size() == 0) {
            strArr[1] = "";
        } else {
            StringBuilder sb = new StringBuilder();
            for (SearchCarListDao.SeatAttInfo seatAttInfo : seatAttInfoList) {
                if (sb.length() > 0) {
                    sb.append(" / ");
                }
                sb.append(seatAttInfo.getSeatAttNm());
            }
            strArr[1] = sb.toString();
        }
        return strArr;
    }

    private int F0() {
        return this.f28641m.getTxtSrcarNo();
    }

    private int G0() {
        if (r.ONDOL.getCode().equals(this.f28641m.getTxtSeatAttCd())) {
            return 6;
        }
        return this.f28641m.getTxtTotPsgCnt();
    }

    private boolean H0(SearchSeatListDao.SearchSeatListResponse searchSeatListResponse) {
        List<SearchSeatListDao.Seat> seatList = searchSeatListResponse.getSeatList();
        int i8 = 0;
        for (int i9 = 0; i9 < 40 && i9 < seatList.size(); i9++) {
            SearchSeatListDao.Seat seat = seatList.get(i9);
            if (E4.a.isEmptyView(seat) || E4.a.isArrowView(seat)) {
                i8++;
            }
        }
        return i8 == 40;
    }

    public /* synthetic */ void I0(DialogInterface dialogInterface, int i8) {
        finish();
    }

    public /* synthetic */ void J0(boolean z8) {
        if (z8) {
            this.f28652x.scrollTo(0, (int) (this.f28653y.mSeatH * 9.5d));
        } else {
            this.f28652x.scrollTo(0, 0);
        }
    }

    public /* synthetic */ void K0(String str, View view) {
        Intent intent = new Intent(getApplicationContext(), (Class<?>) IntegrationWebViewActivity.class);
        intent.putExtra("WEB_POST_URL", str);
        startActivity(intent);
    }

    private void L0(TCReservationDao.TCReservationRequest tCReservationRequest, ReservationResponse reservationResponse) {
        tCReservationRequest.setPrcFareReCalcFlg("Y");
        tCReservationRequest.setTmpJobSqno(reservationResponse.getH_pnr_no());
        DReservationData dReservationData = new DReservationData();
        dReservationData.setPaymentType(i.PAYMENT_TICKET_CHANGE);
        dReservationData.setPaymentRequest(C4.b.getSelfSeatIntgStlRequest(reservationResponse));
        dReservationData.setTcReservationRequest(tCReservationRequest);
        dReservationData.setReservationType(k.TICKET_CHANGE);
        ArrayList arrayList = new ArrayList();
        arrayList.add(reservationResponse);
        dReservationData.setReservationResponseList(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ReservationMessageData reservationMessageData = new ReservationMessageData();
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add("좌석변경은 1회만 가능하며 변경 후 취소는 불가합니다.");
        reservationMessageData.setMessageList(arrayList3);
        arrayList2.add(reservationMessageData);
        dReservationData.setReservationMessageDataList(arrayList2);
        Intent intent = new Intent(getApplicationContext(), (Class<?>) DReservationConfirmActivity.class);
        intent.putExtra("RESERVATION_DATA", dReservationData);
        intent.putExtra("SELF_SEAT_RESERVATION_DATA", true);
        startActivityForResult(intent, 119);
    }

    private void M0() {
        RsvInquiryResponse.TrainInfo trainInfo = new RsvInquiryResponse().new TrainInfo();
        trainInfo.setH_run_dt(this.f28641m.getTxtRunDt());
        trainInfo.setH_trn_no(this.f28641m.getTxtTrnNo());
        trainInfo.setH_trn_clsf_nm(this.f28641m.getTrnClsfNm());
        trainInfo.setH_dpt_rs_stn_nm(C6111b.getInstance().getStationDataByCode(this.f28641m.getTxtDptRsStnCd()).getStnNm());
        trainInfo.setH_arv_rs_stn_nm(C6111b.getInstance().getStationDataByCode(this.f28641m.getTxtArvRsStnCd()).getStnNm());
        Intent intent = new Intent(getApplicationContext(), (Class<?>) TrainServiceInfoWebViewActivity.class);
        intent.putExtra("TRAIN_INFO", trainInfo);
        startActivity(intent);
    }

    private void N0() {
        this.f28640l = getIntent().getStringExtra("TYPE");
        this.f28641m = (SeatSearchRequest) M(getIntent(), "SEAT_SEARCH_REQUEST");
        this.f28642n = getIntent().getIntExtra("TRAIN_INDEX", 0);
        this.f28631G = (ArrayList) getIntent().getSerializableExtra("TICKET_RESPONSE");
    }

    private void O0(SearchCarListDao.SearchCarListResponse searchCarListResponse) {
        SearchCarListDao.CarInfos srcar_infos = searchCarListResponse.getSrcar_infos();
        List<SearchCarListDao.CarInfo> srcarInfoList = C6630d.isNull(srcar_infos) ? null : srcar_infos.getSrcarInfoList();
        if (C6630d.isNull(srcarInfoList) || srcarInfoList.isEmpty()) {
            C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.seat_select_no_enable_seat)).setButtonListener(new DialogInterface.OnClickListener() { // from class: S5.e
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    this.f4665a.I0(dialogInterface, i8);
                }
            }).showDialog();
            return;
        }
        this.f28643o = searchCarListResponse;
        ArrayList arrayList = new ArrayList();
        this.f28629E = new ArrayList();
        Iterator<SearchCarListDao.CarInfo> it = srcarInfoList.iterator();
        while (it.hasNext()) {
            String[] strArrD0 = D0(it.next());
            arrayList.add(strArrD0[0]);
            this.f28629E.add(strArrD0[1]);
        }
        this.f28646r.setEntries(C6625A.toArray(arrayList), C6625A.toArray(this.f28629E), 0);
        this.f28646r.setDropDownIndex(C0(searchCarListResponse));
    }

    private void P0() {
        this.f28646r.setOnSelectorItemClickListener(this);
        this.f28649u.setOnClickListener(this);
        this.f28650v.setOnClickListener(this);
        this.f28627C.setOnClickListener(this);
    }

    private void Q0() {
        int selectIndex = this.f28646r.getSelectIndex();
        int itemSize = this.f28646r.getItemSize();
        if (itemSize == 1) {
            this.f28649u.setVisibility(4);
            this.f28650v.setVisibility(4);
            return;
        }
        if (selectIndex == 0) {
            String[] strArrSplit = this.f28646r.getSelectItem(selectIndex + 1).split(X.SPACE);
            this.f28649u.setVisibility(4);
            this.f28650v.setText(strArrSplit[0]);
            this.f28650v.setVisibility(0);
            return;
        }
        if (selectIndex == itemSize - 1) {
            this.f28649u.setText(this.f28646r.getSelectItem(selectIndex - 1).split(X.SPACE)[0]);
            this.f28649u.setVisibility(0);
            this.f28650v.setVisibility(4);
            return;
        }
        String[] strArrSplit2 = this.f28646r.getSelectItem(selectIndex - 1).split(X.SPACE);
        String[] strArrSplit3 = this.f28646r.getSelectItem(selectIndex + 1).split(X.SPACE);
        this.f28649u.setText(strArrSplit2[0]);
        this.f28649u.setVisibility(0);
        this.f28650v.setText(strArrSplit3[0]);
        this.f28650v.setVisibility(0);
    }

    private void R0(OgTkInquiryDao.OgTkInquiryResponse ogTkInquiryResponse) {
        int size = ogTkInquiryResponse.getOrgTkList().size();
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < size; i15++) {
            this.f28634J = ogTkInquiryResponse.getOrgTkList().get(i15).getRcvdAmt();
            for (int i16 = 0; i16 < ogTkInquiryResponse.getOrgTkList().get(i15).getJrnyList().get(0).getSeatList().size(); i16++) {
                this.f28633I = ogTkInquiryResponse.getOrgTkList().get(i15).getJrnyList().get(0).getSeatList().get(i16).getPsrmClCd();
            }
            for (int i17 = 0; i17 < ogTkInquiryResponse.getOrgTkList().get(i15).getCmpnList().size(); i17++) {
                String psgTpDvCd = ogTkInquiryResponse.getOrgTkList().get(i15).getCmpnList().get(i17).getPsgTpDvCd();
                String dcntKndCd = ogTkInquiryResponse.getOrgTkList().get(i15).getCmpnList().get(i17).getDcntKndCd();
                if ("1".equals(psgTpDvCd)) {
                    if ("204".equals(dcntKndCd)) {
                        i11++;
                    } else if ("205".equals(dcntKndCd)) {
                        i12++;
                    } else if ("206".equals(dcntKndCd)) {
                        i13++;
                    } else {
                        i8++;
                    }
                } else if ("3".equals(psgTpDvCd)) {
                    if ("202".equals(dcntKndCd)) {
                        i10++;
                    } else {
                        i9++;
                    }
                }
                i14++;
            }
        }
        Bundle bundle = new Bundle();
        bundle.putInt("ADULT_COUNT", i8);
        bundle.putInt("TEENAGER_COUNT", 0);
        bundle.putInt("CHILD_COUNT", i9);
        bundle.putInt("CHILD_ACCOMPANY_COUNT", i10);
        bundle.putInt("SENIOR_COUNT", i11);
        bundle.putInt("HIGH_DISABLE_COUNT", i12);
        bundle.putInt("LOW_DISABLE_COUNT", i13);
        bundle.putInt("GUIDE_DOG_COUNT", 0);
        bundle.putInt("TOTAL_PERSON_COUNT", i14);
        this.f28632H = new e(this, bundle);
    }

    private void S0(SearchSeatListDao.SearchSeatListResponse searchSeatListResponse) {
        int selectIndex = this.f28646r.getSelectIndex();
        int seat_remain_count = searchSeatListResponse.getSeat_remain_count();
        String[] strArrE0 = E0(this.f28643o.getSrcar_infos().getSrcarInfoList().get(selectIndex), seat_remain_count);
        this.f28646r.setEntries(strArrE0[0], strArrE0[1], selectIndex);
        this.f28648t.setText(getString(AbstractC5959j.seat_search_remain, Integer.valueOf(seat_remain_count), Integer.valueOf(searchSeatListResponse.getSeat_total_count())));
    }

    private void T0(SearchSeatListDao.SearchSeatListResponse searchSeatListResponse) {
        S0(searchSeatListResponse);
        U0(searchSeatListResponse);
        X0(searchSeatListResponse.getVrBnrUrl());
        onSeatSelectionChanged();
        Z0();
        findViewById(AbstractC5955f.v_seat_search).setVisibility(0);
    }

    private void U0(SearchSeatListDao.SearchSeatListResponse searchSeatListResponse) {
        com.korail.talk.ui.seat.a aVar = new com.korail.talk.ui.seat.a(K(), searchSeatListResponse, G0());
        this.f28653y = aVar;
        aVar.setOnSeatSelectChangeListener(this);
        final boolean zH0 = H0(searchSeatListResponse);
        this.f28652x.removeAllViews();
        this.f28652x.addView(this.f28653y);
        this.f28652x.post(new Runnable() { // from class: S5.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f4663a.J0(zH0);
            }
        });
    }

    private void V0(int i8) {
        PropertyValuesHolder propertyValuesHolderOfFloat;
        if (C6630d.isNotNull(this.f28645q) && !this.f28644p) {
            this.f28645q.cancel();
        }
        if (i8 != 0 || this.f28644p) {
            propertyValuesHolderOfFloat = 1 == i8 ? PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, this.f28627C.getHeight()) : null;
        } else {
            this.f28654z.setTranslationY(this.f28627C.getHeight());
            propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, 0.0f);
        }
        if (C6630d.isNotNull(propertyValuesHolderOfFloat)) {
            ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.f28654z, propertyValuesHolderOfFloat);
            this.f28645q = objectAnimatorOfPropertyValuesHolder;
            objectAnimatorOfPropertyValuesHolder.setDuration(400L);
            this.f28645q.addListener(new a(i8));
        }
        this.f28645q.start();
    }

    private void W0() {
        String string = getString(AbstractC5959j.common_s, this.f28641m.getTrnClsfNm(), this.f28643o.getHTrnNo());
        String h_psrm_cl_nm = this.f28643o.getSrcar_infos().getSrcarInfoList().get(0).getH_psrm_cl_nm();
        if (r.ONDOL.getCode().equals(this.f28641m.getTxtSeatAttCd())) {
            h_psrm_cl_nm = getString(AbstractC5959j.seat_select_ondol_room);
        }
        this.f28647s.setText(getString(AbstractC5959j.common_s, string, getString(AbstractC5959j.common_bracket, h_psrm_cl_nm)));
    }

    private void X0(final String str) {
        if (!N.isNotNull(str)) {
            this.f28651w.setVisibility(8);
        } else {
            this.f28651w.setVisibility(0);
            this.f28651w.setOnClickListener(new View.OnClickListener() { // from class: S5.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f4661a.K0(str, view);
                }
            });
        }
    }

    private void Y0() {
        this.f28646r = (DropDownSelector) findViewById(AbstractC5955f.dds_seat_search);
        this.f28647s = (TextView) findViewById(AbstractC5955f.tv_seat_search_train_info);
        this.f28648t = (TextView) findViewById(AbstractC5955f.tv_seat_search_remaining);
        this.f28649u = (Button) findViewById(AbstractC5955f.btn_seat_search_prev);
        this.f28650v = (Button) findViewById(AbstractC5955f.btn_seat_search_next);
        this.f28651w = (ImageView) findViewById(AbstractC5955f.iv_seat_vr);
        this.f28652x = (ScrollView) findViewById(AbstractC5955f.sv_seat_search);
        this.f28654z = (ViewGroup) findViewById(AbstractC5955f.v_seat_search_slide);
        this.f28625A = (TextView) findViewById(AbstractC5955f.tv_seat_search_select_count);
        this.f28626B = (TextView) findViewById(AbstractC5955f.tv_seat_search_select_no);
        this.f28627C = (Button) findViewById(AbstractC5955f.btn_seat_search_done);
        if ("TYPE_PUSH".equals(this.f28640l)) {
            l0();
        } else {
            n0(false);
            findViewById(AbstractC5955f.iv_exist_push).setVisibility(8);
            ImageButton imageButton = (ImageButton) findViewById(AbstractC5955f.menuBtn);
            imageButton.setImageResource(AbstractC5954e.ic_train_info);
            imageButton.setContentDescription(getString(AbstractC5959j.common_train_service_info));
        }
        this.f28627C.setEnabled(false);
        this.f28630F = Snackbar.make(this.f28627C, "", -2);
    }

    private void Z0() {
        StringBuilder sb = new StringBuilder();
        if (this.f28628D) {
            String txtTrnClsfCd = this.f28641m.getTxtTrnClsfCd();
            if ("02".equals(txtTrnClsfCd) || TicketSelfCheckinStatusActivity.CHECKIN_STATUS_NOT_USE.equals(txtTrnClsfCd)) {
                sb.append(getString(AbstractC5959j.msg_seat_assign));
            }
            this.f28628D = false;
        }
        if (C6630d.isNotNull(this.f28629E) && ((String) this.f28629E.get(this.f28646r.getSelectIndex())).contains(p.WITH_CHILD.getName())) {
            if (sb.length() > 0) {
                sb.append(X.LF);
            }
            sb.append(getString(AbstractC5959j.msg_noisy_cart_message));
        }
        if (sb.length() > 0) {
            Snackbar snackbarMake = Snackbar.make(this.f28627C, sb.toString(), -2);
            this.f28630F = snackbarMake;
            View view = snackbarMake.getView();
            view.setBackgroundResource(AbstractC5953d.snackbar_background);
            I4.a.getInstance();
            I4.a.setFont(getApplicationContext(), view);
            TextView textView = (TextView) view.findViewById(f.snackbar_text);
            textView.setSingleLine(false);
            textView.setTextColor(KTApplication.getInstance().getResources().getColor(AbstractC5953d.snackbar_text));
            textView.setLineSpacing(TypedValue.applyDimension(1, 4.0f, getApplicationContext().getResources().getDisplayMetrics()), 1.0f);
            this.f28630F.setText(sb.toString());
            this.f28630F.setAction(getString(AbstractC5959j.common_confirm), new b());
            this.f28630F.show();
        }
    }

    private void y0() {
        HashMap<String, String> map = new HashMap<>();
        int i8 = 0;
        while (i8 < this.f28631G.size()) {
            TicketDetailDao.TicketDetailResponse ticketDetailResponse = (TicketDetailDao.TicketDetailResponse) this.f28631G.get(i8);
            StringBuilder sb = new StringBuilder();
            sb.append(ROrtg.OGTK_SALE_WCT_NO);
            i8++;
            sb.append(i8);
            map.put(sb.toString(), ticketDetailResponse.getH_orgtk_wct_no());
            map.put(ROrtg.OGTK_SALE_DD + i8, ticketDetailResponse.getH_orgtk_ret_sale_dt());
            map.put(ROrtg.OGTK_SALE_SQ_NO + i8, ticketDetailResponse.getH_orgtk_sale_sqno());
            map.put(ROrtg.OGTK_RET_PWD + i8, ticketDetailResponse.getH_orgtk_ret_pwd());
        }
        OgTkInquiryDao ogTkInquiryDao = new OgTkInquiryDao();
        OgTkInquiryDao.OgTkInquiryRequest ogTkInquiryRequest = ogTkInquiryDao.new OgTkInquiryRequest();
        ogTkInquiryRequest.setTkCnt(1);
        ogTkInquiryRequest.setOgTkData(map);
        ogTkInquiryDao.setRequest(ogTkInquiryRequest);
        executeDao(ogTkInquiryDao);
    }

    private void z0() {
        SearchCarListDao searchCarListDao = new SearchCarListDao();
        searchCarListDao.setRequest(this.f28641m);
        searchCarListDao.setFinishView(true);
        executeDao(searchCarListDao);
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (AbstractC5955f.menuBtn == id) {
            M0();
            return;
        }
        if (AbstractC5955f.btn_seat_search_prev == id) {
            this.f28646r.setDropDownIndex(r8.getSelectIndex() - 1);
            return;
        }
        if (AbstractC5955f.btn_seat_search_next == id) {
            DropDownSelector dropDownSelector = this.f28646r;
            dropDownSelector.setDropDownIndex(dropDownSelector.getSelectIndex() + 1);
            return;
        }
        if (AbstractC5955f.btn_seat_search_done != id) {
            super.onClick(view);
            return;
        }
        int iF0 = F0();
        ArrayList<SearchSeatListDao.Seat> selectedSeatList = this.f28653y.getSelectedSeatList();
        HashMap map = new HashMap();
        int i8 = 0;
        if ("TYPE_PUSH".equals(this.f28640l)) {
            map.put("tss_srcar_no", String.valueOf(iF0));
            map.put("tss_seat_no", selectedSeatList.get(0).getSeat_no());
        } else if ("TYPE_SARR_SASVR".equals(this.f28640l) || "TYPE_TCRR_RIR".equals(this.f28640l)) {
            RSrcar rSrcar = new RSrcar();
            if ("TYPE_SARR_SASVR".equals(this.f28640l)) {
                rSrcar.setScarCnt(this.f28642n + 1, String.valueOf(selectedSeatList.size()));
            } else {
                rSrcar.setSrcarCnt(this.f28642n + 1, String.valueOf(selectedSeatList.size()));
            }
            while (i8 < selectedSeatList.size()) {
                int i9 = i8 + 1;
                rSrcar.setSrcarNo(this.f28642n + 1, i9, String.valueOf(iF0));
                rSrcar.setSeatNo(this.f28642n + 1, i9, selectedSeatList.get(i8).getSeat_no());
                i8 = i9;
            }
            map.putAll(rSrcar);
        } else if ("TYPE_TCSO_SEAT_CHANGE".equals(this.f28640l)) {
            this.f28635K = String.valueOf(iF0);
            this.f28636L = selectedSeatList.get(0).getSeat_spec();
            y0();
            return;
        } else if ("TYPE_ORR_RIR".equals(this.f28640l) || "TYPE_ORR_SASVR".equals(this.f28640l)) {
            OSrcar oSrcar = new OSrcar();
            oSrcar.setSrcarCnt(this.f28642n + 1, String.valueOf(selectedSeatList.size()));
            while (i8 < selectedSeatList.size()) {
                int i10 = i8 + 1;
                oSrcar.setSrcarNo(this.f28642n + 1, i10, String.valueOf(iF0));
                oSrcar.setSeatNo(this.f28642n + 1, i10, selectedSeatList.get(i8).getSeat_no());
                i8 = i10;
            }
            map.putAll(oSrcar);
        }
        if (map.isEmpty()) {
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("SEAT_SELECT_DATA", map);
        setResult(-1, intent);
        finish();
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_seat_search);
        if (C6630d.isNull(bundle)) {
            N0();
            Y0();
            P0();
            z0();
        }
    }

    @Override // com.korail.talk.viewGroup.DropDownSelector.b
    public void onItemSelected(DropDownSelector dropDownSelector, int i8) {
        int hSrcarNo = this.f28643o.getSrcar_infos().getSrcarInfoList().get(dropDownSelector.getSelectIndex()).getHSrcarNo();
        setAppTitle(getString(AbstractC5959j.seat_search_title, dropDownSelector.getSelectItem().split(X.SPACE)[0]));
        W0();
        Q0();
        A0(hSrcarNo);
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        super.onReceive(iBaseDao);
        int id = iBaseDao.getId();
        if (AbstractC5955f.dao_car_list == id) {
            O0((SearchCarListDao.SearchCarListResponse) iBaseDao.getResponse());
            return;
        }
        if (AbstractC5955f.dao_seat_list == id) {
            T0((SearchSeatListDao.SearchSeatListResponse) iBaseDao.getResponse());
            return;
        }
        if (AbstractC5955f.dao_og_tk_inquiry != id) {
            if (AbstractC5955f.dao_tc_reservation == id) {
                L0((TCReservationDao.TCReservationRequest) iBaseDao.getRequest(), (ReservationResponse) iBaseDao.getResponse());
                return;
            }
            return;
        }
        OgTkInquiryDao.OgTkInquiryResponse ogTkInquiryResponse = (OgTkInquiryDao.OgTkInquiryResponse) iBaseDao.getResponse();
        R0(ogTkInquiryResponse);
        TicketListDao.TrainInfo trainInfo = (TicketListDao.TrainInfo) M(getIntent(), "TICKET_TRAIN_RESPONSE");
        e eVar = new e(this, C6626B.getPassengerBundleData((ArrayList<TicketDetailDao.TicketDetailResponse>) this.f28631G));
        this.f28632H = eVar;
        TCReservationDao.TCReservationRequest tCReservationRequestB0 = B0(ogTkInquiryResponse, eVar);
        String h_dpt_rs_stn_cd = trainInfo.getH_dpt_rs_stn_cd();
        StartStationDto startStationDto = (StartStationDto) getIntent().getSerializableExtra("START_STATION_DTO");
        if (startStationDto == null) {
            return;
        }
        boolean zEquals = h_dpt_rs_stn_cd.equals(startStationDto.dptRsStnCd);
        int i8 = !zEquals ? 2 : 1;
        RJrny rJrny = new RJrny();
        rJrny.setJrnyCnt(N.addZero(4, i8));
        RSrcar rSrcar = new RSrcar();
        RSeat rSeat = tCReservationRequestB0.getRSeat();
        if (zEquals) {
            String str = startStationDto.seatClass;
            rJrny.setJrnySqNo(1, N.addZero(4, Integer.parseInt(d.DIRECT_SQ_NO.getCode())));
            rJrny.setJrnyTpCd(1, r4.e.DIRECT.getCode());
            rJrny.setTrnNo(1, N.addZero(5, Integer.parseInt(startStationDto.trnNo)));
            rJrny.setRunDt(1, startStationDto.runDt);
            rJrny.setStlbTrnClsfCd(1, startStationDto.trnClsfCd);
            rJrny.setTrnGpCd(1, startStationDto.trnGpCd);
            rJrny.setDptDt(1, startStationDto.dptDt);
            rJrny.setDptTm(1, startStationDto.dptTm);
            rJrny.setDptRsStnCd(1, startStationDto.dptRsStnCd);
            rJrny.setDptStnConsOrdr(1, startStationDto.dptStnConsOrdr);
            rJrny.setDptStnRunOrdr(1, startStationDto.dptStnRunOrdr);
            rJrny.setArvDt(1, trainInfo.getH_arv_dt());
            rJrny.setArvTm(1, trainInfo.getH_arv_tm());
            rJrny.setArvRsStnCd(1, trainInfo.getH_arv_rs_stn_cd());
            rJrny.setArvStnConsOrdr(1, startStationDto.chgBfArvStnConsOrdr);
            rJrny.setArvStnRunOrdr(1, startStationDto.exsArvStnRunOrdr);
            tCReservationRequestB0.setStndSeatFlg(((TicketDetailDao.TicketDetailResponse) this.f28631G.get(0)).getTicket_infos().getTicket_info().get(0).getTk_seat_info().get(0).getH_seat_att_cd_4().equals(p.STANDING_SEAT.getCode()) ? "Y" : "N");
            rSeat.setSeatCnt(1, N.addZero(4, 1));
            rSeat.setRoomClsfCd(1, 1, str);
            rSeat.setRqSeatAttCd(1, 1, p.DEFAULT.getCode());
            tCReservationRequestB0.setRJrny(rJrny);
            tCReservationRequestB0.getRSrcar().clear();
            tCReservationRequestB0.setIsePrnb("1");
            tCReservationRequestB0.setIntgTktIseFlg("N");
            tCReservationRequestB0.setTotPrnb("1");
            tCReservationRequestB0.setPrcFareReCalcFlg("N");
            tCReservationRequestB0.setFrcSaleRsnCont(startStationDto.reasonCode);
            rSrcar.setSrcarCnt(this.f28642n + 1, String.valueOf(1));
            rSrcar.setSrcarNo(this.f28642n + 1, 1, this.f28635K);
            rSrcar.setSeatNo(this.f28642n + 1, 1, this.f28636L);
            tCReservationRequestB0.setRSrcar(rSrcar);
            tCReservationRequestB0.setCtlDvCd("3584");
            TCReservationDao tCReservationDao = new TCReservationDao();
            tCReservationRequestB0.setTmpJobSqno(null);
            tCReservationDao.setRequest(tCReservationRequestB0);
            executeDao(tCReservationDao);
            return;
        }
        String psrmClCd = ogTkInquiryResponse.getOrgTkList().get(0).getCmpnList().get(0).getPsrmClCd();
        rJrny.setJrnySqNo(1, N.addZero(4, Integer.parseInt(d.DIRECT_SQ_NO.getCode())));
        rJrny.setJrnyTpCd(1, r4.e.STANDING_SEAT_1.getCode());
        rJrny.setTrnNo(1, N.addZero(5, Integer.parseInt(startStationDto.trnNo)));
        rJrny.setRunDt(1, startStationDto.runDt);
        rJrny.setStlbTrnClsfCd(1, startStationDto.trnClsfCd);
        rJrny.setTrnGpCd(1, startStationDto.trnGpCd);
        rJrny.setDptDt(1, trainInfo.getH_dpt_dt());
        rJrny.setDptTm(1, trainInfo.getH_dpt_tm());
        rJrny.setDptRsStnCd(1, trainInfo.getH_dpt_rs_stn_cd());
        rJrny.setDptStnConsOrdr(1, startStationDto.exsDptStnRunOrdr);
        rJrny.setDptStnRunOrdr(1, startStationDto.chgBfDptStnConsOrdr);
        rJrny.setArvDt(1, startStationDto.dptDt);
        rJrny.setArvTm(1, startStationDto.dptTm);
        rJrny.setArvRsStnCd(1, startStationDto.dptRsStnCd);
        rJrny.setArvStnConsOrdr(1, startStationDto.dptStnConsOrdr);
        rJrny.setArvStnRunOrdr(1, startStationDto.dptStnRunOrdr);
        String h_seat_att_cd_4 = ((TicketDetailDao.TicketDetailResponse) this.f28631G.get(0)).getTicket_infos().getTicket_info().get(0).getTk_seat_info().get(0).getH_seat_att_cd_4();
        tCReservationRequestB0.setStndSeatFlg(h_seat_att_cd_4.equals(p.STANDING_SEAT.getCode()) ? "Y" : "N");
        rSeat.setSeatCnt(1, N.addZero(4, 1));
        rSeat.setRoomClsfCd(1, 1, psrmClCd);
        p pVar = p.NORMAL_FREE;
        if (h_seat_att_cd_4.equals(pVar.getCode())) {
            rSeat.setRqSeatAttCd(1, 1, pVar.getCode());
        } else {
            rSeat.setRqSeatAttCd(1, 1, h_seat_att_cd_4);
        }
        String str2 = startStationDto.seatClass;
        rJrny.setJrnySqNo(2, N.addZero(4, Integer.parseInt(d.TRANSFER_SQ_NO.getCode())));
        rJrny.setJrnyTpCd(2, r4.e.STANDING_SEAT_2.getCode());
        rJrny.setTrnNo(2, N.addZero(5, Integer.parseInt(startStationDto.trnNo)));
        rJrny.setRunDt(2, startStationDto.runDt);
        rJrny.setStlbTrnClsfCd(2, startStationDto.trnClsfCd);
        rJrny.setTrnGpCd(2, startStationDto.trnGpCd);
        rJrny.setDptDt(2, startStationDto.dptDt);
        rJrny.setDptTm(2, startStationDto.dptTm);
        rJrny.setDptRsStnCd(2, startStationDto.dptRsStnCd);
        rJrny.setDptStnConsOrdr(2, startStationDto.dptStnConsOrdr);
        rJrny.setDptStnRunOrdr(2, startStationDto.dptStnRunOrdr);
        rJrny.setArvDt(2, trainInfo.getH_arv_dt());
        rJrny.setArvTm(2, trainInfo.getH_arv_tm());
        rJrny.setArvRsStnCd(2, trainInfo.getH_arv_rs_stn_cd());
        rJrny.setArvStnConsOrdr(2, startStationDto.chgBfArvStnConsOrdr);
        rJrny.setArvStnRunOrdr(2, startStationDto.exsArvStnRunOrdr);
        rSeat.setSeatCnt(2, N.addZero(4, 1));
        rSeat.setRoomClsfCd(2, 1, str2);
        rSeat.setRqSeatAttCd(2, 1, p.DEFAULT.getCode());
        tCReservationRequestB0.setRJrny(rJrny);
        tCReservationRequestB0.getRSrcar().clear();
        tCReservationRequestB0.setIsePrnb("1");
        tCReservationRequestB0.setIntgTktIseFlg("N");
        tCReservationRequestB0.setTotPrnb("1");
        tCReservationRequestB0.setPrcFareReCalcFlg("N");
        tCReservationRequestB0.setFrcSaleRsnCont(startStationDto.reasonCode);
        rSrcar.setSrcarCnt(this.f28642n + 1, String.valueOf(1));
        rSrcar.setSrcarNo(this.f28642n + 1, 1, ((TicketDetailDao.TicketDetailResponse) this.f28631G.get(0)).getTicket_infos().getTicket_info().get(0).getTk_seat_info().get(0).getH_srcar_no());
        rSrcar.setSeatNo(this.f28642n + 1, 1, ((TicketDetailDao.TicketDetailResponse) this.f28631G.get(0)).getTicket_infos().getTicket_info().get(0).getTk_seat_info().get(0).getH_seat_no());
        rSrcar.setSrcarCnt(this.f28642n + 2, String.valueOf(1));
        rSrcar.setSrcarNo(this.f28642n + 2, 1, this.f28635K);
        rSrcar.setSeatNo(this.f28642n + 2, 1, this.f28636L);
        tCReservationRequestB0.setRSrcar(rSrcar);
        tCReservationRequestB0.setCtlDvCd("3584");
        TCReservationDao tCReservationDao2 = new TCReservationDao();
        tCReservationRequestB0.setTmpJobSqno(null);
        tCReservationDao2.setRequest(tCReservationRequestB0);
        executeDao(tCReservationDao2);
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceiveError(IBaseDao iBaseDao, C6536a c6536a) {
        if (AbstractC5955f.dao_seat_list == iBaseDao.getId()) {
            try {
                if ("TYPE_PUSH".equals(this.f28640l) && "ERR911081".equals(iBaseDao.getResponse().gethMsgCd())) {
                    Intent intent = new Intent();
                    intent.putExtra("MAP_TIME_OUT_MESSAGE", getString(AbstractC5959j.tss_dialog_no_seat_not_allowed_time));
                    setResult(0, intent);
                    finish();
                } else {
                    C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(c6536a.getMessage()).showDialog();
                }
            } catch (Exception unused) {
                t.e(c6536a.getMessage());
            }
        }
    }

    @Override // com.korail.talk.ui.seat.a.InterfaceC0245a
    public void onSeatSelectionChanged() {
        int iG0 = G0();
        int selectedSeatCount = this.f28653y.getSelectedSeatCount();
        Snackbar snackbar = this.f28630F;
        if (snackbar != null && snackbar.isShown()) {
            this.f28630F.dismiss();
        }
        this.f28625A.setText(getString(AbstractC5959j.seat_search_select_info, Integer.valueOf(selectedSeatCount), Integer.valueOf(iG0)));
        ArrayList<SearchSeatListDao.Seat> selectedSeatList = this.f28653y.getSelectedSeatList();
        if (selectedSeatList.size() >= 1) {
            StringBuilder sb = new StringBuilder();
            Iterator<SearchSeatListDao.Seat> it = selectedSeatList.iterator();
            while (it.hasNext()) {
                SearchSeatListDao.Seat next = it.next();
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(next.getSeat_spec());
            }
            this.f28626B.setText(getString(AbstractC5959j.seat_search_srcar_seat, Integer.valueOf(F0()), sb.toString()));
            this.f28626B.setVisibility(0);
        } else {
            this.f28626B.setText((CharSequence) null);
            this.f28626B.setVisibility(4);
        }
        if (selectedSeatCount > 0) {
            this.f28627C.setEnabled(selectedSeatCount == iG0);
            V0(0);
        } else {
            this.f28627C.setEnabled(false);
            V0(1);
        }
    }
}
