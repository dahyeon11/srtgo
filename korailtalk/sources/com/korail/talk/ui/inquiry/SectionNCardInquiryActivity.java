package com.korail.talk.ui.inquiry;

import I4.h;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.TextView;
import com.korail.talk.data.reservation.NReservationData;
import com.korail.talk.data.reservation.ReservationMessageData;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.research.NCardInquiryDao;
import com.korail.talk.network.dao.research.NCardReservationDao;
import com.korail.talk.ui.reservation.confirm.activity.NReservationConfirmActivity;
import com.korail.talk.view.base.BaseViewActivity;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import n4.AbstractC5952c;
import n4.AbstractC5954e;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import r4.e;
import r4.i;
import r4.k;
import r4.s;
import y4.C6536a;
import z4.C6630d;
import z4.C6637k;
import z4.C6642p;
import z4.N;
import z4.O;
import z4.t;

/* loaded from: classes.dex */
public class SectionNCardInquiryActivity extends BaseViewActivity implements ExpandableListView.OnChildClickListener {

    /* renamed from: i, reason: collision with root package name */
    private final int f28038i = -1;

    /* renamed from: j, reason: collision with root package name */
    private ArrayList f28039j;

    /* renamed from: k, reason: collision with root package name */
    private HashMap f28040k;

    /* renamed from: l, reason: collision with root package name */
    private NCardInquiryDao.NCardInquiryRequest[] f28041l;

    /* renamed from: m, reason: collision with root package name */
    private NCardReservationDao.NCardReservationRequest f28042m;

    /* renamed from: n, reason: collision with root package name */
    private ExpandableListView f28043n;

    /* renamed from: o, reason: collision with root package name */
    private b f28044o;

    /* renamed from: p, reason: collision with root package name */
    private TextView f28045p;

    private class b extends BaseExpandableListAdapter {

        /* renamed from: a, reason: collision with root package name */
        private final LayoutInflater f28046a;

        private class a {

            /* renamed from: a, reason: collision with root package name */
            private View f28048a;

            /* renamed from: b, reason: collision with root package name */
            private TextView f28049b;

            /* renamed from: c, reason: collision with root package name */
            private TextView f28050c;

            /* renamed from: d, reason: collision with root package name */
            private TextView f28051d;

            private a() {
            }
        }

        /* renamed from: com.korail.talk.ui.inquiry.SectionNCardInquiryActivity$b$b, reason: collision with other inner class name */
        private class C0240b {

            /* renamed from: a, reason: collision with root package name */
            private TextView f28053a;

            /* renamed from: b, reason: collision with root package name */
            private TextView f28054b;

            /* renamed from: c, reason: collision with root package name */
            private TextView f28055c;

            /* renamed from: d, reason: collision with root package name */
            private ImageView f28056d;

            private C0240b() {
            }
        }

        @Override // android.widget.ExpandableListAdapter
        public long getChildId(int i8, int i9) {
            return 0L;
        }

        @Override // android.widget.ExpandableListAdapter
        public View getChildView(int i8, int i9, boolean z8, View view, ViewGroup viewGroup) {
            a aVar;
            if (C6630d.isNull(view)) {
                aVar = new a();
                view = this.f28046a.inflate(AbstractC5957h.item_commutation_inquiry, viewGroup, false);
                aVar.f28048a = view.findViewById(AbstractC5955f.item_fl_commutation_inquiry_train);
                aVar.f28049b = (TextView) view.findViewById(AbstractC5955f.item_tv_commutation_inquiry_train_nm);
                aVar.f28050c = (TextView) view.findViewById(AbstractC5955f.item_tv_commutation_inquiry_total_amount);
                aVar.f28051d = (TextView) view.findViewById(AbstractC5955f.item_tv_commutation_inquiry_station_nm);
                view.setTag(aVar);
            } else {
                aVar = (a) view.getTag();
            }
            HashMap<String, Object> group = getGroup(i8);
            NCardInquiryDao.TrainInfo child = getChild(i8, i9);
            aVar.f28049b.setText(O.getTrainGroupName(N.getIntegerString(child.getTrnGpCd())));
            aVar.f28050c.setText(SectionNCardInquiryActivity.this.getString(AbstractC5959j.common_amount, N.getDecimalFormatString(child.getCmtrPrc())));
            aVar.f28051d.setText(child.getStationInfo());
            if (((Integer) group.get("CHECKED_POSITION")).intValue() == i9) {
                aVar.f28048a.setBackgroundResource(AbstractC5954e.bg_train_inquiry_list_item_selected);
            } else {
                aVar.f28048a.setBackground(null);
            }
            return view;
        }

        @Override // android.widget.ExpandableListAdapter
        public int getChildrenCount(int i8) {
            if (C6630d.isNull(SectionNCardInquiryActivity.this.f28040k) || C6630d.isNull(SectionNCardInquiryActivity.this.f28040k.get(Integer.valueOf(i8)))) {
                return 0;
            }
            return ((ArrayList) SectionNCardInquiryActivity.this.f28040k.get(Integer.valueOf(i8))).size();
        }

        @Override // android.widget.ExpandableListAdapter
        public int getGroupCount() {
            if (C6630d.isNull(SectionNCardInquiryActivity.this.f28039j)) {
                return 0;
            }
            return SectionNCardInquiryActivity.this.f28039j.size();
        }

        @Override // android.widget.ExpandableListAdapter
        public long getGroupId(int i8) {
            return 0L;
        }

        @Override // android.widget.ExpandableListAdapter
        public View getGroupView(int i8, boolean z8, View view, ViewGroup viewGroup) {
            View viewInflate;
            C0240b c0240b;
            if (C6630d.isNull(view)) {
                c0240b = new C0240b();
                viewInflate = this.f28046a.inflate(AbstractC5957h.row_group_multi_n_card, viewGroup, false);
                c0240b.f28053a = (TextView) viewInflate.findViewById(AbstractC5955f.tv_group_multi_n_card_round);
                c0240b.f28054b = (TextView) viewInflate.findViewById(AbstractC5955f.tv_group_multi_n_card_departure);
                c0240b.f28055c = (TextView) viewInflate.findViewById(AbstractC5955f.tv_group_multi_n_card_arrival);
                c0240b.f28056d = (ImageView) viewInflate.findViewById(AbstractC5955f.iv_group_multi_n_card_arrow);
                viewInflate.setTag(c0240b);
            } else {
                viewInflate = view;
                c0240b = (C0240b) view.getTag();
            }
            HashMap<String, Object> group = getGroup(i8);
            c0240b.f28053a.setText(SectionNCardInquiryActivity.this.getString(AbstractC5959j.common_section_n, Integer.valueOf(i8 + 1)));
            c0240b.f28054b.setText((String) group.get("DEPARTURE_STATION_NM"));
            c0240b.f28055c.setText((String) group.get("ARRIVAL_STATION_NM"));
            c0240b.f28056d.setBackgroundResource(z8 ? AbstractC5954e.up : AbstractC5954e.down);
            return viewInflate;
        }

        @Override // android.widget.ExpandableListAdapter
        public boolean hasStableIds() {
            return false;
        }

        @Override // android.widget.ExpandableListAdapter
        public boolean isChildSelectable(int i8, int i9) {
            return true;
        }

        private b() {
            this.f28046a = SectionNCardInquiryActivity.this.getLayoutInflater();
        }

        @Override // android.widget.ExpandableListAdapter
        public NCardInquiryDao.TrainInfo getChild(int i8, int i9) {
            return (NCardInquiryDao.TrainInfo) ((ArrayList) SectionNCardInquiryActivity.this.f28040k.get(Integer.valueOf(i8))).get(i9);
        }

        @Override // android.widget.ExpandableListAdapter
        public HashMap<String, Object> getGroup(int i8) {
            if (C6630d.isNull(SectionNCardInquiryActivity.this.f28039j)) {
                return null;
            }
            return (HashMap) SectionNCardInquiryActivity.this.f28039j.get(i8);
        }
    }

    private void A0(NCardReservationDao.NCardReservationRequest nCardReservationRequest, NCardReservationDao.NCardReservationResponse nCardReservationResponse) {
        StringBuilder sb = new StringBuilder();
        HashMap<String, String> customData = nCardReservationRequest.getCustomData();
        Iterator<String> it = customData.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (next.startsWith(NCardReservationDao.NCardReservationRequest.CUSTOM_STATION_INFO)) {
                sb.append(customData.get(next));
                if (it.hasNext()) {
                    sb.append(", ");
                }
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(h.getInstance().getMemberName());
        sb2.append(getString(AbstractC5959j.common_respect));
        HashMap<String, String> apdUsrInfo = nCardReservationRequest.getApdUsrInfo();
        for (String str : apdUsrInfo.keySet()) {
            if (str.startsWith(NCardReservationDao.NCardReservationRequest.APD_CUST_NAME)) {
                sb2.append(", ");
                sb2.append(apdUsrInfo.get(str));
                sb2.append(getString(AbstractC5959j.common_respect));
            }
        }
        nCardReservationResponse.setStationInfo(sb.toString());
        nCardReservationResponse.setUserNames(sb2.toString());
        NReservationData nReservationData = new NReservationData();
        nReservationData.setPaymentType(i.PAYMENT_DEFAULT);
        nReservationData.setPaymentRequest(C4.b.getIntgStlRequest(nCardReservationResponse.getLumpStlTgtNo()));
        nReservationData.setReservationType(k.N_CARD);
        nReservationData.setNCardReservationResponse(nCardReservationResponse);
        ArrayList arrayList = new ArrayList();
        ReservationMessageData reservationMessageData = new ReservationMessageData();
        reservationMessageData.setTitle(getString(AbstractC5959j.notice_must_know));
        if (s.ITX_YOUTH.getCode().equals(this.f28041l[0].getTrnGpCd())) {
            reservationMessageData.setMessageList(Arrays.asList(getResources().getStringArray(AbstractC5952c.n_card_commission_message_itx_youth)));
        } else {
            reservationMessageData.setMessageList(Arrays.asList(getResources().getStringArray(AbstractC5952c.n_card_commission_message)));
        }
        arrayList.add(reservationMessageData);
        nReservationData.setReservationMessageDataList(arrayList);
        Intent intent = new Intent(getApplicationContext(), (Class<?>) NReservationConfirmActivity.class);
        intent.putExtra("RESERVATION_DATA", nReservationData);
        startActivity(intent);
    }

    private void B0() {
        this.f28039j = new ArrayList();
        this.f28040k = new HashMap();
        Object[] objArr = (Object[]) getIntent().getSerializableExtra("INQUIRY_ARRAY_REQUEST");
        this.f28041l = (NCardInquiryDao.NCardInquiryRequest[]) Arrays.copyOf(objArr, objArr.length, NCardInquiryDao.NCardInquiryRequest[].class);
        this.f28042m = (NCardReservationDao.NCardReservationRequest) getIntent().getSerializableExtra("RESERVATION_REQUEST");
    }

    private void C0() {
        this.f28043n.setOnChildClickListener(this);
    }

    private void D0(int i8, NCardInquiryDao.TrainInfo trainInfo) {
        this.f28042m.setJrnyCnt(String.valueOf(i8));
        this.f28042m.setJrnyTpCd(i8, e.DIRECT.getCode());
        this.f28042m.setRunDt(i8, trainInfo.getRunDt());
        this.f28042m.setTrnNo(i8, trainInfo.getTrnNo());
        this.f28042m.setDptRsStnCd(i8, trainInfo.getDptRsStnCd());
        this.f28042m.setArvRsStnCd(i8, trainInfo.getArvRsStnCd());
        this.f28042m.setStationInfo(i8, trainInfo.getStationStringInfo());
    }

    private void E0() {
        n0(false);
        this.f28043n = (ExpandableListView) findViewById(AbstractC5955f.elv_multi_section_n_card);
        b bVar = new b();
        this.f28044o = bVar;
        this.f28043n.setAdapter(bVar);
        this.f28045p = (TextView) findViewById(AbstractC5955f.tv_multi_n_card_inquiry_message);
    }

    private void setText() {
        setAppTitle(getIntent().getStringExtra("TITLE_NAME"));
        NCardInquiryDao.NCardInquiryRequest nCardInquiryRequest = this.f28041l[0];
        if (s.ITX_YOUTH.getCode().equals(nCardInquiryRequest.getTrnGpCd())) {
            this.f28045p.setText(String.format(getString(AbstractC5959j.multi_n_card_inquiry_message_itx), this.f28041l.length == 1 ? "5%" : "7%"));
        } else if (s.KTX.getCode().equals(nCardInquiryRequest.getTrnGpCd())) {
            this.f28045p.setText(String.format(getString(AbstractC5959j.multi_n_card_inquiry_message_ktx), new Object[0]));
        } else {
            this.f28045p.setText(String.format(getString(AbstractC5959j.multi_n_card_inquiry_message), new Object[0]));
        }
    }

    private void w0() {
        NCardReservationDao nCardReservationDao = new NCardReservationDao();
        nCardReservationDao.setRequest(this.f28042m);
        executeDao(nCardReservationDao);
    }

    private void x0(int i8) {
        NCardInquiryDao.NCardInquiryRequest nCardInquiryRequest = this.f28041l[i8];
        IBaseDao nCardInquiryDao = new NCardInquiryDao();
        nCardInquiryRequest.setSectionNo(i8);
        nCardInquiryRequest.setQryPgNo(N.isNotNull(nCardInquiryRequest.getQryPgNo()) ? String.valueOf(Integer.parseInt(nCardInquiryRequest.getQryPgNo()) + 1) : "1");
        nCardInquiryDao.setErrorMsgCdNotShowDialog("WRG000000");
        nCardInquiryDao.setFinishView(true);
        nCardInquiryDao.setRequest(nCardInquiryRequest);
        executeDao(nCardInquiryDao);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y0(NCardReservationDao.NCardReservationRequest nCardReservationRequest, NCardReservationDao.NCardReservationResponse nCardReservationResponse, DialogInterface dialogInterface, int i8) {
        if (102 == i8) {
            A0(nCardReservationRequest, nCardReservationResponse);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z0(DialogInterface dialogInterface, int i8) {
        finish();
    }

    @Override // android.widget.ExpandableListView.OnChildClickListener
    public boolean onChildClick(ExpandableListView expandableListView, View view, int i8, int i9, long j8) {
        this.f28044o.getGroup(i8).put("CHECKED_POSITION", Integer.valueOf(i9));
        boolean z8 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= this.f28039j.size()) {
                z8 = true;
                break;
            }
            int iIntValue = ((Integer) ((HashMap) this.f28039j.get(i10)).get("CHECKED_POSITION")).intValue();
            if (iIntValue == -1) {
                break;
            }
            ArrayList arrayList = (ArrayList) this.f28040k.get(Integer.valueOf(i10));
            i10++;
            D0(i10, (NCardInquiryDao.TrainInfo) arrayList.get(iIntValue));
        }
        this.f28044o.notifyDataSetChanged();
        if (z8) {
            w0();
        }
        return true;
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_multi_section_n_card_inquiry);
        if (C6630d.isNull(bundle)) {
            B0();
            E0();
            setText();
            C0();
            x0(0);
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        super.onReceive(iBaseDao);
        int id = iBaseDao.getId();
        if (AbstractC5955f.dao_n_card_inquiry != id) {
            if (AbstractC5955f.dao_n_card_reservation == id) {
                final NCardReservationDao.NCardReservationRequest nCardReservationRequest = (NCardReservationDao.NCardReservationRequest) iBaseDao.getRequest();
                final NCardReservationDao.NCardReservationResponse nCardReservationResponse = (NCardReservationDao.NCardReservationResponse) iBaseDao.getResponse();
                if ("MRR800009".equals(nCardReservationResponse.gethMsgCd())) {
                    C6637k.getCDialog(K(), 1002, 0, getString(AbstractC5959j.dialog_title)).setContent(nCardReservationResponse.gethMsgTxt()).setButtonListener(new DialogInterface.OnClickListener() { // from class: f5.c
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i8) {
                            this.f31203a.y0(nCardReservationRequest, nCardReservationResponse, dialogInterface, i8);
                        }
                    }).showDialog();
                    return;
                } else {
                    A0(nCardReservationRequest, nCardReservationResponse);
                    return;
                }
            }
            return;
        }
        NCardInquiryDao.NCardInquiryRequest nCardInquiryRequest = (NCardInquiryDao.NCardInquiryRequest) iBaseDao.getRequest();
        NCardInquiryDao.NCardInquiryResponse nCardInquiryResponse = (NCardInquiryDao.NCardInquiryResponse) iBaseDao.getResponse();
        int sectionNo = nCardInquiryRequest.getSectionNo();
        ArrayList arrayList = (ArrayList) this.f28040k.get(Integer.valueOf(sectionNo));
        if (!C6630d.isNotNull(arrayList)) {
            arrayList = new ArrayList();
        }
        for (NCardInquiryDao.TrainInfo trainInfo : nCardInquiryResponse.getTrnScdlList()) {
            trainInfo.setStationStringInfo(C6642p.getTrainInfo(trainInfo));
            trainInfo.setStationInfo(N.fromHtml(C6642p.getTrainInfo(trainInfo)));
            arrayList.add(trainInfo);
        }
        t.e("sectionNo : " + sectionNo);
        this.f28040k.put(Integer.valueOf(sectionNo), arrayList);
        if ("Y".equals(nCardInquiryResponse.getFllwPgExt())) {
            x0(sectionNo);
            return;
        }
        HashMap map = new HashMap();
        map.put("DEPARTURE_STATION_NM", nCardInquiryRequest.getDptRsStnNm());
        map.put("ARRIVAL_STATION_NM", nCardInquiryRequest.getArvRsStnNm());
        map.put("CHECKED_POSITION", -1);
        this.f28039j.add(sectionNo, map);
        NCardInquiryDao.NCardInquiryRequest[] nCardInquiryRequestArr = this.f28041l;
        if (sectionNo < nCardInquiryRequestArr.length - 1) {
            x0(nCardInquiryRequestArr[sectionNo].getSectionNo() + 1);
            return;
        }
        this.f28044o.notifyDataSetChanged();
        for (int i8 = 0; i8 < this.f28044o.getGroupCount(); i8++) {
            this.f28043n.expandGroup(i8);
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceiveError(IBaseDao iBaseDao, C6536a c6536a) {
        super.onReceiveError(iBaseDao, c6536a);
        if (AbstractC5955f.dao_n_card_inquiry == iBaseDao.getId()) {
            NCardInquiryDao.NCardInquiryRequest nCardInquiryRequest = (NCardInquiryDao.NCardInquiryRequest) iBaseDao.getRequest();
            NCardInquiryDao.NCardInquiryResponse nCardInquiryResponse = (NCardInquiryDao.NCardInquiryResponse) iBaseDao.getResponse();
            int sectionNo = nCardInquiryRequest.getSectionNo();
            if (C6630d.isNull(this.f28040k.get(Integer.valueOf(sectionNo)))) {
                C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(nCardInquiryResponse.gethMsgTxt()).setButtonListener(new DialogInterface.OnClickListener() { // from class: f5.b
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i8) {
                        this.f31202a.z0(dialogInterface, i8);
                    }
                }).showDialog();
                return;
            }
            HashMap map = new HashMap();
            map.put("DEPARTURE_STATION_NM", nCardInquiryRequest.getDptRsStnNm());
            map.put("ARRIVAL_STATION_NM", nCardInquiryRequest.getArvRsStnNm());
            map.put("CHECKED_POSITION", -1);
            this.f28039j.add(sectionNo, map);
            NCardInquiryDao.NCardInquiryRequest[] nCardInquiryRequestArr = this.f28041l;
            if (sectionNo < nCardInquiryRequestArr.length - 1) {
                x0(nCardInquiryRequestArr[sectionNo].getSectionNo() + 1);
                return;
            }
            this.f28044o.notifyDataSetChanged();
            for (int i8 = 0; i8 < this.f28044o.getGroupCount(); i8++) {
                this.f28043n.expandGroup(i8);
            }
        }
    }
}
