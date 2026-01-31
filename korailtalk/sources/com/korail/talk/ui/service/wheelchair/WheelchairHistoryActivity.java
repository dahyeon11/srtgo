package com.korail.talk.ui.service.wheelchair;

import Q7.X;
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
import com.korail.talk.network.dao.addService.HelpSrvCustDao;
import com.korail.talk.network.dao.addService.HelpSrvCustDao.HelpSrvCustRequest;
import com.korail.talk.ui.ticket.confirm.TicketSelfCheckinStatusActivity;
import com.korail.talk.view.CButton;
import com.korail.talk.view.base.BaseViewActivity;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import v4.C6432b;
import v4.c;
import z4.C6630d;
import z4.t;

/* loaded from: classes.dex */
public class WheelchairHistoryActivity extends BaseViewActivity {

    /* renamed from: i, reason: collision with root package name */
    private Button f28682i;

    /* renamed from: j, reason: collision with root package name */
    private b f28683j;

    private class b extends BaseAdapter implements C6432b.a, c.a {

        /* renamed from: a, reason: collision with root package name */
        private final LayoutInflater f28684a;

        /* renamed from: b, reason: collision with root package name */
        private int f28685b;

        /* renamed from: c, reason: collision with root package name */
        private List f28686c;

        private class a {

            /* renamed from: a, reason: collision with root package name */
            private CheckBox f28688a;

            /* renamed from: b, reason: collision with root package name */
            private TextView f28689b;

            /* renamed from: c, reason: collision with root package name */
            private TextView f28690c;

            /* renamed from: d, reason: collision with root package name */
            private CButton f28691d;

            private a() {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int d() {
            return this.f28685b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e(List list) {
            this.f28686c = list;
            this.f28685b = -1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f(int i8) {
            this.f28685b = i8;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            if (C6630d.isNull(this.f28686c)) {
                return 0;
            }
            return this.f28686c.size();
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
                viewInflate = this.f28684a.inflate(AbstractC5957h.list_item_wheelchair_history, viewGroup, false);
                aVar.f28688a = (CheckBox) viewInflate.findViewById(AbstractC5955f.cb_item_wheelchair_history);
                aVar.f28689b = (TextView) viewInflate.findViewById(AbstractC5955f.list_item_wheelchair_history_type);
                aVar.f28690c = (TextView) viewInflate.findViewById(AbstractC5955f.list_item_wheelchair_history_user);
                aVar.f28691d = (CButton) viewInflate.findViewById(AbstractC5955f.list_item_wheelchair_history_delete);
                viewInflate.setTag(aVar);
            } else {
                viewInflate = view;
                aVar = (a) view.getTag();
            }
            HelpSrvCustDao.ReqSpec item = getItem(i8);
            aVar.f28688a.setOnCheckedChangeListener(null);
            aVar.f28688a.setChecked(this.f28685b == i8);
            aVar.f28689b.setText(TicketSelfCheckinStatusActivity.CHECKIN_STATUS_NOT_USE.equals(item.getAddRcpSrvCd()) ? AbstractC5959j.common_user2 : AbstractC5959j.common_companion);
            aVar.f28690c.setText(item.getCustNm() + ", " + item.getCustTeln());
            aVar.f28688a.setOnCheckedChangeListener(new C6432b(this, i8));
            aVar.f28691d.setOnClickListener(new c(this, i8));
            return viewInflate;
        }

        @Override // v4.C6432b.a
        public void onCustomCheckedChanged(CompoundButton compoundButton, boolean z8, int i8) {
            t.e(z8 + X.SPACE + i8);
            if (z8) {
                this.f28685b = i8;
            } else {
                this.f28685b = -1;
            }
            WheelchairHistoryActivity.this.f28682i.setEnabled(z8);
            notifyDataSetChanged();
        }

        @Override // v4.c.a
        public void onCustomClick(View view, int i8) {
            WheelchairHistoryActivity.this.v0(HelpSrvCustDao.HelpSrvCustRequest.f27549D, getItem(i8).getRcpSqno());
        }

        private b() {
            this.f28684a = WheelchairHistoryActivity.this.getLayoutInflater();
        }

        @Override // android.widget.Adapter
        public HelpSrvCustDao.ReqSpec getItem(int i8) {
            return (HelpSrvCustDao.ReqSpec) this.f28686c.get(i8);
        }
    }

    private void setText() {
        setAppTitle(AbstractC5959j.title_wheelchair_history);
    }

    private void u0(String str) {
        v0(str, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v0(String str, String str2) {
        HelpSrvCustDao helpSrvCustDao = new HelpSrvCustDao();
        HelpSrvCustDao.HelpSrvCustRequest helpSrvCustRequest = helpSrvCustDao.new HelpSrvCustRequest();
        helpSrvCustRequest.setQryDvCd(str);
        helpSrvCustRequest.setAddSrvDvCd("002");
        helpSrvCustRequest.setRcpSqno(str2);
        helpSrvCustDao.setRequest(helpSrvCustRequest);
        executeDao(helpSrvCustDao);
    }

    private void w0() {
    }

    private void x0() {
        this.f28682i.setOnClickListener(this);
    }

    private void y0() {
        l0();
        this.f28682i = (Button) findViewById(AbstractC5955f.btn_wheelchair_history_confirm);
        this.f28683j = new b();
        ListView listView = (ListView) findViewById(AbstractC5955f.lv_wheelchair_history);
        listView.setEmptyView(findViewById(AbstractC5955f.tv_wheelchair_history_empty));
        listView.setAdapter((ListAdapter) this.f28683j);
        listView.getEmptyView().setVisibility(8);
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, android.view.View.OnClickListener
    public void onClick(View view) {
        if (AbstractC5955f.btn_wheelchair_history_confirm != view.getId()) {
            super.onClick(view);
            return;
        }
        int iD = this.f28683j.d();
        Intent intent = new Intent();
        intent.putExtra("REQSPEC_DATA", this.f28683j.getItem(iD));
        setResult(-1, intent);
        finish();
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_wheelchair_history);
        if (C6630d.isNull(bundle)) {
            w0();
            y0();
            setText();
            x0();
            u0("A");
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        super.onReceive(iBaseDao);
        if (AbstractC5955f.dao_help_srv_cust == iBaseDao.getId()) {
            HelpSrvCustDao.HelpSrvCustRequest helpSrvCustRequest = (HelpSrvCustDao.HelpSrvCustRequest) iBaseDao.getRequest();
            HelpSrvCustDao.HelpSrvCustResponse helpSrvCustResponse = (HelpSrvCustDao.HelpSrvCustResponse) iBaseDao.getResponse();
            if (!"A".equals(helpSrvCustRequest.getQryDvCd())) {
                u0("A");
                return;
            }
            this.f28683j.f(-1);
            this.f28683j.e(helpSrvCustResponse.getReqSpecList());
            this.f28683j.notifyDataSetChanged();
        }
    }
}
