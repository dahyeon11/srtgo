package com.korail.talk.ui.web;

import I4.c;
import Q7.X;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.trainsInfo.TrainScheduleDao;
import com.korail.talk.network.dao.trainsInfo.TrainScheduleDao.TrainScheduleRequest;
import com.korail.talk.network.response.seatMovie.RsvInquiryResponse;
import com.korail.talk.ui.web.BaseWebViewActivity;
import com.korail.talk.view.TabView;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import y4.C6537b;
import z4.C6634h;
import z4.N;
import z4.t;

/* loaded from: classes.dex */
public class TrainServiceInfoWebViewActivity extends BaseWebViewActivity implements Runnable, TabView.a {

    /* renamed from: A */
    private TextView f29294A;

    /* renamed from: B */
    private TextView f29295B;

    /* renamed from: C */
    private TabView f29296C;

    /* renamed from: D */
    private WebView f29297D;

    /* renamed from: E */
    private ListView f29298E;

    /* renamed from: F */
    private RsvInquiryResponse.TrainInfo f29299F;

    /* renamed from: G */
    private int f29300G;

    /* renamed from: H */
    private int f29301H;

    /* renamed from: I */
    private boolean f29302I;

    /* renamed from: J */
    private String f29303J;

    /* renamed from: N */
    private Timer f29307N;

    /* renamed from: O */
    private TimerTask f29308O;

    /* renamed from: u */
    private int f29311u;

    /* renamed from: v */
    private int f29312v;

    /* renamed from: w */
    private ViewGroup f29313w;

    /* renamed from: x */
    private TextView f29314x;

    /* renamed from: y */
    private TextView f29315y;

    /* renamed from: z */
    private TextView f29316z;

    /* renamed from: t */
    private c f29310t = new c();

    /* renamed from: K */
    private final StringBuilder f29304K = new StringBuilder();

    /* renamed from: L */
    private Handler f29305L = new a();

    /* renamed from: M */
    private int f29306M = 0;

    /* renamed from: P */
    String f29309P = "";

    class a extends Handler {
        a() {
        }

        @Override // android.os.Handler
        public void dispatchMessage(Message message) {
            super.dispatchMessage(message);
        }
    }

    class b extends TimerTask {

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                TrainServiceInfoWebViewActivity.this.S0();
            }
        }

        b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            TrainServiceInfoWebViewActivity.this.runOnUiThread(new a());
        }
    }

    public void S0() {
        if (this.f29299F != null) {
            TrainScheduleDao trainScheduleDao = new TrainScheduleDao();
            TrainScheduleDao.TrainScheduleRequest trainScheduleRequest = trainScheduleDao.new TrainScheduleRequest();
            trainScheduleRequest.setTxtRunDt(this.f29299F.getH_run_dt());
            trainScheduleRequest.setTxtTrnNo(N.addZero(5, Integer.parseInt(this.f29299F.getH_trn_no())));
            trainScheduleDao.setRequest(trainScheduleRequest);
            trainScheduleDao.setFinishView(true);
            executeDao(trainScheduleDao);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x027b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x01d1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.List T0(java.util.List r19) {
        /*
            Method dump skipped, instructions count: 874
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.korail.talk.ui.web.TrainServiceInfoWebViewActivity.T0(java.util.List):java.util.List");
    }

    private StringBuilder U0() {
        this.f29304K.setLength(0);
        return this.f29304K;
    }

    private boolean V0() {
        Intent intent = getIntent();
        if (intent == null) {
            return false;
        }
        this.f29299F = (RsvInquiryResponse.TrainInfo) M(intent, "TRAIN_INFO");
        return true;
    }

    private void W0(IBaseDao iBaseDao) {
        if (!(iBaseDao instanceof TrainScheduleDao)) {
            onReceiveError(iBaseDao, new C6537b());
        }
        TrainScheduleDao.TrainScheduleResponse trainScheduleResponse = (TrainScheduleDao.TrainScheduleResponse) ((TrainScheduleDao) iBaseDao).getResponse();
        String runDt1 = trainScheduleResponse.getRunDt1();
        String tranNo1 = trainScheduleResponse.getTranNo1();
        List<TrainScheduleDao.TimeInfo> dlayList = trainScheduleResponse.getDlayList();
        this.f29314x.setText(this.f29299F.getH_dpt_rs_stn_nm());
        this.f29315y.setText(this.f29299F.getH_arv_rs_stn_nm());
        this.f29316z.setText(C6634h.convertFormat(runDt1, "yyyyMMdd", "yyyy년 MM월 dd일 (E)"));
        StringBuilder sbU0 = U0();
        sbU0.append(this.f29299F.getH_trn_clsf_nm());
        if (!N.isNull(tranNo1)) {
            sbU0.append(X.SPACE);
            sbU0.append(tranNo1);
        }
        this.f29294A.setText(sbU0.toString());
        String msgCont = trainScheduleResponse.getMsgCont();
        String strReplaceAll = msgCont.replaceAll("[^0-9]", "");
        if (N.isNotNull(strReplaceAll)) {
            N.setSpanRedUnderline(msgCont, this.f29295B, msgCont.indexOf(strReplaceAll), msgCont.indexOf(strReplaceAll) + strReplaceAll.length() + 4, getApplicationContext());
        } else {
            this.f29295B.setText(msgCont);
        }
        this.f29303J = msgCont;
        this.f29313w.setVisibility(0);
        this.f29316z.setVisibility(0);
        this.f29294A.setVisibility(0);
        this.f29295B.setVisibility(0);
        findViewById(AbstractC5955f.colomnView).setVisibility(0);
        this.f29298E.setVisibility(0);
        int integer = N.getInteger(trainScheduleResponse.getRunSegOrdr());
        this.f29300G = integer;
        List listT0 = T0(dlayList);
        if (integer > 0) {
            this.f29300G = integer + this.f29301H;
        }
        this.f29302I = "Y".equals(trainScheduleResponse.getTrnDptFlg());
        this.f29298E.setAdapter((ListAdapter) new com.korail.talk.ui.web.b(this, listT0, this.f29311u, this.f29312v, this.f29300G, this.f29302I, this.f29303J));
        this.f29298E.setSelection(this.f29300G / 2);
    }

    private void Y0() {
        this.f29296C.setTabItemOnSelectedChangeListener(this);
    }

    private void Z0() {
        P0(new BaseWebViewActivity.c(), true);
        Q0(new BaseWebViewActivity.e());
        O0(new BaseWebViewActivity.d());
    }

    private void a1() {
        Timer timer = this.f29307N;
        if (timer != null) {
            timer.cancel();
        }
        TimerTask timerTask = this.f29308O;
        if (timerTask != null) {
            timerTask.cancel();
        }
        this.f29307N = null;
        this.f29308O = null;
    }

    private void b1(boolean z8) {
        if (z8) {
            c1();
        } else {
            a1();
        }
    }

    private void c1() {
        if (this.f29306M != 0) {
            a1();
        } else if (this.f29307N == null) {
            this.f29307N = new Timer();
            b bVar = new b();
            this.f29308O = bVar;
            this.f29307N.schedule(bVar, 60000L);
        }
    }

    protected void X0(Bundle bundle) {
        n0(false);
        View viewFindViewById = findViewById(AbstractC5955f.refreshBtn);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(0);
            viewFindViewById.setOnClickListener(this);
        }
        findViewById(AbstractC5955f.iv_exist_push).setVisibility(8);
        View viewFindViewById2 = findViewById(AbstractC5955f.menuBtn);
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(8);
        }
        TextView textView = (TextView) findViewById(AbstractC5955f.titleTxt);
        this.f29313w = (ViewGroup) findViewById(AbstractC5955f.routebar);
        this.f29316z = (TextView) findViewById(AbstractC5955f.dateTxt);
        this.f29294A = (TextView) findViewById(AbstractC5955f.trainNoTxt);
        this.f29295B = (TextView) findViewById(AbstractC5955f.serviceMsgTxt);
        this.f29298E = (ListView) findViewById(AbstractC5955f.stationList);
        textView.setText(getString(AbstractC5959j.common_train_service_info));
        this.f29313w.removeAllViews();
        View viewInflate = View.inflate(this, AbstractC5957h.direct_two_stations_name, this.f29313w);
        this.f29314x = (TextView) viewInflate.findViewById(AbstractC5955f.departureTxt);
        this.f29315y = (TextView) viewInflate.findViewById(AbstractC5955f.arrivalTxt);
        int iApplyDimension = (int) TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics());
        this.f29311u = (int) TypedValue.applyDimension(1, 64.0f, getResources().getDisplayMetrics());
        this.f29312v = (int) TypedValue.applyDimension(1, 48.0f, getResources().getDisplayMetrics());
        View view = new View(this);
        view.setLayoutParams(new AbsListView.LayoutParams(-1, iApplyDimension));
        this.f29298E.addHeaderView(view, null, false);
        TabView tabView = (TabView) findViewById(AbstractC5955f.tab_view);
        this.f29296C = tabView;
        tabView.setSelectedTabItem(AbstractC5955f.tab_view_item_1, true);
        this.f29297D = (WebView) findViewById(AbstractC5955f.webview);
    }

    @Override // com.korail.talk.ui.web.BaseWebViewActivity, com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i8, int i9, Intent intent) {
        super.onActivityResult(i8, i9, intent);
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, android.view.View.OnClickListener
    public void onClick(View view) {
        O(view);
        if (AbstractC5955f.refreshBtn != view.getId()) {
            super.onClick(view);
        } else {
            a1();
            S0();
        }
    }

    @Override // com.korail.talk.ui.web.BaseWebViewActivity, com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        V0();
        setContentView(AbstractC5957h.train_service_info);
        X0(bundle);
        Z0();
        Y0();
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, android.app.Activity
    protected void onPause() {
        super.onPause();
        t.d("");
        this.f29305L.removeCallbacks(this);
        b1(false);
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        super.onReceive(iBaseDao);
        if (iBaseDao.getId() == AbstractC5955f.dao_train_schedule) {
            a1();
            b1(true);
            W0(iBaseDao);
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, android.app.Activity
    protected void onResume() {
        super.onResume();
        this.f29305L.post(this);
        b1(true);
    }

    @Override // com.korail.talk.view.TabView.a
    public void onTabItemSelectedChanged(View view) {
        O(view);
        int id = view.getId();
        if (AbstractC5955f.tab_view_item_1 == id) {
            this.f29306M = 0;
            a1();
            S0();
            this.f29297D.setVisibility(8);
            findViewById(AbstractC5955f.refreshBtn).setVisibility(0);
            findViewById(AbstractC5955f.serviceMsgTxt).setVisibility(0);
            return;
        }
        if (AbstractC5955f.tab_view_item_2 == id) {
            this.f29306M = 1;
            a1();
            this.f29297D.setVisibility(0);
            findViewById(AbstractC5955f.refreshBtn).setVisibility(8);
            findViewById(AbstractC5955f.serviceMsgTxt).setVisibility(8);
            showMapView();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        a1();
        S0();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void showMapView() {
        /*
            r4 = this;
            I4.c r0 = r4.f29310t
            r0.requestLocationUpdates(r4)
            I4.c r0 = r4.f29310t
            boolean r0 = z4.C6630d.isNotNull(r0)
            if (r0 == 0) goto L2a
            I4.c r0 = r4.f29310t
            android.location.Location r0 = r0.getLastKnownLocation()
            boolean r1 = z4.C6630d.isNotNull(r0)
            if (r1 == 0) goto L2a
            double r1 = r0.getLatitude()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            double r2 = r0.getLongitude()
            java.lang.String r0 = java.lang.String.valueOf(r2)
            goto L2d
        L2a:
            java.lang.String r1 = ""
            r0 = r1
        L2d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "https://gis.korail.com/korailTalk/entrance?route=ticket&trnNo="
            r2.append(r3)
            com.korail.talk.network.response.seatMovie.RsvInquiryResponse$TrainInfo r3 = r4.f29299F
            java.lang.String r3 = r3.getH_trn_no()
            r2.append(r3)
            java.lang.String r3 = "&stnCd="
            r2.append(r3)
            com.korail.talk.network.response.seatMovie.RsvInquiryResponse$TrainInfo r3 = r4.f29299F
            java.lang.String r3 = r3.getH_dpt_rs_stn_cd()
            r2.append(r3)
            java.lang.String r3 = "&date="
            r2.append(r3)
            com.korail.talk.network.response.seatMovie.RsvInquiryResponse$TrainInfo r3 = r4.f29299F
            java.lang.String r3 = r3.getH_dpt_dt()
            r2.append(r3)
            java.lang.String r3 = "&lon="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = "&lat="
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            r4.f29309P = r0
            r4.N0(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.korail.talk.ui.web.TrainServiceInfoWebViewActivity.showMapView():void");
    }
}
