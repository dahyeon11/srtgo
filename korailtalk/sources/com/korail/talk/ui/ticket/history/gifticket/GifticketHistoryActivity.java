package com.korail.talk.ui.ticket.history.gifticket;

import android.content.res.Resources;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.r;
import com.korail.talk.view.CTabLayout;
import com.korail.talk.view.CustomViewPager;
import com.korail.talk.view.base.BaseViewActivity;
import i6.C5706b;
import i6.C5710f;
import java.lang.reflect.InvocationTargetException;
import n4.AbstractC5952c;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import z4.C6630d;

/* loaded from: classes.dex */
public class GifticketHistoryActivity extends BaseViewActivity {
    public static final int RECEIVE_HISTORY_POSITION = 1;
    public static final int SEND_HISTORY_POSITION = 0;

    /* renamed from: i, reason: collision with root package name */
    private String[] f29098i;

    /* renamed from: j, reason: collision with root package name */
    private CustomViewPager f29099j;

    /* renamed from: k, reason: collision with root package name */
    private b f29100k;

    private class b extends r {

        /* renamed from: h, reason: collision with root package name */
        private final Fragment[] f29101h;

        @Override // androidx.viewpager.widget.a
        public int getCount() {
            return GifticketHistoryActivity.this.f29098i.length;
        }

        @Override // androidx.fragment.app.r
        public Fragment getItem(int i8) {
            return this.f29101h[i8];
        }

        @Override // androidx.viewpager.widget.a
        public CharSequence getPageTitle(int i8) {
            return GifticketHistoryActivity.this.f29098i[i8];
        }

        private b(FragmentManager fragmentManager) {
            super(fragmentManager, 1);
            this.f29101h = new Fragment[]{C5710f.newInstance(), C5706b.newInstance()};
        }
    }

    private void setText() {
        setAppTitle(AbstractC5959j.title_gifticket_history);
    }

    private void t0() {
        this.f29098i = getResources().getStringArray(AbstractC5952c.gifticket_history_tab_title);
    }

    private void u0() {
    }

    private void v0() throws Resources.NotFoundException {
        m0();
        CTabLayout cTabLayout = (CTabLayout) findViewById(AbstractC5955f.tl_member_card);
        this.f29099j = (CustomViewPager) findViewById(AbstractC5955f.vp_member_card);
        b bVar = new b(getSupportFragmentManager());
        this.f29100k = bVar;
        this.f29099j.setAdapter(bVar);
        this.f29099j.setSwipeEnabled(false);
        cTabLayout.setupWithViewPager(this.f29099j);
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, Resources.NotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_gifticket_history);
        if (C6630d.isNull(bundle)) {
            t0();
            v0();
            setText();
            u0();
        }
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, android.app.Activity
    protected void onPause() {
        super.onPause();
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, android.app.Activity
    protected void onResume() {
        super.onResume();
    }
}
