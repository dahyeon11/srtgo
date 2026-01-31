package com.korail.talk.ui.setting.tossAuto;

import Q7.X;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.pay.StbkAcntDao;
import com.korail.talk.network.dao.pay.TossAutoCreateDao;
import com.korail.talk.network.dao.pay.TossAutoStlKeyPrsDao;
import com.korail.talk.network.dao.pay.TossAutoStlKeyPrsDao.StlKeyPrsRequest;
import com.korail.talk.network.dao.pay.TossAutoStlKeyQryDao;
import com.korail.talk.network.dao.pay.TossAutoStlKeyQryDao.StlKeyQryRequest;
import com.korail.talk.ui.web.EasyPayWebViewActivity;
import com.korail.talk.view.base.BaseViewActivity;
import com.squareup.picasso.p;
import com.squareup.picasso.s;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import p6.C6061c;
import v4.c;
import z4.C6630d;
import z4.N;
import z4.t;

/* loaded from: classes.dex */
public class TossAutoSettingActivity extends BaseViewActivity {

    /* renamed from: i, reason: collision with root package name */
    private List f28816i;

    /* renamed from: j, reason: collision with root package name */
    private b f28817j;

    /* JADX INFO: Access modifiers changed from: private */
    class b extends RecyclerView.h {

        /* renamed from: d, reason: collision with root package name */
        private final int f28818d;

        private class a extends RecyclerView.E {
            public void setEventListener(int i8) {
            }

            public void setImage(int i8) {
            }

            public void setText(int i8) {
            }

            public void setView(int i8) {
            }

            private a(View view) {
                super(view);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.korail.talk.ui.setting.tossAuto.TossAutoSettingActivity$b$b, reason: collision with other inner class name */
        class C0252b extends a {
            public ImageView mIv;
            public TextView mTvAccount;
            public TextView mTvMsg;
            public TextView mTvPayment;

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void H(View view, int i8) {
                b bVar = b.this;
                TossAutoSettingActivity.this.v0((TossAutoStlKeyQryDao.SimplePayInfo) bVar.c(i8));
            }

            @Override // com.korail.talk.ui.setting.tossAuto.TossAutoSettingActivity.b.a
            public void setEventListener(int i8) {
                super.setEventListener(i8);
                this.mTvPayment.setOnClickListener(new c(new c.a() { // from class: com.korail.talk.ui.setting.tossAuto.a
                    @Override // v4.c.a
                    public final void onCustomClick(View view, int i9) {
                        this.f28822a.H(view, i9);
                    }
                }, i8));
            }

            @Override // com.korail.talk.ui.setting.tossAuto.TossAutoSettingActivity.b.a
            public void setImage(int i8) {
                super.setImage(i8);
                s.get().load(((TossAutoStlKeyQryDao.SimplePayInfo) b.this.c(i8)).getImageUrl()).resize(N.dpToPx(150.0f), N.dpToPx(30.0f)).networkPolicy(p.NO_CACHE, p.NO_STORE).into(this.mIv);
            }

            @Override // com.korail.talk.ui.setting.tossAuto.TossAutoSettingActivity.b.a
            public void setText(int i8) {
                super.setText(i8);
                TossAutoStlKeyQryDao.SimplePayInfo simplePayInfo = (TossAutoStlKeyQryDao.SimplePayInfo) b.this.c(i8);
                this.mTvAccount.setText(simplePayInfo.getStlBankNm() + X.SPACE + simplePayInfo.getAcntNo());
            }

            @Override // com.korail.talk.ui.setting.tossAuto.TossAutoSettingActivity.b.a
            public void setView(int i8) {
                super.setView(i8);
                this.mIv = (ImageView) this.itemView.findViewById(AbstractC5955f.iv_list_item_register_account_list_payment_bank);
                this.mTvAccount = (TextView) this.itemView.findViewById(AbstractC5955f.tv_list_item_register_account_list_payment_account);
                this.mTvMsg = (TextView) this.itemView.findViewById(AbstractC5955f.tv_list_item_register_account_list_payment_msg);
                this.mTvPayment = (TextView) this.itemView.findViewById(AbstractC5955f.tv_list_item_register_account_list_payment);
            }

            private C0252b(View view) {
                super(view);
            }
        }

        private b() {
            this.f28818d = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object c(int i8) {
            return TossAutoSettingActivity.this.f28816i.get(i8);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemCount() {
            return TossAutoSettingActivity.this.f28816i.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemViewType(int i8) {
            c(i8);
            return 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public void onBindViewHolder(a aVar, int i8) {
            aVar.setView(i8);
            aVar.setText(i8);
            aVar.setImage(i8);
            aVar.setEventListener(i8);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public a onCreateViewHolder(ViewGroup viewGroup, int i8) {
            return new C0252b(LayoutInflater.from(TossAutoSettingActivity.this.getApplicationContext()).inflate(AbstractC5957h.list_item_tosspay_auto_account, viewGroup, false));
        }
    }

    private void moveToWebView(String str) {
        Intent intent = new Intent(K(), (Class<?>) EasyPayWebViewActivity.class);
        intent.putExtra("WEB_GET_URL", str);
        startActivityForResult(intent, 131);
    }

    private void setText() {
        setAppTitle(AbstractC5959j.title_tosspay_auto_setting);
    }

    private void u0() {
        TossAutoCreateDao tossAutoCreateDao = new TossAutoCreateDao();
        tossAutoCreateDao.setRequest(new BaseRequest());
        executeDao(tossAutoCreateDao);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v0(TossAutoStlKeyQryDao.SimplePayInfo simplePayInfo) {
        TossAutoStlKeyPrsDao tossAutoStlKeyPrsDao = new TossAutoStlKeyPrsDao();
        TossAutoStlKeyPrsDao.StlKeyPrsRequest stlKeyPrsRequest = tossAutoStlKeyPrsDao.new StlKeyPrsRequest();
        stlKeyPrsRequest.setJobDvCd(StbkAcntDao.ACCOUNT_REGISTER);
        stlKeyPrsRequest.setSpayDvCd(simplePayInfo.getSpayDvCd());
        stlKeyPrsRequest.setSpayStlKeyVal(simplePayInfo.getSpayStlKeyVal());
        stlKeyPrsRequest.setStlBankCd(simplePayInfo.getStlBankCd());
        stlKeyPrsRequest.setAcntNo(simplePayInfo.getAcntNo());
        stlKeyPrsRequest.setBinNo(simplePayInfo.getBinNo());
        tossAutoStlKeyPrsDao.setRequest(stlKeyPrsRequest);
        executeDao(tossAutoStlKeyPrsDao);
    }

    private void w0() {
        TossAutoStlKeyQryDao tossAutoStlKeyQryDao = new TossAutoStlKeyQryDao();
        TossAutoStlKeyQryDao.StlKeyQryRequest stlKeyQryRequest = tossAutoStlKeyQryDao.new StlKeyQryRequest();
        stlKeyQryRequest.setSpayDvCd("12");
        tossAutoStlKeyQryDao.setRequest(stlKeyQryRequest);
        executeDao(tossAutoStlKeyQryDao);
    }

    private void x0() {
        this.f28816i = new ArrayList();
    }

    private void y0() {
        n0(false);
        RecyclerView recyclerView = (RecyclerView) findViewById(AbstractC5955f.rv_stbk_register_account_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        b bVar = new b();
        this.f28817j = bVar;
        recyclerView.setAdapter(bVar);
        recyclerView.addItemDecoration(new C6061c());
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i8, int i9, Intent intent) {
        super.onActivityResult(i8, i9, intent);
        if (i9 != 0) {
            w0();
        } else {
            t.d("RESULT_CANCELED");
            finish();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_stbk_register_account_list);
        if (C6630d.isNull(bundle)) {
            x0();
            y0();
            setText();
            w0();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        super.onReceive(iBaseDao);
        int id = iBaseDao.getId();
        if (AbstractC5955f.dao_stl_key_qry == id) {
            t.d("간편결제 빌링키 조회");
            TossAutoStlKeyQryDao.StlKeyQryResponse stlKeyQryResponse = (TossAutoStlKeyQryDao.StlKeyQryResponse) iBaseDao.getResponse();
            if (C6630d.isNotNull(stlKeyQryResponse.getSpayList()) && stlKeyQryResponse.getSpayList().size() == 0) {
                u0();
                return;
            }
            this.f28816i.clear();
            this.f28816i.addAll(stlKeyQryResponse.getSpayList());
            this.f28817j.notifyDataSetChanged();
            return;
        }
        if (AbstractC5955f.dao_toss_auto_c == id) {
            TossAutoCreateDao.TossAutoCResponse tossAutoCResponse = (TossAutoCreateDao.TossAutoCResponse) iBaseDao.getResponse();
            t.d("토스페이 자동결제 생성 : " + tossAutoCResponse.getCheckoutUri());
            moveToWebView(tossAutoCResponse.getCheckoutUri());
            return;
        }
        if (AbstractC5955f.dao_stl_key_prs == id) {
            t.d("빌링키 삭제");
            this.f28816i.clear();
            this.f28817j.notifyDataSetChanged();
            w0();
        }
    }
}
