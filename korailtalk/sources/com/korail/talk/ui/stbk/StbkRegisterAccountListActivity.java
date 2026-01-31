package com.korail.talk.ui.stbk;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.korail.talk.data.StbkData;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.pay.StbkRegBankDao;
import com.korail.talk.ui.web.IntegrationWebViewActivity;
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
import r4.g;
import v4.c;
import z4.C6630d;
import z4.N;

/* loaded from: classes.dex */
public class StbkRegisterAccountListActivity extends BaseViewActivity {

    /* renamed from: i, reason: collision with root package name */
    private StbkData f28874i;

    /* renamed from: j, reason: collision with root package name */
    private List f28875j;

    /* renamed from: k, reason: collision with root package name */
    private int f28876k;

    /* renamed from: l, reason: collision with root package name */
    private b f28877l;

    /* JADX INFO: Access modifiers changed from: private */
    class b extends RecyclerView.h {

        /* renamed from: d, reason: collision with root package name */
        private final int f28878d;

        /* renamed from: e, reason: collision with root package name */
        private final int f28879e;

        /* renamed from: f, reason: collision with root package name */
        private final int f28880f;

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
        /* renamed from: com.korail.talk.ui.stbk.StbkRegisterAccountListActivity$b$b, reason: collision with other inner class name */
        class C0253b extends a {
            public ImageView mIv;
            public TextView mTvAccount;
            public TextView mTvChangePassword;
            public TextView mTvDeleteAccount;
            public TextView mTvMsg;

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void I(View view, int i8) {
                StbkRegisterAccountListActivity.this.f28876k = i8;
                StbkRegisterAccountListActivity.this.f28874i.setStlBankCd(((StbkRegBankDao.Reg) StbkRegisterAccountListActivity.this.f28875j.get(StbkRegisterAccountListActivity.this.f28876k)).getStlBankCd());
                Intent intent = new Intent(StbkRegisterAccountListActivity.this.getApplicationContext(), (Class<?>) StbkPasswordEnterActivity.class);
                intent.putExtra("STBK_DATA", StbkRegisterAccountListActivity.this.f28874i);
                StbkRegisterAccountListActivity.this.startActivityForResult(intent, 121);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void J(View view, int i8) {
                StbkRegisterAccountListActivity.this.f28876k = i8;
                StbkRegisterAccountListActivity.this.f28874i.setStlBankCd(((StbkRegBankDao.Reg) StbkRegisterAccountListActivity.this.f28875j.get(StbkRegisterAccountListActivity.this.f28876k)).getStlBankCd());
                StbkRegisterAccountListActivity.this.f28874i.setSubType(3);
                Intent intent = new Intent(StbkRegisterAccountListActivity.this.getApplicationContext(), (Class<?>) IntegrationWebViewActivity.class);
                intent.putExtra("WEB_POST_URL", g.IDENTITY_VERIFICATION_URL);
                StbkRegisterAccountListActivity.this.startActivityForResult(intent, 120);
            }

            @Override // com.korail.talk.ui.stbk.StbkRegisterAccountListActivity.b.a
            public void setEventListener(int i8) {
                super.setEventListener(i8);
                this.mTvDeleteAccount.setOnClickListener(new v4.c(new c.a() { // from class: com.korail.talk.ui.stbk.c
                    @Override // v4.c.a
                    public final void onCustomClick(View view, int i9) {
                        this.f28902a.I(view, i9);
                    }
                }, i8));
                this.mTvChangePassword.setOnClickListener(new v4.c(new c.a() { // from class: com.korail.talk.ui.stbk.d
                    @Override // v4.c.a
                    public final void onCustomClick(View view, int i9) {
                        this.f28903a.J(view, i9);
                    }
                }, i8));
            }

            @Override // com.korail.talk.ui.stbk.StbkRegisterAccountListActivity.b.a
            public void setImage(int i8) {
                super.setImage(i8);
                s.get().load(((StbkRegBankDao.Reg) b.this.c(i8)).getImageUrl()).resize(N.dpToPx(150.0f), N.dpToPx(30.0f)).networkPolicy(p.NO_CACHE, p.NO_STORE).into(this.mIv);
            }

            @Override // com.korail.talk.ui.stbk.StbkRegisterAccountListActivity.b.a
            public void setText(int i8) {
                super.setText(i8);
                StbkRegBankDao.Reg reg = (StbkRegBankDao.Reg) b.this.c(i8);
                this.mTvAccount.setText(reg.getAcntNo());
                String pwdErrMsg = reg.getPwdErrMsg();
                this.mTvMsg.setVisibility(N.isNull(pwdErrMsg) ? 8 : 0);
                this.mTvMsg.setText(pwdErrMsg);
            }

            @Override // com.korail.talk.ui.stbk.StbkRegisterAccountListActivity.b.a
            public void setView(int i8) {
                super.setView(i8);
                this.mIv = (ImageView) this.itemView.findViewById(AbstractC5955f.iv_list_item_register_account_list_default_bank);
                this.mTvAccount = (TextView) this.itemView.findViewById(AbstractC5955f.tv_list_item_register_account_list_default_account);
                this.mTvMsg = (TextView) this.itemView.findViewById(AbstractC5955f.tv_list_item_register_account_list_default_msg);
                this.mTvDeleteAccount = (TextView) this.itemView.findViewById(AbstractC5955f.tv_list_item_register_account_list_default_delete_account);
                this.mTvChangePassword = (TextView) this.itemView.findViewById(AbstractC5955f.tv_list_item_register_account_list_default_change_password);
            }

            private C0253b(View view) {
                super(view);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        class c extends a {
            public ImageView mIv;
            public TextView mTvAccount;
            public TextView mTvMsg;
            public TextView mTvPayment;

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void H(View view, int i8) {
                StbkRegisterAccountListActivity.this.f28876k = i8;
                StbkRegisterAccountListActivity.this.f28874i.setStlBankCd(((StbkRegBankDao.Reg) StbkRegisterAccountListActivity.this.f28875j.get(StbkRegisterAccountListActivity.this.f28876k)).getStlBankCd());
                Intent intent = new Intent(StbkRegisterAccountListActivity.this.getApplicationContext(), (Class<?>) StbkPasswordEnterActivity.class);
                intent.putExtra("STBK_DATA", StbkRegisterAccountListActivity.this.f28874i);
                StbkRegisterAccountListActivity.this.startActivityForResult(intent, 121);
            }

            @Override // com.korail.talk.ui.stbk.StbkRegisterAccountListActivity.b.a
            public void setEventListener(int i8) {
                super.setEventListener(i8);
                this.mTvPayment.setEnabled("Y".equals(((StbkRegBankDao.Reg) b.this.c(i8)).getIsPay()));
                this.mTvPayment.setOnClickListener(new v4.c(new c.a() { // from class: com.korail.talk.ui.stbk.e
                    @Override // v4.c.a
                    public final void onCustomClick(View view, int i9) {
                        this.f28904a.H(view, i9);
                    }
                }, i8));
            }

            @Override // com.korail.talk.ui.stbk.StbkRegisterAccountListActivity.b.a
            public void setImage(int i8) {
                super.setImage(i8);
                s.get().load(((StbkRegBankDao.Reg) b.this.c(i8)).getImageUrl()).resize(N.dpToPx(150.0f), N.dpToPx(30.0f)).networkPolicy(p.NO_CACHE, p.NO_STORE).into(this.mIv);
            }

            @Override // com.korail.talk.ui.stbk.StbkRegisterAccountListActivity.b.a
            public void setText(int i8) {
                super.setText(i8);
                StbkRegBankDao.Reg reg = (StbkRegBankDao.Reg) b.this.c(i8);
                this.mTvAccount.setText(reg.getAcntNo());
                String pwdErrMsg = reg.getPwdErrMsg();
                this.mTvMsg.setVisibility(N.isNull(pwdErrMsg) ? 8 : 0);
                this.mTvMsg.setText(pwdErrMsg);
            }

            @Override // com.korail.talk.ui.stbk.StbkRegisterAccountListActivity.b.a
            public void setView(int i8) {
                super.setView(i8);
                this.mIv = (ImageView) this.itemView.findViewById(AbstractC5955f.iv_list_item_register_account_list_payment_bank);
                this.mTvAccount = (TextView) this.itemView.findViewById(AbstractC5955f.tv_list_item_register_account_list_payment_account);
                this.mTvMsg = (TextView) this.itemView.findViewById(AbstractC5955f.tv_list_item_register_account_list_payment_msg);
                this.mTvPayment = (TextView) this.itemView.findViewById(AbstractC5955f.tv_list_item_register_account_list_payment);
            }

            private c(View view) {
                super(view);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        class d extends a {
            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void H(View view) {
                StbkRegisterAccountListActivity.this.f28874i.setSubType(2);
                Intent intent = new Intent(StbkRegisterAccountListActivity.this.getApplicationContext(), (Class<?>) StbkAcceptTermsActivity.class);
                intent.putExtra("STBK_DATA", StbkRegisterAccountListActivity.this.f28874i);
                StbkRegisterAccountListActivity.this.startActivity(intent);
            }

            @Override // com.korail.talk.ui.stbk.StbkRegisterAccountListActivity.b.a
            public void setEventListener(int i8) {
                super.setEventListener(i8);
                this.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.korail.talk.ui.stbk.f
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f28905a.H(view);
                    }
                });
            }

            private d(View view) {
                super(view);
            }
        }

        private b() {
            this.f28878d = 0;
            this.f28879e = 1;
            this.f28880f = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object c(int i8) {
            return StbkRegisterAccountListActivity.this.f28875j.get(i8);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemCount() {
            return StbkRegisterAccountListActivity.this.f28875j.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemViewType(int i8) {
            if (c(i8) instanceof StbkRegBankDao.Reg) {
                return StbkRegisterAccountListActivity.this.f28874i.getType() == 0 ? 1 : 2;
            }
            return 0;
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
            return i8 == 1 ? new C0253b(LayoutInflater.from(StbkRegisterAccountListActivity.this.getApplicationContext()).inflate(AbstractC5957h.list_item_stbk_register_account_list_default, viewGroup, false)) : 2 == i8 ? new c(LayoutInflater.from(StbkRegisterAccountListActivity.this.getApplicationContext()).inflate(AbstractC5957h.list_item_stbk_register_account_list_payment, viewGroup, false)) : new d(LayoutInflater.from(StbkRegisterAccountListActivity.this.getApplicationContext()).inflate(AbstractC5957h.list_item_stbk_register_account_list_footer, viewGroup, false));
        }
    }

    private void setText() {
        setAppTitle(this.f28874i.getType() == 0 ? AbstractC5959j.title_stbk_simple_cash_payment : AbstractC5959j.title_stbk_select_account);
    }

    private void w0() {
        StbkRegBankDao stbkRegBankDao = new StbkRegBankDao();
        stbkRegBankDao.setRequest(new BaseRequest());
        executeDao(stbkRegBankDao);
    }

    private void x0() {
        this.f28874i = (StbkData) getIntent().getSerializableExtra("STBK_DATA");
        this.f28875j = new ArrayList();
    }

    private void y0() {
    }

    private void z0() {
        n0(false);
        RecyclerView recyclerView = (RecyclerView) findViewById(AbstractC5955f.rv_stbk_register_account_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        b bVar = new b();
        this.f28877l = bVar;
        recyclerView.setAdapter(bVar);
        recyclerView.addItemDecoration(new C6061c());
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i8, int i9, Intent intent) {
        super.onActivityResult(i8, i9, intent);
        if (-1 != i9) {
            if (16 == i9 && 120 == i8 && intent.hasExtra("IDENTITY_VERIFICATION_SUCCESS")) {
                Intent intent2 = new Intent(getApplicationContext(), (Class<?>) StbkPasswordRegisterActivity.class);
                intent2.putExtra("STBK_DATA", this.f28874i);
                startActivity(intent2);
                return;
            }
            return;
        }
        if (121 == i8 && intent.hasExtra("STBK_DATA")) {
            StbkData stbkData = (StbkData) intent.getSerializableExtra("STBK_DATA");
            if (stbkData.getType() == 0) {
                setIntent(intent);
                x0();
                w0();
            } else if (1 == stbkData.getType()) {
                Intent intent3 = new Intent("android.intent.action.VIEW");
                intent3.addFlags(603979776);
                intent3.setData(Uri.parse(getString(AbstractC5959j.payment_scheme, "stbk", stbkData.getStlBankCd(), stbkData.getPassword())));
                startActivity(intent3);
            }
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_stbk_register_account_list);
        if (C6630d.isNull(bundle)) {
            x0();
            z0();
            setText();
            y0();
            w0();
        }
    }

    @Override // androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        x0();
        w0();
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        super.onReceive(iBaseDao);
        if (AbstractC5955f.dao_stbk_reg_bank == iBaseDao.getId()) {
            this.f28875j.addAll(((StbkRegBankDao.StbkRegBankResponse) iBaseDao.getResponse()).getRegList());
            this.f28875j.add("FOOTER");
            this.f28877l.notifyDataSetChanged();
        }
    }
}
