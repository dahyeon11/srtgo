package I5;

import A6.g;
import J5.d;
import Q7.X;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.ViewFlipper;
import com.kakao.sdk.auth.Constants;
import com.korail.talk.data.CreditCardData;
import com.korail.talk.data.PlayAppData;
import com.korail.talk.data.PointData;
import com.korail.talk.data.StbkData;
import com.korail.talk.database.model.CreditCard;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.cashReceipt.CashReceiptIssueDao;
import com.korail.talk.network.dao.cashReceipt.CashReceiptIssueDao.CashReceiptIssueRequest;
import com.korail.talk.network.dao.common.CommonCodeDao;
import com.korail.talk.network.dao.common.EncryptDao;
import com.korail.talk.network.dao.common.KBPayEncryptDao;
import com.korail.talk.network.dao.common.KBPayEncryptDao.KBpayEncryptRequest;
import com.korail.talk.network.dao.common.SeedEncryptDao;
import com.korail.talk.network.dao.common.SeedEncryptDao.SeedEncryptRequest;
import com.korail.talk.network.dao.gifticket.GifticketListDao;
import com.korail.talk.network.dao.gifticket.GifticketListDao.GifticketListRequest;
import com.korail.talk.network.dao.pass.CommPaymentDao;
import com.korail.talk.network.dao.pass.PassPaymentDao;
import com.korail.talk.network.dao.pay.IntgStlDao;
import com.korail.talk.network.dao.pay.NaverPayMoneyRsvDao;
import com.korail.talk.network.dao.pay.NaverPayMoneyRsvDao.NaverPayMoneyRsvRequest;
import com.korail.talk.network.dao.pay.NaverPayRsvDao;
import com.korail.talk.network.dao.pay.NaverPayRsvDao.NaverPayRsvRequest;
import com.korail.talk.network.dao.pay.PaycoDao;
import com.korail.talk.network.dao.pay.PaycoDao.PaycoPaymentRequest;
import com.korail.talk.network.dao.pay.SpayCphdDatValDao;
import com.korail.talk.network.dao.pay.SpayCphdDatValDao.SpayCphdDatValRequest;
import com.korail.talk.network.dao.pay.SpayOdrNoDao;
import com.korail.talk.network.dao.pay.SpayOdrNoDao.SpayOdrNoRequest;
import com.korail.talk.network.dao.pay.StbkAcntDao;
import com.korail.talk.network.dao.pay.TossAutoCreateDao;
import com.korail.talk.network.dao.pay.TossAutoStlKeyQryDao;
import com.korail.talk.network.dao.pay.TossAutoStlKeyQryDao.StlKeyQryRequest;
import com.korail.talk.network.dao.payment.RsvPaymentDao;
import com.korail.talk.network.dao.xPoint.LPointDao;
import com.korail.talk.network.dao.xPoint.LPointDao.LPointInquiryRequest;
import com.korail.talk.network.dao.xPoint.OKCashbagCertDao;
import com.korail.talk.network.dao.xPoint.OKCashbagCertDao.OKCashbagCertRequest;
import com.korail.talk.network.dao.xPoint.PointInquiryDao;
import com.korail.talk.network.dao.xPoint.PointInquiryDao.PointInquiryRequest;
import com.korail.talk.network.request.payment.IPaymentRequest;
import com.korail.talk.network.request.payment.PaymentMethod;
import com.korail.talk.network.response.certification.ReservationResponse;
import com.korail.talk.ui.menu.tripbooking.TripBookingListActivity;
import com.korail.talk.ui.payment.fragment.payment.option.easyPay.EasyStbkPayOption;
import com.korail.talk.ui.payment.fragment.payment.option.easyPay.InstallmentOption;
import com.korail.talk.ui.stbk.StbkRegisterAccountListActivity;
import com.korail.talk.ui.ticket.confirm.TicketListActivity;
import com.korail.talk.ui.ticket.confirm.TicketSelfCheckinStatusActivity;
import com.korail.talk.ui.web.EasyPayWebViewActivity;
import com.korail.talk.view.TabView;
import com.korail.talk.view.payment.creditCard.CreditCardView;
import com.korail.talk.view.payment.point.CityPointView;
import com.korail.talk.view.payment.point.GifticketView;
import com.korail.talk.view.payment.point.KTXMileageView;
import com.korail.talk.view.payment.point.LPointView;
import com.korail.talk.view.payment.point.OkCashBackPointView;
import com.korail.talk.view.payment.point.RailPointView;
import com.korail.talk.view.payment.point.WoorimorePointView;
import f.C5378a;
import f.InterfaceC5379b;
import h1.C5577a;
import j1.C5813c;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import k0.AbstractC5837a;
import m4.C5908a;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import o4.C6038a;
import r4.i;
import w6.ViewOnClickListenerC6475c;
import y4.C6536a;
import z4.C6627a;
import z4.C6630d;
import z4.C6634h;
import z4.C6637k;
import z4.C6641o;
import z4.G;
import z4.H;
import z4.I;
import z4.N;
import z4.P;
import z4.q;
import z4.t;
import z4.z;

/* loaded from: classes.dex */
public abstract class e extends G5.a implements TabView.a, ViewOnClickListenerC6475c.a, KTXMileageView.a, RailPointView.a, WoorimorePointView.a, CityPointView.a, OkCashBackPointView.a, LPointView.a, GifticketView.a, d.a {

    /* renamed from: A0 */
    private u4.e f2111A0;

    /* renamed from: B0 */
    private J5.f f2112B0;

    /* renamed from: C0 */
    private Handler f2113C0;

    /* renamed from: m0 */
    protected int f2118m0;

    /* renamed from: n0 */
    private PointData f2119n0;

    /* renamed from: o0 */
    private CreditCardData f2120o0;

    /* renamed from: p0 */
    private SpayOdrNoDao.SpayOdrNoResponse f2121p0;

    /* renamed from: q0 */
    private TossAutoStlKeyQryDao.SimplePayInfo f2122q0;

    /* renamed from: r0 */
    private String f2123r0;

    /* renamed from: s0 */
    private String f2124s0;

    /* renamed from: u0 */
    private TabView f2126u0;

    /* renamed from: v0 */
    protected ViewOnClickListenerC6475c f2127v0;

    /* renamed from: w0 */
    private ViewFlipper f2128w0;

    /* renamed from: x0 */
    private com.korail.talk.view.payment.creditCard.a f2129x0;

    /* renamed from: y0 */
    private J5.d f2130y0;

    /* renamed from: z0 */
    private u4.c f2131z0;

    /* renamed from: k0 */
    private final String f2116k0 = "/classes/com.korail.mobile.pay.stbkAcntStlR.do?";

    /* renamed from: l0 */
    private final String f2117l0 = "/classes/com.korail.mobile.pay.bcUsrAthnR.do?";

    /* renamed from: t0 */
    private boolean f2125t0 = false;

    /* renamed from: D0 */
    private final CreditCardView.c f2114D0 = new c();

    /* renamed from: E0 */
    private final f.d f2115E0 = registerForActivityResult(new g.c(), new InterfaceC5379b() { // from class: I5.d
        @Override // f.InterfaceC5379b
        public final void onActivityResult(Object obj) {
            this.f2110a.x1((C5378a) obj);
        }
    });

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (e.this.u1()) {
                e.this.M1();
                return;
            }
            if (e.this.f2126u0.getSelectedTabId() == AbstractC5955f.tvi_general_pay) {
                if (e.this.t1()) {
                    e.this.G1();
                    return;
                }
                return;
            }
            String payType = e.this.f2130y0.getEasyPayData() == null ? "" : e.this.f2130y0.getEasyPayData().getPayType();
            if (payType.isEmpty()) {
                C6637k.getCDialog(e.this.getActivity(), 1001, 1, e.this.getString(AbstractC5959j.dialog_title)).setContent(e.this.getString(AbstractC5959j.payment_not_selected_pay)).showDialog();
                e.this.fullDownScroll();
                return;
            }
            if (StbkAcntDao.CHANGE_PASSWORD.equals(payType)) {
                if (e.this.f2130y0.getStbkPayOption().isValid()) {
                    StbkData stbkData = new StbkData();
                    stbkData.setType(1);
                    Intent intent = new Intent(e.this.getApplicationContext(), (Class<?>) StbkRegisterAccountListActivity.class);
                    intent.putExtra("STBK_DATA", stbkData);
                    e.this.startActivity(intent);
                    return;
                }
                return;
            }
            if ("1".equals(payType)) {
                e.this.z1();
                return;
            }
            if ("0".equals(payType)) {
                e.this.D1();
                return;
            }
            if ("6".equals(payType)) {
                e.this.h1();
                return;
            }
            if ("12".equals(payType)) {
                if (e.this.f2130y0.getStbkPayOption().isValid()) {
                    e.this.g1();
                    return;
                }
                return;
            }
            if (StbkAcntDao.ACCOUNT_REGISTER.equals(payType)) {
                e.this.o1(TicketSelfCheckinStatusActivity.CHECKIN_STATUS_NOT_USE);
                return;
            }
            if ("3".equals(payType)) {
                e.this.j1();
                return;
            }
            if ("2".equals(payType)) {
                e eVar = e.this;
                eVar.m1("한국철도공사", String.valueOf(eVar.getReceivedAmount()));
                return;
            }
            if ("11".equals(payType)) {
                InstallmentOption installmentOption = e.this.f2130y0.getInstallmentOption();
                String installmentType = N.getInteger(C4.a.getInstallmentType(installmentOption.getSelectedDropDownId())) > 0 ? C4.a.getInstallmentType(installmentOption.getSelectedDropDownId()) : "00";
                e eVar2 = e.this;
                eVar2.e1(String.valueOf(eVar2.getReceivedAmount()), installmentType);
                return;
            }
            if (StbkAcntDao.DELETE_ACCOUNT.equals(payType) && C6630d.isNotNull(e.this.f2122q0)) {
                Bundle bundle = new Bundle();
                bundle.putString("type", "tosspay_auto");
                bundle.putString("payMethod", "TOSS_MONEY");
                bundle.putString("spayTid", e.this.f2122q0.getSpayStlKeyVal());
                e.this.J1(bundle);
                return;
            }
            if ("10".equals(payType)) {
                e.this.o1("12");
                return;
            }
            if ("7".equals(payType)) {
                if (e.this.f2130y0.getStbkPayOption().isValid()) {
                    e.this.B1(z.getWebHost() + "/classes/com.korail.mobile.pay.stbkAcntStlR.do?" + r4.g.COMMON_PARAMETER + "&trPrice=" + e.this.getReceivedAmount());
                    return;
                }
                return;
            }
            if ("8".equals(payType)) {
                InstallmentOption installmentOption2 = e.this.f2130y0.getInstallmentOption();
                e.this.B1(z.getWebHost() + "/classes/com.korail.mobile.pay.bcUsrAthnR.do?" + r4.g.COMMON_PARAMETER + "&payAmt=" + e.this.getReceivedAmount() + "&insMmNum=" + (N.getInteger(C4.a.getInstallmentType(installmentOption2.getSelectedDropDownId())) > 0 ? C4.a.getInstallmentType(installmentOption2.getSelectedDropDownId()) : "00"));
            }
        }
    }

    class b extends Handler {

        /* renamed from: a */
        final /* synthetic */ Runnable f2133a;

        b(Runnable runnable) {
            this.f2133a = runnable;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            g.d dVar = g.d.toEnum(message.what);
            e.this.f2131z0.dismiss();
            if (dVar.isContinue()) {
                return;
            }
            e.this.f2111A0.dismissDialog();
            if (g.d.Success == dVar) {
                e.this.f2113C0.post(this.f2133a);
            }
            A6.g.END();
        }
    }

    class c implements CreditCardView.c {
        c() {
        }

        @Override // com.korail.talk.view.payment.creditCard.CreditCardView.c
        public void onCardScan(String str) {
            e.this.f2115E0.launch(new C5577a(e.this.requireActivity()).startWithCamera(e.this.requireActivity()));
        }
    }

    private void A0() {
        this.f2126u0.setTabItemOnSelectedChangeListener(this);
        this.f2127v0.setOnSelectChangeListener(this);
        this.f2127v0.getKTXMileage().setOnActionListener(this);
        this.f2127v0.getRailPoint().setOnActionListener(this);
        this.f2127v0.getWoorimorePoint().setOnActionListener(this);
        this.f2127v0.getCityPoint().setOnActionListener(this);
        this.f2127v0.getOkCashBackPoint().setOnActionListener(this);
        this.f2127v0.getLPoint().setOnActionListener(this);
        this.f2127v0.getGifticketView().setOnActionListener(this);
        this.f2130y0.setInterface(this);
    }

    public void B1(String str) {
        Intent intent = new Intent(getActivity(), (Class<?>) EasyPayWebViewActivity.class);
        intent.putExtra("WEB_GET_URL", str);
        startActivity(intent);
    }

    private void C0() {
        this.f2126u0 = (TabView) p0(AbstractC5955f.tab_view);
        ViewGroup viewGroup = (ViewGroup) p0(AbstractC5955f.v_payment_container);
        ViewOnClickListenerC6475c viewOnClickListenerC6475c = new ViewOnClickListenerC6475c(getActivity());
        this.f2127v0 = viewOnClickListenerC6475c;
        viewGroup.addView(viewOnClickListenerC6475c);
        ViewFlipper viewFlipper = new ViewFlipper(getActivity());
        this.f2128w0 = viewFlipper;
        viewFlipper.setMeasureAllChildren(false);
        this.f2129x0 = new com.korail.talk.view.payment.creditCard.a(getActivity(), this.f2114D0);
        this.f2130y0 = new J5.d(getActivity());
        this.f2128w0.addView(this.f2129x0);
        this.f2128w0.addView(this.f2130y0);
        viewGroup.addView(this.f2128w0);
        this.f2129x0.expand();
    }

    private void C1(String str, int i8) {
        Intent intent = new Intent(getActivity(), (Class<?>) EasyPayWebViewActivity.class);
        intent.putExtra("WEB_GET_URL", str);
        startActivityForResult(intent, i8);
    }

    public void D1() {
        I4.h hVar = I4.h.getInstance();
        PlayAppData playAppData = new PlayAppData();
        playAppData.setIntent(G.getIntentScheme(getString(AbstractC5959j.payment_zero_pay_scheme, String.valueOf(getReceivedAmount()), hVar.getMemberNum()), "com.mic.set.hce.railpluscardserviceandroid"));
        playAppData.setShowDialog(true);
        playAppData.setTitle(getString(AbstractC5959j.dialog_title));
        playAppData.setMessageList(getString(AbstractC5959j.payment_zero_pay_app_install));
        G.playApp(getActivity(), playAppData);
    }

    private void E1() {
        CreditCardView creditCardView = this.f2129x0.getCreditCardView();
        creditCardView.setSelectedIndex(0);
        creditCardView.setCardNoEnable(true);
    }

    private void F1(Bundle bundle) {
        CreditCardView creditCardView = this.f2129x0.getCreditCardView();
        creditCardView.setCreditCardInput(bundle);
        creditCardView.setCardNoEnable(false);
    }

    public void G1() {
        PaymentMethod paymentMethod = new PaymentMethod();
        if (r1() > 0) {
            Bundle bundle = new Bundle();
            bundle.putString("PAYMENT_AMOUNT", String.valueOf(getReceivedAmount()));
            paymentMethod = this.f2119n0.getPointType().equals("0") ? C4.a.getCardRequest(bundle, this.f2120o0, this.f2119n0, this.f2112B0) : C4.a.getCardRequest(bundle, this.f2120o0, this.f2119n0, null);
        } else if (i.PAYMENT_TICKET_CHANGE.equals(getPaymentType())) {
            List<ReservationResponse.Dfpy> dfpyList = getReservationResponse().getDfpyList();
            if (C6630d.isNotNull(dfpyList) && !dfpyList.isEmpty()) {
                paymentMethod = C4.a.getCongressRequest(dfpyList.get(0));
            }
        }
        k1(paymentMethod);
    }

    private void H1() {
        CreditCardView creditCardView = this.f2129x0.getCreditCardView();
        List<CreditCard> creditCardList = C6038a.getCreditCardList(getApplicationContext());
        if (creditCardList.isEmpty()) {
            creditCardView.setNoCreditCard();
            return;
        }
        ArrayList<Bundle> arrayList = new ArrayList<>();
        for (int i8 = 0; i8 < creditCardList.size(); i8++) {
            CreditCard creditCard = creditCardList.get(i8);
            Bundle bundle = new Bundle();
            bundle.putString("CARD_NICK_NAME", C5908a.decryptAES(getApplicationContext(), creditCard.getCardNickname()));
            String strDecryptAES = C5908a.decryptAES(getApplicationContext(), creditCard.getCardNumber());
            bundle.putString("CARD_NO", strDecryptAES.substring(0, 4) + g5.e.STATE_NAME_NONE + strDecryptAES.substring(4, 8) + g5.e.STATE_NAME_NONE + strDecryptAES.substring(8, 12) + g5.e.STATE_NAME_NONE + strDecryptAES.substring(12));
            bundle.putString("CARD_MONTH", C5908a.decryptAES(getApplicationContext(), creditCard.getCardValidateMonth()));
            bundle.putString("CARD_YEAR", C5908a.decryptAES(getApplicationContext(), creditCard.getCardValidateYear()));
            bundle.putString("CARD_TYPE", C5908a.decryptAES(getApplicationContext(), creditCard.getCardType()));
            if (creditCard.getBusinessNum() != null) {
                bundle.putString("CARD_BUSINESS_NUMBER", C5908a.decryptAES(getApplicationContext(), creditCard.getBusinessNum()));
            }
            arrayList.add(bundle);
        }
        creditCardView.setCreditCardList(arrayList);
    }

    private void I1() {
        this.f2118m0 = getReceivedAmount();
        PointData pointData = new PointData();
        this.f2119n0 = pointData;
        pointData.setPointType("-1");
        this.f2112B0 = new J5.f();
        this.f2113C0 = new Handler(getContext().getMainLooper());
    }

    public void J1(Bundle bundle) {
        t.e("간편 결제 + 포인트");
        bundle.putString("PAYMENT_AMOUNT", String.valueOf(getReceivedAmount()));
        k1(C4.a.getEasyRequest(bundle, this.f2119n0, this.f2130y0, this.f2112B0));
    }

    private void L1() {
        k1(new PaymentMethod());
    }

    public void M1() {
        int useingMileage = this.f2112B0.getUseingMileage();
        int useingSamsungMileage = this.f2112B0.getUseingSamsungMileage();
        if (useingMileage > 0 && useingSamsungMileage > 0) {
            PaymentMethod pointRequest = C4.a.getPointRequest(1, this.f2119n0, this.f2112B0, "0");
            pointRequest.putAll(C4.a.getPointRequest(2, this.f2119n0, this.f2112B0, StbkAcntDao.CHANGE_PASSWORD));
            k1(pointRequest);
        } else if (useingMileage <= 0 && useingSamsungMileage <= 0) {
            k1(C4.a.getPointRequest(1, this.f2119n0, null, ""));
        } else if (useingMileage > 0) {
            k1(C4.a.getPointRequest(1, this.f2119n0, null, ""));
        } else {
            k1(C4.a.getPointRequest(1, this.f2119n0, this.f2112B0, StbkAcntDao.CHANGE_PASSWORD));
        }
    }

    private void N1() {
        if (((CommonCodeDao.EasyPay) q.fromJson(H.getString(getApplicationContext(), "EASY_PAY_OPTION"), CommonCodeDao.EasyPay.class)).getTab() != 2) {
            this.f2126u0.setSelectedTabItem(AbstractC5955f.tvi_general_pay, true);
        } else {
            this.f2126u0.setSelectedTabItem(AbstractC5955f.tvi_easy_pay, true);
            onTabItemSelectedChanged(p0(AbstractC5955f.tvi_easy_pay));
        }
    }

    private void O1(RsvPaymentDao.RsvPaymentResponse rsvPaymentResponse, final boolean z8) {
        String h_im_flg = rsvPaymentResponse.getH_im_flg();
        List<RsvPaymentDao.TkCouponInfo> tk_coupon_info = rsvPaymentResponse.getTk_coupon_info();
        if (!"Y".equals(h_im_flg) || tk_coupon_info.size() <= 0) {
            return;
        }
        String h_tk_ret_no = tk_coupon_info.get(0).getH_tk_ret_no();
        String h_fdcert_mg_st_dt = tk_coupon_info.get(0).getH_fdcert_mg_st_dt();
        String h_fdcert_mg_cls_dt = tk_coupon_info.get(0).getH_fdcert_mg_cls_dt();
        String h_coup_no = tk_coupon_info.get(0).getH_coup_no();
        String h_cert_pwd = tk_coupon_info.get(0).getH_cert_pwd();
        StringBuilder sb = new StringBuilder();
        if (!N.isNull(h_tk_ret_no) && !N.isNull(h_fdcert_mg_st_dt) && !N.isNull(h_fdcert_mg_cls_dt)) {
            sb.append(getString(AbstractC5959j.payment_member_event_msg, h_tk_ret_no.substring(0, 5) + g5.e.STATE_NAME_NONE + h_tk_ret_no.substring(5, 9) + g5.e.STATE_NAME_NONE + h_tk_ret_no.substring(9, 14) + g5.e.STATE_NAME_NONE + h_tk_ret_no.substring(h_tk_ret_no.length() - 2), C6634h.convertFormat(h_fdcert_mg_st_dt, "yyyyMMdd", "yyyy년 MM월 dd일"), C6634h.convertFormat(h_fdcert_mg_cls_dt, "yyyyMMdd", "yyyy년 MM월 dd일")));
        }
        if (!N.isNull(h_coup_no) && !N.isNull(h_cert_pwd) && I4.h.getInstance().isNonMember()) {
            sb.append(getString(AbstractC5959j.payment_no_member_event_msg, h_coup_no, h_cert_pwd));
        }
        sb.append(getString(AbstractC5959j.payment_event_msg));
        C6637k.getCDialog(getActivity(), 1001, 1, "할인쿠폰 당첨안내").setContent(sb.toString().replaceAll("percent", "%")).setButtonListener(new DialogInterface.OnClickListener() { // from class: I5.b
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                this.f2107a.y1(z8, dialogInterface, i8);
            }
        }).showDialog();
    }

    private void P1(int i8) {
        t.e("type = " + i8 + ", ReadyPoint = " + this.f2127v0.isReadyPoint() + ", UsePoint = " + this.f2127v0.getSelectedUsePoint());
        switch (i8) {
            case 0:
                if (this.f2127v0.isReadyPoint()) {
                    KTXMileageView kTXMileage = this.f2127v0.getKTXMileage();
                    this.f2119n0.setPointType("0");
                    this.f2119n0.setUsePoint(kTXMileage.getApplyPoint());
                } else {
                    this.f2119n0.setPointType("-1");
                }
                E1();
                break;
            case 1:
                if (this.f2127v0.isReadyPoint()) {
                    RailPointView railPoint = this.f2127v0.getRailPoint();
                    this.f2119n0.setPointType("1");
                    this.f2119n0.setUsePoint(railPoint.getApplyPoint());
                } else {
                    this.f2119n0.setPointType("-1");
                }
                E1();
                break;
            case 2:
                if (!this.f2127v0.isReadyPoint()) {
                    this.f2119n0.setPointType("-1");
                    E1();
                    break;
                } else {
                    WoorimorePointView woorimorePoint = this.f2127v0.getWoorimorePoint();
                    Bundle applyCardData = woorimorePoint.getApplyCardData();
                    this.f2119n0.setPointType("2");
                    this.f2119n0.setPointCardNumber(applyCardData.getString("CARD_NO_1") + applyCardData.getString("CARD_NO_2") + applyCardData.getString("CARD_NO_3") + applyCardData.getString("CARD_NO_4"));
                    this.f2119n0.setYear(applyCardData.getString("CARD_YEAR"));
                    this.f2119n0.setMonth(applyCardData.getString("CARD_MONTH"));
                    this.f2119n0.setPassword(applyCardData.getString("CARD_PASSWORD"));
                    this.f2119n0.setUsePoint(woorimorePoint.getApplyPoint());
                    F1(applyCardData);
                    break;
                }
            case 3:
                if (!this.f2127v0.isReadyPoint()) {
                    this.f2119n0.setPointType("-1");
                    E1();
                    break;
                } else {
                    CityPointView cityPoint = this.f2127v0.getCityPoint();
                    this.f2119n0.setPointType("3");
                    F1(cityPoint.getApplyCardData());
                    break;
                }
            case 4:
                if (this.f2127v0.isReadyPoint()) {
                    OkCashBackPointView okCashBackPoint = this.f2127v0.getOkCashBackPoint();
                    Bundle applyCardData2 = okCashBackPoint.getApplyCardData();
                    this.f2119n0.setPointType(StbkAcntDao.ACCOUNT_REGISTER);
                    this.f2119n0.setPointCardNumber(applyCardData2.getString("PHONE_NM"));
                    this.f2119n0.setPassword(applyCardData2.getString("AUTH_NO"));
                    this.f2119n0.setUsePoint(okCashBackPoint.getApplyPoint());
                } else {
                    this.f2119n0.setPointType("-1");
                }
                E1();
                break;
            case 5:
                if (this.f2127v0.isReadyPoint()) {
                    LPointView lPoint = this.f2127v0.getLPoint();
                    this.f2119n0.setPointType(StbkAcntDao.CHANGE_PASSWORD);
                    this.f2119n0.setUsePoint(lPoint.getApplyPoint());
                    this.f2119n0.setCustomerNo(lPoint.getCustomerNo());
                } else {
                    this.f2119n0.setPointType("-1");
                }
                E1();
                break;
            case 6:
                if (this.f2127v0.isReadyPoint()) {
                    GifticketView gifticketView = this.f2127v0.getGifticketView();
                    this.f2119n0.setPointType("6");
                    this.f2119n0.setUsePoint(gifticketView.getApplyPoint());
                    this.f2119n0.setPointCardNumber(gifticketView.getSelectedTicketId());
                } else {
                    this.f2119n0.setPointType("-1");
                }
                E1();
                break;
        }
        y0();
    }

    private void c1(IBaseDao iBaseDao) {
        ArrayList arrayList = new ArrayList();
        if (isRsvPaymentRequest()) {
            arrayList.add(((RsvPaymentDao.RsvPaymentRequest) iBaseDao.getRequest()).getHidPnrNo());
        } else if (isIntgStlRequest()) {
            arrayList = new ArrayList(Arrays.asList(((IntgStlDao.IntgStlRequest) iBaseDao.getRequest()).getCart_LumpStlTgtNo().split(";")));
        } else if (isCommPaymentRequest()) {
            arrayList.add(((CommPaymentDao.CommPaymentResponse) iBaseDao.getResponse()).getMain_info().getH_pnr_no());
        } else if (isPassPaymentRequest()) {
            arrayList.add(((PassPaymentDao.PassPaymentResponse) iBaseDao.getResponse()).getMain_info().getH_pnr_no());
        }
        if (arrayList.size() > 0) {
            EasyStbkPayOption stbkPayOption = this.f2130y0.getStbkPayOption();
            CashReceiptIssueDao cashReceiptIssueDao = new CashReceiptIssueDao();
            CashReceiptIssueDao.CashReceiptIssueRequest cashReceiptIssueRequest = cashReceiptIssueDao.new CashReceiptIssueRequest();
            if (stbkPayOption.getCheckBoxIsChecked()) {
                cashReceiptIssueRequest.setVltIsuFlg("N");
                cashReceiptIssueRequest.setCashRcetTxnDvCd(stbkPayOption.getCheckedRadioButtonValue());
                cashReceiptIssueRequest.setCashRcetAthnMtdCd(stbkPayOption.getDropDownValue());
                cashReceiptIssueRequest.setAthnDmnRcgnNo(stbkPayOption.getEditText());
            } else {
                cashReceiptIssueRequest.setVltIsuFlg("Y");
            }
            int size = arrayList.size();
            HashMap<String, String> map = new HashMap<>();
            int i8 = 0;
            while (i8 < size) {
                StringBuilder sb = new StringBuilder();
                sb.append("lumpStlTgtNo_");
                int i9 = i8 + 1;
                sb.append(i9);
                map.put(sb.toString(), (String) arrayList.get(i8));
                i8 = i9;
            }
            cashReceiptIssueRequest.setApvCnt(size);
            cashReceiptIssueRequest.setLumpStlTgtNo(map);
            cashReceiptIssueDao.setRequest(cashReceiptIssueRequest);
            cashReceiptIssueDao.setNotShowDialog(true);
            executeDao(cashReceiptIssueDao);
        }
    }

    private void d1() {
        GifticketListDao gifticketListDao = new GifticketListDao();
        GifticketListDao.GifticketListRequest gifticketListRequest = gifticketListDao.new GifticketListRequest();
        gifticketListRequest.setQryDvCd("F");
        gifticketListRequest.setQryVal("E");
        gifticketListDao.setRequest(gifticketListRequest);
        executeDao(gifticketListDao);
    }

    public void e1(String... strArr) {
        KBPayEncryptDao kBPayEncryptDao = new KBPayEncryptDao();
        KBPayEncryptDao.KBpayEncryptRequest kBpayEncryptRequest = kBPayEncryptDao.new KBpayEncryptRequest();
        kBpayEncryptRequest.setType("K");
        kBpayEncryptRequest.setValueList(new ArrayList(Arrays.asList(strArr)));
        kBPayEncryptDao.setRequest(kBpayEncryptRequest);
        executeDao(kBPayEncryptDao);
    }

    private void f1(String str) {
        LPointDao lPointDao = new LPointDao();
        LPointDao.LPointInquiryRequest lPointInquiryRequest = lPointDao.new LPointInquiryRequest();
        lPointInquiryRequest.setPontPwd(str);
        lPointDao.setRequest(lPointInquiryRequest);
        executeDao(lPointDao);
    }

    public void g1() {
        NaverPayMoneyRsvDao naverPayMoneyRsvDao = new NaverPayMoneyRsvDao();
        NaverPayMoneyRsvDao.NaverPayMoneyRsvRequest naverPayMoneyRsvRequest = naverPayMoneyRsvDao.new NaverPayMoneyRsvRequest();
        naverPayMoneyRsvRequest.setProductAmount(getReceivedAmount());
        naverPayMoneyRsvRequest.setProductCount(getSelectedItemCount());
        naverPayMoneyRsvDao.setRequest(naverPayMoneyRsvRequest);
        executeDao(naverPayMoneyRsvDao);
    }

    public void h1() {
        NaverPayRsvDao naverPayRsvDao = new NaverPayRsvDao();
        NaverPayRsvDao.NaverPayRsvRequest naverPayRsvRequest = naverPayRsvDao.new NaverPayRsvRequest();
        naverPayRsvRequest.setProductAmount(getReceivedAmount());
        naverPayRsvRequest.setProductCount(getSelectedItemCount());
        naverPayRsvDao.setRequest(naverPayRsvRequest);
        executeDao(naverPayRsvDao);
    }

    private void i1(String str) {
        OKCashbagCertDao oKCashbagCertDao = new OKCashbagCertDao();
        OKCashbagCertDao.OKCashbagCertRequest oKCashbagCertRequest = oKCashbagCertDao.new OKCashbagCertRequest();
        oKCashbagCertRequest.setCpNo(str);
        oKCashbagCertDao.setRequest(oKCashbagCertRequest);
        executeDao(oKCashbagCertDao);
    }

    public void j1() {
        PaycoDao paycoDao = new PaycoDao();
        PaycoDao.PaycoPaymentRequest paycoPaymentRequest = paycoDao.new PaycoPaymentRequest();
        paycoPaymentRequest.setTicketPrice(String.valueOf(getReceivedAmount()));
        paycoPaymentRequest.setTicketName("철도승차권");
        paycoDao.setRequest(paycoPaymentRequest);
        executeDao(paycoDao);
    }

    private void k1(PaymentMethod paymentMethod) {
        I4.h hVar = I4.h.getInstance();
        if (hVar.isNonMember()) {
            paymentMethod.setHiduserYn("N");
            paymentMethod.setHidMbCrdNo(hVar.getNonMemberNumber());
        } else {
            paymentMethod.setHiduserYn("Y");
        }
        IPaymentRequest iPaymentRequest = getIPaymentRequest();
        if (isRsvPaymentRequest()) {
            IBaseDao rsvPaymentDao = new RsvPaymentDao();
            RsvPaymentDao.RsvPaymentRequest rsvPaymentRequest = (RsvPaymentDao.RsvPaymentRequest) iPaymentRequest;
            rsvPaymentRequest.setPaymentMethod(paymentMethod);
            rsvPaymentDao.setLoadingCancelable(false);
            rsvPaymentDao.setRequest(rsvPaymentRequest);
            executeDao(rsvPaymentDao);
            return;
        }
        if (isIntgStlRequest()) {
            IBaseDao intgStlDao = new IntgStlDao();
            IntgStlDao.IntgStlRequest intgStlRequest = (IntgStlDao.IntgStlRequest) iPaymentRequest;
            intgStlRequest.setPaymentMethod(paymentMethod);
            intgStlDao.setLoadingCancelable(false);
            intgStlDao.setRequest(intgStlRequest);
            executeDao(intgStlDao);
            return;
        }
        if (isCommPaymentRequest()) {
            IBaseDao commPaymentDao = new CommPaymentDao();
            CommPaymentDao.CommPaymentRequest commPaymentRequest = (CommPaymentDao.CommPaymentRequest) iPaymentRequest;
            commPaymentRequest.setHidPayAmount(String.valueOf(s1()));
            commPaymentRequest.setPaymentMethod(paymentMethod);
            commPaymentDao.setLoadingCancelable(false);
            commPaymentDao.setRequest(commPaymentRequest);
            executeDao(commPaymentDao);
            return;
        }
        if (isPassPaymentRequest()) {
            IBaseDao passPaymentDao = new PassPaymentDao();
            PassPaymentDao.PassPaymentRequest passPaymentRequest = (PassPaymentDao.PassPaymentRequest) iPaymentRequest;
            passPaymentRequest.setHidPayAmount(String.valueOf(s1()));
            passPaymentRequest.setPaymentMethod(paymentMethod);
            passPaymentDao.setLoadingCancelable(false);
            passPaymentDao.setRequest(passPaymentRequest);
            executeDao(passPaymentDao);
        }
    }

    private void l1(PointInquiryDao.PointInquiryRequest pointInquiryRequest) {
        PointInquiryDao pointInquiryDao = new PointInquiryDao();
        pointInquiryDao.setRequest(pointInquiryRequest);
        executeDao(pointInquiryDao);
    }

    public void m1(String... strArr) {
        SeedEncryptDao seedEncryptDao = new SeedEncryptDao();
        SeedEncryptDao.SeedEncryptRequest seedEncryptRequest = seedEncryptDao.new SeedEncryptRequest();
        seedEncryptRequest.setValueList(new ArrayList(Arrays.asList(strArr)));
        seedEncryptDao.setRequest(seedEncryptRequest);
        executeDao(seedEncryptDao);
    }

    private void n1(String str, Bundle bundle) {
        SpayCphdDatValDao spayCphdDatValDao = new SpayCphdDatValDao();
        SpayCphdDatValDao.SpayCphdDatValRequest spayCphdDatValRequest = spayCphdDatValDao.new SpayCphdDatValRequest();
        spayCphdDatValRequest.setType(str);
        ArrayList<String> arrayList = new ArrayList<>();
        if ("payco".equals(str)) {
            spayCphdDatValRequest.setMainPgCode(bundle.getString("mainPgCode"));
            spayCphdDatValRequest.setSpayDvCd("02");
            arrayList.add(bundle.getString("reserveOrderNo"));
            arrayList.add(bundle.getString("sellerOrderReferenceKey"));
            arrayList.add(bundle.getString("paymentCertifyToken"));
            arrayList.add(bundle.getString("cardBin"));
        } else if ("kakao".equals(str)) {
            spayCphdDatValRequest.setPaymentMethodType(bundle.getString("payment_method_type"));
            spayCphdDatValRequest.setSpayDvCd(TicketSelfCheckinStatusActivity.CHECKIN_STATUS_NOT_USE);
            arrayList.add(this.f2121p0.getSpayTid());
            arrayList.add(this.f2121p0.getPrprNo());
            arrayList.add(bundle.getString("pg_token"));
        } else if ("paybooc".equals(str)) {
            spayCphdDatValRequest.setSpayDvCd("11");
            arrayList.add(bundle.getString("appIdauTno"));
            arrayList.add(bundle.getString("cardBinNo"));
            arrayList.add(bundle.getString("tknTid"));
            this.f2123r0 = bundle.getString("pybcCardTknNo");
            this.f2124s0 = bundle.getString("cardValdYymm");
        }
        spayCphdDatValRequest.setData(arrayList);
        spayCphdDatValDao.setRequest(spayCphdDatValRequest);
        executeDao(spayCphdDatValDao);
    }

    public void o1(String str) {
        SpayOdrNoDao spayOdrNoDao = new SpayOdrNoDao();
        SpayOdrNoDao.SpayOdrNoRequest spayOdrNoRequest = spayOdrNoDao.new SpayOdrNoRequest();
        spayOdrNoRequest.setSpayDvCd(str);
        spayOdrNoRequest.setTotTxnAmt(String.valueOf(getReceivedAmount()));
        ArrayList<String> arrayList = new ArrayList<>();
        IPaymentRequest iPaymentRequest = getIPaymentRequest();
        if ("12".equals(str) && C6630d.isNotNull(getReservationResponse()) && C6630d.isNotNull(getReservationResponse().getJrny_infos()) && C6630d.isNotNull(getReservationResponse().getJrny_infos().getJrny_info())) {
            for (ReservationResponse.JrnyInfo jrnyInfo : getReservationResponse().getJrny_infos().getJrny_info()) {
                if (C6630d.isNotNull(jrnyInfo.getLumpStlTgtNo())) {
                    arrayList.add(jrnyInfo.getLumpStlTgtNo());
                }
            }
            spayOdrNoRequest.setTgtCnt(Integer.toString(arrayList.size()));
            spayOdrNoRequest.setLumpStlTgtNo(arrayList);
        } else if (isIntgStlRequest()) {
            arrayList = new ArrayList<>(Arrays.asList(((IntgStlDao.IntgStlRequest) iPaymentRequest).getCart_LumpStlTgtNo().split(";")));
            spayOdrNoRequest.setTgtCnt(Integer.toString(arrayList.size()));
            spayOdrNoRequest.setLumpStlTgtNo(arrayList);
        }
        t.d("LumpStlTgNo arrayList : " + arrayList + ", 장바구니 통합결제유무 : " + isIntgStlRequest());
        spayOdrNoDao.setRequest(spayOdrNoRequest);
        executeDao(spayOdrNoDao);
    }

    private void p1() {
        TossAutoCreateDao tossAutoCreateDao = new TossAutoCreateDao();
        tossAutoCreateDao.setRequest(new BaseRequest());
        executeDao(tossAutoCreateDao);
    }

    private void q1() {
        TossAutoStlKeyQryDao tossAutoStlKeyQryDao = new TossAutoStlKeyQryDao();
        TossAutoStlKeyQryDao.StlKeyQryRequest stlKeyQryRequest = tossAutoStlKeyQryDao.new StlKeyQryRequest();
        stlKeyQryRequest.setSpayDvCd("12");
        tossAutoStlKeyQryDao.setRequest(stlKeyQryRequest);
        executeDao(tossAutoStlKeyQryDao);
    }

    public boolean t1() {
        if (getReceivedAmount() == 0) {
            return true;
        }
        CreditCardView creditCardView = this.f2129x0.getCreditCardView();
        final int iValidate = creditCardView.validate();
        if (iValidate > -1) {
            C6637k.getCDialog(getActivity(), 1001, 1, getString(AbstractC5959j.dialog_title)).setContent(getString(iValidate)).setButtonListener(new DialogInterface.OnClickListener() { // from class: I5.a
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    this.f2105a.w1(iValidate, dialogInterface, i8);
                }
            }).showDialog();
            return false;
        }
        Bundle creditCardInputData = creditCardView.getCreditCardInputData();
        CreditCardData creditCardData = new CreditCardData();
        creditCardData.setCardNumber(creditCardInputData.getString("CARD_NO"));
        creditCardData.setMonth(creditCardInputData.getString("CARD_MONTH"));
        creditCardData.setYear(creditCardInputData.getString("CARD_YEAR"));
        creditCardData.setPassword(creditCardInputData.getString("CARD_PASSWORD"));
        creditCardData.setCertNumber(creditCardInputData.getString("AUTH_NO"));
        if (creditCardInputData.getBoolean("IS_NOMAL_CARD")) {
            creditCardData.setCreditCardType("J");
        } else {
            creditCardData.setCreditCardType("S");
        }
        creditCardData.setInstallmentType(C4.a.getInstallmentType(creditCardInputData.getInt("INSTALLMENT_PERIOD")));
        this.f2120o0 = creditCardData;
        return true;
    }

    public boolean u1() {
        return !this.f2119n0.getPointType().equals("-1") && getReceivedAmount() == 0;
    }

    public /* synthetic */ void v1() {
        PointInquiryDao.PointInquiryRequest pointInquiryRequest = new PointInquiryDao().new PointInquiryRequest();
        pointInquiryRequest.setPointDvCd(String.valueOf(0));
        l1(pointInquiryRequest);
    }

    private void w0() {
        N1();
        int iR1 = r1();
        this.f2127v0.setVisibility((disableDiscountPoint() || iR1 == 0) ? 8 : 0);
        H1();
        if (iR1 == 0) {
            this.f2126u0.setVisibility(8);
            B0(2);
        } else {
            B0(3);
        }
        if (I4.h.getInstance().isLogin()) {
            new Handler().postDelayed(new Runnable() { // from class: I5.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f2109a.v1();
                }
            }, 100L);
        }
    }

    public /* synthetic */ void w1(int i8, DialogInterface dialogInterface, int i9) {
        if (AbstractC5959j.dialog_payment_msg == i8) {
            fullDownScroll();
        } else {
            P.showIME(getApplicationContext());
        }
    }

    public /* synthetic */ void x1(C5378a c5378a) {
        C5813c c5813c;
        if (c5378a.getResultCode() != -1 || (c5813c = (C5813c) c5378a.getData().getParcelableExtra("ocrResult")) == null) {
            return;
        }
        cardScanAutoInput(c5813c.getCardNumber(), 4, c5813c.getValidDate());
    }

    public /* synthetic */ void y1(boolean z8, DialogInterface dialogInterface, int i8) {
        A1(z8);
    }

    public void z1() {
        G.playApp(getActivity(), G.getIntentScheme(getString(AbstractC5959j.payment_rail_plus_scheme, String.valueOf(getReceivedAmount()), I4.h.getInstance().getMemberNum()), "com.mic.set.hce.railpluscardserviceandroid"));
    }

    protected void A1(boolean z8) {
        Class cls;
        Context applicationContext;
        Intent intent;
        cls = TripBookingListActivity.class;
        t.d("isCommutationPass : " + z8 + ", isMaasService : " + this.f2125t0);
        Bundle bundle = new Bundle();
        try {
            try {
                if (this.f2126u0.getSelectedTabId() == AbstractC5955f.tvi_general_pay) {
                    CreditCardView creditCardView = this.f2129x0.getCreditCardView();
                    if (creditCardView.isCardAddViewVisible() && creditCardView.isCardAdd()) {
                        bundle.putString("CARD_NO", this.f2120o0.getCardNumber());
                        bundle.putString("CARD_MONTH", this.f2120o0.getMonth());
                        bundle.putString("CARD_YEAR", this.f2120o0.getYear());
                        bundle.putString("CARD_CREDIT_TYPE", this.f2120o0.getCreditCardType());
                        if (this.f2120o0.getCreditCardType().equals("S")) {
                            bundle.putString("CARD_BUSINESS_NUMBER", this.f2120o0.getCertNumber());
                        }
                    }
                }
                if (C6630d.isNotNull(getPNRNo())) {
                    bundle.putString("TICKET_PNR_NUMBER", getPNRNo());
                }
                bundle.putBoolean("IS_COMMUTATION_PASS_TICKET", z8);
                bundle.putBoolean("IS_MAAS_SERVICE_TICKET", this.f2125t0);
            } catch (Exception e8) {
                t.e(e8.getMessage());
                bundle.putBoolean("IS_COMMUTATION_PASS_TICKET", z8);
                bundle.putBoolean("IS_MAAS_SERVICE_TICKET", this.f2125t0);
                if (i.PAYMENT_TICKET_CHANGE == getPaymentType()) {
                    intent = new Intent(getApplicationContext(), (Class<?>) TicketListActivity.class);
                } else {
                    applicationContext = getApplicationContext();
                    if (!isTravelPackages()) {
                    }
                }
            }
            if (i.PAYMENT_TICKET_CHANGE == getPaymentType()) {
                intent = new Intent(getApplicationContext(), (Class<?>) TicketListActivity.class);
                intent.putExtras(bundle);
                intent.addFlags(872415232);
                startActivity(intent);
                return;
            }
            applicationContext = getApplicationContext();
            if (!isTravelPackages()) {
                cls = TicketListActivity.class;
            }
            C6641o.navigation(applicationContext, cls, bundle);
        } catch (Throwable th) {
            bundle.putBoolean("IS_COMMUTATION_PASS_TICKET", z8);
            bundle.putBoolean("IS_MAAS_SERVICE_TICKET", this.f2125t0);
            if (i.PAYMENT_TICKET_CHANGE != getPaymentType()) {
                C6641o.navigation(getApplicationContext(), isTravelPackages() ? TripBookingListActivity.class : TicketListActivity.class, bundle);
            } else {
                Intent intent2 = new Intent(getApplicationContext(), (Class<?>) TicketListActivity.class);
                intent2.putExtras(bundle);
                intent2.addFlags(872415232);
                startActivity(intent2);
            }
            throw th;
        }
    }

    protected void K1(boolean z8) {
        this.f2125t0 = z8;
    }

    public void cardScanAutoInput(String str, int i8, String str2) {
        Bundle bundle = new Bundle();
        int i9 = 0;
        int i10 = 0;
        while (i9 < str.length()) {
            int i11 = i9 + i8;
            String strSubstring = str.substring(i9, Math.min(i11, str.length()));
            StringBuilder sb = new StringBuilder();
            sb.append("CARD_NO_");
            i10++;
            sb.append(i10);
            bundle.putString(sb.toString(), strSubstring);
            i9 = i11;
        }
        String[] strArrSplit = str2.split("/");
        bundle.putString("CARD_MONTH", strArrSplit[0]);
        bundle.putString("CARD_YEAR", "20" + strArrSplit[1]);
        this.f2129x0.getCreditCardView().setCreditCardInput(bundle);
    }

    @Override // J5.d.a
    public void fullDownScroll() {
        this.f1482f0.fullScroll(130);
    }

    @Override // G5.a, com.korail.talk.view.base.a, androidx.fragment.app.Fragment, androidx.lifecycle.InterfaceC1018g
    public /* bridge */ /* synthetic */ AbstractC5837a getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }

    @Override // G5.a, F5.a
    public int getReceivedAmount() {
        return super.getReceivedAmount() - (C6630d.isNotNull(this.f2127v0) ? this.f2127v0.getSelectedUsePoint() : 0);
    }

    @Override // G5.a, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (C6630d.isNull(bundle)) {
            I1();
            C0();
            A0();
            w0();
        }
    }

    @Override // com.korail.talk.view.base.a, androidx.fragment.app.Fragment
    public void onActivityResult(int i8, int i9, Intent intent) {
        super.onActivityResult(i8, i9, intent);
        if (i8 == 131) {
            if (i9 == 0) {
                t.d("RESULT_CANCELED");
            } else {
                q1();
            }
        }
    }

    @Override // G5.a, android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (AbstractC5955f.btn_payment_bottom0 == id) {
            onBackFragment();
            return;
        }
        if (AbstractC5955f.btn_payment_bottom1 == id) {
            int iIntValue = ((Integer) view.getTag()).intValue();
            if (2 == iIntValue) {
                L1();
                return;
            }
            if (3 == iIntValue) {
                a aVar = new a();
                if (C6630d.isNull(this.f2111A0) || !this.f2111A0.isShowing()) {
                    u4.e eVar = new u4.e(getContext());
                    this.f2111A0 = eVar;
                    eVar.showDialog();
                    u4.c cVar = new u4.c(getContext());
                    this.f2131z0 = cVar;
                    cVar.show();
                }
                A6.g.BEGIN(r4.g.NETFUNNEL_SERVER_ID, r4.g.NETFUNNEL_ACTION_PAY_ID, this.f2111A0, new b(aVar));
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(AbstractC5957h.fragment_payment, viewGroup, false);
    }

    @Override // com.korail.talk.view.base.a
    public void onFragmentResult(Intent intent) {
        t.d("");
        setEasyPaymentData(intent.getBundleExtra("RESULT_DATA"));
    }

    @Override // com.korail.talk.view.base.a, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        int id = iBaseDao.getId();
        if (AbstractC5955f.dao_point_inquiry == id) {
            PointInquiryDao.PointInquiryResponse pointInquiryResponse = (PointInquiryDao.PointInquiryResponse) iBaseDao.getResponse();
            int selectedItemTag = this.f2127v0.getSelectedItemTag();
            if (selectedItemTag == 0) {
                KTXMileageView kTXMileage = this.f2127v0.getKTXMileage();
                int h_korail_point = pointInquiryResponse.getH_korail_point();
                int i8 = pointInquiryResponse.geth_corp_use_point();
                this.f2112B0.setKtxMileage(h_korail_point);
                this.f2112B0.setKtxSamsungMileage(i8);
                int i9 = h_korail_point + i8;
                kTXMileage.setAvailablePoints(i9, String.valueOf(h_korail_point), String.valueOf(i8));
                kTXMileage.setApplyRequest(true);
                P1(0);
                this.f2127v0.setKTXMileage(i9, N.getDecimalFormatString(h_korail_point), N.getDecimalFormatString(i8));
                q1();
                return;
            }
            if (1 == selectedItemTag) {
                RailPointView railPoint = this.f2127v0.getRailPoint();
                railPoint.setAvailablePoints(pointInquiryResponse.getH_join_point());
                railPoint.setApplyRequest(true);
                P1(1);
                return;
            }
            if (2 == selectedItemTag) {
                WoorimorePointView woorimorePoint = this.f2127v0.getWoorimorePoint();
                woorimorePoint.setAvailablePoints(pointInquiryResponse.getH_point());
                woorimorePoint.setApplyRequest(true);
                P1(2);
                return;
            }
            if (3 == selectedItemTag) {
                CityPointView cityPoint = this.f2127v0.getCityPoint();
                cityPoint.setAvailablePoints(pointInquiryResponse.getH_point());
                cityPoint.setApplyRequest(true);
                P1(3);
                return;
            }
            if (4 == selectedItemTag) {
                OkCashBackPointView okCashBackPoint = this.f2127v0.getOkCashBackPoint();
                okCashBackPoint.setAvailablePoints(pointInquiryResponse.getH_avl_point());
                okCashBackPoint.setApplyRequest(true);
                P1(4);
                return;
            }
            return;
        }
        if (AbstractC5955f.dao_lpoint_inquiry == id) {
            LPointDao.LPointInquiryResponse lPointInquiryResponse = (LPointDao.LPointInquiryResponse) iBaseDao.getResponse();
            String extrPontAmt = lPointInquiryResponse.getExtrPontAmt();
            String custRcgnNoVal = lPointInquiryResponse.getCustRcgnNoVal();
            LPointView lPoint = this.f2127v0.getLPoint();
            lPoint.setCustomerNo(custRcgnNoVal);
            lPoint.setAvailablePoints(Integer.parseInt(extrPontAmt));
            lPoint.setApplyRequest(true);
            P1(5);
            return;
        }
        if (AbstractC5955f.dao_gifticket_list == id) {
            GifticketListDao.GifticketListResponse gifticketListResponse = (GifticketListDao.GifticketListResponse) iBaseDao.getResponse();
            GifticketView gifticketView = this.f2127v0.getGifticketView();
            gifticketView.setSelectorEntry(gifticketListResponse.getGifticketInfoList());
            gifticketView.setApplyRequest(true);
            gifticketView.setIsLoaded(true);
            P1(6);
            return;
        }
        if (AbstractC5955f.dao_rsv_payment == id || AbstractC5955f.dao_comm_payment == id || AbstractC5955f.dao_pass_payment == id || AbstractC5955f.dao_cart_payment == id) {
            String easyPaymentMethod = ((IPaymentRequest) iBaseDao.getRequest()).getEasyPaymentMethod();
            if (N.isNotNull(easyPaymentMethod) && "00".equals(easyPaymentMethod)) {
                if (C6630d.isNotNull(getActivity())) {
                    C6630d.syncRailPlus(getActivity());
                }
            } else if ((N.isNotNull(easyPaymentMethod) && ("03".equals(easyPaymentMethod) || "10".equals(easyPaymentMethod))) || "16".equals(easyPaymentMethod)) {
                c1(iBaseDao);
            }
            boolean z8 = iBaseDao.getId() == AbstractC5955f.dao_comm_payment || iBaseDao.getId() == AbstractC5955f.dao_pass_payment;
            if (!(iBaseDao instanceof RsvPaymentDao)) {
                A1(z8);
                return;
            }
            RsvPaymentDao.RsvPaymentResponse rsvPaymentResponse = (RsvPaymentDao.RsvPaymentResponse) iBaseDao.getResponse();
            if (!"Y".equals(rsvPaymentResponse.getH_im_flg())) {
                A1(z8);
                return;
            }
            try {
                O1(rsvPaymentResponse, z8);
                return;
            } catch (Exception unused) {
                A1(z8);
                return;
            }
        }
        if (AbstractC5955f.dao_seed_encrypt == id) {
            List<SeedEncryptDao.EncValueList> encValueList = ((SeedEncryptDao.SeedEncryptResponse) iBaseDao.getResponse()).getEncValueList();
            G.playApp(getActivity(), G.getIntentScheme(getString(AbstractC5959j.payment_shinhanfan_scheme, encValueList.get(0).getEncValue(), encValueList.get(1).getEncValue()), "com.shcard.smartpay"));
            return;
        }
        if (AbstractC5955f.dao_kb_pay_encrypt == id) {
            KBPayEncryptDao.KBpayEncryptResponse kBpayEncryptResponse = (KBPayEncryptDao.KBpayEncryptResponse) iBaseDao.getResponse();
            List<EncryptDao.EncryptValueList> encValueList2 = kBpayEncryptResponse.getEncValueList();
            try {
                String string = getString(AbstractC5959j.payment_kb_pay_scheme, URLEncoder.encode(getString(AbstractC5959j.payment_kb_pay_scheme_1, kBpayEncryptResponse.getREQ_DATE_TIME(), kBpayEncryptResponse.getCHANNEL_ID(), kBpayEncryptResponse.getPURCHASE_PRODUCT_INFO(), encValueList2.get(0).getEncValue(), kBpayEncryptResponse.getBIZ_NUM(), kBpayEncryptResponse.getSELLER_NAME(), kBpayEncryptResponse.getSELLER_NUM(), encValueList2.get(1).getEncValue()), "UTF-8"));
                t.d("[KorailTalk -> KB pay] " + string);
                G.playApp(getActivity(), G.getIntentScheme(string, "com.kbcard.cxh.appcard"));
                return;
            } catch (UnsupportedEncodingException e8) {
                throw new RuntimeException(e8);
            }
        }
        if (AbstractC5955f.dao_easypay_payco == id) {
            B1(((PaycoDao.PaycoPaymentResponse) iBaseDao.getResponse()).getRecvData().getResult().getOrderSheetUrl());
            return;
        }
        if (AbstractC5955f.dao_spay_odr_no == id) {
            SpayOdrNoDao.SpayOdrNoResponse spayOdrNoResponse = (SpayOdrNoDao.SpayOdrNoResponse) iBaseDao.getResponse();
            this.f2121p0 = spayOdrNoResponse;
            B1(spayOdrNoResponse.getFllwScnAppUrlAdr());
            return;
        }
        if (AbstractC5955f.dao_naver_pay_rsv == id) {
            B1(((NaverPayRsvDao.NaverPayRsvResponse) iBaseDao.getResponse()).getStlScnUrl());
            return;
        }
        if (AbstractC5955f.dao_naver_pay_money_rsv == id) {
            B1(((NaverPayRsvDao.NaverPayRsvResponse) iBaseDao.getResponse()).getStlScnUrl());
            return;
        }
        if (AbstractC5955f.dao_spay_cphd_data_val == id) {
            SpayCphdDatValDao.SpayCphdDatValRequest spayCphdDatValRequest = (SpayCphdDatValDao.SpayCphdDatValRequest) iBaseDao.getRequest();
            SpayCphdDatValDao.SpayCphdDatValResponse spayCphdDatValResponse = (SpayCphdDatValDao.SpayCphdDatValResponse) iBaseDao.getResponse();
            String type = spayCphdDatValRequest.getType();
            Bundle bundle = new Bundle();
            bundle.putString("type", type);
            bundle.putString("spaycphdDataVal", spayCphdDatValResponse.getSpayCphdDatVal());
            bundle.putString("cardBin", spayCphdDatValResponse.getStlCrCrdNo());
            if ("payco".equals(type)) {
                bundle.putString("mainPgCode", spayCphdDatValRequest.getMainPgCode());
            } else if ("kakao".equals(type)) {
                bundle.putString("payment_method_type", spayCphdDatValRequest.getPaymentMethodType());
            } else if ("paybooc".equals(type)) {
                bundle.putString("pybcCardTknNo", this.f2123r0);
                bundle.putString("cardValdYymm", this.f2124s0);
            }
            J1(bundle);
            return;
        }
        if (AbstractC5955f.dao_stl_key_qry != id) {
            if (AbstractC5955f.dao_toss_auto_c == id) {
                C1(((TossAutoCreateDao.TossAutoCResponse) iBaseDao.getResponse()).getCheckoutUri(), 131);
                return;
            }
            return;
        }
        TossAutoStlKeyQryDao.StlKeyQryResponse stlKeyQryResponse = (TossAutoStlKeyQryDao.StlKeyQryResponse) iBaseDao.getResponse();
        if (!C6630d.isNotNull(stlKeyQryResponse.getSpayList()) || stlKeyQryResponse.getSpayList().size() <= 0) {
            this.f2122q0 = null;
            return;
        }
        this.f2122q0 = stlKeyQryResponse.getSpayList().get(0);
        ((TextView) p0(I.getViewId(getApplicationContext(), "easy_pay_wide_object1_title"))).setText(this.f2122q0.getStlBankNm() + X.SPACE + this.f2122q0.getAcntNo());
    }

    @Override // com.korail.talk.view.base.a, com.korail.talk.network.IBase
    public void onReceiveError(IBaseDao iBaseDao, C6536a c6536a) {
        int id = iBaseDao.getId();
        if (AbstractC5955f.dao_point_inquiry != id) {
            if (AbstractC5955f.dao_certify_okcashbag == id) {
                OkCashBackPointView okCashBackPoint = this.f2127v0.getOkCashBackPoint();
                okCashBackPoint.setAvailablePoints(0);
                okCashBackPoint.setApplyRequest(false);
                P1(4);
                return;
            }
            if (AbstractC5955f.dao_lpoint_inquiry == id) {
                LPointView lPoint = this.f2127v0.getLPoint();
                lPoint.setAvailablePoints(0);
                lPoint.setApplyRequest(false);
                P1(5);
                return;
            }
            return;
        }
        int selectedItemTag = this.f2127v0.getSelectedItemTag();
        if (selectedItemTag == 0) {
            KTXMileageView kTXMileage = this.f2127v0.getKTXMileage();
            kTXMileage.setAvailablePoints();
            kTXMileage.setApplyRequest(false);
            P1(0);
            return;
        }
        if (1 == selectedItemTag) {
            RailPointView railPoint = this.f2127v0.getRailPoint();
            railPoint.setAvailablePoints(0);
            railPoint.setApplyRequest(false);
            P1(1);
            return;
        }
        if (2 == selectedItemTag) {
            WoorimorePointView woorimorePoint = this.f2127v0.getWoorimorePoint();
            woorimorePoint.setAvailablePoints(0);
            woorimorePoint.setApplyRequest(false);
            P1(2);
            return;
        }
        if (3 == selectedItemTag) {
            CityPointView cityPoint = this.f2127v0.getCityPoint();
            cityPoint.setAvailablePoints(0);
            cityPoint.setApplyRequest(false);
            P1(3);
            return;
        }
        if (4 == selectedItemTag) {
            OkCashBackPointView okCashBackPoint2 = this.f2127v0.getOkCashBackPoint();
            okCashBackPoint2.setAvailablePoints(0);
            okCashBackPoint2.setApplyRequest(false);
            P1(4);
        }
    }

    @Override // com.korail.talk.view.payment.point.KTXMileageView.a, com.korail.talk.view.payment.point.RailPointView.a, com.korail.talk.view.payment.point.GifticketView.a
    public void onRequestAllApply(int i8, Bundle bundle) {
        String string;
        if (i8 == 0) {
            int ktxMileage = this.f2112B0.getKtxMileage() + this.f2112B0.getKtxSamsungMileage();
            int iR1 = r1();
            string = ktxMileage < 100 ? getString(AbstractC5959j.point_disable_point_message) : null;
            KTXMileageView kTXMileage = this.f2127v0.getKTXMileage();
            if (N.isNull(string)) {
                if (iR1 <= ktxMileage) {
                    t0(getView());
                } else {
                    iR1 = ktxMileage;
                }
                int i9 = ktxMileage - iR1;
                int ktxMileage2 = this.f2112B0.getKtxMileage();
                if (ktxMileage2 >= iR1) {
                    this.f2112B0.setUseingKTXMileage(iR1);
                    kTXMileage.setAvailablePoints(i9, N.getDecimalFormatString(ktxMileage2 - iR1), N.getDecimalFormatString(this.f2112B0.getKtxSamsungMileage()));
                    kTXMileage.setUsePoints(iR1, 0);
                } else {
                    int ktxSamsungMileage = this.f2112B0.getKtxSamsungMileage();
                    this.f2112B0.setUseingKTXMileage(ktxMileage2);
                    int i10 = iR1 - ktxMileage2;
                    this.f2112B0.setUseingKTXSamsungMileage(i10);
                    kTXMileage.setAvailablePoints(i9, String.valueOf(0), N.getDecimalFormatString(ktxSamsungMileage - i10));
                    kTXMileage.setUsePoints(ktxMileage2, i10);
                }
                kTXMileage.setUsePointsEdit(iR1);
            } else {
                C6637k.getCDialog(getActivity(), 1001, 1, getString(AbstractC5959j.dialog_title)).setContent(string).showDialog();
            }
            kTXMileage.setApplyPoint(N.isNull(string));
            P1(0);
            return;
        }
        if (i8 == 1) {
            int i11 = bundle.getInt("ENABLE_POINT");
            int iR12 = r1();
            string = i11 < 100 ? getString(AbstractC5959j.point_disable_point_message) : null;
            RailPointView railPoint = this.f2127v0.getRailPoint();
            if (N.isNull(string)) {
                if (iR12 <= i11) {
                    t0(getView());
                    i11 = iR12;
                }
                railPoint.setUsePointsEdit(i11);
            } else {
                C6637k.getCDialog(getActivity(), 1001, 1, getString(AbstractC5959j.dialog_title)).setContent(string).showDialog();
            }
            railPoint.setApplyPoint(N.isNull(string));
            P1(1);
            return;
        }
        if (i8 == 6) {
            int i12 = bundle.getInt("ENABLE_POINT");
            int iR13 = r1();
            string = i12 < 100 ? getString(AbstractC5959j.point_disable_point_message) : null;
            GifticketView gifticketView = this.f2127v0.getGifticketView();
            if (N.isNull(string)) {
                if (iR13 <= i12) {
                    t0(getView());
                    i12 = iR13;
                }
                gifticketView.setUsePointsEdit(i12);
            } else {
                C6637k.getCDialog(getActivity(), 1001, 1, getString(AbstractC5959j.dialog_title)).setContent(string).showDialog();
            }
            gifticketView.setApplyPoint(N.isNull(string));
            P1(6);
        }
    }

    @Override // com.korail.talk.view.payment.point.KTXMileageView.a, com.korail.talk.view.payment.point.RailPointView.a, com.korail.talk.view.payment.point.WoorimorePointView.a, com.korail.talk.view.payment.point.OkCashBackPointView.a, com.korail.talk.view.payment.point.LPointView.a, com.korail.talk.view.payment.point.GifticketView.a
    public void onRequestApply(int i8, Bundle bundle) {
        String string = null;
        if (i8 == 0) {
            int i9 = bundle.getInt("INPUT_POINT");
            int ktxMileage = this.f2112B0.getKtxMileage() + this.f2112B0.getKtxSamsungMileage();
            int iR1 = r1();
            if (ktxMileage == 0 || i9 > ktxMileage) {
                string = getString(AbstractC5959j.point_disable_point_message);
            } else if (i9 > r1()) {
                string = getString(AbstractC5959j.point_disable_point_message2);
            } else if (i9 < 100 || i9 % 100 > 0) {
                string = getString(AbstractC5959j.point_disable_point_message3);
            }
            KTXMileageView kTXMileage = this.f2127v0.getKTXMileage();
            if (N.isNull(string)) {
                if (iR1 == i9) {
                    t0(getView());
                }
                int i10 = ktxMileage - i9;
                int ktxMileage2 = this.f2112B0.getKtxMileage();
                if (ktxMileage2 > i9) {
                    this.f2112B0.setUseingKTXMileage(i9);
                    kTXMileage.setAvailablePoints(i10, N.getDecimalFormatString(ktxMileage2 - i9), N.getDecimalFormatString(this.f2112B0.getKtxSamsungMileage()));
                    kTXMileage.setUsePoints(i9, 0);
                } else {
                    int ktxSamsungMileage = this.f2112B0.getKtxSamsungMileage();
                    this.f2112B0.setUseingKTXMileage(ktxMileage2);
                    int i11 = i9 - ktxMileage2;
                    this.f2112B0.setUseingKTXSamsungMileage(i11);
                    kTXMileage.setAvailablePoints(i10, String.valueOf(0), N.getDecimalFormatString(ktxSamsungMileage - i11));
                    kTXMileage.setUsePoints(ktxMileage2, i11);
                }
                kTXMileage.setUsePointsEdit(i9);
            } else {
                C6637k.getCDialog(getActivity(), 1001, 1, getString(AbstractC5959j.dialog_title)).setContent(string).showDialog();
            }
            kTXMileage.setApplyPoint(N.isNull(string));
            P1(0);
            return;
        }
        if (i8 == 1) {
            int i12 = bundle.getInt("INPUT_POINT");
            int i13 = bundle.getInt("ENABLE_POINT");
            int iR12 = r1();
            if (i13 == 0 || i12 > i13) {
                string = getString(AbstractC5959j.point_disable_point_message);
            } else if (i12 > r1()) {
                string = getString(AbstractC5959j.point_disable_point_message2);
            } else if (i12 < 100 || i12 % 100 > 0) {
                string = getString(AbstractC5959j.point_disable_point_message6);
            }
            RailPointView railPoint = this.f2127v0.getRailPoint();
            if (N.isNull(string)) {
                if (iR12 == i12) {
                    t0(getView());
                }
                railPoint.setUsePointsEdit(i12);
            } else {
                C6637k.getCDialog(getActivity(), 1001, 1, getString(AbstractC5959j.dialog_title)).setContent(string).showDialog();
            }
            railPoint.setApplyPoint(N.isNull(string));
            P1(1);
            return;
        }
        if (i8 == 2) {
            int i14 = bundle.getInt("INPUT_POINT");
            int i15 = bundle.getInt("ENABLE_POINT");
            if (i15 == 0 || i14 > i15) {
                string = getString(AbstractC5959j.point_disable_point_message);
            } else if (i14 > r1()) {
                string = getString(AbstractC5959j.point_disable_point_message2);
            } else if (i14 < 1000 || i14 % 100 > 0) {
                string = getString(AbstractC5959j.point_disable_point_message7);
            }
            WoorimorePointView woorimorePoint = this.f2127v0.getWoorimorePoint();
            if (N.isNull(string)) {
                woorimorePoint.setUsePointsEdit(i14);
            } else {
                C6637k.getCDialog(getActivity(), 1001, 1, getString(AbstractC5959j.dialog_title)).setContent(string).showDialog();
            }
            woorimorePoint.setApplyPoint(N.isNull(string));
            P1(2);
            return;
        }
        if (i8 == 4) {
            String string2 = bundle.getString("AUTH_NO");
            int i16 = bundle.getInt("INPUT_POINT");
            int i17 = bundle.getInt("ENABLE_POINT");
            if (i16 == 0 || i16 > i17) {
                string = getString(AbstractC5959j.point_disable_point_message);
            } else if (string2.length() != 4) {
                string = getString(AbstractC5959j.point_disable_point_message4);
            } else if (r1() < i16) {
                string = getString(AbstractC5959j.point_disable_point_message2);
            } else if (i16 < 100 || i16 % 100 > 0) {
                string = getString(AbstractC5959j.point_disable_point_message6);
            }
            OkCashBackPointView okCashBackPoint = this.f2127v0.getOkCashBackPoint();
            if (N.isNull(string)) {
                okCashBackPoint.setUsePointsEdit(i16);
            } else {
                C6637k.getCDialog(getActivity(), 1001, 1, getString(AbstractC5959j.dialog_title)).setContent(string).showDialog();
            }
            okCashBackPoint.setApplyPoint(N.isNull(string));
            P1(4);
            return;
        }
        if (i8 != 5) {
            if (i8 == 6) {
                int i18 = bundle.getInt("INPUT_POINT");
                int i19 = bundle.getInt("ENABLE_POINT");
                int iR13 = r1();
                t.d("기프티켓 보유 포인트 : " + i19 + ", 사용 포인트 : " + i19);
                if (i19 == 0 || i18 > i19) {
                    string = getString(AbstractC5959j.point_disable_point_message);
                } else if (i18 > r1()) {
                    string = getString(AbstractC5959j.point_disable_point_message2);
                } else if (i18 < 100 || i18 % 100 > 0) {
                    string = getString(AbstractC5959j.point_disable_point_message6);
                }
                GifticketView gifticketView = this.f2127v0.getGifticketView();
                if (N.isNull(string)) {
                    if (iR13 == i18) {
                        t0(getView());
                    }
                    gifticketView.setUsePointsEdit(i18);
                } else {
                    C6637k.getCDialog(getActivity(), 1001, 1, getString(AbstractC5959j.dialog_title)).setContent(string).showDialog();
                }
                gifticketView.setApplyPoint(N.isNull(string));
                P1(6);
                return;
            }
            return;
        }
        int i20 = bundle.getInt("INPUT_POINT");
        int i21 = bundle.getInt("ENABLE_POINT");
        int iR14 = r1();
        t.d("Lpoint usePoint : " + i20);
        t.d("Lpoint availablePoint : " + i21);
        t.d("totalUsePoint : " + iR14);
        if (i21 == 0 || i20 > i21) {
            string = getString(AbstractC5959j.point_disable_point_message);
        } else if (i20 > r1()) {
            string = getString(AbstractC5959j.point_disable_point_message2);
        } else if (i20 < 100 || i20 % 100 > 0) {
            string = getString(AbstractC5959j.point_disable_point_message6);
        }
        LPointView lPoint = this.f2127v0.getLPoint();
        if (N.isNull(string)) {
            if (iR14 == i20) {
                t0(getView());
            }
            lPoint.setUsePointsEdit(i20);
        } else {
            C6637k.getCDialog(getActivity(), 1001, 1, getString(AbstractC5959j.dialog_title)).setContent(string).showDialog();
        }
        lPoint.setApplyPoint(N.isNull(string));
        P1(5);
    }

    @Override // com.korail.talk.view.payment.point.OkCashBackPointView.a
    public void onRequestApplyPhoneNo(int i8, Bundle bundle) {
        if (i8 == 4) {
            i1(bundle.getString("PHONE_NM"));
        }
    }

    @Override // com.korail.talk.view.payment.point.OkCashBackPointView.a, com.korail.talk.view.payment.point.LPointView.a
    public void onRequestAuth(int i8, Bundle bundle) {
        if (i8 != 4) {
            if (i8 == 5) {
                String string = bundle.getString("CARD_PASSWORD");
                String string2 = string.length() < 6 ? getString(AbstractC5959j.payment_password_message) : null;
                this.f2119n0.setPassword(string);
                if (N.isNull(string2)) {
                    f1(string);
                    return;
                } else {
                    C6637k.getCDialog(getActivity(), 1001, 1, getString(AbstractC5959j.dialog_title)).setContent(string2).showDialog();
                    return;
                }
            }
            return;
        }
        String string3 = bundle.getString("PHONE_NM");
        String string4 = bundle.getString("AUTH_NO");
        if (string3.length() <= 0 || string4.length() != 4) {
            C6637k.getCDialog(getActivity(), 1001, 1, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.point_disable_point_message4)).showDialog();
            OkCashBackPointView okCashBackPoint = this.f2127v0.getOkCashBackPoint();
            okCashBackPoint.setAvailablePoints(0);
            okCashBackPoint.setApplyRequest(false);
            P1(4);
            return;
        }
        PointInquiryDao.PointInquiryRequest pointInquiryRequest = new PointInquiryDao().new PointInquiryRequest();
        pointInquiryRequest.setPointDvCd(StbkAcntDao.ACCOUNT_REGISTER);
        pointInquiryRequest.setInpDvCd(StbkAcntDao.ACCOUNT_REGISTER);
        pointInquiryRequest.setXpointNo(string3);
        pointInquiryRequest.setXpointPwd(string4);
        pointInquiryRequest.setStlCrdValidTrm("");
        l1(pointInquiryRequest);
    }

    @Override // com.korail.talk.view.payment.point.KTXMileageView.a, com.korail.talk.view.payment.point.RailPointView.a, com.korail.talk.view.payment.point.WoorimorePointView.a, com.korail.talk.view.payment.point.CityPointView.a
    public void onRequestQuery(int i8, Bundle bundle) {
        if (i8 == 0 || i8 == 1) {
            PointInquiryDao.PointInquiryRequest pointInquiryRequest = new PointInquiryDao().new PointInquiryRequest();
            pointInquiryRequest.setPointDvCd(String.valueOf(i8));
            l1(pointInquiryRequest);
            return;
        }
        String string = null;
        if (i8 != 2) {
            if (i8 == 3) {
                String string2 = bundle.getString("CARD_NO_1");
                String string3 = bundle.getString("CARD_NO_2");
                String string4 = bundle.getString("CARD_NO_3");
                String string5 = bundle.getString("CARD_NO_4");
                String string6 = bundle.getString("CARD_MONTH");
                String string7 = bundle.getString("CARD_YEAR");
                if (string2.length() == 0 || string3.length() == 0 || string4.length() == 0 || string5.length() == 0) {
                    string = getString(AbstractC5959j.payment_card_num_message);
                } else if (string6.length() != 2) {
                    string = getString(AbstractC5959j.payment_valid_date_message1);
                } else if (C6634h.isInValidMonth(string6)) {
                    string = getString(AbstractC5959j.payment_valid_date_message2);
                } else if (string7.length() != 4) {
                    string = getString(AbstractC5959j.payment_valid_date_message3);
                } else if (C6634h.isInValidYear(string7)) {
                    string = getString(AbstractC5959j.payment_valid_date_message4);
                }
                if (!N.isNull(string)) {
                    C6637k.getCDialog(getActivity(), 1001, 1, getString(AbstractC5959j.dialog_title)).setContent(string).showDialog();
                    P1(3);
                    return;
                }
                PointInquiryDao.PointInquiryRequest pointInquiryRequest2 = new PointInquiryDao().new PointInquiryRequest();
                pointInquiryRequest2.setPointDvCd("3");
                pointInquiryRequest2.setXpointNo(string2 + string3 + string4 + string5);
                pointInquiryRequest2.setXpointPwd("");
                StringBuilder sb = new StringBuilder();
                sb.append(string7);
                sb.append(string6);
                pointInquiryRequest2.setStlCrdValidTrm(sb.toString());
                l1(pointInquiryRequest2);
                return;
            }
            return;
        }
        String string8 = bundle.getString("CARD_NO_1");
        String string9 = bundle.getString("CARD_NO_2");
        String string10 = bundle.getString("CARD_NO_3");
        String string11 = bundle.getString("CARD_NO_4");
        String string12 = bundle.getString("CARD_MONTH");
        String string13 = bundle.getString("CARD_YEAR");
        String string14 = bundle.getString("CARD_PASSWORD");
        if (string8.length() == 0 || string9.length() == 0 || string10.length() == 0 || string11.length() == 0) {
            string = getString(AbstractC5959j.payment_card_num_message);
        } else if (string12.length() != 2) {
            string = getString(AbstractC5959j.payment_valid_date_message1);
        } else if (C6634h.isInValidMonth(string12)) {
            string = getString(AbstractC5959j.payment_valid_date_message2);
        } else if (string13.length() != 4) {
            string = getString(AbstractC5959j.payment_valid_date_message3);
        } else if (C6634h.isInValidYear(string13)) {
            string = getString(AbstractC5959j.payment_valid_date_message4);
        } else if (string14.length() == 0) {
            string = getString(AbstractC5959j.payment_password_message);
        }
        WoorimorePointView woorimorePoint = this.f2127v0.getWoorimorePoint();
        if (!N.isNull(string)) {
            C6637k.getCDialog(getActivity(), 1001, 1, getString(AbstractC5959j.dialog_title)).setContent(string).showDialog();
            woorimorePoint.setApplyRequest(false);
            P1(2);
            return;
        }
        PointInquiryDao.PointInquiryRequest pointInquiryRequest3 = new PointInquiryDao().new PointInquiryRequest();
        pointInquiryRequest3.setPointDvCd("2");
        pointInquiryRequest3.setInpDvCd("3");
        pointInquiryRequest3.setXpointNo(string8 + string9 + string10 + string11);
        pointInquiryRequest3.setXpointPwd(string14);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(string13);
        sb2.append(string12);
        pointInquiryRequest3.setStlCrdValidTrm(sb2.toString());
        l1(pointInquiryRequest3);
    }

    @Override // w6.ViewOnClickListenerC6475c.a
    public void onSelectChanged(FrameLayout frameLayout, boolean z8, boolean z9) {
        String pointType = ((CommonCodeDao.PointData) frameLayout.getTag()).getPointType();
        if (C6630d.isNull(frameLayout)) {
            return;
        }
        switch (Integer.parseInt(pointType)) {
            case 0:
                KTXMileageView kTXMileage = this.f2127v0.getKTXMileage();
                if (z8 && this.f2127v0.isReadyPoint()) {
                    kTXMileage.setApplyUsePoints();
                }
                P1(0);
                break;
            case 1:
                RailPointView railPoint = this.f2127v0.getRailPoint();
                if (z8 && this.f2127v0.isReadyPoint()) {
                    railPoint.setApplyUsePoints();
                }
                P1(1);
                break;
            case 2:
                WoorimorePointView woorimorePoint = this.f2127v0.getWoorimorePoint();
                if (z8 && this.f2127v0.isReadyPoint()) {
                    woorimorePoint.setApplyCardData();
                    woorimorePoint.setApplyUsePoints();
                }
                P1(2);
                break;
            case 3:
                CityPointView cityPoint = this.f2127v0.getCityPoint();
                if (z8 && this.f2127v0.isReadyPoint()) {
                    cityPoint.setApplyCardData();
                }
                P1(3);
                break;
            case 4:
                OkCashBackPointView okCashBackPoint = this.f2127v0.getOkCashBackPoint();
                if (z8 && this.f2127v0.isReadyPoint()) {
                    okCashBackPoint.setApplyCardData();
                    okCashBackPoint.setApplyUsePoints();
                }
                P1(4);
                break;
            case 5:
                LPointView lPoint = this.f2127v0.getLPoint();
                if (z8 && this.f2127v0.isReadyPoint()) {
                    lPoint.setApplyUsePoints();
                }
                P1(5);
                break;
            case 6:
                GifticketView gifticketView = this.f2127v0.getGifticketView();
                if (z8 && this.f2127v0.isReadyPoint()) {
                    gifticketView.setApplyUsePoints();
                }
                P1(6);
                if (!gifticketView.isIsListLoaded()) {
                    d1();
                    break;
                }
                break;
        }
    }

    @Override // J5.d.a
    public void onSelectItem(String str) {
        if (StbkAcntDao.DELETE_ACCOUNT.equals(str) && C6630d.isNull(this.f2122q0)) {
            p1();
        }
        CommonCodeDao.EasyPayData easyPayData = this.f2130y0.getEasyPayData();
        if (easyPayData == null) {
            C6627a.removeClickEvent(this.f1486j0);
            return;
        }
        if (!"1".equals(easyPayData.getPayType()) && !"0".equals(easyPayData.getPayType()) && !"2".equals(easyPayData.getPayType()) && !"11".equals(easyPayData.getPayType())) {
            C6627a.removeClickEvent(this.f1486j0);
            return;
        }
        C6627a.addClickEvent(this.f1486j0, easyPayData.getPayTitle() + X.SPACE + getString(AbstractC5959j.open_new_window));
    }

    @Override // com.korail.talk.view.TabView.a
    public void onTabItemSelectedChanged(View view) {
        t0(view);
        int id = view.getId();
        if (AbstractC5955f.tvi_general_pay == id) {
            this.f2127v0.setPaymentOption(0);
            this.f2128w0.setDisplayedChild(0);
            this.f2128w0.clearFocus();
        } else if (AbstractC5955f.tvi_easy_pay == id) {
            this.f2127v0.setPaymentOption(1);
            this.f2128w0.setDisplayedChild(1);
            this.f2128w0.clearFocus();
        }
    }

    protected int r1() {
        return this.f2118m0;
    }

    protected int s1() {
        return r1() + getDiscountAmount();
    }

    public void setEasyPaymentData(Bundle bundle) {
        C6630d.printBundleData(bundle);
        String string = bundle.getString("type");
        t.d("setEasyPaymentData()'s type :  " + string);
        if ("railplus".equals(string) || "railplus_zeropay".equals(string)) {
            if (!bundle.getString("RET_CODE").equals("000000")) {
                C6637k.getCDialog(getActivity(), 1001, 1, getString(AbstractC5959j.dialog_title)).setContent(bundle.getString("RET_MSG")).showDialog();
                return;
            }
            if ("railplus_zeropay".equals(string)) {
                bundle.putString("ZERO_PAY_QR_TOKEN", TicketSelfCheckinStatusActivity.CHECKIN_STATUS_NOT_USE + bundle.getString("ZERO_PAY_QR_TOKEN"));
            }
            J1(bundle);
            return;
        }
        if ("payco".equals(string)) {
            if ("0".equals(bundle.getString(Constants.CODE))) {
                n1(string, bundle);
                return;
            }
            return;
        }
        if ("kakao".equals(string)) {
            if (C6630d.isNotNull(bundle.getString("pg_token"))) {
                n1(string, bundle);
                return;
            }
            return;
        }
        if ("paybooc".equals(string)) {
            if (BaseResponse.SUCCESS.equals(bundle.getString("strResult"))) {
                n1(string, bundle);
                return;
            } else {
                if (BaseResponse.FAIL.equals(bundle.getString("strResult"))) {
                    C6637k.getCDialog(getActivity(), 1001, 1, getString(AbstractC5959j.dialog_title)).setContent(bundle.getString("msgTxt")).showDialog();
                    return;
                }
                return;
            }
        }
        if ("naverPay".equals(string)) {
            if ("Success".equalsIgnoreCase(bundle.getString("resultCode"))) {
                J1(bundle);
                return;
            } else {
                if (bundle.containsKey("resultCode")) {
                    C6637k.getCDialog(getActivity(), 1001, 1, getString(AbstractC5959j.dialog_title)).setContent(bundle.getString("resultMessage")).showDialog();
                    return;
                }
                return;
            }
        }
        if ("naverPayMoney".equals(string)) {
            if ("Success".equalsIgnoreCase(bundle.getString("resultCode"))) {
                J1(bundle);
                return;
            } else {
                if (bundle.containsKey("resultCode")) {
                    C6637k.getCDialog(getActivity(), 1001, 1, getString(AbstractC5959j.dialog_title)).setContent(bundle.getString("resultMessage")).showDialog();
                    return;
                }
                return;
            }
        }
        if ("stbkAcnt".equals(string)) {
            t.d("[세틀뱅크 내통장결제]");
            if ("cancel".equals(bundle.getString("url"))) {
                t.e("[세틀뱅크 내통장결제] 결제 취소");
                return;
            } else {
                J1(bundle);
                return;
            }
        }
        if (!"tosspay".equals(string) && !"tosspay_auto".equals(string)) {
            J1(bundle);
            return;
        }
        t.d("[토스페이 자동결제, 일반결제]");
        bundle.putString("spayTid", this.f2121p0.getSpayTid());
        if (BaseResponse.SUCCESS.equals(bundle.getString("strResult"))) {
            J1(bundle);
        } else {
            t.e("[토스페이 자동결제] 등록 취소");
            t.e("[토스페이 일반결제] 결제 취소");
        }
    }

    @Override // G5.a
    protected void y0() {
        super.y0();
        this.f2128w0.setVisibility(this.f2127v0.getSelectedUsePoint() == r1() ? 8 : 0);
    }
}
