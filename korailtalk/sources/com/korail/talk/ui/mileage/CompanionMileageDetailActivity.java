package com.korail.talk.ui.mileage;

import Q7.X;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.mileage.AcpnMlgSpecDao;
import com.korail.talk.network.dao.mileage.AcpnMlgSpecDao.AcpnMlgSpecRequest;
import com.korail.talk.view.base.BaseViewActivity;
import java.io.Serializable;
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
import z4.t;

/* loaded from: classes.dex */
public class CompanionMileageDetailActivity extends BaseViewActivity {

    /* renamed from: i, reason: collision with root package name */
    private List f28433i;

    /* renamed from: j, reason: collision with root package name */
    private String f28434j;

    /* renamed from: k, reason: collision with root package name */
    private ListView f28435k;

    /* renamed from: l, reason: collision with root package name */
    private b f28436l;

    private class b extends BaseAdapter implements c.a {

        /* renamed from: a, reason: collision with root package name */
        private final LayoutInflater f28437a;

        private class a {
            public Button mBtnLeft;
            public Button mBtnRight;
            public TextView mTvDetail;
            public TextView mTvTitle;

            private a() {
            }
        }

        public b() {
            this.f28437a = LayoutInflater.from(CompanionMileageDetailActivity.this.getApplicationContext());
        }

        @Override // android.widget.Adapter
        public int getCount() {
            if (C6630d.isNull(CompanionMileageDetailActivity.this.f28433i)) {
                return 0;
            }
            return CompanionMileageDetailActivity.this.f28433i.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i8) {
            return null;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i8) {
            return 0L;
        }

        @Override // android.widget.Adapter
        public View getView(int i8, View view, ViewGroup viewGroup) {
            a aVar;
            View viewInflate;
            String str;
            if (C6630d.isNull(view)) {
                aVar = new a();
                viewInflate = this.f28437a.inflate(AbstractC5957h.item_companion_mileage_detail, viewGroup, false);
                aVar.mTvTitle = (TextView) viewInflate.findViewById(AbstractC5955f.tv_title);
                aVar.mTvDetail = (TextView) viewInflate.findViewById(AbstractC5955f.tv_detail);
                aVar.mBtnLeft = (Button) viewInflate.findViewById(AbstractC5955f.btn_left);
                aVar.mBtnRight = (Button) viewInflate.findViewById(AbstractC5955f.btn_right);
                viewInflate.setTag(aVar);
            } else {
                aVar = (a) view.getTag();
                viewInflate = view;
            }
            List<AcpnMlgSpecDao.Jrny> jrnyList = ((AcpnMlgSpecDao.Ticket) CompanionMileageDetailActivity.this.f28433i.get(i8)).getJrnyList();
            aVar.mTvTitle.setText(jrnyList.get(0).getSeatList().get(0).getMlgSaveTgt());
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            int i9 = 1;
            if (((AcpnMlgSpecDao.Ticket) CompanionMileageDetailActivity.this.f28433i.get(i8)).getJrnyList().size() > 1) {
                str = CompanionMileageDetailActivity.this.getString(AbstractC5959j.common_transfer_1) + X.SPACE;
            } else {
                str = "";
            }
            sb.append(str);
            sb.append(((AcpnMlgSpecDao.Ticket) CompanionMileageDetailActivity.this.f28433i.get(i8)).getJrnyList().get(0).getPsrmClNm());
            sb.append(" | ");
            sb.append(((AcpnMlgSpecDao.Ticket) CompanionMileageDetailActivity.this.f28433i.get(i8)).getJrnyList().get(0).getSeatList().get(0).getPsgTpDvNm());
            Iterator<AcpnMlgSpecDao.Jrny> it = jrnyList.iterator();
            int i10 = 0;
            int i11 = 0;
            while (it.hasNext()) {
                List<AcpnMlgSpecDao.Seat> seatList = it.next().getSeatList();
                Iterator<AcpnMlgSpecDao.Seat> it2 = seatList.iterator();
                while (it2.hasNext()) {
                    AcpnMlgSpecDao.Seat next = it2.next();
                    Iterator<AcpnMlgSpecDao.Jrny> it3 = it;
                    Iterator<AcpnMlgSpecDao.Seat> it4 = it2;
                    sb2.append(CompanionMileageDetailActivity.this.getString(AbstractC5959j.common_s_seat, N.getDecimalFormatString(next.getScarNo()), next.getSeatSpec()));
                    i10++;
                    if (i10 < seatList.size()) {
                        sb2.append(", ");
                    }
                    it = it3;
                    it2 = it4;
                    i9 = 1;
                }
                Iterator<AcpnMlgSpecDao.Jrny> it5 = it;
                i11 += i9;
                if (jrnyList.size() == 2 && i11 == i9) {
                    sb2.append(", ");
                }
                it = it5;
            }
            TextView textView = aVar.mTvDetail;
            sb.append(" | ");
            sb.append((CharSequence) sb2);
            textView.setText(sb);
            if ("Y".equals(((AcpnMlgSpecDao.Ticket) CompanionMileageDetailActivity.this.f28433i.get(i8)).getJrnyList().get(0).getSeatList().get(0).getMlgSaveFlg())) {
                aVar.mBtnLeft.setVisibility(0);
                aVar.mBtnRight.setVisibility(0);
                aVar.mBtnLeft.setOnClickListener(new c(this, i8));
                aVar.mBtnRight.setOnClickListener(new c(this, i8));
            } else {
                aVar.mBtnLeft.setVisibility(8);
                aVar.mBtnRight.setVisibility(8);
            }
            return viewInflate;
        }

        @Override // v4.c.a
        public void onCustomClick(View view, int i8) {
            int id = view.getId();
            t.d("id :  " + id);
            if (AbstractC5955f.btn_left == id) {
                Intent intent = new Intent(CompanionMileageDetailActivity.this.getApplicationContext(), (Class<?>) CompanionMileageRequestActivity.class);
                intent.putExtra("COMPANION_MILEAGE_DATA", (Serializable) CompanionMileageDetailActivity.this.f28433i.get(i8));
                CompanionMileageDetailActivity.this.startActivityForResult(intent, 130);
            } else if (AbstractC5955f.btn_right == id) {
                Intent intent2 = new Intent(CompanionMileageDetailActivity.this.getApplicationContext(), (Class<?>) CompanionMileageInformActivity.class);
                intent2.putExtra("COMPANION_MILEAGE_DATA", (Serializable) CompanionMileageDetailActivity.this.f28433i.get(i8));
                CompanionMileageDetailActivity.this.startActivityForResult(intent2, 130);
            }
        }
    }

    private void setText() {
        setAppTitle(AbstractC5959j.title_accumulating_ktx_mileage_detail);
    }

    private void t0() {
        this.f28433i.clear();
        b bVar = this.f28436l;
        if (bVar != null) {
            bVar.notifyDataSetChanged();
        }
    }

    private void u0() {
        AcpnMlgSpecDao acpnMlgSpecDao = new AcpnMlgSpecDao();
        AcpnMlgSpecDao.AcpnMlgSpecRequest acpnMlgSpecRequest = acpnMlgSpecDao.new AcpnMlgSpecRequest();
        acpnMlgSpecRequest.setPnrNo(this.f28434j);
        acpnMlgSpecDao.setRequest(acpnMlgSpecRequest);
        executeDao(acpnMlgSpecDao);
    }

    private void v0() {
        this.f28433i = new ArrayList();
        this.f28434j = getIntent().getStringExtra("TICKET_PNR_NUMBER");
    }

    private void w0() {
        findViewById(AbstractC5955f.btn_companion_mileage_deatail_confirm).setOnClickListener(this);
    }

    private void x0() {
        n0(false);
        this.f28435k = (ListView) findViewById(AbstractC5955f.lv_companion_mileage_detail);
        this.f28435k.addFooterView(getLayoutInflater().inflate(AbstractC5957h.companion_mileage_detail_list_footer, (ViewGroup) null, false));
        b bVar = new b();
        this.f28436l = bVar;
        this.f28435k.setAdapter((ListAdapter) bVar);
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i8, int i9, Intent intent) {
        super.onActivityResult(i8, i9, intent);
        if (-1 == i9) {
            t0();
            u0();
        }
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, android.view.View.OnClickListener
    public void onClick(View view) {
        if (AbstractC5955f.btn_companion_mileage_deatail_confirm == view.getId()) {
            finish();
        } else {
            super.onClick(view);
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    public void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_companion_mileage_detail);
        if (C6630d.isNull(bundle)) {
            v0();
            x0();
            setText();
            w0();
            u0();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        super.onReceive(iBaseDao);
        if (AbstractC5955f.dao_acpn_mlg_spec == iBaseDao.getId()) {
            this.f28433i.addAll(((AcpnMlgSpecDao.AcpnMlgSpecResponse) iBaseDao.getResponse()).getTkList());
            this.f28436l.notifyDataSetChanged();
        }
    }
}
