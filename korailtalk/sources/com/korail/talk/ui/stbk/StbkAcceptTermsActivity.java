package com.korail.talk.ui.stbk;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.korail.talk.data.StbkData;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.common.CommonCodeDao;
import com.korail.talk.network.dao.common.CommonCodeDao.CommonCodeRequest;
import com.korail.talk.ui.web.IntegrationWebViewActivity;
import com.korail.talk.view.base.BaseViewActivity;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import v4.c;
import z4.C6630d;
import z4.N;

/* loaded from: classes.dex */
public class StbkAcceptTermsActivity extends BaseViewActivity {

    /* renamed from: i, reason: collision with root package name */
    private StbkData f28823i;

    /* renamed from: j, reason: collision with root package name */
    private List f28824j;

    /* renamed from: k, reason: collision with root package name */
    private ArrayList f28825k;

    /* renamed from: l, reason: collision with root package name */
    private ListView f28826l;

    /* renamed from: m, reason: collision with root package name */
    private b f28827m;

    /* renamed from: n, reason: collision with root package name */
    private CheckBox f28828n;

    /* renamed from: o, reason: collision with root package name */
    private Button f28829o;

    /* JADX INFO: Access modifiers changed from: private */
    class b extends BaseAdapter {

        /* renamed from: a, reason: collision with root package name */
        private final LayoutInflater f28830a;

        private class a {
            public Button mBtnDetail;
            public CheckBox mCb;

            private a() {
            }
        }

        public b() {
            this.f28830a = StbkAcceptTermsActivity.this.getLayoutInflater();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(View view, int i8) {
            boolean z8;
            boolean z9;
            StbkAcceptTermsActivity.this.f28825k.set(i8, Boolean.valueOf(((CheckBox) view).isChecked()));
            Iterator it = StbkAcceptTermsActivity.this.f28825k.iterator();
            while (true) {
                z8 = false;
                if (!it.hasNext()) {
                    z9 = true;
                    break;
                } else if (!((Boolean) it.next()).booleanValue()) {
                    z9 = false;
                    break;
                }
            }
            int i9 = 0;
            while (true) {
                if (i9 >= getCount()) {
                    z8 = true;
                    break;
                }
                Boolean bool = (Boolean) StbkAcceptTermsActivity.this.f28825k.get(i9);
                if ("Y".equals(getItem(i9).getIsCheck()) && !bool.booleanValue()) {
                    break;
                } else {
                    i9++;
                }
            }
            StbkAcceptTermsActivity.this.f28829o.setEnabled(z8);
            StbkAcceptTermsActivity.this.f28828n.setChecked(z9);
            notifyDataSetChanged();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(String str, View view, int i8) {
            if (N.isNotNull(str)) {
                Intent intent = new Intent(StbkAcceptTermsActivity.this.getApplicationContext(), (Class<?>) IntegrationWebViewActivity.class);
                intent.putExtra("WEB_POST_URL", str);
                StbkAcceptTermsActivity.this.startActivity(intent);
            }
        }

        @Override // android.widget.Adapter
        public int getCount() {
            if (C6630d.isNull(StbkAcceptTermsActivity.this.f28824j)) {
                return 0;
            }
            return StbkAcceptTermsActivity.this.f28824j.size();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i8) {
            return 0L;
        }

        @Override // android.widget.Adapter
        public View getView(int i8, View view, ViewGroup viewGroup) {
            View viewInflate;
            a aVar;
            if (C6630d.isNull(view)) {
                aVar = new a();
                viewInflate = this.f28830a.inflate(AbstractC5957h.list_item_simple_cash_accept_terms, viewGroup, false);
                aVar.mCb = (CheckBox) viewInflate.findViewById(AbstractC5955f.cb_list_item_simple_cash_accept_terms);
                aVar.mBtnDetail = (Button) viewInflate.findViewById(AbstractC5955f.btn_list_item_simple_cash_accept_terms);
                viewInflate.setTag(aVar);
            } else {
                viewInflate = view;
                aVar = (a) view.getTag();
            }
            String message = getItem(i8).getMessage();
            final String linkurl = getItem(i8).getLinkurl();
            aVar.mCb.setText(message);
            aVar.mCb.setChecked(StbkAcceptTermsActivity.this.f28825k.size() > 0 ? ((Boolean) StbkAcceptTermsActivity.this.f28825k.get(i8)).booleanValue() : false);
            aVar.mCb.setOnClickListener(new v4.c(new c.a() { // from class: com.korail.talk.ui.stbk.a
                @Override // v4.c.a
                public final void onCustomClick(View view2, int i9) {
                    this.f28899a.c(view2, i9);
                }
            }, i8));
            aVar.mBtnDetail.setOnClickListener(new v4.c(new c.a() { // from class: com.korail.talk.ui.stbk.b
                @Override // v4.c.a
                public final void onCustomClick(View view2, int i9) {
                    this.f28900a.d(linkurl, view2, i9);
                }
            }, i8));
            return viewInflate;
        }

        @Override // android.widget.Adapter
        public CommonCodeDao.Accept getItem(int i8) {
            return (CommonCodeDao.Accept) StbkAcceptTermsActivity.this.f28824j.get(i8);
        }
    }

    private void A0() {
        this.f28829o.setOnClickListener(this);
    }

    private void B0() {
        n0(false);
        this.f28826l = (ListView) findViewById(AbstractC5955f.lv_simple_cash_account_terms);
        View viewInflate = View.inflate(this, AbstractC5957h.list_item_simple_cash_accept_terms_header, null);
        CheckBox checkBox = (CheckBox) viewInflate.findViewById(AbstractC5955f.bc_list_item_simple_cash_accept_terms_header);
        this.f28828n = checkBox;
        checkBox.setOnClickListener(new View.OnClickListener() { // from class: Z5.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5744a.y0(view);
            }
        });
        this.f28826l.addHeaderView(viewInflate);
        b bVar = new b();
        this.f28827m = bVar;
        this.f28826l.setAdapter((ListAdapter) bVar);
        this.f28829o = (Button) findViewById(AbstractC5955f.btn_accept_terms_next);
    }

    private void setText() {
        setAppTitle(AbstractC5959j.common_accept_terms);
    }

    private void x0() {
        CommonCodeDao commonCodeDao = new CommonCodeDao();
        CommonCodeDao.CommonCodeRequest commonCodeRequest = commonCodeDao.new CommonCodeRequest();
        ArrayList arrayList = new ArrayList();
        arrayList.add(CommonCodeDao.STBK_ACCEPT);
        commonCodeRequest.setCodeList(arrayList);
        commonCodeDao.setRequest(commonCodeRequest);
        executeDao(commonCodeDao);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y0(View view) {
        boolean zIsChecked = ((CheckBox) view).isChecked();
        for (int i8 = 0; i8 < this.f28825k.size(); i8++) {
            this.f28825k.set(i8, Boolean.valueOf(zIsChecked));
        }
        this.f28829o.setEnabled(zIsChecked);
        this.f28827m.notifyDataSetChanged();
    }

    private void z0() {
        this.f28823i = (StbkData) getIntent().getSerializableExtra("STBK_DATA");
        this.f28825k = new ArrayList();
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, android.view.View.OnClickListener
    public void onClick(View view) {
        if (AbstractC5955f.btn_accept_terms_next != view.getId()) {
            super.onClick(view);
            return;
        }
        Intent intent = new Intent(getApplicationContext(), (Class<?>) StbkUnRegisterAccountListActivity.class);
        intent.putExtra("STBK_DATA", this.f28823i);
        startActivity(intent);
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_stbk_accept_terms);
        if (C6630d.isNull(bundle)) {
            z0();
            B0();
            setText();
            A0();
            x0();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        super.onReceive(iBaseDao);
        if (AbstractC5955f.dao_common_code == iBaseDao.getId()) {
            this.f28824j = ((CommonCodeDao.CommonCodeResponse) iBaseDao.getResponse()).getAccepts();
            this.f28827m.notifyDataSetChanged();
            this.f28825k.clear();
            for (CommonCodeDao.Accept accept : this.f28824j) {
                this.f28825k.add(Boolean.FALSE);
            }
        }
    }
}
