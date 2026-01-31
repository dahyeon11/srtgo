package i5;

import A6.g;
import I4.h;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.NetfunnelDao;
import com.korail.talk.network.dao.reservation.GuideSeatCndDao;
import com.korail.talk.network.dao.reservation.GuideSeatCndDao.GudieSeatCndRequest;
import com.korail.talk.network.dao.seatMovie.ProductTrainInquiryDao;
import com.korail.talk.network.dao.seatMovie.TrainInquiryDao;
import com.korail.talk.network.request.inquiry.ProductTrainInquiryRequest;
import com.korail.talk.network.request.inquiry.RsvInquiryRequest;
import com.korail.talk.network.request.inquiry.TrainInquiryRequest;
import com.korail.talk.network.response.seatMovie.RsvInquiryResponse;
import com.korail.talk.ui.limousine.LimousineActivity;
import com.korail.talk.ui.limousine.RenewalLimousineActivity;
import com.korail.talk.viewGroup.DropDownSelector;
import h5.AbstractActivityC5631u;
import j5.AbstractActivityC5828a;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import n4.AbstractC5955f;
import n4.AbstractC5959j;
import p4.C6054a;
import r4.EnumC6175b;
import r4.p;
import r4.s;
import u4.e;
import y4.C6536a;
import z4.C6630d;
import z4.C6631e;
import z4.C6634h;
import z4.C6637k;
import z4.C6641o;
import z4.N;
import z4.t;

/* renamed from: i5.c */
/* loaded from: classes.dex */
public abstract class AbstractActivityC5703c extends AbstractActivityC5631u {

    /* renamed from: X */
    protected RsvInquiryRequest f31909X;

    /* renamed from: Y */
    protected RsvInquiryRequest[] f31910Y;

    /* renamed from: Z */
    protected u4.c f31911Z;

    /* renamed from: a0 */
    protected e f31912a0;

    /* renamed from: b0 */
    protected ArrayList f31913b0;

    /* renamed from: c0 */
    private String f31914c0 = "";

    /* renamed from: d0 */
    private String f31915d0 = "";

    /* renamed from: e0 */
    private String f31916e0 = "";

    /* renamed from: f0 */
    private String f31917f0 = "";

    /* renamed from: g0 */
    private String f31918g0 = "";

    /* renamed from: i5.c$a */
    class a extends Handler {
        a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            BaseRequest request;
            g.d dVar = g.d.toEnum(message.what);
            if (dVar.isContinue()) {
                return;
            }
            if (g.d.UserStop == dVar) {
                AbstractActivityC5703c.this.e2(true);
                try {
                    AbstractActivityC5703c.this.f31911Z.dismiss();
                } catch (Exception e8) {
                    if (C6054a.IS_DEBUG_LOG) {
                        e8.printStackTrace();
                    }
                }
                AbstractActivityC5703c.this.f31912a0.dismissDialog();
                g.END();
                return;
            }
            BaseDao productTrainInquiryDao = AbstractActivityC5703c.this.f31909X instanceof ProductTrainInquiryRequest ? new ProductTrainInquiryDao() : new TrainInquiryDao();
            if (AbstractActivityC5703c.this.f31909X.getChtnRsStnCd() != null && (request = productTrainInquiryDao.getRequest()) != null && (request instanceof RsvInquiryRequest)) {
                RsvInquiryRequest rsvInquiryRequest = (RsvInquiryRequest) request;
                rsvInquiryRequest.setTrnGpCd(AbstractActivityC5703c.this.f31909X.getTrnGpCd());
                rsvInquiryRequest.setTrnGpCnt(AbstractActivityC5703c.this.f31909X.getTrnGpCnt());
                rsvInquiryRequest.setChtnRsStnCd(AbstractActivityC5703c.this.f31909X.getChtnRsStnCd());
                rsvInquiryRequest.setChtnCnt(AbstractActivityC5703c.this.f31909X.getChtnCnt());
            }
            productTrainInquiryDao.setRequest(AbstractActivityC5703c.this.f31909X);
            productTrainInquiryDao.setNotShowDialog(true);
            AbstractActivityC5703c abstractActivityC5703c = AbstractActivityC5703c.this;
            productTrainInquiryDao.setNetfunnelDao(new NetfunnelDao(abstractActivityC5703c.f31911Z, abstractActivityC5703c.f31912a0, null, new Handler(abstractActivityC5703c.getMainLooper())));
            AbstractActivityC5703c.this.executeDao(productTrainInquiryDao);
        }
    }

    public /* synthetic */ void I0(DialogInterface dialogInterface, int i8) {
        if (100 == i8) {
            finish();
        } else if (102 == i8) {
            if (h.getInstance().isLogin()) {
                C6641o.navigation(K(), C6054a.IS_LIMOUSINE_TEST ? RenewalLimousineActivity.class : LimousineActivity.class);
            } else {
                C6641o.moveToLogin(K());
            }
        }
    }

    private void L0() {
        this.f31588n = (r4.c) getIntent().getSerializableExtra("RESERVATION_TYPE");
        if (getIntent().hasExtra("INQUIRY_REQUEST")) {
            Object[] objArr = (Object[]) getIntent().getSerializableExtra("INQUIRY_REQUEST");
            this.f31910Y = (RsvInquiryRequest[]) Arrays.copyOf(objArr, objArr.length, RsvInquiryRequest[].class);
            try {
                if (C0() == r4.c.RSV_DEFAULT || C0() == r4.c.RSV_GOING) {
                    this.f31909X = this.f31910Y[0].mo405clone();
                } else {
                    this.f31909X = this.f31910Y[1].mo405clone();
                }
            } catch (CloneNotSupportedException e8) {
                t.e(e8.getMessage());
            }
        }
        this.f31909X.setQryDvCd("1");
        this.f31909X.setSelectTransferPage(this.f31914c0.isEmpty() ? "0" : this.f31914c0, this.f31916e0.isEmpty() ? "10" : this.f31916e0);
        this.f31909X.setSelectTransferPages(this.f31917f0.isEmpty() ? "00000" : this.f31917f0, this.f31918g0);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("TRANSFER_CHTNRSSTNCD");
        String stringExtra2 = intent.getStringExtra("TRANSFER_TRNGPCD");
        boolean booleanExtra = intent.getBooleanExtra("IS_SELECT_TRANSFER", false);
        t.d("setData - " + this);
        t.d("isSelectTransfer - " + booleanExtra + "chtnrsStnCd - " + stringExtra + " trngpcd - " + stringExtra2);
        if (stringExtra != null) {
            this.f31909X.setChtnRsStnCd(stringExtra);
            this.f31909X.setChtnCnt("1");
            this.f31909X.setTrnGpCnt("1");
            this.f31909X.setTrnGpCd(stringExtra2);
            this.f31909X.setSelectTransferPage("0", "0");
        }
    }

    public /* synthetic */ void v2(DialogInterface dialogInterface, int i8) {
        if (100 == i8) {
            ((DropDownSelector) findViewById(AbstractC5955f.seatOptionFilter)).setDropDownIndex(0);
        } else if (102 == i8) {
            v0();
            this.f31909X.setTxtGoHour(C1());
            this.f31909X.setTxtSeatAttCd_4(p.EVACUATION_HELPER.getCode());
            s2();
        }
    }

    @Override // h5.AbstractActivityC5631u
    protected String A1() {
        return C6634h.convertFormat(this.f31909X.getTxtGoAbrdDt(), "yyyyMMdd", "yyyy년 MM월 dd일 (E)");
    }

    @Override // h5.AbstractActivityC5631u
    protected void B1() {
        String str;
        String str2;
        String str3 = this.f31914c0;
        if (str3 != null && !"".equals(str3)) {
            this.f31909X.setNextTimeTC(this.f31914c0, this.f31915d0);
        }
        String str4 = this.f31914c0;
        if (str4 != null && !"".equals(str4) && (str2 = this.f31916e0) != null && !"".equals(str2)) {
            this.f31909X.setSelectTransferPage(this.f31914c0, this.f31916e0);
        }
        String str5 = this.f31917f0;
        if (str5 != null && !"".equals(str5) && (str = this.f31918g0) != null && !"".equals(str)) {
            this.f31909X.setSelectTransferPages(this.f31917f0, this.f31918g0);
        }
        if (this.f31591q) {
            this.f31909X.setNextStartTime(this.f31586l);
        }
        s2();
    }

    @Override // h5.AbstractActivityC5621k
    protected r4.c C0() {
        return this.f31588n;
    }

    @Override // h5.AbstractActivityC5631u
    protected String C1() {
        return ((C0() == r4.c.RSV_DEFAULT || C0() == r4.c.RSV_GOING) ? this.f31910Y[0] : this.f31910Y[1]).getTxtGoHour();
    }

    @Override // h5.AbstractActivityC5631u
    protected boolean F1() {
        return C6634h.isToday(this.f31909X.getTxtGoAbrdDt());
    }

    @Override // h5.AbstractActivityC5631u
    protected void T1() {
        this.f31909X.setTxtGoHour(C1());
        s2();
    }

    @Override // h5.AbstractActivityC5617g
    protected String X0() {
        RsvInquiryRequest rsvInquiryRequest = this.f31909X;
        return rsvInquiryRequest instanceof TrainInquiryRequest ? ((TrainInquiryRequest) rsvInquiryRequest).getTxtJobDv() : "";
    }

    @Override // h5.AbstractActivityC5631u
    protected void f2(p pVar) {
        p pVar2 = p.EVACUATION_HELPER;
        if (!pVar2.equals(pVar)) {
            v0();
            this.f31909X.setTxtGoHour(C1());
            this.f31909X.setTxtSeatAttCd_4(pVar.getCode());
            s2();
            return;
        }
        this.f31622P.setEnabled(!pVar2.equals(pVar) && this.f31592r);
        GuideSeatCndDao guideSeatCndDao = new GuideSeatCndDao();
        GuideSeatCndDao.GudieSeatCndRequest gudieSeatCndRequest = guideSeatCndDao.new GudieSeatCndRequest();
        gudieSeatCndRequest.setRqSeatAttCd(pVar2.getCode());
        guideSeatCndDao.setRequest(gudieSeatCndRequest);
        executeDao(guideSeatCndDao);
    }

    @Override // h5.AbstractActivityC5631u
    protected void j2(s sVar) {
        v0();
        this.f31909X.setSelGoTrain(sVar.getCode());
        this.f31909X.setTxtTrnGpCd(sVar.getCode());
        this.f31909X.setTxtGoHour(C1());
        s2();
    }

    @Override // h5.AbstractActivityC5631u
    protected void n2() {
        v0();
        String[] nextDate = C6634h.getNextDate(this.f31909X.getTxtGoAbrdDt() + this.f31909X.getTxtGoHour());
        if (this.f31913b0 != null) {
            String txtGoAbrdDt = this.f31909X.getTxtGoAbrdDt();
            int i8 = 0;
            while (true) {
                if (i8 >= this.f31913b0.size()) {
                    i8 = -1;
                    break;
                } else if (((String) this.f31913b0.get(i8)).equals(txtGoAbrdDt)) {
                    break;
                } else {
                    i8++;
                }
            }
            if (i8 < this.f31913b0.size() - 1) {
                this.f31909X.setTxtGoAbrdDt((String) this.f31913b0.get(i8 + 1));
            } else {
                this.f31909X.setTxtGoAbrdDt(nextDate[0]);
            }
        } else {
            this.f31909X.setTxtGoAbrdDt(nextDate[0]);
        }
        this.f31909X.setTxtGoHour(nextDate[1]);
        this.f31914c0 = "0";
        this.f31916e0 = "10";
        this.f31917f0 = "00000";
        this.f31918g0 = "00000";
        this.f31909X.setSelectTransferPage("0", "10");
        this.f31909X.setSelectTransferPages(this.f31917f0, this.f31918g0);
        RsvInquiryRequest rsvInquiryRequest = (C0() == r4.c.RSV_DEFAULT || C0() == r4.c.RSV_GOING) ? this.f31910Y[0] : this.f31910Y[1];
        rsvInquiryRequest.setTxtGoAbrdDt(nextDate[0]);
        rsvInquiryRequest.setTxtGoHour(nextDate[1]);
        c2(this.f31591q ? null : getString(AbstractC5959j.common_transfer), null);
        V1();
        Z1();
        s2();
    }

    @Override // h5.AbstractActivityC5631u
    protected void o2() {
        v0();
        String[] previousDate = C6634h.getPreviousDate(this.f31909X.getTxtGoAbrdDt() + this.f31909X.getTxtGoHour());
        if (this.f31913b0 != null) {
            String txtGoAbrdDt = this.f31909X.getTxtGoAbrdDt();
            int i8 = 0;
            while (true) {
                if (i8 >= this.f31913b0.size()) {
                    i8 = -1;
                    break;
                } else if (((String) this.f31913b0.get(i8)).equals(txtGoAbrdDt)) {
                    break;
                } else {
                    i8++;
                }
            }
            if (i8 > 0) {
                this.f31909X.setTxtGoAbrdDt((String) this.f31913b0.get(i8 - 1));
            } else {
                this.f31909X.setTxtGoAbrdDt(previousDate[0]);
            }
        } else {
            this.f31909X.setTxtGoAbrdDt(previousDate[0]);
        }
        this.f31909X.setTxtGoHour(previousDate[1]);
        RsvInquiryRequest rsvInquiryRequest = (C0() == r4.c.RSV_DEFAULT || C0() == r4.c.RSV_GOING) ? this.f31910Y[0] : this.f31910Y[1];
        rsvInquiryRequest.setTxtGoAbrdDt(previousDate[0]);
        rsvInquiryRequest.setTxtGoHour(previousDate[1]);
        this.f31914c0 = "0";
        this.f31916e0 = "10";
        this.f31917f0 = "00000";
        this.f31918g0 = "00000";
        this.f31909X.setSelectTransferPage("0", "10");
        this.f31909X.setSelectTransferPages(this.f31917f0, this.f31918g0);
        c2(this.f31591q ? null : getString(AbstractC5959j.common_transfer), null);
        V1();
        Z1();
        s2();
    }

    @Override // h5.AbstractActivityC5621k, com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        if (C6630d.isNull(bundle)) {
            L0();
        }
    }

    @Override // h5.AbstractActivityC5631u, com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        int id = iBaseDao.getId();
        if (AbstractC5955f.dao_train_inquiry != id) {
            if (AbstractC5955f.dao_guide_seat_cnd != id) {
                super.onReceive(iBaseDao);
                return;
            }
            BaseResponse response = iBaseDao.getResponse();
            if ("S137".equals(response.gethMsgCd())) {
                C6637k.getCDialog(K(), 1002, 0, getString(AbstractC5959j.dialog_title)).setContent(response.gethMsgTxt()).setButtonListener(new DialogInterface.OnClickListener() { // from class: i5.b
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i8) {
                        this.f31908a.v2(dialogInterface, i8);
                    }
                }).showDialog();
                return;
            }
            return;
        }
        RsvInquiryResponse rsvInquiryResponse = (RsvInquiryResponse) iBaseDao.getResponse();
        this.f31914c0 = rsvInquiryResponse.getH_qry_st_no_next();
        this.f31915d0 = rsvInquiryResponse.getH_trn_no_next();
        this.f31916e0 = rsvInquiryResponse.getH_rslt_cnt();
        this.f31917f0 = rsvInquiryResponse.getH_prcd_trn_no_next();
        this.f31918g0 = rsvInquiryResponse.getH_ectb_trn_no_next();
        List<RsvInquiryResponse.TrainInfo> trn_info = rsvInquiryResponse.getTrn_infos().getTrn_info();
        for (RsvInquiryResponse.TrainInfo trainInfo : trn_info) {
            trainInfo.setTxtGdNo(rsvInquiryResponse.getH_gd_no());
            trainInfo.setTotPsgCnt(this.f31909X.getTotalCount());
        }
        List<RsvInquiryResponse.TrainInfo> directReorderList = this.f31591q ? B4.a.getDirectReorderList(this.f31586l, trn_info) : B4.a.getTransferReorderList(this.f31586l, trn_info);
        this.f31586l.addAll(directReorderList);
        P0(directReorderList);
        boolean zIsEmpty = this.f31587m.isEmpty();
        M0(zIsEmpty);
        if (!zIsEmpty) {
            String h_next_pg_flg = rsvInquiryResponse.getH_next_pg_flg();
            if (h_next_pg_flg != null) {
                boolean zEquals = h_next_pg_flg.equals("Y");
                this.f31583i = zEquals;
                if (!zEquals) {
                    Y1();
                }
            }
            S1();
        }
        String h_notice_msg = rsvInquiryResponse.getH_notice_msg();
        if (this.f31584j && N.isNotNull(h_notice_msg)) {
            C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(h_notice_msg).showDialog();
        }
        this.f31584j = false;
        e2(true);
    }

    @Override // h5.AbstractActivityC5621k, com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceiveError(IBaseDao iBaseDao, C6536a c6536a) {
        int id = iBaseDao.getId();
        if (AbstractC5955f.dao_train_inquiry != id) {
            if (AbstractC5955f.dao_guide_seat_cnd == id) {
                ((DropDownSelector) findViewById(AbstractC5955f.seatOptionFilter)).setDropDownIndex(0);
                return;
            } else {
                super.onReceiveError(iBaseDao, c6536a);
                return;
            }
        }
        RsvInquiryResponse rsvInquiryResponse = (RsvInquiryResponse) iBaseDao.getResponse();
        if ("S134".equals(rsvInquiryResponse.gethMsgCd())) {
            C6637k.getCDialog(K(), 1002, 0, getString(AbstractC5959j.dialog_title)).setContent(rsvInquiryResponse.gethMsgTxt()).setButtonListener(new DialogInterface.OnClickListener() { // from class: i5.a
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    this.f31907a.I0(dialogInterface, i8);
                }
            }).showDialog();
        } else {
            C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(c6536a.getMessage()).showDialog();
        }
        if (C6630d.isNull(this.f31587m) || this.f31587m.isEmpty()) {
            M0(true);
        }
        e2(true);
    }

    protected void s2() {
        if (!(this instanceof AbstractActivityC5828a) || EnumC6175b.TOUR_TRAIN == B0()) {
            t.e("여행 변경 | 관광");
            TrainInquiryDao trainInquiryDao = new TrainInquiryDao();
            trainInquiryDao.setRequest(this.f31909X);
            trainInquiryDao.setNotShowDialog(true);
            executeDao(trainInquiryDao);
            return;
        }
        String str = this.f31909X instanceof ProductTrainInquiryRequest ? r4.g.NETFUNNEL_ACTION_PRODUCT_ID : C6631e.isPeakSeason(C6634h.getCalendarInfo(C6634h.getCalendarFromString(y0(), "yyyyMMdd"))) ? r4.g.NETFUNNEL_ACTION_ID_PEAKSEASON : r4.g.NETFUNNEL_ACTION_ID;
        t.e("[Netfunnel 일반 | 상품 | 4인동반석] date : " + y0() + ", netfunnelId : " + str + ", isPeakSeason : " + r4.g.NETFUNNEL_ACTION_ID_PEAKSEASON.equals(str));
        boolean z8 = C6054a.IS_DEBUG_LOG;
        if (C6630d.isNull(this.f31912a0) || !this.f31912a0.isShowing()) {
            e eVar = new e(this);
            this.f31912a0 = eVar;
            eVar.showDialog();
            u4.c cVar = new u4.c(this);
            this.f31911Z = cVar;
            cVar.show();
        }
        g.BEGIN(r4.g.NETFUNNEL_SERVER_ID, str, this.f31912a0, new a());
    }

    protected String t2() {
        return this.f31909X.getTxtSeatAttCd_4();
    }

    protected boolean u2() {
        int adultCount = this.f31909X.getAdultCount();
        int totalCount = this.f31909X.getTotalCount();
        return C0() == r4.c.RSV_DEFAULT && r4.d.DIRECT_SQ_NO.getCode().equals(this.f31909X.getRadJobId()) && totalCount == 1 && totalCount == adultCount;
    }

    @Override // h5.AbstractActivityC5621k
    protected String x0() {
        return this.f31909X.getTxtGoEnd();
    }

    @Override // h5.AbstractActivityC5621k
    protected String y0() {
        return this.f31909X.getTxtGoAbrdDt();
    }

    @Override // h5.AbstractActivityC5621k
    protected String z0() {
        return this.f31909X.getTxtGoStart();
    }
}
