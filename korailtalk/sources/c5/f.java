package c5;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.r;
import com.korail.talk.network.dao.ticket.DlvRcvCustDao;
import com.korail.talk.network.dao.ticket.RecentDeliveryHistoryDao;
import com.korail.talk.view.CButton;
import com.korail.talk.view.CustomViewPager;
import d5.ViewOnClickListenerC5325a;
import d5.ViewOnClickListenerC5326b;
import k0.AbstractC5837a;
import n4.AbstractC5953d;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import z4.C6630d;

/* loaded from: classes.dex */
public class f extends d implements RadioGroup.OnCheckedChangeListener, View.OnClickListener {
    public static final String TAG = "DeliveryKTFragment";

    /* renamed from: e0, reason: collision with root package name */
    private RadioGroup f11497e0;

    /* renamed from: f0, reason: collision with root package name */
    private CustomViewPager f11498f0;

    /* renamed from: g0, reason: collision with root package name */
    private a f11499g0;

    private class a extends r {

        /* renamed from: h, reason: collision with root package name */
        private final Fragment[] f11500h;

        public a(FragmentManager fragmentManager) {
            super(fragmentManager, 1);
            this.f11500h = new Fragment[]{ViewOnClickListenerC5325a.newInstance(), ViewOnClickListenerC5326b.newInstance()};
        }

        @Override // androidx.viewpager.widget.a
        public int getCount() {
            return this.f11500h.length;
        }

        @Override // androidx.fragment.app.r
        public Fragment getItem(int i8) {
            return this.f11500h[i8];
        }
    }

    private void H0() {
        p0(AbstractC5955f.btn_delivery_kt_history).setOnClickListener(this);
        this.f11497e0.setOnCheckedChangeListener(this);
    }

    private void I0() throws Resources.NotFoundException {
        this.f11497e0 = (RadioGroup) p0(AbstractC5955f.rg_delivery_kt);
        this.f11499g0 = new a(getParentFragmentManager());
        CustomViewPager customViewPager = (CustomViewPager) p0(AbstractC5955f.vp_delivery_kt);
        this.f11498f0 = customViewPager;
        customViewPager.setSwipeEnabled(false);
        this.f11498f0.setAdapter(this.f11499g0);
    }

    public static Fragment newInstance() {
        return new f();
    }

    @Override // c5.d
    protected void D0(RecentDeliveryHistoryDao.Acep acep) {
        if ("Y".equals(acep.getAcepCustMgFlg())) {
            this.f11497e0.check(AbstractC5955f.rb_delivery_kt_member);
        } else {
            this.f11497e0.check(AbstractC5955f.rb_delivery_kt_non_member);
        }
        ((d) this.f11499g0.getItem(this.f11498f0.getCurrentItem())).D0(acep);
    }

    @Override // c5.d, com.korail.talk.view.base.a, androidx.fragment.app.Fragment, androidx.lifecycle.InterfaceC1018g
    public /* bridge */ /* synthetic */ AbstractC5837a getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) throws Resources.NotFoundException {
        super.onActivityCreated(bundle);
        if (C6630d.isNull(bundle)) {
            I0();
            H0();
        }
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public void onCheckedChanged(RadioGroup radioGroup, int i8) {
        this.f11498f0.setCurrentItem(AbstractC5955f.rb_delivery_kt_member == i8 ? 0 : 1);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (AbstractC5955f.btn_delivery_kt_history == view.getId()) {
            C0();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(AbstractC5957h.fragment_delivery_kt, viewGroup, false);
    }

    public void setDisableView(DlvRcvCustDao.DlvRcvCustwResponse dlvRcvCustwResponse) {
        p0(AbstractC5955f.rb_delivery_kt_non_member).setEnabled(false);
        p0(AbstractC5955f.btn_delivery_kt_history).setEnabled(false);
        ((CButton) p0(AbstractC5955f.btn_delivery_kt_history)).setTextColor(androidx.core.content.a.getColor(getApplicationContext(), AbstractC5953d.color_disable));
        ((ViewOnClickListenerC5325a) this.f11499g0.getItem(0)).setNcardUserData(dlvRcvCustwResponse);
    }
}
