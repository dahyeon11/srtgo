package com.korail.talk.ui.push;

import I4.g;
import I4.h;
import Q7.X;
import T4.e;
import android.app.NotificationManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.h2osystech.smartalimi.aidllib.MSGVo;
import com.h2osystech.smartalimi.aidllib.SmartAgentInterface;
import com.h2osystech.smartalimi.common.Const;
import com.korail.talk.data.CalendarData;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.research.OgTkInquiryDao;
import com.korail.talk.network.dao.research.OgTkInquiryDao.OgTkInquiryRequest;
import com.korail.talk.network.dao.reservation.TCReservationDao;
import com.korail.talk.network.data.reservation.ROrtg;
import com.korail.talk.network.request.inquiry.RsvInquiryRequest;
import com.korail.talk.network.request.inquiry.TrainInquiryRequest;
import com.korail.talk.network.response.research.Jrny;
import com.korail.talk.ui.booking.mainBooking.MainBookingActivity;
import com.korail.talk.ui.inquiry.rir.tcr.TCDirectInquiryActivity;
import com.korail.talk.ui.inquiry.rir.tcr.TCTransferInquiryActivity;
import com.korail.talk.ui.menu.DelayDiscountCouponActivity;
import com.korail.talk.ui.menu.DiscountCouponActivity;
import com.korail.talk.ui.ticket.confirm.TicketListActivity;
import com.korail.talk.view.base.BaseViewActivity;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p4.C6054a;
import r4.EnumC6175b;
import r4.d;
import z4.C6630d;
import z4.C6631e;
import z4.C6634h;
import z4.C6637k;
import z4.C6641o;
import z4.N;
import z4.t;

/* loaded from: classes.dex */
public class PushHistoryActivity extends BaseViewActivity {

    /* renamed from: k */
    private SimpleDateFormat f28563k;

    /* renamed from: l */
    private SimpleDateFormat f28564l;

    /* renamed from: m */
    private SimpleDateFormat f28565m;

    /* renamed from: o */
    private b f28567o;

    /* renamed from: p */
    private ListView f28568p;

    /* renamed from: q */
    protected MSGVo f28569q;

    /* renamed from: r */
    SmartAgentInterface f28570r;

    /* renamed from: s */
    ArrayList f28571s;

    /* renamed from: t */
    private e f28572t;

    /* renamed from: v */
    private OgTkInquiryDao.OgTkInquiryResponse f28574v;

    /* renamed from: i */
    private Calendar f28561i = Calendar.getInstance();

    /* renamed from: j */
    private Calendar f28562j = Calendar.getInstance();

    /* renamed from: n */
    private ArrayList f28566n = new ArrayList();

    /* renamed from: u */
    private String f28573u = "";

    /* renamed from: w */
    private String f28575w = "";

    /* renamed from: x */
    private String f28576x = "";

    /* renamed from: y */
    private String f28577y = "";

    class c extends Handler {
        c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            PushHistoryActivity.this.f28567o = new b();
            PushHistoryActivity.this.f28568p.setAdapter((ListAdapter) PushHistoryActivity.this.f28567o);
            PushHistoryActivity.this.f28568p.deferNotifyDataSetChanged();
            PushHistoryActivity.this.L0();
            if (h.getInstance().isLogin()) {
                PushHistoryActivity.this.S0();
            } else {
                C6641o.moveToLogin(PushHistoryActivity.this.K());
            }
        }
    }

    private void J0(ArrayList arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        try {
            this.f28566n.addAll(arrayList);
            this.f28567o.notifyDataSetChanged();
        } catch (Exception e8) {
            t.e(e8.getMessage());
        }
    }

    private void K0() {
        MSGVo mSGVo = this.f28569q;
        if (mSGVo == null || N.getInteger(mSGVo.getTaskName()) != 20) {
            return;
        }
        U0(this.f28569q.getParam(), this.f28569q.getContent());
    }

    public void L0() {
        this.f28566n.clear();
        this.f28567o.notifyDataSetChanged();
    }

    public boolean M0(Calendar calendar, int i8) {
        if (calendar == null) {
            return false;
        }
        this.f28562j.setTime(this.f28561i.getTime());
        this.f28562j.add(5, i8);
        return calendar.get(1) == this.f28562j.get(1) && calendar.get(2) == this.f28562j.get(2) && calendar.get(5) == this.f28562j.get(5);
    }

    public void N0(int i8) {
        try {
            if (this.f28570r.removeBySeq(((MSGVo) this.f28571s.get(i8)).getUniqSeq()) == Const.SUCCESS) {
                C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.notice_delete_completed)).setButtonListener(new DialogInterface.OnClickListener() { // from class: L5.a
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i9) {
                        this.f3063a.W0(dialogInterface, i9);
                    }
                }).showDialog();
            }
        } catch (Exception e8) {
            t.e(e8.getMessage());
        }
    }

    private void O0(ArrayList arrayList) {
        int size = arrayList.size();
        HashMap<String, String> map = new HashMap<>();
        int i8 = 0;
        while (i8 < size) {
            StringBuilder sb = new StringBuilder();
            sb.append(ROrtg.OGTK_SALE_DD);
            int i9 = i8 + 1;
            sb.append(i9);
            map.put(sb.toString(), (String) ((ArrayList) arrayList.get(i8)).get(0));
            map.put(ROrtg.OGTK_SALE_WCT_NO + i9, (String) ((ArrayList) arrayList.get(i8)).get(1));
            map.put(ROrtg.OGTK_SALE_SQ_NO + i9, (String) ((ArrayList) arrayList.get(i8)).get(2));
            map.put(ROrtg.OGTK_RET_PWD + i9, (String) ((ArrayList) arrayList.get(i8)).get(3));
            this.f28575w = (String) ((ArrayList) arrayList.get(i8)).get(9);
            i8 = i9;
        }
        OgTkInquiryDao ogTkInquiryDao = new OgTkInquiryDao();
        OgTkInquiryDao.OgTkInquiryRequest ogTkInquiryRequest = ogTkInquiryDao.new OgTkInquiryRequest();
        ogTkInquiryRequest.setTkCnt(size);
        ogTkInquiryRequest.setOgTkData(map);
        ogTkInquiryDao.setRequest(ogTkInquiryRequest);
        executeDao(ogTkInquiryDao);
    }

    public Class P0(String str) throws NumberFormatException {
        t.e("messageId " + str);
        int i8 = Integer.parseInt(str);
        if (i8 != 21) {
            if (i8 != 22) {
                if (i8 != 35 && i8 != 36) {
                    switch (i8) {
                        default:
                            switch (i8) {
                                case 24:
                                    break;
                                case 25:
                                    break;
                                case 26:
                                    break;
                                default:
                                    return MainBookingActivity.class;
                            }
                        case 12:
                        case 13:
                        case 14:
                            return TicketListActivity.class;
                    }
                }
                return TicketListActivity.class;
            }
            return DelayDiscountCouponActivity.class;
        }
        return DiscountCouponActivity.class;
    }

    private com.korail.talk.ui.booking.option.date.a Q0(OgTkInquiryDao.OgTkInquiryResponse ogTkInquiryResponse) {
        CalendarData calendarInfo;
        Jrny jrny = ogTkInquiryResponse.getOrgTkList().get(0).getJrnyList().get(0);
        if (C6634h.isToday(jrny.getDptDt())) {
            calendarInfo = C6634h.getToday();
        } else {
            calendarInfo = C6634h.getCalendarInfo(C6634h.getCalendarFromString(jrny.getDptDt() + "000000", "yyyyMMddHHmmss"));
        }
        com.korail.talk.ui.booking.option.date.a aVar = new com.korail.talk.ui.booking.option.date.a(this);
        aVar.setHeaderSummary(getString(AbstractC5959j.common_departure_date));
        aVar.setDate(C6631e.getNormalDateStrArray());
        aVar.refreshDate(calendarInfo);
        return aVar;
    }

    private RsvInquiryRequest[] R0(String str, CalendarData calendarData) {
        TrainInquiryRequest[] trainInquiryRequestArr = {new TrainInquiryRequest()};
        B4.b.getRsvInquiryRequest(getApplicationContext(), trainInquiryRequestArr, V0(this.f28574v), Q0(this.f28574v), this.f28572t, str, calendarData);
        TrainInquiryRequest trainInquiryRequest = trainInquiryRequestArr[0];
        t.d("여행변경 n카드 DcntKndCd : " + this.f28574v.getOrgTkList().get(0).getCmpnList().get(0).getDcntKndCd());
        if ("53".equals(this.f28574v.getOrgTkList().get(0).getCmpnList().get(0).getDcntKndCd())) {
            trainInquiryRequest.setEtrPath("CN");
        } else {
            trainInquiryRequest.setEtrPath("TC");
        }
        trainInquiryRequest.setTkPsrmClCd(this.f28576x);
        trainInquiryRequest.setTkRcvdAmt(this.f28577y);
        trainInquiryRequest.setQryDvCd("1");
        trainInquiryRequest.setTkDptDt(this.f28574v.getOrgTkList().get(0).getJrnyList().get(0).getDptDt());
        trainInquiryRequest.setTkDptTm(this.f28574v.getOrgTkList().get(0).getJrnyList().get(0).getDptTm());
        trainInquiryRequest.setTkTrnNo(this.f28574v.getOrgTkList().get(0).getJrnyList().get(0).getTrnNo());
        return trainInquiryRequestArr;
    }

    public void S0() {
        this.f28571s.clear();
        try {
            SmartAgentInterface smartAgentInterface = this.f28570r;
            if (smartAgentInterface != null && smartAgentInterface.getAllMsg() != null) {
                this.f28571s = (ArrayList) this.f28570r.getAllMsg();
                this.f28570r.setAllReadCheck();
            }
        } catch (Exception e8) {
            t.e(e8.getMessage());
        }
        setList();
    }

    private TCReservationDao.TCReservationRequest T0() {
        return D4.b.getTicketChangeReservationRequest(this.f28574v, this.f28572t, "TC");
    }

    public void U0(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        try {
            if (!str.contains("[")) {
                str = "[" + str + "]";
            }
            JSONArray jSONArray = new JSONArray(str);
            for (int i8 = 0; i8 < jSONArray.length(); i8++) {
                ArrayList arrayList2 = new ArrayList();
                JSONObject jSONObject = new JSONObject(jSONArray.get(i8).toString());
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    arrayList2.add(jSONObject.optString(itKeys.next()));
                }
                arrayList.add(arrayList2);
            }
            this.f28573u = str2;
            O0(arrayList);
        } catch (JSONException e8) {
            throw new RuntimeException(e8);
        }
    }

    private V4.b V0(OgTkInquiryDao.OgTkInquiryResponse ogTkInquiryResponse) {
        String[] strArr = {ogTkInquiryResponse.getOrgTkList().get(0).getJrnyList().get(0).getDptRsStnNm(), ogTkInquiryResponse.getOrgTkList().get(0).getJrnyList().get(!r4.e.DIRECT.getCode().equals(ogTkInquiryResponse.getOrgTkList().get(0).getJrnyList().get(0).getJrnyTpCd()) ? 1 : 0).getArvRsStnNm()};
        V4.b bVar = new V4.b(this);
        bVar.setStationInfo(strArr[0], strArr[1], 0);
        return bVar;
    }

    public /* synthetic */ void W0(DialogInterface dialogInterface, int i8) {
        new c(getMainLooper()).sendEmptyMessage(0);
    }

    public /* synthetic */ void X0(String str, DialogInterface dialogInterface, int i8) {
        if (102 == i8) {
            Y0(str, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.korail.talk.network.request.inquiry.RsvInquiryRequest[], java.io.Serializable] */
    private void Y0(String str, CalendarData calendarData) {
        Intent intent = new Intent(getApplicationContext(), (Class<?>) (d.DIRECT_SQ_NO.getCode().equals(str) ? TCDirectInquiryActivity.class : TCTransferInquiryActivity.class));
        intent.putExtra("IS_DIRECT", true);
        intent.putExtra("RESERVATION_TYPE", r4.c.RSV_DEFAULT);
        intent.putExtra("MENU_TYPE", EnumC6175b.DEFAULT);
        intent.putExtra("IS_TRANSFER", false);
        intent.putExtra("INQUIRY_REQUEST", (Serializable) R0(str, calendarData));
        intent.putExtra("RESERVATION_REQUEST", T0());
        intent.putExtra("TIME_CHANGE_EVENT", true);
        startActivityForResult(intent, 117);
    }

    private void Z0() {
        setAppTitle(AbstractC5959j.title_notice_box);
        m0();
        this.f28568p = (ListView) findViewById(AbstractC5955f.list);
    }

    private void a1() {
        int size = this.f28574v.getOrgTkList().size();
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < size; i15++) {
            this.f28577y = this.f28574v.getOrgTkList().get(i15).getRcvdAmt();
            for (int i16 = 0; i16 < this.f28574v.getOrgTkList().get(i15).getJrnyList().get(0).getSeatList().size(); i16++) {
                this.f28576x = this.f28574v.getOrgTkList().get(i15).getJrnyList().get(0).getSeatList().get(i16).getPsrmClCd();
            }
            for (int i17 = 0; i17 < this.f28574v.getOrgTkList().get(i15).getCmpnList().size(); i17++) {
                String psgTpDvCd = this.f28574v.getOrgTkList().get(i15).getCmpnList().get(i17).getPsgTpDvCd();
                String dcntKndCd = this.f28574v.getOrgTkList().get(i15).getCmpnList().get(i17).getDcntKndCd();
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
        this.f28572t = new e(this, bundle);
    }

    private void setList() {
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < this.f28571s.size(); i8++) {
            if (C6054a.IS_DEBUG_LOG || !Integer.toString(16).equals(((MSGVo) this.f28571s.get(i8)).getTaskName())) {
                Bundle bundle = new Bundle();
                bundle.putLong("noticeDate", C6634h.getCalendarFromString(((MSGVo) this.f28571s.get(i8)).getTimeStamp(), "yyyyMMddHHmmss").getTime().getTime());
                bundle.putString("messageId", ((MSGVo) this.f28571s.get(i8)).getTaskName());
                bundle.putString("message", ((MSGVo) this.f28571s.get(i8)).getContent());
                bundle.putString("msg_vo", ((MSGVo) this.f28571s.get(i8)).getParam());
                arrayList.add(bundle);
            }
        }
        J0(arrayList);
        if (this.f28566n.isEmpty()) {
            findViewById(AbstractC5955f.noContentMsgTxt).setVisibility(0);
        } else {
            findViewById(AbstractC5955f.noContentMsgTxt).setVisibility(8);
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    public void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.notice_list_activity);
        this.f28569q = (MSGVo) getIntent().getParcelableExtra("msg_vo");
        if (C6630d.isNull(bundle)) {
            this.f28563k = new SimpleDateFormat(getString(AbstractC5959j.notice_date_m_d_with_garo));
            this.f28564l = new SimpleDateFormat(getString(AbstractC5959j.notice_date_m_d));
            this.f28565m = new SimpleDateFormat(getString(AbstractC5959j.notice_yyyy_mm_dd_hh_mm_ss));
            this.f28570r = g.getInstance().getSmartAgentInterface();
            this.f28571s = new ArrayList();
            Z0();
            new c(getMainLooper()).sendEmptyMessage(0);
            ((NotificationManager) getSystemService("notification")).cancel(1002);
            h.getInstance().setNotificationExist(false);
            K0();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity
    public void onLoginSuccess() {
        super.onLoginSuccess();
        new c(getMainLooper()).sendEmptyMessage(0);
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        super.onReceive(iBaseDao);
        if (AbstractC5955f.dao_og_tk_inquiry == iBaseDao.getId()) {
            OgTkInquiryDao.OgTkInquiryResponse ogTkInquiryResponse = (OgTkInquiryDao.OgTkInquiryResponse) iBaseDao.getResponse();
            this.f28574v = ogTkInquiryResponse;
            final String code = (r4.e.DIRECT.getCode().equals(ogTkInquiryResponse.getOrgTkList().get(0).getJrnyList().get(0).getJrnyTpCd()) ? d.DIRECT_SQ_NO : d.TRANSFER_SQ_NO).getCode();
            a1();
            C6637k.getCDialog(K(), 1002, 0, getString(AbstractC5959j.dialog_title_time_change)).setContent(this.f28573u).setButtonListener(new DialogInterface.OnClickListener() { // from class: L5.b
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    this.f3064a.X0(code, dialogInterface, i8);
                }
            }).setPositiveButtonText(getString(AbstractC5959j.dialog_title_time_change_positive)).showDialog();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f28561i.setTimeInMillis(System.currentTimeMillis());
    }

    private class b extends BaseAdapter {

        /* renamed from: a */
        Calendar f28578a;

        class a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ int f28580a;

            a(int i8) {
                this.f28580a = i8;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                PushHistoryActivity.this.N0(this.f28580a);
            }
        }

        /* renamed from: com.korail.talk.ui.push.PushHistoryActivity$b$b */
        class ViewOnClickListenerC0244b implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ int f28582a;

            ViewOnClickListenerC0244b(int i8) {
                this.f28582a = i8;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                String string = ((Bundle) PushHistoryActivity.this.f28566n.get(this.f28582a)).getString("messageId");
                t.d("messageId - " + string);
                Intent intent = new Intent(PushHistoryActivity.this.getApplicationContext(), (Class<?>) PushHistoryActivity.this.P0(string));
                intent.setFlags(805306368);
                PushHistoryActivity.this.getApplicationContext().startActivity(intent);
            }
        }

        class c implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ int f28584a;

            /* renamed from: b */
            final /* synthetic */ Bundle f28585b;

            c(int i8, Bundle bundle) {
                this.f28584a = i8;
                this.f28585b = bundle;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                PushHistoryActivity.this.U0(((MSGVo) PushHistoryActivity.this.f28571s.get(this.f28584a)).getParam(), this.f28585b.getString("message"));
            }
        }

        class d implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ String f28587a;

            d(String str) {
                this.f28587a = str;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(this.f28587a));
                intent.addFlags(268435456);
                PushHistoryActivity.this.getApplicationContext().startActivity(intent);
            }
        }

        private b() {
            this.f28578a = Calendar.getInstance();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return PushHistoryActivity.this.f28566n.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i8) {
            return PushHistoryActivity.this.f28566n.get(i8);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i8) {
            return 0L;
        }

        @Override // android.widget.Adapter
        public View getView(int i8, View view, ViewGroup viewGroup) throws NumberFormatException {
            if (view == null) {
                try {
                    view = View.inflate(viewGroup.getContext(), AbstractC5957h.notice_list_item, null);
                } catch (Exception e8) {
                    t.e(e8.getMessage());
                }
            }
            Bundle bundle = (Bundle) PushHistoryActivity.this.f28566n.get(i8);
            long j8 = bundle.getLong("noticeDate");
            this.f28578a.setTimeInMillis(j8);
            TextView textView = (TextView) view.findViewById(AbstractC5955f.groupDateTxt);
            if (PushHistoryActivity.this.M0(this.f28578a, 0)) {
                textView.setText(PushHistoryActivity.this.getString(AbstractC5959j.common_today) + X.SPACE + PushHistoryActivity.this.f28563k.format(Long.valueOf(j8)));
            } else if (PushHistoryActivity.this.M0(this.f28578a, -1)) {
                textView.setText(PushHistoryActivity.this.getString(AbstractC5959j.common_yesterday) + X.SPACE + PushHistoryActivity.this.f28563k.format(Long.valueOf(j8)));
            } else if (PushHistoryActivity.this.M0(this.f28578a, -2)) {
                textView.setText(PushHistoryActivity.this.getString(AbstractC5959j.notice_day_before_yesterday) + X.SPACE + PushHistoryActivity.this.f28563k.format(Long.valueOf(j8)));
            } else {
                textView.setText(PushHistoryActivity.this.f28564l.format(Long.valueOf(j8)));
            }
            if (i8 == 0) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) textView.getLayoutParams();
                layoutParams.setMargins(0, N.dpToPx(8.0f), 0, N.dpToPx(8.0f));
                textView.setLayoutParams(layoutParams);
                textView.setVisibility(0);
            } else {
                PushHistoryActivity.this.f28562j.setTimeInMillis(((Bundle) PushHistoryActivity.this.f28566n.get(i8 - 1)).getLong("noticeDate"));
                if (PushHistoryActivity.this.f28562j.get(5) != this.f28578a.get(5)) {
                    textView.setVisibility(0);
                } else {
                    textView.setVisibility(8);
                }
            }
            ((TextView) view.findViewById(AbstractC5955f.noticeDateTxt)).setText(PushHistoryActivity.this.f28565m.format(Long.valueOf(j8)));
            ((TextView) view.findViewById(AbstractC5955f.msgTxt)).setText(bundle.getString("message"));
            view.findViewById(AbstractC5955f.deleteBtn).setOnClickListener(new a(i8));
            int i9 = Integer.parseInt(bundle.getString("messageId"));
            if (i9 == 25 || i9 == 21 || i9 == 35 || i9 == 36) {
                view.findViewById(AbstractC5955f.noticeLayout).setOnClickListener(new ViewOnClickListenerC0244b(i8));
            } else {
                view.setClickable(false);
            }
            if (((MSGVo) PushHistoryActivity.this.f28571s.get(i8)).getTitle().contains("타임체인지")) {
                view.findViewById(AbstractC5955f.noticeLayout).setClickable(true);
                view.findViewById(AbstractC5955f.noticeLayout).setOnClickListener(new c(i8, bundle));
            }
            String url = ((MSGVo) PushHistoryActivity.this.f28571s.get(i8)).getUrl();
            if (url != null && !"".equals(url)) {
                view.findViewById(AbstractC5955f.noticeLayout).setOnClickListener(new d(url));
            }
            return view;
        }

        /* synthetic */ b(PushHistoryActivity pushHistoryActivity, a aVar) {
            this();
        }
    }
}
