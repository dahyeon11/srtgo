package com.korail.talk.ui.stbk;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import androidx.recyclerview.widget.GridLayoutManager;
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
import n4.AbstractC5954e;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import org.json.JSONException;
import org.json.JSONObject;
import p6.C6062d;
import r4.g;
import v4.c;
import z4.C6630d;
import z4.N;
import z4.t;

/* loaded from: classes.dex */
public class StbkUnRegisterAccountListActivity extends BaseViewActivity {

    /* renamed from: i, reason: collision with root package name */
    private StbkData f28886i;

    /* renamed from: j, reason: collision with root package name */
    private int f28887j;

    /* renamed from: k, reason: collision with root package name */
    private List f28888k;

    /* renamed from: l, reason: collision with root package name */
    private Button f28889l;

    /* renamed from: m, reason: collision with root package name */
    private b f28890m;

    class a extends GridLayoutManager.c {
        a() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int getSpanSize(int i8) {
            return StbkUnRegisterAccountListActivity.this.f28890m.c(i8) instanceof StbkRegBankDao.RegPsb ? 1 : 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public class b extends RecyclerView.h {

        /* renamed from: d, reason: collision with root package name */
        private final int f28892d;

        /* renamed from: e, reason: collision with root package name */
        private final int f28893e;

        public class a extends C0254b {

            /* renamed from: u, reason: collision with root package name */
            private View f28895u;

            /* renamed from: v, reason: collision with root package name */
            private ImageView f28896v;

            public a(View view) {
                super(b.this, view, null);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void H(View view, int i8) {
                if (i8 > 0) {
                    StbkUnRegisterAccountListActivity.this.f28889l.setEnabled(true);
                    StbkUnRegisterAccountListActivity.this.f28887j = i8;
                    b.this.notifyDataSetChanged();
                }
            }

            @Override // com.korail.talk.ui.stbk.StbkUnRegisterAccountListActivity.b.C0254b
            public void setEventListener(int i8) {
                super.setEventListener(i8);
                this.f28896v.setOnClickListener(new v4.c(new c.a() { // from class: Z5.e
                    @Override // v4.c.a
                    public final void onCustomClick(View view, int i9) {
                        this.f5748a.H(view, i9);
                    }
                }, i8));
            }

            @Override // com.korail.talk.ui.stbk.StbkUnRegisterAccountListActivity.b.C0254b
            public void setView(int i8) {
                super.setView(i8);
                StbkRegBankDao.RegPsb regPsb = (StbkRegBankDao.RegPsb) b.this.c(i8);
                this.f28896v = (ImageView) this.itemView.findViewById(AbstractC5955f.iv_list_item_unregister_account_bank);
                View viewFindViewById = this.itemView.findViewById(AbstractC5955f.v_list_item_unregister_account_bank);
                this.f28895u = viewFindViewById;
                viewFindViewById.setBackgroundResource(StbkUnRegisterAccountListActivity.this.f28887j == i8 ? AbstractC5954e.selector_btn_stroke_ocean_no_press : AbstractC5954e.selector_btn_stroke_gray_no_press);
                s.get().load(regPsb.getImageUrl()).resize(N.dpToPx(150.0f), N.dpToPx(30.0f)).networkPolicy(p.NO_CACHE, p.NO_STORE).into(this.f28896v);
            }
        }

        /* renamed from: com.korail.talk.ui.stbk.StbkUnRegisterAccountListActivity$b$b, reason: collision with other inner class name */
        public class C0254b extends RecyclerView.E {
            /* synthetic */ C0254b(b bVar, View view, a aVar) {
                this(view);
            }

            public void setEventListener(int i8) {
            }

            public void setText(int i8) {
            }

            public void setView(int i8) {
            }

            private C0254b(View view) {
                super(view);
            }
        }

        private b() {
            this.f28892d = 0;
            this.f28893e = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object c(int i8) {
            return StbkUnRegisterAccountListActivity.this.f28888k.get(i8);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemCount() {
            if (C6630d.isNull(StbkUnRegisterAccountListActivity.this.f28888k)) {
                return 0;
            }
            return StbkUnRegisterAccountListActivity.this.f28888k.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemViewType(int i8) {
            return c(i8) instanceof StbkRegBankDao.RegPsb ? 1 : 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public void onBindViewHolder(C0254b c0254b, int i8) {
            c0254b.setView(i8);
            c0254b.setText(i8);
            c0254b.setEventListener(i8);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public C0254b onCreateViewHolder(ViewGroup viewGroup, int i8) {
            return i8 == 0 ? new C0254b(this, LayoutInflater.from(StbkUnRegisterAccountListActivity.this.getApplicationContext()).inflate(AbstractC5957h.list_item_unregister_account_list_title, viewGroup, false), null) : new a(LayoutInflater.from(StbkUnRegisterAccountListActivity.this.getApplicationContext()).inflate(AbstractC5957h.list_item_unregister_account_list_bank, viewGroup, false));
        }

        /* synthetic */ b(StbkUnRegisterAccountListActivity stbkUnRegisterAccountListActivity, a aVar) {
            this();
        }
    }

    private void A0() {
        n0(false);
        this.f28889l = (Button) findViewById(AbstractC5955f.btn_unregister_account_next);
        RecyclerView recyclerView = (RecyclerView) findViewById(AbstractC5955f.rv_register_account);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getApplicationContext(), 2);
        gridLayoutManager.setSpanSizeLookup(new a());
        recyclerView.setLayoutManager(gridLayoutManager);
        b bVar = new b(this, null);
        this.f28890m = bVar;
        recyclerView.setAdapter(bVar);
        recyclerView.addItemDecoration(new C6062d());
    }

    private void setText() {
        setAppTitle(AbstractC5959j.common_register_account);
    }

    private void x0() {
        StbkRegBankDao stbkRegBankDao = new StbkRegBankDao();
        stbkRegBankDao.setRequest(new BaseRequest());
        executeDao(stbkRegBankDao);
    }

    private void y0() {
        this.f28886i = (StbkData) getIntent().getSerializableExtra("STBK_DATA");
        this.f28888k = new ArrayList();
    }

    private void z0() {
        this.f28889l.setOnClickListener(this);
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i8, int i9, Intent intent) {
        super.onActivityResult(i8, i9, intent);
        if (16 == i9 && 120 == i8 && intent.hasExtra("IDENTITY_VERIFICATION_SUCCESS")) {
            try {
                JSONObject jSONObject = new JSONObject(intent.getStringExtra("IDENTITY_VERIFICATION_SUCCESS"));
                StbkRegBankDao.RegPsb regPsb = (StbkRegBankDao.RegPsb) this.f28888k.get(this.f28887j);
                this.f28886i.setPhoneNumber(jSONObject.optString("phoneNumber"));
                this.f28886i.setStlBankCd(regPsb.getStlBankCd());
                this.f28886i.setImageUrl(regPsb.getImageUrl());
                Intent intent2 = new Intent(getApplicationContext(), (Class<?>) StbkRegisterAccountActivity.class);
                intent2.putExtra("STBK_DATA", this.f28886i);
                startActivity(intent2);
            } catch (JSONException e8) {
                t.e(e8.getMessage());
            }
        }
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, android.view.View.OnClickListener
    public void onClick(View view) {
        if (AbstractC5955f.btn_unregister_account_next != view.getId()) {
            super.onClick(view);
            return;
        }
        Intent intent = new Intent(getApplicationContext(), (Class<?>) IntegrationWebViewActivity.class);
        intent.putExtra("WEB_POST_URL", g.IDENTITY_VERIFICATION_URL);
        startActivityForResult(intent, 120);
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_stbk_unregister_account_activity);
        if (C6630d.isNull(bundle)) {
            y0();
            A0();
            setText();
            z0();
            x0();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        super.onReceive(iBaseDao);
        if (AbstractC5955f.dao_stbk_reg_bank == iBaseDao.getId()) {
            StbkRegBankDao.StbkRegBankResponse stbkRegBankResponse = (StbkRegBankDao.StbkRegBankResponse) iBaseDao.getResponse();
            this.f28888k.add(0, "");
            this.f28888k.addAll(stbkRegBankResponse.getRegPsbLists());
            this.f28890m.notifyDataSetChanged();
        }
    }
}
