package com.korail.talk.ui.web;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.webkit.WebView;
import android.widget.Toast;
import androidx.core.app.AbstractC0918b;
import com.korail.talk.data.ReceiveSRTData;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.product.ProductPaymentCheckDao;
import com.korail.talk.network.dao.product.ProductPaymentCheckDao.ProductPaymentCheckRequest;
import com.korail.talk.network.dao.trainsInfo.TourTrainInfoDao;
import com.korail.talk.network.dao.trainsInfo.TourTrainInfoDao.TourTrainInfoRequest;
import com.korail.talk.network.data.reservation.old.OJrny;
import com.korail.talk.ui.booking.discountBooking.goods.DiscountTourTrainBookingActivity;
import com.korail.talk.ui.intro.IntroActivity;
import com.korail.talk.ui.payment.PaymentActivity;
import com.korail.talk.ui.web.BaseWebViewActivity;
import n4.AbstractC5951b;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import r4.g;
import r4.i;
import z4.C6630d;
import z4.C6637k;
import z4.C6641o;
import z4.q;
import z4.t;

/* loaded from: classes.dex */
public class IntegrationWebViewActivity extends BaseWebViewActivity {

    /* renamed from: t */
    boolean f29273t = false;

    /* renamed from: u */
    String f29274u;

    private class b extends BaseWebViewActivity.e {
        private b() {
            super();
        }

        @Override // com.korail.talk.ui.web.BaseWebViewActivity.e, android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            boolean zShouldOverrideUrlLoading = super.shouldOverrideUrlLoading(webView, str);
            t.e("url = " + str);
            Uri uri = Uri.parse(str);
            if (zShouldOverrideUrlLoading && IntegrationWebViewActivity.this.getString(AbstractC5959j.korailtalk_scheme).equals(uri.getScheme())) {
                String authority = uri.getAuthority();
                if ("productTrainSearch".equals(authority)) {
                    IntegrationWebViewActivity.this.X0(str);
                } else if ("payment".equals(authority)) {
                    IntegrationWebViewActivity.this.W0(str);
                } else if ("login".equals(authority)) {
                    C6641o.moveToLogin(IntegrationWebViewActivity.this.K());
                } else if ("supermove".equals(authority)) {
                    t.d("supermove : " + uri.getQuery());
                    Intent intent = new Intent(IntegrationWebViewActivity.this.getApplicationContext(), (Class<?>) IntroActivity.class);
                    ReceiveSRTData receiveSRTData = new ReceiveSRTData();
                    receiveSRTData.setTxtGoStart(uri.getQueryParameter("txtGoStart"));
                    receiveSRTData.setTxtGoEnd(uri.getQueryParameter("txtGoEnd"));
                    receiveSRTData.setTxtGoAbrdDt(uri.getQueryParameter("txtGoAbrdDt"));
                    receiveSRTData.setTxtGoHour(uri.getQueryParameter("txtGoHour"));
                    receiveSRTData.setTxtGoHour(uri.getQueryParameter("txtGoHour"));
                    receiveSRTData.setTxtGoHour(uri.getQueryParameter("txtGoHour"));
                    receiveSRTData.setTxtPsgFlg_1(uri.getQueryParameter("txtPsgFlg_1"));
                    receiveSRTData.setTxtPsgFlg_2(uri.getQueryParameter("txtPsgFlg_2"));
                    receiveSRTData.setTxtPsgFlg_3(uri.getQueryParameter("txtPsgFlg_3"));
                    receiveSRTData.setTxtPsgFlg_4(uri.getQueryParameter("txtPsgFlg_4"));
                    receiveSRTData.setTxtPsgFlg_5(uri.getQueryParameter("txtPsgFlg_5"));
                    receiveSRTData.setTxtPsgFlg_6(uri.getQueryParameter("txtPsgFlg_6"));
                    receiveSRTData.setTxtSeatAttCd_2(uri.getQueryParameter("txtSeatAttCd_2"));
                    receiveSRTData.setTxtSeatAttCd_3(uri.getQueryParameter("txtSeatAttCd_3"));
                    receiveSRTData.setTxtSeatAttCd_4(uri.getQueryParameter("txtSeatAttCd_4"));
                    receiveSRTData.setSelGotrain(uri.getQueryParameter("selGotrain"));
                    receiveSRTData.setTxtTrnGpCd(uri.getQueryParameter(OJrny.TRN_GP_CD));
                    receiveSRTData.setTxtMenuId(uri.getQueryParameter("txtMenuId"));
                    intent.putExtra("PARAM", q.toJson(receiveSRTData));
                    intent.addFlags(603979776);
                    IntegrationWebViewActivity.this.startActivity(intent);
                }
            }
            t.e("isShouldOverrideUrlLoading : " + zShouldOverrideUrlLoading);
            return zShouldOverrideUrlLoading;
        }

        /* synthetic */ b(IntegrationWebViewActivity integrationWebViewActivity, a aVar) {
            this();
        }
    }

    private void V0() {
        String stringExtra = getIntent().getStringExtra("MAAS_INFO");
        String stringExtra2 = getIntent().getStringExtra("MAAS_POPUP_IMAGE");
        if (stringExtra2 != null) {
            C6637k.getCImageDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(stringExtra2).showDialog();
        } else if (stringExtra != null) {
            C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(stringExtra).showDialog();
        }
    }

    public void W0(String str) {
        Uri uri = Uri.parse(str);
        ProductPaymentCheckDao productPaymentCheckDao = new ProductPaymentCheckDao();
        ProductPaymentCheckDao.ProductPaymentCheckRequest productPaymentCheckRequest = productPaymentCheckDao.new ProductPaymentCheckRequest();
        productPaymentCheckRequest.setTxtVrRsNo(uri.getQueryParameter("strVrRsNo"));
        productPaymentCheckRequest.setTxtRsvGdSqno(uri.getQueryParameter("strGdSqno"));
        productPaymentCheckDao.setRequest(productPaymentCheckRequest);
        executeDao(productPaymentCheckDao);
    }

    public void X0(String str) {
        Uri uri = Uri.parse(str);
        TourTrainInfoDao tourTrainInfoDao = new TourTrainInfoDao();
        TourTrainInfoDao.TourTrainInfoRequest tourTrainInfoRequest = tourTrainInfoDao.new TourTrainInfoRequest();
        tourTrainInfoRequest.setTxtTrnGpCd(uri.getQueryParameter("trnGpCd"));
        tourTrainInfoRequest.setTitle(uri.getQueryParameter("type"));
        tourTrainInfoRequest.setStartStn(uri.getQueryParameter("startStation"));
        tourTrainInfoRequest.setArrivalStn(uri.getQueryParameter("endStation"));
        tourTrainInfoRequest.setJobDv(uri.getQueryParameter("jobDv"));
        tourTrainInfoDao.setRequest(tourTrainInfoRequest);
        executeDao(tourTrainInfoDao);
    }

    public /* synthetic */ void Y0() {
        this.f29273t = false;
    }

    private void Z0(TourTrainInfoDao tourTrainInfoDao) {
        TourTrainInfoDao.TourTrainInfoRequest tourTrainInfoRequest = (TourTrainInfoDao.TourTrainInfoRequest) tourTrainInfoDao.getRequest();
        TourTrainInfoDao.SeatInfos seat_infos = ((TourTrainInfoDao.TourTrainInfoResponse) tourTrainInfoDao.getResponse()).getSeat_infos();
        Intent intent = new Intent(getApplicationContext(), (Class<?>) DiscountTourTrainBookingActivity.class);
        intent.putExtra("TITLE_NAME", tourTrainInfoRequest.getTitle());
        intent.putExtra("TRN_GP_CD", tourTrainInfoRequest.getTxtTrnGpCd());
        intent.putExtra("START_STN", tourTrainInfoRequest.getStartStn());
        intent.putExtra("ARRIVAL_STN", tourTrainInfoRequest.getArrivalStn());
        intent.putExtra("JOB_DV", tourTrainInfoRequest.getJobDv());
        intent.putExtra("TOUR_TRAIN_DATA", seat_infos);
        startActivity(intent);
    }

    private void a1(ProductPaymentCheckDao.ProductPaymentCheckResponse productPaymentCheckResponse) {
        ProductPaymentCheckDao.MainInfo mainInfo = productPaymentCheckResponse.getMainInfo();
        int strMrkAmtSum = mainInfo.getStrMrkAmtSum();
        Intent intent = new Intent(getApplicationContext(), (Class<?>) PaymentActivity.class);
        intent.putExtra("PAYMENT_TYPE", i.PAYMENT_DEFAULT);
        intent.putExtra("PAYMENT_REQUEST", C4.b.getIntgStlRequest(mainInfo.getStrLumpStlTgtNo()));
        intent.putExtra("IS_POINT_STEP", true);
        intent.putExtra("SELECTED_ITEM_COUNT", 1);
        intent.putExtra("RECEIVED_AMOUNT", strMrkAmtSum);
        intent.putExtra("DISCOUNT_AMOUNT", 0);
        intent.putExtra("IS_TRAVEL_PACKAGES", true);
        startActivity(intent);
        overridePendingTransition(AbstractC5951b.bottom_view_slide_up, AbstractC5951b.bottom_view_slide_stay);
    }

    private void b1() {
        boolean booleanExtra = getIntent().getBooleanExtra("IS_SCREEN_FULL", false);
        findViewById(AbstractC5955f.titleAppBar).setVisibility(booleanExtra ? 8 : 0);
        if (booleanExtra) {
            setDrawerLockMode(1);
        } else if (this.f29252k) {
            l0();
        } else {
            n0(false);
        }
    }

    private void c1() {
        P0(new BaseWebViewActivity.c(), false);
        Q0(new b());
        O0(new BaseWebViewActivity.d());
        M0();
        this.f29274u = this.f29258q.toString();
    }

    public void isAppFinish() {
        if (this.f29273t) {
            AbstractC0918b.finishAffinity(this);
            return;
        }
        this.f29273t = true;
        Toast.makeText(getApplicationContext(), getString(AbstractC5959j.msg_toast_quit), 0).show();
        new Handler().postDelayed(new Runnable() { // from class: m6.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f34119a.Y0();
            }
        }, 2000L);
    }

    @Override // com.korail.talk.ui.web.BaseWebViewActivity, com.korail.talk.view.base.BaseViewActivity, com.korail.talk.view.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (getCurrentUrl().contains(this.f29274u) && !this.f29252k) {
            isAppFinish();
            return;
        }
        if (!getCurrentUrl().contains(g.MULTI_LANGUAGE_URL) || !getCurrentUrl().contains(g.MULTI_LANGUAGE_AFTER_DATA)) {
            super.onBackPressed();
        } else if (this.f29256o.canGoBack()) {
            this.f29256o.goBack();
        } else {
            N0(this.f29274u);
        }
    }

    @Override // com.korail.talk.ui.web.BaseWebViewActivity, com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_integration_webview);
        if (C6630d.isNull(bundle)) {
            V0();
            b1();
            c1();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        super.onReceive(iBaseDao);
        int id = iBaseDao.getId();
        if (AbstractC5955f.dao_tour_train_info == id) {
            Z0((TourTrainInfoDao) iBaseDao);
        } else if (AbstractC5955f.dao_product_payment_check == id) {
            a1((ProductPaymentCheckDao.ProductPaymentCheckResponse) iBaseDao.getResponse());
        }
    }
}
