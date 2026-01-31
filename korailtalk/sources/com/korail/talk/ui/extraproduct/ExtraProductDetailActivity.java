package com.korail.talk.ui.extraproduct;

import Q7.X;
import android.content.DialogInterface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.addService.AdditionalServiceDao;
import com.korail.talk.network.dao.addService.AdditionalServiceDao.AdditionalServiceRequest;
import com.korail.talk.network.dao.trainsInfo.Price2FareDao;
import com.korail.talk.network.data.addService.ExtraProductInfo;
import com.korail.talk.view.base.BaseViewActivity;
import com.squareup.picasso.s;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import n4.AbstractC5953d;
import n4.AbstractC5954e;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import z4.C6633g;
import z4.C6634h;
import z4.C6637k;
import z4.N;
import z4.t;
import z4.z;

/* loaded from: classes.dex */
public class ExtraProductDetailActivity extends BaseViewActivity {

    /* renamed from: i, reason: collision with root package name */
    ExtraProductInfo.AddSrvInfo f27980i;

    /* renamed from: j, reason: collision with root package name */
    String f27981j;

    /* renamed from: k, reason: collision with root package name */
    String f27982k;

    class a extends AsyncTask {

        /* renamed from: a, reason: collision with root package name */
        private final ImageView f27983a;

        /* renamed from: b, reason: collision with root package name */
        private final String f27984b;

        /* renamed from: c, reason: collision with root package name */
        private final int f27985c;

        a(ImageView imageView, String str, int i8) {
            this.f27983a = imageView;
            this.f27984b = str;
            this.f27985c = i8;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Drawable doInBackground(Void... voidArr) {
            return this.f27985c == 0 ? new BitmapDrawable(ExtraProductDetailActivity.this.getResources(), C6633g.createQRCode(this.f27984b, N.dpToPx(160.0f), N.dpToPx(160.0f), -15574641, -1971213)) : new BitmapDrawable(ExtraProductDetailActivity.this.getResources(), C6633g.createBarcode(this.f27984b, N.dpToPx(210.0f), N.dpToPx(80.0f), androidx.core.content.a.getColor(ExtraProductDetailActivity.this.getApplicationContext(), AbstractC5953d.barcode_line_mypage), androidx.core.content.a.getColor(ExtraProductDetailActivity.this.getApplicationContext(), AbstractC5953d.barcode_background_extra_product)));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Drawable drawable) {
            super.onPostExecute(drawable);
            this.f27983a.setBackground(drawable);
            ExtraProductDetailActivity.this.dismissLoading();
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            super.onPreExecute();
            ExtraProductDetailActivity.this.showLoading();
        }
    }

    private void t0() {
        AdditionalServiceDao additionalServiceDao = new AdditionalServiceDao();
        AdditionalServiceDao.AdditionalServiceRequest additionalServiceRequest = additionalServiceDao.new AdditionalServiceRequest();
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(this.f27980i.getAddSrvReqNo());
        additionalServiceRequest.setPnrNo(this.f27981j);
        additionalServiceRequest.setJrnySqno(this.f27982k);
        additionalServiceRequest.setJobDbCd("C");
        additionalServiceRequest.setCncTgtCnt(1);
        additionalServiceRequest.setAddSrvReqNo(arrayList);
        additionalServiceDao.setRequest(additionalServiceRequest);
        executeDao(additionalServiceDao);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u0(DialogInterface dialogInterface, int i8) {
        setResult(-1);
        finish();
    }

    private void v0(ImageView imageView, String str) throws NumberFormatException {
        int i8;
        try {
            i8 = Integer.parseInt(str);
        } catch (NumberFormatException e8) {
            t.e(e8.getMessage());
            i8 = -1;
        }
        int i9 = i8 != 5 ? i8 != 9 ? -1 : AbstractC5954e.ic_receipt_reject : AbstractC5954e.ic_receipt_complete;
        if (i9 != -1) {
            imageView.setImageResource(i9);
        }
        imageView.setVisibility(i9 == -1 ? 8 : 0);
    }

    private void w0() {
        this.f27980i = (ExtraProductInfo.AddSrvInfo) getIntent().getSerializableExtra("EXTRA_PRODUCT_INFO");
        this.f27981j = getIntent().getStringExtra("TICKET_PNR_NUMBER");
        this.f27982k = getIntent().getStringExtra(Price2FareDao.Price2Fare.jrnySqnoString);
    }

    private void x0() {
        findViewById(AbstractC5955f.returnBtn).setOnClickListener(this);
    }

    private void y0() throws NumberFormatException {
        n0(false);
        setAppTitle(AbstractC5959j.title_extra_product_detail);
        t.d("부가서비스 신청번호 - " + this.f27980i.getAddSrvReqNo());
        new a((ImageView) findViewById(AbstractC5955f.barcode_image), this.f27980i.getAddSrvReqNo(), 1).execute(new Void[0]);
        ((TextView) findViewById(AbstractC5955f.barcode_number)).setText(this.f27980i.getAddSrvReqNo());
        ((TextView) findViewById(AbstractC5955f.tv_grid_extra_product_title)).setText(this.f27980i.getAddSrvNm());
        ((TextView) findViewById(AbstractC5955f.tv_grid_extra_product_detail)).setText(this.f27980i.getSpvsRsStnCdNm() + getResources().getString(AbstractC5959j.common_station) + X.SPACE + this.f27980i.getAddSrvMrkEntNm());
        ((TextView) findViewById(AbstractC5955f.tv_grid_extra_product_count)).setText(N.getInteger(this.f27980i.getReqQnty()) + getResources().getString(AbstractC5959j.extra_product_count_text));
        ImageView imageView = (ImageView) findViewById(AbstractC5955f.iv_grid_extra_product_img);
        String str = z.getWebHost() + this.f27980i.getImgPath();
        t.d("상품이미지 경로 - " + str);
        if (!N.isNull(this.f27980i.getImgPath())) {
            s.get().load(str).resize(imageView.getLayoutParams().width, imageView.getLayoutParams().height).into(imageView);
        }
        v0((ImageView) findViewById(AbstractC5955f.iv_grid_extra_product_receipt), this.f27980i.getAddSrvPrgSttCd());
        ((TextView) findViewById(AbstractC5955f.product_detail_receive_info)).setText(this.f27980i.getLeadMsgCont1());
        ((TextView) findViewById(AbstractC5955f.product_detail_return_info)).setText(this.f27980i.getLeadMsgCont2());
        ((TextView) findViewById(AbstractC5955f.tv_reservationId)).setText(this.f27980i.getAddSrvReqNo());
        ((TextView) findViewById(AbstractC5955f.tv_reservationDate)).setText(C6634h.convertFormat(this.f27980i.getReqDt(), "yyyyMMdd", "yyyy년 MM월 dd일"));
        ((TextView) findViewById(AbstractC5955f.tv_originalPrice)).setText(N.getInteger(this.f27980i.getAddSrvUtlAmt()) + getResources().getString(AbstractC5959j.ticket_basket_won));
        int integer = N.getInteger(this.f27980i.getAddSrvPrgSttCd());
        t.d("receiptType - " + integer);
        t.d("(mAddSrvInfo.getAddSrvPrgSttCd() - " + this.f27980i.getAddSrvPrgSttCd());
        if (integer == 5 || integer == 9) {
            ((Button) findViewById(AbstractC5955f.returnBtn)).setEnabled(false);
        }
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, android.view.View.OnClickListener
    public void onClick(View view) {
        if (AbstractC5955f.returnBtn == view.getId()) {
            t0();
        } else {
            super.onClick(view);
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_extra_product_detail);
        w0();
        y0();
        x0();
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, android.app.Activity
    protected void onPause() {
        super.onPause();
        this.f29352h.sendEmptyMessage(1);
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        super.onReceive(iBaseDao);
        if (AbstractC5955f.dao_additional_service == iBaseDao.getId()) {
            C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.ticket_handling_return_refund_complete)).setContent(getString(AbstractC5959j.ticket_handling_return_extra_product_complete)).setButtonListener(new DialogInterface.OnClickListener() { // from class: e5.a
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    this.f30460a.u0(dialogInterface, i8);
                }
            }).showDialog();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, android.app.Activity
    protected void onResume() {
        super.onResume();
        this.f29352h.sendEmptyMessageDelayed(0, 1000L);
    }
}
