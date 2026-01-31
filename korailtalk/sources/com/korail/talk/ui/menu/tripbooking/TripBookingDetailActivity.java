package com.korail.talk.ui.menu.tripbooking;

import K4.b;
import Q7.X;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.product.ProductCancelDao;
import com.korail.talk.network.dao.product.ProductCancelDao.ProductCancelRequest;
import com.korail.talk.network.dao.product.ProductDetailDao;
import com.korail.talk.network.dao.product.ProductDetailDao.ProductDetailRequest;
import com.korail.talk.network.dao.product.ProductPaymentCheckDao;
import com.korail.talk.network.dao.product.ProductPaymentCheckDao.ProductPaymentCheckRequest;
import com.korail.talk.ui.payment.PaymentActivity;
import com.korail.talk.ui.web.IntegrationWebViewActivity;
import com.korail.talk.view.CButton;
import com.korail.talk.view.base.BaseViewActivity;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import r4.g;
import r4.i;
import z4.C6630d;
import z4.C6634h;
import z4.C6637k;
import z4.N;

/* loaded from: classes.dex */
public class TripBookingDetailActivity extends BaseViewActivity {

    /* renamed from: i, reason: collision with root package name */
    private String f28400i;

    /* renamed from: j, reason: collision with root package name */
    private String f28401j;

    /* renamed from: k, reason: collision with root package name */
    private b f28402k;

    /* renamed from: l, reason: collision with root package name */
    private String f28403l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f28404m;

    /* renamed from: n, reason: collision with root package name */
    private CButton f28405n;

    /* renamed from: o, reason: collision with root package name */
    private CButton f28406o;

    private void A0(String str, String str2) {
        ProductCancelDao productCancelDao = new ProductCancelDao();
        ProductCancelDao.ProductCancelRequest productCancelRequest = productCancelDao.new ProductCancelRequest();
        productCancelRequest.setTxtVrRsNo(str);
        productCancelRequest.setTxtGdSqno(str2);
        productCancelDao.setRequest(productCancelRequest);
        productCancelDao.setFinishView(true);
        executeDao(productCancelDao);
    }

    private void B0() {
        this.f28400i = getIntent().getStringExtra("VR_RSV_NO");
        this.f28401j = getIntent().getStringExtra("VR_RSV_SQ_NO");
        this.f28402k = (b) getIntent().getSerializableExtra("PAYMENT_STATE");
        this.f28404m = getIntent().getBooleanExtra("RSV_STT_CD", false);
    }

    private void C0() {
        this.f28405n.setOnClickListener(this);
        this.f28406o.setOnClickListener(this);
    }

    private void D0() {
        n0(false);
        this.f28405n = (CButton) findViewById(AbstractC5955f.bookingCancelBtn);
        this.f28406o = (CButton) findViewById(AbstractC5955f.voucherBtn);
    }

    private void E0() {
        C6637k.getCDialog(K(), 1002, 0, getString(AbstractC5959j.trip_booking_cancel_dialog_title)).setContent(getString(AbstractC5959j.common_reservation_cancel_message)).setButtonListener(new DialogInterface.OnClickListener() { // from class: A5.a
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                this.f75a.w0(dialogInterface, i8);
            }
        }).showDialog();
    }

    private void setText() {
        setAppTitle(AbstractC5959j.title_trip_booking);
        if (this.f28402k == b.f2910) {
            this.f28406o.setText(getString(AbstractC5959j.trip_booking_ticket));
        }
    }

    private void t0() {
        this.f28405n.setEnabled(this.f28404m);
        this.f28406o.setEnabled(this.f28404m);
    }

    private void u0(String str, String str2) {
        ProductPaymentCheckDao productPaymentCheckDao = new ProductPaymentCheckDao();
        ProductPaymentCheckDao.ProductPaymentCheckRequest productPaymentCheckRequest = productPaymentCheckDao.new ProductPaymentCheckRequest();
        productPaymentCheckRequest.setTxtVrRsNo(str);
        productPaymentCheckRequest.setTxtRsvGdSqno(str2);
        productPaymentCheckDao.setRequest(productPaymentCheckRequest);
        productPaymentCheckDao.setFinishView(true);
        executeDao(productPaymentCheckDao);
    }

    private void v0(String str, String str2) {
        ProductDetailDao productDetailDao = new ProductDetailDao();
        ProductDetailDao.ProductDetailRequest productDetailRequest = productDetailDao.new ProductDetailRequest();
        productDetailRequest.setTxtVrRsvNo(str);
        productDetailRequest.setTxtVrRsvSqNo(str2);
        productDetailDao.setRequest(productDetailRequest);
        productDetailDao.setFinishView(true);
        executeDao(productDetailDao);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w0(DialogInterface dialogInterface, int i8) {
        if (102 == i8) {
            A0(this.f28400i, this.f28403l);
        }
    }

    private void x0(ProductDetailDao.ProductInfo productInfo) {
        ((TextView) findViewById(AbstractC5955f.productNameTxt)).setText(productInfo.getStrGdNm());
        List<ProductDetailDao.EntityOne> entityOne = productInfo.getEntityOne();
        StringBuilder sb = new StringBuilder();
        for (ProductDetailDao.EntityOne entityOne2 : entityOne) {
            if (sb.length() > 0) {
                sb.append(X.LF);
            }
            sb.append("- ");
            sb.append(entityOne2.getStrGdConsItmNm());
        }
        ((TextView) findViewById(AbstractC5955f.productDetailTxt)).setText(sb.toString());
        ((TextView) findViewById(AbstractC5955f.departueDateTxt)).setText(productInfo.getStrUtlTrmCont().split("\\~")[0]);
        ((TextView) findViewById(AbstractC5955f.cancelPeriodTxt)).setText(C6634h.convertFormat(productInfo.getStrCncDlnDt(), "yyyyMMdd", "yyyy.MM.dd. (E)"));
        ((TextView) findViewById(AbstractC5955f.depositAmountTxt)).setText(getString(AbstractC5959j.common_amount, N.getDecimalFormatString(productInfo.getStrRcvdAmt())));
        ((TextView) findViewById(AbstractC5955f.payAmountTxt)).setText(getString(AbstractC5959j.common_amount, N.getDecimalFormatString(productInfo.getStrTotStlAmt())));
        ((TextView) findViewById(AbstractC5955f.refundChargeTxt)).setText(getString(AbstractC5959j.common_amount, N.getDecimalFormatString(productInfo.getStrCncRetFee())));
        ((TextView) findViewById(AbstractC5955f.refundAmountTxt)).setText(getString(AbstractC5959j.common_amount, N.getDecimalFormatString(productInfo.getStrCncRetAmt())));
        ((TextView) findViewById(AbstractC5955f.bookingNoTxt)).setText(productInfo.getStrVrRsvNo());
        ((TextView) findViewById(AbstractC5955f.bookingStatusTxt)).setText(productInfo.getStrRsvSttNm());
        ((TextView) findViewById(AbstractC5955f.paymentStatusTxt)).setText(productInfo.getStrStlSttCd().toString());
        findViewById(AbstractC5955f.viewLayout).setVisibility(0);
    }

    private void y0(ProductPaymentCheckDao.ProductPaymentCheckResponse productPaymentCheckResponse) {
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
    }

    private void z0() {
        Intent intent = new Intent(getApplicationContext(), (Class<?>) IntegrationWebViewActivity.class);
        intent.putExtra("WEB_POST_URL", g.VOUCHER_URL);
        intent.putExtra("WEB_POST_PARAMETER", "txtVrRsvNo=" + this.f28400i);
        startActivity(intent);
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (AbstractC5955f.bookingCancelBtn == id) {
            E0();
            return;
        }
        if (AbstractC5955f.voucherBtn != id) {
            super.onClick(view);
        } else if (this.f28402k == b.f2910) {
            z0();
        } else {
            u0(this.f28400i, this.f28401j);
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.trip_booking_detail_activity);
        if (C6630d.isNull(bundle)) {
            B0();
            D0();
            setText();
            C0();
            t0();
            v0(this.f28400i, this.f28401j);
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        super.onReceive(iBaseDao);
        int id = iBaseDao.getId();
        if (AbstractC5955f.dao_reservation_product_detail == id) {
            ProductDetailDao.ProductDetailResponse productDetailResponse = (ProductDetailDao.ProductDetailResponse) iBaseDao.getResponse();
            ProductDetailDao.ProductInfo mainInfo = productDetailResponse.getMainInfo();
            this.f28403l = productDetailResponse.getMainInfo().getStrGdSqno();
            x0(mainInfo);
            return;
        }
        if (AbstractC5955f.dao_product_payment_check == id) {
            y0((ProductPaymentCheckDao.ProductPaymentCheckResponse) iBaseDao.getResponse());
        } else if (AbstractC5955f.dao_reservation_product_cancel == id) {
            setResult(-1);
            finish();
        }
    }
}
