package com.korail.talk.ui.ticket.history;

import I4.h;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.ticket.RecentDeliveryHistoryDao;
import com.korail.talk.network.dao.ticket.RecentDeliveryHistoryDao.RcntDlvHstRequest;
import com.korail.talk.view.base.BaseViewActivity;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import v4.C6432b;
import z4.C6630d;

/* loaded from: classes.dex */
public class TicketDeliveryHistoryActivity extends BaseViewActivity {

    /* renamed from: i */
    private Button f29054i;

    /* renamed from: j */
    private b f29055j;

    private class b extends BaseAdapter implements C6432b.a {

        /* renamed from: a */
        private final LayoutInflater f29056a;

        /* renamed from: b */
        private int f29057b;

        /* renamed from: c */
        private List f29058c;

        private class a {

            /* renamed from: a */
            private CheckBox f29060a;
            public TextView mTvDeliveryInfo;
            public TextView mTvDeliveryName;

            private a() {
            }

            /* synthetic */ a(b bVar, a aVar) {
                this();
            }
        }

        /* synthetic */ b(TicketDeliveryHistoryActivity ticketDeliveryHistoryActivity, a aVar) {
            this();
        }

        public int d() {
            return this.f29057b;
        }

        public void e(List list) {
            this.f29058c = list;
            this.f29057b = -1;
        }

        public void f(int i8) {
            this.f29057b = i8;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            if (C6630d.isNull(this.f29058c)) {
                return 0;
            }
            return this.f29058c.size();
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
                viewInflate = this.f29056a.inflate(AbstractC5957h.list_item_delivery_history, viewGroup, false);
                aVar.f29060a = (CheckBox) viewInflate.findViewById(AbstractC5955f.cb_item_delivery_history);
                aVar.mTvDeliveryName = (TextView) viewInflate.findViewById(AbstractC5955f.tv_delivery_history_name);
                aVar.mTvDeliveryInfo = (TextView) viewInflate.findViewById(AbstractC5955f.tv_delivery_history_info);
                viewInflate.setTag(aVar);
            } else {
                viewInflate = view;
                aVar = (a) view.getTag();
            }
            RecentDeliveryHistoryDao.Acep item = getItem(i8);
            aVar.f29060a.setOnCheckedChangeListener(null);
            aVar.f29060a.setChecked(this.f29057b == i8);
            aVar.mTvDeliveryName.setText(item.getAcepCustNm());
            StringBuilder sb = new StringBuilder();
            if ("N".equals(item.getAcepCustMgFlg())) {
                sb.append(TicketDeliveryHistoryActivity.this.getString(AbstractC5959j.title_non_member));
                sb.append(", ");
            } else {
                sb.append(item.getMbCrdNo());
                sb.append(", ");
            }
            sb.append(item.getAcepCustTeln2());
            aVar.mTvDeliveryInfo.setText(sb.toString());
            aVar.f29060a.setOnCheckedChangeListener(new C6432b(this, i8));
            return viewInflate;
        }

        @Override // v4.C6432b.a
        public void onCustomCheckedChanged(CompoundButton compoundButton, boolean z8, int i8) {
            if (z8) {
                this.f29057b = i8;
            } else {
                this.f29057b = -1;
            }
            TicketDeliveryHistoryActivity.this.f29054i.setEnabled(z8);
            notifyDataSetChanged();
        }

        private b() {
            this.f29056a = TicketDeliveryHistoryActivity.this.getLayoutInflater();
        }

        @Override // android.widget.Adapter
        public RecentDeliveryHistoryDao.Acep getItem(int i8) {
            return (RecentDeliveryHistoryDao.Acep) this.f29058c.get(i8);
        }
    }

    private void setText() {
        setAppTitle(AbstractC5959j.title_ticket_delivery_history);
    }

    private void t0(String str) {
        RecentDeliveryHistoryDao recentDeliveryHistoryDao = new RecentDeliveryHistoryDao();
        RecentDeliveryHistoryDao.RcntDlvHstRequest rcntDlvHstRequest = recentDeliveryHistoryDao.new RcntDlvHstRequest();
        rcntDlvHstRequest.setCustMgNo(str);
        recentDeliveryHistoryDao.setRequest(rcntDlvHstRequest);
        recentDeliveryHistoryDao.setFinishView(true);
        executeDao(recentDeliveryHistoryDao);
    }

    private void u0() {
    }

    private void v0() {
        this.f29054i.setOnClickListener(this);
    }

    private void w0() {
        l0();
        this.f29055j = new b();
        ListView listView = (ListView) findViewById(AbstractC5955f.lv_delivery_history);
        listView.setEmptyView(findViewById(AbstractC5955f.tv_delivery_history_empty));
        listView.setAdapter((ListAdapter) this.f29055j);
        listView.getEmptyView().setVisibility(8);
        this.f29054i = (Button) findViewById(AbstractC5955f.btn_confirm);
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() != AbstractC5955f.btn_confirm) {
            super.onClick(view);
            return;
        }
        int iD = this.f29055j.d();
        Intent intent = new Intent();
        intent.putExtra("DELIVERY_HISTORY_DATA", this.f29055j.getItem(iD));
        setResult(-1, intent);
        finish();
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_ticket_delivery_history);
        if (C6630d.isNull(bundle)) {
            u0();
            w0();
            setText();
            v0();
            t0(h.getInstance().getCustNo());
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        super.onReceive(iBaseDao);
        if (AbstractC5955f.dao_recent_delivery_history == iBaseDao.getId()) {
            RecentDeliveryHistoryDao.RcntDlvHstResponse rcntDlvHstResponse = (RecentDeliveryHistoryDao.RcntDlvHstResponse) iBaseDao.getResponse();
            this.f29055j.f(-1);
            this.f29055j.e(rcntDlvHstResponse.getAcepList());
            this.f29055j.notifyDataSetChanged();
        }
    }
}
