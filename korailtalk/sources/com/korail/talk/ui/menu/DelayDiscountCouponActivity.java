package com.korail.talk.ui.menu;

import Q7.X;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.passCard.DelayTicketListDao;
import com.korail.talk.network.dao.passCard.DelayTicketListDao.DelayTicketListRequest;
import com.korail.talk.view.base.BaseViewActivity;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import n4.AbstractC5952c;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import o4.C6038a;
import z4.C6630d;
import z4.C6634h;
import z4.N;

/* loaded from: classes.dex */
public class DelayDiscountCouponActivity extends BaseViewActivity {

    /* renamed from: i, reason: collision with root package name */
    private final String f28215i = "COUPON_NO";

    /* renamed from: j, reason: collision with root package name */
    private final String f28216j = "DISCOUNT_SUM";

    /* renamed from: k, reason: collision with root package name */
    private final String f28217k = "EXPIRED_DATE";

    /* renamed from: l, reason: collision with root package name */
    private ArrayList f28218l;

    /* renamed from: m, reason: collision with root package name */
    private b f28219m;

    private class b extends BaseAdapter {

        /* renamed from: a, reason: collision with root package name */
        private final LayoutInflater f28220a;

        private class a {

            /* renamed from: a, reason: collision with root package name */
            TextView f28222a;

            /* renamed from: b, reason: collision with root package name */
            TextView f28223b;

            /* renamed from: c, reason: collision with root package name */
            TextView f28224c;

            private a() {
            }
        }

        private Bundle a(int i8) {
            return (Bundle) DelayDiscountCouponActivity.this.f28218l.get(i8);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            if (C6630d.isNull(DelayDiscountCouponActivity.this.f28218l)) {
                return 0;
            }
            return DelayDiscountCouponActivity.this.f28218l.size();
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
                viewInflate = this.f28220a.inflate(AbstractC5957h.delay_discount_coupon_list_item, viewGroup, false);
                aVar.f28223b = (TextView) viewInflate.findViewById(AbstractC5955f.discountSumTxt);
                aVar.f28224c = (TextView) viewInflate.findViewById(AbstractC5955f.expiredDateTxt);
                aVar.f28222a = (TextView) viewInflate.findViewById(AbstractC5955f.couponNoTxt);
                viewInflate.setTag(aVar);
            } else {
                viewInflate = view;
                aVar = (a) view.getTag();
            }
            Bundle bundleA = a(i8);
            aVar.f28223b.setText(DelayDiscountCouponActivity.this.getString(AbstractC5959j.common_amount, N.getDecimalFormatString(bundleA.getInt("DISCOUNT_SUM"))) + X.LF + DelayDiscountCouponActivity.this.getString(AbstractC5959j.common_discount));
            aVar.f28224c.setText(bundleA.getString("EXPIRED_DATE"));
            aVar.f28224c.append(N.applySpannable("(승차일 기준)", new ForegroundColorSpan(Color.parseColor("#666666")), new AbsoluteSizeSpan(N.dpToPx(15.0f))));
            aVar.f28222a.setText(bundleA.getString("COUPON_NO"));
            return viewInflate;
        }

        public void update() {
            notifyDataSetChanged();
        }

        private b() {
            this.f28220a = DelayDiscountCouponActivity.this.getLayoutInflater();
        }
    }

    private void setText() {
        setAppTitle(AbstractC5959j.mypage_delay_discount_coupon);
    }

    private void u0() {
        new Handler().postDelayed(new Runnable() { // from class: w5.h
            @Override // java.lang.Runnable
            public final void run() {
                this.f37425a.v0();
            }
        }, 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v0() {
        DelayTicketListDao delayTicketListDao = new DelayTicketListDao();
        delayTicketListDao.setRequest(delayTicketListDao.new DelayTicketListRequest());
        executeDao(delayTicketListDao);
    }

    private void w0() {
        this.f28218l = new ArrayList();
    }

    private void x0() {
    }

    private void y0() {
        m0();
        ListView listView = (ListView) findViewById(AbstractC5955f.list);
        listView.setEmptyView(findViewById(AbstractC5955f.tv_delay_discount_coupon_empty));
        View viewInflate = View.inflate(this, AbstractC5957h.list_item_delay_discount_coupon_header, null);
        N.setBulletSpan(getResources().getStringArray(AbstractC5952c.delay_discount_coupon_msg), (TextView) viewInflate.findViewById(AbstractC5955f.tv_list_item_delay_discount_coupon_header_msg));
        listView.addHeaderView(viewInflate);
        b bVar = new b();
        this.f28219m = bVar;
        listView.setAdapter((ListAdapter) bVar);
        listView.getEmptyView().setVisibility(8);
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_delay_discount_coupon);
        if (C6630d.isNull(bundle)) {
            w0();
            y0();
            setText();
            x0();
            u0();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        super.onReceive(iBaseDao);
        if (AbstractC5955f.dao_delay_ticket_list == iBaseDao.getId()) {
            for (DelayTicketListDao.DelayCoupon delayCoupon : ((DelayTicketListDao.DelayTicketListResponse) iBaseDao.getResponse()).getDisc_infos().getDisc_info()) {
                Bundle bundle = new Bundle();
                String h_orgtk_wct_no = delayCoupon.getH_orgtk_wct_no();
                String h_orgtk_ret_sale_dt = delayCoupon.getH_orgtk_ret_sale_dt();
                String h_orgtk_sale_sqno = delayCoupon.getH_orgtk_sale_sqno();
                String h_orgtk_ret_pwd = delayCoupon.getH_orgtk_ret_pwd();
                if (!N.isNull(h_orgtk_wct_no) && !N.isNull(h_orgtk_sale_sqno) && !N.isNull(h_orgtk_ret_sale_dt) && !N.isNull(h_orgtk_ret_pwd)) {
                    bundle.putString("COUPON_NO", C6038a.getReturnNumberWithDash(h_orgtk_wct_no, h_orgtk_ret_sale_dt, h_orgtk_sale_sqno, h_orgtk_ret_pwd));
                }
                bundle.putInt("DISCOUNT_SUM", Integer.parseInt(delayCoupon.getH_dlay_fare()));
                bundle.putString("EXPIRED_DATE", C6634h.convertFormat(delayCoupon.getH_use_psb_dt(), "yyyyMMdd", "yyyy년 MM월 dd일") + "까지 사용 가능\n");
                this.f28218l.add(bundle);
            }
            this.f28219m.update();
        }
    }
}
