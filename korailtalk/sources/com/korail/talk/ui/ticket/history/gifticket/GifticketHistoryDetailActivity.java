package com.korail.talk.ui.ticket.history.gifticket;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.gifticket.GifticketHistoryDao;
import com.korail.talk.network.dao.gifticket.GifticketHistoryDao.GifticketHistoryRequest;
import com.korail.talk.view.base.BaseViewActivity;
import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import z4.C6630d;
import z4.C6634h;
import z4.N;
import z4.t;

/* loaded from: classes.dex */
public class GifticketHistoryDetailActivity extends BaseViewActivity {

    /* renamed from: i, reason: collision with root package name */
    private List f29103i;

    /* renamed from: j, reason: collision with root package name */
    private b f29104j;

    private class b extends BaseAdapter {

        /* renamed from: a, reason: collision with root package name */
        private final LayoutInflater f29105a;

        private class a {
            public TextView mTvAmount;
            public TextView mTvDate;
            public TextView mTvEtc;
            public TextView mTvInfo;

            private a() {
            }
        }

        public b() {
            this.f29105a = LayoutInflater.from(GifticketHistoryDetailActivity.this.getApplicationContext());
        }

        @Override // android.widget.Adapter
        public int getCount() {
            if (C6630d.isNull(GifticketHistoryDetailActivity.this.f29103i)) {
                return 0;
            }
            return GifticketHistoryDetailActivity.this.f29103i.size();
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
        public View getView(int i8, View view, ViewGroup viewGroup) throws ParseException {
            View viewInflate;
            a aVar;
            if (C6630d.isNull(view)) {
                aVar = new a();
                viewInflate = this.f29105a.inflate(AbstractC5957h.item_gifticket_detail, viewGroup, false);
                aVar.mTvInfo = (TextView) viewInflate.findViewById(AbstractC5955f.tv_detail_info);
                aVar.mTvDate = (TextView) viewInflate.findViewById(AbstractC5955f.tv_detail_date);
                aVar.mTvAmount = (TextView) viewInflate.findViewById(AbstractC5955f.tv_detail_amount);
                aVar.mTvEtc = (TextView) viewInflate.findViewById(AbstractC5955f.tv_detail_etc);
                viewInflate.setTag(aVar);
            } else {
                viewInflate = view;
                aVar = (a) view.getTag();
            }
            String strConvertFormat = C6634h.convertFormat(((GifticketHistoryDao.GifticketDetailData) GifticketHistoryDetailActivity.this.f29103i.get(i8)).getTxnDt(), "yyyyMMdd", "yyyy.MM.dd");
            aVar.mTvInfo.setText(((GifticketHistoryDao.GifticketDetailData) GifticketHistoryDetailActivity.this.f29103i.get(i8)).getRmkCont());
            aVar.mTvDate.setText(strConvertFormat);
            TextView textView = aVar.mTvAmount;
            GifticketHistoryDetailActivity gifticketHistoryDetailActivity = GifticketHistoryDetailActivity.this;
            textView.setText(gifticketHistoryDetailActivity.getString(AbstractC5959j.common_amount, N.getDecimalFormatString(((GifticketHistoryDao.GifticketDetailData) gifticketHistoryDetailActivity.f29103i.get(i8)).getTxnAmt())));
            return viewInflate;
        }
    }

    private void setText() {
        setAppTitle(AbstractC5959j.title_gifticket_history);
    }

    private void t0(String str) {
        GifticketHistoryDao gifticketHistoryDao = new GifticketHistoryDao();
        GifticketHistoryDao.GifticketHistoryRequest gifticketHistoryRequest = gifticketHistoryDao.new GifticketHistoryRequest();
        gifticketHistoryRequest.setTkId(str);
        gifticketHistoryDao.setRequest(gifticketHistoryRequest);
        executeDao(gifticketHistoryDao);
    }

    private void u0() {
        this.f29103i = new ArrayList();
    }

    private void v0() {
        l0();
        ListView listView = (ListView) findViewById(AbstractC5955f.lv_gifticket_detail);
        listView.setClickable(false);
        listView.setEmptyView(findViewById(AbstractC5955f.tv_history_empty));
        View viewInflate = View.inflate(this, AbstractC5957h.list_item_gifticket_detail_header, null);
        ((TextView) viewInflate.findViewById(AbstractC5955f.tv_list_item_gifticket_header)).setText(getString(AbstractC5959j.common_amount, N.getDecimalFormatString(getIntent().getStringExtra("GIFTICKET_AMOUNT"))));
        listView.addHeaderView(viewInflate);
        b bVar = new b();
        this.f29104j = bVar;
        listView.setAdapter((ListAdapter) bVar);
        listView.getEmptyView().setVisibility(8);
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_gifticket_history_detail);
        if (C6630d.isNull(bundle)) {
            u0();
            v0();
            setText();
            t0(getIntent().getStringExtra("GIFTICKET_ID"));
            t.d("GIFTICKET_ID : " + getIntent().getStringExtra("GIFTICKET_ID"));
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        super.onReceive(iBaseDao);
        if (AbstractC5955f.dao_gifticket_history == iBaseDao.getId()) {
            this.f29103i = ((GifticketHistoryDao.GifticketHistoryResponse) iBaseDao.getResponse()).getTxnList();
            this.f29104j.notifyDataSetChanged();
        }
    }
}
