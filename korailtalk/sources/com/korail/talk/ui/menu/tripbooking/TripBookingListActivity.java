package com.korail.talk.ui.menu.tripbooking;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.product.ProductListDao;
import com.korail.talk.network.dao.product.ProductListDao.ProductListRequest;
import com.korail.talk.ui.ticket.confirm.TicketSelfCheckinStatusActivity;
import com.korail.talk.ui.web.IntegrationWebViewActivity;
import com.korail.talk.view.base.BaseViewActivity;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import r4.g;
import y4.C6536a;
import z4.C6630d;
import z4.C6634h;
import z4.C6637k;
import z4.C6641o;
import z4.N;

/* loaded from: classes.dex */
public class TripBookingListActivity extends BaseViewActivity implements AbsListView.OnScrollListener, AdapterView.OnItemClickListener {

    /* renamed from: i */
    private final int f28407i = 10;

    /* renamed from: j */
    private int f28408j;

    /* renamed from: k */
    private int f28409k;

    /* renamed from: l */
    private ArrayList f28410l;

    /* renamed from: m */
    private ListView f28411m;

    /* renamed from: n */
    private b f28412n;

    private class b extends BaseAdapter {

        /* renamed from: a */
        private final LayoutInflater f28413a;

        private class a {

            /* renamed from: a */
            TextView f28415a;

            /* renamed from: b */
            TextView f28416b;

            /* renamed from: c */
            TextView f28417c;

            private a() {
            }

            /* synthetic */ a(b bVar, a aVar) {
                this();
            }
        }

        public b() {
            this.f28413a = TripBookingListActivity.this.getLayoutInflater();
        }

        public Bundle b(int i8) {
            return (Bundle) TripBookingListActivity.this.f28410l.get(i8);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            if (C6630d.isNull(TripBookingListActivity.this.f28410l)) {
                return 0;
            }
            return TripBookingListActivity.this.f28410l.size();
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
            if (C6630d.isNull(view)) {
                view = this.f28413a.inflate(AbstractC5957h.trip_booking_list_item, viewGroup, false);
                aVar = new a();
                aVar.f28415a = (TextView) view.findViewById(AbstractC5955f.titleTxt);
                aVar.f28416b = (TextView) view.findViewById(AbstractC5955f.payPeriodTxt);
                aVar.f28417c = (TextView) view.findViewById(AbstractC5955f.statusTxt);
                view.setTag(aVar);
            } else {
                aVar = (a) view.getTag();
            }
            Bundle bundleB = b(i8);
            String string = bundleB.getString("STATUS");
            String str = string.equalsIgnoreCase(TripBookingListActivity.this.getString(AbstractC5959j.trip_booking_reservation_confirm)) ? "#fff04922" : "#ff0066b3";
            aVar.f28415a.setText(bundleB.getString("TITLE"));
            aVar.f28416b.setText(bundleB.getString("PAY_PERIOD"));
            aVar.f28417c.setText(N.applySpannable(string, new ForegroundColorSpan(Color.parseColor(str))));
            return view;
        }

        public void update() {
            notifyDataSetChanged();
        }
    }

    private void setText() {
        setAppTitle(AbstractC5959j.title_trip_booking);
    }

    private void t0() {
        if (C6630d.isNull(this.f28410l)) {
            this.f28410l = new ArrayList();
        } else {
            this.f28410l.clear();
        }
    }

    private void u0() {
        ProductListDao productListDao = new ProductListDao();
        ProductListDao.ProductListRequest productListRequest = productListDao.new ProductListRequest();
        int i8 = this.f28408j + 1;
        this.f28408j = i8;
        productListRequest.setTxtSelPage(i8);
        productListRequest.setTxtCntPerPage(10);
        productListDao.setRequest(productListRequest);
        executeDao(productListDao);
    }

    private boolean v0(String str) {
        return (TicketSelfCheckinStatusActivity.CHECKIN_STATUS_CANCEL.equals(str) || "07".equals(str) || "08".equals(str) || "09".equals(str) || "10".equals(str)) ? false : true;
    }

    private void w0() {
        this.f28408j = 0;
        t0();
    }

    private void x0() {
        findViewById(AbstractC5955f.goToTripPackage).setOnClickListener(this);
        this.f28411m.setOnScrollListener(this);
        this.f28411m.setOnItemClickListener(this);
    }

    private void y0() {
        n0(false);
        ListView listView = (ListView) findViewById(AbstractC5955f.list);
        this.f28411m = listView;
        listView.setEmptyView(findViewById(AbstractC5955f.noContentMsgTxt));
        b bVar = new b();
        this.f28412n = bVar;
        this.f28411m.setAdapter((ListAdapter) bVar);
        this.f28411m.getEmptyView().setVisibility(8);
    }

    public void moveToTripBookingDetail(Bundle bundle) {
        if (C6630d.isNotNull(bundle)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("VR_RSV_NO", bundle.getString("VR_RSV_NO"));
            bundle2.putString("VR_RSV_SQ_NO", bundle.getString("VR_RSV_SQ_NO"));
            bundle2.putSerializable("PAYMENT_STATE", bundle.getSerializable("PAYMENT_STATE"));
            bundle2.putBoolean("RSV_STT_CD", v0(bundle.getString("RSV_STT_CD")));
            Intent intent = new Intent(getApplicationContext(), (Class<?>) TripBookingDetailActivity.class);
            intent.putExtras(bundle2);
            startActivityForResult(intent, 116);
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i8, int i9, Intent intent) {
        super.onActivityResult(i8, i9, intent);
        if (i9 == -1 && i8 == 116) {
            w0();
            u0();
        }
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, android.view.View.OnClickListener
    public void onClick(View view) {
        if (AbstractC5955f.goToTripPackage != view.getId()) {
            super.onClick(view);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("WEB_POST_URL", g.TOUR_PACKAGE_URL);
        C6641o.navigation(getApplicationContext(), IntegrationWebViewActivity.class, bundle);
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.trip_booking_list_activity);
        if (C6630d.isNull(bundle)) {
            w0();
            y0();
            setText();
            x0();
            u0();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i8, long j8) {
        Bundle bundleB = this.f28412n.b(i8);
        if (bundleB.getString("STATUS").contains(getString(AbstractC5959j.common_reservation_cancel))) {
            C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.trip_booking_reservation_canceled_reservation)).showDialog();
        } else {
            moveToTripBookingDetail(bundleB);
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        if (AbstractC5955f.dao_reservation_product == iBaseDao.getId()) {
            ProductListDao.MainInfo mainInfo = ((ProductListDao.ProductListResponse) iBaseDao.getResponse()).getMainInfo();
            List<ProductListDao.ReservationProduct> entity = mainInfo.getEntity();
            this.f28409k = (Integer.parseInt(mainInfo.getStrTotCnt()) / 10) + 1;
            for (ProductListDao.ReservationProduct reservationProduct : entity) {
                Bundle bundle = new Bundle();
                bundle.putString("TITLE", reservationProduct.getStrGdNm());
                bundle.putString("PAY_PERIOD", C6634h.convertFormat(reservationProduct.getStrStlDlnDt(), "yyyyMMdd", "yyyy년 MM월 dd일"));
                bundle.putString("STATUS", reservationProduct.getStrRsvSttNm());
                bundle.putString("RSV_STT_CD", reservationProduct.getStrRsvSttCd());
                bundle.putString("VR_RSV_NO", reservationProduct.getStrVrRsvNo());
                bundle.putSerializable("PAYMENT_STATE", reservationProduct.getStrStlSttCd());
                this.f28410l.add(bundle);
            }
            this.f28412n.update();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceiveError(IBaseDao iBaseDao, C6536a c6536a) {
        if (AbstractC5955f.dao_reservation_product == iBaseDao.getId()) {
            int txtSelPage = ((ProductListDao.ProductListRequest) iBaseDao.getRequest()).getTxtSelPage();
            this.f28408j = txtSelPage == 1 ? 0 : txtSelPage - 1;
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i8, int i9, int i10) {
        ListView listView = this.f28411m;
        if (listView == null || listView.getAdapter() == null || this.f28411m.getAdapter().getCount() <= 0 || absListView.getLastVisiblePosition() != ((ListAdapter) absListView.getAdapter()).getCount() - 1 || absListView.getChildAt(absListView.getChildCount() - 1).getBottom() > absListView.getHeight() || this.f28408j >= this.f28409k) {
            return;
        }
        u0();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i8) {
    }
}
