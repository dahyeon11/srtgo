package com.korail.talk.ui.menu;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.passCard.DCCouponListDao;
import com.korail.talk.network.dao.passCard.DCCouponListDao.DCCouponListRequest;
import com.korail.talk.view.base.BaseViewActivity;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import v4.c;
import y4.C6536a;
import z4.C6630d;
import z4.C6634h;
import z4.C6637k;
import z4.N;

/* loaded from: classes.dex */
public class DiscountCouponActivity extends BaseViewActivity implements AbsListView.OnScrollListener {

    /* renamed from: i, reason: collision with root package name */
    private int f28226i;

    /* renamed from: j, reason: collision with root package name */
    private int f28227j;

    /* renamed from: k, reason: collision with root package name */
    private ArrayList f28228k;

    /* renamed from: l, reason: collision with root package name */
    private ListView f28229l;

    /* renamed from: m, reason: collision with root package name */
    private b f28230m;

    private class b extends BaseAdapter implements c.a {

        /* renamed from: a, reason: collision with root package name */
        private final LayoutInflater f28231a;

        private class a {

            /* renamed from: a, reason: collision with root package name */
            private TextView f28233a;

            /* renamed from: b, reason: collision with root package name */
            private TextView f28234b;

            /* renamed from: c, reason: collision with root package name */
            private TextView f28235c;

            /* renamed from: d, reason: collision with root package name */
            private TextView f28236d;

            /* renamed from: e, reason: collision with root package name */
            private ImageView f28237e;

            private a() {
            }
        }

        private DCCouponListDao.DiscountCoupon a(int i8) {
            return (DCCouponListDao.DiscountCoupon) DiscountCouponActivity.this.f28228k.get(i8);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            if (C6630d.isNull(DiscountCouponActivity.this.f28228k)) {
                return 0;
            }
            return DiscountCouponActivity.this.f28228k.size();
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
                view = this.f28231a.inflate(AbstractC5957h.discount_coupon_list_item, viewGroup, false);
                aVar = new a();
                aVar.f28233a = (TextView) view.findViewById(AbstractC5955f.tv_h_rmk_1_cont);
                aVar.f28234b = (TextView) view.findViewById(AbstractC5955f.tv_h_rmk_2_cont);
                aVar.f28235c = (TextView) view.findViewById(AbstractC5955f.tv_h_rmk_3_cont);
                aVar.f28236d = (TextView) view.findViewById(AbstractC5955f.tv_ticket_coupon_no);
                aVar.f28237e = (ImageView) view.findViewById(AbstractC5955f.iv_ticket_coupon_info);
                view.setTag(aVar);
            } else {
                aVar = (a) view.getTag();
            }
            DCCouponListDao.DiscountCoupon discountCouponA = a(i8);
            aVar.f28233a.setText(discountCouponA.getH_rmk_1_cont());
            aVar.f28233a.setVisibility(N.isNull(discountCouponA.getH_rmk_1_cont()) ? 8 : 0);
            aVar.f28234b.setText(discountCouponA.getH_rmk_2_cont());
            aVar.f28234b.setVisibility(N.isNull(discountCouponA.getH_rmk_2_cont()) ? 8 : 0);
            aVar.f28235c.setText(C6634h.convertFormat(discountCouponA.getH_fdcert_mg_cls_dt(), "yyyyMMdd", "yyyy년 MM월 dd일") + "까지(승차일 기준)\n" + discountCouponA.getH_rmk_3_cont());
            aVar.f28236d.setText(discountCouponA.getH_cpn_no());
            aVar.f28237e.setVisibility(N.isNull(discountCouponA.getGuide()) ? 8 : 0);
            aVar.f28237e.setOnClickListener(new c(this, i8));
            return view;
        }

        @Override // v4.c.a
        public void onCustomClick(View view, int i8) {
            C6637k.getCDialog(DiscountCouponActivity.this.K(), 1001, 0, DiscountCouponActivity.this.getString(AbstractC5959j.dialog_title)).setContent(a(i8).getGuide()).showDialog();
        }

        public void update() {
            notifyDataSetChanged();
        }

        private b() {
            this.f28231a = DiscountCouponActivity.this.getLayoutInflater();
        }
    }

    private void setText() {
        setAppTitle(AbstractC5959j.common_discount_coupon);
    }

    private void u0() {
        if (C6630d.isNull(this.f28228k)) {
            this.f28228k = new ArrayList();
        } else {
            this.f28228k.clear();
        }
    }

    private void v0() {
        DCCouponListDao dCCouponListDao = new DCCouponListDao();
        DCCouponListDao.DCCouponListRequest dCCouponListRequest = dCCouponListDao.new DCCouponListRequest();
        int i8 = this.f28226i + 1;
        this.f28226i = i8;
        dCCouponListRequest.setTxtSelPage(String.valueOf(i8));
        dCCouponListDao.setRequest(dCCouponListRequest);
        executeDao(dCCouponListDao);
    }

    private void w0() {
        this.f28226i = 0;
        u0();
    }

    private void x0() {
        this.f28229l.setOnScrollListener(this);
    }

    private void y0() {
        m0();
        ListView listView = (ListView) findViewById(AbstractC5955f.list);
        this.f28229l = listView;
        listView.setEmptyView(findViewById(AbstractC5955f.v_discount_coupon_empty));
        b bVar = new b();
        this.f28230m = bVar;
        this.f28229l.setAdapter((ListAdapter) bVar);
        this.f28229l.getEmptyView().setVisibility(8);
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.discount_coupon_activity);
        if (C6630d.isNull(bundle)) {
            w0();
            y0();
            setText();
            x0();
            v0();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        super.onReceive(iBaseDao);
        if (AbstractC5955f.dao_coupon_list == iBaseDao.getId()) {
            DCCouponListDao.DCCouponListResponse dCCouponListResponse = (DCCouponListDao.DCCouponListResponse) iBaseDao.getResponse();
            this.f28227j = C6630d.isNull(dCCouponListResponse.getH_tot_page_cnt()) ? this.f28227j : Integer.parseInt(dCCouponListResponse.getH_tot_page_cnt());
            this.f28228k.addAll(dCCouponListResponse.getCoupon_infos().getCoupon_info());
            this.f28230m.update();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceiveError(IBaseDao iBaseDao, C6536a c6536a) throws NumberFormatException {
        super.onReceiveError(iBaseDao, c6536a);
        if (AbstractC5955f.dao_coupon_list == iBaseDao.getId()) {
            int i8 = Integer.parseInt(((DCCouponListDao.DCCouponListRequest) iBaseDao.getRequest()).getTxtSelPage());
            this.f28226i = i8 == 1 ? 0 : i8 - 1;
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i8, int i9, int i10) {
        ListView listView = this.f28229l;
        if (listView == null || listView.getAdapter() == null || this.f28229l.getAdapter().getCount() <= 0 || absListView.getLastVisiblePosition() != ((ListAdapter) absListView.getAdapter()).getCount() - 1 || absListView.getChildAt(absListView.getChildCount() - 1).getBottom() > absListView.getHeight() || this.f28226i >= this.f28227j) {
            return;
        }
        v0();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i8) {
    }
}
