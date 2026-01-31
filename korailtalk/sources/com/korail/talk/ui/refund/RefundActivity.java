package com.korail.talk.ui.refund;

import N5.c;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.r;
import com.korail.talk.view.CTabLayout;
import com.korail.talk.view.CustomViewPager;
import com.korail.talk.view.base.BaseViewActivity;
import java.lang.reflect.InvocationTargetException;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import z4.C6630d;

/* loaded from: classes.dex */
public class RefundActivity extends BaseViewActivity {

    /* renamed from: i, reason: collision with root package name */
    private CTabLayout f28602i;

    /* renamed from: j, reason: collision with root package name */
    private CustomViewPager f28603j;

    /* renamed from: k, reason: collision with root package name */
    private a f28604k;

    private class a extends r {

        /* renamed from: h, reason: collision with root package name */
        private final Fragment[] f28605h;

        /* renamed from: i, reason: collision with root package name */
        private final String[] f28606i;

        public a(FragmentManager fragmentManager) {
            super(fragmentManager, 1);
            this.f28605h = new Fragment[]{c.newInstance(), N5.a.newInstance()};
            this.f28606i = new String[]{RefundActivity.this.getString(AbstractC5959j.refund_delay_title), RefundActivity.this.getString(AbstractC5959j.refund_stop_title)};
        }

        @Override // androidx.viewpager.widget.a
        public int getCount() {
            return this.f28605h.length;
        }

        @Override // androidx.fragment.app.r
        public Fragment getItem(int i8) {
            return this.f28605h[i8];
        }

        @Override // androidx.viewpager.widget.a
        public CharSequence getPageTitle(int i8) {
            return this.f28606i[i8];
        }
    }

    private void s0() throws Resources.NotFoundException {
        n0(false);
        this.f28602i = (CTabLayout) findViewById(AbstractC5955f.tl_refund);
        this.f28603j = (CustomViewPager) findViewById(AbstractC5955f.vp_refund);
        a aVar = new a(getSupportFragmentManager());
        this.f28604k = aVar;
        this.f28603j.setAdapter(aVar);
        this.f28603j.setSwipeEnabled(false);
        this.f28602i.setupWithViewPager(this.f28603j);
        this.f28602i.setVisibility(0);
    }

    private void setText() {
        setAppTitle(AbstractC5959j.title_delay_compensation_apply);
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, Resources.NotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_refund);
        if (C6630d.isNull(bundle)) {
            s0();
            setText();
        }
    }
}
