package com.korail.talk.ui.ticket.history;

import Q7.X;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.research.NCardHistoryDao;
import com.korail.talk.network.dao.research.NCardHistoryDao.NCardHistoryRequest;
import com.korail.talk.view.base.BaseViewActivity;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import z4.C6630d;
import z4.C6634h;

/* loaded from: classes.dex */
public class TicketNCardHistoryActivity extends BaseViewActivity {

    /* renamed from: i, reason: collision with root package name */
    private List f29062i;

    /* renamed from: j, reason: collision with root package name */
    private b f29063j;

    private class b extends BaseAdapter {

        /* renamed from: a, reason: collision with root package name */
        private final LayoutInflater f29064a;

        private class a {
            public TextView mTvCount;
            public TextView mTvDate;
            public TextView mTvNCardInfo;

            private a() {
            }
        }

        public b() {
            this.f29064a = LayoutInflater.from(TicketNCardHistoryActivity.this.getApplicationContext());
        }

        @Override // android.widget.Adapter
        public int getCount() {
            if (C6630d.isNull(TicketNCardHistoryActivity.this.f29062i)) {
                return 0;
            }
            return TicketNCardHistoryActivity.this.f29062i.size();
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
            View viewInflate;
            a aVar;
            if (C6630d.isNull(view)) {
                aVar = new a();
                viewInflate = this.f29064a.inflate(AbstractC5957h.item_ncard_history, viewGroup, false);
                aVar.mTvCount = (TextView) viewInflate.findViewById(AbstractC5955f.tv_ncard_history_count);
                aVar.mTvNCardInfo = (TextView) viewInflate.findViewById(AbstractC5955f.tv_ncard_history_info);
                aVar.mTvDate = (TextView) viewInflate.findViewById(AbstractC5955f.tv_ncard_history_date);
                viewInflate.setTag(aVar);
            } else {
                viewInflate = view;
                aVar = (a) view.getTag();
            }
            aVar.mTvCount.setText(TicketNCardHistoryActivity.this.getString(AbstractC5959j.common_time, Integer.valueOf(i8 + 1)));
            StringBuilder sb = new StringBuilder();
            sb.append(((NCardHistoryDao.NCardHistoryInfo) TicketNCardHistoryActivity.this.f29062i.get(i8)).getCustNm());
            if ("Y".equals(((NCardHistoryDao.NCardHistoryInfo) TicketNCardHistoryActivity.this.f29062i.get(i8)).getApdUsrFlg())) {
                sb.append("(");
                sb.append(TicketNCardHistoryActivity.this.getString(AbstractC5959j.common_add_user));
                sb.append(")");
            }
            sb.append(X.LF);
            sb.append(((NCardHistoryDao.NCardHistoryInfo) TicketNCardHistoryActivity.this.f29062i.get(i8)).getDptStnNm());
            sb.append("→");
            sb.append(((NCardHistoryDao.NCardHistoryInfo) TicketNCardHistoryActivity.this.f29062i.get(i8)).getArvStnNm());
            aVar.mTvNCardInfo.setText(sb.toString());
            aVar.mTvDate.setText(C6634h.convertFormat(((NCardHistoryDao.NCardHistoryInfo) TicketNCardHistoryActivity.this.f29062i.get(i8)).getRunDt1(), "yyyyMMdd", "yyyy.MM.dd"));
            return viewInflate;
        }
    }

    private void setText() {
        setAppTitle(AbstractC5959j.title_n_card_history);
    }

    private void t0(String str) {
        NCardHistoryDao nCardHistoryDao = new NCardHistoryDao();
        NCardHistoryDao.NCardHistoryRequest nCardHistoryRequest = nCardHistoryDao.new NCardHistoryRequest();
        nCardHistoryRequest.setDcntCrdNo(str);
        nCardHistoryDao.setRequest(nCardHistoryRequest);
        nCardHistoryDao.setFinishView(true);
        executeDao(nCardHistoryDao);
    }

    private void u0() {
        this.f29062i = new ArrayList();
    }

    private void v0() {
        l0();
        ListView listView = (ListView) findViewById(AbstractC5955f.lv_ncard_history);
        listView.setClickable(false);
        listView.setEmptyView(findViewById(AbstractC5955f.tv_history_empty));
        b bVar = new b();
        this.f29063j = bVar;
        listView.setAdapter((ListAdapter) bVar);
        listView.getEmptyView().setVisibility(8);
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_ticket_ncard_history);
        if (C6630d.isNull(bundle)) {
            u0();
            v0();
            setText();
            t0(getIntent().getStringExtra("N_CARD_DISCOUNT_CRD_CODE"));
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        super.onReceive(iBaseDao);
        if (AbstractC5955f.dao_n_card_history == iBaseDao.getId()) {
            this.f29062i = ((NCardHistoryDao.NCardHistoryResponse) iBaseDao.getResponse()).getTkUseList();
            this.f29063j.notifyDataSetChanged();
        }
    }
}
